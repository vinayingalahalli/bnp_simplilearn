import { Injectable } from '@angular/core';
import { Player } from './player';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {
 playerList:Player[]=[];
  constructor() { }

  createPlayer(player:Player){
    this.playerList.push(player)
  }

  getAllPlayers():Player[]{
    return this.playerList;
  }
  deletePlayerById(id:number){
    let index=this.playerList.findIndex(i=>i.id===id);
    this.playerList.splice(index,1);
  }
}
