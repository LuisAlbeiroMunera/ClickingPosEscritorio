TYPE=VIEW
query=select `bdclick3`.`bdpeluqueria`.`Id` AS `Id`,`bdclick3`.`bdpeluqueria`.`cliente` AS `cliente`,`bdclick3`.`bdpeluqueria`.`fecha` AS `fecha`,`bdclick3`.`bdpeluqueria`.`hora` AS `hora`,`bdclick3`.`bdpeluqueria`.`motivo` AS `motivo`,`bdclick3`.`bdpeluqueria`.`aCargo` AS `aCargo`,`bdclick3`.`bdpeluqueria`.`estado` AS `estado`,`bdclick3`.`bdpeluqueria`.`observacion` AS `observacion`,`bdclick3`.`bdpeluqueria`.`mascota` AS `mascota`,`bdclick3`.`bdpeluqueria`.`proxima` AS `proxima`,`bdclick3`.`bdpeluqueria`.`gestion` AS `gestion`,`bdclick3`.`bdpeluqueria`.`fechaGestion` AS `fechaGestion`,`bdclick3`.`bdpeluqueria`.`descripcion` AS `descripcion`,`bdclick3`.`bdterceros`.`id` AS `cc`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdclick3`.`bdpeluqueria` left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdpeluqueria`.`cliente` = `bdclick3`.`bdterceros`.`idSistema`)))
md5=92949dd5b58096fd74da6bc949af8fb7
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:47
create-version=2
source=select `bdpeluqueria`.`Id` AS `Id`,`bdpeluqueria`.`cliente` AS `cliente`,`bdpeluqueria`.`fecha` AS `fecha`,`bdpeluqueria`.`hora` AS `hora`,`bdpeluqueria`.`motivo` AS `motivo`,`bdpeluqueria`.`aCargo` AS `aCargo`,`bdpeluqueria`.`estado` AS `estado`,`bdpeluqueria`.`observacion` AS `observacion`,`bdpeluqueria`.`mascota` AS `mascota`,`bdpeluqueria`.`proxima` AS `proxima`,`bdpeluqueria`.`gestion` AS `gestion`,`bdpeluqueria`.`fechaGestion` AS `fechaGestion`,`bdpeluqueria`.`descripcion` AS `descripcion`,`bdterceros`.`id` AS `cc`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdpeluqueria` left join `bdterceros` on((`bdpeluqueria`.`cliente` = `bdterceros`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdpeluqueria`.`Id` AS `Id`,`bdclick3`.`bdpeluqueria`.`cliente` AS `cliente`,`bdclick3`.`bdpeluqueria`.`fecha` AS `fecha`,`bdclick3`.`bdpeluqueria`.`hora` AS `hora`,`bdclick3`.`bdpeluqueria`.`motivo` AS `motivo`,`bdclick3`.`bdpeluqueria`.`aCargo` AS `aCargo`,`bdclick3`.`bdpeluqueria`.`estado` AS `estado`,`bdclick3`.`bdpeluqueria`.`observacion` AS `observacion`,`bdclick3`.`bdpeluqueria`.`mascota` AS `mascota`,`bdclick3`.`bdpeluqueria`.`proxima` AS `proxima`,`bdclick3`.`bdpeluqueria`.`gestion` AS `gestion`,`bdclick3`.`bdpeluqueria`.`fechaGestion` AS `fechaGestion`,`bdclick3`.`bdpeluqueria`.`descripcion` AS `descripcion`,`bdclick3`.`bdterceros`.`id` AS `cc`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdclick3`.`bdpeluqueria` left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdpeluqueria`.`cliente` = `bdclick3`.`bdterceros`.`idSistema`)))
mariadb-version=100135
