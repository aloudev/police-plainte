import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {AccueilComponent} from '../module-accueil/accueil/accueil.component';
import {DeclarationComponent} from '../module-declaration/declaration/declaration.component';
import {StatistiqueComponent} from '../module-statistique/statistique/statistique.component';
import {RechercheComponent} from '../module-recherche/recherche/recherche.component';

  const routes: Routes = [
  { path: '', redirectTo: '/accueil', pathMatch: 'full' },
{ path: 'accueil', component: AccueilComponent },
  { path: 'declaration', component: DeclarationComponent },
  { path: 'statistiques', component: StatistiqueComponent },
  {path : 'recherche', component : RechercheComponent}

];

@NgModule({
  exports: [ RouterModule ],
  imports: [ RouterModule.forRoot(routes) ]
})
export class InfrastructureModule { }
