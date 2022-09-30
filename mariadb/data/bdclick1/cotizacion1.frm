TYPE=VIEW
query=select `bdclick1`.`bdcotizacion`.`idFactura` AS `idFactura`,`bdclick1`.`bdcotizacion`.`fechaFactura` AS `fechaFactura`,`bdclick1`.`bdcotizacion`.`totalGeneral` AS `totalGeneral`,`bdclick1`.`bdcotizacion`.`estadoGeneral` AS `estadoGeneral`,`bdclick1`.`bdterceros`.`id` AS `Id`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,\'\' AS `plazo` from (`bdclick1`.`bdcotizacion` join `bdclick1`.`bdterceros` on((`bdclick1`.`bdcotizacion`.`cliente` = `bdclick1`.`bdterceros`.`idSistema`))) group by `bdclick1`.`bdcotizacion`.`idFactura`,`bdclick1`.`bdcotizacion`.`fechaFactura`,`bdclick1`.`bdcotizacion`.`totalGeneral`,`bdclick1`.`bdcotizacion`.`estadoGeneral`,\'\'
md5=c631e6ba005f283402b992a27c7b317c
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:34
create-version=2
source=select `bdcotizacion`.`idFactura` AS `idFactura`,`bdcotizacion`.`fechaFactura` AS `fechaFactura`,`bdcotizacion`.`totalGeneral` AS `totalGeneral`,`bdcotizacion`.`estadoGeneral` AS `estadoGeneral`,`bdterceros`.`id` AS `Id`,`bdterceros`.`nombre` AS `nombre`,\'\' AS `plazo` from (`bdcotizacion` join `bdterceros` on((`bdcotizacion`.`cliente` = `bdterceros`.`idSistema`))) group by `bdcotizacion`.`idFactura`,`bdcotizacion`.`fechaFactura`,`bdcotizacion`.`totalGeneral`,`bdcotizacion`.`estadoGeneral`,\'\'
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdcotizacion`.`idFactura` AS `idFactura`,`bdclick1`.`bdcotizacion`.`fechaFactura` AS `fechaFactura`,`bdclick1`.`bdcotizacion`.`totalGeneral` AS `totalGeneral`,`bdclick1`.`bdcotizacion`.`estadoGeneral` AS `estadoGeneral`,`bdclick1`.`bdterceros`.`id` AS `Id`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,\'\' AS `plazo` from (`bdclick1`.`bdcotizacion` join `bdclick1`.`bdterceros` on((`bdclick1`.`bdcotizacion`.`cliente` = `bdclick1`.`bdterceros`.`idSistema`))) group by `bdclick1`.`bdcotizacion`.`idFactura`,`bdclick1`.`bdcotizacion`.`fechaFactura`,`bdclick1`.`bdcotizacion`.`totalGeneral`,`bdclick1`.`bdcotizacion`.`estadoGeneral`,\'\'
mariadb-version=100135
