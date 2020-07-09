"use strict";
exports.__esModule = true;
var footballplayer_1 = require("./footballplayer");
var Hello = /** @class */ (function () {
    function Hello(message) {
        this.message = message;
    }
    Hello.prototype.printMessage = function () {
        console.log(this.message);
    };
    return Hello;
}());
var h = new Hello("hello classes");
h.printMessage();
//let p=new Player(100,"Sachin");
//p.printPlayer();
var p = new footballplayer_1.FootBallPlayer(100, "Dinesh", "INDIA");
p.printPlayer();
