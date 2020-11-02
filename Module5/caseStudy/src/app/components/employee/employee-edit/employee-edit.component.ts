import {Component, OnInit} from '@angular/core';
import {FormGroup, FormBuilder, Validators} from "@angular/forms";
import {EmployeeService} from "../../../services/employee.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-employee-edit',
  templateUrl: './employee-edit.component.html',
  styleUrls: ['./employee-edit.component.css']
})
export class EmployeeEditComponent implements OnInit {
  public formEditNewEmployee: FormGroup;
  public idEmployee;

  constructor(
    public formBuilder: FormBuilder,
    public employeeService: EmployeeService,
    public router: Router,
    public activeRouter: ActivatedRoute,
  ) {
  }

  ngOnInit(): void {

    this.formEditNewEmployee = this.formBuilder.group({
        nameEmployee: ['', [Validators.required]],
        identityCardEmployee: ['', [Validators.required, Validators.pattern('^[\\d]{9}$')]],
        dayOfBirth: [''],
        salary: ['', [Validators.required]],
        phoneNumber: ['', [Validators.required]],
        emailEmployee: ['', [Validators.required, Validators.email]],
        addressEmployee: ['', [Validators.required]],
        username: ['', [Validators.required]],
        idPositive: ['', [Validators.required]],
        idEducationDegree: ['', [Validators.required]]
      }
    );
    this.activeRouter.params.subscribe(data => {
      this.idEmployee = data.id;
      this.employeeService.getEmployeeById(this.idEmployee).subscribe(data => {
        console.log(data);
        this.formEditNewEmployee.patchValue(data);
      })
    })
  }

  editEmployee() {
    this.employeeService.editEmployee(this.formEditNewEmployee.value, this.idEmployee).subscribe(data => {
      this.router.navigateByUrl('/employee');

    })

  }
}
