TYPE=VIEW
query=select `bdclick6`.`bdhistoriaclinica`.`id` AS `id`,`bdclick6`.`bdhistoriaclinica`.`paciente` AS `paciente`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdhistoriaclinica`.`fecha` AS `fecha`,`bdclick6`.`bdhistoriaclinica`.`historia` AS `historia`,`bdclick6`.`bdterceros`.`id` AS `cedulaCliente`,`bdclick6`.`bdterceros`.`tipo` AS `tipo`,`bdclick6`.`bdterceros`.`sexo` AS `sexo`,`bdclick6`.`bdterceros`.`estado` AS `estado`,`bdclick6`.`bdterceros`.`nacimiento` AS `nacimiento`,`bdclick6`.`bdterceros`.`ocupacion` AS `ocupacion`,`bdclick6`.`bdterceros`.`direccion` AS `direccion`,`bdclick6`.`bdterceros`.`pais` AS `pais`,`bdclick6`.`bdterceros`.`departamento` AS `departamento`,`bdclick6`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick6`.`bdterceros`.`regimen` AS `regimen`,`bdclick6`.`bdterceros`.`afiliado` AS `afiliado`,`bdclick6`.`bdterceros`.`tipoTrabajador` AS `tipoTrabajador`,concat_ws(\' \',`bdclick6`.`bdterceros`.`pApellido`,`bdclick6`.`bdterceros`.`sApellido`,\' \') AS `apellidos`,concat_ws(\' \',`bdclick6`.`bdterceros`.`pNombre`,`bdclick6`.`bdterceros`.`sNombre`) AS `nombres`,`bdclick6`.`bdhistoriaclinica`.`personal` AS `personal`,`bdclick6`.`bdhistoriaclinica`.`familiar` AS `familiar`,`bdclick6`.`bdhistoriaclinica`.`menstruacion` AS `menstruacion`,`bdclick6`.`bdhistoriaclinica`.`citologia` AS `citologia`,`bdclick6`.`bdhistoriaclinica`.`resultadoCitologia` AS `resultadoCitologia`,`bdclick6`.`bdhistoriaclinica`.`embarazos` AS `embarazos`,`bdclick6`.`bdhistoriaclinica`.`partos` AS `partos`,`bdclick6`.`bdhistoriaclinica`.`abortos` AS `abortos`,`bdclick6`.`bdhistoriaclinica`.`cesareas` AS `cesareas`,`bdclick6`.`bdhistoriaclinica`.`hijosVivos` AS `hijosVivos` from (`bdclick6`.`bdhistoriaclinica` left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdterceros`.`idSistema` = `bdclick6`.`bdhistoriaclinica`.`paciente`)))
md5=8aae4cc371e4e0d1f5f725734b8f73b2
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:33
create-version=2
source=select `bdhistoriaclinica`.`id` AS `id`,`bdhistoriaclinica`.`paciente` AS `paciente`,`bdterceros`.`nombre` AS `nombre`,`bdhistoriaclinica`.`fecha` AS `fecha`,`bdhistoriaclinica`.`historia` AS `historia`,`bdterceros`.`id` AS `cedulaCliente`,`bdterceros`.`tipo` AS `tipo`,`bdterceros`.`sexo` AS `sexo`,`bdterceros`.`estado` AS `estado`,`bdterceros`.`nacimiento` AS `nacimiento`,`bdterceros`.`ocupacion` AS `ocupacion`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`pais` AS `pais`,`bdterceros`.`departamento` AS `departamento`,`bdterceros`.`ciudad` AS `ciudad`,`bdterceros`.`regimen` AS `regimen`,`bdterceros`.`afiliado` AS `afiliado`,`bdterceros`.`tipoTrabajador` AS `tipoTrabajador`,concat_ws(\' \',`bdterceros`.`pApellido`,`bdterceros`.`sApellido`,\' \') AS `apellidos`,concat_ws(\' \',`bdterceros`.`pNombre`,`bdterceros`.`sNombre`) AS `nombres`,`bdhistoriaclinica`.`personal` AS `personal`,`bdhistoriaclinica`.`familiar` AS `familiar`,`bdhistoriaclinica`.`menstruacion` AS `menstruacion`,`bdhistoriaclinica`.`citologia` AS `citologia`,`bdhistoriaclinica`.`resultadoCitologia` AS `resultadoCitologia`,`bdhistoriaclinica`.`embarazos` AS `embarazos`,`bdhistoriaclinica`.`partos` AS `partos`,`bdhistoriaclinica`.`abortos` AS `abortos`,`bdhistoriaclinica`.`cesareas` AS `cesareas`,`bdhistoriaclinica`.`hijosVivos` AS `hijosVivos` from (`bdhistoriaclinica` left join `bdterceros` on((`bdterceros`.`idSistema` = `bdhistoriaclinica`.`paciente`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdhistoriaclinica`.`id` AS `id`,`bdclick6`.`bdhistoriaclinica`.`paciente` AS `paciente`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdhistoriaclinica`.`fecha` AS `fecha`,`bdclick6`.`bdhistoriaclinica`.`historia` AS `historia`,`bdclick6`.`bdterceros`.`id` AS `cedulaCliente`,`bdclick6`.`bdterceros`.`tipo` AS `tipo`,`bdclick6`.`bdterceros`.`sexo` AS `sexo`,`bdclick6`.`bdterceros`.`estado` AS `estado`,`bdclick6`.`bdterceros`.`nacimiento` AS `nacimiento`,`bdclick6`.`bdterceros`.`ocupacion` AS `ocupacion`,`bdclick6`.`bdterceros`.`direccion` AS `direccion`,`bdclick6`.`bdterceros`.`pais` AS `pais`,`bdclick6`.`bdterceros`.`departamento` AS `departamento`,`bdclick6`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick6`.`bdterceros`.`regimen` AS `regimen`,`bdclick6`.`bdterceros`.`afiliado` AS `afiliado`,`bdclick6`.`bdterceros`.`tipoTrabajador` AS `tipoTrabajador`,concat_ws(\' \',`bdclick6`.`bdterceros`.`pApellido`,`bdclick6`.`bdterceros`.`sApellido`,\' \') AS `apellidos`,concat_ws(\' \',`bdclick6`.`bdterceros`.`pNombre`,`bdclick6`.`bdterceros`.`sNombre`) AS `nombres`,`bdclick6`.`bdhistoriaclinica`.`personal` AS `personal`,`bdclick6`.`bdhistoriaclinica`.`familiar` AS `familiar`,`bdclick6`.`bdhistoriaclinica`.`menstruacion` AS `menstruacion`,`bdclick6`.`bdhistoriaclinica`.`citologia` AS `citologia`,`bdclick6`.`bdhistoriaclinica`.`resultadoCitologia` AS `resultadoCitologia`,`bdclick6`.`bdhistoriaclinica`.`embarazos` AS `embarazos`,`bdclick6`.`bdhistoriaclinica`.`partos` AS `partos`,`bdclick6`.`bdhistoriaclinica`.`abortos` AS `abortos`,`bdclick6`.`bdhistoriaclinica`.`cesareas` AS `cesareas`,`bdclick6`.`bdhistoriaclinica`.`hijosVivos` AS `hijosVivos` from (`bdclick6`.`bdhistoriaclinica` left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdterceros`.`idSistema` = `bdclick6`.`bdhistoriaclinica`.`paciente`)))
mariadb-version=100135
