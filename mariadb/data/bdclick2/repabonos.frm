TYPE=VIEW
query=select `facturacion`.`factura` AS `factura`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,`bdclick2`.`bdcxc`.`factura2` AS `factura2`,`facturacion`.`fechaFactura` AS `fechaFactura`,`facturacion`.`fechaVencimiento` AS `fechaVencimiento`,`facturacion`.`turno` AS `turno`,`facturacion`.`placa` AS `placa`,`bdclick2`.`bdcxc`.`valor` AS `valor`,`facturacion`.`cliente` AS `cliente`,`bdclick2`.`bdcxc`.`tipo` AS `tipo`,`facturacion`.`anulada` AS `anulada`,`bdclick2`.`bdcxc`.`estado` AS `estado`,`bdclick2`.`bdterceros`.`direccion` AS `direccion`,`bdclick2`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick2`.`bdterceros`.`telefono` AS `telefono`,`bdclick2`.`bdterceros`.`idSistema` AS `idSistema`,`bdclick2`.`bdcxc`.`recibo` AS `recibo`,`bdclick2`.`bdcxc`.`vencimiento` AS `vencimiento`,`facturacion`.`terminal` AS `terminal`,`bdclick2`.`bdabonos`.`id` AS `id`,`bdclick2`.`bdabonos`.`efectivo` AS `efectivo`,`bdclick2`.`bdabonos`.`cheque` AS `cheque`,`bdclick2`.`bdabonos`.`nc` AS `nc`,`bdclick2`.`bdabonos`.`rtIva` AS `rtIva`,`bdclick2`.`bdabonos`.`rtIca` AS `rtIca`,`bdclick2`.`bdabonos`.`rtFuente` AS `rtFuente`,`bdclick2`.`bdabonos`.`descuentos` AS `descuentos`,`bdclick2`.`bdabonos`.`comprobante` AS `tipoFact`,`bdclick2`.`bdabonos`.`targeta` AS `targeta` from (((`bdclick2`.`facturacion` join `bdclick2`.`bdterceros` on((`facturacion`.`idSistema` = `bdclick2`.`bdterceros`.`idSistema`))) join `bdclick2`.`bdcxc` on((`facturacion`.`id2` = `bdclick2`.`bdcxc`.`factura2`))) join `bdclick2`.`bdabonos` on((`bdclick2`.`bdcxc`.`recibo` = `bdclick2`.`bdabonos`.`id`))) where (`bdclick2`.`bdcxc`.`tipo` = \'ABONO\')
md5=c377b5eacad3317372172e2aa883d196
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:47
create-version=2
source=select `facturacion`.`factura` AS `factura`,`bdterceros`.`nombre` AS `nombre`,`bdcxc`.`factura2` AS `factura2`,`facturacion`.`fechaFactura` AS `fechaFactura`,`facturacion`.`fechaVencimiento` AS `fechaVencimiento`,`facturacion`.`turno` AS `turno`,`facturacion`.`placa` AS `placa`,`bdcxc`.`valor` AS `valor`,`facturacion`.`cliente` AS `cliente`,`bdcxc`.`tipo` AS `tipo`,`facturacion`.`anulada` AS `anulada`,`bdcxc`.`estado` AS `estado`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`ciudad` AS `ciudad`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`idSistema` AS `idSistema`,`bdcxc`.`recibo` AS `recibo`,`bdcxc`.`vencimiento` AS `vencimiento`,`facturacion`.`terminal` AS `terminal`,`bdabonos`.`id` AS `id`,`bdabonos`.`efectivo` AS `efectivo`,`bdabonos`.`cheque` AS `cheque`,`bdabonos`.`nc` AS `nc`,`bdabonos`.`rtIva` AS `rtIva`,`bdabonos`.`rtIca` AS `rtIca`,`bdabonos`.`rtFuente` AS `rtFuente`,`bdabonos`.`descuentos` AS `descuentos`,`bdabonos`.`comprobante` AS `tipoFact`,`bdabonos`.`targeta` AS `targeta` from (((`facturacion` join `bdterceros` on((`facturacion`.`idSistema` = `bdterceros`.`idSistema`))) join `bdcxc` on((`facturacion`.`id2` = `bdcxc`.`factura2`))) join `bdabonos` on((`bdcxc`.`recibo` = `bdabonos`.`id`))) where (`bdcxc`.`tipo` = \'ABONO\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `facturacion`.`factura` AS `factura`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,`bdclick2`.`bdcxc`.`factura2` AS `factura2`,`facturacion`.`fechaFactura` AS `fechaFactura`,`facturacion`.`fechaVencimiento` AS `fechaVencimiento`,`facturacion`.`turno` AS `turno`,`facturacion`.`placa` AS `placa`,`bdclick2`.`bdcxc`.`valor` AS `valor`,`facturacion`.`cliente` AS `cliente`,`bdclick2`.`bdcxc`.`tipo` AS `tipo`,`facturacion`.`anulada` AS `anulada`,`bdclick2`.`bdcxc`.`estado` AS `estado`,`bdclick2`.`bdterceros`.`direccion` AS `direccion`,`bdclick2`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick2`.`bdterceros`.`telefono` AS `telefono`,`bdclick2`.`bdterceros`.`idSistema` AS `idSistema`,`bdclick2`.`bdcxc`.`recibo` AS `recibo`,`bdclick2`.`bdcxc`.`vencimiento` AS `vencimiento`,`facturacion`.`terminal` AS `terminal`,`bdclick2`.`bdabonos`.`id` AS `id`,`bdclick2`.`bdabonos`.`efectivo` AS `efectivo`,`bdclick2`.`bdabonos`.`cheque` AS `cheque`,`bdclick2`.`bdabonos`.`nc` AS `nc`,`bdclick2`.`bdabonos`.`rtIva` AS `rtIva`,`bdclick2`.`bdabonos`.`rtIca` AS `rtIca`,`bdclick2`.`bdabonos`.`rtFuente` AS `rtFuente`,`bdclick2`.`bdabonos`.`descuentos` AS `descuentos`,`bdclick2`.`bdabonos`.`comprobante` AS `tipoFact`,`bdclick2`.`bdabonos`.`targeta` AS `targeta` from (((`bdclick2`.`facturacion` join `bdclick2`.`bdterceros` on((`facturacion`.`idSistema` = `bdclick2`.`bdterceros`.`idSistema`))) join `bdclick2`.`bdcxc` on((`facturacion`.`id2` = `bdclick2`.`bdcxc`.`factura2`))) join `bdclick2`.`bdabonos` on((`bdclick2`.`bdcxc`.`recibo` = `bdclick2`.`bdabonos`.`id`))) where (`bdclick2`.`bdcxc`.`tipo` = \'ABONO\')
mariadb-version=100135
