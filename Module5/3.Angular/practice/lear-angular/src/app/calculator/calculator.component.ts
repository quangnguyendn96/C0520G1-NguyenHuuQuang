import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
  number1: number;
  number2: number;
  operator: string;
  result: number;
  constructor() {
  }

  ngOnInit(): void {
  }
getResult(operator : string){
    switch (operator) {
      case "+" :
        this.result = this.number1 + this.number2;
        break;
      case "-" :
        this.result = this.number1 - this.number2;
        break;
      case "X" :
        this.result = this.number1 * this.number2;
        break;
      case "/" :
        this.result = this.number1 / this.number2;
        break;
    }
}

}
