TYPE=VIEW
query=(select `bdclick1`.`bdcuota`.`contrato` AS `contrato`,if((`bdclick1`.`bdcuota`.`totalAbono` = `bdclick1`.`bdcuota`.`total`),`bdclick1`.`bdcuota`.`totalAbono`,\'\') AS `total2` from `bdclick1`.`bdcuota`)
md5=0f6e3c85ea6247773b315d1b54804b3b
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:33
create-version=2
source=(select `bdcuota`.`contrato` AS `contrato`,if((`bdcuota`.`totalAbono` = `bdcuota`.`total`),`bdcuota`.`totalAbono`,\'\') AS `total2` from `bdcuota`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick1`.`bdcuota`.`contrato` AS `contrato`,if((`bdclick1`.`bdcuota`.`totalAbono` = `bdclick1`.`bdcuota`.`total`),`bdclick1`.`bdcuota`.`totalAbono`,\'\') AS `total2` from `bdclick1`.`bdcuota`)
mariadb-version=100135
