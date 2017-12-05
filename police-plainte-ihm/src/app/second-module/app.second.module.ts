import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import {MySecondComponent } from './seconde-components/my.second.components';


@NgModule({
  declarations: [
    MySecondComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [MySecondComponent]
})
export class AppSecondModule { }
