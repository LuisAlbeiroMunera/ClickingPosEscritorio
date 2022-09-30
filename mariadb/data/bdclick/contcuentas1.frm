TYPE=VIEW
query=(select `bdclick`.`bdcuota`.`contrato` AS `contrato`,if((`bdclick`.`bdcuota`.`totalAbono` = `bdclick`.`bdcuota`.`total`),`bdclick`.`bdcuota`.`totalAbono`,\'\') AS `total2` from `bdclick`.`bdcuota`)
md5=9eb42ea18280fde40b78c726c5c68b9a
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:23
create-version=2
source=(select `bdcuota`.`contrato` AS `contrato`,if((`bdcuota`.`totalAbono` = `bdcuota`.`total`),`bdcuota`.`totalAbono`,\'\') AS `total2` from `bdcuota`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdcuota`.`contrato` AS `contrato`,if((`bdclick`.`bdcuota`.`totalAbono` = `bdclick`.`bdcuota`.`total`),`bdclick`.`bdcuota`.`totalAbono`,\'\') AS `total2` from `bdclick`.`bdcuota`)
mariadb-version=100135
