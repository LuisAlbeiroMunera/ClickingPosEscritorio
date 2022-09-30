TYPE=VIEW
query=select `bdclick5`.`bdhistoriaclinica`.`id` AS `id`,`bdclick5`.`bdhistoriaclinica`.`paciente` AS `paciente`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdhistoriaclinica`.`fecha` AS `fecha`,`bdclick5`.`bdhistoriaclinica`.`historia` AS `historia`,`bdclick5`.`bdterceros`.`id` AS `cedulaCliente`,`bdclick5`.`bdterceros`.`tipo` AS `tipo`,`bdclick5`.`bdterceros`.`sexo` AS `sexo`,`bdclick5`.`bdterceros`.`estado` AS `estado`,`bdclick5`.`bdterceros`.`nacimiento` AS `nacimiento`,`bdclick5`.`bdterceros`.`ocupacion` AS `ocupacion`,`bdclick5`.`bdterceros`.`direccion` AS `direccion`,`bdclick5`.`bdterceros`.`pais` AS `pais`,`bdclick5`.`bdterceros`.`departamento` AS `departamento`,`bdclick5`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick5`.`bdterceros`.`regimen` AS `regimen`,`bdclick5`.`bdterceros`.`afiliado` AS `afiliado`,`bdclick5`.`bdterceros`.`tipoTrabajador` AS `tipoTrabajador`,concat_ws(\' \',`bdclick5`.`bdterceros`.`pApellido`,`bdclick5`.`bdterceros`.`sApellido`,\' \') AS `apellidos`,concat_ws(\' \',`bdclick5`.`bdterceros`.`pNombre`,`bdclick5`.`bdterceros`.`sNombre`) AS `nombres`,`bdclick5`.`bdhistoriaclinica`.`personal` AS `personal`,`bdclick5`.`bdhistoriaclinica`.`familiar` AS `familiar`,`bdclick5`.`bdhistoriaclinica`.`menstruacion` AS `menstruacion`,`bdclick5`.`bdhistoriaclinica`.`citologia` AS `citologia`,`bdclick5`.`bdhistoriaclinica`.`resultadoCitologia` AS `resultadoCitologia`,`bdclick5`.`bdhistoriaclinica`.`embarazos` AS `embarazos`,`bdclick5`.`bdhistoriaclinica`.`partos` AS `partos`,`bdclick5`.`bdhistoriaclinica`.`abortos` AS `abortos`,`bdclick5`.`bdhistoriaclinica`.`cesareas` AS `cesareas`,`bdclick5`.`bdhistoriaclinica`.`hijosVivos` AS `hijosVivos` from (`bdclick5`.`bdhistoriaclinica` left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdterceros`.`idSistema` = `bdclick5`.`bdhistoriaclinica`.`paciente`)))
md5=6beaf307af80ef2de8bee6284eddfcfd
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:45
create-version=2
source=select `bdhistoriaclinica`.`id` AS `id`,`bdhistoriaclinica`.`paciente` AS `paciente`,`bdterceros`.`nombre` AS `nombre`,`bdhistoriaclinica`.`fecha` AS `fecha`,`bdhistoriaclinica`.`historia` AS `historia`,`bdterceros`.`id` AS `cedulaCliente`,`bdterceros`.`tipo` AS `tipo`,`bdterceros`.`sexo` AS `sexo`,`bdterceros`.`estado` AS `estado`,`bdterceros`.`nacimiento` AS `nacimiento`,`bdterceros`.`ocupacion` AS `ocupacion`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`pais` AS `pais`,`bdterceros`.`departamento` AS `departamento`,`bdterceros`.`ciudad` AS `ciudad`,`bdterceros`.`regimen` AS `regimen`,`bdterceros`.`afiliado` AS `afiliado`,`bdterceros`.`tipoTrabajador` AS `tipoTrabajador`,concat_ws(\' \',`bdterceros`.`pApellido`,`bdterceros`.`sApellido`,\' \') AS `apellidos`,concat_ws(\' \',`bdterceros`.`pNombre`,`bdterceros`.`sNombre`) AS `nombres`,`bdhistoriaclinica`.`personal` AS `personal`,`bdhistoriaclinica`.`familiar` AS `familiar`,`bdhistoriaclinica`.`menstruacion` AS `menstruacion`,`bdhistoriaclinica`.`citologia` AS `citologia`,`bdhistoriaclinica`.`resultadoCitologia` AS `resultadoCitologia`,`bdhistoriaclinica`.`embarazos` AS `embarazos`,`bdhistoriaclinica`.`partos` AS `partos`,`bdhistoriaclinica`.`abortos` AS `abortos`,`bdhistoriaclinica`.`cesareas` AS `cesareas`,`bdhistoriaclinica`.`hijosVivos` AS `hijosVivos` from (`bdhistoriaclinica` left join `bdterceros` on((`bdterceros`.`idSistema` = `bdhistoriaclinica`.`paciente`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdhistoriaclinica`.`id` AS `id`,`bdclick5`.`bdhistoriaclinica`.`paciente` AS `paciente`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdhistoriaclinica`.`fecha` AS `fecha`,`bdclick5`.`bdhistoriaclinica`.`historia` AS `historia`,`bdclick5`.`bdterceros`.`id` AS `cedulaCliente`,`bdclick5`.`bdterceros`.`tipo` AS `tipo`,`bdclick5`.`bdterceros`.`sexo` AS `sexo`,`bdclick5`.`bdterceros`.`estado` AS `estado`,`bdclick5`.`bdterceros`.`nacimiento` AS `nacimiento`,`bdclick5`.`bdterceros`.`ocupacion` AS `ocupacion`,`bdclick5`.`bdterceros`.`direccion` AS `direccion`,`bdclick5`.`bdterceros`.`pais` AS `pais`,`bdclick5`.`bdterceros`.`departamento` AS `departamento`,`bdclick5`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick5`.`bdterceros`.`regimen` AS `regimen`,`bdclick5`.`bdterceros`.`afiliado` AS `afiliado`,`bdclick5`.`bdterceros`.`tipoTrabajador` AS `tipoTrabajador`,concat_ws(\' \',`bdclick5`.`bdterceros`.`pApellido`,`bdclick5`.`bdterceros`.`sApellido`,\' \') AS `apellidos`,concat_ws(\' \',`bdclick5`.`bdterceros`.`pNombre`,`bdclick5`.`bdterceros`.`sNombre`) AS `nombres`,`bdclick5`.`bdhistoriaclinica`.`personal` AS `personal`,`bdclick5`.`bdhistoriaclinica`.`familiar` AS `familiar`,`bdclick5`.`bdhistoriaclinica`.`menstruacion` AS `menstruacion`,`bdclick5`.`bdhistoriaclinica`.`citologia` AS `citologia`,`bdclick5`.`bdhistoriaclinica`.`resultadoCitologia` AS `resultadoCitologia`,`bdclick5`.`bdhistoriaclinica`.`embarazos` AS `embarazos`,`bdclick5`.`bdhistoriaclinica`.`partos` AS `partos`,`bdclick5`.`bdhistoriaclinica`.`abortos` AS `abortos`,`bdclick5`.`bdhistoriaclinica`.`cesareas` AS `cesareas`,`bdclick5`.`bdhistoriaclinica`.`hijosVivos` AS `hijosVivos` from (`bdclick5`.`bdhistoriaclinica` left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdterceros`.`idSistema` = `bdclick5`.`bdhistoriaclinica`.`paciente`)))
mariadb-version=100135