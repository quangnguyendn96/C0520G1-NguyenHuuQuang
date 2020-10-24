drop database if exists student;
create database student;
use student;

create table student (
	  id varchar(50) primary key,	
	 `name` varchar(50),
	  class_name varchar(50),
	  gender bit(1),
	  id_card int not null unique,
	  day_of_birth varchar(50),
	  phone_number varchar(50) not null unique
  );
  
insert into student values 
('SV-01','Quang','12/8',1,123456789,'1996-02-27','0997123123'),
('SV-02','An','12/7',0,123456781,'1996-12-12','0999111222'),
('SV-03','Tien','12/7',1,123456782,'1996-01-25','0999111223'),
('SV-04','Nam','12/8',1,123456783,'1996-07-27','0999111224'),
('SV-05','Hoan','12/8',0,123456784,'1996-08-01','0999111225');

select * from student;

DELIMITER $$
	create procedure sort_by_name()
     begin
		  select * from student 
		  order by `name`;
      end $$
DELIMITER 

call sort_by_name();
  