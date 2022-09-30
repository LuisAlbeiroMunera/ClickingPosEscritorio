TYPE=VIEW
query=select `bdclick5`.`bdcotizacion`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`bdcotizacion`.`cliente` AS `cliente`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdcotizacion`.`vendedor` AS `vendedor`,`bdclick5`.`bdcotizacion`.`observacion` AS `observacion`,`bdclick5`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick5`.`bdproductos`.`Descripcion` AS `Descripcion`,sum(`bdclick5`.`bdcotizacion`.`cant2`) AS `cantidad`,`bdclick5`.`bdcotizacion`.`lista` AS `lista`,sum(`bdclick5`.`bdcotizacion`.`subtotal`) AS `subtotal`,sum(`bdclick5`.`bdcotizacion`.`descuento`) AS `descuento`,`bdclick5`.`bdcotizacion`.`porcIva` AS `porcIva`,sum(`bdclick5`.`bdcotizacion`.`iva`) AS `iva`,sum(`bdclick5`.`bdcotizacion`.`total`) AS `total`,sum(`bdclick5`.`bdcotizacion`.`utilidad`) AS `utilidad`,`bdclick5`.`bdcotizacion`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick5`.`bdcotizacion`.`descuentoGeneral` AS `descuentoGeneral`,`bdclick5`.`bdcotizacion`.`otros` AS `otros`,`bdclick5`.`bdcotizacion`.`rtFuente` AS `rtFuente`,`bdclick5`.`bdcotizacion`.`rtIva` AS `rtIva`,`bdclick5`.`bdcotizacion`.`ivaGeneral` AS `ivaGeneral`,`bdclick5`.`bdcotizacion`.`totalGeneral` AS `totalGeneral`,`bdclick5`.`bdcotizacion`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick5`.`bdcotizacion`.`targetaGeneral` AS `targetaGeneral`,`bdclick5`.`bdcotizacion`.`chequeGeneral` AS `chequeGeneral`,`bdclick5`.`bdcotizacion`.`ncGeneral` AS `ncGeneral`,`bdclick5`.`bdcotizacion`.`tercero` AS `tercero`,`bdclick5`.`bdcotizacion`.`utilidad1` AS `utilidad1`,`bdclick5`.`bdcotizacion`.`idFactura` AS `idFactura`,`bdclick5`.`bdcotizacion`.`factura` AS `id2`,`bdclick5`.`bdcotizacion`.`credito` AS `credito`,`bdclick5`.`bdcotizacion`.`anulada` AS `anulada`,`bdclick5`.`bdterceros`.`id` AS `Id`,`bdclick5`.`bdproductos`.`grupo` AS `Grupo`,`bdclick5`.`bdproductos`.`idSistema` AS `producto`,`bdclick5`.`bdcotizacion`.`estadoGeneral` AS `estadoGeneral` from ((`bdclick5`.`bdcotizacion` left join `bdclick5`.`bdproductos` on((`bdclick5`.`bdcotizacion`.`producto` = `bdclick5`.`bdproductos`.`idSistema`))) left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdcotizacion`.`cliente` = `bdclick5`.`bdterceros`.`idSistema`))) group by `bdclick5`.`bdcotizacion`.`fechaFactura`,`bdclick5`.`bdcotizacion`.`cliente`,`bdclick5`.`bdterceros`.`nombre`,`bdclick5`.`bdcotizacion`.`vendedor`,`bdclick5`.`bdcotizacion`.`observacion`,`bdclick5`.`bdproductos`.`Codigo`,`bdclick5`.`bdcotizacion`.`lista`,`bdclick5`.`bdcotizacion`.`porcIva`,`bdclick5`.`bdcotizacion`.`subtotalGeneral`,`bdclick5`.`bdcotizacion`.`descuentoGeneral`,`bdclick5`.`bdcotizacion`.`otros`,`bdclick5`.`bdcotizacion`.`rtFuente`,`bdclick5`.`bdcotizacion`.`rtIva`,`bdclick5`.`bdcotizacion`.`ivaGeneral`,`bdclick5`.`bdcotizacion`.`totalGeneral`,`bdclick5`.`bdcotizacion`.`efectivoGeneral`,`bdclick5`.`bdcotizacion`.`targetaGeneral`,`bdclick5`.`bdcotizacion`.`chequeGeneral`,`bdclick5`.`bdcotizacion`.`ncGeneral`,`bdclick5`.`bdcotizacion`.`tercero`,`bdclick5`.`bdcotizacion`.`utilidad1`,`bdclick5`.`bdcotizacion`.`idFactura`,`bdclick5`.`bdcotizacion`.`factura`,`bdclick5`.`bdcotizacion`.`credito`,`bdclick5`.`bdcotizacion`.`anulada`,`bdclick5`.`bdterceros`.`id`,`bdclick5`.`bdproductos`.`grupo`,`bdclick5`.`bdproductos`.`idSistema`,`bdclick5`.`bdcotizacion`.`estadoGeneral`
md5=07f33e62830c691a56718c851734964d
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:49
create-version=2
source=select `bdcotizacion`.`fechaFactura` AS `fechaFactura`,`bdcotizacion`.`cliente` AS `cliente`,`bdterceros`.`nombre` AS `nombre`,`bdcotizacion`.`vendedor` AS `vendedor`,`bdcotizacion`.`observacion` AS `observacion`,`bdproductos`.`Codigo` AS `Codigo`,`bdproductos`.`Descripcion` AS `Descripcion`,sum(`bdcotizacion`.`cant2`) AS `cantidad`,`bdcotizacion`.`lista` AS `lista`,sum(`bdcotizacion`.`subtotal`) AS `subtotal`,sum(`bdcotizacion`.`descuento`) AS `descuento`,`bdcotizacion`.`porcIva` AS `porcIva`,sum(`bdcotizacion`.`iva`) AS `iva`,sum(`bdcotizacion`.`total`) AS `total`,sum(`bdcotizacion`.`utilidad`) AS `utilidad`,`bdcotizacion`.`subtotalGeneral` AS `subtotalGeneral`,`bdcotizacion`.`descuentoGeneral` AS `descuentoGeneral`,`bdcotizacion`.`otros` AS `otros`,`bdcotizacion`.`rtFuente` AS `rtFuente`,`bdcotizacion`.`rtIva` AS `rtIva`,`bdcotizacion`.`ivaGeneral` AS `ivaGeneral`,`bdcotizacion`.`totalGeneral` AS `totalGeneral`,`bdcotizacion`.`efectivoGeneral` AS `efectivoGeneral`,`bdcotizacion`.`targetaGeneral` AS `targetaGeneral`,`bdcotizacion`.`chequeGeneral` AS `chequeGeneral`,`bdcotizacion`.`ncGeneral` AS `ncGeneral`,`bdcotizacion`.`tercero` AS `tercero`,`bdcotizacion`.`utilidad1` AS `utilidad1`,`bdcotizacion`.`idFactura` AS `idFactura`,`bdcotizacion`.`factura` AS `id2`,`bdcotizacion`.`credito` AS `credito`,`bdcotizacion`.`anulada` AS `anulada`,`bdterceros`.`id` AS `Id`,`bdproductos`.`grupo` AS `Grupo`,`bdproductos`.`idSistema` AS `producto`,`bdcotizacion`.`estadoGeneral` AS `estadoGeneral` from ((`bdcotizacion` left join `bdproductos` on((`bdcotizacion`.`producto` = `bdproductos`.`idSistema`))) left join `bdterceros` on((`bdcotizacion`.`cliente` = `bdterceros`.`idSistema`))) group by `bdcotizacion`.`fechaFactura`,`bdcotizacion`.`cliente`,`bdterceros`.`nombre`,`bdcotizacion`.`vendedor`,`bdcotizacion`.`observacion`,`bdproductos`.`Codigo`,`bdcotizacion`.`lista`,`bdcotizacion`.`porcIva`,`bdcotizacion`.`subtotalGeneral`,`bdcotizacion`.`descuentoGeneral`,`bdcotizacion`.`otros`,`bdcotizacion`.`rtFuente`,`bdcotizacion`.`rtIva`,`bdcotizacion`.`ivaGeneral`,`bdcotizacion`.`totalGeneral`,`bdcotizacion`.`efectivoGeneral`,`bdcotizacion`.`targetaGeneral`,`bdcotizacion`.`chequeGeneral`,`bdcotizacion`.`ncGeneral`,`bdcotizacion`.`tercero`,`bdcotizacion`.`utilidad1`,`bdcotizacion`.`idFactura`,`bdcotizacion`.`factura`,`bdcotizacion`.`credito`,`bdcotizacion`.`anulada`,`bdterceros`.`id`,`bdproductos`.`grupo`,`bdproductos`.`idSistema`,`bdcotizacion`.`estadoGeneral`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdcotizacion`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`bdcotizacion`.`cliente` AS `cliente`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdcotizacion`.`vendedor` AS `vendedor`,`bdclick5`.`bdcotizacion`.`observacion` AS `observacion`,`bdclick5`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick5`.`bdproductos`.`Descripcion` AS `Descripcion`,sum(`bdclick5`.`bdcotizacion`.`cant2`) AS `cantidad`,`bdclick5`.`bdcotizacion`.`lista` AS `lista`,sum(`bdclick5`.`bdcotizacion`.`subtotal`) AS `subtotal`,sum(`bdclick5`.`bdcotizacion`.`descuento`) AS `descuento`,`bdclick5`.`bdcotizacion`.`porcIva` AS `porcIva`,sum(`bdclick5`.`bdcotizacion`.`iva`) AS `iva`,sum(`bdclick5`.`bdcotizacion`.`total`) AS `total`,sum(`bdclick5`.`bdcotizacion`.`utilidad`) AS `utilidad`,`bdclick5`.`bdcotizacion`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick5`.`bdcotizacion`.`descuentoGeneral` AS `descuentoGeneral`,`bdclick5`.`bdcotizacion`.`otros` AS `otros`,`bdclick5`.`bdcotizacion`.`rtFuente` AS `rtFuente`,`bdclick5`.`bdcotizacion`.`rtIva` AS `rtIva`,`bdclick5`.`bdcotizacion`.`ivaGeneral` AS `ivaGeneral`,`bdclick5`.`bdcotizacion`.`totalGeneral` AS `totalGeneral`,`bdclick5`.`bdcotizacion`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick5`.`bdcotizacion`.`targetaGeneral` AS `targetaGeneral`,`bdclick5`.`bdcotizacion`.`chequeGeneral` AS `chequeGeneral`,`bdclick5`.`bdcotizacion`.`ncGeneral` AS `ncGeneral`,`bdclick5`.`bdcotizacion`.`tercero` AS `tercero`,`bdclick5`.`bdcotizacion`.`utilidad1` AS `utilidad1`,`bdclick5`.`bdcotizacion`.`idFactura` AS `idFactura`,`bdclick5`.`bdcotizacion`.`factura` AS `id2`,`bdclick5`.`bdcotizacion`.`credito` AS `credito`,`bdclick5`.`bdcotizacion`.`anulada` AS `anulada`,`bdclick5`.`bdterceros`.`id` AS `Id`,`bdclick5`.`bdproductos`.`grupo` AS `Grupo`,`bdclick5`.`bdproductos`.`idSistema` AS `producto`,`bdclick5`.`bdcotizacion`.`estadoGeneral` AS `estadoGeneral` from ((`bdclick5`.`bdcotizacion` left join `bdclick5`.`bdproductos` on((`bdclick5`.`bdcotizacion`.`producto` = `bdclick5`.`bdproductos`.`idSistema`))) left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdcotizacion`.`cliente` = `bdclick5`.`bdterceros`.`idSistema`))) group by `bdclick5`.`bdcotizacion`.`fechaFactura`,`bdclick5`.`bdcotizacion`.`cliente`,`bdclick5`.`bdterceros`.`nombre`,`bdclick5`.`bdcotizacion`.`vendedor`,`bdclick5`.`bdcotizacion`.`observacion`,`bdclick5`.`bdproductos`.`Codigo`,`bdclick5`.`bdcotizacion`.`lista`,`bdclick5`.`bdcotizacion`.`porcIva`,`bdclick5`.`bdcotizacion`.`subtotalGeneral`,`bdclick5`.`bdcotizacion`.`descuentoGeneral`,`bdclick5`.`bdcotizacion`.`otros`,`bdclick5`.`bdcotizacion`.`rtFuente`,`bdclick5`.`bdcotizacion`.`rtIva`,`bdclick5`.`bdcotizacion`.`ivaGeneral`,`bdclick5`.`bdcotizacion`.`totalGeneral`,`bdclick5`.`bdcotizacion`.`efectivoGeneral`,`bdclick5`.`bdcotizacion`.`targetaGeneral`,`bdclick5`.`bdcotizacion`.`chequeGeneral`,`bdclick5`.`bdcotizacion`.`ncGeneral`,`bdclick5`.`bdcotizacion`.`tercero`,`bdclick5`.`bdcotizacion`.`utilidad1`,`bdclick5`.`bdcotizacion`.`idFactura`,`bdclick5`.`bdcotizacion`.`factura`,`bdclick5`.`bdcotizacion`.`credito`,`bdclick5`.`bdcotizacion`.`anulada`,`bdclick5`.`bdterceros`.`id`,`bdclick5`.`bdproductos`.`grupo`,`bdclick5`.`bdproductos`.`idSistema`,`bdclick5`.`bdcotizacion`.`estadoGeneral`
mariadb-version=100135