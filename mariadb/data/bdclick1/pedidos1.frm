TYPE=VIEW
query=(select `bdclick1`.`bdpedido`.`idFactura` AS `idFactura`,`bdclick1`.`bdpedido`.`producto` AS `producto`,`bdclick1`.`bdpedido`.`cantidad` AS `cantidad`,`bdclick1`.`bdpedido`.`anulada` AS `anulada`,`bdclick1`.`bdpedido`.`estado2` AS `estado2`,cast(substr(`bdclick1`.`bdpedido`.`fechaFactura`,1,10) as date) AS `fechaFactura`,`bdclick1`.`bdpedido`.`cliente` AS `cliente`,`bdclick1`.`bdpedido`.`garantia` AS `nombre`,`bdclick1`.`bdpedido`.`totalGeneral` AS `totalGeneral`,`bdclick1`.`bdpedido`.`estadoGeneral` AS `estadoGeneral`,`bdclick1`.`bdpedido`.`bodega` AS `bodega` from `bdclick1`.`bdpedido` where ((`bdclick1`.`bdpedido`.`anulada` = 0) and (`bdclick1`.`bdpedido`.`estado2` = \'\')))
md5=239a489a21c44fa6d55594d2f5c25ab2
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:36
create-version=2
source=(select `bdpedido`.`idFactura` AS `idFactura`,`bdpedido`.`producto` AS `producto`,`bdpedido`.`cantidad` AS `cantidad`,`bdpedido`.`anulada` AS `anulada`,`bdpedido`.`estado2` AS `estado2`,cast(substr(`bdpedido`.`fechaFactura`,1,10) as date) AS `fechaFactura`,`bdpedido`.`cliente` AS `cliente`,`bdpedido`.`garantia` AS `nombre`,`bdpedido`.`totalGeneral` AS `totalGeneral`,`bdpedido`.`estadoGeneral` AS `estadoGeneral`,`bdpedido`.`bodega` AS `bodega` from `bdpedido` where ((`bdpedido`.`anulada` = 0) and (`bdpedido`.`estado2` = \'\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick1`.`bdpedido`.`idFactura` AS `idFactura`,`bdclick1`.`bdpedido`.`producto` AS `producto`,`bdclick1`.`bdpedido`.`cantidad` AS `cantidad`,`bdclick1`.`bdpedido`.`anulada` AS `anulada`,`bdclick1`.`bdpedido`.`estado2` AS `estado2`,cast(substr(`bdclick1`.`bdpedido`.`fechaFactura`,1,10) as date) AS `fechaFactura`,`bdclick1`.`bdpedido`.`cliente` AS `cliente`,`bdclick1`.`bdpedido`.`garantia` AS `nombre`,`bdclick1`.`bdpedido`.`totalGeneral` AS `totalGeneral`,`bdclick1`.`bdpedido`.`estadoGeneral` AS `estadoGeneral`,`bdclick1`.`bdpedido`.`bodega` AS `bodega` from `bdclick1`.`bdpedido` where ((`bdclick1`.`bdpedido`.`anulada` = 0) and (`bdclick1`.`bdpedido`.`estado2` = \'\')))
mariadb-version=100135
