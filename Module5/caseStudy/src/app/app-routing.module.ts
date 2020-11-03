import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {Routes, RouterModule} from "@angular/router";
import {HomeFuramaComponent} from "./components/home-furama/home-furama.component";
import {PageNotFoundComponent} from "./components/page-not-found/page-not-found.component";
import {EmployeeListComponent} from './components/employee/employee-list/employee-list.component';
import {EmployeeAddComponent} from './components/employee/employee-add/employee-add.component';
import {EmployeeEditComponent} from './components/employee/employee-edit/employee-edit.component';
import {EmployeeDeleteComponent} from './components/employee/employee-delete/employee-delete.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {MaterialModule} from "./material.module";
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import {NgxPaginationModule} from 'ngx-pagination';
import {EmployeeDetailComponent} from './components/employee/employee-detail/employee-detail.component';
import {CustomerListComponent} from './components/customer/customer-list/customer-list.component';
import {CustomerAddComponent} from './components/customer/customer-add/customer-add.component';
import {CustomerEditComponent} from './components/customer/customer-edit/customer-edit.component';
import {CustomerDetailComponent} from './components/customer/customer-detail/customer-detail.component';
import {CustomerDeleteComponent} from './components/customer/customer-delete/customer-delete.component';
import {CustomerTypeComponent} from './components/customer-type/customer-type/customer-type.component';
import { ServiceListComponent } from './components/service/service-list/service-list.component';
import { ServiceAddComponent } from './components/service/service-add/service-add.component';
import { ServiceEditComponent } from './components/service/service-edit/service-edit.component';
import { ServiceDeleteComponent } from './components/service/service-delete/service-delete.component';
import { ServiceDetailComponent } from './components/service/service-detail/service-detail.component';

const routesConfig: Routes = [
  {
    path: 'home',
    redirectTo: ''
  },
  {path: '', component: HomeFuramaComponent},
  {path: 'employee', component: EmployeeListComponent},
  {path: 'customer', component: CustomerListComponent},
  {path: 'service', component: ServiceListComponent},
  {path: 'customer/create', component: CustomerAddComponent},
  {path: 'employee/create', component: EmployeeAddComponent},
  {path: 'service/create', component: ServiceAddComponent},
  {path: 'edit-employee/:id', component: EmployeeEditComponent},
  {path: 'edit-customer/:id', component: CustomerEditComponent},
  {path: 'edit-service/:id', component: CustomerEditComponent},
  {path: '**', component: PageNotFoundComponent}
];

@NgModule({
  declarations: [HomeFuramaComponent,
    EmployeeListComponent,
    PageNotFoundComponent,

    EmployeeListComponent,
    EmployeeAddComponent,
    EmployeeEditComponent,
    EmployeeDeleteComponent,
    EmployeeDetailComponent,
    CustomerListComponent,
    CustomerAddComponent,
    CustomerEditComponent,
    CustomerDetailComponent,
    CustomerDeleteComponent,
    CustomerTypeComponent,
    ServiceListComponent,
    ServiceAddComponent,
    ServiceEditComponent,
    ServiceDeleteComponent,
    ServiceDetailComponent,

  ],

  imports: [
    CommonModule,
    RouterModule.forRoot(routesConfig),
    ReactiveFormsModule,
    FormsModule,
    MaterialModule,
    Ng2SearchPipeModule,
    NgxPaginationModule
  ],
  exports: [RouterModule, HomeFuramaComponent]
})

export class AppRoutingModule {
}
