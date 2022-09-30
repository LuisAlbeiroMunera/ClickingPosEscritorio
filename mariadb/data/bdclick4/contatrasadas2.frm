TYPE=VIEW
query=(select `bdclick4`.`bdcuota`.`id` AS `id`,`bdclick4`.`bdcuota`.`contrato` AS `contrato`,if((`contatrasadas1`.`fechaFactura` < `bdclick4`.`bdcuota`.`fecha`),\'BIEN\',if(isnull(`contatrasadas1`.`fechaFactura`),if((cast(now() as date) < `bdclick4`.`bdcuota`.`fecha`),\'BIEN\',\'ATRASADA\'),\'ATRASADA\')) AS `estado` from (`bdclick4`.`bdcuota` left join `bdclick4`.`contatrasadas1` on((`bdclick4`.`bdcuota`.`contrato` = `contatrasadas1`.`id`))) where (`bdclick4`.`bdcuota`.`total` <> `bdclick4`.`bdcuota`.`totalAbono`) group by `bdclick4`.`bdcuota`.`id`,`bdclick4`.`bdcuota`.`contrato`,if((`contatrasadas1`.`fechaFactura` < `bdclick4`.`bdcuota`.`fecha`),\'BIEN\',if(isnull(`contatrasadas1`.`fechaFactura`),if((cast(now() as date) < `bdclick4`.`bdcuota`.`fecha`),\'BIEN\',\'ATRASADA\'),\'ATRASADA\')))
md5=277260f25f0dea4e019f88f6fb071338
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:26
create-version=2
source=(select `bdcuota`.`id` AS `id`,`bdcuota`.`contrato` AS `contrato`,if((`contatrasadas1`.`fechaFactura` < `bdcuota`.`fecha`),\'BIEN\',if(isnull(`contatrasadas1`.`fechaFactura`),if((cast(now() as date) < `bdcuota`.`fecha`),\'BIEN\',\'ATRASADA\'),\'ATRASADA\')) AS `estado` from (`bdcuota` left join `contatrasadas1` on((`bdcuota`.`contrato` = `contatrasadas1`.`id`))) where (`bdcuota`.`total` <> `bdcuota`.`totalAbono`) group by `bdcuota`.`id`,`bdcuota`.`contrato`,if((`contatrasadas1`.`fechaFactura` < `bdcuota`.`fecha`),\'BIEN\',if(isnull(`contatrasadas1`.`fechaFactura`),if((cast(now() as date) < `bdcuota`.`fecha`),\'BIEN\',\'ATRASADA\'),\'ATRASADA\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`bdcuota`.`id` AS `id`,`bdclick4`.`bdcuota`.`contrato` AS `contrato`,if((`contatrasadas1`.`fechaFactura` < `bdclick4`.`bdcuota`.`fecha`),\'BIEN\',if(isnull(`contatrasadas1`.`fechaFactura`),if((cast(now() as date) < `bdclick4`.`bdcuota`.`fecha`),\'BIEN\',\'ATRASADA\'),\'ATRASADA\')) AS `estado` from (`bdclick4`.`bdcuota` left join `bdclick4`.`contatrasadas1` on((`bdclick4`.`bdcuota`.`contrato` = `contatrasadas1`.`id`))) where (`bdclick4`.`bdcuota`.`total` <> `bdclick4`.`bdcuota`.`totalAbono`) group by `bdclick4`.`bdcuota`.`id`,`bdclick4`.`bdcuota`.`contrato`,if((`contatrasadas1`.`fechaFactura` < `bdclick4`.`bdcuota`.`fecha`),\'BIEN\',if(isnull(`contatrasadas1`.`fechaFactura`),if((cast(now() as date) < `bdclick4`.`bdcuota`.`fecha`),\'BIEN\',\'ATRASADA\'),\'ATRASADA\')))
mariadb-version=100135
