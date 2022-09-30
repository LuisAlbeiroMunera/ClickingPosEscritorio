TYPE=VIEW
query=(select `bdclick5`.`bdpedido`.`idFactura` AS `idFactura`,`bdclick5`.`bdpedido`.`producto` AS `producto`,`bdclick5`.`bdpedido`.`cantidad` AS `cantidad`,`bdclick5`.`bdpedido`.`anulada` AS `anulada`,`bdclick5`.`bdpedido`.`estado2` AS `estado2`,cast(substr(`bdclick5`.`bdpedido`.`fechaFactura`,1,10) as date) AS `fechaFactura`,`bdclick5`.`bdpedido`.`cliente` AS `cliente`,`bdclick5`.`bdpedido`.`garantia` AS `nombre`,`bdclick5`.`bdpedido`.`totalGeneral` AS `totalGeneral`,`bdclick5`.`bdpedido`.`estadoGeneral` AS `estadoGeneral`,`bdclick5`.`bdpedido`.`bodega` AS `bodega` from `bdclick5`.`bdpedido` where ((`bdclick5`.`bdpedido`.`anulada` = 0) and (`bdclick5`.`bdpedido`.`estado2` = \'\')))
md5=89c568a840acf41c2f9312eafde93a2e
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:48
create-version=2
source=(select `bdpedido`.`idFactura` AS `idFactura`,`bdpedido`.`producto` AS `producto`,`bdpedido`.`cantidad` AS `cantidad`,`bdpedido`.`anulada` AS `anulada`,`bdpedido`.`estado2` AS `estado2`,cast(substr(`bdpedido`.`fechaFactura`,1,10) as date) AS `fechaFactura`,`bdpedido`.`cliente` AS `cliente`,`bdpedido`.`garantia` AS `nombre`,`bdpedido`.`totalGeneral` AS `totalGeneral`,`bdpedido`.`estadoGeneral` AS `estadoGeneral`,`bdpedido`.`bodega` AS `bodega` from `bdpedido` where ((`bdpedido`.`anulada` = 0) and (`bdpedido`.`estado2` = \'\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`bdpedido`.`idFactura` AS `idFactura`,`bdclick5`.`bdpedido`.`producto` AS `producto`,`bdclick5`.`bdpedido`.`cantidad` AS `cantidad`,`bdclick5`.`bdpedido`.`anulada` AS `anulada`,`bdclick5`.`bdpedido`.`estado2` AS `estado2`,cast(substr(`bdclick5`.`bdpedido`.`fechaFactura`,1,10) as date) AS `fechaFactura`,`bdclick5`.`bdpedido`.`cliente` AS `cliente`,`bdclick5`.`bdpedido`.`garantia` AS `nombre`,`bdclick5`.`bdpedido`.`totalGeneral` AS `totalGeneral`,`bdclick5`.`bdpedido`.`estadoGeneral` AS `estadoGeneral`,`bdclick5`.`bdpedido`.`bodega` AS `bodega` from `bdclick5`.`bdpedido` where ((`bdclick5`.`bdpedido`.`anulada` = 0) and (`bdclick5`.`bdpedido`.`estado2` = \'\')))
mariadb-version=100135
