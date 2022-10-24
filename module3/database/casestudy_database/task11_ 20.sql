use management_furama;
-- task 11 11.	Hiển thị thông tin các dịch vụ đi kèm đã được
-- sử dụng bởi những khách hàng có ten_loai_khach là “Diamond” và có dia_chi ở “Vinh” hoặc “Quảng Ngãi”.

select dich_vu_di_kem.ma_dich_vu_di_kem, dich_vu_di_kem.ten_dich_vu_di_kem 
from dich_vu_di_kem 
join hop_dong_chi_tiet on dich_vu_di_kem.ma_dich_vu_di_kem= hop_dong_chi_tiet.ma_dich_vu_di_kem
join hop_dong on 	hop_dong_chi_tiet.ma_hop_dong= hop_dong.ma_hop_dong
join khach_hang on hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
join loai_khach on khach_hang.ma_loai_khach= loai_khach.ma_loai_khach
where loai_khach.ten_loai_khach = "Diamond" 
and (khach_hang.dia_chi like "%Vinh" or khach_hang.dia_chi like "%Quảng Ngãi")
order by dich_vu_di_kem.ma_dich_vu_di_kem;

-- task 12 hiển thị mã hợp đồng ho_ten(nhân viên) ho_ten(khách hang) so_dien_Thoai khách hàng ten_dich_vu so luong dich vu  tiền đặt cọc
-- của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2020 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021.
select hop_dong.ma_hop_dong, nhan_vien.ho_ten, khach_hang.ho_ten, khach_hang.so_dien_thoai, dich_vu.ten_dich_vu,
sum(ifnull(hop_dong_chi_tiet.so_luong,0)) as so_luong_dich_vu_di_kem, hop_dong.tien_dat_coc 
from hop_dong
join nhan_vien on hop_dong.ma_nhan_vien= nhan_vien.ma_nhan_vien
join khach_hang on hop_dong.ma_khach_hang= khach_hang.ma_khach_hang
join dich_vu on dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
left join hop_dong_chi_tiet on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
 where hop_dong.ngay_lam_hop_dong between'2020-10-01' and '2020-12-31' and hop_dong.ngay_lam_hop_dong not in(
 select hop_dong.ma_hop_dong
 from hop_dong
 where hop_dong.ngay_lam_hop_dong between '2021-01-01' and '2021-06-31')
 group by hop_dong.ma_hop_dong ;
 -- where month(ngay_lam_hop_dong) in (1,2,3,4,5,6) and year(ngay_lam_hop_dong) = 2021
 select hop_dong.ma_hop_dong
 from hop_dong
 where month(ngay_lam_hop_dong) in (1,2,3,4,5,6) and year(ngay_lam_hop_dong) = 2021
  group by hop_dong.ma_hop_dong
;
 
-- task 13
-- Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
-- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).

-- drop view if exists view1;
-- create view view1 as
-- select dich_vu_di_kem.ma_dich_vu_di_kem , dich_vu_di_kem.ten_dich_vu_di_kem , SUM(ifnull(hop_dong_chi_tiet.so_luong,0)) as so_luong_dich_vu_di_kem  
-- from dich_vu_di_kem 
-- join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
-- group by hop_dong_chi_tiet.ma_dich_vu_di_kem;
-- select view1.ma_dich_vu_di_kem,view1.ten_dich_vu_di_kem, view1.so_luong_dich_vu_di_kem  
-- from view1
-- where view1.so_luong_dich_vu_di_kem = (select max(demo.so_luong_dich_vu_di_kem) from view1);

select dich_vu_di_kem.*, sum(hop_dong_chi_tiet.so_luong) as so_luong_dich_vu_di_kem from dich_vu_di_kem
join hop_dong_chi_tiet on dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
group  by hop_dong_chi_tiet.ma_dich_vu_di_kem
having sum(hop_dong_chi_tiet.so_luong) >= all (select sum(hop_dong_chi_tiet.so_luong) as so_luong_dich_vu_di_kem from dich_vu_di_kem 
join hop_dong_chi_tiet on dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
group  by hop_dong_chi_tiet.ma_dich_vu_di_kem);


-- task 14
-- Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
-- Thông tin hiển thị bao gồm ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem, so_lan_su_dung (được tính dựa trên việc count các ma_dich_vu_di_kem).

select hop_dong.ma_hop_dong, loai_dich_vu.ten_loai_dich_vu, dich_vu_di_kem.ten_dich_vu_di_kem, COUNT(hop_dong_chi_tiet.ma_dich_vu_di_kem) as so_lan_su_dung 
from hop_dong
join dich_vu on dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
join loai_dich_vu on loai_dich_vu.ma_loai_dich_vu = dich_vu.ma_dich_vu
join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
join dich_vu_di_kem on dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
group by  hop_dong_chi_tiet.ma_dich_vu_di_kem
having so_lan_su_dung = 1
order by  hop_dong.ma_hop_dong;

-- task 15
-- Hiển thi thông tin của tất cả nhân viên bao gồm ma_nhan_vien, ho_ten, ten_trinh_do, ten_bo_phan, so_dien_thoai, dia_chi 
-- mới chỉ lập được tối đa 3 hợp đồng từ năm 2020 đến 2021.

select nhan_vien.ma_nhan_vien, nhan_vien.ho_ten, trinh_do.ten_trinh_do, bo_phan.ten_bo_phan, nhan_vien.so_dien_thoai, nhan_vien.dia_chi
from nhan_vien
join trinh_do on trinh_do.ma_trinh_do = nhan_vien.ma_trinh_do
join bo_phan on bo_phan.ma_bo_phan = nhan_vien.ma_bo_phan
join hop_dong on hop_dong.ma_nhan_vien = nhan_vien.ma_nhan_vien
where year(hop_dong.ngay_lam_hop_dong) between 2020 and 2021
group by  nhan_vien.ma_nhan_vien
having count(hop_dong.ma_hop_dong)<4
order by nhan_vien.ma_nhan_vien;

-- task 16
-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021.
-- cach 1:
delete from nhan_vien 
WHERE nhan_vien.ma_nhan_vien not in (
SELECT hop_dong.ma_nhan_vien
from hop_dong
WHERE year(hop_dong.ngay_lam_hop_dong) BETWEEN 2019 and  2021);
SELECT nhan_vien.ma_nhan_vien, nhan_vien.ho_ten
from nhan_vien;
-- cach2 
DELETE from nhan_vien
where not EXISTS (SELECT ma_nhan_vien from hop_dong
WHERE ma_nhan_vien= nhan_vien.ma_nhan_vien and year(hop_dong.ngay_lam_hop_dong) BETWEEN 2019 and 2021);
SELECT ma_nhan_vien, ho_ten
from nhan_vien;
 -- task 17 
 -- 17.	Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum
 -- lên Diamond, chỉ cập nhật những khách hàng đã từng đặt phòng với Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ.
  
  drop VIEW if EXISTS view2;
  CREATE view view2 as
  SELECT khach_hang.ma_khach_hang as ma_khach_hang, khach_hang.ho_ten, loai_khach.ten_loai_khach, hop_dong.ma_hop_dong, dich_vu.ten_dich_vu, hop_dong.ngay_lam_hop_dong, hop_dong.ngay_ket_thuc,
  (ifnull(dich_vu.chi_phi_thue,0)+ sum(ifnull(hop_dong_chi_tiet.so_luong,0)*ifnull(dich_vu_di_kem.gia,0)))
  FROM khach_hang
  LEFT join loai_khach on khach_hang.ma_loai_khach= loai_khach.ma_loai_khach
  left join hop_dong on khach_hang.ma_khach_hang= hop_dong.ma_khach_hang
  LEFT join hop_dong_chi_tiet on hop_dong.ma_hop_dong= hop_dong_chi_tiet.ma_hop_dong
  left join dich_vu on hop_dong.ma_dich_vu= dich_vu.ma_dich_vu
  left join dich_vu_di_kem on dich_vu_di_kem.ma_dich_vu_di_kem= hop_dong_chi_tiet.ma_dich_vu_di_kem
  GROUP BY hop_dong.ma_hop_dong
  ORDER BY khach_hang.ma_khach_hang;
   SELECT* from view1; 

UPDATE khach_hang 
SET khach_hang.ma_loai_khach =1 
WHERE khach_hang.ma_khach_hang IN(
SELECT ma_khach_hang 
FROM view2
WHERE ten_loai_khach = "Platinium" 
Group by ma_khach_hang
having sum(tong_tien)>1000000);

SELECT *
 FROM khach_hang;
  
  -- task 18 18.	Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng).
  
  ALTER TABLE khach_hang 
  add trang_thai BOOLEAN DEFAULT 1 ;
  UPDATE khach_hang
  set trang_thai = 0 
  WHERE ma_khach_hang in(SELECT ma_khach_hang from hop_dong 
  WHERE year(hop_dong.ngay_lam_hop_dong)<2021);
  SELECT* from khach_hang WHERE trang_thai = 0;
  
  -- cach 2
  set foreign_key_check= 0;
  DELETE from khach_hang 
  WHERE khach_hang.ma_khach_hang in(
  SELECT ma_khach_hang 
  from hop_dong
  WHERE year(hop_dong.ngay_lam_hop_dong)<2021);
  SELECT* from khach_hang;
  set foreign_key_check= 1;
  
 --  task 19 	Cập nhật giá cho các dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2020 lên gấp đôi.
 
 UPDATE dich_vu_di_kem 
 set gia=gia*2
 WHERE dich_vu_di_kem.ma_dich_vu_di_kem in (SELECT hop_dong_chi_tiet.ma_dich_vu_di_kem from hop_dong_chi_tiet
 JOIN hop_dong on hop_dong.ma_hop_dong= hop_dong_chi_tiet.ma_hop_dong
 WHERE( year(hop_dong.ngay_lam_hop_dong)=2020) and (hop_dong_chi_tiet.so_luong>10)
 group by hop_dong_chi_tiet.ma_dich_vu_di_kem);
 SELECT* from dich_vu_di_kem;
 
 -- task 20	Hiển thị thông tin của tất cả các nhân viên và khách hàng có trong hệ thống, 
 -- thông tin hiển thị bao gồm id (ma_nhan_vien, ma_khach_hang), 
 -- ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi.
 SELECT 'nhan vien' as type, ma_nhan_vien as id, ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi
 from nhan_vien
 UNION ALL
 SELECT 'khach hang' as type, ma_khach_hang as id, ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi
 from khach_hang;
 
 -- task 21
 
 
	
  
  
  

  
  

  


  
 


 





