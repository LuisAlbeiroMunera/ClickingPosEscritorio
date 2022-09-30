TYPE=VIEW
query=(select `bdclick1`.`repventascreditos`.`Descripcion` AS `Descripcion`,`bdclick1`.`repventascreditos`.`vendedor` AS `vendedor`,`bdclick1`.`repventascreditos`.`cliente` AS `cliente`,`bdclick1`.`repventascreditos`.`nombre` AS `nombre`,`bdclick1`.`repventascreditos`.`fechaFactura` AS `fechaFactura`,`bdclick1`.`repcartera3`.`vencimiento` AS `vencimiento`,`bdclick1`.`repventascreditos`.`valorAprovado` AS `valorAprovado`,`bdclick1`.`repventascreditos`.`interes` AS `interes`,`bdclick1`.`repventascreditos`.`totalInteres` AS `totalInteres`,`bdclick1`.`repventascreditos`.`total` AS `total`,`bdclick1`.`repventascreditos`.`cuotas` AS `cuotas`,`bdclick1`.`repventascreditos`.`contrato` AS `factura` from (`bdclick1`.`repventascreditos` left join `bdclick1`.`repcartera3` on((`bdclick1`.`repventascreditos`.`factura` = `bdclick1`.`repcartera3`.`factura2`))))
md5=e78e727fd5ce0f39f64543b857882ca1
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:33
create-version=2
source=(select `repventascreditos`.`Descripcion` AS `Descripcion`,`repventascreditos`.`vendedor` AS `vendedor`,`repventascreditos`.`cliente` AS `cliente`,`repventascreditos`.`nombre` AS `nombre`,`repventascreditos`.`fechaFactura` AS `fechaFactura`,`repcartera3`.`vencimiento` AS `vencimiento`,`repventascreditos`.`valorAprovado` AS `valorAprovado`,`repventascreditos`.`interes` AS `interes`,`repventascreditos`.`totalInteres` AS `totalInteres`,`repventascreditos`.`total` AS `total`,`repventascreditos`.`cuotas` AS `cuotas`,`repventascreditos`.`contrato` AS `factura` from (`repventascreditos` left join `repcartera3` on((`repventascreditos`.`factura` = `repcartera3`.`factura2`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick1`.`repventascreditos`.`Descripcion` AS `Descripcion`,`bdclick1`.`repventascreditos`.`vendedor` AS `vendedor`,`bdclick1`.`repventascreditos`.`cliente` AS `cliente`,`bdclick1`.`repventascreditos`.`nombre` AS `nombre`,`bdclick1`.`repventascreditos`.`fechaFactura` AS `fechaFactura`,`bdclick1`.`repcartera3`.`vencimiento` AS `vencimiento`,`bdclick1`.`repventascreditos`.`valorAprovado` AS `valorAprovado`,`bdclick1`.`repventascreditos`.`interes` AS `interes`,`bdclick1`.`repventascreditos`.`totalInteres` AS `totalInteres`,`bdclick1`.`repventascreditos`.`total` AS `total`,`bdclick1`.`repventascreditos`.`cuotas` AS `cuotas`,`bdclick1`.`repventascreditos`.`contrato` AS `factura` from (`bdclick1`.`repventascreditos` left join `bdclick1`.`repcartera3` on((`bdclick1`.`repventascreditos`.`factura` = `bdclick1`.`repcartera3`.`factura2`))))
mariadb-version=100135
