-- phpMyAdmin SQL Dump
-- version 4.0.9
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 12, 2020 at 11:31 PM
-- Server version: 5.6.14
-- PHP Version: 5.5.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `sacities`
--

-- --------------------------------------------------------

--
-- Table structure for table `attractions`
--

CREATE TABLE IF NOT EXISTS `attractions` (
  `attraction_id` int(11) NOT NULL,
  `attraction` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`attraction_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `attractions`
--

INSERT INTO `attractions` (`attraction_id`, `attraction`) VALUES
(1, 'Voortrekker Monument'),
(2, 'Union Buildings'),
(3, 'Rietvlei Nature Reserve'),
(4, 'Apartheid Museum'),
(5, 'Gold Reef City'),
(6, 'Mandela''s House'),
(7, 'Cape of Good Hope'),
(8, 'Robben Island'),
(9, 'Table Mountain'),
(10, 'Kragga Kamma Game Park'),
(11, 'Sardinia Bay Beach'),
(12, 'Bayworld Museum'),
(13, 'uShaka Marine World'),
(14, 'Moses Mabida Stadium'),
(15, 'Durban Botanical Gardens');

-- --------------------------------------------------------

--
-- Table structure for table `cities`
--

CREATE TABLE IF NOT EXISTS `cities` (
  `city_id` int(11) NOT NULL,
  `city_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`city_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cities`
--

INSERT INTO `cities` (`city_id`, `city_name`) VALUES
(1, 'Pretoria'),
(2, 'Johannesburg'),
(3, 'CapeTown'),
(4, 'PortElizabeth'),
(5, 'Durban');

-- --------------------------------------------------------

--
-- Table structure for table `citiesattractions`
--

CREATE TABLE IF NOT EXISTS `citiesattractions` (
  `attraction_id` int(11) NOT NULL,
  `city_id` int(11) NOT NULL,
  PRIMARY KEY (`attraction_id`,`city_id`),
  KEY `fk_attractions_has_cities_cities1_idx` (`city_id`),
  KEY `fk_attractions_has_cities_attractions_idx` (`attraction_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `citiesattractions`
--

INSERT INTO `citiesattractions` (`attraction_id`, `city_id`) VALUES
(1, 1),
(2, 1),
(3, 1),
(4, 2),
(5, 2),
(6, 2),
(7, 3),
(8, 3),
(9, 3),
(10, 4),
(11, 4),
(12, 4),
(13, 5),
(14, 5),
(15, 5);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `citiesattractions`
--
ALTER TABLE `citiesattractions`
  ADD CONSTRAINT `fk_attractions_has_cities_attractions` FOREIGN KEY (`attraction_id`) REFERENCES `attractions` (`attraction_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_attractions_has_cities_cities1` FOREIGN KEY (`city_id`) REFERENCES `cities` (`city_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
