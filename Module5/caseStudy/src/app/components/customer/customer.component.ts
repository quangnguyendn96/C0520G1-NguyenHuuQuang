import {Component, OnInit} from '@angular/core';
import {CustomerService} from "../../services/customer.service";

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {
  public listCustomer;

  constructor(
    public customerService: CustomerService
  ) {
  }

  ngOnInit(): void {
    this.customerService.getAllCustomers().subscribe(date =>
      this.listCustomer = date
    )
  }

}
