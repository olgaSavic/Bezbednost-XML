import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Injectable} from '@angular/core';
import {Observable} from 'rxjs/Observable';


const httpOptions = {
  headers: new HttpHeaders({'Content-Type': 'application/json'}),
};
@Injectable()
export  class RatingService {
  private BASE_URL = 'https://localhost:8099/api/room';

  constructor(private http: HttpClient) {

  }

  getAverageRating(idRoom: any): Observable<any> {
    const token = localStorage.getItem('agentId');
    const headers = new HttpHeaders({'Content-Type': 'application/json', 'token': token});
    return this.http.get(`${this.BASE_URL}/getAverageRating/${idRoom}`, {headers: headers});
  }

  getListOfRating(idRoom: any): Observable<any> {
    const token = localStorage.getItem('agentId');
    const headers = new HttpHeaders({'Content-Type': 'application/json', 'token': token});
    return this.http.get(`${this.BASE_URL}/getListOfRating/${idRoom}`, {headers: headers});
  }
}
