create database ecom;

use ecom;

create table user
( 
id int,
user_name varchar(50),
user_password varchar(50),
first_name varchar(50),
last_name varchar(50),
email varchar(50),
phone_number varchar(50),
created_date datetime,
last_updated_date datetime,
primary key(id)
);