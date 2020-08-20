drop database if exists furama_database;
create database furama_database;
use furama_database;

 /*create positive */
drop table if exists positive;
create table positive (
	id_positive varchar(50) primary key,
	name_positive varchar(50)
);
insert into positive values 
	('01110','director'),
	('01111','manager'),
	('01112','employee'),
	('01113','waiter'),
	('01114','reception'),
	('01115','supervisor'),
	('01116','sanitation_worker'),
	('01117','security_guard');

 /*create level */
drop table if exists `level`;
create table `level` (
	id_level_employee varchar(50) primary key,
	`level` varchar(50)
);
insert into `level` value 
('3001','Postgraduate'),
('3002','University'),
('3003','College'),
('3004','High school'),
('3005','Junior high school');

 /*create devision */
drop table if exists department;
create table department (
	id_department varchar(50) primary key,
	name_department varchar(50)
    );
insert into department values 
('001','operation'),
('002','service'),
('003','administrative'),
('004','marketing-sale'),
('005','part-time');
	
/*create table */
drop table if exists employee;
create table employee (
	 id_employee varchar(50) primary key,
	 name_employee varchar(50),
	 id_positive varchar(50) not null , 
     foreign key (id_positive) references positive(id_positive),
	 id_level_employee varchar(50) not null ,
     foreign key (id_level_employee) references `level`(id_level_employee),
	 id_department varchar(50) not null ,
     foreign key (id_department) references department(id_department),
	 day_of_birth date,
	 identity_card varchar(50),
	 salary double,
	 phone_number varchar(50),
	 email_employee varchar(50),
	 address_employee varchar(50)
 );
 insert into employee value 
 ('000012','Nguyen Huu Quang','01110','3001','001','1996-12-27','201722244','10000','0776797297','quang@gmail.com','Da Nang'),
 ('000025','Nguyen Van Tien','01111','3002','002','1993-02-17','123456123','9000','077777777','tien@gmail.com','Da Nang'),
 ('000532','Kim Soo Huynh','01111','3002','004','1995-06-21','978123456','11221','099999999','huynh@gmail.com','Quang Tri'),
 ('000123','Huynh Kim Van Chuog','01112','3001','005','1988-12-27','141666431','9900','011111111','chuong@gmail.com','Hue'),
 ('000983','Vladimir Putin ','01114','3003','003','1976-12-11','0012134545','1000','011112222','putin@gmail.com','Hue'),
 ('004642','Nguyen Tien Hai','01116','3003','001','1986-12-12','765346852','2000','05555553333','hai@gmail.com','Sai Gon'),
 ('000111','Dang Chi Trung','011116','3002','001','1993-12-15','1903257896','3000','099986543','trung@gmail.com','Da Nang'),
 ('000747','Ho Thi Quynh Mai','01117','3002','002','1995-12-18','124642468','6900','04535321','trump@gmail.com','Sai Gon'),
 ('018237','Donal Trump','01112','3004','004','1976-05-10','1239006553','4500','098567655','mai@gmail.com','Quang Ngau'),
 ('000999','Nguyen Tran Dat','01113','3003','005','1992-03-27','1235570875','1200','09865756','dat@gmail.com','Da Nang'),
 ('011111','Barrack Obama','01116','3004','003','1977-12-12','098763456','7766','0776797297','obama@gmail.com','Quang Tri'),
 ('009989','Le Thi Hao','01117','3005','003','2000-01-22','12908114','6600','0886456345','hao@gmail.com','Ha Noi'),
 ('000775','Emma Watson','01113','3005','002','1999-07-07','15325657435','2321','0234123435','watson@gmail.com','Quang Nam'),
 ('000444','Im Yoon Ah','01114','3005','002','1994-08-09','123657678','15000','07767923497','yoona@gmail.com','Phu Yen'),
 ('000023','Dang Van Truong Hieu','01115','3002','003','1986-11-11','213454546','1213','019230912','hieu@gmail.com','Quang Nam'),
 ('001122','Nguyen Tan Anh Quoc','01112','3003','003','1997-07-11','987098453','4556','0019283192','quoc@gmail.com','Da Nang'),
 ('002233','Dang Thi Hoang Yen','01113','3004','005','1998-08-16','968435123','9977','0123921333','yen@gmail.com','Quang Nam'),
 ('009988','Hoang Thi Hong Hiep','01111','3002','004','1999-04-06','09834212','6757','099283322','hiep@gmail.com','Sai Gon'),
 ('007742','Nguyen Huu Thang','01117','3002','002','1999-12-03','65745213','4444','08823232','thang@gmail.com','Quang Tri'),
 ('000015','Le Nhat','01113','3004','003','1996-09-27','76543523','2332','0623483489','nhat@gmail.com','Hue'),
 ('000099','Maria Ozawa','01115','3005','004','1991-10-23','5466734532','2222','0232313123','ozawa@gmail.com','Da Nang'),
 ('000200','Tran Huu Hien','01116','3003','001','1992-05-22','63563242','7654','0454545454','hien@gmail.com','Da Nang');
 
 -- table contract
 drop table if exists contract;
create table contract (
	id_contract varchar(50) primary key,
	id_employee varchar(50) not null,
    foreign key (id_employee) references employee(id_employee),
	id_customer varchar(50) not null ,
    id_service varchar(50)not null,
    contract_date date not null,
	contract_expire date not null,
	deposit_money double not null,
	total_money double
);
insert into contract value 
('7007','000983','45564751','444','2020-08-10','2020-09-10',1000,4000),
('7012','000123','45561234','444','2020-09-07','2020-10-30',2000,6000),
('7661','000123','49876542','111','2020-08-05','2020-08-10',1500,5000),
('7992','000025','41111111','111','2020-10-12','2020-11-10',3000,4000),
('7008','000983','42233455','222','2020-10-15','2020-12-11',1000,4000),
('7033','001122','44566666','333','2020-12-05','2021-01-05',1500,5000),
('7023','001122','49767657','444','2020-11-23','2021-09-23',1000,4000),
('7223','000025','46554444','666','2020-11-09','2020-09-09',1500,5000),
('7111','000444','42234555','555','2020-12-10','2021-01-10',2000,6000),
('7015','000444','48877799','333','2020-09-04','2020-10-04',1000,4000),
('7044','000444','44564564','111','2020-08-25','2020-09-25',2000,6000),
('7009','000532','49879877','111','2020-09-10','2020-09-25',3000,4000),
('7542','000532','47567567','444','2020-10-22','2020-12-22',1500,4000),
('7983','009988','47565677','555','2020-09-20','2020-09-30',1000,5500),
('7777','009988','40101110','666','2020-12-10','2020-12-15',1500,5000);

-- table type service 
drop table if exists type_service ;
create table type_service (
	id_type_service varchar(50) primary key,
    name_type_service varchar(50)
);
insert into type_service value 
('001','Combo1'),
('002','Combo2'),
('003','Combo3'),
('004','Combo4'),
('005','Combo5'),
('006','Combo6');

-- table type rent 
drop table if exists type_rent;
create table type_rent (
	id_type_rent varchar(50) primary key,
	name_type_rent varchar(50),
	price_rent double
);
insert into type_rent value 
('100','hour','20'),
('101','day','200'),
('102','month','6000'),
('103','year','20000');

-- table service
drop table if exists service;
create table service (
	id_service varchar(50),
    name_service varchar(50),
	area double not null,
	number_floor int,
	maximum_customer int not null,
	cost_rent double,
    id_type_service varchar(50),
    foreign key (id_type_service) references type_service(id_type_service),
	id_type_rent varchar(50),
    foreign key (id_type_rent) references type_rent(id_type_rent),
	`status` varchar(50),
    primary key(id_service,id_type_rent)
);
insert into service value 
('011','villa',200,2,10,5000,'001','101','available'),
('011','villa',200,2,8,5000,'001','100','available'),
('012','villa',400,3,8,8000,'001','101','unavailable'),
('013','villa',150,2,10,4000,'002','102','available'),
('021','house',200,3,10,4000,'001','100','unavailable'),
('022','house',100,3,4,3000,'002','102','available'),
('022','house',100,3,8,83000,'002','101','available'),
('024','house',250,3,8,5000,'001','100','available'),
('031','room',100,3,8,5000,'001','103','unavailable'),
('033','room',70,3,6,5000,'001','102','unavailable'),
('033','room',70,3,4,2000,'001','100','available'),
('034','room',120,3,2,2000,'001','101','available'),
('035','room',90,3,20,3000,'001','102','available');

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


