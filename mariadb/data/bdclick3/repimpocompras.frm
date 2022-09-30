TYPE=VIEW
query=select `bdclick3`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick3`.`bdcompra`.`porcImpo` AS `porcImpo`,sum(`bdclick3`.`bdcompra`.`impoconsumo`) AS `SumaDeiva`,sum(`bdclick3`.`bdcompra`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick3`.`bdcompra`.`descuento`) AS `SumaDedescuento`,sum(`bdclick3`.`bdcompra`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from (`bdclick3`.`bdingreso` join `bdclick3`.`bdcompra` on((`bdclick3`.`bdingreso`.`id` = `bdclick3`.`bdcompra`.`ingreso`))) group by `bdclick3`.`bdingreso`.`fechaFactura`,`bdclick3`.`bdcompra`.`porcImpo`,\'\',`bdclick3`.`bdingreso`.`anulada` having (`bdclick3`.`bdingreso`.`anulada` = 0)
md5=62afb7d7d13ee81e84d0c1a4392a184d
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:53
create-version=2
source=select `bdingreso`.`fechaFactura` AS `fechaFactura`,`bdcompra`.`porcImpo` AS `porcImpo`,sum(`bdcompra`.`impoconsumo`) AS `SumaDeiva`,sum(`bdcompra`.`subtotal`) AS `SumaDesubtotal`,sum(`bdcompra`.`descuento`) AS `SumaDedescuento`,sum(`bdcompra`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from (`bdingreso` join `bdcompra` on((`bdingreso`.`id` = `bdcompra`.`ingreso`))) group by `bdingreso`.`fechaFactura`,`bdcompra`.`porcImpo`,\'\',`bdingreso`.`anulada` having (`bdingreso`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick3`.`bdcompra`.`porcImpo` AS `porcImpo`,sum(`bdclick3`.`bdcompra`.`impoconsumo`) AS `SumaDeiva`,sum(`bdclick3`.`bdcompra`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick3`.`bdcompra`.`descuento`) AS `SumaDedescuento`,sum(`bdclick3`.`bdcompra`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from (`bdclick3`.`bdingreso` join `bdclick3`.`bdcompra` on((`bdclick3`.`bdingreso`.`id` = `bdclick3`.`bdcompra`.`ingreso`))) group by `bdclick3`.`bdingreso`.`fechaFactura`,`bdclick3`.`bdcompra`.`porcImpo`,\'\',`bdclick3`.`bdingreso`.`anulada` having (`bdclick3`.`bdingreso`.`anulada` = 0)
mariadb-version=100135
