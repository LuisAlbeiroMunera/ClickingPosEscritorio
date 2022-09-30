TYPE=VIEW
query=select `bdclick5`.`bdcertificadomedico`.`Id` AS `Id`,`bdclick5`.`bdterceros`.`tipo` AS `tipo`,`bdclick5`.`bdterceros`.`idSistema` AS `idSistema`,`bdclick5`.`bdterceros`.`id` AS `IdTer`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdterceros`.`telefono` AS `telefono`,`bdclick5`.`bdterceros`.`direccion` AS `direccion`,`bdclick5`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick5`.`bdterceros`.`nacimiento` AS `nacimiento`,`bdclick5`.`bdterceros`.`estado` AS `estado`,\'\' AS `hijos`,\'\' AS `escolaridad`,`bdclick5`.`bdcertificadomedico`.`historia` AS `historia`,`bdclick5`.`bdcertificadomedico`.`Responsable` AS `Responsable`,`bdclick5`.`bdcertificadomedico`.`nombre` AS `nombre1`,`bdclick5`.`bdcertificadomedico`.`parentesco` AS `parentesco`,`bdclick5`.`bdcertificadomedico`.`motivo` AS `motivo`,`bdclick5`.`bdcertificadomedico`.`enfermedad` AS `enfermedad`,`bdclick5`.`bdcertificadomedico`.`Revision` AS `Revision`,`bdclick5`.`bdcertificadomedico`.`inspeccion` AS `inspeccion`,`bdclick5`.`bdcertificadomedico`.`temp` AS `temp`,`bdclick5`.`bdcertificadomedico`.`peso` AS `peso`,`bdclick5`.`bdcertificadomedico`.`estatura` AS `estatura`,`bdclick5`.`bdcertificadomedico`.`fc` AS `fc`,`bdclick5`.`bdcertificadomedico`.`fr` AS `fr`,`bdclick5`.`bdcertificadomedico`.`pa` AS `pa`,`bdclick5`.`bdcertificadomedico`.`cefalico` AS `cefalico`,`bdclick5`.`bdcertificadomedico`.`abdominal` AS `abdominal`,`bdclick5`.`bdcertificadomedico`.`imc` AS `imc`,`bdclick5`.`bdcertificadomedico`.`cabeza` AS `cabeza`,`bdclick5`.`bdcertificadomedico`.`ojos` AS `ojos`,`bdclick5`.`bdcertificadomedico`.`agudezaVisual` AS `agudezaVisual`,`bdclick5`.`bdcertificadomedico`.`oidos` AS `oidos`,`bdclick5`.`bdcertificadomedico`.`nariz` AS `nariz`,`bdclick5`.`bdcertificadomedico`.`boca` AS `boca`,`bdclick5`.`bdcertificadomedico`.`cuello` AS `cuello`,`bdclick5`.`bdcertificadomedico`.`cardioPulmonar` AS `cardioPulmonar`,`bdclick5`.`bdcertificadomedico`.`torax` AS `torax`,`bdclick5`.`bdcertificadomedico`.`abdomen` AS `abdomen`,`bdclick5`.`bdcertificadomedico`.`genitoUrinario` AS `genitoUrinario`,`bdclick5`.`bdcertificadomedico`.`ano` AS `ano`,`bdclick5`.`bdcertificadomedico`.`extremidades` AS `extremidades`,`bdclick5`.`bdcertificadomedico`.`neurologico` AS `neurologico`,`bdclick5`.`bdcertificadomedico`.`pies` AS `pies`,`bdclick5`.`bdcertificadomedico`.`osteoMuscular` AS `osteoMuscular`,`bdclick5`.`bdcertificadomedico`.`diagPrincipal` AS `diagPrincipal`,`bdclick5`.`bdcertificadomedico`.`diagRelacionado` AS `diagRelacionado`,`bdclick5`.`bdcertificadomedico`.`diagRelacionado2` AS `diagRelacionado2`,`bdclick5`.`bdcertificadomedico`.`diagRelacionado3` AS `diagRelacionado3`,`bdclick5`.`bdcertificadomedico`.`tratamiento` AS `tratamiento`,`bdclick5`.`bdcertificadomedico`.`recomendaciones` AS `recomendaciones`,`bdclick5`.`bdcertificadomedico`.`cup` AS `cup`,`bdclick5`.`bdcertificadomedico`.`usuario` AS `usuario`,`bdclick5`.`bdcertificadomedico`.`fecha` AS `fecha`,`bdclick5`.`bdcertificadomedico`.`patologicos` AS `patologicos`,`bdclick5`.`bdcertificadomedico`.`quirurgicos` AS `quirurgicos`,`bdclick5`.`bdcertificadomedico`.`alergicos` AS `alergicos`,`bdclick5`.`bdcertificadomedico`.`traumaticos` AS `traumaticos`,`bdclick5`.`bdcertificadomedico`.`ginecoobstetricos` AS `ginecoobstetricos`,`bdclick5`.`bdcertificadomedico`.`familiares` AS `familiares`,`bdclick5`.`bdcertificadomedico`.`social` AS `social`,`bdclick5`.`bdcertificadomedico`.`muscular` AS `muscular` from ((`bdclick5`.`bdterceros` join `bdclick5`.`bdhistoriaclinica` on((`bdclick5`.`bdterceros`.`idSistema` = `bdclick5`.`bdhistoriaclinica`.`paciente`))) join `bdclick5`.`bdcertificadomedico` on((`bdclick5`.`bdhistoriaclinica`.`id` = `bdclick5`.`bdcertificadomedico`.`historia`)))
md5=4807eebfdc47362218dc663d4c6e33a0
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:44
create-version=2
source=select `bdcertificadomedico`.`Id` AS `Id`,`bdterceros`.`tipo` AS `tipo`,`bdterceros`.`idSistema` AS `idSistema`,`bdterceros`.`id` AS `IdTer`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`ciudad` AS `ciudad`,`bdterceros`.`nacimiento` AS `nacimiento`,`bdterceros`.`estado` AS `estado`,\'\' AS `hijos`,\'\' AS `escolaridad`,`bdcertificadomedico`.`historia` AS `historia`,`bdcertificadomedico`.`Responsable` AS `Responsable`,`bdcertificadomedico`.`nombre` AS `nombre1`,`bdcertificadomedico`.`parentesco` AS `parentesco`,`bdcertificadomedico`.`motivo` AS `motivo`,`bdcertificadomedico`.`enfermedad` AS `enfermedad`,`bdcertificadomedico`.`Revision` AS `Revision`,`bdcertificadomedico`.`inspeccion` AS `inspeccion`,`bdcertificadomedico`.`temp` AS `temp`,`bdcertificadomedico`.`peso` AS `peso`,`bdcertificadomedico`.`estatura` AS `estatura`,`bdcertificadomedico`.`fc` AS `fc`,`bdcertificadomedico`.`fr` AS `fr`,`bdcertificadomedico`.`pa` AS `pa`,`bdcertificadomedico`.`cefalico` AS `cefalico`,`bdcertificadomedico`.`abdominal` AS `abdominal`,`bdcertificadomedico`.`imc` AS `imc`,`bdcertificadomedico`.`cabeza` AS `cabeza`,`bdcertificadomedico`.`ojos` AS `ojos`,`bdcertificadomedico`.`agudezaVisual` AS `agudezaVisual`,`bdcertificadomedico`.`oidos` AS `oidos`,`bdcertificadomedico`.`nariz` AS `nariz`,`bdcertificadomedico`.`boca` AS `boca`,`bdcertificadomedico`.`cuello` AS `cuello`,`bdcertificadomedico`.`cardioPulmonar` AS `cardioPulmonar`,`bdcertificadomedico`.`torax` AS `torax`,`bdcertificadomedico`.`abdomen` AS `abdomen`,`bdcertificadomedico`.`genitoUrinario` AS `genitoUrinario`,`bdcertificadomedico`.`ano` AS `ano`,`bdcertificadomedico`.`extremidades` AS `extremidades`,`bdcertificadomedico`.`neurologico` AS `neurologico`,`bdcertificadomedico`.`pies` AS `pies`,`bdcertificadomedico`.`osteoMuscular` AS `osteoMuscular`,`bdcertificadomedico`.`diagPrincipal` AS `diagPrincipal`,`bdcertificadomedico`.`diagRelacionado` AS `diagRelacionado`,`bdcertificadomedico`.`diagRelacionado2` AS `diagRelacionado2`,`bdcertificadomedico`.`diagRelacionado3` AS `diagRelacionado3`,`bdcertificadomedico`.`tratamiento` AS `tratamiento`,`bdcertificadomedico`.`recomendaciones` AS `recomendaciones`,`bdcertificadomedico`.`cup` AS `cup`,`bdcertificadomedico`.`usuario` AS `usuario`,`bdcertificadomedico`.`fecha` AS `fecha`,`bdcertificadomedico`.`patologicos` AS `patologicos`,`bdcertificadomedico`.`quirurgicos` AS `quirurgicos`,`bdcertificadomedico`.`alergicos` AS `alergicos`,`bdcertificadomedico`.`traumaticos` AS `traumaticos`,`bdcertificadomedico`.`ginecoobstetricos` AS `ginecoobstetricos`,`bdcertificadomedico`.`familiares` AS `familiares`,`bdcertificadomedico`.`social` AS `social`,`bdcertificadomedico`.`muscular` AS `muscular` from ((`bdterceros` join `bdhistoriaclinica` on((`bdterceros`.`idSistema` = `bdhistoriaclinica`.`paciente`))) join `bdcertificadomedico` on((`bdhistoriaclinica`.`id` = `bdcertificadomedico`.`historia`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdcertificadomedico`.`Id` AS `Id`,`bdclick5`.`bdterceros`.`tipo` AS `tipo`,`bdclick5`.`bdterceros`.`idSistema` AS `idSistema`,`bdclick5`.`bdterceros`.`id` AS `IdTer`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdterceros`.`telefono` AS `telefono`,`bdclick5`.`bdterceros`.`direccion` AS `direccion`,`bdclick5`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick5`.`bdterceros`.`nacimiento` AS `nacimiento`,`bdclick5`.`bdterceros`.`estado` AS `estado`,\'\' AS `hijos`,\'\' AS `escolaridad`,`bdclick5`.`bdcertificadomedico`.`historia` AS `historia`,`bdclick5`.`bdcertificadomedico`.`Responsable` AS `Responsable`,`bdclick5`.`bdcertificadomedico`.`nombre` AS `nombre1`,`bdclick5`.`bdcertificadomedico`.`parentesco` AS `parentesco`,`bdclick5`.`bdcertificadomedico`.`motivo` AS `motivo`,`bdclick5`.`bdcertificadomedico`.`enfermedad` AS `enfermedad`,`bdclick5`.`bdcertificadomedico`.`Revision` AS `Revision`,`bdclick5`.`bdcertificadomedico`.`inspeccion` AS `inspeccion`,`bdclick5`.`bdcertificadomedico`.`temp` AS `temp`,`bdclick5`.`bdcertificadomedico`.`peso` AS `peso`,`bdclick5`.`bdcertificadomedico`.`estatura` AS `estatura`,`bdclick5`.`bdcertificadomedico`.`fc` AS `fc`,`bdclick5`.`bdcertificadomedico`.`fr` AS `fr`,`bdclick5`.`bdcertificadomedico`.`pa` AS `pa`,`bdclick5`.`bdcertificadomedico`.`cefalico` AS `cefalico`,`bdclick5`.`bdcertificadomedico`.`abdominal` AS `abdominal`,`bdclick5`.`bdcertificadomedico`.`imc` AS `imc`,`bdclick5`.`bdcertificadomedico`.`cabeza` AS `cabeza`,`bdclick5`.`bdcertificadomedico`.`ojos` AS `ojos`,`bdclick5`.`bdcertificadomedico`.`agudezaVisual` AS `agudezaVisual`,`bdclick5`.`bdcertificadomedico`.`oidos` AS `oidos`,`bdclick5`.`bdcertificadomedico`.`nariz` AS `nariz`,`bdclick5`.`bdcertificadomedico`.`boca` AS `boca`,`bdclick5`.`bdcertificadomedico`.`cuello` AS `cuello`,`bdclick5`.`bdcertificadomedico`.`cardioPulmonar` AS `cardioPulmonar`,`bdclick5`.`bdcertificadomedico`.`torax` AS `torax`,`bdclick5`.`bdcertificadomedico`.`abdomen` AS `abdomen`,`bdclick5`.`bdcertificadomedico`.`genitoUrinario` AS `genitoUrinario`,`bdclick5`.`bdcertificadomedico`.`ano` AS `ano`,`bdclick5`.`bdcertificadomedico`.`extremidades` AS `extremidades`,`bdclick5`.`bdcertificadomedico`.`neurologico` AS `neurologico`,`bdclick5`.`bdcertificadomedico`.`pies` AS `pies`,`bdclick5`.`bdcertificadomedico`.`osteoMuscular` AS `osteoMuscular`,`bdclick5`.`bdcertificadomedico`.`diagPrincipal` AS `diagPrincipal`,`bdclick5`.`bdcertificadomedico`.`diagRelacionado` AS `diagRelacionado`,`bdclick5`.`bdcertificadomedico`.`diagRelacionado2` AS `diagRelacionado2`,`bdclick5`.`bdcertificadomedico`.`diagRelacionado3` AS `diagRelacionado3`,`bdclick5`.`bdcertificadomedico`.`tratamiento` AS `tratamiento`,`bdclick5`.`bdcertificadomedico`.`recomendaciones` AS `recomendaciones`,`bdclick5`.`bdcertificadomedico`.`cup` AS `cup`,`bdclick5`.`bdcertificadomedico`.`usuario` AS `usuario`,`bdclick5`.`bdcertificadomedico`.`fecha` AS `fecha`,`bdclick5`.`bdcertificadomedico`.`patologicos` AS `patologicos`,`bdclick5`.`bdcertificadomedico`.`quirurgicos` AS `quirurgicos`,`bdclick5`.`bdcertificadomedico`.`alergicos` AS `alergicos`,`bdclick5`.`bdcertificadomedico`.`traumaticos` AS `traumaticos`,`bdclick5`.`bdcertificadomedico`.`ginecoobstetricos` AS `ginecoobstetricos`,`bdclick5`.`bdcertificadomedico`.`familiares` AS `familiares`,`bdclick5`.`bdcertificadomedico`.`social` AS `social`,`bdclick5`.`bdcertificadomedico`.`muscular` AS `muscular` from ((`bdclick5`.`bdterceros` join `bdclick5`.`bdhistoriaclinica` on((`bdclick5`.`bdterceros`.`idSistema` = `bdclick5`.`bdhistoriaclinica`.`paciente`))) join `bdclick5`.`bdcertificadomedico` on((`bdclick5`.`bdhistoriaclinica`.`id` = `bdclick5`.`bdcertificadomedico`.`historia`)))
mariadb-version=100135