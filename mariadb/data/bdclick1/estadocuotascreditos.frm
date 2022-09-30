TYPE=VIEW
query=select `bdclick1`.`bdcuota`.`contrato` AS `contrato`,`bdclick1`.`bdcuota`.`numCuota` AS `numCuota`,if((`bdclick1`.`bdcuota`.`totalAbono` = `bdclick1`.`bdcuota`.`total`),\'OK\',if((cast(now() as date) > `bdclick1`.`bdcuota`.`fecha`),\'VENCIDA\',\'PENDIENTE\')) AS `estado`,`bdclick1`.`bdprestamo`.`factura` AS `factura`,`bdclick1`.`bdcuota`.`fecha` AS `fecha` from (`bdclick1`.`bdcuota` join `bdclick1`.`bdprestamo` on((`bdclick1`.`bdcuota`.`contrato` = `bdclick1`.`bdprestamo`.`contrato`)))
md5=6b3c696e795540a94c2fc1bcef971a80
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:34
create-version=2
source=select `bdcuota`.`contrato` AS `contrato`,`bdcuota`.`numCuota` AS `numCuota`,if((`bdcuota`.`totalAbono` = `bdcuota`.`total`),\'OK\',if((cast(now() as date) > `bdcuota`.`fecha`),\'VENCIDA\',\'PENDIENTE\')) AS `estado`,`bdprestamo`.`factura` AS `factura`,`bdcuota`.`fecha` AS `fecha` from (`bdcuota` join `bdprestamo` on((`bdcuota`.`contrato` = `bdprestamo`.`contrato`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdcuota`.`contrato` AS `contrato`,`bdclick1`.`bdcuota`.`numCuota` AS `numCuota`,if((`bdclick1`.`bdcuota`.`totalAbono` = `bdclick1`.`bdcuota`.`total`),\'OK\',if((cast(now() as date) > `bdclick1`.`bdcuota`.`fecha`),\'VENCIDA\',\'PENDIENTE\')) AS `estado`,`bdclick1`.`bdprestamo`.`factura` AS `factura`,`bdclick1`.`bdcuota`.`fecha` AS `fecha` from (`bdclick1`.`bdcuota` join `bdclick1`.`bdprestamo` on((`bdclick1`.`bdcuota`.`contrato` = `bdclick1`.`bdprestamo`.`contrato`)))
mariadb-version=100135
