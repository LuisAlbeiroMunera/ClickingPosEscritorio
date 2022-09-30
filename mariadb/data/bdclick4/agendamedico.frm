TYPE=VIEW
query=select `bdclick4`.`bdagenda`.`Id` AS `Id`,`bdclick4`.`bdagenda`.`cliente` AS `cliente`,`bdclick4`.`bdagenda`.`fecha` AS `fecha`,`bdclick4`.`bdagenda`.`hora` AS `hora`,`bdclick4`.`bdagenda`.`motivo` AS `motivo`,`bdclick4`.`bdagenda`.`aCargo` AS `aCargo`,`bdclick4`.`bdagenda`.`estado` AS `estado`,`bdclick4`.`bdagenda`.`observacion` AS `observacion`,`bdclick4`.`bdagenda`.`mascota` AS `mascota`,`bdclick4`.`bdagenda`.`proxima` AS `proxima`,`bdclick4`.`bdagenda`.`gestion` AS `gestion`,`bdclick4`.`bdagenda`.`fechaGestion` AS `fechaGestion`,`bdclick4`.`bdagenda`.`descripcion` AS `descripcion`,`bdclick4`.`bdterceros`.`id` AS `cc`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,`bdclick4`.`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdclick4`.`bdagenda` left join `bdclick4`.`bdterceros` on((`bdclick4`.`bdagenda`.`cliente` = `bdclick4`.`bdterceros`.`idSistema`))) order by `bdclick4`.`bdagenda`.`fecha`,`bdclick4`.`bdagenda`.`hora`
md5=d661dbd04939645ba37279687c69fa7d
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:25
create-version=2
source=select `bdagenda`.`Id` AS `Id`,`bdagenda`.`cliente` AS `cliente`,`bdagenda`.`fecha` AS `fecha`,`bdagenda`.`hora` AS `hora`,`bdagenda`.`motivo` AS `motivo`,`bdagenda`.`aCargo` AS `aCargo`,`bdagenda`.`estado` AS `estado`,`bdagenda`.`observacion` AS `observacion`,`bdagenda`.`mascota` AS `mascota`,`bdagenda`.`proxima` AS `proxima`,`bdagenda`.`gestion` AS `gestion`,`bdagenda`.`fechaGestion` AS `fechaGestion`,`bdagenda`.`descripcion` AS `descripcion`,`bdterceros`.`id` AS `cc`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdagenda` left join `bdterceros` on((`bdagenda`.`cliente` = `bdterceros`.`idSistema`))) order by `bdagenda`.`fecha`,`bdagenda`.`hora`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdagenda`.`Id` AS `Id`,`bdclick4`.`bdagenda`.`cliente` AS `cliente`,`bdclick4`.`bdagenda`.`fecha` AS `fecha`,`bdclick4`.`bdagenda`.`hora` AS `hora`,`bdclick4`.`bdagenda`.`motivo` AS `motivo`,`bdclick4`.`bdagenda`.`aCargo` AS `aCargo`,`bdclick4`.`bdagenda`.`estado` AS `estado`,`bdclick4`.`bdagenda`.`observacion` AS `observacion`,`bdclick4`.`bdagenda`.`mascota` AS `mascota`,`bdclick4`.`bdagenda`.`proxima` AS `proxima`,`bdclick4`.`bdagenda`.`gestion` AS `gestion`,`bdclick4`.`bdagenda`.`fechaGestion` AS `fechaGestion`,`bdclick4`.`bdagenda`.`descripcion` AS `descripcion`,`bdclick4`.`bdterceros`.`id` AS `cc`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,`bdclick4`.`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdclick4`.`bdagenda` left join `bdclick4`.`bdterceros` on((`bdclick4`.`bdagenda`.`cliente` = `bdclick4`.`bdterceros`.`idSistema`))) order by `bdclick4`.`bdagenda`.`fecha`,`bdclick4`.`bdagenda`.`hora`
mariadb-version=100135
