TYPE=VIEW
query=select `bdclick2`.`bdpeluqueria`.`Id` AS `Id`,`bdclick2`.`bdpeluqueria`.`cliente` AS `cliente`,`bdclick2`.`bdpeluqueria`.`fecha` AS `fecha`,`bdclick2`.`bdpeluqueria`.`hora` AS `hora`,`bdclick2`.`bdpeluqueria`.`motivo` AS `motivo`,`bdclick2`.`bdpeluqueria`.`aCargo` AS `aCargo`,`bdclick2`.`bdpeluqueria`.`estado` AS `estado`,`bdclick2`.`bdpeluqueria`.`observacion` AS `observacion`,`bdclick2`.`bdpeluqueria`.`mascota` AS `mascota`,`bdclick2`.`bdpeluqueria`.`proxima` AS `proxima`,`bdclick2`.`bdpeluqueria`.`gestion` AS `gestion`,`bdclick2`.`bdpeluqueria`.`fechaGestion` AS `fechaGestion`,`bdclick2`.`bdpeluqueria`.`descripcion` AS `descripcion`,`bdclick2`.`bdterceros`.`id` AS `cc`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,`bdclick2`.`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdclick2`.`bdpeluqueria` left join `bdclick2`.`bdterceros` on((`bdclick2`.`bdpeluqueria`.`cliente` = `bdclick2`.`bdterceros`.`idSistema`)))
md5=d9054914c20e09648d403d8584e6ab11
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:42
create-version=2
source=select `bdpeluqueria`.`Id` AS `Id`,`bdpeluqueria`.`cliente` AS `cliente`,`bdpeluqueria`.`fecha` AS `fecha`,`bdpeluqueria`.`hora` AS `hora`,`bdpeluqueria`.`motivo` AS `motivo`,`bdpeluqueria`.`aCargo` AS `aCargo`,`bdpeluqueria`.`estado` AS `estado`,`bdpeluqueria`.`observacion` AS `observacion`,`bdpeluqueria`.`mascota` AS `mascota`,`bdpeluqueria`.`proxima` AS `proxima`,`bdpeluqueria`.`gestion` AS `gestion`,`bdpeluqueria`.`fechaGestion` AS `fechaGestion`,`bdpeluqueria`.`descripcion` AS `descripcion`,`bdterceros`.`id` AS `cc`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdpeluqueria` left join `bdterceros` on((`bdpeluqueria`.`cliente` = `bdterceros`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdpeluqueria`.`Id` AS `Id`,`bdclick2`.`bdpeluqueria`.`cliente` AS `cliente`,`bdclick2`.`bdpeluqueria`.`fecha` AS `fecha`,`bdclick2`.`bdpeluqueria`.`hora` AS `hora`,`bdclick2`.`bdpeluqueria`.`motivo` AS `motivo`,`bdclick2`.`bdpeluqueria`.`aCargo` AS `aCargo`,`bdclick2`.`bdpeluqueria`.`estado` AS `estado`,`bdclick2`.`bdpeluqueria`.`observacion` AS `observacion`,`bdclick2`.`bdpeluqueria`.`mascota` AS `mascota`,`bdclick2`.`bdpeluqueria`.`proxima` AS `proxima`,`bdclick2`.`bdpeluqueria`.`gestion` AS `gestion`,`bdclick2`.`bdpeluqueria`.`fechaGestion` AS `fechaGestion`,`bdclick2`.`bdpeluqueria`.`descripcion` AS `descripcion`,`bdclick2`.`bdterceros`.`id` AS `cc`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,`bdclick2`.`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdclick2`.`bdpeluqueria` left join `bdclick2`.`bdterceros` on((`bdclick2`.`bdpeluqueria`.`cliente` = `bdclick2`.`bdterceros`.`idSistema`)))
mariadb-version=100135
