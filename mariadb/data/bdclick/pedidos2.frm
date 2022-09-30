TYPE=VIEW
query=select `bdclick`.`bdpedido`.`idFactura` AS `idFactura`,`bdclick`.`bdpedido`.`anulada` AS `anulada`,`bdclick`.`bdpedido`.`estado2` AS `estado2`,cast(substr(`bdclick`.`bdpedido`.`fechaFactura`,1,10) as date) AS `fechaFactura`,`bdclick`.`bdpedido`.`cliente` AS `cliente`,`bdclick`.`bdpedido`.`garantia` AS `nombre`,`bdclick`.`bdpedido`.`totalGeneral` AS `totalGeneral`,`bdclick`.`bdpedido`.`estadoGeneral` AS `estadoGeneral`,`bdclick`.`bdpedido`.`bodega` AS `bodega`,`bdclick`.`bdterceros`.`id` AS `Id`,`bdclick`.`bdpedido`.`vendedor` AS `vendedor` from (`bdclick`.`bdpedido` left join `bdclick`.`bdterceros` on((`bdclick`.`bdterceros`.`idSistema` = `bdclick`.`bdpedido`.`cliente`))) group by `bdclick`.`bdpedido`.`idFactura`,`bdclick`.`bdpedido`.`anulada`,`bdclick`.`bdpedido`.`estado2`,cast(substr(`bdclick`.`bdpedido`.`fechaFactura`,1,10) as date),`bdclick`.`bdpedido`.`cliente`,`bdclick`.`bdpedido`.`garantia`,`bdclick`.`bdpedido`.`totalGeneral`,`bdclick`.`bdpedido`.`estadoGeneral`,`bdclick`.`bdpedido`.`bodega`,`bdclick`.`bdterceros`.`id`,`bdclick`.`bdpedido`.`vendedor` having ((`bdclick`.`bdpedido`.`anulada` = 0) and ((`bdclick`.`bdpedido`.`estado2` = \'\') or isnull(`bdclick`.`bdpedido`.`estado2`)))
md5=28230b9b187c890aaaabb574109daf7f
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:25
create-version=2
source=select `bdpedido`.`idFactura` AS `idFactura`,`bdpedido`.`anulada` AS `anulada`,`bdpedido`.`estado2` AS `estado2`,cast(substr(`bdpedido`.`fechaFactura`,1,10) as date) AS `fechaFactura`,`bdpedido`.`cliente` AS `cliente`,`bdpedido`.`garantia` AS `nombre`,`bdpedido`.`totalGeneral` AS `totalGeneral`,`bdpedido`.`estadoGeneral` AS `estadoGeneral`,`bdpedido`.`bodega` AS `bodega`,`bdterceros`.`id` AS `Id`,`bdpedido`.`vendedor` AS `vendedor` from (`bdpedido` left join `bdterceros` on((`bdterceros`.`idSistema` = `bdpedido`.`cliente`))) group by `bdpedido`.`idFactura`,`bdpedido`.`anulada`,`bdpedido`.`estado2`,cast(substr(`bdpedido`.`fechaFactura`,1,10) as date),`bdpedido`.`cliente`,`bdpedido`.`garantia`,`bdpedido`.`totalGeneral`,`bdpedido`.`estadoGeneral`,`bdpedido`.`bodega`,`bdterceros`.`id`,`bdpedido`.`vendedor` having ((`bdpedido`.`anulada` = 0) and ((`bdpedido`.`estado2` = \'\') or isnull(`bdpedido`.`estado2`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdpedido`.`idFactura` AS `idFactura`,`bdclick`.`bdpedido`.`anulada` AS `anulada`,`bdclick`.`bdpedido`.`estado2` AS `estado2`,cast(substr(`bdclick`.`bdpedido`.`fechaFactura`,1,10) as date) AS `fechaFactura`,`bdclick`.`bdpedido`.`cliente` AS `cliente`,`bdclick`.`bdpedido`.`garantia` AS `nombre`,`bdclick`.`bdpedido`.`totalGeneral` AS `totalGeneral`,`bdclick`.`bdpedido`.`estadoGeneral` AS `estadoGeneral`,`bdclick`.`bdpedido`.`bodega` AS `bodega`,`bdclick`.`bdterceros`.`id` AS `Id`,`bdclick`.`bdpedido`.`vendedor` AS `vendedor` from (`bdclick`.`bdpedido` left join `bdclick`.`bdterceros` on((`bdclick`.`bdterceros`.`idSistema` = `bdclick`.`bdpedido`.`cliente`))) group by `bdclick`.`bdpedido`.`idFactura`,`bdclick`.`bdpedido`.`anulada`,`bdclick`.`bdpedido`.`estado2`,cast(substr(`bdclick`.`bdpedido`.`fechaFactura`,1,10) as date),`bdclick`.`bdpedido`.`cliente`,`bdclick`.`bdpedido`.`garantia`,`bdclick`.`bdpedido`.`totalGeneral`,`bdclick`.`bdpedido`.`estadoGeneral`,`bdclick`.`bdpedido`.`bodega`,`bdclick`.`bdterceros`.`id`,`bdclick`.`bdpedido`.`vendedor` having ((`bdclick`.`bdpedido`.`anulada` = 0) and ((`bdclick`.`bdpedido`.`estado2` = \'\') or isnull(`bdclick`.`bdpedido`.`estado2`)))
mariadb-version=100135