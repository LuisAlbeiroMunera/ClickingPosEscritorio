TYPE=VIEW
query=select `bdclick2`.`bdconsultaclinica`.`Id` AS `Id`,`bdcies_1`.`descripcion` AS `cie1`,`bdcies_2`.`descripcion` AS `cie2`,`bdcies_3`.`descripcion` AS `cie3`,`bdcies_4`.`descripcion` AS `cie4`,`bdclick2`.`bdcups`.`descripcion` AS `cup`,`bdclick2`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick2`.`bdconsultaclinica`.`responsable` AS `responsable`,`bdclick2`.`bdconsultaclinica`.`nombre` AS `nombre`,`bdclick2`.`bdconsultaclinica`.`parentesco` AS `parentesco`,`bdclick2`.`bdconsultaclinica`.`motivo` AS `motivo`,`bdclick2`.`bdconsultaclinica`.`fisico1` AS `fisico1`,`bdclick2`.`bdconsultaclinica`.`fisico2` AS `fisico2`,`bdclick2`.`bdconsultaclinica`.`fisico3` AS `fisico3`,`bdclick2`.`bdconsultaclinica`.`problemas` AS `problemas`,`bdclick2`.`bdconsultaclinica`.`recomendaciones` AS `recomendaciones`,`bdclick2`.`bdconsultaclinica`.`usuario` AS `usuario`,`bdclick2`.`bdconsultaclinica`.`fecha` AS `fecha`,`bdclick2`.`bdconsultaclinica`.`tratamiento` AS `tratamiento`,`bdclick2`.`bdconsultaclinica`.`t` AS `t`,`bdclick2`.`bdconsultaclinica`.`peso` AS `peso`,`bdclick2`.`bdconsultaclinica`.`talla` AS `talla`,`bdclick2`.`bdconsultaclinica`.`fc` AS `fc`,`bdclick2`.`bdconsultaclinica`.`fr` AS `fr`,`bdclick2`.`bdconsultaclinica`.`pa` AS `pa`,`bdclick2`.`bdconsultaclinica`.`cefalico` AS `cefalico`,`bdclick2`.`bdconsultaclinica`.`abdominal` AS `abdominal`,`bdclick2`.`bdconsultaclinica`.`cabezaCuello` AS `cabezaCuello`,`bdclick2`.`bdconsultaclinica`.`cardioPulmonar` AS `cardioPulmonar`,`bdclick2`.`bdconsultaclinica`.`abdomen` AS `abdomen`,`bdclick2`.`bdconsultaclinica`.`pelvis` AS `pelvis`,`bdclick2`.`bdconsultaclinica`.`extremidades` AS `extremidades`,`bdclick2`.`bdconsultaclinica`.`organosSentidos` AS `organosSentidos`,`bdclick2`.`bdconsultaclinica`.`musculoEsqueletico` AS `musculoEsqueletico`,`bdclick2`.`bdconsultaclinica`.`neurologico` AS `neurologico`,`bdclick2`.`bdconsultaclinica`.`pielAnexos` AS `pielAnexos`,`bdclick2`.`bdconsultaclinica`.`cie1` AS `cie11`,`bdclick2`.`bdconsultaclinica`.`cie2` AS `cie22`,`bdclick2`.`bdconsultaclinica`.`cie3` AS `cie33`,`bdclick2`.`bdconsultaclinica`.`cie4` AS `cie44`,`bdclick2`.`bdconsultaclinica`.`cup` AS `cup1`,`bdclick2`.`bdconsultaclinica`.`familiar` AS `familiar`,`bdclick2`.`bdconsultaclinica`.`fumador` AS `fumador`,`bdclick2`.`bdconsultaclinica`.`ingesta` AS `ingesta`,`bdclick2`.`bdconsultaclinica`.`alergias` AS `alergias`,`bdclick2`.`bdconsultaclinica`.`toxicos` AS `toxicos`,`bdclick2`.`bdconsultaclinica`.`medicamentos` AS `medicamentos`,`bdclick2`.`bdconsultaclinica`.`patologicos` AS `patologicos`,`bdclick2`.`bdconsultaclinica`.`psiquiatricos` AS `psiquiatricos`,`bdclick2`.`bdconsultaclinica`.`quirurgicos` AS `quirurgicos`,`bdclick2`.`bdconsultaclinica`.`ultimaMenstruacion` AS `ultimaMenstruacion`,`bdclick2`.`bdconsultaclinica`.`ultimaCitologia` AS `ultimaCitologia`,`bdclick2`.`bdconsultaclinica`.`resultadosCitologia` AS `resultadosCitologia`,`bdclick2`.`bdconsultaclinica`.`embarazos` AS `embarazos`,`bdclick2`.`bdconsultaclinica`.`abortos` AS `abortos`,`bdclick2`.`bdconsultaclinica`.`partos` AS `partos`,`bdclick2`.`bdconsultaclinica`.`cesarias` AS `cesarias`,`bdclick2`.`bdconsultaclinica`.`hijosVivos` AS `hijosVivos`,`bdclick2`.`bdconsultaclinica`.`planificacion` AS `planificacion`,`bdclick2`.`bdconsultaclinica`.`fotos` AS `fotos`,`bdclick2`.`bdconsultaclinica`.`examenes` AS `examenes`,`bdclick2`.`bdconsultaclinica`.`revision` AS `revision`,`bdclick2`.`bdconsultaclinica`.`oido` AS `oido`,`bdclick2`.`bdconsultaclinica`.`vista` AS `vista`,`bdclick2`.`bdconsultaclinica`.`nariz` AS `nariz`,`bdclick2`.`bdconsultaclinica`.`gusto` AS `gusto`,`bdclick2`.`bdconsultaclinica`.`tacto` AS `tacto`,`bdclick2`.`bdconsultaclinica`.`telefonoResponsable` AS `telefonoResponsable`,`bdclick2`.`bdconsultaclinica`.`cup2` AS `cup2`,`bdcups_1`.`descripcion` AS `descCup2`,`bdclick2`.`bdconsultaclinica`.`observacionProcedimientos` AS `observacionProcedimientos`,`bdclick2`.`bdconsultaclinica`.`menarca` AS `menarca`,`bdclick2`.`bdconsultaclinica`.`diagnosticoEspecializado` AS `diagnosticoEspecializado`,`bdclick2`.`bdconsultaclinica`.`nutricionales` AS `nutricionales`,`bdclick2`.`bdconsultaclinica`.`cc` AS `cc`,`bdclick2`.`bdconsultaclinica`.`torax` AS `torax`,`bdclick2`.`bdconsultaclinica`.`abdomen1` AS `abdomen1`,`bdclick2`.`bdconsultaclinica`.`extremidades1` AS `extremidades1`,`bdclick2`.`bdconsultaclinica`.`neurologico1` AS `neurologico1`,`bdclick2`.`bdconsultaclinica`.`pielYfaneras` AS `pielYfaneras`,`bdclick2`.`bdconsultaclinica`.`revisionSistemas` AS `revisionSistemas`,`bdclick2`.`bdconsultaclinica`.`historialPersonal` AS `historialPersonal`,`bdclick2`.`bdconsultaclinica`.`traumaticos` AS `traumaticos`,`bdclick2`.`bdconsultaclinica`.`gluteos` AS `gluteos`,`bdclick2`.`bdconsultaclinica`.`mamas` AS `mamas` from ((((((`bdclick2`.`bdconsultaclinica` left join `bdclick2`.`bdcies` `bdcies_1` on((`bdclick2`.`bdconsultaclinica`.`cie1` = `bdcies_1`.`Id`))) left join `bdclick2`.`bdcies` `bdcies_3` on((`bdcies_3`.`Id` = `bdclick2`.`bdconsultaclinica`.`cie3`))) left join `bdclick2`.`bdcies` `bdcies_2` on((`bdclick2`.`bdconsultaclinica`.`cie2` = `bdcies_2`.`Id`))) left join `bdclick2`.`bdcies` `bdcies_4` on((`bdclick2`.`bdconsultaclinica`.`cie4` = `bdcies_4`.`Id`))) left join `bdclick2`.`bdcups` on((`bdclick2`.`bdconsultaclinica`.`cup` = `bdclick2`.`bdcups`.`Id`))) left join `bdclick2`.`bdcups` `bdcups_1` on((`bdclick2`.`bdconsultaclinica`.`cup2` = `bdcups_1`.`Id`)))
md5=c4e165ba18b6d378a4c2ace0baac0dd7
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:44
create-version=2
source=select `bdconsultaclinica`.`Id` AS `Id`,`bdcies_1`.`descripcion` AS `cie1`,`bdcies_2`.`descripcion` AS `cie2`,`bdcies_3`.`descripcion` AS `cie3`,`bdcies_4`.`descripcion` AS `cie4`,`bdcups`.`descripcion` AS `cup`,`bdconsultaclinica`.`historia` AS `historia`,`bdconsultaclinica`.`responsable` AS `responsable`,`bdconsultaclinica`.`nombre` AS `nombre`,`bdconsultaclinica`.`parentesco` AS `parentesco`,`bdconsultaclinica`.`motivo` AS `motivo`,`bdconsultaclinica`.`fisico1` AS `fisico1`,`bdconsultaclinica`.`fisico2` AS `fisico2`,`bdconsultaclinica`.`fisico3` AS `fisico3`,`bdconsultaclinica`.`problemas` AS `problemas`,`bdconsultaclinica`.`recomendaciones` AS `recomendaciones`,`bdconsultaclinica`.`usuario` AS `usuario`,`bdconsultaclinica`.`fecha` AS `fecha`,`bdconsultaclinica`.`tratamiento` AS `tratamiento`,`bdconsultaclinica`.`t` AS `t`,`bdconsultaclinica`.`peso` AS `peso`,`bdconsultaclinica`.`talla` AS `talla`,`bdconsultaclinica`.`fc` AS `fc`,`bdconsultaclinica`.`fr` AS `fr`,`bdconsultaclinica`.`pa` AS `pa`,`bdconsultaclinica`.`cefalico` AS `cefalico`,`bdconsultaclinica`.`abdominal` AS `abdominal`,`bdconsultaclinica`.`cabezaCuello` AS `cabezaCuello`,`bdconsultaclinica`.`cardioPulmonar` AS `cardioPulmonar`,`bdconsultaclinica`.`abdomen` AS `abdomen`,`bdconsultaclinica`.`pelvis` AS `pelvis`,`bdconsultaclinica`.`extremidades` AS `extremidades`,`bdconsultaclinica`.`organosSentidos` AS `organosSentidos`,`bdconsultaclinica`.`musculoEsqueletico` AS `musculoEsqueletico`,`bdconsultaclinica`.`neurologico` AS `neurologico`,`bdconsultaclinica`.`pielAnexos` AS `pielAnexos`,`bdconsultaclinica`.`cie1` AS `cie11`,`bdconsultaclinica`.`cie2` AS `cie22`,`bdconsultaclinica`.`cie3` AS `cie33`,`bdconsultaclinica`.`cie4` AS `cie44`,`bdconsultaclinica`.`cup` AS `cup1`,`bdconsultaclinica`.`familiar` AS `familiar`,`bdconsultaclinica`.`fumador` AS `fumador`,`bdconsultaclinica`.`ingesta` AS `ingesta`,`bdconsultaclinica`.`alergias` AS `alergias`,`bdconsultaclinica`.`toxicos` AS `toxicos`,`bdconsultaclinica`.`medicamentos` AS `medicamentos`,`bdconsultaclinica`.`patologicos` AS `patologicos`,`bdconsultaclinica`.`psiquiatricos` AS `psiquiatricos`,`bdconsultaclinica`.`quirurgicos` AS `quirurgicos`,`bdconsultaclinica`.`ultimaMenstruacion` AS `ultimaMenstruacion`,`bdconsultaclinica`.`ultimaCitologia` AS `ultimaCitologia`,`bdconsultaclinica`.`resultadosCitologia` AS `resultadosCitologia`,`bdconsultaclinica`.`embarazos` AS `embarazos`,`bdconsultaclinica`.`abortos` AS `abortos`,`bdconsultaclinica`.`partos` AS `partos`,`bdconsultaclinica`.`cesarias` AS `cesarias`,`bdconsultaclinica`.`hijosVivos` AS `hijosVivos`,`bdconsultaclinica`.`planificacion` AS `planificacion`,`bdconsultaclinica`.`fotos` AS `fotos`,`bdconsultaclinica`.`examenes` AS `examenes`,`bdconsultaclinica`.`revision` AS `revision`,`bdconsultaclinica`.`oido` AS `oido`,`bdconsultaclinica`.`vista` AS `vista`,`bdconsultaclinica`.`nariz` AS `nariz`,`bdconsultaclinica`.`gusto` AS `gusto`,`bdconsultaclinica`.`tacto` AS `tacto`,`bdconsultaclinica`.`telefonoResponsable` AS `telefonoResponsable`,`bdconsultaclinica`.`cup2` AS `cup2`,`bdcups_1`.`descripcion` AS `descCup2`,`bdconsultaclinica`.`observacionProcedimientos` AS `observacionProcedimientos`,`bdconsultaclinica`.`menarca` AS `menarca`,`bdconsultaclinica`.`diagnosticoEspecializado` AS `diagnosticoEspecializado`,`bdconsultaclinica`.`nutricionales` AS `nutricionales`,`bdconsultaclinica`.`cc` AS `cc`,`bdconsultaclinica`.`torax` AS `torax`,`bdconsultaclinica`.`abdomen1` AS `abdomen1`,`bdconsultaclinica`.`extremidades1` AS `extremidades1`,`bdconsultaclinica`.`neurologico1` AS `neurologico1`,`bdconsultaclinica`.`pielYfaneras` AS `pielYfaneras`,`bdconsultaclinica`.`revisionSistemas` AS `revisionSistemas`,`bdconsultaclinica`.`historialPersonal` AS `historialPersonal`,`bdconsultaclinica`.`traumaticos` AS `traumaticos`,`bdconsultaclinica`.`gluteos` AS `gluteos`,`bdconsultaclinica`.`mamas` AS `mamas` from ((((((`bdconsultaclinica` left join `bdcies` `bdcies_1` on((`bdconsultaclinica`.`cie1` = `bdcies_1`.`Id`))) left join `bdcies` `bdcies_3` on((`bdcies_3`.`Id` = `bdconsultaclinica`.`cie3`))) left join `bdcies` `bdcies_2` on((`bdconsultaclinica`.`cie2` = `bdcies_2`.`Id`))) left join `bdcies` `bdcies_4` on((`bdconsultaclinica`.`cie4` = `bdcies_4`.`Id`))) left join `bdcups` on((`bdconsultaclinica`.`cup` = `bdcups`.`Id`))) left join `bdcups` `bdcups_1` on((`bdconsultaclinica`.`cup2` = `bdcups_1`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdconsultaclinica`.`Id` AS `Id`,`bdcies_1`.`descripcion` AS `cie1`,`bdcies_2`.`descripcion` AS `cie2`,`bdcies_3`.`descripcion` AS `cie3`,`bdcies_4`.`descripcion` AS `cie4`,`bdclick2`.`bdcups`.`descripcion` AS `cup`,`bdclick2`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick2`.`bdconsultaclinica`.`responsable` AS `responsable`,`bdclick2`.`bdconsultaclinica`.`nombre` AS `nombre`,`bdclick2`.`bdconsultaclinica`.`parentesco` AS `parentesco`,`bdclick2`.`bdconsultaclinica`.`motivo` AS `motivo`,`bdclick2`.`bdconsultaclinica`.`fisico1` AS `fisico1`,`bdclick2`.`bdconsultaclinica`.`fisico2` AS `fisico2`,`bdclick2`.`bdconsultaclinica`.`fisico3` AS `fisico3`,`bdclick2`.`bdconsultaclinica`.`problemas` AS `problemas`,`bdclick2`.`bdconsultaclinica`.`recomendaciones` AS `recomendaciones`,`bdclick2`.`bdconsultaclinica`.`usuario` AS `usuario`,`bdclick2`.`bdconsultaclinica`.`fecha` AS `fecha`,`bdclick2`.`bdconsultaclinica`.`tratamiento` AS `tratamiento`,`bdclick2`.`bdconsultaclinica`.`t` AS `t`,`bdclick2`.`bdconsultaclinica`.`peso` AS `peso`,`bdclick2`.`bdconsultaclinica`.`talla` AS `talla`,`bdclick2`.`bdconsultaclinica`.`fc` AS `fc`,`bdclick2`.`bdconsultaclinica`.`fr` AS `fr`,`bdclick2`.`bdconsultaclinica`.`pa` AS `pa`,`bdclick2`.`bdconsultaclinica`.`cefalico` AS `cefalico`,`bdclick2`.`bdconsultaclinica`.`abdominal` AS `abdominal`,`bdclick2`.`bdconsultaclinica`.`cabezaCuello` AS `cabezaCuello`,`bdclick2`.`bdconsultaclinica`.`cardioPulmonar` AS `cardioPulmonar`,`bdclick2`.`bdconsultaclinica`.`abdomen` AS `abdomen`,`bdclick2`.`bdconsultaclinica`.`pelvis` AS `pelvis`,`bdclick2`.`bdconsultaclinica`.`extremidades` AS `extremidades`,`bdclick2`.`bdconsultaclinica`.`organosSentidos` AS `organosSentidos`,`bdclick2`.`bdconsultaclinica`.`musculoEsqueletico` AS `musculoEsqueletico`,`bdclick2`.`bdconsultaclinica`.`neurologico` AS `neurologico`,`bdclick2`.`bdconsultaclinica`.`pielAnexos` AS `pielAnexos`,`bdclick2`.`bdconsultaclinica`.`cie1` AS `cie11`,`bdclick2`.`bdconsultaclinica`.`cie2` AS `cie22`,`bdclick2`.`bdconsultaclinica`.`cie3` AS `cie33`,`bdclick2`.`bdconsultaclinica`.`cie4` AS `cie44`,`bdclick2`.`bdconsultaclinica`.`cup` AS `cup1`,`bdclick2`.`bdconsultaclinica`.`familiar` AS `familiar`,`bdclick2`.`bdconsultaclinica`.`fumador` AS `fumador`,`bdclick2`.`bdconsultaclinica`.`ingesta` AS `ingesta`,`bdclick2`.`bdconsultaclinica`.`alergias` AS `alergias`,`bdclick2`.`bdconsultaclinica`.`toxicos` AS `toxicos`,`bdclick2`.`bdconsultaclinica`.`medicamentos` AS `medicamentos`,`bdclick2`.`bdconsultaclinica`.`patologicos` AS `patologicos`,`bdclick2`.`bdconsultaclinica`.`psiquiatricos` AS `psiquiatricos`,`bdclick2`.`bdconsultaclinica`.`quirurgicos` AS `quirurgicos`,`bdclick2`.`bdconsultaclinica`.`ultimaMenstruacion` AS `ultimaMenstruacion`,`bdclick2`.`bdconsultaclinica`.`ultimaCitologia` AS `ultimaCitologia`,`bdclick2`.`bdconsultaclinica`.`resultadosCitologia` AS `resultadosCitologia`,`bdclick2`.`bdconsultaclinica`.`embarazos` AS `embarazos`,`bdclick2`.`bdconsultaclinica`.`abortos` AS `abortos`,`bdclick2`.`bdconsultaclinica`.`partos` AS `partos`,`bdclick2`.`bdconsultaclinica`.`cesarias` AS `cesarias`,`bdclick2`.`bdconsultaclinica`.`hijosVivos` AS `hijosVivos`,`bdclick2`.`bdconsultaclinica`.`planificacion` AS `planificacion`,`bdclick2`.`bdconsultaclinica`.`fotos` AS `fotos`,`bdclick2`.`bdconsultaclinica`.`examenes` AS `examenes`,`bdclick2`.`bdconsultaclinica`.`revision` AS `revision`,`bdclick2`.`bdconsultaclinica`.`oido` AS `oido`,`bdclick2`.`bdconsultaclinica`.`vista` AS `vista`,`bdclick2`.`bdconsultaclinica`.`nariz` AS `nariz`,`bdclick2`.`bdconsultaclinica`.`gusto` AS `gusto`,`bdclick2`.`bdconsultaclinica`.`tacto` AS `tacto`,`bdclick2`.`bdconsultaclinica`.`telefonoResponsable` AS `telefonoResponsable`,`bdclick2`.`bdconsultaclinica`.`cup2` AS `cup2`,`bdcups_1`.`descripcion` AS `descCup2`,`bdclick2`.`bdconsultaclinica`.`observacionProcedimientos` AS `observacionProcedimientos`,`bdclick2`.`bdconsultaclinica`.`menarca` AS `menarca`,`bdclick2`.`bdconsultaclinica`.`diagnosticoEspecializado` AS `diagnosticoEspecializado`,`bdclick2`.`bdconsultaclinica`.`nutricionales` AS `nutricionales`,`bdclick2`.`bdconsultaclinica`.`cc` AS `cc`,`bdclick2`.`bdconsultaclinica`.`torax` AS `torax`,`bdclick2`.`bdconsultaclinica`.`abdomen1` AS `abdomen1`,`bdclick2`.`bdconsultaclinica`.`extremidades1` AS `extremidades1`,`bdclick2`.`bdconsultaclinica`.`neurologico1` AS `neurologico1`,`bdclick2`.`bdconsultaclinica`.`pielYfaneras` AS `pielYfaneras`,`bdclick2`.`bdconsultaclinica`.`revisionSistemas` AS `revisionSistemas`,`bdclick2`.`bdconsultaclinica`.`historialPersonal` AS `historialPersonal`,`bdclick2`.`bdconsultaclinica`.`traumaticos` AS `traumaticos`,`bdclick2`.`bdconsultaclinica`.`gluteos` AS `gluteos`,`bdclick2`.`bdconsultaclinica`.`mamas` AS `mamas` from ((((((`bdclick2`.`bdconsultaclinica` left join `bdclick2`.`bdcies` `bdcies_1` on((`bdclick2`.`bdconsultaclinica`.`cie1` = `bdcies_1`.`Id`))) left join `bdclick2`.`bdcies` `bdcies_3` on((`bdcies_3`.`Id` = `bdclick2`.`bdconsultaclinica`.`cie3`))) left join `bdclick2`.`bdcies` `bdcies_2` on((`bdclick2`.`bdconsultaclinica`.`cie2` = `bdcies_2`.`Id`))) left join `bdclick2`.`bdcies` `bdcies_4` on((`bdclick2`.`bdconsultaclinica`.`cie4` = `bdcies_4`.`Id`))) left join `bdclick2`.`bdcups` on((`bdclick2`.`bdconsultaclinica`.`cup` = `bdclick2`.`bdcups`.`Id`))) left join `bdclick2`.`bdcups` `bdcups_1` on((`bdclick2`.`bdconsultaclinica`.`cup2` = `bdcups_1`.`Id`)))
mariadb-version=100135
