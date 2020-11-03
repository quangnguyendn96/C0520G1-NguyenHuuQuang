import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {MatDialog} from "@angular/material/dialog";
import {ServiceService} from "../../../services/service.service";
import {ServiceDetailComponent} from "../service-detail/service-detail.component";
import {ServiceDeleteComponent} from "../service-delete/service-delete.component";


@Component({
  selector: 'app-service-list',
  templateUrl: './service-list.component.html',
  styleUrls: ['./service-list.component.css']
})
export class ServiceListComponent implements OnInit {
  public elList;
  term: any;
  p: number;
  public messageHome: string;

  constructor(
    public serviceService: ServiceService,
    public route: ActivatedRoute,
    public dialog: MatDialog,
  ) {
  }

  ngOnInit(): void {
    this.serviceService.getAll().subscribe(data => {
      this.elList = data;
      this.messageHome = this.sendMessage();
    })
  }

  view(id: number) {
    this.serviceService.getById(id).subscribe(data => {
      const dialogRef = this.dialog.open(ServiceDetailComponent, {
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
    this.serviceService.getById(id).subscribe(data => {
      const dialogRef = this.dialog.open(ServiceDeleteComponent, {
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
