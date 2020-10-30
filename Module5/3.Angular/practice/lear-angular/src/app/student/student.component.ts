import {Component, OnInit} from '@angular/core';

export interface Istudent {
  id: number,
  name: string,
  age: number
}

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {
  statusButton:boolean = false;
  student: Istudent = {
    id: 1,
    name: "Tra",
    age: 25
  }

  constructor() {
  }

  ngOnInit(): void {
  }

  updateAge(value: number) {
    this.student.age = value;
  }
}
