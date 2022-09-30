TYPE=VIEW
query=select `bdclick`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick`.`bdcompra`.`porIva` AS `porcIva`,sum(`bdclick`.`bdcompra`.`iva`) AS `SumaDeiva`,sum(`bdclick`.`bdcompra`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick`.`bdcompra`.`descuento`) AS `SumaDedescuento`,sum(`bdclick`.`bdcompra`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from (`bdclick`.`bdingreso` join `bdclick`.`bdcompra` on((`bdclick`.`bdingreso`.`id` = `bdclick`.`bdcompra`.`ingreso`))) group by `bdclick`.`bdingreso`.`fechaFactura`,`bdclick`.`bdcompra`.`porIva`,\'\',`bdclick`.`bdingreso`.`anulada` having (`bdclick`.`bdingreso`.`anulada` = 0)
md5=d89c1ea82b963a9843574efea56ef433
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:26
create-version=2
source=select `bdingreso`.`fechaFactura` AS `fechaFactura`,`bdcompra`.`porIva` AS `porcIva`,sum(`bdcompra`.`iva`) AS `SumaDeiva`,sum(`bdcompra`.`subtotal`) AS `SumaDesubtotal`,sum(`bdcompra`.`descuento`) AS `SumaDedescuento`,sum(`bdcompra`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from (`bdingreso` join `bdcompra` on((`bdingreso`.`id` = `bdcompra`.`ingreso`))) group by `bdingreso`.`fechaFactura`,`bdcompra`.`porIva`,\'\',`bdingreso`.`anulada` having (`bdingreso`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick`.`bdcompra`.`porIva` AS `porcIva`,sum(`bdclick`.`bdcompra`.`iva`) AS `SumaDeiva`,sum(`bdclick`.`bdcompra`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick`.`bdcompra`.`descuento`) AS `SumaDedescuento`,sum(`bdclick`.`bdcompra`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from (`bdclick`.`bdingreso` join `bdclick`.`bdcompra` on((`bdclick`.`bdingreso`.`id` = `bdclick`.`bdcompra`.`ingreso`))) group by `bdclick`.`bdingreso`.`fechaFactura`,`bdclick`.`bdcompra`.`porIva`,\'\',`bdclick`.`bdingreso`.`anulada` having (`bdclick`.`bdingreso`.`anulada` = 0)
mariadb-version=100135
