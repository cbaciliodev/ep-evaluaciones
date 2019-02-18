import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';

import { SidebarService } from 'src/app/service/service.index';
import { UsuarioService } from './bussiness/usuario.service';

@NgModule({
  imports: [ CommonModule, HttpClientModule ],
  declarations: [],
  providers: [ SidebarService, UsuarioService ]
})
export class ServiceModule { }
