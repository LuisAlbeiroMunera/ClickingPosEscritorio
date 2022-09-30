TYPE=VIEW
query=select `bdclick6`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick6`.`bdcompra`.`porcImpo` AS `porcImpo`,sum(`bdclick6`.`bdcompra`.`impoconsumo`) AS `SumaDeiva`,sum(`bdclick6`.`bdcompra`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick6`.`bdcompra`.`descuento`) AS `SumaDedescuento`,sum(`bdclick6`.`bdcompra`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from (`bdclick6`.`bdingreso` join `bdclick6`.`bdcompra` on((`bdclick6`.`bdingreso`.`id` = `bdclick6`.`bdcompra`.`ingreso`))) group by `bdclick6`.`bdingreso`.`fechaFactura`,`bdclick6`.`bdcompra`.`porcImpo`,\'\',`bdclick6`.`bdingreso`.`anulada` having (`bdclick6`.`bdingreso`.`anulada` = 0)
md5=c6a743a523197d4c4a66dcf8738a675a
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:38
create-version=2
source=select `bdingreso`.`fechaFactura` AS `fechaFactura`,`bdcompra`.`porcImpo` AS `porcImpo`,sum(`bdcompra`.`impoconsumo`) AS `SumaDeiva`,sum(`bdcompra`.`subtotal`) AS `SumaDesubtotal`,sum(`bdcompra`.`descuento`) AS `SumaDedescuento`,sum(`bdcompra`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from (`bdingreso` join `bdcompra` on((`bdingreso`.`id` = `bdcompra`.`ingreso`))) group by `bdingreso`.`fechaFactura`,`bdcompra`.`porcImpo`,\'\',`bdingreso`.`anulada` having (`bdingreso`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick6`.`bdcompra`.`porcImpo` AS `porcImpo`,sum(`bdclick6`.`bdcompra`.`impoconsumo`) AS `SumaDeiva`,sum(`bdclick6`.`bdcompra`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick6`.`bdcompra`.`descuento`) AS `SumaDedescuento`,sum(`bdclick6`.`bdcompra`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from (`bdclick6`.`bdingreso` join `bdclick6`.`bdcompra` on((`bdclick6`.`bdingreso`.`id` = `bdclick6`.`bdcompra`.`ingreso`))) group by `bdclick6`.`bdingreso`.`fechaFactura`,`bdclick6`.`bdcompra`.`porcImpo`,\'\',`bdclick6`.`bdingreso`.`anulada` having (`bdclick6`.`bdingreso`.`anulada` = 0)
mariadb-version=100135
