import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AutobusesService {
  private url:String = "http://localhost:8080"

  constructor(private httpC:HttpClient) { }

  insert(visita:Visita):Observable<Object>{
    return this.httpC.post(`${this.url}/insertar`,user)
  }
}
