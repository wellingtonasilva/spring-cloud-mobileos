import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { 
  MatIconModule, 
  MatButtonModule, 
  MatSidenavModule,
  MatToolbarModule,
  MatDialogModule,
  MatProgressSpinnerModule,
  MatSelectModule,
  MatTableModule,
  MatPaginatorModule,
  MatTabsModule,
  MatInputModule,
  MatListModule,
} from '@angular/material';


@NgModule({
  imports: [
    CommonModule,
    MatIconModule, 
    MatInputModule,
    MatButtonModule, 
    MatSidenavModule,
    MatToolbarModule,
    MatDialogModule,
    MatProgressSpinnerModule,
    MatSelectModule,
    MatTableModule,
    MatPaginatorModule,
    MatTabsModule,
    MatListModule
  ],
  exports: [
    MatIconModule,
    MatInputModule, 
    MatButtonModule, 
    MatSidenavModule,
    MatToolbarModule,
    MatDialogModule,
    MatProgressSpinnerModule,
    MatSelectModule,
    MatTableModule,
    MatPaginatorModule,
    MatTabsModule,
    MatListModule
  ]
})
export class MaterialModule { }
