TYPE=VIEW
query=select `bdclick3`.`bdordenservicio`.`id` AS `id`,`bdclick3`.`bdordenservicio`.`orden` AS `orden`,`bdclick3`.`bdordenservicio`.`usuario` AS `usuario`,`bdclick3`.`bdordenservicio`.`fecha` AS `fecha`,`bdclick3`.`bdordenservicio`.`poliza` AS `poliza`,`bdclick3`.`bdordenservicio`.`concepto` AS `concepto`,`bdclick3`.`bdordenservicio`.`acobrar` AS `acobrar`,`bdclick3`.`bdordenservicio`.`autorizacion` AS `autorizacion`,`bdclick3`.`bdordenservicio`.`finalidad` AS `finalidad`,`bdclick3`.`bdordenservicio`.`causa` AS `causa`,`bdclick3`.`bdordenservicio`.`ambito` AS `ambito`,`bdclick3`.`bdordenservicio`.`personal` AS `personal`,`bdclick3`.`bdordenservicio`.`forma` AS `forma`,`bdclick3`.`bdordenservicio`.`copago` AS `copago`,`bdclick3`.`bdordenservicio`.`comision` AS `comision`,`bdclick3`.`bdordenservicio`.`descuento` AS `descuento`,`bdclick3`.`bdordenservicio`.`valor` AS `valor`,`bdclick3`.`bdordenservicio`.`cantidad` AS `cantidad`,`bdclick3`.`bdordenservicio`.`cuota` AS `cuota`,`bdclick3`.`bdordenservicio`.`paciente` AS `paciente`,`bdclick3`.`bdordenservicio`.`cie` AS `cie`,`bdclick3`.`bdordenservicio`.`cup` AS `cup`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdterceros`.`id` AS `cedula`,`bdclick3`.`bdproductos`.`Descripcion` AS `producto` from ((`bdclick3`.`bdordenservicio` left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdordenservicio`.`paciente` = `bdclick3`.`bdterceros`.`idSistema`))) left join `bdclick3`.`bdproductos` on((`bdclick3`.`bdordenservicio`.`acobrar` = `bdclick3`.`bdproductos`.`idSistema`)))
md5=96cc7e0f4a1dd42613c42551d00340b4
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:53
create-version=2
source=select `bdordenservicio`.`id` AS `id`,`bdordenservicio`.`orden` AS `orden`,`bdordenservicio`.`usuario` AS `usuario`,`bdordenservicio`.`fecha` AS `fecha`,`bdordenservicio`.`poliza` AS `poliza`,`bdordenservicio`.`concepto` AS `concepto`,`bdordenservicio`.`acobrar` AS `acobrar`,`bdordenservicio`.`autorizacion` AS `autorizacion`,`bdordenservicio`.`finalidad` AS `finalidad`,`bdordenservicio`.`causa` AS `causa`,`bdordenservicio`.`ambito` AS `ambito`,`bdordenservicio`.`personal` AS `personal`,`bdordenservicio`.`forma` AS `forma`,`bdordenservicio`.`copago` AS `copago`,`bdordenservicio`.`comision` AS `comision`,`bdordenservicio`.`descuento` AS `descuento`,`bdordenservicio`.`valor` AS `valor`,`bdordenservicio`.`cantidad` AS `cantidad`,`bdordenservicio`.`cuota` AS `cuota`,`bdordenservicio`.`paciente` AS `paciente`,`bdordenservicio`.`cie` AS `cie`,`bdordenservicio`.`cup` AS `cup`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`id` AS `cedula`,`bdproductos`.`Descripcion` AS `producto` from ((`bdordenservicio` left join `bdterceros` on((`bdordenservicio`.`paciente` = `bdterceros`.`idSistema`))) left join `bdproductos` on((`bdordenservicio`.`acobrar` = `bdproductos`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdordenservicio`.`id` AS `id`,`bdclick3`.`bdordenservicio`.`orden` AS `orden`,`bdclick3`.`bdordenservicio`.`usuario` AS `usuario`,`bdclick3`.`bdordenservicio`.`fecha` AS `fecha`,`bdclick3`.`bdordenservicio`.`poliza` AS `poliza`,`bdclick3`.`bdordenservicio`.`concepto` AS `concepto`,`bdclick3`.`bdordenservicio`.`acobrar` AS `acobrar`,`bdclick3`.`bdordenservicio`.`autorizacion` AS `autorizacion`,`bdclick3`.`bdordenservicio`.`finalidad` AS `finalidad`,`bdclick3`.`bdordenservicio`.`causa` AS `causa`,`bdclick3`.`bdordenservicio`.`ambito` AS `ambito`,`bdclick3`.`bdordenservicio`.`personal` AS `personal`,`bdclick3`.`bdordenservicio`.`forma` AS `forma`,`bdclick3`.`bdordenservicio`.`copago` AS `copago`,`bdclick3`.`bdordenservicio`.`comision` AS `comision`,`bdclick3`.`bdordenservicio`.`descuento` AS `descuento`,`bdclick3`.`bdordenservicio`.`valor` AS `valor`,`bdclick3`.`bdordenservicio`.`cantidad` AS `cantidad`,`bdclick3`.`bdordenservicio`.`cuota` AS `cuota`,`bdclick3`.`bdordenservicio`.`paciente` AS `paciente`,`bdclick3`.`bdordenservicio`.`cie` AS `cie`,`bdclick3`.`bdordenservicio`.`cup` AS `cup`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdterceros`.`id` AS `cedula`,`bdclick3`.`bdproductos`.`Descripcion` AS `producto` from ((`bdclick3`.`bdordenservicio` left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdordenservicio`.`paciente` = `bdclick3`.`bdterceros`.`idSistema`))) left join `bdclick3`.`bdproductos` on((`bdclick3`.`bdordenservicio`.`acobrar` = `bdclick3`.`bdproductos`.`idSistema`)))
mariadb-version=100135