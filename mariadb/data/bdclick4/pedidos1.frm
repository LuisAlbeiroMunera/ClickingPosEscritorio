TYPE=VIEW
query=(select `bdclick4`.`bdpedido`.`idFactura` AS `idFactura`,`bdclick4`.`bdpedido`.`producto` AS `producto`,`bdclick4`.`bdpedido`.`cantidad` AS `cantidad`,`bdclick4`.`bdpedido`.`anulada` AS `anulada`,`bdclick4`.`bdpedido`.`estado2` AS `estado2`,cast(substr(`bdclick4`.`bdpedido`.`fechaFactura`,1,10) as date) AS `fechaFactura`,`bdclick4`.`bdpedido`.`cliente` AS `cliente`,`bdclick4`.`bdpedido`.`garantia` AS `nombre`,`bdclick4`.`bdpedido`.`totalGeneral` AS `totalGeneral`,`bdclick4`.`bdpedido`.`estadoGeneral` AS `estadoGeneral`,`bdclick4`.`bdpedido`.`bodega` AS `bodega` from `bdclick4`.`bdpedido` where ((`bdclick4`.`bdpedido`.`anulada` = 0) and (`bdclick4`.`bdpedido`.`estado2` = \'\')))
md5=300212f975c16dc18a0fffef99cc799b
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:29
create-version=2
source=(select `bdpedido`.`idFactura` AS `idFactura`,`bdpedido`.`producto` AS `producto`,`bdpedido`.`cantidad` AS `cantidad`,`bdpedido`.`anulada` AS `anulada`,`bdpedido`.`estado2` AS `estado2`,cast(substr(`bdpedido`.`fechaFactura`,1,10) as date) AS `fechaFactura`,`bdpedido`.`cliente` AS `cliente`,`bdpedido`.`garantia` AS `nombre`,`bdpedido`.`totalGeneral` AS `totalGeneral`,`bdpedido`.`estadoGeneral` AS `estadoGeneral`,`bdpedido`.`bodega` AS `bodega` from `bdpedido` where ((`bdpedido`.`anulada` = 0) and (`bdpedido`.`estado2` = \'\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`bdpedido`.`idFactura` AS `idFactura`,`bdclick4`.`bdpedido`.`producto` AS `producto`,`bdclick4`.`bdpedido`.`cantidad` AS `cantidad`,`bdclick4`.`bdpedido`.`anulada` AS `anulada`,`bdclick4`.`bdpedido`.`estado2` AS `estado2`,cast(substr(`bdclick4`.`bdpedido`.`fechaFactura`,1,10) as date) AS `fechaFactura`,`bdclick4`.`bdpedido`.`cliente` AS `cliente`,`bdclick4`.`bdpedido`.`garantia` AS `nombre`,`bdclick4`.`bdpedido`.`totalGeneral` AS `totalGeneral`,`bdclick4`.`bdpedido`.`estadoGeneral` AS `estadoGeneral`,`bdclick4`.`bdpedido`.`bodega` AS `bodega` from `bdclick4`.`bdpedido` where ((`bdclick4`.`bdpedido`.`anulada` = 0) and (`bdclick4`.`bdpedido`.`estado2` = \'\')))
mariadb-version=100135
