TYPE=VIEW
query=select `bdclick3`.`bdterceros`.`id` AS `IdTercero`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdterceros`.`telefono` AS `telefono`,`bdclick3`.`bdterceros`.`direccion` AS `direccion`,`bdclick3`.`bdterceros`.`regimen` AS `regimen`,`bdclick3`.`bdterceros`.`sexo` AS `sexo`,`bdclick3`.`bdepsprecargados`.`nombre` AS `nombreEps`,`bdclick3`.`bdterceros`.`tipo2` AS `tipo2`,cast(((cast(now() as date) - `bdclick3`.`bdterceros`.`nacimiento`) / 365) as signed) AS `Edad`,`bdclick3`.`bdconsultaclinica`.`talla` AS `talla`,`bdclick3`.`bdconsultaclinica`.`abdominal` AS `abdominal`,`bdclick3`.`bdconsultaclinica`.`historia` AS `historia` from ((((`bdclick3`.`bdconsultaclinica` left join `bdclick3`.`bdhistoriaclinica` on((`bdclick3`.`bdconsultaclinica`.`historia` = `bdclick3`.`bdhistoriaclinica`.`id`))) left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdhistoriaclinica`.`paciente` = `bdclick3`.`bdterceros`.`idSistema`))) left join `bdclick3`.`bdepsprecargados` on((`bdclick3`.`bdterceros`.`eps` = `bdclick3`.`bdepsprecargados`.`Id`))) left join `bdclick3`.`bdseguimientoclinica` on((`bdclick3`.`bdseguimientoclinica`.`consulta` = `bdclick3`.`bdconsultaclinica`.`Id`))) group by `bdclick3`.`bdterceros`.`idSistema`,`bdclick3`.`bdconsultaclinica`.`historia` desc
md5=5575b5070b7de24d0d8fc731ba676dec
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:49
create-version=2
source=select `bdterceros`.`id` AS `IdTercero`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`regimen` AS `regimen`,`bdterceros`.`sexo` AS `sexo`,`bdepsprecargados`.`nombre` AS `nombreEps`,`bdterceros`.`tipo2` AS `tipo2`,cast(((cast(now() as date) - `bdterceros`.`nacimiento`) / 365) as signed) AS `Edad`,`bdconsultaclinica`.`talla` AS `talla`,`bdconsultaclinica`.`abdominal` AS `abdominal`,`bdconsultaclinica`.`historia` AS `historia` from ((((`bdconsultaclinica` left join `bdhistoriaclinica` on((`bdconsultaclinica`.`historia` = `bdhistoriaclinica`.`id`))) left join `bdterceros` on((`bdhistoriaclinica`.`paciente` = `bdterceros`.`idSistema`))) left join `bdepsprecargados` on((`bdterceros`.`eps` = `bdepsprecargados`.`Id`))) left join `bdseguimientoclinica` on((`bdseguimientoclinica`.`consulta` = `bdconsultaclinica`.`Id`))) group by `bdterceros`.`idSistema`,`bdconsultaclinica`.`historia` desc
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdterceros`.`id` AS `IdTercero`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdterceros`.`telefono` AS `telefono`,`bdclick3`.`bdterceros`.`direccion` AS `direccion`,`bdclick3`.`bdterceros`.`regimen` AS `regimen`,`bdclick3`.`bdterceros`.`sexo` AS `sexo`,`bdclick3`.`bdepsprecargados`.`nombre` AS `nombreEps`,`bdclick3`.`bdterceros`.`tipo2` AS `tipo2`,cast(((cast(now() as date) - `bdclick3`.`bdterceros`.`nacimiento`) / 365) as signed) AS `Edad`,`bdclick3`.`bdconsultaclinica`.`talla` AS `talla`,`bdclick3`.`bdconsultaclinica`.`abdominal` AS `abdominal`,`bdclick3`.`bdconsultaclinica`.`historia` AS `historia` from ((((`bdclick3`.`bdconsultaclinica` left join `bdclick3`.`bdhistoriaclinica` on((`bdclick3`.`bdconsultaclinica`.`historia` = `bdclick3`.`bdhistoriaclinica`.`id`))) left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdhistoriaclinica`.`paciente` = `bdclick3`.`bdterceros`.`idSistema`))) left join `bdclick3`.`bdepsprecargados` on((`bdclick3`.`bdterceros`.`eps` = `bdclick3`.`bdepsprecargados`.`Id`))) left join `bdclick3`.`bdseguimientoclinica` on((`bdclick3`.`bdseguimientoclinica`.`consulta` = `bdclick3`.`bdconsultaclinica`.`Id`))) group by `bdclick3`.`bdterceros`.`idSistema`,`bdclick3`.`bdconsultaclinica`.`historia` desc
mariadb-version=100135
