import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import {ServiceService} from "../../../services/service.service";

@Component({
  selector: 'app-service-add',
  templateUrl: './service-add.component.html',
  styleUrls: ['./service-add.component.css']
})
export class ServiceAddComponent implements OnInit {
  public formAddNew: FormGroup;
  public typeRent;

  constructor(
    public formBuilder: FormBuilder,
    public serviceService: ServiceService,
    public router: Router
  ) {
  }

  ngOnInit(): void {
    this.formAddNew = this.formBuilder.group({
      serviceName: ['', [Validators.required]],
      area: ['', [Validators.required]],
      numberFloor: ['', [Validators.required]],
      amountNumber: ['', [Validators.required]],
      costRent: ['', [Validators.required]],
      typeRent: ['', [Validators.required]],
      status: ['', [Validators.required]]
    });
    this.serviceService.getAPI_FOREIGN().subscribe(data => {
      this.typeRent = data
    })
  }

  addNew() {
    this.serviceService.addNew(this.formAddNew.value).subscribe(data => {
      this.router.navigate(['/service'], {queryParams: {message: 'create successfully'}})
    })
  }

  test() {
    console.log(this.formAddNew.value);
  }
}
