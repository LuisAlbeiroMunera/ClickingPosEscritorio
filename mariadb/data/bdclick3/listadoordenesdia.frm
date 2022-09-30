TYPE=VIEW
query=select `bdclick3`.`bdordenservicio`.`id` AS `id`,`bdclick3`.`bdordenservicio`.`consecutivo` AS `consecutivo`,`bdclick3`.`bdordenservicio`.`fecha` AS `fecha`,`bdclick3`.`bdordenservicio`.`paciente` AS `paciente`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,if(((`bdclick3`.`bdconsultaclinica`.`orden` = \'\') or isnull(`bdclick3`.`bdconsultaclinica`.`orden`)),\'NO ATENDIDO\',\'ATENDIDO\') AS `estado`,`bdclick3`.`bdordenservicio`.`medico` AS `medico`,`bdclick3`.`bdordenservicio`.`hora` AS `hora` from ((`bdclick3`.`bdordenservicio` join `bdclick3`.`bdterceros` on((`bdclick3`.`bdordenservicio`.`paciente` = `bdclick3`.`bdterceros`.`idSistema`))) left join `bdclick3`.`bdconsultaclinica` on((`bdclick3`.`bdconsultaclinica`.`orden` = `bdclick3`.`bdordenservicio`.`id`))) where (`bdclick3`.`bdordenservicio`.`fecha` = cast(now() as date)) order by `bdclick3`.`bdordenservicio`.`hora`
md5=5289729e5065b8c0a92df0d713c8f2e0
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:51
create-version=2
source=select `bdordenservicio`.`id` AS `id`,`bdordenservicio`.`consecutivo` AS `consecutivo`,`bdordenservicio`.`fecha` AS `fecha`,`bdordenservicio`.`paciente` AS `paciente`,`bdterceros`.`nombre` AS `nombre`,if(((`bdconsultaclinica`.`orden` = \'\') or isnull(`bdconsultaclinica`.`orden`)),\'NO ATENDIDO\',\'ATENDIDO\') AS `estado`,`bdordenservicio`.`medico` AS `medico`,`bdordenservicio`.`hora` AS `hora` from ((`bdordenservicio` join `bdterceros` on((`bdordenservicio`.`paciente` = `bdterceros`.`idSistema`))) left join `bdconsultaclinica` on((`bdconsultaclinica`.`orden` = `bdordenservicio`.`id`))) where (`bdordenservicio`.`fecha` = cast(now() as date)) order by `bdordenservicio`.`hora`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdordenservicio`.`id` AS `id`,`bdclick3`.`bdordenservicio`.`consecutivo` AS `consecutivo`,`bdclick3`.`bdordenservicio`.`fecha` AS `fecha`,`bdclick3`.`bdordenservicio`.`paciente` AS `paciente`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,if(((`bdclick3`.`bdconsultaclinica`.`orden` = \'\') or isnull(`bdclick3`.`bdconsultaclinica`.`orden`)),\'NO ATENDIDO\',\'ATENDIDO\') AS `estado`,`bdclick3`.`bdordenservicio`.`medico` AS `medico`,`bdclick3`.`bdordenservicio`.`hora` AS `hora` from ((`bdclick3`.`bdordenservicio` join `bdclick3`.`bdterceros` on((`bdclick3`.`bdordenservicio`.`paciente` = `bdclick3`.`bdterceros`.`idSistema`))) left join `bdclick3`.`bdconsultaclinica` on((`bdclick3`.`bdconsultaclinica`.`orden` = `bdclick3`.`bdordenservicio`.`id`))) where (`bdclick3`.`bdordenservicio`.`fecha` = cast(now() as date)) order by `bdclick3`.`bdordenservicio`.`hora`
mariadb-version=100135
