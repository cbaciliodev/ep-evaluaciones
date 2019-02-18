import { Injectable } from '@angular/core';
import { Usuario } from 'src/app/model/usuario';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  usuario: Usuario = new Usuario();

  constructor( public router: Router ) { }

  logout() {
    localStorage.removeItem('token');
    localStorage.removeItem('usuario');

    this.usuario = null;
    this.router.navigate( ['/login'] );
  }
}
