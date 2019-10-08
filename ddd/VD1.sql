CREATE TABLE lop_hoc(
ma_lop int IDENTITY(1,1) PRIMARY KEY,
ten_lop varchar(255) NOT NULL UNIQUE,
phong_hoc varchar(50) NOT NULL
);
CREATE TABLE mon_hoc(
ma_mon int IDENTITY(1,1) PRIMARY KEY,
ten_mon varchar(255) NOT NULL UNIQUE
);
CREATE table sinh_vien (
 ma_sv int IDENTITY(1,1) PRIMARY KEY,
 ten_sv varchar(255) NOT NULL,
ngay_sinh date NOT NULL CHECK (ngay_sinh >= '1995-01-01' AND ngay_sinh < '2002-01-01'),
ma_lop int NOT NULL FOREIGN KEY references lop_hoc(ma_lop)
);
CREATE TABLE ket_qua_thi(
id int IDENTITY(1,1) PRIMARY KEY,
diem_thi int NOT NULL CHECK (diem_thi >= 0 AND diem_thi <= 10),
--ket_qua varchar(50)NOT NULL CHECK (ket_qua LIKE 'pass' OR ket_qua LIKE 'not pass'),
ket_qua varchar(50)NOT NULL CHECK (ket_qua IN ('pass','not pass')),
ma_sv int NOT NULL FOREIGN KEY references sinh_vien(ma_sv),
ma_mon int NOT NULL FOREIGN KEY references mon_hoc(ma_mon)
);
CREATE TABLE sv_mh(
ma_sv int NOT NULL FOREIGN KEY references sinh_vien(ma_sv),
ma_mon int NOT NULL FOREIGN KEY references mon_hoc(ma_mon)
);
DROP TABLE sv_mh;
DROP TABLE ket_qua_thi;
DROP TABLE sinh_vien;
DROP TABLE mon_hoc;
DROP TABLE lop_hoc;
