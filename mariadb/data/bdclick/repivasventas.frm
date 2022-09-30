TYPE=VIEW
query=select `bdclick`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick`.`bdfactura`.`porcIva` AS `porcIva`,sum(`bdclick`.`bdfactura`.`iva`) AS `SumaDeiva`,sum(`bdclick`.`bdfactura`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick`.`bdfactura`.`descuento`) AS `SumaDedescuento`,sum(`bdclick`.`bdfactura`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from `bdclick`.`bdfactura` group by `bdclick`.`bdfactura`.`fechaFactura`,`bdclick`.`bdfactura`.`porcIva`,\'\',`bdclick`.`bdfactura`.`anulada` having (`bdclick`.`bdfactura`.`anulada` = 0)
md5=93af73e1ddb37e806730e1a591f217a1
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:26
create-version=2
source=select `bdfactura`.`fechaFactura` AS `fechaFactura`,`bdfactura`.`porcIva` AS `porcIva`,sum(`bdfactura`.`iva`) AS `SumaDeiva`,sum(`bdfactura`.`subtotal`) AS `SumaDesubtotal`,sum(`bdfactura`.`descuento`) AS `SumaDedescuento`,sum(`bdfactura`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from `bdfactura` group by `bdfactura`.`fechaFactura`,`bdfactura`.`porcIva`,\'\',`bdfactura`.`anulada` having (`bdfactura`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick`.`bdfactura`.`porcIva` AS `porcIva`,sum(`bdclick`.`bdfactura`.`iva`) AS `SumaDeiva`,sum(`bdclick`.`bdfactura`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick`.`bdfactura`.`descuento`) AS `SumaDedescuento`,sum(`bdclick`.`bdfactura`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from `bdclick`.`bdfactura` group by `bdclick`.`bdfactura`.`fechaFactura`,`bdclick`.`bdfactura`.`porcIva`,\'\',`bdclick`.`bdfactura`.`anulada` having (`bdclick`.`bdfactura`.`anulada` = 0)
mariadb-version=100135
