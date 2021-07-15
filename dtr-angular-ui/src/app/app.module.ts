import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { AboutComponent } from './navigation-items/about/about.component'
import { MusicComponent } from './navigation-items/music/music.component'
import { ShopComponent } from './navigation-items/shop/shop.component'
import { ShowsComponent } from './navigation-items/shows/shows.component'
import { VideosComponent } from './navigation-items/videos/videos.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './navigation-items/home/home.component';

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms'; 
import {TextFieldModule} from '@angular/cdk/text-field';
import { MatFormFieldModule } from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatButtonModule} from '@angular/material/button';






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
    TextFieldModule,
    MatFormFieldModule,
    MatInputModule,
    BrowserAnimationsModule,
    MatButtonModule,
    FormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { 
}
