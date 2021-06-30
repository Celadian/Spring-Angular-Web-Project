import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { BackgroundComponent } from './background/background.component';
import { ShowsComponent } from './shows/shows.component';
import { AppHamburgerToggleDirective } from './app-hamburger-toggle.directive';
import { HamburgerToggleDirective } from './navbar/hamburger-toggle.directive';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    BackgroundComponent,
    ShowsComponent,
    AppHamburgerToggleDirective,
    HamburgerToggleDirective
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
