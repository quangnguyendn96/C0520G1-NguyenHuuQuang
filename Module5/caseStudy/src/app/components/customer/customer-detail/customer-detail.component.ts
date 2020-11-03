import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {CustomerService} from "../../../services/customer.service";

@Component({
  selector: 'app-customer-detail',
  templateUrl: './customer-detail.component.html',
  styleUrls: ['./customer-detail.component.css']
})
export class CustomerDetailComponent implements OnInit {
  public elTemp;


  constructor(public dialogRef: MatDialogRef<CustomerDetailComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public customerService: CustomerService) {
  }

  ngOnInit(): void {
    this.elTemp = this.data.dataEl;
  }
}
