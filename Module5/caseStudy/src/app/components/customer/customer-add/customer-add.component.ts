import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {CustomerService} from "../../../services/customer.service";
import {Router} from "@angular/router";
import {CustomerTypeService} from "../../../services/customer-type.service";
import {TypeCustomer} from "../../../model/typeCustomer.class";

@Component({
  selector: 'app-customer-add',
  templateUrl: './customer-add.component.html',
  styleUrls: ['./customer-add.component.css']
})

export class CustomerAddComponent implements OnInit {
  public formAddNew: FormGroup;
  public listCustomerType: TypeCustomer[] =[];
  public maxDate = new Date();
  public minDate = new Date(1990, 0, 1);

  constructor(public formBuilder: FormBuilder,
              public customerService: CustomerService,
              public customerTypeService: CustomerTypeService,
              public router: Router) {
  }

  ngOnInit(): void {
    this.formAddNew = this.formBuilder.group({
      customerName: ['', [Validators.required]],
      customerType: [''],
      dayOfBirthCustomer: ['', [Validators.required]],
      customerGender: ['', [Validators.required]],
      identityCard: ['', [Validators.required]],
      customerPhone: ['', [Validators.required]],
      customerEmail: ['', [Validators.required]],
      customerAddress: ['', [Validators.required]]
    });
    this.customerTypeService.getAll().subscribe(data => {
      this.listCustomerType = data
    })
  }

  addNew() {
    this.customerService.addNew(this.formAddNew.value).subscribe(data => {
      this.router.navigate(['/customer'], {queryParams: {message: 'create successfully'}})
    })
  }
}
