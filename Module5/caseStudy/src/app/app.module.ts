import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';

import { CustomerComponent } from './customer/customer.component';

import { HomeFuramaComponent } from './home-furama/home-furama.component';
import { HeaderComponent } from './common/header/header.component';
import { EmployeeComponent } from './employee/employee.component';

@NgModule({
  declarations: [
    AppComponent,

    CustomerComponent,
    HomeFuramaComponent,
    HeaderComponent,
    EmployeeComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
