TYPE=VIEW
query=select `bdclick`.`conconveniopendiente2`.`Id` AS `Id`,`bdclick`.`conconveniopendiente2`.`nit` AS `nit`,`bdclick`.`conconveniopendiente2`.`montoTotal` AS `montoTotal`,`bdclick`.`conconveniopendiente2`.`total2` AS `total`,`bdclick`.`conconveniopendiente2`.`convenio` AS `convenio`,`bdclick`.`conconveniopendiente2`.`fechaFinalizacion` AS `fechaFinalizacion`,if((`bdclick`.`conconveniopendiente2`.`fechaFinalizacion` < cast(now() as date)),if((`bdclick`.`conconveniopendiente2`.`montoTotal` < `bdclick`.`conconveniopendiente2`.`total2`),\'FINALIZADO3\',\'FINALIZADO1\'),if((`bdclick`.`conconveniopendiente2`.`montoTotal` < `bdclick`.`conconveniopendiente2`.`total2`),\'FINALIZADO2\',\'PENDIENTE\')) AS `estado` from `bdclick`.`conconveniopendiente2`
md5=e5c65dcbe48f4ca2f52c547d49fa1b78
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:22
create-version=2
source=select `conconveniopendiente2`.`Id` AS `Id`,`conconveniopendiente2`.`nit` AS `nit`,`conconveniopendiente2`.`montoTotal` AS `montoTotal`,`conconveniopendiente2`.`total2` AS `total`,`conconveniopendiente2`.`convenio` AS `convenio`,`conconveniopendiente2`.`fechaFinalizacion` AS `fechaFinalizacion`,if((`conconveniopendiente2`.`fechaFinalizacion` < cast(now() as date)),if((`conconveniopendiente2`.`montoTotal` < `conconveniopendiente2`.`total2`),\'FINALIZADO3\',\'FINALIZADO1\'),if((`conconveniopendiente2`.`montoTotal` < `conconveniopendiente2`.`total2`),\'FINALIZADO2\',\'PENDIENTE\')) AS `estado` from `conconveniopendiente2`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`conconveniopendiente2`.`Id` AS `Id`,`bdclick`.`conconveniopendiente2`.`nit` AS `nit`,`bdclick`.`conconveniopendiente2`.`montoTotal` AS `montoTotal`,`bdclick`.`conconveniopendiente2`.`total2` AS `total`,`bdclick`.`conconveniopendiente2`.`convenio` AS `convenio`,`bdclick`.`conconveniopendiente2`.`fechaFinalizacion` AS `fechaFinalizacion`,if((`bdclick`.`conconveniopendiente2`.`fechaFinalizacion` < cast(now() as date)),if((`bdclick`.`conconveniopendiente2`.`montoTotal` < `bdclick`.`conconveniopendiente2`.`total2`),\'FINALIZADO3\',\'FINALIZADO1\'),if((`bdclick`.`conconveniopendiente2`.`montoTotal` < `bdclick`.`conconveniopendiente2`.`total2`),\'FINALIZADO2\',\'PENDIENTE\')) AS `estado` from `bdclick`.`conconveniopendiente2`
mariadb-version=100135
