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
	('3','Viet Cong','18','KTDN',400000),
	('4','Nhan','19','CK',450000),
	('5','Huong','20','TCNH',500000),
	('6','Huong','20','TCNH',500000);

select * 
from manager_student;
               
select * 
from manager_student 
where name_student = 'Huong';

select sum(age) 
from manager_student 
where name_student = 'Huong';

select sum(id_student) 
from manager_student 
where name_student = 'Huong';

select count(*) 
from manager_student;

insert into manager_student value
 ('7','Nhan','19','CNTT',450000),
 ('8','Nam','19','CNTT',300000),
 ('9','An','19','CNTT',400000);
-- 1 -- get name not duplicate  
select name_student 
from manager_student 
group by name_student;

select distinct * 
from manager_student;

-- 2 -- lấy ra nhóm có học phí cao hơn 300.000     
select major, avg(cost_course) as sum 
from manager_student 
group by major 
having sum > 300000;    
    
select name_student, sum(id_student) as amount
from manager_student 
group by name_student;
    
select name_student, count(*) as amount
from manager_student 
group by name_student;
    
select avg(name_student) as amount
from manager_student; 
    
select max(name_student) as max
from manager_student; 	
    
select now() as time
from manager_student; 
    
select length(name_student) as name
from manager_student; 
    
select length(cost_course) as cost
from manager_student;
    
select ucase(name_student) as `NAME`
from manager_student;    

  