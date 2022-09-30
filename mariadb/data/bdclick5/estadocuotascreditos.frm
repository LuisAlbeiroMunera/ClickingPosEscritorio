TYPE=VIEW
query=select `bdclick5`.`bdcuota`.`contrato` AS `contrato`,`bdclick5`.`bdcuota`.`numCuota` AS `numCuota`,if((`bdclick5`.`bdcuota`.`totalAbono` = `bdclick5`.`bdcuota`.`total`),\'OK\',if((cast(now() as date) > `bdclick5`.`bdcuota`.`fecha`),\'VENCIDA\',\'PENDIENTE\')) AS `estado`,`bdclick5`.`bdprestamo`.`factura` AS `factura`,`bdclick5`.`bdcuota`.`fecha` AS `fecha` from (`bdclick5`.`bdcuota` join `bdclick5`.`bdprestamo` on((`bdclick5`.`bdcuota`.`contrato` = `bdclick5`.`bdprestamo`.`contrato`)))
md5=838f3d8fff03bedd842fbc203b30f574
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:46
create-version=2
source=select `bdcuota`.`contrato` AS `contrato`,`bdcuota`.`numCuota` AS `numCuota`,if((`bdcuota`.`totalAbono` = `bdcuota`.`total`),\'OK\',if((cast(now() as date) > `bdcuota`.`fecha`),\'VENCIDA\',\'PENDIENTE\')) AS `estado`,`bdprestamo`.`factura` AS `factura`,`bdcuota`.`fecha` AS `fecha` from (`bdcuota` join `bdprestamo` on((`bdcuota`.`contrato` = `bdprestamo`.`contrato`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdcuota`.`contrato` AS `contrato`,`bdclick5`.`bdcuota`.`numCuota` AS `numCuota`,if((`bdclick5`.`bdcuota`.`totalAbono` = `bdclick5`.`bdcuota`.`total`),\'OK\',if((cast(now() as date) > `bdclick5`.`bdcuota`.`fecha`),\'VENCIDA\',\'PENDIENTE\')) AS `estado`,`bdclick5`.`bdprestamo`.`factura` AS `factura`,`bdclick5`.`bdcuota`.`fecha` AS `fecha` from (`bdclick5`.`bdcuota` join `bdclick5`.`bdprestamo` on((`bdclick5`.`bdcuota`.`contrato` = `bdclick5`.`bdprestamo`.`contrato`)))
mariadb-version=100135
