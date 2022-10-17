drop database if exists quan_ly_ban_hang;
create database quan_ly_ban_hang;
use quan_ly_ban_hang;

create table customer(
id_customer int primary key auto_increment,
name_customer varchar(45),
age int 
);

create table `order`(
id int primary key auto_increment,
id_customer int,
`date` date,
total_price double,
foreign key(id_customer) references customer(id_customer)
);

create table product(
id_product int primary key auto_increment,
name_product varchar(45),
price_product double
);

create table order_detail(
id int ,
id_product int,
primary key (id,id_product),
foreign key(id) references 	`order`(id),
foreign key(id_product) references product(id_product)
);

