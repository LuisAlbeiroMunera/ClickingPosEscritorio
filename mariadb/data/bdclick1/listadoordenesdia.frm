TYPE=VIEW
query=select `bdclick1`.`bdordenservicio`.`id` AS `id`,`bdclick1`.`bdordenservicio`.`consecutivo` AS `consecutivo`,`bdclick1`.`bdordenservicio`.`fecha` AS `fecha`,`bdclick1`.`bdordenservicio`.`paciente` AS `paciente`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,if(((`bdclick1`.`bdconsultaclinica`.`orden` = \'\') or isnull(`bdclick1`.`bdconsultaclinica`.`orden`)),\'NO ATENDIDO\',\'ATENDIDO\') AS `estado`,`bdclick1`.`bdordenservicio`.`medico` AS `medico`,`bdclick1`.`bdordenservicio`.`hora` AS `hora` from ((`bdclick1`.`bdordenservicio` join `bdclick1`.`bdterceros` on((`bdclick1`.`bdordenservicio`.`paciente` = `bdclick1`.`bdterceros`.`idSistema`))) left join `bdclick1`.`bdconsultaclinica` on((`bdclick1`.`bdconsultaclinica`.`orden` = `bdclick1`.`bdordenservicio`.`id`))) where (`bdclick1`.`bdordenservicio`.`fecha` = cast(now() as date)) order by `bdclick1`.`bdordenservicio`.`hora`
md5=c59e2cd22ef41faa323e818b9a909279
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:35
create-version=2
source=select `bdordenservicio`.`id` AS `id`,`bdordenservicio`.`consecutivo` AS `consecutivo`,`bdordenservicio`.`fecha` AS `fecha`,`bdordenservicio`.`paciente` AS `paciente`,`bdterceros`.`nombre` AS `nombre`,if(((`bdconsultaclinica`.`orden` = \'\') or isnull(`bdconsultaclinica`.`orden`)),\'NO ATENDIDO\',\'ATENDIDO\') AS `estado`,`bdordenservicio`.`medico` AS `medico`,`bdordenservicio`.`hora` AS `hora` from ((`bdordenservicio` join `bdterceros` on((`bdordenservicio`.`paciente` = `bdterceros`.`idSistema`))) left join `bdconsultaclinica` on((`bdconsultaclinica`.`orden` = `bdordenservicio`.`id`))) where (`bdordenservicio`.`fecha` = cast(now() as date)) order by `bdordenservicio`.`hora`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdordenservicio`.`id` AS `id`,`bdclick1`.`bdordenservicio`.`consecutivo` AS `consecutivo`,`bdclick1`.`bdordenservicio`.`fecha` AS `fecha`,`bdclick1`.`bdordenservicio`.`paciente` AS `paciente`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,if(((`bdclick1`.`bdconsultaclinica`.`orden` = \'\') or isnull(`bdclick1`.`bdconsultaclinica`.`orden`)),\'NO ATENDIDO\',\'ATENDIDO\') AS `estado`,`bdclick1`.`bdordenservicio`.`medico` AS `medico`,`bdclick1`.`bdordenservicio`.`hora` AS `hora` from ((`bdclick1`.`bdordenservicio` join `bdclick1`.`bdterceros` on((`bdclick1`.`bdordenservicio`.`paciente` = `bdclick1`.`bdterceros`.`idSistema`))) left join `bdclick1`.`bdconsultaclinica` on((`bdclick1`.`bdconsultaclinica`.`orden` = `bdclick1`.`bdordenservicio`.`id`))) where (`bdclick1`.`bdordenservicio`.`fecha` = cast(now() as date)) order by `bdclick1`.`bdordenservicio`.`hora`
mariadb-version=100135
