DROP DATABASE IF EXISTS `Group_Manager`;
CREATE DATABASE `Group_Manager`;
USE `Group_manager`;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`(
	`id` INT NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(128) NOT NULL,
    `email` VARCHAR(200) NOT NULL,
    `password` VARCHAR(355) NOT NULL,
    `imageUrl` VARCHAR(355),
    PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `authority`;
CREATE TABLE `authority`(
	`id` INT NOT NULL AUTO_INCREMENT,
	`user_id` INT,
	`authority` VARCHAR(128),
    PRIMARY KEY (`id`),
    FOREIGN KEY (`user_id`) REFERENCES `user`(`id`)
);

DROP TABLE IF EXISTS `sheet`;
CREATE TABLE `sheet`(
	`id` INT NOT NULL AUTO_INCREMENT,
    `hp` INT,
    `mp`INT,
    `str`INT,
    `dex` INT,
    `cons` INT,
    `int` INT,
    `wis` INT,
    `char` INT,
    PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `perk`;
CREATE TABLE `perk`(
	`id` INT NOT NULL AUTO_INCREMENT,
    `sheet_id` INT,
    `name` VARCHAR(355),
    `effect` VARCHAR(800),
    PRIMARY KEY (`id`),
    FOREIGN KEY(`sheet_id`) REFERENCES `sheet`(`id`)
);

DROP TABLE IF EXISTS `weapon`;
CREATE TABLE `weapon`(
	`id` INT NOT NULL AUTO_INCREMENT,
    `sheet_id` INT,
	`name` VARCHAR(258),
	`type` VARCHAR(258),
    `damage` VARCHAR(128),
    PRIMARY KEY (`id`),
    FOREIGN KEY (`sheet_id`) REFERENCES `sheet`(`id`)
);

DROP TABLE IF EXISTS `magic`;
CREATE TABLE `magic`(
	`id` INT NOT NULL AUTO_INCREMENT,
    `sheet_id` INT,
    `name` VARCHAR(258),
    `type` VARCHAR(258),
    `damage` VARCHAR(128),
    `effect` VARCHAR(800),
    `cost` INT,
    PRIMARY KEY (`id`),
    FOREIGN KEY (`sheet_id`) REFERENCES `sheet`(`id`)
);

DROP TABLE IF EXISTS `character`;
CREATE TABLE `character`(
	`id` INT NOT NULL AUTO_INCREMENT,
    `user_id` INT,
    `sheet_id` INT,
    `name` VARCHAR(128),
    `race` VARCHAR(128),
    `class` VARCHAR(128),
    `level` INT,
    `image_url` VARCHAR(355),
    PRIMARY KEY (`id`),
    FOREIGN KEY (`user_id`) REFERENCES `user`(`id`),
    FOREIGN KEY(`sheet_id`) REFERENCES `sheet`(`id`) 
);
