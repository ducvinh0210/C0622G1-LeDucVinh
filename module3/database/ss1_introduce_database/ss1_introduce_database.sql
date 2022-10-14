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
