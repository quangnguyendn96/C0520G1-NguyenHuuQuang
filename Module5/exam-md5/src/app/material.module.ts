import {NgModule} from '@angular/core';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MAT_DATE_LOCALE, MatNativeDateModule} from '@angular/material/core';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
import {MatDialogModule} from '@angular/material/dialog'
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {CustomerDeleteComponent} from "./components/customer/customer-delete/customer-delete.component";
import {CustomerDetailComponent} from "./components/customer/customer-detail/customer-detail.component";
import {MAT_MOMENT_DATE_ADAPTER_OPTIONS} from "@angular/material-moment-adapter";
import {MatMomentDateModule} from '@angular/material-moment-adapter';

@NgModule({
  imports: [
    MatDatepickerModule,
    MatFormFieldModule,
    MatNativeDateModule,
    MatInputModule,
    MatDialogModule,
    BrowserAnimationsModule,
    MatMomentDateModule
  ],
  exports: [
    MatDatepickerModule,
    MatFormFieldModule,
    MatNativeDateModule,
    MatInputModule,
    MatDialogModule,
    BrowserAnimationsModule
  ],
  providers: [{provide: MAT_DATE_LOCALE, useValue: 'fr-FR'}, {provide: MAT_MOMENT_DATE_ADAPTER_OPTIONS, useValue: { useUtc: true }},[MatDatepickerModule]],
  entryComponents: [CustomerDeleteComponent,CustomerDetailComponent]
})

export class MaterialModule {
}
