TYPE=VIEW
query=select `bdclick6`.`bdfactura`.`idFactura` AS `idFactura`,cast(substr(`bdclick6`.`bdfactura`.`idFactura`,6,100) as signed) AS `ordenId`,`bdclick6`.`bdterceros`.`id` AS `cliente`,`bdclick6`.`bdfactura`.`vendedor` AS `vendedor`,`bdclick6`.`bdfactura`.`red` AS `red`,`bdclick6`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick6`.`bdfactura`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick6`.`bdfactura`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick6`.`bdfactura`.`ncGeneral` AS `ncGeneral`,`bdclick6`.`bdfactura`.`chequeGeneral` AS `chequeGeneral`,`bdclick6`.`bdfactura`.`targetaGeneral` AS `targetaGeneral`,`bdclick6`.`bdfactura`.`totalGeneral` AS `totalGeneral`,`bdclick6`.`bdfactura`.`descuentoGeneral` AS `descuentoGeneral`,`bdclick6`.`bdfactura`.`ivaGeneral` AS `ivaGeneral`,`bdclick6`.`bdfactura`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick6`.`bdfactura`.`comprobante` AS `comprobante`,`bdclick6`.`bdfactura`.`cotizacion` AS `cotizacion`,`bdclick6`.`bdfactura`.`anulada` AS `anulada`,`bdclick6`.`bdfactura`.`anula` AS `anula`,`bdclick6`.`bdfactura`.`credito` AS `credito`,`bdclick6`.`bdfactura`.`cxc` AS `cxc`,`bdclick6`.`bdfactura`.`usuario` AS `usuario`,`bdclick6`.`bdfactura`.`rtIva` AS `rtIva`,`bdclick6`.`bdfactura`.`rtIca` AS `rtIca`,`bdclick6`.`bdfactura`.`rtFuente` AS `rtFuente`,`bdclick6`.`bdfactura`.`otros` AS `otros`,`bdclick6`.`bdfactura`.`observacion` AS `observacion`,`bdclick6`.`bdfactura`.`anulada1` AS `anulada1`,`bdclick6`.`bdfactura`.`anula1` AS `anula1`,`bdclick6`.`bdfactura`.`credito1` AS `credito1`,`bdclick6`.`bdfactura`.`cxc1` AS `cxc1`,`bdclick6`.`bdfactura`.`usuario1` AS `usuario1`,`bdclick6`.`bdfactura`.`fechaAlerta` AS `fechaAlerta`,`bdclick6`.`bdfactura`.`terminal` AS `terminal`,`bdclick6`.`bdfactura`.`estadoGeneral` AS `estadoGeneral`,`bdclick6`.`bdfactura`.`estado2` AS `estado2`,`bdclick6`.`bdfactura`.`devuelta` AS `devuelta`,`bdclick6`.`bdfactura`.`factura` AS `factura`,`bdclick6`.`bdfactura`.`resolucion` AS `resolucion`,`bdclick6`.`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,`bdclick6`.`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick6`.`bdfactura`.`usuarioAnula` AS `usuarioAnula`,`bdclick6`.`bdfactura`.`copago` AS `copago`,`bdclick6`.`bdfactura`.`garantia` AS `garantia`,`bdclick6`.`bdfactura`.`diasGarantia` AS `diasGarantia`,`bdclick6`.`bdfactura`.`rango` AS `rango`,`bdclick6`.`bdfactura`.`terminos` AS `terminos`,`bdclick6`.`bdfactura`.`notaAnulacion` AS `notaAnulacion`,`bdclick6`.`bdfactura`.`conseMesa` AS `conseMesa`,`bdclick6`.`bdfactura`.`producto` AS `producto`,`bdclick6`.`bdfactura`.`lista` AS `lista`,`bdclick6`.`bdfactura`.`cantidad` AS `cantidad`,`bdclick6`.`bdfactura`.`descuento` AS `descuento`,`bdclick6`.`bdfactura`.`total` AS `total`,`bdclick6`.`bdfactura`.`iva` AS `iva`,`bdclick6`.`bdfactura`.`subtotal` AS `subtotal`,`bdclick6`.`bdfactura`.`NC` AS `NC`,`bdclick6`.`bdfactura`.`utilidad` AS `utilidad`,`bdclick6`.`bdfactura`.`concepto` AS `concepto`,`bdclick6`.`bdfactura`.`porcDescuento` AS `porcDescuento`,`bdclick6`.`bdfactura`.`descripcion` AS `descripcion`,`bdclick6`.`bdfactura`.`plu` AS `plu`,`bdclick6`.`bdfactura`.`cant2` AS `cant2`,`bdclick6`.`bdfactura`.`estado` AS `estado`,`bdclick6`.`bdfactura`.`porcIva` AS `porcIva`,`bdclick6`.`bdfactura`.`tercero` AS `tercero`,`bdclick6`.`bdfactura`.`utilidad1` AS `utilidad1`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,`bdclick6`.`bdterceros`.`direccion` AS `direccion`,if(isnull(`bdclick6`.`bdprestamo`.`cuotaInicial`),0,`bdclick6`.`bdprestamo`.`cuotaInicial`) AS `cuotaInicial2`,`bdclick6`.`bdfactura`.`factura` AS `id2`,`bdclick6`.`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdclick6`.`bdproductos`.`referencia` AS `referencia`,`bdclick6`.`bdproductos`.`unidad` AS `unidad`,(`bdclick6`.`bdfactura`.`subtotalGeneral` - `bdclick6`.`bdfactura`.`descuentoGeneral`) AS `valor3`,if((`bdclick6`.`bdfactura`.`producto` = \'PROD-000000032\'),`bdclick6`.`bdfactura`.`impuesto`,\'0\') AS `impuesto`,`bdclick6`.`bdcxc`.`plazo` AS `plazo`,`bdclick6`.`bdterceros`.`nombreContacto` AS `nombreContacto`,`bdclick6`.`bdterceros`.`cargo` AS `cargo`,`bdclick6`.`bdfactura`.`turno` AS `turno`,`bdclick6`.`bdproductos`.`grupo` AS `Grupo`,`bdclick6`.`bdterceros`.`eps` AS `eps`,`bdclick6`.`bdepsprecargados`.`nombre` AS `nombreEps`,`bdclick6`.`bdfactura`.`Id` AS `Id`,`bdclick6`.`bdfactura`.`placa` AS `placa`,`bdclick6`.`bdplacas`.`tipo` AS `tipo`,`bdclick6`.`bdparqueaderoautos`.`fIngreso` AS `fIngreso`,`bdclick6`.`bdparqueaderoautos`.`fSalida` AS `fSalida`,`bdclick6`.`bdparqueaderoautos`.`hIngreso` AS `hIngreso`,`bdclick6`.`bdparqueaderoautos`.`hSalida` AS `hSalida`,`bdclick6`.`bdparqueaderoautos`.`horas` AS `horas`,`bdclick6`.`bdfactura`.`imei` AS `imei`,`bdclick6`.`bddetalleproductos`.`color` AS `color`,`bdclick6`.`bdterceros`.`idSistema` AS `idSistema`,`bdclick6`.`bdfactura`.`impoconsumo` AS `impoconsumo`,`bdclick6`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick6`.`bdfactura`.`totalPropina` AS `totalPropina`,`bdclick6`.`bdfactura`.`hora` AS `hora`,`bdclick6`.`bdfactura`.`idProd` AS `idProd`,`bdclick6`.`bdgrupo`.`nombre` AS `nombreGrupo`,`bdclick6`.`bdfactura`.`impoGeneral` AS `impoGeneral`,`bdclick6`.`bdfactura`.`porcImpo` AS `porcImpo`,`bdclick6`.`bdfactura`.`bodega` AS `bodega`,`bdclick6`.`bdproductos`.`codContable` AS `codEstandar` from ((((((((`bdclick6`.`bdfactura` left join `bdclick6`.`bdprestamo` on((`bdclick6`.`bdfactura`.`idFactura` = `bdclick6`.`bdprestamo`.`factura`))) left join `bdclick6`.`bdcxc` on((`bdclick6`.`bdfactura`.`factura` = `bdclick6`.`bdcxc`.`factura2`))) left join `bdclick6`.`bdplacas` on((`bdclick6`.`bdfactura`.`placa` = `bdclick6`.`bdplacas`.`placa`))) left join `bdclick6`.`bdparqueaderoautos` on((`bdclick6`.`bdparqueaderoautos`.`factura` = `bdclick6`.`bdfactura`.`factura`))) left join `bdclick6`.`bddetalleproductos` on((`bdclick6`.`bdfactura`.`idProd` = `bdclick6`.`bddetalleproductos`.`Id`))) left join `bdclick6`.`bdproductos` on((`bdclick6`.`bdfactura`.`producto` = `bdclick6`.`bdproductos`.`idSistema`))) left join (`bdclick6`.`bdterceros` left join `bdclick6`.`bdepsprecargados` on((`bdclick6`.`bdepsprecargados`.`Id` = `bdclick6`.`bdterceros`.`eps`))) on((`bdclick6`.`bdfactura`.`cliente` = `bdclick6`.`bdterceros`.`idSistema`))) left join `bdclick6`.`bdgrupo` on((`bdclick6`.`bdproductos`.`grupo` = `bdclick6`.`bdgrupo`.`codigo`))) group by `bdclick6`.`bdfactura`.`idFactura`,cast(substr(`bdclick6`.`bdfactura`.`idFactura`,6,100) as signed),`bdclick6`.`bdterceros`.`id`,`bdclick6`.`bdfactura`.`vendedor`,`bdclick6`.`bdfactura`.`red`,`bdclick6`.`bdfactura`.`fechaFactura`,`bdclick6`.`bdfactura`.`fechaVencimiento`,`bdclick6`.`bdfactura`.`efectivoGeneral`,`bdclick6`.`bdfactura`.`ncGeneral`,`bdclick6`.`bdfactura`.`chequeGeneral`,`bdclick6`.`bdfactura`.`targetaGeneral`,`bdclick6`.`bdfactura`.`totalGeneral`,`bdclick6`.`bdfactura`.`descuentoGeneral`,`bdclick6`.`bdfactura`.`ivaGeneral`,`bdclick6`.`bdfactura`.`subtotalGeneral`,`bdclick6`.`bdfactura`.`comprobante`,`bdclick6`.`bdfactura`.`cotizacion`,`bdclick6`.`bdfactura`.`anulada`,`bdclick6`.`bdfactura`.`anula`,`bdclick6`.`bdfactura`.`credito`,`bdclick6`.`bdfactura`.`cxc`,`bdclick6`.`bdfactura`.`usuario`,`bdclick6`.`bdfactura`.`rtIva`,`bdclick6`.`bdfactura`.`rtIca`,`bdclick6`.`bdfactura`.`rtFuente`,`bdclick6`.`bdfactura`.`otros`,`bdclick6`.`bdfactura`.`anulada1`,`bdclick6`.`bdfactura`.`anula1`,`bdclick6`.`bdfactura`.`credito1`,`bdclick6`.`bdfactura`.`cxc1`,`bdclick6`.`bdfactura`.`usuario1`,`bdclick6`.`bdfactura`.`fechaAlerta`,`bdclick6`.`bdfactura`.`terminal`,`bdclick6`.`bdfactura`.`estadoGeneral`,`bdclick6`.`bdfactura`.`estado2`,`bdclick6`.`bdfactura`.`devuelta`,`bdclick6`.`bdfactura`.`resolucion`,`bdclick6`.`bdfactura`.`fechaAnulacion`,`bdclick6`.`bdfactura`.`cuadreAnulacion`,`bdclick6`.`bdfactura`.`usuarioAnula`,`bdclick6`.`bdfactura`.`copago`,`bdclick6`.`bdfactura`.`garantia`,`bdclick6`.`bdfactura`.`diasGarantia`,`bdclick6`.`bdfactura`.`rango`,`bdclick6`.`bdfactura`.`conseMesa`,`bdclick6`.`bdfactura`.`producto`,`bdclick6`.`bdfactura`.`lista`,`bdclick6`.`bdfactura`.`cantidad`,`bdclick6`.`bdfactura`.`descuento`,`bdclick6`.`bdfactura`.`total`,`bdclick6`.`bdfactura`.`iva`,`bdclick6`.`bdfactura`.`subtotal`,`bdclick6`.`bdfactura`.`NC`,`bdclick6`.`bdfactura`.`utilidad`,`bdclick6`.`bdfactura`.`porcDescuento`,`bdclick6`.`bdfactura`.`descripcion`,`bdclick6`.`bdfactura`.`plu`,`bdclick6`.`bdfactura`.`cant2`,`bdclick6`.`bdfactura`.`estado`,`bdclick6`.`bdfactura`.`porcIva`,`bdclick6`.`bdfactura`.`tercero`,`bdclick6`.`bdfactura`.`utilidad1`,`bdclick6`.`bdterceros`.`nombre`,`bdclick6`.`bdterceros`.`telefono`,`bdclick6`.`bdterceros`.`direccion`,if(isnull(`bdclick6`.`bdprestamo`.`cuotaInicial`),0,`bdclick6`.`bdprestamo`.`cuotaInicial`),`bdclick6`.`bdfactura`.`factura`,`bdclick6`.`bdproductos`.`ubicacion1`,`bdclick6`.`bdproductos`.`referencia`,`bdclick6`.`bdproductos`.`unidad`,(`bdclick6`.`bdfactura`.`subtotalGeneral` - `bdclick6`.`bdfactura`.`descuentoGeneral`),if((`bdclick6`.`bdfactura`.`producto` = \'PROD-000000032\'),`bdclick6`.`bdfactura`.`impuesto`,\'0\'),`bdclick6`.`bdterceros`.`nombreContacto`,`bdclick6`.`bdterceros`.`cargo`,`bdclick6`.`bdfactura`.`turno`,`bdclick6`.`bdproductos`.`grupo`,`bdclick6`.`bdterceros`.`eps`,`bdclick6`.`bdepsprecargados`.`nombre`,`bdclick6`.`bdfactura`.`Id`,`bdclick6`.`bdfactura`.`placa`,`bdclick6`.`bdplacas`.`tipo`,`bdclick6`.`bdparqueaderoautos`.`fIngreso`,`bdclick6`.`bdparqueaderoautos`.`fSalida`,`bdclick6`.`bdparqueaderoautos`.`hIngreso`,`bdclick6`.`bdparqueaderoautos`.`hSalida`,`bdclick6`.`bdparqueaderoautos`.`horas`,`bdclick6`.`bdfactura`.`imei`,`bdclick6`.`bddetalleproductos`.`color`,`bdclick6`.`bdterceros`.`idSistema`,`bdclick6`.`bdfactura`.`impoconsumo`,`bdclick6`.`bdproductos`.`Codigo`,`bdclick6`.`bdgrupo`.`nombre`,`bdclick6`.`bdfactura`.`impoGeneral`,`bdclick6`.`bdfactura`.`porcImpo`,`bdclick6`.`bdfactura`.`bodega`,`bdclick6`.`bdproductos`.`codContable` order by `bdclick6`.`bdfactura`.`Id`
md5=9ff786d906accab00cfde3251e4a534d
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:35
create-version=2
source=select `bdfactura`.`idFactura` AS `idFactura`,cast(substr(`bdfactura`.`idFactura`,6,100) as signed) AS `ordenId`,`bdterceros`.`id` AS `cliente`,`bdfactura`.`vendedor` AS `vendedor`,`bdfactura`.`red` AS `red`,`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdfactura`.`fechaVencimiento` AS `fechaVencimiento`,`bdfactura`.`efectivoGeneral` AS `efectivoGeneral`,`bdfactura`.`ncGeneral` AS `ncGeneral`,`bdfactura`.`chequeGeneral` AS `chequeGeneral`,`bdfactura`.`targetaGeneral` AS `targetaGeneral`,`bdfactura`.`totalGeneral` AS `totalGeneral`,`bdfactura`.`descuentoGeneral` AS `descuentoGeneral`,`bdfactura`.`ivaGeneral` AS `ivaGeneral`,`bdfactura`.`subtotalGeneral` AS `subtotalGeneral`,`bdfactura`.`comprobante` AS `comprobante`,`bdfactura`.`cotizacion` AS `cotizacion`,`bdfactura`.`anulada` AS `anulada`,`bdfactura`.`anula` AS `anula`,`bdfactura`.`credito` AS `credito`,`bdfactura`.`cxc` AS `cxc`,`bdfactura`.`usuario` AS `usuario`,`bdfactura`.`rtIva` AS `rtIva`,`bdfactura`.`rtIca` AS `rtIca`,`bdfactura`.`rtFuente` AS `rtFuente`,`bdfactura`.`otros` AS `otros`,`bdfactura`.`observacion` AS `observacion`,`bdfactura`.`anulada1` AS `anulada1`,`bdfactura`.`anula1` AS `anula1`,`bdfactura`.`credito1` AS `credito1`,`bdfactura`.`cxc1` AS `cxc1`,`bdfactura`.`usuario1` AS `usuario1`,`bdfactura`.`fechaAlerta` AS `fechaAlerta`,`bdfactura`.`terminal` AS `terminal`,`bdfactura`.`estadoGeneral` AS `estadoGeneral`,`bdfactura`.`estado2` AS `estado2`,`bdfactura`.`devuelta` AS `devuelta`,`bdfactura`.`factura` AS `factura`,`bdfactura`.`resolucion` AS `resolucion`,`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdfactura`.`usuarioAnula` AS `usuarioAnula`,`bdfactura`.`copago` AS `copago`,`bdfactura`.`garantia` AS `garantia`,`bdfactura`.`diasGarantia` AS `diasGarantia`,`bdfactura`.`rango` AS `rango`,`bdfactura`.`terminos` AS `terminos`,`bdfactura`.`notaAnulacion` AS `notaAnulacion`,`bdfactura`.`conseMesa` AS `conseMesa`,`bdfactura`.`producto` AS `producto`,`bdfactura`.`lista` AS `lista`,`bdfactura`.`cantidad` AS `cantidad`,`bdfactura`.`descuento` AS `descuento`,`bdfactura`.`total` AS `total`,`bdfactura`.`iva` AS `iva`,`bdfactura`.`subtotal` AS `subtotal`,`bdfactura`.`NC` AS `NC`,`bdfactura`.`utilidad` AS `utilidad`,`bdfactura`.`concepto` AS `concepto`,`bdfactura`.`porcDescuento` AS `porcDescuento`,`bdfactura`.`descripcion` AS `descripcion`,`bdfactura`.`plu` AS `plu`,`bdfactura`.`cant2` AS `cant2`,`bdfactura`.`estado` AS `estado`,`bdfactura`.`porcIva` AS `porcIva`,`bdfactura`.`tercero` AS `tercero`,`bdfactura`.`utilidad1` AS `utilidad1`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`direccion` AS `direccion`,if(isnull(`bdprestamo`.`cuotaInicial`),0,`bdprestamo`.`cuotaInicial`) AS `cuotaInicial2`,`bdfactura`.`factura` AS `id2`,`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdproductos`.`referencia` AS `referencia`,`bdproductos`.`unidad` AS `unidad`,(`bdfactura`.`subtotalGeneral` - `bdfactura`.`descuentoGeneral`) AS `valor3`,if((`bdfactura`.`producto` = \'PROD-000000032\'),`bdfactura`.`impuesto`,\'0\') AS `impuesto`,`bdcxc`.`plazo` AS `plazo`,`bdterceros`.`nombreContacto` AS `nombreContacto`,`bdterceros`.`cargo` AS `cargo`,`bdfactura`.`turno` AS `turno`,`bdproductos`.`grupo` AS `Grupo`,`bdterceros`.`eps` AS `eps`,`bdepsprecargados`.`nombre` AS `nombreEps`,`bdfactura`.`Id` AS `Id`,`bdfactura`.`placa` AS `placa`,`bdplacas`.`tipo` AS `tipo`,`bdparqueaderoautos`.`fIngreso` AS `fIngreso`,`bdparqueaderoautos`.`fSalida` AS `fSalida`,`bdparqueaderoautos`.`hIngreso` AS `hIngreso`,`bdparqueaderoautos`.`hSalida` AS `hSalida`,`bdparqueaderoautos`.`horas` AS `horas`,`bdfactura`.`imei` AS `imei`,`bddetalleproductos`.`color` AS `color`,`bdterceros`.`idSistema` AS `idSistema`,`bdfactura`.`impoconsumo` AS `impoconsumo`,`bdproductos`.`Codigo` AS `Codigo`,`bdfactura`.`totalPropina` AS `totalPropina`,`bdfactura`.`hora` AS `hora`,`bdfactura`.`idProd` AS `idProd`,`bdgrupo`.`nombre` AS `nombreGrupo`,`bdfactura`.`impoGeneral` AS `impoGeneral`,`bdfactura`.`porcImpo` AS `porcImpo`,`bdfactura`.`bodega` AS `bodega`,`bdproductos`.`codContable` AS `codEstandar` from ((((((((`bdfactura` left join `bdprestamo` on((`bdfactura`.`idFactura` = `bdprestamo`.`factura`))) left join `bdcxc` on((`bdfactura`.`factura` = `bdcxc`.`factura2`))) left join `bdplacas` on((`bdfactura`.`placa` = `bdplacas`.`placa`))) left join `bdparqueaderoautos` on((`bdparqueaderoautos`.`factura` = `bdfactura`.`factura`))) left join `bddetalleproductos` on((`bdfactura`.`idProd` = `bddetalleproductos`.`Id`))) left join `bdproductos` on((`bdfactura`.`producto` = `bdproductos`.`idSistema`))) left join (`bdterceros` left join `bdepsprecargados` on((`bdepsprecargados`.`Id` = `bdterceros`.`eps`))) on((`bdfactura`.`cliente` = `bdterceros`.`idSistema`))) left join `bdgrupo` on((`bdproductos`.`grupo` = `bdgrupo`.`codigo`))) group by `bdfactura`.`idFactura`,cast(substr(`bdfactura`.`idFactura`,6,100) as signed),`bdterceros`.`id`,`bdfactura`.`vendedor`,`bdfactura`.`red`,`bdfactura`.`fechaFactura`,`bdfactura`.`fechaVencimiento`,`bdfactura`.`efectivoGeneral`,`bdfactura`.`ncGeneral`,`bdfactura`.`chequeGeneral`,`bdfactura`.`targetaGeneral`,`bdfactura`.`totalGeneral`,`bdfactura`.`descuentoGeneral`,`bdfactura`.`ivaGeneral`,`bdfactura`.`subtotalGeneral`,`bdfactura`.`comprobante`,`bdfactura`.`cotizacion`,`bdfactura`.`anulada`,`bdfactura`.`anula`,`bdfactura`.`credito`,`bdfactura`.`cxc`,`bdfactura`.`usuario`,`bdfactura`.`rtIva`,`bdfactura`.`rtIca`,`bdfactura`.`rtFuente`,`bdfactura`.`otros`,`bdfactura`.`anulada1`,`bdfactura`.`anula1`,`bdfactura`.`credito1`,`bdfactura`.`cxc1`,`bdfactura`.`usuario1`,`bdfactura`.`fechaAlerta`,`bdfactura`.`terminal`,`bdfactura`.`estadoGeneral`,`bdfactura`.`estado2`,`bdfactura`.`devuelta`,`bdfactura`.`resolucion`,`bdfactura`.`fechaAnulacion`,`bdfactura`.`cuadreAnulacion`,`bdfactura`.`usuarioAnula`,`bdfactura`.`copago`,`bdfactura`.`garantia`,`bdfactura`.`diasGarantia`,`bdfactura`.`rango`,`bdfactura`.`conseMesa`,`bdfactura`.`producto`,`bdfactura`.`lista`,`bdfactura`.`cantidad`,`bdfactura`.`descuento`,`bdfactura`.`total`,`bdfactura`.`iva`,`bdfactura`.`subtotal`,`bdfactura`.`NC`,`bdfactura`.`utilidad`,`bdfactura`.`porcDescuento`,`bdfactura`.`descripcion`,`bdfactura`.`plu`,`bdfactura`.`cant2`,`bdfactura`.`estado`,`bdfactura`.`porcIva`,`bdfactura`.`tercero`,`bdfactura`.`utilidad1`,`bdterceros`.`nombre`,`bdterceros`.`telefono`,`bdterceros`.`direccion`,if(isnull(`bdprestamo`.`cuotaInicial`),0,`bdprestamo`.`cuotaInicial`),`bdfactura`.`factura`,`bdproductos`.`ubicacion1`,`bdproductos`.`referencia`,`bdproductos`.`unidad`,(`bdfactura`.`subtotalGeneral` - `bdfactura`.`descuentoGeneral`),if((`bdfactura`.`producto` = \'PROD-000000032\'),`bdfactura`.`impuesto`,\'0\'),`bdterceros`.`nombreContacto`,`bdterceros`.`cargo`,`bdfactura`.`turno`,`bdproductos`.`grupo`,`bdterceros`.`eps`,`bdepsprecargados`.`nombre`,`bdfactura`.`Id`,`bdfactura`.`placa`,`bdplacas`.`tipo`,`bdparqueaderoautos`.`fIngreso`,`bdparqueaderoautos`.`fSalida`,`bdparqueaderoautos`.`hIngreso`,`bdparqueaderoautos`.`hSalida`,`bdparqueaderoautos`.`horas`,`bdfactura`.`imei`,`bddetalleproductos`.`color`,`bdterceros`.`idSistema`,`bdfactura`.`impoconsumo`,`bdproductos`.`Codigo`,`bdgrupo`.`nombre`,`bdfactura`.`impoGeneral`,`bdfactura`.`porcImpo`,`bdfactura`.`bodega`,`bdproductos`.`codContable` order by `bdfactura`.`Id`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdfactura`.`idFactura` AS `idFactura`,cast(substr(`bdclick6`.`bdfactura`.`idFactura`,6,100) as signed) AS `ordenId`,`bdclick6`.`bdterceros`.`id` AS `cliente`,`bdclick6`.`bdfactura`.`vendedor` AS `vendedor`,`bdclick6`.`bdfactura`.`red` AS `red`,`bdclick6`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick6`.`bdfactura`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick6`.`bdfactura`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick6`.`bdfactura`.`ncGeneral` AS `ncGeneral`,`bdclick6`.`bdfactura`.`chequeGeneral` AS `chequeGeneral`,`bdclick6`.`bdfactura`.`targetaGeneral` AS `targetaGeneral`,`bdclick6`.`bdfactura`.`totalGeneral` AS `totalGeneral`,`bdclick6`.`bdfactura`.`descuentoGeneral` AS `descuentoGeneral`,`bdclick6`.`bdfactura`.`ivaGeneral` AS `ivaGeneral`,`bdclick6`.`bdfactura`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick6`.`bdfactura`.`comprobante` AS `comprobante`,`bdclick6`.`bdfactura`.`cotizacion` AS `cotizacion`,`bdclick6`.`bdfactura`.`anulada` AS `anulada`,`bdclick6`.`bdfactura`.`anula` AS `anula`,`bdclick6`.`bdfactura`.`credito` AS `credito`,`bdclick6`.`bdfactura`.`cxc` AS `cxc`,`bdclick6`.`bdfactura`.`usuario` AS `usuario`,`bdclick6`.`bdfactura`.`rtIva` AS `rtIva`,`bdclick6`.`bdfactura`.`rtIca` AS `rtIca`,`bdclick6`.`bdfactura`.`rtFuente` AS `rtFuente`,`bdclick6`.`bdfactura`.`otros` AS `otros`,`bdclick6`.`bdfactura`.`observacion` AS `observacion`,`bdclick6`.`bdfactura`.`anulada1` AS `anulada1`,`bdclick6`.`bdfactura`.`anula1` AS `anula1`,`bdclick6`.`bdfactura`.`credito1` AS `credito1`,`bdclick6`.`bdfactura`.`cxc1` AS `cxc1`,`bdclick6`.`bdfactura`.`usuario1` AS `usuario1`,`bdclick6`.`bdfactura`.`fechaAlerta` AS `fechaAlerta`,`bdclick6`.`bdfactura`.`terminal` AS `terminal`,`bdclick6`.`bdfactura`.`estadoGeneral` AS `estadoGeneral`,`bdclick6`.`bdfactura`.`estado2` AS `estado2`,`bdclick6`.`bdfactura`.`devuelta` AS `devuelta`,`bdclick6`.`bdfactura`.`factura` AS `factura`,`bdclick6`.`bdfactura`.`resolucion` AS `resolucion`,`bdclick6`.`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,`bdclick6`.`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick6`.`bdfactura`.`usuarioAnula` AS `usuarioAnula`,`bdclick6`.`bdfactura`.`copago` AS `copago`,`bdclick6`.`bdfactura`.`garantia` AS `garantia`,`bdclick6`.`bdfactura`.`diasGarantia` AS `diasGarantia`,`bdclick6`.`bdfactura`.`rango` AS `rango`,`bdclick6`.`bdfactura`.`terminos` AS `terminos`,`bdclick6`.`bdfactura`.`notaAnulacion` AS `notaAnulacion`,`bdclick6`.`bdfactura`.`conseMesa` AS `conseMesa`,`bdclick6`.`bdfactura`.`producto` AS `producto`,`bdclick6`.`bdfactura`.`lista` AS `lista`,`bdclick6`.`bdfactura`.`cantidad` AS `cantidad`,`bdclick6`.`bdfactura`.`descuento` AS `descuento`,`bdclick6`.`bdfactura`.`total` AS `total`,`bdclick6`.`bdfactura`.`iva` AS `iva`,`bdclick6`.`bdfactura`.`subtotal` AS `subtotal`,`bdclick6`.`bdfactura`.`NC` AS `NC`,`bdclick6`.`bdfactura`.`utilidad` AS `utilidad`,`bdclick6`.`bdfactura`.`concepto` AS `concepto`,`bdclick6`.`bdfactura`.`porcDescuento` AS `porcDescuento`,`bdclick6`.`bdfactura`.`descripcion` AS `descripcion`,`bdclick6`.`bdfactura`.`plu` AS `plu`,`bdclick6`.`bdfactura`.`cant2` AS `cant2`,`bdclick6`.`bdfactura`.`estado` AS `estado`,`bdclick6`.`bdfactura`.`porcIva` AS `porcIva`,`bdclick6`.`bdfactura`.`tercero` AS `tercero`,`bdclick6`.`bdfactura`.`utilidad1` AS `utilidad1`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,`bdclick6`.`bdterceros`.`direccion` AS `direccion`,if(isnull(`bdclick6`.`bdprestamo`.`cuotaInicial`),0,`bdclick6`.`bdprestamo`.`cuotaInicial`) AS `cuotaInicial2`,`bdclick6`.`bdfactura`.`factura` AS `id2`,`bdclick6`.`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdclick6`.`bdproductos`.`referencia` AS `referencia`,`bdclick6`.`bdproductos`.`unidad` AS `unidad`,(`bdclick6`.`bdfactura`.`subtotalGeneral` - `bdclick6`.`bdfactura`.`descuentoGeneral`) AS `valor3`,if((`bdclick6`.`bdfactura`.`producto` = \'PROD-000000032\'),`bdclick6`.`bdfactura`.`impuesto`,\'0\') AS `impuesto`,`bdclick6`.`bdcxc`.`plazo` AS `plazo`,`bdclick6`.`bdterceros`.`nombreContacto` AS `nombreContacto`,`bdclick6`.`bdterceros`.`cargo` AS `cargo`,`bdclick6`.`bdfactura`.`turno` AS `turno`,`bdclick6`.`bdproductos`.`grupo` AS `Grupo`,`bdclick6`.`bdterceros`.`eps` AS `eps`,`bdclick6`.`bdepsprecargados`.`nombre` AS `nombreEps`,`bdclick6`.`bdfactura`.`Id` AS `Id`,`bdclick6`.`bdfactura`.`placa` AS `placa`,`bdclick6`.`bdplacas`.`tipo` AS `tipo`,`bdclick6`.`bdparqueaderoautos`.`fIngreso` AS `fIngreso`,`bdclick6`.`bdparqueaderoautos`.`fSalida` AS `fSalida`,`bdclick6`.`bdparqueaderoautos`.`hIngreso` AS `hIngreso`,`bdclick6`.`bdparqueaderoautos`.`hSalida` AS `hSalida`,`bdclick6`.`bdparqueaderoautos`.`horas` AS `horas`,`bdclick6`.`bdfactura`.`imei` AS `imei`,`bdclick6`.`bddetalleproductos`.`color` AS `color`,`bdclick6`.`bdterceros`.`idSistema` AS `idSistema`,`bdclick6`.`bdfactura`.`impoconsumo` AS `impoconsumo`,`bdclick6`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick6`.`bdfactura`.`totalPropina` AS `totalPropina`,`bdclick6`.`bdfactura`.`hora` AS `hora`,`bdclick6`.`bdfactura`.`idProd` AS `idProd`,`bdclick6`.`bdgrupo`.`nombre` AS `nombreGrupo`,`bdclick6`.`bdfactura`.`impoGeneral` AS `impoGeneral`,`bdclick6`.`bdfactura`.`porcImpo` AS `porcImpo`,`bdclick6`.`bdfactura`.`bodega` AS `bodega`,`bdclick6`.`bdproductos`.`codContable` AS `codEstandar` from ((((((((`bdclick6`.`bdfactura` left join `bdclick6`.`bdprestamo` on((`bdclick6`.`bdfactura`.`idFactura` = `bdclick6`.`bdprestamo`.`factura`))) left join `bdclick6`.`bdcxc` on((`bdclick6`.`bdfactura`.`factura` = `bdclick6`.`bdcxc`.`factura2`))) left join `bdclick6`.`bdplacas` on((`bdclick6`.`bdfactura`.`placa` = `bdclick6`.`bdplacas`.`placa`))) left join `bdclick6`.`bdparqueaderoautos` on((`bdclick6`.`bdparqueaderoautos`.`factura` = `bdclick6`.`bdfactura`.`factura`))) left join `bdclick6`.`bddetalleproductos` on((`bdclick6`.`bdfactura`.`idProd` = `bdclick6`.`bddetalleproductos`.`Id`))) left join `bdclick6`.`bdproductos` on((`bdclick6`.`bdfactura`.`producto` = `bdclick6`.`bdproductos`.`idSistema`))) left join (`bdclick6`.`bdterceros` left join `bdclick6`.`bdepsprecargados` on((`bdclick6`.`bdepsprecargados`.`Id` = `bdclick6`.`bdterceros`.`eps`))) on((`bdclick6`.`bdfactura`.`cliente` = `bdclick6`.`bdterceros`.`idSistema`))) left join `bdclick6`.`bdgrupo` on((`bdclick6`.`bdproductos`.`grupo` = `bdclick6`.`bdgrupo`.`codigo`))) group by `bdclick6`.`bdfactura`.`idFactura`,cast(substr(`bdclick6`.`bdfactura`.`idFactura`,6,100) as signed),`bdclick6`.`bdterceros`.`id`,`bdclick6`.`bdfactura`.`vendedor`,`bdclick6`.`bdfactura`.`red`,`bdclick6`.`bdfactura`.`fechaFactura`,`bdclick6`.`bdfactura`.`fechaVencimiento`,`bdclick6`.`bdfactura`.`efectivoGeneral`,`bdclick6`.`bdfactura`.`ncGeneral`,`bdclick6`.`bdfactura`.`chequeGeneral`,`bdclick6`.`bdfactura`.`targetaGeneral`,`bdclick6`.`bdfactura`.`totalGeneral`,`bdclick6`.`bdfactura`.`descuentoGeneral`,`bdclick6`.`bdfactura`.`ivaGeneral`,`bdclick6`.`bdfactura`.`subtotalGeneral`,`bdclick6`.`bdfactura`.`comprobante`,`bdclick6`.`bdfactura`.`cotizacion`,`bdclick6`.`bdfactura`.`anulada`,`bdclick6`.`bdfactura`.`anula`,`bdclick6`.`bdfactura`.`credito`,`bdclick6`.`bdfactura`.`cxc`,`bdclick6`.`bdfactura`.`usuario`,`bdclick6`.`bdfactura`.`rtIva`,`bdclick6`.`bdfactura`.`rtIca`,`bdclick6`.`bdfactura`.`rtFuente`,`bdclick6`.`bdfactura`.`otros`,`bdclick6`.`bdfactura`.`anulada1`,`bdclick6`.`bdfactura`.`anula1`,`bdclick6`.`bdfactura`.`credito1`,`bdclick6`.`bdfactura`.`cxc1`,`bdclick6`.`bdfactura`.`usuario1`,`bdclick6`.`bdfactura`.`fechaAlerta`,`bdclick6`.`bdfactura`.`terminal`,`bdclick6`.`bdfactura`.`estadoGeneral`,`bdclick6`.`bdfactura`.`estado2`,`bdclick6`.`bdfactura`.`devuelta`,`bdclick6`.`bdfactura`.`resolucion`,`bdclick6`.`bdfactura`.`fechaAnulacion`,`bdclick6`.`bdfactura`.`cuadreAnulacion`,`bdclick6`.`bdfactura`.`usuarioAnula`,`bdclick6`.`bdfactura`.`copago`,`bdclick6`.`bdfactura`.`garantia`,`bdclick6`.`bdfactura`.`diasGarantia`,`bdclick6`.`bdfactura`.`rango`,`bdclick6`.`bdfactura`.`conseMesa`,`bdclick6`.`bdfactura`.`producto`,`bdclick6`.`bdfactura`.`lista`,`bdclick6`.`bdfactura`.`cantidad`,`bdclick6`.`bdfactura`.`descuento`,`bdclick6`.`bdfactura`.`total`,`bdclick6`.`bdfactura`.`iva`,`bdclick6`.`bdfactura`.`subtotal`,`bdclick6`.`bdfactura`.`NC`,`bdclick6`.`bdfactura`.`utilidad`,`bdclick6`.`bdfactura`.`porcDescuento`,`bdclick6`.`bdfactura`.`descripcion`,`bdclick6`.`bdfactura`.`plu`,`bdclick6`.`bdfactura`.`cant2`,`bdclick6`.`bdfactura`.`estado`,`bdclick6`.`bdfactura`.`porcIva`,`bdclick6`.`bdfactura`.`tercero`,`bdclick6`.`bdfactura`.`utilidad1`,`bdclick6`.`bdterceros`.`nombre`,`bdclick6`.`bdterceros`.`telefono`,`bdclick6`.`bdterceros`.`direccion`,if(isnull(`bdclick6`.`bdprestamo`.`cuotaInicial`),0,`bdclick6`.`bdprestamo`.`cuotaInicial`),`bdclick6`.`bdfactura`.`factura`,`bdclick6`.`bdproductos`.`ubicacion1`,`bdclick6`.`bdproductos`.`referencia`,`bdclick6`.`bdproductos`.`unidad`,(`bdclick6`.`bdfactura`.`subtotalGeneral` - `bdclick6`.`bdfactura`.`descuentoGeneral`),if((`bdclick6`.`bdfactura`.`producto` = \'PROD-000000032\'),`bdclick6`.`bdfactura`.`impuesto`,\'0\'),`bdclick6`.`bdterceros`.`nombreContacto`,`bdclick6`.`bdterceros`.`cargo`,`bdclick6`.`bdfactura`.`turno`,`bdclick6`.`bdproductos`.`grupo`,`bdclick6`.`bdterceros`.`eps`,`bdclick6`.`bdepsprecargados`.`nombre`,`bdclick6`.`bdfactura`.`Id`,`bdclick6`.`bdfactura`.`placa`,`bdclick6`.`bdplacas`.`tipo`,`bdclick6`.`bdparqueaderoautos`.`fIngreso`,`bdclick6`.`bdparqueaderoautos`.`fSalida`,`bdclick6`.`bdparqueaderoautos`.`hIngreso`,`bdclick6`.`bdparqueaderoautos`.`hSalida`,`bdclick6`.`bdparqueaderoautos`.`horas`,`bdclick6`.`bdfactura`.`imei`,`bdclick6`.`bddetalleproductos`.`color`,`bdclick6`.`bdterceros`.`idSistema`,`bdclick6`.`bdfactura`.`impoconsumo`,`bdclick6`.`bdproductos`.`Codigo`,`bdclick6`.`bdgrupo`.`nombre`,`bdclick6`.`bdfactura`.`impoGeneral`,`bdclick6`.`bdfactura`.`porcImpo`,`bdclick6`.`bdfactura`.`bodega`,`bdclick6`.`bdproductos`.`codContable` order by `bdclick6`.`bdfactura`.`Id`
mariadb-version=100135
