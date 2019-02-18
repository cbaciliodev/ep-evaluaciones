import { Component, OnInit } from '@angular/core';
import { Router, ActivationEnd } from '@angular/router';
import { filter, map } from 'rxjs/operators';

@Component({
  selector: 'app-breadcrumbs',
  templateUrl: './breadcrumbs.component.html',
  styles: []
})
export class BreadcrumbsComponent implements OnInit {
  pageRoute: any;

  constructor(private router: Router) {
    this.router.events
      .pipe(
        // Obtener la data del route, es necesario que sea en el evento ActivationEnd y el firstchild sea nulo
        filter(
          (evento: ActivationEnd) =>
            typeof evento.snapshot !== 'undefined' &&
            evento.snapshot.firstChild === null
        ),

        // Para pasar solo la data del filtro anterior, se debe usar el evento map
        map((event: ActivationEnd) => event.snapshot.data)
      )
      .subscribe(data => {
        this.pageRoute = data;
      });
  }

  ngOnInit() {}
}
