import { Component, OnInit } from '@angular/core';

declare function init_plugins();

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: [ ]
})
export class AppComponent implements OnInit {

  ngOnInit() {
    init_plugins();
  }

}
