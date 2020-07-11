import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Pipes';
  mydate=new Date();
  jsonVal={name:"Sachin",age:33,address:{street:"abc street",city:"Mumbai"}}
  fruits=['Apple','Banana','Mango','Pomogranate','Chiku','Kiwi','Watermelon'];
  firstName="Mahendra Singh";
  lastName="Dhoni"
}
