TYPE=VIEW
query=select `bdclick6`.`bdcuota`.`contrato` AS `contrato`,`bdclick6`.`bdcuota`.`numCuota` AS `numCuota`,if((`bdclick6`.`bdcuota`.`totalAbono` = `bdclick6`.`bdcuota`.`total`),\'OK\',if((cast(now() as date) > `bdclick6`.`bdcuota`.`fecha`),\'VENCIDA\',\'PENDIENTE\')) AS `estado`,`bdclick6`.`bdprestamo`.`factura` AS `factura`,`bdclick6`.`bdcuota`.`fecha` AS `fecha` from (`bdclick6`.`bdcuota` join `bdclick6`.`bdprestamo` on((`bdclick6`.`bdcuota`.`contrato` = `bdclick6`.`bdprestamo`.`contrato`)))
md5=724222ed4e92b5de451e1101cd91a434
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:35
create-version=2
source=select `bdcuota`.`contrato` AS `contrato`,`bdcuota`.`numCuota` AS `numCuota`,if((`bdcuota`.`totalAbono` = `bdcuota`.`total`),\'OK\',if((cast(now() as date) > `bdcuota`.`fecha`),\'VENCIDA\',\'PENDIENTE\')) AS `estado`,`bdprestamo`.`factura` AS `factura`,`bdcuota`.`fecha` AS `fecha` from (`bdcuota` join `bdprestamo` on((`bdcuota`.`contrato` = `bdprestamo`.`contrato`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdcuota`.`contrato` AS `contrato`,`bdclick6`.`bdcuota`.`numCuota` AS `numCuota`,if((`bdclick6`.`bdcuota`.`totalAbono` = `bdclick6`.`bdcuota`.`total`),\'OK\',if((cast(now() as date) > `bdclick6`.`bdcuota`.`fecha`),\'VENCIDA\',\'PENDIENTE\')) AS `estado`,`bdclick6`.`bdprestamo`.`factura` AS `factura`,`bdclick6`.`bdcuota`.`fecha` AS `fecha` from (`bdclick6`.`bdcuota` join `bdclick6`.`bdprestamo` on((`bdclick6`.`bdcuota`.`contrato` = `bdclick6`.`bdprestamo`.`contrato`)))
mariadb-version=100135
