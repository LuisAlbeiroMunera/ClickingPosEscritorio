TYPE=VIEW
query=select `bdclick3`.`bdoservicio1`.`idFactura` AS `idFactura`,`bdclick3`.`bdoservicio1`.`fechaFactura` AS `fechaFactura`,`bdclick3`.`bdoservicio1`.`cliente` AS `cliente1`,`bdclick3`.`bdoservicio1`.`totalGeneral` AS `totalGeneral`,`bdclick3`.`bdoservicio1`.`vendedor` AS `vendedor`,`bdclick3`.`bdoservicio1`.`anulada` AS `anulada`,`bdclick3`.`bdoservicio1`.`estadoGeneral` AS `estadoGeneral`,`bdclick3`.`bdoservicio1`.`bodega` AS `bodega`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdterceros`.`id` AS `cliente` from (`bdclick3`.`bdoservicio1` left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdoservicio1`.`cliente` = `bdclick3`.`bdterceros`.`idSistema`))) group by `bdclick3`.`bdoservicio1`.`idFactura`,`bdclick3`.`bdoservicio1`.`fechaFactura`,`bdclick3`.`bdoservicio1`.`cliente`,`bdclick3`.`bdoservicio1`.`totalGeneral`,`bdclick3`.`bdoservicio1`.`vendedor`,`bdclick3`.`bdoservicio1`.`anulada`,`bdclick3`.`bdoservicio1`.`estadoGeneral`,`bdclick3`.`bdoservicio1`.`bodega`,`bdclick3`.`bdterceros`.`nombre`,`bdclick3`.`bdterceros`.`id` having ((`bdclick3`.`bdoservicio1`.`anulada` = 0) and (`bdclick3`.`bdoservicio1`.`estadoGeneral` = \'PENDIENTE\'))
md5=76344a346d37f3690ed2b5ea0bc6ffa1
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:51
create-version=2
source=select `bdoservicio1`.`idFactura` AS `idFactura`,`bdoservicio1`.`fechaFactura` AS `fechaFactura`,`bdoservicio1`.`cliente` AS `cliente1`,`bdoservicio1`.`totalGeneral` AS `totalGeneral`,`bdoservicio1`.`vendedor` AS `vendedor`,`bdoservicio1`.`anulada` AS `anulada`,`bdoservicio1`.`estadoGeneral` AS `estadoGeneral`,`bdoservicio1`.`bodega` AS `bodega`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`id` AS `cliente` from (`bdoservicio1` left join `bdterceros` on((`bdoservicio1`.`cliente` = `bdterceros`.`idSistema`))) group by `bdoservicio1`.`idFactura`,`bdoservicio1`.`fechaFactura`,`bdoservicio1`.`cliente`,`bdoservicio1`.`totalGeneral`,`bdoservicio1`.`vendedor`,`bdoservicio1`.`anulada`,`bdoservicio1`.`estadoGeneral`,`bdoservicio1`.`bodega`,`bdterceros`.`nombre`,`bdterceros`.`id` having ((`bdoservicio1`.`anulada` = 0) and (`bdoservicio1`.`estadoGeneral` = \'PENDIENTE\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdoservicio1`.`idFactura` AS `idFactura`,`bdclick3`.`bdoservicio1`.`fechaFactura` AS `fechaFactura`,`bdclick3`.`bdoservicio1`.`cliente` AS `cliente1`,`bdclick3`.`bdoservicio1`.`totalGeneral` AS `totalGeneral`,`bdclick3`.`bdoservicio1`.`vendedor` AS `vendedor`,`bdclick3`.`bdoservicio1`.`anulada` AS `anulada`,`bdclick3`.`bdoservicio1`.`estadoGeneral` AS `estadoGeneral`,`bdclick3`.`bdoservicio1`.`bodega` AS `bodega`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdterceros`.`id` AS `cliente` from (`bdclick3`.`bdoservicio1` left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdoservicio1`.`cliente` = `bdclick3`.`bdterceros`.`idSistema`))) group by `bdclick3`.`bdoservicio1`.`idFactura`,`bdclick3`.`bdoservicio1`.`fechaFactura`,`bdclick3`.`bdoservicio1`.`cliente`,`bdclick3`.`bdoservicio1`.`totalGeneral`,`bdclick3`.`bdoservicio1`.`vendedor`,`bdclick3`.`bdoservicio1`.`anulada`,`bdclick3`.`bdoservicio1`.`estadoGeneral`,`bdclick3`.`bdoservicio1`.`bodega`,`bdclick3`.`bdterceros`.`nombre`,`bdclick3`.`bdterceros`.`id` having ((`bdclick3`.`bdoservicio1`.`anulada` = 0) and (`bdclick3`.`bdoservicio1`.`estadoGeneral` = \'PENDIENTE\'))
mariadb-version=100135
