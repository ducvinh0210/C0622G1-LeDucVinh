use management_furama;
-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có 
-- tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.
select * from nhan_vien
where(ho_ten REGEXP '^[H,T,K]') and (CHAR_LENGTH(ho_ten) <= 15);

-- 3 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi 
-- và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.

select *  from khach_hang 
where (timestampdiff(year,ngay_sinh, now()) between 18 and 50) and (dia_chi like '%Quảng Trị' or dia_chi like '%Đà Nẵng');

-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.

select khach_hang.*, count(hop_dong.ma_khach_hang) as so_lan_dat_phong from khach_hang 
join hop_dong on khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
join loai_khach on khach_hang.ma_loai_khach = loai_khach.ma_loai_khach
where ten_loai_khach like 'Diamond'
group by khach_hang.ma_khach_hang
order by count(hop_dong.ma_khach_hang) asc;

