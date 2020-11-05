import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {CustomerService} from "../../../services/customer.service";
import {Product} from "../../../model/product.class";
import {ProductService} from "../../../services/product.service";

@Component({
  selector: 'app-product-detail',
  templateUrl: './product-detail.component.html',
  styleUrls: ['./product-detail.component.css']
})
export class ProductDetailComponent implements OnInit {
   el : Product;

  constructor(public dialogRef: MatDialogRef<ProductDetailComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public elService: ProductService) {
  }

  ngOnInit(): void {
    this.el = this.data.dataEl;
  }
}
