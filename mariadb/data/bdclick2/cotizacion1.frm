TYPE=VIEW
query=select `bdclick2`.`bdcotizacion`.`idFactura` AS `idFactura`,`bdclick2`.`bdcotizacion`.`fechaFactura` AS `fechaFactura`,`bdclick2`.`bdcotizacion`.`totalGeneral` AS `totalGeneral`,`bdclick2`.`bdcotizacion`.`estadoGeneral` AS `estadoGeneral`,`bdclick2`.`bdterceros`.`id` AS `Id`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,\'\' AS `plazo` from (`bdclick2`.`bdcotizacion` join `bdclick2`.`bdterceros` on((`bdclick2`.`bdcotizacion`.`cliente` = `bdclick2`.`bdterceros`.`idSistema`))) group by `bdclick2`.`bdcotizacion`.`idFactura`,`bdclick2`.`bdcotizacion`.`fechaFactura`,`bdclick2`.`bdcotizacion`.`totalGeneral`,`bdclick2`.`bdcotizacion`.`estadoGeneral`,\'\'
md5=b93728c8fe2cf79dd05fbbffeceae83f
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:44
create-version=2
source=select `bdcotizacion`.`idFactura` AS `idFactura`,`bdcotizacion`.`fechaFactura` AS `fechaFactura`,`bdcotizacion`.`totalGeneral` AS `totalGeneral`,`bdcotizacion`.`estadoGeneral` AS `estadoGeneral`,`bdterceros`.`id` AS `Id`,`bdterceros`.`nombre` AS `nombre`,\'\' AS `plazo` from (`bdcotizacion` join `bdterceros` on((`bdcotizacion`.`cliente` = `bdterceros`.`idSistema`))) group by `bdcotizacion`.`idFactura`,`bdcotizacion`.`fechaFactura`,`bdcotizacion`.`totalGeneral`,`bdcotizacion`.`estadoGeneral`,\'\'
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdcotizacion`.`idFactura` AS `idFactura`,`bdclick2`.`bdcotizacion`.`fechaFactura` AS `fechaFactura`,`bdclick2`.`bdcotizacion`.`totalGeneral` AS `totalGeneral`,`bdclick2`.`bdcotizacion`.`estadoGeneral` AS `estadoGeneral`,`bdclick2`.`bdterceros`.`id` AS `Id`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,\'\' AS `plazo` from (`bdclick2`.`bdcotizacion` join `bdclick2`.`bdterceros` on((`bdclick2`.`bdcotizacion`.`cliente` = `bdclick2`.`bdterceros`.`idSistema`))) group by `bdclick2`.`bdcotizacion`.`idFactura`,`bdclick2`.`bdcotizacion`.`fechaFactura`,`bdclick2`.`bdcotizacion`.`totalGeneral`,`bdclick2`.`bdcotizacion`.`estadoGeneral`,\'\'
mariadb-version=100135
