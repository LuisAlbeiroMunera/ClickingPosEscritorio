TYPE=VIEW
query=(select `bdclick5`.`bdcuota`.`contrato` AS `contrato`,if((`bdclick5`.`bdcuota`.`totalAbono` = `bdclick5`.`bdcuota`.`total`),`bdclick5`.`bdcuota`.`totalAbono`,\'\') AS `total2` from `bdclick5`.`bdcuota`)
md5=d5e4d98b5a0c5a4ea1d39783405ae598
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:45
create-version=2
source=(select `bdcuota`.`contrato` AS `contrato`,if((`bdcuota`.`totalAbono` = `bdcuota`.`total`),`bdcuota`.`totalAbono`,\'\') AS `total2` from `bdcuota`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`bdcuota`.`contrato` AS `contrato`,if((`bdclick5`.`bdcuota`.`totalAbono` = `bdclick5`.`bdcuota`.`total`),`bdclick5`.`bdcuota`.`totalAbono`,\'\') AS `total2` from `bdclick5`.`bdcuota`)
mariadb-version=100135
