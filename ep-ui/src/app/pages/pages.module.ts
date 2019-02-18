import { NgModule } from '@angular/core';
import { PAGES_ROUTE } from './pages.route';
import { MainComponent } from './main/main.component';

@NgModule({
    declarations: [ MainComponent ],
    exports: [ MainComponent ],
    imports: [ PAGES_ROUTE ]
})
export class PagesModule {}
