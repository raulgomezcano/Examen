import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AutobusesComponent } from './autobuses/autobuses.component';

const routes: Routes = [
  {path:'', component:AutobusesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
