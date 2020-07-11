import { Component, OnInit } from '@angular/core';
import { PlayerService } from '../player.service';

@Component({
  selector: 'app-playerdelete',
  templateUrl: './playerdelete.component.html',
  styleUrls: ['./playerdelete.component.css']
})
export class PlayerdeleteComponent implements OnInit {
  idModel: number;
  constructor(private service:PlayerService) { }

  ngOnInit() {
  }
  removePlayer() {
    this.service.deletePlayerById(this.idModel);
  }

}
