TYPE=VIEW
query=select `bdclick1`.`bdpeluqueria`.`Id` AS `Id`,`bdclick1`.`bdpeluqueria`.`cliente` AS `cliente`,`bdclick1`.`bdpeluqueria`.`fecha` AS `fecha`,`bdclick1`.`bdpeluqueria`.`hora` AS `hora`,`bdclick1`.`bdpeluqueria`.`motivo` AS `motivo`,`bdclick1`.`bdpeluqueria`.`aCargo` AS `aCargo`,`bdclick1`.`bdpeluqueria`.`estado` AS `estado`,`bdclick1`.`bdpeluqueria`.`observacion` AS `observacion`,`bdclick1`.`bdpeluqueria`.`mascota` AS `mascota`,`bdclick1`.`bdpeluqueria`.`proxima` AS `proxima`,`bdclick1`.`bdpeluqueria`.`gestion` AS `gestion`,`bdclick1`.`bdpeluqueria`.`fechaGestion` AS `fechaGestion`,`bdclick1`.`bdpeluqueria`.`descripcion` AS `descripcion`,`bdclick1`.`bdterceros`.`id` AS `cc`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`bdclick1`.`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdclick1`.`bdpeluqueria` left join `bdclick1`.`bdterceros` on((`bdclick1`.`bdpeluqueria`.`cliente` = `bdclick1`.`bdterceros`.`idSistema`)))
md5=3925a121de2916de6e0066423182afaa
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:32
create-version=2
source=select `bdpeluqueria`.`Id` AS `Id`,`bdpeluqueria`.`cliente` AS `cliente`,`bdpeluqueria`.`fecha` AS `fecha`,`bdpeluqueria`.`hora` AS `hora`,`bdpeluqueria`.`motivo` AS `motivo`,`bdpeluqueria`.`aCargo` AS `aCargo`,`bdpeluqueria`.`estado` AS `estado`,`bdpeluqueria`.`observacion` AS `observacion`,`bdpeluqueria`.`mascota` AS `mascota`,`bdpeluqueria`.`proxima` AS `proxima`,`bdpeluqueria`.`gestion` AS `gestion`,`bdpeluqueria`.`fechaGestion` AS `fechaGestion`,`bdpeluqueria`.`descripcion` AS `descripcion`,`bdterceros`.`id` AS `cc`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdpeluqueria` left join `bdterceros` on((`bdpeluqueria`.`cliente` = `bdterceros`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdpeluqueria`.`Id` AS `Id`,`bdclick1`.`bdpeluqueria`.`cliente` AS `cliente`,`bdclick1`.`bdpeluqueria`.`fecha` AS `fecha`,`bdclick1`.`bdpeluqueria`.`hora` AS `hora`,`bdclick1`.`bdpeluqueria`.`motivo` AS `motivo`,`bdclick1`.`bdpeluqueria`.`aCargo` AS `aCargo`,`bdclick1`.`bdpeluqueria`.`estado` AS `estado`,`bdclick1`.`bdpeluqueria`.`observacion` AS `observacion`,`bdclick1`.`bdpeluqueria`.`mascota` AS `mascota`,`bdclick1`.`bdpeluqueria`.`proxima` AS `proxima`,`bdclick1`.`bdpeluqueria`.`gestion` AS `gestion`,`bdclick1`.`bdpeluqueria`.`fechaGestion` AS `fechaGestion`,`bdclick1`.`bdpeluqueria`.`descripcion` AS `descripcion`,`bdclick1`.`bdterceros`.`id` AS `cc`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`bdclick1`.`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdclick1`.`bdpeluqueria` left join `bdclick1`.`bdterceros` on((`bdclick1`.`bdpeluqueria`.`cliente` = `bdclick1`.`bdterceros`.`idSistema`)))
mariadb-version=100135
