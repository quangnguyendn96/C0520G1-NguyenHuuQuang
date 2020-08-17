drop database if exists designDatabase;
create database designDatabase; 
use designDatabase;


create table products(
	name_products varchar(70) not null,
	manufacture varchar(50) not null,
	number_of_product int not null,
	import_price double not null,
	selling_price double not null,
	code_products varchar(15) primary key,
	product_line varchar(50)
);

create table customers(
	code_customer int not null unique,
	name_customer varchar(50) not null,
	phone_customer varchar(50) not null,
	addres_customer varchar(50) not null
);

create table productline(
	code_products varchar(50) not null unique,
	decription text
);

create table orders(
	order_number int not null unique,
	purchasing_day date not null,
	delivery_day date not null,
	delivery_day_fact date not null,
	quantity_ordered int not null,
	unit_price double not null,
	customer_number int,
	foreign key (customer_number) references customers(code_customer)
);

create table order_details(
	order_number int,foreign key (order_number) references orders(order_number),
	product_code varchar(15),foreign key (product_code) references products(code_products)
);

create table employee(
	id_employee varchar(10) primary key,
	name_employee varchar(50) not null,
	email varchar(100) not null,
	positive varchar(50) not null
);

create table employees(
	report_to varchar(10),foreign key (office_code) references employee(id_employee),
	office_code varchar(10)
);

create table offices(
	office_code varchar(10) not null unique,
	address_office varchar(255),
	phone varchar(50) not null,
	city varchar(50) not null,
	nation varchar(50) not null
);

create table payments(
	customer_numbers int, foreign key (customer_numbers) references customers(code_customer),
	check_number varchar(50),
	payment_date date not null,
	amount double not null
);

alter table products
add foreign key (product_line) references productline(code_products);

alter table employees
add foreign key (office_code) references offices(office_code);