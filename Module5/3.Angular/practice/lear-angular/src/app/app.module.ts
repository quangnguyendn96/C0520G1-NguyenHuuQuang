import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { QuangComponent } from './quang/quang.component';
import { FontSizeComponent } from './font-size/font-size.component';
import {FormsModule} from "@angular/forms";
import { PetComponent } from './pet/pet.component';
import { CalculatorComponent } from './calculator/calculator.component';
import { SelectColorComponent } from './select-color/select-color.component';
import { NameCardComponent } from './name-card/name-card.component';
import { ProgressBarNgStyleComponent } from './progress-bar-ng-style/progress-bar-ng-style.component';
// import { ArticleComponent } from './article/article.component';

@NgModule({
  declarations: [
    AppComponent,
    QuangComponent,
    FontSizeComponent,
    PetComponent,
    CalculatorComponent,
    SelectColorComponent,
    NameCardComponent,
    ProgressBarNgStyleComponent,
    // ArticleComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
