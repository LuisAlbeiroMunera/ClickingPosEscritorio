TYPE=VIEW
query=select `bdclick5`.`bdcotizacion`.`idFactura` AS `idFactura`,`bdclick5`.`bdcotizacion`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`bdcotizacion`.`totalGeneral` AS `totalGeneral`,`bdclick5`.`bdcotizacion`.`estadoGeneral` AS `estadoGeneral`,`bdclick5`.`bdterceros`.`id` AS `Id`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,\'\' AS `plazo` from (`bdclick5`.`bdcotizacion` join `bdclick5`.`bdterceros` on((`bdclick5`.`bdcotizacion`.`cliente` = `bdclick5`.`bdterceros`.`idSistema`))) group by `bdclick5`.`bdcotizacion`.`idFactura`,`bdclick5`.`bdcotizacion`.`fechaFactura`,`bdclick5`.`bdcotizacion`.`totalGeneral`,`bdclick5`.`bdcotizacion`.`estadoGeneral`,\'\'
md5=a9b701230c0fa0e2656d2a70f1dea09c
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:46
create-version=2
source=select `bdcotizacion`.`idFactura` AS `idFactura`,`bdcotizacion`.`fechaFactura` AS `fechaFactura`,`bdcotizacion`.`totalGeneral` AS `totalGeneral`,`bdcotizacion`.`estadoGeneral` AS `estadoGeneral`,`bdterceros`.`id` AS `Id`,`bdterceros`.`nombre` AS `nombre`,\'\' AS `plazo` from (`bdcotizacion` join `bdterceros` on((`bdcotizacion`.`cliente` = `bdterceros`.`idSistema`))) group by `bdcotizacion`.`idFactura`,`bdcotizacion`.`fechaFactura`,`bdcotizacion`.`totalGeneral`,`bdcotizacion`.`estadoGeneral`,\'\'
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdcotizacion`.`idFactura` AS `idFactura`,`bdclick5`.`bdcotizacion`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`bdcotizacion`.`totalGeneral` AS `totalGeneral`,`bdclick5`.`bdcotizacion`.`estadoGeneral` AS `estadoGeneral`,`bdclick5`.`bdterceros`.`id` AS `Id`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,\'\' AS `plazo` from (`bdclick5`.`bdcotizacion` join `bdclick5`.`bdterceros` on((`bdclick5`.`bdcotizacion`.`cliente` = `bdclick5`.`bdterceros`.`idSistema`))) group by `bdclick5`.`bdcotizacion`.`idFactura`,`bdclick5`.`bdcotizacion`.`fechaFactura`,`bdclick5`.`bdcotizacion`.`totalGeneral`,`bdclick5`.`bdcotizacion`.`estadoGeneral`,\'\'
mariadb-version=100135
