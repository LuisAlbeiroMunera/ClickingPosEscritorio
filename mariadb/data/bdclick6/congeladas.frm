TYPE=VIEW
query=(select `bdclick6`.`bdcongelada`.`idFactura` AS `idFactura`,`bdclick6`.`bdcongelada`.`cliente` AS `cliente`,`bdclick6`.`bdcongelada`.`vendedor` AS `vendedor`,`bdclick6`.`bdcongelada`.`red` AS `red`,`bdclick6`.`bdcongelada`.`fechaFactura` AS `fechaFactura`,`bdclick6`.`bdcongelada`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick6`.`bdcongelada`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick6`.`bdcongelada`.`ncGeneral` AS `ncGeneral`,`bdclick6`.`bdcongelada`.`chequeGeneral` AS `chequeGeneral`,`bdclick6`.`bdcongelada`.`targetaGeneral` AS `targetaGeneral`,`bdclick6`.`bdcongelada`.`totalGeneral` AS `totalGeneral`,`bdclick6`.`bdcongelada`.`descuentoGeneral` AS `descuentoGeneral`,`bdclick6`.`bdcongelada`.`ivaGeneral` AS `ivaGeneral`,`bdclick6`.`bdcongelada`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick6`.`bdcongelada`.`comprobante` AS `comprobante`,`bdclick6`.`bdcongelada`.`cotizacion` AS `cotizacion`,`bdclick6`.`bdcongelada`.`anulada` AS `anulada`,`bdclick6`.`bdcongelada`.`anula` AS `anula`,`bdclick6`.`bdcongelada`.`credito` AS `credito`,`bdclick6`.`bdcongelada`.`cxc` AS `cxc`,`bdclick6`.`bdcongelada`.`usuario` AS `usuario`,`bdclick6`.`bdcongelada`.`rtIva` AS `rtIva`,`bdclick6`.`bdcongelada`.`rtIca` AS `rtIca`,`bdclick6`.`bdcongelada`.`rtFuente` AS `rtFuente`,`bdclick6`.`bdcongelada`.`otros` AS `otros`,`bdclick6`.`bdcongelada`.`observacion` AS `observacion`,`bdclick6`.`bdcongelada`.`anulada1` AS `anulada1`,`bdclick6`.`bdcongelada`.`anula1` AS `anula1`,`bdclick6`.`bdcongelada`.`credito1` AS `credito1`,`bdclick6`.`bdcongelada`.`cxc1` AS `cxc1`,`bdclick6`.`bdcongelada`.`usuario1` AS `usuario1`,`bdclick6`.`bdcongelada`.`fechaAlerta` AS `fechaAlerta`,`bdclick6`.`bdcongelada`.`terminal` AS `terminal`,`bdclick6`.`bdcongelada`.`estadoGeneral` AS `estadoGeneral`,`bdclick6`.`bdcongelada`.`estado2` AS `estado2`,`bdclick6`.`bdcongelada`.`devuelta` AS `devuelta`,`bdclick6`.`bdcongelada`.`factura` AS `factura`,`bdclick6`.`bdcongelada`.`resolucion` AS `resolucion`,`bdclick6`.`bdcongelada`.`fechaAnulacion` AS `fechaAnulacion`,`bdclick6`.`bdcongelada`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick6`.`bdcongelada`.`usuarioAnula` AS `usuarioAnula`,`bdclick6`.`bdcongelada`.`copago` AS `copago`,`bdclick6`.`bdcongelada`.`placa` AS `placa`,`bdclick6`.`bdcongelada`.`garantia` AS `garantia`,`bdclick6`.`bdcongelada`.`diasGarantia` AS `diasGarantia`,`bdclick6`.`bdcongelada`.`rango` AS `rango`,`bdclick6`.`bdcongelada`.`terminos` AS `terminos`,`bdclick6`.`bdcongelada`.`notaAnulacion` AS `notaAnulacion`,`bdclick6`.`bdcongelada`.`conseMesa` AS `conseMesa`,`bdclick6`.`bdcongelada`.`producto` AS `producto`,`bdclick6`.`bdcongelada`.`lista` AS `lista`,`bdclick6`.`bdcongelada`.`cantidad` AS `cantidad`,`bdclick6`.`bdcongelada`.`descuento` AS `descuento`,`bdclick6`.`bdcongelada`.`total` AS `total`,`bdclick6`.`bdcongelada`.`iva` AS `iva`,`bdclick6`.`bdcongelada`.`subtotal` AS `subtotal`,`bdclick6`.`bdcongelada`.`NC` AS `NC`,`bdclick6`.`bdcongelada`.`utilidad` AS `utilidad`,`bdclick6`.`bdcongelada`.`concepto` AS `concepto`,`bdclick6`.`bdcongelada`.`porcDescuento` AS `porcDescuento`,`bdclick6`.`bdcongelada`.`descripcion` AS `descripcion`,`bdclick6`.`bdcongelada`.`plu` AS `plu`,`bdclick6`.`bdcongelada`.`cant2` AS `cant2`,`bdclick6`.`bdcongelada`.`estado` AS `estado`,`bdclick6`.`bdcongelada`.`porcIva` AS `porcIva`,`bdclick6`.`bdcongelada`.`tercero` AS `tercero`,`bdclick6`.`bdcongelada`.`utilidad1` AS `utilidad1`,`bdclick6`.`bdcongelada`.`preparacion` AS `preparacion`,`bdclick6`.`bdcongelada`.`bodega` AS `bodega`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,`bdclick6`.`bdterceros`.`id` AS `IdTercero` from (`bdclick6`.`bdcongelada` left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdcongelada`.`cliente` = `bdclick6`.`bdterceros`.`idSistema`))))
md5=23d3b9451e34184d9d75ee3948d205b6
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:33
create-version=2
source=(select `bdcongelada`.`idFactura` AS `idFactura`,`bdcongelada`.`cliente` AS `cliente`,`bdcongelada`.`vendedor` AS `vendedor`,`bdcongelada`.`red` AS `red`,`bdcongelada`.`fechaFactura` AS `fechaFactura`,`bdcongelada`.`fechaVencimiento` AS `fechaVencimiento`,`bdcongelada`.`efectivoGeneral` AS `efectivoGeneral`,`bdcongelada`.`ncGeneral` AS `ncGeneral`,`bdcongelada`.`chequeGeneral` AS `chequeGeneral`,`bdcongelada`.`targetaGeneral` AS `targetaGeneral`,`bdcongelada`.`totalGeneral` AS `totalGeneral`,`bdcongelada`.`descuentoGeneral` AS `descuentoGeneral`,`bdcongelada`.`ivaGeneral` AS `ivaGeneral`,`bdcongelada`.`subtotalGeneral` AS `subtotalGeneral`,`bdcongelada`.`comprobante` AS `comprobante`,`bdcongelada`.`cotizacion` AS `cotizacion`,`bdcongelada`.`anulada` AS `anulada`,`bdcongelada`.`anula` AS `anula`,`bdcongelada`.`credito` AS `credito`,`bdcongelada`.`cxc` AS `cxc`,`bdcongelada`.`usuario` AS `usuario`,`bdcongelada`.`rtIva` AS `rtIva`,`bdcongelada`.`rtIca` AS `rtIca`,`bdcongelada`.`rtFuente` AS `rtFuente`,`bdcongelada`.`otros` AS `otros`,`bdcongelada`.`observacion` AS `observacion`,`bdcongelada`.`anulada1` AS `anulada1`,`bdcongelada`.`anula1` AS `anula1`,`bdcongelada`.`credito1` AS `credito1`,`bdcongelada`.`cxc1` AS `cxc1`,`bdcongelada`.`usuario1` AS `usuario1`,`bdcongelada`.`fechaAlerta` AS `fechaAlerta`,`bdcongelada`.`terminal` AS `terminal`,`bdcongelada`.`estadoGeneral` AS `estadoGeneral`,`bdcongelada`.`estado2` AS `estado2`,`bdcongelada`.`devuelta` AS `devuelta`,`bdcongelada`.`factura` AS `factura`,`bdcongelada`.`resolucion` AS `resolucion`,`bdcongelada`.`fechaAnulacion` AS `fechaAnulacion`,`bdcongelada`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdcongelada`.`usuarioAnula` AS `usuarioAnula`,`bdcongelada`.`copago` AS `copago`,`bdcongelada`.`placa` AS `placa`,`bdcongelada`.`garantia` AS `garantia`,`bdcongelada`.`diasGarantia` AS `diasGarantia`,`bdcongelada`.`rango` AS `rango`,`bdcongelada`.`terminos` AS `terminos`,`bdcongelada`.`notaAnulacion` AS `notaAnulacion`,`bdcongelada`.`conseMesa` AS `conseMesa`,`bdcongelada`.`producto` AS `producto`,`bdcongelada`.`lista` AS `lista`,`bdcongelada`.`cantidad` AS `cantidad`,`bdcongelada`.`descuento` AS `descuento`,`bdcongelada`.`total` AS `total`,`bdcongelada`.`iva` AS `iva`,`bdcongelada`.`subtotal` AS `subtotal`,`bdcongelada`.`NC` AS `NC`,`bdcongelada`.`utilidad` AS `utilidad`,`bdcongelada`.`concepto` AS `concepto`,`bdcongelada`.`porcDescuento` AS `porcDescuento`,`bdcongelada`.`descripcion` AS `descripcion`,`bdcongelada`.`plu` AS `plu`,`bdcongelada`.`cant2` AS `cant2`,`bdcongelada`.`estado` AS `estado`,`bdcongelada`.`porcIva` AS `porcIva`,`bdcongelada`.`tercero` AS `tercero`,`bdcongelada`.`utilidad1` AS `utilidad1`,`bdcongelada`.`preparacion` AS `preparacion`,`bdcongelada`.`bodega` AS `bodega`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`id` AS `IdTercero` from (`bdcongelada` left join `bdterceros` on((`bdcongelada`.`cliente` = `bdterceros`.`idSistema`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bdcongelada`.`idFactura` AS `idFactura`,`bdclick6`.`bdcongelada`.`cliente` AS `cliente`,`bdclick6`.`bdcongelada`.`vendedor` AS `vendedor`,`bdclick6`.`bdcongelada`.`red` AS `red`,`bdclick6`.`bdcongelada`.`fechaFactura` AS `fechaFactura`,`bdclick6`.`bdcongelada`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick6`.`bdcongelada`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick6`.`bdcongelada`.`ncGeneral` AS `ncGeneral`,`bdclick6`.`bdcongelada`.`chequeGeneral` AS `chequeGeneral`,`bdclick6`.`bdcongelada`.`targetaGeneral` AS `targetaGeneral`,`bdclick6`.`bdcongelada`.`totalGeneral` AS `totalGeneral`,`bdclick6`.`bdcongelada`.`descuentoGeneral` AS `descuentoGeneral`,`bdclick6`.`bdcongelada`.`ivaGeneral` AS `ivaGeneral`,`bdclick6`.`bdcongelada`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick6`.`bdcongelada`.`comprobante` AS `comprobante`,`bdclick6`.`bdcongelada`.`cotizacion` AS `cotizacion`,`bdclick6`.`bdcongelada`.`anulada` AS `anulada`,`bdclick6`.`bdcongelada`.`anula` AS `anula`,`bdclick6`.`bdcongelada`.`credito` AS `credito`,`bdclick6`.`bdcongelada`.`cxc` AS `cxc`,`bdclick6`.`bdcongelada`.`usuario` AS `usuario`,`bdclick6`.`bdcongelada`.`rtIva` AS `rtIva`,`bdclick6`.`bdcongelada`.`rtIca` AS `rtIca`,`bdclick6`.`bdcongelada`.`rtFuente` AS `rtFuente`,`bdclick6`.`bdcongelada`.`otros` AS `otros`,`bdclick6`.`bdcongelada`.`observacion` AS `observacion`,`bdclick6`.`bdcongelada`.`anulada1` AS `anulada1`,`bdclick6`.`bdcongelada`.`anula1` AS `anula1`,`bdclick6`.`bdcongelada`.`credito1` AS `credito1`,`bdclick6`.`bdcongelada`.`cxc1` AS `cxc1`,`bdclick6`.`bdcongelada`.`usuario1` AS `usuario1`,`bdclick6`.`bdcongelada`.`fechaAlerta` AS `fechaAlerta`,`bdclick6`.`bdcongelada`.`terminal` AS `terminal`,`bdclick6`.`bdcongelada`.`estadoGeneral` AS `estadoGeneral`,`bdclick6`.`bdcongelada`.`estado2` AS `estado2`,`bdclick6`.`bdcongelada`.`devuelta` AS `devuelta`,`bdclick6`.`bdcongelada`.`factura` AS `factura`,`bdclick6`.`bdcongelada`.`resolucion` AS `resolucion`,`bdclick6`.`bdcongelada`.`fechaAnulacion` AS `fechaAnulacion`,`bdclick6`.`bdcongelada`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick6`.`bdcongelada`.`usuarioAnula` AS `usuarioAnula`,`bdclick6`.`bdcongelada`.`copago` AS `copago`,`bdclick6`.`bdcongelada`.`placa` AS `placa`,`bdclick6`.`bdcongelada`.`garantia` AS `garantia`,`bdclick6`.`bdcongelada`.`diasGarantia` AS `diasGarantia`,`bdclick6`.`bdcongelada`.`rango` AS `rango`,`bdclick6`.`bdcongelada`.`terminos` AS `terminos`,`bdclick6`.`bdcongelada`.`notaAnulacion` AS `notaAnulacion`,`bdclick6`.`bdcongelada`.`conseMesa` AS `conseMesa`,`bdclick6`.`bdcongelada`.`producto` AS `producto`,`bdclick6`.`bdcongelada`.`lista` AS `lista`,`bdclick6`.`bdcongelada`.`cantidad` AS `cantidad`,`bdclick6`.`bdcongelada`.`descuento` AS `descuento`,`bdclick6`.`bdcongelada`.`total` AS `total`,`bdclick6`.`bdcongelada`.`iva` AS `iva`,`bdclick6`.`bdcongelada`.`subtotal` AS `subtotal`,`bdclick6`.`bdcongelada`.`NC` AS `NC`,`bdclick6`.`bdcongelada`.`utilidad` AS `utilidad`,`bdclick6`.`bdcongelada`.`concepto` AS `concepto`,`bdclick6`.`bdcongelada`.`porcDescuento` AS `porcDescuento`,`bdclick6`.`bdcongelada`.`descripcion` AS `descripcion`,`bdclick6`.`bdcongelada`.`plu` AS `plu`,`bdclick6`.`bdcongelada`.`cant2` AS `cant2`,`bdclick6`.`bdcongelada`.`estado` AS `estado`,`bdclick6`.`bdcongelada`.`porcIva` AS `porcIva`,`bdclick6`.`bdcongelada`.`tercero` AS `tercero`,`bdclick6`.`bdcongelada`.`utilidad1` AS `utilidad1`,`bdclick6`.`bdcongelada`.`preparacion` AS `preparacion`,`bdclick6`.`bdcongelada`.`bodega` AS `bodega`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,`bdclick6`.`bdterceros`.`id` AS `IdTercero` from (`bdclick6`.`bdcongelada` left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdcongelada`.`cliente` = `bdclick6`.`bdterceros`.`idSistema`))))
mariadb-version=100135
