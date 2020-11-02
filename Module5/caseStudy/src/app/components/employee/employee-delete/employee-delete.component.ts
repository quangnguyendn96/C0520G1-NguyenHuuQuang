import {Component, OnInit, Inject} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {EmployeeService} from "../../../services/employee.service";

@Component({
  selector: 'app-employee-delete',
  templateUrl: './employee-delete.component.html',
  styleUrls: ['./employee-delete.component.css']
})
export class EmployeeDeleteComponent implements OnInit {
  public employeeFull;
  public idEmployee;

  constructor(
    public dialogRef: MatDialogRef<EmployeeDeleteComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public employeeService: EmployeeService) {
  }

  ngOnInit(): void {
    this.employeeFull = this.data.dataEm.nameEmployee;
    this.idEmployee = this.data.dataEm.id;
  }

  deleteEmployee() {
    this.employeeService.deleteEmployee(this.idEmployee).subscribe(data =>
    {this.dialogRef.close()})

  }
}

