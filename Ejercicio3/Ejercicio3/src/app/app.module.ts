import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AutobusesComponent } from './autobuses/autobuses.component';
import { FormsModule } from '@angular/forms';
import { VisitasComponent } from './visitas/visitas.component';
import { AutobusesService } from './autobuses.service';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    AutobusesComponent,
    VisitasComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [AutobusesService],
  bootstrap: [AppComponent]
})
export class AppModule { }
