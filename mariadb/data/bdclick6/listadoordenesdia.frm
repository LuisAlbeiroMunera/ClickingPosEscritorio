TYPE=VIEW
query=select `bdclick6`.`bdordenservicio`.`id` AS `id`,`bdclick6`.`bdordenservicio`.`consecutivo` AS `consecutivo`,`bdclick6`.`bdordenservicio`.`fecha` AS `fecha`,`bdclick6`.`bdordenservicio`.`paciente` AS `paciente`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,if(((`bdclick6`.`bdconsultaclinica`.`orden` = \'\') or isnull(`bdclick6`.`bdconsultaclinica`.`orden`)),\'NO ATENDIDO\',\'ATENDIDO\') AS `estado`,`bdclick6`.`bdordenservicio`.`medico` AS `medico`,`bdclick6`.`bdordenservicio`.`hora` AS `hora` from ((`bdclick6`.`bdordenservicio` join `bdclick6`.`bdterceros` on((`bdclick6`.`bdordenservicio`.`paciente` = `bdclick6`.`bdterceros`.`idSistema`))) left join `bdclick6`.`bdconsultaclinica` on((`bdclick6`.`bdconsultaclinica`.`orden` = `bdclick6`.`bdordenservicio`.`id`))) where (`bdclick6`.`bdordenservicio`.`fecha` = cast(now() as date)) order by `bdclick6`.`bdordenservicio`.`hora`
md5=286b7d5f8964294f3db7f42d551a0dd4
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:36
create-version=2
source=select `bdordenservicio`.`id` AS `id`,`bdordenservicio`.`consecutivo` AS `consecutivo`,`bdordenservicio`.`fecha` AS `fecha`,`bdordenservicio`.`paciente` AS `paciente`,`bdterceros`.`nombre` AS `nombre`,if(((`bdconsultaclinica`.`orden` = \'\') or isnull(`bdconsultaclinica`.`orden`)),\'NO ATENDIDO\',\'ATENDIDO\') AS `estado`,`bdordenservicio`.`medico` AS `medico`,`bdordenservicio`.`hora` AS `hora` from ((`bdordenservicio` join `bdterceros` on((`bdordenservicio`.`paciente` = `bdterceros`.`idSistema`))) left join `bdconsultaclinica` on((`bdconsultaclinica`.`orden` = `bdordenservicio`.`id`))) where (`bdordenservicio`.`fecha` = cast(now() as date)) order by `bdordenservicio`.`hora`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdordenservicio`.`id` AS `id`,`bdclick6`.`bdordenservicio`.`consecutivo` AS `consecutivo`,`bdclick6`.`bdordenservicio`.`fecha` AS `fecha`,`bdclick6`.`bdordenservicio`.`paciente` AS `paciente`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,if(((`bdclick6`.`bdconsultaclinica`.`orden` = \'\') or isnull(`bdclick6`.`bdconsultaclinica`.`orden`)),\'NO ATENDIDO\',\'ATENDIDO\') AS `estado`,`bdclick6`.`bdordenservicio`.`medico` AS `medico`,`bdclick6`.`bdordenservicio`.`hora` AS `hora` from ((`bdclick6`.`bdordenservicio` join `bdclick6`.`bdterceros` on((`bdclick6`.`bdordenservicio`.`paciente` = `bdclick6`.`bdterceros`.`idSistema`))) left join `bdclick6`.`bdconsultaclinica` on((`bdclick6`.`bdconsultaclinica`.`orden` = `bdclick6`.`bdordenservicio`.`id`))) where (`bdclick6`.`bdordenservicio`.`fecha` = cast(now() as date)) order by `bdclick6`.`bdordenservicio`.`hora`
mariadb-version=100135
