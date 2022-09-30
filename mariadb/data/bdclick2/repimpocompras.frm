TYPE=VIEW
query=select `bdclick2`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick2`.`bdcompra`.`porcImpo` AS `porcImpo`,sum(`bdclick2`.`bdcompra`.`impoconsumo`) AS `SumaDeiva`,sum(`bdclick2`.`bdcompra`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick2`.`bdcompra`.`descuento`) AS `SumaDedescuento`,sum(`bdclick2`.`bdcompra`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from (`bdclick2`.`bdingreso` join `bdclick2`.`bdcompra` on((`bdclick2`.`bdingreso`.`id` = `bdclick2`.`bdcompra`.`ingreso`))) group by `bdclick2`.`bdingreso`.`fechaFactura`,`bdclick2`.`bdcompra`.`porcImpo`,\'\',`bdclick2`.`bdingreso`.`anulada` having (`bdclick2`.`bdingreso`.`anulada` = 0)
md5=d17decb45b35e980b2343285729fc0c0
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:47
create-version=2
source=select `bdingreso`.`fechaFactura` AS `fechaFactura`,`bdcompra`.`porcImpo` AS `porcImpo`,sum(`bdcompra`.`impoconsumo`) AS `SumaDeiva`,sum(`bdcompra`.`subtotal`) AS `SumaDesubtotal`,sum(`bdcompra`.`descuento`) AS `SumaDedescuento`,sum(`bdcompra`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from (`bdingreso` join `bdcompra` on((`bdingreso`.`id` = `bdcompra`.`ingreso`))) group by `bdingreso`.`fechaFactura`,`bdcompra`.`porcImpo`,\'\',`bdingreso`.`anulada` having (`bdingreso`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick2`.`bdcompra`.`porcImpo` AS `porcImpo`,sum(`bdclick2`.`bdcompra`.`impoconsumo`) AS `SumaDeiva`,sum(`bdclick2`.`bdcompra`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick2`.`bdcompra`.`descuento`) AS `SumaDedescuento`,sum(`bdclick2`.`bdcompra`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from (`bdclick2`.`bdingreso` join `bdclick2`.`bdcompra` on((`bdclick2`.`bdingreso`.`id` = `bdclick2`.`bdcompra`.`ingreso`))) group by `bdclick2`.`bdingreso`.`fechaFactura`,`bdclick2`.`bdcompra`.`porcImpo`,\'\',`bdclick2`.`bdingreso`.`anulada` having (`bdclick2`.`bdingreso`.`anulada` = 0)
mariadb-version=100135
