TYPE=VIEW
query=(select `bdclick`.`bdpedido`.`idFactura` AS `idFactura`,`bdclick`.`bdpedido`.`producto` AS `producto`,`bdclick`.`bdpedido`.`cantidad` AS `cantidad`,`bdclick`.`bdpedido`.`anulada` AS `anulada`,`bdclick`.`bdpedido`.`estado2` AS `estado2`,cast(substr(`bdclick`.`bdpedido`.`fechaFactura`,1,10) as date) AS `fechaFactura`,`bdclick`.`bdpedido`.`cliente` AS `cliente`,`bdclick`.`bdpedido`.`garantia` AS `nombre`,`bdclick`.`bdpedido`.`totalGeneral` AS `totalGeneral`,`bdclick`.`bdpedido`.`estadoGeneral` AS `estadoGeneral`,`bdclick`.`bdpedido`.`bodega` AS `bodega` from `bdclick`.`bdpedido` where ((`bdclick`.`bdpedido`.`anulada` = 0) and (`bdclick`.`bdpedido`.`estado2` = \'\')))
md5=b62982cb3a69be40b9a557a2c9f1830c
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:25
create-version=2
source=(select `bdpedido`.`idFactura` AS `idFactura`,`bdpedido`.`producto` AS `producto`,`bdpedido`.`cantidad` AS `cantidad`,`bdpedido`.`anulada` AS `anulada`,`bdpedido`.`estado2` AS `estado2`,cast(substr(`bdpedido`.`fechaFactura`,1,10) as date) AS `fechaFactura`,`bdpedido`.`cliente` AS `cliente`,`bdpedido`.`garantia` AS `nombre`,`bdpedido`.`totalGeneral` AS `totalGeneral`,`bdpedido`.`estadoGeneral` AS `estadoGeneral`,`bdpedido`.`bodega` AS `bodega` from `bdpedido` where ((`bdpedido`.`anulada` = 0) and (`bdpedido`.`estado2` = \'\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdpedido`.`idFactura` AS `idFactura`,`bdclick`.`bdpedido`.`producto` AS `producto`,`bdclick`.`bdpedido`.`cantidad` AS `cantidad`,`bdclick`.`bdpedido`.`anulada` AS `anulada`,`bdclick`.`bdpedido`.`estado2` AS `estado2`,cast(substr(`bdclick`.`bdpedido`.`fechaFactura`,1,10) as date) AS `fechaFactura`,`bdclick`.`bdpedido`.`cliente` AS `cliente`,`bdclick`.`bdpedido`.`garantia` AS `nombre`,`bdclick`.`bdpedido`.`totalGeneral` AS `totalGeneral`,`bdclick`.`bdpedido`.`estadoGeneral` AS `estadoGeneral`,`bdclick`.`bdpedido`.`bodega` AS `bodega` from `bdclick`.`bdpedido` where ((`bdclick`.`bdpedido`.`anulada` = 0) and (`bdclick`.`bdpedido`.`estado2` = \'\')))
mariadb-version=100135
