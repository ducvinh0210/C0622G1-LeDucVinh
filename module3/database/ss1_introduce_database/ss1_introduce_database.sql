drop database if exists management_student;
create database management_student;
use management_student;

create table class(
id int primary key,
`name` varchar(25)
);

create table teacher(
id int primary key,
`name` varchar(25),
age int ,
country varchar(50)
);

insert into	teacher values(4,'vinh',12,'quang nam');
select * from	teacher ;
select id,`name` from teacher;
insert into teacher values(7,'vi',11,'quang nam');
insert into teacher values(5,'van',37,'quang nam');
select id,`name` from teacher;
update teacher set `name` = 'ronaldo' where id =4;
select * from teacher;

