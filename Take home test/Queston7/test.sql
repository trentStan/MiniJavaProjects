-- phpMyAdmin SQL Dump
-- version 4.0.9
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 07, 2020 at 09:57 PM
-- Server version: 5.6.14
-- PHP Version: 5.5.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `test`
--

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE IF NOT EXISTS `book` (
  `title` varchar(40) NOT NULL,
  `author` varchar(40) NOT NULL,
  `pubYear` varchar(40) NOT NULL,
  `publisher` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`title`, `author`, `pubYear`, `publisher`) VALUES
('Head First Java', 'Griffiths', '2017', 'OReilly'),
('MySQL', 'Paul DuBois', '2013', 'Addison_Wesley'),
('PHP and Apache', 'Julie Melon', '2018', 'SAMS'),
('ZendiFramework', 'Rob Allen', '2016', 'Manning');

-- --------------------------------------------------------

--
-- Table structure for table `ens_subscribers`
--

CREATE TABLE IF NOT EXISTS `ens_subscribers` (
  `Username` varchar(25) NOT NULL,
  `Password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ens_subscribers`
--

INSERT INTO `ens_subscribers` (`Username`, `Password`) VALUES
('Ndai', 'toto4');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
