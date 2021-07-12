import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { AboutComponent } from './navigation-items/about/about.component'
import { MusicComponent } from './navigation-items/music/music.component'
import { ShopComponent } from './navigation-items/shop/shop.component'
import { ShowsComponent } from './navigation-items/shows/shows.component'
import { VideosComponent } from './navigation-items/videos/videos.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './navigation-items/home/home.component';




@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    AboutComponent,
    MusicComponent,
    ShopComponent,
    ShowsComponent,
    VideosComponent,
    FooterComponent,
    HomeComponent,
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
