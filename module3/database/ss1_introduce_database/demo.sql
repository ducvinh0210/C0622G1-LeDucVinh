drop database if exists test;
create database test;
use test;
create table cmnd(
cmnd int primary key,
ngay_lam_cmnd date
);
create table xemay(
id_xe_may int auto_increment primary key,
ten_xe varchar(45)
);
create table xe(
id_xe_dap int auto_increment primary key,
ten_xe varchar(45)
);
create table nguoi(
id int auto_increment primary key,
ten varchar(255),
cmnd int,
id_xe_may1 int,
foreign key(cmnd) references cmnd(cmnd),
foreign key(id_xe_may1) references xemay(id_xe_may)
);



