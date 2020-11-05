import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {CustomerService} from "../../../services/customer.service";

@Component({
  selector: 'app-customer-delete',
  templateUrl: './customer-delete.component.html',
  styleUrls: ['./customer-delete.component.css']
})
export class CustomerDeleteComponent implements OnInit {
  public elTemp;
  public idEl;

  constructor(
    public dialogRef: MatDialogRef<CustomerDeleteComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public customerService: CustomerService) {
  }

  ngOnInit(): void {
    this.elTemp = this.data.dataEl.customerName;
    this.idEl = this.data.dataEl.id;
  }

  delete() {
    this.customerService.delete(this.idEl).subscribe(data => {
      this.dialogRef.close()
    })
  }
}
