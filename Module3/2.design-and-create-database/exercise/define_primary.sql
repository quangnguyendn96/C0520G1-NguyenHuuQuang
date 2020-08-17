drop database if exists bank;
create database bank;
use bank;

create table Customers(
customer_number varchar(50),
fullname varchar(50),
address varchar(100),
email varchar(50),
phone varchar(11)
);

create table Accounts(
account_number varchar(50),
account_type varchar(50) NOT NULL,
date varchar(50) NOT NULL,
balance double
);

create table Transactions(
tran_number varchar(50),
account_number varchar(50),
date varchar(50),
amounts double,
descriptions varchar(50)
);

alter table Customers
add primary key (customer_number);

alter table Accounts
add primary key (account_number),
add customer_number varchar(50),
add FOREIGN KEY (customer_number) references Customers(customer_number);

alter table Transactions
add primary key (tran_number),
add FOREIGN KEY (account_number) references Accounts(account_number);



