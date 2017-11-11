-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Nov 07, 2017 at 06:12 PM
-- Server version: 5.7.19
-- PHP Version: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gym`
--

-- --------------------------------------------------------

--
-- Table structure for table `class`
--

DROP TABLE IF EXISTS `class`;
CREATE TABLE IF NOT EXISTS `class` (
  `CLID` int(5) NOT NULL AUTO_INCREMENT,
  `ClassTimings` varchar(10) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `Title` varchar(20) DEFAULT NULL,
  `Cost` int(10) DEFAULT NULL,
  `Prerequisite` varchar(50) DEFAULT NULL,
  `RID` int(5) DEFAULT NULL,
  PRIMARY KEY (`CLID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `class`
--

INSERT INTO `class` (`CLID`, `ClassTimings`, `Date`, `Title`, `Cost`, `Prerequisite`, `RID`) VALUES
(1, '9-11', '2017-09-15', 'Special Yoga class', 200, 'None', 2),
(2, '2-4', '2017-09-20', 'Zumba class', 500, 'Weight less than 70', 1),
(3, '3-5', '2017-09-25', 'Diet Counselling', 100, 'None', 3);

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE IF NOT EXISTS `customer` (
  `CID` int(5) NOT NULL AUTO_INCREMENT,
  `CName` varchar(20) DEFAULT NULL,
  `CAge` int(3) DEFAULT NULL,
  `Phone` varchar(10) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Address` varchar(80) DEFAULT NULL,
  `Gender` varchar(5) DEFAULT NULL,
  `Height` int(5) DEFAULT NULL,
  `Weight` int(5) DEFAULT NULL,
  `MEMID` int(5) DEFAULT NULL,
  `DateOfMem` date DEFAULT NULL,
  `MemDeadline` int(5) DEFAULT NULL,
  PRIMARY KEY (`CID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`CID`, `CName`, `CAge`, `Phone`, `Email`, `Address`, `Gender`, `Height`, `Weight`, `MEMID`, `DateOfMem`, `MemDeadline`) VALUES
(1, 'Ramesh', 26, '9898979745', 'ramesh26@hotmail.com', 'B/26,khira nagar,santacruz(w)', 'M', 165, 70, 1, '2017-09-01', 3),
(2, 'Sahana', 22, '9191656565', 'sahana22@hotmail.com', 'A/6,Kunj vihar,mulund(w)', 'F', 158, 49, 1, '2017-08-01', 6),
(3, 'Krushika', 27, '9796959894', 'krushika27@gmail.com', '12,kushal nagar,khar(w)', 'F', 162, 57, 2, '2017-09-10', 3),
(4, 'Vishal', 35, '9879879870', 'vishal35@gmail.com', '204,Sea sunshine,juhu,santacruz(w)', 'M', 163, 62, 1, '2017-09-05', 1),
(5, 'Akshay', 28, '9197512365', 'akshay28@rediffmail.com', 'A/16,Aparna apartment,kurla(w)', 'M', 162, 71, 1, '2017-09-01', 6);

--
-- Triggers `customer`
--
DROP TRIGGER IF EXISTS `insertinusersoninsertcustomer`;
DELIMITER $$
CREATE TRIGGER `insertinusersoninsertcustomer` AFTER INSERT ON `customer` FOR EACH ROW insert into users(Username,Password,IsCustomer) values(new.CName,'',1)
$$
DELIMITER ;
DROP TRIGGER IF EXISTS `updatepaymentoninsertcustomer`;
DELIMITER $$
CREATE TRIGGER `updatepaymentoninsertcustomer` AFTER INSERT ON `customer` FOR EACH ROW insert into payment(Status,Amount,CID) values('Pending',(Select Fees from membership where MEMID=new.MEMID)*(new.MemDeadline),new.CID)
$$
DELIMITER ;
DROP TRIGGER IF EXISTS `updatepaymentonmembershipupgrade`;
DELIMITER $$
CREATE TRIGGER `updatepaymentonmembershipupgrade` BEFORE UPDATE ON `customer` FOR EACH ROW update payment set Amount= Amount+ (Select Fees from membership where MEMID=new.MEMID)-(Select Fees from membership where MEMID= old.MEMID) where CID=new.CID
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `customer_equipment`
--

DROP TABLE IF EXISTS `customer_equipment`;
CREATE TABLE IF NOT EXISTS `customer_equipment` (
  `CID` int(5) NOT NULL,
  `EID` int(5) NOT NULL,
  `Validity` varchar(10) DEFAULT NULL,
  `RentalDate` date DEFAULT NULL,
  PRIMARY KEY (`CID`,`EID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer_equipment`
--

INSERT INTO `customer_equipment` (`CID`, `EID`, `Validity`, `RentalDate`) VALUES
(2, 4, '3', '2017-09-01'),
(3, 2, '3', '2017-09-01'),
(5, 7, '3', '2017-09-01');

-- --------------------------------------------------------

--
-- Table structure for table `equipment`
--

DROP TABLE IF EXISTS `equipment`;
CREATE TABLE IF NOT EXISTS `equipment` (
  `EID` int(5) NOT NULL AUTO_INCREMENT,
  `MaintainenceCost` int(10) DEFAULT NULL,
  `Warranty` int(5) DEFAULT NULL,
  `Price` int(10) DEFAULT NULL,
  `Type` varchar(30) DEFAULT NULL,
  `RentalAmount` int(10) DEFAULT NULL,
  `FloorArea` int(5) DEFAULT NULL,
  PRIMARY KEY (`EID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `equipment`
--

INSERT INTO `equipment` (`EID`, `MaintainenceCost`, `Warranty`, `Price`, `Type`, `RentalAmount`, `FloorArea`) VALUES
(1, 1000, 5, 15000, 'Bench Press', 300, 4),
(2, 1000, 5, 25000, 'Hammer Strength machine', 300, 5),
(3, 700, 2, 20000, 'Reverse hyper', 200, 5),
(4, 800, 2, 15000, 'Hammer Strength machine', 200, 2),
(5, 1200, 3, 25000, 'Leg Curl machine', 350, 5),
(6, 700, 3, 20000, 'Leg press machine', 150, 6),
(7, 2500, 3, 60000, 'Squat Rack', 450, 10),
(8, 500, 1, 10000, 'Air resistance exercise bike', 100, 2),
(9, 1000, 2, 20000, 'Treadmill', 300, 5),
(10, 2000, 3, 40000, 'Spin Bike', 350, 4);

-- --------------------------------------------------------

--
-- Table structure for table `membership`
--

DROP TABLE IF EXISTS `membership`;
CREATE TABLE IF NOT EXISTS `membership` (
  `MEMID` int(5) NOT NULL AUTO_INCREMENT,
  `Fees` int(10) DEFAULT NULL,
  `PackageLevel` varchar(20) DEFAULT NULL,
  `Facility` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`MEMID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `membership`
--

INSERT INTO `membership` (`MEMID`, `Fees`, `PackageLevel`, `Facility`) VALUES
(1, 15000, 'Golden', 'Unlimited workout,Personal trainer,Shower,Locker'),
(2, 12000, 'Silver', '4 hrs workout per day,Personal trainer'),
(3, 8000, 'Bronze', '2 hrs workout per day');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
CREATE TABLE IF NOT EXISTS `payment` (
  `PID` int(5) NOT NULL AUTO_INCREMENT,
  `Status` varchar(20) DEFAULT NULL,
  `Amount` int(10) DEFAULT NULL,
  `LastDateOfPayment` date DEFAULT NULL,
  `ModeOfPayment` varchar(20) DEFAULT NULL,
  `CID` int(5) DEFAULT NULL,
  PRIMARY KEY (`PID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`PID`, `Status`, `Amount`, `LastDateOfPayment`, `ModeOfPayment`, `CID`) VALUES
(1, 'Pending', 8000, '2017-10-29', 'Cash', 1),
(2, 'Pending', 8000, '2017-09-10', 'Debit card', 2),
(3, 'Clear', 0, '2017-09-10', 'Debit card', 3),
(4, 'Pending', 1000, '2017-09-10', 'Cash', 4),
(5, 'Pending', 10000, '2017-09-10', 'Cash', 5);

--
-- Triggers `payment`
--
DROP TRIGGER IF EXISTS `updatestatus`;
DELIMITER $$
CREATE TRIGGER `updatestatus` BEFORE UPDATE ON `payment` FOR EACH ROW BEGIN
IF new.Amount=0 THEN
	SET new.Status='Clear';
END IF;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
CREATE TABLE IF NOT EXISTS `room` (
  `RID` int(5) NOT NULL,
  `Capacity` int(5) DEFAULT NULL,
  PRIMARY KEY (`RID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`RID`, `Capacity`) VALUES
(1, 100),
(2, 40),
(3, 200),
(4, 150);

-- --------------------------------------------------------

--
-- Table structure for table `signup`
--

DROP TABLE IF EXISTS `signup`;
CREATE TABLE IF NOT EXISTS `signup` (
  `CID` int(5) NOT NULL,
  `CLID` int(5) NOT NULL,
  `SignUpDate` date DEFAULT NULL,
  PRIMARY KEY (`CID`,`CLID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `signup`
--

INSERT INTO `signup` (`CID`, `CLID`, `SignUpDate`) VALUES
(1, 1, '2017-09-13'),
(4, 3, '2017-09-23');

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

DROP TABLE IF EXISTS `staff`;
CREATE TABLE IF NOT EXISTS `staff` (
  `SID` int(5) NOT NULL AUTO_INCREMENT,
  `SName` varchar(20) DEFAULT NULL,
  `SAge` int(2) DEFAULT NULL,
  `Salary` int(10) DEFAULT NULL,
  `Timings` varchar(10) DEFAULT NULL,
  `Experience` varchar(20) DEFAULT NULL,
  `Designation` varchar(20) DEFAULT NULL,
  `AreaOfExpertise` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`SID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`SID`, `SName`, `SAge`, `Salary`, `Timings`, `Experience`, `Designation`, `AreaOfExpertise`) VALUES
(1, 'Satish', 35, 25000, '9-5', '8', 'Manager', '-'),
(2, 'Tukaram', 45, 20000, '9-6', '12', 'Clerk', '-'),
(3, 'Rajnesh', 32, 10000, '12-2', '5', 'Trainer', 'Muscle building'),
(4, 'Yash', 27, 10000, '12-2', '3', 'Trainer', 'Yoga training'),
(5, 'Sarita', 27, 10000, '12-2', '3', 'Trainer', 'Nutrition consulting');

-- --------------------------------------------------------

--
-- Table structure for table `staff_class`
--

DROP TABLE IF EXISTS `staff_class`;
CREATE TABLE IF NOT EXISTS `staff_class` (
  `SID` int(5) NOT NULL,
  `CLID` int(5) NOT NULL,
  PRIMARY KEY (`SID`,`CLID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staff_class`
--

INSERT INTO `staff_class` (`SID`, `CLID`) VALUES
(3, 2),
(4, 1),
(5, 3);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `Username` varchar(10) NOT NULL,
  `Password` varchar(10) DEFAULT NULL,
  `IsCustomer` int(1) DEFAULT '1',
  PRIMARY KEY (`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`Username`, `Password`, `IsCustomer`) VALUES
('Akshay', 'a@123', 1),
('Krushika', 'qwerty', 1),
('Ramesh', 'star', 1),
('Sahana', 'asdfg', 1),
('Satish', '12345', 0),
('Vishal', 'hello', 1);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
