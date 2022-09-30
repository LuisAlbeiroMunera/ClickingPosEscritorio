TYPE=VIEW
query=select `bdclick`.`bdordenservicio`.`id` AS `id`,`bdclick`.`bdordenservicio`.`consecutivo` AS `consecutivo`,`bdclick`.`bdordenservicio`.`fecha` AS `fecha`,`bdclick`.`bdordenservicio`.`paciente` AS `paciente`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,if(((`bdclick`.`bdconsultaclinica`.`orden` = \'\') or isnull(`bdclick`.`bdconsultaclinica`.`orden`)),\'NO ATENDIDO\',\'ATENDIDO\') AS `estado`,`bdclick`.`bdordenservicio`.`medico` AS `medico`,`bdclick`.`bdordenservicio`.`hora` AS `hora` from ((`bdclick`.`bdordenservicio` join `bdclick`.`bdterceros` on((`bdclick`.`bdordenservicio`.`paciente` = `bdclick`.`bdterceros`.`idSistema`))) left join `bdclick`.`bdconsultaclinica` on((`bdclick`.`bdconsultaclinica`.`orden` = `bdclick`.`bdordenservicio`.`id`))) where (`bdclick`.`bdordenservicio`.`fecha` = cast(now() as date)) order by `bdclick`.`bdordenservicio`.`hora`
md5=21dd55ad3c985abdcc6e2393230e3246
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:25
create-version=2
source=select `bdordenservicio`.`id` AS `id`,`bdordenservicio`.`consecutivo` AS `consecutivo`,`bdordenservicio`.`fecha` AS `fecha`,`bdordenservicio`.`paciente` AS `paciente`,`bdterceros`.`nombre` AS `nombre`,if(((`bdconsultaclinica`.`orden` = \'\') or isnull(`bdconsultaclinica`.`orden`)),\'NO ATENDIDO\',\'ATENDIDO\') AS `estado`,`bdordenservicio`.`medico` AS `medico`,`bdordenservicio`.`hora` AS `hora` from ((`bdordenservicio` join `bdterceros` on((`bdordenservicio`.`paciente` = `bdterceros`.`idSistema`))) left join `bdconsultaclinica` on((`bdconsultaclinica`.`orden` = `bdordenservicio`.`id`))) where (`bdordenservicio`.`fecha` = cast(now() as date)) order by `bdordenservicio`.`hora`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdordenservicio`.`id` AS `id`,`bdclick`.`bdordenservicio`.`consecutivo` AS `consecutivo`,`bdclick`.`bdordenservicio`.`fecha` AS `fecha`,`bdclick`.`bdordenservicio`.`paciente` AS `paciente`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,if(((`bdclick`.`bdconsultaclinica`.`orden` = \'\') or isnull(`bdclick`.`bdconsultaclinica`.`orden`)),\'NO ATENDIDO\',\'ATENDIDO\') AS `estado`,`bdclick`.`bdordenservicio`.`medico` AS `medico`,`bdclick`.`bdordenservicio`.`hora` AS `hora` from ((`bdclick`.`bdordenservicio` join `bdclick`.`bdterceros` on((`bdclick`.`bdordenservicio`.`paciente` = `bdclick`.`bdterceros`.`idSistema`))) left join `bdclick`.`bdconsultaclinica` on((`bdclick`.`bdconsultaclinica`.`orden` = `bdclick`.`bdordenservicio`.`id`))) where (`bdclick`.`bdordenservicio`.`fecha` = cast(now() as date)) order by `bdclick`.`bdordenservicio`.`hora`
mariadb-version=100135
