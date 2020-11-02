import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';

import { FontSizeComponent } from './font-size/font-size.component';
import {FormsModule} from "@angular/forms";
import { PetComponent } from './pet/pet.component';
import { CalculatorComponent } from './calculator/calculator.component';
import { SelectColorComponent } from './select-color/select-color.component';
import { NameCardComponent } from './name-card/name-card.component';
import { ProgressBarNgStyleComponent } from './progress-bar-ng-style/progress-bar-ng-style.component';
import { OutDemoComponent } from './out-demo/out-demo.component';
import { StudentInputComponent } from './in-out-put/student-input/student-input.component';
// import { ArticleComponent } from './article/article.component';
import {AppRoutingModule} from "./app-routing.module"
import {RouterModule} from "@angular/router";
@NgModule({
  declarations: [
    AppComponent,

    FontSizeComponent,
    PetComponent,
    CalculatorComponent,
    SelectColorComponent,
    NameCardComponent,
    ProgressBarNgStyleComponent,
    OutDemoComponent,
    StudentInputComponent

    // ArticleComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    RouterModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
