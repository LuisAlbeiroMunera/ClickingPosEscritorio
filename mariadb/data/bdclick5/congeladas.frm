TYPE=VIEW
query=(select `bdclick5`.`bdcongelada`.`idFactura` AS `idFactura`,`bdclick5`.`bdcongelada`.`cliente` AS `cliente`,`bdclick5`.`bdcongelada`.`vendedor` AS `vendedor`,`bdclick5`.`bdcongelada`.`red` AS `red`,`bdclick5`.`bdcongelada`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`bdcongelada`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick5`.`bdcongelada`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick5`.`bdcongelada`.`ncGeneral` AS `ncGeneral`,`bdclick5`.`bdcongelada`.`chequeGeneral` AS `chequeGeneral`,`bdclick5`.`bdcongelada`.`targetaGeneral` AS `targetaGeneral`,`bdclick5`.`bdcongelada`.`totalGeneral` AS `totalGeneral`,`bdclick5`.`bdcongelada`.`descuentoGeneral` AS `descuentoGeneral`,`bdclick5`.`bdcongelada`.`ivaGeneral` AS `ivaGeneral`,`bdclick5`.`bdcongelada`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick5`.`bdcongelada`.`comprobante` AS `comprobante`,`bdclick5`.`bdcongelada`.`cotizacion` AS `cotizacion`,`bdclick5`.`bdcongelada`.`anulada` AS `anulada`,`bdclick5`.`bdcongelada`.`anula` AS `anula`,`bdclick5`.`bdcongelada`.`credito` AS `credito`,`bdclick5`.`bdcongelada`.`cxc` AS `cxc`,`bdclick5`.`bdcongelada`.`usuario` AS `usuario`,`bdclick5`.`bdcongelada`.`rtIva` AS `rtIva`,`bdclick5`.`bdcongelada`.`rtIca` AS `rtIca`,`bdclick5`.`bdcongelada`.`rtFuente` AS `rtFuente`,`bdclick5`.`bdcongelada`.`otros` AS `otros`,`bdclick5`.`bdcongelada`.`observacion` AS `observacion`,`bdclick5`.`bdcongelada`.`anulada1` AS `anulada1`,`bdclick5`.`bdcongelada`.`anula1` AS `anula1`,`bdclick5`.`bdcongelada`.`credito1` AS `credito1`,`bdclick5`.`bdcongelada`.`cxc1` AS `cxc1`,`bdclick5`.`bdcongelada`.`usuario1` AS `usuario1`,`bdclick5`.`bdcongelada`.`fechaAlerta` AS `fechaAlerta`,`bdclick5`.`bdcongelada`.`terminal` AS `terminal`,`bdclick5`.`bdcongelada`.`estadoGeneral` AS `estadoGeneral`,`bdclick5`.`bdcongelada`.`estado2` AS `estado2`,`bdclick5`.`bdcongelada`.`devuelta` AS `devuelta`,`bdclick5`.`bdcongelada`.`factura` AS `factura`,`bdclick5`.`bdcongelada`.`resolucion` AS `resolucion`,`bdclick5`.`bdcongelada`.`fechaAnulacion` AS `fechaAnulacion`,`bdclick5`.`bdcongelada`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick5`.`bdcongelada`.`usuarioAnula` AS `usuarioAnula`,`bdclick5`.`bdcongelada`.`copago` AS `copago`,`bdclick5`.`bdcongelada`.`placa` AS `placa`,`bdclick5`.`bdcongelada`.`garantia` AS `garantia`,`bdclick5`.`bdcongelada`.`diasGarantia` AS `diasGarantia`,`bdclick5`.`bdcongelada`.`rango` AS `rango`,`bdclick5`.`bdcongelada`.`terminos` AS `terminos`,`bdclick5`.`bdcongelada`.`notaAnulacion` AS `notaAnulacion`,`bdclick5`.`bdcongelada`.`conseMesa` AS `conseMesa`,`bdclick5`.`bdcongelada`.`producto` AS `producto`,`bdclick5`.`bdcongelada`.`lista` AS `lista`,`bdclick5`.`bdcongelada`.`cantidad` AS `cantidad`,`bdclick5`.`bdcongelada`.`descuento` AS `descuento`,`bdclick5`.`bdcongelada`.`total` AS `total`,`bdclick5`.`bdcongelada`.`iva` AS `iva`,`bdclick5`.`bdcongelada`.`subtotal` AS `subtotal`,`bdclick5`.`bdcongelada`.`NC` AS `NC`,`bdclick5`.`bdcongelada`.`utilidad` AS `utilidad`,`bdclick5`.`bdcongelada`.`concepto` AS `concepto`,`bdclick5`.`bdcongelada`.`porcDescuento` AS `porcDescuento`,`bdclick5`.`bdcongelada`.`descripcion` AS `descripcion`,`bdclick5`.`bdcongelada`.`plu` AS `plu`,`bdclick5`.`bdcongelada`.`cant2` AS `cant2`,`bdclick5`.`bdcongelada`.`estado` AS `estado`,`bdclick5`.`bdcongelada`.`porcIva` AS `porcIva`,`bdclick5`.`bdcongelada`.`tercero` AS `tercero`,`bdclick5`.`bdcongelada`.`utilidad1` AS `utilidad1`,`bdclick5`.`bdcongelada`.`preparacion` AS `preparacion`,`bdclick5`.`bdcongelada`.`bodega` AS `bodega`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdterceros`.`telefono` AS `telefono`,`bdclick5`.`bdterceros`.`id` AS `IdTercero` from (`bdclick5`.`bdcongelada` left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdcongelada`.`cliente` = `bdclick5`.`bdterceros`.`idSistema`))))
md5=456ec29ce2af80ec1975f385c52696dc
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:45
create-version=2
source=(select `bdcongelada`.`idFactura` AS `idFactura`,`bdcongelada`.`cliente` AS `cliente`,`bdcongelada`.`vendedor` AS `vendedor`,`bdcongelada`.`red` AS `red`,`bdcongelada`.`fechaFactura` AS `fechaFactura`,`bdcongelada`.`fechaVencimiento` AS `fechaVencimiento`,`bdcongelada`.`efectivoGeneral` AS `efectivoGeneral`,`bdcongelada`.`ncGeneral` AS `ncGeneral`,`bdcongelada`.`chequeGeneral` AS `chequeGeneral`,`bdcongelada`.`targetaGeneral` AS `targetaGeneral`,`bdcongelada`.`totalGeneral` AS `totalGeneral`,`bdcongelada`.`descuentoGeneral` AS `descuentoGeneral`,`bdcongelada`.`ivaGeneral` AS `ivaGeneral`,`bdcongelada`.`subtotalGeneral` AS `subtotalGeneral`,`bdcongelada`.`comprobante` AS `comprobante`,`bdcongelada`.`cotizacion` AS `cotizacion`,`bdcongelada`.`anulada` AS `anulada`,`bdcongelada`.`anula` AS `anula`,`bdcongelada`.`credito` AS `credito`,`bdcongelada`.`cxc` AS `cxc`,`bdcongelada`.`usuario` AS `usuario`,`bdcongelada`.`rtIva` AS `rtIva`,`bdcongelada`.`rtIca` AS `rtIca`,`bdcongelada`.`rtFuente` AS `rtFuente`,`bdcongelada`.`otros` AS `otros`,`bdcongelada`.`observacion` AS `observacion`,`bdcongelada`.`anulada1` AS `anulada1`,`bdcongelada`.`anula1` AS `anula1`,`bdcongelada`.`credito1` AS `credito1`,`bdcongelada`.`cxc1` AS `cxc1`,`bdcongelada`.`usuario1` AS `usuario1`,`bdcongelada`.`fechaAlerta` AS `fechaAlerta`,`bdcongelada`.`terminal` AS `terminal`,`bdcongelada`.`estadoGeneral` AS `estadoGeneral`,`bdcongelada`.`estado2` AS `estado2`,`bdcongelada`.`devuelta` AS `devuelta`,`bdcongelada`.`factura` AS `factura`,`bdcongelada`.`resolucion` AS `resolucion`,`bdcongelada`.`fechaAnulacion` AS `fechaAnulacion`,`bdcongelada`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdcongelada`.`usuarioAnula` AS `usuarioAnula`,`bdcongelada`.`copago` AS `copago`,`bdcongelada`.`placa` AS `placa`,`bdcongelada`.`garantia` AS `garantia`,`bdcongelada`.`diasGarantia` AS `diasGarantia`,`bdcongelada`.`rango` AS `rango`,`bdcongelada`.`terminos` AS `terminos`,`bdcongelada`.`notaAnulacion` AS `notaAnulacion`,`bdcongelada`.`conseMesa` AS `conseMesa`,`bdcongelada`.`producto` AS `producto`,`bdcongelada`.`lista` AS `lista`,`bdcongelada`.`cantidad` AS `cantidad`,`bdcongelada`.`descuento` AS `descuento`,`bdcongelada`.`total` AS `total`,`bdcongelada`.`iva` AS `iva`,`bdcongelada`.`subtotal` AS `subtotal`,`bdcongelada`.`NC` AS `NC`,`bdcongelada`.`utilidad` AS `utilidad`,`bdcongelada`.`concepto` AS `concepto`,`bdcongelada`.`porcDescuento` AS `porcDescuento`,`bdcongelada`.`descripcion` AS `descripcion`,`bdcongelada`.`plu` AS `plu`,`bdcongelada`.`cant2` AS `cant2`,`bdcongelada`.`estado` AS `estado`,`bdcongelada`.`porcIva` AS `porcIva`,`bdcongelada`.`tercero` AS `tercero`,`bdcongelada`.`utilidad1` AS `utilidad1`,`bdcongelada`.`preparacion` AS `preparacion`,`bdcongelada`.`bodega` AS `bodega`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`id` AS `IdTercero` from (`bdcongelada` left join `bdterceros` on((`bdcongelada`.`cliente` = `bdterceros`.`idSistema`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`bdcongelada`.`idFactura` AS `idFactura`,`bdclick5`.`bdcongelada`.`cliente` AS `cliente`,`bdclick5`.`bdcongelada`.`vendedor` AS `vendedor`,`bdclick5`.`bdcongelada`.`red` AS `red`,`bdclick5`.`bdcongelada`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`bdcongelada`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick5`.`bdcongelada`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick5`.`bdcongelada`.`ncGeneral` AS `ncGeneral`,`bdclick5`.`bdcongelada`.`chequeGeneral` AS `chequeGeneral`,`bdclick5`.`bdcongelada`.`targetaGeneral` AS `targetaGeneral`,`bdclick5`.`bdcongelada`.`totalGeneral` AS `totalGeneral`,`bdclick5`.`bdcongelada`.`descuentoGeneral` AS `descuentoGeneral`,`bdclick5`.`bdcongelada`.`ivaGeneral` AS `ivaGeneral`,`bdclick5`.`bdcongelada`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick5`.`bdcongelada`.`comprobante` AS `comprobante`,`bdclick5`.`bdcongelada`.`cotizacion` AS `cotizacion`,`bdclick5`.`bdcongelada`.`anulada` AS `anulada`,`bdclick5`.`bdcongelada`.`anula` AS `anula`,`bdclick5`.`bdcongelada`.`credito` AS `credito`,`bdclick5`.`bdcongelada`.`cxc` AS `cxc`,`bdclick5`.`bdcongelada`.`usuario` AS `usuario`,`bdclick5`.`bdcongelada`.`rtIva` AS `rtIva`,`bdclick5`.`bdcongelada`.`rtIca` AS `rtIca`,`bdclick5`.`bdcongelada`.`rtFuente` AS `rtFuente`,`bdclick5`.`bdcongelada`.`otros` AS `otros`,`bdclick5`.`bdcongelada`.`observacion` AS `observacion`,`bdclick5`.`bdcongelada`.`anulada1` AS `anulada1`,`bdclick5`.`bdcongelada`.`anula1` AS `anula1`,`bdclick5`.`bdcongelada`.`credito1` AS `credito1`,`bdclick5`.`bdcongelada`.`cxc1` AS `cxc1`,`bdclick5`.`bdcongelada`.`usuario1` AS `usuario1`,`bdclick5`.`bdcongelada`.`fechaAlerta` AS `fechaAlerta`,`bdclick5`.`bdcongelada`.`terminal` AS `terminal`,`bdclick5`.`bdcongelada`.`estadoGeneral` AS `estadoGeneral`,`bdclick5`.`bdcongelada`.`estado2` AS `estado2`,`bdclick5`.`bdcongelada`.`devuelta` AS `devuelta`,`bdclick5`.`bdcongelada`.`factura` AS `factura`,`bdclick5`.`bdcongelada`.`resolucion` AS `resolucion`,`bdclick5`.`bdcongelada`.`fechaAnulacion` AS `fechaAnulacion`,`bdclick5`.`bdcongelada`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick5`.`bdcongelada`.`usuarioAnula` AS `usuarioAnula`,`bdclick5`.`bdcongelada`.`copago` AS `copago`,`bdclick5`.`bdcongelada`.`placa` AS `placa`,`bdclick5`.`bdcongelada`.`garantia` AS `garantia`,`bdclick5`.`bdcongelada`.`diasGarantia` AS `diasGarantia`,`bdclick5`.`bdcongelada`.`rango` AS `rango`,`bdclick5`.`bdcongelada`.`terminos` AS `terminos`,`bdclick5`.`bdcongelada`.`notaAnulacion` AS `notaAnulacion`,`bdclick5`.`bdcongelada`.`conseMesa` AS `conseMesa`,`bdclick5`.`bdcongelada`.`producto` AS `producto`,`bdclick5`.`bdcongelada`.`lista` AS `lista`,`bdclick5`.`bdcongelada`.`cantidad` AS `cantidad`,`bdclick5`.`bdcongelada`.`descuento` AS `descuento`,`bdclick5`.`bdcongelada`.`total` AS `total`,`bdclick5`.`bdcongelada`.`iva` AS `iva`,`bdclick5`.`bdcongelada`.`subtotal` AS `subtotal`,`bdclick5`.`bdcongelada`.`NC` AS `NC`,`bdclick5`.`bdcongelada`.`utilidad` AS `utilidad`,`bdclick5`.`bdcongelada`.`concepto` AS `concepto`,`bdclick5`.`bdcongelada`.`porcDescuento` AS `porcDescuento`,`bdclick5`.`bdcongelada`.`descripcion` AS `descripcion`,`bdclick5`.`bdcongelada`.`plu` AS `plu`,`bdclick5`.`bdcongelada`.`cant2` AS `cant2`,`bdclick5`.`bdcongelada`.`estado` AS `estado`,`bdclick5`.`bdcongelada`.`porcIva` AS `porcIva`,`bdclick5`.`bdcongelada`.`tercero` AS `tercero`,`bdclick5`.`bdcongelada`.`utilidad1` AS `utilidad1`,`bdclick5`.`bdcongelada`.`preparacion` AS `preparacion`,`bdclick5`.`bdcongelada`.`bodega` AS `bodega`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdterceros`.`telefono` AS `telefono`,`bdclick5`.`bdterceros`.`id` AS `IdTercero` from (`bdclick5`.`bdcongelada` left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdcongelada`.`cliente` = `bdclick5`.`bdterceros`.`idSistema`))))
mariadb-version=100135
