TYPE=VIEW
query=(select `bdclick5`.`repventascreditos`.`Descripcion` AS `Descripcion`,`bdclick5`.`repventascreditos`.`vendedor` AS `vendedor`,`bdclick5`.`repventascreditos`.`cliente` AS `cliente`,`bdclick5`.`repventascreditos`.`nombre` AS `nombre`,`bdclick5`.`repventascreditos`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`repcartera3`.`vencimiento` AS `vencimiento`,`bdclick5`.`repventascreditos`.`valorAprovado` AS `valorAprovado`,`bdclick5`.`repventascreditos`.`interes` AS `interes`,`bdclick5`.`repventascreditos`.`totalInteres` AS `totalInteres`,`bdclick5`.`repventascreditos`.`total` AS `total`,`bdclick5`.`repventascreditos`.`cuotas` AS `cuotas`,`bdclick5`.`repventascreditos`.`contrato` AS `factura` from (`bdclick5`.`repventascreditos` left join `bdclick5`.`repcartera3` on((`bdclick5`.`repventascreditos`.`factura` = `bdclick5`.`repcartera3`.`factura2`))))
md5=c95e8a5388e63281d5a8e9f4a6cdfdc9
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:45
create-version=2
source=(select `repventascreditos`.`Descripcion` AS `Descripcion`,`repventascreditos`.`vendedor` AS `vendedor`,`repventascreditos`.`cliente` AS `cliente`,`repventascreditos`.`nombre` AS `nombre`,`repventascreditos`.`fechaFactura` AS `fechaFactura`,`repcartera3`.`vencimiento` AS `vencimiento`,`repventascreditos`.`valorAprovado` AS `valorAprovado`,`repventascreditos`.`interes` AS `interes`,`repventascreditos`.`totalInteres` AS `totalInteres`,`repventascreditos`.`total` AS `total`,`repventascreditos`.`cuotas` AS `cuotas`,`repventascreditos`.`contrato` AS `factura` from (`repventascreditos` left join `repcartera3` on((`repventascreditos`.`factura` = `repcartera3`.`factura2`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`repventascreditos`.`Descripcion` AS `Descripcion`,`bdclick5`.`repventascreditos`.`vendedor` AS `vendedor`,`bdclick5`.`repventascreditos`.`cliente` AS `cliente`,`bdclick5`.`repventascreditos`.`nombre` AS `nombre`,`bdclick5`.`repventascreditos`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`repcartera3`.`vencimiento` AS `vencimiento`,`bdclick5`.`repventascreditos`.`valorAprovado` AS `valorAprovado`,`bdclick5`.`repventascreditos`.`interes` AS `interes`,`bdclick5`.`repventascreditos`.`totalInteres` AS `totalInteres`,`bdclick5`.`repventascreditos`.`total` AS `total`,`bdclick5`.`repventascreditos`.`cuotas` AS `cuotas`,`bdclick5`.`repventascreditos`.`contrato` AS `factura` from (`bdclick5`.`repventascreditos` left join `bdclick5`.`repcartera3` on((`bdclick5`.`repventascreditos`.`factura` = `bdclick5`.`repcartera3`.`factura2`))))
mariadb-version=100135
