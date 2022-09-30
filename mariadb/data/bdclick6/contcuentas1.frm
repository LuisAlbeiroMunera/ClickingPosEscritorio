TYPE=VIEW
query=(select `bdclick6`.`bdcuota`.`contrato` AS `contrato`,if((`bdclick6`.`bdcuota`.`totalAbono` = `bdclick6`.`bdcuota`.`total`),`bdclick6`.`bdcuota`.`totalAbono`,\'\') AS `total2` from `bdclick6`.`bdcuota`)
md5=261f548680e199fa49aced825b330750
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:34
create-version=2
source=(select `bdcuota`.`contrato` AS `contrato`,if((`bdcuota`.`totalAbono` = `bdcuota`.`total`),`bdcuota`.`totalAbono`,\'\') AS `total2` from `bdcuota`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bdcuota`.`contrato` AS `contrato`,if((`bdclick6`.`bdcuota`.`totalAbono` = `bdclick6`.`bdcuota`.`total`),`bdclick6`.`bdcuota`.`totalAbono`,\'\') AS `total2` from `bdclick6`.`bdcuota`)
mariadb-version=100135
