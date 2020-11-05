import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {Routes, RouterModule} from "@angular/router";
import {PageNotFoundComponent} from "./components/page-not-found/page-not-found.component";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {MaterialModule} from "./material.module";
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import {NgxPaginationModule} from 'ngx-pagination';

import {CustomerListComponent} from './components/customer/customer-list/customer-list.component';
import {CustomerAddComponent} from './components/customer/customer-add/customer-add.component';
import {CustomerEditComponent} from './components/customer/customer-edit/customer-edit.component';
import {CustomerDetailComponent} from './components/customer/customer-detail/customer-detail.component';
import {CustomerDeleteComponent} from './components/customer/customer-delete/customer-delete.component';
import {IdConvertPipe} from './pipes/idConvert.pipe';
import {OrderModule} from "ngx-order-pipe";
import {HomeComponent} from './components/home/home.component';
import {ProductHomeComponent} from './components/product/product-home/product-home.component';
import {ProductCreateComponent} from './components/product/product-create/product-create.component';
import {ProductEditComponent} from './components/product/product-edit/product-edit.component';
import {ProductDetailComponent} from './components/product/product-detail/product-detail.component';
import {ProductDeleteComponent} from './components/product/product-delete/product-delete.component';

const routesConfig: Routes = [
  {
    path: 'home',
    redirectTo: ''
  },
  {path: '', component: HomeComponent},
  {path: 'customer', component: CustomerListComponent},
  {path: 'customer/create', component: CustomerAddComponent},
  {path: 'edit-customer/:id', component: CustomerEditComponent},
  {path: 'product', component: ProductHomeComponent},
  {path: 'product/create', component: ProductCreateComponent},
  {path: '**', component: PageNotFoundComponent}
];

@NgModule({
  declarations: [

    PageNotFoundComponent,
    CustomerListComponent,
    CustomerAddComponent,
    CustomerEditComponent,
    CustomerDetailComponent,
    CustomerDeleteComponent,
    IdConvertPipe,
    HomeComponent,
    ProductHomeComponent,
    ProductCreateComponent,
    ProductEditComponent,
    ProductDetailComponent,
    ProductDeleteComponent
  ],

  imports: [
    CommonModule,
    RouterModule.forRoot(routesConfig),
    ReactiveFormsModule,
    FormsModule,
    MaterialModule,
    Ng2SearchPipeModule,
    NgxPaginationModule,
    OrderModule
  ],
  exports: [RouterModule]
})

export class AppRoutingModule {
}
