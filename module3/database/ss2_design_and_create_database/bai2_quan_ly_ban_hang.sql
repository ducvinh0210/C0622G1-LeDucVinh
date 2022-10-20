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
amount int,
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

insert into order_detail(id,id_product,amount)
values
(1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);


-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select 
	id as stt,
	`date` as ngay_mua,
	total_price as so_tien
from `order`;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách hang
select customer.name_customer,product.name_product from customer 
inner join `order` on customer.id_customer= `order`.id_customer
inner join order_detail on`order`.id= order_detail.id
inner join product on order_detail.id_product= product.id_product;

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select * from customer where customer.id_customer not in (select id_customer from `order`);
-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn 
-- (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice)

select `order`.id,`order`.`date`,sum(order_detail.amount*product.price_product) as total_order_price
from `order`
inner join order_detail on `order`.id = order_detail.id
inner join product on order_detail.id_product= product.id_product
group by `order`.id;

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
 select 







