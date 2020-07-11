import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CreateAnimalComponent } from './create-animal/create-animal.component';
import { AnimalsListComponent } from './animals-list/animals-list.component';
import { DeleteAnimalComponent } from './delete-animal/delete-animal.component';


const routes: Routes = [
  {path:'addAnimal',component:CreateAnimalComponent},
  {path:'animals',component:AnimalsListComponent},
  {path:'deleteAnimal',component:DeleteAnimalComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
