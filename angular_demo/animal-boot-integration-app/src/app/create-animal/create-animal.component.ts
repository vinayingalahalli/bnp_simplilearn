import { Component, OnInit } from '@angular/core';
import { Animal } from '../animal';
import { AnimalService } from '../animal.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-animal',
  templateUrl: './create-animal.component.html',
  styleUrls: ['./create-animal.component.css']
})
export class CreateAnimalComponent implements OnInit {
private animal:Animal;
  constructor(private service:AnimalService,private router : Router) {
    this.animal=new Animal();
  }
  addAnimal(){
    this.service.addAnimal(this.animal).subscribe(res=>this.gotoAnimalList())
  }

  gotoAnimalList(){
    this.animal=new Animal;
    this.router.navigate(['/animals'])
  }

  ngOnInit() {
  }

}
