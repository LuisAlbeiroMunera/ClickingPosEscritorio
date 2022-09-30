TYPE=VIEW
query=(select `bdclick`.`bdayudadiagnostica`.`Id` AS `Id`,`bdclick`.`bdayudadiagnostica`.`historia` AS `historia`,`bdclick`.`bdayudadiagnostica`.`fecha` AS `fecha`,`bdclick`.`bdayudadiagnostica`.`observaciones` AS `observaciones`,`bdclick`.`bdtabladiagnostica`.`concepto` AS `concepto`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdterceros`.`id` AS `idTercero`,`bdclick`.`bdterceros`.`telefono` AS `telefono`,`bdclick`.`bdterceros`.`direccion` AS `direccion`,`bdclick`.`bdterceros`.`sexo` AS `sexo`,cast(((cast(now() as date) - `bdclick`.`bdterceros`.`nacimiento`) / 365) as signed) AS `Edad` from ((((`bdclick`.`bdayudadiagnostica` left join `bdclick`.`bdtabladiagnostica` on((`bdclick`.`bdayudadiagnostica`.`Id` = `bdclick`.`bdtabladiagnostica`.`diagnostico`))) left join `bdclick`.`bdconsultaclinica` on((`bdclick`.`bdayudadiagnostica`.`historia` = `bdclick`.`bdconsultaclinica`.`Id`))) left join `bdclick`.`bdhistoriaclinica` on((`bdclick`.`bdconsultaclinica`.`historia` = `bdclick`.`bdhistoriaclinica`.`id`))) left join `bdclick`.`bdterceros` on((`bdclick`.`bdhistoriaclinica`.`paciente` = `bdclick`.`bdterceros`.`idSistema`))))
md5=9a3a3fb5a34dc57aa04b6d46dfed2eea
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:22
create-version=2
source=(select `bdayudadiagnostica`.`Id` AS `Id`,`bdayudadiagnostica`.`historia` AS `historia`,`bdayudadiagnostica`.`fecha` AS `fecha`,`bdayudadiagnostica`.`observaciones` AS `observaciones`,`bdtabladiagnostica`.`concepto` AS `concepto`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`id` AS `idTercero`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`sexo` AS `sexo`,cast(((cast(now() as date) - `bdterceros`.`nacimiento`) / 365) as signed) AS `Edad` from ((((`bdayudadiagnostica` left join `bdtabladiagnostica` on((`bdayudadiagnostica`.`Id` = `bdtabladiagnostica`.`diagnostico`))) left join `bdconsultaclinica` on((`bdayudadiagnostica`.`historia` = `bdconsultaclinica`.`Id`))) left join `bdhistoriaclinica` on((`bdconsultaclinica`.`historia` = `bdhistoriaclinica`.`id`))) left join `bdterceros` on((`bdhistoriaclinica`.`paciente` = `bdterceros`.`idSistema`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdayudadiagnostica`.`Id` AS `Id`,`bdclick`.`bdayudadiagnostica`.`historia` AS `historia`,`bdclick`.`bdayudadiagnostica`.`fecha` AS `fecha`,`bdclick`.`bdayudadiagnostica`.`observaciones` AS `observaciones`,`bdclick`.`bdtabladiagnostica`.`concepto` AS `concepto`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdterceros`.`id` AS `idTercero`,`bdclick`.`bdterceros`.`telefono` AS `telefono`,`bdclick`.`bdterceros`.`direccion` AS `direccion`,`bdclick`.`bdterceros`.`sexo` AS `sexo`,cast(((cast(now() as date) - `bdclick`.`bdterceros`.`nacimiento`) / 365) as signed) AS `Edad` from ((((`bdclick`.`bdayudadiagnostica` left join `bdclick`.`bdtabladiagnostica` on((`bdclick`.`bdayudadiagnostica`.`Id` = `bdclick`.`bdtabladiagnostica`.`diagnostico`))) left join `bdclick`.`bdconsultaclinica` on((`bdclick`.`bdayudadiagnostica`.`historia` = `bdclick`.`bdconsultaclinica`.`Id`))) left join `bdclick`.`bdhistoriaclinica` on((`bdclick`.`bdconsultaclinica`.`historia` = `bdclick`.`bdhistoriaclinica`.`id`))) left join `bdclick`.`bdterceros` on((`bdclick`.`bdhistoriaclinica`.`paciente` = `bdclick`.`bdterceros`.`idSistema`))))
mariadb-version=100135
