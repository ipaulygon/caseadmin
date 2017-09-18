-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 18, 2017 at 06:15 PM
-- Server version: 5.7.14
-- PHP Version: 7.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `user_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `assigned_case`
--

CREATE TABLE `assigned_case` (
  `id` int(11) NOT NULL,
  `case_id` int(11) NOT NULL,
  `justice_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `assigned_case`
--

INSERT INTO `assigned_case` (`id`, `case_id`, `justice_id`) VALUES
(1, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `assigned_permission`
--

CREATE TABLE `assigned_permission` (
  `id` int(11) NOT NULL,
  `description` varchar(250) DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  `permission_id` int(11) NOT NULL,
  `permission_status` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `assigned_permission`
--

INSERT INTO `assigned_permission` (`id`, `description`, `user_id`, `permission_id`, `permission_status`) VALUES
(1, 'User Update', 1, 2, 'Y'),
(2, 'View Cases', 1, 7, 'Y'),
(4, 'Add Case', 1, 4, 'Y'),
(5, 'Edit Case', 1, 5, 'Y'),
(6, 'Raffle', 1, 6, 'Y');

-- --------------------------------------------------------

--
-- Table structure for table `case_entries`
--

CREATE TABLE `case_entries` (
  `id` int(11) NOT NULL,
  `caseNo` varchar(200) NOT NULL,
  `caseTitle` varchar(1000) NOT NULL,
  `natureOfCase` varchar(1000) DEFAULT NULL,
  `caseCategory` varchar(100) NOT NULL,
  `caseStatus` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `case_entries`
--

INSERT INTO `case_entries` (`id`, `caseNo`, `caseTitle`, `natureOfCase`, `caseCategory`, `caseStatus`) VALUES
(1, 'CC1234', 'Samples', NULL, 'Criminal Case', 'Assigned');

-- --------------------------------------------------------

--
-- Table structure for table `idgenerator`
--

CREATE TABLE `idgenerator` (
  `tableName` varchar(50) NOT NULL,
  `nextNumber` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `idgenerator`
--

INSERT INTO `idgenerator` (`tableName`, `nextNumber`) VALUES
('tbluser', 1);

-- --------------------------------------------------------

--
-- Table structure for table `justice`
--

CREATE TABLE `justice` (
  `id` int(11) NOT NULL,
  `name` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `justice`
--

INSERT INTO `justice` (`id`, `name`) VALUES
(1, 'Justice Reyes'),
(2, 'Justice Sereno');

-- --------------------------------------------------------

--
-- Table structure for table `permissiontbl`
--

CREATE TABLE `permissiontbl` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `value` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `permissiontbl`
--

INSERT INTO `permissiontbl` (`id`, `name`, `value`) VALUES
(2, 'User Update', 'menu_editUser'),
(4, 'Add Case', 'menu_addCase'),
(5, 'Edit Case', 'menu_editCase'),
(6, 'Raffle', 'menu_raffle'),
(7, 'View Cases', 'menu_viewCase');

-- --------------------------------------------------------

--
-- Table structure for table `tbluser`
--

CREATE TABLE `tbluser` (
  `id` int(11) NOT NULL,
  `firstName` varchar(50) NOT NULL,
  `middleName` varchar(50) DEFAULT NULL,
  `lastName` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `isAdmin` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbluser`
--

INSERT INTO `tbluser` (`id`, `firstName`, `middleName`, `lastName`, `username`, `password`, `isAdmin`) VALUES
(1, 'Paul', NULL, 'Cruz', 'admin', 'd033e22ae348aeb5660fc2140aec35850c4da997', '1');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `assigned_case`
--
ALTER TABLE `assigned_case`
  ADD PRIMARY KEY (`id`),
  ADD KEY `case_id_constraint` (`case_id`),
  ADD KEY `justice_id_constraint` (`justice_id`);

--
-- Indexes for table `assigned_permission`
--
ALTER TABLE `assigned_permission`
  ADD PRIMARY KEY (`id`),
  ADD KEY `user_id_constraint` (`user_id`),
  ADD KEY `permission_id_constraint` (`permission_id`);

--
-- Indexes for table `case_entries`
--
ALTER TABLE `case_entries`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `idgenerator`
--
ALTER TABLE `idgenerator`
  ADD PRIMARY KEY (`tableName`);

--
-- Indexes for table `justice`
--
ALTER TABLE `justice`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `permissiontbl`
--
ALTER TABLE `permissiontbl`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbluser`
--
ALTER TABLE `tbluser`
  ADD PRIMARY KEY (`id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `assigned_case`
--
ALTER TABLE `assigned_case`
  ADD CONSTRAINT `case_id_constraint` FOREIGN KEY (`case_id`) REFERENCES `case_entries` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `justice_id_constraint` FOREIGN KEY (`justice_id`) REFERENCES `justice` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `assigned_permission`
--
ALTER TABLE `assigned_permission`
  ADD CONSTRAINT `permission_id_constraint` FOREIGN KEY (`permission_id`) REFERENCES `permissiontbl` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `user_id_constraint` FOREIGN KEY (`user_id`) REFERENCES `tbluser` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
