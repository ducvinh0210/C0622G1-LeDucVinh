drop database if exists  quan_ly_vat_tu;
create database quan_ly_vat_tu;
use quan_ly_vat_tu;
create table phieu_xuat(
so_phieu_xuat int auto_increment primary key,
ngay_xuat date
);

create table vat_tu(
ma_vat_tu int auto_increment primary key,
ten_vat_tu varchar(45));

create table chi_tiet_phieu_xuat(
so_phieu_xuat int ,
ma_vat_tu int ,
primary key(so_phieu_xuat,ma_vat_tu),
foreign key(so_phieu_xuat) references phieu_xuat(so_phieu_xuat),
foreign key(ma_vat_tu) references vat_tu(ma_vat_tu),
don_gia_xuat double,
so_luong_xuat int
);
create table phieu_nhap(
so_phieu_nhap int auto_increment primary key,
ngay_nhap date
);

create table chi_tiet_phieu_nhap(
ma_vat_tu int,
so_phieu_nhap int,
primary key(ma_vat_tu,so_phieu_nhap),
foreign key(ma_vat_tu) references vat_tu(ma_vat_tu),
foreign key(so_phieu_nhap) references phieu_nhap(so_phieu_nhap),
don_gia_nhap double,
so_luong_nhap double
);

create table don_dat_hang(
so_dat_hang int auto_increment primary key,
ngay_dat_hang date ,
ma_nha_cung_cap int,
foreign key(ma_nha_cung_cap) references nha_cung_cap(ma_nha_cung_cap)
);

create table chi_tiet_don_dat_hang(
ma_vat_tu int ,
so_don_hang int,
primary  key(ma_vat_tu,so_don_hang) ,
foreign key (ma_vat_tu) references vat_tu(ma_vat_tu),
foreign key(so_don_hang) references don_dat_hang(so_dat_hang)
);

create table nha_cung_cap(
ma_nha_cung_cap int auto_increment primary key,
ten_nha_cung_cap varchar(45),
dia_chi varchar(45)
);
create table so_dien_thoai(
ma_dien_thoai int primary key,
ma_nha_cung_cap int,
foreign key(ma_nha_cung_cap) references nha_cung_cap(ma_nha_cung_cap)
);








