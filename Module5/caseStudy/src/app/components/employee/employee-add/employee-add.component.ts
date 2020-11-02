import {Component, OnInit} from '@angular/core';
import {FormGroup, FormBuilder, Validators} from "@angular/forms";
import {EmployeeService} from "../../../services/employee.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-employee-add',
  templateUrl: './employee-add.component.html',
  styleUrls: ['./employee-add.component.css']
})
export class EmployeeAddComponent implements OnInit {
  public formAddNewEmployee: FormGroup;
  public maxDate = new Date();
  public minDate = new Date(1990, 0, 1);

  constructor(
    public formBuilder: FormBuilder,
    public employeeService: EmployeeService,
    public router: Router
  ) {
  }

  ngOnInit(): void {
    this.formAddNewEmployee = this.formBuilder.group({
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
    )
  }

  addNewEmployee() {
    // if (this.formAddNewEmployee.valid) {
    this.employeeService.addNewEmployee(this.formAddNewEmployee.value).subscribe(data => {
        this.router.navigateByUrl("/employee");
      }
    )
  }

}

// }
