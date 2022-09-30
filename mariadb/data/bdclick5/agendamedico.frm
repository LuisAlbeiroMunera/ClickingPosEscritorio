TYPE=VIEW
query=select `bdclick5`.`bdagenda`.`Id` AS `Id`,`bdclick5`.`bdagenda`.`cliente` AS `cliente`,`bdclick5`.`bdagenda`.`fecha` AS `fecha`,`bdclick5`.`bdagenda`.`hora` AS `hora`,`bdclick5`.`bdagenda`.`motivo` AS `motivo`,`bdclick5`.`bdagenda`.`aCargo` AS `aCargo`,`bdclick5`.`bdagenda`.`estado` AS `estado`,`bdclick5`.`bdagenda`.`observacion` AS `observacion`,`bdclick5`.`bdagenda`.`mascota` AS `mascota`,`bdclick5`.`bdagenda`.`proxima` AS `proxima`,`bdclick5`.`bdagenda`.`gestion` AS `gestion`,`bdclick5`.`bdagenda`.`fechaGestion` AS `fechaGestion`,`bdclick5`.`bdagenda`.`descripcion` AS `descripcion`,`bdclick5`.`bdterceros`.`id` AS `cc`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdclick5`.`bdagenda` left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdagenda`.`cliente` = `bdclick5`.`bdterceros`.`idSistema`))) order by `bdclick5`.`bdagenda`.`fecha`,`bdclick5`.`bdagenda`.`hora`
md5=41e2c79c8c1f985469cc67a040781506
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:44
create-version=2
source=select `bdagenda`.`Id` AS `Id`,`bdagenda`.`cliente` AS `cliente`,`bdagenda`.`fecha` AS `fecha`,`bdagenda`.`hora` AS `hora`,`bdagenda`.`motivo` AS `motivo`,`bdagenda`.`aCargo` AS `aCargo`,`bdagenda`.`estado` AS `estado`,`bdagenda`.`observacion` AS `observacion`,`bdagenda`.`mascota` AS `mascota`,`bdagenda`.`proxima` AS `proxima`,`bdagenda`.`gestion` AS `gestion`,`bdagenda`.`fechaGestion` AS `fechaGestion`,`bdagenda`.`descripcion` AS `descripcion`,`bdterceros`.`id` AS `cc`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdagenda` left join `bdterceros` on((`bdagenda`.`cliente` = `bdterceros`.`idSistema`))) order by `bdagenda`.`fecha`,`bdagenda`.`hora`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdagenda`.`Id` AS `Id`,`bdclick5`.`bdagenda`.`cliente` AS `cliente`,`bdclick5`.`bdagenda`.`fecha` AS `fecha`,`bdclick5`.`bdagenda`.`hora` AS `hora`,`bdclick5`.`bdagenda`.`motivo` AS `motivo`,`bdclick5`.`bdagenda`.`aCargo` AS `aCargo`,`bdclick5`.`bdagenda`.`estado` AS `estado`,`bdclick5`.`bdagenda`.`observacion` AS `observacion`,`bdclick5`.`bdagenda`.`mascota` AS `mascota`,`bdclick5`.`bdagenda`.`proxima` AS `proxima`,`bdclick5`.`bdagenda`.`gestion` AS `gestion`,`bdclick5`.`bdagenda`.`fechaGestion` AS `fechaGestion`,`bdclick5`.`bdagenda`.`descripcion` AS `descripcion`,`bdclick5`.`bdterceros`.`id` AS `cc`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdclick5`.`bdagenda` left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdagenda`.`cliente` = `bdclick5`.`bdterceros`.`idSistema`))) order by `bdclick5`.`bdagenda`.`fecha`,`bdclick5`.`bdagenda`.`hora`
mariadb-version=100135
