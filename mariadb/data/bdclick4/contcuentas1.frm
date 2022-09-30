TYPE=VIEW
query=(select `bdclick4`.`bdcuota`.`contrato` AS `contrato`,if((`bdclick4`.`bdcuota`.`totalAbono` = `bdclick4`.`bdcuota`.`total`),`bdclick4`.`bdcuota`.`totalAbono`,\'\') AS `total2` from `bdclick4`.`bdcuota`)
md5=c21787b0382eeff13c7ec818f2273ca0
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:26
create-version=2
source=(select `bdcuota`.`contrato` AS `contrato`,if((`bdcuota`.`totalAbono` = `bdcuota`.`total`),`bdcuota`.`totalAbono`,\'\') AS `total2` from `bdcuota`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`bdcuota`.`contrato` AS `contrato`,if((`bdclick4`.`bdcuota`.`totalAbono` = `bdclick4`.`bdcuota`.`total`),`bdclick4`.`bdcuota`.`totalAbono`,\'\') AS `total2` from `bdclick4`.`bdcuota`)
mariadb-version=100135
