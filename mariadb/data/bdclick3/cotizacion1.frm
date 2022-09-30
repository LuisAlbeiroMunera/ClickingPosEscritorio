TYPE=VIEW
query=select `bdclick3`.`bdcotizacion`.`idFactura` AS `idFactura`,`bdclick3`.`bdcotizacion`.`fechaFactura` AS `fechaFactura`,`bdclick3`.`bdcotizacion`.`totalGeneral` AS `totalGeneral`,`bdclick3`.`bdcotizacion`.`estadoGeneral` AS `estadoGeneral`,`bdclick3`.`bdterceros`.`id` AS `Id`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,\'\' AS `plazo` from (`bdclick3`.`bdcotizacion` join `bdclick3`.`bdterceros` on((`bdclick3`.`bdcotizacion`.`cliente` = `bdclick3`.`bdterceros`.`idSistema`))) group by `bdclick3`.`bdcotizacion`.`idFactura`,`bdclick3`.`bdcotizacion`.`fechaFactura`,`bdclick3`.`bdcotizacion`.`totalGeneral`,`bdclick3`.`bdcotizacion`.`estadoGeneral`,\'\'
md5=8a30fc66e6463f57d2845c40a2eea648
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:50
create-version=2
source=select `bdcotizacion`.`idFactura` AS `idFactura`,`bdcotizacion`.`fechaFactura` AS `fechaFactura`,`bdcotizacion`.`totalGeneral` AS `totalGeneral`,`bdcotizacion`.`estadoGeneral` AS `estadoGeneral`,`bdterceros`.`id` AS `Id`,`bdterceros`.`nombre` AS `nombre`,\'\' AS `plazo` from (`bdcotizacion` join `bdterceros` on((`bdcotizacion`.`cliente` = `bdterceros`.`idSistema`))) group by `bdcotizacion`.`idFactura`,`bdcotizacion`.`fechaFactura`,`bdcotizacion`.`totalGeneral`,`bdcotizacion`.`estadoGeneral`,\'\'
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdcotizacion`.`idFactura` AS `idFactura`,`bdclick3`.`bdcotizacion`.`fechaFactura` AS `fechaFactura`,`bdclick3`.`bdcotizacion`.`totalGeneral` AS `totalGeneral`,`bdclick3`.`bdcotizacion`.`estadoGeneral` AS `estadoGeneral`,`bdclick3`.`bdterceros`.`id` AS `Id`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,\'\' AS `plazo` from (`bdclick3`.`bdcotizacion` join `bdclick3`.`bdterceros` on((`bdclick3`.`bdcotizacion`.`cliente` = `bdclick3`.`bdterceros`.`idSistema`))) group by `bdclick3`.`bdcotizacion`.`idFactura`,`bdclick3`.`bdcotizacion`.`fechaFactura`,`bdclick3`.`bdcotizacion`.`totalGeneral`,`bdclick3`.`bdcotizacion`.`estadoGeneral`,\'\'
mariadb-version=100135
