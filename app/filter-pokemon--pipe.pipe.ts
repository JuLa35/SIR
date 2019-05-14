import { Pipe, PipeTransform } from '@angular/core';
import { Pokemon } from './my-component/pokemon'
@Pipe({
  name: 'filterPoke'
})
export class FilterPokemonPipePipe implements PipeTransform {
  transform(value: any[], property?: string, searchString?: string): any[] {
    if (searchString !== undefined){
    if (typeof value !== 'undefined') {
      return value.filter((e) => {
        console.log('property ' + property)
        return e[property].toLowerCase().indexOf(searchString.toLowerCase()) !== -1;
      });
    } else {
      return value;
    }}
    else {
      return value
    }
  }
}
