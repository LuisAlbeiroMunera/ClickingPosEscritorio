TYPE=VIEW
query=select `bdclick2`.`bdcuota`.`contrato` AS `contrato`,`bdclick2`.`bdcuota`.`numCuota` AS `numCuota`,if((`bdclick2`.`bdcuota`.`totalAbono` = `bdclick2`.`bdcuota`.`total`),\'OK\',if((cast(now() as date) > `bdclick2`.`bdcuota`.`fecha`),\'VENCIDA\',\'PENDIENTE\')) AS `estado`,`bdclick2`.`bdprestamo`.`factura` AS `factura`,`bdclick2`.`bdcuota`.`fecha` AS `fecha` from (`bdclick2`.`bdcuota` join `bdclick2`.`bdprestamo` on((`bdclick2`.`bdcuota`.`contrato` = `bdclick2`.`bdprestamo`.`contrato`)))
md5=3857fc9a5a86f17e03af0e88a20b6721
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:44
create-version=2
source=select `bdcuota`.`contrato` AS `contrato`,`bdcuota`.`numCuota` AS `numCuota`,if((`bdcuota`.`totalAbono` = `bdcuota`.`total`),\'OK\',if((cast(now() as date) > `bdcuota`.`fecha`),\'VENCIDA\',\'PENDIENTE\')) AS `estado`,`bdprestamo`.`factura` AS `factura`,`bdcuota`.`fecha` AS `fecha` from (`bdcuota` join `bdprestamo` on((`bdcuota`.`contrato` = `bdprestamo`.`contrato`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdcuota`.`contrato` AS `contrato`,`bdclick2`.`bdcuota`.`numCuota` AS `numCuota`,if((`bdclick2`.`bdcuota`.`totalAbono` = `bdclick2`.`bdcuota`.`total`),\'OK\',if((cast(now() as date) > `bdclick2`.`bdcuota`.`fecha`),\'VENCIDA\',\'PENDIENTE\')) AS `estado`,`bdclick2`.`bdprestamo`.`factura` AS `factura`,`bdclick2`.`bdcuota`.`fecha` AS `fecha` from (`bdclick2`.`bdcuota` join `bdclick2`.`bdprestamo` on((`bdclick2`.`bdcuota`.`contrato` = `bdclick2`.`bdprestamo`.`contrato`)))
mariadb-version=100135
