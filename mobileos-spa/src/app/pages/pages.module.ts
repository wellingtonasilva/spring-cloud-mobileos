import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { LayoutModule } from '../@common/layout/layout.module';
import { MaterialModule } from '../@common/material/material.module';
import { AuthModule } from './@auth/auth.module';
import { HomeModule } from './@home/home.module';
import { DashboardComponent } from './dashboard/dashboard.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { PagesRoutingModule } from './pages-routing.module';
import { PagesComponent } from './pages.component';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    CommonModule,
    RouterModule,
    MaterialModule,
    LayoutModule,
    AuthModule,
    HomeModule,
    PagesRoutingModule,
  ],
  declarations: [
    PagesComponent,
    DashboardComponent,
    NotFoundComponent
  ]
})
export class PagesModule { }
