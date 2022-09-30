TYPE=VIEW
query=(select `bdclick3`.`bdcuota`.`contrato` AS `contrato`,if((`bdclick3`.`bdcuota`.`totalAbono` = `bdclick3`.`bdcuota`.`total`),`bdclick3`.`bdcuota`.`totalAbono`,\'\') AS `total2` from `bdclick3`.`bdcuota`)
md5=056c75ded06b3cb56f56243950aac25d
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:49
create-version=2
source=(select `bdcuota`.`contrato` AS `contrato`,if((`bdcuota`.`totalAbono` = `bdcuota`.`total`),`bdcuota`.`totalAbono`,\'\') AS `total2` from `bdcuota`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bdcuota`.`contrato` AS `contrato`,if((`bdclick3`.`bdcuota`.`totalAbono` = `bdclick3`.`bdcuota`.`total`),`bdclick3`.`bdcuota`.`totalAbono`,\'\') AS `total2` from `bdclick3`.`bdcuota`)
mariadb-version=100135
