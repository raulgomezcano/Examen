import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AutobusesComponent } from './autobuses/autobuses.component';
import { VisitasComponent } from './visitas/visitas.component';

const routes: Routes = [
  {path:'', component:AutobusesComponent},
  {path:'visitas', component:VisitasComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
