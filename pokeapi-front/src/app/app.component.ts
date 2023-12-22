import { Component } from '@angular/core';
import { PokeapiServiceService } from './pokeapi-service.service';
import { Pokemon } from './models/pokemon.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  pokemon: Pokemon | undefined;
  busqueda: string = '';

  constructor(private servicio: PokeapiServiceService){}

  obtenerDatos() {
    this.servicio.obtenerDatos(this.busqueda).subscribe(
      (datos) => {
        console.log('Datos recibidos:', datos);
        this.pokemon = datos;
      },
      (error) => {
        console.error('Error al obtener datos:', error);
      }
    );
  }
}
