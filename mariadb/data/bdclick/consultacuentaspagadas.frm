TYPE=VIEW
query=(select `bdclick`.`repventascreditos`.`Descripcion` AS `Descripcion`,`bdclick`.`repventascreditos`.`vendedor` AS `vendedor`,`bdclick`.`repventascreditos`.`cliente` AS `cliente`,`bdclick`.`repventascreditos`.`nombre` AS `nombre`,`bdclick`.`repventascreditos`.`fechaFactura` AS `fechaFactura`,`bdclick`.`repcartera3`.`vencimiento` AS `vencimiento`,`bdclick`.`repventascreditos`.`valorAprovado` AS `valorAprovado`,`bdclick`.`repventascreditos`.`interes` AS `interes`,`bdclick`.`repventascreditos`.`totalInteres` AS `totalInteres`,`bdclick`.`repventascreditos`.`total` AS `total`,`bdclick`.`repventascreditos`.`cuotas` AS `cuotas`,`bdclick`.`repventascreditos`.`contrato` AS `factura` from (`bdclick`.`repventascreditos` left join `bdclick`.`repcartera3` on((`bdclick`.`repventascreditos`.`factura` = `bdclick`.`repcartera3`.`factura2`))))
md5=e4179bf472900a3c3f0bfb5d7b26b27e
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:22
create-version=2
source=(select `repventascreditos`.`Descripcion` AS `Descripcion`,`repventascreditos`.`vendedor` AS `vendedor`,`repventascreditos`.`cliente` AS `cliente`,`repventascreditos`.`nombre` AS `nombre`,`repventascreditos`.`fechaFactura` AS `fechaFactura`,`repcartera3`.`vencimiento` AS `vencimiento`,`repventascreditos`.`valorAprovado` AS `valorAprovado`,`repventascreditos`.`interes` AS `interes`,`repventascreditos`.`totalInteres` AS `totalInteres`,`repventascreditos`.`total` AS `total`,`repventascreditos`.`cuotas` AS `cuotas`,`repventascreditos`.`contrato` AS `factura` from (`repventascreditos` left join `repcartera3` on((`repventascreditos`.`factura` = `repcartera3`.`factura2`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`repventascreditos`.`Descripcion` AS `Descripcion`,`bdclick`.`repventascreditos`.`vendedor` AS `vendedor`,`bdclick`.`repventascreditos`.`cliente` AS `cliente`,`bdclick`.`repventascreditos`.`nombre` AS `nombre`,`bdclick`.`repventascreditos`.`fechaFactura` AS `fechaFactura`,`bdclick`.`repcartera3`.`vencimiento` AS `vencimiento`,`bdclick`.`repventascreditos`.`valorAprovado` AS `valorAprovado`,`bdclick`.`repventascreditos`.`interes` AS `interes`,`bdclick`.`repventascreditos`.`totalInteres` AS `totalInteres`,`bdclick`.`repventascreditos`.`total` AS `total`,`bdclick`.`repventascreditos`.`cuotas` AS `cuotas`,`bdclick`.`repventascreditos`.`contrato` AS `factura` from (`bdclick`.`repventascreditos` left join `bdclick`.`repcartera3` on((`bdclick`.`repventascreditos`.`factura` = `bdclick`.`repcartera3`.`factura2`))))
mariadb-version=100135
