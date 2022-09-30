TYPE=VIEW
query=select `bdclick5`.`bdterceros`.`id` AS `IdTercero`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdterceros`.`telefono` AS `telefono`,`bdclick5`.`bdterceros`.`direccion` AS `direccion`,`bdclick5`.`bdterceros`.`regimen` AS `regimen`,`bdclick5`.`bdterceros`.`sexo` AS `sexo`,`bdclick5`.`bdepsprecargados`.`nombre` AS `nombreEps`,`bdclick5`.`bdterceros`.`tipo2` AS `tipo2`,cast(((cast(now() as date) - `bdclick5`.`bdterceros`.`nacimiento`) / 365) as signed) AS `Edad`,`bdclick5`.`bdconsultaclinica`.`talla` AS `talla`,`bdclick5`.`bdconsultaclinica`.`abdominal` AS `abdominal`,`bdclick5`.`bdconsultaclinica`.`historia` AS `historia` from ((((`bdclick5`.`bdconsultaclinica` left join `bdclick5`.`bdhistoriaclinica` on((`bdclick5`.`bdconsultaclinica`.`historia` = `bdclick5`.`bdhistoriaclinica`.`id`))) left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdhistoriaclinica`.`paciente` = `bdclick5`.`bdterceros`.`idSistema`))) left join `bdclick5`.`bdepsprecargados` on((`bdclick5`.`bdterceros`.`eps` = `bdclick5`.`bdepsprecargados`.`Id`))) left join `bdclick5`.`bdseguimientoclinica` on((`bdclick5`.`bdseguimientoclinica`.`consulta` = `bdclick5`.`bdconsultaclinica`.`Id`))) group by `bdclick5`.`bdterceros`.`idSistema`,`bdclick5`.`bdconsultaclinica`.`historia` desc
md5=de13e5aca2908f337c57b94743a17316
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:45
create-version=2
source=select `bdterceros`.`id` AS `IdTercero`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`regimen` AS `regimen`,`bdterceros`.`sexo` AS `sexo`,`bdepsprecargados`.`nombre` AS `nombreEps`,`bdterceros`.`tipo2` AS `tipo2`,cast(((cast(now() as date) - `bdterceros`.`nacimiento`) / 365) as signed) AS `Edad`,`bdconsultaclinica`.`talla` AS `talla`,`bdconsultaclinica`.`abdominal` AS `abdominal`,`bdconsultaclinica`.`historia` AS `historia` from ((((`bdconsultaclinica` left join `bdhistoriaclinica` on((`bdconsultaclinica`.`historia` = `bdhistoriaclinica`.`id`))) left join `bdterceros` on((`bdhistoriaclinica`.`paciente` = `bdterceros`.`idSistema`))) left join `bdepsprecargados` on((`bdterceros`.`eps` = `bdepsprecargados`.`Id`))) left join `bdseguimientoclinica` on((`bdseguimientoclinica`.`consulta` = `bdconsultaclinica`.`Id`))) group by `bdterceros`.`idSistema`,`bdconsultaclinica`.`historia` desc
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdterceros`.`id` AS `IdTercero`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdterceros`.`telefono` AS `telefono`,`bdclick5`.`bdterceros`.`direccion` AS `direccion`,`bdclick5`.`bdterceros`.`regimen` AS `regimen`,`bdclick5`.`bdterceros`.`sexo` AS `sexo`,`bdclick5`.`bdepsprecargados`.`nombre` AS `nombreEps`,`bdclick5`.`bdterceros`.`tipo2` AS `tipo2`,cast(((cast(now() as date) - `bdclick5`.`bdterceros`.`nacimiento`) / 365) as signed) AS `Edad`,`bdclick5`.`bdconsultaclinica`.`talla` AS `talla`,`bdclick5`.`bdconsultaclinica`.`abdominal` AS `abdominal`,`bdclick5`.`bdconsultaclinica`.`historia` AS `historia` from ((((`bdclick5`.`bdconsultaclinica` left join `bdclick5`.`bdhistoriaclinica` on((`bdclick5`.`bdconsultaclinica`.`historia` = `bdclick5`.`bdhistoriaclinica`.`id`))) left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdhistoriaclinica`.`paciente` = `bdclick5`.`bdterceros`.`idSistema`))) left join `bdclick5`.`bdepsprecargados` on((`bdclick5`.`bdterceros`.`eps` = `bdclick5`.`bdepsprecargados`.`Id`))) left join `bdclick5`.`bdseguimientoclinica` on((`bdclick5`.`bdseguimientoclinica`.`consulta` = `bdclick5`.`bdconsultaclinica`.`Id`))) group by `bdclick5`.`bdterceros`.`idSistema`,`bdclick5`.`bdconsultaclinica`.`historia` desc
mariadb-version=100135