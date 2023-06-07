import { Component } from '@angular/core';
import { AutobusesService } from '../autobuses.service';
import { Autobus } from '../modelo/Autobus';

@Component({
  selector: 'app-autobuses',
  templateUrl: './autobuses.component.html',
  styleUrls: ['./autobuses.component.css']
})
export class AutobusesComponent {
  constructor(private miServicio:AutobusesService){
    
  }
  autobus:Autobus=new Autobus;
}
