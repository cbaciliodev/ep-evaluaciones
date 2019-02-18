import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';

import { APP_ROUTE } from './app.routes';
import { NotFoundComponent } from './error-pages/not-found/not-found.component';
import { SidebarComponent } from './component/shared/sidebar/sidebar.component';
import { ServiceModule } from './service/service.module';
import { PagesComponent } from './pages/pages.component';
import { HeaderComponent } from './component/shared/header/header.component';
import { BreadcrumbsComponent } from './component/shared/breadcrumbs/breadcrumbs.component';
import { PagesModule } from './pages/pages.module';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    NotFoundComponent,
    SidebarComponent,
    PagesComponent,
    HeaderComponent,
    BreadcrumbsComponent
  ],
  imports: [
    BrowserModule,
    ServiceModule,
    PagesModule,
    APP_ROUTE
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
