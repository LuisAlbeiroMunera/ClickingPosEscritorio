TYPE=VIEW
query=(select `bdclick3`.`bdcuota`.`id` AS `id`,`bdclick3`.`bdcuota`.`contrato` AS `contrato`,if((`contatrasadas1`.`fechaFactura` < `bdclick3`.`bdcuota`.`fecha`),\'BIEN\',if(isnull(`contatrasadas1`.`fechaFactura`),if((cast(now() as date) < `bdclick3`.`bdcuota`.`fecha`),\'BIEN\',\'ATRASADA\'),\'ATRASADA\')) AS `estado` from (`bdclick3`.`bdcuota` left join `bdclick3`.`contatrasadas1` on((`bdclick3`.`bdcuota`.`contrato` = `contatrasadas1`.`id`))) where (`bdclick3`.`bdcuota`.`total` <> `bdclick3`.`bdcuota`.`totalAbono`) group by `bdclick3`.`bdcuota`.`id`,`bdclick3`.`bdcuota`.`contrato`,if((`contatrasadas1`.`fechaFactura` < `bdclick3`.`bdcuota`.`fecha`),\'BIEN\',if(isnull(`contatrasadas1`.`fechaFactura`),if((cast(now() as date) < `bdclick3`.`bdcuota`.`fecha`),\'BIEN\',\'ATRASADA\'),\'ATRASADA\')))
md5=ca149d42b2f4f499a5eb4e78dc7c6619
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:49
create-version=2
source=(select `bdcuota`.`id` AS `id`,`bdcuota`.`contrato` AS `contrato`,if((`contatrasadas1`.`fechaFactura` < `bdcuota`.`fecha`),\'BIEN\',if(isnull(`contatrasadas1`.`fechaFactura`),if((cast(now() as date) < `bdcuota`.`fecha`),\'BIEN\',\'ATRASADA\'),\'ATRASADA\')) AS `estado` from (`bdcuota` left join `contatrasadas1` on((`bdcuota`.`contrato` = `contatrasadas1`.`id`))) where (`bdcuota`.`total` <> `bdcuota`.`totalAbono`) group by `bdcuota`.`id`,`bdcuota`.`contrato`,if((`contatrasadas1`.`fechaFactura` < `bdcuota`.`fecha`),\'BIEN\',if(isnull(`contatrasadas1`.`fechaFactura`),if((cast(now() as date) < `bdcuota`.`fecha`),\'BIEN\',\'ATRASADA\'),\'ATRASADA\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bdcuota`.`id` AS `id`,`bdclick3`.`bdcuota`.`contrato` AS `contrato`,if((`contatrasadas1`.`fechaFactura` < `bdclick3`.`bdcuota`.`fecha`),\'BIEN\',if(isnull(`contatrasadas1`.`fechaFactura`),if((cast(now() as date) < `bdclick3`.`bdcuota`.`fecha`),\'BIEN\',\'ATRASADA\'),\'ATRASADA\')) AS `estado` from (`bdclick3`.`bdcuota` left join `bdclick3`.`contatrasadas1` on((`bdclick3`.`bdcuota`.`contrato` = `contatrasadas1`.`id`))) where (`bdclick3`.`bdcuota`.`total` <> `bdclick3`.`bdcuota`.`totalAbono`) group by `bdclick3`.`bdcuota`.`id`,`bdclick3`.`bdcuota`.`contrato`,if((`contatrasadas1`.`fechaFactura` < `bdclick3`.`bdcuota`.`fecha`),\'BIEN\',if(isnull(`contatrasadas1`.`fechaFactura`),if((cast(now() as date) < `bdclick3`.`bdcuota`.`fecha`),\'BIEN\',\'ATRASADA\'),\'ATRASADA\')))
mariadb-version=100135
