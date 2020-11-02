import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OutDemoComponent } from './out-demo.component';

describe('OutDemoComponent', () => {
  let component: OutDemoComponent;
  let fixture: ComponentFixture<OutDemoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OutDemoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(OutDemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
