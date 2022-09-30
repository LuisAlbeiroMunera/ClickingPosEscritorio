TYPE=VIEW
query=select `bdclick6`.`bdcertificadomedicoestudiante`.`Id` AS `Id`,`bdclick6`.`bdterceros`.`tipo` AS `tipo`,`bdclick6`.`bdterceros`.`id` AS `IdTer`,`bdclick6`.`bdterceros`.`idSistema` AS `idSistema`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,`bdclick6`.`bdterceros`.`direccion` AS `direccion`,`bdclick6`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick6`.`bdterceros`.`nacimiento` AS `nacimiento`,`bdclick6`.`bdterceros`.`estado` AS `estado`,\'\' AS `hijos`,\'\' AS `escolaridad`,`bdclick6`.`bdcertificadomedicoestudiante`.`historia` AS `historia`,`bdclick6`.`bdcertificadomedicoestudiante`.`Responsable` AS `Responsable`,`bdclick6`.`bdcertificadomedicoestudiante`.`nombre` AS `dirigido`,`bdclick6`.`bdcertificadomedicoestudiante`.`parentesco` AS `parentesco`,`bdclick6`.`bdcertificadomedicoestudiante`.`motivo` AS `motivo`,`bdclick6`.`bdcertificadomedicoestudiante`.`enfermedad` AS `enfermedad`,`bdclick6`.`bdcertificadomedicoestudiante`.`Revision` AS `Revision`,`bdclick6`.`bdcertificadomedicoestudiante`.`inspeccion` AS `inspeccion`,`bdclick6`.`bdcertificadomedicoestudiante`.`temp` AS `temp`,`bdclick6`.`bdcertificadomedicoestudiante`.`peso` AS `peso`,`bdclick6`.`bdcertificadomedicoestudiante`.`estatura` AS `estatura`,`bdclick6`.`bdcertificadomedicoestudiante`.`fc` AS `fc`,`bdclick6`.`bdcertificadomedicoestudiante`.`fr` AS `fr`,`bdclick6`.`bdcertificadomedicoestudiante`.`pa` AS `pa`,`bdclick6`.`bdcertificadomedicoestudiante`.`cefalico` AS `cefalico`,`bdclick6`.`bdcertificadomedicoestudiante`.`abdominal` AS `abdominal`,`bdclick6`.`bdcertificadomedicoestudiante`.`imc` AS `imc`,`bdclick6`.`bdcertificadomedicoestudiante`.`cabeza` AS `cabeza`,`bdclick6`.`bdcertificadomedicoestudiante`.`ojos` AS `ojos`,`bdclick6`.`bdcertificadomedicoestudiante`.`agudezaVisual` AS `agudezaVisual`,`bdclick6`.`bdcertificadomedicoestudiante`.`oidos` AS `oidos`,`bdclick6`.`bdcertificadomedicoestudiante`.`nariz` AS `nariz`,`bdclick6`.`bdcertificadomedicoestudiante`.`boca` AS `boca`,`bdclick6`.`bdcertificadomedicoestudiante`.`cuello` AS `cuello`,`bdclick6`.`bdcertificadomedicoestudiante`.`cardioPulmonar` AS `cardioPulmonar`,`bdclick6`.`bdcertificadomedicoestudiante`.`torax` AS `torax`,`bdclick6`.`bdcertificadomedicoestudiante`.`abdomen` AS `abdomen`,`bdclick6`.`bdcertificadomedicoestudiante`.`genitoUrinario` AS `genitoUrinario`,`bdclick6`.`bdcertificadomedicoestudiante`.`ano` AS `ano`,`bdclick6`.`bdcertificadomedicoestudiante`.`extremidades` AS `extremidades`,`bdclick6`.`bdcertificadomedicoestudiante`.`neurologico` AS `neurologico`,`bdclick6`.`bdcertificadomedicoestudiante`.`pies` AS `pies`,`bdclick6`.`bdcertificadomedicoestudiante`.`osteoMuscular` AS `osteoMuscular`,`bdclick6`.`bdcertificadomedicoestudiante`.`diagPrincipal` AS `diagPrincipal`,`bdclick6`.`bdcertificadomedicoestudiante`.`diagRelacionado` AS `diagRelacionado`,`bdclick6`.`bdcertificadomedicoestudiante`.`diagRelacionado2` AS `diagRelacionado2`,`bdclick6`.`bdcertificadomedicoestudiante`.`diagRelacionado3` AS `diagRelacionado3`,`bdclick6`.`bdcertificadomedicoestudiante`.`tratamiento` AS `tratamiento`,`bdclick6`.`bdcertificadomedicoestudiante`.`recomendaciones` AS `recomendaciones`,`bdclick6`.`bdcertificadomedicoestudiante`.`cup` AS `cup`,`bdclick6`.`bdcertificadomedicoestudiante`.`usuario` AS `usuario`,`bdclick6`.`bdcertificadomedicoestudiante`.`fecha` AS `fecha`,`bdclick6`.`bdcertificadomedicoestudiante`.`patologicos` AS `patologicos`,`bdclick6`.`bdcertificadomedicoestudiante`.`quirurgicos` AS `quirurgicos`,`bdclick6`.`bdcertificadomedicoestudiante`.`alergicos` AS `alergicos`,`bdclick6`.`bdcertificadomedicoestudiante`.`traumaticos` AS `traumaticos`,`bdclick6`.`bdcertificadomedicoestudiante`.`ginecoobstetricos` AS `ginecoobstetricos`,`bdclick6`.`bdcertificadomedicoestudiante`.`familiares` AS `familiares`,`bdclick6`.`bdcertificadomedicoestudiante`.`social` AS `social` from ((`bdclick6`.`bdterceros` join `bdclick6`.`bdhistoriaclinica` on((`bdclick6`.`bdterceros`.`idSistema` = `bdclick6`.`bdhistoriaclinica`.`paciente`))) join `bdclick6`.`bdcertificadomedicoestudiante` on((`bdclick6`.`bdhistoriaclinica`.`id` = `bdclick6`.`bdcertificadomedicoestudiante`.`historia`)))
md5=3b3ab674e034dd40a588b431593a4567
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:33
create-version=2
source=select `bdcertificadomedicoestudiante`.`Id` AS `Id`,`bdterceros`.`tipo` AS `tipo`,`bdterceros`.`id` AS `IdTer`,`bdterceros`.`idSistema` AS `idSistema`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`ciudad` AS `ciudad`,`bdterceros`.`nacimiento` AS `nacimiento`,`bdterceros`.`estado` AS `estado`,\'\' AS `hijos`,\'\' AS `escolaridad`,`bdcertificadomedicoestudiante`.`historia` AS `historia`,`bdcertificadomedicoestudiante`.`Responsable` AS `Responsable`,`bdcertificadomedicoestudiante`.`nombre` AS `dirigido`,`bdcertificadomedicoestudiante`.`parentesco` AS `parentesco`,`bdcertificadomedicoestudiante`.`motivo` AS `motivo`,`bdcertificadomedicoestudiante`.`enfermedad` AS `enfermedad`,`bdcertificadomedicoestudiante`.`Revision` AS `Revision`,`bdcertificadomedicoestudiante`.`inspeccion` AS `inspeccion`,`bdcertificadomedicoestudiante`.`temp` AS `temp`,`bdcertificadomedicoestudiante`.`peso` AS `peso`,`bdcertificadomedicoestudiante`.`estatura` AS `estatura`,`bdcertificadomedicoestudiante`.`fc` AS `fc`,`bdcertificadomedicoestudiante`.`fr` AS `fr`,`bdcertificadomedicoestudiante`.`pa` AS `pa`,`bdcertificadomedicoestudiante`.`cefalico` AS `cefalico`,`bdcertificadomedicoestudiante`.`abdominal` AS `abdominal`,`bdcertificadomedicoestudiante`.`imc` AS `imc`,`bdcertificadomedicoestudiante`.`cabeza` AS `cabeza`,`bdcertificadomedicoestudiante`.`ojos` AS `ojos`,`bdcertificadomedicoestudiante`.`agudezaVisual` AS `agudezaVisual`,`bdcertificadomedicoestudiante`.`oidos` AS `oidos`,`bdcertificadomedicoestudiante`.`nariz` AS `nariz`,`bdcertificadomedicoestudiante`.`boca` AS `boca`,`bdcertificadomedicoestudiante`.`cuello` AS `cuello`,`bdcertificadomedicoestudiante`.`cardioPulmonar` AS `cardioPulmonar`,`bdcertificadomedicoestudiante`.`torax` AS `torax`,`bdcertificadomedicoestudiante`.`abdomen` AS `abdomen`,`bdcertificadomedicoestudiante`.`genitoUrinario` AS `genitoUrinario`,`bdcertificadomedicoestudiante`.`ano` AS `ano`,`bdcertificadomedicoestudiante`.`extremidades` AS `extremidades`,`bdcertificadomedicoestudiante`.`neurologico` AS `neurologico`,`bdcertificadomedicoestudiante`.`pies` AS `pies`,`bdcertificadomedicoestudiante`.`osteoMuscular` AS `osteoMuscular`,`bdcertificadomedicoestudiante`.`diagPrincipal` AS `diagPrincipal`,`bdcertificadomedicoestudiante`.`diagRelacionado` AS `diagRelacionado`,`bdcertificadomedicoestudiante`.`diagRelacionado2` AS `diagRelacionado2`,`bdcertificadomedicoestudiante`.`diagRelacionado3` AS `diagRelacionado3`,`bdcertificadomedicoestudiante`.`tratamiento` AS `tratamiento`,`bdcertificadomedicoestudiante`.`recomendaciones` AS `recomendaciones`,`bdcertificadomedicoestudiante`.`cup` AS `cup`,`bdcertificadomedicoestudiante`.`usuario` AS `usuario`,`bdcertificadomedicoestudiante`.`fecha` AS `fecha`,`bdcertificadomedicoestudiante`.`patologicos` AS `patologicos`,`bdcertificadomedicoestudiante`.`quirurgicos` AS `quirurgicos`,`bdcertificadomedicoestudiante`.`alergicos` AS `alergicos`,`bdcertificadomedicoestudiante`.`traumaticos` AS `traumaticos`,`bdcertificadomedicoestudiante`.`ginecoobstetricos` AS `ginecoobstetricos`,`bdcertificadomedicoestudiante`.`familiares` AS `familiares`,`bdcertificadomedicoestudiante`.`social` AS `social` from ((`bdterceros` join `bdhistoriaclinica` on((`bdterceros`.`idSistema` = `bdhistoriaclinica`.`paciente`))) join `bdcertificadomedicoestudiante` on((`bdhistoriaclinica`.`id` = `bdcertificadomedicoestudiante`.`historia`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdcertificadomedicoestudiante`.`Id` AS `Id`,`bdclick6`.`bdterceros`.`tipo` AS `tipo`,`bdclick6`.`bdterceros`.`id` AS `IdTer`,`bdclick6`.`bdterceros`.`idSistema` AS `idSistema`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,`bdclick6`.`bdterceros`.`direccion` AS `direccion`,`bdclick6`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick6`.`bdterceros`.`nacimiento` AS `nacimiento`,`bdclick6`.`bdterceros`.`estado` AS `estado`,\'\' AS `hijos`,\'\' AS `escolaridad`,`bdclick6`.`bdcertificadomedicoestudiante`.`historia` AS `historia`,`bdclick6`.`bdcertificadomedicoestudiante`.`Responsable` AS `Responsable`,`bdclick6`.`bdcertificadomedicoestudiante`.`nombre` AS `dirigido`,`bdclick6`.`bdcertificadomedicoestudiante`.`parentesco` AS `parentesco`,`bdclick6`.`bdcertificadomedicoestudiante`.`motivo` AS `motivo`,`bdclick6`.`bdcertificadomedicoestudiante`.`enfermedad` AS `enfermedad`,`bdclick6`.`bdcertificadomedicoestudiante`.`Revision` AS `Revision`,`bdclick6`.`bdcertificadomedicoestudiante`.`inspeccion` AS `inspeccion`,`bdclick6`.`bdcertificadomedicoestudiante`.`temp` AS `temp`,`bdclick6`.`bdcertificadomedicoestudiante`.`peso` AS `peso`,`bdclick6`.`bdcertificadomedicoestudiante`.`estatura` AS `estatura`,`bdclick6`.`bdcertificadomedicoestudiante`.`fc` AS `fc`,`bdclick6`.`bdcertificadomedicoestudiante`.`fr` AS `fr`,`bdclick6`.`bdcertificadomedicoestudiante`.`pa` AS `pa`,`bdclick6`.`bdcertificadomedicoestudiante`.`cefalico` AS `cefalico`,`bdclick6`.`bdcertificadomedicoestudiante`.`abdominal` AS `abdominal`,`bdclick6`.`bdcertificadomedicoestudiante`.`imc` AS `imc`,`bdclick6`.`bdcertificadomedicoestudiante`.`cabeza` AS `cabeza`,`bdclick6`.`bdcertificadomedicoestudiante`.`ojos` AS `ojos`,`bdclick6`.`bdcertificadomedicoestudiante`.`agudezaVisual` AS `agudezaVisual`,`bdclick6`.`bdcertificadomedicoestudiante`.`oidos` AS `oidos`,`bdclick6`.`bdcertificadomedicoestudiante`.`nariz` AS `nariz`,`bdclick6`.`bdcertificadomedicoestudiante`.`boca` AS `boca`,`bdclick6`.`bdcertificadomedicoestudiante`.`cuello` AS `cuello`,`bdclick6`.`bdcertificadomedicoestudiante`.`cardioPulmonar` AS `cardioPulmonar`,`bdclick6`.`bdcertificadomedicoestudiante`.`torax` AS `torax`,`bdclick6`.`bdcertificadomedicoestudiante`.`abdomen` AS `abdomen`,`bdclick6`.`bdcertificadomedicoestudiante`.`genitoUrinario` AS `genitoUrinario`,`bdclick6`.`bdcertificadomedicoestudiante`.`ano` AS `ano`,`bdclick6`.`bdcertificadomedicoestudiante`.`extremidades` AS `extremidades`,`bdclick6`.`bdcertificadomedicoestudiante`.`neurologico` AS `neurologico`,`bdclick6`.`bdcertificadomedicoestudiante`.`pies` AS `pies`,`bdclick6`.`bdcertificadomedicoestudiante`.`osteoMuscular` AS `osteoMuscular`,`bdclick6`.`bdcertificadomedicoestudiante`.`diagPrincipal` AS `diagPrincipal`,`bdclick6`.`bdcertificadomedicoestudiante`.`diagRelacionado` AS `diagRelacionado`,`bdclick6`.`bdcertificadomedicoestudiante`.`diagRelacionado2` AS `diagRelacionado2`,`bdclick6`.`bdcertificadomedicoestudiante`.`diagRelacionado3` AS `diagRelacionado3`,`bdclick6`.`bdcertificadomedicoestudiante`.`tratamiento` AS `tratamiento`,`bdclick6`.`bdcertificadomedicoestudiante`.`recomendaciones` AS `recomendaciones`,`bdclick6`.`bdcertificadomedicoestudiante`.`cup` AS `cup`,`bdclick6`.`bdcertificadomedicoestudiante`.`usuario` AS `usuario`,`bdclick6`.`bdcertificadomedicoestudiante`.`fecha` AS `fecha`,`bdclick6`.`bdcertificadomedicoestudiante`.`patologicos` AS `patologicos`,`bdclick6`.`bdcertificadomedicoestudiante`.`quirurgicos` AS `quirurgicos`,`bdclick6`.`bdcertificadomedicoestudiante`.`alergicos` AS `alergicos`,`bdclick6`.`bdcertificadomedicoestudiante`.`traumaticos` AS `traumaticos`,`bdclick6`.`bdcertificadomedicoestudiante`.`ginecoobstetricos` AS `ginecoobstetricos`,`bdclick6`.`bdcertificadomedicoestudiante`.`familiares` AS `familiares`,`bdclick6`.`bdcertificadomedicoestudiante`.`social` AS `social` from ((`bdclick6`.`bdterceros` join `bdclick6`.`bdhistoriaclinica` on((`bdclick6`.`bdterceros`.`idSistema` = `bdclick6`.`bdhistoriaclinica`.`paciente`))) join `bdclick6`.`bdcertificadomedicoestudiante` on((`bdclick6`.`bdhistoriaclinica`.`id` = `bdclick6`.`bdcertificadomedicoestudiante`.`historia`)))
mariadb-version=100135
