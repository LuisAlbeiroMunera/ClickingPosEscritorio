CREATE TABLE `bdimagenes` (
  `id` VARCHAR(500) DEFAULT NULL,
  `imagen` MEDIUMBLOB DEFAULT NULL
) ENGINE=INNODB DEFAULT CHARSET=latin1;

ALTER TABLE configuracion ADD imgMigradas BOOLEAN NOT NULL DEFAULT 0 AFTER pais;
