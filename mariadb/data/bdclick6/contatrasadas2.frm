TYPE=VIEW
query=(select `bdclick6`.`bdcuota`.`id` AS `id`,`bdclick6`.`bdcuota`.`contrato` AS `contrato`,if((`contatrasadas1`.`fechaFactura` < `bdclick6`.`bdcuota`.`fecha`),\'BIEN\',if(isnull(`contatrasadas1`.`fechaFactura`),if((cast(now() as date) < `bdclick6`.`bdcuota`.`fecha`),\'BIEN\',\'ATRASADA\'),\'ATRASADA\')) AS `estado` from (`bdclick6`.`bdcuota` left join `bdclick6`.`contatrasadas1` on((`bdclick6`.`bdcuota`.`contrato` = `contatrasadas1`.`id`))) where (`bdclick6`.`bdcuota`.`total` <> `bdclick6`.`bdcuota`.`totalAbono`) group by `bdclick6`.`bdcuota`.`id`,`bdclick6`.`bdcuota`.`contrato`,if((`contatrasadas1`.`fechaFactura` < `bdclick6`.`bdcuota`.`fecha`),\'BIEN\',if(isnull(`contatrasadas1`.`fechaFactura`),if((cast(now() as date) < `bdclick6`.`bdcuota`.`fecha`),\'BIEN\',\'ATRASADA\'),\'ATRASADA\')))
md5=69c3570d70792c7f49734830ff36d5a9
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:34
create-version=2
source=(select `bdcuota`.`id` AS `id`,`bdcuota`.`contrato` AS `contrato`,if((`contatrasadas1`.`fechaFactura` < `bdcuota`.`fecha`),\'BIEN\',if(isnull(`contatrasadas1`.`fechaFactura`),if((cast(now() as date) < `bdcuota`.`fecha`),\'BIEN\',\'ATRASADA\'),\'ATRASADA\')) AS `estado` from (`bdcuota` left join `contatrasadas1` on((`bdcuota`.`contrato` = `contatrasadas1`.`id`))) where (`bdcuota`.`total` <> `bdcuota`.`totalAbono`) group by `bdcuota`.`id`,`bdcuota`.`contrato`,if((`contatrasadas1`.`fechaFactura` < `bdcuota`.`fecha`),\'BIEN\',if(isnull(`contatrasadas1`.`fechaFactura`),if((cast(now() as date) < `bdcuota`.`fecha`),\'BIEN\',\'ATRASADA\'),\'ATRASADA\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bdcuota`.`id` AS `id`,`bdclick6`.`bdcuota`.`contrato` AS `contrato`,if((`contatrasadas1`.`fechaFactura` < `bdclick6`.`bdcuota`.`fecha`),\'BIEN\',if(isnull(`contatrasadas1`.`fechaFactura`),if((cast(now() as date) < `bdclick6`.`bdcuota`.`fecha`),\'BIEN\',\'ATRASADA\'),\'ATRASADA\')) AS `estado` from (`bdclick6`.`bdcuota` left join `bdclick6`.`contatrasadas1` on((`bdclick6`.`bdcuota`.`contrato` = `contatrasadas1`.`id`))) where (`bdclick6`.`bdcuota`.`total` <> `bdclick6`.`bdcuota`.`totalAbono`) group by `bdclick6`.`bdcuota`.`id`,`bdclick6`.`bdcuota`.`contrato`,if((`contatrasadas1`.`fechaFactura` < `bdclick6`.`bdcuota`.`fecha`),\'BIEN\',if(isnull(`contatrasadas1`.`fechaFactura`),if((cast(now() as date) < `bdclick6`.`bdcuota`.`fecha`),\'BIEN\',\'ATRASADA\'),\'ATRASADA\')))
mariadb-version=100135
