CREATE DATABASE IF NOT EXISTS `Airline-Reservation-System`;
USE `Airline-Reservation-System`;

CREATE TABLE IF NOT EXISTS `user` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(255),
    `last_name` VARCHAR(255),
    `email` VARCHAR(255) NOT NULL,
    `password` VARCHAR(255) NOT NULL,
    `role` VARCHAR(50) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `uk_user_email` (`email`)
);

CREATE TABLE IF NOT EXISTS `airplane` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `start` VARCHAR(255),
    `end` VARCHAR(255),
    `avl_seat` INT NOT NULL,
    `num_of_km` DOUBLE NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `booking` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `b_start` VARCHAR(255),
    `b_end` VARCHAR(255),
    `user_email` VARCHAR(255),
    `b_num_ofseat` INT NOT NULL,
    `price` DOUBLE NOT NULL,
    PRIMARY KEY (`id`)
);
