TYPE=VIEW
query=select `bdclick2`.`bdagenda`.`Id` AS `Id`,`bdclick2`.`bdagenda`.`cliente` AS `cliente`,`bdclick2`.`bdagenda`.`fecha` AS `fecha`,`bdclick2`.`bdagenda`.`hora` AS `hora`,`bdclick2`.`bdagenda`.`motivo` AS `motivo`,`bdclick2`.`bdagenda`.`aCargo` AS `aCargo`,`bdclick2`.`bdagenda`.`estado` AS `estado`,`bdclick2`.`bdagenda`.`observacion` AS `observacion`,`bdclick2`.`bdagenda`.`mascota` AS `mascota`,`bdclick2`.`bdagenda`.`proxima` AS `proxima`,`bdclick2`.`bdagenda`.`gestion` AS `gestion`,`bdclick2`.`bdagenda`.`fechaGestion` AS `fechaGestion`,`bdclick2`.`bdagenda`.`descripcion` AS `descripcion`,`bdclick2`.`bdterceros`.`id` AS `cc`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,`bdclick2`.`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdclick2`.`bdagenda` left join `bdclick2`.`bdterceros` on((`bdclick2`.`bdagenda`.`cliente` = `bdclick2`.`bdterceros`.`idSistema`))) order by `bdclick2`.`bdagenda`.`fecha`,`bdclick2`.`bdagenda`.`hora`
md5=e65b78d3348e8aad40ffd362477cd0f6
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:42
create-version=2
source=select `bdagenda`.`Id` AS `Id`,`bdagenda`.`cliente` AS `cliente`,`bdagenda`.`fecha` AS `fecha`,`bdagenda`.`hora` AS `hora`,`bdagenda`.`motivo` AS `motivo`,`bdagenda`.`aCargo` AS `aCargo`,`bdagenda`.`estado` AS `estado`,`bdagenda`.`observacion` AS `observacion`,`bdagenda`.`mascota` AS `mascota`,`bdagenda`.`proxima` AS `proxima`,`bdagenda`.`gestion` AS `gestion`,`bdagenda`.`fechaGestion` AS `fechaGestion`,`bdagenda`.`descripcion` AS `descripcion`,`bdterceros`.`id` AS `cc`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdagenda` left join `bdterceros` on((`bdagenda`.`cliente` = `bdterceros`.`idSistema`))) order by `bdagenda`.`fecha`,`bdagenda`.`hora`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdagenda`.`Id` AS `Id`,`bdclick2`.`bdagenda`.`cliente` AS `cliente`,`bdclick2`.`bdagenda`.`fecha` AS `fecha`,`bdclick2`.`bdagenda`.`hora` AS `hora`,`bdclick2`.`bdagenda`.`motivo` AS `motivo`,`bdclick2`.`bdagenda`.`aCargo` AS `aCargo`,`bdclick2`.`bdagenda`.`estado` AS `estado`,`bdclick2`.`bdagenda`.`observacion` AS `observacion`,`bdclick2`.`bdagenda`.`mascota` AS `mascota`,`bdclick2`.`bdagenda`.`proxima` AS `proxima`,`bdclick2`.`bdagenda`.`gestion` AS `gestion`,`bdclick2`.`bdagenda`.`fechaGestion` AS `fechaGestion`,`bdclick2`.`bdagenda`.`descripcion` AS `descripcion`,`bdclick2`.`bdterceros`.`id` AS `cc`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,`bdclick2`.`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdclick2`.`bdagenda` left join `bdclick2`.`bdterceros` on((`bdclick2`.`bdagenda`.`cliente` = `bdclick2`.`bdterceros`.`idSistema`))) order by `bdclick2`.`bdagenda`.`fecha`,`bdclick2`.`bdagenda`.`hora`
mariadb-version=100135
