TYPE=VIEW
query=select `bdclick6`.`bdpeluqueria`.`Id` AS `Id`,`bdclick6`.`bdpeluqueria`.`cliente` AS `cliente`,`bdclick6`.`bdpeluqueria`.`fecha` AS `fecha`,`bdclick6`.`bdpeluqueria`.`hora` AS `hora`,`bdclick6`.`bdpeluqueria`.`motivo` AS `motivo`,`bdclick6`.`bdpeluqueria`.`aCargo` AS `aCargo`,`bdclick6`.`bdpeluqueria`.`estado` AS `estado`,`bdclick6`.`bdpeluqueria`.`observacion` AS `observacion`,`bdclick6`.`bdpeluqueria`.`mascota` AS `mascota`,`bdclick6`.`bdpeluqueria`.`proxima` AS `proxima`,`bdclick6`.`bdpeluqueria`.`gestion` AS `gestion`,`bdclick6`.`bdpeluqueria`.`fechaGestion` AS `fechaGestion`,`bdclick6`.`bdpeluqueria`.`descripcion` AS `descripcion`,`bdclick6`.`bdterceros`.`id` AS `cc`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdclick6`.`bdpeluqueria` left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdpeluqueria`.`cliente` = `bdclick6`.`bdterceros`.`idSistema`)))
md5=39eeeba1ef1a5e10f8544387a5754f3b
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:32
create-version=2
source=select `bdpeluqueria`.`Id` AS `Id`,`bdpeluqueria`.`cliente` AS `cliente`,`bdpeluqueria`.`fecha` AS `fecha`,`bdpeluqueria`.`hora` AS `hora`,`bdpeluqueria`.`motivo` AS `motivo`,`bdpeluqueria`.`aCargo` AS `aCargo`,`bdpeluqueria`.`estado` AS `estado`,`bdpeluqueria`.`observacion` AS `observacion`,`bdpeluqueria`.`mascota` AS `mascota`,`bdpeluqueria`.`proxima` AS `proxima`,`bdpeluqueria`.`gestion` AS `gestion`,`bdpeluqueria`.`fechaGestion` AS `fechaGestion`,`bdpeluqueria`.`descripcion` AS `descripcion`,`bdterceros`.`id` AS `cc`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdpeluqueria` left join `bdterceros` on((`bdpeluqueria`.`cliente` = `bdterceros`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdpeluqueria`.`Id` AS `Id`,`bdclick6`.`bdpeluqueria`.`cliente` AS `cliente`,`bdclick6`.`bdpeluqueria`.`fecha` AS `fecha`,`bdclick6`.`bdpeluqueria`.`hora` AS `hora`,`bdclick6`.`bdpeluqueria`.`motivo` AS `motivo`,`bdclick6`.`bdpeluqueria`.`aCargo` AS `aCargo`,`bdclick6`.`bdpeluqueria`.`estado` AS `estado`,`bdclick6`.`bdpeluqueria`.`observacion` AS `observacion`,`bdclick6`.`bdpeluqueria`.`mascota` AS `mascota`,`bdclick6`.`bdpeluqueria`.`proxima` AS `proxima`,`bdclick6`.`bdpeluqueria`.`gestion` AS `gestion`,`bdclick6`.`bdpeluqueria`.`fechaGestion` AS `fechaGestion`,`bdclick6`.`bdpeluqueria`.`descripcion` AS `descripcion`,`bdclick6`.`bdterceros`.`id` AS `cc`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdclick6`.`bdpeluqueria` left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdpeluqueria`.`cliente` = `bdclick6`.`bdterceros`.`idSistema`)))
mariadb-version=100135
