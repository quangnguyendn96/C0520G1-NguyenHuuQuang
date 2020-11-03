import {Component, OnInit} from '@angular/core';
import {CustomerService} from "../../../services/customer.service";
import {ActivatedRoute} from "@angular/router";
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

  constructor(
    public customerService: CustomerService,
    public route: ActivatedRoute,
    public dialog: MatDialog,
  ) {
  }

  ngOnInit(): void {
    this.customerService.getAll().subscribe(data => {
      this.elList = data;
      this.messageHome = this.sendMessage();
    })
  }

  view(id: number) {
    this.customerService.getById(id).subscribe(data => {
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
    this.customerService.getById(id).subscribe(data => {
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

  sendMessage() {
    return this.route.snapshot.queryParamMap.get("message");
  }
}
