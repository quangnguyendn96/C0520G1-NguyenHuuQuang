drop database if exists table_student;
create database table_student;
use table_student;

create table manager_student(
	id_student varchar(10) primary key,
	name_student varchar(50) not null,
	age char(10) not null,
	major varchar(50),
	cost_course double);

insert into manager_student value 
	('1','Hoang','21','CNTT',400000),
	('2','Viet','19','DTVT',320000),
	('3','Thanh','18','KTDN',400000),
	('4','Nhan','19','CK',450000),
	('5','Huong','20','TCNH',500000),
	('6','Huong','20','TCNH',500000);

select * from manager_student;

select * from manager_student where name_student = 'Huong';
select sum(age) from manager_student where name_student = 'Huong';
select sum(id_student) from manager_student where name_student = 'Huong';
select count(*) from manager_student;

select name_student from manager_student 
	group by name_student;