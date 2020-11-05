import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {CustomerService} from "../../../services/customer.service";
import {ActivatedRoute, Router} from "@angular/router";


@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css']
})
export class CustomerEditComponent implements OnInit {
  formEdit: FormGroup;
  public listCustomerType;
  public idEl;

  constructor(public formBuilder: FormBuilder,
              public customerService: CustomerService,
              public activeRouter: ActivatedRoute,
              public router: Router) {

  }

  ngOnInit(): void {
    this.formEdit = this.formBuilder.group({
      customerName: ['', [Validators.required]],
      customerType: [''],
      dayOfBirthCustomer: ['', [Validators.required]],
      customerGender: ['', [Validators.required]],
      identityCard: ['', [Validators.required]],
      customerPhone: ['', [Validators.required]],
      customerEmail: ['', [Validators.required]],
      customerAddress: ['', [Validators.required]]
    });

    this.customerService.getAllForeign().subscribe(data => {
      this.listCustomerType = data
    });

    this.activeRouter.params.subscribe(data => {
      this.idEl = data.id;
      this.customerService.getById(this.idEl).subscribe(data => {
        this.formEdit.patchValue(data);
      })
    })
  }

  edit() {
    this.customerService.edit(this.formEdit.value, this.idEl).subscribe(data => {
      this.router.navigate(['/customer'], {queryParams: {message: 'edit successfully'}})
    })
  }
}
