import { Component, OnInit } from '@angular/core';
import { Player } from '../player';
import { PlayerService } from '../player.service';

@Component({
  selector: 'app-playerlist',
  templateUrl: './playerlist.component.html',
  styleUrls: ['./playerlist.component.css']
})
export class PlayerlistComponent implements OnInit {
players:Player[];
  constructor(private service:PlayerService) { }

  ngOnInit() {
    this.players=this.service.getAllPlayers();
  }

}
