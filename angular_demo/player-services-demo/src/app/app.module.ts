import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { PlayerService } from './player.service';
import { PlayerlistComponent } from './playerlist/playerlist.component';
import { PlayeraddComponent } from './playeradd/playeradd.component';
import { PlayerdeleteComponent } from './playerdelete/playerdelete.component';
import{FormsModule} from '@angular/forms'
@NgModule({
  declarations: [
    AppComponent,
    PlayerlistComponent,
    PlayeraddComponent,
    PlayerdeleteComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [PlayerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
