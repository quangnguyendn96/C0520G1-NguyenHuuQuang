import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {Routes, RouterModule} from "@angular/router";
import {HomeFuramaComponent} from "./components/home-furama/home-furama.component";
import {PageNotFoundComponent} from "./components/page-not-found/page-not-found.component";
import {CustomerComponent} from './components/customer/customer.component';
import {EmployeeListComponent} from './components/employee/employee-list/employee-list.component';
import {EmployeeAddComponent} from './components/employee/employee-add/employee-add.component';
import {EmployeeEditComponent} from './components/employee/employee-edit/employee-edit.component';
import {EmployeeDeleteComponent} from './components/employee/employee-delete/employee-delete.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {MaterialModule} from "./material.module";
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import {NgxPaginationModule} from 'ngx-pagination';
import { EmployeeDetailComponent } from './components/employee/employee-detail/employee-detail.component';

const routesConfig: Routes = [
  {
    path: 'home',
    redirectTo: ''
  },
  {path: '', component: HomeFuramaComponent},
  {path: 'employee', component: EmployeeListComponent},
  {path: 'customer', component: CustomerComponent},
  {path: 'employee/create', component: EmployeeAddComponent},
  {path: 'edit-employee/:id', component: EmployeeEditComponent},
  {path: '**', component: PageNotFoundComponent}
];

@NgModule({
  declarations: [HomeFuramaComponent,
    EmployeeListComponent,
    PageNotFoundComponent,
    CustomerComponent,
    EmployeeListComponent,
    EmployeeAddComponent,
    EmployeeEditComponent,
    EmployeeDeleteComponent,
    EmployeeDetailComponent
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
