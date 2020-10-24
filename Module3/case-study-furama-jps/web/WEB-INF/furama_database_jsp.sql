drop database if exists furama_database_jsp;
create database furama_database_jsp;
use furama_database_jsp;

 /*tạo bảng lưu thông tin vị trí với id 5 số bắt đầu bằng 01 */
drop table if exists positive;
create table positive (
	id_positive varchar(50) primary key,
	name_positive varchar(45)
);
insert into positive values 
	('1','director'),
	('2','manager'),
	('3','employee'),
	('4','waiter'),
	('5','reception'),
	('6','supervisor'),
	('7','sanitation_worker'),
	('8','security_guard');

 /*tạo bảng trình độ nhân viên với id có 4 số bắt đầu bằng 3 */
drop table if exists education_degree;
create table education_degree (
	id_degree_education varchar(50) primary key,
	education_degree_name varchar(45)
);
insert into education_degree value 
('1','Postgraduate'),
('2','University'),
('3','College'),
('4','High school'),
('5','Junior high school');

 /*tạo bảng tên các bộ phận của resort với id có 3 số bắt đầu bằng 0 */
drop table if exists division;
create table division (
	id_division varchar(50) primary key,
	name_division varchar(45)
    );
/*thêm thông in vào bảng bộ phận*/
insert into division values 
('1','operation'),
('2','service'),
('3','administrative'),
('4','marketing-sale'),
('5','part-time');


drop table if exists `role`;
create table `role` (
	id_role varchar(50) primary key,
	`name_role` varchar(255) not null
);
insert into `role` value 
(1,"role1"),
(2,"role2"),
(3,"role3"),
(4,"role4"),
(5,"role5"),
(6,"role6"),
(7,"role7");
/**/
drop table if exists user_role;
create table user_role (
	id_role varchar(50),
	username varchar(255) not null,
	primary key(id_role,username)
);
insert into user_role value 
("1","quang"),
("1","tien"),
("1","huynh"),
("2","chuong"),
("2","putin"),
("3","hai"),
("3","trung"),
("7","mai"),
("4","trump"),
("5","obama"),
("7","hao"),
("7","waston");



/*tạo bảng lưu thông tin của nhân viên với id có 6 số */
drop table if exists employee;
create table employee (
	 id_employee varchar(50) primary key,
	 name_employee varchar(45),
	 id_positive varchar(50) not null , 
     foreign key (id_positive) references positive(id_positive)
     on delete cascade
     on update cascade,
	 id_degree_education varchar(50) not null ,
     foreign key (id_degree_education) references education_degree(id_degree_education)
     on delete cascade
     on update cascade,
	 id_division varchar(50) not null ,
     foreign key (id_division) references division(id_division)
     on delete cascade
     on update cascade,
	 day_of_birth date,
	 identity_card_employee varchar(50),
	 salary double,
	 phone_number varchar(50),
	 email_employee varchar(50),
	 address_employee varchar(50),
     username varchar(255) not null unique
 );

 
 /*Tạo bảng lưu thông tin hợp đồng giữa nhân viên và khách hàng*/
 drop table if exists contract;
create table contract (
	id_contract varchar(50) primary key,
	id_employee varchar(50) not null,
    foreign key (id_employee) references employee(id_employee)
    on delete cascade
	on update cascade,
	id_customer varchar(50) not null,
    id_service varchar(50) not null,
    contract_date date not null,
	contract_expire date not null,
	deposit_money double not null,
	total_money double
);

/*Tạo bảng lưu thông tin loại dịch vụ*/
drop table if exists type_service ;
create table type_service (
	id_type_servicess varchar(50) primary key,
    name_type_service varchar(50)
);
insert into type_service value 
('1','Combo1'),
('2','Combo2'),
('3','Combo3'),
('4','Combo4'),
('5','Combo5'),
('6','Combo6');

/*Tạo bảng lưu thông tin các loại kiểu thuê của resort*/
drop table if exists type_rent;
create table type_rent (
	id_type_rent varchar(50) primary key,
	name_type_rent varchar(50),
	price_rent double
);
insert into type_rent value 
('1','hour','20'),
('2','day','200'),
('3','month','6000'),
('4','year','20000');

/*Tạo bảng lưu thông tin loại dịch vụ đang có trong resort*/
drop table if exists service;
create table service (
	id_service varchar(50),
    name_service varchar(50),
	area_service double not null,
	number_floor int,
	maximum_customer int not null,
	cost_rent double,
    id_type_service varchar(50),
    foreign key (id_type_service) references type_service(id_type_servicess)
    on delete cascade
	on update cascade,
	id_type_rent varchar(50),
    foreign key (id_type_rent) references type_rent(id_type_rent)
    on delete cascade
	on update cascade,
	description_other_convenience varchar(50),
    primary key(id_service),
    pool_area double,
    standard_room varchar(45)
);
/*Thêm thông tin vào bảng dịch vụ đang có*/
insert into services(id_service,name_service,area_service,number_floor,maximum_customer,cost_rent,
  id_type_service,id_type_rent,description_other_convenience,pool_area,standard_room) value 
-- ('0001','villa',200,2,10,5000,'1','2','available','100','comfor'),
-- ('0002','villa',200,2,8,5000,'1','1','available','200','comfor'),
-- ('0003','villa',400,3,8,8000,'1','2','unavailable','200','comfor'),
-- ('0004','villa',150,2,10,4000,'2','3','available','200','comfor'),
-- ('0005','house',200,3,10,4000,'1','1','unavailable','100','comfor'),
-- ('0006','house',100,3,4,3000,'2','2','available','200','comfor'),
-- ('0007','house',100,3,8,83000,'2','1','available','200','comfor'),
-- ('0008','house',250,3,8,5000,'1','1','available','100','comfor'),
-- ('0009','room',100,3,8,5000,'1','4','unavailable','100','comfor'),
-- ('0010','room',70,3,6,5000,'1','4','unavailable','300','comfor'),
-- ('0011','room',70,3,4,2000,'1','4','available','300','comfor'),
-- ('0012','room',120,3,2,2000,'1','1','available','200','comfor'),
-- ('0013','room',90,3,20,3000,'1','2','available','100','comfor'),
-- ('0014','room',150,1,4,5000,'2','2','available','150','comfor');
  
('DV-0001','villa',200,2,10,5000,'1','2','available','100','comfor'),
('DV-0002','villa',200,2,8,5000,'1','1','available','200','comfor'),
('DV-0003','villa',400,3,8,8000,'1','2','unavailable','200','comfor'),
('DV-0004','villa',150,2,10,4000,'2','3','available','200','comfor'),
('DV-0005','house',200,3,10,4000,'1','1','unavailable','100','comfor'),
('DV-0006','house',100,3,4,3000,'2','2','available','200','comfor'),
('DV-0007','house',100,3,8,83000,'2','1','available','200','comfor'),
('DV-0008','house',250,3,8,5000,'1','1','available','100','comfor'),
('DV-0009','room',100,3,8,5000,'1','4','unavailable','100','comfor'),
('DV-0010','room',70,3,6,5000,'1','4','unavailable','300','comfor'),
('DV-0011','room',70,3,4,2000,'1','4','available','300','comfor'),
('DV-0012','room',120,3,2,2000,'1','1','available','200','comfor'),
('DV-0013','room',90,3,20,3000,'1','2','available','100','comfor');

/*Tạo bảng lưu thông tin các loại dịch vụ đính kèm*/

drop table if exists service_included;
create table service_included (
	id_service_included varchar(50) primary key,
	name_service_included varchar(50),
	price double,
	unit int
);
insert into service_included 
value ('1','massage, karaoke',50,1),
	  ('2','massage, karaoke,food,beverage',100,2),
      ('3','food, beverage',40,2),
	  ('4','massage, karaoke, food, beverage, car',150,1);

/*Tạo bảng lưu chi tiết cụ thể các bản hợp đồng thuê đang có*/
drop table if exists contract_detail;
create table contract_detail (
	id_contract_detail varchar(50) primary key,
	id_contract varchar(50) not null,
    foreign key (id_contract) references contract (id_contract)
    on delete cascade
	on update cascade,
	id_service_included varchar(50),
    foreign key (id_service_included) references service_included (id_service_included)
    on delete cascade
	on update cascade,
    amount double default 5
);

/*Lưu trữ thông tin bản hợp đồng chi tiết đang có*/
/*Tạo bảng lưu danh sách các loại khách hàng đang có*/
drop table if exists type_customer;
create table type_customer (
	id_type_customer varchar(50) primary key,
	name_type_customer varchar(50)
);
insert into type_customer values
('1','Diamond'),
('2','Plantinium'),
('3','Gold'),
('4','Silver'),
('5','Member');

/*Tạo bảng lưu thông tin khách hàng đang có*/
drop table if exists customer;
create table customer (
	id_customer varchar(50) primary key,
	id_type_customer varchar(50),
    foreign key (id_type_customer) references type_customer(id_type_customer)
    on update cascade
    on delete cascade,
	name_customer varchar(50),
	day_of_birth_customer date,
    gender_customer BIT(1),
	identity_card varchar(50),
	phone_customer varchar(50),
	email_customer varchar(50),
	add_customer varchar(50)
);
insert into customer(id_customer,id_type_customer,name_customer,
day_of_birth_customer,gender_customer,identity_card,phone_customer,email_customer,add_customer) value 
-- ('0001','1','Messi','1980-10-11',0,'201943212','0999111111','messi@gmail.com','Vinh'),
-- ('0002','1','Ronaldo','1981-10-12',0,'201943212','0999111112','Ronaldo@gmail.com','Quảng Ngãi'),
-- ('0003','2','Yui Hatano','1982-10-13',1,'201943212','0999111311','Hatano@gmail.com','Da Nang'),
-- ('0004','1','Megu Fujiura','1990-10-14',1,'201943212','0999141111','Fujiura@gmail.com','Quảng Ngãi'),
-- ('0005','3','Rola Misaki','1991-10-15',1,'201943212','0999115111','Misaki@gmail.com','japan'),
-- ('0006','5','Ameri Ichinose','1976-10-15',1,'201943212','0991111111','Misaki@gmail.com','Da Nang'),
-- ('0007','1','Yoshizawa Akiho','1978-10-16',1,'201943212','0929111111','Akiho@gmail.com','China'),
-- ('0008','2','Risa Tachibana','1999-10-17',1,'201943212','0993111111','Tachibana@gmail.com','Vinh'),
-- ('0009','4','Tsubasa Amami','1980-10-18',1,'201943212','0994111111','Amami@gmail.com','China'),
-- ('0010','4','Erika Momotani ','1993-10-19',1,'201943212','0999111171','Momotani@gmail.com','japan'),
-- ('0011','1','Yua Mikami','1975-10-20',1,'201943212','0999111119','Mikami@gmail.com','Da Nang'),
-- ('0012','5','Jun Aizawa','1974-10-21',1,'201943212','0999111118','Aizawa@gmail.com','Quang Tri'),
-- ('0013','2','Eimi Fukada','1968-10-22',1,'201943212','0999111116','Fukada@gmail.com','Quang Tri'),
-- ('0014','2','Sora Aoi','1999-10-23',1,'201943212','0999111156','Aoi@gmail.com','China'),
-- ('0015','3','Rina Ishihara','1991-10-24',1,'201943212','0999111441','Ishihara@gmail.com','Quang Tri'),
-- ('0016','3','Sona','1991-10-24',1,'201943212','0999111441','sona@gmail.com','Da Nang ');

('KH-0001','1','Messi','1980-10-11',0,'201943212','0999111111','messi@gmail.com','Vinh'),
('KH-0002','1','Ronaldo','1981-10-12',0,'201943212','0999111112','Ronaldo@gmail.com','Quảng Ngãi'),
('KH-0003','2','Yui Hatano','1982-10-13',1,'201943212','0999111311','Hatano@gmail.com','Da Nang'),
('KH-0004','1','Megu Fujiura','1990-10-14',1,'201943212','0999141111','Fujiura@gmail.com','Quảng Ngãi'),
('KH-0005','3','Rola Misaki','1991-10-15',1,'201943212','0999115111','Misaki@gmail.com','japan'),
('KH-0006','5','Ameri Ichinose','1976-10-15',1,'201943212','0991111111','Misaki@gmail.com','Da Nang'),
('KH-0007','1','Yoshizawa Akiho','1978-10-16',1,'201943212','0929111111','Akiho@gmail.com','China'),
('KH-0008','2','Risa Tachibana','1999-10-17',1,'201943212','0993111111','Tachibana@gmail.com','Vinh'),
('KH-0009','4','Tsubasa Amami','1980-10-18',1,'201943212','0994111111','Amami@gmail.com','China'),
('KH-0010','4','Erika Momotani ','1993-10-19',1,'201943212','0999111171','Momotani@gmail.com','japan'),
('KH-0011','1','Yua Mikami','1975-10-20',1,'201943212','0999111119','Mikami@gmail.com','Da Nang'),
('KH-0012','5','Jun Aizawa','1974-10-21',1,'201943212','0999111118','Aizawa@gmail.com','Quang Tri'),
('KH-0013','2','Eimi Fukada','1968-10-22',1,'201943212','0999111116','Fukada@gmail.com','Quang Tri'),
('KH-0014','2','Sora Aoi','1999-10-23',1,'201943212','0999111156','Aoi@gmail.com','China'),
('KH-0015','3','Rina Ishihara','1991-10-24',1,'201943212','0999111441','Ishihara@gmail.com','Quang Tri'),
('KH-0016','3','Rina Ishihara','1991-10-24',1,'201943212','0999111441','Ishihara@gmail.com','Quang Tri');


/*Chỉnh sửa bảng hợp đồng*/
alter table contract 
 add foreign key (id_customer) references customer(id_customer)
 on delete cascade
 on update cascade,
 add foreign key (id_service) references service(id_service)
 on delete cascade
 on update cascade;
 -- alter table customer
 -- change column 
 /*Thêm thông tin nhân viên*/
  insert into employee(id_employee,name_employee,id_positive,id_education_degree,id_division,day_of_birth,identity_card_employee,salary,phone_number,email_employee,address_employee,username) value 
 ('1','Nguyen Huu Quang','1','1','1','1996-12-27','201722244','10000','0776797297','quang@gmail.com','Da Nang','quang'),
 ('2','Nguyen Van Tien','2','2','2','1993-02-17','123456123','9000','077777777','tien@gmail.com','Da Nang','tien'),
 ('3','Kim Soo Huynh','2','2','4','1995-06-21','978123456','11221','099999999','huynh@gmail.com','Quang Tri','huynh'),
 ('4','Huynh Kim Van Chuog','3','1','5','1988-12-27','141666431','9900','011111111','chuong@gmail.com','Hue','chuong'),
 ('5','Vladimir Putin ','5','3','3','1976-12-11','0012134545','1000','011112222','putin@gmail.com','Hue','putin'),
 ('6','Nguyen Tien Hai','7','3','1','1986-12-12','765346852','2000','05555553333','hai@gmail.com','Sai Gon','hai'),
 ('7','Dang Chi Trung','7','2','1','1993-12-15','1903257896','3000','099986543','trung@gmail.com','Da Nang','trung'),
 ('8','Ho Thi Quynh Mai','8','2','2','1995-12-18','124642468','6900','04535321','trump@gmail.com','Sai Gon','mai'),
 ('9','Donal Trump','3','4','4','1976-05-10','1239006553','4500','098567655','mai@gmail.com','Quang Ngai','trump'),
 ('10','Nguyen Tran Dat','4','4','5','1992-03-27','1235570875','1200','09865756','dat@gmail.com','Da Nang','dat'),
 ('11','Barrack Obama','7','3','3','1977-12-12','098763456','7766','0776797297','obama@gmail.com','Quang Tri','obama'),
 ('12','Le Thi Hao','8','4','3','2000-01-22','12908114','6600','0886456345','hao@gmail.com','Ha Noi','hao'),
 ('13','Emma Watson','4','5','2','1999-07-07','15325657435','2321','0234123435','watson@gmail.com','Quang Nam','waston'),
 ('14','Im Yoon Ah','5','5','2','1994-08-09','123657678','15000','07767923497','yoona@gmail.com','Phu Yen','yoonah'),
 ('15','Dang Van Truong Hieu','5','2','3','1986-11-11','213454546','1213','019230912','hieu@gmail.com','Quang Nam','hieu'),
 ('16','Nguyen Tan Anh Quoc','2','3','3','1997-07-11','987098453','4556','0019283192','quoc@gmail.com','Da Nang','quoc'),
 ('17','Dang Thi Hoang Yen','3','4','4','1998-08-16','968435123','9977','0123921333','yen@gmail.com','Quang Nam','yen'),
 ('18','Hoang Thi Hong Hiep','1','2','5','1999-04-06','09834212','6757','099283322','hiep@gmail.com','Sai Gon','hiep'),
 ('19','Nguyen Huu Thang','1','2','2','1999-12-03','65745213','4444','08823232','thang@gmail.com','Quang Tri','thang'),
 ('20','Le Nhat','2','4','3','1996-09-27','76543523','2332','0623483489','nhat@gmail.com','Hue','nhat'),
 ('21','Maria Ozawa','3','5','4','1991-10-23','5466734532','2222','0232313123','ozawa@gmail.com','Da Nang','ozawa'),
 ('22','Tran Huu Hien','6','3','1','1992-05-22','63563242','7654','0454545454','hien@gmail.com','Da Nang','hien');


/*tạo bảng lưu tài khoản nhân viên*/
drop table if exists `user`;
create table `user` (
	username varchar(255) primary key,
    foreign key (username) references employee(username)
    on delete cascade
	on update cascade,
	`password` varchar(255) not null
);

insert into `user` value 
("quang","12345678"),
("tien","12345678"),
("huynh","12345678"),
("chuong","12345678"),
("putin","12345678"),
("hai","12345678"),
("trung","12345678"),
("mai","12345678"),
("trump","12345678"),
("dat","12345678"),
("obama","12345678"),
("hao","12345678"),
("waston","12345678"),
("yoonah","12345678"),
("hieu","12345678"),
("quoc","12345678"),
("yen","12345678"),
("hiep","12345678"),
("thang","12345678"),
("nhat","12345678"),
("ozawa","12345678"),
("hien","12345678");

/* */

 /*Thêm dữ liệu thông tin hợp đồng của resort*/
 insert into contract(id_contract,id_employee,id_customer,id_service,contract_date,contract_expire,deposit_money,total_money) value 
-- ('1','1','0001','0001','2014-01-10','2014-09-10',1000,4000),
-- ('2','2','0011','0002','2020-02-07','2020-10-30',2000,6000),
-- ('3','3','0002','0003','2020-09-20','2020-09-30',1000,5500),
-- ('4','1','0002','0004','2020-12-10','2021-01-10',2000,6000),
-- ('5','1','0003','0005','2020-08-05','2020-08-10',1500,5000),
-- ('6','1','0003','0006','2020-10-12','2020-11-10',3000,4000),
-- ('7','2','0004','0005','2015-10-15','2020-12-11',1000,4000),
-- ('8','2','0005','004','2020-12-05','2021-01-05',1500,5000),
-- ('9','3','0006','0003','2020-09-20','2020-09-30',1000,5500),
-- ('10','4','0007','0002','2020-11-23','2021-09-23',1000,4000),
-- ('11','4','0008','0001','2019-02-10','2021-01-10',2000,6000),
-- ('12','6','0009','0002','2020-04-09','2020-09-09',1500,5000),
-- ('13','6','0010','0003','2020-12-10','2021-01-10',2000,6000),
-- ('14','12','0011','0004','2019-02-04','2020-10-04',1000,4000),
-- ('15','7','0012','0003','2020-08-25','2020-09-25',2000,6000),
-- ('16','7','0013','0005','2020-01-10','2020-09-25',3000,4000),
-- ('17','8','0014','0005','2020-10-22','2020-12-22',1500,4000),
-- ('18','8','0015','0006','2020-09-20','2020-09-30',1000,5500),
-- ('19','9','0015','0006','2020-09-20','2020-09-30',1000,5500),
-- ('20','8','0016','0006','2020-12-10','2020-12-15',1500,5000),
-- ('21','12','0012','0007','2019-03-10','2019-03-15',1500,5000),
-- ('22','12','0011','0007','2018-12-10','2018-12-15',1500,5000),
-- ('23','22','0015','0008','2019-12-17','2019-12-17',1500,5000),
-- ('24','21','0014','0008','2019-09-15','2019-09-15',1500,5000),
-- ('25','20','0004','0009','2018-12-10','2018-12-15',1500,5000),
-- ('26','15','0005','0010','2018-12-10','2018-12-15',1500,5000),
-- ('27','12','0006','0011','2019-12-15','2019-12-15',1500,5000),
-- ('28','14','0007','0011','2018-12-10','2018-09-15',1500,5000),
-- ('29','16','0008','0012','2019-10-30','2019-10-30',1500,5000),
-- ('30','7','0009','0013','2019-11-05','2019-11-05',1500,5000); 

('1','1','KH-0001','DV-0001','2014-01-10','2014-09-10',1000,4000),
('2','2','KH-0011','DV-0002','2020-02-07','2020-10-30',2000,6000),
('3','3','KH-0002','DV-0003','2020-09-20','2020-09-30',1000,5500),
('4','1','KH-0002','DV-0004','2020-12-10','2021-01-10',2000,6000),
('5','1','KH-0003','DV-0005','2020-08-05','2020-08-10',1500,5000),
('6','1','KH-0003','DV-0006','2020-10-12','2020-11-10',3000,4000),
('7','2','KH-0004','DV-0005','2015-10-15','2020-12-11',1000,4000),
('8','2','KH-0005','DV-0004','2020-12-05','2021-01-05',1500,5000),
('9','3','KH-0006','DV-0003','2020-09-20','2020-09-30',1000,5500),
('10','4','KH-0007','DV-0002','2020-11-23','2021-09-23',1000,4000),
('11','4','KH-0008','DV-0001','2019-02-10','2021-01-10',2000,6000),
('12','6','KH-0009','DV-0002','2020-04-09','2020-09-09',1500,5000),
('13','6','KH-0010','DV-0003','2020-12-10','2021-01-10',2000,6000),
('14','12','KH-0011','DV-0004','2019-02-04','2020-10-04',1000,4000),
('15','7','KH-0012','DV-0003','2020-08-25','2020-09-25',2000,6000),
('16','7','KH-0013','DV-0005','2020-01-10','2020-09-25',3000,4000),
('17','8','KH-0014','DV-0005','2020-10-22','2020-12-22',1500,4000),
('18','8','KH-0015','DV-0006','2020-09-20','2020-09-30',1000,5500),
('19','9','KH-0015','DV-0006','2020-09-20','2020-09-30',1000,5500),
('20','8','KH-0016','DV-0006','2020-12-10','2020-12-15',1500,5000),
('21','12','KH-0012','DV-0007','2019-03-10','2019-03-15',1500,5000),
('22','12','KH-0011','DV-0007','2018-12-10','2018-12-15',1500,5000),
('23','22','KH-0015','DV-0008','2019-12-17','2019-12-17',1500,5000),
('24','21','KH-0014','DV-0008','2019-09-15','2019-09-15',1500,5000),
('25','20','KH-0004','DV-0009','2018-12-10','2018-12-15',1500,5000),
('26','15','KH-0005','DV-0010','2018-12-10','2018-12-15',1500,5000),
('27','12','KH-0006','DV-0011','2019-12-15','2019-12-15',1500,5000),
('28','14','KH-0007','DV-0011','2018-12-10','2018-09-15',1500,5000),
('29','16','KH-0008','DV-0012','2019-10-30','2019-10-30',1500,5000),
('30','7','KH-0009','DV-0013','2019-11-05','2019-11-05',1500,5000); 

insert into contract_detail(id_contract_detail,id_contract,id_service_included,amount)
value 
	  ('1','30','3',10),
      ('2','29','2',20),
	  ('3','28','1',11),
	  ('4','27','2',3),
	  ('5','26','3',5),
	  ('6','25','1',30),
	  ('7','20','1',11),
	  ('8','21','2',25),
	  ('9','22','3',02),
	  ('10','23','4',3),
	  ('11','24','2',5),
	  ('12','1','4',10),
	  ('13','2','1',6),
	  ('14','3','4',10),
	  ('15','4','3',2),
	  ('16','5','3',1),
	  ('17','9','1',3),
	  ('18','8','2',4),
	  ('19','7','3',5),
	  ('20','6','4',6),
	  ('21','10','4',7),
	  ('22','11','3',6),
	  ('23','12','2',0),
	  ('24','13','3',2),
	  ('26','14','4',4),
	  ('27','15','4',4),
	  ('28','16','4',4),
	  ('29','17','1',4),
	  ('39','18','3',4);

-- drop PROCEDURE all_info_customer;
DELIMITER $$
CREATE PROCEDURE all_info_customer()
BEGIN
select cu.id_customer,cu.name_customer,co.id_contract,co.id_service,co.contract_date,co_de.id_service_included 
from customer as cu
inner join contract as co on cu.id_customer = co.id_customer
inner join contract_detail as co_de on co.id_contract = co_de.id_contract
where year(co.contract_date)>2019 ;
END$$
DELIMITER ;
call all_info_customer();




