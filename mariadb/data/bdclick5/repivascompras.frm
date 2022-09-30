TYPE=VIEW
query=select `bdclick5`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`bdcompra`.`porIva` AS `porcIva`,sum(`bdclick5`.`bdcompra`.`iva`) AS `SumaDeiva`,sum(`bdclick5`.`bdcompra`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick5`.`bdcompra`.`descuento`) AS `SumaDedescuento`,sum(`bdclick5`.`bdcompra`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from (`bdclick5`.`bdingreso` join `bdclick5`.`bdcompra` on((`bdclick5`.`bdingreso`.`id` = `bdclick5`.`bdcompra`.`ingreso`))) group by `bdclick5`.`bdingreso`.`fechaFactura`,`bdclick5`.`bdcompra`.`porIva`,\'\',`bdclick5`.`bdingreso`.`anulada` having (`bdclick5`.`bdingreso`.`anulada` = 0)
md5=ff36e1af3458296d8ae90f927459b6b1
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:49
create-version=2
source=select `bdingreso`.`fechaFactura` AS `fechaFactura`,`bdcompra`.`porIva` AS `porcIva`,sum(`bdcompra`.`iva`) AS `SumaDeiva`,sum(`bdcompra`.`subtotal`) AS `SumaDesubtotal`,sum(`bdcompra`.`descuento`) AS `SumaDedescuento`,sum(`bdcompra`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from (`bdingreso` join `bdcompra` on((`bdingreso`.`id` = `bdcompra`.`ingreso`))) group by `bdingreso`.`fechaFactura`,`bdcompra`.`porIva`,\'\',`bdingreso`.`anulada` having (`bdingreso`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`bdcompra`.`porIva` AS `porcIva`,sum(`bdclick5`.`bdcompra`.`iva`) AS `SumaDeiva`,sum(`bdclick5`.`bdcompra`.`subtotal`) AS `SumaDesubtotal`,sum(`bdclick5`.`bdcompra`.`descuento`) AS `SumaDedescuento`,sum(`bdclick5`.`bdcompra`.`total`) AS `SumaDetotal`,\'\' AS `producto`,\'\' AS `cliente`,\'\' AS `vendedor` from (`bdclick5`.`bdingreso` join `bdclick5`.`bdcompra` on((`bdclick5`.`bdingreso`.`id` = `bdclick5`.`bdcompra`.`ingreso`))) group by `bdclick5`.`bdingreso`.`fechaFactura`,`bdclick5`.`bdcompra`.`porIva`,\'\',`bdclick5`.`bdingreso`.`anulada` having (`bdclick5`.`bdingreso`.`anulada` = 0)
mariadb-version=100135
