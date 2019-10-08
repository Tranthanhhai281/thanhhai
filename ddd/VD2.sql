-- INSERT INTO tble_name(field1,field2,...) VALUES(vlue1,value2,..);
INSERT INTO lop_hoc(ten_lop,phong_hoc) VALUES('T1907M','208');
INSERT INTO lop_hoc(ten_lop,phong_hoc) VALUES('T1908A','206');
INSERT INTO lop_hoc(ten_lop,phong_hoc) VALUES('T1904A','A6');
-- SELECT * FROM table_name;
SELECT * FROM lop_hoc;
-- UPDATE table_name SET field = new_value WHERE rules;
UPDATE lop_hoc SET phong_hoc = 'A12' WHERE ma_lop = 1;
UPDATE lop_hoc SET phong_hoc = '206' WHERE ten_lop LIKE 'T1908A';
UPDATE lop_hoc SET phong_hoc = 'A6' WHERE ma_lop > 2;
-- DELETE FROM table_name
DELETE FROM lop_hoc WHERE ma_lop = 3;

INSERT INTO mon_hoc (ten_mon) VALUES('LBEP');
SELECT * FROM mon_hoc;

INSERT INTO sinh_vien(ten_sv,ngay_sinh,ma_lop) VALUES ('Nguyen Van An ','2000-10-24',1);
INSERT INTO sinh_vien(ten_sv,ngay_sinh,ma_lop) VALUES ('Nguyen T','2000-1-24',4);
SELECT * FROM sinh_vien;

