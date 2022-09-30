TYPE=VIEW
query=(select `bdclick6`.`bdpedido`.`idFactura` AS `idFactura`,`bdclick6`.`bdpedido`.`producto` AS `producto`,`bdclick6`.`bdpedido`.`cantidad` AS `cantidad`,`bdclick6`.`bdpedido`.`anulada` AS `anulada`,`bdclick6`.`bdpedido`.`estado2` AS `estado2`,cast(substr(`bdclick6`.`bdpedido`.`fechaFactura`,1,10) as date) AS `fechaFactura`,`bdclick6`.`bdpedido`.`cliente` AS `cliente`,`bdclick6`.`bdpedido`.`garantia` AS `nombre`,`bdclick6`.`bdpedido`.`totalGeneral` AS `totalGeneral`,`bdclick6`.`bdpedido`.`estadoGeneral` AS `estadoGeneral`,`bdclick6`.`bdpedido`.`bodega` AS `bodega` from `bdclick6`.`bdpedido` where ((`bdclick6`.`bdpedido`.`anulada` = 0) and (`bdclick6`.`bdpedido`.`estado2` = \'\')))
md5=2e00df42e3236e30acf0b871849b9916
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:36
create-version=2
source=(select `bdpedido`.`idFactura` AS `idFactura`,`bdpedido`.`producto` AS `producto`,`bdpedido`.`cantidad` AS `cantidad`,`bdpedido`.`anulada` AS `anulada`,`bdpedido`.`estado2` AS `estado2`,cast(substr(`bdpedido`.`fechaFactura`,1,10) as date) AS `fechaFactura`,`bdpedido`.`cliente` AS `cliente`,`bdpedido`.`garantia` AS `nombre`,`bdpedido`.`totalGeneral` AS `totalGeneral`,`bdpedido`.`estadoGeneral` AS `estadoGeneral`,`bdpedido`.`bodega` AS `bodega` from `bdpedido` where ((`bdpedido`.`anulada` = 0) and (`bdpedido`.`estado2` = \'\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bdpedido`.`idFactura` AS `idFactura`,`bdclick6`.`bdpedido`.`producto` AS `producto`,`bdclick6`.`bdpedido`.`cantidad` AS `cantidad`,`bdclick6`.`bdpedido`.`anulada` AS `anulada`,`bdclick6`.`bdpedido`.`estado2` AS `estado2`,cast(substr(`bdclick6`.`bdpedido`.`fechaFactura`,1,10) as date) AS `fechaFactura`,`bdclick6`.`bdpedido`.`cliente` AS `cliente`,`bdclick6`.`bdpedido`.`garantia` AS `nombre`,`bdclick6`.`bdpedido`.`totalGeneral` AS `totalGeneral`,`bdclick6`.`bdpedido`.`estadoGeneral` AS `estadoGeneral`,`bdclick6`.`bdpedido`.`bodega` AS `bodega` from `bdclick6`.`bdpedido` where ((`bdclick6`.`bdpedido`.`anulada` = 0) and (`bdclick6`.`bdpedido`.`estado2` = \'\')))
mariadb-version=100135
