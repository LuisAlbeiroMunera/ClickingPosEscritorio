TYPE=VIEW
query=select `bdclick`.`bdpeluqueria`.`Id` AS `Id`,`bdclick`.`bdpeluqueria`.`cliente` AS `cliente`,`bdclick`.`bdpeluqueria`.`fecha` AS `fecha`,`bdclick`.`bdpeluqueria`.`hora` AS `hora`,`bdclick`.`bdpeluqueria`.`motivo` AS `motivo`,`bdclick`.`bdpeluqueria`.`aCargo` AS `aCargo`,`bdclick`.`bdpeluqueria`.`estado` AS `estado`,`bdclick`.`bdpeluqueria`.`observacion` AS `observacion`,`bdclick`.`bdpeluqueria`.`mascota` AS `mascota`,`bdclick`.`bdpeluqueria`.`proxima` AS `proxima`,`bdclick`.`bdpeluqueria`.`gestion` AS `gestion`,`bdclick`.`bdpeluqueria`.`fechaGestion` AS `fechaGestion`,`bdclick`.`bdpeluqueria`.`descripcion` AS `descripcion`,`bdclick`.`bdterceros`.`id` AS `cc`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdclick`.`bdpeluqueria` left join `bdclick`.`bdterceros` on((`bdclick`.`bdpeluqueria`.`cliente` = `bdclick`.`bdterceros`.`idSistema`)))
md5=a2ed58a4f6f040eeb3144e308008b3af
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:21
create-version=2
source=select `bdpeluqueria`.`Id` AS `Id`,`bdpeluqueria`.`cliente` AS `cliente`,`bdpeluqueria`.`fecha` AS `fecha`,`bdpeluqueria`.`hora` AS `hora`,`bdpeluqueria`.`motivo` AS `motivo`,`bdpeluqueria`.`aCargo` AS `aCargo`,`bdpeluqueria`.`estado` AS `estado`,`bdpeluqueria`.`observacion` AS `observacion`,`bdpeluqueria`.`mascota` AS `mascota`,`bdpeluqueria`.`proxima` AS `proxima`,`bdpeluqueria`.`gestion` AS `gestion`,`bdpeluqueria`.`fechaGestion` AS `fechaGestion`,`bdpeluqueria`.`descripcion` AS `descripcion`,`bdterceros`.`id` AS `cc`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdpeluqueria` left join `bdterceros` on((`bdpeluqueria`.`cliente` = `bdterceros`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdpeluqueria`.`Id` AS `Id`,`bdclick`.`bdpeluqueria`.`cliente` AS `cliente`,`bdclick`.`bdpeluqueria`.`fecha` AS `fecha`,`bdclick`.`bdpeluqueria`.`hora` AS `hora`,`bdclick`.`bdpeluqueria`.`motivo` AS `motivo`,`bdclick`.`bdpeluqueria`.`aCargo` AS `aCargo`,`bdclick`.`bdpeluqueria`.`estado` AS `estado`,`bdclick`.`bdpeluqueria`.`observacion` AS `observacion`,`bdclick`.`bdpeluqueria`.`mascota` AS `mascota`,`bdclick`.`bdpeluqueria`.`proxima` AS `proxima`,`bdclick`.`bdpeluqueria`.`gestion` AS `gestion`,`bdclick`.`bdpeluqueria`.`fechaGestion` AS `fechaGestion`,`bdclick`.`bdpeluqueria`.`descripcion` AS `descripcion`,`bdclick`.`bdterceros`.`id` AS `cc`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdclick`.`bdpeluqueria` left join `bdclick`.`bdterceros` on((`bdclick`.`bdpeluqueria`.`cliente` = `bdclick`.`bdterceros`.`idSistema`)))
mariadb-version=100135
