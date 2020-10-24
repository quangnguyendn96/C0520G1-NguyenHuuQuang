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
	('Ronaldo','ronaldo@gmail.com','Portu'),
	('Quang','quang@gmail.com','Da Nang'),
	('Mai','mai@gmail.com','Da Nag'),
	('Nhat','nhat@gmail.com','Quang Tri'),
	('Hai','hai@gmail.com','Ha Tinh'),
	('Hiep','hiep@gmail.com','Quang Binh');