TYPE=VIEW
query=select `bdclick3`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick3`.`bdfactura`.`porcIva` AS `porcIva`,sum(`bdclick3`.`bdfactura`.`iva`) AS `SumaDeiva`,sum(`bdclick3`.`bdfactura`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick3`.`bdfactura`.`descuento`) AS `SumaDedescuento`,sum(`bdclick3`.`bdfactura`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from `bdclick3`.`bdfactura` group by `bdclick3`.`bdfactura`.`fechaFactura`,`bdclick3`.`bdfactura`.`porcIva`,\'\',`bdclick3`.`bdfactura`.`anulada` having (`bdclick3`.`bdfactura`.`anulada` = 0)
md5=35d176e2764e954dac283dd47ffe1d91
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:53
create-version=2
source=select `bdfactura`.`fechaFactura` AS `fechaFactura`,`bdfactura`.`porcIva` AS `porcIva`,sum(`bdfactura`.`iva`) AS `SumaDeiva`,sum(`bdfactura`.`subtotal`) AS `SumaDesubtotal`,sum(`bdfactura`.`descuento`) AS `SumaDedescuento`,sum(`bdfactura`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from `bdfactura` group by `bdfactura`.`fechaFactura`,`bdfactura`.`porcIva`,\'\',`bdfactura`.`anulada` having (`bdfactura`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick3`.`bdfactura`.`porcIva` AS `porcIva`,sum(`bdclick3`.`bdfactura`.`iva`) AS `SumaDeiva`,sum(`bdclick3`.`bdfactura`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick3`.`bdfactura`.`descuento`) AS `SumaDedescuento`,sum(`bdclick3`.`bdfactura`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from `bdclick3`.`bdfactura` group by `bdclick3`.`bdfactura`.`fechaFactura`,`bdclick3`.`bdfactura`.`porcIva`,\'\',`bdclick3`.`bdfactura`.`anulada` having (`bdclick3`.`bdfactura`.`anulada` = 0)
mariadb-version=100135
