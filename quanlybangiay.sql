-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 15, 2018 at 11:17 AM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quanlybangiay`
--

-- --------------------------------------------------------

--
-- Table structure for table `hoadonchitietnhap`
--

CREATE TABLE `hoadonchitietnhap` (
  `maHDN` varchar(30) CHARACTER SET utf8 NOT NULL,
  `maSP` varchar(30) CHARACTER SET utf8 NOT NULL,
  `soLuong` int(11) NOT NULL,
  `thanhTien` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hoadonchitietnhap`
--

INSERT INTO `hoadonchitietnhap` (`maHDN`, `maSP`, `soLuong`, `thanhTien`) VALUES
('H01', 'S01', 4, 3600000),
('H01', 'S02', 3, 4500000),
('H02', 'S03', 10, 15000000),
('H02', 'S05', 3, 2550000),
('H03', 'S04', 6, 14000000),
('H04', 'S01', 9, 10000000),
('H04', 'S04', 10, 10000000),
('H04', 'S05', 1, 850000),
('H05', 'S05', 11, 85000000),
('H06', 'S01', 6, 5400000);

-- --------------------------------------------------------

--
-- Table structure for table `hoadonchitietxuat`
--

CREATE TABLE `hoadonchitietxuat` (
  `maHDX` varchar(30) CHARACTER SET utf8 NOT NULL,
  `maSP` varchar(30) CHARACTER SET utf8 NOT NULL,
  `soLuong` int(11) NOT NULL,
  `thanhTien` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hoadonchitietxuat`
--

INSERT INTO `hoadonchitietxuat` (`maHDX`, `maSP`, `soLuong`, `thanhTien`) VALUES
('H01', 'S01', 2, 2400000),
('H01', 'S04', 1, 1350000),
('H01', 'S05', 2, 2000000),
('H02', 'S01', 1, 1200000),
('H02', 'S02', 1, 1200000),
('H02', 'S04', 2, 2700000),
('H03', 'S05', 1, 1200000),
('H04', 'S03', 4, 6400000),
('H05', 'S04', 3, 4050000);

-- --------------------------------------------------------

--
-- Table structure for table `hoadonnhap`
--

CREATE TABLE `hoadonnhap` (
  `maHDN` varchar(30) CHARACTER SET utf8 NOT NULL,
  `maNCC` varchar(30) CHARACTER SET utf8 NOT NULL,
  `maNV` varchar(30) CHARACTER SET utf8 NOT NULL,
  `ngayLap` date DEFAULT NULL,
  `ngayNhanHang` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hoadonnhap`
--

INSERT INTO `hoadonnhap` (`maHDN`, `maNCC`, `maNV`, `ngayLap`, `ngayNhanHang`) VALUES
('H01', 'NCC01', 'N01', '2018-09-26', '2018-09-26'),
('H02', 'NCC02', 'N02', '2018-09-27', '2018-09-26'),
('H03', 'NCC05', 'N01', '2018-09-26', '2018-09-26'),
('H04', 'NCC04', 'N04', '2018-09-26', '2018-09-26'),
('H05', 'NCC02', 'N03', '2018-09-27', '2018-09-29'),
('H06', 'NCC01', 'N02', '2018-02-06', '2018-02-05');

-- --------------------------------------------------------

--
-- Table structure for table `hoadonxuat`
--

CREATE TABLE `hoadonxuat` (
  `maHDX` varchar(30) CHARACTER SET utf8 NOT NULL,
  `maKH` varchar(30) CHARACTER SET utf8 NOT NULL,
  `maNV` varchar(30) CHARACTER SET utf8 NOT NULL,
  `ngayLap` date DEFAULT NULL,
  `ngayXuatHang` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hoadonxuat`
--

INSERT INTO `hoadonxuat` (`maHDX`, `maKH`, `maNV`, `ngayLap`, `ngayXuatHang`) VALUES
('H01', 'K01', 'N01', '2018-10-22', '2018-07-21'),
('H02', 'K02', 'N03', '2018-10-22', '2018-06-05'),
('H03', 'K03', 'N04', '2018-10-22', '2018-09-29'),
('H04', 'K04', 'N05', '2018-10-22', '2018-10-15'),
('H05', 'K05', 'N02', '2018-10-22', '2018-01-06');

-- --------------------------------------------------------

--
-- Table structure for table `khachhang`
--

CREATE TABLE `khachhang` (
  `maKH` varchar(30) CHARACTER SET utf8 NOT NULL,
  `hoTen` varchar(127) CHARACTER SET utf8 NOT NULL,
  `ngaysinh` date NOT NULL,
  `gioiTinh` varchar(10) CHARACTER SET utf8 NOT NULL,
  `diaChi` varchar(127) CHARACTER SET utf8 NOT NULL,
  `dienThoai` varchar(12) CHARACTER SET utf8 NOT NULL,
  `email` varchar(30) CHARACTER SET utf8 NOT NULL,
  `cmnd` varchar(20) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `khachhang`
--

INSERT INTO `khachhang` (`maKH`, `hoTen`, `ngaysinh`, `gioiTinh`, `diaChi`, `dienThoai`, `email`, `cmnd`) VALUES
('K01', 'Vũ Duy Mạnh', '1998-09-02', 'Nam', 'Thái Bình', '0949324909', 'manh@gmail.com', '152223668'),
('K02', 'Lê Đình Phúc', '1998-08-04', 'Nam', 'Thanh Hóa', '0949324905', 'phuc@gmail.com', '213456789'),
('K03', 'Phạm Ngọc Minh', '1998-02-03', 'Nam', 'Điện Biên', '0949324906', 'minh@gmail.com', '342156789'),
('K04', 'Trần Thị Hằng', '1998-02-01', 'Nữ', 'Hà Nội', '0949324901', 'hang@gmail.com', '987654321'),
('K05', 'Lương Quốc Thái', '1994-02-03', 'Nam', 'Vũng Tàu', '0949324907', 'thai@gmail.com', '987654321');

-- --------------------------------------------------------

--
-- Table structure for table `nhacungcap`
--

CREATE TABLE `nhacungcap` (
  `maNCC` varchar(30) CHARACTER SET utf8 NOT NULL,
  `tenNCC` varchar(127) CHARACTER SET utf8 NOT NULL,
  `diaChi` varchar(127) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `nhacungcap`
--

INSERT INTO `nhacungcap` (`maNCC`, `tenNCC`, `diaChi`) VALUES
('NCC01', 'Converse', 'America'),
('NCC02', 'Adidas', 'America'),
('NCC03', 'Nike', 'America'),
('NCC04', 'New Balance', 'England'),
('NCC05', 'Vans', 'China');

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `maNV` varchar(30) CHARACTER SET utf8 NOT NULL,
  `hoTen` varchar(127) CHARACTER SET utf8 NOT NULL,
  `ngaySinh` date NOT NULL,
  `chucVu` varchar(40) CHARACTER SET utf8 NOT NULL,
  `gioiTinh` varchar(10) CHARACTER SET utf8 NOT NULL,
  `dienThoai` varchar(12) CHARACTER SET utf8 NOT NULL,
  `email` varchar(30) CHARACTER SET utf8 NOT NULL,
  `diaChi` varchar(127) CHARACTER SET utf8 NOT NULL,
  `cmnd` varchar(20) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`maNV`, `hoTen`, `ngaySinh`, `chucVu`, `gioiTinh`, `dienThoai`, `email`, `diaChi`, `cmnd`) VALUES
('N01', 'Phạm Hải Anh', '1994-02-05', 'Nhân viên', 'Nam', '0934013056', 'anh94@gmail.com', 'Hà Nội', '0349582957'),
('N02', 'Trần Thiên Đức', '1994-05-02', 'Nhân viên', 'Nam', '0946036823', 'duc05@gmail.com', 'Hà Tĩnh', '0285892959'),
('N03', 'Nguyễn Thị Oanh', '1992-08-08', 'Nhân viên', 'Nữ', '0947068933', 'oanhnt92@gmail.com', 'Nghệ An ', '1463456278'),
('N04', 'Hoàng Minh Sơn', '1990-04-12', 'Nhân viên', 'Nam', '0943055687', 'paint90@gmail.com', 'Nam Định', '1354665768'),
('N05', 'Nguyễn Hải Hậu', '1993-02-19', 'Quản lý', 'Nữ', '0948346713', 'haucute93@gmail.com', 'Hà Nội', '1346577688');

-- --------------------------------------------------------

--
-- Table structure for table `sanpham`
--

CREATE TABLE `sanpham` (
  `maSP` varchar(30) CHARACTER SET utf8 NOT NULL,
  `tenSP` varchar(127) CHARACTER SET utf8 NOT NULL,
  `maNCC` varchar(30) CHARACTER SET utf8 NOT NULL,
  `nhaSanXuat` varchar(127) CHARACTER SET utf8 NOT NULL,
  `donGiaNhap` int(11) NOT NULL,
  `donGiaXuat` int(11) NOT NULL,
  `theLoai` varchar(30) CHARACTER SET utf8 NOT NULL,
  `donViTinh` varchar(10) CHARACTER SET utf8 NOT NULL,
  `kichThuoc` int(11) NOT NULL,
  `mau` varchar(10) CHARACTER SET utf8 NOT NULL,
  `gender` varchar(10) CHARACTER SET utf8 NOT NULL,
  `soLuongCon` int(11) NOT NULL,
  `tongSoLuong` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `sanpham`
--

INSERT INTO `sanpham` (`maSP`, `tenSP`, `maNCC`, `nhaSanXuat`, `donGiaNhap`, `donGiaXuat`, `theLoai`, `donViTinh`, `kichThuoc`, `mau`, `gender`, `soLuongCon`, `tongSoLuong`) VALUES
('S01', 'Converse classic cao cổ vàng', 'NCC01', 'Converse', 900000, 1200000, 'Sneaker', 'đôi', 41, 'Vàng', 'Unisex', 10, 100),
('S02', 'New Blance 500 Sneaker', 'NCC04', 'New Blance', 1500000, 1700000, 'Sneaker', 'đôi', 40, 'Đen trắng', 'Unisex', 20, 200),
('S03', 'Vans Vault', 'NCC05', 'Vans', 1400000, 1600000, 'Sneaker', 'đôi', 43, 'Đen trắng', 'Unisex', 5, 150),
('S04', 'Adidas Ultraboost', 'NCC02', 'Adidas', 1000000, 1350000, 'Lifestyle', 'đôi', 42, 'Xanh ', 'Women', 25, 50),
('S05', 'Nike Air Max', 'NCC03', 'Nike', 850000, 1000000, 'Sneaker', 'đôi', 39, 'Trắng', 'Men', 10, 44);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `hoadonchitietnhap`
--
ALTER TABLE `hoadonchitietnhap`
  ADD PRIMARY KEY (`maHDN`,`maSP`),
  ADD KEY `maSP` (`maSP`);

--
-- Indexes for table `hoadonchitietxuat`
--
ALTER TABLE `hoadonchitietxuat`
  ADD PRIMARY KEY (`maHDX`,`maSP`),
  ADD KEY `maSP` (`maSP`);

--
-- Indexes for table `hoadonnhap`
--
ALTER TABLE `hoadonnhap`
  ADD PRIMARY KEY (`maHDN`),
  ADD KEY `maNV` (`maNV`),
  ADD KEY `maNCC` (`maNCC`);

--
-- Indexes for table `hoadonxuat`
--
ALTER TABLE `hoadonxuat`
  ADD PRIMARY KEY (`maHDX`),
  ADD KEY `maNV` (`maNV`),
  ADD KEY `maKH` (`maKH`);

--
-- Indexes for table `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`maKH`);

--
-- Indexes for table `nhacungcap`
--
ALTER TABLE `nhacungcap`
  ADD PRIMARY KEY (`maNCC`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`maNV`);

--
-- Indexes for table `sanpham`
--
ALTER TABLE `sanpham`
  ADD PRIMARY KEY (`maSP`),
  ADD KEY `maNCC` (`maNCC`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `hoadonchitietnhap`
--
ALTER TABLE `hoadonchitietnhap`
  ADD CONSTRAINT `hoadonchitietnhap_ibfk_1` FOREIGN KEY (`maHDN`) REFERENCES `hoadonnhap` (`maHDN`),
  ADD CONSTRAINT `hoadonchitietnhap_ibfk_2` FOREIGN KEY (`maSP`) REFERENCES `sanpham` (`maSP`);

--
-- Constraints for table `hoadonchitietxuat`
--
ALTER TABLE `hoadonchitietxuat`
  ADD CONSTRAINT `hoadonchitietxuat_ibfk_1` FOREIGN KEY (`maHDX`) REFERENCES `hoadonxuat` (`maHDX`),
  ADD CONSTRAINT `hoadonchitietxuat_ibfk_2` FOREIGN KEY (`maSP`) REFERENCES `sanpham` (`maSP`);

--
-- Constraints for table `hoadonnhap`
--
ALTER TABLE `hoadonnhap`
  ADD CONSTRAINT `hoadonnhap_ibfk_1` FOREIGN KEY (`maNV`) REFERENCES `nhanvien` (`maNV`),
  ADD CONSTRAINT `hoadonnhap_ibfk_2` FOREIGN KEY (`maNCC`) REFERENCES `nhacungcap` (`maNCC`);

--
-- Constraints for table `hoadonxuat`
--
ALTER TABLE `hoadonxuat`
  ADD CONSTRAINT `hoadonxuat_ibfk_1` FOREIGN KEY (`maNV`) REFERENCES `nhanvien` (`maNV`),
  ADD CONSTRAINT `hoadonxuat_ibfk_2` FOREIGN KEY (`maKH`) REFERENCES `khachhang` (`maKH`);

--
-- Constraints for table `sanpham`
--
ALTER TABLE `sanpham`
  ADD CONSTRAINT `sanpham_ibfk_1` FOREIGN KEY (`maNCC`) REFERENCES `nhacungcap` (`maNCC`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
