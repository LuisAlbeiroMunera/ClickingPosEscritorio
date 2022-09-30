TYPE=VIEW
query=select `bdclick4`.`bdfactura`.`idFactura` AS `idFactura`,cast(substr(`bdclick4`.`bdfactura`.`idFactura`,6,100) as signed) AS `ordenId`,`bdclick4`.`bdfactura`.`cliente` AS `cliente`,`bdclick4`.`bdfactura`.`vendedor` AS `vendedor`,`bdclick4`.`bdfactura`.`red` AS `red`,`bdclick4`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick4`.`bdfactura`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick4`.`bdfactura`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick4`.`bdfactura`.`ncGeneral` AS `ncGeneral`,`bdclick4`.`bdfactura`.`chequeGeneral` AS `chequeGeneral`,`bdclick4`.`bdfactura`.`targetaGeneral` AS `targetaGeneral`,`bdclick4`.`bdfactura`.`totalGeneral` AS `totalGeneral`,`bdclick4`.`bdfactura`.`descuentoGeneral` AS `descuentoGeneral`,`bdclick4`.`bdfactura`.`ivaGeneral` AS `ivaGeneral`,`bdclick4`.`bdfactura`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick4`.`bdfactura`.`comprobante` AS `comprobante`,`bdclick4`.`bdfactura`.`cotizacion` AS `cotizacion`,`bdclick4`.`bdfactura`.`anulada` AS `anulada`,`bdclick4`.`bdfactura`.`anula` AS `anula`,`bdclick4`.`bdfactura`.`credito` AS `credito`,`bdclick4`.`bdfactura`.`cxc` AS `cxc`,`bdclick4`.`bdfactura`.`usuario` AS `usuario`,`bdclick4`.`bdfactura`.`rtIva` AS `rtIva`,`bdclick4`.`bdfactura`.`rtIca` AS `rtIca`,`bdclick4`.`bdfactura`.`rtFuente` AS `rtFuente`,`bdclick4`.`bdfactura`.`otros` AS `otros`,`bdclick4`.`bdfactura`.`observacion` AS `observacion`,`bdclick4`.`bdfactura`.`anulada1` AS `anulada1`,`bdclick4`.`bdfactura`.`anula1` AS `anula1`,`bdclick4`.`bdfactura`.`credito1` AS `credito1`,`bdclick4`.`bdfactura`.`cxc1` AS `cxc1`,`bdclick4`.`bdfactura`.`usuario1` AS `usuario1`,`bdclick4`.`bdfactura`.`fechaAlerta` AS `fechaAlerta`,`bdclick4`.`bdfactura`.`terminal` AS `terminal`,`bdclick4`.`bdfactura`.`estadoGeneral` AS `estadoGeneral`,`bdclick4`.`bdfactura`.`estado2` AS `estado2`,`bdclick4`.`bdfactura`.`devuelta` AS `devuelta`,`bdclick4`.`bdfactura`.`factura` AS `factura`,`bdclick4`.`bdfactura`.`resolucion` AS `resolucion`,`bdclick4`.`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,`bdclick4`.`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick4`.`bdfactura`.`usuarioAnula` AS `usuarioAnula`,`bdclick4`.`bdfactura`.`copago` AS `copago`,`bdclick4`.`bdfactura`.`placa` AS `placa`,`bdclick4`.`bdfactura`.`garantia` AS `garantia`,`bdclick4`.`bdfactura`.`diasGarantia` AS `diasGarantia`,`bdclick4`.`bdfactura`.`rango` AS `rango`,`bdclick4`.`bdfactura`.`terminos` AS `terminos`,`bdclick4`.`bdfactura`.`notaAnulacion` AS `notaAnulacion`,`bdclick4`.`bdfactura`.`conseMesa` AS `conseMesa`,`bdclick4`.`bdfactura`.`producto` AS `producto`,`bdclick4`.`bdfactura`.`lista` AS `lista`,`bdclick4`.`bdfactura`.`cantidad` AS `cantidad`,`bdclick4`.`bdfactura`.`descuento` AS `descuento`,`bdclick4`.`bdfactura`.`total` AS `total`,`bdclick4`.`bdfactura`.`iva` AS `iva`,`bdclick4`.`bdfactura`.`subtotal` AS `subtotal`,`bdclick4`.`bdfactura`.`NC` AS `NC`,`bdclick4`.`bdfactura`.`utilidad` AS `utilidad`,`bdclick4`.`bdfactura`.`concepto` AS `concepto`,`bdclick4`.`bdfactura`.`porcDescuento` AS `porcDescuento`,`bdclick4`.`bdfactura`.`descripcion` AS `descripcion`,`bdclick4`.`bdfactura`.`plu` AS `plu`,`bdclick4`.`bdfactura`.`cant2` AS `cant2`,`bdclick4`.`bdfactura`.`estado` AS `estado`,`bdclick4`.`bdfactura`.`porcIva` AS `porcIva`,`bdclick4`.`bdfactura`.`tercero` AS `tercero`,`bdclick4`.`bdfactura`.`utilidad1` AS `utilidad1`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,`bdclick4`.`bdterceros`.`telefono` AS `telefono`,`bdclick4`.`bdcxc`.`plazo` AS `plazo`,`bdclick4`.`bdterceros`.`direccion` AS `direccion`,if(isnull(`bdclick4`.`bdprestamo`.`cuotaInicial`),0,`bdclick4`.`bdprestamo`.`cuotaInicial`) AS `cuotaInicial2`,`bdclick4`.`bdfactura`.`factura` AS `id2`,`bdclick4`.`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdclick4`.`bdproductos`.`referencia` AS `referencia`,`bdclick4`.`bdfactura`.`cotizacion` AS `documento2`,`bdclick4`.`bdfactura`.`impuesto` AS `impuesto`,`bdclick4`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick4`.`bdterceros`.`id` AS `IdCliente`,`bdclick4`.`bdfactura`.`imei` AS `imei`,`bdclick4`.`bdfactura`.`hora` AS `hora`,`bdclick4`.`bdfactura`.`bodega` AS `bodega` from ((`bdclick4`.`bdproductos` join ((`bdclick4`.`bdfactura` left join `bdclick4`.`bdprestamo` on((`bdclick4`.`bdfactura`.`idFactura` = `bdclick4`.`bdprestamo`.`factura`))) left join `bdclick4`.`bdcxc` on((`bdclick4`.`bdfactura`.`factura` = `bdclick4`.`bdcxc`.`factura2`))) on((`bdclick4`.`bdproductos`.`idSistema` = `bdclick4`.`bdfactura`.`producto`))) left join `bdclick4`.`bdterceros` on((`bdclick4`.`bdfactura`.`cliente` = `bdclick4`.`bdterceros`.`idSistema`))) where (`bdclick4`.`bdfactura`.`anulada` = 1) order by cast(substr(`bdclick4`.`bdfactura`.`idFactura`,6,100) as signed)
md5=e4e88610e96c5d6d4ff9223440d3fee2
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:25
create-version=2
source=select `bdfactura`.`idFactura` AS `idFactura`,cast(substr(`bdfactura`.`idFactura`,6,100) as signed) AS `ordenId`,`bdfactura`.`cliente` AS `cliente`,`bdfactura`.`vendedor` AS `vendedor`,`bdfactura`.`red` AS `red`,`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdfactura`.`fechaVencimiento` AS `fechaVencimiento`,`bdfactura`.`efectivoGeneral` AS `efectivoGeneral`,`bdfactura`.`ncGeneral` AS `ncGeneral`,`bdfactura`.`chequeGeneral` AS `chequeGeneral`,`bdfactura`.`targetaGeneral` AS `targetaGeneral`,`bdfactura`.`totalGeneral` AS `totalGeneral`,`bdfactura`.`descuentoGeneral` AS `descuentoGeneral`,`bdfactura`.`ivaGeneral` AS `ivaGeneral`,`bdfactura`.`subtotalGeneral` AS `subtotalGeneral`,`bdfactura`.`comprobante` AS `comprobante`,`bdfactura`.`cotizacion` AS `cotizacion`,`bdfactura`.`anulada` AS `anulada`,`bdfactura`.`anula` AS `anula`,`bdfactura`.`credito` AS `credito`,`bdfactura`.`cxc` AS `cxc`,`bdfactura`.`usuario` AS `usuario`,`bdfactura`.`rtIva` AS `rtIva`,`bdfactura`.`rtIca` AS `rtIca`,`bdfactura`.`rtFuente` AS `rtFuente`,`bdfactura`.`otros` AS `otros`,`bdfactura`.`observacion` AS `observacion`,`bdfactura`.`anulada1` AS `anulada1`,`bdfactura`.`anula1` AS `anula1`,`bdfactura`.`credito1` AS `credito1`,`bdfactura`.`cxc1` AS `cxc1`,`bdfactura`.`usuario1` AS `usuario1`,`bdfactura`.`fechaAlerta` AS `fechaAlerta`,`bdfactura`.`terminal` AS `terminal`,`bdfactura`.`estadoGeneral` AS `estadoGeneral`,`bdfactura`.`estado2` AS `estado2`,`bdfactura`.`devuelta` AS `devuelta`,`bdfactura`.`factura` AS `factura`,`bdfactura`.`resolucion` AS `resolucion`,`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdfactura`.`usuarioAnula` AS `usuarioAnula`,`bdfactura`.`copago` AS `copago`,`bdfactura`.`placa` AS `placa`,`bdfactura`.`garantia` AS `garantia`,`bdfactura`.`diasGarantia` AS `diasGarantia`,`bdfactura`.`rango` AS `rango`,`bdfactura`.`terminos` AS `terminos`,`bdfactura`.`notaAnulacion` AS `notaAnulacion`,`bdfactura`.`conseMesa` AS `conseMesa`,`bdfactura`.`producto` AS `producto`,`bdfactura`.`lista` AS `lista`,`bdfactura`.`cantidad` AS `cantidad`,`bdfactura`.`descuento` AS `descuento`,`bdfactura`.`total` AS `total`,`bdfactura`.`iva` AS `iva`,`bdfactura`.`subtotal` AS `subtotal`,`bdfactura`.`NC` AS `NC`,`bdfactura`.`utilidad` AS `utilidad`,`bdfactura`.`concepto` AS `concepto`,`bdfactura`.`porcDescuento` AS `porcDescuento`,`bdfactura`.`descripcion` AS `descripcion`,`bdfactura`.`plu` AS `plu`,`bdfactura`.`cant2` AS `cant2`,`bdfactura`.`estado` AS `estado`,`bdfactura`.`porcIva` AS `porcIva`,`bdfactura`.`tercero` AS `tercero`,`bdfactura`.`utilidad1` AS `utilidad1`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdcxc`.`plazo` AS `plazo`,`bdterceros`.`direccion` AS `direccion`,if(isnull(`bdprestamo`.`cuotaInicial`),0,`bdprestamo`.`cuotaInicial`) AS `cuotaInicial2`,`bdfactura`.`factura` AS `id2`,`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdproductos`.`referencia` AS `referencia`,`bdfactura`.`cotizacion` AS `documento2`,`bdfactura`.`impuesto` AS `impuesto`,`bdproductos`.`Codigo` AS `Codigo`,`bdterceros`.`id` AS `IdCliente`,`bdfactura`.`imei` AS `imei`,`bdfactura`.`hora` AS `hora`,`bdfactura`.`bodega` AS `bodega` from ((`bdproductos` join ((`bdfactura` left join `bdprestamo` on((`bdfactura`.`idFactura` = `bdprestamo`.`factura`))) left join `bdcxc` on((`bdfactura`.`factura` = `bdcxc`.`factura2`))) on((`bdproductos`.`idSistema` = `bdfactura`.`producto`))) left join `bdterceros` on((`bdfactura`.`cliente` = `bdterceros`.`idSistema`))) where (`bdfactura`.`anulada` = 1) order by cast(substr(`bdfactura`.`idFactura`,6,100) as signed)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdfactura`.`idFactura` AS `idFactura`,cast(substr(`bdclick4`.`bdfactura`.`idFactura`,6,100) as signed) AS `ordenId`,`bdclick4`.`bdfactura`.`cliente` AS `cliente`,`bdclick4`.`bdfactura`.`vendedor` AS `vendedor`,`bdclick4`.`bdfactura`.`red` AS `red`,`bdclick4`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick4`.`bdfactura`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick4`.`bdfactura`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick4`.`bdfactura`.`ncGeneral` AS `ncGeneral`,`bdclick4`.`bdfactura`.`chequeGeneral` AS `chequeGeneral`,`bdclick4`.`bdfactura`.`targetaGeneral` AS `targetaGeneral`,`bdclick4`.`bdfactura`.`totalGeneral` AS `totalGeneral`,`bdclick4`.`bdfactura`.`descuentoGeneral` AS `descuentoGeneral`,`bdclick4`.`bdfactura`.`ivaGeneral` AS `ivaGeneral`,`bdclick4`.`bdfactura`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick4`.`bdfactura`.`comprobante` AS `comprobante`,`bdclick4`.`bdfactura`.`cotizacion` AS `cotizacion`,`bdclick4`.`bdfactura`.`anulada` AS `anulada`,`bdclick4`.`bdfactura`.`anula` AS `anula`,`bdclick4`.`bdfactura`.`credito` AS `credito`,`bdclick4`.`bdfactura`.`cxc` AS `cxc`,`bdclick4`.`bdfactura`.`usuario` AS `usuario`,`bdclick4`.`bdfactura`.`rtIva` AS `rtIva`,`bdclick4`.`bdfactura`.`rtIca` AS `rtIca`,`bdclick4`.`bdfactura`.`rtFuente` AS `rtFuente`,`bdclick4`.`bdfactura`.`otros` AS `otros`,`bdclick4`.`bdfactura`.`observacion` AS `observacion`,`bdclick4`.`bdfactura`.`anulada1` AS `anulada1`,`bdclick4`.`bdfactura`.`anula1` AS `anula1`,`bdclick4`.`bdfactura`.`credito1` AS `credito1`,`bdclick4`.`bdfactura`.`cxc1` AS `cxc1`,`bdclick4`.`bdfactura`.`usuario1` AS `usuario1`,`bdclick4`.`bdfactura`.`fechaAlerta` AS `fechaAlerta`,`bdclick4`.`bdfactura`.`terminal` AS `terminal`,`bdclick4`.`bdfactura`.`estadoGeneral` AS `estadoGeneral`,`bdclick4`.`bdfactura`.`estado2` AS `estado2`,`bdclick4`.`bdfactura`.`devuelta` AS `devuelta`,`bdclick4`.`bdfactura`.`factura` AS `factura`,`bdclick4`.`bdfactura`.`resolucion` AS `resolucion`,`bdclick4`.`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,`bdclick4`.`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick4`.`bdfactura`.`usuarioAnula` AS `usuarioAnula`,`bdclick4`.`bdfactura`.`copago` AS `copago`,`bdclick4`.`bdfactura`.`placa` AS `placa`,`bdclick4`.`bdfactura`.`garantia` AS `garantia`,`bdclick4`.`bdfactura`.`diasGarantia` AS `diasGarantia`,`bdclick4`.`bdfactura`.`rango` AS `rango`,`bdclick4`.`bdfactura`.`terminos` AS `terminos`,`bdclick4`.`bdfactura`.`notaAnulacion` AS `notaAnulacion`,`bdclick4`.`bdfactura`.`conseMesa` AS `conseMesa`,`bdclick4`.`bdfactura`.`producto` AS `producto`,`bdclick4`.`bdfactura`.`lista` AS `lista`,`bdclick4`.`bdfactura`.`cantidad` AS `cantidad`,`bdclick4`.`bdfactura`.`descuento` AS `descuento`,`bdclick4`.`bdfactura`.`total` AS `total`,`bdclick4`.`bdfactura`.`iva` AS `iva`,`bdclick4`.`bdfactura`.`subtotal` AS `subtotal`,`bdclick4`.`bdfactura`.`NC` AS `NC`,`bdclick4`.`bdfactura`.`utilidad` AS `utilidad`,`bdclick4`.`bdfactura`.`concepto` AS `concepto`,`bdclick4`.`bdfactura`.`porcDescuento` AS `porcDescuento`,`bdclick4`.`bdfactura`.`descripcion` AS `descripcion`,`bdclick4`.`bdfactura`.`plu` AS `plu`,`bdclick4`.`bdfactura`.`cant2` AS `cant2`,`bdclick4`.`bdfactura`.`estado` AS `estado`,`bdclick4`.`bdfactura`.`porcIva` AS `porcIva`,`bdclick4`.`bdfactura`.`tercero` AS `tercero`,`bdclick4`.`bdfactura`.`utilidad1` AS `utilidad1`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,`bdclick4`.`bdterceros`.`telefono` AS `telefono`,`bdclick4`.`bdcxc`.`plazo` AS `plazo`,`bdclick4`.`bdterceros`.`direccion` AS `direccion`,if(isnull(`bdclick4`.`bdprestamo`.`cuotaInicial`),0,`bdclick4`.`bdprestamo`.`cuotaInicial`) AS `cuotaInicial2`,`bdclick4`.`bdfactura`.`factura` AS `id2`,`bdclick4`.`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdclick4`.`bdproductos`.`referencia` AS `referencia`,`bdclick4`.`bdfactura`.`cotizacion` AS `documento2`,`bdclick4`.`bdfactura`.`impuesto` AS `impuesto`,`bdclick4`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick4`.`bdterceros`.`id` AS `IdCliente`,`bdclick4`.`bdfactura`.`imei` AS `imei`,`bdclick4`.`bdfactura`.`hora` AS `hora`,`bdclick4`.`bdfactura`.`bodega` AS `bodega` from ((`bdclick4`.`bdproductos` join ((`bdclick4`.`bdfactura` left join `bdclick4`.`bdprestamo` on((`bdclick4`.`bdfactura`.`idFactura` = `bdclick4`.`bdprestamo`.`factura`))) left join `bdclick4`.`bdcxc` on((`bdclick4`.`bdfactura`.`factura` = `bdclick4`.`bdcxc`.`factura2`))) on((`bdclick4`.`bdproductos`.`idSistema` = `bdclick4`.`bdfactura`.`producto`))) left join `bdclick4`.`bdterceros` on((`bdclick4`.`bdfactura`.`cliente` = `bdclick4`.`bdterceros`.`idSistema`))) where (`bdclick4`.`bdfactura`.`anulada` = 1) order by cast(substr(`bdclick4`.`bdfactura`.`idFactura`,6,100) as signed)
mariadb-version=100135
