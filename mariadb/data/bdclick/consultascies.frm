TYPE=VIEW
query=select `bdclick`.`bdconsultaclinica`.`Id` AS `Id`,`bdcies_1`.`descripcion` AS `cie1`,`bdcies_2`.`descripcion` AS `cie2`,`bdcies_3`.`descripcion` AS `cie3`,`bdcies_4`.`descripcion` AS `cie4`,`bdclick`.`bdcups`.`descripcion` AS `cup`,`bdclick`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick`.`bdconsultaclinica`.`responsable` AS `responsable`,`bdclick`.`bdconsultaclinica`.`nombre` AS `nombre`,`bdclick`.`bdconsultaclinica`.`parentesco` AS `parentesco`,`bdclick`.`bdconsultaclinica`.`motivo` AS `motivo`,`bdclick`.`bdconsultaclinica`.`fisico1` AS `fisico1`,`bdclick`.`bdconsultaclinica`.`fisico2` AS `fisico2`,`bdclick`.`bdconsultaclinica`.`fisico3` AS `fisico3`,`bdclick`.`bdconsultaclinica`.`problemas` AS `problemas`,`bdclick`.`bdconsultaclinica`.`recomendaciones` AS `recomendaciones`,`bdclick`.`bdconsultaclinica`.`usuario` AS `usuario`,`bdclick`.`bdconsultaclinica`.`fecha` AS `fecha`,`bdclick`.`bdconsultaclinica`.`tratamiento` AS `tratamiento`,`bdclick`.`bdconsultaclinica`.`t` AS `t`,`bdclick`.`bdconsultaclinica`.`peso` AS `peso`,`bdclick`.`bdconsultaclinica`.`talla` AS `talla`,`bdclick`.`bdconsultaclinica`.`fc` AS `fc`,`bdclick`.`bdconsultaclinica`.`fr` AS `fr`,`bdclick`.`bdconsultaclinica`.`pa` AS `pa`,`bdclick`.`bdconsultaclinica`.`cefalico` AS `cefalico`,`bdclick`.`bdconsultaclinica`.`abdominal` AS `abdominal`,`bdclick`.`bdconsultaclinica`.`cabezaCuello` AS `cabezaCuello`,`bdclick`.`bdconsultaclinica`.`cardioPulmonar` AS `cardioPulmonar`,`bdclick`.`bdconsultaclinica`.`abdomen` AS `abdomen`,`bdclick`.`bdconsultaclinica`.`pelvis` AS `pelvis`,`bdclick`.`bdconsultaclinica`.`extremidades` AS `extremidades`,`bdclick`.`bdconsultaclinica`.`organosSentidos` AS `organosSentidos`,`bdclick`.`bdconsultaclinica`.`musculoEsqueletico` AS `musculoEsqueletico`,`bdclick`.`bdconsultaclinica`.`neurologico` AS `neurologico`,`bdclick`.`bdconsultaclinica`.`pielAnexos` AS `pielAnexos`,`bdclick`.`bdconsultaclinica`.`cie1` AS `cie11`,`bdclick`.`bdconsultaclinica`.`cie2` AS `cie22`,`bdclick`.`bdconsultaclinica`.`cie3` AS `cie33`,`bdclick`.`bdconsultaclinica`.`cie4` AS `cie44`,`bdclick`.`bdconsultaclinica`.`cup` AS `cup1`,`bdclick`.`bdconsultaclinica`.`familiar` AS `familiar`,`bdclick`.`bdconsultaclinica`.`fumador` AS `fumador`,`bdclick`.`bdconsultaclinica`.`ingesta` AS `ingesta`,`bdclick`.`bdconsultaclinica`.`alergias` AS `alergias`,`bdclick`.`bdconsultaclinica`.`toxicos` AS `toxicos`,`bdclick`.`bdconsultaclinica`.`medicamentos` AS `medicamentos`,`bdclick`.`bdconsultaclinica`.`patologicos` AS `patologicos`,`bdclick`.`bdconsultaclinica`.`psiquiatricos` AS `psiquiatricos`,`bdclick`.`bdconsultaclinica`.`quirurgicos` AS `quirurgicos`,`bdclick`.`bdconsultaclinica`.`ultimaMenstruacion` AS `ultimaMenstruacion`,`bdclick`.`bdconsultaclinica`.`ultimaCitologia` AS `ultimaCitologia`,`bdclick`.`bdconsultaclinica`.`resultadosCitologia` AS `resultadosCitologia`,`bdclick`.`bdconsultaclinica`.`embarazos` AS `embarazos`,`bdclick`.`bdconsultaclinica`.`abortos` AS `abortos`,`bdclick`.`bdconsultaclinica`.`partos` AS `partos`,`bdclick`.`bdconsultaclinica`.`cesarias` AS `cesarias`,`bdclick`.`bdconsultaclinica`.`hijosVivos` AS `hijosVivos`,`bdclick`.`bdconsultaclinica`.`planificacion` AS `planificacion`,`bdclick`.`bdconsultaclinica`.`fotos` AS `fotos`,`bdclick`.`bdconsultaclinica`.`examenes` AS `examenes`,`bdclick`.`bdconsultaclinica`.`revision` AS `revision`,`bdclick`.`bdconsultaclinica`.`oido` AS `oido`,`bdclick`.`bdconsultaclinica`.`vista` AS `vista`,`bdclick`.`bdconsultaclinica`.`nariz` AS `nariz`,`bdclick`.`bdconsultaclinica`.`gusto` AS `gusto`,`bdclick`.`bdconsultaclinica`.`tacto` AS `tacto`,`bdclick`.`bdconsultaclinica`.`telefonoResponsable` AS `telefonoResponsable`,`bdclick`.`bdconsultaclinica`.`cup2` AS `cup2`,`bdcups_1`.`descripcion` AS `descCup2`,`bdclick`.`bdconsultaclinica`.`observacionProcedimientos` AS `observacionProcedimientos`,`bdclick`.`bdconsultaclinica`.`menarca` AS `menarca`,`bdclick`.`bdconsultaclinica`.`diagnosticoEspecializado` AS `diagnosticoEspecializado`,`bdclick`.`bdconsultaclinica`.`nutricionales` AS `nutricionales`,`bdclick`.`bdconsultaclinica`.`cc` AS `cc`,`bdclick`.`bdconsultaclinica`.`torax` AS `torax`,`bdclick`.`bdconsultaclinica`.`abdomen1` AS `abdomen1`,`bdclick`.`bdconsultaclinica`.`extremidades1` AS `extremidades1`,`bdclick`.`bdconsultaclinica`.`neurologico1` AS `neurologico1`,`bdclick`.`bdconsultaclinica`.`pielYfaneras` AS `pielYfaneras`,`bdclick`.`bdconsultaclinica`.`revisionSistemas` AS `revisionSistemas`,`bdclick`.`bdconsultaclinica`.`historialPersonal` AS `historialPersonal`,`bdclick`.`bdconsultaclinica`.`traumaticos` AS `traumaticos`,`bdclick`.`bdconsultaclinica`.`gluteos` AS `gluteos`,`bdclick`.`bdconsultaclinica`.`mamas` AS `mamas` from ((((((`bdclick`.`bdconsultaclinica` left join `bdclick`.`bdcies` `bdcies_1` on((`bdclick`.`bdconsultaclinica`.`cie1` = `bdcies_1`.`Id`))) left join `bdclick`.`bdcies` `bdcies_3` on((`bdcies_3`.`Id` = `bdclick`.`bdconsultaclinica`.`cie3`))) left join `bdclick`.`bdcies` `bdcies_2` on((`bdclick`.`bdconsultaclinica`.`cie2` = `bdcies_2`.`Id`))) left join `bdclick`.`bdcies` `bdcies_4` on((`bdclick`.`bdconsultaclinica`.`cie4` = `bdcies_4`.`Id`))) left join `bdclick`.`bdcups` on((`bdclick`.`bdconsultaclinica`.`cup` = `bdclick`.`bdcups`.`Id`))) left join `bdclick`.`bdcups` `bdcups_1` on((`bdclick`.`bdconsultaclinica`.`cup2` = `bdcups_1`.`Id`)))
md5=aa2590727e2871705427e203bbc9d6e3
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:23
create-version=2
source=select `bdconsultaclinica`.`Id` AS `Id`,`bdcies_1`.`descripcion` AS `cie1`,`bdcies_2`.`descripcion` AS `cie2`,`bdcies_3`.`descripcion` AS `cie3`,`bdcies_4`.`descripcion` AS `cie4`,`bdcups`.`descripcion` AS `cup`,`bdconsultaclinica`.`historia` AS `historia`,`bdconsultaclinica`.`responsable` AS `responsable`,`bdconsultaclinica`.`nombre` AS `nombre`,`bdconsultaclinica`.`parentesco` AS `parentesco`,`bdconsultaclinica`.`motivo` AS `motivo`,`bdconsultaclinica`.`fisico1` AS `fisico1`,`bdconsultaclinica`.`fisico2` AS `fisico2`,`bdconsultaclinica`.`fisico3` AS `fisico3`,`bdconsultaclinica`.`problemas` AS `problemas`,`bdconsultaclinica`.`recomendaciones` AS `recomendaciones`,`bdconsultaclinica`.`usuario` AS `usuario`,`bdconsultaclinica`.`fecha` AS `fecha`,`bdconsultaclinica`.`tratamiento` AS `tratamiento`,`bdconsultaclinica`.`t` AS `t`,`bdconsultaclinica`.`peso` AS `peso`,`bdconsultaclinica`.`talla` AS `talla`,`bdconsultaclinica`.`fc` AS `fc`,`bdconsultaclinica`.`fr` AS `fr`,`bdconsultaclinica`.`pa` AS `pa`,`bdconsultaclinica`.`cefalico` AS `cefalico`,`bdconsultaclinica`.`abdominal` AS `abdominal`,`bdconsultaclinica`.`cabezaCuello` AS `cabezaCuello`,`bdconsultaclinica`.`cardioPulmonar` AS `cardioPulmonar`,`bdconsultaclinica`.`abdomen` AS `abdomen`,`bdconsultaclinica`.`pelvis` AS `pelvis`,`bdconsultaclinica`.`extremidades` AS `extremidades`,`bdconsultaclinica`.`organosSentidos` AS `organosSentidos`,`bdconsultaclinica`.`musculoEsqueletico` AS `musculoEsqueletico`,`bdconsultaclinica`.`neurologico` AS `neurologico`,`bdconsultaclinica`.`pielAnexos` AS `pielAnexos`,`bdconsultaclinica`.`cie1` AS `cie11`,`bdconsultaclinica`.`cie2` AS `cie22`,`bdconsultaclinica`.`cie3` AS `cie33`,`bdconsultaclinica`.`cie4` AS `cie44`,`bdconsultaclinica`.`cup` AS `cup1`,`bdconsultaclinica`.`familiar` AS `familiar`,`bdconsultaclinica`.`fumador` AS `fumador`,`bdconsultaclinica`.`ingesta` AS `ingesta`,`bdconsultaclinica`.`alergias` AS `alergias`,`bdconsultaclinica`.`toxicos` AS `toxicos`,`bdconsultaclinica`.`medicamentos` AS `medicamentos`,`bdconsultaclinica`.`patologicos` AS `patologicos`,`bdconsultaclinica`.`psiquiatricos` AS `psiquiatricos`,`bdconsultaclinica`.`quirurgicos` AS `quirurgicos`,`bdconsultaclinica`.`ultimaMenstruacion` AS `ultimaMenstruacion`,`bdconsultaclinica`.`ultimaCitologia` AS `ultimaCitologia`,`bdconsultaclinica`.`resultadosCitologia` AS `resultadosCitologia`,`bdconsultaclinica`.`embarazos` AS `embarazos`,`bdconsultaclinica`.`abortos` AS `abortos`,`bdconsultaclinica`.`partos` AS `partos`,`bdconsultaclinica`.`cesarias` AS `cesarias`,`bdconsultaclinica`.`hijosVivos` AS `hijosVivos`,`bdconsultaclinica`.`planificacion` AS `planificacion`,`bdconsultaclinica`.`fotos` AS `fotos`,`bdconsultaclinica`.`examenes` AS `examenes`,`bdconsultaclinica`.`revision` AS `revision`,`bdconsultaclinica`.`oido` AS `oido`,`bdconsultaclinica`.`vista` AS `vista`,`bdconsultaclinica`.`nariz` AS `nariz`,`bdconsultaclinica`.`gusto` AS `gusto`,`bdconsultaclinica`.`tacto` AS `tacto`,`bdconsultaclinica`.`telefonoResponsable` AS `telefonoResponsable`,`bdconsultaclinica`.`cup2` AS `cup2`,`bdcups_1`.`descripcion` AS `descCup2`,`bdconsultaclinica`.`observacionProcedimientos` AS `observacionProcedimientos`,`bdconsultaclinica`.`menarca` AS `menarca`,`bdconsultaclinica`.`diagnosticoEspecializado` AS `diagnosticoEspecializado`,`bdconsultaclinica`.`nutricionales` AS `nutricionales`,`bdconsultaclinica`.`cc` AS `cc`,`bdconsultaclinica`.`torax` AS `torax`,`bdconsultaclinica`.`abdomen1` AS `abdomen1`,`bdconsultaclinica`.`extremidades1` AS `extremidades1`,`bdconsultaclinica`.`neurologico1` AS `neurologico1`,`bdconsultaclinica`.`pielYfaneras` AS `pielYfaneras`,`bdconsultaclinica`.`revisionSistemas` AS `revisionSistemas`,`bdconsultaclinica`.`historialPersonal` AS `historialPersonal`,`bdconsultaclinica`.`traumaticos` AS `traumaticos`,`bdconsultaclinica`.`gluteos` AS `gluteos`,`bdconsultaclinica`.`mamas` AS `mamas` from ((((((`bdconsultaclinica` left join `bdcies` `bdcies_1` on((`bdconsultaclinica`.`cie1` = `bdcies_1`.`Id`))) left join `bdcies` `bdcies_3` on((`bdcies_3`.`Id` = `bdconsultaclinica`.`cie3`))) left join `bdcies` `bdcies_2` on((`bdconsultaclinica`.`cie2` = `bdcies_2`.`Id`))) left join `bdcies` `bdcies_4` on((`bdconsultaclinica`.`cie4` = `bdcies_4`.`Id`))) left join `bdcups` on((`bdconsultaclinica`.`cup` = `bdcups`.`Id`))) left join `bdcups` `bdcups_1` on((`bdconsultaclinica`.`cup2` = `bdcups_1`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdconsultaclinica`.`Id` AS `Id`,`bdcies_1`.`descripcion` AS `cie1`,`bdcies_2`.`descripcion` AS `cie2`,`bdcies_3`.`descripcion` AS `cie3`,`bdcies_4`.`descripcion` AS `cie4`,`bdclick`.`bdcups`.`descripcion` AS `cup`,`bdclick`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick`.`bdconsultaclinica`.`responsable` AS `responsable`,`bdclick`.`bdconsultaclinica`.`nombre` AS `nombre`,`bdclick`.`bdconsultaclinica`.`parentesco` AS `parentesco`,`bdclick`.`bdconsultaclinica`.`motivo` AS `motivo`,`bdclick`.`bdconsultaclinica`.`fisico1` AS `fisico1`,`bdclick`.`bdconsultaclinica`.`fisico2` AS `fisico2`,`bdclick`.`bdconsultaclinica`.`fisico3` AS `fisico3`,`bdclick`.`bdconsultaclinica`.`problemas` AS `problemas`,`bdclick`.`bdconsultaclinica`.`recomendaciones` AS `recomendaciones`,`bdclick`.`bdconsultaclinica`.`usuario` AS `usuario`,`bdclick`.`bdconsultaclinica`.`fecha` AS `fecha`,`bdclick`.`bdconsultaclinica`.`tratamiento` AS `tratamiento`,`bdclick`.`bdconsultaclinica`.`t` AS `t`,`bdclick`.`bdconsultaclinica`.`peso` AS `peso`,`bdclick`.`bdconsultaclinica`.`talla` AS `talla`,`bdclick`.`bdconsultaclinica`.`fc` AS `fc`,`bdclick`.`bdconsultaclinica`.`fr` AS `fr`,`bdclick`.`bdconsultaclinica`.`pa` AS `pa`,`bdclick`.`bdconsultaclinica`.`cefalico` AS `cefalico`,`bdclick`.`bdconsultaclinica`.`abdominal` AS `abdominal`,`bdclick`.`bdconsultaclinica`.`cabezaCuello` AS `cabezaCuello`,`bdclick`.`bdconsultaclinica`.`cardioPulmonar` AS `cardioPulmonar`,`bdclick`.`bdconsultaclinica`.`abdomen` AS `abdomen`,`bdclick`.`bdconsultaclinica`.`pelvis` AS `pelvis`,`bdclick`.`bdconsultaclinica`.`extremidades` AS `extremidades`,`bdclick`.`bdconsultaclinica`.`organosSentidos` AS `organosSentidos`,`bdclick`.`bdconsultaclinica`.`musculoEsqueletico` AS `musculoEsqueletico`,`bdclick`.`bdconsultaclinica`.`neurologico` AS `neurologico`,`bdclick`.`bdconsultaclinica`.`pielAnexos` AS `pielAnexos`,`bdclick`.`bdconsultaclinica`.`cie1` AS `cie11`,`bdclick`.`bdconsultaclinica`.`cie2` AS `cie22`,`bdclick`.`bdconsultaclinica`.`cie3` AS `cie33`,`bdclick`.`bdconsultaclinica`.`cie4` AS `cie44`,`bdclick`.`bdconsultaclinica`.`cup` AS `cup1`,`bdclick`.`bdconsultaclinica`.`familiar` AS `familiar`,`bdclick`.`bdconsultaclinica`.`fumador` AS `fumador`,`bdclick`.`bdconsultaclinica`.`ingesta` AS `ingesta`,`bdclick`.`bdconsultaclinica`.`alergias` AS `alergias`,`bdclick`.`bdconsultaclinica`.`toxicos` AS `toxicos`,`bdclick`.`bdconsultaclinica`.`medicamentos` AS `medicamentos`,`bdclick`.`bdconsultaclinica`.`patologicos` AS `patologicos`,`bdclick`.`bdconsultaclinica`.`psiquiatricos` AS `psiquiatricos`,`bdclick`.`bdconsultaclinica`.`quirurgicos` AS `quirurgicos`,`bdclick`.`bdconsultaclinica`.`ultimaMenstruacion` AS `ultimaMenstruacion`,`bdclick`.`bdconsultaclinica`.`ultimaCitologia` AS `ultimaCitologia`,`bdclick`.`bdconsultaclinica`.`resultadosCitologia` AS `resultadosCitologia`,`bdclick`.`bdconsultaclinica`.`embarazos` AS `embarazos`,`bdclick`.`bdconsultaclinica`.`abortos` AS `abortos`,`bdclick`.`bdconsultaclinica`.`partos` AS `partos`,`bdclick`.`bdconsultaclinica`.`cesarias` AS `cesarias`,`bdclick`.`bdconsultaclinica`.`hijosVivos` AS `hijosVivos`,`bdclick`.`bdconsultaclinica`.`planificacion` AS `planificacion`,`bdclick`.`bdconsultaclinica`.`fotos` AS `fotos`,`bdclick`.`bdconsultaclinica`.`examenes` AS `examenes`,`bdclick`.`bdconsultaclinica`.`revision` AS `revision`,`bdclick`.`bdconsultaclinica`.`oido` AS `oido`,`bdclick`.`bdconsultaclinica`.`vista` AS `vista`,`bdclick`.`bdconsultaclinica`.`nariz` AS `nariz`,`bdclick`.`bdconsultaclinica`.`gusto` AS `gusto`,`bdclick`.`bdconsultaclinica`.`tacto` AS `tacto`,`bdclick`.`bdconsultaclinica`.`telefonoResponsable` AS `telefonoResponsable`,`bdclick`.`bdconsultaclinica`.`cup2` AS `cup2`,`bdcups_1`.`descripcion` AS `descCup2`,`bdclick`.`bdconsultaclinica`.`observacionProcedimientos` AS `observacionProcedimientos`,`bdclick`.`bdconsultaclinica`.`menarca` AS `menarca`,`bdclick`.`bdconsultaclinica`.`diagnosticoEspecializado` AS `diagnosticoEspecializado`,`bdclick`.`bdconsultaclinica`.`nutricionales` AS `nutricionales`,`bdclick`.`bdconsultaclinica`.`cc` AS `cc`,`bdclick`.`bdconsultaclinica`.`torax` AS `torax`,`bdclick`.`bdconsultaclinica`.`abdomen1` AS `abdomen1`,`bdclick`.`bdconsultaclinica`.`extremidades1` AS `extremidades1`,`bdclick`.`bdconsultaclinica`.`neurologico1` AS `neurologico1`,`bdclick`.`bdconsultaclinica`.`pielYfaneras` AS `pielYfaneras`,`bdclick`.`bdconsultaclinica`.`revisionSistemas` AS `revisionSistemas`,`bdclick`.`bdconsultaclinica`.`historialPersonal` AS `historialPersonal`,`bdclick`.`bdconsultaclinica`.`traumaticos` AS `traumaticos`,`bdclick`.`bdconsultaclinica`.`gluteos` AS `gluteos`,`bdclick`.`bdconsultaclinica`.`mamas` AS `mamas` from ((((((`bdclick`.`bdconsultaclinica` left join `bdclick`.`bdcies` `bdcies_1` on((`bdclick`.`bdconsultaclinica`.`cie1` = `bdcies_1`.`Id`))) left join `bdclick`.`bdcies` `bdcies_3` on((`bdcies_3`.`Id` = `bdclick`.`bdconsultaclinica`.`cie3`))) left join `bdclick`.`bdcies` `bdcies_2` on((`bdclick`.`bdconsultaclinica`.`cie2` = `bdcies_2`.`Id`))) left join `bdclick`.`bdcies` `bdcies_4` on((`bdclick`.`bdconsultaclinica`.`cie4` = `bdcies_4`.`Id`))) left join `bdclick`.`bdcups` on((`bdclick`.`bdconsultaclinica`.`cup` = `bdclick`.`bdcups`.`Id`))) left join `bdclick`.`bdcups` `bdcups_1` on((`bdclick`.`bdconsultaclinica`.`cup2` = `bdcups_1`.`Id`)))
mariadb-version=100135