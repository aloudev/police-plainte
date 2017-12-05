import { enableProdMode } from '@angular/core';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

import { AppModule } from './app/first-module/app.module';
import { AppSecondModule } from './app/second-module/app.second.module';
import { environment } from './environments/environment';

if (environment.production) {
  enableProdMode();
}

platformBrowserDynamic().bootstrapModule(AppModule);
platformBrowserDynamic().bootstrapModule(AppSecondModule);
	