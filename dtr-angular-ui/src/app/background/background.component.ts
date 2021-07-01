import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AboutComponent } from '../background-items/about/about.component'
import { MusicComponent } from '../background-items/music/music.component'
import { ShopComponent } from '../background-items/shop/shop.component'
import { ShowsComponent } from '../background-items/shows/shows.component'
import { VideosComponent } from '../background-items/videos/videos.component'

@Component({
  selector: 'app-background',
  templateUrl: './background.component.html',
  styleUrls: ['./background.component.css']
})
export class BackgroundComponent implements OnInit {
  //home = 0 shows = 1 about = 2 music = 3 videos = 4 shop = 5
  @Input() navItemSelected = 0;

  constructor() { }

  ngOnInit(): void {
  }

  public setNavItemSelected(navId: number){
    this.navItemSelected = navId;

  }

  
}
