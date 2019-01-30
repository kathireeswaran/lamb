import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent }  from './app.component';
import { AppemployeeComponent }  from './app.employeeComponent';
@NgModule({
  imports:      [ BrowserModule ],
  declarations: [ AppComponent, AppemployeeComponent],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
