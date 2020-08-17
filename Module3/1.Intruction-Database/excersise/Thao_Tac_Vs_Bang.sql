drop database if exists buildModule2;
create database buildModule2;
use buildModule2;

create table tablename(
column1 int not null,
column2 int not null,
column3 varchar(255)
);

CREATE TABLE contacts
( contact_id INT(11) NOT NULL AUTO_INCREMENT,
  last_name VARCHAR(30) NOT NULL,
  first_name VARCHAR(25),
  birthday DATE,
  CONSTRAINT contacts_pk PRIMARY KEY (contact_id)
);

CREATE TABLE suppliers
( supplier_id INT(11) NOT NULL AUTO_INCREMENT,
  supplier_name VARCHAR(50) NOT NULL,
  account_rep VARCHAR(30) NOT NULL DEFAULT 'TBD',
  CONSTRAINT suppliers_pk PRIMARY KEY (supplier_id)
);

ALTER TABLE tablename
  ADD new_column_name varchar(40);
ALTER TABLE contacts
  ADD phoneNumber varchar(40) NOT NULL
    AFTER contact_id;
    
alter table tablename
modify column_name varchar(255);

alter table contacts
modify last_name varchar(50) null;




