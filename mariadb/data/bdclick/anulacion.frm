TYPE=VIEW
query=select `bdclick`.`bdfactura`.`idFactura` AS `idFactura`,cast(substr(`bdclick`.`bdfactura`.`idFactura`,6,100) as signed) AS `ordenId`,`bdclick`.`bdfactura`.`cliente` AS `cliente`,`bdclick`.`bdfactura`.`vendedor` AS `vendedor`,`bdclick`.`bdfactura`.`red` AS `red`,`bdclick`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick`.`bdfactura`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick`.`bdfactura`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick`.`bdfactura`.`ncGeneral` AS `ncGeneral`,`bdclick`.`bdfactura`.`chequeGeneral` AS `chequeGeneral`,`bdclick`.`bdfactura`.`targetaGeneral` AS `targetaGeneral`,`bdclick`.`bdfactura`.`totalGeneral` AS `totalGeneral`,`bdclick`.`bdfactura`.`descuentoGeneral` AS `descuentoGeneral`,`bdclick`.`bdfactura`.`ivaGeneral` AS `ivaGeneral`,`bdclick`.`bdfactura`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick`.`bdfactura`.`comprobante` AS `comprobante`,`bdclick`.`bdfactura`.`cotizacion` AS `cotizacion`,`bdclick`.`bdfactura`.`anulada` AS `anulada`,`bdclick`.`bdfactura`.`anula` AS `anula`,`bdclick`.`bdfactura`.`credito` AS `credito`,`bdclick`.`bdfactura`.`cxc` AS `cxc`,`bdclick`.`bdfactura`.`usuario` AS `usuario`,`bdclick`.`bdfactura`.`rtIva` AS `rtIva`,`bdclick`.`bdfactura`.`rtIca` AS `rtIca`,`bdclick`.`bdfactura`.`rtFuente` AS `rtFuente`,`bdclick`.`bdfactura`.`otros` AS `otros`,`bdclick`.`bdfactura`.`observacion` AS `observacion`,`bdclick`.`bdfactura`.`anulada1` AS `anulada1`,`bdclick`.`bdfactura`.`anula1` AS `anula1`,`bdclick`.`bdfactura`.`credito1` AS `credito1`,`bdclick`.`bdfactura`.`cxc1` AS `cxc1`,`bdclick`.`bdfactura`.`usuario1` AS `usuario1`,`bdclick`.`bdfactura`.`fechaAlerta` AS `fechaAlerta`,`bdclick`.`bdfactura`.`terminal` AS `terminal`,`bdclick`.`bdfactura`.`estadoGeneral` AS `estadoGeneral`,`bdclick`.`bdfactura`.`estado2` AS `estado2`,`bdclick`.`bdfactura`.`devuelta` AS `devuelta`,`bdclick`.`bdfactura`.`factura` AS `factura`,`bdclick`.`bdfactura`.`resolucion` AS `resolucion`,`bdclick`.`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,`bdclick`.`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick`.`bdfactura`.`usuarioAnula` AS `usuarioAnula`,`bdclick`.`bdfactura`.`copago` AS `copago`,`bdclick`.`bdfactura`.`placa` AS `placa`,`bdclick`.`bdfactura`.`garantia` AS `garantia`,`bdclick`.`bdfactura`.`diasGarantia` AS `diasGarantia`,`bdclick`.`bdfactura`.`rango` AS `rango`,`bdclick`.`bdfactura`.`terminos` AS `terminos`,`bdclick`.`bdfactura`.`notaAnulacion` AS `notaAnulacion`,`bdclick`.`bdfactura`.`conseMesa` AS `conseMesa`,`bdclick`.`bdfactura`.`producto` AS `producto`,`bdclick`.`bdfactura`.`lista` AS `lista`,`bdclick`.`bdfactura`.`cantidad` AS `cantidad`,`bdclick`.`bdfactura`.`descuento` AS `descuento`,`bdclick`.`bdfactura`.`total` AS `total`,`bdclick`.`bdfactura`.`iva` AS `iva`,`bdclick`.`bdfactura`.`subtotal` AS `subtotal`,`bdclick`.`bdfactura`.`NC` AS `NC`,`bdclick`.`bdfactura`.`utilidad` AS `utilidad`,`bdclick`.`bdfactura`.`concepto` AS `concepto`,`bdclick`.`bdfactura`.`porcDescuento` AS `porcDescuento`,`bdclick`.`bdfactura`.`descripcion` AS `descripcion`,`bdclick`.`bdfactura`.`plu` AS `plu`,`bdclick`.`bdfactura`.`cant2` AS `cant2`,`bdclick`.`bdfactura`.`estado` AS `estado`,`bdclick`.`bdfactura`.`porcIva` AS `porcIva`,`bdclick`.`bdfactura`.`tercero` AS `tercero`,`bdclick`.`bdfactura`.`utilidad1` AS `utilidad1`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdterceros`.`telefono` AS `telefono`,`bdclick`.`bdcxc`.`plazo` AS `plazo`,`bdclick`.`bdterceros`.`direccion` AS `direccion`,if(isnull(`bdclick`.`bdprestamo`.`cuotaInicial`),0,`bdclick`.`bdprestamo`.`cuotaInicial`) AS `cuotaInicial2`,`bdclick`.`bdfactura`.`factura` AS `id2`,`bdclick`.`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdclick`.`bdproductos`.`referencia` AS `referencia`,`bdclick`.`bdfactura`.`cotizacion` AS `documento2`,`bdclick`.`bdfactura`.`impuesto` AS `impuesto`,`bdclick`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick`.`bdterceros`.`id` AS `IdCliente`,`bdclick`.`bdfactura`.`imei` AS `imei`,`bdclick`.`bdfactura`.`hora` AS `hora`,`bdclick`.`bdfactura`.`bodega` AS `bodega` from ((`bdclick`.`bdproductos` join ((`bdclick`.`bdfactura` left join `bdclick`.`bdprestamo` on((`bdclick`.`bdfactura`.`idFactura` = `bdclick`.`bdprestamo`.`factura`))) left join `bdclick`.`bdcxc` on((`bdclick`.`bdfactura`.`factura` = `bdclick`.`bdcxc`.`factura2`))) on((`bdclick`.`bdproductos`.`idSistema` = `bdclick`.`bdfactura`.`producto`))) left join `bdclick`.`bdterceros` on((`bdclick`.`bdfactura`.`cliente` = `bdclick`.`bdterceros`.`idSistema`))) where (`bdclick`.`bdfactura`.`anulada` = 1) order by cast(substr(`bdclick`.`bdfactura`.`idFactura`,6,100) as signed)
md5=40c5dd4a3d6c4300ebfc56b9ad2244fb
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:21
create-version=2
source=select `bdfactura`.`idFactura` AS `idFactura`,cast(substr(`bdfactura`.`idFactura`,6,100) as signed) AS `ordenId`,`bdfactura`.`cliente` AS `cliente`,`bdfactura`.`vendedor` AS `vendedor`,`bdfactura`.`red` AS `red`,`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdfactura`.`fechaVencimiento` AS `fechaVencimiento`,`bdfactura`.`efectivoGeneral` AS `efectivoGeneral`,`bdfactura`.`ncGeneral` AS `ncGeneral`,`bdfactura`.`chequeGeneral` AS `chequeGeneral`,`bdfactura`.`targetaGeneral` AS `targetaGeneral`,`bdfactura`.`totalGeneral` AS `totalGeneral`,`bdfactura`.`descuentoGeneral` AS `descuentoGeneral`,`bdfactura`.`ivaGeneral` AS `ivaGeneral`,`bdfactura`.`subtotalGeneral` AS `subtotalGeneral`,`bdfactura`.`comprobante` AS `comprobante`,`bdfactura`.`cotizacion` AS `cotizacion`,`bdfactura`.`anulada` AS `anulada`,`bdfactura`.`anula` AS `anula`,`bdfactura`.`credito` AS `credito`,`bdfactura`.`cxc` AS `cxc`,`bdfactura`.`usuario` AS `usuario`,`bdfactura`.`rtIva` AS `rtIva`,`bdfactura`.`rtIca` AS `rtIca`,`bdfactura`.`rtFuente` AS `rtFuente`,`bdfactura`.`otros` AS `otros`,`bdfactura`.`observacion` AS `observacion`,`bdfactura`.`anulada1` AS `anulada1`,`bdfactura`.`anula1` AS `anula1`,`bdfactura`.`credito1` AS `credito1`,`bdfactura`.`cxc1` AS `cxc1`,`bdfactura`.`usuario1` AS `usuario1`,`bdfactura`.`fechaAlerta` AS `fechaAlerta`,`bdfactura`.`terminal` AS `terminal`,`bdfactura`.`estadoGeneral` AS `estadoGeneral`,`bdfactura`.`estado2` AS `estado2`,`bdfactura`.`devuelta` AS `devuelta`,`bdfactura`.`factura` AS `factura`,`bdfactura`.`resolucion` AS `resolucion`,`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdfactura`.`usuarioAnula` AS `usuarioAnula`,`bdfactura`.`copago` AS `copago`,`bdfactura`.`placa` AS `placa`,`bdfactura`.`garantia` AS `garantia`,`bdfactura`.`diasGarantia` AS `diasGarantia`,`bdfactura`.`rango` AS `rango`,`bdfactura`.`terminos` AS `terminos`,`bdfactura`.`notaAnulacion` AS `notaAnulacion`,`bdfactura`.`conseMesa` AS `conseMesa`,`bdfactura`.`producto` AS `producto`,`bdfactura`.`lista` AS `lista`,`bdfactura`.`cantidad` AS `cantidad`,`bdfactura`.`descuento` AS `descuento`,`bdfactura`.`total` AS `total`,`bdfactura`.`iva` AS `iva`,`bdfactura`.`subtotal` AS `subtotal`,`bdfactura`.`NC` AS `NC`,`bdfactura`.`utilidad` AS `utilidad`,`bdfactura`.`concepto` AS `concepto`,`bdfactura`.`porcDescuento` AS `porcDescuento`,`bdfactura`.`descripcion` AS `descripcion`,`bdfactura`.`plu` AS `plu`,`bdfactura`.`cant2` AS `cant2`,`bdfactura`.`estado` AS `estado`,`bdfactura`.`porcIva` AS `porcIva`,`bdfactura`.`tercero` AS `tercero`,`bdfactura`.`utilidad1` AS `utilidad1`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdcxc`.`plazo` AS `plazo`,`bdterceros`.`direccion` AS `direccion`,if(isnull(`bdprestamo`.`cuotaInicial`),0,`bdprestamo`.`cuotaInicial`) AS `cuotaInicial2`,`bdfactura`.`factura` AS `id2`,`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdproductos`.`referencia` AS `referencia`,`bdfactura`.`cotizacion` AS `documento2`,`bdfactura`.`impuesto` AS `impuesto`,`bdproductos`.`Codigo` AS `Codigo`,`bdterceros`.`id` AS `IdCliente`,`bdfactura`.`imei` AS `imei`,`bdfactura`.`hora` AS `hora`,`bdfactura`.`bodega` AS `bodega` from ((`bdproductos` join ((`bdfactura` left join `bdprestamo` on((`bdfactura`.`idFactura` = `bdprestamo`.`factura`))) left join `bdcxc` on((`bdfactura`.`factura` = `bdcxc`.`factura2`))) on((`bdproductos`.`idSistema` = `bdfactura`.`producto`))) left join `bdterceros` on((`bdfactura`.`cliente` = `bdterceros`.`idSistema`))) where (`bdfactura`.`anulada` = 1) order by cast(substr(`bdfactura`.`idFactura`,6,100) as signed)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdfactura`.`idFactura` AS `idFactura`,cast(substr(`bdclick`.`bdfactura`.`idFactura`,6,100) as signed) AS `ordenId`,`bdclick`.`bdfactura`.`cliente` AS `cliente`,`bdclick`.`bdfactura`.`vendedor` AS `vendedor`,`bdclick`.`bdfactura`.`red` AS `red`,`bdclick`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick`.`bdfactura`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick`.`bdfactura`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick`.`bdfactura`.`ncGeneral` AS `ncGeneral`,`bdclick`.`bdfactura`.`chequeGeneral` AS `chequeGeneral`,`bdclick`.`bdfactura`.`targetaGeneral` AS `targetaGeneral`,`bdclick`.`bdfactura`.`totalGeneral` AS `totalGeneral`,`bdclick`.`bdfactura`.`descuentoGeneral` AS `descuentoGeneral`,`bdclick`.`bdfactura`.`ivaGeneral` AS `ivaGeneral`,`bdclick`.`bdfactura`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick`.`bdfactura`.`comprobante` AS `comprobante`,`bdclick`.`bdfactura`.`cotizacion` AS `cotizacion`,`bdclick`.`bdfactura`.`anulada` AS `anulada`,`bdclick`.`bdfactura`.`anula` AS `anula`,`bdclick`.`bdfactura`.`credito` AS `credito`,`bdclick`.`bdfactura`.`cxc` AS `cxc`,`bdclick`.`bdfactura`.`usuario` AS `usuario`,`bdclick`.`bdfactura`.`rtIva` AS `rtIva`,`bdclick`.`bdfactura`.`rtIca` AS `rtIca`,`bdclick`.`bdfactura`.`rtFuente` AS `rtFuente`,`bdclick`.`bdfactura`.`otros` AS `otros`,`bdclick`.`bdfactura`.`observacion` AS `observacion`,`bdclick`.`bdfactura`.`anulada1` AS `anulada1`,`bdclick`.`bdfactura`.`anula1` AS `anula1`,`bdclick`.`bdfactura`.`credito1` AS `credito1`,`bdclick`.`bdfactura`.`cxc1` AS `cxc1`,`bdclick`.`bdfactura`.`usuario1` AS `usuario1`,`bdclick`.`bdfactura`.`fechaAlerta` AS `fechaAlerta`,`bdclick`.`bdfactura`.`terminal` AS `terminal`,`bdclick`.`bdfactura`.`estadoGeneral` AS `estadoGeneral`,`bdclick`.`bdfactura`.`estado2` AS `estado2`,`bdclick`.`bdfactura`.`devuelta` AS `devuelta`,`bdclick`.`bdfactura`.`factura` AS `factura`,`bdclick`.`bdfactura`.`resolucion` AS `resolucion`,`bdclick`.`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,`bdclick`.`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick`.`bdfactura`.`usuarioAnula` AS `usuarioAnula`,`bdclick`.`bdfactura`.`copago` AS `copago`,`bdclick`.`bdfactura`.`placa` AS `placa`,`bdclick`.`bdfactura`.`garantia` AS `garantia`,`bdclick`.`bdfactura`.`diasGarantia` AS `diasGarantia`,`bdclick`.`bdfactura`.`rango` AS `rango`,`bdclick`.`bdfactura`.`terminos` AS `terminos`,`bdclick`.`bdfactura`.`notaAnulacion` AS `notaAnulacion`,`bdclick`.`bdfactura`.`conseMesa` AS `conseMesa`,`bdclick`.`bdfactura`.`producto` AS `producto`,`bdclick`.`bdfactura`.`lista` AS `lista`,`bdclick`.`bdfactura`.`cantidad` AS `cantidad`,`bdclick`.`bdfactura`.`descuento` AS `descuento`,`bdclick`.`bdfactura`.`total` AS `total`,`bdclick`.`bdfactura`.`iva` AS `iva`,`bdclick`.`bdfactura`.`subtotal` AS `subtotal`,`bdclick`.`bdfactura`.`NC` AS `NC`,`bdclick`.`bdfactura`.`utilidad` AS `utilidad`,`bdclick`.`bdfactura`.`concepto` AS `concepto`,`bdclick`.`bdfactura`.`porcDescuento` AS `porcDescuento`,`bdclick`.`bdfactura`.`descripcion` AS `descripcion`,`bdclick`.`bdfactura`.`plu` AS `plu`,`bdclick`.`bdfactura`.`cant2` AS `cant2`,`bdclick`.`bdfactura`.`estado` AS `estado`,`bdclick`.`bdfactura`.`porcIva` AS `porcIva`,`bdclick`.`bdfactura`.`tercero` AS `tercero`,`bdclick`.`bdfactura`.`utilidad1` AS `utilidad1`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdterceros`.`telefono` AS `telefono`,`bdclick`.`bdcxc`.`plazo` AS `plazo`,`bdclick`.`bdterceros`.`direccion` AS `direccion`,if(isnull(`bdclick`.`bdprestamo`.`cuotaInicial`),0,`bdclick`.`bdprestamo`.`cuotaInicial`) AS `cuotaInicial2`,`bdclick`.`bdfactura`.`factura` AS `id2`,`bdclick`.`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdclick`.`bdproductos`.`referencia` AS `referencia`,`bdclick`.`bdfactura`.`cotizacion` AS `documento2`,`bdclick`.`bdfactura`.`impuesto` AS `impuesto`,`bdclick`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick`.`bdterceros`.`id` AS `IdCliente`,`bdclick`.`bdfactura`.`imei` AS `imei`,`bdclick`.`bdfactura`.`hora` AS `hora`,`bdclick`.`bdfactura`.`bodega` AS `bodega` from ((`bdclick`.`bdproductos` join ((`bdclick`.`bdfactura` left join `bdclick`.`bdprestamo` on((`bdclick`.`bdfactura`.`idFactura` = `bdclick`.`bdprestamo`.`factura`))) left join `bdclick`.`bdcxc` on((`bdclick`.`bdfactura`.`factura` = `bdclick`.`bdcxc`.`factura2`))) on((`bdclick`.`bdproductos`.`idSistema` = `bdclick`.`bdfactura`.`producto`))) left join `bdclick`.`bdterceros` on((`bdclick`.`bdfactura`.`cliente` = `bdclick`.`bdterceros`.`idSistema`))) where (`bdclick`.`bdfactura`.`anulada` = 1) order by cast(substr(`bdclick`.`bdfactura`.`idFactura`,6,100) as signed)
mariadb-version=100135
