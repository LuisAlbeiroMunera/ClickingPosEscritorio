TYPE=VIEW
query=(select `bdclick4`.`repventascreditos`.`Descripcion` AS `Descripcion`,`bdclick4`.`repventascreditos`.`vendedor` AS `vendedor`,`bdclick4`.`repventascreditos`.`cliente` AS `cliente`,`bdclick4`.`repventascreditos`.`nombre` AS `nombre`,`bdclick4`.`repventascreditos`.`fechaFactura` AS `fechaFactura`,`bdclick4`.`repcartera3`.`vencimiento` AS `vencimiento`,`bdclick4`.`repventascreditos`.`valorAprovado` AS `valorAprovado`,`bdclick4`.`repventascreditos`.`interes` AS `interes`,`bdclick4`.`repventascreditos`.`totalInteres` AS `totalInteres`,`bdclick4`.`repventascreditos`.`total` AS `total`,`bdclick4`.`repventascreditos`.`cuotas` AS `cuotas`,`bdclick4`.`repventascreditos`.`contrato` AS `factura` from (`bdclick4`.`repventascreditos` left join `bdclick4`.`repcartera3` on((`bdclick4`.`repventascreditos`.`factura` = `bdclick4`.`repcartera3`.`factura2`))))
md5=351b77626a477aa38fc4519dbdb775e3
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:26
create-version=2
source=(select `repventascreditos`.`Descripcion` AS `Descripcion`,`repventascreditos`.`vendedor` AS `vendedor`,`repventascreditos`.`cliente` AS `cliente`,`repventascreditos`.`nombre` AS `nombre`,`repventascreditos`.`fechaFactura` AS `fechaFactura`,`repcartera3`.`vencimiento` AS `vencimiento`,`repventascreditos`.`valorAprovado` AS `valorAprovado`,`repventascreditos`.`interes` AS `interes`,`repventascreditos`.`totalInteres` AS `totalInteres`,`repventascreditos`.`total` AS `total`,`repventascreditos`.`cuotas` AS `cuotas`,`repventascreditos`.`contrato` AS `factura` from (`repventascreditos` left join `repcartera3` on((`repventascreditos`.`factura` = `repcartera3`.`factura2`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`repventascreditos`.`Descripcion` AS `Descripcion`,`bdclick4`.`repventascreditos`.`vendedor` AS `vendedor`,`bdclick4`.`repventascreditos`.`cliente` AS `cliente`,`bdclick4`.`repventascreditos`.`nombre` AS `nombre`,`bdclick4`.`repventascreditos`.`fechaFactura` AS `fechaFactura`,`bdclick4`.`repcartera3`.`vencimiento` AS `vencimiento`,`bdclick4`.`repventascreditos`.`valorAprovado` AS `valorAprovado`,`bdclick4`.`repventascreditos`.`interes` AS `interes`,`bdclick4`.`repventascreditos`.`totalInteres` AS `totalInteres`,`bdclick4`.`repventascreditos`.`total` AS `total`,`bdclick4`.`repventascreditos`.`cuotas` AS `cuotas`,`bdclick4`.`repventascreditos`.`contrato` AS `factura` from (`bdclick4`.`repventascreditos` left join `bdclick4`.`repcartera3` on((`bdclick4`.`repventascreditos`.`factura` = `bdclick4`.`repcartera3`.`factura2`))))
mariadb-version=100135
