TYPE=VIEW
query=select `bdclick4`.`bdcuota`.`contrato` AS `contrato`,`bdclick4`.`bdcuota`.`numCuota` AS `numCuota`,if((`bdclick4`.`bdcuota`.`totalAbono` = `bdclick4`.`bdcuota`.`total`),\'OK\',if((cast(now() as date) > `bdclick4`.`bdcuota`.`fecha`),\'VENCIDA\',\'PENDIENTE\')) AS `estado`,`bdclick4`.`bdprestamo`.`factura` AS `factura`,`bdclick4`.`bdcuota`.`fecha` AS `fecha` from (`bdclick4`.`bdcuota` join `bdclick4`.`bdprestamo` on((`bdclick4`.`bdcuota`.`contrato` = `bdclick4`.`bdprestamo`.`contrato`)))
md5=8152e046bf7ff23d00c0fe716b7679f1
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:27
create-version=2
source=select `bdcuota`.`contrato` AS `contrato`,`bdcuota`.`numCuota` AS `numCuota`,if((`bdcuota`.`totalAbono` = `bdcuota`.`total`),\'OK\',if((cast(now() as date) > `bdcuota`.`fecha`),\'VENCIDA\',\'PENDIENTE\')) AS `estado`,`bdprestamo`.`factura` AS `factura`,`bdcuota`.`fecha` AS `fecha` from (`bdcuota` join `bdprestamo` on((`bdcuota`.`contrato` = `bdprestamo`.`contrato`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdcuota`.`contrato` AS `contrato`,`bdclick4`.`bdcuota`.`numCuota` AS `numCuota`,if((`bdclick4`.`bdcuota`.`totalAbono` = `bdclick4`.`bdcuota`.`total`),\'OK\',if((cast(now() as date) > `bdclick4`.`bdcuota`.`fecha`),\'VENCIDA\',\'PENDIENTE\')) AS `estado`,`bdclick4`.`bdprestamo`.`factura` AS `factura`,`bdclick4`.`bdcuota`.`fecha` AS `fecha` from (`bdclick4`.`bdcuota` join `bdclick4`.`bdprestamo` on((`bdclick4`.`bdcuota`.`contrato` = `bdclick4`.`bdprestamo`.`contrato`)))
mariadb-version=100135
