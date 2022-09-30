TYPE=VIEW
query=select `bdclick3`.`bdabonos`.`id` AS `id`,`bdclick3`.`bdabonos`.`cliente` AS `cliente`,`bdclick3`.`bdabonos`.`vendedor` AS `vendedor`,`bdclick3`.`bdabonos`.`red` AS `red`,`bdclick3`.`bdabonos`.`fechaFactura` AS `fechaFactura1`,`bdclick3`.`bdabonos`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick3`.`bdabonos`.`efectivo` AS `efectivo`,`bdclick3`.`bdabonos`.`nc` AS `nc`,`bdclick3`.`bdabonos`.`cheque` AS `cheque`,`bdclick3`.`bdabonos`.`targeta` AS `targeta`,`bdclick3`.`bdabonos`.`total` AS `total`,`bdclick3`.`bdabonos`.`descuentos` AS `descuentos`,`bdclick3`.`bdabonos`.`iva` AS `iva`,`bdclick3`.`bdabonos`.`subtotal` AS `subtotal`,`bdclick3`.`bdabonos`.`comprobante` AS `comprobante`,`bdclick3`.`bdabonos`.`cotizacion` AS `cotizacion`,`bdclick3`.`bdabonos`.`anulada` AS `anulada`,`bdclick3`.`bdabonos`.`anula` AS `anula`,`bdclick3`.`bdabonos`.`credito` AS `credito`,`bdclick3`.`bdabonos`.`cxc` AS `cxc`,`bdclick3`.`bdabonos`.`usuario` AS `usuario`,`bdclick3`.`bdabonos`.`rtIva` AS `rtIva`,`bdclick3`.`bdabonos`.`rtIca` AS `rtIca`,`bdclick3`.`bdabonos`.`rtFuente` AS `rtFuente`,`bdclick3`.`bdabonos`.`otros` AS `otros`,`bdclick3`.`bdabonos`.`observacion` AS `observacion`,`bdclick3`.`bdabonos`.`anulada1` AS `anulada1`,`bdclick3`.`bdabonos`.`anula1` AS `anula1`,`bdclick3`.`bdabonos`.`credito1` AS `credito1`,`bdclick3`.`bdabonos`.`cxc1` AS `cxc1`,`bdclick3`.`bdabonos`.`usuario1` AS `usuario1`,`bdclick3`.`bdabonos`.`fechaAlerta` AS `fechaAlerta`,`bdclick3`.`bdabonos`.`terminal` AS `terminal`,`bdclick3`.`bdabonos`.`estado` AS `estado`,`bdclick3`.`bdabonos`.`estado2` AS `estado2`,`bdclick3`.`bdabonos`.`devuelta` AS `devuelta`,`bdclick3`.`bdabonos`.`factura` AS `factura`,`bdclick3`.`bdabonos`.`resolucion` AS `resolucion`,`bdclick3`.`bdabonos`.`fechaAnulacion` AS `fechaAnulacion`,`bdclick3`.`bdabonos`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick3`.`bdabonos`.`usuarioAnula` AS `usuarioAnula`,`bdclick3`.`bdabonos`.`copago` AS `copago`,`bdclick3`.`bdabonos`.`placa` AS `placa`,`bdclick3`.`bdabonos`.`garantia` AS `garantia`,`bdclick3`.`bdabonos`.`diasGarantia` AS `diasGarantia`,`bdclick3`.`bdabonos`.`rango` AS `rango`,`bdclick3`.`bdabonos`.`terminos` AS `terminos`,`bdclick3`.`bdabonos`.`notaAnulacion` AS `notaAnulacion`,`bdclick3`.`bdabonos`.`conseMesa` AS `conseMesa`,0 AS `cuotaInicial2`,`bdclick3`.`bdabonos`.`fechaFactura` AS `fechaFactura` from `bdclick3`.`bdabonos`
md5=5137972223d62946d7e7c029bb282688
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:47
create-version=2
source=select `bdabonos`.`id` AS `id`,`bdabonos`.`cliente` AS `cliente`,`bdabonos`.`vendedor` AS `vendedor`,`bdabonos`.`red` AS `red`,`bdabonos`.`fechaFactura` AS `fechaFactura1`,`bdabonos`.`fechaVencimiento` AS `fechaVencimiento`,`bdabonos`.`efectivo` AS `efectivo`,`bdabonos`.`nc` AS `nc`,`bdabonos`.`cheque` AS `cheque`,`bdabonos`.`targeta` AS `targeta`,`bdabonos`.`total` AS `total`,`bdabonos`.`descuentos` AS `descuentos`,`bdabonos`.`iva` AS `iva`,`bdabonos`.`subtotal` AS `subtotal`,`bdabonos`.`comprobante` AS `comprobante`,`bdabonos`.`cotizacion` AS `cotizacion`,`bdabonos`.`anulada` AS `anulada`,`bdabonos`.`anula` AS `anula`,`bdabonos`.`credito` AS `credito`,`bdabonos`.`cxc` AS `cxc`,`bdabonos`.`usuario` AS `usuario`,`bdabonos`.`rtIva` AS `rtIva`,`bdabonos`.`rtIca` AS `rtIca`,`bdabonos`.`rtFuente` AS `rtFuente`,`bdabonos`.`otros` AS `otros`,`bdabonos`.`observacion` AS `observacion`,`bdabonos`.`anulada1` AS `anulada1`,`bdabonos`.`anula1` AS `anula1`,`bdabonos`.`credito1` AS `credito1`,`bdabonos`.`cxc1` AS `cxc1`,`bdabonos`.`usuario1` AS `usuario1`,`bdabonos`.`fechaAlerta` AS `fechaAlerta`,`bdabonos`.`terminal` AS `terminal`,`bdabonos`.`estado` AS `estado`,`bdabonos`.`estado2` AS `estado2`,`bdabonos`.`devuelta` AS `devuelta`,`bdabonos`.`factura` AS `factura`,`bdabonos`.`resolucion` AS `resolucion`,`bdabonos`.`fechaAnulacion` AS `fechaAnulacion`,`bdabonos`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdabonos`.`usuarioAnula` AS `usuarioAnula`,`bdabonos`.`copago` AS `copago`,`bdabonos`.`placa` AS `placa`,`bdabonos`.`garantia` AS `garantia`,`bdabonos`.`diasGarantia` AS `diasGarantia`,`bdabonos`.`rango` AS `rango`,`bdabonos`.`terminos` AS `terminos`,`bdabonos`.`notaAnulacion` AS `notaAnulacion`,`bdabonos`.`conseMesa` AS `conseMesa`,0 AS `cuotaInicial2`,`bdabonos`.`fechaFactura` AS `fechaFactura` from `bdabonos`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdabonos`.`id` AS `id`,`bdclick3`.`bdabonos`.`cliente` AS `cliente`,`bdclick3`.`bdabonos`.`vendedor` AS `vendedor`,`bdclick3`.`bdabonos`.`red` AS `red`,`bdclick3`.`bdabonos`.`fechaFactura` AS `fechaFactura1`,`bdclick3`.`bdabonos`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick3`.`bdabonos`.`efectivo` AS `efectivo`,`bdclick3`.`bdabonos`.`nc` AS `nc`,`bdclick3`.`bdabonos`.`cheque` AS `cheque`,`bdclick3`.`bdabonos`.`targeta` AS `targeta`,`bdclick3`.`bdabonos`.`total` AS `total`,`bdclick3`.`bdabonos`.`descuentos` AS `descuentos`,`bdclick3`.`bdabonos`.`iva` AS `iva`,`bdclick3`.`bdabonos`.`subtotal` AS `subtotal`,`bdclick3`.`bdabonos`.`comprobante` AS `comprobante`,`bdclick3`.`bdabonos`.`cotizacion` AS `cotizacion`,`bdclick3`.`bdabonos`.`anulada` AS `anulada`,`bdclick3`.`bdabonos`.`anula` AS `anula`,`bdclick3`.`bdabonos`.`credito` AS `credito`,`bdclick3`.`bdabonos`.`cxc` AS `cxc`,`bdclick3`.`bdabonos`.`usuario` AS `usuario`,`bdclick3`.`bdabonos`.`rtIva` AS `rtIva`,`bdclick3`.`bdabonos`.`rtIca` AS `rtIca`,`bdclick3`.`bdabonos`.`rtFuente` AS `rtFuente`,`bdclick3`.`bdabonos`.`otros` AS `otros`,`bdclick3`.`bdabonos`.`observacion` AS `observacion`,`bdclick3`.`bdabonos`.`anulada1` AS `anulada1`,`bdclick3`.`bdabonos`.`anula1` AS `anula1`,`bdclick3`.`bdabonos`.`credito1` AS `credito1`,`bdclick3`.`bdabonos`.`cxc1` AS `cxc1`,`bdclick3`.`bdabonos`.`usuario1` AS `usuario1`,`bdclick3`.`bdabonos`.`fechaAlerta` AS `fechaAlerta`,`bdclick3`.`bdabonos`.`terminal` AS `terminal`,`bdclick3`.`bdabonos`.`estado` AS `estado`,`bdclick3`.`bdabonos`.`estado2` AS `estado2`,`bdclick3`.`bdabonos`.`devuelta` AS `devuelta`,`bdclick3`.`bdabonos`.`factura` AS `factura`,`bdclick3`.`bdabonos`.`resolucion` AS `resolucion`,`bdclick3`.`bdabonos`.`fechaAnulacion` AS `fechaAnulacion`,`bdclick3`.`bdabonos`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick3`.`bdabonos`.`usuarioAnula` AS `usuarioAnula`,`bdclick3`.`bdabonos`.`copago` AS `copago`,`bdclick3`.`bdabonos`.`placa` AS `placa`,`bdclick3`.`bdabonos`.`garantia` AS `garantia`,`bdclick3`.`bdabonos`.`diasGarantia` AS `diasGarantia`,`bdclick3`.`bdabonos`.`rango` AS `rango`,`bdclick3`.`bdabonos`.`terminos` AS `terminos`,`bdclick3`.`bdabonos`.`notaAnulacion` AS `notaAnulacion`,`bdclick3`.`bdabonos`.`conseMesa` AS `conseMesa`,0 AS `cuotaInicial2`,`bdclick3`.`bdabonos`.`fechaFactura` AS `fechaFactura` from `bdclick3`.`bdabonos`
mariadb-version=100135