drop database if exists product;
create database product;
use product;

create table product (
	  id int primary key,	
	 `name` varchar(50),
	  price double,
	  amount_number int,
	  color varchar(50),
      `description` varchar(50), 
	  category varchar(50) 
  );
  
insert into product values 
(1,'iPhone 11','799','12','Green','available','phone'),
(2,'iPhone 11 Pro','1100','12','Black','available','phone'),
(3,'iPhone 11 x','2000','10','Black','available','phone'),
(4,'Smart ','1100000','20','Red','available','tivi'),
(5,'Samsung','500','5','Black','available','phone');


select * from product;

update product set `name` = 'tv' , price = 10000, amount_number =3, color= 'hong', description = 'no',
category = 'vip' where id =1;
  