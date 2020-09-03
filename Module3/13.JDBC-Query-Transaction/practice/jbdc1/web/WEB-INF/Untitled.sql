drop database if exists `demo`;
CREATE DATABASE `demo`;
USE `demo`;

create table users (
 id  int(3) NOT NULL AUTO_INCREMENT,
 name varchar(120) NOT NULL,
 email varchar(220) NOT NULL,
 country varchar(120),
 PRIMARY KEY (id)
);

insert into users(name, email, country) values('Minh','minh@codegym.vn','Viet Nam');
insert into users(name, email, country) values('Kante','kante@che.uk','Kenia');

DELIMITER $$
CREATE PROCEDURE insert_user(
	IN user_name varchar(50),
	IN user_email varchar(50),
	IN user_country varchar(50)
)
BEGIN
INSERT INTO users(name, email, country) 
VALUES(user_name, user_email, user_country);
END$$
DELIMITER ;
    
DELIMITER $$
CREATE PROCEDURE show_all_user()
BEGIN
select id,name,email,country
from users;
END$$
DELIMITER ;

DELIMITER $$
CREATE PROCEDURE delete_user(IN id_user int)
BEGIN
delete from users
where id = id_user;
END$$
DELIMITER ;

DELIMITER $$
CREATE PROCEDURE get_user_by_id(IN id_user int)
BEGIN
select name,email,country
where id = id_user;
END$$
DELIMITER ;

DELIMITER $$
CREATE PROCEDURE update_user(
	IN user_name varchar(50),
	IN user_email varchar(50),
	IN user_country varchar(50),
	IN id_user int)
BEGIN
update users
set `name` = user_name,email = user_email,country = user_country
where id = id_user;
END$$
DELIMITER ;


create table contract(
id_contract int primary key,
name_contract varchar(50)
);

insert into contract values
(1, "villa"),
(2, "Room");


select * from users;
select * from contract;


