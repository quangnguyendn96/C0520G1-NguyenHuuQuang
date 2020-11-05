import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from "rxjs"

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  private API: string = "http://localhost:3000/customer";
  private API_FOREIGN: string = "http://localhost:3000/typeCustomer";

  constructor(public http: HttpClient) {
  }

  getAll(): Observable<any> {
    return this.http.get(this.API);
  }

  getAllForeign(): Observable<any> {
    return this.http.get(this.API_FOREIGN);
  }

  addNew(el): Observable<any> {
    return this.http.post(this.API, el);
  }

  edit(el, id): Observable<any> {
    return this.http.put(this.API + '/' + id, el)
  };

  getById(id): Observable<any> {
    return this.http.get(this.API + '/' + id);
  }

  delete(id): Observable<any> {
    return this.http.delete(this.API + '/' + id);
  }
}
