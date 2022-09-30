TYPE=VIEW
query=select `bdclick`.`bdcuota`.`contrato` AS `contrato`,`bdclick`.`bdcuota`.`numCuota` AS `numCuota`,if((`bdclick`.`bdcuota`.`totalAbono` = `bdclick`.`bdcuota`.`total`),\'OK\',if((cast(now() as date) > `bdclick`.`bdcuota`.`fecha`),\'VENCIDA\',\'PENDIENTE\')) AS `estado`,`bdclick`.`bdprestamo`.`factura` AS `factura`,`bdclick`.`bdcuota`.`fecha` AS `fecha` from (`bdclick`.`bdcuota` join `bdclick`.`bdprestamo` on((`bdclick`.`bdcuota`.`contrato` = `bdclick`.`bdprestamo`.`contrato`)))
md5=90834e49b91fe879129a17eafc728d3f
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:23
create-version=2
source=select `bdcuota`.`contrato` AS `contrato`,`bdcuota`.`numCuota` AS `numCuota`,if((`bdcuota`.`totalAbono` = `bdcuota`.`total`),\'OK\',if((cast(now() as date) > `bdcuota`.`fecha`),\'VENCIDA\',\'PENDIENTE\')) AS `estado`,`bdprestamo`.`factura` AS `factura`,`bdcuota`.`fecha` AS `fecha` from (`bdcuota` join `bdprestamo` on((`bdcuota`.`contrato` = `bdprestamo`.`contrato`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdcuota`.`contrato` AS `contrato`,`bdclick`.`bdcuota`.`numCuota` AS `numCuota`,if((`bdclick`.`bdcuota`.`totalAbono` = `bdclick`.`bdcuota`.`total`),\'OK\',if((cast(now() as date) > `bdclick`.`bdcuota`.`fecha`),\'VENCIDA\',\'PENDIENTE\')) AS `estado`,`bdclick`.`bdprestamo`.`factura` AS `factura`,`bdclick`.`bdcuota`.`fecha` AS `fecha` from (`bdclick`.`bdcuota` join `bdclick`.`bdprestamo` on((`bdclick`.`bdcuota`.`contrato` = `bdclick`.`bdprestamo`.`contrato`)))
mariadb-version=100135
