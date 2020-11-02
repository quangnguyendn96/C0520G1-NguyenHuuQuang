import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs'

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  public API: string = " http://localhost:3000/employee";

  constructor(
    public http: HttpClient
  ) {
  }

  getAllEmployees(): Observable<any> {
    return this.http.get(this.API);
  }

  addNewEmployee(employee): Observable<any> {
    return this.http.post(this.API, employee);
  }

  editEmployee(employee, id): Observable<any> {
    return this.http.put(this.API + '/' + id, employee)
  };

  getEmployeeById(id): Observable<any> {
    return this.http.get(this.API + '/' + id);
  }

  deleteEmployee(id): Observable<any> {
    return this.http.delete(this.API + '/' + id);
  }
}
