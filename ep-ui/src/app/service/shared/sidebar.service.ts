import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SidebarService {

  menu: any[] = [
    { titulo: 'Inicio', icono: 'mdi mdi-home-outline',  url: '/main' },
    {
      titulo: 'Gestión',
      icono: 'mdi mdi-gauge',
      submenu: [
        { titulo: 'Evaluaciones', url: '/evaluaciones' },
        { titulo: 'Resultados', url: '/resultado' }
      ]
    }
  ];

  constructor() {}
}
