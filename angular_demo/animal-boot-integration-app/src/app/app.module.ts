import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AnimalsListComponent } from './animals-list/animals-list.component';
import { CreateAnimalComponent } from './create-animal/create-animal.component';
import { DeleteAnimalComponent } from './delete-animal/delete-animal.component';
import {FormsModule} from '@angular/forms'
import { HttpClientModule } from '@angular/common/http';
import { AnimalService } from './animal.service';
@NgModule({
  declarations: [
    AppComponent,
    AnimalsListComponent,
    CreateAnimalComponent,
    DeleteAnimalComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [AnimalService],
  bootstrap: [AppComponent]
})
export class AppModule { }
