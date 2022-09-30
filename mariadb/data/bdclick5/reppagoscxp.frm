TYPE=VIEW
query=select `bdclick5`.`bdingreso`.`id` AS `id`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick5`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick5`.`bdcxp`.`valor` AS `valor`,`bdclick5`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick5`.`bdcxp`.`tipo` AS `tipo`,`bdclick5`.`bdingreso`.`anulada` AS `anulada`,`bdclick5`.`bdcxp`.`estado` AS `estado`,`bdclick5`.`bdterceros`.`direccion` AS `direccion`,`bdclick5`.`bdterceros`.`telefono` AS `telefono`,`bdclick5`.`bdterceros`.`id` AS `IdTercero`,`bdclick5`.`bdcxp`.`recibo` AS `recibo`,`bdclick5`.`bdcxp`.`vencimiento` AS `vencimiento`,`bdclick5`.`bdingreso`.`terminal` AS `terminal`,`bdingreso_1`.`rtIca` AS `rtIca`,`bdingreso_1`.`efectivo` AS `efectivo`,`bdingreso_1`.`cheque` AS `cheque`,`bdingreso_1`.`tarjeta` AS `tarjeta`,`bdingreso_1`.`descFinanciero` AS `descFinanciero`,`bdingreso_1`.`descProntoPago` AS `descProntoPago`,`bdingreso_1`.`rtIva` AS `rtIva`,`bdingreso_1`.`rtFuente` AS `rtFuente` from (((`bdclick5`.`bdingreso` left join `bdclick5`.`bdcxp` on((`bdclick5`.`bdingreso`.`id` = `bdclick5`.`bdcxp`.`ingreso`))) join `bdclick5`.`bdterceros` on((`bdclick5`.`bdingreso`.`proveedor` = `bdclick5`.`bdterceros`.`idSistema`))) left join `bdclick5`.`bdingreso` `bdingreso_1` on((`bdclick5`.`bdcxp`.`recibo` = `bdingreso_1`.`id`))) where ((`bdclick5`.`bdcxp`.`ingreso` <> \'\') and (`bdclick5`.`bdcxp`.`tipo` = \'PAGO\'))
md5=5623553743fd6f40090bcfe124d5d1a4
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:50
create-version=2
source=select `bdingreso`.`id` AS `id`,`bdterceros`.`nombre` AS `nombre`,`bdcxp`.`ingreso` AS `ingreso`,`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdcxp`.`valor` AS `valor`,`bdingreso`.`proveedor` AS `proveedor`,`bdcxp`.`tipo` AS `tipo`,`bdingreso`.`anulada` AS `anulada`,`bdcxp`.`estado` AS `estado`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`id` AS `IdTercero`,`bdcxp`.`recibo` AS `recibo`,`bdcxp`.`vencimiento` AS `vencimiento`,`bdingreso`.`terminal` AS `terminal`,`bdingreso_1`.`rtIca` AS `rtIca`,`bdingreso_1`.`efectivo` AS `efectivo`,`bdingreso_1`.`cheque` AS `cheque`,`bdingreso_1`.`tarjeta` AS `tarjeta`,`bdingreso_1`.`descFinanciero` AS `descFinanciero`,`bdingreso_1`.`descProntoPago` AS `descProntoPago`,`bdingreso_1`.`rtIva` AS `rtIva`,`bdingreso_1`.`rtFuente` AS `rtFuente` from (((`bdingreso` left join `bdcxp` on((`bdingreso`.`id` = `bdcxp`.`ingreso`))) join `bdterceros` on((`bdingreso`.`proveedor` = `bdterceros`.`idSistema`))) left join `bdingreso` `bdingreso_1` on((`bdcxp`.`recibo` = `bdingreso_1`.`id`))) where ((`bdcxp`.`ingreso` <> \'\') and (`bdcxp`.`tipo` = \'PAGO\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdingreso`.`id` AS `id`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick5`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick5`.`bdcxp`.`valor` AS `valor`,`bdclick5`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick5`.`bdcxp`.`tipo` AS `tipo`,`bdclick5`.`bdingreso`.`anulada` AS `anulada`,`bdclick5`.`bdcxp`.`estado` AS `estado`,`bdclick5`.`bdterceros`.`direccion` AS `direccion`,`bdclick5`.`bdterceros`.`telefono` AS `telefono`,`bdclick5`.`bdterceros`.`id` AS `IdTercero`,`bdclick5`.`bdcxp`.`recibo` AS `recibo`,`bdclick5`.`bdcxp`.`vencimiento` AS `vencimiento`,`bdclick5`.`bdingreso`.`terminal` AS `terminal`,`bdingreso_1`.`rtIca` AS `rtIca`,`bdingreso_1`.`efectivo` AS `efectivo`,`bdingreso_1`.`cheque` AS `cheque`,`bdingreso_1`.`tarjeta` AS `tarjeta`,`bdingreso_1`.`descFinanciero` AS `descFinanciero`,`bdingreso_1`.`descProntoPago` AS `descProntoPago`,`bdingreso_1`.`rtIva` AS `rtIva`,`bdingreso_1`.`rtFuente` AS `rtFuente` from (((`bdclick5`.`bdingreso` left join `bdclick5`.`bdcxp` on((`bdclick5`.`bdingreso`.`id` = `bdclick5`.`bdcxp`.`ingreso`))) join `bdclick5`.`bdterceros` on((`bdclick5`.`bdingreso`.`proveedor` = `bdclick5`.`bdterceros`.`idSistema`))) left join `bdclick5`.`bdingreso` `bdingreso_1` on((`bdclick5`.`bdcxp`.`recibo` = `bdingreso_1`.`id`))) where ((`bdclick5`.`bdcxp`.`ingreso` <> \'\') and (`bdclick5`.`bdcxp`.`tipo` = \'PAGO\'))
mariadb-version=100135