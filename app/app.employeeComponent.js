"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var core_1 = require("@angular/core");
var AppemployeeComponent = (function () {
    function AppemployeeComponent() {
        this.isDisabled = "true";
        this.eId = 1001;
        this.eName = "kathir";
        this.eId = 37;
        this.eSalary = 234567;
        this.logo = './img.jpg';
    }
    AppemployeeComponent.prototype.takeHomeSalary = function () {
        var takeHome = this.eSalary - (this.eSalary * 0.12);
        return takeHome;
    };
    return AppemployeeComponent;
}());
AppemployeeComponent = __decorate([
    core_1.Component({
        selector: 'my-component',
        /*template: `<h4>Hello {{eName}} and your id is {{eId}} and your salary is {{eSalary}}	</h4>`,*/
        templateUrl: './app.employeecomponent.html',
    })
], AppemployeeComponent);
exports.AppemployeeComponent = AppemployeeComponent;
//# sourceMappingURL=app.employeeComponent.js.map