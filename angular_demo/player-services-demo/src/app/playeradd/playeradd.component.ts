import { Component, OnInit } from '@angular/core';
import { Player } from '../player';
import { PlayerService } from '../player.service';

@Component({
  selector: 'app-playeradd',
  templateUrl: './playeradd.component.html',
  styleUrls: ['./playeradd.component.css']
})
export class PlayeraddComponent implements OnInit {
playerModel:Player;
  constructor(private service:PlayerService) { 
    this.playerModel=new Player();
  }
  createPlayer(){
    this.service.createPlayer(this.playerModel);
    this.playerModel=new Player();
  }
  ngOnInit() {
  }

}
