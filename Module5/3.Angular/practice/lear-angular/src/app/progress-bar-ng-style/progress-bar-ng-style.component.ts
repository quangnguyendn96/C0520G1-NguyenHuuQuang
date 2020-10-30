import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-progress-bar-ng-style',
  templateUrl: './progress-bar-ng-style.component.html',
  styleUrls: ['./progress-bar-ng-style.component.css']
})
export class ProgressBarNgStyleComponent implements OnInit {
  @Input() backgroundColor = '#D9D9D9';
  @Input() progressColor = '#4CAF50';
  @Input() width = 50;
  constructor() { }

  ngOnInit(): void {
  }

}
