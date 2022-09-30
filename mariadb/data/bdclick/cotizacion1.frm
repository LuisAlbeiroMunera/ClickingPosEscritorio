TYPE=VIEW
query=select `bdclick`.`bdcotizacion`.`idFactura` AS `idFactura`,`bdclick`.`bdcotizacion`.`fechaFactura` AS `fechaFactura`,`bdclick`.`bdcotizacion`.`totalGeneral` AS `totalGeneral`,`bdclick`.`bdcotizacion`.`estadoGeneral` AS `estadoGeneral`,`bdclick`.`bdterceros`.`id` AS `Id`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,\'\' AS `plazo` from (`bdclick`.`bdcotizacion` join `bdclick`.`bdterceros` on((`bdclick`.`bdcotizacion`.`cliente` = `bdclick`.`bdterceros`.`idSistema`))) group by `bdclick`.`bdcotizacion`.`idFactura`,`bdclick`.`bdcotizacion`.`fechaFactura`,`bdclick`.`bdcotizacion`.`totalGeneral`,`bdclick`.`bdcotizacion`.`estadoGeneral`,\'\'
md5=bdbc515547e3b925f020de4dc21589e5
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:23
create-version=2
source=select `bdcotizacion`.`idFactura` AS `idFactura`,`bdcotizacion`.`fechaFactura` AS `fechaFactura`,`bdcotizacion`.`totalGeneral` AS `totalGeneral`,`bdcotizacion`.`estadoGeneral` AS `estadoGeneral`,`bdterceros`.`id` AS `Id`,`bdterceros`.`nombre` AS `nombre`,\'\' AS `plazo` from (`bdcotizacion` join `bdterceros` on((`bdcotizacion`.`cliente` = `bdterceros`.`idSistema`))) group by `bdcotizacion`.`idFactura`,`bdcotizacion`.`fechaFactura`,`bdcotizacion`.`totalGeneral`,`bdcotizacion`.`estadoGeneral`,\'\'
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdcotizacion`.`idFactura` AS `idFactura`,`bdclick`.`bdcotizacion`.`fechaFactura` AS `fechaFactura`,`bdclick`.`bdcotizacion`.`totalGeneral` AS `totalGeneral`,`bdclick`.`bdcotizacion`.`estadoGeneral` AS `estadoGeneral`,`bdclick`.`bdterceros`.`id` AS `Id`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,\'\' AS `plazo` from (`bdclick`.`bdcotizacion` join `bdclick`.`bdterceros` on((`bdclick`.`bdcotizacion`.`cliente` = `bdclick`.`bdterceros`.`idSistema`))) group by `bdclick`.`bdcotizacion`.`idFactura`,`bdclick`.`bdcotizacion`.`fechaFactura`,`bdclick`.`bdcotizacion`.`totalGeneral`,`bdclick`.`bdcotizacion`.`estadoGeneral`,\'\'
mariadb-version=100135
