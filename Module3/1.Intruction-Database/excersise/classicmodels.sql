use classicmodels;

select * from customers;
update customers 
set customerName = 'Quang',
phone = '0776797297'
where customerNumber = 169;
delete from customers where customerNumber = 157;
select customerName, phone, city, country FROM customers;
SELECT * FROM customers WHERE city IN ('Nantes',' Las Vegas',' Warszawa','NYC') ;
SELECT * FROM customers WHERE customername like '%A%';

select * from customers where customerNumber = 112;