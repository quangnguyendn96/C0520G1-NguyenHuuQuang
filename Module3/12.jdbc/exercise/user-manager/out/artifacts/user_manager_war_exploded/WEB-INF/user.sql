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
    

DELIMITER $$
CREATE PROCEDURE get_user_by_id(IN user_id INT)
BEGIN
	SELECT users.name, users.email, users.country
	FROM users
	where users.id = user_id;
	END$$
DELIMITER ;

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
create procedure show_all_user()
	begin
	select id,name,email,country 
	from users;
	end $$
DELIMITER ;

call show_all_user();

DELIMITER $$
create procedure update_user(
IN user_name varchar(50),
IN user_email varchar(50),
IN user_country varchar(50),
IN user_id int)
	begin 	
	update users
    set `name`= user_name, email =user_email,country =  user_country
    where id = user_id;
	end $$
DELIMITER ;

DELIMITER $$
create procedure delete_user(IN id_user int)
	begin
	delete from users
    where id = id_user;
	end $$
DELIMITER ;
