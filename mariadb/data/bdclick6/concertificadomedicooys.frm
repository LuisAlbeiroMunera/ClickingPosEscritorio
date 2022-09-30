TYPE=VIEW
query=select `bdclick6`.`bdcertificadomedicooys`.`Id` AS `Id`,`bdclick6`.`bdterceros`.`tipo` AS `tipo`,`bdclick6`.`bdterceros`.`idSistema` AS `idSistema`,`bdclick6`.`bdterceros`.`id` AS `IdTer`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,`bdclick6`.`bdterceros`.`direccion` AS `direccion`,`bdclick6`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick6`.`bdterceros`.`nacimiento` AS `nacimiento`,`bdclick6`.`bdterceros`.`estado` AS `estado`,\'\' AS `hijos`,\'\' AS `escolaridad`,`bdclick6`.`bdcertificadomedicooys`.`historia` AS `historia`,`bdclick6`.`bdcertificadomedicooys`.`Responsable` AS `Responsable`,`bdclick6`.`bdcertificadomedicooys`.`nombre` AS `nombre1`,`bdclick6`.`bdcertificadomedicooys`.`parentesco` AS `parentesco`,`bdclick6`.`bdcertificadomedicooys`.`motivo` AS `motivo`,`bdclick6`.`bdcertificadomedicooys`.`enfermedad` AS `enfermedad`,`bdclick6`.`bdcertificadomedicooys`.`Revision` AS `Revision`,`bdclick6`.`bdcertificadomedicooys`.`inspeccion` AS `inspeccion`,`bdclick6`.`bdcertificadomedicooys`.`temp` AS `temp`,`bdclick6`.`bdcertificadomedicooys`.`peso` AS `peso`,`bdclick6`.`bdcertificadomedicooys`.`estatura` AS `estatura`,`bdclick6`.`bdcertificadomedicooys`.`fc` AS `fc`,`bdclick6`.`bdcertificadomedicooys`.`fr` AS `fr`,`bdclick6`.`bdcertificadomedicooys`.`pa` AS `pa`,`bdclick6`.`bdcertificadomedicooys`.`cefalico` AS `cefalico`,`bdclick6`.`bdcertificadomedicooys`.`abdominal` AS `abdominal`,`bdclick6`.`bdcertificadomedicooys`.`imc` AS `imc`,`bdclick6`.`bdcertificadomedicooys`.`cabeza` AS `cabeza`,`bdclick6`.`bdcertificadomedicooys`.`ojos` AS `ojos`,`bdclick6`.`bdcertificadomedicooys`.`agudezaVisual` AS `agudezaVisual`,`bdclick6`.`bdcertificadomedicooys`.`oidos` AS `oidos`,`bdclick6`.`bdcertificadomedicooys`.`nariz` AS `nariz`,`bdclick6`.`bdcertificadomedicooys`.`boca` AS `boca`,`bdclick6`.`bdcertificadomedicooys`.`cuello` AS `cuello`,`bdclick6`.`bdcertificadomedicooys`.`cardioPulmonar` AS `cardioPulmonar`,`bdclick6`.`bdcertificadomedicooys`.`torax` AS `torax`,`bdclick6`.`bdcertificadomedicooys`.`abdomen` AS `abdomen`,`bdclick6`.`bdcertificadomedicooys`.`genitoUrinario` AS `genitoUrinario`,`bdclick6`.`bdcertificadomedicooys`.`ano` AS `ano`,`bdclick6`.`bdcertificadomedicooys`.`extremidades` AS `extremidades`,`bdclick6`.`bdcertificadomedicooys`.`neurologico` AS `neurologico`,`bdclick6`.`bdcertificadomedicooys`.`pies` AS `pies`,`bdclick6`.`bdcertificadomedicooys`.`osteoMuscular` AS `osteoMuscular`,`bdclick6`.`bdcertificadomedicooys`.`diagPrincipal` AS `diagPrincipal`,`bdclick6`.`bdcertificadomedicooys`.`diagRelacionado` AS `diagRelacionado`,`bdclick6`.`bdcertificadomedicooys`.`diagRelacionado2` AS `diagRelacionado2`,`bdclick6`.`bdcertificadomedicooys`.`diagRelacionado3` AS `diagRelacionado3`,`bdclick6`.`bdcertificadomedicooys`.`tratamiento` AS `tratamiento`,`bdclick6`.`bdcertificadomedicooys`.`recomendaciones` AS `recomendaciones`,`bdclick6`.`bdcertificadomedicooys`.`cup` AS `cup`,`bdclick6`.`bdcertificadomedicooys`.`usuario` AS `usuario`,`bdclick6`.`bdcertificadomedicooys`.`fecha` AS `fecha`,`bdclick6`.`bdcertificadomedicooys`.`patologicos` AS `patologicos`,`bdclick6`.`bdcertificadomedicooys`.`quirurgicos` AS `quirurgicos`,`bdclick6`.`bdcertificadomedicooys`.`alergicos` AS `alergicos`,`bdclick6`.`bdcertificadomedicooys`.`traumaticos` AS `traumaticos`,`bdclick6`.`bdcertificadomedicooys`.`ginecoobstetricos` AS `ginecoobstetricos`,`bdclick6`.`bdcertificadomedicooys`.`familiares` AS `familiares`,`bdclick6`.`bdcertificadomedicooys`.`social` AS `social` from ((`bdclick6`.`bdterceros` join `bdclick6`.`bdhistoriaclinica` on((`bdclick6`.`bdterceros`.`idSistema` = `bdclick6`.`bdhistoriaclinica`.`paciente`))) join `bdclick6`.`bdcertificadomedicooys` on((`bdclick6`.`bdhistoriaclinica`.`id` = `bdclick6`.`bdcertificadomedicooys`.`historia`)))
md5=2ada6fe79af0a2982786227f3831ba46
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:33
create-version=2
source=select `bdcertificadomedicooys`.`Id` AS `Id`,`bdterceros`.`tipo` AS `tipo`,`bdterceros`.`idSistema` AS `idSistema`,`bdterceros`.`id` AS `IdTer`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`ciudad` AS `ciudad`,`bdterceros`.`nacimiento` AS `nacimiento`,`bdterceros`.`estado` AS `estado`,\'\' AS `hijos`,\'\' AS `escolaridad`,`bdcertificadomedicooys`.`historia` AS `historia`,`bdcertificadomedicooys`.`Responsable` AS `Responsable`,`bdcertificadomedicooys`.`nombre` AS `nombre1`,`bdcertificadomedicooys`.`parentesco` AS `parentesco`,`bdcertificadomedicooys`.`motivo` AS `motivo`,`bdcertificadomedicooys`.`enfermedad` AS `enfermedad`,`bdcertificadomedicooys`.`Revision` AS `Revision`,`bdcertificadomedicooys`.`inspeccion` AS `inspeccion`,`bdcertificadomedicooys`.`temp` AS `temp`,`bdcertificadomedicooys`.`peso` AS `peso`,`bdcertificadomedicooys`.`estatura` AS `estatura`,`bdcertificadomedicooys`.`fc` AS `fc`,`bdcertificadomedicooys`.`fr` AS `fr`,`bdcertificadomedicooys`.`pa` AS `pa`,`bdcertificadomedicooys`.`cefalico` AS `cefalico`,`bdcertificadomedicooys`.`abdominal` AS `abdominal`,`bdcertificadomedicooys`.`imc` AS `imc`,`bdcertificadomedicooys`.`cabeza` AS `cabeza`,`bdcertificadomedicooys`.`ojos` AS `ojos`,`bdcertificadomedicooys`.`agudezaVisual` AS `agudezaVisual`,`bdcertificadomedicooys`.`oidos` AS `oidos`,`bdcertificadomedicooys`.`nariz` AS `nariz`,`bdcertificadomedicooys`.`boca` AS `boca`,`bdcertificadomedicooys`.`cuello` AS `cuello`,`bdcertificadomedicooys`.`cardioPulmonar` AS `cardioPulmonar`,`bdcertificadomedicooys`.`torax` AS `torax`,`bdcertificadomedicooys`.`abdomen` AS `abdomen`,`bdcertificadomedicooys`.`genitoUrinario` AS `genitoUrinario`,`bdcertificadomedicooys`.`ano` AS `ano`,`bdcertificadomedicooys`.`extremidades` AS `extremidades`,`bdcertificadomedicooys`.`neurologico` AS `neurologico`,`bdcertificadomedicooys`.`pies` AS `pies`,`bdcertificadomedicooys`.`osteoMuscular` AS `osteoMuscular`,`bdcertificadomedicooys`.`diagPrincipal` AS `diagPrincipal`,`bdcertificadomedicooys`.`diagRelacionado` AS `diagRelacionado`,`bdcertificadomedicooys`.`diagRelacionado2` AS `diagRelacionado2`,`bdcertificadomedicooys`.`diagRelacionado3` AS `diagRelacionado3`,`bdcertificadomedicooys`.`tratamiento` AS `tratamiento`,`bdcertificadomedicooys`.`recomendaciones` AS `recomendaciones`,`bdcertificadomedicooys`.`cup` AS `cup`,`bdcertificadomedicooys`.`usuario` AS `usuario`,`bdcertificadomedicooys`.`fecha` AS `fecha`,`bdcertificadomedicooys`.`patologicos` AS `patologicos`,`bdcertificadomedicooys`.`quirurgicos` AS `quirurgicos`,`bdcertificadomedicooys`.`alergicos` AS `alergicos`,`bdcertificadomedicooys`.`traumaticos` AS `traumaticos`,`bdcertificadomedicooys`.`ginecoobstetricos` AS `ginecoobstetricos`,`bdcertificadomedicooys`.`familiares` AS `familiares`,`bdcertificadomedicooys`.`social` AS `social` from ((`bdterceros` join `bdhistoriaclinica` on((`bdterceros`.`idSistema` = `bdhistoriaclinica`.`paciente`))) join `bdcertificadomedicooys` on((`bdhistoriaclinica`.`id` = `bdcertificadomedicooys`.`historia`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdcertificadomedicooys`.`Id` AS `Id`,`bdclick6`.`bdterceros`.`tipo` AS `tipo`,`bdclick6`.`bdterceros`.`idSistema` AS `idSistema`,`bdclick6`.`bdterceros`.`id` AS `IdTer`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,`bdclick6`.`bdterceros`.`direccion` AS `direccion`,`bdclick6`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick6`.`bdterceros`.`nacimiento` AS `nacimiento`,`bdclick6`.`bdterceros`.`estado` AS `estado`,\'\' AS `hijos`,\'\' AS `escolaridad`,`bdclick6`.`bdcertificadomedicooys`.`historia` AS `historia`,`bdclick6`.`bdcertificadomedicooys`.`Responsable` AS `Responsable`,`bdclick6`.`bdcertificadomedicooys`.`nombre` AS `nombre1`,`bdclick6`.`bdcertificadomedicooys`.`parentesco` AS `parentesco`,`bdclick6`.`bdcertificadomedicooys`.`motivo` AS `motivo`,`bdclick6`.`bdcertificadomedicooys`.`enfermedad` AS `enfermedad`,`bdclick6`.`bdcertificadomedicooys`.`Revision` AS `Revision`,`bdclick6`.`bdcertificadomedicooys`.`inspeccion` AS `inspeccion`,`bdclick6`.`bdcertificadomedicooys`.`temp` AS `temp`,`bdclick6`.`bdcertificadomedicooys`.`peso` AS `peso`,`bdclick6`.`bdcertificadomedicooys`.`estatura` AS `estatura`,`bdclick6`.`bdcertificadomedicooys`.`fc` AS `fc`,`bdclick6`.`bdcertificadomedicooys`.`fr` AS `fr`,`bdclick6`.`bdcertificadomedicooys`.`pa` AS `pa`,`bdclick6`.`bdcertificadomedicooys`.`cefalico` AS `cefalico`,`bdclick6`.`bdcertificadomedicooys`.`abdominal` AS `abdominal`,`bdclick6`.`bdcertificadomedicooys`.`imc` AS `imc`,`bdclick6`.`bdcertificadomedicooys`.`cabeza` AS `cabeza`,`bdclick6`.`bdcertificadomedicooys`.`ojos` AS `ojos`,`bdclick6`.`bdcertificadomedicooys`.`agudezaVisual` AS `agudezaVisual`,`bdclick6`.`bdcertificadomedicooys`.`oidos` AS `oidos`,`bdclick6`.`bdcertificadomedicooys`.`nariz` AS `nariz`,`bdclick6`.`bdcertificadomedicooys`.`boca` AS `boca`,`bdclick6`.`bdcertificadomedicooys`.`cuello` AS `cuello`,`bdclick6`.`bdcertificadomedicooys`.`cardioPulmonar` AS `cardioPulmonar`,`bdclick6`.`bdcertificadomedicooys`.`torax` AS `torax`,`bdclick6`.`bdcertificadomedicooys`.`abdomen` AS `abdomen`,`bdclick6`.`bdcertificadomedicooys`.`genitoUrinario` AS `genitoUrinario`,`bdclick6`.`bdcertificadomedicooys`.`ano` AS `ano`,`bdclick6`.`bdcertificadomedicooys`.`extremidades` AS `extremidades`,`bdclick6`.`bdcertificadomedicooys`.`neurologico` AS `neurologico`,`bdclick6`.`bdcertificadomedicooys`.`pies` AS `pies`,`bdclick6`.`bdcertificadomedicooys`.`osteoMuscular` AS `osteoMuscular`,`bdclick6`.`bdcertificadomedicooys`.`diagPrincipal` AS `diagPrincipal`,`bdclick6`.`bdcertificadomedicooys`.`diagRelacionado` AS `diagRelacionado`,`bdclick6`.`bdcertificadomedicooys`.`diagRelacionado2` AS `diagRelacionado2`,`bdclick6`.`bdcertificadomedicooys`.`diagRelacionado3` AS `diagRelacionado3`,`bdclick6`.`bdcertificadomedicooys`.`tratamiento` AS `tratamiento`,`bdclick6`.`bdcertificadomedicooys`.`recomendaciones` AS `recomendaciones`,`bdclick6`.`bdcertificadomedicooys`.`cup` AS `cup`,`bdclick6`.`bdcertificadomedicooys`.`usuario` AS `usuario`,`bdclick6`.`bdcertificadomedicooys`.`fecha` AS `fecha`,`bdclick6`.`bdcertificadomedicooys`.`patologicos` AS `patologicos`,`bdclick6`.`bdcertificadomedicooys`.`quirurgicos` AS `quirurgicos`,`bdclick6`.`bdcertificadomedicooys`.`alergicos` AS `alergicos`,`bdclick6`.`bdcertificadomedicooys`.`traumaticos` AS `traumaticos`,`bdclick6`.`bdcertificadomedicooys`.`ginecoobstetricos` AS `ginecoobstetricos`,`bdclick6`.`bdcertificadomedicooys`.`familiares` AS `familiares`,`bdclick6`.`bdcertificadomedicooys`.`social` AS `social` from ((`bdclick6`.`bdterceros` join `bdclick6`.`bdhistoriaclinica` on((`bdclick6`.`bdterceros`.`idSistema` = `bdclick6`.`bdhistoriaclinica`.`paciente`))) join `bdclick6`.`bdcertificadomedicooys` on((`bdclick6`.`bdhistoriaclinica`.`id` = `bdclick6`.`bdcertificadomedicooys`.`historia`)))
mariadb-version=100135
