DROP SCHEMA IF EXISTS `riyavers`;
CREATE SCHEMA `riyavers` ;
use `riyavers`;

CREATE TABLE `branch` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(32) NULL,
  `address` VARCHAR(128) NULL,
  PRIMARY KEY (`id`));
  
CREATE TABLE `login` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) NOT NULL,
  `password` varchar(25) NOT NULL,
  `role`  VARCHAR(32) NOT NULL,
  `name` VARCHAR(32) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username_UNIQUE` (`username`)
);

CREATE TABLE `employee` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NULL,
  `email` VARCHAR(45) NOT NULL,
  `contact` VARCHAR(45) NULL,
   branch INT NOT NULL,
   FOREIGN KEY (branch) REFERENCES branch(id),
  PRIMARY KEY (`id`));
