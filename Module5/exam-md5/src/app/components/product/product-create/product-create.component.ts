import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {ProductService} from "../../../services/product.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-product-create',
  templateUrl: './product-create.component.html',
  styleUrls: ['./product-create.component.css']
})
export class ProductCreateComponent implements OnInit {

  public formAddNew: FormGroup;
  public elListForeign;
  public maxDate = new Date();
  public minDate = new Date(1990, 0, 1);
  public listIdentity = [];
  private elList;

  constructor(public formBuilder: FormBuilder,
              public elService: ProductService,
              public router: Router) {
  }

  ngOnInit(): void {
    this.formAddNew = this.formBuilder.group({
      name: ['', [Validators.required,Validators.pattern('^[\\d]{9}$')]],
      typeProduct: [''],
      dateExport: ['', [Validators.required]],
      dateImport: ['', [Validators.required]],
      status: ['', [Validators.required]]
    });
    this.elService.getAllForeign().subscribe(data => {
      this.elListForeign = data
    });
    this.elService.getAll().subscribe(data => {
      this.elList = data;
      this.getAllIdentity();
    });

  }

  getAllIdentity() {
    if (!this.elList.isEmpty) {
      for (let ident of this.elList) {
        this.listIdentity.push(ident.identityCard);
      }
    }
  }

  addNew() {
    this.elService.addNew(this.formAddNew.value).subscribe(data => {
      this.router.navigateByUrl('/product')
    })
  }
}
