"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
exports.FootBallPlayer = void 0;
var player_1 = require("./player");
var FootBallPlayer = /** @class */ (function (_super) {
    __extends(FootBallPlayer, _super);
    function FootBallPlayer(id, name, team) {
        var _this = _super.call(this, id, name) || this;
        _this.team = team;
        return _this;
    }
    FootBallPlayer.prototype.printPlayer = function () {
        console.log("Printing Football Player");
        _super.prototype.printPlayer.call(this);
        console.log("Team : " + this.team);
    };
    return FootBallPlayer;
}(player_1.Player));
exports.FootBallPlayer = FootBallPlayer;
