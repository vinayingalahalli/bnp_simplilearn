import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { SqrtPipe } from './sqrt.pipe';
import { FullnamePipe } from './fullname.pipe';

@NgModule({
  declarations: [
    AppComponent,
    SqrtPipe,
    FullnamePipe
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
