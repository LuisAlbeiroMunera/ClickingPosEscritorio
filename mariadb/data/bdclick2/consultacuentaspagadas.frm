TYPE=VIEW
query=(select `bdclick2`.`repventascreditos`.`Descripcion` AS `Descripcion`,`bdclick2`.`repventascreditos`.`vendedor` AS `vendedor`,`bdclick2`.`repventascreditos`.`cliente` AS `cliente`,`bdclick2`.`repventascreditos`.`nombre` AS `nombre`,`bdclick2`.`repventascreditos`.`fechaFactura` AS `fechaFactura`,`bdclick2`.`repcartera3`.`vencimiento` AS `vencimiento`,`bdclick2`.`repventascreditos`.`valorAprovado` AS `valorAprovado`,`bdclick2`.`repventascreditos`.`interes` AS `interes`,`bdclick2`.`repventascreditos`.`totalInteres` AS `totalInteres`,`bdclick2`.`repventascreditos`.`total` AS `total`,`bdclick2`.`repventascreditos`.`cuotas` AS `cuotas`,`bdclick2`.`repventascreditos`.`contrato` AS `factura` from (`bdclick2`.`repventascreditos` left join `bdclick2`.`repcartera3` on((`bdclick2`.`repventascreditos`.`factura` = `bdclick2`.`repcartera3`.`factura2`))))
md5=c4e27bc675af35ff467a6ef34b03bff6
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:44
create-version=2
source=(select `repventascreditos`.`Descripcion` AS `Descripcion`,`repventascreditos`.`vendedor` AS `vendedor`,`repventascreditos`.`cliente` AS `cliente`,`repventascreditos`.`nombre` AS `nombre`,`repventascreditos`.`fechaFactura` AS `fechaFactura`,`repcartera3`.`vencimiento` AS `vencimiento`,`repventascreditos`.`valorAprovado` AS `valorAprovado`,`repventascreditos`.`interes` AS `interes`,`repventascreditos`.`totalInteres` AS `totalInteres`,`repventascreditos`.`total` AS `total`,`repventascreditos`.`cuotas` AS `cuotas`,`repventascreditos`.`contrato` AS `factura` from (`repventascreditos` left join `repcartera3` on((`repventascreditos`.`factura` = `repcartera3`.`factura2`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick2`.`repventascreditos`.`Descripcion` AS `Descripcion`,`bdclick2`.`repventascreditos`.`vendedor` AS `vendedor`,`bdclick2`.`repventascreditos`.`cliente` AS `cliente`,`bdclick2`.`repventascreditos`.`nombre` AS `nombre`,`bdclick2`.`repventascreditos`.`fechaFactura` AS `fechaFactura`,`bdclick2`.`repcartera3`.`vencimiento` AS `vencimiento`,`bdclick2`.`repventascreditos`.`valorAprovado` AS `valorAprovado`,`bdclick2`.`repventascreditos`.`interes` AS `interes`,`bdclick2`.`repventascreditos`.`totalInteres` AS `totalInteres`,`bdclick2`.`repventascreditos`.`total` AS `total`,`bdclick2`.`repventascreditos`.`cuotas` AS `cuotas`,`bdclick2`.`repventascreditos`.`contrato` AS `factura` from (`bdclick2`.`repventascreditos` left join `bdclick2`.`repcartera3` on((`bdclick2`.`repventascreditos`.`factura` = `bdclick2`.`repcartera3`.`factura2`))))
mariadb-version=100135
