TYPE=VIEW
query=(select `bdclick1`.`bdformulamedica`.`Id` AS `Id`,`bdclick1`.`bdformulamedica`.`fecha` AS `fecha`,`bdclick1`.`bdformulamedica`.`usuario` AS `usuario`,`bdclick1`.`bdformulamedica`.`valor` AS `valor_formMed`,`bdclick1`.`bdformulamedica`.`observacion` AS `observacion`,`bdclick1`.`conformulamedica1`.`IdTercero` AS `IdTercero`,`bdclick1`.`conformulamedica1`.`nombre` AS `nombre`,`bdclick1`.`conformulamedica1`.`telefono` AS `telefono`,`bdclick1`.`conformulamedica1`.`direccion` AS `direccion`,`bdclick1`.`conformulamedica1`.`regimen` AS `regimen`,`bdclick1`.`conformulamedica1`.`sexo` AS `sexo`,`bdclick1`.`conformulamedica1`.`nombreEps` AS `nombreEps`,`bdclick1`.`conformulamedica1`.`tipo2` AS `tipo2`,`bdclick1`.`conformulamedica1`.`Edad` AS `Edad`,`bdclick1`.`bdformulamedica`.`frecCardiaca` AS `fc`,`bdclick1`.`bdformulamedica`.`frecRespiratoria` AS `fr`,`bdclick1`.`bdformulamedica`.`presionArterial` AS `pa`,`bdclick1`.`bdformulamedica`.`peso` AS `peso`,`bdclick1`.`bdformulamedica`.`temperatura` AS `t`,`bdclick1`.`bdformulamedica`.`estatura` AS `talla`,`bdclick1`.`conformulamedica1`.`abdominal` AS `abdominal`,`bdclick1`.`conformulamedica1`.`historia` AS `historia`,`bdclick1`.`bdtablaformula`.`prescripcion` AS `prescripcion`,`bdclick1`.`bdtablaformula`.`posologia` AS `posologia`,`bdclick1`.`bdtablaformula`.`valor` AS `valor`,`bdclick1`.`bdtablaformula`.`cantidad` AS `cantidad`,`bdclick1`.`bdconsultaclinica`.`Id` AS `IdConsulta` from (`bdclick1`.`bdtablaformula` left join ((`bdclick1`.`bdformulamedica` left join `bdclick1`.`bdconsultaclinica` on((`bdclick1`.`bdformulamedica`.`historia` = `bdclick1`.`bdconsultaclinica`.`Id`))) left join `bdclick1`.`conformulamedica1` on((`bdclick1`.`bdconsultaclinica`.`historia` = `bdclick1`.`conformulamedica1`.`historia`))) on((`bdclick1`.`bdformulamedica`.`Id` = `bdclick1`.`bdtablaformula`.`formula`))))
md5=0ba5eaa44e9d9ab574e0c6fb39adad10
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:33
create-version=2
source=(select `bdformulamedica`.`Id` AS `Id`,`bdformulamedica`.`fecha` AS `fecha`,`bdformulamedica`.`usuario` AS `usuario`,`bdformulamedica`.`valor` AS `valor_formMed`,`bdformulamedica`.`observacion` AS `observacion`,`conformulamedica1`.`IdTercero` AS `IdTercero`,`conformulamedica1`.`nombre` AS `nombre`,`conformulamedica1`.`telefono` AS `telefono`,`conformulamedica1`.`direccion` AS `direccion`,`conformulamedica1`.`regimen` AS `regimen`,`conformulamedica1`.`sexo` AS `sexo`,`conformulamedica1`.`nombreEps` AS `nombreEps`,`conformulamedica1`.`tipo2` AS `tipo2`,`conformulamedica1`.`Edad` AS `Edad`,`bdformulamedica`.`frecCardiaca` AS `fc`,`bdformulamedica`.`frecRespiratoria` AS `fr`,`bdformulamedica`.`presionArterial` AS `pa`,`bdformulamedica`.`peso` AS `peso`,`bdformulamedica`.`temperatura` AS `t`,`bdformulamedica`.`estatura` AS `talla`,`conformulamedica1`.`abdominal` AS `abdominal`,`conformulamedica1`.`historia` AS `historia`,`bdtablaformula`.`prescripcion` AS `prescripcion`,`bdtablaformula`.`posologia` AS `posologia`,`bdtablaformula`.`valor` AS `valor`,`bdtablaformula`.`cantidad` AS `cantidad`,`bdconsultaclinica`.`Id` AS `IdConsulta` from (`bdtablaformula` left join ((`bdformulamedica` left join `bdconsultaclinica` on((`bdformulamedica`.`historia` = `bdconsultaclinica`.`Id`))) left join `conformulamedica1` on((`bdconsultaclinica`.`historia` = `conformulamedica1`.`historia`))) on((`bdformulamedica`.`Id` = `bdtablaformula`.`formula`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick1`.`bdformulamedica`.`Id` AS `Id`,`bdclick1`.`bdformulamedica`.`fecha` AS `fecha`,`bdclick1`.`bdformulamedica`.`usuario` AS `usuario`,`bdclick1`.`bdformulamedica`.`valor` AS `valor_formMed`,`bdclick1`.`bdformulamedica`.`observacion` AS `observacion`,`bdclick1`.`conformulamedica1`.`IdTercero` AS `IdTercero`,`bdclick1`.`conformulamedica1`.`nombre` AS `nombre`,`bdclick1`.`conformulamedica1`.`telefono` AS `telefono`,`bdclick1`.`conformulamedica1`.`direccion` AS `direccion`,`bdclick1`.`conformulamedica1`.`regimen` AS `regimen`,`bdclick1`.`conformulamedica1`.`sexo` AS `sexo`,`bdclick1`.`conformulamedica1`.`nombreEps` AS `nombreEps`,`bdclick1`.`conformulamedica1`.`tipo2` AS `tipo2`,`bdclick1`.`conformulamedica1`.`Edad` AS `Edad`,`bdclick1`.`bdformulamedica`.`frecCardiaca` AS `fc`,`bdclick1`.`bdformulamedica`.`frecRespiratoria` AS `fr`,`bdclick1`.`bdformulamedica`.`presionArterial` AS `pa`,`bdclick1`.`bdformulamedica`.`peso` AS `peso`,`bdclick1`.`bdformulamedica`.`temperatura` AS `t`,`bdclick1`.`bdformulamedica`.`estatura` AS `talla`,`bdclick1`.`conformulamedica1`.`abdominal` AS `abdominal`,`bdclick1`.`conformulamedica1`.`historia` AS `historia`,`bdclick1`.`bdtablaformula`.`prescripcion` AS `prescripcion`,`bdclick1`.`bdtablaformula`.`posologia` AS `posologia`,`bdclick1`.`bdtablaformula`.`valor` AS `valor`,`bdclick1`.`bdtablaformula`.`cantidad` AS `cantidad`,`bdclick1`.`bdconsultaclinica`.`Id` AS `IdConsulta` from (`bdclick1`.`bdtablaformula` left join ((`bdclick1`.`bdformulamedica` left join `bdclick1`.`bdconsultaclinica` on((`bdclick1`.`bdformulamedica`.`historia` = `bdclick1`.`bdconsultaclinica`.`Id`))) left join `bdclick1`.`conformulamedica1` on((`bdclick1`.`bdconsultaclinica`.`historia` = `bdclick1`.`conformulamedica1`.`historia`))) on((`bdclick1`.`bdformulamedica`.`Id` = `bdclick1`.`bdtablaformula`.`formula`))))
mariadb-version=100135
