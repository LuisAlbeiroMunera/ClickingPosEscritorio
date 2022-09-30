TYPE=VIEW
query=(select `bdclick2`.`bdcuota`.`contrato` AS `contrato`,if((`bdclick2`.`bdcuota`.`totalAbono` = `bdclick2`.`bdcuota`.`total`),`bdclick2`.`bdcuota`.`totalAbono`,\'\') AS `total2` from `bdclick2`.`bdcuota`)
md5=7e439749a52726755e4f2cb2d92748a3
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:44
create-version=2
source=(select `bdcuota`.`contrato` AS `contrato`,if((`bdcuota`.`totalAbono` = `bdcuota`.`total`),`bdcuota`.`totalAbono`,\'\') AS `total2` from `bdcuota`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick2`.`bdcuota`.`contrato` AS `contrato`,if((`bdclick2`.`bdcuota`.`totalAbono` = `bdclick2`.`bdcuota`.`total`),`bdclick2`.`bdcuota`.`totalAbono`,\'\') AS `total2` from `bdclick2`.`bdcuota`)
mariadb-version=100135
