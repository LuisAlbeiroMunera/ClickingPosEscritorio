TYPE=VIEW
query=select `bdclick1`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick1`.`bdcompra`.`porcImpo` AS `porcImpo`,sum(`bdclick1`.`bdcompra`.`impoconsumo`) AS `SumaDeiva`,sum(`bdclick1`.`bdcompra`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick1`.`bdcompra`.`descuento`) AS `SumaDedescuento`,sum(`bdclick1`.`bdcompra`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from (`bdclick1`.`bdingreso` join `bdclick1`.`bdcompra` on((`bdclick1`.`bdingreso`.`id` = `bdclick1`.`bdcompra`.`ingreso`))) group by `bdclick1`.`bdingreso`.`fechaFactura`,`bdclick1`.`bdcompra`.`porcImpo`,\'\',`bdclick1`.`bdingreso`.`anulada` having (`bdclick1`.`bdingreso`.`anulada` = 0)
md5=d12c526cdea8beb81585f033882f2e71
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:37
create-version=2
source=select `bdingreso`.`fechaFactura` AS `fechaFactura`,`bdcompra`.`porcImpo` AS `porcImpo`,sum(`bdcompra`.`impoconsumo`) AS `SumaDeiva`,sum(`bdcompra`.`subtotal`) AS `SumaDesubtotal`,sum(`bdcompra`.`descuento`) AS `SumaDedescuento`,sum(`bdcompra`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from (`bdingreso` join `bdcompra` on((`bdingreso`.`id` = `bdcompra`.`ingreso`))) group by `bdingreso`.`fechaFactura`,`bdcompra`.`porcImpo`,\'\',`bdingreso`.`anulada` having (`bdingreso`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick1`.`bdcompra`.`porcImpo` AS `porcImpo`,sum(`bdclick1`.`bdcompra`.`impoconsumo`) AS `SumaDeiva`,sum(`bdclick1`.`bdcompra`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick1`.`bdcompra`.`descuento`) AS `SumaDedescuento`,sum(`bdclick1`.`bdcompra`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from (`bdclick1`.`bdingreso` join `bdclick1`.`bdcompra` on((`bdclick1`.`bdingreso`.`id` = `bdclick1`.`bdcompra`.`ingreso`))) group by `bdclick1`.`bdingreso`.`fechaFactura`,`bdclick1`.`bdcompra`.`porcImpo`,\'\',`bdclick1`.`bdingreso`.`anulada` having (`bdclick1`.`bdingreso`.`anulada` = 0)
mariadb-version=100135
