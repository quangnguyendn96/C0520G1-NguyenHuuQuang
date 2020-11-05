import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {MatDialog} from "@angular/material/dialog";
import {ProductService} from "../../../services/product.service";
import {ProductDetailComponent} from "../product-detail/product-detail.component";
import {ProductDeleteComponent} from "../product-delete/product-delete.component";
import {Product} from "../../../model/product.class";
import {ProductEditComponent} from "../product-edit/product-edit.component";
import {ProductCreateComponent} from "../product-create/product-create.component";


@Component({
  selector: 'app-product-home',
  templateUrl: './product-home.component.html',
  styleUrls: ['./product-home.component.css']
})
export class ProductHomeComponent implements OnInit {

  public elList = [];
  term: any;
  p: number;
  public messageHome: string;
  key = 'id';
  reverse = false;
  // public el: Product;
  formSearch: string;

  constructor(
    public elService: ProductService,
    public route: ActivatedRoute,
    public dialog: MatDialog,
  ) {
  }

  ngOnInit(): void {
    this.elService.getAll().subscribe(data => {
      this.elList = data;
    });
    this.messageHome = this.sendMessage();
  }


  view(id: number) {
    this.elService.getById(id).subscribe(data => {
      const dialogRef = this.dialog.open(ProductDetailComponent, {
        width: '500px',
        data: {dataEl: data},
        disableClose: true
      });
      dialogRef.afterClosed().subscribe(result => {
        this.ngOnInit();
      });
    })
  }

  delete(id: number): void {
    this.elService.getById(id).subscribe(data => {
      const dialogRef = this.dialog.open(ProductDeleteComponent, {
        width: '500px',
        data: {dataEl: data},
        disableClose: true
      });

      dialogRef.afterClosed().subscribe(result => {
        this.ngOnInit();
      });
    })

  }

  sort(key) {

    this.key = key;
    this.reverse = !this.reverse;
  }

  sendMessage() {
    return this.route.snapshot.queryParamMap.get("message");
  }

  edit(id: any) {
    this.elService.getById(id).subscribe(data => {
      const dialogRef = this.dialog.open(ProductEditComponent, {
        width: '700px',
        data: {dataEl: data},
        disableClose: true
      });

      dialogRef.afterClosed().subscribe(result => {
        this.ngOnInit();
      });
    })
  }

  search() {
    return this.elList.push(new Product())
  }
  //
  // add() {
  //   const dialogRef = this.dialog.open(ProductCreateComponent, {
  //     width: '700px',
  //     disableClose: true
  //   });
  // }
}
