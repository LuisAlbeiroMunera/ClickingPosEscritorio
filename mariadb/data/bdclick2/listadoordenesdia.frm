TYPE=VIEW
query=select `bdclick2`.`bdordenservicio`.`id` AS `id`,`bdclick2`.`bdordenservicio`.`consecutivo` AS `consecutivo`,`bdclick2`.`bdordenservicio`.`fecha` AS `fecha`,`bdclick2`.`bdordenservicio`.`paciente` AS `paciente`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,if(((`bdclick2`.`bdconsultaclinica`.`orden` = \'\') or isnull(`bdclick2`.`bdconsultaclinica`.`orden`)),\'NO ATENDIDO\',\'ATENDIDO\') AS `estado`,`bdclick2`.`bdordenservicio`.`medico` AS `medico`,`bdclick2`.`bdordenservicio`.`hora` AS `hora` from ((`bdclick2`.`bdordenservicio` join `bdclick2`.`bdterceros` on((`bdclick2`.`bdordenservicio`.`paciente` = `bdclick2`.`bdterceros`.`idSistema`))) left join `bdclick2`.`bdconsultaclinica` on((`bdclick2`.`bdconsultaclinica`.`orden` = `bdclick2`.`bdordenservicio`.`id`))) where (`bdclick2`.`bdordenservicio`.`fecha` = cast(now() as date)) order by `bdclick2`.`bdordenservicio`.`hora`
md5=88ced5c6304e9b55311405a0a759e592
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:46
create-version=2
source=select `bdordenservicio`.`id` AS `id`,`bdordenservicio`.`consecutivo` AS `consecutivo`,`bdordenservicio`.`fecha` AS `fecha`,`bdordenservicio`.`paciente` AS `paciente`,`bdterceros`.`nombre` AS `nombre`,if(((`bdconsultaclinica`.`orden` = \'\') or isnull(`bdconsultaclinica`.`orden`)),\'NO ATENDIDO\',\'ATENDIDO\') AS `estado`,`bdordenservicio`.`medico` AS `medico`,`bdordenservicio`.`hora` AS `hora` from ((`bdordenservicio` join `bdterceros` on((`bdordenservicio`.`paciente` = `bdterceros`.`idSistema`))) left join `bdconsultaclinica` on((`bdconsultaclinica`.`orden` = `bdordenservicio`.`id`))) where (`bdordenservicio`.`fecha` = cast(now() as date)) order by `bdordenservicio`.`hora`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdordenservicio`.`id` AS `id`,`bdclick2`.`bdordenservicio`.`consecutivo` AS `consecutivo`,`bdclick2`.`bdordenservicio`.`fecha` AS `fecha`,`bdclick2`.`bdordenservicio`.`paciente` AS `paciente`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,if(((`bdclick2`.`bdconsultaclinica`.`orden` = \'\') or isnull(`bdclick2`.`bdconsultaclinica`.`orden`)),\'NO ATENDIDO\',\'ATENDIDO\') AS `estado`,`bdclick2`.`bdordenservicio`.`medico` AS `medico`,`bdclick2`.`bdordenservicio`.`hora` AS `hora` from ((`bdclick2`.`bdordenservicio` join `bdclick2`.`bdterceros` on((`bdclick2`.`bdordenservicio`.`paciente` = `bdclick2`.`bdterceros`.`idSistema`))) left join `bdclick2`.`bdconsultaclinica` on((`bdclick2`.`bdconsultaclinica`.`orden` = `bdclick2`.`bdordenservicio`.`id`))) where (`bdclick2`.`bdordenservicio`.`fecha` = cast(now() as date)) order by `bdclick2`.`bdordenservicio`.`hora`
mariadb-version=100135
