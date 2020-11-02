import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {Routes, RouterModule} from "@angular/router";
import {NameCardComponent} from "./name-card/name-card.component";
import {PetComponent} from "./pet/pet.component";

const routes: Routes = [
  {path: "name", component: NameCardComponent},
  {path: "pet", component: PetComponent}
];

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ]
})
export class AppRoutingModule {
}
