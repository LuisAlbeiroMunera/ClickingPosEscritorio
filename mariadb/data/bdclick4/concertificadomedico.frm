TYPE=VIEW
query=select `bdclick4`.`bdcertificadomedico`.`Id` AS `Id`,`bdclick4`.`bdterceros`.`tipo` AS `tipo`,`bdclick4`.`bdterceros`.`idSistema` AS `idSistema`,`bdclick4`.`bdterceros`.`id` AS `IdTer`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,`bdclick4`.`bdterceros`.`telefono` AS `telefono`,`bdclick4`.`bdterceros`.`direccion` AS `direccion`,`bdclick4`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick4`.`bdterceros`.`nacimiento` AS `nacimiento`,`bdclick4`.`bdterceros`.`estado` AS `estado`,\'\' AS `hijos`,\'\' AS `escolaridad`,`bdclick4`.`bdcertificadomedico`.`historia` AS `historia`,`bdclick4`.`bdcertificadomedico`.`Responsable` AS `Responsable`,`bdclick4`.`bdcertificadomedico`.`nombre` AS `nombre1`,`bdclick4`.`bdcertificadomedico`.`parentesco` AS `parentesco`,`bdclick4`.`bdcertificadomedico`.`motivo` AS `motivo`,`bdclick4`.`bdcertificadomedico`.`enfermedad` AS `enfermedad`,`bdclick4`.`bdcertificadomedico`.`Revision` AS `Revision`,`bdclick4`.`bdcertificadomedico`.`inspeccion` AS `inspeccion`,`bdclick4`.`bdcertificadomedico`.`temp` AS `temp`,`bdclick4`.`bdcertificadomedico`.`peso` AS `peso`,`bdclick4`.`bdcertificadomedico`.`estatura` AS `estatura`,`bdclick4`.`bdcertificadomedico`.`fc` AS `fc`,`bdclick4`.`bdcertificadomedico`.`fr` AS `fr`,`bdclick4`.`bdcertificadomedico`.`pa` AS `pa`,`bdclick4`.`bdcertificadomedico`.`cefalico` AS `cefalico`,`bdclick4`.`bdcertificadomedico`.`abdominal` AS `abdominal`,`bdclick4`.`bdcertificadomedico`.`imc` AS `imc`,`bdclick4`.`bdcertificadomedico`.`cabeza` AS `cabeza`,`bdclick4`.`bdcertificadomedico`.`ojos` AS `ojos`,`bdclick4`.`bdcertificadomedico`.`agudezaVisual` AS `agudezaVisual`,`bdclick4`.`bdcertificadomedico`.`oidos` AS `oidos`,`bdclick4`.`bdcertificadomedico`.`nariz` AS `nariz`,`bdclick4`.`bdcertificadomedico`.`boca` AS `boca`,`bdclick4`.`bdcertificadomedico`.`cuello` AS `cuello`,`bdclick4`.`bdcertificadomedico`.`cardioPulmonar` AS `cardioPulmonar`,`bdclick4`.`bdcertificadomedico`.`torax` AS `torax`,`bdclick4`.`bdcertificadomedico`.`abdomen` AS `abdomen`,`bdclick4`.`bdcertificadomedico`.`genitoUrinario` AS `genitoUrinario`,`bdclick4`.`bdcertificadomedico`.`ano` AS `ano`,`bdclick4`.`bdcertificadomedico`.`extremidades` AS `extremidades`,`bdclick4`.`bdcertificadomedico`.`neurologico` AS `neurologico`,`bdclick4`.`bdcertificadomedico`.`pies` AS `pies`,`bdclick4`.`bdcertificadomedico`.`osteoMuscular` AS `osteoMuscular`,`bdclick4`.`bdcertificadomedico`.`diagPrincipal` AS `diagPrincipal`,`bdclick4`.`bdcertificadomedico`.`diagRelacionado` AS `diagRelacionado`,`bdclick4`.`bdcertificadomedico`.`diagRelacionado2` AS `diagRelacionado2`,`bdclick4`.`bdcertificadomedico`.`diagRelacionado3` AS `diagRelacionado3`,`bdclick4`.`bdcertificadomedico`.`tratamiento` AS `tratamiento`,`bdclick4`.`bdcertificadomedico`.`recomendaciones` AS `recomendaciones`,`bdclick4`.`bdcertificadomedico`.`cup` AS `cup`,`bdclick4`.`bdcertificadomedico`.`usuario` AS `usuario`,`bdclick4`.`bdcertificadomedico`.`fecha` AS `fecha`,`bdclick4`.`bdcertificadomedico`.`patologicos` AS `patologicos`,`bdclick4`.`bdcertificadomedico`.`quirurgicos` AS `quirurgicos`,`bdclick4`.`bdcertificadomedico`.`alergicos` AS `alergicos`,`bdclick4`.`bdcertificadomedico`.`traumaticos` AS `traumaticos`,`bdclick4`.`bdcertificadomedico`.`ginecoobstetricos` AS `ginecoobstetricos`,`bdclick4`.`bdcertificadomedico`.`familiares` AS `familiares`,`bdclick4`.`bdcertificadomedico`.`social` AS `social`,`bdclick4`.`bdcertificadomedico`.`muscular` AS `muscular` from ((`bdclick4`.`bdterceros` join `bdclick4`.`bdhistoriaclinica` on((`bdclick4`.`bdterceros`.`idSistema` = `bdclick4`.`bdhistoriaclinica`.`paciente`))) join `bdclick4`.`bdcertificadomedico` on((`bdclick4`.`bdhistoriaclinica`.`id` = `bdclick4`.`bdcertificadomedico`.`historia`)))
md5=8207bcb85440f1c0540bdb5310d68984
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:25
create-version=2
source=select `bdcertificadomedico`.`Id` AS `Id`,`bdterceros`.`tipo` AS `tipo`,`bdterceros`.`idSistema` AS `idSistema`,`bdterceros`.`id` AS `IdTer`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`ciudad` AS `ciudad`,`bdterceros`.`nacimiento` AS `nacimiento`,`bdterceros`.`estado` AS `estado`,\'\' AS `hijos`,\'\' AS `escolaridad`,`bdcertificadomedico`.`historia` AS `historia`,`bdcertificadomedico`.`Responsable` AS `Responsable`,`bdcertificadomedico`.`nombre` AS `nombre1`,`bdcertificadomedico`.`parentesco` AS `parentesco`,`bdcertificadomedico`.`motivo` AS `motivo`,`bdcertificadomedico`.`enfermedad` AS `enfermedad`,`bdcertificadomedico`.`Revision` AS `Revision`,`bdcertificadomedico`.`inspeccion` AS `inspeccion`,`bdcertificadomedico`.`temp` AS `temp`,`bdcertificadomedico`.`peso` AS `peso`,`bdcertificadomedico`.`estatura` AS `estatura`,`bdcertificadomedico`.`fc` AS `fc`,`bdcertificadomedico`.`fr` AS `fr`,`bdcertificadomedico`.`pa` AS `pa`,`bdcertificadomedico`.`cefalico` AS `cefalico`,`bdcertificadomedico`.`abdominal` AS `abdominal`,`bdcertificadomedico`.`imc` AS `imc`,`bdcertificadomedico`.`cabeza` AS `cabeza`,`bdcertificadomedico`.`ojos` AS `ojos`,`bdcertificadomedico`.`agudezaVisual` AS `agudezaVisual`,`bdcertificadomedico`.`oidos` AS `oidos`,`bdcertificadomedico`.`nariz` AS `nariz`,`bdcertificadomedico`.`boca` AS `boca`,`bdcertificadomedico`.`cuello` AS `cuello`,`bdcertificadomedico`.`cardioPulmonar` AS `cardioPulmonar`,`bdcertificadomedico`.`torax` AS `torax`,`bdcertificadomedico`.`abdomen` AS `abdomen`,`bdcertificadomedico`.`genitoUrinario` AS `genitoUrinario`,`bdcertificadomedico`.`ano` AS `ano`,`bdcertificadomedico`.`extremidades` AS `extremidades`,`bdcertificadomedico`.`neurologico` AS `neurologico`,`bdcertificadomedico`.`pies` AS `pies`,`bdcertificadomedico`.`osteoMuscular` AS `osteoMuscular`,`bdcertificadomedico`.`diagPrincipal` AS `diagPrincipal`,`bdcertificadomedico`.`diagRelacionado` AS `diagRelacionado`,`bdcertificadomedico`.`diagRelacionado2` AS `diagRelacionado2`,`bdcertificadomedico`.`diagRelacionado3` AS `diagRelacionado3`,`bdcertificadomedico`.`tratamiento` AS `tratamiento`,`bdcertificadomedico`.`recomendaciones` AS `recomendaciones`,`bdcertificadomedico`.`cup` AS `cup`,`bdcertificadomedico`.`usuario` AS `usuario`,`bdcertificadomedico`.`fecha` AS `fecha`,`bdcertificadomedico`.`patologicos` AS `patologicos`,`bdcertificadomedico`.`quirurgicos` AS `quirurgicos`,`bdcertificadomedico`.`alergicos` AS `alergicos`,`bdcertificadomedico`.`traumaticos` AS `traumaticos`,`bdcertificadomedico`.`ginecoobstetricos` AS `ginecoobstetricos`,`bdcertificadomedico`.`familiares` AS `familiares`,`bdcertificadomedico`.`social` AS `social`,`bdcertificadomedico`.`muscular` AS `muscular` from ((`bdterceros` join `bdhistoriaclinica` on((`bdterceros`.`idSistema` = `bdhistoriaclinica`.`paciente`))) join `bdcertificadomedico` on((`bdhistoriaclinica`.`id` = `bdcertificadomedico`.`historia`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdcertificadomedico`.`Id` AS `Id`,`bdclick4`.`bdterceros`.`tipo` AS `tipo`,`bdclick4`.`bdterceros`.`idSistema` AS `idSistema`,`bdclick4`.`bdterceros`.`id` AS `IdTer`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,`bdclick4`.`bdterceros`.`telefono` AS `telefono`,`bdclick4`.`bdterceros`.`direccion` AS `direccion`,`bdclick4`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick4`.`bdterceros`.`nacimiento` AS `nacimiento`,`bdclick4`.`bdterceros`.`estado` AS `estado`,\'\' AS `hijos`,\'\' AS `escolaridad`,`bdclick4`.`bdcertificadomedico`.`historia` AS `historia`,`bdclick4`.`bdcertificadomedico`.`Responsable` AS `Responsable`,`bdclick4`.`bdcertificadomedico`.`nombre` AS `nombre1`,`bdclick4`.`bdcertificadomedico`.`parentesco` AS `parentesco`,`bdclick4`.`bdcertificadomedico`.`motivo` AS `motivo`,`bdclick4`.`bdcertificadomedico`.`enfermedad` AS `enfermedad`,`bdclick4`.`bdcertificadomedico`.`Revision` AS `Revision`,`bdclick4`.`bdcertificadomedico`.`inspeccion` AS `inspeccion`,`bdclick4`.`bdcertificadomedico`.`temp` AS `temp`,`bdclick4`.`bdcertificadomedico`.`peso` AS `peso`,`bdclick4`.`bdcertificadomedico`.`estatura` AS `estatura`,`bdclick4`.`bdcertificadomedico`.`fc` AS `fc`,`bdclick4`.`bdcertificadomedico`.`fr` AS `fr`,`bdclick4`.`bdcertificadomedico`.`pa` AS `pa`,`bdclick4`.`bdcertificadomedico`.`cefalico` AS `cefalico`,`bdclick4`.`bdcertificadomedico`.`abdominal` AS `abdominal`,`bdclick4`.`bdcertificadomedico`.`imc` AS `imc`,`bdclick4`.`bdcertificadomedico`.`cabeza` AS `cabeza`,`bdclick4`.`bdcertificadomedico`.`ojos` AS `ojos`,`bdclick4`.`bdcertificadomedico`.`agudezaVisual` AS `agudezaVisual`,`bdclick4`.`bdcertificadomedico`.`oidos` AS `oidos`,`bdclick4`.`bdcertificadomedico`.`nariz` AS `nariz`,`bdclick4`.`bdcertificadomedico`.`boca` AS `boca`,`bdclick4`.`bdcertificadomedico`.`cuello` AS `cuello`,`bdclick4`.`bdcertificadomedico`.`cardioPulmonar` AS `cardioPulmonar`,`bdclick4`.`bdcertificadomedico`.`torax` AS `torax`,`bdclick4`.`bdcertificadomedico`.`abdomen` AS `abdomen`,`bdclick4`.`bdcertificadomedico`.`genitoUrinario` AS `genitoUrinario`,`bdclick4`.`bdcertificadomedico`.`ano` AS `ano`,`bdclick4`.`bdcertificadomedico`.`extremidades` AS `extremidades`,`bdclick4`.`bdcertificadomedico`.`neurologico` AS `neurologico`,`bdclick4`.`bdcertificadomedico`.`pies` AS `pies`,`bdclick4`.`bdcertificadomedico`.`osteoMuscular` AS `osteoMuscular`,`bdclick4`.`bdcertificadomedico`.`diagPrincipal` AS `diagPrincipal`,`bdclick4`.`bdcertificadomedico`.`diagRelacionado` AS `diagRelacionado`,`bdclick4`.`bdcertificadomedico`.`diagRelacionado2` AS `diagRelacionado2`,`bdclick4`.`bdcertificadomedico`.`diagRelacionado3` AS `diagRelacionado3`,`bdclick4`.`bdcertificadomedico`.`tratamiento` AS `tratamiento`,`bdclick4`.`bdcertificadomedico`.`recomendaciones` AS `recomendaciones`,`bdclick4`.`bdcertificadomedico`.`cup` AS `cup`,`bdclick4`.`bdcertificadomedico`.`usuario` AS `usuario`,`bdclick4`.`bdcertificadomedico`.`fecha` AS `fecha`,`bdclick4`.`bdcertificadomedico`.`patologicos` AS `patologicos`,`bdclick4`.`bdcertificadomedico`.`quirurgicos` AS `quirurgicos`,`bdclick4`.`bdcertificadomedico`.`alergicos` AS `alergicos`,`bdclick4`.`bdcertificadomedico`.`traumaticos` AS `traumaticos`,`bdclick4`.`bdcertificadomedico`.`ginecoobstetricos` AS `ginecoobstetricos`,`bdclick4`.`bdcertificadomedico`.`familiares` AS `familiares`,`bdclick4`.`bdcertificadomedico`.`social` AS `social`,`bdclick4`.`bdcertificadomedico`.`muscular` AS `muscular` from ((`bdclick4`.`bdterceros` join `bdclick4`.`bdhistoriaclinica` on((`bdclick4`.`bdterceros`.`idSistema` = `bdclick4`.`bdhistoriaclinica`.`paciente`))) join `bdclick4`.`bdcertificadomedico` on((`bdclick4`.`bdhistoriaclinica`.`id` = `bdclick4`.`bdcertificadomedico`.`historia`)))
mariadb-version=100135
