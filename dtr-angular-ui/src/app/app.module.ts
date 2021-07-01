import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { BackgroundComponent } from './background/background.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { AboutComponent } from './background-items/about/about.component'
import { MusicComponent } from './background-items/music/music.component'
import { ShopComponent } from './background-items/shop/shop.component'
import { ShowsComponent } from './background-items/shows/shows.component'
import { VideosComponent } from './background-items/videos/videos.component'




@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    BackgroundComponent,
    AboutComponent,
    MusicComponent,
    ShopComponent,
    ShowsComponent,
    VideosComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
