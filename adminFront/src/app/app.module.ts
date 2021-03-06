import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { WelcomePageComponent } from './welcome-page/welcome-page.component';
import {AppRoutingModule} from './app-routing.module';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { LoginComponent } from './login/login.component';
import { AddAgentComponent } from './add-agent/add-agent.component';
import {AddCategoryComponent} from './add-category/add-category.component';
import {AddAccommodationTypeComponent} from './add-accommodationType/add-accommodationType.component';
import {AddAdditionalServiceComponent} from './add-additionalService/add-additionalService.component';
import { HomeComponent } from './home/home.component';
import { ProfileComponent } from './profile/profile.component';
import { ListAgentComponent } from './list-agent/list-agent.component';
import { ListUserComponent } from './list-user/list-user.component';
import {AdminService} from './service/admin.service';
import {ListCategoryComponent} from './list-category/list-category.component';
import {AccomodationService} from './service/accomodationService.service';
import {RatingComponent} from './rating/rating.component';
import {RatingService} from './service/rating.service';



@NgModule({
  declarations: [
    AppComponent,
    WelcomePageComponent,
    LoginComponent,
    AddAgentComponent,
    AddCategoryComponent,
    AddAccommodationTypeComponent,
    AddAdditionalServiceComponent,
    HomeComponent,
    ProfileComponent,
    ListAgentComponent,
    ListUserComponent,
    ListCategoryComponent,
    RatingComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,

    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [AdminService, AccomodationService, RatingService],
  bootstrap: [AppComponent]
})
export class AppModule { }
