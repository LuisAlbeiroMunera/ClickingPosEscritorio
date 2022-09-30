TYPE=VIEW
query=(select `bdclick`.`bdabono`.`id` AS `id`,`bdclick`.`bdabono`.`fecha` AS `fecha`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdterceros`.`id` AS `cliente`,`bdclick`.`bdabono`.`numFactura` AS `numFactura`,`bdclick`.`bdabono`.`totalFactura` AS `totalFactura`,`bdclick`.`bdabono`.`comprobante` AS `comprobante`,`bdclick`.`bdabono`.`abonoActual` AS `abonoActual`,`bdclick`.`bdabono`.`abonoLetras` AS `abonoLetras`,`bdclick`.`bdabono`.`abonosAnteriores` AS `abonosAnteriores`,`bdclick`.`bdabonos`.`cheque` AS `cheque`,`bdclick`.`bdabonos`.`targeta` AS `targeta`,`bdclick`.`bdabonos`.`efectivo` AS `efectivo`,`bdclick`.`bdabonos`.`nc` AS `nc`,`bdclick`.`bdabonos`.`rtIva` AS `rtIva`,`bdclick`.`bdabonos`.`rtIca` AS `rtIca`,`bdclick`.`bdabonos`.`rtFuente` AS `rtFuente`,`bdclick`.`bdabonos`.`otros` AS `otros`,`bdclick`.`bdabonos`.`descuentos` AS `descuentos`,`bdclick`.`bdabonogeneral`.`AbonoGeneral` AS `abonoGeneral`,`bdclick`.`bdabonogeneral`.`saldoTotal` AS `saldoTotalGeneral`,`bdclick`.`bdabonogeneral`.`valor` AS `valorGeneral`,`bdclick`.`bdabonogeneral`.`enLetra` AS `enLetra`,if(isnull(`repcart`.`valor`),0,(`bdclick`.`bdabonogeneral`.`saldoTotal` - `repcart`.`valor`)) AS `saldoFaltante`,`bdclick`.`bdabono`.`abono` AS `abono`,substr(`bdclick`.`bdabono`.`abono`,7) AS `abono2` from (((((`bdclick`.`bdabono` left join `bdclick`.`bdabonos` on((`bdclick`.`bdabonos`.`factura` = `bdclick`.`bdabono`.`abono`))) left join `bdclick`.`bdterceros` on((`bdclick`.`bdabono`.`cliente` = `bdclick`.`bdterceros`.`idSistema`))) left join `bdclick`.`bdabonogeneral` on((`bdclick`.`bdabono`.`abono` = `bdclick`.`bdabonogeneral`.`abono`))) left join `bdclick`.`bdcxc` on((`bdclick`.`bdcxc`.`factura2` = `bdclick`.`bdabonogeneral`.`AbonoGeneral`))) left join `bdclick`.`repcart` on((`repcart`.`fact` = `bdclick`.`bdabonogeneral`.`AbonoGeneral`))) group by `bdclick`.`bdabono`.`fecha`,`bdclick`.`bdterceros`.`nombre`,`bdclick`.`bdterceros`.`id`,`bdclick`.`bdabono`.`numFactura`,`bdclick`.`bdabono`.`totalFactura`,`bdclick`.`bdabono`.`comprobante`,`bdclick`.`bdabono`.`abonoActual`,`bdclick`.`bdabono`.`abonoLetras`,`bdclick`.`bdabono`.`abonosAnteriores`,`bdclick`.`bdabonos`.`cheque`,`bdclick`.`bdabonos`.`targeta`,`bdclick`.`bdabonos`.`efectivo`,`bdclick`.`bdabonos`.`nc`,`bdclick`.`bdabonos`.`rtIva`,`bdclick`.`bdabonos`.`rtIca`,`bdclick`.`bdabonos`.`rtFuente`,`bdclick`.`bdabonos`.`otros`,`bdclick`.`bdabonos`.`descuentos`,`bdclick`.`bdabonogeneral`.`AbonoGeneral`,`bdclick`.`bdabonogeneral`.`saldoTotal`,`bdclick`.`bdabonogeneral`.`valor`,if(isnull(`repcart`.`valor`),0,(`bdclick`.`bdabonogeneral`.`saldoTotal` - `repcart`.`valor`)),`bdclick`.`bdabono`.`abono`,substr(`bdclick`.`bdabono`.`abono`,7))
md5=bbb33e43135595733b73c089cfa2ab39
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-06 16:19:16
create-version=2
source=(
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdabono`.`id` AS `id`,`bdclick`.`bdabono`.`fecha` AS `fecha`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdterceros`.`id` AS `cliente`,`bdclick`.`bdabono`.`numFactura` AS `numFactura`,`bdclick`.`bdabono`.`totalFactura` AS `totalFactura`,`bdclick`.`bdabono`.`comprobante` AS `comprobante`,`bdclick`.`bdabono`.`abonoActual` AS `abonoActual`,`bdclick`.`bdabono`.`abonoLetras` AS `abonoLetras`,`bdclick`.`bdabono`.`abonosAnteriores` AS `abonosAnteriores`,`bdclick`.`bdabonos`.`cheque` AS `cheque`,`bdclick`.`bdabonos`.`targeta` AS `targeta`,`bdclick`.`bdabonos`.`efectivo` AS `efectivo`,`bdclick`.`bdabonos`.`nc` AS `nc`,`bdclick`.`bdabonos`.`rtIva` AS `rtIva`,`bdclick`.`bdabonos`.`rtIca` AS `rtIca`,`bdclick`.`bdabonos`.`rtFuente` AS `rtFuente`,`bdclick`.`bdabonos`.`otros` AS `otros`,`bdclick`.`bdabonos`.`descuentos` AS `descuentos`,`bdclick`.`bdabonogeneral`.`AbonoGeneral` AS `abonoGeneral`,`bdclick`.`bdabonogeneral`.`saldoTotal` AS `saldoTotalGeneral`,`bdclick`.`bdabonogeneral`.`valor` AS `valorGeneral`,`bdclick`.`bdabonogeneral`.`enLetra` AS `enLetra`,if(isnull(`repcart`.`valor`),0,(`bdclick`.`bdabonogeneral`.`saldoTotal` - `repcart`.`valor`)) AS `saldoFaltante`,`bdclick`.`bdabono`.`abono` AS `abono`,substr(`bdclick`.`bdabono`.`abono`,7) AS `abono2` from (((((`bdclick`.`bdabono` left join `bdclick`.`bdabonos` on((`bdclick`.`bdabonos`.`factura` = `bdclick`.`bdabono`.`abono`))) left join `bdclick`.`bdterceros` on((`bdclick`.`bdabono`.`cliente` = `bdclick`.`bdterceros`.`idSistema`))) left join `bdclick`.`bdabonogeneral` on((`bdclick`.`bdabono`.`abono` = `bdclick`.`bdabonogeneral`.`abono`))) left join `bdclick`.`bdcxc` on((`bdclick`.`bdcxc`.`factura2` = `bdclick`.`bdabonogeneral`.`AbonoGeneral`))) left join `bdclick`.`repcart` on((`repcart`.`fact` = `bdclick`.`bdabonogeneral`.`AbonoGeneral`))) group by `bdclick`.`bdabono`.`fecha`,`bdclick`.`bdterceros`.`nombre`,`bdclick`.`bdterceros`.`id`,`bdclick`.`bdabono`.`numFactura`,`bdclick`.`bdabono`.`totalFactura`,`bdclick`.`bdabono`.`comprobante`,`bdclick`.`bdabono`.`abonoActual`,`bdclick`.`bdabono`.`abonoLetras`,`bdclick`.`bdabono`.`abonosAnteriores`,`bdclick`.`bdabonos`.`cheque`,`bdclick`.`bdabonos`.`targeta`,`bdclick`.`bdabonos`.`efectivo`,`bdclick`.`bdabonos`.`nc`,`bdclick`.`bdabonos`.`rtIva`,`bdclick`.`bdabonos`.`rtIca`,`bdclick`.`bdabonos`.`rtFuente`,`bdclick`.`bdabonos`.`otros`,`bdclick`.`bdabonos`.`descuentos`,`bdclick`.`bdabonogeneral`.`AbonoGeneral`,`bdclick`.`bdabonogeneral`.`saldoTotal`,`bdclick`.`bdabonogeneral`.`valor`,if(isnull(`repcart`.`valor`),0,(`bdclick`.`bdabonogeneral`.`saldoTotal` - `repcart`.`valor`)),`bdclick`.`bdabono`.`abono`,substr(`bdclick`.`bdabono`.`abono`,7))
mariadb-version=100135