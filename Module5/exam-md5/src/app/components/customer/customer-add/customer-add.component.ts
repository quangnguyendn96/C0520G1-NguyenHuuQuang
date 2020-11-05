import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {CustomerService} from "../../../services/customer.service";
import {Router} from "@angular/router";
import {AbstractControl} from "@angular/forms";

export function diffDay() {


}

export function checkId(name = []) {
  return (c: AbstractControl) => {
    console.log(name)
    return (name.includes(c.value) ? {invalidId: true} : null)
  }
}


@Component({
  selector: 'app-customer-add',
  templateUrl: './customer-add.component.html',
  styleUrls: ['./customer-add.component.css']
})

export class CustomerAddComponent implements OnInit {
  public formAddNew: FormGroup;
  public listCustomerType;
  public maxDate = new Date();
  public minDate = new Date(1990, 0, 1);
  public listIdentity = [];
  private customerList;

  constructor(public formBuilder: FormBuilder,
              public customerService: CustomerService,
              public router: Router) {
  }

  ngOnInit(): void {
    this.formAddNew = this.formBuilder.group({
      customerName: ['', [Validators.required]],
      customerType: [''],
      dayOfBirthCustomer: ['', [Validators.required]],
      customerGender: ['', [Validators.required]],
      identityCard: ['', [Validators.required, checkId(this.listIdentity)]],
      customerPhone: ['', [Validators.required]],
      customerEmail: ['', [Validators.required]],
      customerAddress: ['', [Validators.required]]
    });
    this.customerService.getAllForeign().subscribe(data => {
      this.listCustomerType = data
    });
    this.customerService.getAll().subscribe(data => {
      this.customerList = data;
      this.getAllIdentity();
    });

  }

  getAllIdentity() {
    if (!this.customerList.isEmpty) {
      for (let ident of this.customerList) {
        this.listIdentity.push(ident.identityCard);
      }
    }
  }

  addNew() {
    this.customerService.addNew(this.formAddNew.value).subscribe(data => {
      this.router.navigateByUrl("/product")
    })
  }
}
