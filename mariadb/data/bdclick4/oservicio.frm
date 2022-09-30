TYPE=VIEW
query=select `bdclick4`.`bdoservicio1`.`idFactura` AS `idFactura`,`bdclick4`.`bdoservicio1`.`cliente` AS `cliente`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,`bdclick4`.`bdterceros`.`direccion` AS `direccion`,`bdclick4`.`bdterceros`.`telefono` AS `telefono`,`bdclick4`.`bdoservicio1`.`vendedor` AS `vendedor`,`bdclick4`.`bdoservicio1`.`fechaFactura` AS `fechaFactura`,`bdclick4`.`bdoservicio1`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick4`.`bdoservicio1`.`subtotalGeneral` AS `sub`,`bdclick4`.`bdoservicio1`.`descuentoGeneral` AS `descuentos`,`bdclick4`.`bdoservicio1`.`ivaGeneral` AS `IVAA`,`bdclick4`.`bdoservicio1`.`efectivoGeneral` AS `efectivo`,`bdclick4`.`bdoservicio1`.`NC` AS `nc`,`bdclick4`.`bdoservicio1`.`chequeGeneral` AS `cheque`,`bdclick4`.`bdoservicio1`.`targetaGeneral` AS `targeta`,`bdclick4`.`bdoservicio1`.`producto` AS `producto`,`bdclick4`.`bdoservicio1`.`lista` AS `lista`,`bdclick4`.`bdoservicio1`.`cantidad` AS `cantidad`,`bdclick4`.`bdoservicio1`.`subtotal` AS `subtotal`,`bdclick4`.`bdoservicio1`.`descuento` AS `descuento`,`bdclick4`.`bdoservicio1`.`iva` AS `iva`,`bdclick4`.`bdoservicio1`.`total` AS `total`,`bdclick4`.`bdcxc`.`plazo` AS `plazo`,`bdclick4`.`bdcxc`.`tipo` AS `tipo`,`bdclick4`.`bdoservicio1`.`anulada` AS `anulada`,`bdclick4`.`bdoservicio1`.`rtFuente` AS `rtFuente`,`bdclick4`.`bdoservicio1`.`rtIva` AS `rtIva`,`bdclick4`.`bdoservicio1`.`cant2` AS `cant2`,left(`bdclick4`.`bdoservicio1`.`observacion`,1000) AS `observacion2`,`bdclick4`.`bdgrupo`.`nombre` AS `grupo`,left(`bdclick4`.`bdproductos`.`Descripcion`,1000) AS `descripcion2`,`bdclick4`.`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdclick4`.`bdoservicio1`.`devuelta` AS `devuelta`,(`bdclick4`.`bdoservicio1`.`total` - `bdclick4`.`bdoservicio1`.`utilidad`) AS `utilidad2`,`bdclick4`.`bdoservicio1`.`factura` AS `factura`,`bdclick4`.`bdoservicio1`.`terminal` AS `terminal`,`bdclick4`.`bdproductos`.`IVA` AS `IVAProducto`,if((`bdclick4`.`bdoservicio1`.`credito` = 1),\'CREDITO\',\'CONTADO\') AS `credito2`,`bdclick4`.`bdoservicio1`.`placa` AS `placa`,`bdclick4`.`bdplacas`.`tipo` AS `tipoVehiculo`,`bdclick4`.`bdplacas`.`modelo` AS `modelo`,`bdclick4`.`bdplacas`.`marca` AS `marca`,`bdclick4`.`bdplacas`.`color` AS `color`,`bdclick4`.`bdplacas`.`chasis` AS `chasis`,`bdclick4`.`bdplacas`.`motor` AS `motor`,`bdclick4`.`bdplacas`.`fechaCompra` AS `fechaCompra`,`bdclick4`.`bdoservicio1`.`totalGeneral` AS `totalGeneral`,`bdclick4`.`bdmaestra`.`anexoOrdenServicio` AS `anexoOrdenServicio`,`bdclick4`.`bdoservicio1`.`notaAnulacion` AS `notaAnulacion`,`bdclick4`.`bdoservicio1`.`terminos` AS `terminos`,`bdclick4`.`bdoservicio1`.`rango` AS `rango`,`bdclick4`.`bdoservicio1`.`diasGarantia` AS `diasGarantia`,`bdclick4`.`bdoservicio1`.`porcIva` AS `porcIva`,`bdclick4`.`bdoservicio1`.`usuario` AS `usuario`,`bdclick4`.`bdoservicio1`.`estado2` AS `estado2`,`bdclick4`.`bdoservicio1`.`bodega` AS `bodega`,`bdclick4`.`bdterceros`.`id` AS `idCliente` from (((((`bdclick4`.`bdoservicio1` left join `bdclick4`.`bdcxc` on((`bdclick4`.`bdoservicio1`.`idFactura` = `bdclick4`.`bdcxc`.`factura`))) left join `bdclick4`.`bdplacas` on((`bdclick4`.`bdplacas`.`placa` = `bdclick4`.`bdoservicio1`.`placa`))) left join `bdclick4`.`bdmaestra` on((`bdclick4`.`bdmaestra`.`Id` = `bdclick4`.`bdoservicio1`.`plu`))) left join `bdclick4`.`bdterceros` on((`bdclick4`.`bdoservicio1`.`cliente` = `bdclick4`.`bdterceros`.`idSistema`))) left join (`bdclick4`.`bdproductos` left join `bdclick4`.`bdgrupo` on((`bdclick4`.`bdproductos`.`grupo` = `bdclick4`.`bdgrupo`.`codigo`))) on((`bdclick4`.`bdoservicio1`.`producto` = `bdclick4`.`bdproductos`.`idSistema`))) where ((`bdclick4`.`bdoservicio1`.`idFactura` like \'OSERV-%\') and ((`bdclick4`.`bdcxc`.`tipo` = \'FACT\') or isnull(`bdclick4`.`bdcxc`.`tipo`)))
md5=eae52462332c9ea1a10d576d4a707b7d
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:28
create-version=2
source=select `bdoservicio1`.`idFactura` AS `idFactura`,`bdoservicio1`.`cliente` AS `cliente`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`telefono` AS `telefono`,`bdoservicio1`.`vendedor` AS `vendedor`,`bdoservicio1`.`fechaFactura` AS `fechaFactura`,`bdoservicio1`.`fechaVencimiento` AS `fechaVencimiento`,`bdoservicio1`.`subtotalGeneral` AS `sub`,`bdoservicio1`.`descuentoGeneral` AS `descuentos`,`bdoservicio1`.`ivaGeneral` AS `IVAA`,`bdoservicio1`.`efectivoGeneral` AS `efectivo`,`bdoservicio1`.`NC` AS `nc`,`bdoservicio1`.`chequeGeneral` AS `cheque`,`bdoservicio1`.`targetaGeneral` AS `targeta`,`bdoservicio1`.`producto` AS `producto`,`bdoservicio1`.`lista` AS `lista`,`bdoservicio1`.`cantidad` AS `cantidad`,`bdoservicio1`.`subtotal` AS `subtotal`,`bdoservicio1`.`descuento` AS `descuento`,`bdoservicio1`.`iva` AS `iva`,`bdoservicio1`.`total` AS `total`,`bdcxc`.`plazo` AS `plazo`,`bdcxc`.`tipo` AS `tipo`,`bdoservicio1`.`anulada` AS `anulada`,`bdoservicio1`.`rtFuente` AS `rtFuente`,`bdoservicio1`.`rtIva` AS `rtIva`,`bdoservicio1`.`cant2` AS `cant2`,left(`bdoservicio1`.`observacion`,1000) AS `observacion2`,`bdgrupo`.`nombre` AS `grupo`,left(`bdproductos`.`Descripcion`,1000) AS `descripcion2`,`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdoservicio1`.`devuelta` AS `devuelta`,(`bdoservicio1`.`total` - `bdoservicio1`.`utilidad`) AS `utilidad2`,`bdoservicio1`.`factura` AS `factura`,`bdoservicio1`.`terminal` AS `terminal`,`bdproductos`.`IVA` AS `IVAProducto`,if((`bdoservicio1`.`credito` = 1),\'CREDITO\',\'CONTADO\') AS `credito2`,`bdoservicio1`.`placa` AS `placa`,`bdplacas`.`tipo` AS `tipoVehiculo`,`bdplacas`.`modelo` AS `modelo`,`bdplacas`.`marca` AS `marca`,`bdplacas`.`color` AS `color`,`bdplacas`.`chasis` AS `chasis`,`bdplacas`.`motor` AS `motor`,`bdplacas`.`fechaCompra` AS `fechaCompra`,`bdoservicio1`.`totalGeneral` AS `totalGeneral`,`bdmaestra`.`anexoOrdenServicio` AS `anexoOrdenServicio`,`bdoservicio1`.`notaAnulacion` AS `notaAnulacion`,`bdoservicio1`.`terminos` AS `terminos`,`bdoservicio1`.`rango` AS `rango`,`bdoservicio1`.`diasGarantia` AS `diasGarantia`,`bdoservicio1`.`porcIva` AS `porcIva`,`bdoservicio1`.`usuario` AS `usuario`,`bdoservicio1`.`estado2` AS `estado2`,`bdoservicio1`.`bodega` AS `bodega`,`bdterceros`.`id` AS `idCliente` from (((((`bdoservicio1` left join `bdcxc` on((`bdoservicio1`.`idFactura` = `bdcxc`.`factura`))) left join `bdplacas` on((`bdplacas`.`placa` = `bdoservicio1`.`placa`))) left join `bdmaestra` on((`bdmaestra`.`Id` = `bdoservicio1`.`plu`))) left join `bdterceros` on((`bdoservicio1`.`cliente` = `bdterceros`.`idSistema`))) left join (`bdproductos` left join `bdgrupo` on((`bdproductos`.`grupo` = `bdgrupo`.`codigo`))) on((`bdoservicio1`.`producto` = `bdproductos`.`idSistema`))) where ((`bdoservicio1`.`idFactura` like \'OSERV-%\') and ((`bdcxc`.`tipo` = \'FACT\') or isnull(`bdcxc`.`tipo`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdoservicio1`.`idFactura` AS `idFactura`,`bdclick4`.`bdoservicio1`.`cliente` AS `cliente`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,`bdclick4`.`bdterceros`.`direccion` AS `direccion`,`bdclick4`.`bdterceros`.`telefono` AS `telefono`,`bdclick4`.`bdoservicio1`.`vendedor` AS `vendedor`,`bdclick4`.`bdoservicio1`.`fechaFactura` AS `fechaFactura`,`bdclick4`.`bdoservicio1`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick4`.`bdoservicio1`.`subtotalGeneral` AS `sub`,`bdclick4`.`bdoservicio1`.`descuentoGeneral` AS `descuentos`,`bdclick4`.`bdoservicio1`.`ivaGeneral` AS `IVAA`,`bdclick4`.`bdoservicio1`.`efectivoGeneral` AS `efectivo`,`bdclick4`.`bdoservicio1`.`NC` AS `nc`,`bdclick4`.`bdoservicio1`.`chequeGeneral` AS `cheque`,`bdclick4`.`bdoservicio1`.`targetaGeneral` AS `targeta`,`bdclick4`.`bdoservicio1`.`producto` AS `producto`,`bdclick4`.`bdoservicio1`.`lista` AS `lista`,`bdclick4`.`bdoservicio1`.`cantidad` AS `cantidad`,`bdclick4`.`bdoservicio1`.`subtotal` AS `subtotal`,`bdclick4`.`bdoservicio1`.`descuento` AS `descuento`,`bdclick4`.`bdoservicio1`.`iva` AS `iva`,`bdclick4`.`bdoservicio1`.`total` AS `total`,`bdclick4`.`bdcxc`.`plazo` AS `plazo`,`bdclick4`.`bdcxc`.`tipo` AS `tipo`,`bdclick4`.`bdoservicio1`.`anulada` AS `anulada`,`bdclick4`.`bdoservicio1`.`rtFuente` AS `rtFuente`,`bdclick4`.`bdoservicio1`.`rtIva` AS `rtIva`,`bdclick4`.`bdoservicio1`.`cant2` AS `cant2`,left(`bdclick4`.`bdoservicio1`.`observacion`,1000) AS `observacion2`,`bdclick4`.`bdgrupo`.`nombre` AS `grupo`,left(`bdclick4`.`bdproductos`.`Descripcion`,1000) AS `descripcion2`,`bdclick4`.`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdclick4`.`bdoservicio1`.`devuelta` AS `devuelta`,(`bdclick4`.`bdoservicio1`.`total` - `bdclick4`.`bdoservicio1`.`utilidad`) AS `utilidad2`,`bdclick4`.`bdoservicio1`.`factura` AS `factura`,`bdclick4`.`bdoservicio1`.`terminal` AS `terminal`,`bdclick4`.`bdproductos`.`IVA` AS `IVAProducto`,if((`bdclick4`.`bdoservicio1`.`credito` = 1),\'CREDITO\',\'CONTADO\') AS `credito2`,`bdclick4`.`bdoservicio1`.`placa` AS `placa`,`bdclick4`.`bdplacas`.`tipo` AS `tipoVehiculo`,`bdclick4`.`bdplacas`.`modelo` AS `modelo`,`bdclick4`.`bdplacas`.`marca` AS `marca`,`bdclick4`.`bdplacas`.`color` AS `color`,`bdclick4`.`bdplacas`.`chasis` AS `chasis`,`bdclick4`.`bdplacas`.`motor` AS `motor`,`bdclick4`.`bdplacas`.`fechaCompra` AS `fechaCompra`,`bdclick4`.`bdoservicio1`.`totalGeneral` AS `totalGeneral`,`bdclick4`.`bdmaestra`.`anexoOrdenServicio` AS `anexoOrdenServicio`,`bdclick4`.`bdoservicio1`.`notaAnulacion` AS `notaAnulacion`,`bdclick4`.`bdoservicio1`.`terminos` AS `terminos`,`bdclick4`.`bdoservicio1`.`rango` AS `rango`,`bdclick4`.`bdoservicio1`.`diasGarantia` AS `diasGarantia`,`bdclick4`.`bdoservicio1`.`porcIva` AS `porcIva`,`bdclick4`.`bdoservicio1`.`usuario` AS `usuario`,`bdclick4`.`bdoservicio1`.`estado2` AS `estado2`,`bdclick4`.`bdoservicio1`.`bodega` AS `bodega`,`bdclick4`.`bdterceros`.`id` AS `idCliente` from (((((`bdclick4`.`bdoservicio1` left join `bdclick4`.`bdcxc` on((`bdclick4`.`bdoservicio1`.`idFactura` = `bdclick4`.`bdcxc`.`factura`))) left join `bdclick4`.`bdplacas` on((`bdclick4`.`bdplacas`.`placa` = `bdclick4`.`bdoservicio1`.`placa`))) left join `bdclick4`.`bdmaestra` on((`bdclick4`.`bdmaestra`.`Id` = `bdclick4`.`bdoservicio1`.`plu`))) left join `bdclick4`.`bdterceros` on((`bdclick4`.`bdoservicio1`.`cliente` = `bdclick4`.`bdterceros`.`idSistema`))) left join (`bdclick4`.`bdproductos` left join `bdclick4`.`bdgrupo` on((`bdclick4`.`bdproductos`.`grupo` = `bdclick4`.`bdgrupo`.`codigo`))) on((`bdclick4`.`bdoservicio1`.`producto` = `bdclick4`.`bdproductos`.`idSistema`))) where ((`bdclick4`.`bdoservicio1`.`idFactura` like \'OSERV-%\') and ((`bdclick4`.`bdcxc`.`tipo` = \'FACT\') or isnull(`bdclick4`.`bdcxc`.`tipo`)))
mariadb-version=100135