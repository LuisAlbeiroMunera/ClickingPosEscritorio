TYPE=VIEW
query=select `bdclick4`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick4`.`bdfactura`.`porcIva` AS `porcIva`,sum(`bdclick4`.`bdfactura`.`iva`) AS `SumaDeiva`,sum(`bdclick4`.`bdfactura`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick4`.`bdfactura`.`descuento`) AS `SumaDedescuento`,sum(`bdclick4`.`bdfactura`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from `bdclick4`.`bdfactura` group by `bdclick4`.`bdfactura`.`fechaFactura`,`bdclick4`.`bdfactura`.`porcIva`,\'\',`bdclick4`.`bdfactura`.`anulada` having (`bdclick4`.`bdfactura`.`anulada` = 0)
md5=8cfcd8e5d7919da81f349e50b9453734
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:30
create-version=2
source=select `bdfactura`.`fechaFactura` AS `fechaFactura`,`bdfactura`.`porcIva` AS `porcIva`,sum(`bdfactura`.`iva`) AS `SumaDeiva`,sum(`bdfactura`.`subtotal`) AS `SumaDesubtotal`,sum(`bdfactura`.`descuento`) AS `SumaDedescuento`,sum(`bdfactura`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from `bdfactura` group by `bdfactura`.`fechaFactura`,`bdfactura`.`porcIva`,\'\',`bdfactura`.`anulada` having (`bdfactura`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick4`.`bdfactura`.`porcIva` AS `porcIva`,sum(`bdclick4`.`bdfactura`.`iva`) AS `SumaDeiva`,sum(`bdclick4`.`bdfactura`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick4`.`bdfactura`.`descuento`) AS `SumaDedescuento`,sum(`bdclick4`.`bdfactura`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from `bdclick4`.`bdfactura` group by `bdclick4`.`bdfactura`.`fechaFactura`,`bdclick4`.`bdfactura`.`porcIva`,\'\',`bdclick4`.`bdfactura`.`anulada` having (`bdclick4`.`bdfactura`.`anulada` = 0)
mariadb-version=100135
