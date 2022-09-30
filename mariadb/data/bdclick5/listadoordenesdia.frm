TYPE=VIEW
query=select `bdclick5`.`bdordenservicio`.`id` AS `id`,`bdclick5`.`bdordenservicio`.`consecutivo` AS `consecutivo`,`bdclick5`.`bdordenservicio`.`fecha` AS `fecha`,`bdclick5`.`bdordenservicio`.`paciente` AS `paciente`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,if(((`bdclick5`.`bdconsultaclinica`.`orden` = \'\') or isnull(`bdclick5`.`bdconsultaclinica`.`orden`)),\'NO ATENDIDO\',\'ATENDIDO\') AS `estado`,`bdclick5`.`bdordenservicio`.`medico` AS `medico`,`bdclick5`.`bdordenservicio`.`hora` AS `hora` from ((`bdclick5`.`bdordenservicio` join `bdclick5`.`bdterceros` on((`bdclick5`.`bdordenservicio`.`paciente` = `bdclick5`.`bdterceros`.`idSistema`))) left join `bdclick5`.`bdconsultaclinica` on((`bdclick5`.`bdconsultaclinica`.`orden` = `bdclick5`.`bdordenservicio`.`id`))) where (`bdclick5`.`bdordenservicio`.`fecha` = cast(now() as date)) order by `bdclick5`.`bdordenservicio`.`hora`
md5=76697f0d842f3ce9d00377ee18cfe584
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:47
create-version=2
source=select `bdordenservicio`.`id` AS `id`,`bdordenservicio`.`consecutivo` AS `consecutivo`,`bdordenservicio`.`fecha` AS `fecha`,`bdordenservicio`.`paciente` AS `paciente`,`bdterceros`.`nombre` AS `nombre`,if(((`bdconsultaclinica`.`orden` = \'\') or isnull(`bdconsultaclinica`.`orden`)),\'NO ATENDIDO\',\'ATENDIDO\') AS `estado`,`bdordenservicio`.`medico` AS `medico`,`bdordenservicio`.`hora` AS `hora` from ((`bdordenservicio` join `bdterceros` on((`bdordenservicio`.`paciente` = `bdterceros`.`idSistema`))) left join `bdconsultaclinica` on((`bdconsultaclinica`.`orden` = `bdordenservicio`.`id`))) where (`bdordenservicio`.`fecha` = cast(now() as date)) order by `bdordenservicio`.`hora`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdordenservicio`.`id` AS `id`,`bdclick5`.`bdordenservicio`.`consecutivo` AS `consecutivo`,`bdclick5`.`bdordenservicio`.`fecha` AS `fecha`,`bdclick5`.`bdordenservicio`.`paciente` AS `paciente`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,if(((`bdclick5`.`bdconsultaclinica`.`orden` = \'\') or isnull(`bdclick5`.`bdconsultaclinica`.`orden`)),\'NO ATENDIDO\',\'ATENDIDO\') AS `estado`,`bdclick5`.`bdordenservicio`.`medico` AS `medico`,`bdclick5`.`bdordenservicio`.`hora` AS `hora` from ((`bdclick5`.`bdordenservicio` join `bdclick5`.`bdterceros` on((`bdclick5`.`bdordenservicio`.`paciente` = `bdclick5`.`bdterceros`.`idSistema`))) left join `bdclick5`.`bdconsultaclinica` on((`bdclick5`.`bdconsultaclinica`.`orden` = `bdclick5`.`bdordenservicio`.`id`))) where (`bdclick5`.`bdordenservicio`.`fecha` = cast(now() as date)) order by `bdclick5`.`bdordenservicio`.`hora`
mariadb-version=100135
