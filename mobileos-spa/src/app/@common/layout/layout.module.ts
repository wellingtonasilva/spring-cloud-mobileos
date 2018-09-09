import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { MaterialModule } from '../material/material.module';
import { FooterComponent } from './footer/footer.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { SideMenuComponent } from './side-menu/side-menu.component';

@NgModule({
  imports: [
    CommonModule,
    MaterialModule
  ],
  declarations: [
    NavBarComponent,
    SideMenuComponent,
    FooterComponent
  ],
  exports:[
    NavBarComponent,
    SideMenuComponent,
    FooterComponent
  ]
})
export class LayoutModule { }
