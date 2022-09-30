TYPE=VIEW
query=select `bdclick1`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick1`.`bdfactura`.`porcIva` AS `porcIva`,sum(`bdclick1`.`bdfactura`.`iva`) AS `SumaDeiva`,sum(`bdclick1`.`bdfactura`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick1`.`bdfactura`.`descuento`) AS `SumaDedescuento`,sum(`bdclick1`.`bdfactura`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from `bdclick1`.`bdfactura` group by `bdclick1`.`bdfactura`.`fechaFactura`,`bdclick1`.`bdfactura`.`porcIva`,\'\',`bdclick1`.`bdfactura`.`anulada` having (`bdclick1`.`bdfactura`.`anulada` = 0)
md5=db2259a117e7525a59b60821845966a1
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:37
create-version=2
source=select `bdfactura`.`fechaFactura` AS `fechaFactura`,`bdfactura`.`porcIva` AS `porcIva`,sum(`bdfactura`.`iva`) AS `SumaDeiva`,sum(`bdfactura`.`subtotal`) AS `SumaDesubtotal`,sum(`bdfactura`.`descuento`) AS `SumaDedescuento`,sum(`bdfactura`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from `bdfactura` group by `bdfactura`.`fechaFactura`,`bdfactura`.`porcIva`,\'\',`bdfactura`.`anulada` having (`bdfactura`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick1`.`bdfactura`.`porcIva` AS `porcIva`,sum(`bdclick1`.`bdfactura`.`iva`) AS `SumaDeiva`,sum(`bdclick1`.`bdfactura`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick1`.`bdfactura`.`descuento`) AS `SumaDedescuento`,sum(`bdclick1`.`bdfactura`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from `bdclick1`.`bdfactura` group by `bdclick1`.`bdfactura`.`fechaFactura`,`bdclick1`.`bdfactura`.`porcIva`,\'\',`bdclick1`.`bdfactura`.`anulada` having (`bdclick1`.`bdfactura`.`anulada` = 0)
mariadb-version=100135
