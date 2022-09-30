TYPE=VIEW
query=select `bdclick1`.`bdagenda`.`Id` AS `Id`,`bdclick1`.`bdagenda`.`cliente` AS `cliente`,`bdclick1`.`bdagenda`.`fecha` AS `fecha`,`bdclick1`.`bdagenda`.`hora` AS `hora`,`bdclick1`.`bdagenda`.`motivo` AS `motivo`,`bdclick1`.`bdagenda`.`aCargo` AS `aCargo`,`bdclick1`.`bdagenda`.`estado` AS `estado`,`bdclick1`.`bdagenda`.`observacion` AS `observacion`,`bdclick1`.`bdagenda`.`mascota` AS `mascota`,`bdclick1`.`bdagenda`.`proxima` AS `proxima`,`bdclick1`.`bdagenda`.`gestion` AS `gestion`,`bdclick1`.`bdagenda`.`fechaGestion` AS `fechaGestion`,`bdclick1`.`bdagenda`.`descripcion` AS `descripcion`,`bdclick1`.`bdterceros`.`id` AS `cc`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`bdclick1`.`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdclick1`.`bdagenda` left join `bdclick1`.`bdterceros` on((`bdclick1`.`bdagenda`.`cliente` = `bdclick1`.`bdterceros`.`idSistema`))) order by `bdclick1`.`bdagenda`.`fecha`,`bdclick1`.`bdagenda`.`hora`
md5=2dba5f625eea02cd5d58e8c5fca34e8a
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:32
create-version=2
source=select `bdagenda`.`Id` AS `Id`,`bdagenda`.`cliente` AS `cliente`,`bdagenda`.`fecha` AS `fecha`,`bdagenda`.`hora` AS `hora`,`bdagenda`.`motivo` AS `motivo`,`bdagenda`.`aCargo` AS `aCargo`,`bdagenda`.`estado` AS `estado`,`bdagenda`.`observacion` AS `observacion`,`bdagenda`.`mascota` AS `mascota`,`bdagenda`.`proxima` AS `proxima`,`bdagenda`.`gestion` AS `gestion`,`bdagenda`.`fechaGestion` AS `fechaGestion`,`bdagenda`.`descripcion` AS `descripcion`,`bdterceros`.`id` AS `cc`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdagenda` left join `bdterceros` on((`bdagenda`.`cliente` = `bdterceros`.`idSistema`))) order by `bdagenda`.`fecha`,`bdagenda`.`hora`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdagenda`.`Id` AS `Id`,`bdclick1`.`bdagenda`.`cliente` AS `cliente`,`bdclick1`.`bdagenda`.`fecha` AS `fecha`,`bdclick1`.`bdagenda`.`hora` AS `hora`,`bdclick1`.`bdagenda`.`motivo` AS `motivo`,`bdclick1`.`bdagenda`.`aCargo` AS `aCargo`,`bdclick1`.`bdagenda`.`estado` AS `estado`,`bdclick1`.`bdagenda`.`observacion` AS `observacion`,`bdclick1`.`bdagenda`.`mascota` AS `mascota`,`bdclick1`.`bdagenda`.`proxima` AS `proxima`,`bdclick1`.`bdagenda`.`gestion` AS `gestion`,`bdclick1`.`bdagenda`.`fechaGestion` AS `fechaGestion`,`bdclick1`.`bdagenda`.`descripcion` AS `descripcion`,`bdclick1`.`bdterceros`.`id` AS `cc`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`bdclick1`.`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdclick1`.`bdagenda` left join `bdclick1`.`bdterceros` on((`bdclick1`.`bdagenda`.`cliente` = `bdclick1`.`bdterceros`.`idSistema`))) order by `bdclick1`.`bdagenda`.`fecha`,`bdclick1`.`bdagenda`.`hora`
mariadb-version=100135
