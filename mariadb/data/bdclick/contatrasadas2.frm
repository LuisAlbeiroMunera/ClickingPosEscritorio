TYPE=VIEW
query=(select `bdclick`.`bdcuota`.`id` AS `id`,`bdclick`.`bdcuota`.`contrato` AS `contrato`,if((`contatrasadas1`.`fechaFactura` < `bdclick`.`bdcuota`.`fecha`),\'BIEN\',if(isnull(`contatrasadas1`.`fechaFactura`),if((cast(now() as date) < `bdclick`.`bdcuota`.`fecha`),\'BIEN\',\'ATRASADA\'),\'ATRASADA\')) AS `estado` from (`bdclick`.`bdcuota` left join `bdclick`.`contatrasadas1` on((`bdclick`.`bdcuota`.`contrato` = `contatrasadas1`.`id`))) where (`bdclick`.`bdcuota`.`total` <> `bdclick`.`bdcuota`.`totalAbono`) group by `bdclick`.`bdcuota`.`id`,`bdclick`.`bdcuota`.`contrato`,if((`contatrasadas1`.`fechaFactura` < `bdclick`.`bdcuota`.`fecha`),\'BIEN\',if(isnull(`contatrasadas1`.`fechaFactura`),if((cast(now() as date) < `bdclick`.`bdcuota`.`fecha`),\'BIEN\',\'ATRASADA\'),\'ATRASADA\')))
md5=abd4be4581a63ca2c4992d98b45b02f7
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:23
create-version=2
source=(select `bdcuota`.`id` AS `id`,`bdcuota`.`contrato` AS `contrato`,if((`contatrasadas1`.`fechaFactura` < `bdcuota`.`fecha`),\'BIEN\',if(isnull(`contatrasadas1`.`fechaFactura`),if((cast(now() as date) < `bdcuota`.`fecha`),\'BIEN\',\'ATRASADA\'),\'ATRASADA\')) AS `estado` from (`bdcuota` left join `contatrasadas1` on((`bdcuota`.`contrato` = `contatrasadas1`.`id`))) where (`bdcuota`.`total` <> `bdcuota`.`totalAbono`) group by `bdcuota`.`id`,`bdcuota`.`contrato`,if((`contatrasadas1`.`fechaFactura` < `bdcuota`.`fecha`),\'BIEN\',if(isnull(`contatrasadas1`.`fechaFactura`),if((cast(now() as date) < `bdcuota`.`fecha`),\'BIEN\',\'ATRASADA\'),\'ATRASADA\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdcuota`.`id` AS `id`,`bdclick`.`bdcuota`.`contrato` AS `contrato`,if((`contatrasadas1`.`fechaFactura` < `bdclick`.`bdcuota`.`fecha`),\'BIEN\',if(isnull(`contatrasadas1`.`fechaFactura`),if((cast(now() as date) < `bdclick`.`bdcuota`.`fecha`),\'BIEN\',\'ATRASADA\'),\'ATRASADA\')) AS `estado` from (`bdclick`.`bdcuota` left join `bdclick`.`contatrasadas1` on((`bdclick`.`bdcuota`.`contrato` = `contatrasadas1`.`id`))) where (`bdclick`.`bdcuota`.`total` <> `bdclick`.`bdcuota`.`totalAbono`) group by `bdclick`.`bdcuota`.`id`,`bdclick`.`bdcuota`.`contrato`,if((`contatrasadas1`.`fechaFactura` < `bdclick`.`bdcuota`.`fecha`),\'BIEN\',if(isnull(`contatrasadas1`.`fechaFactura`),if((cast(now() as date) < `bdclick`.`bdcuota`.`fecha`),\'BIEN\',\'ATRASADA\'),\'ATRASADA\')))
mariadb-version=100135
