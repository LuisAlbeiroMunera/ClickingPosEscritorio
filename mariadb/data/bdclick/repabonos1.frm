TYPE=VIEW
query=select `bdclick`.`bdabonos`.`id` AS `id`,`bdclick`.`bdabonos`.`comprobante` AS `factura`,`bdabonos_1`.`factura` AS `factura2`,`bdclick`.`bdcxc`.`tipo` AS `tipo`,`bdclick`.`bdcxc`.`valor` AS `valor`,`bdclick`.`bdabonos`.`cliente` AS `cliente`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdabonos`.`cotizacion` AS `recibo`,`bdclick`.`bdcxc`.`vencimiento` AS `vencimiento`,`bdclick`.`bdabonos`.`efectivo` AS `efectivo`,`bdclick`.`bdabonos`.`cheque` AS `cheque`,`bdclick`.`bdabonos`.`targeta` AS `targeta`,`bdclick`.`bdabonos`.`nc` AS `nc`,`bdclick`.`bdcxc`.`terminal` AS `terminal`,`bdclick`.`bdabonos`.`anulada` AS `anulada`,`bdclick`.`bdabonos`.`rtIva` AS `rtIva`,`bdclick`.`bdabonos`.`rtIca` AS `rtIca`,`bdclick`.`bdabonos`.`rtFuente` AS `rtFuente`,left(`bdclick`.`bdabonos`.`comprobante`,(locate(\'-\',`bdclick`.`bdabonos`.`comprobante`) - 1)) AS `tipoFact`,`bdclick`.`bdfactura`.`turno` AS `turno`,`bdclick`.`bdfactura`.`placa` AS `placa`,`bdclick`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick`.`bdterceros`.`direccion` AS `direccion`,`bdclick`.`bdterceros`.`id` AS `idSistema` from ((`bdclick`.`bdterceros` join ((`bdclick`.`bdabonos` left join `bdclick`.`bdcxc` on((`bdclick`.`bdcxc`.`recibo` = `bdclick`.`bdabonos`.`id`))) left join `bdclick`.`bdabonos` `bdabonos_1` on((`bdclick`.`bdabonos`.`comprobante` = `bdabonos_1`.`id`))) on((`bdclick`.`bdterceros`.`idSistema` = `bdclick`.`bdabonos`.`cliente`))) left join `bdclick`.`bdfactura` on((`bdclick`.`bdcxc`.`factura2` = `bdclick`.`bdfactura`.`factura`))) group by `bdclick`.`bdabonos`.`id`,`bdclick`.`bdabonos`.`comprobante`,`bdabonos_1`.`factura`,`bdclick`.`bdcxc`.`tipo`,`bdclick`.`bdcxc`.`valor`,`bdclick`.`bdabonos`.`cliente`,`bdclick`.`bdterceros`.`nombre`,`bdclick`.`bdabonos`.`cotizacion`,`bdclick`.`bdcxc`.`vencimiento`,`bdclick`.`bdabonos`.`efectivo`,`bdclick`.`bdabonos`.`cheque`,`bdclick`.`bdabonos`.`targeta`,`bdclick`.`bdabonos`.`nc`,`bdclick`.`bdcxc`.`terminal`,`bdclick`.`bdabonos`.`anulada`,`bdclick`.`bdabonos`.`rtIva`,`bdclick`.`bdabonos`.`rtIca`,`bdclick`.`bdabonos`.`rtFuente`,left(`bdclick`.`bdabonos`.`comprobante`,(locate(\'-\',`bdclick`.`bdabonos`.`comprobante`) - 1)),`bdclick`.`bdfactura`.`turno`,`bdclick`.`bdfactura`.`placa`,`bdclick`.`bdterceros`.`ciudad`,`bdclick`.`bdterceros`.`direccion`,`bdclick`.`bdterceros`.`idSistema` having (`bdclick`.`bdcxc`.`tipo` = \'ABONO\')
md5=2e283e76191bc946a6ca7c752648bb10
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:26
create-version=2
source=select `bdabonos`.`id` AS `id`,`bdabonos`.`comprobante` AS `factura`,`bdabonos_1`.`factura` AS `factura2`,`bdcxc`.`tipo` AS `tipo`,`bdcxc`.`valor` AS `valor`,`bdabonos`.`cliente` AS `cliente`,`bdterceros`.`nombre` AS `nombre`,`bdabonos`.`cotizacion` AS `recibo`,`bdcxc`.`vencimiento` AS `vencimiento`,`bdabonos`.`efectivo` AS `efectivo`,`bdabonos`.`cheque` AS `cheque`,`bdabonos`.`targeta` AS `targeta`,`bdabonos`.`nc` AS `nc`,`bdcxc`.`terminal` AS `terminal`,`bdabonos`.`anulada` AS `anulada`,`bdabonos`.`rtIva` AS `rtIva`,`bdabonos`.`rtIca` AS `rtIca`,`bdabonos`.`rtFuente` AS `rtFuente`,left(`bdabonos`.`comprobante`,(locate(\'-\',`bdabonos`.`comprobante`) - 1)) AS `tipoFact`,`bdfactura`.`turno` AS `turno`,`bdfactura`.`placa` AS `placa`,`bdterceros`.`ciudad` AS `ciudad`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`id` AS `idSistema` from ((`bdterceros` join ((`bdabonos` left join `bdcxc` on((`bdcxc`.`recibo` = `bdabonos`.`id`))) left join `bdabonos` `bdabonos_1` on((`bdabonos`.`comprobante` = `bdabonos_1`.`id`))) on((`bdterceros`.`idSistema` = `bdabonos`.`cliente`))) left join `bdfactura` on((`bdcxc`.`factura2` = `bdfactura`.`factura`))) group by `bdabonos`.`id`,`bdabonos`.`comprobante`,`bdabonos_1`.`factura`,`bdcxc`.`tipo`,`bdcxc`.`valor`,`bdabonos`.`cliente`,`bdterceros`.`nombre`,`bdabonos`.`cotizacion`,`bdcxc`.`vencimiento`,`bdabonos`.`efectivo`,`bdabonos`.`cheque`,`bdabonos`.`targeta`,`bdabonos`.`nc`,`bdcxc`.`terminal`,`bdabonos`.`anulada`,`bdabonos`.`rtIva`,`bdabonos`.`rtIca`,`bdabonos`.`rtFuente`,left(`bdabonos`.`comprobante`,(locate(\'-\',`bdabonos`.`comprobante`) - 1)),`bdfactura`.`turno`,`bdfactura`.`placa`,`bdterceros`.`ciudad`,`bdterceros`.`direccion`,`bdterceros`.`idSistema` having (`bdcxc`.`tipo` = \'ABONO\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdabonos`.`id` AS `id`,`bdclick`.`bdabonos`.`comprobante` AS `factura`,`bdabonos_1`.`factura` AS `factura2`,`bdclick`.`bdcxc`.`tipo` AS `tipo`,`bdclick`.`bdcxc`.`valor` AS `valor`,`bdclick`.`bdabonos`.`cliente` AS `cliente`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdabonos`.`cotizacion` AS `recibo`,`bdclick`.`bdcxc`.`vencimiento` AS `vencimiento`,`bdclick`.`bdabonos`.`efectivo` AS `efectivo`,`bdclick`.`bdabonos`.`cheque` AS `cheque`,`bdclick`.`bdabonos`.`targeta` AS `targeta`,`bdclick`.`bdabonos`.`nc` AS `nc`,`bdclick`.`bdcxc`.`terminal` AS `terminal`,`bdclick`.`bdabonos`.`anulada` AS `anulada`,`bdclick`.`bdabonos`.`rtIva` AS `rtIva`,`bdclick`.`bdabonos`.`rtIca` AS `rtIca`,`bdclick`.`bdabonos`.`rtFuente` AS `rtFuente`,left(`bdclick`.`bdabonos`.`comprobante`,(locate(\'-\',`bdclick`.`bdabonos`.`comprobante`) - 1)) AS `tipoFact`,`bdclick`.`bdfactura`.`turno` AS `turno`,`bdclick`.`bdfactura`.`placa` AS `placa`,`bdclick`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick`.`bdterceros`.`direccion` AS `direccion`,`bdclick`.`bdterceros`.`id` AS `idSistema` from ((`bdclick`.`bdterceros` join ((`bdclick`.`bdabonos` left join `bdclick`.`bdcxc` on((`bdclick`.`bdcxc`.`recibo` = `bdclick`.`bdabonos`.`id`))) left join `bdclick`.`bdabonos` `bdabonos_1` on((`bdclick`.`bdabonos`.`comprobante` = `bdabonos_1`.`id`))) on((`bdclick`.`bdterceros`.`idSistema` = `bdclick`.`bdabonos`.`cliente`))) left join `bdclick`.`bdfactura` on((`bdclick`.`bdcxc`.`factura2` = `bdclick`.`bdfactura`.`factura`))) group by `bdclick`.`bdabonos`.`id`,`bdclick`.`bdabonos`.`comprobante`,`bdabonos_1`.`factura`,`bdclick`.`bdcxc`.`tipo`,`bdclick`.`bdcxc`.`valor`,`bdclick`.`bdabonos`.`cliente`,`bdclick`.`bdterceros`.`nombre`,`bdclick`.`bdabonos`.`cotizacion`,`bdclick`.`bdcxc`.`vencimiento`,`bdclick`.`bdabonos`.`efectivo`,`bdclick`.`bdabonos`.`cheque`,`bdclick`.`bdabonos`.`targeta`,`bdclick`.`bdabonos`.`nc`,`bdclick`.`bdcxc`.`terminal`,`bdclick`.`bdabonos`.`anulada`,`bdclick`.`bdabonos`.`rtIva`,`bdclick`.`bdabonos`.`rtIca`,`bdclick`.`bdabonos`.`rtFuente`,left(`bdclick`.`bdabonos`.`comprobante`,(locate(\'-\',`bdclick`.`bdabonos`.`comprobante`) - 1)),`bdclick`.`bdfactura`.`turno`,`bdclick`.`bdfactura`.`placa`,`bdclick`.`bdterceros`.`ciudad`,`bdclick`.`bdterceros`.`direccion`,`bdclick`.`bdterceros`.`idSistema` having (`bdclick`.`bdcxc`.`tipo` = \'ABONO\')
mariadb-version=100135
