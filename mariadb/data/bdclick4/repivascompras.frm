TYPE=VIEW
query=select `bdclick4`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick4`.`bdcompra`.`porIva` AS `porcIva`,sum(`bdclick4`.`bdcompra`.`iva`) AS `SumaDeiva`,sum(`bdclick4`.`bdcompra`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick4`.`bdcompra`.`descuento`) AS `SumaDedescuento`,sum(`bdclick4`.`bdcompra`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from (`bdclick4`.`bdingreso` join `bdclick4`.`bdcompra` on((`bdclick4`.`bdingreso`.`id` = `bdclick4`.`bdcompra`.`ingreso`))) group by `bdclick4`.`bdingreso`.`fechaFactura`,`bdclick4`.`bdcompra`.`porIva`,\'\',`bdclick4`.`bdingreso`.`anulada` having (`bdclick4`.`bdingreso`.`anulada` = 0)
md5=3e0ab326a849270ee0dea797fa8b6160
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:30
create-version=2
source=select `bdingreso`.`fechaFactura` AS `fechaFactura`,`bdcompra`.`porIva` AS `porcIva`,sum(`bdcompra`.`iva`) AS `SumaDeiva`,sum(`bdcompra`.`subtotal`) AS `SumaDesubtotal`,sum(`bdcompra`.`descuento`) AS `SumaDedescuento`,sum(`bdcompra`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from (`bdingreso` join `bdcompra` on((`bdingreso`.`id` = `bdcompra`.`ingreso`))) group by `bdingreso`.`fechaFactura`,`bdcompra`.`porIva`,\'\',`bdingreso`.`anulada` having (`bdingreso`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick4`.`bdcompra`.`porIva` AS `porcIva`,sum(`bdclick4`.`bdcompra`.`iva`) AS `SumaDeiva`,sum(`bdclick4`.`bdcompra`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick4`.`bdcompra`.`descuento`) AS `SumaDedescuento`,sum(`bdclick4`.`bdcompra`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from (`bdclick4`.`bdingreso` join `bdclick4`.`bdcompra` on((`bdclick4`.`bdingreso`.`id` = `bdclick4`.`bdcompra`.`ingreso`))) group by `bdclick4`.`bdingreso`.`fechaFactura`,`bdclick4`.`bdcompra`.`porIva`,\'\',`bdclick4`.`bdingreso`.`anulada` having (`bdclick4`.`bdingreso`.`anulada` = 0)
mariadb-version=100135
