TYPE=VIEW
query=select `bdclick3`.`bdcuota`.`contrato` AS `contrato`,`bdclick3`.`bdcuota`.`numCuota` AS `numCuota`,if((`bdclick3`.`bdcuota`.`totalAbono` = `bdclick3`.`bdcuota`.`total`),\'OK\',if((cast(now() as date) > `bdclick3`.`bdcuota`.`fecha`),\'VENCIDA\',\'PENDIENTE\')) AS `estado`,`bdclick3`.`bdprestamo`.`factura` AS `factura`,`bdclick3`.`bdcuota`.`fecha` AS `fecha` from (`bdclick3`.`bdcuota` join `bdclick3`.`bdprestamo` on((`bdclick3`.`bdcuota`.`contrato` = `bdclick3`.`bdprestamo`.`contrato`)))
md5=1541e14503025859e368c10d164c3b2d
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:50
create-version=2
source=select `bdcuota`.`contrato` AS `contrato`,`bdcuota`.`numCuota` AS `numCuota`,if((`bdcuota`.`totalAbono` = `bdcuota`.`total`),\'OK\',if((cast(now() as date) > `bdcuota`.`fecha`),\'VENCIDA\',\'PENDIENTE\')) AS `estado`,`bdprestamo`.`factura` AS `factura`,`bdcuota`.`fecha` AS `fecha` from (`bdcuota` join `bdprestamo` on((`bdcuota`.`contrato` = `bdprestamo`.`contrato`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdcuota`.`contrato` AS `contrato`,`bdclick3`.`bdcuota`.`numCuota` AS `numCuota`,if((`bdclick3`.`bdcuota`.`totalAbono` = `bdclick3`.`bdcuota`.`total`),\'OK\',if((cast(now() as date) > `bdclick3`.`bdcuota`.`fecha`),\'VENCIDA\',\'PENDIENTE\')) AS `estado`,`bdclick3`.`bdprestamo`.`factura` AS `factura`,`bdclick3`.`bdcuota`.`fecha` AS `fecha` from (`bdclick3`.`bdcuota` join `bdclick3`.`bdprestamo` on((`bdclick3`.`bdcuota`.`contrato` = `bdclick3`.`bdprestamo`.`contrato`)))
mariadb-version=100135
