TYPE=VIEW
query=select `bdclick2`.`bdpedido`.`idFactura` AS `idFactura`,cast(substr(`bdclick2`.`bdpedido`.`idFactura`,8,100) as signed) AS `ordenId`,`bdclick2`.`bdpedido`.`cliente` AS `cliente`,`bdclick2`.`bdpedido`.`vendedor` AS `vendedor`,`bdclick2`.`bdpedido`.`red` AS `red`,`bdclick2`.`bdpedido`.`fechaFactura` AS `fechaFactura`,`bdclick2`.`bdpedido`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick2`.`bdpedido`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick2`.`bdpedido`.`ncGeneral` AS `ncGeneral`,`bdclick2`.`bdpedido`.`chequeGeneral` AS `chequeGeneral`,`bdclick2`.`bdpedido`.`targetaGeneral` AS `targetaGeneral`,`bdclick2`.`bdpedido`.`totalGeneral` AS `totalGeneral`,`bdclick2`.`bdpedido`.`descuentoGeneral` AS `descuentoGeneral`,`bdclick2`.`bdpedido`.`ivaGeneral` AS `ivaGeneral`,`bdclick2`.`bdpedido`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick2`.`bdpedido`.`comprobante` AS `comprobante`,`bdclick2`.`bdpedido`.`cotizacion` AS `cotizacion`,`bdclick2`.`bdpedido`.`anulada` AS `anulada`,`bdclick2`.`bdpedido`.`anula` AS `anula`,`bdclick2`.`bdpedido`.`credito` AS `credito`,`bdclick2`.`bdpedido`.`cxc` AS `cxc`,`bdclick2`.`bdpedido`.`usuario` AS `usuario`,`bdclick2`.`bdpedido`.`rtIva` AS `rtIva`,`bdclick2`.`bdpedido`.`rtIca` AS `rtIca`,`bdclick2`.`bdpedido`.`rtFuente` AS `rtFuente`,`bdclick2`.`bdpedido`.`otros` AS `otros`,`bdclick2`.`bdpedido`.`observacion` AS `observacion`,`bdclick2`.`bdpedido`.`anulada1` AS `anulada1`,`bdclick2`.`bdpedido`.`anula1` AS `anula1`,`bdclick2`.`bdpedido`.`credito1` AS `credito1`,`bdclick2`.`bdpedido`.`cxc1` AS `cxc1`,`bdclick2`.`bdpedido`.`usuario1` AS `usuario1`,`bdclick2`.`bdpedido`.`fechaAlerta` AS `fechaAlerta`,`bdclick2`.`bdpedido`.`terminal` AS `terminal`,`bdclick2`.`bdpedido`.`estadoGeneral` AS `estadoGeneral`,`bdclick2`.`bdpedido`.`estado2` AS `estado2`,`bdclick2`.`bdpedido`.`devuelta` AS `devuelta`,`bdclick2`.`bdpedido`.`factura` AS `factura`,`bdclick2`.`bdpedido`.`resolucion` AS `resolucion`,`bdclick2`.`bdpedido`.`fechaAnulacion` AS `fechaAnulacion`,`bdclick2`.`bdpedido`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick2`.`bdpedido`.`usuarioAnula` AS `usuarioAnula`,`bdclick2`.`bdpedido`.`copago` AS `copago`,`bdclick2`.`bdpedido`.`placa` AS `placa`,`bdclick2`.`bdpedido`.`garantia` AS `garantia`,`bdclick2`.`bdpedido`.`diasGarantia` AS `diasGarantia`,`bdclick2`.`bdpedido`.`rango` AS `rango`,`bdclick2`.`bdpedido`.`terminos` AS `terminos`,`bdclick2`.`bdpedido`.`notaAnulacion` AS `notaAnulacion`,`bdclick2`.`bdpedido`.`conseMesa` AS `conseMesa`,`bdclick2`.`bdpedido`.`producto` AS `producto`,`bdclick2`.`bdpedido`.`lista` AS `lista`,`bdclick2`.`bdpedido`.`cantidad` AS `cantidad`,`bdclick2`.`bdpedido`.`descuento` AS `descuento`,`bdclick2`.`bdpedido`.`total` AS `total`,`bdclick2`.`bdpedido`.`idProd` AS `idProd`,`bdclick2`.`bdpedido`.`iva` AS `iva`,`bdclick2`.`bdpedido`.`subtotal` AS `subtotal`,`bdclick2`.`bdpedido`.`NC` AS `NC`,`bdclick2`.`bdpedido`.`utilidad` AS `utilidad`,`bdclick2`.`bdpedido`.`concepto` AS `concepto`,`bdclick2`.`bdpedido`.`porcDescuento` AS `porcDescuento`,`bdclick2`.`bdpedido`.`descripcion` AS `descripcion`,`bdclick2`.`bdpedido`.`plu` AS `plu`,`bdclick2`.`bdpedido`.`cant2` AS `cant2`,`bdclick2`.`bdpedido`.`estado` AS `estado`,`bdclick2`.`bdpedido`.`porcIva` AS `porcIva`,`bdclick2`.`bdpedido`.`tercero` AS `tercero`,`bdclick2`.`bdpedido`.`utilidad1` AS `utilidad1`,`bdclick2`.`bdpedido`.`garantia` AS `nombre`,`bdclick2`.`bdpedido`.`bodega` AS `bodega`,`bdclick2`.`bdterceros`.`telefono` AS `telefono`,`bdclick2`.`bdterceros`.`direccion` AS `direccion`,`bdclick2`.`bdterceros`.`id` AS `IdTercero`,`bdclick2`.`bdpedido`.`factura` AS `id2`,`bdclick2`.`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdclick2`.`bdproductos`.`referencia` AS `referencia`,`bdclick2`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick2`.`bdpedido`.`preparacion` AS `preparacion` from ((`bdclick2`.`bdpedido` join `bdclick2`.`bdproductos` on((`bdclick2`.`bdpedido`.`producto` = `bdclick2`.`bdproductos`.`idSistema`))) left join `bdclick2`.`bdterceros` on((`bdclick2`.`bdpedido`.`cliente` = `bdclick2`.`bdterceros`.`idSistema`))) order by cast(substr(`bdclick2`.`bdpedido`.`idFactura`,8,100) as signed)
md5=aacc5ad40cc03c1ae61570de9599dc4d
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:46
create-version=2
source=select `bdpedido`.`idFactura` AS `idFactura`,cast(substr(`bdpedido`.`idFactura`,8,100) as signed) AS `ordenId`,`bdpedido`.`cliente` AS `cliente`,`bdpedido`.`vendedor` AS `vendedor`,`bdpedido`.`red` AS `red`,`bdpedido`.`fechaFactura` AS `fechaFactura`,`bdpedido`.`fechaVencimiento` AS `fechaVencimiento`,`bdpedido`.`efectivoGeneral` AS `efectivoGeneral`,`bdpedido`.`ncGeneral` AS `ncGeneral`,`bdpedido`.`chequeGeneral` AS `chequeGeneral`,`bdpedido`.`targetaGeneral` AS `targetaGeneral`,`bdpedido`.`totalGeneral` AS `totalGeneral`,`bdpedido`.`descuentoGeneral` AS `descuentoGeneral`,`bdpedido`.`ivaGeneral` AS `ivaGeneral`,`bdpedido`.`subtotalGeneral` AS `subtotalGeneral`,`bdpedido`.`comprobante` AS `comprobante`,`bdpedido`.`cotizacion` AS `cotizacion`,`bdpedido`.`anulada` AS `anulada`,`bdpedido`.`anula` AS `anula`,`bdpedido`.`credito` AS `credito`,`bdpedido`.`cxc` AS `cxc`,`bdpedido`.`usuario` AS `usuario`,`bdpedido`.`rtIva` AS `rtIva`,`bdpedido`.`rtIca` AS `rtIca`,`bdpedido`.`rtFuente` AS `rtFuente`,`bdpedido`.`otros` AS `otros`,`bdpedido`.`observacion` AS `observacion`,`bdpedido`.`anulada1` AS `anulada1`,`bdpedido`.`anula1` AS `anula1`,`bdpedido`.`credito1` AS `credito1`,`bdpedido`.`cxc1` AS `cxc1`,`bdpedido`.`usuario1` AS `usuario1`,`bdpedido`.`fechaAlerta` AS `fechaAlerta`,`bdpedido`.`terminal` AS `terminal`,`bdpedido`.`estadoGeneral` AS `estadoGeneral`,`bdpedido`.`estado2` AS `estado2`,`bdpedido`.`devuelta` AS `devuelta`,`bdpedido`.`factura` AS `factura`,`bdpedido`.`resolucion` AS `resolucion`,`bdpedido`.`fechaAnulacion` AS `fechaAnulacion`,`bdpedido`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdpedido`.`usuarioAnula` AS `usuarioAnula`,`bdpedido`.`copago` AS `copago`,`bdpedido`.`placa` AS `placa`,`bdpedido`.`garantia` AS `garantia`,`bdpedido`.`diasGarantia` AS `diasGarantia`,`bdpedido`.`rango` AS `rango`,`bdpedido`.`terminos` AS `terminos`,`bdpedido`.`notaAnulacion` AS `notaAnulacion`,`bdpedido`.`conseMesa` AS `conseMesa`,`bdpedido`.`producto` AS `producto`,`bdpedido`.`lista` AS `lista`,`bdpedido`.`cantidad` AS `cantidad`,`bdpedido`.`descuento` AS `descuento`,`bdpedido`.`total` AS `total`,`bdpedido`.`idProd` AS `idProd`,`bdpedido`.`iva` AS `iva`,`bdpedido`.`subtotal` AS `subtotal`,`bdpedido`.`NC` AS `NC`,`bdpedido`.`utilidad` AS `utilidad`,`bdpedido`.`concepto` AS `concepto`,`bdpedido`.`porcDescuento` AS `porcDescuento`,`bdpedido`.`descripcion` AS `descripcion`,`bdpedido`.`plu` AS `plu`,`bdpedido`.`cant2` AS `cant2`,`bdpedido`.`estado` AS `estado`,`bdpedido`.`porcIva` AS `porcIva`,`bdpedido`.`tercero` AS `tercero`,`bdpedido`.`utilidad1` AS `utilidad1`,`bdpedido`.`garantia` AS `nombre`,`bdpedido`.`bodega` AS `bodega`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`id` AS `IdTercero`,`bdpedido`.`factura` AS `id2`,`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdproductos`.`referencia` AS `referencia`,`bdproductos`.`Codigo` AS `Codigo`,`bdpedido`.`preparacion` AS `preparacion` from ((`bdpedido` join `bdproductos` on((`bdpedido`.`producto` = `bdproductos`.`idSistema`))) left join `bdterceros` on((`bdpedido`.`cliente` = `bdterceros`.`idSistema`))) order by cast(substr(`bdpedido`.`idFactura`,8,100) as signed)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdpedido`.`idFactura` AS `idFactura`,cast(substr(`bdclick2`.`bdpedido`.`idFactura`,8,100) as signed) AS `ordenId`,`bdclick2`.`bdpedido`.`cliente` AS `cliente`,`bdclick2`.`bdpedido`.`vendedor` AS `vendedor`,`bdclick2`.`bdpedido`.`red` AS `red`,`bdclick2`.`bdpedido`.`fechaFactura` AS `fechaFactura`,`bdclick2`.`bdpedido`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick2`.`bdpedido`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick2`.`bdpedido`.`ncGeneral` AS `ncGeneral`,`bdclick2`.`bdpedido`.`chequeGeneral` AS `chequeGeneral`,`bdclick2`.`bdpedido`.`targetaGeneral` AS `targetaGeneral`,`bdclick2`.`bdpedido`.`totalGeneral` AS `totalGeneral`,`bdclick2`.`bdpedido`.`descuentoGeneral` AS `descuentoGeneral`,`bdclick2`.`bdpedido`.`ivaGeneral` AS `ivaGeneral`,`bdclick2`.`bdpedido`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick2`.`bdpedido`.`comprobante` AS `comprobante`,`bdclick2`.`bdpedido`.`cotizacion` AS `cotizacion`,`bdclick2`.`bdpedido`.`anulada` AS `anulada`,`bdclick2`.`bdpedido`.`anula` AS `anula`,`bdclick2`.`bdpedido`.`credito` AS `credito`,`bdclick2`.`bdpedido`.`cxc` AS `cxc`,`bdclick2`.`bdpedido`.`usuario` AS `usuario`,`bdclick2`.`bdpedido`.`rtIva` AS `rtIva`,`bdclick2`.`bdpedido`.`rtIca` AS `rtIca`,`bdclick2`.`bdpedido`.`rtFuente` AS `rtFuente`,`bdclick2`.`bdpedido`.`otros` AS `otros`,`bdclick2`.`bdpedido`.`observacion` AS `observacion`,`bdclick2`.`bdpedido`.`anulada1` AS `anulada1`,`bdclick2`.`bdpedido`.`anula1` AS `anula1`,`bdclick2`.`bdpedido`.`credito1` AS `credito1`,`bdclick2`.`bdpedido`.`cxc1` AS `cxc1`,`bdclick2`.`bdpedido`.`usuario1` AS `usuario1`,`bdclick2`.`bdpedido`.`fechaAlerta` AS `fechaAlerta`,`bdclick2`.`bdpedido`.`terminal` AS `terminal`,`bdclick2`.`bdpedido`.`estadoGeneral` AS `estadoGeneral`,`bdclick2`.`bdpedido`.`estado2` AS `estado2`,`bdclick2`.`bdpedido`.`devuelta` AS `devuelta`,`bdclick2`.`bdpedido`.`factura` AS `factura`,`bdclick2`.`bdpedido`.`resolucion` AS `resolucion`,`bdclick2`.`bdpedido`.`fechaAnulacion` AS `fechaAnulacion`,`bdclick2`.`bdpedido`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick2`.`bdpedido`.`usuarioAnula` AS `usuarioAnula`,`bdclick2`.`bdpedido`.`copago` AS `copago`,`bdclick2`.`bdpedido`.`placa` AS `placa`,`bdclick2`.`bdpedido`.`garantia` AS `garantia`,`bdclick2`.`bdpedido`.`diasGarantia` AS `diasGarantia`,`bdclick2`.`bdpedido`.`rango` AS `rango`,`bdclick2`.`bdpedido`.`terminos` AS `terminos`,`bdclick2`.`bdpedido`.`notaAnulacion` AS `notaAnulacion`,`bdclick2`.`bdpedido`.`conseMesa` AS `conseMesa`,`bdclick2`.`bdpedido`.`producto` AS `producto`,`bdclick2`.`bdpedido`.`lista` AS `lista`,`bdclick2`.`bdpedido`.`cantidad` AS `cantidad`,`bdclick2`.`bdpedido`.`descuento` AS `descuento`,`bdclick2`.`bdpedido`.`total` AS `total`,`bdclick2`.`bdpedido`.`idProd` AS `idProd`,`bdclick2`.`bdpedido`.`iva` AS `iva`,`bdclick2`.`bdpedido`.`subtotal` AS `subtotal`,`bdclick2`.`bdpedido`.`NC` AS `NC`,`bdclick2`.`bdpedido`.`utilidad` AS `utilidad`,`bdclick2`.`bdpedido`.`concepto` AS `concepto`,`bdclick2`.`bdpedido`.`porcDescuento` AS `porcDescuento`,`bdclick2`.`bdpedido`.`descripcion` AS `descripcion`,`bdclick2`.`bdpedido`.`plu` AS `plu`,`bdclick2`.`bdpedido`.`cant2` AS `cant2`,`bdclick2`.`bdpedido`.`estado` AS `estado`,`bdclick2`.`bdpedido`.`porcIva` AS `porcIva`,`bdclick2`.`bdpedido`.`tercero` AS `tercero`,`bdclick2`.`bdpedido`.`utilidad1` AS `utilidad1`,`bdclick2`.`bdpedido`.`garantia` AS `nombre`,`bdclick2`.`bdpedido`.`bodega` AS `bodega`,`bdclick2`.`bdterceros`.`telefono` AS `telefono`,`bdclick2`.`bdterceros`.`direccion` AS `direccion`,`bdclick2`.`bdterceros`.`id` AS `IdTercero`,`bdclick2`.`bdpedido`.`factura` AS `id2`,`bdclick2`.`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdclick2`.`bdproductos`.`referencia` AS `referencia`,`bdclick2`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick2`.`bdpedido`.`preparacion` AS `preparacion` from ((`bdclick2`.`bdpedido` join `bdclick2`.`bdproductos` on((`bdclick2`.`bdpedido`.`producto` = `bdclick2`.`bdproductos`.`idSistema`))) left join `bdclick2`.`bdterceros` on((`bdclick2`.`bdpedido`.`cliente` = `bdclick2`.`bdterceros`.`idSistema`))) order by cast(substr(`bdclick2`.`bdpedido`.`idFactura`,8,100) as signed)
mariadb-version=100135
