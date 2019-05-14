import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PokeAPIService {

  url : String = "https://pokeapi.co/api/v2/pokemon"

  constructor(private http : HttpClient) {
  }

  getallPokemon(){
    return this.http.get(this.url+"?offset=0&limit=964");
  }

  getPokemonById(id : number){
    return this.http.get(this.url+'/'+id)
  }

  getPokemonByName(name : String){
    return this.http.get(this.url+'/'+name)
  }
  
}
