TYPE=VIEW
query=(select `bdclick3`.`bdpedido`.`idFactura` AS `idFactura`,`bdclick3`.`bdpedido`.`producto` AS `producto`,`bdclick3`.`bdpedido`.`cantidad` AS `cantidad`,`bdclick3`.`bdpedido`.`anulada` AS `anulada`,`bdclick3`.`bdpedido`.`estado2` AS `estado2`,cast(substr(`bdclick3`.`bdpedido`.`fechaFactura`,1,10) as date) AS `fechaFactura`,`bdclick3`.`bdpedido`.`cliente` AS `cliente`,`bdclick3`.`bdpedido`.`garantia` AS `nombre`,`bdclick3`.`bdpedido`.`totalGeneral` AS `totalGeneral`,`bdclick3`.`bdpedido`.`estadoGeneral` AS `estadoGeneral`,`bdclick3`.`bdpedido`.`bodega` AS `bodega` from `bdclick3`.`bdpedido` where ((`bdclick3`.`bdpedido`.`anulada` = 0) and (`bdclick3`.`bdpedido`.`estado2` = \'\')))
md5=e5a715ffb7e2e0e036bde9c3ac96b7ee
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:52
create-version=2
source=(select `bdpedido`.`idFactura` AS `idFactura`,`bdpedido`.`producto` AS `producto`,`bdpedido`.`cantidad` AS `cantidad`,`bdpedido`.`anulada` AS `anulada`,`bdpedido`.`estado2` AS `estado2`,cast(substr(`bdpedido`.`fechaFactura`,1,10) as date) AS `fechaFactura`,`bdpedido`.`cliente` AS `cliente`,`bdpedido`.`garantia` AS `nombre`,`bdpedido`.`totalGeneral` AS `totalGeneral`,`bdpedido`.`estadoGeneral` AS `estadoGeneral`,`bdpedido`.`bodega` AS `bodega` from `bdpedido` where ((`bdpedido`.`anulada` = 0) and (`bdpedido`.`estado2` = \'\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bdpedido`.`idFactura` AS `idFactura`,`bdclick3`.`bdpedido`.`producto` AS `producto`,`bdclick3`.`bdpedido`.`cantidad` AS `cantidad`,`bdclick3`.`bdpedido`.`anulada` AS `anulada`,`bdclick3`.`bdpedido`.`estado2` AS `estado2`,cast(substr(`bdclick3`.`bdpedido`.`fechaFactura`,1,10) as date) AS `fechaFactura`,`bdclick3`.`bdpedido`.`cliente` AS `cliente`,`bdclick3`.`bdpedido`.`garantia` AS `nombre`,`bdclick3`.`bdpedido`.`totalGeneral` AS `totalGeneral`,`bdclick3`.`bdpedido`.`estadoGeneral` AS `estadoGeneral`,`bdclick3`.`bdpedido`.`bodega` AS `bodega` from `bdclick3`.`bdpedido` where ((`bdclick3`.`bdpedido`.`anulada` = 0) and (`bdclick3`.`bdpedido`.`estado2` = \'\')))
mariadb-version=100135
