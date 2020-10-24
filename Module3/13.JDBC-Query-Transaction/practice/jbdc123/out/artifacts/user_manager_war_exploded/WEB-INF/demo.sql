drop database if exists demo;
create database demo;
use demo;

create table users (
	 id int auto_increment,
	 name varchar(120) NOT NULL,
	 email varchar(220) NOT NULL,
	 country varchar(120),
	 PRIMARY KEY (id)
 );
 
 insert into users(name, email, country) value
	('Minh','Minhdu@gmail.com','Viet Nam'),
	('Kante','kante@che.uk','Kenia'),
	('Messi','messi@gmail.com','Aghen'),
	('Ronaldo','ronaldo@gmail.com','Portu');