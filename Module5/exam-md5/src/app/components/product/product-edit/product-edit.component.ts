import {Component, Inject, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {ActivatedRoute, Router} from "@angular/router";
import {ProductService} from "../../../services/product.service";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-product-edit',
  templateUrl: './product-edit.component.html',
  styleUrls: ['./product-edit.component.css']
})
export class ProductEditComponent implements OnInit {
  public formEdit: FormGroup;
  public elListForeign;
  public maxDate = new Date();
  public minDate = new Date(1990, 0, 1);
  public idEl;

  constructor(public formBuilder: FormBuilder,
              public elService: ProductService,
              public activeRouter: ActivatedRoute,
              public dialogRef: MatDialogRef<ProductEditComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public router: Router) {
  }

  ngOnInit(): void {
    this.formEdit = this.formBuilder.group({
      name: ['', [Validators.required]],
      typeProduct: [''],
      dateExport: ['', [Validators.required]],
      dateImport: ['', [Validators.required]],
      status: ['', [Validators.required]]
    });
    this.elService.getAllForeign().subscribe(data => {
      this.elListForeign = data
    });

    this.activeRouter.params.subscribe(data => {
      this.idEl = this.data.dataEl.id;
      this.elService.getById(this.idEl).subscribe(data => {
        this.formEdit.patchValue(data);
      })
    })
  }

  edit() {
    this.elService.edit(this.formEdit.value, this.idEl).subscribe(data => {
      this.dialogRef.close()
    })
  }
}
