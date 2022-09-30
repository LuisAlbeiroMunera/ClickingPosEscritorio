TYPE=VIEW
query=(select `bdclick3`.`bdfactura`.`idFactura` AS `idFactura`,cast(substr(`bdclick3`.`bdfactura`.`idFactura`,6,100) as signed) AS `ordenId`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdterceros`.`id` AS `cliente`,`bdclick3`.`bdfactura`.`vendedor` AS `vendedor`,`bdclick3`.`bdfactura`.`red` AS `red`,`bdclick3`.`bdfactura`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick3`.`bdfactura`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick3`.`bdfactura`.`ncGeneral` AS `ncGeneral`,`bdclick3`.`bdfactura`.`chequeGeneral` AS `chequeGeneral`,`bdclick3`.`bdfactura`.`targetaGeneral` AS `targetaGeneral`,`bdclick3`.`bdfactura`.`totalGeneral` AS `totalGeneral`,`bdclick3`.`bdfactura`.`descuentoGeneral` AS `descuentoGeneral`,`bdclick3`.`bdfactura`.`ivaGeneral` AS `ivaGeneral`,`bdclick3`.`bdfactura`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick3`.`bdfactura`.`comprobante` AS `comprobante`,`bdclick3`.`bdfactura`.`cotizacion` AS `cotizacion`,`bdclick3`.`bdfactura`.`anulada` AS `anulada`,`bdclick3`.`bdfactura`.`anula` AS `anula`,`bdclick3`.`bdfactura`.`credito` AS `credito`,`bdclick3`.`bdfactura`.`cxc` AS `cxc`,`bdclick3`.`bdfactura`.`usuario` AS `usuario`,`bdclick3`.`bdfactura`.`rtIva` AS `rtIva`,`bdclick3`.`bdfactura`.`rtIca` AS `rtIca`,`bdclick3`.`bdfactura`.`rtFuente` AS `rtFuente`,`bdclick3`.`bdfactura`.`otros` AS `otros`,`bdclick3`.`bdfactura`.`observacion` AS `observacion`,`bdclick3`.`bdfactura`.`anulada1` AS `anulada1`,`bdclick3`.`bdfactura`.`anula1` AS `anula1`,`bdclick3`.`bdfactura`.`credito1` AS `credito1`,`bdclick3`.`bdfactura`.`cxc1` AS `cxc1`,`bdclick3`.`bdfactura`.`usuario1` AS `usuario1`,`bdclick3`.`bdfactura`.`fechaAlerta` AS `fechaAlerta`,`bdclick3`.`bdfactura`.`terminal` AS `terminal`,`bdclick3`.`bdfactura`.`estadoGeneral` AS `estadoGeneral`,`bdclick3`.`bdfactura`.`estado2` AS `estado2`,`bdclick3`.`bdfactura`.`devuelta` AS `devuelta`,`bdclick3`.`bdfactura`.`factura` AS `factura`,`bdclick3`.`bdfactura`.`resolucion` AS `resolucion`,`bdclick3`.`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,`bdclick3`.`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick3`.`bdfactura`.`usuarioAnula` AS `usuarioAnula`,`bdclick3`.`bdfactura`.`placa` AS `placa`,`bdclick3`.`bdfactura`.`garantia` AS `garantia`,`bdclick3`.`bdfactura`.`diasGarantia` AS `diasGarantia`,`bdclick3`.`bdfactura`.`rango` AS `rango`,`bdclick3`.`bdfactura`.`terminos` AS `terminos`,`bdclick3`.`bdfactura`.`notaAnulacion` AS `notaAnulacion`,`bdclick3`.`bdfactura`.`conseMesa` AS `conseMesa`,`bdclick3`.`bdfactura`.`factura` AS `id2`,`bdclick3`.`bdfactura`.`copago` AS `copago`,`bdclick3`.`bdprestamo`.`cuotaInicial` AS `cuotaInicial2`,cast(`bdclick3`.`bdfactura`.`fechaFactura` as date) AS `fechaFactura`,`bdclick3`.`bdfactura`.`turno` AS `turno`,`bdclick3`.`bdfactura`.`impuesto` AS `impuesto`,`bdclick3`.`bdterceros`.`idSistema` AS `idSistema`,cast(`bdclick3`.`bdfactura`.`fechaFactura` as date) AS `fechaFactura1`,`bdclick3`.`bdfactura`.`impoGeneral` AS `impoconsumo`,`bdclick3`.`bdfactura`.`tarjetaCredito` AS `tarjetaCredito`,`bdclick3`.`bdfactura`.`franquisia` AS `franquisia`,`bdclick3`.`bdfactura`.`hora` AS `hora`,`bdclick3`.`bdfactura`.`valorComision` AS `valorComision`,`bdclick3`.`bdfactura`.`totalPropina` AS `totalPropina`,`bdclick3`.`bdfactura`.`sisteCredito` AS `sisteCredito`,`bdclick3`.`bdfactura`.`bodega` AS `bodega` from ((`bdclick3`.`bdfactura` left join `bdclick3`.`bdprestamo` on((`bdclick3`.`bdfactura`.`idFactura` = `bdclick3`.`bdprestamo`.`factura`))) left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdfactura`.`cliente` = `bdclick3`.`bdterceros`.`idSistema`))) group by `bdclick3`.`bdfactura`.`idFactura`,cast(substr(`bdclick3`.`bdfactura`.`idFactura`,6,100) as signed),`bdclick3`.`bdterceros`.`nombre`,`bdclick3`.`bdterceros`.`id`,`bdclick3`.`bdfactura`.`vendedor`,`bdclick3`.`bdfactura`.`red`,`bdclick3`.`bdfactura`.`fechaVencimiento`,`bdclick3`.`bdfactura`.`efectivoGeneral`,`bdclick3`.`bdfactura`.`ncGeneral`,`bdclick3`.`bdfactura`.`chequeGeneral`,`bdclick3`.`bdfactura`.`targetaGeneral`,`bdclick3`.`bdfactura`.`totalGeneral`,`bdclick3`.`bdfactura`.`descuentoGeneral`,`bdclick3`.`bdfactura`.`ivaGeneral`,`bdclick3`.`bdfactura`.`subtotalGeneral`,`bdclick3`.`bdfactura`.`comprobante`,`bdclick3`.`bdfactura`.`cotizacion`,`bdclick3`.`bdfactura`.`anulada`,`bdclick3`.`bdfactura`.`anula`,`bdclick3`.`bdfactura`.`credito`,`bdclick3`.`bdfactura`.`cxc`,`bdclick3`.`bdfactura`.`usuario`,`bdclick3`.`bdfactura`.`rtIva`,`bdclick3`.`bdfactura`.`rtIca`,`bdclick3`.`bdfactura`.`rtFuente`,`bdclick3`.`bdfactura`.`otros`,`bdclick3`.`bdfactura`.`anulada1`,`bdclick3`.`bdfactura`.`anula1`,`bdclick3`.`bdfactura`.`credito1`,`bdclick3`.`bdfactura`.`cxc1`,`bdclick3`.`bdfactura`.`usuario1`,`bdclick3`.`bdfactura`.`fechaAlerta`,`bdclick3`.`bdfactura`.`terminal`,`bdclick3`.`bdfactura`.`estadoGeneral`,`bdclick3`.`bdfactura`.`estado2`,`bdclick3`.`bdfactura`.`devuelta`,`bdclick3`.`bdfactura`.`resolucion`,`bdclick3`.`bdfactura`.`fechaAnulacion`,`bdclick3`.`bdfactura`.`cuadreAnulacion`,`bdclick3`.`bdfactura`.`usuarioAnula`,`bdclick3`.`bdfactura`.`placa`,`bdclick3`.`bdfactura`.`garantia`,`bdclick3`.`bdfactura`.`diasGarantia`,`bdclick3`.`bdfactura`.`rango`,`bdclick3`.`bdfactura`.`conseMesa`,`bdclick3`.`bdfactura`.`factura`,`bdclick3`.`bdfactura`.`copago`,`bdclick3`.`bdprestamo`.`cuotaInicial`,`bdclick3`.`bdfactura`.`turno`,`bdclick3`.`bdfactura`.`impuesto`,`bdclick3`.`bdterceros`.`idSistema`,cast(format(`bdclick3`.`bdfactura`.`fechaFactura`,\'yyyy/mm/dd\') as date),`bdclick3`.`bdfactura`.`impoGeneral`,cast(format(`bdclick3`.`bdfactura`.`fechaFactura`,\'yyyy/mm/dd\') as date),`bdclick3`.`bdfactura`.`tarjetaCredito`,`bdclick3`.`bdfactura`.`franquisia`,`bdclick3`.`bdfactura`.`hora`,`bdclick3`.`bdfactura`.`valorComision`,`bdclick3`.`bdfactura`.`totalPropina`,`bdclick3`.`bdfactura`.`sisteCredito`,`bdclick3`.`bdfactura`.`bodega` order by cast(substr(`bdclick3`.`bdfactura`.`idFactura`,6,100) as signed))
md5=0567e7116783cbd51467b6775146c870
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:50
create-version=2
source=(select `bdfactura`.`idFactura` AS `idFactura`,cast(substr(`bdfactura`.`idFactura`,6,100) as signed) AS `ordenId`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`id` AS `cliente`,`bdfactura`.`vendedor` AS `vendedor`,`bdfactura`.`red` AS `red`,`bdfactura`.`fechaVencimiento` AS `fechaVencimiento`,`bdfactura`.`efectivoGeneral` AS `efectivoGeneral`,`bdfactura`.`ncGeneral` AS `ncGeneral`,`bdfactura`.`chequeGeneral` AS `chequeGeneral`,`bdfactura`.`targetaGeneral` AS `targetaGeneral`,`bdfactura`.`totalGeneral` AS `totalGeneral`,`bdfactura`.`descuentoGeneral` AS `descuentoGeneral`,`bdfactura`.`ivaGeneral` AS `ivaGeneral`,`bdfactura`.`subtotalGeneral` AS `subtotalGeneral`,`bdfactura`.`comprobante` AS `comprobante`,`bdfactura`.`cotizacion` AS `cotizacion`,`bdfactura`.`anulada` AS `anulada`,`bdfactura`.`anula` AS `anula`,`bdfactura`.`credito` AS `credito`,`bdfactura`.`cxc` AS `cxc`,`bdfactura`.`usuario` AS `usuario`,`bdfactura`.`rtIva` AS `rtIva`,`bdfactura`.`rtIca` AS `rtIca`,`bdfactura`.`rtFuente` AS `rtFuente`,`bdfactura`.`otros` AS `otros`,`bdfactura`.`observacion` AS `observacion`,`bdfactura`.`anulada1` AS `anulada1`,`bdfactura`.`anula1` AS `anula1`,`bdfactura`.`credito1` AS `credito1`,`bdfactura`.`cxc1` AS `cxc1`,`bdfactura`.`usuario1` AS `usuario1`,`bdfactura`.`fechaAlerta` AS `fechaAlerta`,`bdfactura`.`terminal` AS `terminal`,`bdfactura`.`estadoGeneral` AS `estadoGeneral`,`bdfactura`.`estado2` AS `estado2`,`bdfactura`.`devuelta` AS `devuelta`,`bdfactura`.`factura` AS `factura`,`bdfactura`.`resolucion` AS `resolucion`,`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdfactura`.`usuarioAnula` AS `usuarioAnula`,`bdfactura`.`placa` AS `placa`,`bdfactura`.`garantia` AS `garantia`,`bdfactura`.`diasGarantia` AS `diasGarantia`,`bdfactura`.`rango` AS `rango`,`bdfactura`.`terminos` AS `terminos`,`bdfactura`.`notaAnulacion` AS `notaAnulacion`,`bdfactura`.`conseMesa` AS `conseMesa`,`bdfactura`.`factura` AS `id2`,`bdfactura`.`copago` AS `copago`,`bdprestamo`.`cuotaInicial` AS `cuotaInicial2`,cast(`bdfactura`.`fechaFactura` as date) AS `fechaFactura`,`bdfactura`.`turno` AS `turno`,`bdfactura`.`impuesto` AS `impuesto`,`bdterceros`.`idSistema` AS `idSistema`,cast(`bdfactura`.`fechaFactura` as date) AS `fechaFactura1`,`bdfactura`.`impoGeneral` AS `impoconsumo`,`bdfactura`.`tarjetaCredito` AS `tarjetaCredito`,`bdfactura`.`franquisia` AS `franquisia`,`bdfactura`.`hora` AS `hora`,`bdfactura`.`valorComision` AS `valorComision`,`bdfactura`.`totalPropina` AS `totalPropina`,`bdfactura`.`sisteCredito` AS `sisteCredito`,`bdfactura`.`bodega` AS `bodega` from ((`bdfactura` left join `bdprestamo` on((`bdfactura`.`idFactura` = `bdprestamo`.`factura`))) left join `bdterceros` on((`bdfactura`.`cliente` = `bdterceros`.`idSistema`))) group by `bdfactura`.`idFactura`,cast(substr(`bdfactura`.`idFactura`,6,100) as signed),`bdterceros`.`nombre`,`bdterceros`.`id`,`bdfactura`.`vendedor`,`bdfactura`.`red`,`bdfactura`.`fechaVencimiento`,`bdfactura`.`efectivoGeneral`,`bdfactura`.`ncGeneral`,`bdfactura`.`chequeGeneral`,`bdfactura`.`targetaGeneral`,`bdfactura`.`totalGeneral`,`bdfactura`.`descuentoGeneral`,`bdfactura`.`ivaGeneral`,`bdfactura`.`subtotalGeneral`,`bdfactura`.`comprobante`,`bdfactura`.`cotizacion`,`bdfactura`.`anulada`,`bdfactura`.`anula`,`bdfactura`.`credito`,`bdfactura`.`cxc`,`bdfactura`.`usuario`,`bdfactura`.`rtIva`,`bdfactura`.`rtIca`,`bdfactura`.`rtFuente`,`bdfactura`.`otros`,`bdfactura`.`anulada1`,`bdfactura`.`anula1`,`bdfactura`.`credito1`,`bdfactura`.`cxc1`,`bdfactura`.`usuario1`,`bdfactura`.`fechaAlerta`,`bdfactura`.`terminal`,`bdfactura`.`estadoGeneral`,`bdfactura`.`estado2`,`bdfactura`.`devuelta`,`bdfactura`.`resolucion`,`bdfactura`.`fechaAnulacion`,`bdfactura`.`cuadreAnulacion`,`bdfactura`.`usuarioAnula`,`bdfactura`.`placa`,`bdfactura`.`garantia`,`bdfactura`.`diasGarantia`,`bdfactura`.`rango`,`bdfactura`.`conseMesa`,`bdfactura`.`factura`,`bdfactura`.`copago`,`bdprestamo`.`cuotaInicial`,`bdfactura`.`turno`,`bdfactura`.`impuesto`,`bdterceros`.`idSistema`,cast(format(`bdfactura`.`fechaFactura`,\'yyyy/mm/dd\') as date),`bdfactura`.`impoGeneral`,cast(format(`bdfactura`.`fechaFactura`,\'yyyy/mm/dd\') as date),`bdfactura`.`tarjetaCredito`,`bdfactura`.`franquisia`,`bdfactura`.`hora`,`bdfactura`.`valorComision`,`bdfactura`.`totalPropina`,`bdfactura`.`sisteCredito`,`bdfactura`.`bodega` order by cast(substr(`bdfactura`.`idFactura`,6,100) as signed))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bdfactura`.`idFactura` AS `idFactura`,cast(substr(`bdclick3`.`bdfactura`.`idFactura`,6,100) as signed) AS `ordenId`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdterceros`.`id` AS `cliente`,`bdclick3`.`bdfactura`.`vendedor` AS `vendedor`,`bdclick3`.`bdfactura`.`red` AS `red`,`bdclick3`.`bdfactura`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick3`.`bdfactura`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick3`.`bdfactura`.`ncGeneral` AS `ncGeneral`,`bdclick3`.`bdfactura`.`chequeGeneral` AS `chequeGeneral`,`bdclick3`.`bdfactura`.`targetaGeneral` AS `targetaGeneral`,`bdclick3`.`bdfactura`.`totalGeneral` AS `totalGeneral`,`bdclick3`.`bdfactura`.`descuentoGeneral` AS `descuentoGeneral`,`bdclick3`.`bdfactura`.`ivaGeneral` AS `ivaGeneral`,`bdclick3`.`bdfactura`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick3`.`bdfactura`.`comprobante` AS `comprobante`,`bdclick3`.`bdfactura`.`cotizacion` AS `cotizacion`,`bdclick3`.`bdfactura`.`anulada` AS `anulada`,`bdclick3`.`bdfactura`.`anula` AS `anula`,`bdclick3`.`bdfactura`.`credito` AS `credito`,`bdclick3`.`bdfactura`.`cxc` AS `cxc`,`bdclick3`.`bdfactura`.`usuario` AS `usuario`,`bdclick3`.`bdfactura`.`rtIva` AS `rtIva`,`bdclick3`.`bdfactura`.`rtIca` AS `rtIca`,`bdclick3`.`bdfactura`.`rtFuente` AS `rtFuente`,`bdclick3`.`bdfactura`.`otros` AS `otros`,`bdclick3`.`bdfactura`.`observacion` AS `observacion`,`bdclick3`.`bdfactura`.`anulada1` AS `anulada1`,`bdclick3`.`bdfactura`.`anula1` AS `anula1`,`bdclick3`.`bdfactura`.`credito1` AS `credito1`,`bdclick3`.`bdfactura`.`cxc1` AS `cxc1`,`bdclick3`.`bdfactura`.`usuario1` AS `usuario1`,`bdclick3`.`bdfactura`.`fechaAlerta` AS `fechaAlerta`,`bdclick3`.`bdfactura`.`terminal` AS `terminal`,`bdclick3`.`bdfactura`.`estadoGeneral` AS `estadoGeneral`,`bdclick3`.`bdfactura`.`estado2` AS `estado2`,`bdclick3`.`bdfactura`.`devuelta` AS `devuelta`,`bdclick3`.`bdfactura`.`factura` AS `factura`,`bdclick3`.`bdfactura`.`resolucion` AS `resolucion`,`bdclick3`.`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,`bdclick3`.`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick3`.`bdfactura`.`usuarioAnula` AS `usuarioAnula`,`bdclick3`.`bdfactura`.`placa` AS `placa`,`bdclick3`.`bdfactura`.`garantia` AS `garantia`,`bdclick3`.`bdfactura`.`diasGarantia` AS `diasGarantia`,`bdclick3`.`bdfactura`.`rango` AS `rango`,`bdclick3`.`bdfactura`.`terminos` AS `terminos`,`bdclick3`.`bdfactura`.`notaAnulacion` AS `notaAnulacion`,`bdclick3`.`bdfactura`.`conseMesa` AS `conseMesa`,`bdclick3`.`bdfactura`.`factura` AS `id2`,`bdclick3`.`bdfactura`.`copago` AS `copago`,`bdclick3`.`bdprestamo`.`cuotaInicial` AS `cuotaInicial2`,cast(`bdclick3`.`bdfactura`.`fechaFactura` as date) AS `fechaFactura`,`bdclick3`.`bdfactura`.`turno` AS `turno`,`bdclick3`.`bdfactura`.`impuesto` AS `impuesto`,`bdclick3`.`bdterceros`.`idSistema` AS `idSistema`,cast(`bdclick3`.`bdfactura`.`fechaFactura` as date) AS `fechaFactura1`,`bdclick3`.`bdfactura`.`impoGeneral` AS `impoconsumo`,`bdclick3`.`bdfactura`.`tarjetaCredito` AS `tarjetaCredito`,`bdclick3`.`bdfactura`.`franquisia` AS `franquisia`,`bdclick3`.`bdfactura`.`hora` AS `hora`,`bdclick3`.`bdfactura`.`valorComision` AS `valorComision`,`bdclick3`.`bdfactura`.`totalPropina` AS `totalPropina`,`bdclick3`.`bdfactura`.`sisteCredito` AS `sisteCredito`,`bdclick3`.`bdfactura`.`bodega` AS `bodega` from ((`bdclick3`.`bdfactura` left join `bdclick3`.`bdprestamo` on((`bdclick3`.`bdfactura`.`idFactura` = `bdclick3`.`bdprestamo`.`factura`))) left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdfactura`.`cliente` = `bdclick3`.`bdterceros`.`idSistema`))) group by `bdclick3`.`bdfactura`.`idFactura`,cast(substr(`bdclick3`.`bdfactura`.`idFactura`,6,100) as signed),`bdclick3`.`bdterceros`.`nombre`,`bdclick3`.`bdterceros`.`id`,`bdclick3`.`bdfactura`.`vendedor`,`bdclick3`.`bdfactura`.`red`,`bdclick3`.`bdfactura`.`fechaVencimiento`,`bdclick3`.`bdfactura`.`efectivoGeneral`,`bdclick3`.`bdfactura`.`ncGeneral`,`bdclick3`.`bdfactura`.`chequeGeneral`,`bdclick3`.`bdfactura`.`targetaGeneral`,`bdclick3`.`bdfactura`.`totalGeneral`,`bdclick3`.`bdfactura`.`descuentoGeneral`,`bdclick3`.`bdfactura`.`ivaGeneral`,`bdclick3`.`bdfactura`.`subtotalGeneral`,`bdclick3`.`bdfactura`.`comprobante`,`bdclick3`.`bdfactura`.`cotizacion`,`bdclick3`.`bdfactura`.`anulada`,`bdclick3`.`bdfactura`.`anula`,`bdclick3`.`bdfactura`.`credito`,`bdclick3`.`bdfactura`.`cxc`,`bdclick3`.`bdfactura`.`usuario`,`bdclick3`.`bdfactura`.`rtIva`,`bdclick3`.`bdfactura`.`rtIca`,`bdclick3`.`bdfactura`.`rtFuente`,`bdclick3`.`bdfactura`.`otros`,`bdclick3`.`bdfactura`.`anulada1`,`bdclick3`.`bdfactura`.`anula1`,`bdclick3`.`bdfactura`.`credito1`,`bdclick3`.`bdfactura`.`cxc1`,`bdclick3`.`bdfactura`.`usuario1`,`bdclick3`.`bdfactura`.`fechaAlerta`,`bdclick3`.`bdfactura`.`terminal`,`bdclick3`.`bdfactura`.`estadoGeneral`,`bdclick3`.`bdfactura`.`estado2`,`bdclick3`.`bdfactura`.`devuelta`,`bdclick3`.`bdfactura`.`resolucion`,`bdclick3`.`bdfactura`.`fechaAnulacion`,`bdclick3`.`bdfactura`.`cuadreAnulacion`,`bdclick3`.`bdfactura`.`usuarioAnula`,`bdclick3`.`bdfactura`.`placa`,`bdclick3`.`bdfactura`.`garantia`,`bdclick3`.`bdfactura`.`diasGarantia`,`bdclick3`.`bdfactura`.`rango`,`bdclick3`.`bdfactura`.`conseMesa`,`bdclick3`.`bdfactura`.`factura`,`bdclick3`.`bdfactura`.`copago`,`bdclick3`.`bdprestamo`.`cuotaInicial`,`bdclick3`.`bdfactura`.`turno`,`bdclick3`.`bdfactura`.`impuesto`,`bdclick3`.`bdterceros`.`idSistema`,cast(format(`bdclick3`.`bdfactura`.`fechaFactura`,\'yyyy/mm/dd\') as date),`bdclick3`.`bdfactura`.`impoGeneral`,cast(format(`bdclick3`.`bdfactura`.`fechaFactura`,\'yyyy/mm/dd\') as date),`bdclick3`.`bdfactura`.`tarjetaCredito`,`bdclick3`.`bdfactura`.`franquisia`,`bdclick3`.`bdfactura`.`hora`,`bdclick3`.`bdfactura`.`valorComision`,`bdclick3`.`bdfactura`.`totalPropina`,`bdclick3`.`bdfactura`.`sisteCredito`,`bdclick3`.`bdfactura`.`bodega` order by cast(substr(`bdclick3`.`bdfactura`.`idFactura`,6,100) as signed))
mariadb-version=100135