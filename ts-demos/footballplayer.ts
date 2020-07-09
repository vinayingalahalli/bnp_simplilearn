import { Player } from "./player";
export class FootBallPlayer extends Player{

    team:string;
    constructor(id: number, name: string,team:string){
        super(id,name);
        this.team=team;
    }
    printPlayer(){
        console.log("Printing Football Player")
        super.printPlayer();
        console.log("Team : "+this.team);
    }
}