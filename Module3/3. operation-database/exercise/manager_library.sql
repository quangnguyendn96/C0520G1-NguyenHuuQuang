drop database if exists manager_library;
create database manager_library;
use  manager_library;

create table address_student(
	house_number varchar(50) primary key,
	city varchar(50),
	country varchar(50)
);
insert into address_student(house_number,city,country) values 
('k45/21 Phan Tu','Da Nang','Viet Nam'),
('25 Le Dinh Ly','Da Nang','Viet Nam'),
('45 Ngu Hanh Son','Da Nang','Viet Nam'),
('21 Phan Thanh','Da Nang','Viet Nam'),
('k45 Nguyen Van Thoai','Da Nang','Viet Nam');

create table student(
	id_student varchar(15) primary key,
	name_student varchar(50) not null,
	address varchar(100),
    foreign key (address) references address_student(house_number),
	email varchar(50) unique,
    phone varchar(50) not null unique);
    
insert into student(id_student, name_student, address, email, phone) values 
	('100','Nguyen Huu Quang','k45/21 Phan Tu','Quang@gmai.com','0179123123'),
	('220','Nguyen Huu Sang','45 Ngu Hanh Son','Sang@gmai.com','0123123123'),
	('614','Nguyen Huu Tho','25 Le Dinh Ly','Tho@gmai.com','0770023112'),
	('198','Nguyen Huu Phuc','21 Phan Thanh','Phuc@gmai.com','0779123223'),
	('214','Nguyen Huu Huy','k45 Nguyen Van Thoai','Huy@gmai.com','0769123123');
create table student_card(
	id_student varchar(15) primary key,
	foreign key (id_student) references student(id_student)
);
insert into student_card values 
('100'),
('220'),
('214'),
('614'),
('198');

create table category(
	cate_number varchar(50) primary key,
	type_book varchar(50) not null
);
insert into category(cate_number,type_book) values 
('01111','comedy'),
('02222','science fiction'),
('03333','love'),
('04444','sex'),
('05555','comedy');

create table book(
	name_book varchar(50) not null,
    publisher varchar(50) not null,
    year_release varchar(50) not null,
    price double,
	cate_number varchar(50) primary key,
    foreign key(cate_number) references category(cate_number)
);

insert into book(name_book,publisher,year_release,price,cate_number) values
('how to get married','ngon tinh','2020','1.000000','01111'),
('how to have girlfriend immeidately','ngon tinh','2.000000','2010','02222'),
('how to become goodboy','htvn','2019','3.000000','03333'),
('making approaches to a girls secert','thanh nien','2022','4.000000','05555');

create table borrow_order(
	day_borrow date not null,
	date_return date not null,
	cate_number varchar(50) not null,
	id_student varchar(15),
	foreign key(cate_number) references category(cate_number),
	foreign key(id_student) references student_card(id_student)
);

insert into borrow_order(day_borrow,date_return,cate_number,id_student) values
('2020-06-10','2020-12-10','02222','198'),
('2020-02-25','2020-07-25','05555','198'),
('2020-09-20','2021-01-20','02222','614');

-- are student borrowing book?? 
select * from student_card as st
	left join  borrow_order as bo on bo.id_student = st.id_student
	where bo.id_student is null;

-- display student are borrowing book
select * from student_card as st
	left join  borrow_order as bo on bo.id_student = st.id_student;



