TYPE=VIEW
query=select `bdclick`.`bdcertificadomedico`.`Id` AS `Id`,`bdclick`.`bdterceros`.`tipo` AS `tipo`,`bdclick`.`bdterceros`.`idSistema` AS `idSistema`,`bdclick`.`bdterceros`.`id` AS `IdTer`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdterceros`.`telefono` AS `telefono`,`bdclick`.`bdterceros`.`direccion` AS `direccion`,`bdclick`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick`.`bdterceros`.`nacimiento` AS `nacimiento`,`bdclick`.`bdterceros`.`estado` AS `estado`,\'\' AS `hijos`,\'\' AS `escolaridad`,`bdclick`.`bdcertificadomedico`.`historia` AS `historia`,`bdclick`.`bdcertificadomedico`.`Responsable` AS `Responsable`,`bdclick`.`bdcertificadomedico`.`nombre` AS `nombre1`,`bdclick`.`bdcertificadomedico`.`parentesco` AS `parentesco`,`bdclick`.`bdcertificadomedico`.`motivo` AS `motivo`,`bdclick`.`bdcertificadomedico`.`enfermedad` AS `enfermedad`,`bdclick`.`bdcertificadomedico`.`Revision` AS `Revision`,`bdclick`.`bdcertificadomedico`.`inspeccion` AS `inspeccion`,`bdclick`.`bdcertificadomedico`.`temp` AS `temp`,`bdclick`.`bdcertificadomedico`.`peso` AS `peso`,`bdclick`.`bdcertificadomedico`.`estatura` AS `estatura`,`bdclick`.`bdcertificadomedico`.`fc` AS `fc`,`bdclick`.`bdcertificadomedico`.`fr` AS `fr`,`bdclick`.`bdcertificadomedico`.`pa` AS `pa`,`bdclick`.`bdcertificadomedico`.`cefalico` AS `cefalico`,`bdclick`.`bdcertificadomedico`.`abdominal` AS `abdominal`,`bdclick`.`bdcertificadomedico`.`imc` AS `imc`,`bdclick`.`bdcertificadomedico`.`cabeza` AS `cabeza`,`bdclick`.`bdcertificadomedico`.`ojos` AS `ojos`,`bdclick`.`bdcertificadomedico`.`agudezaVisual` AS `agudezaVisual`,`bdclick`.`bdcertificadomedico`.`oidos` AS `oidos`,`bdclick`.`bdcertificadomedico`.`nariz` AS `nariz`,`bdclick`.`bdcertificadomedico`.`boca` AS `boca`,`bdclick`.`bdcertificadomedico`.`cuello` AS `cuello`,`bdclick`.`bdcertificadomedico`.`cardioPulmonar` AS `cardioPulmonar`,`bdclick`.`bdcertificadomedico`.`torax` AS `torax`,`bdclick`.`bdcertificadomedico`.`abdomen` AS `abdomen`,`bdclick`.`bdcertificadomedico`.`genitoUrinario` AS `genitoUrinario`,`bdclick`.`bdcertificadomedico`.`ano` AS `ano`,`bdclick`.`bdcertificadomedico`.`extremidades` AS `extremidades`,`bdclick`.`bdcertificadomedico`.`neurologico` AS `neurologico`,`bdclick`.`bdcertificadomedico`.`pies` AS `pies`,`bdclick`.`bdcertificadomedico`.`osteoMuscular` AS `osteoMuscular`,`bdclick`.`bdcertificadomedico`.`diagPrincipal` AS `diagPrincipal`,`bdclick`.`bdcertificadomedico`.`diagRelacionado` AS `diagRelacionado`,`bdclick`.`bdcertificadomedico`.`diagRelacionado2` AS `diagRelacionado2`,`bdclick`.`bdcertificadomedico`.`diagRelacionado3` AS `diagRelacionado3`,`bdclick`.`bdcertificadomedico`.`tratamiento` AS `tratamiento`,`bdclick`.`bdcertificadomedico`.`recomendaciones` AS `recomendaciones`,`bdclick`.`bdcertificadomedico`.`cup` AS `cup`,`bdclick`.`bdcertificadomedico`.`usuario` AS `usuario`,`bdclick`.`bdcertificadomedico`.`fecha` AS `fecha`,`bdclick`.`bdcertificadomedico`.`patologicos` AS `patologicos`,`bdclick`.`bdcertificadomedico`.`quirurgicos` AS `quirurgicos`,`bdclick`.`bdcertificadomedico`.`alergicos` AS `alergicos`,`bdclick`.`bdcertificadomedico`.`traumaticos` AS `traumaticos`,`bdclick`.`bdcertificadomedico`.`ginecoobstetricos` AS `ginecoobstetricos`,`bdclick`.`bdcertificadomedico`.`familiares` AS `familiares`,`bdclick`.`bdcertificadomedico`.`social` AS `social`,`bdclick`.`bdcertificadomedico`.`muscular` AS `muscular` from ((`bdclick`.`bdterceros` join `bdclick`.`bdhistoriaclinica` on((`bdclick`.`bdterceros`.`idSistema` = `bdclick`.`bdhistoriaclinica`.`paciente`))) join `bdclick`.`bdcertificadomedico` on((`bdclick`.`bdhistoriaclinica`.`id` = `bdclick`.`bdcertificadomedico`.`historia`)))
md5=f429933fd02a83af9212aac55643bb62
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:22
create-version=2
source=select `bdcertificadomedico`.`Id` AS `Id`,`bdterceros`.`tipo` AS `tipo`,`bdterceros`.`idSistema` AS `idSistema`,`bdterceros`.`id` AS `IdTer`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`ciudad` AS `ciudad`,`bdterceros`.`nacimiento` AS `nacimiento`,`bdterceros`.`estado` AS `estado`,\'\' AS `hijos`,\'\' AS `escolaridad`,`bdcertificadomedico`.`historia` AS `historia`,`bdcertificadomedico`.`Responsable` AS `Responsable`,`bdcertificadomedico`.`nombre` AS `nombre1`,`bdcertificadomedico`.`parentesco` AS `parentesco`,`bdcertificadomedico`.`motivo` AS `motivo`,`bdcertificadomedico`.`enfermedad` AS `enfermedad`,`bdcertificadomedico`.`Revision` AS `Revision`,`bdcertificadomedico`.`inspeccion` AS `inspeccion`,`bdcertificadomedico`.`temp` AS `temp`,`bdcertificadomedico`.`peso` AS `peso`,`bdcertificadomedico`.`estatura` AS `estatura`,`bdcertificadomedico`.`fc` AS `fc`,`bdcertificadomedico`.`fr` AS `fr`,`bdcertificadomedico`.`pa` AS `pa`,`bdcertificadomedico`.`cefalico` AS `cefalico`,`bdcertificadomedico`.`abdominal` AS `abdominal`,`bdcertificadomedico`.`imc` AS `imc`,`bdcertificadomedico`.`cabeza` AS `cabeza`,`bdcertificadomedico`.`ojos` AS `ojos`,`bdcertificadomedico`.`agudezaVisual` AS `agudezaVisual`,`bdcertificadomedico`.`oidos` AS `oidos`,`bdcertificadomedico`.`nariz` AS `nariz`,`bdcertificadomedico`.`boca` AS `boca`,`bdcertificadomedico`.`cuello` AS `cuello`,`bdcertificadomedico`.`cardioPulmonar` AS `cardioPulmonar`,`bdcertificadomedico`.`torax` AS `torax`,`bdcertificadomedico`.`abdomen` AS `abdomen`,`bdcertificadomedico`.`genitoUrinario` AS `genitoUrinario`,`bdcertificadomedico`.`ano` AS `ano`,`bdcertificadomedico`.`extremidades` AS `extremidades`,`bdcertificadomedico`.`neurologico` AS `neurologico`,`bdcertificadomedico`.`pies` AS `pies`,`bdcertificadomedico`.`osteoMuscular` AS `osteoMuscular`,`bdcertificadomedico`.`diagPrincipal` AS `diagPrincipal`,`bdcertificadomedico`.`diagRelacionado` AS `diagRelacionado`,`bdcertificadomedico`.`diagRelacionado2` AS `diagRelacionado2`,`bdcertificadomedico`.`diagRelacionado3` AS `diagRelacionado3`,`bdcertificadomedico`.`tratamiento` AS `tratamiento`,`bdcertificadomedico`.`recomendaciones` AS `recomendaciones`,`bdcertificadomedico`.`cup` AS `cup`,`bdcertificadomedico`.`usuario` AS `usuario`,`bdcertificadomedico`.`fecha` AS `fecha`,`bdcertificadomedico`.`patologicos` AS `patologicos`,`bdcertificadomedico`.`quirurgicos` AS `quirurgicos`,`bdcertificadomedico`.`alergicos` AS `alergicos`,`bdcertificadomedico`.`traumaticos` AS `traumaticos`,`bdcertificadomedico`.`ginecoobstetricos` AS `ginecoobstetricos`,`bdcertificadomedico`.`familiares` AS `familiares`,`bdcertificadomedico`.`social` AS `social`,`bdcertificadomedico`.`muscular` AS `muscular` from ((`bdterceros` join `bdhistoriaclinica` on((`bdterceros`.`idSistema` = `bdhistoriaclinica`.`paciente`))) join `bdcertificadomedico` on((`bdhistoriaclinica`.`id` = `bdcertificadomedico`.`historia`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdcertificadomedico`.`Id` AS `Id`,`bdclick`.`bdterceros`.`tipo` AS `tipo`,`bdclick`.`bdterceros`.`idSistema` AS `idSistema`,`bdclick`.`bdterceros`.`id` AS `IdTer`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdterceros`.`telefono` AS `telefono`,`bdclick`.`bdterceros`.`direccion` AS `direccion`,`bdclick`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick`.`bdterceros`.`nacimiento` AS `nacimiento`,`bdclick`.`bdterceros`.`estado` AS `estado`,\'\' AS `hijos`,\'\' AS `escolaridad`,`bdclick`.`bdcertificadomedico`.`historia` AS `historia`,`bdclick`.`bdcertificadomedico`.`Responsable` AS `Responsable`,`bdclick`.`bdcertificadomedico`.`nombre` AS `nombre1`,`bdclick`.`bdcertificadomedico`.`parentesco` AS `parentesco`,`bdclick`.`bdcertificadomedico`.`motivo` AS `motivo`,`bdclick`.`bdcertificadomedico`.`enfermedad` AS `enfermedad`,`bdclick`.`bdcertificadomedico`.`Revision` AS `Revision`,`bdclick`.`bdcertificadomedico`.`inspeccion` AS `inspeccion`,`bdclick`.`bdcertificadomedico`.`temp` AS `temp`,`bdclick`.`bdcertificadomedico`.`peso` AS `peso`,`bdclick`.`bdcertificadomedico`.`estatura` AS `estatura`,`bdclick`.`bdcertificadomedico`.`fc` AS `fc`,`bdclick`.`bdcertificadomedico`.`fr` AS `fr`,`bdclick`.`bdcertificadomedico`.`pa` AS `pa`,`bdclick`.`bdcertificadomedico`.`cefalico` AS `cefalico`,`bdclick`.`bdcertificadomedico`.`abdominal` AS `abdominal`,`bdclick`.`bdcertificadomedico`.`imc` AS `imc`,`bdclick`.`bdcertificadomedico`.`cabeza` AS `cabeza`,`bdclick`.`bdcertificadomedico`.`ojos` AS `ojos`,`bdclick`.`bdcertificadomedico`.`agudezaVisual` AS `agudezaVisual`,`bdclick`.`bdcertificadomedico`.`oidos` AS `oidos`,`bdclick`.`bdcertificadomedico`.`nariz` AS `nariz`,`bdclick`.`bdcertificadomedico`.`boca` AS `boca`,`bdclick`.`bdcertificadomedico`.`cuello` AS `cuello`,`bdclick`.`bdcertificadomedico`.`cardioPulmonar` AS `cardioPulmonar`,`bdclick`.`bdcertificadomedico`.`torax` AS `torax`,`bdclick`.`bdcertificadomedico`.`abdomen` AS `abdomen`,`bdclick`.`bdcertificadomedico`.`genitoUrinario` AS `genitoUrinario`,`bdclick`.`bdcertificadomedico`.`ano` AS `ano`,`bdclick`.`bdcertificadomedico`.`extremidades` AS `extremidades`,`bdclick`.`bdcertificadomedico`.`neurologico` AS `neurologico`,`bdclick`.`bdcertificadomedico`.`pies` AS `pies`,`bdclick`.`bdcertificadomedico`.`osteoMuscular` AS `osteoMuscular`,`bdclick`.`bdcertificadomedico`.`diagPrincipal` AS `diagPrincipal`,`bdclick`.`bdcertificadomedico`.`diagRelacionado` AS `diagRelacionado`,`bdclick`.`bdcertificadomedico`.`diagRelacionado2` AS `diagRelacionado2`,`bdclick`.`bdcertificadomedico`.`diagRelacionado3` AS `diagRelacionado3`,`bdclick`.`bdcertificadomedico`.`tratamiento` AS `tratamiento`,`bdclick`.`bdcertificadomedico`.`recomendaciones` AS `recomendaciones`,`bdclick`.`bdcertificadomedico`.`cup` AS `cup`,`bdclick`.`bdcertificadomedico`.`usuario` AS `usuario`,`bdclick`.`bdcertificadomedico`.`fecha` AS `fecha`,`bdclick`.`bdcertificadomedico`.`patologicos` AS `patologicos`,`bdclick`.`bdcertificadomedico`.`quirurgicos` AS `quirurgicos`,`bdclick`.`bdcertificadomedico`.`alergicos` AS `alergicos`,`bdclick`.`bdcertificadomedico`.`traumaticos` AS `traumaticos`,`bdclick`.`bdcertificadomedico`.`ginecoobstetricos` AS `ginecoobstetricos`,`bdclick`.`bdcertificadomedico`.`familiares` AS `familiares`,`bdclick`.`bdcertificadomedico`.`social` AS `social`,`bdclick`.`bdcertificadomedico`.`muscular` AS `muscular` from ((`bdclick`.`bdterceros` join `bdclick`.`bdhistoriaclinica` on((`bdclick`.`bdterceros`.`idSistema` = `bdclick`.`bdhistoriaclinica`.`paciente`))) join `bdclick`.`bdcertificadomedico` on((`bdclick`.`bdhistoriaclinica`.`id` = `bdclick`.`bdcertificadomedico`.`historia`)))
mariadb-version=100135
