TYPE=VIEW
query=select `bdclick3`.`bdagenda`.`Id` AS `Id`,`bdclick3`.`bdagenda`.`cliente` AS `cliente`,`bdclick3`.`bdagenda`.`fecha` AS `fecha`,`bdclick3`.`bdagenda`.`hora` AS `hora`,`bdclick3`.`bdagenda`.`motivo` AS `motivo`,`bdclick3`.`bdagenda`.`aCargo` AS `aCargo`,`bdclick3`.`bdagenda`.`estado` AS `estado`,`bdclick3`.`bdagenda`.`observacion` AS `observacion`,`bdclick3`.`bdagenda`.`mascota` AS `mascota`,`bdclick3`.`bdagenda`.`proxima` AS `proxima`,`bdclick3`.`bdagenda`.`gestion` AS `gestion`,`bdclick3`.`bdagenda`.`fechaGestion` AS `fechaGestion`,`bdclick3`.`bdagenda`.`descripcion` AS `descripcion`,`bdclick3`.`bdterceros`.`id` AS `cc`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdclick3`.`bdagenda` left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdagenda`.`cliente` = `bdclick3`.`bdterceros`.`idSistema`))) order by `bdclick3`.`bdagenda`.`fecha`,`bdclick3`.`bdagenda`.`hora`
md5=cfce399a606d3d5ea130543c4c4825f7
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:47
create-version=2
source=select `bdagenda`.`Id` AS `Id`,`bdagenda`.`cliente` AS `cliente`,`bdagenda`.`fecha` AS `fecha`,`bdagenda`.`hora` AS `hora`,`bdagenda`.`motivo` AS `motivo`,`bdagenda`.`aCargo` AS `aCargo`,`bdagenda`.`estado` AS `estado`,`bdagenda`.`observacion` AS `observacion`,`bdagenda`.`mascota` AS `mascota`,`bdagenda`.`proxima` AS `proxima`,`bdagenda`.`gestion` AS `gestion`,`bdagenda`.`fechaGestion` AS `fechaGestion`,`bdagenda`.`descripcion` AS `descripcion`,`bdterceros`.`id` AS `cc`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdagenda` left join `bdterceros` on((`bdagenda`.`cliente` = `bdterceros`.`idSistema`))) order by `bdagenda`.`fecha`,`bdagenda`.`hora`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdagenda`.`Id` AS `Id`,`bdclick3`.`bdagenda`.`cliente` AS `cliente`,`bdclick3`.`bdagenda`.`fecha` AS `fecha`,`bdclick3`.`bdagenda`.`hora` AS `hora`,`bdclick3`.`bdagenda`.`motivo` AS `motivo`,`bdclick3`.`bdagenda`.`aCargo` AS `aCargo`,`bdclick3`.`bdagenda`.`estado` AS `estado`,`bdclick3`.`bdagenda`.`observacion` AS `observacion`,`bdclick3`.`bdagenda`.`mascota` AS `mascota`,`bdclick3`.`bdagenda`.`proxima` AS `proxima`,`bdclick3`.`bdagenda`.`gestion` AS `gestion`,`bdclick3`.`bdagenda`.`fechaGestion` AS `fechaGestion`,`bdclick3`.`bdagenda`.`descripcion` AS `descripcion`,`bdclick3`.`bdterceros`.`id` AS `cc`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdclick3`.`bdagenda` left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdagenda`.`cliente` = `bdclick3`.`bdterceros`.`idSistema`))) order by `bdclick3`.`bdagenda`.`fecha`,`bdclick3`.`bdagenda`.`hora`
mariadb-version=100135
