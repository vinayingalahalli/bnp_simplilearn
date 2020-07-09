import {Player} from './player';
import { FootBallPlayer } from './footballplayer';
class Hello{
    message:string;
    constructor(message){
        this.message=message;
    }

    printMessage(){
        console.log(this.message);
    }
}
let h=new Hello("hello classes");
h.printMessage();
//let p=new Player(100,"Sachin");
//p.printPlayer();

let p=new FootBallPlayer(100,"Dinesh","INDIA");
p.printPlayer();