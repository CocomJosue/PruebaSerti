import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Pokemon } from './models/pokemon.model';

@Injectable({
  providedIn: 'root'
})
export class PokeapiServiceService {
  
  private apiUrl = 'https://pokeapi.co/api/v2/pokemon/';

  constructor(private http: HttpClient) {}

  obtenerDatos(busqueda: string): Observable<Pokemon> {
    return this.http.get<Pokemon>(this.apiUrl + busqueda);
  }
}
