TYPE=VIEW
query=select `bdclick5`.`bdcertificadomedicooys`.`Id` AS `Id`,`bdclick5`.`bdterceros`.`tipo` AS `tipo`,`bdclick5`.`bdterceros`.`idSistema` AS `idSistema`,`bdclick5`.`bdterceros`.`id` AS `IdTer`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdterceros`.`telefono` AS `telefono`,`bdclick5`.`bdterceros`.`direccion` AS `direccion`,`bdclick5`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick5`.`bdterceros`.`nacimiento` AS `nacimiento`,`bdclick5`.`bdterceros`.`estado` AS `estado`,\'\' AS `hijos`,\'\' AS `escolaridad`,`bdclick5`.`bdcertificadomedicooys`.`historia` AS `historia`,`bdclick5`.`bdcertificadomedicooys`.`Responsable` AS `Responsable`,`bdclick5`.`bdcertificadomedicooys`.`nombre` AS `nombre1`,`bdclick5`.`bdcertificadomedicooys`.`parentesco` AS `parentesco`,`bdclick5`.`bdcertificadomedicooys`.`motivo` AS `motivo`,`bdclick5`.`bdcertificadomedicooys`.`enfermedad` AS `enfermedad`,`bdclick5`.`bdcertificadomedicooys`.`Revision` AS `Revision`,`bdclick5`.`bdcertificadomedicooys`.`inspeccion` AS `inspeccion`,`bdclick5`.`bdcertificadomedicooys`.`temp` AS `temp`,`bdclick5`.`bdcertificadomedicooys`.`peso` AS `peso`,`bdclick5`.`bdcertificadomedicooys`.`estatura` AS `estatura`,`bdclick5`.`bdcertificadomedicooys`.`fc` AS `fc`,`bdclick5`.`bdcertificadomedicooys`.`fr` AS `fr`,`bdclick5`.`bdcertificadomedicooys`.`pa` AS `pa`,`bdclick5`.`bdcertificadomedicooys`.`cefalico` AS `cefalico`,`bdclick5`.`bdcertificadomedicooys`.`abdominal` AS `abdominal`,`bdclick5`.`bdcertificadomedicooys`.`imc` AS `imc`,`bdclick5`.`bdcertificadomedicooys`.`cabeza` AS `cabeza`,`bdclick5`.`bdcertificadomedicooys`.`ojos` AS `ojos`,`bdclick5`.`bdcertificadomedicooys`.`agudezaVisual` AS `agudezaVisual`,`bdclick5`.`bdcertificadomedicooys`.`oidos` AS `oidos`,`bdclick5`.`bdcertificadomedicooys`.`nariz` AS `nariz`,`bdclick5`.`bdcertificadomedicooys`.`boca` AS `boca`,`bdclick5`.`bdcertificadomedicooys`.`cuello` AS `cuello`,`bdclick5`.`bdcertificadomedicooys`.`cardioPulmonar` AS `cardioPulmonar`,`bdclick5`.`bdcertificadomedicooys`.`torax` AS `torax`,`bdclick5`.`bdcertificadomedicooys`.`abdomen` AS `abdomen`,`bdclick5`.`bdcertificadomedicooys`.`genitoUrinario` AS `genitoUrinario`,`bdclick5`.`bdcertificadomedicooys`.`ano` AS `ano`,`bdclick5`.`bdcertificadomedicooys`.`extremidades` AS `extremidades`,`bdclick5`.`bdcertificadomedicooys`.`neurologico` AS `neurologico`,`bdclick5`.`bdcertificadomedicooys`.`pies` AS `pies`,`bdclick5`.`bdcertificadomedicooys`.`osteoMuscular` AS `osteoMuscular`,`bdclick5`.`bdcertificadomedicooys`.`diagPrincipal` AS `diagPrincipal`,`bdclick5`.`bdcertificadomedicooys`.`diagRelacionado` AS `diagRelacionado`,`bdclick5`.`bdcertificadomedicooys`.`diagRelacionado2` AS `diagRelacionado2`,`bdclick5`.`bdcertificadomedicooys`.`diagRelacionado3` AS `diagRelacionado3`,`bdclick5`.`bdcertificadomedicooys`.`tratamiento` AS `tratamiento`,`bdclick5`.`bdcertificadomedicooys`.`recomendaciones` AS `recomendaciones`,`bdclick5`.`bdcertificadomedicooys`.`cup` AS `cup`,`bdclick5`.`bdcertificadomedicooys`.`usuario` AS `usuario`,`bdclick5`.`bdcertificadomedicooys`.`fecha` AS `fecha`,`bdclick5`.`bdcertificadomedicooys`.`patologicos` AS `patologicos`,`bdclick5`.`bdcertificadomedicooys`.`quirurgicos` AS `quirurgicos`,`bdclick5`.`bdcertificadomedicooys`.`alergicos` AS `alergicos`,`bdclick5`.`bdcertificadomedicooys`.`traumaticos` AS `traumaticos`,`bdclick5`.`bdcertificadomedicooys`.`ginecoobstetricos` AS `ginecoobstetricos`,`bdclick5`.`bdcertificadomedicooys`.`familiares` AS `familiares`,`bdclick5`.`bdcertificadomedicooys`.`social` AS `social` from ((`bdclick5`.`bdterceros` join `bdclick5`.`bdhistoriaclinica` on((`bdclick5`.`bdterceros`.`idSistema` = `bdclick5`.`bdhistoriaclinica`.`paciente`))) join `bdclick5`.`bdcertificadomedicooys` on((`bdclick5`.`bdhistoriaclinica`.`id` = `bdclick5`.`bdcertificadomedicooys`.`historia`)))
md5=9e2a310dcbc2050522ab3eeb6085f371
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:44
create-version=2
source=select `bdcertificadomedicooys`.`Id` AS `Id`,`bdterceros`.`tipo` AS `tipo`,`bdterceros`.`idSistema` AS `idSistema`,`bdterceros`.`id` AS `IdTer`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`ciudad` AS `ciudad`,`bdterceros`.`nacimiento` AS `nacimiento`,`bdterceros`.`estado` AS `estado`,\'\' AS `hijos`,\'\' AS `escolaridad`,`bdcertificadomedicooys`.`historia` AS `historia`,`bdcertificadomedicooys`.`Responsable` AS `Responsable`,`bdcertificadomedicooys`.`nombre` AS `nombre1`,`bdcertificadomedicooys`.`parentesco` AS `parentesco`,`bdcertificadomedicooys`.`motivo` AS `motivo`,`bdcertificadomedicooys`.`enfermedad` AS `enfermedad`,`bdcertificadomedicooys`.`Revision` AS `Revision`,`bdcertificadomedicooys`.`inspeccion` AS `inspeccion`,`bdcertificadomedicooys`.`temp` AS `temp`,`bdcertificadomedicooys`.`peso` AS `peso`,`bdcertificadomedicooys`.`estatura` AS `estatura`,`bdcertificadomedicooys`.`fc` AS `fc`,`bdcertificadomedicooys`.`fr` AS `fr`,`bdcertificadomedicooys`.`pa` AS `pa`,`bdcertificadomedicooys`.`cefalico` AS `cefalico`,`bdcertificadomedicooys`.`abdominal` AS `abdominal`,`bdcertificadomedicooys`.`imc` AS `imc`,`bdcertificadomedicooys`.`cabeza` AS `cabeza`,`bdcertificadomedicooys`.`ojos` AS `ojos`,`bdcertificadomedicooys`.`agudezaVisual` AS `agudezaVisual`,`bdcertificadomedicooys`.`oidos` AS `oidos`,`bdcertificadomedicooys`.`nariz` AS `nariz`,`bdcertificadomedicooys`.`boca` AS `boca`,`bdcertificadomedicooys`.`cuello` AS `cuello`,`bdcertificadomedicooys`.`cardioPulmonar` AS `cardioPulmonar`,`bdcertificadomedicooys`.`torax` AS `torax`,`bdcertificadomedicooys`.`abdomen` AS `abdomen`,`bdcertificadomedicooys`.`genitoUrinario` AS `genitoUrinario`,`bdcertificadomedicooys`.`ano` AS `ano`,`bdcertificadomedicooys`.`extremidades` AS `extremidades`,`bdcertificadomedicooys`.`neurologico` AS `neurologico`,`bdcertificadomedicooys`.`pies` AS `pies`,`bdcertificadomedicooys`.`osteoMuscular` AS `osteoMuscular`,`bdcertificadomedicooys`.`diagPrincipal` AS `diagPrincipal`,`bdcertificadomedicooys`.`diagRelacionado` AS `diagRelacionado`,`bdcertificadomedicooys`.`diagRelacionado2` AS `diagRelacionado2`,`bdcertificadomedicooys`.`diagRelacionado3` AS `diagRelacionado3`,`bdcertificadomedicooys`.`tratamiento` AS `tratamiento`,`bdcertificadomedicooys`.`recomendaciones` AS `recomendaciones`,`bdcertificadomedicooys`.`cup` AS `cup`,`bdcertificadomedicooys`.`usuario` AS `usuario`,`bdcertificadomedicooys`.`fecha` AS `fecha`,`bdcertificadomedicooys`.`patologicos` AS `patologicos`,`bdcertificadomedicooys`.`quirurgicos` AS `quirurgicos`,`bdcertificadomedicooys`.`alergicos` AS `alergicos`,`bdcertificadomedicooys`.`traumaticos` AS `traumaticos`,`bdcertificadomedicooys`.`ginecoobstetricos` AS `ginecoobstetricos`,`bdcertificadomedicooys`.`familiares` AS `familiares`,`bdcertificadomedicooys`.`social` AS `social` from ((`bdterceros` join `bdhistoriaclinica` on((`bdterceros`.`idSistema` = `bdhistoriaclinica`.`paciente`))) join `bdcertificadomedicooys` on((`bdhistoriaclinica`.`id` = `bdcertificadomedicooys`.`historia`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdcertificadomedicooys`.`Id` AS `Id`,`bdclick5`.`bdterceros`.`tipo` AS `tipo`,`bdclick5`.`bdterceros`.`idSistema` AS `idSistema`,`bdclick5`.`bdterceros`.`id` AS `IdTer`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdterceros`.`telefono` AS `telefono`,`bdclick5`.`bdterceros`.`direccion` AS `direccion`,`bdclick5`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick5`.`bdterceros`.`nacimiento` AS `nacimiento`,`bdclick5`.`bdterceros`.`estado` AS `estado`,\'\' AS `hijos`,\'\' AS `escolaridad`,`bdclick5`.`bdcertificadomedicooys`.`historia` AS `historia`,`bdclick5`.`bdcertificadomedicooys`.`Responsable` AS `Responsable`,`bdclick5`.`bdcertificadomedicooys`.`nombre` AS `nombre1`,`bdclick5`.`bdcertificadomedicooys`.`parentesco` AS `parentesco`,`bdclick5`.`bdcertificadomedicooys`.`motivo` AS `motivo`,`bdclick5`.`bdcertificadomedicooys`.`enfermedad` AS `enfermedad`,`bdclick5`.`bdcertificadomedicooys`.`Revision` AS `Revision`,`bdclick5`.`bdcertificadomedicooys`.`inspeccion` AS `inspeccion`,`bdclick5`.`bdcertificadomedicooys`.`temp` AS `temp`,`bdclick5`.`bdcertificadomedicooys`.`peso` AS `peso`,`bdclick5`.`bdcertificadomedicooys`.`estatura` AS `estatura`,`bdclick5`.`bdcertificadomedicooys`.`fc` AS `fc`,`bdclick5`.`bdcertificadomedicooys`.`fr` AS `fr`,`bdclick5`.`bdcertificadomedicooys`.`pa` AS `pa`,`bdclick5`.`bdcertificadomedicooys`.`cefalico` AS `cefalico`,`bdclick5`.`bdcertificadomedicooys`.`abdominal` AS `abdominal`,`bdclick5`.`bdcertificadomedicooys`.`imc` AS `imc`,`bdclick5`.`bdcertificadomedicooys`.`cabeza` AS `cabeza`,`bdclick5`.`bdcertificadomedicooys`.`ojos` AS `ojos`,`bdclick5`.`bdcertificadomedicooys`.`agudezaVisual` AS `agudezaVisual`,`bdclick5`.`bdcertificadomedicooys`.`oidos` AS `oidos`,`bdclick5`.`bdcertificadomedicooys`.`nariz` AS `nariz`,`bdclick5`.`bdcertificadomedicooys`.`boca` AS `boca`,`bdclick5`.`bdcertificadomedicooys`.`cuello` AS `cuello`,`bdclick5`.`bdcertificadomedicooys`.`cardioPulmonar` AS `cardioPulmonar`,`bdclick5`.`bdcertificadomedicooys`.`torax` AS `torax`,`bdclick5`.`bdcertificadomedicooys`.`abdomen` AS `abdomen`,`bdclick5`.`bdcertificadomedicooys`.`genitoUrinario` AS `genitoUrinario`,`bdclick5`.`bdcertificadomedicooys`.`ano` AS `ano`,`bdclick5`.`bdcertificadomedicooys`.`extremidades` AS `extremidades`,`bdclick5`.`bdcertificadomedicooys`.`neurologico` AS `neurologico`,`bdclick5`.`bdcertificadomedicooys`.`pies` AS `pies`,`bdclick5`.`bdcertificadomedicooys`.`osteoMuscular` AS `osteoMuscular`,`bdclick5`.`bdcertificadomedicooys`.`diagPrincipal` AS `diagPrincipal`,`bdclick5`.`bdcertificadomedicooys`.`diagRelacionado` AS `diagRelacionado`,`bdclick5`.`bdcertificadomedicooys`.`diagRelacionado2` AS `diagRelacionado2`,`bdclick5`.`bdcertificadomedicooys`.`diagRelacionado3` AS `diagRelacionado3`,`bdclick5`.`bdcertificadomedicooys`.`tratamiento` AS `tratamiento`,`bdclick5`.`bdcertificadomedicooys`.`recomendaciones` AS `recomendaciones`,`bdclick5`.`bdcertificadomedicooys`.`cup` AS `cup`,`bdclick5`.`bdcertificadomedicooys`.`usuario` AS `usuario`,`bdclick5`.`bdcertificadomedicooys`.`fecha` AS `fecha`,`bdclick5`.`bdcertificadomedicooys`.`patologicos` AS `patologicos`,`bdclick5`.`bdcertificadomedicooys`.`quirurgicos` AS `quirurgicos`,`bdclick5`.`bdcertificadomedicooys`.`alergicos` AS `alergicos`,`bdclick5`.`bdcertificadomedicooys`.`traumaticos` AS `traumaticos`,`bdclick5`.`bdcertificadomedicooys`.`ginecoobstetricos` AS `ginecoobstetricos`,`bdclick5`.`bdcertificadomedicooys`.`familiares` AS `familiares`,`bdclick5`.`bdcertificadomedicooys`.`social` AS `social` from ((`bdclick5`.`bdterceros` join `bdclick5`.`bdhistoriaclinica` on((`bdclick5`.`bdterceros`.`idSistema` = `bdclick5`.`bdhistoriaclinica`.`paciente`))) join `bdclick5`.`bdcertificadomedicooys` on((`bdclick5`.`bdhistoriaclinica`.`id` = `bdclick5`.`bdcertificadomedicooys`.`historia`)))
mariadb-version=100135
