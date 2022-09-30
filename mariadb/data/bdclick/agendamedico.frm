TYPE=VIEW
query=select `bdclick`.`bdagenda`.`Id` AS `Id`,`bdclick`.`bdagenda`.`cliente` AS `cliente`,`bdclick`.`bdagenda`.`fecha` AS `fecha`,`bdclick`.`bdagenda`.`hora` AS `hora`,`bdclick`.`bdagenda`.`motivo` AS `motivo`,`bdclick`.`bdagenda`.`aCargo` AS `aCargo`,`bdclick`.`bdagenda`.`estado` AS `estado`,`bdclick`.`bdagenda`.`observacion` AS `observacion`,`bdclick`.`bdagenda`.`mascota` AS `mascota`,`bdclick`.`bdagenda`.`proxima` AS `proxima`,`bdclick`.`bdagenda`.`gestion` AS `gestion`,`bdclick`.`bdagenda`.`fechaGestion` AS `fechaGestion`,`bdclick`.`bdagenda`.`descripcion` AS `descripcion`,`bdclick`.`bdterceros`.`id` AS `cc`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdclick`.`bdagenda` left join `bdclick`.`bdterceros` on((`bdclick`.`bdagenda`.`cliente` = `bdclick`.`bdterceros`.`idSistema`))) order by `bdclick`.`bdagenda`.`fecha`,`bdclick`.`bdagenda`.`hora`
md5=d9a9fbca2e0dd95a298057eaf4b14f52
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:21
create-version=2
source=select `bdagenda`.`Id` AS `Id`,`bdagenda`.`cliente` AS `cliente`,`bdagenda`.`fecha` AS `fecha`,`bdagenda`.`hora` AS `hora`,`bdagenda`.`motivo` AS `motivo`,`bdagenda`.`aCargo` AS `aCargo`,`bdagenda`.`estado` AS `estado`,`bdagenda`.`observacion` AS `observacion`,`bdagenda`.`mascota` AS `mascota`,`bdagenda`.`proxima` AS `proxima`,`bdagenda`.`gestion` AS `gestion`,`bdagenda`.`fechaGestion` AS `fechaGestion`,`bdagenda`.`descripcion` AS `descripcion`,`bdterceros`.`id` AS `cc`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdagenda` left join `bdterceros` on((`bdagenda`.`cliente` = `bdterceros`.`idSistema`))) order by `bdagenda`.`fecha`,`bdagenda`.`hora`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdagenda`.`Id` AS `Id`,`bdclick`.`bdagenda`.`cliente` AS `cliente`,`bdclick`.`bdagenda`.`fecha` AS `fecha`,`bdclick`.`bdagenda`.`hora` AS `hora`,`bdclick`.`bdagenda`.`motivo` AS `motivo`,`bdclick`.`bdagenda`.`aCargo` AS `aCargo`,`bdclick`.`bdagenda`.`estado` AS `estado`,`bdclick`.`bdagenda`.`observacion` AS `observacion`,`bdclick`.`bdagenda`.`mascota` AS `mascota`,`bdclick`.`bdagenda`.`proxima` AS `proxima`,`bdclick`.`bdagenda`.`gestion` AS `gestion`,`bdclick`.`bdagenda`.`fechaGestion` AS `fechaGestion`,`bdclick`.`bdagenda`.`descripcion` AS `descripcion`,`bdclick`.`bdterceros`.`id` AS `cc`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdterceros`.`telefono` AS `telefono`,\'\' AS `primerNombre`,\'\' AS `segundoNombre`,\'\' AS `primerApellido`,\'\' AS `segundoApellido` from (`bdclick`.`bdagenda` left join `bdclick`.`bdterceros` on((`bdclick`.`bdagenda`.`cliente` = `bdclick`.`bdterceros`.`idSistema`))) order by `bdclick`.`bdagenda`.`fecha`,`bdclick`.`bdagenda`.`hora`
mariadb-version=100135
