TYPE=VIEW
query=select `bdclick4`.`bdconsultaclinica`.`Id` AS `Id`,`bdcies_1`.`descripcion` AS `cie1`,`bdcies_2`.`descripcion` AS `cie2`,`bdcies_3`.`descripcion` AS `cie3`,`bdcies_4`.`descripcion` AS `cie4`,`bdclick4`.`bdcups`.`descripcion` AS `cup`,`bdclick4`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick4`.`bdconsultaclinica`.`responsable` AS `responsable`,`bdclick4`.`bdconsultaclinica`.`nombre` AS `nombre`,`bdclick4`.`bdconsultaclinica`.`parentesco` AS `parentesco`,`bdclick4`.`bdconsultaclinica`.`motivo` AS `motivo`,`bdclick4`.`bdconsultaclinica`.`fisico1` AS `fisico1`,`bdclick4`.`bdconsultaclinica`.`fisico2` AS `fisico2`,`bdclick4`.`bdconsultaclinica`.`fisico3` AS `fisico3`,`bdclick4`.`bdconsultaclinica`.`problemas` AS `problemas`,`bdclick4`.`bdconsultaclinica`.`recomendaciones` AS `recomendaciones`,`bdclick4`.`bdconsultaclinica`.`usuario` AS `usuario`,`bdclick4`.`bdconsultaclinica`.`fecha` AS `fecha`,`bdclick4`.`bdconsultaclinica`.`tratamiento` AS `tratamiento`,`bdclick4`.`bdconsultaclinica`.`t` AS `t`,`bdclick4`.`bdconsultaclinica`.`peso` AS `peso`,`bdclick4`.`bdconsultaclinica`.`talla` AS `talla`,`bdclick4`.`bdconsultaclinica`.`fc` AS `fc`,`bdclick4`.`bdconsultaclinica`.`fr` AS `fr`,`bdclick4`.`bdconsultaclinica`.`pa` AS `pa`,`bdclick4`.`bdconsultaclinica`.`cefalico` AS `cefalico`,`bdclick4`.`bdconsultaclinica`.`abdominal` AS `abdominal`,`bdclick4`.`bdconsultaclinica`.`cabezaCuello` AS `cabezaCuello`,`bdclick4`.`bdconsultaclinica`.`cardioPulmonar` AS `cardioPulmonar`,`bdclick4`.`bdconsultaclinica`.`abdomen` AS `abdomen`,`bdclick4`.`bdconsultaclinica`.`pelvis` AS `pelvis`,`bdclick4`.`bdconsultaclinica`.`extremidades` AS `extremidades`,`bdclick4`.`bdconsultaclinica`.`organosSentidos` AS `organosSentidos`,`bdclick4`.`bdconsultaclinica`.`musculoEsqueletico` AS `musculoEsqueletico`,`bdclick4`.`bdconsultaclinica`.`neurologico` AS `neurologico`,`bdclick4`.`bdconsultaclinica`.`pielAnexos` AS `pielAnexos`,`bdclick4`.`bdconsultaclinica`.`cie1` AS `cie11`,`bdclick4`.`bdconsultaclinica`.`cie2` AS `cie22`,`bdclick4`.`bdconsultaclinica`.`cie3` AS `cie33`,`bdclick4`.`bdconsultaclinica`.`cie4` AS `cie44`,`bdclick4`.`bdconsultaclinica`.`cup` AS `cup1`,`bdclick4`.`bdconsultaclinica`.`familiar` AS `familiar`,`bdclick4`.`bdconsultaclinica`.`fumador` AS `fumador`,`bdclick4`.`bdconsultaclinica`.`ingesta` AS `ingesta`,`bdclick4`.`bdconsultaclinica`.`alergias` AS `alergias`,`bdclick4`.`bdconsultaclinica`.`toxicos` AS `toxicos`,`bdclick4`.`bdconsultaclinica`.`medicamentos` AS `medicamentos`,`bdclick4`.`bdconsultaclinica`.`patologicos` AS `patologicos`,`bdclick4`.`bdconsultaclinica`.`psiquiatricos` AS `psiquiatricos`,`bdclick4`.`bdconsultaclinica`.`quirurgicos` AS `quirurgicos`,`bdclick4`.`bdconsultaclinica`.`ultimaMenstruacion` AS `ultimaMenstruacion`,`bdclick4`.`bdconsultaclinica`.`ultimaCitologia` AS `ultimaCitologia`,`bdclick4`.`bdconsultaclinica`.`resultadosCitologia` AS `resultadosCitologia`,`bdclick4`.`bdconsultaclinica`.`embarazos` AS `embarazos`,`bdclick4`.`bdconsultaclinica`.`abortos` AS `abortos`,`bdclick4`.`bdconsultaclinica`.`partos` AS `partos`,`bdclick4`.`bdconsultaclinica`.`cesarias` AS `cesarias`,`bdclick4`.`bdconsultaclinica`.`hijosVivos` AS `hijosVivos`,`bdclick4`.`bdconsultaclinica`.`planificacion` AS `planificacion`,`bdclick4`.`bdconsultaclinica`.`fotos` AS `fotos`,`bdclick4`.`bdconsultaclinica`.`examenes` AS `examenes`,`bdclick4`.`bdconsultaclinica`.`revision` AS `revision`,`bdclick4`.`bdconsultaclinica`.`oido` AS `oido`,`bdclick4`.`bdconsultaclinica`.`vista` AS `vista`,`bdclick4`.`bdconsultaclinica`.`nariz` AS `nariz`,`bdclick4`.`bdconsultaclinica`.`gusto` AS `gusto`,`bdclick4`.`bdconsultaclinica`.`tacto` AS `tacto`,`bdclick4`.`bdconsultaclinica`.`telefonoResponsable` AS `telefonoResponsable`,`bdclick4`.`bdconsultaclinica`.`cup2` AS `cup2`,`bdcups_1`.`descripcion` AS `descCup2`,`bdclick4`.`bdconsultaclinica`.`observacionProcedimientos` AS `observacionProcedimientos`,`bdclick4`.`bdconsultaclinica`.`menarca` AS `menarca`,`bdclick4`.`bdconsultaclinica`.`diagnosticoEspecializado` AS `diagnosticoEspecializado`,`bdclick4`.`bdconsultaclinica`.`nutricionales` AS `nutricionales`,`bdclick4`.`bdconsultaclinica`.`cc` AS `cc`,`bdclick4`.`bdconsultaclinica`.`torax` AS `torax`,`bdclick4`.`bdconsultaclinica`.`abdomen1` AS `abdomen1`,`bdclick4`.`bdconsultaclinica`.`extremidades1` AS `extremidades1`,`bdclick4`.`bdconsultaclinica`.`neurologico1` AS `neurologico1`,`bdclick4`.`bdconsultaclinica`.`pielYfaneras` AS `pielYfaneras`,`bdclick4`.`bdconsultaclinica`.`revisionSistemas` AS `revisionSistemas`,`bdclick4`.`bdconsultaclinica`.`historialPersonal` AS `historialPersonal`,`bdclick4`.`bdconsultaclinica`.`traumaticos` AS `traumaticos`,`bdclick4`.`bdconsultaclinica`.`gluteos` AS `gluteos`,`bdclick4`.`bdconsultaclinica`.`mamas` AS `mamas` from ((((((`bdclick4`.`bdconsultaclinica` left join `bdclick4`.`bdcies` `bdcies_1` on((`bdclick4`.`bdconsultaclinica`.`cie1` = `bdcies_1`.`Id`))) left join `bdclick4`.`bdcies` `bdcies_3` on((`bdcies_3`.`Id` = `bdclick4`.`bdconsultaclinica`.`cie3`))) left join `bdclick4`.`bdcies` `bdcies_2` on((`bdclick4`.`bdconsultaclinica`.`cie2` = `bdcies_2`.`Id`))) left join `bdclick4`.`bdcies` `bdcies_4` on((`bdclick4`.`bdconsultaclinica`.`cie4` = `bdcies_4`.`Id`))) left join `bdclick4`.`bdcups` on((`bdclick4`.`bdconsultaclinica`.`cup` = `bdclick4`.`bdcups`.`Id`))) left join `bdclick4`.`bdcups` `bdcups_1` on((`bdclick4`.`bdconsultaclinica`.`cup2` = `bdcups_1`.`Id`)))
md5=855b1c6bc0d08b7f75c745a3bdca34be
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:26
create-version=2
source=select `bdconsultaclinica`.`Id` AS `Id`,`bdcies_1`.`descripcion` AS `cie1`,`bdcies_2`.`descripcion` AS `cie2`,`bdcies_3`.`descripcion` AS `cie3`,`bdcies_4`.`descripcion` AS `cie4`,`bdcups`.`descripcion` AS `cup`,`bdconsultaclinica`.`historia` AS `historia`,`bdconsultaclinica`.`responsable` AS `responsable`,`bdconsultaclinica`.`nombre` AS `nombre`,`bdconsultaclinica`.`parentesco` AS `parentesco`,`bdconsultaclinica`.`motivo` AS `motivo`,`bdconsultaclinica`.`fisico1` AS `fisico1`,`bdconsultaclinica`.`fisico2` AS `fisico2`,`bdconsultaclinica`.`fisico3` AS `fisico3`,`bdconsultaclinica`.`problemas` AS `problemas`,`bdconsultaclinica`.`recomendaciones` AS `recomendaciones`,`bdconsultaclinica`.`usuario` AS `usuario`,`bdconsultaclinica`.`fecha` AS `fecha`,`bdconsultaclinica`.`tratamiento` AS `tratamiento`,`bdconsultaclinica`.`t` AS `t`,`bdconsultaclinica`.`peso` AS `peso`,`bdconsultaclinica`.`talla` AS `talla`,`bdconsultaclinica`.`fc` AS `fc`,`bdconsultaclinica`.`fr` AS `fr`,`bdconsultaclinica`.`pa` AS `pa`,`bdconsultaclinica`.`cefalico` AS `cefalico`,`bdconsultaclinica`.`abdominal` AS `abdominal`,`bdconsultaclinica`.`cabezaCuello` AS `cabezaCuello`,`bdconsultaclinica`.`cardioPulmonar` AS `cardioPulmonar`,`bdconsultaclinica`.`abdomen` AS `abdomen`,`bdconsultaclinica`.`pelvis` AS `pelvis`,`bdconsultaclinica`.`extremidades` AS `extremidades`,`bdconsultaclinica`.`organosSentidos` AS `organosSentidos`,`bdconsultaclinica`.`musculoEsqueletico` AS `musculoEsqueletico`,`bdconsultaclinica`.`neurologico` AS `neurologico`,`bdconsultaclinica`.`pielAnexos` AS `pielAnexos`,`bdconsultaclinica`.`cie1` AS `cie11`,`bdconsultaclinica`.`cie2` AS `cie22`,`bdconsultaclinica`.`cie3` AS `cie33`,`bdconsultaclinica`.`cie4` AS `cie44`,`bdconsultaclinica`.`cup` AS `cup1`,`bdconsultaclinica`.`familiar` AS `familiar`,`bdconsultaclinica`.`fumador` AS `fumador`,`bdconsultaclinica`.`ingesta` AS `ingesta`,`bdconsultaclinica`.`alergias` AS `alergias`,`bdconsultaclinica`.`toxicos` AS `toxicos`,`bdconsultaclinica`.`medicamentos` AS `medicamentos`,`bdconsultaclinica`.`patologicos` AS `patologicos`,`bdconsultaclinica`.`psiquiatricos` AS `psiquiatricos`,`bdconsultaclinica`.`quirurgicos` AS `quirurgicos`,`bdconsultaclinica`.`ultimaMenstruacion` AS `ultimaMenstruacion`,`bdconsultaclinica`.`ultimaCitologia` AS `ultimaCitologia`,`bdconsultaclinica`.`resultadosCitologia` AS `resultadosCitologia`,`bdconsultaclinica`.`embarazos` AS `embarazos`,`bdconsultaclinica`.`abortos` AS `abortos`,`bdconsultaclinica`.`partos` AS `partos`,`bdconsultaclinica`.`cesarias` AS `cesarias`,`bdconsultaclinica`.`hijosVivos` AS `hijosVivos`,`bdconsultaclinica`.`planificacion` AS `planificacion`,`bdconsultaclinica`.`fotos` AS `fotos`,`bdconsultaclinica`.`examenes` AS `examenes`,`bdconsultaclinica`.`revision` AS `revision`,`bdconsultaclinica`.`oido` AS `oido`,`bdconsultaclinica`.`vista` AS `vista`,`bdconsultaclinica`.`nariz` AS `nariz`,`bdconsultaclinica`.`gusto` AS `gusto`,`bdconsultaclinica`.`tacto` AS `tacto`,`bdconsultaclinica`.`telefonoResponsable` AS `telefonoResponsable`,`bdconsultaclinica`.`cup2` AS `cup2`,`bdcups_1`.`descripcion` AS `descCup2`,`bdconsultaclinica`.`observacionProcedimientos` AS `observacionProcedimientos`,`bdconsultaclinica`.`menarca` AS `menarca`,`bdconsultaclinica`.`diagnosticoEspecializado` AS `diagnosticoEspecializado`,`bdconsultaclinica`.`nutricionales` AS `nutricionales`,`bdconsultaclinica`.`cc` AS `cc`,`bdconsultaclinica`.`torax` AS `torax`,`bdconsultaclinica`.`abdomen1` AS `abdomen1`,`bdconsultaclinica`.`extremidades1` AS `extremidades1`,`bdconsultaclinica`.`neurologico1` AS `neurologico1`,`bdconsultaclinica`.`pielYfaneras` AS `pielYfaneras`,`bdconsultaclinica`.`revisionSistemas` AS `revisionSistemas`,`bdconsultaclinica`.`historialPersonal` AS `historialPersonal`,`bdconsultaclinica`.`traumaticos` AS `traumaticos`,`bdconsultaclinica`.`gluteos` AS `gluteos`,`bdconsultaclinica`.`mamas` AS `mamas` from ((((((`bdconsultaclinica` left join `bdcies` `bdcies_1` on((`bdconsultaclinica`.`cie1` = `bdcies_1`.`Id`))) left join `bdcies` `bdcies_3` on((`bdcies_3`.`Id` = `bdconsultaclinica`.`cie3`))) left join `bdcies` `bdcies_2` on((`bdconsultaclinica`.`cie2` = `bdcies_2`.`Id`))) left join `bdcies` `bdcies_4` on((`bdconsultaclinica`.`cie4` = `bdcies_4`.`Id`))) left join `bdcups` on((`bdconsultaclinica`.`cup` = `bdcups`.`Id`))) left join `bdcups` `bdcups_1` on((`bdconsultaclinica`.`cup2` = `bdcups_1`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdconsultaclinica`.`Id` AS `Id`,`bdcies_1`.`descripcion` AS `cie1`,`bdcies_2`.`descripcion` AS `cie2`,`bdcies_3`.`descripcion` AS `cie3`,`bdcies_4`.`descripcion` AS `cie4`,`bdclick4`.`bdcups`.`descripcion` AS `cup`,`bdclick4`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick4`.`bdconsultaclinica`.`responsable` AS `responsable`,`bdclick4`.`bdconsultaclinica`.`nombre` AS `nombre`,`bdclick4`.`bdconsultaclinica`.`parentesco` AS `parentesco`,`bdclick4`.`bdconsultaclinica`.`motivo` AS `motivo`,`bdclick4`.`bdconsultaclinica`.`fisico1` AS `fisico1`,`bdclick4`.`bdconsultaclinica`.`fisico2` AS `fisico2`,`bdclick4`.`bdconsultaclinica`.`fisico3` AS `fisico3`,`bdclick4`.`bdconsultaclinica`.`problemas` AS `problemas`,`bdclick4`.`bdconsultaclinica`.`recomendaciones` AS `recomendaciones`,`bdclick4`.`bdconsultaclinica`.`usuario` AS `usuario`,`bdclick4`.`bdconsultaclinica`.`fecha` AS `fecha`,`bdclick4`.`bdconsultaclinica`.`tratamiento` AS `tratamiento`,`bdclick4`.`bdconsultaclinica`.`t` AS `t`,`bdclick4`.`bdconsultaclinica`.`peso` AS `peso`,`bdclick4`.`bdconsultaclinica`.`talla` AS `talla`,`bdclick4`.`bdconsultaclinica`.`fc` AS `fc`,`bdclick4`.`bdconsultaclinica`.`fr` AS `fr`,`bdclick4`.`bdconsultaclinica`.`pa` AS `pa`,`bdclick4`.`bdconsultaclinica`.`cefalico` AS `cefalico`,`bdclick4`.`bdconsultaclinica`.`abdominal` AS `abdominal`,`bdclick4`.`bdconsultaclinica`.`cabezaCuello` AS `cabezaCuello`,`bdclick4`.`bdconsultaclinica`.`cardioPulmonar` AS `cardioPulmonar`,`bdclick4`.`bdconsultaclinica`.`abdomen` AS `abdomen`,`bdclick4`.`bdconsultaclinica`.`pelvis` AS `pelvis`,`bdclick4`.`bdconsultaclinica`.`extremidades` AS `extremidades`,`bdclick4`.`bdconsultaclinica`.`organosSentidos` AS `organosSentidos`,`bdclick4`.`bdconsultaclinica`.`musculoEsqueletico` AS `musculoEsqueletico`,`bdclick4`.`bdconsultaclinica`.`neurologico` AS `neurologico`,`bdclick4`.`bdconsultaclinica`.`pielAnexos` AS `pielAnexos`,`bdclick4`.`bdconsultaclinica`.`cie1` AS `cie11`,`bdclick4`.`bdconsultaclinica`.`cie2` AS `cie22`,`bdclick4`.`bdconsultaclinica`.`cie3` AS `cie33`,`bdclick4`.`bdconsultaclinica`.`cie4` AS `cie44`,`bdclick4`.`bdconsultaclinica`.`cup` AS `cup1`,`bdclick4`.`bdconsultaclinica`.`familiar` AS `familiar`,`bdclick4`.`bdconsultaclinica`.`fumador` AS `fumador`,`bdclick4`.`bdconsultaclinica`.`ingesta` AS `ingesta`,`bdclick4`.`bdconsultaclinica`.`alergias` AS `alergias`,`bdclick4`.`bdconsultaclinica`.`toxicos` AS `toxicos`,`bdclick4`.`bdconsultaclinica`.`medicamentos` AS `medicamentos`,`bdclick4`.`bdconsultaclinica`.`patologicos` AS `patologicos`,`bdclick4`.`bdconsultaclinica`.`psiquiatricos` AS `psiquiatricos`,`bdclick4`.`bdconsultaclinica`.`quirurgicos` AS `quirurgicos`,`bdclick4`.`bdconsultaclinica`.`ultimaMenstruacion` AS `ultimaMenstruacion`,`bdclick4`.`bdconsultaclinica`.`ultimaCitologia` AS `ultimaCitologia`,`bdclick4`.`bdconsultaclinica`.`resultadosCitologia` AS `resultadosCitologia`,`bdclick4`.`bdconsultaclinica`.`embarazos` AS `embarazos`,`bdclick4`.`bdconsultaclinica`.`abortos` AS `abortos`,`bdclick4`.`bdconsultaclinica`.`partos` AS `partos`,`bdclick4`.`bdconsultaclinica`.`cesarias` AS `cesarias`,`bdclick4`.`bdconsultaclinica`.`hijosVivos` AS `hijosVivos`,`bdclick4`.`bdconsultaclinica`.`planificacion` AS `planificacion`,`bdclick4`.`bdconsultaclinica`.`fotos` AS `fotos`,`bdclick4`.`bdconsultaclinica`.`examenes` AS `examenes`,`bdclick4`.`bdconsultaclinica`.`revision` AS `revision`,`bdclick4`.`bdconsultaclinica`.`oido` AS `oido`,`bdclick4`.`bdconsultaclinica`.`vista` AS `vista`,`bdclick4`.`bdconsultaclinica`.`nariz` AS `nariz`,`bdclick4`.`bdconsultaclinica`.`gusto` AS `gusto`,`bdclick4`.`bdconsultaclinica`.`tacto` AS `tacto`,`bdclick4`.`bdconsultaclinica`.`telefonoResponsable` AS `telefonoResponsable`,`bdclick4`.`bdconsultaclinica`.`cup2` AS `cup2`,`bdcups_1`.`descripcion` AS `descCup2`,`bdclick4`.`bdconsultaclinica`.`observacionProcedimientos` AS `observacionProcedimientos`,`bdclick4`.`bdconsultaclinica`.`menarca` AS `menarca`,`bdclick4`.`bdconsultaclinica`.`diagnosticoEspecializado` AS `diagnosticoEspecializado`,`bdclick4`.`bdconsultaclinica`.`nutricionales` AS `nutricionales`,`bdclick4`.`bdconsultaclinica`.`cc` AS `cc`,`bdclick4`.`bdconsultaclinica`.`torax` AS `torax`,`bdclick4`.`bdconsultaclinica`.`abdomen1` AS `abdomen1`,`bdclick4`.`bdconsultaclinica`.`extremidades1` AS `extremidades1`,`bdclick4`.`bdconsultaclinica`.`neurologico1` AS `neurologico1`,`bdclick4`.`bdconsultaclinica`.`pielYfaneras` AS `pielYfaneras`,`bdclick4`.`bdconsultaclinica`.`revisionSistemas` AS `revisionSistemas`,`bdclick4`.`bdconsultaclinica`.`historialPersonal` AS `historialPersonal`,`bdclick4`.`bdconsultaclinica`.`traumaticos` AS `traumaticos`,`bdclick4`.`bdconsultaclinica`.`gluteos` AS `gluteos`,`bdclick4`.`bdconsultaclinica`.`mamas` AS `mamas` from ((((((`bdclick4`.`bdconsultaclinica` left join `bdclick4`.`bdcies` `bdcies_1` on((`bdclick4`.`bdconsultaclinica`.`cie1` = `bdcies_1`.`Id`))) left join `bdclick4`.`bdcies` `bdcies_3` on((`bdcies_3`.`Id` = `bdclick4`.`bdconsultaclinica`.`cie3`))) left join `bdclick4`.`bdcies` `bdcies_2` on((`bdclick4`.`bdconsultaclinica`.`cie2` = `bdcies_2`.`Id`))) left join `bdclick4`.`bdcies` `bdcies_4` on((`bdclick4`.`bdconsultaclinica`.`cie4` = `bdcies_4`.`Id`))) left join `bdclick4`.`bdcups` on((`bdclick4`.`bdconsultaclinica`.`cup` = `bdclick4`.`bdcups`.`Id`))) left join `bdclick4`.`bdcups` `bdcups_1` on((`bdclick4`.`bdconsultaclinica`.`cup2` = `bdcups_1`.`Id`)))
mariadb-version=100135