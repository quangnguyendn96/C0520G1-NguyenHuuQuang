import {Component, OnInit} from '@angular/core';
import {CustomerService} from "../../../services/customer.service";
import {ActivatedRoute, Router} from "@angular/router";
import {MatDialog} from "@angular/material/dialog";
import {CustomerDeleteComponent} from "../customer-delete/customer-delete.component";
import {CustomerDetailComponent} from "../customer-detail/customer-detail.component";

@Component({
  selector: 'app-customer',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  public elList;
  term: any;
  p: number;
  public messageHome: string;
  key = 'id';
  reverse = false;
  // public el: Product;

  constructor(
    public elService: CustomerService,
    public route: ActivatedRoute,
    public dialog: MatDialog,
  ) {
  }

  ngOnInit(): void {
    this.elService.getAll().subscribe(data => {
      this.elList = data;
    });

  }


  view(id: number) {
    this.elService.getById(id).subscribe(data => {
      const dialogRef = this.dialog.open(CustomerDetailComponent, {
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
      const dialogRef = this.dialog.open(CustomerDeleteComponent, {
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
}
