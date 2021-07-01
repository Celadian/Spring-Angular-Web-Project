import { Component, EventEmitter, OnDestroy, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit, OnDestroy{
  public isCollapsed = false;
  public navItem = 0;

  constructor() { }

  ngOnInit(): void {
  }

  ngOnDestroy(): void {
    console.log("destroyed");
  }

  public showMenu(){
    this.isCollapsed = true;
  }
  
  public changeBackground(navId: number){
    this.navItem = navId;
  }

}
