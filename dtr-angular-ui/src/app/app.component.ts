import { Component, Inject } from '@angular/core';
import { DOCUMENT } from '@angular/common'; 
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  //0-home: 1-shows: 2-about: 3-music: 4-videos: 5-shop
  // private navIndex = 0;
  title = 'dtr-angular-ui';

  constructor(@Inject(DOCUMENT) document: any){
    window.addEventListener('wheel', function(event){
      if (event.deltaY < 0){
        console.log('scrolling up');
        // document.getElementById('status').textContent= 'scrolling up';
      } else if (event.deltaY > 0) {
        console.log('scrolling down');
        // document.getElementById('status').textContent= 'scrolling down';
      }
    });
  }
}
