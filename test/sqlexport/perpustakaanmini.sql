-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 24, 2018 at 09:15 PM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpustakaanmini`
--

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `idbuku` varchar(255) NOT NULL,
  `judul` varchar(255) NOT NULL,
  `kategori` varchar(255) NOT NULL,
  `harga` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`idbuku`, `judul`, `kategori`, `harga`) VALUES
('B001', 'Wiro Sableng 212', 'Komik', 1000),
('B002', 'Harry Potter', 'Novel', 1500),
('B003', 'Software Engineering', 'Pendidikan', 1000),
('B004', 'Programming JSF Pemula', 'Pendidikan', 500);

-- --------------------------------------------------------

--
-- Table structure for table `penyewa`
--

CREATE TABLE `penyewa` (
  `idpenyewa` varchar(255) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `alamat` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penyewa`
--

INSERT INTO `penyewa` (`idpenyewa`, `nama`, `alamat`) VALUES
('T001', 'Sandy', 'Taman Kopo Indah V blok I no 99 Bandung'),
('T002', 'Fahmi', 'Metro no.19 Lampung'),
('T003', 'Andi', 'Katapang Regency 1 no. 3'),
('T004', 'Petra Nugra Sukaria', 'Jln Sauyunan IX No.031'),
('T006', 'Sule', 'Jl Prikitiew No.031');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `idtransaksi` varchar(100) NOT NULL,
  `idbuku` varchar(100) NOT NULL,
  `idpenyewa` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`idbuku`);

--
-- Indexes for table `penyewa`
--
ALTER TABLE `penyewa`
  ADD PRIMARY KEY (`idpenyewa`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`idtransaksi`),
  ADD KEY `idbuku` (`idbuku`),
  ADD KEY `idpenyewa` (`idpenyewa`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`idbuku`) REFERENCES `buku` (`idbuku`),
  ADD CONSTRAINT `transaksi_ibfk_2` FOREIGN KEY (`idpenyewa`) REFERENCES `penyewa` (`idpenyewa`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
