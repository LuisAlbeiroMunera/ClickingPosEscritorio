TYPE=VIEW
query=select `bdclick4`.`bdplansepare`.`idFactura` AS `idFactura`,cast(substr(`bdclick4`.`bdplansepare`.`idFactura`,8,100) as signed) AS `ordenId`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,`bdclick4`.`bdplansepare`.`cliente` AS `cliente`,`bdclick4`.`bdplansepare`.`vendedor` AS `vendedor`,`bdclick4`.`bdplansepare`.`red` AS `red`,`bdclick4`.`bdplansepare`.`fechaFactura` AS `fechaFactura`,`bdclick4`.`bdplansepare`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick4`.`bdplansepare`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick4`.`bdplansepare`.`ncGeneral` AS `ncGeneral`,`bdclick4`.`bdplansepare`.`chequeGeneral` AS `chequeGeneral`,`bdclick4`.`bdplansepare`.`targetaGeneral` AS `targetaGeneral`,`bdclick4`.`bdplansepare`.`totalGeneral` AS `totalGeneral`,`bdclick4`.`bdplansepare`.`descuentoGeneral` AS `descuentoGeneral`,`bdclick4`.`bdplansepare`.`ivaGeneral` AS `ivaGeneral`,`bdclick4`.`bdplansepare`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick4`.`bdplansepare`.`comprobante` AS `comprobante`,`bdclick4`.`bdplansepare`.`cotizacion` AS `cotizacion`,`bdclick4`.`bdplansepare`.`anulada` AS `anulada`,`bdclick4`.`bdplansepare`.`anula` AS `anula`,`bdclick4`.`bdplansepare`.`credito` AS `credito`,`bdclick4`.`bdplansepare`.`cxc` AS `cxc`,`bdclick4`.`bdplansepare`.`usuario` AS `usuario`,`bdclick4`.`bdplansepare`.`rtIva` AS `rtIva`,`bdclick4`.`bdplansepare`.`rtIca` AS `rtIca`,`bdclick4`.`bdplansepare`.`rtFuente` AS `rtFuente`,`bdclick4`.`bdplansepare`.`otros` AS `otros`,`bdclick4`.`bdplansepare`.`observacion` AS `observacion`,`bdclick4`.`bdplansepare`.`anulada1` AS `anulada1`,`bdclick4`.`bdplansepare`.`anula1` AS `anula1`,`bdclick4`.`bdplansepare`.`credito1` AS `credito1`,`bdclick4`.`bdplansepare`.`cxc1` AS `cxc1`,`bdclick4`.`bdplansepare`.`usuario1` AS `usuario1`,`bdclick4`.`bdplansepare`.`fechaAlerta` AS `fechaAlerta`,`bdclick4`.`bdplansepare`.`terminal` AS `terminal`,`bdclick4`.`bdplansepare`.`estadoGeneral` AS `estadoGeneral`,`bdclick4`.`bdplansepare`.`estado2` AS `estado2`,`bdclick4`.`bdplansepare`.`devuelta` AS `devuelta`,`bdclick4`.`bdplansepare`.`factura` AS `factura`,`bdclick4`.`bdplansepare`.`resolucion` AS `resolucion`,`bdclick4`.`bdplansepare`.`fechaAnulacion` AS `fechaAnulacion`,`bdclick4`.`bdplansepare`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick4`.`bdplansepare`.`usuarioAnula` AS `usuarioAnula`,`bdclick4`.`bdplansepare`.`copago` AS `copago`,`bdclick4`.`bdplansepare`.`placa` AS `placa`,`bdclick4`.`bdplansepare`.`garantia` AS `garantia`,`bdclick4`.`bdplansepare`.`diasGarantia` AS `diasGarantia`,`bdclick4`.`bdplansepare`.`rango` AS `rango`,`bdclick4`.`bdplansepare`.`terminos` AS `terminos`,`bdclick4`.`bdplansepare`.`notaAnulacion` AS `notaAnulacion`,`bdclick4`.`bdplansepare`.`conseMesa` AS `conseMesa`,`bdclick4`.`bdplansepare`.`producto` AS `producto`,`bdclick4`.`bdplansepare`.`lista` AS `lista`,`bdclick4`.`bdplansepare`.`cantidad` AS `cantidad`,`bdclick4`.`bdplansepare`.`descuento` AS `descuento`,`bdclick4`.`bdplansepare`.`total` AS `total`,`bdclick4`.`bdplansepare`.`iva` AS `iva`,`bdclick4`.`bdplansepare`.`subtotal` AS `subtotal`,`bdclick4`.`bdplansepare`.`NC` AS `NC`,`bdclick4`.`bdplansepare`.`utilidad` AS `utilidad`,`bdclick4`.`bdplansepare`.`concepto` AS `concepto`,`bdclick4`.`bdplansepare`.`porcDescuento` AS `porcDescuento`,`bdclick4`.`bdplansepare`.`descripcion` AS `descripcion`,`bdclick4`.`bdplansepare`.`plu` AS `plu`,`bdclick4`.`bdplansepare`.`cant2` AS `cant2`,`bdclick4`.`bdplansepare`.`estado` AS `estado`,`bdclick4`.`bdplansepare`.`porcIva` AS `porcIva`,`bdclick4`.`bdplansepare`.`tercero` AS `tercero`,`bdclick4`.`bdplansepare`.`utilidad1` AS `utilidad1`,`bdclick4`.`bdplansepare`.`preparacion` AS `preparacion`,`bdclick4`.`bdplansepare`.`bodega` AS `bodega`,`bdclick4`.`bdterceros`.`telefono` AS `telefono`,`bdclick4`.`bdterceros`.`direccion` AS `direccion`,`bdclick4`.`bdcxc`.`plazo` AS `plazo`,`bdclick4`.`bdcxc`.`tipo` AS `tipo`,\'\' AS `ubicacion`,\'\' AS `referencia`,0 AS `cuotaInicial2`,`bdclick4`.`bdterceros`.`id` AS `IdTercero`,`bdclick4`.`bdproductos`.`Codigo` AS `CodigoProd`,`bdclick4`.`bdplansepare`.`imei` AS `imei`,`bdclick4`.`bdplansepare`.`idProd` AS `idProd` from (((`bdclick4`.`bdplansepare` left join `bdclick4`.`bdcxc` on((`bdclick4`.`bdcxc`.`factura` = `bdclick4`.`bdplansepare`.`idFactura`))) left join `bdclick4`.`bdterceros` on((`bdclick4`.`bdplansepare`.`cliente` = `bdclick4`.`bdterceros`.`idSistema`))) left join `bdclick4`.`bdproductos` on((`bdclick4`.`bdplansepare`.`producto` = `bdclick4`.`bdproductos`.`idSistema`))) group by `bdclick4`.`bdplansepare`.`idFactura`,cast(substr(`bdclick4`.`bdplansepare`.`idFactura`,8,100) as signed),`bdclick4`.`bdterceros`.`nombre`,`bdclick4`.`bdplansepare`.`cliente`,`bdclick4`.`bdplansepare`.`vendedor`,`bdclick4`.`bdplansepare`.`red`,`bdclick4`.`bdplansepare`.`fechaFactura`,`bdclick4`.`bdplansepare`.`fechaVencimiento`,`bdclick4`.`bdplansepare`.`efectivoGeneral`,`bdclick4`.`bdplansepare`.`ncGeneral`,`bdclick4`.`bdplansepare`.`chequeGeneral`,`bdclick4`.`bdplansepare`.`targetaGeneral`,`bdclick4`.`bdplansepare`.`totalGeneral`,`bdclick4`.`bdplansepare`.`descuentoGeneral`,`bdclick4`.`bdplansepare`.`ivaGeneral`,`bdclick4`.`bdplansepare`.`subtotalGeneral`,`bdclick4`.`bdplansepare`.`comprobante`,`bdclick4`.`bdplansepare`.`cotizacion`,`bdclick4`.`bdplansepare`.`anulada`,`bdclick4`.`bdplansepare`.`anula`,`bdclick4`.`bdplansepare`.`credito`,`bdclick4`.`bdplansepare`.`cxc`,`bdclick4`.`bdplansepare`.`usuario`,`bdclick4`.`bdplansepare`.`rtIva`,`bdclick4`.`bdplansepare`.`rtIca`,`bdclick4`.`bdplansepare`.`rtFuente`,`bdclick4`.`bdplansepare`.`otros`,`bdclick4`.`bdplansepare`.`anulada1`,`bdclick4`.`bdplansepare`.`anula1`,`bdclick4`.`bdplansepare`.`credito1`,`bdclick4`.`bdplansepare`.`cxc1`,`bdclick4`.`bdplansepare`.`usuario1`,`bdclick4`.`bdplansepare`.`fechaAlerta`,`bdclick4`.`bdplansepare`.`terminal`,`bdclick4`.`bdplansepare`.`estadoGeneral`,`bdclick4`.`bdplansepare`.`estado2`,`bdclick4`.`bdplansepare`.`devuelta`,`bdclick4`.`bdplansepare`.`factura`,`bdclick4`.`bdplansepare`.`resolucion`,`bdclick4`.`bdplansepare`.`fechaAnulacion`,`bdclick4`.`bdplansepare`.`cuadreAnulacion`,`bdclick4`.`bdplansepare`.`usuarioAnula`,`bdclick4`.`bdplansepare`.`copago`,`bdclick4`.`bdplansepare`.`placa`,`bdclick4`.`bdplansepare`.`garantia`,`bdclick4`.`bdplansepare`.`diasGarantia`,`bdclick4`.`bdplansepare`.`rango`,`bdclick4`.`bdplansepare`.`conseMesa`,`bdclick4`.`bdplansepare`.`producto`,`bdclick4`.`bdplansepare`.`lista`,`bdclick4`.`bdplansepare`.`cantidad`,`bdclick4`.`bdplansepare`.`descuento`,`bdclick4`.`bdplansepare`.`total`,`bdclick4`.`bdplansepare`.`iva`,`bdclick4`.`bdplansepare`.`subtotal`,`bdclick4`.`bdplansepare`.`NC`,`bdclick4`.`bdplansepare`.`utilidad`,`bdclick4`.`bdplansepare`.`porcDescuento`,`bdclick4`.`bdplansepare`.`descripcion`,`bdclick4`.`bdplansepare`.`plu`,`bdclick4`.`bdplansepare`.`cant2`,`bdclick4`.`bdplansepare`.`estado`,`bdclick4`.`bdplansepare`.`porcIva`,`bdclick4`.`bdplansepare`.`tercero`,`bdclick4`.`bdplansepare`.`utilidad1`,`bdclick4`.`bdplansepare`.`preparacion`,`bdclick4`.`bdplansepare`.`bodega`,`bdclick4`.`bdterceros`.`telefono`,`bdclick4`.`bdterceros`.`direccion`,`bdclick4`.`bdcxc`.`plazo`,`bdclick4`.`bdcxc`.`tipo`,\'\',`bdclick4`.`bdterceros`.`id`,\'\',`bdclick4`.`bdproductos`.`Codigo`,`bdclick4`.`bdplansepare`.`imei`,`bdclick4`.`bdplansepare`.`idProd` having (`bdclick4`.`bdcxc`.`tipo` = \'SEPARE\') order by cast(substr(`bdclick4`.`bdplansepare`.`idFactura`,8,100) as signed)
md5=c820feec22044cf51e70d2937d8cd3a7
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:29
create-version=2
source=select `bdplansepare`.`idFactura` AS `idFactura`,cast(substr(`bdplansepare`.`idFactura`,8,100) as signed) AS `ordenId`,`bdterceros`.`nombre` AS `nombre`,`bdplansepare`.`cliente` AS `cliente`,`bdplansepare`.`vendedor` AS `vendedor`,`bdplansepare`.`red` AS `red`,`bdplansepare`.`fechaFactura` AS `fechaFactura`,`bdplansepare`.`fechaVencimiento` AS `fechaVencimiento`,`bdplansepare`.`efectivoGeneral` AS `efectivoGeneral`,`bdplansepare`.`ncGeneral` AS `ncGeneral`,`bdplansepare`.`chequeGeneral` AS `chequeGeneral`,`bdplansepare`.`targetaGeneral` AS `targetaGeneral`,`bdplansepare`.`totalGeneral` AS `totalGeneral`,`bdplansepare`.`descuentoGeneral` AS `descuentoGeneral`,`bdplansepare`.`ivaGeneral` AS `ivaGeneral`,`bdplansepare`.`subtotalGeneral` AS `subtotalGeneral`,`bdplansepare`.`comprobante` AS `comprobante`,`bdplansepare`.`cotizacion` AS `cotizacion`,`bdplansepare`.`anulada` AS `anulada`,`bdplansepare`.`anula` AS `anula`,`bdplansepare`.`credito` AS `credito`,`bdplansepare`.`cxc` AS `cxc`,`bdplansepare`.`usuario` AS `usuario`,`bdplansepare`.`rtIva` AS `rtIva`,`bdplansepare`.`rtIca` AS `rtIca`,`bdplansepare`.`rtFuente` AS `rtFuente`,`bdplansepare`.`otros` AS `otros`,`bdplansepare`.`observacion` AS `observacion`,`bdplansepare`.`anulada1` AS `anulada1`,`bdplansepare`.`anula1` AS `anula1`,`bdplansepare`.`credito1` AS `credito1`,`bdplansepare`.`cxc1` AS `cxc1`,`bdplansepare`.`usuario1` AS `usuario1`,`bdplansepare`.`fechaAlerta` AS `fechaAlerta`,`bdplansepare`.`terminal` AS `terminal`,`bdplansepare`.`estadoGeneral` AS `estadoGeneral`,`bdplansepare`.`estado2` AS `estado2`,`bdplansepare`.`devuelta` AS `devuelta`,`bdplansepare`.`factura` AS `factura`,`bdplansepare`.`resolucion` AS `resolucion`,`bdplansepare`.`fechaAnulacion` AS `fechaAnulacion`,`bdplansepare`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdplansepare`.`usuarioAnula` AS `usuarioAnula`,`bdplansepare`.`copago` AS `copago`,`bdplansepare`.`placa` AS `placa`,`bdplansepare`.`garantia` AS `garantia`,`bdplansepare`.`diasGarantia` AS `diasGarantia`,`bdplansepare`.`rango` AS `rango`,`bdplansepare`.`terminos` AS `terminos`,`bdplansepare`.`notaAnulacion` AS `notaAnulacion`,`bdplansepare`.`conseMesa` AS `conseMesa`,`bdplansepare`.`producto` AS `producto`,`bdplansepare`.`lista` AS `lista`,`bdplansepare`.`cantidad` AS `cantidad`,`bdplansepare`.`descuento` AS `descuento`,`bdplansepare`.`total` AS `total`,`bdplansepare`.`iva` AS `iva`,`bdplansepare`.`subtotal` AS `subtotal`,`bdplansepare`.`NC` AS `NC`,`bdplansepare`.`utilidad` AS `utilidad`,`bdplansepare`.`concepto` AS `concepto`,`bdplansepare`.`porcDescuento` AS `porcDescuento`,`bdplansepare`.`descripcion` AS `descripcion`,`bdplansepare`.`plu` AS `plu`,`bdplansepare`.`cant2` AS `cant2`,`bdplansepare`.`estado` AS `estado`,`bdplansepare`.`porcIva` AS `porcIva`,`bdplansepare`.`tercero` AS `tercero`,`bdplansepare`.`utilidad1` AS `utilidad1`,`bdplansepare`.`preparacion` AS `preparacion`,`bdplansepare`.`bodega` AS `bodega`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`direccion` AS `direccion`,`bdcxc`.`plazo` AS `plazo`,`bdcxc`.`tipo` AS `tipo`,\'\' AS `ubicacion`,\'\' AS `referencia`,0 AS `cuotaInicial2`,`bdterceros`.`id` AS `IdTercero`,`bdproductos`.`Codigo` AS `CodigoProd`,`bdplansepare`.`imei` AS `imei`,`bdplansepare`.`idProd` AS `idProd` from (((`bdplansepare` left join `bdcxc` on((`bdcxc`.`factura` = `bdplansepare`.`idFactura`))) left join `bdterceros` on((`bdplansepare`.`cliente` = `bdterceros`.`idSistema`))) left join `bdproductos` on((`bdplansepare`.`producto` = `bdproductos`.`idSistema`))) group by `bdplansepare`.`idFactura`,cast(substr(`bdplansepare`.`idFactura`,8,100) as signed),`bdterceros`.`nombre`,`bdplansepare`.`cliente`,`bdplansepare`.`vendedor`,`bdplansepare`.`red`,`bdplansepare`.`fechaFactura`,`bdplansepare`.`fechaVencimiento`,`bdplansepare`.`efectivoGeneral`,`bdplansepare`.`ncGeneral`,`bdplansepare`.`chequeGeneral`,`bdplansepare`.`targetaGeneral`,`bdplansepare`.`totalGeneral`,`bdplansepare`.`descuentoGeneral`,`bdplansepare`.`ivaGeneral`,`bdplansepare`.`subtotalGeneral`,`bdplansepare`.`comprobante`,`bdplansepare`.`cotizacion`,`bdplansepare`.`anulada`,`bdplansepare`.`anula`,`bdplansepare`.`credito`,`bdplansepare`.`cxc`,`bdplansepare`.`usuario`,`bdplansepare`.`rtIva`,`bdplansepare`.`rtIca`,`bdplansepare`.`rtFuente`,`bdplansepare`.`otros`,`bdplansepare`.`anulada1`,`bdplansepare`.`anula1`,`bdplansepare`.`credito1`,`bdplansepare`.`cxc1`,`bdplansepare`.`usuario1`,`bdplansepare`.`fechaAlerta`,`bdplansepare`.`terminal`,`bdplansepare`.`estadoGeneral`,`bdplansepare`.`estado2`,`bdplansepare`.`devuelta`,`bdplansepare`.`factura`,`bdplansepare`.`resolucion`,`bdplansepare`.`fechaAnulacion`,`bdplansepare`.`cuadreAnulacion`,`bdplansepare`.`usuarioAnula`,`bdplansepare`.`copago`,`bdplansepare`.`placa`,`bdplansepare`.`garantia`,`bdplansepare`.`diasGarantia`,`bdplansepare`.`rango`,`bdplansepare`.`conseMesa`,`bdplansepare`.`producto`,`bdplansepare`.`lista`,`bdplansepare`.`cantidad`,`bdplansepare`.`descuento`,`bdplansepare`.`total`,`bdplansepare`.`iva`,`bdplansepare`.`subtotal`,`bdplansepare`.`NC`,`bdplansepare`.`utilidad`,`bdplansepare`.`porcDescuento`,`bdplansepare`.`descripcion`,`bdplansepare`.`plu`,`bdplansepare`.`cant2`,`bdplansepare`.`estado`,`bdplansepare`.`porcIva`,`bdplansepare`.`tercero`,`bdplansepare`.`utilidad1`,`bdplansepare`.`preparacion`,`bdplansepare`.`bodega`,`bdterceros`.`telefono`,`bdterceros`.`direccion`,`bdcxc`.`plazo`,`bdcxc`.`tipo`,\'\',`bdterceros`.`id`,\'\',`bdproductos`.`Codigo`,`bdplansepare`.`imei`,`bdplansepare`.`idProd` having (`bdcxc`.`tipo` = \'SEPARE\') order by cast(substr(`bdplansepare`.`idFactura`,8,100) as signed)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdplansepare`.`idFactura` AS `idFactura`,cast(substr(`bdclick4`.`bdplansepare`.`idFactura`,8,100) as signed) AS `ordenId`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,`bdclick4`.`bdplansepare`.`cliente` AS `cliente`,`bdclick4`.`bdplansepare`.`vendedor` AS `vendedor`,`bdclick4`.`bdplansepare`.`red` AS `red`,`bdclick4`.`bdplansepare`.`fechaFactura` AS `fechaFactura`,`bdclick4`.`bdplansepare`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick4`.`bdplansepare`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick4`.`bdplansepare`.`ncGeneral` AS `ncGeneral`,`bdclick4`.`bdplansepare`.`chequeGeneral` AS `chequeGeneral`,`bdclick4`.`bdplansepare`.`targetaGeneral` AS `targetaGeneral`,`bdclick4`.`bdplansepare`.`totalGeneral` AS `totalGeneral`,`bdclick4`.`bdplansepare`.`descuentoGeneral` AS `descuentoGeneral`,`bdclick4`.`bdplansepare`.`ivaGeneral` AS `ivaGeneral`,`bdclick4`.`bdplansepare`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick4`.`bdplansepare`.`comprobante` AS `comprobante`,`bdclick4`.`bdplansepare`.`cotizacion` AS `cotizacion`,`bdclick4`.`bdplansepare`.`anulada` AS `anulada`,`bdclick4`.`bdplansepare`.`anula` AS `anula`,`bdclick4`.`bdplansepare`.`credito` AS `credito`,`bdclick4`.`bdplansepare`.`cxc` AS `cxc`,`bdclick4`.`bdplansepare`.`usuario` AS `usuario`,`bdclick4`.`bdplansepare`.`rtIva` AS `rtIva`,`bdclick4`.`bdplansepare`.`rtIca` AS `rtIca`,`bdclick4`.`bdplansepare`.`rtFuente` AS `rtFuente`,`bdclick4`.`bdplansepare`.`otros` AS `otros`,`bdclick4`.`bdplansepare`.`observacion` AS `observacion`,`bdclick4`.`bdplansepare`.`anulada1` AS `anulada1`,`bdclick4`.`bdplansepare`.`anula1` AS `anula1`,`bdclick4`.`bdplansepare`.`credito1` AS `credito1`,`bdclick4`.`bdplansepare`.`cxc1` AS `cxc1`,`bdclick4`.`bdplansepare`.`usuario1` AS `usuario1`,`bdclick4`.`bdplansepare`.`fechaAlerta` AS `fechaAlerta`,`bdclick4`.`bdplansepare`.`terminal` AS `terminal`,`bdclick4`.`bdplansepare`.`estadoGeneral` AS `estadoGeneral`,`bdclick4`.`bdplansepare`.`estado2` AS `estado2`,`bdclick4`.`bdplansepare`.`devuelta` AS `devuelta`,`bdclick4`.`bdplansepare`.`factura` AS `factura`,`bdclick4`.`bdplansepare`.`resolucion` AS `resolucion`,`bdclick4`.`bdplansepare`.`fechaAnulacion` AS `fechaAnulacion`,`bdclick4`.`bdplansepare`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick4`.`bdplansepare`.`usuarioAnula` AS `usuarioAnula`,`bdclick4`.`bdplansepare`.`copago` AS `copago`,`bdclick4`.`bdplansepare`.`placa` AS `placa`,`bdclick4`.`bdplansepare`.`garantia` AS `garantia`,`bdclick4`.`bdplansepare`.`diasGarantia` AS `diasGarantia`,`bdclick4`.`bdplansepare`.`rango` AS `rango`,`bdclick4`.`bdplansepare`.`terminos` AS `terminos`,`bdclick4`.`bdplansepare`.`notaAnulacion` AS `notaAnulacion`,`bdclick4`.`bdplansepare`.`conseMesa` AS `conseMesa`,`bdclick4`.`bdplansepare`.`producto` AS `producto`,`bdclick4`.`bdplansepare`.`lista` AS `lista`,`bdclick4`.`bdplansepare`.`cantidad` AS `cantidad`,`bdclick4`.`bdplansepare`.`descuento` AS `descuento`,`bdclick4`.`bdplansepare`.`total` AS `total`,`bdclick4`.`bdplansepare`.`iva` AS `iva`,`bdclick4`.`bdplansepare`.`subtotal` AS `subtotal`,`bdclick4`.`bdplansepare`.`NC` AS `NC`,`bdclick4`.`bdplansepare`.`utilidad` AS `utilidad`,`bdclick4`.`bdplansepare`.`concepto` AS `concepto`,`bdclick4`.`bdplansepare`.`porcDescuento` AS `porcDescuento`,`bdclick4`.`bdplansepare`.`descripcion` AS `descripcion`,`bdclick4`.`bdplansepare`.`plu` AS `plu`,`bdclick4`.`bdplansepare`.`cant2` AS `cant2`,`bdclick4`.`bdplansepare`.`estado` AS `estado`,`bdclick4`.`bdplansepare`.`porcIva` AS `porcIva`,`bdclick4`.`bdplansepare`.`tercero` AS `tercero`,`bdclick4`.`bdplansepare`.`utilidad1` AS `utilidad1`,`bdclick4`.`bdplansepare`.`preparacion` AS `preparacion`,`bdclick4`.`bdplansepare`.`bodega` AS `bodega`,`bdclick4`.`bdterceros`.`telefono` AS `telefono`,`bdclick4`.`bdterceros`.`direccion` AS `direccion`,`bdclick4`.`bdcxc`.`plazo` AS `plazo`,`bdclick4`.`bdcxc`.`tipo` AS `tipo`,\'\' AS `ubicacion`,\'\' AS `referencia`,0 AS `cuotaInicial2`,`bdclick4`.`bdterceros`.`id` AS `IdTercero`,`bdclick4`.`bdproductos`.`Codigo` AS `CodigoProd`,`bdclick4`.`bdplansepare`.`imei` AS `imei`,`bdclick4`.`bdplansepare`.`idProd` AS `idProd` from (((`bdclick4`.`bdplansepare` left join `bdclick4`.`bdcxc` on((`bdclick4`.`bdcxc`.`factura` = `bdclick4`.`bdplansepare`.`idFactura`))) left join `bdclick4`.`bdterceros` on((`bdclick4`.`bdplansepare`.`cliente` = `bdclick4`.`bdterceros`.`idSistema`))) left join `bdclick4`.`bdproductos` on((`bdclick4`.`bdplansepare`.`producto` = `bdclick4`.`bdproductos`.`idSistema`))) group by `bdclick4`.`bdplansepare`.`idFactura`,cast(substr(`bdclick4`.`bdplansepare`.`idFactura`,8,100) as signed),`bdclick4`.`bdterceros`.`nombre`,`bdclick4`.`bdplansepare`.`cliente`,`bdclick4`.`bdplansepare`.`vendedor`,`bdclick4`.`bdplansepare`.`red`,`bdclick4`.`bdplansepare`.`fechaFactura`,`bdclick4`.`bdplansepare`.`fechaVencimiento`,`bdclick4`.`bdplansepare`.`efectivoGeneral`,`bdclick4`.`bdplansepare`.`ncGeneral`,`bdclick4`.`bdplansepare`.`chequeGeneral`,`bdclick4`.`bdplansepare`.`targetaGeneral`,`bdclick4`.`bdplansepare`.`totalGeneral`,`bdclick4`.`bdplansepare`.`descuentoGeneral`,`bdclick4`.`bdplansepare`.`ivaGeneral`,`bdclick4`.`bdplansepare`.`subtotalGeneral`,`bdclick4`.`bdplansepare`.`comprobante`,`bdclick4`.`bdplansepare`.`cotizacion`,`bdclick4`.`bdplansepare`.`anulada`,`bdclick4`.`bdplansepare`.`anula`,`bdclick4`.`bdplansepare`.`credito`,`bdclick4`.`bdplansepare`.`cxc`,`bdclick4`.`bdplansepare`.`usuario`,`bdclick4`.`bdplansepare`.`rtIva`,`bdclick4`.`bdplansepare`.`rtIca`,`bdclick4`.`bdplansepare`.`rtFuente`,`bdclick4`.`bdplansepare`.`otros`,`bdclick4`.`bdplansepare`.`anulada1`,`bdclick4`.`bdplansepare`.`anula1`,`bdclick4`.`bdplansepare`.`credito1`,`bdclick4`.`bdplansepare`.`cxc1`,`bdclick4`.`bdplansepare`.`usuario1`,`bdclick4`.`bdplansepare`.`fechaAlerta`,`bdclick4`.`bdplansepare`.`terminal`,`bdclick4`.`bdplansepare`.`estadoGeneral`,`bdclick4`.`bdplansepare`.`estado2`,`bdclick4`.`bdplansepare`.`devuelta`,`bdclick4`.`bdplansepare`.`factura`,`bdclick4`.`bdplansepare`.`resolucion`,`bdclick4`.`bdplansepare`.`fechaAnulacion`,`bdclick4`.`bdplansepare`.`cuadreAnulacion`,`bdclick4`.`bdplansepare`.`usuarioAnula`,`bdclick4`.`bdplansepare`.`copago`,`bdclick4`.`bdplansepare`.`placa`,`bdclick4`.`bdplansepare`.`garantia`,`bdclick4`.`bdplansepare`.`diasGarantia`,`bdclick4`.`bdplansepare`.`rango`,`bdclick4`.`bdplansepare`.`conseMesa`,`bdclick4`.`bdplansepare`.`producto`,`bdclick4`.`bdplansepare`.`lista`,`bdclick4`.`bdplansepare`.`cantidad`,`bdclick4`.`bdplansepare`.`descuento`,`bdclick4`.`bdplansepare`.`total`,`bdclick4`.`bdplansepare`.`iva`,`bdclick4`.`bdplansepare`.`subtotal`,`bdclick4`.`bdplansepare`.`NC`,`bdclick4`.`bdplansepare`.`utilidad`,`bdclick4`.`bdplansepare`.`porcDescuento`,`bdclick4`.`bdplansepare`.`descripcion`,`bdclick4`.`bdplansepare`.`plu`,`bdclick4`.`bdplansepare`.`cant2`,`bdclick4`.`bdplansepare`.`estado`,`bdclick4`.`bdplansepare`.`porcIva`,`bdclick4`.`bdplansepare`.`tercero`,`bdclick4`.`bdplansepare`.`utilidad1`,`bdclick4`.`bdplansepare`.`preparacion`,`bdclick4`.`bdplansepare`.`bodega`,`bdclick4`.`bdterceros`.`telefono`,`bdclick4`.`bdterceros`.`direccion`,`bdclick4`.`bdcxc`.`plazo`,`bdclick4`.`bdcxc`.`tipo`,\'\',`bdclick4`.`bdterceros`.`id`,\'\',`bdclick4`.`bdproductos`.`Codigo`,`bdclick4`.`bdplansepare`.`imei`,`bdclick4`.`bdplansepare`.`idProd` having (`bdclick4`.`bdcxc`.`tipo` = \'SEPARE\') order by cast(substr(`bdclick4`.`bdplansepare`.`idFactura`,8,100) as signed)
mariadb-version=100135