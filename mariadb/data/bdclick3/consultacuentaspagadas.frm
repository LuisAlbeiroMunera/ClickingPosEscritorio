TYPE=VIEW
query=(select `bdclick3`.`repventascreditos`.`Descripcion` AS `Descripcion`,`bdclick3`.`repventascreditos`.`vendedor` AS `vendedor`,`bdclick3`.`repventascreditos`.`cliente` AS `cliente`,`bdclick3`.`repventascreditos`.`nombre` AS `nombre`,`bdclick3`.`repventascreditos`.`fechaFactura` AS `fechaFactura`,`bdclick3`.`repcartera3`.`vencimiento` AS `vencimiento`,`bdclick3`.`repventascreditos`.`valorAprovado` AS `valorAprovado`,`bdclick3`.`repventascreditos`.`interes` AS `interes`,`bdclick3`.`repventascreditos`.`totalInteres` AS `totalInteres`,`bdclick3`.`repventascreditos`.`total` AS `total`,`bdclick3`.`repventascreditos`.`cuotas` AS `cuotas`,`bdclick3`.`repventascreditos`.`contrato` AS `factura` from (`bdclick3`.`repventascreditos` left join `bdclick3`.`repcartera3` on((`bdclick3`.`repventascreditos`.`factura` = `bdclick3`.`repcartera3`.`factura2`))))
md5=832ffd54d2c878bcc9b2c0c44cb8cb57
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:49
create-version=2
source=(select `repventascreditos`.`Descripcion` AS `Descripcion`,`repventascreditos`.`vendedor` AS `vendedor`,`repventascreditos`.`cliente` AS `cliente`,`repventascreditos`.`nombre` AS `nombre`,`repventascreditos`.`fechaFactura` AS `fechaFactura`,`repcartera3`.`vencimiento` AS `vencimiento`,`repventascreditos`.`valorAprovado` AS `valorAprovado`,`repventascreditos`.`interes` AS `interes`,`repventascreditos`.`totalInteres` AS `totalInteres`,`repventascreditos`.`total` AS `total`,`repventascreditos`.`cuotas` AS `cuotas`,`repventascreditos`.`contrato` AS `factura` from (`repventascreditos` left join `repcartera3` on((`repventascreditos`.`factura` = `repcartera3`.`factura2`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`repventascreditos`.`Descripcion` AS `Descripcion`,`bdclick3`.`repventascreditos`.`vendedor` AS `vendedor`,`bdclick3`.`repventascreditos`.`cliente` AS `cliente`,`bdclick3`.`repventascreditos`.`nombre` AS `nombre`,`bdclick3`.`repventascreditos`.`fechaFactura` AS `fechaFactura`,`bdclick3`.`repcartera3`.`vencimiento` AS `vencimiento`,`bdclick3`.`repventascreditos`.`valorAprovado` AS `valorAprovado`,`bdclick3`.`repventascreditos`.`interes` AS `interes`,`bdclick3`.`repventascreditos`.`totalInteres` AS `totalInteres`,`bdclick3`.`repventascreditos`.`total` AS `total`,`bdclick3`.`repventascreditos`.`cuotas` AS `cuotas`,`bdclick3`.`repventascreditos`.`contrato` AS `factura` from (`bdclick3`.`repventascreditos` left join `bdclick3`.`repcartera3` on((`bdclick3`.`repventascreditos`.`factura` = `bdclick3`.`repcartera3`.`factura2`))))
mariadb-version=100135
