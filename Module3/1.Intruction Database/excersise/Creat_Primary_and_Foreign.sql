drop database if exists tryDatabase;
create database tryDatabase;
use tryDatabase;

create table users(
user_id int,
username varchar(40),
password varchar(255),
email varchar(255),
primary_key_column int
);

CREATE TABLE roles(
   role_id INT AUTO_INCREMENT,
   role_name VARCHAR(50),
   primary key(role_id)
   );
   
   CREATE TABLE userroles(
   user_id INT NOT NULL,
   role_id INT NOT NULL,
   PRIMARY KEY(user_id,role_id),
   FOREIGN KEY(user_id) REFERENCES users(user_id),
   FOREIGN KEY(role_id) REFERENCES roles(role_id)
);

alter table users
add primary key AUTO_INCREMENT(user_id);




