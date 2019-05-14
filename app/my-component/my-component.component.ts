import { Component, OnInit } from '@angular/core';
import { Pokemon } from './pokemon';
import { FilterPokemonPipePipe } from 'H:/SIR/Tppok/workspaceAngular/src/app/filter-pokemon--pipe.pipe';
import { PokeAPIService } from '../poke-api.service';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-my-component',
  templateUrl: './my-component.component.html',
  styleUrls: ['./my-component.component.css']
})
export class MyComponentComponent implements OnInit {
  id: string = '';

  pokemonTab : Pokemon[]
  pokeInfo : any[];
  
  filterPoke = new FilterPokemonPipePipe();

  constructor(private servicePoke : PokeAPIService) { }

  ngOnInit() {
    this.servicePoke.getallPokemon().subscribe(
      (res) => {
        this.pokemonTab = res['results'];
      }
    )
  }

  Go(pokemon : String){
    if(pokemon !== undefined){
    console.log(pokemon)
    this.servicePoke.getPokemonByName(pokemon).subscribe(
      (res) => {
        this.pokeInfo = res['id'];
        console.log(this.pokeInfo)
      }
    )
   }
   else{
     console.log("no pokemon selected")
   }
  }

}
