TYPE=VIEW
query=select `bdclick`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick`.`bdcompra`.`porcImpo` AS `porcImpo`,sum(`bdclick`.`bdcompra`.`impoconsumo`) AS `SumaDeiva`,sum(`bdclick`.`bdcompra`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick`.`bdcompra`.`descuento`) AS `SumaDedescuento`,sum(`bdclick`.`bdcompra`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from (`bdclick`.`bdingreso` join `bdclick`.`bdcompra` on((`bdclick`.`bdingreso`.`id` = `bdclick`.`bdcompra`.`ingreso`))) group by `bdclick`.`bdingreso`.`fechaFactura`,`bdclick`.`bdcompra`.`porcImpo`,\'\',`bdclick`.`bdingreso`.`anulada` having (`bdclick`.`bdingreso`.`anulada` = 0)
md5=6367aad144edc78a22514f28edec18b7
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:26
create-version=2
source=select `bdingreso`.`fechaFactura` AS `fechaFactura`,`bdcompra`.`porcImpo` AS `porcImpo`,sum(`bdcompra`.`impoconsumo`) AS `SumaDeiva`,sum(`bdcompra`.`subtotal`) AS `SumaDesubtotal`,sum(`bdcompra`.`descuento`) AS `SumaDedescuento`,sum(`bdcompra`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from (`bdingreso` join `bdcompra` on((`bdingreso`.`id` = `bdcompra`.`ingreso`))) group by `bdingreso`.`fechaFactura`,`bdcompra`.`porcImpo`,\'\',`bdingreso`.`anulada` having (`bdingreso`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick`.`bdcompra`.`porcImpo` AS `porcImpo`,sum(`bdclick`.`bdcompra`.`impoconsumo`) AS `SumaDeiva`,sum(`bdclick`.`bdcompra`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick`.`bdcompra`.`descuento`) AS `SumaDedescuento`,sum(`bdclick`.`bdcompra`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from (`bdclick`.`bdingreso` join `bdclick`.`bdcompra` on((`bdclick`.`bdingreso`.`id` = `bdclick`.`bdcompra`.`ingreso`))) group by `bdclick`.`bdingreso`.`fechaFactura`,`bdclick`.`bdcompra`.`porcImpo`,\'\',`bdclick`.`bdingreso`.`anulada` having (`bdclick`.`bdingreso`.`anulada` = 0)
mariadb-version=100135
