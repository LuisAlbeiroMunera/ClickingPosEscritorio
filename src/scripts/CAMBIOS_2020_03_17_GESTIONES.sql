DELETE FROM usuario;
INSERT INTO usuario (idUsuario,nombre, PASSWORD) VALUES
('71793806','Luis Munera','sebas1'),
('15518712','Jonathan Martinez','sebas1');
('43064385','Vicky Saldarriaga','sebas1'),
('71335792','John Munera','sebas1'),
('ADMIN','ADMINISTRADOR','sebas1'),


DROP TABLE IF EXISTS `grupo`;

CREATE TABLE `grupo` (
  `idGrupo` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(50),
  PRIMARY KEY (`idGrupo`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;



DROP TABLE IF EXISTS `subgrupo`;

CREATE TABLE `subgrupo` (
  `idSubGrupo` INT(11) NOT NULL AUTO_INCREMENT,
  `idGrupo` INT(11),
  `nombre` VARCHAR(255),
  PRIMARY KEY (`idSubGrupo`),
  KEY `fk_idGrupo_subgrupo` (`idGrupo`),
  CONSTRAINT `fk_idgrupo_subgrupo` FOREIGN KEY (`idGrupo`) REFERENCES `grupo` (`idGrupo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=INNODB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `gestion`;

CREATE TABLE `gestion` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `idCliente` VARCHAR(100),
  `idUsuario` VARCHAR(255),
  `fechaCreacion` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fechaActualizacion` DATE DEFAULT NULL,
  `fechaProximaGestion` DATE DEFAULT NULL,
  `idGrupo` INT(11) NOT NULL,
  `idSubGrupo` INT(11) NOT NULL,
  `observaciones` VARCHAR(2000),
  `estado` VARCHAR(50),
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;


INSERT INTO grupo (nombre) VALUES
('Error Aplicacion'),
('Asesoría'),
('Instalación'),
('Migración'),
('Capacitación'),
('Pruebas');


INSERT INTO subgrupo (idGrupo, nombre) VALUES
(1,'Error Reportado'),
(1,'Error Verificado'),
(2,'Asesoría cliente antiguo'),
(2,'Asesoría cliente nuevo'),
(3,'Instalación'),
(3,'Reinstalar'),
(4,'Migración desde ClickingPos ver Antigua'),
(4,'Migración desde Click'),
(5,'Capacitación programada'),
(5,'Capacitación paga'),
(6,'Pruebas generales'),
(6,'Pruebas modulo');