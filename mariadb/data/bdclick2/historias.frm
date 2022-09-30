TYPE=VIEW
query=select `conhistpacientes`.`id` AS `id`,`conhistpacientes`.`paciente` AS `paciente`,`conhistpacientes`.`nombre` AS `nombre`,`conhistpacientes`.`fecha` AS `fecha`,`conhistpacientes`.`historia` AS `historia`,`conhistpacientes`.`tipo` AS `tipo`,`conhistpacientes`.`sexo` AS `sexo`,`conhistpacientes`.`estado` AS `estado`,`conhistpacientes`.`nacimiento` AS `nacimiento`,`conhistpacientes`.`ocupacion` AS `ocupacion`,`conhistpacientes`.`direccion` AS `direccion`,`conhistpacientes`.`pais` AS `pais`,`conhistpacientes`.`departamento` AS `departamento`,`conhistpacientes`.`ciudad` AS `ciudad`,`conhistpacientes`.`regimen` AS `regimen`,`conhistpacientes`.`afiliado` AS `afiliado`,`conhistpacientes`.`tipoTrabajador` AS `tipoTrabajador`,`consultascies`.`Id` AS `consulta`,`consultascies`.`cie1` AS `cie1`,`consultascies`.`cie2` AS `cie2`,`consultascies`.`cie3` AS `cie3`,`consultascies`.`cie4` AS `cie4`,`consultascies`.`cup` AS `cup`,`consultascies`.`nombre` AS `nombreResponsable`,`consultascies`.`parentesco` AS `parentesco`,`consultascies`.`motivo` AS `motivo`,`consultascies`.`fisico1` AS `fisico1`,`consultascies`.`fisico2` AS `fisico2`,`consultascies`.`fisico3` AS `fisico3`,`consultascies`.`problemas` AS `problemas`,`consultascies`.`recomendaciones` AS `recomendaciones`,`consultascies`.`fecha` AS `fechaConsulta`,`bdclick2`.`bdseguimientoclinica`.`fecha` AS `fechaSeguimiento`,`bdclick2`.`bdseguimientoclinica`.`evolucion` AS `evolucion`,`consultascies`.`tratamiento` AS `tratamiento`,`consultascies`.`t` AS `t`,`consultascies`.`peso` AS `peso`,`consultascies`.`talla` AS `talla`,`consultascies`.`fc` AS `fc`,`consultascies`.`fr` AS `fr`,`consultascies`.`pa` AS `pa`,`consultascies`.`cefalico` AS `cefalico`,`consultascies`.`abdominal` AS `abdominal`,`consultascies`.`cabezaCuello` AS `cabezaCuello`,`consultascies`.`cardioPulmonar` AS `cardioPulmonar`,`consultascies`.`abdomen` AS `abdomen`,`consultascies`.`pelvis` AS `pelvis`,`consultascies`.`gluteos` AS `gluteos`,`consultascies`.`mamas` AS `mamas`,`consultascies`.`extremidades` AS `extremidades`,`conhistpacientes`.`cedulaCliente` AS `cedulaCliente`,`conhistpacientes`.`apellidos` AS `apellidos`,`conhistpacientes`.`nombres` AS `nombres`,`bdclick2`.`bdseguimientoclinica`.`t` AS `t2`,`bdclick2`.`bdseguimientoclinica`.`peso` AS `peso2`,`bdclick2`.`bdseguimientoclinica`.`pa` AS `pa2`,`bdclick2`.`bdseguimientoclinica`.`fr` AS `fr2`,`bdclick2`.`bdseguimientoclinica`.`observaciones` AS `observaciones`,`consultascies`.`organosSentidos` AS `organosSentidos`,`consultascies`.`musculoEsqueletico` AS `musculoEsqueletico`,`consultascies`.`neurologico` AS `neurologico`,`consultascies`.`pielAnexos` AS `pielAnexos`,`cantidadincapacidad`.`cantidadIncapacidad` AS `cantidadIncapacidad`,`cantidadayudasdiagnosticas`.`cantidadAyuda` AS `cantidadAyuda`,`consultascies`.`cie11` AS `cie11`,`consultascies`.`cie22` AS `cie22`,`consultascies`.`cie33` AS `cie33`,`consultascies`.`cie44` AS `cie44`,`consultascies`.`cup1` AS `cup1`,`consultascies`.`familiar` AS `familiar`,`consultascies`.`fumador` AS `fumador`,`consultascies`.`ingesta` AS `ingesta`,`consultascies`.`alergias` AS `alergias`,`consultascies`.`toxicos` AS `toxicos`,`consultascies`.`medicamentos` AS `medicamentos`,`consultascies`.`patologicos` AS `patologicos`,`consultascies`.`psiquiatricos` AS `psiquiatricos`,`consultascies`.`quirurgicos` AS `quirurgicos`,`consultascies`.`ultimaMenstruacion` AS `ultimaMenstruacion`,`consultascies`.`ultimaCitologia` AS `ultimaCitologia`,`consultascies`.`resultadosCitologia` AS `resultadosCitologia`,`consultascies`.`embarazos` AS `embarazos`,`consultascies`.`abortos` AS `abortos`,`consultascies`.`partos` AS `partos`,`consultascies`.`cesarias` AS `cesarias`,`consultascies`.`hijosVivos` AS `hijosVivos`,`consultascies`.`planificacion` AS `planificacion`,`consultascies`.`fotos` AS `fotos`,`consultascies`.`examenes` AS `examenes`,`consultascies`.`revision` AS `revision`,`consultascies`.`oido` AS `oido`,`consultascies`.`vista` AS `vista`,`consultascies`.`nariz` AS `nariz`,`consultascies`.`gusto` AS `gusto`,`consultascies`.`tacto` AS `tacto`,`consultascies`.`telefonoResponsable` AS `telefonoResponsable`,`consultascies`.`responsable` AS `responsable`,`consultascies`.`cup2` AS `cup2`,`consultascies`.`descCup2` AS `descCup2`,`consultascies`.`observacionProcedimientos` AS `observacionProcedimientos`,`consultascies`.`menarca` AS `menarca`,`consultascies`.`diagnosticoEspecializado` AS `diagnosticoEspecializado`,`consultascies`.`nutricionales` AS `nutricionales`,`consultascies`.`cc` AS `cc`,`consultascies`.`torax` AS `torax`,`consultascies`.`abdomen1` AS `abdomen1`,`consultascies`.`extremidades1` AS `extremidades1`,`consultascies`.`neurologico1` AS `neurologico1`,`consultascies`.`pielYfaneras` AS `pielYfaneras`,`consultascies`.`revisionSistemas` AS `revisionSistemas`,`consultascies`.`historialPersonal` AS `historialPersonal`,`consultascies`.`traumaticos` AS `traumaticos` from ((((`bdclick2`.`conhistpacientes` left join `bdclick2`.`consultascies` on((`conhistpacientes`.`id` = `consultascies`.`historia`))) left join `bdclick2`.`bdseguimientoclinica` on((`bdclick2`.`bdseguimientoclinica`.`consulta` = `consultascies`.`Id`))) left join `bdclick2`.`cantidadincapacidad` on((`cantidadincapacidad`.`consulta` = `consultascies`.`Id`))) left join `bdclick2`.`cantidadayudasdiagnosticas` on((`cantidadayudasdiagnosticas`.`historia` = `consultascies`.`Id`))) order by `consultascies`.`fecha`,`bdclick2`.`bdseguimientoclinica`.`fecha`
md5=1c22a0d5e393387bb4b4b5c1938fc328
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:45
create-version=2
source=select `conhistpacientes`.`id` AS `id`,`conhistpacientes`.`paciente` AS `paciente`,`conhistpacientes`.`nombre` AS `nombre`,`conhistpacientes`.`fecha` AS `fecha`,`conhistpacientes`.`historia` AS `historia`,`conhistpacientes`.`tipo` AS `tipo`,`conhistpacientes`.`sexo` AS `sexo`,`conhistpacientes`.`estado` AS `estado`,`conhistpacientes`.`nacimiento` AS `nacimiento`,`conhistpacientes`.`ocupacion` AS `ocupacion`,`conhistpacientes`.`direccion` AS `direccion`,`conhistpacientes`.`pais` AS `pais`,`conhistpacientes`.`departamento` AS `departamento`,`conhistpacientes`.`ciudad` AS `ciudad`,`conhistpacientes`.`regimen` AS `regimen`,`conhistpacientes`.`afiliado` AS `afiliado`,`conhistpacientes`.`tipoTrabajador` AS `tipoTrabajador`,`consultascies`.`Id` AS `consulta`,`consultascies`.`cie1` AS `cie1`,`consultascies`.`cie2` AS `cie2`,`consultascies`.`cie3` AS `cie3`,`consultascies`.`cie4` AS `cie4`,`consultascies`.`cup` AS `cup`,`consultascies`.`nombre` AS `nombreResponsable`,`consultascies`.`parentesco` AS `parentesco`,`consultascies`.`motivo` AS `motivo`,`consultascies`.`fisico1` AS `fisico1`,`consultascies`.`fisico2` AS `fisico2`,`consultascies`.`fisico3` AS `fisico3`,`consultascies`.`problemas` AS `problemas`,`consultascies`.`recomendaciones` AS `recomendaciones`,`consultascies`.`fecha` AS `fechaConsulta`,`bdseguimientoclinica`.`fecha` AS `fechaSeguimiento`,`bdseguimientoclinica`.`evolucion` AS `evolucion`,`consultascies`.`tratamiento` AS `tratamiento`,`consultascies`.`t` AS `t`,`consultascies`.`peso` AS `peso`,`consultascies`.`talla` AS `talla`,`consultascies`.`fc` AS `fc`,`consultascies`.`fr` AS `fr`,`consultascies`.`pa` AS `pa`,`consultascies`.`cefalico` AS `cefalico`,`consultascies`.`abdominal` AS `abdominal`,`consultascies`.`cabezaCuello` AS `cabezaCuello`,`consultascies`.`cardioPulmonar` AS `cardioPulmonar`,`consultascies`.`abdomen` AS `abdomen`,`consultascies`.`pelvis` AS `pelvis`,`consultascies`.`gluteos` AS `gluteos`,`consultascies`.`mamas` AS `mamas`,`consultascies`.`extremidades` AS `extremidades`,`conhistpacientes`.`cedulaCliente` AS `cedulaCliente`,`conhistpacientes`.`apellidos` AS `apellidos`,`conhistpacientes`.`nombres` AS `nombres`,`bdseguimientoclinica`.`t` AS `t2`,`bdseguimientoclinica`.`peso` AS `peso2`,`bdseguimientoclinica`.`pa` AS `pa2`,`bdseguimientoclinica`.`fr` AS `fr2`,`bdseguimientoclinica`.`observaciones` AS `observaciones`,`consultascies`.`organosSentidos` AS `organosSentidos`,`consultascies`.`musculoEsqueletico` AS `musculoEsqueletico`,`consultascies`.`neurologico` AS `neurologico`,`consultascies`.`pielAnexos` AS `pielAnexos`,`cantidadincapacidad`.`cantidadIncapacidad` AS `cantidadIncapacidad`,`cantidadayudasdiagnosticas`.`cantidadAyuda` AS `cantidadAyuda`,`consultascies`.`cie11` AS `cie11`,`consultascies`.`cie22` AS `cie22`,`consultascies`.`cie33` AS `cie33`,`consultascies`.`cie44` AS `cie44`,`consultascies`.`cup1` AS `cup1`,`consultascies`.`familiar` AS `familiar`,`consultascies`.`fumador` AS `fumador`,`consultascies`.`ingesta` AS `ingesta`,`consultascies`.`alergias` AS `alergias`,`consultascies`.`toxicos` AS `toxicos`,`consultascies`.`medicamentos` AS `medicamentos`,`consultascies`.`patologicos` AS `patologicos`,`consultascies`.`psiquiatricos` AS `psiquiatricos`,`consultascies`.`quirurgicos` AS `quirurgicos`,`consultascies`.`ultimaMenstruacion` AS `ultimaMenstruacion`,`consultascies`.`ultimaCitologia` AS `ultimaCitologia`,`consultascies`.`resultadosCitologia` AS `resultadosCitologia`,`consultascies`.`embarazos` AS `embarazos`,`consultascies`.`abortos` AS `abortos`,`consultascies`.`partos` AS `partos`,`consultascies`.`cesarias` AS `cesarias`,`consultascies`.`hijosVivos` AS `hijosVivos`,`consultascies`.`planificacion` AS `planificacion`,`consultascies`.`fotos` AS `fotos`,`consultascies`.`examenes` AS `examenes`,`consultascies`.`revision` AS `revision`,`consultascies`.`oido` AS `oido`,`consultascies`.`vista` AS `vista`,`consultascies`.`nariz` AS `nariz`,`consultascies`.`gusto` AS `gusto`,`consultascies`.`tacto` AS `tacto`,`consultascies`.`telefonoResponsable` AS `telefonoResponsable`,`consultascies`.`responsable` AS `responsable`,`consultascies`.`cup2` AS `cup2`,`consultascies`.`descCup2` AS `descCup2`,`consultascies`.`observacionProcedimientos` AS `observacionProcedimientos`,`consultascies`.`menarca` AS `menarca`,`consultascies`.`diagnosticoEspecializado` AS `diagnosticoEspecializado`,`consultascies`.`nutricionales` AS `nutricionales`,`consultascies`.`cc` AS `cc`,`consultascies`.`torax` AS `torax`,`consultascies`.`abdomen1` AS `abdomen1`,`consultascies`.`extremidades1` AS `extremidades1`,`consultascies`.`neurologico1` AS `neurologico1`,`consultascies`.`pielYfaneras` AS `pielYfaneras`,`consultascies`.`revisionSistemas` AS `revisionSistemas`,`consultascies`.`historialPersonal` AS `historialPersonal`,`consultascies`.`traumaticos` AS `traumaticos` from ((((`conhistpacientes` left join `consultascies` on((`conhistpacientes`.`id` = `consultascies`.`historia`))) left join `bdseguimientoclinica` on((`bdseguimientoclinica`.`consulta` = `consultascies`.`Id`))) left join `cantidadincapacidad` on((`cantidadincapacidad`.`consulta` = `consultascies`.`Id`))) left join `cantidadayudasdiagnosticas` on((`cantidadayudasdiagnosticas`.`historia` = `consultascies`.`Id`))) order by `consultascies`.`fecha`,`bdseguimientoclinica`.`fecha`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `conhistpacientes`.`id` AS `id`,`conhistpacientes`.`paciente` AS `paciente`,`conhistpacientes`.`nombre` AS `nombre`,`conhistpacientes`.`fecha` AS `fecha`,`conhistpacientes`.`historia` AS `historia`,`conhistpacientes`.`tipo` AS `tipo`,`conhistpacientes`.`sexo` AS `sexo`,`conhistpacientes`.`estado` AS `estado`,`conhistpacientes`.`nacimiento` AS `nacimiento`,`conhistpacientes`.`ocupacion` AS `ocupacion`,`conhistpacientes`.`direccion` AS `direccion`,`conhistpacientes`.`pais` AS `pais`,`conhistpacientes`.`departamento` AS `departamento`,`conhistpacientes`.`ciudad` AS `ciudad`,`conhistpacientes`.`regimen` AS `regimen`,`conhistpacientes`.`afiliado` AS `afiliado`,`conhistpacientes`.`tipoTrabajador` AS `tipoTrabajador`,`consultascies`.`Id` AS `consulta`,`consultascies`.`cie1` AS `cie1`,`consultascies`.`cie2` AS `cie2`,`consultascies`.`cie3` AS `cie3`,`consultascies`.`cie4` AS `cie4`,`consultascies`.`cup` AS `cup`,`consultascies`.`nombre` AS `nombreResponsable`,`consultascies`.`parentesco` AS `parentesco`,`consultascies`.`motivo` AS `motivo`,`consultascies`.`fisico1` AS `fisico1`,`consultascies`.`fisico2` AS `fisico2`,`consultascies`.`fisico3` AS `fisico3`,`consultascies`.`problemas` AS `problemas`,`consultascies`.`recomendaciones` AS `recomendaciones`,`consultascies`.`fecha` AS `fechaConsulta`,`bdclick2`.`bdseguimientoclinica`.`fecha` AS `fechaSeguimiento`,`bdclick2`.`bdseguimientoclinica`.`evolucion` AS `evolucion`,`consultascies`.`tratamiento` AS `tratamiento`,`consultascies`.`t` AS `t`,`consultascies`.`peso` AS `peso`,`consultascies`.`talla` AS `talla`,`consultascies`.`fc` AS `fc`,`consultascies`.`fr` AS `fr`,`consultascies`.`pa` AS `pa`,`consultascies`.`cefalico` AS `cefalico`,`consultascies`.`abdominal` AS `abdominal`,`consultascies`.`cabezaCuello` AS `cabezaCuello`,`consultascies`.`cardioPulmonar` AS `cardioPulmonar`,`consultascies`.`abdomen` AS `abdomen`,`consultascies`.`pelvis` AS `pelvis`,`consultascies`.`gluteos` AS `gluteos`,`consultascies`.`mamas` AS `mamas`,`consultascies`.`extremidades` AS `extremidades`,`conhistpacientes`.`cedulaCliente` AS `cedulaCliente`,`conhistpacientes`.`apellidos` AS `apellidos`,`conhistpacientes`.`nombres` AS `nombres`,`bdclick2`.`bdseguimientoclinica`.`t` AS `t2`,`bdclick2`.`bdseguimientoclinica`.`peso` AS `peso2`,`bdclick2`.`bdseguimientoclinica`.`pa` AS `pa2`,`bdclick2`.`bdseguimientoclinica`.`fr` AS `fr2`,`bdclick2`.`bdseguimientoclinica`.`observaciones` AS `observaciones`,`consultascies`.`organosSentidos` AS `organosSentidos`,`consultascies`.`musculoEsqueletico` AS `musculoEsqueletico`,`consultascies`.`neurologico` AS `neurologico`,`consultascies`.`pielAnexos` AS `pielAnexos`,`cantidadincapacidad`.`cantidadIncapacidad` AS `cantidadIncapacidad`,`cantidadayudasdiagnosticas`.`cantidadAyuda` AS `cantidadAyuda`,`consultascies`.`cie11` AS `cie11`,`consultascies`.`cie22` AS `cie22`,`consultascies`.`cie33` AS `cie33`,`consultascies`.`cie44` AS `cie44`,`consultascies`.`cup1` AS `cup1`,`consultascies`.`familiar` AS `familiar`,`consultascies`.`fumador` AS `fumador`,`consultascies`.`ingesta` AS `ingesta`,`consultascies`.`alergias` AS `alergias`,`consultascies`.`toxicos` AS `toxicos`,`consultascies`.`medicamentos` AS `medicamentos`,`consultascies`.`patologicos` AS `patologicos`,`consultascies`.`psiquiatricos` AS `psiquiatricos`,`consultascies`.`quirurgicos` AS `quirurgicos`,`consultascies`.`ultimaMenstruacion` AS `ultimaMenstruacion`,`consultascies`.`ultimaCitologia` AS `ultimaCitologia`,`consultascies`.`resultadosCitologia` AS `resultadosCitologia`,`consultascies`.`embarazos` AS `embarazos`,`consultascies`.`abortos` AS `abortos`,`consultascies`.`partos` AS `partos`,`consultascies`.`cesarias` AS `cesarias`,`consultascies`.`hijosVivos` AS `hijosVivos`,`consultascies`.`planificacion` AS `planificacion`,`consultascies`.`fotos` AS `fotos`,`consultascies`.`examenes` AS `examenes`,`consultascies`.`revision` AS `revision`,`consultascies`.`oido` AS `oido`,`consultascies`.`vista` AS `vista`,`consultascies`.`nariz` AS `nariz`,`consultascies`.`gusto` AS `gusto`,`consultascies`.`tacto` AS `tacto`,`consultascies`.`telefonoResponsable` AS `telefonoResponsable`,`consultascies`.`responsable` AS `responsable`,`consultascies`.`cup2` AS `cup2`,`consultascies`.`descCup2` AS `descCup2`,`consultascies`.`observacionProcedimientos` AS `observacionProcedimientos`,`consultascies`.`menarca` AS `menarca`,`consultascies`.`diagnosticoEspecializado` AS `diagnosticoEspecializado`,`consultascies`.`nutricionales` AS `nutricionales`,`consultascies`.`cc` AS `cc`,`consultascies`.`torax` AS `torax`,`consultascies`.`abdomen1` AS `abdomen1`,`consultascies`.`extremidades1` AS `extremidades1`,`consultascies`.`neurologico1` AS `neurologico1`,`consultascies`.`pielYfaneras` AS `pielYfaneras`,`consultascies`.`revisionSistemas` AS `revisionSistemas`,`consultascies`.`historialPersonal` AS `historialPersonal`,`consultascies`.`traumaticos` AS `traumaticos` from ((((`bdclick2`.`conhistpacientes` left join `bdclick2`.`consultascies` on((`conhistpacientes`.`id` = `consultascies`.`historia`))) left join `bdclick2`.`bdseguimientoclinica` on((`bdclick2`.`bdseguimientoclinica`.`consulta` = `consultascies`.`Id`))) left join `bdclick2`.`cantidadincapacidad` on((`cantidadincapacidad`.`consulta` = `consultascies`.`Id`))) left join `bdclick2`.`cantidadayudasdiagnosticas` on((`cantidadayudasdiagnosticas`.`historia` = `consultascies`.`Id`))) order by `consultascies`.`fecha`,`bdclick2`.`bdseguimientoclinica`.`fecha`
mariadb-version=100135