import {Component, OnInit} from '@angular/core';
import {EmployeeService} from "../../../services/employee.service";
import {MatDialog, MatDialogRef} from "@angular/material/dialog";
import {EmployeeDeleteComponent} from "../employee-delete/employee-delete.component";
import {EmployeeDetailComponent} from "../employee-detail/employee-detail.component";
import {ActivatedRoute} from "@angular/router";


@Component({
  selector: 'app-employee',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
  public listEmployee;
  term: any;
  p: any;
  public messageHome: string;

  constructor(
    public employeeService: EmployeeService,
    public dialog: MatDialog,
    public route: ActivatedRoute,
  ) {
  }

  ngOnInit(): void {
    this.employeeService.getAllEmployees().subscribe(data => {
      this.listEmployee = data;
      this.messageHome = this.sendMessage();
    })
  }

  delete(id: number): void {
    this.employeeService.getEmployeeById(id).subscribe(data => {
      const dialogRef = this.dialog.open(EmployeeDeleteComponent, {
        width: '500px',
        data: {dataEm: data},
        disableClose: true
      });

      dialogRef.afterClosed().subscribe(result => {
        this.ngOnInit();
      });
    })

  }

  view(id: number) {
    this.employeeService.getEmployeeById(id).subscribe(data => {
      const dialogRef = this.dialog.open(EmployeeDetailComponent, {
        width: '500px',
        data: {dataEm: data},
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


