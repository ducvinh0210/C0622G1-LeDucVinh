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

insert into customer(name_customer,age) 
values
('Minh Quan',10),
('Ngoc Oanh',20),
('Hong Ha',50);

insert into `order`(id_customer,`date`,total_price) values
(1,'2006-03-21',null),
(2,'2006-03-23',null),
(1,'2006-03-16',null);

insert	into product(name_product,price_product)values
('May Giat',3),
('Tu Lanh',5),
('Dieu Hoa',7),
('Quat',1),
('Bep Dien',2);


-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select 
	id as stt,
	`date` as ngay_mua,
	total_price as so_tien
from `order`;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách hang

select 



