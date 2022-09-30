TYPE=VIEW
query=select `bdclick5`.`bdconsultaclinica`.`Id` AS `Id`,`bdcies_1`.`descripcion` AS `cie1`,`bdcies_2`.`descripcion` AS `cie2`,`bdcies_3`.`descripcion` AS `cie3`,`bdcies_4`.`descripcion` AS `cie4`,`bdclick5`.`bdcups`.`descripcion` AS `cup`,`bdclick5`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick5`.`bdconsultaclinica`.`responsable` AS `responsable`,`bdclick5`.`bdconsultaclinica`.`nombre` AS `nombre`,`bdclick5`.`bdconsultaclinica`.`parentesco` AS `parentesco`,`bdclick5`.`bdconsultaclinica`.`motivo` AS `motivo`,`bdclick5`.`bdconsultaclinica`.`fisico1` AS `fisico1`,`bdclick5`.`bdconsultaclinica`.`fisico2` AS `fisico2`,`bdclick5`.`bdconsultaclinica`.`fisico3` AS `fisico3`,`bdclick5`.`bdconsultaclinica`.`problemas` AS `problemas`,`bdclick5`.`bdconsultaclinica`.`recomendaciones` AS `recomendaciones`,`bdclick5`.`bdconsultaclinica`.`usuario` AS `usuario`,`bdclick5`.`bdconsultaclinica`.`fecha` AS `fecha`,`bdclick5`.`bdconsultaclinica`.`tratamiento` AS `tratamiento`,`bdclick5`.`bdconsultaclinica`.`t` AS `t`,`bdclick5`.`bdconsultaclinica`.`peso` AS `peso`,`bdclick5`.`bdconsultaclinica`.`talla` AS `talla`,`bdclick5`.`bdconsultaclinica`.`fc` AS `fc`,`bdclick5`.`bdconsultaclinica`.`fr` AS `fr`,`bdclick5`.`bdconsultaclinica`.`pa` AS `pa`,`bdclick5`.`bdconsultaclinica`.`cefalico` AS `cefalico`,`bdclick5`.`bdconsultaclinica`.`abdominal` AS `abdominal`,`bdclick5`.`bdconsultaclinica`.`cabezaCuello` AS `cabezaCuello`,`bdclick5`.`bdconsultaclinica`.`cardioPulmonar` AS `cardioPulmonar`,`bdclick5`.`bdconsultaclinica`.`abdomen` AS `abdomen`,`bdclick5`.`bdconsultaclinica`.`pelvis` AS `pelvis`,`bdclick5`.`bdconsultaclinica`.`extremidades` AS `extremidades`,`bdclick5`.`bdconsultaclinica`.`organosSentidos` AS `organosSentidos`,`bdclick5`.`bdconsultaclinica`.`musculoEsqueletico` AS `musculoEsqueletico`,`bdclick5`.`bdconsultaclinica`.`neurologico` AS `neurologico`,`bdclick5`.`bdconsultaclinica`.`pielAnexos` AS `pielAnexos`,`bdclick5`.`bdconsultaclinica`.`cie1` AS `cie11`,`bdclick5`.`bdconsultaclinica`.`cie2` AS `cie22`,`bdclick5`.`bdconsultaclinica`.`cie3` AS `cie33`,`bdclick5`.`bdconsultaclinica`.`cie4` AS `cie44`,`bdclick5`.`bdconsultaclinica`.`cup` AS `cup1`,`bdclick5`.`bdconsultaclinica`.`familiar` AS `familiar`,`bdclick5`.`bdconsultaclinica`.`fumador` AS `fumador`,`bdclick5`.`bdconsultaclinica`.`ingesta` AS `ingesta`,`bdclick5`.`bdconsultaclinica`.`alergias` AS `alergias`,`bdclick5`.`bdconsultaclinica`.`toxicos` AS `toxicos`,`bdclick5`.`bdconsultaclinica`.`medicamentos` AS `medicamentos`,`bdclick5`.`bdconsultaclinica`.`patologicos` AS `patologicos`,`bdclick5`.`bdconsultaclinica`.`psiquiatricos` AS `psiquiatricos`,`bdclick5`.`bdconsultaclinica`.`quirurgicos` AS `quirurgicos`,`bdclick5`.`bdconsultaclinica`.`ultimaMenstruacion` AS `ultimaMenstruacion`,`bdclick5`.`bdconsultaclinica`.`ultimaCitologia` AS `ultimaCitologia`,`bdclick5`.`bdconsultaclinica`.`resultadosCitologia` AS `resultadosCitologia`,`bdclick5`.`bdconsultaclinica`.`embarazos` AS `embarazos`,`bdclick5`.`bdconsultaclinica`.`abortos` AS `abortos`,`bdclick5`.`bdconsultaclinica`.`partos` AS `partos`,`bdclick5`.`bdconsultaclinica`.`cesarias` AS `cesarias`,`bdclick5`.`bdconsultaclinica`.`hijosVivos` AS `hijosVivos`,`bdclick5`.`bdconsultaclinica`.`planificacion` AS `planificacion`,`bdclick5`.`bdconsultaclinica`.`fotos` AS `fotos`,`bdclick5`.`bdconsultaclinica`.`examenes` AS `examenes`,`bdclick5`.`bdconsultaclinica`.`revision` AS `revision`,`bdclick5`.`bdconsultaclinica`.`oido` AS `oido`,`bdclick5`.`bdconsultaclinica`.`vista` AS `vista`,`bdclick5`.`bdconsultaclinica`.`nariz` AS `nariz`,`bdclick5`.`bdconsultaclinica`.`gusto` AS `gusto`,`bdclick5`.`bdconsultaclinica`.`tacto` AS `tacto`,`bdclick5`.`bdconsultaclinica`.`telefonoResponsable` AS `telefonoResponsable`,`bdclick5`.`bdconsultaclinica`.`cup2` AS `cup2`,`bdcups_1`.`descripcion` AS `descCup2`,`bdclick5`.`bdconsultaclinica`.`observacionProcedimientos` AS `observacionProcedimientos`,`bdclick5`.`bdconsultaclinica`.`menarca` AS `menarca`,`bdclick5`.`bdconsultaclinica`.`diagnosticoEspecializado` AS `diagnosticoEspecializado`,`bdclick5`.`bdconsultaclinica`.`nutricionales` AS `nutricionales`,`bdclick5`.`bdconsultaclinica`.`cc` AS `cc`,`bdclick5`.`bdconsultaclinica`.`torax` AS `torax`,`bdclick5`.`bdconsultaclinica`.`abdomen1` AS `abdomen1`,`bdclick5`.`bdconsultaclinica`.`extremidades1` AS `extremidades1`,`bdclick5`.`bdconsultaclinica`.`neurologico1` AS `neurologico1`,`bdclick5`.`bdconsultaclinica`.`pielYfaneras` AS `pielYfaneras`,`bdclick5`.`bdconsultaclinica`.`revisionSistemas` AS `revisionSistemas`,`bdclick5`.`bdconsultaclinica`.`historialPersonal` AS `historialPersonal`,`bdclick5`.`bdconsultaclinica`.`traumaticos` AS `traumaticos`,`bdclick5`.`bdconsultaclinica`.`gluteos` AS `gluteos`,`bdclick5`.`bdconsultaclinica`.`mamas` AS `mamas` from ((((((`bdclick5`.`bdconsultaclinica` left join `bdclick5`.`bdcies` `bdcies_1` on((`bdclick5`.`bdconsultaclinica`.`cie1` = `bdcies_1`.`Id`))) left join `bdclick5`.`bdcies` `bdcies_3` on((`bdcies_3`.`Id` = `bdclick5`.`bdconsultaclinica`.`cie3`))) left join `bdclick5`.`bdcies` `bdcies_2` on((`bdclick5`.`bdconsultaclinica`.`cie2` = `bdcies_2`.`Id`))) left join `bdclick5`.`bdcies` `bdcies_4` on((`bdclick5`.`bdconsultaclinica`.`cie4` = `bdcies_4`.`Id`))) left join `bdclick5`.`bdcups` on((`bdclick5`.`bdconsultaclinica`.`cup` = `bdclick5`.`bdcups`.`Id`))) left join `bdclick5`.`bdcups` `bdcups_1` on((`bdclick5`.`bdconsultaclinica`.`cup2` = `bdcups_1`.`Id`)))
md5=e2630271a8d8748dfec4f2a64fa045ba
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:45
create-version=2
source=select `bdconsultaclinica`.`Id` AS `Id`,`bdcies_1`.`descripcion` AS `cie1`,`bdcies_2`.`descripcion` AS `cie2`,`bdcies_3`.`descripcion` AS `cie3`,`bdcies_4`.`descripcion` AS `cie4`,`bdcups`.`descripcion` AS `cup`,`bdconsultaclinica`.`historia` AS `historia`,`bdconsultaclinica`.`responsable` AS `responsable`,`bdconsultaclinica`.`nombre` AS `nombre`,`bdconsultaclinica`.`parentesco` AS `parentesco`,`bdconsultaclinica`.`motivo` AS `motivo`,`bdconsultaclinica`.`fisico1` AS `fisico1`,`bdconsultaclinica`.`fisico2` AS `fisico2`,`bdconsultaclinica`.`fisico3` AS `fisico3`,`bdconsultaclinica`.`problemas` AS `problemas`,`bdconsultaclinica`.`recomendaciones` AS `recomendaciones`,`bdconsultaclinica`.`usuario` AS `usuario`,`bdconsultaclinica`.`fecha` AS `fecha`,`bdconsultaclinica`.`tratamiento` AS `tratamiento`,`bdconsultaclinica`.`t` AS `t`,`bdconsultaclinica`.`peso` AS `peso`,`bdconsultaclinica`.`talla` AS `talla`,`bdconsultaclinica`.`fc` AS `fc`,`bdconsultaclinica`.`fr` AS `fr`,`bdconsultaclinica`.`pa` AS `pa`,`bdconsultaclinica`.`cefalico` AS `cefalico`,`bdconsultaclinica`.`abdominal` AS `abdominal`,`bdconsultaclinica`.`cabezaCuello` AS `cabezaCuello`,`bdconsultaclinica`.`cardioPulmonar` AS `cardioPulmonar`,`bdconsultaclinica`.`abdomen` AS `abdomen`,`bdconsultaclinica`.`pelvis` AS `pelvis`,`bdconsultaclinica`.`extremidades` AS `extremidades`,`bdconsultaclinica`.`organosSentidos` AS `organosSentidos`,`bdconsultaclinica`.`musculoEsqueletico` AS `musculoEsqueletico`,`bdconsultaclinica`.`neurologico` AS `neurologico`,`bdconsultaclinica`.`pielAnexos` AS `pielAnexos`,`bdconsultaclinica`.`cie1` AS `cie11`,`bdconsultaclinica`.`cie2` AS `cie22`,`bdconsultaclinica`.`cie3` AS `cie33`,`bdconsultaclinica`.`cie4` AS `cie44`,`bdconsultaclinica`.`cup` AS `cup1`,`bdconsultaclinica`.`familiar` AS `familiar`,`bdconsultaclinica`.`fumador` AS `fumador`,`bdconsultaclinica`.`ingesta` AS `ingesta`,`bdconsultaclinica`.`alergias` AS `alergias`,`bdconsultaclinica`.`toxicos` AS `toxicos`,`bdconsultaclinica`.`medicamentos` AS `medicamentos`,`bdconsultaclinica`.`patologicos` AS `patologicos`,`bdconsultaclinica`.`psiquiatricos` AS `psiquiatricos`,`bdconsultaclinica`.`quirurgicos` AS `quirurgicos`,`bdconsultaclinica`.`ultimaMenstruacion` AS `ultimaMenstruacion`,`bdconsultaclinica`.`ultimaCitologia` AS `ultimaCitologia`,`bdconsultaclinica`.`resultadosCitologia` AS `resultadosCitologia`,`bdconsultaclinica`.`embarazos` AS `embarazos`,`bdconsultaclinica`.`abortos` AS `abortos`,`bdconsultaclinica`.`partos` AS `partos`,`bdconsultaclinica`.`cesarias` AS `cesarias`,`bdconsultaclinica`.`hijosVivos` AS `hijosVivos`,`bdconsultaclinica`.`planificacion` AS `planificacion`,`bdconsultaclinica`.`fotos` AS `fotos`,`bdconsultaclinica`.`examenes` AS `examenes`,`bdconsultaclinica`.`revision` AS `revision`,`bdconsultaclinica`.`oido` AS `oido`,`bdconsultaclinica`.`vista` AS `vista`,`bdconsultaclinica`.`nariz` AS `nariz`,`bdconsultaclinica`.`gusto` AS `gusto`,`bdconsultaclinica`.`tacto` AS `tacto`,`bdconsultaclinica`.`telefonoResponsable` AS `telefonoResponsable`,`bdconsultaclinica`.`cup2` AS `cup2`,`bdcups_1`.`descripcion` AS `descCup2`,`bdconsultaclinica`.`observacionProcedimientos` AS `observacionProcedimientos`,`bdconsultaclinica`.`menarca` AS `menarca`,`bdconsultaclinica`.`diagnosticoEspecializado` AS `diagnosticoEspecializado`,`bdconsultaclinica`.`nutricionales` AS `nutricionales`,`bdconsultaclinica`.`cc` AS `cc`,`bdconsultaclinica`.`torax` AS `torax`,`bdconsultaclinica`.`abdomen1` AS `abdomen1`,`bdconsultaclinica`.`extremidades1` AS `extremidades1`,`bdconsultaclinica`.`neurologico1` AS `neurologico1`,`bdconsultaclinica`.`pielYfaneras` AS `pielYfaneras`,`bdconsultaclinica`.`revisionSistemas` AS `revisionSistemas`,`bdconsultaclinica`.`historialPersonal` AS `historialPersonal`,`bdconsultaclinica`.`traumaticos` AS `traumaticos`,`bdconsultaclinica`.`gluteos` AS `gluteos`,`bdconsultaclinica`.`mamas` AS `mamas` from ((((((`bdconsultaclinica` left join `bdcies` `bdcies_1` on((`bdconsultaclinica`.`cie1` = `bdcies_1`.`Id`))) left join `bdcies` `bdcies_3` on((`bdcies_3`.`Id` = `bdconsultaclinica`.`cie3`))) left join `bdcies` `bdcies_2` on((`bdconsultaclinica`.`cie2` = `bdcies_2`.`Id`))) left join `bdcies` `bdcies_4` on((`bdconsultaclinica`.`cie4` = `bdcies_4`.`Id`))) left join `bdcups` on((`bdconsultaclinica`.`cup` = `bdcups`.`Id`))) left join `bdcups` `bdcups_1` on((`bdconsultaclinica`.`cup2` = `bdcups_1`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdconsultaclinica`.`Id` AS `Id`,`bdcies_1`.`descripcion` AS `cie1`,`bdcies_2`.`descripcion` AS `cie2`,`bdcies_3`.`descripcion` AS `cie3`,`bdcies_4`.`descripcion` AS `cie4`,`bdclick5`.`bdcups`.`descripcion` AS `cup`,`bdclick5`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick5`.`bdconsultaclinica`.`responsable` AS `responsable`,`bdclick5`.`bdconsultaclinica`.`nombre` AS `nombre`,`bdclick5`.`bdconsultaclinica`.`parentesco` AS `parentesco`,`bdclick5`.`bdconsultaclinica`.`motivo` AS `motivo`,`bdclick5`.`bdconsultaclinica`.`fisico1` AS `fisico1`,`bdclick5`.`bdconsultaclinica`.`fisico2` AS `fisico2`,`bdclick5`.`bdconsultaclinica`.`fisico3` AS `fisico3`,`bdclick5`.`bdconsultaclinica`.`problemas` AS `problemas`,`bdclick5`.`bdconsultaclinica`.`recomendaciones` AS `recomendaciones`,`bdclick5`.`bdconsultaclinica`.`usuario` AS `usuario`,`bdclick5`.`bdconsultaclinica`.`fecha` AS `fecha`,`bdclick5`.`bdconsultaclinica`.`tratamiento` AS `tratamiento`,`bdclick5`.`bdconsultaclinica`.`t` AS `t`,`bdclick5`.`bdconsultaclinica`.`peso` AS `peso`,`bdclick5`.`bdconsultaclinica`.`talla` AS `talla`,`bdclick5`.`bdconsultaclinica`.`fc` AS `fc`,`bdclick5`.`bdconsultaclinica`.`fr` AS `fr`,`bdclick5`.`bdconsultaclinica`.`pa` AS `pa`,`bdclick5`.`bdconsultaclinica`.`cefalico` AS `cefalico`,`bdclick5`.`bdconsultaclinica`.`abdominal` AS `abdominal`,`bdclick5`.`bdconsultaclinica`.`cabezaCuello` AS `cabezaCuello`,`bdclick5`.`bdconsultaclinica`.`cardioPulmonar` AS `cardioPulmonar`,`bdclick5`.`bdconsultaclinica`.`abdomen` AS `abdomen`,`bdclick5`.`bdconsultaclinica`.`pelvis` AS `pelvis`,`bdclick5`.`bdconsultaclinica`.`extremidades` AS `extremidades`,`bdclick5`.`bdconsultaclinica`.`organosSentidos` AS `organosSentidos`,`bdclick5`.`bdconsultaclinica`.`musculoEsqueletico` AS `musculoEsqueletico`,`bdclick5`.`bdconsultaclinica`.`neurologico` AS `neurologico`,`bdclick5`.`bdconsultaclinica`.`pielAnexos` AS `pielAnexos`,`bdclick5`.`bdconsultaclinica`.`cie1` AS `cie11`,`bdclick5`.`bdconsultaclinica`.`cie2` AS `cie22`,`bdclick5`.`bdconsultaclinica`.`cie3` AS `cie33`,`bdclick5`.`bdconsultaclinica`.`cie4` AS `cie44`,`bdclick5`.`bdconsultaclinica`.`cup` AS `cup1`,`bdclick5`.`bdconsultaclinica`.`familiar` AS `familiar`,`bdclick5`.`bdconsultaclinica`.`fumador` AS `fumador`,`bdclick5`.`bdconsultaclinica`.`ingesta` AS `ingesta`,`bdclick5`.`bdconsultaclinica`.`alergias` AS `alergias`,`bdclick5`.`bdconsultaclinica`.`toxicos` AS `toxicos`,`bdclick5`.`bdconsultaclinica`.`medicamentos` AS `medicamentos`,`bdclick5`.`bdconsultaclinica`.`patologicos` AS `patologicos`,`bdclick5`.`bdconsultaclinica`.`psiquiatricos` AS `psiquiatricos`,`bdclick5`.`bdconsultaclinica`.`quirurgicos` AS `quirurgicos`,`bdclick5`.`bdconsultaclinica`.`ultimaMenstruacion` AS `ultimaMenstruacion`,`bdclick5`.`bdconsultaclinica`.`ultimaCitologia` AS `ultimaCitologia`,`bdclick5`.`bdconsultaclinica`.`resultadosCitologia` AS `resultadosCitologia`,`bdclick5`.`bdconsultaclinica`.`embarazos` AS `embarazos`,`bdclick5`.`bdconsultaclinica`.`abortos` AS `abortos`,`bdclick5`.`bdconsultaclinica`.`partos` AS `partos`,`bdclick5`.`bdconsultaclinica`.`cesarias` AS `cesarias`,`bdclick5`.`bdconsultaclinica`.`hijosVivos` AS `hijosVivos`,`bdclick5`.`bdconsultaclinica`.`planificacion` AS `planificacion`,`bdclick5`.`bdconsultaclinica`.`fotos` AS `fotos`,`bdclick5`.`bdconsultaclinica`.`examenes` AS `examenes`,`bdclick5`.`bdconsultaclinica`.`revision` AS `revision`,`bdclick5`.`bdconsultaclinica`.`oido` AS `oido`,`bdclick5`.`bdconsultaclinica`.`vista` AS `vista`,`bdclick5`.`bdconsultaclinica`.`nariz` AS `nariz`,`bdclick5`.`bdconsultaclinica`.`gusto` AS `gusto`,`bdclick5`.`bdconsultaclinica`.`tacto` AS `tacto`,`bdclick5`.`bdconsultaclinica`.`telefonoResponsable` AS `telefonoResponsable`,`bdclick5`.`bdconsultaclinica`.`cup2` AS `cup2`,`bdcups_1`.`descripcion` AS `descCup2`,`bdclick5`.`bdconsultaclinica`.`observacionProcedimientos` AS `observacionProcedimientos`,`bdclick5`.`bdconsultaclinica`.`menarca` AS `menarca`,`bdclick5`.`bdconsultaclinica`.`diagnosticoEspecializado` AS `diagnosticoEspecializado`,`bdclick5`.`bdconsultaclinica`.`nutricionales` AS `nutricionales`,`bdclick5`.`bdconsultaclinica`.`cc` AS `cc`,`bdclick5`.`bdconsultaclinica`.`torax` AS `torax`,`bdclick5`.`bdconsultaclinica`.`abdomen1` AS `abdomen1`,`bdclick5`.`bdconsultaclinica`.`extremidades1` AS `extremidades1`,`bdclick5`.`bdconsultaclinica`.`neurologico1` AS `neurologico1`,`bdclick5`.`bdconsultaclinica`.`pielYfaneras` AS `pielYfaneras`,`bdclick5`.`bdconsultaclinica`.`revisionSistemas` AS `revisionSistemas`,`bdclick5`.`bdconsultaclinica`.`historialPersonal` AS `historialPersonal`,`bdclick5`.`bdconsultaclinica`.`traumaticos` AS `traumaticos`,`bdclick5`.`bdconsultaclinica`.`gluteos` AS `gluteos`,`bdclick5`.`bdconsultaclinica`.`mamas` AS `mamas` from ((((((`bdclick5`.`bdconsultaclinica` left join `bdclick5`.`bdcies` `bdcies_1` on((`bdclick5`.`bdconsultaclinica`.`cie1` = `bdcies_1`.`Id`))) left join `bdclick5`.`bdcies` `bdcies_3` on((`bdcies_3`.`Id` = `bdclick5`.`bdconsultaclinica`.`cie3`))) left join `bdclick5`.`bdcies` `bdcies_2` on((`bdclick5`.`bdconsultaclinica`.`cie2` = `bdcies_2`.`Id`))) left join `bdclick5`.`bdcies` `bdcies_4` on((`bdclick5`.`bdconsultaclinica`.`cie4` = `bdcies_4`.`Id`))) left join `bdclick5`.`bdcups` on((`bdclick5`.`bdconsultaclinica`.`cup` = `bdclick5`.`bdcups`.`Id`))) left join `bdclick5`.`bdcups` `bdcups_1` on((`bdclick5`.`bdconsultaclinica`.`cup2` = `bdcups_1`.`Id`)))
mariadb-version=100135
