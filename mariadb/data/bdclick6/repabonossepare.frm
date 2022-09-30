TYPE=VIEW
query=select `plansepareagrupado`.`factura` AS `factura`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdcxc`.`factura2` AS `factura2`,`plansepareagrupado`.`fechaFactura` AS `fechaFactura`,`plansepareagrupado`.`fechaVencimiento` AS `fechaVencimiento`,\'\' AS `turno`,`plansepareagrupado`.`placa` AS `placa`,`bdclick6`.`bdcxc`.`valor` AS `valor`,`plansepareagrupado`.`cliente` AS `cliente`,`bdclick6`.`bdcxc`.`tipo` AS `tipo`,`plansepareagrupado`.`anulada` AS `anulada`,`bdclick6`.`bdcxc`.`estado` AS `estado`,`bdclick6`.`bdterceros`.`direccion` AS `direccion`,`bdclick6`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,`bdclick6`.`bdterceros`.`idSistema` AS `idSistema`,`bdclick6`.`bdcxc`.`recibo` AS `recibo`,`bdclick6`.`bdcxc`.`vencimiento` AS `vencimiento`,`plansepareagrupado`.`terminal` AS `terminal`,`bdclick6`.`bdabonos`.`id` AS `id`,`bdclick6`.`bdabonos`.`efectivo` AS `efectivo`,`bdclick6`.`bdabonos`.`cheque` AS `cheque`,`bdclick6`.`bdabonos`.`nc` AS `nc`,`bdclick6`.`bdabonos`.`rtIva` AS `rtIva`,`bdclick6`.`bdabonos`.`rtIca` AS `rtIca`,`bdclick6`.`bdabonos`.`rtFuente` AS `rtFuente`,`bdclick6`.`bdabonos`.`descuentos` AS `descuentos`,`bdclick6`.`bdabonos`.`comprobante` AS `tipoFact`,`bdclick6`.`bdabonos`.`targeta` AS `targeta` from (((`bdclick6`.`plansepareagrupado` join `bdclick6`.`bdterceros` on((`plansepareagrupado`.`idSistema` = `bdclick6`.`bdterceros`.`idSistema`))) join `bdclick6`.`bdcxc` on((`plansepareagrupado`.`id2` = `bdclick6`.`bdcxc`.`factura2`))) join `bdclick6`.`bdabonos` on((`bdclick6`.`bdcxc`.`recibo` = `bdclick6`.`bdabonos`.`id`))) where (`bdclick6`.`bdcxc`.`tipo` = \'ABONO\')
md5=797327adcf667b67232d109ac049be73
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:37
create-version=2
source=select `plansepareagrupado`.`factura` AS `factura`,`bdterceros`.`nombre` AS `nombre`,`bdcxc`.`factura2` AS `factura2`,`plansepareagrupado`.`fechaFactura` AS `fechaFactura`,`plansepareagrupado`.`fechaVencimiento` AS `fechaVencimiento`,\'\' AS `turno`,`plansepareagrupado`.`placa` AS `placa`,`bdcxc`.`valor` AS `valor`,`plansepareagrupado`.`cliente` AS `cliente`,`bdcxc`.`tipo` AS `tipo`,`plansepareagrupado`.`anulada` AS `anulada`,`bdcxc`.`estado` AS `estado`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`ciudad` AS `ciudad`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`idSistema` AS `idSistema`,`bdcxc`.`recibo` AS `recibo`,`bdcxc`.`vencimiento` AS `vencimiento`,`plansepareagrupado`.`terminal` AS `terminal`,`bdabonos`.`id` AS `id`,`bdabonos`.`efectivo` AS `efectivo`,`bdabonos`.`cheque` AS `cheque`,`bdabonos`.`nc` AS `nc`,`bdabonos`.`rtIva` AS `rtIva`,`bdabonos`.`rtIca` AS `rtIca`,`bdabonos`.`rtFuente` AS `rtFuente`,`bdabonos`.`descuentos` AS `descuentos`,`bdabonos`.`comprobante` AS `tipoFact`,`bdabonos`.`targeta` AS `targeta` from (((`plansepareagrupado` join `bdterceros` on((`plansepareagrupado`.`idSistema` = `bdterceros`.`idSistema`))) join `bdcxc` on((`plansepareagrupado`.`id2` = `bdcxc`.`factura2`))) join `bdabonos` on((`bdcxc`.`recibo` = `bdabonos`.`id`))) where (`bdcxc`.`tipo` = \'ABONO\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `plansepareagrupado`.`factura` AS `factura`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdcxc`.`factura2` AS `factura2`,`plansepareagrupado`.`fechaFactura` AS `fechaFactura`,`plansepareagrupado`.`fechaVencimiento` AS `fechaVencimiento`,\'\' AS `turno`,`plansepareagrupado`.`placa` AS `placa`,`bdclick6`.`bdcxc`.`valor` AS `valor`,`plansepareagrupado`.`cliente` AS `cliente`,`bdclick6`.`bdcxc`.`tipo` AS `tipo`,`plansepareagrupado`.`anulada` AS `anulada`,`bdclick6`.`bdcxc`.`estado` AS `estado`,`bdclick6`.`bdterceros`.`direccion` AS `direccion`,`bdclick6`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,`bdclick6`.`bdterceros`.`idSistema` AS `idSistema`,`bdclick6`.`bdcxc`.`recibo` AS `recibo`,`bdclick6`.`bdcxc`.`vencimiento` AS `vencimiento`,`plansepareagrupado`.`terminal` AS `terminal`,`bdclick6`.`bdabonos`.`id` AS `id`,`bdclick6`.`bdabonos`.`efectivo` AS `efectivo`,`bdclick6`.`bdabonos`.`cheque` AS `cheque`,`bdclick6`.`bdabonos`.`nc` AS `nc`,`bdclick6`.`bdabonos`.`rtIva` AS `rtIva`,`bdclick6`.`bdabonos`.`rtIca` AS `rtIca`,`bdclick6`.`bdabonos`.`rtFuente` AS `rtFuente`,`bdclick6`.`bdabonos`.`descuentos` AS `descuentos`,`bdclick6`.`bdabonos`.`comprobante` AS `tipoFact`,`bdclick6`.`bdabonos`.`targeta` AS `targeta` from (((`bdclick6`.`plansepareagrupado` join `bdclick6`.`bdterceros` on((`plansepareagrupado`.`idSistema` = `bdclick6`.`bdterceros`.`idSistema`))) join `bdclick6`.`bdcxc` on((`plansepareagrupado`.`id2` = `bdclick6`.`bdcxc`.`factura2`))) join `bdclick6`.`bdabonos` on((`bdclick6`.`bdcxc`.`recibo` = `bdclick6`.`bdabonos`.`id`))) where (`bdclick6`.`bdcxc`.`tipo` = \'ABONO\')
mariadb-version=100135