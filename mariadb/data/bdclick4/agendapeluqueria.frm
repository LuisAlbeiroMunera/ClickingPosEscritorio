TYPE=VIEW
query=select `bdclick4`.`bdpeluqueria`.`Id` AS `Id`,`bdclick4`.`bdpeluqueria`.`cliente` AS `cliente`,`bdclick4`.`bdpeluqueria`.`fecha` AS `fecha`,`bdclick4`.`bdpeluqueria`.`hora` AS `hora`,`bdclick4`.`bdpeluqueria`.`motivo` AS `motivo`,`bdclick4`.`bdpeluqueria`.`aCargo` AS `aCargo`,`bdclick4`.`bdpeluqueria`.`estado` AS `estado`,`bdclick4`.`bdpeluqueria`.`observacion` AS `observacion`,`bdclick4`.`bdpeluqueria`.`mascota` AS `mascota`,`bdclick4`.`bdpeluqueria`.`proxima` AS `proxima`,`bdclick4`.`bdpeluqueria`.`gestion` AS `gestion`,`bdclick4`.`bdpeluqueria`.`fechaGestion` AS `fechaGestion`,`bdclick4`.`bdpeluqueria`.`descripcion` AS `descripcion`,`bdclick4`.`bdterceros`.`id` AS `cc`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,`bdclick4`.`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdclick4`.`bdpeluqueria` left join `bdclick4`.`bdterceros` on((`bdclick4`.`bdpeluqueria`.`cliente` = `bdclick4`.`bdterceros`.`idSistema`)))
md5=2e5fd3d6ed3fc4a6794a809ffeeabd86
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:25
create-version=2
source=select `bdpeluqueria`.`Id` AS `Id`,`bdpeluqueria`.`cliente` AS `cliente`,`bdpeluqueria`.`fecha` AS `fecha`,`bdpeluqueria`.`hora` AS `hora`,`bdpeluqueria`.`motivo` AS `motivo`,`bdpeluqueria`.`aCargo` AS `aCargo`,`bdpeluqueria`.`estado` AS `estado`,`bdpeluqueria`.`observacion` AS `observacion`,`bdpeluqueria`.`mascota` AS `mascota`,`bdpeluqueria`.`proxima` AS `proxima`,`bdpeluqueria`.`gestion` AS `gestion`,`bdpeluqueria`.`fechaGestion` AS `fechaGestion`,`bdpeluqueria`.`descripcion` AS `descripcion`,`bdterceros`.`id` AS `cc`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdpeluqueria` left join `bdterceros` on((`bdpeluqueria`.`cliente` = `bdterceros`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdpeluqueria`.`Id` AS `Id`,`bdclick4`.`bdpeluqueria`.`cliente` AS `cliente`,`bdclick4`.`bdpeluqueria`.`fecha` AS `fecha`,`bdclick4`.`bdpeluqueria`.`hora` AS `hora`,`bdclick4`.`bdpeluqueria`.`motivo` AS `motivo`,`bdclick4`.`bdpeluqueria`.`aCargo` AS `aCargo`,`bdclick4`.`bdpeluqueria`.`estado` AS `estado`,`bdclick4`.`bdpeluqueria`.`observacion` AS `observacion`,`bdclick4`.`bdpeluqueria`.`mascota` AS `mascota`,`bdclick4`.`bdpeluqueria`.`proxima` AS `proxima`,`bdclick4`.`bdpeluqueria`.`gestion` AS `gestion`,`bdclick4`.`bdpeluqueria`.`fechaGestion` AS `fechaGestion`,`bdclick4`.`bdpeluqueria`.`descripcion` AS `descripcion`,`bdclick4`.`bdterceros`.`id` AS `cc`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,`bdclick4`.`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdclick4`.`bdpeluqueria` left join `bdclick4`.`bdterceros` on((`bdclick4`.`bdpeluqueria`.`cliente` = `bdclick4`.`bdterceros`.`idSistema`)))
mariadb-version=100135
