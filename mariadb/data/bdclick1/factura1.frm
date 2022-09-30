TYPE=VIEW
query=select `bdclick1`.`bdfactura`.`idFactura` AS `idFactura`,cast(substr(`bdclick1`.`bdfactura`.`idFactura`,6,100) as signed) AS `ordenId`,`bdclick1`.`bdterceros`.`id` AS `cliente`,`bdclick1`.`bdfactura`.`vendedor` AS `vendedor`,`bdclick1`.`bdfactura`.`red` AS `red`,`bdclick1`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick1`.`bdfactura`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick1`.`bdfactura`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick1`.`bdfactura`.`ncGeneral` AS `ncGeneral`,`bdclick1`.`bdfactura`.`chequeGeneral` AS `chequeGeneral`,`bdclick1`.`bdfactura`.`targetaGeneral` AS `targetaGeneral`,`bdclick1`.`bdfactura`.`totalGeneral` AS `totalGeneral`,`bdclick1`.`bdfactura`.`descuentoGeneral` AS `descuentoGeneral`,`bdclick1`.`bdfactura`.`ivaGeneral` AS `ivaGeneral`,`bdclick1`.`bdfactura`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick1`.`bdfactura`.`comprobante` AS `comprobante`,`bdclick1`.`bdfactura`.`cotizacion` AS `cotizacion`,`bdclick1`.`bdfactura`.`anulada` AS `anulada`,`bdclick1`.`bdfactura`.`anula` AS `anula`,`bdclick1`.`bdfactura`.`credito` AS `credito`,`bdclick1`.`bdfactura`.`cxc` AS `cxc`,`bdclick1`.`bdfactura`.`usuario` AS `usuario`,`bdclick1`.`bdfactura`.`rtIva` AS `rtIva`,`bdclick1`.`bdfactura`.`rtIca` AS `rtIca`,`bdclick1`.`bdfactura`.`rtFuente` AS `rtFuente`,`bdclick1`.`bdfactura`.`otros` AS `otros`,`bdclick1`.`bdfactura`.`observacion` AS `observacion`,`bdclick1`.`bdfactura`.`anulada1` AS `anulada1`,`bdclick1`.`bdfactura`.`anula1` AS `anula1`,`bdclick1`.`bdfactura`.`credito1` AS `credito1`,`bdclick1`.`bdfactura`.`cxc1` AS `cxc1`,`bdclick1`.`bdfactura`.`usuario1` AS `usuario1`,`bdclick1`.`bdfactura`.`fechaAlerta` AS `fechaAlerta`,`bdclick1`.`bdfactura`.`terminal` AS `terminal`,`bdclick1`.`bdfactura`.`estadoGeneral` AS `estadoGeneral`,`bdclick1`.`bdfactura`.`estado2` AS `estado2`,`bdclick1`.`bdfactura`.`devuelta` AS `devuelta`,`bdclick1`.`bdfactura`.`factura` AS `factura`,`bdclick1`.`bdfactura`.`resolucion` AS `resolucion`,`bdclick1`.`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,`bdclick1`.`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick1`.`bdfactura`.`usuarioAnula` AS `usuarioAnula`,`bdclick1`.`bdfactura`.`copago` AS `copago`,`bdclick1`.`bdfactura`.`garantia` AS `garantia`,`bdclick1`.`bdfactura`.`diasGarantia` AS `diasGarantia`,`bdclick1`.`bdfactura`.`rango` AS `rango`,`bdclick1`.`bdfactura`.`terminos` AS `terminos`,`bdclick1`.`bdfactura`.`notaAnulacion` AS `notaAnulacion`,`bdclick1`.`bdfactura`.`conseMesa` AS `conseMesa`,`bdclick1`.`bdfactura`.`producto` AS `producto`,`bdclick1`.`bdfactura`.`lista` AS `lista`,`bdclick1`.`bdfactura`.`cantidad` AS `cantidad`,`bdclick1`.`bdfactura`.`descuento` AS `descuento`,`bdclick1`.`bdfactura`.`total` AS `total`,`bdclick1`.`bdfactura`.`iva` AS `iva`,`bdclick1`.`bdfactura`.`subtotal` AS `subtotal`,`bdclick1`.`bdfactura`.`NC` AS `NC`,`bdclick1`.`bdfactura`.`utilidad` AS `utilidad`,`bdclick1`.`bdfactura`.`concepto` AS `concepto`,`bdclick1`.`bdfactura`.`porcDescuento` AS `porcDescuento`,`bdclick1`.`bdfactura`.`descripcion` AS `descripcion`,`bdclick1`.`bdfactura`.`plu` AS `plu`,`bdclick1`.`bdfactura`.`cant2` AS `cant2`,`bdclick1`.`bdfactura`.`estado` AS `estado`,`bdclick1`.`bdfactura`.`porcIva` AS `porcIva`,`bdclick1`.`bdfactura`.`tercero` AS `tercero`,`bdclick1`.`bdfactura`.`utilidad1` AS `utilidad1`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`bdclick1`.`bdterceros`.`telefono` AS `telefono`,`bdclick1`.`bdterceros`.`direccion` AS `direccion`,if(isnull(`bdclick1`.`bdprestamo`.`cuotaInicial`),0,`bdclick1`.`bdprestamo`.`cuotaInicial`) AS `cuotaInicial2`,`bdclick1`.`bdfactura`.`factura` AS `id2`,`bdclick1`.`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdclick1`.`bdproductos`.`referencia` AS `referencia`,`bdclick1`.`bdproductos`.`unidad` AS `unidad`,(`bdclick1`.`bdfactura`.`subtotalGeneral` - `bdclick1`.`bdfactura`.`descuentoGeneral`) AS `valor3`,if((`bdclick1`.`bdfactura`.`producto` = \'PROD-000000032\'),`bdclick1`.`bdfactura`.`impuesto`,\'0\') AS `impuesto`,`bdclick1`.`bdcxc`.`plazo` AS `plazo`,`bdclick1`.`bdterceros`.`nombreContacto` AS `nombreContacto`,`bdclick1`.`bdterceros`.`cargo` AS `cargo`,`bdclick1`.`bdfactura`.`turno` AS `turno`,`bdclick1`.`bdproductos`.`grupo` AS `Grupo`,`bdclick1`.`bdterceros`.`eps` AS `eps`,`bdclick1`.`bdepsprecargados`.`nombre` AS `nombreEps`,`bdclick1`.`bdfactura`.`Id` AS `Id`,`bdclick1`.`bdfactura`.`placa` AS `placa`,`bdclick1`.`bdplacas`.`tipo` AS `tipo`,`bdclick1`.`bdparqueaderoautos`.`fIngreso` AS `fIngreso`,`bdclick1`.`bdparqueaderoautos`.`fSalida` AS `fSalida`,`bdclick1`.`bdparqueaderoautos`.`hIngreso` AS `hIngreso`,`bdclick1`.`bdparqueaderoautos`.`hSalida` AS `hSalida`,`bdclick1`.`bdparqueaderoautos`.`horas` AS `horas`,`bdclick1`.`bdfactura`.`imei` AS `imei`,`bdclick1`.`bddetalleproductos`.`color` AS `color`,`bdclick1`.`bdterceros`.`idSistema` AS `idSistema`,`bdclick1`.`bdfactura`.`impoconsumo` AS `impoconsumo`,`bdclick1`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick1`.`bdfactura`.`totalPropina` AS `totalPropina`,`bdclick1`.`bdfactura`.`hora` AS `hora`,`bdclick1`.`bdfactura`.`idProd` AS `idProd`,`bdclick1`.`bdgrupo`.`nombre` AS `nombreGrupo`,`bdclick1`.`bdfactura`.`impoGeneral` AS `impoGeneral`,`bdclick1`.`bdfactura`.`porcImpo` AS `porcImpo`,`bdclick1`.`bdfactura`.`bodega` AS `bodega`,`bdclick1`.`bdproductos`.`codContable` AS `codEstandar` from ((((((((`bdclick1`.`bdfactura` left join `bdclick1`.`bdprestamo` on((`bdclick1`.`bdfactura`.`idFactura` = `bdclick1`.`bdprestamo`.`factura`))) left join `bdclick1`.`bdcxc` on((`bdclick1`.`bdfactura`.`factura` = `bdclick1`.`bdcxc`.`factura2`))) left join `bdclick1`.`bdplacas` on((`bdclick1`.`bdfactura`.`placa` = `bdclick1`.`bdplacas`.`placa`))) left join `bdclick1`.`bdparqueaderoautos` on((`bdclick1`.`bdparqueaderoautos`.`factura` = `bdclick1`.`bdfactura`.`factura`))) left join `bdclick1`.`bddetalleproductos` on((`bdclick1`.`bdfactura`.`idProd` = `bdclick1`.`bddetalleproductos`.`Id`))) left join `bdclick1`.`bdproductos` on((`bdclick1`.`bdfactura`.`producto` = `bdclick1`.`bdproductos`.`idSistema`))) left join (`bdclick1`.`bdterceros` left join `bdclick1`.`bdepsprecargados` on((`bdclick1`.`bdepsprecargados`.`Id` = `bdclick1`.`bdterceros`.`eps`))) on((`bdclick1`.`bdfactura`.`cliente` = `bdclick1`.`bdterceros`.`idSistema`))) left join `bdclick1`.`bdgrupo` on((`bdclick1`.`bdproductos`.`grupo` = `bdclick1`.`bdgrupo`.`codigo`))) group by `bdclick1`.`bdfactura`.`idFactura`,cast(substr(`bdclick1`.`bdfactura`.`idFactura`,6,100) as signed),`bdclick1`.`bdterceros`.`id`,`bdclick1`.`bdfactura`.`vendedor`,`bdclick1`.`bdfactura`.`red`,`bdclick1`.`bdfactura`.`fechaFactura`,`bdclick1`.`bdfactura`.`fechaVencimiento`,`bdclick1`.`bdfactura`.`efectivoGeneral`,`bdclick1`.`bdfactura`.`ncGeneral`,`bdclick1`.`bdfactura`.`chequeGeneral`,`bdclick1`.`bdfactura`.`targetaGeneral`,`bdclick1`.`bdfactura`.`totalGeneral`,`bdclick1`.`bdfactura`.`descuentoGeneral`,`bdclick1`.`bdfactura`.`ivaGeneral`,`bdclick1`.`bdfactura`.`subtotalGeneral`,`bdclick1`.`bdfactura`.`comprobante`,`bdclick1`.`bdfactura`.`cotizacion`,`bdclick1`.`bdfactura`.`anulada`,`bdclick1`.`bdfactura`.`anula`,`bdclick1`.`bdfactura`.`credito`,`bdclick1`.`bdfactura`.`cxc`,`bdclick1`.`bdfactura`.`usuario`,`bdclick1`.`bdfactura`.`rtIva`,`bdclick1`.`bdfactura`.`rtIca`,`bdclick1`.`bdfactura`.`rtFuente`,`bdclick1`.`bdfactura`.`otros`,`bdclick1`.`bdfactura`.`anulada1`,`bdclick1`.`bdfactura`.`anula1`,`bdclick1`.`bdfactura`.`credito1`,`bdclick1`.`bdfactura`.`cxc1`,`bdclick1`.`bdfactura`.`usuario1`,`bdclick1`.`bdfactura`.`fechaAlerta`,`bdclick1`.`bdfactura`.`terminal`,`bdclick1`.`bdfactura`.`estadoGeneral`,`bdclick1`.`bdfactura`.`estado2`,`bdclick1`.`bdfactura`.`devuelta`,`bdclick1`.`bdfactura`.`resolucion`,`bdclick1`.`bdfactura`.`fechaAnulacion`,`bdclick1`.`bdfactura`.`cuadreAnulacion`,`bdclick1`.`bdfactura`.`usuarioAnula`,`bdclick1`.`bdfactura`.`copago`,`bdclick1`.`bdfactura`.`garantia`,`bdclick1`.`bdfactura`.`diasGarantia`,`bdclick1`.`bdfactura`.`rango`,`bdclick1`.`bdfactura`.`conseMesa`,`bdclick1`.`bdfactura`.`producto`,`bdclick1`.`bdfactura`.`lista`,`bdclick1`.`bdfactura`.`cantidad`,`bdclick1`.`bdfactura`.`descuento`,`bdclick1`.`bdfactura`.`total`,`bdclick1`.`bdfactura`.`iva`,`bdclick1`.`bdfactura`.`subtotal`,`bdclick1`.`bdfactura`.`NC`,`bdclick1`.`bdfactura`.`utilidad`,`bdclick1`.`bdfactura`.`porcDescuento`,`bdclick1`.`bdfactura`.`descripcion`,`bdclick1`.`bdfactura`.`plu`,`bdclick1`.`bdfactura`.`cant2`,`bdclick1`.`bdfactura`.`estado`,`bdclick1`.`bdfactura`.`porcIva`,`bdclick1`.`bdfactura`.`tercero`,`bdclick1`.`bdfactura`.`utilidad1`,`bdclick1`.`bdterceros`.`nombre`,`bdclick1`.`bdterceros`.`telefono`,`bdclick1`.`bdterceros`.`direccion`,if(isnull(`bdclick1`.`bdprestamo`.`cuotaInicial`),0,`bdclick1`.`bdprestamo`.`cuotaInicial`),`bdclick1`.`bdfactura`.`factura`,`bdclick1`.`bdproductos`.`ubicacion1`,`bdclick1`.`bdproductos`.`referencia`,`bdclick1`.`bdproductos`.`unidad`,(`bdclick1`.`bdfactura`.`subtotalGeneral` - `bdclick1`.`bdfactura`.`descuentoGeneral`),if((`bdclick1`.`bdfactura`.`producto` = \'PROD-000000032\'),`bdclick1`.`bdfactura`.`impuesto`,\'0\'),`bdclick1`.`bdterceros`.`nombreContacto`,`bdclick1`.`bdterceros`.`cargo`,`bdclick1`.`bdfactura`.`turno`,`bdclick1`.`bdproductos`.`grupo`,`bdclick1`.`bdterceros`.`eps`,`bdclick1`.`bdepsprecargados`.`nombre`,`bdclick1`.`bdfactura`.`Id`,`bdclick1`.`bdfactura`.`placa`,`bdclick1`.`bdplacas`.`tipo`,`bdclick1`.`bdparqueaderoautos`.`fIngreso`,`bdclick1`.`bdparqueaderoautos`.`fSalida`,`bdclick1`.`bdparqueaderoautos`.`hIngreso`,`bdclick1`.`bdparqueaderoautos`.`hSalida`,`bdclick1`.`bdparqueaderoautos`.`horas`,`bdclick1`.`bdfactura`.`imei`,`bdclick1`.`bddetalleproductos`.`color`,`bdclick1`.`bdterceros`.`idSistema`,`bdclick1`.`bdfactura`.`impoconsumo`,`bdclick1`.`bdproductos`.`Codigo`,`bdclick1`.`bdgrupo`.`nombre`,`bdclick1`.`bdfactura`.`impoGeneral`,`bdclick1`.`bdfactura`.`porcImpo`,`bdclick1`.`bdfactura`.`bodega`,`bdclick1`.`bdproductos`.`codContable` order by `bdclick1`.`bdfactura`.`Id`
md5=f9e87a2441d2600b7ca0f9ccab6d6b99
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:34
create-version=2
source=select `bdfactura`.`idFactura` AS `idFactura`,cast(substr(`bdfactura`.`idFactura`,6,100) as signed) AS `ordenId`,`bdterceros`.`id` AS `cliente`,`bdfactura`.`vendedor` AS `vendedor`,`bdfactura`.`red` AS `red`,`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdfactura`.`fechaVencimiento` AS `fechaVencimiento`,`bdfactura`.`efectivoGeneral` AS `efectivoGeneral`,`bdfactura`.`ncGeneral` AS `ncGeneral`,`bdfactura`.`chequeGeneral` AS `chequeGeneral`,`bdfactura`.`targetaGeneral` AS `targetaGeneral`,`bdfactura`.`totalGeneral` AS `totalGeneral`,`bdfactura`.`descuentoGeneral` AS `descuentoGeneral`,`bdfactura`.`ivaGeneral` AS `ivaGeneral`,`bdfactura`.`subtotalGeneral` AS `subtotalGeneral`,`bdfactura`.`comprobante` AS `comprobante`,`bdfactura`.`cotizacion` AS `cotizacion`,`bdfactura`.`anulada` AS `anulada`,`bdfactura`.`anula` AS `anula`,`bdfactura`.`credito` AS `credito`,`bdfactura`.`cxc` AS `cxc`,`bdfactura`.`usuario` AS `usuario`,`bdfactura`.`rtIva` AS `rtIva`,`bdfactura`.`rtIca` AS `rtIca`,`bdfactura`.`rtFuente` AS `rtFuente`,`bdfactura`.`otros` AS `otros`,`bdfactura`.`observacion` AS `observacion`,`bdfactura`.`anulada1` AS `anulada1`,`bdfactura`.`anula1` AS `anula1`,`bdfactura`.`credito1` AS `credito1`,`bdfactura`.`cxc1` AS `cxc1`,`bdfactura`.`usuario1` AS `usuario1`,`bdfactura`.`fechaAlerta` AS `fechaAlerta`,`bdfactura`.`terminal` AS `terminal`,`bdfactura`.`estadoGeneral` AS `estadoGeneral`,`bdfactura`.`estado2` AS `estado2`,`bdfactura`.`devuelta` AS `devuelta`,`bdfactura`.`factura` AS `factura`,`bdfactura`.`resolucion` AS `resolucion`,`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdfactura`.`usuarioAnula` AS `usuarioAnula`,`bdfactura`.`copago` AS `copago`,`bdfactura`.`garantia` AS `garantia`,`bdfactura`.`diasGarantia` AS `diasGarantia`,`bdfactura`.`rango` AS `rango`,`bdfactura`.`terminos` AS `terminos`,`bdfactura`.`notaAnulacion` AS `notaAnulacion`,`bdfactura`.`conseMesa` AS `conseMesa`,`bdfactura`.`producto` AS `producto`,`bdfactura`.`lista` AS `lista`,`bdfactura`.`cantidad` AS `cantidad`,`bdfactura`.`descuento` AS `descuento`,`bdfactura`.`total` AS `total`,`bdfactura`.`iva` AS `iva`,`bdfactura`.`subtotal` AS `subtotal`,`bdfactura`.`NC` AS `NC`,`bdfactura`.`utilidad` AS `utilidad`,`bdfactura`.`concepto` AS `concepto`,`bdfactura`.`porcDescuento` AS `porcDescuento`,`bdfactura`.`descripcion` AS `descripcion`,`bdfactura`.`plu` AS `plu`,`bdfactura`.`cant2` AS `cant2`,`bdfactura`.`estado` AS `estado`,`bdfactura`.`porcIva` AS `porcIva`,`bdfactura`.`tercero` AS `tercero`,`bdfactura`.`utilidad1` AS `utilidad1`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`direccion` AS `direccion`,if(isnull(`bdprestamo`.`cuotaInicial`),0,`bdprestamo`.`cuotaInicial`) AS `cuotaInicial2`,`bdfactura`.`factura` AS `id2`,`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdproductos`.`referencia` AS `referencia`,`bdproductos`.`unidad` AS `unidad`,(`bdfactura`.`subtotalGeneral` - `bdfactura`.`descuentoGeneral`) AS `valor3`,if((`bdfactura`.`producto` = \'PROD-000000032\'),`bdfactura`.`impuesto`,\'0\') AS `impuesto`,`bdcxc`.`plazo` AS `plazo`,`bdterceros`.`nombreContacto` AS `nombreContacto`,`bdterceros`.`cargo` AS `cargo`,`bdfactura`.`turno` AS `turno`,`bdproductos`.`grupo` AS `Grupo`,`bdterceros`.`eps` AS `eps`,`bdepsprecargados`.`nombre` AS `nombreEps`,`bdfactura`.`Id` AS `Id`,`bdfactura`.`placa` AS `placa`,`bdplacas`.`tipo` AS `tipo`,`bdparqueaderoautos`.`fIngreso` AS `fIngreso`,`bdparqueaderoautos`.`fSalida` AS `fSalida`,`bdparqueaderoautos`.`hIngreso` AS `hIngreso`,`bdparqueaderoautos`.`hSalida` AS `hSalida`,`bdparqueaderoautos`.`horas` AS `horas`,`bdfactura`.`imei` AS `imei`,`bddetalleproductos`.`color` AS `color`,`bdterceros`.`idSistema` AS `idSistema`,`bdfactura`.`impoconsumo` AS `impoconsumo`,`bdproductos`.`Codigo` AS `Codigo`,`bdfactura`.`totalPropina` AS `totalPropina`,`bdfactura`.`hora` AS `hora`,`bdfactura`.`idProd` AS `idProd`,`bdgrupo`.`nombre` AS `nombreGrupo`,`bdfactura`.`impoGeneral` AS `impoGeneral`,`bdfactura`.`porcImpo` AS `porcImpo`,`bdfactura`.`bodega` AS `bodega`,`bdproductos`.`codContable` AS `codEstandar` from ((((((((`bdfactura` left join `bdprestamo` on((`bdfactura`.`idFactura` = `bdprestamo`.`factura`))) left join `bdcxc` on((`bdfactura`.`factura` = `bdcxc`.`factura2`))) left join `bdplacas` on((`bdfactura`.`placa` = `bdplacas`.`placa`))) left join `bdparqueaderoautos` on((`bdparqueaderoautos`.`factura` = `bdfactura`.`factura`))) left join `bddetalleproductos` on((`bdfactura`.`idProd` = `bddetalleproductos`.`Id`))) left join `bdproductos` on((`bdfactura`.`producto` = `bdproductos`.`idSistema`))) left join (`bdterceros` left join `bdepsprecargados` on((`bdepsprecargados`.`Id` = `bdterceros`.`eps`))) on((`bdfactura`.`cliente` = `bdterceros`.`idSistema`))) left join `bdgrupo` on((`bdproductos`.`grupo` = `bdgrupo`.`codigo`))) group by `bdfactura`.`idFactura`,cast(substr(`bdfactura`.`idFactura`,6,100) as signed),`bdterceros`.`id`,`bdfactura`.`vendedor`,`bdfactura`.`red`,`bdfactura`.`fechaFactura`,`bdfactura`.`fechaVencimiento`,`bdfactura`.`efectivoGeneral`,`bdfactura`.`ncGeneral`,`bdfactura`.`chequeGeneral`,`bdfactura`.`targetaGeneral`,`bdfactura`.`totalGeneral`,`bdfactura`.`descuentoGeneral`,`bdfactura`.`ivaGeneral`,`bdfactura`.`subtotalGeneral`,`bdfactura`.`comprobante`,`bdfactura`.`cotizacion`,`bdfactura`.`anulada`,`bdfactura`.`anula`,`bdfactura`.`credito`,`bdfactura`.`cxc`,`bdfactura`.`usuario`,`bdfactura`.`rtIva`,`bdfactura`.`rtIca`,`bdfactura`.`rtFuente`,`bdfactura`.`otros`,`bdfactura`.`anulada1`,`bdfactura`.`anula1`,`bdfactura`.`credito1`,`bdfactura`.`cxc1`,`bdfactura`.`usuario1`,`bdfactura`.`fechaAlerta`,`bdfactura`.`terminal`,`bdfactura`.`estadoGeneral`,`bdfactura`.`estado2`,`bdfactura`.`devuelta`,`bdfactura`.`resolucion`,`bdfactura`.`fechaAnulacion`,`bdfactura`.`cuadreAnulacion`,`bdfactura`.`usuarioAnula`,`bdfactura`.`copago`,`bdfactura`.`garantia`,`bdfactura`.`diasGarantia`,`bdfactura`.`rango`,`bdfactura`.`conseMesa`,`bdfactura`.`producto`,`bdfactura`.`lista`,`bdfactura`.`cantidad`,`bdfactura`.`descuento`,`bdfactura`.`total`,`bdfactura`.`iva`,`bdfactura`.`subtotal`,`bdfactura`.`NC`,`bdfactura`.`utilidad`,`bdfactura`.`porcDescuento`,`bdfactura`.`descripcion`,`bdfactura`.`plu`,`bdfactura`.`cant2`,`bdfactura`.`estado`,`bdfactura`.`porcIva`,`bdfactura`.`tercero`,`bdfactura`.`utilidad1`,`bdterceros`.`nombre`,`bdterceros`.`telefono`,`bdterceros`.`direccion`,if(isnull(`bdprestamo`.`cuotaInicial`),0,`bdprestamo`.`cuotaInicial`),`bdfactura`.`factura`,`bdproductos`.`ubicacion1`,`bdproductos`.`referencia`,`bdproductos`.`unidad`,(`bdfactura`.`subtotalGeneral` - `bdfactura`.`descuentoGeneral`),if((`bdfactura`.`producto` = \'PROD-000000032\'),`bdfactura`.`impuesto`,\'0\'),`bdterceros`.`nombreContacto`,`bdterceros`.`cargo`,`bdfactura`.`turno`,`bdproductos`.`grupo`,`bdterceros`.`eps`,`bdepsprecargados`.`nombre`,`bdfactura`.`Id`,`bdfactura`.`placa`,`bdplacas`.`tipo`,`bdparqueaderoautos`.`fIngreso`,`bdparqueaderoautos`.`fSalida`,`bdparqueaderoautos`.`hIngreso`,`bdparqueaderoautos`.`hSalida`,`bdparqueaderoautos`.`horas`,`bdfactura`.`imei`,`bddetalleproductos`.`color`,`bdterceros`.`idSistema`,`bdfactura`.`impoconsumo`,`bdproductos`.`Codigo`,`bdgrupo`.`nombre`,`bdfactura`.`impoGeneral`,`bdfactura`.`porcImpo`,`bdfactura`.`bodega`,`bdproductos`.`codContable` order by `bdfactura`.`Id`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdfactura`.`idFactura` AS `idFactura`,cast(substr(`bdclick1`.`bdfactura`.`idFactura`,6,100) as signed) AS `ordenId`,`bdclick1`.`bdterceros`.`id` AS `cliente`,`bdclick1`.`bdfactura`.`vendedor` AS `vendedor`,`bdclick1`.`bdfactura`.`red` AS `red`,`bdclick1`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick1`.`bdfactura`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick1`.`bdfactura`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick1`.`bdfactura`.`ncGeneral` AS `ncGeneral`,`bdclick1`.`bdfactura`.`chequeGeneral` AS `chequeGeneral`,`bdclick1`.`bdfactura`.`targetaGeneral` AS `targetaGeneral`,`bdclick1`.`bdfactura`.`totalGeneral` AS `totalGeneral`,`bdclick1`.`bdfactura`.`descuentoGeneral` AS `descuentoGeneral`,`bdclick1`.`bdfactura`.`ivaGeneral` AS `ivaGeneral`,`bdclick1`.`bdfactura`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick1`.`bdfactura`.`comprobante` AS `comprobante`,`bdclick1`.`bdfactura`.`cotizacion` AS `cotizacion`,`bdclick1`.`bdfactura`.`anulada` AS `anulada`,`bdclick1`.`bdfactura`.`anula` AS `anula`,`bdclick1`.`bdfactura`.`credito` AS `credito`,`bdclick1`.`bdfactura`.`cxc` AS `cxc`,`bdclick1`.`bdfactura`.`usuario` AS `usuario`,`bdclick1`.`bdfactura`.`rtIva` AS `rtIva`,`bdclick1`.`bdfactura`.`rtIca` AS `rtIca`,`bdclick1`.`bdfactura`.`rtFuente` AS `rtFuente`,`bdclick1`.`bdfactura`.`otros` AS `otros`,`bdclick1`.`bdfactura`.`observacion` AS `observacion`,`bdclick1`.`bdfactura`.`anulada1` AS `anulada1`,`bdclick1`.`bdfactura`.`anula1` AS `anula1`,`bdclick1`.`bdfactura`.`credito1` AS `credito1`,`bdclick1`.`bdfactura`.`cxc1` AS `cxc1`,`bdclick1`.`bdfactura`.`usuario1` AS `usuario1`,`bdclick1`.`bdfactura`.`fechaAlerta` AS `fechaAlerta`,`bdclick1`.`bdfactura`.`terminal` AS `terminal`,`bdclick1`.`bdfactura`.`estadoGeneral` AS `estadoGeneral`,`bdclick1`.`bdfactura`.`estado2` AS `estado2`,`bdclick1`.`bdfactura`.`devuelta` AS `devuelta`,`bdclick1`.`bdfactura`.`factura` AS `factura`,`bdclick1`.`bdfactura`.`resolucion` AS `resolucion`,`bdclick1`.`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,`bdclick1`.`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick1`.`bdfactura`.`usuarioAnula` AS `usuarioAnula`,`bdclick1`.`bdfactura`.`copago` AS `copago`,`bdclick1`.`bdfactura`.`garantia` AS `garantia`,`bdclick1`.`bdfactura`.`diasGarantia` AS `diasGarantia`,`bdclick1`.`bdfactura`.`rango` AS `rango`,`bdclick1`.`bdfactura`.`terminos` AS `terminos`,`bdclick1`.`bdfactura`.`notaAnulacion` AS `notaAnulacion`,`bdclick1`.`bdfactura`.`conseMesa` AS `conseMesa`,`bdclick1`.`bdfactura`.`producto` AS `producto`,`bdclick1`.`bdfactura`.`lista` AS `lista`,`bdclick1`.`bdfactura`.`cantidad` AS `cantidad`,`bdclick1`.`bdfactura`.`descuento` AS `descuento`,`bdclick1`.`bdfactura`.`total` AS `total`,`bdclick1`.`bdfactura`.`iva` AS `iva`,`bdclick1`.`bdfactura`.`subtotal` AS `subtotal`,`bdclick1`.`bdfactura`.`NC` AS `NC`,`bdclick1`.`bdfactura`.`utilidad` AS `utilidad`,`bdclick1`.`bdfactura`.`concepto` AS `concepto`,`bdclick1`.`bdfactura`.`porcDescuento` AS `porcDescuento`,`bdclick1`.`bdfactura`.`descripcion` AS `descripcion`,`bdclick1`.`bdfactura`.`plu` AS `plu`,`bdclick1`.`bdfactura`.`cant2` AS `cant2`,`bdclick1`.`bdfactura`.`estado` AS `estado`,`bdclick1`.`bdfactura`.`porcIva` AS `porcIva`,`bdclick1`.`bdfactura`.`tercero` AS `tercero`,`bdclick1`.`bdfactura`.`utilidad1` AS `utilidad1`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`bdclick1`.`bdterceros`.`telefono` AS `telefono`,`bdclick1`.`bdterceros`.`direccion` AS `direccion`,if(isnull(`bdclick1`.`bdprestamo`.`cuotaInicial`),0,`bdclick1`.`bdprestamo`.`cuotaInicial`) AS `cuotaInicial2`,`bdclick1`.`bdfactura`.`factura` AS `id2`,`bdclick1`.`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdclick1`.`bdproductos`.`referencia` AS `referencia`,`bdclick1`.`bdproductos`.`unidad` AS `unidad`,(`bdclick1`.`bdfactura`.`subtotalGeneral` - `bdclick1`.`bdfactura`.`descuentoGeneral`) AS `valor3`,if((`bdclick1`.`bdfactura`.`producto` = \'PROD-000000032\'),`bdclick1`.`bdfactura`.`impuesto`,\'0\') AS `impuesto`,`bdclick1`.`bdcxc`.`plazo` AS `plazo`,`bdclick1`.`bdterceros`.`nombreContacto` AS `nombreContacto`,`bdclick1`.`bdterceros`.`cargo` AS `cargo`,`bdclick1`.`bdfactura`.`turno` AS `turno`,`bdclick1`.`bdproductos`.`grupo` AS `Grupo`,`bdclick1`.`bdterceros`.`eps` AS `eps`,`bdclick1`.`bdepsprecargados`.`nombre` AS `nombreEps`,`bdclick1`.`bdfactura`.`Id` AS `Id`,`bdclick1`.`bdfactura`.`placa` AS `placa`,`bdclick1`.`bdplacas`.`tipo` AS `tipo`,`bdclick1`.`bdparqueaderoautos`.`fIngreso` AS `fIngreso`,`bdclick1`.`bdparqueaderoautos`.`fSalida` AS `fSalida`,`bdclick1`.`bdparqueaderoautos`.`hIngreso` AS `hIngreso`,`bdclick1`.`bdparqueaderoautos`.`hSalida` AS `hSalida`,`bdclick1`.`bdparqueaderoautos`.`horas` AS `horas`,`bdclick1`.`bdfactura`.`imei` AS `imei`,`bdclick1`.`bddetalleproductos`.`color` AS `color`,`bdclick1`.`bdterceros`.`idSistema` AS `idSistema`,`bdclick1`.`bdfactura`.`impoconsumo` AS `impoconsumo`,`bdclick1`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick1`.`bdfactura`.`totalPropina` AS `totalPropina`,`bdclick1`.`bdfactura`.`hora` AS `hora`,`bdclick1`.`bdfactura`.`idProd` AS `idProd`,`bdclick1`.`bdgrupo`.`nombre` AS `nombreGrupo`,`bdclick1`.`bdfactura`.`impoGeneral` AS `impoGeneral`,`bdclick1`.`bdfactura`.`porcImpo` AS `porcImpo`,`bdclick1`.`bdfactura`.`bodega` AS `bodega`,`bdclick1`.`bdproductos`.`codContable` AS `codEstandar` from ((((((((`bdclick1`.`bdfactura` left join `bdclick1`.`bdprestamo` on((`bdclick1`.`bdfactura`.`idFactura` = `bdclick1`.`bdprestamo`.`factura`))) left join `bdclick1`.`bdcxc` on((`bdclick1`.`bdfactura`.`factura` = `bdclick1`.`bdcxc`.`factura2`))) left join `bdclick1`.`bdplacas` on((`bdclick1`.`bdfactura`.`placa` = `bdclick1`.`bdplacas`.`placa`))) left join `bdclick1`.`bdparqueaderoautos` on((`bdclick1`.`bdparqueaderoautos`.`factura` = `bdclick1`.`bdfactura`.`factura`))) left join `bdclick1`.`bddetalleproductos` on((`bdclick1`.`bdfactura`.`idProd` = `bdclick1`.`bddetalleproductos`.`Id`))) left join `bdclick1`.`bdproductos` on((`bdclick1`.`bdfactura`.`producto` = `bdclick1`.`bdproductos`.`idSistema`))) left join (`bdclick1`.`bdterceros` left join `bdclick1`.`bdepsprecargados` on((`bdclick1`.`bdepsprecargados`.`Id` = `bdclick1`.`bdterceros`.`eps`))) on((`bdclick1`.`bdfactura`.`cliente` = `bdclick1`.`bdterceros`.`idSistema`))) left join `bdclick1`.`bdgrupo` on((`bdclick1`.`bdproductos`.`grupo` = `bdclick1`.`bdgrupo`.`codigo`))) group by `bdclick1`.`bdfactura`.`idFactura`,cast(substr(`bdclick1`.`bdfactura`.`idFactura`,6,100) as signed),`bdclick1`.`bdterceros`.`id`,`bdclick1`.`bdfactura`.`vendedor`,`bdclick1`.`bdfactura`.`red`,`bdclick1`.`bdfactura`.`fechaFactura`,`bdclick1`.`bdfactura`.`fechaVencimiento`,`bdclick1`.`bdfactura`.`efectivoGeneral`,`bdclick1`.`bdfactura`.`ncGeneral`,`bdclick1`.`bdfactura`.`chequeGeneral`,`bdclick1`.`bdfactura`.`targetaGeneral`,`bdclick1`.`bdfactura`.`totalGeneral`,`bdclick1`.`bdfactura`.`descuentoGeneral`,`bdclick1`.`bdfactura`.`ivaGeneral`,`bdclick1`.`bdfactura`.`subtotalGeneral`,`bdclick1`.`bdfactura`.`comprobante`,`bdclick1`.`bdfactura`.`cotizacion`,`bdclick1`.`bdfactura`.`anulada`,`bdclick1`.`bdfactura`.`anula`,`bdclick1`.`bdfactura`.`credito`,`bdclick1`.`bdfactura`.`cxc`,`bdclick1`.`bdfactura`.`usuario`,`bdclick1`.`bdfactura`.`rtIva`,`bdclick1`.`bdfactura`.`rtIca`,`bdclick1`.`bdfactura`.`rtFuente`,`bdclick1`.`bdfactura`.`otros`,`bdclick1`.`bdfactura`.`anulada1`,`bdclick1`.`bdfactura`.`anula1`,`bdclick1`.`bdfactura`.`credito1`,`bdclick1`.`bdfactura`.`cxc1`,`bdclick1`.`bdfactura`.`usuario1`,`bdclick1`.`bdfactura`.`fechaAlerta`,`bdclick1`.`bdfactura`.`terminal`,`bdclick1`.`bdfactura`.`estadoGeneral`,`bdclick1`.`bdfactura`.`estado2`,`bdclick1`.`bdfactura`.`devuelta`,`bdclick1`.`bdfactura`.`resolucion`,`bdclick1`.`bdfactura`.`fechaAnulacion`,`bdclick1`.`bdfactura`.`cuadreAnulacion`,`bdclick1`.`bdfactura`.`usuarioAnula`,`bdclick1`.`bdfactura`.`copago`,`bdclick1`.`bdfactura`.`garantia`,`bdclick1`.`bdfactura`.`diasGarantia`,`bdclick1`.`bdfactura`.`rango`,`bdclick1`.`bdfactura`.`conseMesa`,`bdclick1`.`bdfactura`.`producto`,`bdclick1`.`bdfactura`.`lista`,`bdclick1`.`bdfactura`.`cantidad`,`bdclick1`.`bdfactura`.`descuento`,`bdclick1`.`bdfactura`.`total`,`bdclick1`.`bdfactura`.`iva`,`bdclick1`.`bdfactura`.`subtotal`,`bdclick1`.`bdfactura`.`NC`,`bdclick1`.`bdfactura`.`utilidad`,`bdclick1`.`bdfactura`.`porcDescuento`,`bdclick1`.`bdfactura`.`descripcion`,`bdclick1`.`bdfactura`.`plu`,`bdclick1`.`bdfactura`.`cant2`,`bdclick1`.`bdfactura`.`estado`,`bdclick1`.`bdfactura`.`porcIva`,`bdclick1`.`bdfactura`.`tercero`,`bdclick1`.`bdfactura`.`utilidad1`,`bdclick1`.`bdterceros`.`nombre`,`bdclick1`.`bdterceros`.`telefono`,`bdclick1`.`bdterceros`.`direccion`,if(isnull(`bdclick1`.`bdprestamo`.`cuotaInicial`),0,`bdclick1`.`bdprestamo`.`cuotaInicial`),`bdclick1`.`bdfactura`.`factura`,`bdclick1`.`bdproductos`.`ubicacion1`,`bdclick1`.`bdproductos`.`referencia`,`bdclick1`.`bdproductos`.`unidad`,(`bdclick1`.`bdfactura`.`subtotalGeneral` - `bdclick1`.`bdfactura`.`descuentoGeneral`),if((`bdclick1`.`bdfactura`.`producto` = \'PROD-000000032\'),`bdclick1`.`bdfactura`.`impuesto`,\'0\'),`bdclick1`.`bdterceros`.`nombreContacto`,`bdclick1`.`bdterceros`.`cargo`,`bdclick1`.`bdfactura`.`turno`,`bdclick1`.`bdproductos`.`grupo`,`bdclick1`.`bdterceros`.`eps`,`bdclick1`.`bdepsprecargados`.`nombre`,`bdclick1`.`bdfactura`.`Id`,`bdclick1`.`bdfactura`.`placa`,`bdclick1`.`bdplacas`.`tipo`,`bdclick1`.`bdparqueaderoautos`.`fIngreso`,`bdclick1`.`bdparqueaderoautos`.`fSalida`,`bdclick1`.`bdparqueaderoautos`.`hIngreso`,`bdclick1`.`bdparqueaderoautos`.`hSalida`,`bdclick1`.`bdparqueaderoautos`.`horas`,`bdclick1`.`bdfactura`.`imei`,`bdclick1`.`bddetalleproductos`.`color`,`bdclick1`.`bdterceros`.`idSistema`,`bdclick1`.`bdfactura`.`impoconsumo`,`bdclick1`.`bdproductos`.`Codigo`,`bdclick1`.`bdgrupo`.`nombre`,`bdclick1`.`bdfactura`.`impoGeneral`,`bdclick1`.`bdfactura`.`porcImpo`,`bdclick1`.`bdfactura`.`bodega`,`bdclick1`.`bdproductos`.`codContable` order by `bdclick1`.`bdfactura`.`Id`
mariadb-version=100135
