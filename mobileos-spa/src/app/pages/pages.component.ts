import { BreakpointObserver } from '@angular/cdk/layout';
import { Component } from '@angular/core';


@Component({
  selector: 'app-pages',
  templateUrl: './pages.component.html',
})
export class PagesComponent {
  constructor(private breakpointObserver: BreakpointObserver) { }
}
