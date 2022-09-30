TYPE=VIEW
query=select `bdclick6`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick6`.`bdfactura`.`porcImpo` AS `porcImpo`,sum(`bdclick6`.`bdfactura`.`impoconsumo`) AS `SumaDeiva`,sum(`bdclick6`.`bdfactura`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick6`.`bdfactura`.`descuento`) AS `SumaDedescuento`,sum(`bdclick6`.`bdfactura`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from `bdclick6`.`bdfactura` group by `bdclick6`.`bdfactura`.`fechaFactura`,`bdclick6`.`bdfactura`.`porcImpo`,\'\',`bdclick6`.`bdfactura`.`anulada` having (`bdclick6`.`bdfactura`.`anulada` = 0)
md5=c3f71453afb4d3ef1cc9cfa85b4a9d10
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:38
create-version=2
source=select `bdfactura`.`fechaFactura` AS `fechaFactura`,`bdfactura`.`porcImpo` AS `porcImpo`,sum(`bdfactura`.`impoconsumo`) AS `SumaDeiva`,sum(`bdfactura`.`subtotal`) AS `SumaDesubtotal`,sum(`bdfactura`.`descuento`) AS `SumaDedescuento`,sum(`bdfactura`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from `bdfactura` group by `bdfactura`.`fechaFactura`,`bdfactura`.`porcImpo`,\'\',`bdfactura`.`anulada` having (`bdfactura`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick6`.`bdfactura`.`porcImpo` AS `porcImpo`,sum(`bdclick6`.`bdfactura`.`impoconsumo`) AS `SumaDeiva`,sum(`bdclick6`.`bdfactura`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick6`.`bdfactura`.`descuento`) AS `SumaDedescuento`,sum(`bdclick6`.`bdfactura`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from `bdclick6`.`bdfactura` group by `bdclick6`.`bdfactura`.`fechaFactura`,`bdclick6`.`bdfactura`.`porcImpo`,\'\',`bdclick6`.`bdfactura`.`anulada` having (`bdclick6`.`bdfactura`.`anulada` = 0)
mariadb-version=100135
