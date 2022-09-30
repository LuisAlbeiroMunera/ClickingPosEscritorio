TYPE=VIEW
query=select `bdclick4`.`bdordenservicio`.`id` AS `id`,`bdclick4`.`bdordenservicio`.`consecutivo` AS `consecutivo`,`bdclick4`.`bdordenservicio`.`fecha` AS `fecha`,`bdclick4`.`bdordenservicio`.`paciente` AS `paciente`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,if(((`bdclick4`.`bdconsultaclinica`.`orden` = \'\') or isnull(`bdclick4`.`bdconsultaclinica`.`orden`)),\'NO ATENDIDO\',\'ATENDIDO\') AS `estado`,`bdclick4`.`bdordenservicio`.`medico` AS `medico`,`bdclick4`.`bdordenservicio`.`hora` AS `hora` from ((`bdclick4`.`bdordenservicio` join `bdclick4`.`bdterceros` on((`bdclick4`.`bdordenservicio`.`paciente` = `bdclick4`.`bdterceros`.`idSistema`))) left join `bdclick4`.`bdconsultaclinica` on((`bdclick4`.`bdconsultaclinica`.`orden` = `bdclick4`.`bdordenservicio`.`id`))) where (`bdclick4`.`bdordenservicio`.`fecha` = cast(now() as date)) order by `bdclick4`.`bdordenservicio`.`hora`
md5=3bc4d36f3c6dd091adc07a64e7459510
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:28
create-version=2
source=select `bdordenservicio`.`id` AS `id`,`bdordenservicio`.`consecutivo` AS `consecutivo`,`bdordenservicio`.`fecha` AS `fecha`,`bdordenservicio`.`paciente` AS `paciente`,`bdterceros`.`nombre` AS `nombre`,if(((`bdconsultaclinica`.`orden` = \'\') or isnull(`bdconsultaclinica`.`orden`)),\'NO ATENDIDO\',\'ATENDIDO\') AS `estado`,`bdordenservicio`.`medico` AS `medico`,`bdordenservicio`.`hora` AS `hora` from ((`bdordenservicio` join `bdterceros` on((`bdordenservicio`.`paciente` = `bdterceros`.`idSistema`))) left join `bdconsultaclinica` on((`bdconsultaclinica`.`orden` = `bdordenservicio`.`id`))) where (`bdordenservicio`.`fecha` = cast(now() as date)) order by `bdordenservicio`.`hora`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdordenservicio`.`id` AS `id`,`bdclick4`.`bdordenservicio`.`consecutivo` AS `consecutivo`,`bdclick4`.`bdordenservicio`.`fecha` AS `fecha`,`bdclick4`.`bdordenservicio`.`paciente` AS `paciente`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,if(((`bdclick4`.`bdconsultaclinica`.`orden` = \'\') or isnull(`bdclick4`.`bdconsultaclinica`.`orden`)),\'NO ATENDIDO\',\'ATENDIDO\') AS `estado`,`bdclick4`.`bdordenservicio`.`medico` AS `medico`,`bdclick4`.`bdordenservicio`.`hora` AS `hora` from ((`bdclick4`.`bdordenservicio` join `bdclick4`.`bdterceros` on((`bdclick4`.`bdordenservicio`.`paciente` = `bdclick4`.`bdterceros`.`idSistema`))) left join `bdclick4`.`bdconsultaclinica` on((`bdclick4`.`bdconsultaclinica`.`orden` = `bdclick4`.`bdordenservicio`.`id`))) where (`bdclick4`.`bdordenservicio`.`fecha` = cast(now() as date)) order by `bdclick4`.`bdordenservicio`.`hora`
mariadb-version=100135
