TYPE=VIEW
query=select `bdclick1`.`bdingreso`.`id` AS `id`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`bdclick1`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick1`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick1`.`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick1`.`bdcxp`.`valor` AS `valor`,`bdclick1`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick1`.`bdcxp`.`tipo` AS `tipo`,`bdclick1`.`bdingreso`.`anulada` AS `anulada`,`bdclick1`.`bdcxp`.`estado` AS `estado`,`bdclick1`.`bdterceros`.`direccion` AS `direccion`,`bdclick1`.`bdterceros`.`telefono` AS `telefono`,`bdclick1`.`bdterceros`.`id` AS `IdTercero`,`bdclick1`.`bdcxp`.`recibo` AS `recibo`,`bdclick1`.`bdcxp`.`vencimiento` AS `vencimiento`,`bdclick1`.`bdingreso`.`terminal` AS `terminal`,`bdingreso_1`.`rtIca` AS `rtIca`,`bdingreso_1`.`efectivo` AS `efectivo`,`bdingreso_1`.`cheque` AS `cheque`,`bdingreso_1`.`tarjeta` AS `tarjeta`,`bdingreso_1`.`descFinanciero` AS `descFinanciero`,`bdingreso_1`.`descProntoPago` AS `descProntoPago`,`bdingreso_1`.`rtIva` AS `rtIva`,`bdingreso_1`.`rtFuente` AS `rtFuente` from (((`bdclick1`.`bdingreso` left join `bdclick1`.`bdcxp` on((`bdclick1`.`bdingreso`.`id` = `bdclick1`.`bdcxp`.`ingreso`))) join `bdclick1`.`bdterceros` on((`bdclick1`.`bdingreso`.`proveedor` = `bdclick1`.`bdterceros`.`idSistema`))) left join `bdclick1`.`bdingreso` `bdingreso_1` on((`bdclick1`.`bdcxp`.`recibo` = `bdingreso_1`.`id`))) where ((`bdclick1`.`bdcxp`.`ingreso` <> \'\') and (`bdclick1`.`bdcxp`.`tipo` = \'PAGO\'))
md5=d4091b5cd90684df9d0d5666e4f87b90
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:37
create-version=2
source=select `bdingreso`.`id` AS `id`,`bdterceros`.`nombre` AS `nombre`,`bdcxp`.`ingreso` AS `ingreso`,`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdcxp`.`valor` AS `valor`,`bdingreso`.`proveedor` AS `proveedor`,`bdcxp`.`tipo` AS `tipo`,`bdingreso`.`anulada` AS `anulada`,`bdcxp`.`estado` AS `estado`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`id` AS `IdTercero`,`bdcxp`.`recibo` AS `recibo`,`bdcxp`.`vencimiento` AS `vencimiento`,`bdingreso`.`terminal` AS `terminal`,`bdingreso_1`.`rtIca` AS `rtIca`,`bdingreso_1`.`efectivo` AS `efectivo`,`bdingreso_1`.`cheque` AS `cheque`,`bdingreso_1`.`tarjeta` AS `tarjeta`,`bdingreso_1`.`descFinanciero` AS `descFinanciero`,`bdingreso_1`.`descProntoPago` AS `descProntoPago`,`bdingreso_1`.`rtIva` AS `rtIva`,`bdingreso_1`.`rtFuente` AS `rtFuente` from (((`bdingreso` left join `bdcxp` on((`bdingreso`.`id` = `bdcxp`.`ingreso`))) join `bdterceros` on((`bdingreso`.`proveedor` = `bdterceros`.`idSistema`))) left join `bdingreso` `bdingreso_1` on((`bdcxp`.`recibo` = `bdingreso_1`.`id`))) where ((`bdcxp`.`ingreso` <> \'\') and (`bdcxp`.`tipo` = \'PAGO\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdingreso`.`id` AS `id`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`bdclick1`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick1`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick1`.`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick1`.`bdcxp`.`valor` AS `valor`,`bdclick1`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick1`.`bdcxp`.`tipo` AS `tipo`,`bdclick1`.`bdingreso`.`anulada` AS `anulada`,`bdclick1`.`bdcxp`.`estado` AS `estado`,`bdclick1`.`bdterceros`.`direccion` AS `direccion`,`bdclick1`.`bdterceros`.`telefono` AS `telefono`,`bdclick1`.`bdterceros`.`id` AS `IdTercero`,`bdclick1`.`bdcxp`.`recibo` AS `recibo`,`bdclick1`.`bdcxp`.`vencimiento` AS `vencimiento`,`bdclick1`.`bdingreso`.`terminal` AS `terminal`,`bdingreso_1`.`rtIca` AS `rtIca`,`bdingreso_1`.`efectivo` AS `efectivo`,`bdingreso_1`.`cheque` AS `cheque`,`bdingreso_1`.`tarjeta` AS `tarjeta`,`bdingreso_1`.`descFinanciero` AS `descFinanciero`,`bdingreso_1`.`descProntoPago` AS `descProntoPago`,`bdingreso_1`.`rtIva` AS `rtIva`,`bdingreso_1`.`rtFuente` AS `rtFuente` from (((`bdclick1`.`bdingreso` left join `bdclick1`.`bdcxp` on((`bdclick1`.`bdingreso`.`id` = `bdclick1`.`bdcxp`.`ingreso`))) join `bdclick1`.`bdterceros` on((`bdclick1`.`bdingreso`.`proveedor` = `bdclick1`.`bdterceros`.`idSistema`))) left join `bdclick1`.`bdingreso` `bdingreso_1` on((`bdclick1`.`bdcxp`.`recibo` = `bdingreso_1`.`id`))) where ((`bdclick1`.`bdcxp`.`ingreso` <> \'\') and (`bdclick1`.`bdcxp`.`tipo` = \'PAGO\'))
mariadb-version=100135