import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from "rxjs"

@Injectable({
  providedIn: 'root'
})
export class CustomerTypeService {
  private API: string = "http://localhost:3000/typeCustomer";

  constructor(public http: HttpClient) {
  }

  getAll(): Observable<any> {
    return this.http.get(this.API);
  }

}
