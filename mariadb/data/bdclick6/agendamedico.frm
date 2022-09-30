TYPE=VIEW
query=select `bdclick6`.`bdagenda`.`Id` AS `Id`,`bdclick6`.`bdagenda`.`cliente` AS `cliente`,`bdclick6`.`bdagenda`.`fecha` AS `fecha`,`bdclick6`.`bdagenda`.`hora` AS `hora`,`bdclick6`.`bdagenda`.`motivo` AS `motivo`,`bdclick6`.`bdagenda`.`aCargo` AS `aCargo`,`bdclick6`.`bdagenda`.`estado` AS `estado`,`bdclick6`.`bdagenda`.`observacion` AS `observacion`,`bdclick6`.`bdagenda`.`mascota` AS `mascota`,`bdclick6`.`bdagenda`.`proxima` AS `proxima`,`bdclick6`.`bdagenda`.`gestion` AS `gestion`,`bdclick6`.`bdagenda`.`fechaGestion` AS `fechaGestion`,`bdclick6`.`bdagenda`.`descripcion` AS `descripcion`,`bdclick6`.`bdterceros`.`id` AS `cc`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdclick6`.`bdagenda` left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdagenda`.`cliente` = `bdclick6`.`bdterceros`.`idSistema`))) order by `bdclick6`.`bdagenda`.`fecha`,`bdclick6`.`bdagenda`.`hora`
md5=fbbc812cd347727e81d03cdd9307b427
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:32
create-version=2
source=select `bdagenda`.`Id` AS `Id`,`bdagenda`.`cliente` AS `cliente`,`bdagenda`.`fecha` AS `fecha`,`bdagenda`.`hora` AS `hora`,`bdagenda`.`motivo` AS `motivo`,`bdagenda`.`aCargo` AS `aCargo`,`bdagenda`.`estado` AS `estado`,`bdagenda`.`observacion` AS `observacion`,`bdagenda`.`mascota` AS `mascota`,`bdagenda`.`proxima` AS `proxima`,`bdagenda`.`gestion` AS `gestion`,`bdagenda`.`fechaGestion` AS `fechaGestion`,`bdagenda`.`descripcion` AS `descripcion`,`bdterceros`.`id` AS `cc`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdagenda` left join `bdterceros` on((`bdagenda`.`cliente` = `bdterceros`.`idSistema`))) order by `bdagenda`.`fecha`,`bdagenda`.`hora`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdagenda`.`Id` AS `Id`,`bdclick6`.`bdagenda`.`cliente` AS `cliente`,`bdclick6`.`bdagenda`.`fecha` AS `fecha`,`bdclick6`.`bdagenda`.`hora` AS `hora`,`bdclick6`.`bdagenda`.`motivo` AS `motivo`,`bdclick6`.`bdagenda`.`aCargo` AS `aCargo`,`bdclick6`.`bdagenda`.`estado` AS `estado`,`bdclick6`.`bdagenda`.`observacion` AS `observacion`,`bdclick6`.`bdagenda`.`mascota` AS `mascota`,`bdclick6`.`bdagenda`.`proxima` AS `proxima`,`bdclick6`.`bdagenda`.`gestion` AS `gestion`,`bdclick6`.`bdagenda`.`fechaGestion` AS `fechaGestion`,`bdclick6`.`bdagenda`.`descripcion` AS `descripcion`,`bdclick6`.`bdterceros`.`id` AS `cc`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdclick6`.`bdagenda` left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdagenda`.`cliente` = `bdclick6`.`bdterceros`.`idSistema`))) order by `bdclick6`.`bdagenda`.`fecha`,`bdclick6`.`bdagenda`.`hora`
mariadb-version=100135
