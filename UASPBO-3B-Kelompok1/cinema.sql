-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 27, 2024 at 09:55 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cinema`
--

-- --------------------------------------------------------

--
-- Table structure for table `movies`
--

CREATE TABLE `movies` (
  `ID` int(11) NOT NULL,
  `Movies` varchar(50) NOT NULL,
  `Seats` varchar(5) NOT NULL,
  `Days` varchar(20) NOT NULL,
  `Price` varchar(20) NOT NULL,
  `Status` enum('Available','Not Available') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `movies`
--

INSERT INTO `movies` (`ID`, `Movies`, `Seats`, `Days`, `Price`, `Status`) VALUES
(50, 'Inside Out 2', 'A1', 'Sunday', '35000', 'Available'),
(51, 'Inside Out 2', 'A2', 'Sunday', '35000', 'Available'),
(52, 'Inside Out 2', 'A3', 'Sunday', '35000', 'Available'),
(53, 'Inside Out 2', 'A4', 'Sunday', '35000', 'Available'),
(54, 'Inside Out 2', 'A5', 'Sunday', '35000', 'Available'),
(55, 'The Wild Robot', 'B1', 'Monday', '25000', 'Available'),
(56, 'The Wild Robot', 'B2', 'Monday', '25000', 'Available'),
(57, 'The Wild Robot', 'B3', 'Monday', '25000', 'Available'),
(58, 'The Wild Robot', 'B4', 'Monday', '25000', 'Available'),
(59, 'The Wild Robot', 'B5', 'Monday', '25000', 'Available');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `ID` int(11) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Phone` varchar(15) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `Role` enum('Admin','Customer') NOT NULL DEFAULT 'Customer',
  `AdtPassword` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`ID`, `Username`, `Email`, `Phone`, `Password`, `Role`, `AdtPassword`) VALUES
(21, 'Admin', 'admin@cinema.com', '081234567890', 'Admin', 'Admin', 'Teaema'),
(26, 'Adi Pratama Putra', 'adi@cinema.com', '081234567890', '55555', 'Customer', NULL),
(27, 'Hidayanthi Dwi Puja', 'puja@cinema.com', '081234567890', '22222', 'Customer', NULL),
(28, 'Fahru Rizal Al-Mufariz', 'fahru@cinema.com', '081234567890', '33333', 'Customer', NULL),
(29, 'Dunik Andriyani', 'dunik@cinema.com', '081234567890', '44444', 'Customer', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `movies`
--
ALTER TABLE `movies`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `movies`
--
ALTER TABLE `movies`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=60;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
