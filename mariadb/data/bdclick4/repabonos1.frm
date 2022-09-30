TYPE=VIEW
query=select `bdclick4`.`bdabonos`.`id` AS `id`,`bdclick4`.`bdabonos`.`comprobante` AS `factura`,`bdabonos_1`.`factura` AS `factura2`,`bdclick4`.`bdcxc`.`tipo` AS `tipo`,`bdclick4`.`bdcxc`.`valor` AS `valor`,`bdclick4`.`bdabonos`.`cliente` AS `cliente`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,`bdclick4`.`bdabonos`.`cotizacion` AS `recibo`,`bdclick4`.`bdcxc`.`vencimiento` AS `vencimiento`,`bdclick4`.`bdabonos`.`efectivo` AS `efectivo`,`bdclick4`.`bdabonos`.`cheque` AS `cheque`,`bdclick4`.`bdabonos`.`targeta` AS `targeta`,`bdclick4`.`bdabonos`.`nc` AS `nc`,`bdclick4`.`bdcxc`.`terminal` AS `terminal`,`bdclick4`.`bdabonos`.`anulada` AS `anulada`,`bdclick4`.`bdabonos`.`rtIva` AS `rtIva`,`bdclick4`.`bdabonos`.`rtIca` AS `rtIca`,`bdclick4`.`bdabonos`.`rtFuente` AS `rtFuente`,left(`bdclick4`.`bdabonos`.`comprobante`,(locate(\'-\',`bdclick4`.`bdabonos`.`comprobante`) - 1)) AS `tipoFact`,`bdclick4`.`bdfactura`.`turno` AS `turno`,`bdclick4`.`bdfactura`.`placa` AS `placa`,`bdclick4`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick4`.`bdterceros`.`direccion` AS `direccion`,`bdclick4`.`bdterceros`.`id` AS `idSistema` from ((`bdclick4`.`bdterceros` join ((`bdclick4`.`bdabonos` left join `bdclick4`.`bdcxc` on((`bdclick4`.`bdcxc`.`recibo` = `bdclick4`.`bdabonos`.`id`))) left join `bdclick4`.`bdabonos` `bdabonos_1` on((`bdclick4`.`bdabonos`.`comprobante` = `bdabonos_1`.`id`))) on((`bdclick4`.`bdterceros`.`idSistema` = `bdclick4`.`bdabonos`.`cliente`))) left join `bdclick4`.`bdfactura` on((`bdclick4`.`bdcxc`.`factura2` = `bdclick4`.`bdfactura`.`factura`))) group by `bdclick4`.`bdabonos`.`id`,`bdclick4`.`bdabonos`.`comprobante`,`bdabonos_1`.`factura`,`bdclick4`.`bdcxc`.`tipo`,`bdclick4`.`bdcxc`.`valor`,`bdclick4`.`bdabonos`.`cliente`,`bdclick4`.`bdterceros`.`nombre`,`bdclick4`.`bdabonos`.`cotizacion`,`bdclick4`.`bdcxc`.`vencimiento`,`bdclick4`.`bdabonos`.`efectivo`,`bdclick4`.`bdabonos`.`cheque`,`bdclick4`.`bdabonos`.`targeta`,`bdclick4`.`bdabonos`.`nc`,`bdclick4`.`bdcxc`.`terminal`,`bdclick4`.`bdabonos`.`anulada`,`bdclick4`.`bdabonos`.`rtIva`,`bdclick4`.`bdabonos`.`rtIca`,`bdclick4`.`bdabonos`.`rtFuente`,left(`bdclick4`.`bdabonos`.`comprobante`,(locate(\'-\',`bdclick4`.`bdabonos`.`comprobante`) - 1)),`bdclick4`.`bdfactura`.`turno`,`bdclick4`.`bdfactura`.`placa`,`bdclick4`.`bdterceros`.`ciudad`,`bdclick4`.`bdterceros`.`direccion`,`bdclick4`.`bdterceros`.`idSistema` having (`bdclick4`.`bdcxc`.`tipo` = \'ABONO\')
md5=35b1fe3dc0acae9cccbc243c694c9f5a
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:29
create-version=2
source=select `bdabonos`.`id` AS `id`,`bdabonos`.`comprobante` AS `factura`,`bdabonos_1`.`factura` AS `factura2`,`bdcxc`.`tipo` AS `tipo`,`bdcxc`.`valor` AS `valor`,`bdabonos`.`cliente` AS `cliente`,`bdterceros`.`nombre` AS `nombre`,`bdabonos`.`cotizacion` AS `recibo`,`bdcxc`.`vencimiento` AS `vencimiento`,`bdabonos`.`efectivo` AS `efectivo`,`bdabonos`.`cheque` AS `cheque`,`bdabonos`.`targeta` AS `targeta`,`bdabonos`.`nc` AS `nc`,`bdcxc`.`terminal` AS `terminal`,`bdabonos`.`anulada` AS `anulada`,`bdabonos`.`rtIva` AS `rtIva`,`bdabonos`.`rtIca` AS `rtIca`,`bdabonos`.`rtFuente` AS `rtFuente`,left(`bdabonos`.`comprobante`,(locate(\'-\',`bdabonos`.`comprobante`) - 1)) AS `tipoFact`,`bdfactura`.`turno` AS `turno`,`bdfactura`.`placa` AS `placa`,`bdterceros`.`ciudad` AS `ciudad`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`id` AS `idSistema` from ((`bdterceros` join ((`bdabonos` left join `bdcxc` on((`bdcxc`.`recibo` = `bdabonos`.`id`))) left join `bdabonos` `bdabonos_1` on((`bdabonos`.`comprobante` = `bdabonos_1`.`id`))) on((`bdterceros`.`idSistema` = `bdabonos`.`cliente`))) left join `bdfactura` on((`bdcxc`.`factura2` = `bdfactura`.`factura`))) group by `bdabonos`.`id`,`bdabonos`.`comprobante`,`bdabonos_1`.`factura`,`bdcxc`.`tipo`,`bdcxc`.`valor`,`bdabonos`.`cliente`,`bdterceros`.`nombre`,`bdabonos`.`cotizacion`,`bdcxc`.`vencimiento`,`bdabonos`.`efectivo`,`bdabonos`.`cheque`,`bdabonos`.`targeta`,`bdabonos`.`nc`,`bdcxc`.`terminal`,`bdabonos`.`anulada`,`bdabonos`.`rtIva`,`bdabonos`.`rtIca`,`bdabonos`.`rtFuente`,left(`bdabonos`.`comprobante`,(locate(\'-\',`bdabonos`.`comprobante`) - 1)),`bdfactura`.`turno`,`bdfactura`.`placa`,`bdterceros`.`ciudad`,`bdterceros`.`direccion`,`bdterceros`.`idSistema` having (`bdcxc`.`tipo` = \'ABONO\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdabonos`.`id` AS `id`,`bdclick4`.`bdabonos`.`comprobante` AS `factura`,`bdabonos_1`.`factura` AS `factura2`,`bdclick4`.`bdcxc`.`tipo` AS `tipo`,`bdclick4`.`bdcxc`.`valor` AS `valor`,`bdclick4`.`bdabonos`.`cliente` AS `cliente`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,`bdclick4`.`bdabonos`.`cotizacion` AS `recibo`,`bdclick4`.`bdcxc`.`vencimiento` AS `vencimiento`,`bdclick4`.`bdabonos`.`efectivo` AS `efectivo`,`bdclick4`.`bdabonos`.`cheque` AS `cheque`,`bdclick4`.`bdabonos`.`targeta` AS `targeta`,`bdclick4`.`bdabonos`.`nc` AS `nc`,`bdclick4`.`bdcxc`.`terminal` AS `terminal`,`bdclick4`.`bdabonos`.`anulada` AS `anulada`,`bdclick4`.`bdabonos`.`rtIva` AS `rtIva`,`bdclick4`.`bdabonos`.`rtIca` AS `rtIca`,`bdclick4`.`bdabonos`.`rtFuente` AS `rtFuente`,left(`bdclick4`.`bdabonos`.`comprobante`,(locate(\'-\',`bdclick4`.`bdabonos`.`comprobante`) - 1)) AS `tipoFact`,`bdclick4`.`bdfactura`.`turno` AS `turno`,`bdclick4`.`bdfactura`.`placa` AS `placa`,`bdclick4`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick4`.`bdterceros`.`direccion` AS `direccion`,`bdclick4`.`bdterceros`.`id` AS `idSistema` from ((`bdclick4`.`bdterceros` join ((`bdclick4`.`bdabonos` left join `bdclick4`.`bdcxc` on((`bdclick4`.`bdcxc`.`recibo` = `bdclick4`.`bdabonos`.`id`))) left join `bdclick4`.`bdabonos` `bdabonos_1` on((`bdclick4`.`bdabonos`.`comprobante` = `bdabonos_1`.`id`))) on((`bdclick4`.`bdterceros`.`idSistema` = `bdclick4`.`bdabonos`.`cliente`))) left join `bdclick4`.`bdfactura` on((`bdclick4`.`bdcxc`.`factura2` = `bdclick4`.`bdfactura`.`factura`))) group by `bdclick4`.`bdabonos`.`id`,`bdclick4`.`bdabonos`.`comprobante`,`bdabonos_1`.`factura`,`bdclick4`.`bdcxc`.`tipo`,`bdclick4`.`bdcxc`.`valor`,`bdclick4`.`bdabonos`.`cliente`,`bdclick4`.`bdterceros`.`nombre`,`bdclick4`.`bdabonos`.`cotizacion`,`bdclick4`.`bdcxc`.`vencimiento`,`bdclick4`.`bdabonos`.`efectivo`,`bdclick4`.`bdabonos`.`cheque`,`bdclick4`.`bdabonos`.`targeta`,`bdclick4`.`bdabonos`.`nc`,`bdclick4`.`bdcxc`.`terminal`,`bdclick4`.`bdabonos`.`anulada`,`bdclick4`.`bdabonos`.`rtIva`,`bdclick4`.`bdabonos`.`rtIca`,`bdclick4`.`bdabonos`.`rtFuente`,left(`bdclick4`.`bdabonos`.`comprobante`,(locate(\'-\',`bdclick4`.`bdabonos`.`comprobante`) - 1)),`bdclick4`.`bdfactura`.`turno`,`bdclick4`.`bdfactura`.`placa`,`bdclick4`.`bdterceros`.`ciudad`,`bdclick4`.`bdterceros`.`direccion`,`bdclick4`.`bdterceros`.`idSistema` having (`bdclick4`.`bdcxc`.`tipo` = \'ABONO\')
mariadb-version=100135