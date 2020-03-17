DROP DATABASE IF EXISTS dogs_db;

CREATE DATABASE dogs_db;

USE dogs_db;

CREATE TABLE `dogs`
(
    `id`           int(11) unsigned    NOT NULL AUTO_INCREMENT,
    `age`          tinyint(3) unsigned NOT NULL,
    `name`         varchar(200)        NOT NULL,
    `reside_state` char(2) DEFAULT 'XX',
    PRIMARY KEY (`id`),
    UNIQUE KEY `UK_?????????????????` (`age`)
) ENGINE = MyISAM
  DEFAULT CHARSET = utf8

USE dogs_db;

INSERT INTO dogs (age, name, reside_state)
VALUES
(2, 'Chuck', 'TX'),
(5, 'Fred', 'OH'),
(3, 'Bud', 'TN'),
(10, 'Bailey', 'AL'),
(11, 'Lexie', 'TX'),
(1, 'Snickers', 'TX'),
(6, 'Red', 'FL'),
(8, 'Barney', 'CA'),
(12, 'Bowser', 'TX');


# DROP USER IF EXISTS 'dogs_user'@'localhost';
#
# CREATE USER 'dogs_user'@'localhost' IDENTIFIED BY 'password';
# GRANT ALL ON dogs_db.* TO 'dogs_user'@'localhost';