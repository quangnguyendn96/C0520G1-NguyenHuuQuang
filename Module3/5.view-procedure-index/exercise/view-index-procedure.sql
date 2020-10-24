drop database if exists demo;
create database demo;
use demo;

create table products(
	id varchar(50) primary key,
	product_code varchar(50)not null unique,
	product_name varchar(50),
	product_price double,
	product_amount double,
	product_decription varchar(50),
	product_status varchar(50)
);
insert into products value 
	('123', 'a218937','television', 1000, 20,null,'new'),
	('130','b12990','washing',900,30,'big','used'),
	('140','z12a90','fridge',2000,50,'dangerous','new'),
	('230','b12c90','laptop',1500,25,'brittle','new'),
	('231','99zx90','laptop',700,15,'brittle','used'),
	('052','z9zx90','laptop',700,15,'brittle','used'),
	('031','c9zx90','laptop',700,15,'brittle','used');
select * 
from products;

-- Bước 3 tạo unique index, composite index on products-- 
explain select * 
from products 
where id = '230';

create index id_code 
on products(id);
explain select * 
from products 
where id = '230';

drop index id_code on products;

create index id_code1 
on products(id,product_code);
explain select * 
from products 
where product_code = '140';

drop index id_code1 
on products;
-- tạo view mới
create view view_product as 
select product_code, product_name, product_price, product_status
from products;
select *
from view_product;

-- update lại hàng view
update view_product
set product_name = 'pc', product_status = 'delievering'
where product_code = 'b12c90';
-- xoá hàng view
delete from view_product 
where product_price = 100;

select * 
from products;

-- lấy thông tin trong table
DELIMITER $$
drop procedure if exists get_information_product;
CREATE  procedure get_information_product()
BEGIN
  SELECT * FROM products;
END $$
DELIMITER ;
call get_information_product();


-- thêm sản phẩm mới
DELIMITER $$
drop procedure if exists add_new_product;
CREATE procedure add_new_product(in p_id varchar(50),
    in p_product_code varchar(50) ,
	in p_product_name varchar(50),
	in p_product_price double,
	in p_product_amount double,
	in p_product_decription varchar(50),
	in p_product_status varchar(50))
begin
  insert into products values 
  (p_id,p_product_code,p_product_name,p_product_price,p_product_amount,p_product_decription,p_product_status);
end; $$
DELIMITER ;
call add_new_product('331','00zx90','laptop',700,15,'brittle','used');


-- sửa thông tin theo id
DELIMITER $$
drop procedure if exists edit_product;
CREATE  procedure edit_product(in product_code1 varchar(50),
	in p_product_name varchar(50),
    in p_product_price double,
	in p_id varchar(50))
BEGIN
update products
set product_code = product_code1, product_name = p_product_name, product_price = p_product_price
where id = p_id;
END; $$
DELIMITER ;
call edit_product('quangdeptrai','bedroom',2000,'231');

-- xoá sản phẩm
DELIMITER $$
drop procedure if exists delete_product;
CREATE  procedure delete_product(in id1 varchar(50))
BEGIN
delete from products
where id = id1;
END; $$
DELIMITER ;
call delete_product('231');