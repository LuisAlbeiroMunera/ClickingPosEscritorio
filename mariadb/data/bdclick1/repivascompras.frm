TYPE=VIEW
query=select `bdclick1`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick1`.`bdcompra`.`porIva` AS `porcIva`,sum(`bdclick1`.`bdcompra`.`iva`) AS `SumaDeiva`,sum(`bdclick1`.`bdcompra`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick1`.`bdcompra`.`descuento`) AS `SumaDedescuento`,sum(`bdclick1`.`bdcompra`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from (`bdclick1`.`bdingreso` join `bdclick1`.`bdcompra` on((`bdclick1`.`bdingreso`.`id` = `bdclick1`.`bdcompra`.`ingreso`))) group by `bdclick1`.`bdingreso`.`fechaFactura`,`bdclick1`.`bdcompra`.`porIva`,\'\',`bdclick1`.`bdingreso`.`anulada` having (`bdclick1`.`bdingreso`.`anulada` = 0)
md5=12b08f5baab4ffda39f3d02fee3251d0
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:37
create-version=2
source=select `bdingreso`.`fechaFactura` AS `fechaFactura`,`bdcompra`.`porIva` AS `porcIva`,sum(`bdcompra`.`iva`) AS `SumaDeiva`,sum(`bdcompra`.`subtotal`) AS `SumaDesubtotal`,sum(`bdcompra`.`descuento`) AS `SumaDedescuento`,sum(`bdcompra`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from (`bdingreso` join `bdcompra` on((`bdingreso`.`id` = `bdcompra`.`ingreso`))) group by `bdingreso`.`fechaFactura`,`bdcompra`.`porIva`,\'\',`bdingreso`.`anulada` having (`bdingreso`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick1`.`bdcompra`.`porIva` AS `porcIva`,sum(`bdclick1`.`bdcompra`.`iva`) AS `SumaDeiva`,sum(`bdclick1`.`bdcompra`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick1`.`bdcompra`.`descuento`) AS `SumaDedescuento`,sum(`bdclick1`.`bdcompra`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from (`bdclick1`.`bdingreso` join `bdclick1`.`bdcompra` on((`bdclick1`.`bdingreso`.`id` = `bdclick1`.`bdcompra`.`ingreso`))) group by `bdclick1`.`bdingreso`.`fechaFactura`,`bdclick1`.`bdcompra`.`porIva`,\'\',`bdclick1`.`bdingreso`.`anulada` having (`bdclick1`.`bdingreso`.`anulada` = 0)
mariadb-version=100135
