import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProgressBarNgStyleComponent } from './progress-bar-ng-style.component';

describe('ProgressBarNgStyleComponent', () => {
  let component: ProgressBarNgStyleComponent;
  let fixture: ComponentFixture<ProgressBarNgStyleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProgressBarNgStyleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProgressBarNgStyleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
