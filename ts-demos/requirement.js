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
exports.Implementor = exports.Requirement = void 0;
var Requirement = /** @class */ (function () {
    function Requirement() {
    }
    Requirement.prototype.display = function () {
        console.log("Hello abstract");
    };
    return Requirement;
}());
exports.Requirement = Requirement;
var Implementor = /** @class */ (function (_super) {
    __extends(Implementor, _super);
    function Implementor() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Implementor.prototype.requirement1 = function () {
        console.log("requirement1");
    };
    return Implementor;
}(Requirement));
exports.Implementor = Implementor;
