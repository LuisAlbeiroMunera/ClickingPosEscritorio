TYPE=VIEW
query=(select `bdclick2`.`bdplansepare`.`idFactura` AS `idFactura`,cast(substr(`bdclick2`.`bdplansepare`.`idFactura`,8,100) as signed) AS `ordenId`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,`bdclick2`.`bdterceros`.`id` AS `idCliente`,`bdclick2`.`bdplansepare`.`cliente` AS `cliente`,`bdclick2`.`bdplansepare`.`vendedor` AS `vendedor`,`bdclick2`.`bdplansepare`.`red` AS `red`,`bdclick2`.`bdplansepare`.`fechaFactura` AS `fechaFactura`,`bdclick2`.`bdplansepare`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick2`.`bdplansepare`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick2`.`bdplansepare`.`ncGeneral` AS `ncGeneral`,`bdclick2`.`bdplansepare`.`chequeGeneral` AS `chequeGeneral`,`bdclick2`.`bdplansepare`.`targetaGeneral` AS `targetaGeneral`,`bdclick2`.`bdplansepare`.`totalGeneral` AS `totalGeneral`,`bdclick2`.`bdplansepare`.`descuentoGeneral` AS `descuentoGeneral`,`bdclick2`.`bdplansepare`.`ivaGeneral` AS `ivaGeneral`,`bdclick2`.`bdplansepare`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick2`.`bdplansepare`.`comprobante` AS `comprobante`,`bdclick2`.`bdplansepare`.`cotizacion` AS `cotizacion`,`bdclick2`.`bdplansepare`.`anulada` AS `anulada`,`bdclick2`.`bdplansepare`.`anula` AS `anula`,`bdclick2`.`bdplansepare`.`credito` AS `credito`,`bdclick2`.`bdplansepare`.`cxc` AS `cxc`,`bdclick2`.`bdplansepare`.`usuario` AS `usuario`,`bdclick2`.`bdplansepare`.`rtIva` AS `rtIva`,`bdclick2`.`bdplansepare`.`rtIca` AS `rtIca`,`bdclick2`.`bdplansepare`.`rtFuente` AS `rtFuente`,`bdclick2`.`bdplansepare`.`otros` AS `otros`,`bdclick2`.`bdplansepare`.`observacion` AS `observacion`,`bdclick2`.`bdplansepare`.`anulada1` AS `anulada1`,`bdclick2`.`bdplansepare`.`anula1` AS `anula1`,`bdclick2`.`bdplansepare`.`credito1` AS `credito1`,`bdclick2`.`bdplansepare`.`cxc1` AS `cxc1`,`bdclick2`.`bdplansepare`.`usuario1` AS `usuario1`,`bdclick2`.`bdplansepare`.`fechaAlerta` AS `fechaAlerta`,`bdclick2`.`bdplansepare`.`terminal` AS `terminal`,`bdclick2`.`bdplansepare`.`estadoGeneral` AS `estadoGeneral`,`bdclick2`.`bdplansepare`.`estado2` AS `estado2`,`bdclick2`.`bdplansepare`.`devuelta` AS `devuelta`,`bdclick2`.`bdplansepare`.`factura` AS `factura`,`bdclick2`.`bdplansepare`.`resolucion` AS `resolucion`,`bdclick2`.`bdplansepare`.`fechaAnulacion` AS `fechaAnulacion`,`bdclick2`.`bdplansepare`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick2`.`bdplansepare`.`usuarioAnula` AS `usuarioAnula`,`bdclick2`.`bdplansepare`.`copago` AS `copago`,`bdclick2`.`bdplansepare`.`placa` AS `placa`,`bdclick2`.`bdplansepare`.`garantia` AS `garantia`,`bdclick2`.`bdplansepare`.`diasGarantia` AS `diasGarantia`,`bdclick2`.`bdplansepare`.`rango` AS `rango`,`bdclick2`.`bdplansepare`.`terminos` AS `terminos`,`bdclick2`.`bdplansepare`.`notaAnulacion` AS `notaAnulacion`,`bdclick2`.`bdplansepare`.`conseMesa` AS `conseMesa` from (`bdclick2`.`bdplansepare` join `bdclick2`.`bdterceros` on((`bdclick2`.`bdplansepare`.`cliente` = `bdclick2`.`bdterceros`.`idSistema`))) group by `bdclick2`.`bdplansepare`.`idFactura`,cast(substr(`bdclick2`.`bdplansepare`.`idFactura`,8,100) as signed),`bdclick2`.`bdterceros`.`nombre`,`bdclick2`.`bdterceros`.`id`,`bdclick2`.`bdplansepare`.`cliente`,`bdclick2`.`bdplansepare`.`vendedor`,`bdclick2`.`bdplansepare`.`red`,`bdclick2`.`bdplansepare`.`fechaFactura`,`bdclick2`.`bdplansepare`.`fechaVencimiento`,`bdclick2`.`bdplansepare`.`efectivoGeneral`,`bdclick2`.`bdplansepare`.`ncGeneral`,`bdclick2`.`bdplansepare`.`chequeGeneral`,`bdclick2`.`bdplansepare`.`targetaGeneral`,`bdclick2`.`bdplansepare`.`totalGeneral`,`bdclick2`.`bdplansepare`.`descuentoGeneral`,`bdclick2`.`bdplansepare`.`ivaGeneral`,`bdclick2`.`bdplansepare`.`subtotalGeneral`,`bdclick2`.`bdplansepare`.`comprobante`,`bdclick2`.`bdplansepare`.`cotizacion`,`bdclick2`.`bdplansepare`.`anulada`,`bdclick2`.`bdplansepare`.`anula`,`bdclick2`.`bdplansepare`.`credito`,`bdclick2`.`bdplansepare`.`cxc`,`bdclick2`.`bdplansepare`.`usuario`,`bdclick2`.`bdplansepare`.`rtIva`,`bdclick2`.`bdplansepare`.`rtIca`,`bdclick2`.`bdplansepare`.`rtFuente`,`bdclick2`.`bdplansepare`.`otros`,`bdclick2`.`bdplansepare`.`observacion`,`bdclick2`.`bdplansepare`.`anulada1`,`bdclick2`.`bdplansepare`.`anula1`,`bdclick2`.`bdplansepare`.`credito1`,`bdclick2`.`bdplansepare`.`cxc1`,`bdclick2`.`bdplansepare`.`usuario1`,`bdclick2`.`bdplansepare`.`fechaAlerta`,`bdclick2`.`bdplansepare`.`terminal`,`bdclick2`.`bdplansepare`.`estadoGeneral`,`bdclick2`.`bdplansepare`.`estado2`,`bdclick2`.`bdplansepare`.`devuelta`,`bdclick2`.`bdplansepare`.`factura`,`bdclick2`.`bdplansepare`.`resolucion`,`bdclick2`.`bdplansepare`.`fechaAnulacion`,`bdclick2`.`bdplansepare`.`cuadreAnulacion`,`bdclick2`.`bdplansepare`.`usuarioAnula`,`bdclick2`.`bdplansepare`.`copago`,`bdclick2`.`bdplansepare`.`placa`,`bdclick2`.`bdplansepare`.`garantia`,`bdclick2`.`bdplansepare`.`diasGarantia`,`bdclick2`.`bdplansepare`.`rango`,`bdclick2`.`bdplansepare`.`terminos`,`bdclick2`.`bdplansepare`.`notaAnulacion`,`bdclick2`.`bdplansepare`.`conseMesa` order by cast(substr(`bdclick2`.`bdplansepare`.`idFactura`,8,100) as signed))
md5=a58ad8f1212166f93c46e609d28e4cb9
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:48
create-version=2
source=(select `bdplansepare`.`idFactura` AS `idFactura`,cast(substr(`bdplansepare`.`idFactura`,8,100) as signed) AS `ordenId`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`id` AS `idCliente`,`bdplansepare`.`cliente` AS `cliente`,`bdplansepare`.`vendedor` AS `vendedor`,`bdplansepare`.`red` AS `red`,`bdplansepare`.`fechaFactura` AS `fechaFactura`,`bdplansepare`.`fechaVencimiento` AS `fechaVencimiento`,`bdplansepare`.`efectivoGeneral` AS `efectivoGeneral`,`bdplansepare`.`ncGeneral` AS `ncGeneral`,`bdplansepare`.`chequeGeneral` AS `chequeGeneral`,`bdplansepare`.`targetaGeneral` AS `targetaGeneral`,`bdplansepare`.`totalGeneral` AS `totalGeneral`,`bdplansepare`.`descuentoGeneral` AS `descuentoGeneral`,`bdplansepare`.`ivaGeneral` AS `ivaGeneral`,`bdplansepare`.`subtotalGeneral` AS `subtotalGeneral`,`bdplansepare`.`comprobante` AS `comprobante`,`bdplansepare`.`cotizacion` AS `cotizacion`,`bdplansepare`.`anulada` AS `anulada`,`bdplansepare`.`anula` AS `anula`,`bdplansepare`.`credito` AS `credito`,`bdplansepare`.`cxc` AS `cxc`,`bdplansepare`.`usuario` AS `usuario`,`bdplansepare`.`rtIva` AS `rtIva`,`bdplansepare`.`rtIca` AS `rtIca`,`bdplansepare`.`rtFuente` AS `rtFuente`,`bdplansepare`.`otros` AS `otros`,`bdplansepare`.`observacion` AS `observacion`,`bdplansepare`.`anulada1` AS `anulada1`,`bdplansepare`.`anula1` AS `anula1`,`bdplansepare`.`credito1` AS `credito1`,`bdplansepare`.`cxc1` AS `cxc1`,`bdplansepare`.`usuario1` AS `usuario1`,`bdplansepare`.`fechaAlerta` AS `fechaAlerta`,`bdplansepare`.`terminal` AS `terminal`,`bdplansepare`.`estadoGeneral` AS `estadoGeneral`,`bdplansepare`.`estado2` AS `estado2`,`bdplansepare`.`devuelta` AS `devuelta`,`bdplansepare`.`factura` AS `factura`,`bdplansepare`.`resolucion` AS `resolucion`,`bdplansepare`.`fechaAnulacion` AS `fechaAnulacion`,`bdplansepare`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdplansepare`.`usuarioAnula` AS `usuarioAnula`,`bdplansepare`.`copago` AS `copago`,`bdplansepare`.`placa` AS `placa`,`bdplansepare`.`garantia` AS `garantia`,`bdplansepare`.`diasGarantia` AS `diasGarantia`,`bdplansepare`.`rango` AS `rango`,`bdplansepare`.`terminos` AS `terminos`,`bdplansepare`.`notaAnulacion` AS `notaAnulacion`,`bdplansepare`.`conseMesa` AS `conseMesa` from (`bdplansepare` join `bdterceros` on((`bdplansepare`.`cliente` = `bdterceros`.`idSistema`))) group by `bdplansepare`.`idFactura`,cast(substr(`bdplansepare`.`idFactura`,8,100) as signed),`bdterceros`.`nombre`,`bdterceros`.`id`,`bdplansepare`.`cliente`,`bdplansepare`.`vendedor`,`bdplansepare`.`red`,`bdplansepare`.`fechaFactura`,`bdplansepare`.`fechaVencimiento`,`bdplansepare`.`efectivoGeneral`,`bdplansepare`.`ncGeneral`,`bdplansepare`.`chequeGeneral`,`bdplansepare`.`targetaGeneral`,`bdplansepare`.`totalGeneral`,`bdplansepare`.`descuentoGeneral`,`bdplansepare`.`ivaGeneral`,`bdplansepare`.`subtotalGeneral`,`bdplansepare`.`comprobante`,`bdplansepare`.`cotizacion`,`bdplansepare`.`anulada`,`bdplansepare`.`anula`,`bdplansepare`.`credito`,`bdplansepare`.`cxc`,`bdplansepare`.`usuario`,`bdplansepare`.`rtIva`,`bdplansepare`.`rtIca`,`bdplansepare`.`rtFuente`,`bdplansepare`.`otros`,`bdplansepare`.`observacion`,`bdplansepare`.`anulada1`,`bdplansepare`.`anula1`,`bdplansepare`.`credito1`,`bdplansepare`.`cxc1`,`bdplansepare`.`usuario1`,`bdplansepare`.`fechaAlerta`,`bdplansepare`.`terminal`,`bdplansepare`.`estadoGeneral`,`bdplansepare`.`estado2`,`bdplansepare`.`devuelta`,`bdplansepare`.`factura`,`bdplansepare`.`resolucion`,`bdplansepare`.`fechaAnulacion`,`bdplansepare`.`cuadreAnulacion`,`bdplansepare`.`usuarioAnula`,`bdplansepare`.`copago`,`bdplansepare`.`placa`,`bdplansepare`.`garantia`,`bdplansepare`.`diasGarantia`,`bdplansepare`.`rango`,`bdplansepare`.`terminos`,`bdplansepare`.`notaAnulacion`,`bdplansepare`.`conseMesa` order by cast(substr(`bdplansepare`.`idFactura`,8,100) as signed))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick2`.`bdplansepare`.`idFactura` AS `idFactura`,cast(substr(`bdclick2`.`bdplansepare`.`idFactura`,8,100) as signed) AS `ordenId`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,`bdclick2`.`bdterceros`.`id` AS `idCliente`,`bdclick2`.`bdplansepare`.`cliente` AS `cliente`,`bdclick2`.`bdplansepare`.`vendedor` AS `vendedor`,`bdclick2`.`bdplansepare`.`red` AS `red`,`bdclick2`.`bdplansepare`.`fechaFactura` AS `fechaFactura`,`bdclick2`.`bdplansepare`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick2`.`bdplansepare`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick2`.`bdplansepare`.`ncGeneral` AS `ncGeneral`,`bdclick2`.`bdplansepare`.`chequeGeneral` AS `chequeGeneral`,`bdclick2`.`bdplansepare`.`targetaGeneral` AS `targetaGeneral`,`bdclick2`.`bdplansepare`.`totalGeneral` AS `totalGeneral`,`bdclick2`.`bdplansepare`.`descuentoGeneral` AS `descuentoGeneral`,`bdclick2`.`bdplansepare`.`ivaGeneral` AS `ivaGeneral`,`bdclick2`.`bdplansepare`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick2`.`bdplansepare`.`comprobante` AS `comprobante`,`bdclick2`.`bdplansepare`.`cotizacion` AS `cotizacion`,`bdclick2`.`bdplansepare`.`anulada` AS `anulada`,`bdclick2`.`bdplansepare`.`anula` AS `anula`,`bdclick2`.`bdplansepare`.`credito` AS `credito`,`bdclick2`.`bdplansepare`.`cxc` AS `cxc`,`bdclick2`.`bdplansepare`.`usuario` AS `usuario`,`bdclick2`.`bdplansepare`.`rtIva` AS `rtIva`,`bdclick2`.`bdplansepare`.`rtIca` AS `rtIca`,`bdclick2`.`bdplansepare`.`rtFuente` AS `rtFuente`,`bdclick2`.`bdplansepare`.`otros` AS `otros`,`bdclick2`.`bdplansepare`.`observacion` AS `observacion`,`bdclick2`.`bdplansepare`.`anulada1` AS `anulada1`,`bdclick2`.`bdplansepare`.`anula1` AS `anula1`,`bdclick2`.`bdplansepare`.`credito1` AS `credito1`,`bdclick2`.`bdplansepare`.`cxc1` AS `cxc1`,`bdclick2`.`bdplansepare`.`usuario1` AS `usuario1`,`bdclick2`.`bdplansepare`.`fechaAlerta` AS `fechaAlerta`,`bdclick2`.`bdplansepare`.`terminal` AS `terminal`,`bdclick2`.`bdplansepare`.`estadoGeneral` AS `estadoGeneral`,`bdclick2`.`bdplansepare`.`estado2` AS `estado2`,`bdclick2`.`bdplansepare`.`devuelta` AS `devuelta`,`bdclick2`.`bdplansepare`.`factura` AS `factura`,`bdclick2`.`bdplansepare`.`resolucion` AS `resolucion`,`bdclick2`.`bdplansepare`.`fechaAnulacion` AS `fechaAnulacion`,`bdclick2`.`bdplansepare`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick2`.`bdplansepare`.`usuarioAnula` AS `usuarioAnula`,`bdclick2`.`bdplansepare`.`copago` AS `copago`,`bdclick2`.`bdplansepare`.`placa` AS `placa`,`bdclick2`.`bdplansepare`.`garantia` AS `garantia`,`bdclick2`.`bdplansepare`.`diasGarantia` AS `diasGarantia`,`bdclick2`.`bdplansepare`.`rango` AS `rango`,`bdclick2`.`bdplansepare`.`terminos` AS `terminos`,`bdclick2`.`bdplansepare`.`notaAnulacion` AS `notaAnulacion`,`bdclick2`.`bdplansepare`.`conseMesa` AS `conseMesa` from (`bdclick2`.`bdplansepare` join `bdclick2`.`bdterceros` on((`bdclick2`.`bdplansepare`.`cliente` = `bdclick2`.`bdterceros`.`idSistema`))) group by `bdclick2`.`bdplansepare`.`idFactura`,cast(substr(`bdclick2`.`bdplansepare`.`idFactura`,8,100) as signed),`bdclick2`.`bdterceros`.`nombre`,`bdclick2`.`bdterceros`.`id`,`bdclick2`.`bdplansepare`.`cliente`,`bdclick2`.`bdplansepare`.`vendedor`,`bdclick2`.`bdplansepare`.`red`,`bdclick2`.`bdplansepare`.`fechaFactura`,`bdclick2`.`bdplansepare`.`fechaVencimiento`,`bdclick2`.`bdplansepare`.`efectivoGeneral`,`bdclick2`.`bdplansepare`.`ncGeneral`,`bdclick2`.`bdplansepare`.`chequeGeneral`,`bdclick2`.`bdplansepare`.`targetaGeneral`,`bdclick2`.`bdplansepare`.`totalGeneral`,`bdclick2`.`bdplansepare`.`descuentoGeneral`,`bdclick2`.`bdplansepare`.`ivaGeneral`,`bdclick2`.`bdplansepare`.`subtotalGeneral`,`bdclick2`.`bdplansepare`.`comprobante`,`bdclick2`.`bdplansepare`.`cotizacion`,`bdclick2`.`bdplansepare`.`anulada`,`bdclick2`.`bdplansepare`.`anula`,`bdclick2`.`bdplansepare`.`credito`,`bdclick2`.`bdplansepare`.`cxc`,`bdclick2`.`bdplansepare`.`usuario`,`bdclick2`.`bdplansepare`.`rtIva`,`bdclick2`.`bdplansepare`.`rtIca`,`bdclick2`.`bdplansepare`.`rtFuente`,`bdclick2`.`bdplansepare`.`otros`,`bdclick2`.`bdplansepare`.`observacion`,`bdclick2`.`bdplansepare`.`anulada1`,`bdclick2`.`bdplansepare`.`anula1`,`bdclick2`.`bdplansepare`.`credito1`,`bdclick2`.`bdplansepare`.`cxc1`,`bdclick2`.`bdplansepare`.`usuario1`,`bdclick2`.`bdplansepare`.`fechaAlerta`,`bdclick2`.`bdplansepare`.`terminal`,`bdclick2`.`bdplansepare`.`estadoGeneral`,`bdclick2`.`bdplansepare`.`estado2`,`bdclick2`.`bdplansepare`.`devuelta`,`bdclick2`.`bdplansepare`.`factura`,`bdclick2`.`bdplansepare`.`resolucion`,`bdclick2`.`bdplansepare`.`fechaAnulacion`,`bdclick2`.`bdplansepare`.`cuadreAnulacion`,`bdclick2`.`bdplansepare`.`usuarioAnula`,`bdclick2`.`bdplansepare`.`copago`,`bdclick2`.`bdplansepare`.`placa`,`bdclick2`.`bdplansepare`.`garantia`,`bdclick2`.`bdplansepare`.`diasGarantia`,`bdclick2`.`bdplansepare`.`rango`,`bdclick2`.`bdplansepare`.`terminos`,`bdclick2`.`bdplansepare`.`notaAnulacion`,`bdclick2`.`bdplansepare`.`conseMesa` order by cast(substr(`bdclick2`.`bdplansepare`.`idFactura`,8,100) as signed))
mariadb-version=100135
