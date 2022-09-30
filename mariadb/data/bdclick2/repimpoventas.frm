TYPE=VIEW
query=select `bdclick2`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick2`.`bdfactura`.`porcImpo` AS `porcImpo`,sum(`bdclick2`.`bdfactura`.`impoconsumo`) AS `SumaDeiva`,sum(`bdclick2`.`bdfactura`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick2`.`bdfactura`.`descuento`) AS `SumaDedescuento`,sum(`bdclick2`.`bdfactura`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from `bdclick2`.`bdfactura` group by `bdclick2`.`bdfactura`.`fechaFactura`,`bdclick2`.`bdfactura`.`porcImpo`,\'\',`bdclick2`.`bdfactura`.`anulada` having (`bdclick2`.`bdfactura`.`anulada` = 0)
md5=f2a34344bbf8ca1fce7fda501cc165b6
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:47
create-version=2
source=select `bdfactura`.`fechaFactura` AS `fechaFactura`,`bdfactura`.`porcImpo` AS `porcImpo`,sum(`bdfactura`.`impoconsumo`) AS `SumaDeiva`,sum(`bdfactura`.`subtotal`) AS `SumaDesubtotal`,sum(`bdfactura`.`descuento`) AS `SumaDedescuento`,sum(`bdfactura`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from `bdfactura` group by `bdfactura`.`fechaFactura`,`bdfactura`.`porcImpo`,\'\',`bdfactura`.`anulada` having (`bdfactura`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick2`.`bdfactura`.`porcImpo` AS `porcImpo`,sum(`bdclick2`.`bdfactura`.`impoconsumo`) AS `SumaDeiva`,sum(`bdclick2`.`bdfactura`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick2`.`bdfactura`.`descuento`) AS `SumaDedescuento`,sum(`bdclick2`.`bdfactura`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from `bdclick2`.`bdfactura` group by `bdclick2`.`bdfactura`.`fechaFactura`,`bdclick2`.`bdfactura`.`porcImpo`,\'\',`bdclick2`.`bdfactura`.`anulada` having (`bdclick2`.`bdfactura`.`anulada` = 0)
mariadb-version=100135
