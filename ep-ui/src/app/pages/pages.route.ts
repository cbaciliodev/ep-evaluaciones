import { Routes, RouterModule } from '@angular/router';
import { MainComponent } from './main/main.component';
import { PagesComponent } from './pages.component';

const pagesRoutes: Routes = [
    {
        path: '',
        component: PagesComponent,
        children: [
            { path: 'main', component: MainComponent, data: { title: 'Main', routes: [{ title: 'Main'}] } },
            { path: '', redirectTo: '/main', pathMatch: 'full' }
        ]
    }
];

export const PAGES_ROUTE = RouterModule.forChild(pagesRoutes);
