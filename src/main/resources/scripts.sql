-- Need user db in this format to match with spring security defined JDBCUserDetailsManager Provider (DB)
CREATE DATABASE userdb;
USE userdb;
CREATE TABLE `users` (
                         `id` INT NOT NULL AUTO_INCREMENT,
                         `username` VARCHAR(45) NOT NULL,
                         `password` VARCHAR(45) NOT NULL,
                         `enabled` INT NOT NULL,
                         PRIMARY KEY (`id`));

CREATE TABLE `authorities` (
                               `id` int NOT NULL AUTO_INCREMENT,
                               `username` varchar(45) NOT NULL,
                               `authority` varchar(45) NOT NULL,
                               PRIMARY KEY (`id`));

INSERT IGNORE INTO `users` VALUES (NULL, 'happy', '12345', '1');
INSERT IGNORE INTO `authorities` VALUES (NULL, 'happy', 'write');