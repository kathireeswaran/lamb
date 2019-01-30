import { Component } from '@angular/core';

@Component({
  selector: 'my-component',
/*template: `<h4>Hello {{eName}} and your id is {{eId}} and your salary is {{eSalary}}	</h4>`,*/
  templateUrl: './app.employeecomponent.html',
})
export class AppemployeeComponent  { 
isDisabled:string="true";

eName:string="kathir";
eId:number=37;eSalary:number=234567; 
logo='./img.jpg';
takeHomeSalary():number{
let takeHome=this.eSalary-(this.eSalary*0.12);
return takeHome;
}

}
 