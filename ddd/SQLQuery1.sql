CREATE TABLE lop_hoc(
ma_lop int IDENTITY(1,1) PRIMARY KEY,
ten_lop varchar(255),
phong_hoc varchar(50)
);
CREATE TABLE mon_hoc(
ma_mon int IDENTITY(1,1) PRIMARY KEY,
ten_mon varchar(255)
);
CREATE table sinh_vien (
 ma_sv int IDENTITY(1,1) PRIMARY KEY,
 ten_sv varchar(255),
ngay_sinh date,
ma_lop int FOREIGN KEY references lop_hoc(ma_lop)
);
CREATE TABLE ket_qua_thi(
id int IDENTITY(1,1) PRIMARY KEY,
diem_thi int,
ket_qua varchar(50),
ma_sv int FOREIGN KEY references sinh_vien(ma_sv),
ma_mon int FOREIGN KEY references mon_hoc(ma_mon)
);
CREATE TABLE sv_mh(
ma_sv int FOREIGN KEY references sinh_vien(ma_sv),
ma_mon int FOREIGN KEY references mon_hoc(ma_mon)
);
DROP TABLE sv_mh;
DROP TABLE ket_qua_thi;
DROP TABLE sinh_vien;
DROP TABLE mon_hoc;
DROP TABLE lop_hoc;
