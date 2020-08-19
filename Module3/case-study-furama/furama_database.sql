drop database if exists furama;
create database furama;
use furama;

 /*create positive */
drop table if exists positive;
create table positive (
	id_positive varchar(50) primary key,
	name_positive varchar(50)
);

 /*create level */
drop table if exists `level`;
create table `level` (
	id_level_employee varchar(50) primary key,
	`level` varchar(50)
);
 /*create devision */
drop table if exists devision;
create table devision (
	id_devision varchar(50) primary key,
	name_devision varchar(50)
    );
/*create table */
drop table if exists employee;
create table employee (
	 id_employee varchar(50) primary key,
	 name_employee varchar(50),
	 id_positive varchar(50) not null unique, 
     foreign key (id_positive) references positive(id_positive),
	 id_level_employee varchar(50) not null unique,
     foreign key (id_level_employee) references `level`(id_level_employee),
	 id_devision varchar(50) not null unique,
     foreign key (id_devision) references devision(id_devision),
	 day_of_birth date,
	 identity_card varchar(50),
	 salary double,
	 phone_number varchar(50),
	 email_employee varchar(50),
	 address_employee varchar(50)
 );
 
 -- table contract
 drop table if exists contract;
create table contract (
	id_contract varchar(50) primary key,
	id_employee varchar(50),
    foreign key (id_employee) references employee(id_employee),
	id_customer varchar(50),
    id_service varchar(50),
    contract_date date,
	contract_expire date,
	deposit_money double,
	total_money double
);

-- table type service 
drop table if exists type_service ;
create table type_service (
	id_type_service varchar(50) primary key,
    name_type_service varchar(50)
);

-- table type rent 
drop table if exists type_rent;
create table type_rent (
	id_type_rent varchar(50) primary key,
	name_type_rent varchar(50),
	price_rent double
);

-- table service
drop table if exists service;
create table service (
	id_service varchar(50) primary key,
    name_service varchar(50),
	area double,
	number_floor int,
	maximum_customer int,
	cost_rent double,
    id_type_service varchar(50),
    foreign key (id_type_service) references type_service(id_type_service),
	id_type_rent varchar(50),
    foreign key (id_type_rent) references type_rent(id_type_rent),
	`status` varchar(50)
);

-- table contract detail
drop table if exists service_included;
create table service_included (
	id_service_included varchar(50) primary key,
	name_service_included varchar(50),
	price double,
	unit int
);

-- table contract detail
drop table if exists contract_detail;
create table contract_detail (
	id_contract_detail varchar(50) primary key,
	id_contract varchar(50),
    foreign key (id_contract) references contract (id_contract),
	id_service_included varchar(50),
    foreign key (id_service_included) references service_included (id_service_included),
    amount double
);


-- type customer 
drop table if exists type_customer;
create table type_customer (
	id_type_customer varchar(50) primary key,
	name_type_customer varchar(50)
);

-- table service customer
drop table if exists customer;
create table customer (
	id_customer varchar(50) primary key,
	id_type_customer varchar(50),
    foreign key (id_type_customer) references type_customer(id_type_customer),
	name_customer varchar(50),
	day_of_birth_customer date,
	identity_card varchar(50),
	phone_customer varchar(50),
	email_customer varchar(50),
	add_customer varchar(50)
);

alter table contract 
 add foreign key (id_customer) references customer(id_customer),
 add foreign key (id_service) references service(id_service);


