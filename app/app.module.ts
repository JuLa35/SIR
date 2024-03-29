import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { MyComponentComponent } from './my-component/my-component.component';
import { FilterPokemonPipePipe } from './filter-pokemon--pipe.pipe';
import { PokeAPIService } from "./poke-api.service";
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    MyComponentComponent,
    FilterPokemonPipePipe,
  ],
 imports: [
    FormsModule,
    BrowserModule,
    HttpClientModule
  ],
  providers: [PokeAPIService],
  bootstrap: [AppComponent]
})
export class AppModule {
  
 }
