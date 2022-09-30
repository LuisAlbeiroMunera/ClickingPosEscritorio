TYPE=VIEW
query=select `bdclick6`.`bdcotizacion`.`idFactura` AS `idFactura`,`bdclick6`.`bdcotizacion`.`fechaFactura` AS `fechaFactura`,`bdclick6`.`bdcotizacion`.`totalGeneral` AS `totalGeneral`,`bdclick6`.`bdcotizacion`.`estadoGeneral` AS `estadoGeneral`,`bdclick6`.`bdterceros`.`id` AS `Id`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,\'\' AS `plazo` from (`bdclick6`.`bdcotizacion` join `bdclick6`.`bdterceros` on((`bdclick6`.`bdcotizacion`.`cliente` = `bdclick6`.`bdterceros`.`idSistema`))) group by `bdclick6`.`bdcotizacion`.`idFactura`,`bdclick6`.`bdcotizacion`.`fechaFactura`,`bdclick6`.`bdcotizacion`.`totalGeneral`,`bdclick6`.`bdcotizacion`.`estadoGeneral`,\'\'
md5=b00f8b776ddbc89bb70ea07b48d73517
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:34
create-version=2
source=select `bdcotizacion`.`idFactura` AS `idFactura`,`bdcotizacion`.`fechaFactura` AS `fechaFactura`,`bdcotizacion`.`totalGeneral` AS `totalGeneral`,`bdcotizacion`.`estadoGeneral` AS `estadoGeneral`,`bdterceros`.`id` AS `Id`,`bdterceros`.`nombre` AS `nombre`,\'\' AS `plazo` from (`bdcotizacion` join `bdterceros` on((`bdcotizacion`.`cliente` = `bdterceros`.`idSistema`))) group by `bdcotizacion`.`idFactura`,`bdcotizacion`.`fechaFactura`,`bdcotizacion`.`totalGeneral`,`bdcotizacion`.`estadoGeneral`,\'\'
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdcotizacion`.`idFactura` AS `idFactura`,`bdclick6`.`bdcotizacion`.`fechaFactura` AS `fechaFactura`,`bdclick6`.`bdcotizacion`.`totalGeneral` AS `totalGeneral`,`bdclick6`.`bdcotizacion`.`estadoGeneral` AS `estadoGeneral`,`bdclick6`.`bdterceros`.`id` AS `Id`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,\'\' AS `plazo` from (`bdclick6`.`bdcotizacion` join `bdclick6`.`bdterceros` on((`bdclick6`.`bdcotizacion`.`cliente` = `bdclick6`.`bdterceros`.`idSistema`))) group by `bdclick6`.`bdcotizacion`.`idFactura`,`bdclick6`.`bdcotizacion`.`fechaFactura`,`bdclick6`.`bdcotizacion`.`totalGeneral`,`bdclick6`.`bdcotizacion`.`estadoGeneral`,\'\'
mariadb-version=100135
