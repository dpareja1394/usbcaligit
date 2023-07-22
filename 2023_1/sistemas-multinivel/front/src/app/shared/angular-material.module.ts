import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { MatTableModule } from '@angular/material/table';
import { MatMenuModule } from '@angular/material/menu';
import { MatIconModule } from '@angular/material/icon';

import { MatInputModule } from '@angular/material/input';
import { MatGridListModule } from '@angular/material/grid-list';
import { MatButtonModule } from '@angular/material/button';

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    MatTableModule,
    MatMenuModule,
    MatIconModule,
    MatInputModule,
    MatGridListModule,
    MatButtonModule
  ],
  exports: [
    MatTableModule,
    MatMenuModule,
    MatIconModule,
    MatInputModule,
    MatGridListModule,
    MatButtonModule
  ]
})
export class AngularMaterialModule { }
