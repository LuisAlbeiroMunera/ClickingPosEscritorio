TYPE=VIEW
query=select `bdclick5`.`bdabonos`.`id` AS `id`,`bdclick5`.`bdabonos`.`cliente` AS `cliente`,`bdclick5`.`bdabonos`.`vendedor` AS `vendedor`,`bdclick5`.`bdabonos`.`red` AS `red`,`bdclick5`.`bdabonos`.`fechaFactura` AS `fechaFactura1`,`bdclick5`.`bdabonos`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick5`.`bdabonos`.`efectivo` AS `efectivo`,`bdclick5`.`bdabonos`.`nc` AS `nc`,`bdclick5`.`bdabonos`.`cheque` AS `cheque`,`bdclick5`.`bdabonos`.`targeta` AS `targeta`,`bdclick5`.`bdabonos`.`total` AS `total`,`bdclick5`.`bdabonos`.`descuentos` AS `descuentos`,`bdclick5`.`bdabonos`.`iva` AS `iva`,`bdclick5`.`bdabonos`.`subtotal` AS `subtotal`,`bdclick5`.`bdabonos`.`comprobante` AS `comprobante`,`bdclick5`.`bdabonos`.`cotizacion` AS `cotizacion`,`bdclick5`.`bdabonos`.`anulada` AS `anulada`,`bdclick5`.`bdabonos`.`anula` AS `anula`,`bdclick5`.`bdabonos`.`credito` AS `credito`,`bdclick5`.`bdabonos`.`cxc` AS `cxc`,`bdclick5`.`bdabonos`.`usuario` AS `usuario`,`bdclick5`.`bdabonos`.`rtIva` AS `rtIva`,`bdclick5`.`bdabonos`.`rtIca` AS `rtIca`,`bdclick5`.`bdabonos`.`rtFuente` AS `rtFuente`,`bdclick5`.`bdabonos`.`otros` AS `otros`,`bdclick5`.`bdabonos`.`observacion` AS `observacion`,`bdclick5`.`bdabonos`.`anulada1` AS `anulada1`,`bdclick5`.`bdabonos`.`anula1` AS `anula1`,`bdclick5`.`bdabonos`.`credito1` AS `credito1`,`bdclick5`.`bdabonos`.`cxc1` AS `cxc1`,`bdclick5`.`bdabonos`.`usuario1` AS `usuario1`,`bdclick5`.`bdabonos`.`fechaAlerta` AS `fechaAlerta`,`bdclick5`.`bdabonos`.`terminal` AS `terminal`,`bdclick5`.`bdabonos`.`estado` AS `estado`,`bdclick5`.`bdabonos`.`estado2` AS `estado2`,`bdclick5`.`bdabonos`.`devuelta` AS `devuelta`,`bdclick5`.`bdabonos`.`factura` AS `factura`,`bdclick5`.`bdabonos`.`resolucion` AS `resolucion`,`bdclick5`.`bdabonos`.`fechaAnulacion` AS `fechaAnulacion`,`bdclick5`.`bdabonos`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick5`.`bdabonos`.`usuarioAnula` AS `usuarioAnula`,`bdclick5`.`bdabonos`.`copago` AS `copago`,`bdclick5`.`bdabonos`.`placa` AS `placa`,`bdclick5`.`bdabonos`.`garantia` AS `garantia`,`bdclick5`.`bdabonos`.`diasGarantia` AS `diasGarantia`,`bdclick5`.`bdabonos`.`rango` AS `rango`,`bdclick5`.`bdabonos`.`terminos` AS `terminos`,`bdclick5`.`bdabonos`.`notaAnulacion` AS `notaAnulacion`,`bdclick5`.`bdabonos`.`conseMesa` AS `conseMesa`,0 AS `cuotaInicial2`,`bdclick5`.`bdabonos`.`fechaFactura` AS `fechaFactura` from `bdclick5`.`bdabonos`
md5=fce8a9fac3db4764b06a6d37bf89b0b6
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:43
create-version=2
source=select `bdabonos`.`id` AS `id`,`bdabonos`.`cliente` AS `cliente`,`bdabonos`.`vendedor` AS `vendedor`,`bdabonos`.`red` AS `red`,`bdabonos`.`fechaFactura` AS `fechaFactura1`,`bdabonos`.`fechaVencimiento` AS `fechaVencimiento`,`bdabonos`.`efectivo` AS `efectivo`,`bdabonos`.`nc` AS `nc`,`bdabonos`.`cheque` AS `cheque`,`bdabonos`.`targeta` AS `targeta`,`bdabonos`.`total` AS `total`,`bdabonos`.`descuentos` AS `descuentos`,`bdabonos`.`iva` AS `iva`,`bdabonos`.`subtotal` AS `subtotal`,`bdabonos`.`comprobante` AS `comprobante`,`bdabonos`.`cotizacion` AS `cotizacion`,`bdabonos`.`anulada` AS `anulada`,`bdabonos`.`anula` AS `anula`,`bdabonos`.`credito` AS `credito`,`bdabonos`.`cxc` AS `cxc`,`bdabonos`.`usuario` AS `usuario`,`bdabonos`.`rtIva` AS `rtIva`,`bdabonos`.`rtIca` AS `rtIca`,`bdabonos`.`rtFuente` AS `rtFuente`,`bdabonos`.`otros` AS `otros`,`bdabonos`.`observacion` AS `observacion`,`bdabonos`.`anulada1` AS `anulada1`,`bdabonos`.`anula1` AS `anula1`,`bdabonos`.`credito1` AS `credito1`,`bdabonos`.`cxc1` AS `cxc1`,`bdabonos`.`usuario1` AS `usuario1`,`bdabonos`.`fechaAlerta` AS `fechaAlerta`,`bdabonos`.`terminal` AS `terminal`,`bdabonos`.`estado` AS `estado`,`bdabonos`.`estado2` AS `estado2`,`bdabonos`.`devuelta` AS `devuelta`,`bdabonos`.`factura` AS `factura`,`bdabonos`.`resolucion` AS `resolucion`,`bdabonos`.`fechaAnulacion` AS `fechaAnulacion`,`bdabonos`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdabonos`.`usuarioAnula` AS `usuarioAnula`,`bdabonos`.`copago` AS `copago`,`bdabonos`.`placa` AS `placa`,`bdabonos`.`garantia` AS `garantia`,`bdabonos`.`diasGarantia` AS `diasGarantia`,`bdabonos`.`rango` AS `rango`,`bdabonos`.`terminos` AS `terminos`,`bdabonos`.`notaAnulacion` AS `notaAnulacion`,`bdabonos`.`conseMesa` AS `conseMesa`,0 AS `cuotaInicial2`,`bdabonos`.`fechaFactura` AS `fechaFactura` from `bdabonos`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdabonos`.`id` AS `id`,`bdclick5`.`bdabonos`.`cliente` AS `cliente`,`bdclick5`.`bdabonos`.`vendedor` AS `vendedor`,`bdclick5`.`bdabonos`.`red` AS `red`,`bdclick5`.`bdabonos`.`fechaFactura` AS `fechaFactura1`,`bdclick5`.`bdabonos`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick5`.`bdabonos`.`efectivo` AS `efectivo`,`bdclick5`.`bdabonos`.`nc` AS `nc`,`bdclick5`.`bdabonos`.`cheque` AS `cheque`,`bdclick5`.`bdabonos`.`targeta` AS `targeta`,`bdclick5`.`bdabonos`.`total` AS `total`,`bdclick5`.`bdabonos`.`descuentos` AS `descuentos`,`bdclick5`.`bdabonos`.`iva` AS `iva`,`bdclick5`.`bdabonos`.`subtotal` AS `subtotal`,`bdclick5`.`bdabonos`.`comprobante` AS `comprobante`,`bdclick5`.`bdabonos`.`cotizacion` AS `cotizacion`,`bdclick5`.`bdabonos`.`anulada` AS `anulada`,`bdclick5`.`bdabonos`.`anula` AS `anula`,`bdclick5`.`bdabonos`.`credito` AS `credito`,`bdclick5`.`bdabonos`.`cxc` AS `cxc`,`bdclick5`.`bdabonos`.`usuario` AS `usuario`,`bdclick5`.`bdabonos`.`rtIva` AS `rtIva`,`bdclick5`.`bdabonos`.`rtIca` AS `rtIca`,`bdclick5`.`bdabonos`.`rtFuente` AS `rtFuente`,`bdclick5`.`bdabonos`.`otros` AS `otros`,`bdclick5`.`bdabonos`.`observacion` AS `observacion`,`bdclick5`.`bdabonos`.`anulada1` AS `anulada1`,`bdclick5`.`bdabonos`.`anula1` AS `anula1`,`bdclick5`.`bdabonos`.`credito1` AS `credito1`,`bdclick5`.`bdabonos`.`cxc1` AS `cxc1`,`bdclick5`.`bdabonos`.`usuario1` AS `usuario1`,`bdclick5`.`bdabonos`.`fechaAlerta` AS `fechaAlerta`,`bdclick5`.`bdabonos`.`terminal` AS `terminal`,`bdclick5`.`bdabonos`.`estado` AS `estado`,`bdclick5`.`bdabonos`.`estado2` AS `estado2`,`bdclick5`.`bdabonos`.`devuelta` AS `devuelta`,`bdclick5`.`bdabonos`.`factura` AS `factura`,`bdclick5`.`bdabonos`.`resolucion` AS `resolucion`,`bdclick5`.`bdabonos`.`fechaAnulacion` AS `fechaAnulacion`,`bdclick5`.`bdabonos`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick5`.`bdabonos`.`usuarioAnula` AS `usuarioAnula`,`bdclick5`.`bdabonos`.`copago` AS `copago`,`bdclick5`.`bdabonos`.`placa` AS `placa`,`bdclick5`.`bdabonos`.`garantia` AS `garantia`,`bdclick5`.`bdabonos`.`diasGarantia` AS `diasGarantia`,`bdclick5`.`bdabonos`.`rango` AS `rango`,`bdclick5`.`bdabonos`.`terminos` AS `terminos`,`bdclick5`.`bdabonos`.`notaAnulacion` AS `notaAnulacion`,`bdclick5`.`bdabonos`.`conseMesa` AS `conseMesa`,0 AS `cuotaInicial2`,`bdclick5`.`bdabonos`.`fechaFactura` AS `fechaFactura` from `bdclick5`.`bdabonos`
mariadb-version=100135