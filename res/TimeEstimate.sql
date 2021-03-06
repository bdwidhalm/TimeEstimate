
CREATE DATABASE `TimeEstimate` /*!40100 DEFAULT CHARACTER SET latin1 */

CREATE TABLE `TimeTable` (
  `timeDate` date NOT NULL,
  `timeAM1` time DEFAULT NULL,
  `timeAM2` time DEFAULT NULL,
  `amLock` varchar(10) DEFAULT NULL,
  `timePM1` time DEFAULT NULL,
  `timePM2` time DEFAULT NULL,
  `pmLock` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`timeDate`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1

/*
-- Query: SELECT * FROM TimeEstimate.TimeTable
LIMIT 0, 1000

-- Date: 2012-11-09 09:24
*/
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-01-02','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-01-03','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-01-04','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-01-05','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-01-06','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-01-23','08:27:46','12:00:00','false','12:30:00','15:00:00','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-01-24','06:00:00','12:00:00','false','12:30:00','15:00:00','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-01-25','06:00:00','12:00:00','false','12:30:00','15:00:00','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-01-26','06:00:00','11:00:00','false','11:30:00','12:30:00','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-01-27','06:00:00','12:00:00','false','12:30:00','14:45:00','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-05-14','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-05-15','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-05-16','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-05-17','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-05-18','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-05-21','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-05-22','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-05-23','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-05-24','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-05-25','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-05-28','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-05-29','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-05-30','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-05-31','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-06-01','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-06-04','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-06-05','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-06-06','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-06-07','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-06-08','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-06-11','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-06-12','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-06-13','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-06-14','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-06-15','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-06-18','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-06-19','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-06-20','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-06-21','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-06-22','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-06-25','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-06-26','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-06-27','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-06-28','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-06-29','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-07-02','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-07-03','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-07-04','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-07-05','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-07-06','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-07-09','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-07-10','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-07-11','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-07-12','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-07-13','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-07-16','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-07-17','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-07-18','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-07-19','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-07-20','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-07-23','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-07-24','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-07-25','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-07-26','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-07-27','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-07-30','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-07-31','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-08-01','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-08-02','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-08-03','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-08-06','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-08-07','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-08-08','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-08-09','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-08-10','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-08-13','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-08-14','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-08-15','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-08-16','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-08-17','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-08-20','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-08-21','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-08-22','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-08-23','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-08-24','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-08-27','05:30:00','12:00:00','true','12:30:00','15:00:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-08-28','05:30:00','12:00:00','true','12:30:00','17:00:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-08-29','05:15:00','12:00:00','true','12:30:00','17:15:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-08-30','05:15:00','12:00:00','true','12:30:00','14:15:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-08-31','16:25:00','16:25:47','true','16:55:47','16:55:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-09-03','06:00:00','12:00:00','true','12:30:00','14:30:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-09-04','06:00:00','12:00:00','true','12:30:00','14:30:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-09-05','05:30:00','12:00:00','true','12:30:00','14:00:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-09-06','05:30:00','12:00:00','true','12:30:00','14:00:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-09-07','06:00:00','12:00:00','true','12:30:00','14:30:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-09-10','05:30:00','11:00:00','true','14:00:00','16:00:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-09-11','05:30:00','12:00:00','true','12:30:00','15:30:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-09-12','05:30:00','12:00:00','true','13:45:00','16:00:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-09-13','05:45:00','12:00:00','true','12:30:00','15:00:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-09-14','06:00:00','11:00:00','false','11:30:00','12:00:00','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-09-17','05:45:00','12:00:00','true','12:30:00','15:00:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-09-18','05:45:00','12:00:00','true','12:30:00','15:15:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-09-19','06:15:00','11:45:00','true','12:45:00','14:00:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-09-20','05:30:00','12:00:00','true','12:30:00','14:15:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-09-21','05:45:00','12:00:00','true','12:30:00','13:30:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-09-24','05:45:00','12:00:00','true','12:30:00','15:15:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-09-25','05:45:00','11:30:00','true','13:00:00','14:45:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-09-26','05:30:00','12:00:00','true','12:30:00','16:30:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-09-27','05:45:00','12:00:00','true','12:30:00','14:15:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-09-28','05:45:00','10:15:00','true','22:45:00','23:15:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-10-01','05:45:00','12:00:00','true','12:30:00','15:00:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-10-02','05:30:00','12:00:00','true','12:30:00','15:15:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-10-03','05:30:00','12:30:00','true','13:00:00','14:45:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-10-04','05:30:00','11:00:00','true','11:00:00','12:00:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-10-05','05:15:00','11:45:00','true','12:15:00','12:30:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-10-08','05:45:00','12:00:00','true','12:30:00','15:00:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-10-09','06:00:00','12:00:00','true','12:30:00','15:00:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-10-10','06:00:00','12:00:00','true','12:30:00','15:00:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-10-11','06:00:00','11:00:00','true','11:30:00','12:30:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-10-12','06:00:00','12:00:00','true','12:30:00','14:45:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-10-15','05:45:00','12:00:00','true','12:30:00','15:00:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-10-16','05:45:00','12:00:00','true','12:30:00','15:00:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-10-17','05:45:00','12:00:00','true','12:30:00','15:00:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-10-18','05:45:00','10:45:00','true','13:00:00','13:00:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-10-19','05:45:00','12:45:00','true','13:15:00','15:00:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-10-22','05:45:07','12:00:00','true','12:30:00','14:15:07','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-10-23','05:30:00','12:00:00','true','12:30:00','14:30:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-10-24','05:30:00','12:00:00','true','12:30:00','15:00:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-10-25','05:30:00','11:00:00','true','11:30:00','12:30:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-10-26','05:30:00','07:30:00','true','08:45:00','14:45:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-10-29','05:30:00','12:00:00','true','12:30:00','15:00:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-10-30','05:45:00','12:00:00','true','12:30:00','14:00:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-10-31','05:30:00','12:00:00','true','12:30:00','14:00:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-11-01','05:45:00','11:00:00','true','11:30:00','15:00:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-11-02','05:30:00','12:00:00','true','12:30:00','12:30:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-11-05','05:45:00','12:00:00','true','12:30:00','15:00:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-11-06','05:30:00','12:00:00','true','12:30:00','15:00:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-11-07','05:30:00','12:00:00','true','12:30:00','13:45:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-11-08','05:30:00','11:00:00','true','11:30:00','14:30:00','true');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-11-09','05:45:00','11:30:00','false','12:00:00','12:15:00','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-11-12','08:10:53','12:10:53','false','12:40:53','16:40:53','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-11-13','08:10:53','12:10:53','false','12:40:53','16:40:53','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-11-14','08:10:53','12:10:53','false','12:40:53','16:40:53','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-11-15','08:10:53','12:10:53','false','12:40:53','16:40:53','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-11-16','08:10:53','12:10:53','false','12:40:53','16:40:53','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-11-19','08:17:49','12:17:49','false','12:47:49','16:47:49','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-11-20','08:17:49','12:17:49','false','12:47:49','16:47:49','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-11-21','08:17:49','12:17:49','false','12:47:49','16:47:49','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-11-22','08:17:49','12:17:49','false','12:47:49','16:47:49','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-11-23','08:17:49','12:17:49','false','12:47:49','16:47:49','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-11-26','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-11-27','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-11-28','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-11-29','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-11-30','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-12-03','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-12-04','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-12-05','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-12-06','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-12-07','08:27:46','12:27:46','false','12:57:46','16:57:46','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-12-10','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-12-11','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-12-12','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-12-13','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-12-14','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-12-17','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-12-18','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-12-19','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-12-20','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-12-21','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-12-24','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-12-25','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-12-26','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-12-27','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-12-28','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2012-12-31','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2013-01-01','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2013-01-02','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2013-01-03','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2013-01-04','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2013-01-07','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2013-01-08','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2013-01-09','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2013-01-10','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2013-01-11','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2013-01-14','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2013-01-15','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2013-01-16','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2013-01-17','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2013-01-18','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2013-01-21','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2013-01-22','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2013-01-23','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2013-01-24','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2013-01-25','09:03:23','13:03:23','false','13:33:23','17:33:23','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2013-01-28','09:03:23','12:00:00','false','12:30:00','15:00:00','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2013-01-29','06:00:00','12:00:00','false','12:30:00','15:00:00','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2013-01-30','06:00:00','12:00:00','false','12:30:00','15:00:00','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2013-01-31','06:00:00','11:00:00','false','11:30:00','12:30:00','false');
INSERT INTO `TimeTable` (`timeDate`,`timeAM1`,`timeAM2`,`amLock`,`timePM1`,`timePM2`,`pmLock`) VALUES ('2013-02-01','06:00:00','12:00:00','false','12:30:00','14:45:00','false');
