TYPE=VIEW
query=select `bdclick5`.`bdplansepare`.`idFactura` AS `idFactura`,cast(substr(`bdclick5`.`bdplansepare`.`idFactura`,8,100) as signed) AS `ordenId`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdplansepare`.`cliente` AS `cliente`,`bdclick5`.`bdplansepare`.`vendedor` AS `vendedor`,`bdclick5`.`bdplansepare`.`red` AS `red`,`bdclick5`.`bdplansepare`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`bdplansepare`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick5`.`bdplansepare`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick5`.`bdplansepare`.`ncGeneral` AS `ncGeneral`,`bdclick5`.`bdplansepare`.`chequeGeneral` AS `chequeGeneral`,`bdclick5`.`bdplansepare`.`targetaGeneral` AS `targetaGeneral`,`bdclick5`.`bdplansepare`.`totalGeneral` AS `totalGeneral`,`bdclick5`.`bdplansepare`.`descuentoGeneral` AS `descuentoGeneral`,`bdclick5`.`bdplansepare`.`ivaGeneral` AS `ivaGeneral`,`bdclick5`.`bdplansepare`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick5`.`bdplansepare`.`comprobante` AS `comprobante`,`bdclick5`.`bdplansepare`.`cotizacion` AS `cotizacion`,`bdclick5`.`bdplansepare`.`anulada` AS `anulada`,`bdclick5`.`bdplansepare`.`anula` AS `anula`,`bdclick5`.`bdplansepare`.`credito` AS `credito`,`bdclick5`.`bdplansepare`.`cxc` AS `cxc`,`bdclick5`.`bdplansepare`.`usuario` AS `usuario`,`bdclick5`.`bdplansepare`.`rtIva` AS `rtIva`,`bdclick5`.`bdplansepare`.`rtIca` AS `rtIca`,`bdclick5`.`bdplansepare`.`rtFuente` AS `rtFuente`,`bdclick5`.`bdplansepare`.`otros` AS `otros`,`bdclick5`.`bdplansepare`.`observacion` AS `observacion`,`bdclick5`.`bdplansepare`.`anulada1` AS `anulada1`,`bdclick5`.`bdplansepare`.`anula1` AS `anula1`,`bdclick5`.`bdplansepare`.`credito1` AS `credito1`,`bdclick5`.`bdplansepare`.`cxc1` AS `cxc1`,`bdclick5`.`bdplansepare`.`usuario1` AS `usuario1`,`bdclick5`.`bdplansepare`.`fechaAlerta` AS `fechaAlerta`,`bdclick5`.`bdplansepare`.`terminal` AS `terminal`,`bdclick5`.`bdplansepare`.`estadoGeneral` AS `estadoGeneral`,`bdclick5`.`bdplansepare`.`estado2` AS `estado2`,`bdclick5`.`bdplansepare`.`devuelta` AS `devuelta`,`bdclick5`.`bdplansepare`.`factura` AS `factura`,`bdclick5`.`bdplansepare`.`resolucion` AS `resolucion`,`bdclick5`.`bdplansepare`.`fechaAnulacion` AS `fechaAnulacion`,`bdclick5`.`bdplansepare`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick5`.`bdplansepare`.`usuarioAnula` AS `usuarioAnula`,`bdclick5`.`bdplansepare`.`copago` AS `copago`,`bdclick5`.`bdplansepare`.`placa` AS `placa`,`bdclick5`.`bdplansepare`.`garantia` AS `garantia`,`bdclick5`.`bdplansepare`.`diasGarantia` AS `diasGarantia`,`bdclick5`.`bdplansepare`.`rango` AS `rango`,`bdclick5`.`bdplansepare`.`terminos` AS `terminos`,`bdclick5`.`bdplansepare`.`notaAnulacion` AS `notaAnulacion`,`bdclick5`.`bdplansepare`.`conseMesa` AS `conseMesa`,`bdclick5`.`bdplansepare`.`producto` AS `producto`,`bdclick5`.`bdplansepare`.`lista` AS `lista`,`bdclick5`.`bdplansepare`.`cantidad` AS `cantidad`,`bdclick5`.`bdplansepare`.`descuento` AS `descuento`,`bdclick5`.`bdplansepare`.`total` AS `total`,`bdclick5`.`bdplansepare`.`iva` AS `iva`,`bdclick5`.`bdplansepare`.`subtotal` AS `subtotal`,`bdclick5`.`bdplansepare`.`NC` AS `NC`,`bdclick5`.`bdplansepare`.`utilidad` AS `utilidad`,`bdclick5`.`bdplansepare`.`concepto` AS `concepto`,`bdclick5`.`bdplansepare`.`porcDescuento` AS `porcDescuento`,`bdclick5`.`bdplansepare`.`descripcion` AS `descripcion`,`bdclick5`.`bdplansepare`.`plu` AS `plu`,`bdclick5`.`bdplansepare`.`cant2` AS `cant2`,`bdclick5`.`bdplansepare`.`estado` AS `estado`,`bdclick5`.`bdplansepare`.`porcIva` AS `porcIva`,`bdclick5`.`bdplansepare`.`tercero` AS `tercero`,`bdclick5`.`bdplansepare`.`utilidad1` AS `utilidad1`,`bdclick5`.`bdplansepare`.`preparacion` AS `preparacion`,`bdclick5`.`bdplansepare`.`bodega` AS `bodega`,`bdclick5`.`bdterceros`.`telefono` AS `telefono`,`bdclick5`.`bdterceros`.`direccion` AS `direccion`,`bdclick5`.`bdcxc`.`plazo` AS `plazo`,`bdclick5`.`bdcxc`.`tipo` AS `tipo`,\'\' AS `ubicacion`,\'\' AS `referencia`,0 AS `cuotaInicial2`,`bdclick5`.`bdterceros`.`id` AS `IdTercero`,`bdclick5`.`bdproductos`.`Codigo` AS `CodigoProd`,`bdclick5`.`bdplansepare`.`imei` AS `imei`,`bdclick5`.`bdplansepare`.`idProd` AS `idProd` from (((`bdclick5`.`bdplansepare` left join `bdclick5`.`bdcxc` on((`bdclick5`.`bdcxc`.`factura` = `bdclick5`.`bdplansepare`.`idFactura`))) left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdplansepare`.`cliente` = `bdclick5`.`bdterceros`.`idSistema`))) left join `bdclick5`.`bdproductos` on((`bdclick5`.`bdplansepare`.`producto` = `bdclick5`.`bdproductos`.`idSistema`))) group by `bdclick5`.`bdplansepare`.`idFactura`,cast(substr(`bdclick5`.`bdplansepare`.`idFactura`,8,100) as signed),`bdclick5`.`bdterceros`.`nombre`,`bdclick5`.`bdplansepare`.`cliente`,`bdclick5`.`bdplansepare`.`vendedor`,`bdclick5`.`bdplansepare`.`red`,`bdclick5`.`bdplansepare`.`fechaFactura`,`bdclick5`.`bdplansepare`.`fechaVencimiento`,`bdclick5`.`bdplansepare`.`efectivoGeneral`,`bdclick5`.`bdplansepare`.`ncGeneral`,`bdclick5`.`bdplansepare`.`chequeGeneral`,`bdclick5`.`bdplansepare`.`targetaGeneral`,`bdclick5`.`bdplansepare`.`totalGeneral`,`bdclick5`.`bdplansepare`.`descuentoGeneral`,`bdclick5`.`bdplansepare`.`ivaGeneral`,`bdclick5`.`bdplansepare`.`subtotalGeneral`,`bdclick5`.`bdplansepare`.`comprobante`,`bdclick5`.`bdplansepare`.`cotizacion`,`bdclick5`.`bdplansepare`.`anulada`,`bdclick5`.`bdplansepare`.`anula`,`bdclick5`.`bdplansepare`.`credito`,`bdclick5`.`bdplansepare`.`cxc`,`bdclick5`.`bdplansepare`.`usuario`,`bdclick5`.`bdplansepare`.`rtIva`,`bdclick5`.`bdplansepare`.`rtIca`,`bdclick5`.`bdplansepare`.`rtFuente`,`bdclick5`.`bdplansepare`.`otros`,`bdclick5`.`bdplansepare`.`anulada1`,`bdclick5`.`bdplansepare`.`anula1`,`bdclick5`.`bdplansepare`.`credito1`,`bdclick5`.`bdplansepare`.`cxc1`,`bdclick5`.`bdplansepare`.`usuario1`,`bdclick5`.`bdplansepare`.`fechaAlerta`,`bdclick5`.`bdplansepare`.`terminal`,`bdclick5`.`bdplansepare`.`estadoGeneral`,`bdclick5`.`bdplansepare`.`estado2`,`bdclick5`.`bdplansepare`.`devuelta`,`bdclick5`.`bdplansepare`.`factura`,`bdclick5`.`bdplansepare`.`resolucion`,`bdclick5`.`bdplansepare`.`fechaAnulacion`,`bdclick5`.`bdplansepare`.`cuadreAnulacion`,`bdclick5`.`bdplansepare`.`usuarioAnula`,`bdclick5`.`bdplansepare`.`copago`,`bdclick5`.`bdplansepare`.`placa`,`bdclick5`.`bdplansepare`.`garantia`,`bdclick5`.`bdplansepare`.`diasGarantia`,`bdclick5`.`bdplansepare`.`rango`,`bdclick5`.`bdplansepare`.`conseMesa`,`bdclick5`.`bdplansepare`.`producto`,`bdclick5`.`bdplansepare`.`lista`,`bdclick5`.`bdplansepare`.`cantidad`,`bdclick5`.`bdplansepare`.`descuento`,`bdclick5`.`bdplansepare`.`total`,`bdclick5`.`bdplansepare`.`iva`,`bdclick5`.`bdplansepare`.`subtotal`,`bdclick5`.`bdplansepare`.`NC`,`bdclick5`.`bdplansepare`.`utilidad`,`bdclick5`.`bdplansepare`.`porcDescuento`,`bdclick5`.`bdplansepare`.`descripcion`,`bdclick5`.`bdplansepare`.`plu`,`bdclick5`.`bdplansepare`.`cant2`,`bdclick5`.`bdplansepare`.`estado`,`bdclick5`.`bdplansepare`.`porcIva`,`bdclick5`.`bdplansepare`.`tercero`,`bdclick5`.`bdplansepare`.`utilidad1`,`bdclick5`.`bdplansepare`.`preparacion`,`bdclick5`.`bdplansepare`.`bodega`,`bdclick5`.`bdterceros`.`telefono`,`bdclick5`.`bdterceros`.`direccion`,`bdclick5`.`bdcxc`.`plazo`,`bdclick5`.`bdcxc`.`tipo`,\'\',`bdclick5`.`bdterceros`.`id`,\'\',`bdclick5`.`bdproductos`.`Codigo`,`bdclick5`.`bdplansepare`.`imei`,`bdclick5`.`bdplansepare`.`idProd` having (`bdclick5`.`bdcxc`.`tipo` = \'SEPARE\') order by cast(substr(`bdclick5`.`bdplansepare`.`idFactura`,8,100) as signed)
md5=459d0d04089b3cb5324be0b5faddffb0
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:48
create-version=2
source=select `bdplansepare`.`idFactura` AS `idFactura`,cast(substr(`bdplansepare`.`idFactura`,8,100) as signed) AS `ordenId`,`bdterceros`.`nombre` AS `nombre`,`bdplansepare`.`cliente` AS `cliente`,`bdplansepare`.`vendedor` AS `vendedor`,`bdplansepare`.`red` AS `red`,`bdplansepare`.`fechaFactura` AS `fechaFactura`,`bdplansepare`.`fechaVencimiento` AS `fechaVencimiento`,`bdplansepare`.`efectivoGeneral` AS `efectivoGeneral`,`bdplansepare`.`ncGeneral` AS `ncGeneral`,`bdplansepare`.`chequeGeneral` AS `chequeGeneral`,`bdplansepare`.`targetaGeneral` AS `targetaGeneral`,`bdplansepare`.`totalGeneral` AS `totalGeneral`,`bdplansepare`.`descuentoGeneral` AS `descuentoGeneral`,`bdplansepare`.`ivaGeneral` AS `ivaGeneral`,`bdplansepare`.`subtotalGeneral` AS `subtotalGeneral`,`bdplansepare`.`comprobante` AS `comprobante`,`bdplansepare`.`cotizacion` AS `cotizacion`,`bdplansepare`.`anulada` AS `anulada`,`bdplansepare`.`anula` AS `anula`,`bdplansepare`.`credito` AS `credito`,`bdplansepare`.`cxc` AS `cxc`,`bdplansepare`.`usuario` AS `usuario`,`bdplansepare`.`rtIva` AS `rtIva`,`bdplansepare`.`rtIca` AS `rtIca`,`bdplansepare`.`rtFuente` AS `rtFuente`,`bdplansepare`.`otros` AS `otros`,`bdplansepare`.`observacion` AS `observacion`,`bdplansepare`.`anulada1` AS `anulada1`,`bdplansepare`.`anula1` AS `anula1`,`bdplansepare`.`credito1` AS `credito1`,`bdplansepare`.`cxc1` AS `cxc1`,`bdplansepare`.`usuario1` AS `usuario1`,`bdplansepare`.`fechaAlerta` AS `fechaAlerta`,`bdplansepare`.`terminal` AS `terminal`,`bdplansepare`.`estadoGeneral` AS `estadoGeneral`,`bdplansepare`.`estado2` AS `estado2`,`bdplansepare`.`devuelta` AS `devuelta`,`bdplansepare`.`factura` AS `factura`,`bdplansepare`.`resolucion` AS `resolucion`,`bdplansepare`.`fechaAnulacion` AS `fechaAnulacion`,`bdplansepare`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdplansepare`.`usuarioAnula` AS `usuarioAnula`,`bdplansepare`.`copago` AS `copago`,`bdplansepare`.`placa` AS `placa`,`bdplansepare`.`garantia` AS `garantia`,`bdplansepare`.`diasGarantia` AS `diasGarantia`,`bdplansepare`.`rango` AS `rango`,`bdplansepare`.`terminos` AS `terminos`,`bdplansepare`.`notaAnulacion` AS `notaAnulacion`,`bdplansepare`.`conseMesa` AS `conseMesa`,`bdplansepare`.`producto` AS `producto`,`bdplansepare`.`lista` AS `lista`,`bdplansepare`.`cantidad` AS `cantidad`,`bdplansepare`.`descuento` AS `descuento`,`bdplansepare`.`total` AS `total`,`bdplansepare`.`iva` AS `iva`,`bdplansepare`.`subtotal` AS `subtotal`,`bdplansepare`.`NC` AS `NC`,`bdplansepare`.`utilidad` AS `utilidad`,`bdplansepare`.`concepto` AS `concepto`,`bdplansepare`.`porcDescuento` AS `porcDescuento`,`bdplansepare`.`descripcion` AS `descripcion`,`bdplansepare`.`plu` AS `plu`,`bdplansepare`.`cant2` AS `cant2`,`bdplansepare`.`estado` AS `estado`,`bdplansepare`.`porcIva` AS `porcIva`,`bdplansepare`.`tercero` AS `tercero`,`bdplansepare`.`utilidad1` AS `utilidad1`,`bdplansepare`.`preparacion` AS `preparacion`,`bdplansepare`.`bodega` AS `bodega`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`direccion` AS `direccion`,`bdcxc`.`plazo` AS `plazo`,`bdcxc`.`tipo` AS `tipo`,\'\' AS `ubicacion`,\'\' AS `referencia`,0 AS `cuotaInicial2`,`bdterceros`.`id` AS `IdTercero`,`bdproductos`.`Codigo` AS `CodigoProd`,`bdplansepare`.`imei` AS `imei`,`bdplansepare`.`idProd` AS `idProd` from (((`bdplansepare` left join `bdcxc` on((`bdcxc`.`factura` = `bdplansepare`.`idFactura`))) left join `bdterceros` on((`bdplansepare`.`cliente` = `bdterceros`.`idSistema`))) left join `bdproductos` on((`bdplansepare`.`producto` = `bdproductos`.`idSistema`))) group by `bdplansepare`.`idFactura`,cast(substr(`bdplansepare`.`idFactura`,8,100) as signed),`bdterceros`.`nombre`,`bdplansepare`.`cliente`,`bdplansepare`.`vendedor`,`bdplansepare`.`red`,`bdplansepare`.`fechaFactura`,`bdplansepare`.`fechaVencimiento`,`bdplansepare`.`efectivoGeneral`,`bdplansepare`.`ncGeneral`,`bdplansepare`.`chequeGeneral`,`bdplansepare`.`targetaGeneral`,`bdplansepare`.`totalGeneral`,`bdplansepare`.`descuentoGeneral`,`bdplansepare`.`ivaGeneral`,`bdplansepare`.`subtotalGeneral`,`bdplansepare`.`comprobante`,`bdplansepare`.`cotizacion`,`bdplansepare`.`anulada`,`bdplansepare`.`anula`,`bdplansepare`.`credito`,`bdplansepare`.`cxc`,`bdplansepare`.`usuario`,`bdplansepare`.`rtIva`,`bdplansepare`.`rtIca`,`bdplansepare`.`rtFuente`,`bdplansepare`.`otros`,`bdplansepare`.`anulada1`,`bdplansepare`.`anula1`,`bdplansepare`.`credito1`,`bdplansepare`.`cxc1`,`bdplansepare`.`usuario1`,`bdplansepare`.`fechaAlerta`,`bdplansepare`.`terminal`,`bdplansepare`.`estadoGeneral`,`bdplansepare`.`estado2`,`bdplansepare`.`devuelta`,`bdplansepare`.`factura`,`bdplansepare`.`resolucion`,`bdplansepare`.`fechaAnulacion`,`bdplansepare`.`cuadreAnulacion`,`bdplansepare`.`usuarioAnula`,`bdplansepare`.`copago`,`bdplansepare`.`placa`,`bdplansepare`.`garantia`,`bdplansepare`.`diasGarantia`,`bdplansepare`.`rango`,`bdplansepare`.`conseMesa`,`bdplansepare`.`producto`,`bdplansepare`.`lista`,`bdplansepare`.`cantidad`,`bdplansepare`.`descuento`,`bdplansepare`.`total`,`bdplansepare`.`iva`,`bdplansepare`.`subtotal`,`bdplansepare`.`NC`,`bdplansepare`.`utilidad`,`bdplansepare`.`porcDescuento`,`bdplansepare`.`descripcion`,`bdplansepare`.`plu`,`bdplansepare`.`cant2`,`bdplansepare`.`estado`,`bdplansepare`.`porcIva`,`bdplansepare`.`tercero`,`bdplansepare`.`utilidad1`,`bdplansepare`.`preparacion`,`bdplansepare`.`bodega`,`bdterceros`.`telefono`,`bdterceros`.`direccion`,`bdcxc`.`plazo`,`bdcxc`.`tipo`,\'\',`bdterceros`.`id`,\'\',`bdproductos`.`Codigo`,`bdplansepare`.`imei`,`bdplansepare`.`idProd` having (`bdcxc`.`tipo` = \'SEPARE\') order by cast(substr(`bdplansepare`.`idFactura`,8,100) as signed)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdplansepare`.`idFactura` AS `idFactura`,cast(substr(`bdclick5`.`bdplansepare`.`idFactura`,8,100) as signed) AS `ordenId`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdplansepare`.`cliente` AS `cliente`,`bdclick5`.`bdplansepare`.`vendedor` AS `vendedor`,`bdclick5`.`bdplansepare`.`red` AS `red`,`bdclick5`.`bdplansepare`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`bdplansepare`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick5`.`bdplansepare`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick5`.`bdplansepare`.`ncGeneral` AS `ncGeneral`,`bdclick5`.`bdplansepare`.`chequeGeneral` AS `chequeGeneral`,`bdclick5`.`bdplansepare`.`targetaGeneral` AS `targetaGeneral`,`bdclick5`.`bdplansepare`.`totalGeneral` AS `totalGeneral`,`bdclick5`.`bdplansepare`.`descuentoGeneral` AS `descuentoGeneral`,`bdclick5`.`bdplansepare`.`ivaGeneral` AS `ivaGeneral`,`bdclick5`.`bdplansepare`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick5`.`bdplansepare`.`comprobante` AS `comprobante`,`bdclick5`.`bdplansepare`.`cotizacion` AS `cotizacion`,`bdclick5`.`bdplansepare`.`anulada` AS `anulada`,`bdclick5`.`bdplansepare`.`anula` AS `anula`,`bdclick5`.`bdplansepare`.`credito` AS `credito`,`bdclick5`.`bdplansepare`.`cxc` AS `cxc`,`bdclick5`.`bdplansepare`.`usuario` AS `usuario`,`bdclick5`.`bdplansepare`.`rtIva` AS `rtIva`,`bdclick5`.`bdplansepare`.`rtIca` AS `rtIca`,`bdclick5`.`bdplansepare`.`rtFuente` AS `rtFuente`,`bdclick5`.`bdplansepare`.`otros` AS `otros`,`bdclick5`.`bdplansepare`.`observacion` AS `observacion`,`bdclick5`.`bdplansepare`.`anulada1` AS `anulada1`,`bdclick5`.`bdplansepare`.`anula1` AS `anula1`,`bdclick5`.`bdplansepare`.`credito1` AS `credito1`,`bdclick5`.`bdplansepare`.`cxc1` AS `cxc1`,`bdclick5`.`bdplansepare`.`usuario1` AS `usuario1`,`bdclick5`.`bdplansepare`.`fechaAlerta` AS `fechaAlerta`,`bdclick5`.`bdplansepare`.`terminal` AS `terminal`,`bdclick5`.`bdplansepare`.`estadoGeneral` AS `estadoGeneral`,`bdclick5`.`bdplansepare`.`estado2` AS `estado2`,`bdclick5`.`bdplansepare`.`devuelta` AS `devuelta`,`bdclick5`.`bdplansepare`.`factura` AS `factura`,`bdclick5`.`bdplansepare`.`resolucion` AS `resolucion`,`bdclick5`.`bdplansepare`.`fechaAnulacion` AS `fechaAnulacion`,`bdclick5`.`bdplansepare`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick5`.`bdplansepare`.`usuarioAnula` AS `usuarioAnula`,`bdclick5`.`bdplansepare`.`copago` AS `copago`,`bdclick5`.`bdplansepare`.`placa` AS `placa`,`bdclick5`.`bdplansepare`.`garantia` AS `garantia`,`bdclick5`.`bdplansepare`.`diasGarantia` AS `diasGarantia`,`bdclick5`.`bdplansepare`.`rango` AS `rango`,`bdclick5`.`bdplansepare`.`terminos` AS `terminos`,`bdclick5`.`bdplansepare`.`notaAnulacion` AS `notaAnulacion`,`bdclick5`.`bdplansepare`.`conseMesa` AS `conseMesa`,`bdclick5`.`bdplansepare`.`producto` AS `producto`,`bdclick5`.`bdplansepare`.`lista` AS `lista`,`bdclick5`.`bdplansepare`.`cantidad` AS `cantidad`,`bdclick5`.`bdplansepare`.`descuento` AS `descuento`,`bdclick5`.`bdplansepare`.`total` AS `total`,`bdclick5`.`bdplansepare`.`iva` AS `iva`,`bdclick5`.`bdplansepare`.`subtotal` AS `subtotal`,`bdclick5`.`bdplansepare`.`NC` AS `NC`,`bdclick5`.`bdplansepare`.`utilidad` AS `utilidad`,`bdclick5`.`bdplansepare`.`concepto` AS `concepto`,`bdclick5`.`bdplansepare`.`porcDescuento` AS `porcDescuento`,`bdclick5`.`bdplansepare`.`descripcion` AS `descripcion`,`bdclick5`.`bdplansepare`.`plu` AS `plu`,`bdclick5`.`bdplansepare`.`cant2` AS `cant2`,`bdclick5`.`bdplansepare`.`estado` AS `estado`,`bdclick5`.`bdplansepare`.`porcIva` AS `porcIva`,`bdclick5`.`bdplansepare`.`tercero` AS `tercero`,`bdclick5`.`bdplansepare`.`utilidad1` AS `utilidad1`,`bdclick5`.`bdplansepare`.`preparacion` AS `preparacion`,`bdclick5`.`bdplansepare`.`bodega` AS `bodega`,`bdclick5`.`bdterceros`.`telefono` AS `telefono`,`bdclick5`.`bdterceros`.`direccion` AS `direccion`,`bdclick5`.`bdcxc`.`plazo` AS `plazo`,`bdclick5`.`bdcxc`.`tipo` AS `tipo`,\'\' AS `ubicacion`,\'\' AS `referencia`,0 AS `cuotaInicial2`,`bdclick5`.`bdterceros`.`id` AS `IdTercero`,`bdclick5`.`bdproductos`.`Codigo` AS `CodigoProd`,`bdclick5`.`bdplansepare`.`imei` AS `imei`,`bdclick5`.`bdplansepare`.`idProd` AS `idProd` from (((`bdclick5`.`bdplansepare` left join `bdclick5`.`bdcxc` on((`bdclick5`.`bdcxc`.`factura` = `bdclick5`.`bdplansepare`.`idFactura`))) left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdplansepare`.`cliente` = `bdclick5`.`bdterceros`.`idSistema`))) left join `bdclick5`.`bdproductos` on((`bdclick5`.`bdplansepare`.`producto` = `bdclick5`.`bdproductos`.`idSistema`))) group by `bdclick5`.`bdplansepare`.`idFactura`,cast(substr(`bdclick5`.`bdplansepare`.`idFactura`,8,100) as signed),`bdclick5`.`bdterceros`.`nombre`,`bdclick5`.`bdplansepare`.`cliente`,`bdclick5`.`bdplansepare`.`vendedor`,`bdclick5`.`bdplansepare`.`red`,`bdclick5`.`bdplansepare`.`fechaFactura`,`bdclick5`.`bdplansepare`.`fechaVencimiento`,`bdclick5`.`bdplansepare`.`efectivoGeneral`,`bdclick5`.`bdplansepare`.`ncGeneral`,`bdclick5`.`bdplansepare`.`chequeGeneral`,`bdclick5`.`bdplansepare`.`targetaGeneral`,`bdclick5`.`bdplansepare`.`totalGeneral`,`bdclick5`.`bdplansepare`.`descuentoGeneral`,`bdclick5`.`bdplansepare`.`ivaGeneral`,`bdclick5`.`bdplansepare`.`subtotalGeneral`,`bdclick5`.`bdplansepare`.`comprobante`,`bdclick5`.`bdplansepare`.`cotizacion`,`bdclick5`.`bdplansepare`.`anulada`,`bdclick5`.`bdplansepare`.`anula`,`bdclick5`.`bdplansepare`.`credito`,`bdclick5`.`bdplansepare`.`cxc`,`bdclick5`.`bdplansepare`.`usuario`,`bdclick5`.`bdplansepare`.`rtIva`,`bdclick5`.`bdplansepare`.`rtIca`,`bdclick5`.`bdplansepare`.`rtFuente`,`bdclick5`.`bdplansepare`.`otros`,`bdclick5`.`bdplansepare`.`anulada1`,`bdclick5`.`bdplansepare`.`anula1`,`bdclick5`.`bdplansepare`.`credito1`,`bdclick5`.`bdplansepare`.`cxc1`,`bdclick5`.`bdplansepare`.`usuario1`,`bdclick5`.`bdplansepare`.`fechaAlerta`,`bdclick5`.`bdplansepare`.`terminal`,`bdclick5`.`bdplansepare`.`estadoGeneral`,`bdclick5`.`bdplansepare`.`estado2`,`bdclick5`.`bdplansepare`.`devuelta`,`bdclick5`.`bdplansepare`.`factura`,`bdclick5`.`bdplansepare`.`resolucion`,`bdclick5`.`bdplansepare`.`fechaAnulacion`,`bdclick5`.`bdplansepare`.`cuadreAnulacion`,`bdclick5`.`bdplansepare`.`usuarioAnula`,`bdclick5`.`bdplansepare`.`copago`,`bdclick5`.`bdplansepare`.`placa`,`bdclick5`.`bdplansepare`.`garantia`,`bdclick5`.`bdplansepare`.`diasGarantia`,`bdclick5`.`bdplansepare`.`rango`,`bdclick5`.`bdplansepare`.`conseMesa`,`bdclick5`.`bdplansepare`.`producto`,`bdclick5`.`bdplansepare`.`lista`,`bdclick5`.`bdplansepare`.`cantidad`,`bdclick5`.`bdplansepare`.`descuento`,`bdclick5`.`bdplansepare`.`total`,`bdclick5`.`bdplansepare`.`iva`,`bdclick5`.`bdplansepare`.`subtotal`,`bdclick5`.`bdplansepare`.`NC`,`bdclick5`.`bdplansepare`.`utilidad`,`bdclick5`.`bdplansepare`.`porcDescuento`,`bdclick5`.`bdplansepare`.`descripcion`,`bdclick5`.`bdplansepare`.`plu`,`bdclick5`.`bdplansepare`.`cant2`,`bdclick5`.`bdplansepare`.`estado`,`bdclick5`.`bdplansepare`.`porcIva`,`bdclick5`.`bdplansepare`.`tercero`,`bdclick5`.`bdplansepare`.`utilidad1`,`bdclick5`.`bdplansepare`.`preparacion`,`bdclick5`.`bdplansepare`.`bodega`,`bdclick5`.`bdterceros`.`telefono`,`bdclick5`.`bdterceros`.`direccion`,`bdclick5`.`bdcxc`.`plazo`,`bdclick5`.`bdcxc`.`tipo`,\'\',`bdclick5`.`bdterceros`.`id`,\'\',`bdclick5`.`bdproductos`.`Codigo`,`bdclick5`.`bdplansepare`.`imei`,`bdclick5`.`bdplansepare`.`idProd` having (`bdclick5`.`bdcxc`.`tipo` = \'SEPARE\') order by cast(substr(`bdclick5`.`bdplansepare`.`idFactura`,8,100) as signed)
mariadb-version=100135