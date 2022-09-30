TYPE=VIEW
query=select `bdclick5`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`bdfactura`.`porcImpo` AS `porcImpo`,sum(`bdclick5`.`bdfactura`.`impoconsumo`) AS `SumaDeiva`,sum(`bdclick5`.`bdfactura`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick5`.`bdfactura`.`descuento`) AS `SumaDedescuento`,sum(`bdclick5`.`bdfactura`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from `bdclick5`.`bdfactura` group by `bdclick5`.`bdfactura`.`fechaFactura`,`bdclick5`.`bdfactura`.`porcImpo`,\'\',`bdclick5`.`bdfactura`.`anulada` having (`bdclick5`.`bdfactura`.`anulada` = 0)
md5=ad1e9a8ffb70436214e88f88f6dfca2c
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:49
create-version=2
source=select `bdfactura`.`fechaFactura` AS `fechaFactura`,`bdfactura`.`porcImpo` AS `porcImpo`,sum(`bdfactura`.`impoconsumo`) AS `SumaDeiva`,sum(`bdfactura`.`subtotal`) AS `SumaDesubtotal`,sum(`bdfactura`.`descuento`) AS `SumaDedescuento`,sum(`bdfactura`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from `bdfactura` group by `bdfactura`.`fechaFactura`,`bdfactura`.`porcImpo`,\'\',`bdfactura`.`anulada` having (`bdfactura`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`bdfactura`.`porcImpo` AS `porcImpo`,sum(`bdclick5`.`bdfactura`.`impoconsumo`) AS `SumaDeiva`,sum(`bdclick5`.`bdfactura`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick5`.`bdfactura`.`descuento`) AS `SumaDedescuento`,sum(`bdclick5`.`bdfactura`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from `bdclick5`.`bdfactura` group by `bdclick5`.`bdfactura`.`fechaFactura`,`bdclick5`.`bdfactura`.`porcImpo`,\'\',`bdclick5`.`bdfactura`.`anulada` having (`bdclick5`.`bdfactura`.`anulada` = 0)
mariadb-version=100135
