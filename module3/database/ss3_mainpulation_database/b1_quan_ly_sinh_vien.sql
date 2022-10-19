drop database if exists quan_ly_hoc_sinh;
create database quan_ly_hoc_sinh;
use quan_ly_hoc_sinh;
create table class(
class_id int not null primary key auto_increment,
class_name varchar(60) not null,
start_day datetime not null,
`status` bit 
);
 create table student(
 student_id int not null primary key auto_increment,
 student_name varchar(30) not null,
 address varchar(50),
 phone varchar(20),
 `status` bit,
 class_id int not null,
 foreign key (class_id) references class(class_id)
 );
 create table `subject`(
 sub_id int not null auto_increment primary key,
 sub_name varchar(30) not null,
 credit tinyint not null default 1 check (credit>=1),
 `status` bit default 1
 );
 
 create table mark(
 mark_id int not null auto_increment primary key,
 sub_id int not null,
 student_id int not null,
 mark float default 0 check( mark between 0 and 100),
 exam_times tinyint default 1,
 unique(sub_id,student_id),
 foreign key(sub_id) references `subject`(sub_id),
 foreign key(student_id) references student(student_id)
 );
 
 insert into class(class_id,class_name,start_day,status) 
 values
 (1,'A1','2008-12-20',1),
 (2,'A2','2008-12-22',1),
 (3,'B3',current_date,0);
 
 insert into student(student_name,address,phone,`status`,class_id)
 values
 ('Hung','Ha Noi','0912113113',1,1);
insert into student (student_name, address, `status`, class_id)
values ('Hoa', 'Hai phong', 1, 1);
 insert into student(student_name,address,phone,`status`,class_id)
values ('Manh', 'HCM', '0123123123', 0, 2);
INSERT INTO subject
VALUES (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
       
 INSERT INTO mark (sub_id, student_id, mark, exam_times)
VALUES (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);
       
-- hiển thị tất cả các sinh viên có tên bắt đầu bảng kí tự là 'h'
select * from student 
where student_name like 'H%';


-- hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12;
select* from class where month(start_day)=12;

-- hiển thị tất cả thông tin môn học có credit trong khoảng 3-5
select* from `subject` where credit>=3 and credit<=5;

-- thay đổi mã lớp của sinh viên có tên Hùng bằng 2
set SQL_SAFE_UPDATES = 0;
update student set class_id =2 where student_name ='Hung';
set SQL_SAFE_UPDATES = 1;
-- Hiển thị các thông tin: StudentName, SubName, Mark.
--  Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
select student.student_name,`subject`.sub_name,mark.mark
from student
join mark
on student.student_id = mark.student_id
join subject
on subject.sub_id = mark.sub_id
order by mark desc, student.student_name;

-- Sử dụng hàm count để hiển thị số lượng sinh viên ở từng nơi
select address, count(student_id ) as	' So luong hoc vien' 
from student
group by address;

-- : Tính điểm trung bình các môn học của mỗi học viên bằng cách sử dụng hàm AVG
select s.student_id, s.student_name, avg(mark)
from student s join mark m on s.student_id= m.student_id
group by s.student_id, s.student_name;
-- hiển thị tất cả các thông tin môn học(bảng môn học ) có credit lớn  nhất
	select * from `subject` where  credit= (select max(credit) from `subject`);
    
    
    -- Hiển thị các thông tin môn học có điểm thi lớn nhất
    select * from `subject`join 
    mark on `subject`.sub_id= mark.mark_id where mark=(select max(mark) from mark);
    -- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
 select student.*, avg(mark) as avarage_mark
 from student join mark on student.student_id= mark.student_id
 group by student.student_id
 order by avg(mark) desc;
    
    
    
    


 
 
 

 
 
 



	

       
       
 
 
 
 
