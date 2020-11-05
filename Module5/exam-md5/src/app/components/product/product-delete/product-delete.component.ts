import {Component, Inject, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {CustomerService} from "../../../services/customer.service";
import {Router} from "@angular/router";
import {checkId} from "../../customer/customer-add/customer-add.component";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {ProductService} from "../../../services/product.service";

@Component({
  selector: 'app-product-delete',
  templateUrl: './product-delete.component.html',
  styleUrls: ['./product-delete.component.css']
})
export class ProductDeleteComponent implements OnInit {
  public el;
  public idEl;

  constructor(
    public dialogRef: MatDialogRef<ProductDeleteComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public elService: ProductService) {
  }

  ngOnInit(): void {
    this.el = this.data.dataEl.name;
    this.idEl = this.data.dataEl.id;
  }

  delete() {
    this.elService.delete(this.idEl).subscribe(data => {
      this.dialogRef.close()
    })
  }
}
