TYPE=VIEW
query=select `bdclick5`.`bdpeluqueria`.`Id` AS `Id`,`bdclick5`.`bdpeluqueria`.`cliente` AS `cliente`,`bdclick5`.`bdpeluqueria`.`fecha` AS `fecha`,`bdclick5`.`bdpeluqueria`.`hora` AS `hora`,`bdclick5`.`bdpeluqueria`.`motivo` AS `motivo`,`bdclick5`.`bdpeluqueria`.`aCargo` AS `aCargo`,`bdclick5`.`bdpeluqueria`.`estado` AS `estado`,`bdclick5`.`bdpeluqueria`.`observacion` AS `observacion`,`bdclick5`.`bdpeluqueria`.`mascota` AS `mascota`,`bdclick5`.`bdpeluqueria`.`proxima` AS `proxima`,`bdclick5`.`bdpeluqueria`.`gestion` AS `gestion`,`bdclick5`.`bdpeluqueria`.`fechaGestion` AS `fechaGestion`,`bdclick5`.`bdpeluqueria`.`descripcion` AS `descripcion`,`bdclick5`.`bdterceros`.`id` AS `cc`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdclick5`.`bdpeluqueria` left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdpeluqueria`.`cliente` = `bdclick5`.`bdterceros`.`idSistema`)))
md5=fff5d6abb2e1a9e86573c4acf4482118
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:44
create-version=2
source=select `bdpeluqueria`.`Id` AS `Id`,`bdpeluqueria`.`cliente` AS `cliente`,`bdpeluqueria`.`fecha` AS `fecha`,`bdpeluqueria`.`hora` AS `hora`,`bdpeluqueria`.`motivo` AS `motivo`,`bdpeluqueria`.`aCargo` AS `aCargo`,`bdpeluqueria`.`estado` AS `estado`,`bdpeluqueria`.`observacion` AS `observacion`,`bdpeluqueria`.`mascota` AS `mascota`,`bdpeluqueria`.`proxima` AS `proxima`,`bdpeluqueria`.`gestion` AS `gestion`,`bdpeluqueria`.`fechaGestion` AS `fechaGestion`,`bdpeluqueria`.`descripcion` AS `descripcion`,`bdterceros`.`id` AS `cc`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdpeluqueria` left join `bdterceros` on((`bdpeluqueria`.`cliente` = `bdterceros`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdpeluqueria`.`Id` AS `Id`,`bdclick5`.`bdpeluqueria`.`cliente` AS `cliente`,`bdclick5`.`bdpeluqueria`.`fecha` AS `fecha`,`bdclick5`.`bdpeluqueria`.`hora` AS `hora`,`bdclick5`.`bdpeluqueria`.`motivo` AS `motivo`,`bdclick5`.`bdpeluqueria`.`aCargo` AS `aCargo`,`bdclick5`.`bdpeluqueria`.`estado` AS `estado`,`bdclick5`.`bdpeluqueria`.`observacion` AS `observacion`,`bdclick5`.`bdpeluqueria`.`mascota` AS `mascota`,`bdclick5`.`bdpeluqueria`.`proxima` AS `proxima`,`bdclick5`.`bdpeluqueria`.`gestion` AS `gestion`,`bdclick5`.`bdpeluqueria`.`fechaGestion` AS `fechaGestion`,`bdclick5`.`bdpeluqueria`.`descripcion` AS `descripcion`,`bdclick5`.`bdterceros`.`id` AS `cc`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdclick5`.`bdpeluqueria` left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdpeluqueria`.`cliente` = `bdclick5`.`bdterceros`.`idSistema`)))
mariadb-version=100135
