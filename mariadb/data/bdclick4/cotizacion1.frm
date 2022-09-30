TYPE=VIEW
query=select `bdclick4`.`bdcotizacion`.`idFactura` AS `idFactura`,`bdclick4`.`bdcotizacion`.`fechaFactura` AS `fechaFactura`,`bdclick4`.`bdcotizacion`.`totalGeneral` AS `totalGeneral`,`bdclick4`.`bdcotizacion`.`estadoGeneral` AS `estadoGeneral`,`bdclick4`.`bdterceros`.`id` AS `Id`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,\'\' AS `plazo` from (`bdclick4`.`bdcotizacion` join `bdclick4`.`bdterceros` on((`bdclick4`.`bdcotizacion`.`cliente` = `bdclick4`.`bdterceros`.`idSistema`))) group by `bdclick4`.`bdcotizacion`.`idFactura`,`bdclick4`.`bdcotizacion`.`fechaFactura`,`bdclick4`.`bdcotizacion`.`totalGeneral`,`bdclick4`.`bdcotizacion`.`estadoGeneral`,\'\'
md5=f7ead8c897ec38dc69e07eea7b0e3cc9
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:27
create-version=2
source=select `bdcotizacion`.`idFactura` AS `idFactura`,`bdcotizacion`.`fechaFactura` AS `fechaFactura`,`bdcotizacion`.`totalGeneral` AS `totalGeneral`,`bdcotizacion`.`estadoGeneral` AS `estadoGeneral`,`bdterceros`.`id` AS `Id`,`bdterceros`.`nombre` AS `nombre`,\'\' AS `plazo` from (`bdcotizacion` join `bdterceros` on((`bdcotizacion`.`cliente` = `bdterceros`.`idSistema`))) group by `bdcotizacion`.`idFactura`,`bdcotizacion`.`fechaFactura`,`bdcotizacion`.`totalGeneral`,`bdcotizacion`.`estadoGeneral`,\'\'
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdcotizacion`.`idFactura` AS `idFactura`,`bdclick4`.`bdcotizacion`.`fechaFactura` AS `fechaFactura`,`bdclick4`.`bdcotizacion`.`totalGeneral` AS `totalGeneral`,`bdclick4`.`bdcotizacion`.`estadoGeneral` AS `estadoGeneral`,`bdclick4`.`bdterceros`.`id` AS `Id`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,\'\' AS `plazo` from (`bdclick4`.`bdcotizacion` join `bdclick4`.`bdterceros` on((`bdclick4`.`bdcotizacion`.`cliente` = `bdclick4`.`bdterceros`.`idSistema`))) group by `bdclick4`.`bdcotizacion`.`idFactura`,`bdclick4`.`bdcotizacion`.`fechaFactura`,`bdclick4`.`bdcotizacion`.`totalGeneral`,`bdclick4`.`bdcotizacion`.`estadoGeneral`,\'\'
mariadb-version=100135
