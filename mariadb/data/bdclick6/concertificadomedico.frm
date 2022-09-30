TYPE=VIEW
query=select `bdclick6`.`bdcertificadomedico`.`Id` AS `Id`,`bdclick6`.`bdterceros`.`tipo` AS `tipo`,`bdclick6`.`bdterceros`.`idSistema` AS `idSistema`,`bdclick6`.`bdterceros`.`id` AS `IdTer`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,`bdclick6`.`bdterceros`.`direccion` AS `direccion`,`bdclick6`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick6`.`bdterceros`.`nacimiento` AS `nacimiento`,`bdclick6`.`bdterceros`.`estado` AS `estado`,\'\' AS `hijos`,\'\' AS `escolaridad`,`bdclick6`.`bdcertificadomedico`.`historia` AS `historia`,`bdclick6`.`bdcertificadomedico`.`Responsable` AS `Responsable`,`bdclick6`.`bdcertificadomedico`.`nombre` AS `nombre1`,`bdclick6`.`bdcertificadomedico`.`parentesco` AS `parentesco`,`bdclick6`.`bdcertificadomedico`.`motivo` AS `motivo`,`bdclick6`.`bdcertificadomedico`.`enfermedad` AS `enfermedad`,`bdclick6`.`bdcertificadomedico`.`Revision` AS `Revision`,`bdclick6`.`bdcertificadomedico`.`inspeccion` AS `inspeccion`,`bdclick6`.`bdcertificadomedico`.`temp` AS `temp`,`bdclick6`.`bdcertificadomedico`.`peso` AS `peso`,`bdclick6`.`bdcertificadomedico`.`estatura` AS `estatura`,`bdclick6`.`bdcertificadomedico`.`fc` AS `fc`,`bdclick6`.`bdcertificadomedico`.`fr` AS `fr`,`bdclick6`.`bdcertificadomedico`.`pa` AS `pa`,`bdclick6`.`bdcertificadomedico`.`cefalico` AS `cefalico`,`bdclick6`.`bdcertificadomedico`.`abdominal` AS `abdominal`,`bdclick6`.`bdcertificadomedico`.`imc` AS `imc`,`bdclick6`.`bdcertificadomedico`.`cabeza` AS `cabeza`,`bdclick6`.`bdcertificadomedico`.`ojos` AS `ojos`,`bdclick6`.`bdcertificadomedico`.`agudezaVisual` AS `agudezaVisual`,`bdclick6`.`bdcertificadomedico`.`oidos` AS `oidos`,`bdclick6`.`bdcertificadomedico`.`nariz` AS `nariz`,`bdclick6`.`bdcertificadomedico`.`boca` AS `boca`,`bdclick6`.`bdcertificadomedico`.`cuello` AS `cuello`,`bdclick6`.`bdcertificadomedico`.`cardioPulmonar` AS `cardioPulmonar`,`bdclick6`.`bdcertificadomedico`.`torax` AS `torax`,`bdclick6`.`bdcertificadomedico`.`abdomen` AS `abdomen`,`bdclick6`.`bdcertificadomedico`.`genitoUrinario` AS `genitoUrinario`,`bdclick6`.`bdcertificadomedico`.`ano` AS `ano`,`bdclick6`.`bdcertificadomedico`.`extremidades` AS `extremidades`,`bdclick6`.`bdcertificadomedico`.`neurologico` AS `neurologico`,`bdclick6`.`bdcertificadomedico`.`pies` AS `pies`,`bdclick6`.`bdcertificadomedico`.`osteoMuscular` AS `osteoMuscular`,`bdclick6`.`bdcertificadomedico`.`diagPrincipal` AS `diagPrincipal`,`bdclick6`.`bdcertificadomedico`.`diagRelacionado` AS `diagRelacionado`,`bdclick6`.`bdcertificadomedico`.`diagRelacionado2` AS `diagRelacionado2`,`bdclick6`.`bdcertificadomedico`.`diagRelacionado3` AS `diagRelacionado3`,`bdclick6`.`bdcertificadomedico`.`tratamiento` AS `tratamiento`,`bdclick6`.`bdcertificadomedico`.`recomendaciones` AS `recomendaciones`,`bdclick6`.`bdcertificadomedico`.`cup` AS `cup`,`bdclick6`.`bdcertificadomedico`.`usuario` AS `usuario`,`bdclick6`.`bdcertificadomedico`.`fecha` AS `fecha`,`bdclick6`.`bdcertificadomedico`.`patologicos` AS `patologicos`,`bdclick6`.`bdcertificadomedico`.`quirurgicos` AS `quirurgicos`,`bdclick6`.`bdcertificadomedico`.`alergicos` AS `alergicos`,`bdclick6`.`bdcertificadomedico`.`traumaticos` AS `traumaticos`,`bdclick6`.`bdcertificadomedico`.`ginecoobstetricos` AS `ginecoobstetricos`,`bdclick6`.`bdcertificadomedico`.`familiares` AS `familiares`,`bdclick6`.`bdcertificadomedico`.`social` AS `social`,`bdclick6`.`bdcertificadomedico`.`muscular` AS `muscular` from ((`bdclick6`.`bdterceros` join `bdclick6`.`bdhistoriaclinica` on((`bdclick6`.`bdterceros`.`idSistema` = `bdclick6`.`bdhistoriaclinica`.`paciente`))) join `bdclick6`.`bdcertificadomedico` on((`bdclick6`.`bdhistoriaclinica`.`id` = `bdclick6`.`bdcertificadomedico`.`historia`)))
md5=1d16a068802a8718d879ead13cb8d24b
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:33
create-version=2
source=select `bdcertificadomedico`.`Id` AS `Id`,`bdterceros`.`tipo` AS `tipo`,`bdterceros`.`idSistema` AS `idSistema`,`bdterceros`.`id` AS `IdTer`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`ciudad` AS `ciudad`,`bdterceros`.`nacimiento` AS `nacimiento`,`bdterceros`.`estado` AS `estado`,\'\' AS `hijos`,\'\' AS `escolaridad`,`bdcertificadomedico`.`historia` AS `historia`,`bdcertificadomedico`.`Responsable` AS `Responsable`,`bdcertificadomedico`.`nombre` AS `nombre1`,`bdcertificadomedico`.`parentesco` AS `parentesco`,`bdcertificadomedico`.`motivo` AS `motivo`,`bdcertificadomedico`.`enfermedad` AS `enfermedad`,`bdcertificadomedico`.`Revision` AS `Revision`,`bdcertificadomedico`.`inspeccion` AS `inspeccion`,`bdcertificadomedico`.`temp` AS `temp`,`bdcertificadomedico`.`peso` AS `peso`,`bdcertificadomedico`.`estatura` AS `estatura`,`bdcertificadomedico`.`fc` AS `fc`,`bdcertificadomedico`.`fr` AS `fr`,`bdcertificadomedico`.`pa` AS `pa`,`bdcertificadomedico`.`cefalico` AS `cefalico`,`bdcertificadomedico`.`abdominal` AS `abdominal`,`bdcertificadomedico`.`imc` AS `imc`,`bdcertificadomedico`.`cabeza` AS `cabeza`,`bdcertificadomedico`.`ojos` AS `ojos`,`bdcertificadomedico`.`agudezaVisual` AS `agudezaVisual`,`bdcertificadomedico`.`oidos` AS `oidos`,`bdcertificadomedico`.`nariz` AS `nariz`,`bdcertificadomedico`.`boca` AS `boca`,`bdcertificadomedico`.`cuello` AS `cuello`,`bdcertificadomedico`.`cardioPulmonar` AS `cardioPulmonar`,`bdcertificadomedico`.`torax` AS `torax`,`bdcertificadomedico`.`abdomen` AS `abdomen`,`bdcertificadomedico`.`genitoUrinario` AS `genitoUrinario`,`bdcertificadomedico`.`ano` AS `ano`,`bdcertificadomedico`.`extremidades` AS `extremidades`,`bdcertificadomedico`.`neurologico` AS `neurologico`,`bdcertificadomedico`.`pies` AS `pies`,`bdcertificadomedico`.`osteoMuscular` AS `osteoMuscular`,`bdcertificadomedico`.`diagPrincipal` AS `diagPrincipal`,`bdcertificadomedico`.`diagRelacionado` AS `diagRelacionado`,`bdcertificadomedico`.`diagRelacionado2` AS `diagRelacionado2`,`bdcertificadomedico`.`diagRelacionado3` AS `diagRelacionado3`,`bdcertificadomedico`.`tratamiento` AS `tratamiento`,`bdcertificadomedico`.`recomendaciones` AS `recomendaciones`,`bdcertificadomedico`.`cup` AS `cup`,`bdcertificadomedico`.`usuario` AS `usuario`,`bdcertificadomedico`.`fecha` AS `fecha`,`bdcertificadomedico`.`patologicos` AS `patologicos`,`bdcertificadomedico`.`quirurgicos` AS `quirurgicos`,`bdcertificadomedico`.`alergicos` AS `alergicos`,`bdcertificadomedico`.`traumaticos` AS `traumaticos`,`bdcertificadomedico`.`ginecoobstetricos` AS `ginecoobstetricos`,`bdcertificadomedico`.`familiares` AS `familiares`,`bdcertificadomedico`.`social` AS `social`,`bdcertificadomedico`.`muscular` AS `muscular` from ((`bdterceros` join `bdhistoriaclinica` on((`bdterceros`.`idSistema` = `bdhistoriaclinica`.`paciente`))) join `bdcertificadomedico` on((`bdhistoriaclinica`.`id` = `bdcertificadomedico`.`historia`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdcertificadomedico`.`Id` AS `Id`,`bdclick6`.`bdterceros`.`tipo` AS `tipo`,`bdclick6`.`bdterceros`.`idSistema` AS `idSistema`,`bdclick6`.`bdterceros`.`id` AS `IdTer`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,`bdclick6`.`bdterceros`.`direccion` AS `direccion`,`bdclick6`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick6`.`bdterceros`.`nacimiento` AS `nacimiento`,`bdclick6`.`bdterceros`.`estado` AS `estado`,\'\' AS `hijos`,\'\' AS `escolaridad`,`bdclick6`.`bdcertificadomedico`.`historia` AS `historia`,`bdclick6`.`bdcertificadomedico`.`Responsable` AS `Responsable`,`bdclick6`.`bdcertificadomedico`.`nombre` AS `nombre1`,`bdclick6`.`bdcertificadomedico`.`parentesco` AS `parentesco`,`bdclick6`.`bdcertificadomedico`.`motivo` AS `motivo`,`bdclick6`.`bdcertificadomedico`.`enfermedad` AS `enfermedad`,`bdclick6`.`bdcertificadomedico`.`Revision` AS `Revision`,`bdclick6`.`bdcertificadomedico`.`inspeccion` AS `inspeccion`,`bdclick6`.`bdcertificadomedico`.`temp` AS `temp`,`bdclick6`.`bdcertificadomedico`.`peso` AS `peso`,`bdclick6`.`bdcertificadomedico`.`estatura` AS `estatura`,`bdclick6`.`bdcertificadomedico`.`fc` AS `fc`,`bdclick6`.`bdcertificadomedico`.`fr` AS `fr`,`bdclick6`.`bdcertificadomedico`.`pa` AS `pa`,`bdclick6`.`bdcertificadomedico`.`cefalico` AS `cefalico`,`bdclick6`.`bdcertificadomedico`.`abdominal` AS `abdominal`,`bdclick6`.`bdcertificadomedico`.`imc` AS `imc`,`bdclick6`.`bdcertificadomedico`.`cabeza` AS `cabeza`,`bdclick6`.`bdcertificadomedico`.`ojos` AS `ojos`,`bdclick6`.`bdcertificadomedico`.`agudezaVisual` AS `agudezaVisual`,`bdclick6`.`bdcertificadomedico`.`oidos` AS `oidos`,`bdclick6`.`bdcertificadomedico`.`nariz` AS `nariz`,`bdclick6`.`bdcertificadomedico`.`boca` AS `boca`,`bdclick6`.`bdcertificadomedico`.`cuello` AS `cuello`,`bdclick6`.`bdcertificadomedico`.`cardioPulmonar` AS `cardioPulmonar`,`bdclick6`.`bdcertificadomedico`.`torax` AS `torax`,`bdclick6`.`bdcertificadomedico`.`abdomen` AS `abdomen`,`bdclick6`.`bdcertificadomedico`.`genitoUrinario` AS `genitoUrinario`,`bdclick6`.`bdcertificadomedico`.`ano` AS `ano`,`bdclick6`.`bdcertificadomedico`.`extremidades` AS `extremidades`,`bdclick6`.`bdcertificadomedico`.`neurologico` AS `neurologico`,`bdclick6`.`bdcertificadomedico`.`pies` AS `pies`,`bdclick6`.`bdcertificadomedico`.`osteoMuscular` AS `osteoMuscular`,`bdclick6`.`bdcertificadomedico`.`diagPrincipal` AS `diagPrincipal`,`bdclick6`.`bdcertificadomedico`.`diagRelacionado` AS `diagRelacionado`,`bdclick6`.`bdcertificadomedico`.`diagRelacionado2` AS `diagRelacionado2`,`bdclick6`.`bdcertificadomedico`.`diagRelacionado3` AS `diagRelacionado3`,`bdclick6`.`bdcertificadomedico`.`tratamiento` AS `tratamiento`,`bdclick6`.`bdcertificadomedico`.`recomendaciones` AS `recomendaciones`,`bdclick6`.`bdcertificadomedico`.`cup` AS `cup`,`bdclick6`.`bdcertificadomedico`.`usuario` AS `usuario`,`bdclick6`.`bdcertificadomedico`.`fecha` AS `fecha`,`bdclick6`.`bdcertificadomedico`.`patologicos` AS `patologicos`,`bdclick6`.`bdcertificadomedico`.`quirurgicos` AS `quirurgicos`,`bdclick6`.`bdcertificadomedico`.`alergicos` AS `alergicos`,`bdclick6`.`bdcertificadomedico`.`traumaticos` AS `traumaticos`,`bdclick6`.`bdcertificadomedico`.`ginecoobstetricos` AS `ginecoobstetricos`,`bdclick6`.`bdcertificadomedico`.`familiares` AS `familiares`,`bdclick6`.`bdcertificadomedico`.`social` AS `social`,`bdclick6`.`bdcertificadomedico`.`muscular` AS `muscular` from ((`bdclick6`.`bdterceros` join `bdclick6`.`bdhistoriaclinica` on((`bdclick6`.`bdterceros`.`idSistema` = `bdclick6`.`bdhistoriaclinica`.`paciente`))) join `bdclick6`.`bdcertificadomedico` on((`bdclick6`.`bdhistoriaclinica`.`id` = `bdclick6`.`bdcertificadomedico`.`historia`)))
mariadb-version=100135