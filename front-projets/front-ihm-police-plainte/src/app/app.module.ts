import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {AccueilModule} from './module-accueil/accueil.module';
import {AdministrationModule} from './module-administration/administration.module';
import {DeclarationModule} from './module-declaration/declaration.module';
import {RechercheModule} from './module-recherche/recherche.module';
import {StatistiqueModule} from './module-statistique/statistique.module';
import { MenuComponent } from './menu-component/menu.component';
import {AccueilComponent} from './module-accueil/accueil/accueil.component';
import {InfrastructureModule} from './module-infrastructure/infrastructure.module';


@NgModule({
  declarations: [
    AppComponent,
    MenuComponent
  ],
  imports: [
    BrowserModule,
    AccueilModule,
    AdministrationModule,
    RechercheModule,
    StatistiqueModule,
    DeclarationModule,
  InfrastructureModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
