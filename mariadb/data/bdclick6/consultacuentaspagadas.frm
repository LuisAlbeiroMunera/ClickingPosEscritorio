TYPE=VIEW
query=(select `bdclick6`.`repventascreditos`.`Descripcion` AS `Descripcion`,`bdclick6`.`repventascreditos`.`vendedor` AS `vendedor`,`bdclick6`.`repventascreditos`.`cliente` AS `cliente`,`bdclick6`.`repventascreditos`.`nombre` AS `nombre`,`bdclick6`.`repventascreditos`.`fechaFactura` AS `fechaFactura`,`bdclick6`.`repcartera3`.`vencimiento` AS `vencimiento`,`bdclick6`.`repventascreditos`.`valorAprovado` AS `valorAprovado`,`bdclick6`.`repventascreditos`.`interes` AS `interes`,`bdclick6`.`repventascreditos`.`totalInteres` AS `totalInteres`,`bdclick6`.`repventascreditos`.`total` AS `total`,`bdclick6`.`repventascreditos`.`cuotas` AS `cuotas`,`bdclick6`.`repventascreditos`.`contrato` AS `factura` from (`bdclick6`.`repventascreditos` left join `bdclick6`.`repcartera3` on((`bdclick6`.`repventascreditos`.`factura` = `bdclick6`.`repcartera3`.`factura2`))))
md5=a875f6776ed3cd3b57998cf521a6ae3e
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:34
create-version=2
source=(select `repventascreditos`.`Descripcion` AS `Descripcion`,`repventascreditos`.`vendedor` AS `vendedor`,`repventascreditos`.`cliente` AS `cliente`,`repventascreditos`.`nombre` AS `nombre`,`repventascreditos`.`fechaFactura` AS `fechaFactura`,`repcartera3`.`vencimiento` AS `vencimiento`,`repventascreditos`.`valorAprovado` AS `valorAprovado`,`repventascreditos`.`interes` AS `interes`,`repventascreditos`.`totalInteres` AS `totalInteres`,`repventascreditos`.`total` AS `total`,`repventascreditos`.`cuotas` AS `cuotas`,`repventascreditos`.`contrato` AS `factura` from (`repventascreditos` left join `repcartera3` on((`repventascreditos`.`factura` = `repcartera3`.`factura2`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`repventascreditos`.`Descripcion` AS `Descripcion`,`bdclick6`.`repventascreditos`.`vendedor` AS `vendedor`,`bdclick6`.`repventascreditos`.`cliente` AS `cliente`,`bdclick6`.`repventascreditos`.`nombre` AS `nombre`,`bdclick6`.`repventascreditos`.`fechaFactura` AS `fechaFactura`,`bdclick6`.`repcartera3`.`vencimiento` AS `vencimiento`,`bdclick6`.`repventascreditos`.`valorAprovado` AS `valorAprovado`,`bdclick6`.`repventascreditos`.`interes` AS `interes`,`bdclick6`.`repventascreditos`.`totalInteres` AS `totalInteres`,`bdclick6`.`repventascreditos`.`total` AS `total`,`bdclick6`.`repventascreditos`.`cuotas` AS `cuotas`,`bdclick6`.`repventascreditos`.`contrato` AS `factura` from (`bdclick6`.`repventascreditos` left join `bdclick6`.`repcartera3` on((`bdclick6`.`repventascreditos`.`factura` = `bdclick6`.`repcartera3`.`factura2`))))
mariadb-version=100135
