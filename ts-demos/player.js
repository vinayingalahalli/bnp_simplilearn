"use strict";
exports.__esModule = true;
exports.Player = void 0;
var Player = /** @class */ (function () {
    function Player(id, name) {
        this.id = id;
        this.name = name;
    }
    Player.prototype.printPlayer = function () {
        console.log("Id = " + this.id + " name = " + this.name);
    };
    return Player;
}());
exports.Player = Player;
