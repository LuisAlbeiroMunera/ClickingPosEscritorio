TYPE=VIEW
query=select `bdclick1`.`bdfactura`.`idFactura` AS `idFactura`,cast(substr(`bdclick1`.`bdfactura`.`idFactura`,6,100) as signed) AS `ordenId`,`bdclick1`.`bdfactura`.`cliente` AS `cliente`,`bdclick1`.`bdfactura`.`vendedor` AS `vendedor`,`bdclick1`.`bdfactura`.`red` AS `red`,`bdclick1`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick1`.`bdfactura`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick1`.`bdfactura`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick1`.`bdfactura`.`ncGeneral` AS `ncGeneral`,`bdclick1`.`bdfactura`.`chequeGeneral` AS `chequeGeneral`,`bdclick1`.`bdfactura`.`targetaGeneral` AS `targetaGeneral`,`bdclick1`.`bdfactura`.`totalGeneral` AS `totalGeneral`,`bdclick1`.`bdfactura`.`descuentoGeneral` AS `descuentoGeneral`,`bdclick1`.`bdfactura`.`ivaGeneral` AS `ivaGeneral`,`bdclick1`.`bdfactura`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick1`.`bdfactura`.`comprobante` AS `comprobante`,`bdclick1`.`bdfactura`.`cotizacion` AS `cotizacion`,`bdclick1`.`bdfactura`.`anulada` AS `anulada`,`bdclick1`.`bdfactura`.`anula` AS `anula`,`bdclick1`.`bdfactura`.`credito` AS `credito`,`bdclick1`.`bdfactura`.`cxc` AS `cxc`,`bdclick1`.`bdfactura`.`usuario` AS `usuario`,`bdclick1`.`bdfactura`.`rtIva` AS `rtIva`,`bdclick1`.`bdfactura`.`rtIca` AS `rtIca`,`bdclick1`.`bdfactura`.`rtFuente` AS `rtFuente`,`bdclick1`.`bdfactura`.`otros` AS `otros`,`bdclick1`.`bdfactura`.`observacion` AS `observacion`,`bdclick1`.`bdfactura`.`anulada1` AS `anulada1`,`bdclick1`.`bdfactura`.`anula1` AS `anula1`,`bdclick1`.`bdfactura`.`credito1` AS `credito1`,`bdclick1`.`bdfactura`.`cxc1` AS `cxc1`,`bdclick1`.`bdfactura`.`usuario1` AS `usuario1`,`bdclick1`.`bdfactura`.`fechaAlerta` AS `fechaAlerta`,`bdclick1`.`bdfactura`.`terminal` AS `terminal`,`bdclick1`.`bdfactura`.`estadoGeneral` AS `estadoGeneral`,`bdclick1`.`bdfactura`.`estado2` AS `estado2`,`bdclick1`.`bdfactura`.`devuelta` AS `devuelta`,`bdclick1`.`bdfactura`.`factura` AS `factura`,`bdclick1`.`bdfactura`.`resolucion` AS `resolucion`,`bdclick1`.`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,`bdclick1`.`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick1`.`bdfactura`.`usuarioAnula` AS `usuarioAnula`,`bdclick1`.`bdfactura`.`copago` AS `copago`,`bdclick1`.`bdfactura`.`placa` AS `placa`,`bdclick1`.`bdfactura`.`garantia` AS `garantia`,`bdclick1`.`bdfactura`.`diasGarantia` AS `diasGarantia`,`bdclick1`.`bdfactura`.`rango` AS `rango`,`bdclick1`.`bdfactura`.`terminos` AS `terminos`,`bdclick1`.`bdfactura`.`notaAnulacion` AS `notaAnulacion`,`bdclick1`.`bdfactura`.`conseMesa` AS `conseMesa`,`bdclick1`.`bdfactura`.`producto` AS `producto`,`bdclick1`.`bdfactura`.`lista` AS `lista`,`bdclick1`.`bdfactura`.`cantidad` AS `cantidad`,`bdclick1`.`bdfactura`.`descuento` AS `descuento`,`bdclick1`.`bdfactura`.`total` AS `total`,`bdclick1`.`bdfactura`.`iva` AS `iva`,`bdclick1`.`bdfactura`.`subtotal` AS `subtotal`,`bdclick1`.`bdfactura`.`NC` AS `NC`,`bdclick1`.`bdfactura`.`utilidad` AS `utilidad`,`bdclick1`.`bdfactura`.`concepto` AS `concepto`,`bdclick1`.`bdfactura`.`porcDescuento` AS `porcDescuento`,`bdclick1`.`bdfactura`.`descripcion` AS `descripcion`,`bdclick1`.`bdfactura`.`plu` AS `plu`,`bdclick1`.`bdfactura`.`cant2` AS `cant2`,`bdclick1`.`bdfactura`.`estado` AS `estado`,`bdclick1`.`bdfactura`.`porcIva` AS `porcIva`,`bdclick1`.`bdfactura`.`tercero` AS `tercero`,`bdclick1`.`bdfactura`.`utilidad1` AS `utilidad1`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`bdclick1`.`bdterceros`.`telefono` AS `telefono`,`bdclick1`.`bdcxc`.`plazo` AS `plazo`,`bdclick1`.`bdterceros`.`direccion` AS `direccion`,if(isnull(`bdclick1`.`bdprestamo`.`cuotaInicial`),0,`bdclick1`.`bdprestamo`.`cuotaInicial`) AS `cuotaInicial2`,`bdclick1`.`bdfactura`.`factura` AS `id2`,`bdclick1`.`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdclick1`.`bdproductos`.`referencia` AS `referencia`,`bdclick1`.`bdfactura`.`cotizacion` AS `documento2`,`bdclick1`.`bdfactura`.`impuesto` AS `impuesto`,`bdclick1`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick1`.`bdterceros`.`id` AS `IdCliente`,`bdclick1`.`bdfactura`.`imei` AS `imei`,`bdclick1`.`bdfactura`.`hora` AS `hora`,`bdclick1`.`bdfactura`.`bodega` AS `bodega` from ((`bdclick1`.`bdproductos` join ((`bdclick1`.`bdfactura` left join `bdclick1`.`bdprestamo` on((`bdclick1`.`bdfactura`.`idFactura` = `bdclick1`.`bdprestamo`.`factura`))) left join `bdclick1`.`bdcxc` on((`bdclick1`.`bdfactura`.`factura` = `bdclick1`.`bdcxc`.`factura2`))) on((`bdclick1`.`bdproductos`.`idSistema` = `bdclick1`.`bdfactura`.`producto`))) left join `bdclick1`.`bdterceros` on((`bdclick1`.`bdfactura`.`cliente` = `bdclick1`.`bdterceros`.`idSistema`))) where (`bdclick1`.`bdfactura`.`anulada` = 1) order by cast(substr(`bdclick1`.`bdfactura`.`idFactura`,6,100) as signed)
md5=b9857b4b5c3d515ee17bb237bf82060a
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:32
create-version=2
source=select `bdfactura`.`idFactura` AS `idFactura`,cast(substr(`bdfactura`.`idFactura`,6,100) as signed) AS `ordenId`,`bdfactura`.`cliente` AS `cliente`,`bdfactura`.`vendedor` AS `vendedor`,`bdfactura`.`red` AS `red`,`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdfactura`.`fechaVencimiento` AS `fechaVencimiento`,`bdfactura`.`efectivoGeneral` AS `efectivoGeneral`,`bdfactura`.`ncGeneral` AS `ncGeneral`,`bdfactura`.`chequeGeneral` AS `chequeGeneral`,`bdfactura`.`targetaGeneral` AS `targetaGeneral`,`bdfactura`.`totalGeneral` AS `totalGeneral`,`bdfactura`.`descuentoGeneral` AS `descuentoGeneral`,`bdfactura`.`ivaGeneral` AS `ivaGeneral`,`bdfactura`.`subtotalGeneral` AS `subtotalGeneral`,`bdfactura`.`comprobante` AS `comprobante`,`bdfactura`.`cotizacion` AS `cotizacion`,`bdfactura`.`anulada` AS `anulada`,`bdfactura`.`anula` AS `anula`,`bdfactura`.`credito` AS `credito`,`bdfactura`.`cxc` AS `cxc`,`bdfactura`.`usuario` AS `usuario`,`bdfactura`.`rtIva` AS `rtIva`,`bdfactura`.`rtIca` AS `rtIca`,`bdfactura`.`rtFuente` AS `rtFuente`,`bdfactura`.`otros` AS `otros`,`bdfactura`.`observacion` AS `observacion`,`bdfactura`.`anulada1` AS `anulada1`,`bdfactura`.`anula1` AS `anula1`,`bdfactura`.`credito1` AS `credito1`,`bdfactura`.`cxc1` AS `cxc1`,`bdfactura`.`usuario1` AS `usuario1`,`bdfactura`.`fechaAlerta` AS `fechaAlerta`,`bdfactura`.`terminal` AS `terminal`,`bdfactura`.`estadoGeneral` AS `estadoGeneral`,`bdfactura`.`estado2` AS `estado2`,`bdfactura`.`devuelta` AS `devuelta`,`bdfactura`.`factura` AS `factura`,`bdfactura`.`resolucion` AS `resolucion`,`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdfactura`.`usuarioAnula` AS `usuarioAnula`,`bdfactura`.`copago` AS `copago`,`bdfactura`.`placa` AS `placa`,`bdfactura`.`garantia` AS `garantia`,`bdfactura`.`diasGarantia` AS `diasGarantia`,`bdfactura`.`rango` AS `rango`,`bdfactura`.`terminos` AS `terminos`,`bdfactura`.`notaAnulacion` AS `notaAnulacion`,`bdfactura`.`conseMesa` AS `conseMesa`,`bdfactura`.`producto` AS `producto`,`bdfactura`.`lista` AS `lista`,`bdfactura`.`cantidad` AS `cantidad`,`bdfactura`.`descuento` AS `descuento`,`bdfactura`.`total` AS `total`,`bdfactura`.`iva` AS `iva`,`bdfactura`.`subtotal` AS `subtotal`,`bdfactura`.`NC` AS `NC`,`bdfactura`.`utilidad` AS `utilidad`,`bdfactura`.`concepto` AS `concepto`,`bdfactura`.`porcDescuento` AS `porcDescuento`,`bdfactura`.`descripcion` AS `descripcion`,`bdfactura`.`plu` AS `plu`,`bdfactura`.`cant2` AS `cant2`,`bdfactura`.`estado` AS `estado`,`bdfactura`.`porcIva` AS `porcIva`,`bdfactura`.`tercero` AS `tercero`,`bdfactura`.`utilidad1` AS `utilidad1`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdcxc`.`plazo` AS `plazo`,`bdterceros`.`direccion` AS `direccion`,if(isnull(`bdprestamo`.`cuotaInicial`),0,`bdprestamo`.`cuotaInicial`) AS `cuotaInicial2`,`bdfactura`.`factura` AS `id2`,`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdproductos`.`referencia` AS `referencia`,`bdfactura`.`cotizacion` AS `documento2`,`bdfactura`.`impuesto` AS `impuesto`,`bdproductos`.`Codigo` AS `Codigo`,`bdterceros`.`id` AS `IdCliente`,`bdfactura`.`imei` AS `imei`,`bdfactura`.`hora` AS `hora`,`bdfactura`.`bodega` AS `bodega` from ((`bdproductos` join ((`bdfactura` left join `bdprestamo` on((`bdfactura`.`idFactura` = `bdprestamo`.`factura`))) left join `bdcxc` on((`bdfactura`.`factura` = `bdcxc`.`factura2`))) on((`bdproductos`.`idSistema` = `bdfactura`.`producto`))) left join `bdterceros` on((`bdfactura`.`cliente` = `bdterceros`.`idSistema`))) where (`bdfactura`.`anulada` = 1) order by cast(substr(`bdfactura`.`idFactura`,6,100) as signed)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdfactura`.`idFactura` AS `idFactura`,cast(substr(`bdclick1`.`bdfactura`.`idFactura`,6,100) as signed) AS `ordenId`,`bdclick1`.`bdfactura`.`cliente` AS `cliente`,`bdclick1`.`bdfactura`.`vendedor` AS `vendedor`,`bdclick1`.`bdfactura`.`red` AS `red`,`bdclick1`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick1`.`bdfactura`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick1`.`bdfactura`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick1`.`bdfactura`.`ncGeneral` AS `ncGeneral`,`bdclick1`.`bdfactura`.`chequeGeneral` AS `chequeGeneral`,`bdclick1`.`bdfactura`.`targetaGeneral` AS `targetaGeneral`,`bdclick1`.`bdfactura`.`totalGeneral` AS `totalGeneral`,`bdclick1`.`bdfactura`.`descuentoGeneral` AS `descuentoGeneral`,`bdclick1`.`bdfactura`.`ivaGeneral` AS `ivaGeneral`,`bdclick1`.`bdfactura`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick1`.`bdfactura`.`comprobante` AS `comprobante`,`bdclick1`.`bdfactura`.`cotizacion` AS `cotizacion`,`bdclick1`.`bdfactura`.`anulada` AS `anulada`,`bdclick1`.`bdfactura`.`anula` AS `anula`,`bdclick1`.`bdfactura`.`credito` AS `credito`,`bdclick1`.`bdfactura`.`cxc` AS `cxc`,`bdclick1`.`bdfactura`.`usuario` AS `usuario`,`bdclick1`.`bdfactura`.`rtIva` AS `rtIva`,`bdclick1`.`bdfactura`.`rtIca` AS `rtIca`,`bdclick1`.`bdfactura`.`rtFuente` AS `rtFuente`,`bdclick1`.`bdfactura`.`otros` AS `otros`,`bdclick1`.`bdfactura`.`observacion` AS `observacion`,`bdclick1`.`bdfactura`.`anulada1` AS `anulada1`,`bdclick1`.`bdfactura`.`anula1` AS `anula1`,`bdclick1`.`bdfactura`.`credito1` AS `credito1`,`bdclick1`.`bdfactura`.`cxc1` AS `cxc1`,`bdclick1`.`bdfactura`.`usuario1` AS `usuario1`,`bdclick1`.`bdfactura`.`fechaAlerta` AS `fechaAlerta`,`bdclick1`.`bdfactura`.`terminal` AS `terminal`,`bdclick1`.`bdfactura`.`estadoGeneral` AS `estadoGeneral`,`bdclick1`.`bdfactura`.`estado2` AS `estado2`,`bdclick1`.`bdfactura`.`devuelta` AS `devuelta`,`bdclick1`.`bdfactura`.`factura` AS `factura`,`bdclick1`.`bdfactura`.`resolucion` AS `resolucion`,`bdclick1`.`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,`bdclick1`.`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick1`.`bdfactura`.`usuarioAnula` AS `usuarioAnula`,`bdclick1`.`bdfactura`.`copago` AS `copago`,`bdclick1`.`bdfactura`.`placa` AS `placa`,`bdclick1`.`bdfactura`.`garantia` AS `garantia`,`bdclick1`.`bdfactura`.`diasGarantia` AS `diasGarantia`,`bdclick1`.`bdfactura`.`rango` AS `rango`,`bdclick1`.`bdfactura`.`terminos` AS `terminos`,`bdclick1`.`bdfactura`.`notaAnulacion` AS `notaAnulacion`,`bdclick1`.`bdfactura`.`conseMesa` AS `conseMesa`,`bdclick1`.`bdfactura`.`producto` AS `producto`,`bdclick1`.`bdfactura`.`lista` AS `lista`,`bdclick1`.`bdfactura`.`cantidad` AS `cantidad`,`bdclick1`.`bdfactura`.`descuento` AS `descuento`,`bdclick1`.`bdfactura`.`total` AS `total`,`bdclick1`.`bdfactura`.`iva` AS `iva`,`bdclick1`.`bdfactura`.`subtotal` AS `subtotal`,`bdclick1`.`bdfactura`.`NC` AS `NC`,`bdclick1`.`bdfactura`.`utilidad` AS `utilidad`,`bdclick1`.`bdfactura`.`concepto` AS `concepto`,`bdclick1`.`bdfactura`.`porcDescuento` AS `porcDescuento`,`bdclick1`.`bdfactura`.`descripcion` AS `descripcion`,`bdclick1`.`bdfactura`.`plu` AS `plu`,`bdclick1`.`bdfactura`.`cant2` AS `cant2`,`bdclick1`.`bdfactura`.`estado` AS `estado`,`bdclick1`.`bdfactura`.`porcIva` AS `porcIva`,`bdclick1`.`bdfactura`.`tercero` AS `tercero`,`bdclick1`.`bdfactura`.`utilidad1` AS `utilidad1`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`bdclick1`.`bdterceros`.`telefono` AS `telefono`,`bdclick1`.`bdcxc`.`plazo` AS `plazo`,`bdclick1`.`bdterceros`.`direccion` AS `direccion`,if(isnull(`bdclick1`.`bdprestamo`.`cuotaInicial`),0,`bdclick1`.`bdprestamo`.`cuotaInicial`) AS `cuotaInicial2`,`bdclick1`.`bdfactura`.`factura` AS `id2`,`bdclick1`.`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdclick1`.`bdproductos`.`referencia` AS `referencia`,`bdclick1`.`bdfactura`.`cotizacion` AS `documento2`,`bdclick1`.`bdfactura`.`impuesto` AS `impuesto`,`bdclick1`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick1`.`bdterceros`.`id` AS `IdCliente`,`bdclick1`.`bdfactura`.`imei` AS `imei`,`bdclick1`.`bdfactura`.`hora` AS `hora`,`bdclick1`.`bdfactura`.`bodega` AS `bodega` from ((`bdclick1`.`bdproductos` join ((`bdclick1`.`bdfactura` left join `bdclick1`.`bdprestamo` on((`bdclick1`.`bdfactura`.`idFactura` = `bdclick1`.`bdprestamo`.`factura`))) left join `bdclick1`.`bdcxc` on((`bdclick1`.`bdfactura`.`factura` = `bdclick1`.`bdcxc`.`factura2`))) on((`bdclick1`.`bdproductos`.`idSistema` = `bdclick1`.`bdfactura`.`producto`))) left join `bdclick1`.`bdterceros` on((`bdclick1`.`bdfactura`.`cliente` = `bdclick1`.`bdterceros`.`idSistema`))) where (`bdclick1`.`bdfactura`.`anulada` = 1) order by cast(substr(`bdclick1`.`bdfactura`.`idFactura`,6,100) as signed)
mariadb-version=100135
