import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import { AdditionalServicesModel } from '../model/AdditionalServices.model';
import { AccomodationTypeModel } from '../model/AccomodationType.model';
import {CategoryModel} from '../model/Category.model';
import {AgentModel} from '../model/Agent.model';
import {Observable} from 'rxjs/Observable';

@Injectable()
export class AccomodationService {

  private BASE_URL = 'https://localhost:8087/api/accomodation/addServ';
  private BASE_URL_2 = 'https://localhost:8087/api/accomodation/accType';
  private BASE_URL_3 = 'https://localhost:8087/api/accomodation/category';

  constructor(private http: HttpClient) { }


  addNewAdditionalService(service: AdditionalServicesModel) {
    return this.http.post<AdditionalServicesModel[]>(`${this.BASE_URL}/addNewAdditionalService`, service);
  }

  removeAdditionalService(service: AdditionalServicesModel) {
    return this.http.post<AdditionalServicesModel[]>(`${this.BASE_URL}/removeAdditionalService`, service);
  }

  getAdditionalServices() {
    return this.http.get<AdditionalServicesModel[]>(`${this.BASE_URL}/getAdditionalServices`);
  }

  addNewAccomodationType(type: AccomodationTypeModel) {
    return this.http.post<AccomodationTypeModel[]>(`${this.BASE_URL_2}/addNewAccomodationType`, type);
  }

  removeAccomodationType(type: AccomodationTypeModel) {
    return this.http.post<AccomodationTypeModel[]>(`${this.BASE_URL_2}/removeAccomodationType`, type);
  }

  getAccomodationTypes() {
    return this.http.get<AccomodationTypeModel[]>(`${this.BASE_URL_2}/getAccomodationTypes`);
  }

  addNewCategory(type: CategoryModel): Observable<any> {
    return this.http.post<CategoryModel[]>(`${this.BASE_URL_3}/addNewCategory`, type);
  }

  removeCategory(type: CategoryModel) {
    return this.http.post<CategoryModel[]>(`${this.BASE_URL_3}/removeCategory`, type);
  }

  getCategories() {
    return this.http.get<CategoryModel[]>(`${this.BASE_URL_3}/getCategories`);
  }
}
