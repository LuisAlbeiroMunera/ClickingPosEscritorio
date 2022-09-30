TYPE=VIEW
query=(select `bdclick2`.`bdpedido`.`idFactura` AS `idFactura`,`bdclick2`.`bdpedido`.`producto` AS `producto`,`bdclick2`.`bdpedido`.`cantidad` AS `cantidad`,`bdclick2`.`bdpedido`.`anulada` AS `anulada`,`bdclick2`.`bdpedido`.`estado2` AS `estado2`,cast(substr(`bdclick2`.`bdpedido`.`fechaFactura`,1,10) as date) AS `fechaFactura`,`bdclick2`.`bdpedido`.`cliente` AS `cliente`,`bdclick2`.`bdpedido`.`garantia` AS `nombre`,`bdclick2`.`bdpedido`.`totalGeneral` AS `totalGeneral`,`bdclick2`.`bdpedido`.`estadoGeneral` AS `estadoGeneral`,`bdclick2`.`bdpedido`.`bodega` AS `bodega` from `bdclick2`.`bdpedido` where ((`bdclick2`.`bdpedido`.`anulada` = 0) and (`bdclick2`.`bdpedido`.`estado2` = \'\')))
md5=cb176847079d4001b5670d8dc5c8e06e
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:46
create-version=2
source=(select `bdpedido`.`idFactura` AS `idFactura`,`bdpedido`.`producto` AS `producto`,`bdpedido`.`cantidad` AS `cantidad`,`bdpedido`.`anulada` AS `anulada`,`bdpedido`.`estado2` AS `estado2`,cast(substr(`bdpedido`.`fechaFactura`,1,10) as date) AS `fechaFactura`,`bdpedido`.`cliente` AS `cliente`,`bdpedido`.`garantia` AS `nombre`,`bdpedido`.`totalGeneral` AS `totalGeneral`,`bdpedido`.`estadoGeneral` AS `estadoGeneral`,`bdpedido`.`bodega` AS `bodega` from `bdpedido` where ((`bdpedido`.`anulada` = 0) and (`bdpedido`.`estado2` = \'\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick2`.`bdpedido`.`idFactura` AS `idFactura`,`bdclick2`.`bdpedido`.`producto` AS `producto`,`bdclick2`.`bdpedido`.`cantidad` AS `cantidad`,`bdclick2`.`bdpedido`.`anulada` AS `anulada`,`bdclick2`.`bdpedido`.`estado2` AS `estado2`,cast(substr(`bdclick2`.`bdpedido`.`fechaFactura`,1,10) as date) AS `fechaFactura`,`bdclick2`.`bdpedido`.`cliente` AS `cliente`,`bdclick2`.`bdpedido`.`garantia` AS `nombre`,`bdclick2`.`bdpedido`.`totalGeneral` AS `totalGeneral`,`bdclick2`.`bdpedido`.`estadoGeneral` AS `estadoGeneral`,`bdclick2`.`bdpedido`.`bodega` AS `bodega` from `bdclick2`.`bdpedido` where ((`bdclick2`.`bdpedido`.`anulada` = 0) and (`bdclick2`.`bdpedido`.`estado2` = \'\')))
mariadb-version=100135
