import {Component, OnInit} from '@angular/core';
import {EmployeeService} from "../../../services/employee.service";
import {MatDialog, MatDialogRef} from "@angular/material/dialog";
import {EmployeeDeleteComponent} from "../employee-delete/employee-delete.component";
import {EmployeeDetailComponent} from "../employee-detail/employee-detail.component";


@Component({
  selector: 'app-employee',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
  public listEmployee;
  term: any;
  p: any;

  constructor(
    public employeeService: EmployeeService,
    public dialog: MatDialog
  ) {
  }

  ngOnInit(): void {
    this.employeeService.getAllEmployees().subscribe(data => {
      this.listEmployee = data;
      console.log(this.listEmployee)
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
}


