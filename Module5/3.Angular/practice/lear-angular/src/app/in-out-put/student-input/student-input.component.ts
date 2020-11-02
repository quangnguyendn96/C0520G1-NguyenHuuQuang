import {Component, Input, OnInit} from '@angular/core';
import {Student} from "../student";

@Component({
  selector: 'app-student-input',
  templateUrl: './student-input.component.html',
  styleUrls: ['./student-input.component.css']
})
export class StudentInputComponent implements OnInit {
  @Input("student") student: Student;
  constructor() { }

  ngOnInit(): void {
  }

}
