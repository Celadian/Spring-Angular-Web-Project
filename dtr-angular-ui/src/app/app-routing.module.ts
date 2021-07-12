import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './navigation-items/about/about.component'
import { HomeComponent } from './navigation-items/home/home.component';
import { MusicComponent } from './navigation-items/music/music.component'
import { ShopComponent } from './navigation-items/shop/shop.component'
import { ShowsComponent } from './navigation-items/shows/shows.component'
import { VideosComponent } from './navigation-items/videos/videos.component';

const routes: Routes = [
  {path: 'about', component: AboutComponent},
  {path: 'music', component: MusicComponent},
  {path: 'shop', component: ShopComponent},
  {path: 'shows', component: ShowsComponent},
  {path: 'videos', component: VideosComponent},
  {path: 'home', component: HomeComponent},
  {path: '', component:HomeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
 }
