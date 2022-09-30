TYPE=VIEW
query=select `bdclick6`.`bdordenservicio`.`id` AS `orden`,`bdclick6`.`bdordenservicio`.`consecutivo` AS `consecutivo`,`bdclick6`.`bdordenservicio`.`codigoConsecutivo` AS `codigoConsecutivo`,`bdclick6`.`bdordenservicio`.`fecha` AS `fecha`,`bdclick6`.`bdordenservicio`.`paciente` AS `paciente`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdterceros`.`id` AS `cedula`,`bdclick6`.`bdordenservicio`.`cie` AS `cie`,`bdclick6`.`bdordenservicio`.`cup` AS `cup`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,`bdclick6`.`bdterceros`.`celular` AS `celular`,`bdclick6`.`bdterceros`.`nacimiento` AS `nacimiento`,`bdclick6`.`bdterceros`.`afiliado` AS `afiliado`,`bdclick6`.`bdordenservicio`.`cantidad` AS `cantidad`,`bdclick6`.`bdproductos`.`Descripcion` AS `procedimientoAutorizado`,`bdclick6`.`bdordenservicio`.`copago` AS `copago`,`bdclick6`.`bdordenservicio`.`valor` AS `valor`,`bdclick6`.`bdordenservicio`.`tipo` AS `tipo`,`bdclick6`.`bdordenservicio`.`concepto` AS `concepto`,`bdclick6`.`bdordenservicio`.`poliza` AS `poliza`,`bdclick6`.`bdordenservicio`.`cuota` AS `cuota`,`bdclick6`.`bdordenservicio`.`autorizacion` AS `autorizacion`,`bdclick6`.`bdordenservicio`.`causa` AS `causa`,`bdclick6`.`bdordenservicio`.`finalidad` AS `finalidad`,`bdclick6`.`bdproductos`.`L1` AS `valorServicio`,`bdclick6`.`bdproductos`.`Codigo` AS `codigoProd`,`bdclick6`.`bdordenservicio`.`acobrar` AS `codigoServicio`,`bdclick6`.`bdordenservicio`.`descuento` AS `descuento`,`bdclick6`.`bdordenservicio`.`cantidadRealizada` AS `cantidadRealizada`,`bdclick6`.`bdordenservicio`.`comision` AS `comision`,`bdclick6`.`bdordenservicio`.`ambito` AS `ambito`,`bdclick6`.`bdordenservicio`.`personal` AS `personal`,`bdclick6`.`bdordenservicio`.`codigoIps` AS `codigoIps`,`bdclick6`.`bdordenservicio`.`forma` AS `forma`,`bdclick6`.`bdordenservicio`.`cie` AS `codigoDiagnostico`,`bdclick6`.`bdordenservicio`.`cup` AS `codigoProcedimiento`,`bdclick6`.`bdterceros`.`eps` AS `eps`,`bdclick6`.`bdepsprecargados`.`nombre` AS `nombreEps`,`bdclick6`.`bdterceros`.`eps` AS `dato1`,`empleado`.`id` AS `IdMedico`,`empleado`.`nombre` AS `nombreMedico`,(case when (`bdclick6`.`bdordenservicio`.`actoQuirurgico` = 1) then \'Unico o unilateral\' when (`bdclick6`.`bdordenservicio`.`actoQuirurgico` = 2) then \'M�ltiple o bilateral, misma v�a, diferente especialidad\' when (`bdclick6`.`bdordenservicio`.`actoQuirurgico` = 3) then \'M�ltiple o bilateral, misma v�a, igual especialidad\' when (`bdclick6`.`bdordenservicio`.`actoQuirurgico` = 4) then \'M�ltiple o bilateral, diferente v�a, diferente especialidad\' when (`bdclick6`.`bdordenservicio`.`actoQuirurgico` = 5) then \'M�ltiple o bilateral, diferente v�a, igual especialidad\' end) AS `descripcionActoQuirurgico` from (((((((`bdclick6`.`bdordenservicio` left join `bdclick6`.`bdproductos` on((`bdclick6`.`bdordenservicio`.`acobrar` = `bdclick6`.`bdproductos`.`idSistema`))) left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdordenservicio`.`paciente` = `bdclick6`.`bdterceros`.`idSistema`))) left join `bdclick6`.`bdcies` on((`bdclick6`.`bdordenservicio`.`cie` = `bdclick6`.`bdcies`.`Id`))) left join `bdclick6`.`bdcups` on((`bdclick6`.`bdordenservicio`.`cup` = `bdclick6`.`bdcups`.`Id`))) left join `bdclick6`.`bdepsprecargados` on((`bdclick6`.`bdterceros`.`eps` = `bdclick6`.`bdepsprecargados`.`Id`))) left join `bdclick6`.`bdepsprecargados` `bdepsprecargados_1` on((`bdclick6`.`bdterceros`.`eps` = `bdepsprecargados_1`.`Id`))) left join `bdclick6`.`bdterceros` `empleado` on((`bdclick6`.`bdordenservicio`.`medico` = `empleado`.`nombre`)))
md5=84cdcdf8de507b36c497a576034d15bd
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:38
create-version=2
source=select `bdordenservicio`.`id` AS `orden`,`bdordenservicio`.`consecutivo` AS `consecutivo`,`bdordenservicio`.`codigoConsecutivo` AS `codigoConsecutivo`,`bdordenservicio`.`fecha` AS `fecha`,`bdordenservicio`.`paciente` AS `paciente`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`id` AS `cedula`,`bdordenservicio`.`cie` AS `cie`,`bdordenservicio`.`cup` AS `cup`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`celular` AS `celular`,`bdterceros`.`nacimiento` AS `nacimiento`,`bdterceros`.`afiliado` AS `afiliado`,`bdordenservicio`.`cantidad` AS `cantidad`,`bdproductos`.`Descripcion` AS `procedimientoAutorizado`,`bdordenservicio`.`copago` AS `copago`,`bdordenservicio`.`valor` AS `valor`,`bdordenservicio`.`tipo` AS `tipo`,`bdordenservicio`.`concepto` AS `concepto`,`bdordenservicio`.`poliza` AS `poliza`,`bdordenservicio`.`cuota` AS `cuota`,`bdordenservicio`.`autorizacion` AS `autorizacion`,`bdordenservicio`.`causa` AS `causa`,`bdordenservicio`.`finalidad` AS `finalidad`,`bdproductos`.`L1` AS `valorServicio`,`bdproductos`.`Codigo` AS `codigoProd`,`bdordenservicio`.`acobrar` AS `codigoServicio`,`bdordenservicio`.`descuento` AS `descuento`,`bdordenservicio`.`cantidadRealizada` AS `cantidadRealizada`,`bdordenservicio`.`comision` AS `comision`,`bdordenservicio`.`ambito` AS `ambito`,`bdordenservicio`.`personal` AS `personal`,`bdordenservicio`.`codigoIps` AS `codigoIps`,`bdordenservicio`.`forma` AS `forma`,`bdordenservicio`.`cie` AS `codigoDiagnostico`,`bdordenservicio`.`cup` AS `codigoProcedimiento`,`bdterceros`.`eps` AS `eps`,`bdepsprecargados`.`nombre` AS `nombreEps`,`bdterceros`.`eps` AS `dato1`,`empleado`.`id` AS `IdMedico`,`empleado`.`nombre` AS `nombreMedico`,(case when (`bdordenservicio`.`actoQuirurgico` = 1) then \'Unico o unilateral\' when (`bdordenservicio`.`actoQuirurgico` = 2) then \'M�ltiple o bilateral, misma v�a, diferente especialidad\' when (`bdordenservicio`.`actoQuirurgico` = 3) then \'M�ltiple o bilateral, misma v�a, igual especialidad\' when (`bdordenservicio`.`actoQuirurgico` = 4) then \'M�ltiple o bilateral, diferente v�a, diferente especialidad\' when (`bdordenservicio`.`actoQuirurgico` = 5) then \'M�ltiple o bilateral, diferente v�a, igual especialidad\' end) AS `descripcionActoQuirurgico` from (((((((`bdordenservicio` left join `bdproductos` on((`bdordenservicio`.`acobrar` = `bdproductos`.`idSistema`))) left join `bdterceros` on((`bdordenservicio`.`paciente` = `bdterceros`.`idSistema`))) left join `bdcies` on((`bdordenservicio`.`cie` = `bdcies`.`Id`))) left join `bdcups` on((`bdordenservicio`.`cup` = `bdcups`.`Id`))) left join `bdepsprecargados` on((`bdterceros`.`eps` = `bdepsprecargados`.`Id`))) left join `bdepsprecargados` `bdepsprecargados_1` on((`bdterceros`.`eps` = `bdepsprecargados_1`.`Id`))) left join `bdterceros` `empleado` on((`bdordenservicio`.`medico` = `empleado`.`nombre`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdordenservicio`.`id` AS `orden`,`bdclick6`.`bdordenservicio`.`consecutivo` AS `consecutivo`,`bdclick6`.`bdordenservicio`.`codigoConsecutivo` AS `codigoConsecutivo`,`bdclick6`.`bdordenservicio`.`fecha` AS `fecha`,`bdclick6`.`bdordenservicio`.`paciente` AS `paciente`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdterceros`.`id` AS `cedula`,`bdclick6`.`bdordenservicio`.`cie` AS `cie`,`bdclick6`.`bdordenservicio`.`cup` AS `cup`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,`bdclick6`.`bdterceros`.`celular` AS `celular`,`bdclick6`.`bdterceros`.`nacimiento` AS `nacimiento`,`bdclick6`.`bdterceros`.`afiliado` AS `afiliado`,`bdclick6`.`bdordenservicio`.`cantidad` AS `cantidad`,`bdclick6`.`bdproductos`.`Descripcion` AS `procedimientoAutorizado`,`bdclick6`.`bdordenservicio`.`copago` AS `copago`,`bdclick6`.`bdordenservicio`.`valor` AS `valor`,`bdclick6`.`bdordenservicio`.`tipo` AS `tipo`,`bdclick6`.`bdordenservicio`.`concepto` AS `concepto`,`bdclick6`.`bdordenservicio`.`poliza` AS `poliza`,`bdclick6`.`bdordenservicio`.`cuota` AS `cuota`,`bdclick6`.`bdordenservicio`.`autorizacion` AS `autorizacion`,`bdclick6`.`bdordenservicio`.`causa` AS `causa`,`bdclick6`.`bdordenservicio`.`finalidad` AS `finalidad`,`bdclick6`.`bdproductos`.`L1` AS `valorServicio`,`bdclick6`.`bdproductos`.`Codigo` AS `codigoProd`,`bdclick6`.`bdordenservicio`.`acobrar` AS `codigoServicio`,`bdclick6`.`bdordenservicio`.`descuento` AS `descuento`,`bdclick6`.`bdordenservicio`.`cantidadRealizada` AS `cantidadRealizada`,`bdclick6`.`bdordenservicio`.`comision` AS `comision`,`bdclick6`.`bdordenservicio`.`ambito` AS `ambito`,`bdclick6`.`bdordenservicio`.`personal` AS `personal`,`bdclick6`.`bdordenservicio`.`codigoIps` AS `codigoIps`,`bdclick6`.`bdordenservicio`.`forma` AS `forma`,`bdclick6`.`bdordenservicio`.`cie` AS `codigoDiagnostico`,`bdclick6`.`bdordenservicio`.`cup` AS `codigoProcedimiento`,`bdclick6`.`bdterceros`.`eps` AS `eps`,`bdclick6`.`bdepsprecargados`.`nombre` AS `nombreEps`,`bdclick6`.`bdterceros`.`eps` AS `dato1`,`empleado`.`id` AS `IdMedico`,`empleado`.`nombre` AS `nombreMedico`,(case when (`bdclick6`.`bdordenservicio`.`actoQuirurgico` = 1) then \'Unico o unilateral\' when (`bdclick6`.`bdordenservicio`.`actoQuirurgico` = 2) then \'M�ltiple o bilateral, misma v�a, diferente especialidad\' when (`bdclick6`.`bdordenservicio`.`actoQuirurgico` = 3) then \'M�ltiple o bilateral, misma v�a, igual especialidad\' when (`bdclick6`.`bdordenservicio`.`actoQuirurgico` = 4) then \'M�ltiple o bilateral, diferente v�a, diferente especialidad\' when (`bdclick6`.`bdordenservicio`.`actoQuirurgico` = 5) then \'M�ltiple o bilateral, diferente v�a, igual especialidad\' end) AS `descripcionActoQuirurgico` from (((((((`bdclick6`.`bdordenservicio` left join `bdclick6`.`bdproductos` on((`bdclick6`.`bdordenservicio`.`acobrar` = `bdclick6`.`bdproductos`.`idSistema`))) left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdordenservicio`.`paciente` = `bdclick6`.`bdterceros`.`idSistema`))) left join `bdclick6`.`bdcies` on((`bdclick6`.`bdordenservicio`.`cie` = `bdclick6`.`bdcies`.`Id`))) left join `bdclick6`.`bdcups` on((`bdclick6`.`bdordenservicio`.`cup` = `bdclick6`.`bdcups`.`Id`))) left join `bdclick6`.`bdepsprecargados` on((`bdclick6`.`bdterceros`.`eps` = `bdclick6`.`bdepsprecargados`.`Id`))) left join `bdclick6`.`bdepsprecargados` `bdepsprecargados_1` on((`bdclick6`.`bdterceros`.`eps` = `bdepsprecargados_1`.`Id`))) left join `bdclick6`.`bdterceros` `empleado` on((`bdclick6`.`bdordenservicio`.`medico` = `empleado`.`nombre`)))
mariadb-version=100135