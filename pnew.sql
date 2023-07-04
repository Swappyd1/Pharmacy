/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.5.5-10.0.17-MariaDB : Database - pharmaproject
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`pharmaproject` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `pharmaproject`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `aid` int(100) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `admin` */

/*Table structure for table `cart` */

DROP TABLE IF EXISTS `cart`;

CREATE TABLE `cart` (
  `cartid` int(100) NOT NULL AUTO_INCREMENT,
  `custname` varchar(100) DEFAULT NULL,
  `selectedmedicine` varchar(100) DEFAULT NULL,
  `selectedquantity` int(100) DEFAULT NULL,
  `custid` int(100) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `total` int(100) DEFAULT NULL,
  PRIMARY KEY (`cartid`),
  KEY `custid` (`custid`),
  CONSTRAINT `cart_ibfk_1` FOREIGN KEY (`custid`) REFERENCES `customer` (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;

/*Data for the table `cart` */

insert  into `cart`(`cartid`,`custname`,`selectedmedicine`,`selectedquantity`,`custid`,`price`,`total`) values (13,'Mahesh Patil','A-Hydrocort (hydrocortisone sodium succinate-injection)',5,1,200,1000),(15,'Jayesh','Accolate (zafirlukast)',1,2,350,350),(20,'Mahesh Patil','Acanya (clindamycin and benzoyl peroxide gel)',1,1,30,30);

/*Table structure for table `contactus` */

DROP TABLE IF EXISTS `contactus`;

CREATE TABLE `contactus` (
  `cid` int(100) NOT NULL AUTO_INCREMENT,
  `fname` varchar(100) DEFAULT NULL,
  `lname` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `message` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `contactus` */

insert  into `contactus`(`cid`,`fname`,`lname`,`email`,`message`) values (2,'Subham','Dutta','subham@gmail.com','Good Application...');

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `cid` int(100) NOT NULL AUTO_INCREMENT,
  `cname` varchar(100) DEFAULT NULL,
  `cphone` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `customer` */

insert  into `customer`(`cid`,`cname`,`cphone`) values (1,'Mahesh Patil','8745896541'),(2,'Jayesh','8741032569');

/*Table structure for table `stock` */

DROP TABLE IF EXISTS `stock`;

CREATE TABLE `stock` (
  `sid` int(100) NOT NULL AUTO_INCREMENT,
  `mcompany` varchar(100) DEFAULT NULL,
  `mname` varchar(100) DEFAULT NULL,
  `mdescription` varchar(100) DEFAULT NULL,
  `quantity` int(100) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `mdate` varchar(100) DEFAULT NULL,
  `edate` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `stock` */

insert  into `stock`(`sid`,`mcompany`,`mname`,`mdescription`,`quantity`,`price`,`mdate`,`edate`) values (1,'Actavis','A-Hydrocort (hydrocortisone sodium succinate-injection)','Hair',5,650,'20-02-2019','25-11-2025'),(2,'Adcock Ingram','Acanya (clindamycin and benzoyl peroxide gel)','Skin',1,489,'01-05-2019','18-06-2026'),(3,'Allergan','Accolate (zafirlukast)','Eye',1,895,'05-09-2019','30-04-2030'),(4,'Bluepharma','Accolate (ZAFIRLUKAST ORAL)','Ear',2,212,'11-12-2019','20-05-2036'),(5,'Avax Technologies','AccuNeb (albuterol)','Face',2,189,'07-04-2019','25-02-2030');

/*Table structure for table `supplier` */

DROP TABLE IF EXISTS `supplier`;

CREATE TABLE `supplier` (
  `supid` int(100) NOT NULL AUTO_INCREMENT,
  `sname` varchar(100) DEFAULT NULL,
  `smobile` varchar(100) DEFAULT NULL,
  `semail` varchar(100) DEFAULT NULL,
  `saddress` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`supid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `supplier` */

insert  into `supplier`(`supid`,`sname`,`smobile`,`semail`,`saddress`) values (1,'Subham Dutta','484515484','s@gmail.com','Bangal'),(2,'Vijay','484564894','vijay@gmail.com','Pune');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
