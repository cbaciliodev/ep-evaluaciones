import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { NotFoundComponent } from './error-pages/not-found/not-found.component';

const appRoutes: Routes = [
    { path: 'login', component: LoginComponent },
    { path: '**', component: NotFoundComponent }
];

export const APP_ROUTE = RouterModule.forRoot( appRoutes, { useHash: true } );
