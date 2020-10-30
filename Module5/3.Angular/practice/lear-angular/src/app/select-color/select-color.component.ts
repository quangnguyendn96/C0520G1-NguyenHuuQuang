import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-select-color',
  templateUrl: './select-color.component.html',
  styleUrls: ['./select-color.component.css']
})
export class SelectColorComponent implements OnInit {
  backgroundColor = "blue";
  changeColorText: string;

  constructor() {
  }

  ngOnInit(): void {
  }

  changeColor(value) {
    this.backgroundColor = value;
  }

  backColorText(value) {
    this.changeColorText = value;
  }
}
