

CREATE DATABASE  IF NOT EXISTS `todolist`;
USE `todolist`;


DROP TABLE IF EXISTS `tasktest`;

CREATE TABLE `tasktest` (
  `id` Integer   NOT NULL AUTO_INCREMENT,
  `task_name` varchar(225) ,
  `task_description` varchar(225) ,
  `taskAdd` TIMESTAMP,

  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;












