TYPE=VIEW
query=(select `bdclick3`.`bdcompra`.`ingreso` AS `ingreso`,`bdclick3`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdterceros`.`direccion` AS `direccion`,`bdclick3`.`bdterceros`.`telefono` AS `telefono`,`bdclick3`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick3`.`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick3`.`bdingreso`.`tipo` AS `tipo`,`bdclick3`.`bdingreso`.`concepto` AS `concepto`,`bdclick3`.`bdingreso`.`descuentos` AS `descuentos`,`bdclick3`.`bdingreso`.`total` AS `tot`,`bdclick3`.`bdingreso`.`iva` AS `IVAA`,`bdclick3`.`bdingreso`.`subtotal` AS `sub`,`bdclick3`.`bdingreso`.`impoconsumo` AS `impoconsumoGeneral`,`bdclick3`.`bdcompra`.`producto` AS `producto`,`bdclick3`.`bdcompra`.`descripcion` AS `descripcion`,`bdclick3`.`bdcompra`.`valor` AS `valor`,`bdclick3`.`bdcompra`.`cant2` AS `cantidad`,`bdclick3`.`bdcompra`.`descuento` AS `descuento`,`bdclick3`.`bdcompra`.`total` AS `total`,`bdclick3`.`bdcompra`.`iva` AS `iva`,`bdclick3`.`bdcompra`.`impoconsumo` AS `impoconsumo`,`bdclick3`.`bdcompra`.`subtotal` AS `subtotal`,`bdclick3`.`bdcompra`.`porcImpo` AS `porcImpo`,`bdclick3`.`bdcompra`.`porIva` AS `porIva`,`bdclick3`.`bdingreso`.`terminal` AS `terminal`,`bdclick3`.`bdingreso`.`rtIva` AS `rtIva`,`bdclick3`.`bdingreso`.`rtFuente` AS `rtFuente`,`bdclick3`.`bdingreso`.`observaciones` AS `observaciones`,`bdclick3`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick3`.`bdterceros`.`id` AS `idTercero`,`bdclick3`.`bdingreso`.`usuario` AS `usuario` from (((`bdclick3`.`bdingreso` left join `bdclick3`.`bdcompra` on((`bdclick3`.`bdingreso`.`id` = `bdclick3`.`bdcompra`.`ingreso`))) left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdterceros`.`idSistema` = `bdclick3`.`bdingreso`.`proveedor`))) left join `bdclick3`.`bdproductos` on((`bdclick3`.`bdproductos`.`idSistema` = `bdclick3`.`bdcompra`.`producto`))) where (not((`bdclick3`.`bdcompra`.`ingreso` like \'INI-*\'))) order by `bdclick3`.`bdcompra`.`ingreso`)
md5=79606def29d281936785151fd824bda3
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:51
create-version=2
source=(select `bdcompra`.`ingreso` AS `ingreso`,`bdingreso`.`proveedor` AS `proveedor`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`telefono` AS `telefono`,`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdingreso`.`tipo` AS `tipo`,`bdingreso`.`concepto` AS `concepto`,`bdingreso`.`descuentos` AS `descuentos`,`bdingreso`.`total` AS `tot`,`bdingreso`.`iva` AS `IVAA`,`bdingreso`.`subtotal` AS `sub`,`bdingreso`.`impoconsumo` AS `impoconsumoGeneral`,`bdcompra`.`producto` AS `producto`,`bdcompra`.`descripcion` AS `descripcion`,`bdcompra`.`valor` AS `valor`,`bdcompra`.`cant2` AS `cantidad`,`bdcompra`.`descuento` AS `descuento`,`bdcompra`.`total` AS `total`,`bdcompra`.`iva` AS `iva`,`bdcompra`.`impoconsumo` AS `impoconsumo`,`bdcompra`.`subtotal` AS `subtotal`,`bdcompra`.`porcImpo` AS `porcImpo`,`bdcompra`.`porIva` AS `porIva`,`bdingreso`.`terminal` AS `terminal`,`bdingreso`.`rtIva` AS `rtIva`,`bdingreso`.`rtFuente` AS `rtFuente`,`bdingreso`.`observaciones` AS `observaciones`,`bdproductos`.`Codigo` AS `Codigo`,`bdterceros`.`id` AS `idTercero`,`bdingreso`.`usuario` AS `usuario` from (((`bdingreso` left join `bdcompra` on((`bdingreso`.`id` = `bdcompra`.`ingreso`))) left join `bdterceros` on((`bdterceros`.`idSistema` = `bdingreso`.`proveedor`))) left join `bdproductos` on((`bdproductos`.`idSistema` = `bdcompra`.`producto`))) where (not((`bdcompra`.`ingreso` like \'INI-*\'))) order by `bdcompra`.`ingreso`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bdcompra`.`ingreso` AS `ingreso`,`bdclick3`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdterceros`.`direccion` AS `direccion`,`bdclick3`.`bdterceros`.`telefono` AS `telefono`,`bdclick3`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick3`.`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick3`.`bdingreso`.`tipo` AS `tipo`,`bdclick3`.`bdingreso`.`concepto` AS `concepto`,`bdclick3`.`bdingreso`.`descuentos` AS `descuentos`,`bdclick3`.`bdingreso`.`total` AS `tot`,`bdclick3`.`bdingreso`.`iva` AS `IVAA`,`bdclick3`.`bdingreso`.`subtotal` AS `sub`,`bdclick3`.`bdingreso`.`impoconsumo` AS `impoconsumoGeneral`,`bdclick3`.`bdcompra`.`producto` AS `producto`,`bdclick3`.`bdcompra`.`descripcion` AS `descripcion`,`bdclick3`.`bdcompra`.`valor` AS `valor`,`bdclick3`.`bdcompra`.`cant2` AS `cantidad`,`bdclick3`.`bdcompra`.`descuento` AS `descuento`,`bdclick3`.`bdcompra`.`total` AS `total`,`bdclick3`.`bdcompra`.`iva` AS `iva`,`bdclick3`.`bdcompra`.`impoconsumo` AS `impoconsumo`,`bdclick3`.`bdcompra`.`subtotal` AS `subtotal`,`bdclick3`.`bdcompra`.`porcImpo` AS `porcImpo`,`bdclick3`.`bdcompra`.`porIva` AS `porIva`,`bdclick3`.`bdingreso`.`terminal` AS `terminal`,`bdclick3`.`bdingreso`.`rtIva` AS `rtIva`,`bdclick3`.`bdingreso`.`rtFuente` AS `rtFuente`,`bdclick3`.`bdingreso`.`observaciones` AS `observaciones`,`bdclick3`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick3`.`bdterceros`.`id` AS `idTercero`,`bdclick3`.`bdingreso`.`usuario` AS `usuario` from (((`bdclick3`.`bdingreso` left join `bdclick3`.`bdcompra` on((`bdclick3`.`bdingreso`.`id` = `bdclick3`.`bdcompra`.`ingreso`))) left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdterceros`.`idSistema` = `bdclick3`.`bdingreso`.`proveedor`))) left join `bdclick3`.`bdproductos` on((`bdclick3`.`bdproductos`.`idSistema` = `bdclick3`.`bdcompra`.`producto`))) where (not((`bdclick3`.`bdcompra`.`ingreso` like \'INI-*\'))) order by `bdclick3`.`bdcompra`.`ingreso`)
mariadb-version=100135