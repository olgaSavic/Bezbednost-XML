import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import {MessageComponent} from './messages/message.component';
import {WelcomepageComponent} from './welcomepage/welcomepage.component';
import {AppRoutingModule} from './аpp-routing.module';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { LoginComponent } from './login/login.component';
import {RegistrationComponent} from './registration/registration.component';
import {UserService} from './service/user.service';
import {ReservationService} from './service/reservation.service';
import { ListReservationComponent } from './list-reservation/list-reservation.component';
import {MessageService} from './service/message.service';
import {RatingService} from './service/rating.service';
import {CommentComponent} from './comment/comment.component';
import {RoomRatingComponent} from './roomRating/roomRating.component';
import {SortingPipe} from './welcomepage/sorting.pipe';
import {SerachPipe} from './welcomepage/serach.pipe';


@NgModule({
  declarations: [
    AppComponent,
    WelcomepageComponent,
    MessageComponent,
    LoginComponent,
    RegistrationComponent,
    ListReservationComponent,
    CommentComponent,
    RoomRatingComponent,
    SortingPipe,
SerachPipe,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,

    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,

  ],
  providers: [
    UserService,
    ReservationService,
    MessageService,
    RatingService,
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
