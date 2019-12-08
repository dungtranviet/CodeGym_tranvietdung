drop database if exists furama_resort_dung_c10g;
create database furama_resort_dung_c10g;
use furama_resort_dung_c10g;
CREATE TABLE ViTri(
	IDViTri int,
    TenViTri NVARCHAR(45) UNIQUE,
    PRIMARY KEY(IDViTri)
);
CREATE TABLE TrinhDo(
	IDTrinhDo int Primary key,
    TrinhDo NVARCHAR(45) UNIQUE
);
CREATE TABLE Bophan(
	IDBoPhan int Primary key,
    TenBoPhan NVARCHAR(45) UNIQUE
);
CREATE TABLE NhanVien(
	IDNhanVien int Primary key,
    HoTen NVARCHAR(45),
	IDVitri int,
    IDTrinhDo int,
    IDBoPhan int,
    NgaySinh DATE,
    SoCMND NVARCHAR(45) UNIQUE,
    Luong DOUBLE(11,3),
    SDT NVARCHAR(12) UNIQUE,
    Email NVARCHAR(45) UNIQUE,
    DiaChi NVARCHAR(45),
    FOREIGN KEY(IDViTri) REFERENCES vitri(IDViTri),
    FOREIGN KEY(IDTrinhDo) REFERENCES trinhdo(IDTrinhDo),
    FOREIGN KEY(IDBoPhan) REFERENCES bophan(IDBoPhan)
);
create table LoaiDichVu(
	IDLoaiDichVu int primary key,
    TenLoaiDichVu NVARCHAR(45) UNIQUE
    );
create table KieuThue(
	IDKieuThue int primary key,
    TenKieuThue NVARCHAR(45) UNIQUE,
    Gia double
    );
create table DichVu(
	IDDichVu int primary key,
    TenDichVu NVARCHAR(45),
    DienTich DOUBLE,
    SoNguoiToiDa int,
    ChiPhiThue DOUBLE(10,3),
    IDLoaiDichVu int,
    IDKieuThue int,
    TieuChuanPhong NVARCHAR(45),
    MoTaTienNghi NVARCHAR(45),
    DienTichHoBoi DOUBLE,
    SoTang int,
    TrangThai NVARCHAR(45),
    FOREIGN KEY(IDLoaiDichVu) REFERENCES LoaiDichVu(IDLoaiDichVu),
    FOREIGN KEY(IDKieuThue) REFERENCES KieuThue(IDKieuThue)
    );
create table LoaiKhach(
	IDLoaiKhach int primary key,
    TenLoaiKhach NVARCHAR(45) UNIQUE
    );
create table KhachHang(
	IDKhachHang int primary key,
    HoTen NVARCHAR(45),
    NgaySinh DATE NOT NULL,
    GioiTinh NVARCHAR(45),
    SoCMND NVARCHAR(45) UNIQUE,
    SDT NVARCHAR(45) UNIQUE,
    Email NVARCHAR(45) UNIQUE,
    IDLoaiKhach int,
    DiaChi NVARCHAR(45),
    FOREIGN KEY (IDLoaiKhach) REFERENCES LoaiKhach(IDLoaiKhach)
    );
CREATE TABLE DichVuDiKem(
	IDDichVuDiKem int primary key ,
    TenDichVuDiKem NVARCHAR(45) UNIQUE,
    Gia double,
    DonVi int,
    TrangThaiKhaDung NVARCHAR(45)
    );
CREATE TABLE HopDong(
	IDHopDong int Primary key,
    NgayLamHopDong DATE,
    NgayKetThuc DATE,
    TienDatCoc double,
    TongTien double,
    IDKhachHang int,
    IDDichVu int,
    IDNhanVien int,
    FOREIGN KEY(IDNhanVien) REFERENCES NhanVien(IDNhanVien),
    FOREIGN KEY(IDKhachHang) REFERENCES KhachHang(IDKhachHang),
    FOREIGN KEY(IDDichVu) REFERENCES DichVu(IDDichVu)
);
CREATE TABLE HopDongChiTiet(
    IDHopDong int,
    IDDichVuDiKem int,
    SoLuong int,
    primary key (IDHopDong,IDDichVuDiKem),
    FOREIGN KEY (IDHopDong) REFERENCES HopDong(IDHopDong),
    FOREIGN KEY (IDDichVuDiKem) REFERENCES DichVuDiKem(IDDichVuDiKem)
);
insert into ViTri values(1,'Trưởng phòng');
insert into ViTri values(2,'Nhân viên');
insert into TrinhDo values(1,'Đại học');
insert into TrinhDo values(2,'Cao Đẳng');
insert into Bophan values(1,'Hành chính');
insert into Bophan values(2,'Nhân sự');
insert into NhanVien values(1,'Nguyễn Văn hai', 1,1,1,'1988:01:01','201123451',100000,'0935123451','b1@b.com','Đà Nẵng');
insert into NhanVien values(2,'Nguyễn Văn Thanh', 2,1,1,'1988:01:01','201123452',100000,'0935123452','b2@b.com','Đà Nẵng');
insert into NhanVien values(3,'Nguyễn Văn Khoa', 1,2,1,'1988:01:01','201123453',100000,'0935123453','b3@b.com','Đà Nẵng');
insert into NhanVien values(4,'Nguyễn Văn Dung', 1,2,1,'1988:01:01','201123454',100000,'0935123454','b4@b.com','Đà Nẵng');
insert into NhanVien values(5,'Nguyễn Văn Em', 1,1,1,'1988:01:01','201123455',100000,'0935123455','b5@b.com','Đà Nẵng');
insert into LoaiDichVu values(1,'Villa');
insert into LoaiDichVu values(2,'House');
insert into LoaiDichVu values(3,'Room');
insert into KieuThue values(1,'Năm',12000000);
insert into KieuThue values(2,'Tháng',1000000);
insert into KieuThue values(3,'Ngày',100000);
insert into KieuThue values(4,'Giờ',10000);
insert into DichVu values(1,'Xuan mai',50,5,5000000,1,1,'Vip','MoTaTienNghi',25,3,'San sang');
insert into DichVu values(2,'Mai Phuong',30,3,3000000,2,2,'Vip','MoTaTienNghi',15,2,'San sang');
insert into DichVu values(3,'Thanh Phong',10,4,1000000,3,3,'Vip','MoTaTienNghi',45,1,'San sang');
insert into DichVu values(4,'Tuan Thanh',10,6,1000000,3,3,'Vip','MoTaTienNghi',55,6,'San sang');
insert into DichVu values(5,'Tuan Thanh 2',10,9,1000000,3,3,'Vip','MoTaTienNghi',105,5,'San sang');


insert into LoaiKhach values(1, 'Diamond');
insert into LoaiKhach values(2, 'Platinium');
insert into LoaiKhach values(3, 'Silver');
insert into LoaiKhach values(4, 'Member');
insert into KhachHang values(1,'Nguyen Van A','1988:01:01', 0 , '201561121', '0935123451','a1@a.com', 1, 'Đà Nẵng');
insert into KhachHang values(2,'Nguyen Van B','1968:01:01', 0 , '201561122', '0935123452','a2@a.com', 1, 'Quảng Ngãi');
insert into KhachHang values(3,'Nguyen Van C','1908:01:01', 0 , '201561123', '0935123453','a3@a.com', 1, 'Vinh');
insert into KhachHang values(4,'Nguyen Van E','1985:01:01', 0 , '201561124', '0935123454','a4@a.com', 1, 'Nghe An');
insert into KhachHang values(5,'Nguyen Van D','1908:01:01', 0 , '201561125', '0935123455','a5@a.com', 1, 'Quảng Trị');

insert into DichVuDiKem values(1, 'karaoke', 50000, 1,'Kha dung');
insert into DichVuDiKem values(2, 'nước ngọt', 10000, 1,'Kha dung');
insert into DichVuDiKem values(3, 'Khăn mặt', 5000, 1,'Kha dung');
insert into DichVuDiKem values(4, 'matxa', 50000, 1,'Kha dung');

insert into HopDong values(1,'2019:11:05','2019:11:15',300000,20000000,1,1,1);
insert into HopDong values(2,'2019:06:15','2019:11:25',200000,50000000,3,2,2);
insert into HopDong values(3,'2019:07:15','2019:11:25',300000,30000000,3,1,3);
insert into HopDong values(4,'2012:01:01','2019:11:25',300000,10000000,3,1,3);
insert into HopDong values(5,'2017:02:02','2019:11:25',300000,10000000,1,2,1);
insert into HopDong values(6,'2019:09:02','2019:11:25',300000,10000000,4,3,1);
insert into HopDong values(7,'2019:08:02','2019:11:25',300000,10000000,5,3,4);
insert into HopDong values(8,'2016:09:02','2019:11:25',300000,10000000,5,3,4);
insert into HopDong values(9,'2013:11:02','2019:11:25',300000,10000000,5,3,3);
insert into HopDong values(10,'2019:12:02','2019:11:25',300000,10000000,1,3,1);
insert into HopDong values(11,'2019:08:02','2019:11:25',300000,10000000,1,1,5);
insert into HopDong values(12,'2019:11:02','2019:11:25',300000,10000000,4,4,5);
insert into HopDong values(13,'2019:12:02','2019:11:25',300000,10000000,5,5,5);
insert into HopDong values(14,'2015:10:02','2019:11:25',300000,10000000,3,3,5);

insert into HopDongChiTiet values(1,1,1);
insert into HopDongChiTiet values(1,2,5);
insert into HopDongChiTiet values(1,3,10);
insert into HopDongChiTiet values(2,1,1);
insert into HopDongChiTiet values(2,2,10);
insert into HopDongChiTiet values(2,3,20);
insert into HopDongChiTiet values(3,1,5);
insert into HopDongChiTiet values(4,1,5);
insert into HopDongChiTiet values(5,1,5);
insert into HopDongChiTiet values(9,2,5);
insert into HopDongChiTiet values(10,3,5);
insert into HopDongChiTiet values(12,4,5);
insert into HopDongChiTiet values(7,1,1);
insert into HopDongChiTiet values(8,1,1);
insert into HopDongChiTiet values(9,1,1);
insert into HopDongChiTiet values(10,1,1);
insert into HopDongChiTiet values(11,1,1);
insert into HopDongChiTiet values(12,1,1);

select * from ViTri;
select * from TrinhDo;
select * from BoPhan;
select * from NhanVien;
select * from LoaiDichVu;
select * from KieuThue;
select * from DichVu;
select * from LoaiKhach;
select * from KhachHang;
select * from DichVuDiKem;
select * from HopDong;
select * from HopDongChiTiet;

-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống 
-- có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.
select * from nhanvien
where HoTen like '%H%' or HoTen like '%K%' or HoTen like  '%T%' 
having char_length(nhanvien.HoTen)<15;

-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi 
-- và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select *, (extract(year from curdate()) - extract(year from ngaysinh)) as 'tuoi' from khachhang
where diachi='Quảng Trị' or diachi='Đà Nẵng'
having (extract(year from curdate())-extract( year from ngaysinh))>18 
and (extract(year from curdate())-extract( year from ngaysinh))<50;

-- 4.Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. 	
-- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
-- Chỉ  những khách hàng nào có Tên loại khách hàng là “Diamond”.
SELECT KhachHang.IDKhachHang,HoTen,NgaySinh,GioiTinh,SoCMND,SDT,Email,DiaChi,TenLoaiKhach,
count(KhachHang.IDKhachHang) as 'so lan thue'
from LoaiKhach 
inner join KhachHang 
on loaikhach.IDLoaiKhach=KhachHang.IDLoaiKhach
inner join HopDong
on HopDong.IDKhachHang=KhachHang.IDKhachHang
where TenLoaiKhach='Diamond' 
group by KhachHang.IDKhachHang;

-- 5.	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien 
-- (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) 
-- cho tất cả các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra). 

select khachhang.IDKhachHang,khachhang.HoTen,loaikhach.TenLoaiKhach,
hopdong.IDHopDong,hopdong.NgayLamHopDong,hopdong.NgayKetThuc,ChiPhiThue + dichvudikem.Gia*hopdongchitiet.SoLuong as tongtien
from  hopdong
inner join hopdongchitiet
on hopdong.IDHopDong=hopdongchitiet.IDHopDong
inner join dichvudikem
on hopdongchitiet.IDDichVuDiKem=dichvudikem.IDDichVuDiKem
inner join dichvu
on hopdong.IDDichVu=dichvu.IDDichVu
inner join kieuthue
on dichvu.IDKieuThue=kieuthue.IDKieuThue
inner join loaidichvu
on dichvu.IDLoaiDichVu=loaidichvu.IDLoaiDichVu
right join khachhang
on khachhang.IDKhachHang=hopdong.IDKhachHang
inner join loaikhach
on loaikhach.IDLoaiKhach=khachhang.IDLoaiKhach;

-- 6.	Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu của tất cả các loại Dịch vụ 
-- chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).
select dichvu.IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu,NgayLamHopDong
from dichvu
inner join loaidichvu
on loaidichvu.IDLoaiDichVu=dichvu.IDLoaiDichVu
left join hopdong
on hopdong.IDDichVu=dichvu.IDDichVu
where dichvu.IDDichVu not in (select IDDichVu from hopdong where year(ngaylamhopdong)=2019 and quarter(ngaylamhopdong)=1 group by dichvu.IDDichVu)
group by dichvu.IDDichVu;

-- 7.	Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu 
-- của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 
-- nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.

select dichvu.iddichvu,idkhachhang,tendichvu,dientich,songuoitoida,chiphithue,tenloaidichvu,NgayLamHopDong
from loaidichvu 
inner join dichvu 
on dichvu.IDLoaiDichVu=loaidichvu.IDLoaiDichVu
inner join hopdong
on hopdong.IDDichVu=dichvu.IDDichVu
where year(ngaylamhopdong)=2018 and
hopdong.iddichvu not in (select distinct hopdong.iddichvu from hopdong where year(ngaylamhopdong)=2019)
group by hopdong.iddichvu;

-- 8.	Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên
select khachhang.hoten from khachhang group by khachhang.hoten;
select distinct khachhang.hoten from khachhang;
select khachhang.hoten from khachhang 
union select khachhang.hoten from khachhang;

-- 9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019
--  thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.

select temp.month,count(month(hopdong.ngaylamhopdong)) as so_khach_hang_dang_ky,sum(hopdong.tongtien) as tong_tien 
from
(select 1 as month
union select 2 as month
union select 3 as month
union select 4 as month
union select 5 as month
union select 6 as month
union select 7 as month
union select 8 as month
union select 9 as month
union select 10 as month
union select 11 as month
union select 12 as month) as temp 
left join hopdong 
on month(hopdong.ngaylamhopdong)=temp.month
left join khachhang
on khachhang.idkhachhang=hopdong.idkhachhang
where year(hopdong.ngaylamhopdong)=2019 or month(hopdong.ngaylamhopdong) is null
group by temp.month 
order by temp.month asc;
-- 10.	Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. 
-- Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, 
-- SoLuongDichVuDiKem (được tính dựa trên việc count các IDHopDongChiTiet).
select hopdong.idhopdong,count(hopdongchitiet.idhopdong)
from hopdong
left join hopdongchitiet
on hopdongchitiet.idhopdong=hopdong.idhopdong
group by hopdong.idhopdong
order by hopdong.idhopdong;
-- 11.	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng 
-- có TenLoaiKhachHang là “Diamond” và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.
select dichvudikem.IDDichVuDiKem,tendichvudikem,Gia,DonVi,TrangThaiKhaDung,khachhang.hoten,hopdong.idhopdong,loaikhach.tenloaikhach,khachhang.diachi
from dichvudikem
inner join hopdongchitiet
on hopdongchitiet.iddichvudikem=dichvudikem.iddichvudikem
inner join hopdong
on hopdong.idhopdong=hopdongchitiet.idhopdong
inner join khachhang
on khachhang.idkhachhang=hopdong.idkhachhang
inner join loaikhach
on loaikhach.idloaikhach=khachhang.idloaikhach
where loaikhach.tenloaikhach='Diamond' and khachhang.diachi in ('quảng ngãi','đà nẵng');
-- 12.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu,
-- SoLuongDichVuDikem (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc của tất cả các dịch vụ
-- đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.
select dichvu.iddichvu, nhanvien.hoten as ho_ten_nhan_vien, khachhang.hoten as ho_ten_khach_hang,
 khachhang.SDT, dichvu.TenDichVu,count(iddichvudikem) as SoLuongDichVuDikem
 from (select iddichvu,idkhachhang,idnhanvien,idhopdong from hopdong 
		where quarter(ngaylamhopdong)=4 and year(ngaylamhopdong)=2019
		and hopdong.iddichvu not in(select hopdong.iddichvu from hopdong
									where quarter(ngaylamhopdong)in (1,2) and year(ngaylamhopdong)=2019)) as temp
inner join khachhang on khachhang.idkhachhang=temp.idkhachhang
inner join nhanvien on nhanvien.idnhanvien=temp.idnhanvien
inner join dichvu on dichvu.iddichvu=temp.iddichvu
left join hopdongchitiet on hopdongchitiet.idhopdong=temp.idhopdong
group by temp.iddichvu;
-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
-- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
select * from (select dichvudikem.iddichvudikem,tendichvudikem,hopdong.idhopdong,count(dichvudikem.iddichvudikem)as so_lan_su_dung
				from dichvudikem
				inner join hopdongchitiet
				on dichvudikem.iddichvudikem=hopdongchitiet.iddichvudikem
                inner join hopdong
				on hopdong.idhopdong=hopdongchitiet.idhopdong
				group by dichvudikem.iddichvudikem)as temp
having so_lan_su_dung=max(so_lan_su_dung);

-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất.
-- Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.

select hopdong.idhopdong,tenloaidichvu,tendichvudikem,count(hopdongchitiet.IDDichVuDiKem)as so_lan_su_dung from dichvudikem
inner join hopdongchitiet
on hopdongchitiet.iddichvudikem=dichvudikem.IDDichVuDiKem
inner join hopdong
on hopdong.IDHopDong=hopdongchitiet.IDHopDong
inner join dichvu
on dichvu.iddichvu=hopdong.iddichvu
inner join loaidichvu
on loaidichvu.idloaidichvu=dichvu.idloaidichvu
group by hopdongchitiet.IDDichVuDiKem
having so_lan_su_dung=1;

-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai,
-- DiaChi mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.
select nhanvien.idnhanvien,hoten,trinhdo.trinhdo,bophan.tenbophan,nhanvien.SDT,nhanvien.diachi,hopdong.idhopdong,count(nhanvien.idnhanvien)as so_luong_hop_dong
from trinhdo
inner join nhanvien
on nhanvien.idtrinhdo=trinhdo.idtrinhdo
inner join bophan
on bophan.idbophan=nhanvien.idbophan
inner join hopdong
on hopdong.idnhanvien=nhanvien.idnhanvien
where ngaylamhopdong between '2018-01-01' and '2019-12-31'
group by nhanvien.idnhanvien
having so_luong_hop_dong<=3;
-- 17.	Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond, 
-- chỉ cập nhật những khách hàng đã từng đặt phòng với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.
update khachhang ,(select idkhachhang,sum(hopdong.TongTien)as tong_tien from hopdong
where year(ngaylamhopdong)=2019
group by idkhachhang
having tong_tien >10000000)as temp
set khachhang.idloaikhach=(select idloaikhach as loaikhach from loaikhach where tenloaikhach='Diamond')
where khachhang.idloaikhach=(select idloaikhach from loaikhach where tenloaikhach='Platinium')
and khachhang.idkhachhang=temp.idkhachhang;
-- 18.	Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràngbuộc giữa các bảng).
delete hopdongchitiet,hopdong,khachhang
from khachhang inner join hopdong
on khachhang.idkhachhang=hopdong.idkhachhang
inner join hopdongchitiet
on hopdong.idhopdong=hopdongchitiet.idhopdong
where not exists (select hopdong.idhopdong where year(hopdong.ngaylamhopdong)>2016 and khachhang.idkhachhang =hopdong.idkhachhang);

-- 19.	Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 lên gấp đôi.
update dichvudikem ,(select dichvudikem.iddichvudikem,count(dichvudikem.iddichvudikem)as so_lan_su_dung from dichvudikem
inner join hopdongchitiet on hopdongchitiet.iddichvudikem=dichvudikem.iddichvudikem
inner join hopdong on hopdong.idhopdong=hopdongchitiet.idhopdong
group by dichvudikem.iddichvudikem
having so_lan_su_dung >10) as temp
set dichvudikem.gia=dichvudikem.gia*2
where dichvudikem.iddichvudikem=temp.iddichvudikem;
-- 20.	Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống, 
-- thông tin hiển thị bao gồm ID (IDNhanVien, IDKhachHang), HoTen, Email, So DienThoai, NgaySinh, DiaChi
select nhanvien.IDNhanVien as id,nhanvien.hoten,nhanvien.Email,nhanvien.SDT,nhanvien.email,nhanvien.DiaChi,'nhan vien' as Fromtable
from nhanvien
union all
select khachhang.idkhachhang ,khachhang.hoten,khachhang.Email,khachhang.SDT,khachhang.email,khachhang.DiaChi,'khac hang' as Fromtable
from khachhang;