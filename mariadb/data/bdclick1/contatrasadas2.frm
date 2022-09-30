TYPE=VIEW
query=(select `bdclick1`.`bdcuota`.`id` AS `id`,`bdclick1`.`bdcuota`.`contrato` AS `contrato`,if((`contatrasadas1`.`fechaFactura` < `bdclick1`.`bdcuota`.`fecha`),\'BIEN\',if(isnull(`contatrasadas1`.`fechaFactura`),if((cast(now() as date) < `bdclick1`.`bdcuota`.`fecha`),\'BIEN\',\'ATRASADA\'),\'ATRASADA\')) AS `estado` from (`bdclick1`.`bdcuota` left join `bdclick1`.`contatrasadas1` on((`bdclick1`.`bdcuota`.`contrato` = `contatrasadas1`.`id`))) where (`bdclick1`.`bdcuota`.`total` <> `bdclick1`.`bdcuota`.`totalAbono`) group by `bdclick1`.`bdcuota`.`id`,`bdclick1`.`bdcuota`.`contrato`,if((`contatrasadas1`.`fechaFactura` < `bdclick1`.`bdcuota`.`fecha`),\'BIEN\',if(isnull(`contatrasadas1`.`fechaFactura`),if((cast(now() as date) < `bdclick1`.`bdcuota`.`fecha`),\'BIEN\',\'ATRASADA\'),\'ATRASADA\')))
md5=b04ea764bd5595ce266b0ce008d36edc
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:33
create-version=2
source=(select `bdcuota`.`id` AS `id`,`bdcuota`.`contrato` AS `contrato`,if((`contatrasadas1`.`fechaFactura` < `bdcuota`.`fecha`),\'BIEN\',if(isnull(`contatrasadas1`.`fechaFactura`),if((cast(now() as date) < `bdcuota`.`fecha`),\'BIEN\',\'ATRASADA\'),\'ATRASADA\')) AS `estado` from (`bdcuota` left join `contatrasadas1` on((`bdcuota`.`contrato` = `contatrasadas1`.`id`))) where (`bdcuota`.`total` <> `bdcuota`.`totalAbono`) group by `bdcuota`.`id`,`bdcuota`.`contrato`,if((`contatrasadas1`.`fechaFactura` < `bdcuota`.`fecha`),\'BIEN\',if(isnull(`contatrasadas1`.`fechaFactura`),if((cast(now() as date) < `bdcuota`.`fecha`),\'BIEN\',\'ATRASADA\'),\'ATRASADA\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick1`.`bdcuota`.`id` AS `id`,`bdclick1`.`bdcuota`.`contrato` AS `contrato`,if((`contatrasadas1`.`fechaFactura` < `bdclick1`.`bdcuota`.`fecha`),\'BIEN\',if(isnull(`contatrasadas1`.`fechaFactura`),if((cast(now() as date) < `bdclick1`.`bdcuota`.`fecha`),\'BIEN\',\'ATRASADA\'),\'ATRASADA\')) AS `estado` from (`bdclick1`.`bdcuota` left join `bdclick1`.`contatrasadas1` on((`bdclick1`.`bdcuota`.`contrato` = `contatrasadas1`.`id`))) where (`bdclick1`.`bdcuota`.`total` <> `bdclick1`.`bdcuota`.`totalAbono`) group by `bdclick1`.`bdcuota`.`id`,`bdclick1`.`bdcuota`.`contrato`,if((`contatrasadas1`.`fechaFactura` < `bdclick1`.`bdcuota`.`fecha`),\'BIEN\',if(isnull(`contatrasadas1`.`fechaFactura`),if((cast(now() as date) < `bdclick1`.`bdcuota`.`fecha`),\'BIEN\',\'ATRASADA\'),\'ATRASADA\')))
mariadb-version=100135
