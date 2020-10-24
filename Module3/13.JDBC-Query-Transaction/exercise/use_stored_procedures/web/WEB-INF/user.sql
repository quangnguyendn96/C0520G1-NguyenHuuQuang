drop database if exists `user`;
create database `user`;
use `user`;

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
    
    select * from
    users
    where country = "Da Nang";
    
    select id,name,email,country 
    from users
    where country like "%Da%";
    
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