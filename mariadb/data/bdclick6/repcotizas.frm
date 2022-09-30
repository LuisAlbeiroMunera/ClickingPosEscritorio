TYPE=VIEW
query=select `bdclick6`.`bdcotizacion`.`fechaFactura` AS `fechaFactura`,`bdclick6`.`bdcotizacion`.`cliente` AS `cliente`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdcotizacion`.`vendedor` AS `vendedor`,`bdclick6`.`bdcotizacion`.`observacion` AS `observacion`,`bdclick6`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick6`.`bdproductos`.`Descripcion` AS `Descripcion`,sum(`bdclick6`.`bdcotizacion`.`cant2`) AS `cantidad`,`bdclick6`.`bdcotizacion`.`lista` AS `lista`,sum(`bdclick6`.`bdcotizacion`.`subtotal`) AS `subtotal`,sum(`bdclick6`.`bdcotizacion`.`descuento`) AS `descuento`,`bdclick6`.`bdcotizacion`.`porcIva` AS `porcIva`,sum(`bdclick6`.`bdcotizacion`.`iva`) AS `iva`,sum(`bdclick6`.`bdcotizacion`.`total`) AS `total`,sum(`bdclick6`.`bdcotizacion`.`utilidad`) AS `utilidad`,`bdclick6`.`bdcotizacion`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick6`.`bdcotizacion`.`descuentoGeneral` AS `descuentoGeneral`,`bdclick6`.`bdcotizacion`.`otros` AS `otros`,`bdclick6`.`bdcotizacion`.`rtFuente` AS `rtFuente`,`bdclick6`.`bdcotizacion`.`rtIva` AS `rtIva`,`bdclick6`.`bdcotizacion`.`ivaGeneral` AS `ivaGeneral`,`bdclick6`.`bdcotizacion`.`totalGeneral` AS `totalGeneral`,`bdclick6`.`bdcotizacion`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick6`.`bdcotizacion`.`targetaGeneral` AS `targetaGeneral`,`bdclick6`.`bdcotizacion`.`chequeGeneral` AS `chequeGeneral`,`bdclick6`.`bdcotizacion`.`ncGeneral` AS `ncGeneral`,`bdclick6`.`bdcotizacion`.`tercero` AS `tercero`,`bdclick6`.`bdcotizacion`.`utilidad1` AS `utilidad1`,`bdclick6`.`bdcotizacion`.`idFactura` AS `idFactura`,`bdclick6`.`bdcotizacion`.`factura` AS `id2`,`bdclick6`.`bdcotizacion`.`credito` AS `credito`,`bdclick6`.`bdcotizacion`.`anulada` AS `anulada`,`bdclick6`.`bdterceros`.`id` AS `Id`,`bdclick6`.`bdproductos`.`grupo` AS `Grupo`,`bdclick6`.`bdproductos`.`idSistema` AS `producto`,`bdclick6`.`bdcotizacion`.`estadoGeneral` AS `estadoGeneral` from ((`bdclick6`.`bdcotizacion` left join `bdclick6`.`bdproductos` on((`bdclick6`.`bdcotizacion`.`producto` = `bdclick6`.`bdproductos`.`idSistema`))) left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdcotizacion`.`cliente` = `bdclick6`.`bdterceros`.`idSistema`))) group by `bdclick6`.`bdcotizacion`.`fechaFactura`,`bdclick6`.`bdcotizacion`.`cliente`,`bdclick6`.`bdterceros`.`nombre`,`bdclick6`.`bdcotizacion`.`vendedor`,`bdclick6`.`bdcotizacion`.`observacion`,`bdclick6`.`bdproductos`.`Codigo`,`bdclick6`.`bdcotizacion`.`lista`,`bdclick6`.`bdcotizacion`.`porcIva`,`bdclick6`.`bdcotizacion`.`subtotalGeneral`,`bdclick6`.`bdcotizacion`.`descuentoGeneral`,`bdclick6`.`bdcotizacion`.`otros`,`bdclick6`.`bdcotizacion`.`rtFuente`,`bdclick6`.`bdcotizacion`.`rtIva`,`bdclick6`.`bdcotizacion`.`ivaGeneral`,`bdclick6`.`bdcotizacion`.`totalGeneral`,`bdclick6`.`bdcotizacion`.`efectivoGeneral`,`bdclick6`.`bdcotizacion`.`targetaGeneral`,`bdclick6`.`bdcotizacion`.`chequeGeneral`,`bdclick6`.`bdcotizacion`.`ncGeneral`,`bdclick6`.`bdcotizacion`.`tercero`,`bdclick6`.`bdcotizacion`.`utilidad1`,`bdclick6`.`bdcotizacion`.`idFactura`,`bdclick6`.`bdcotizacion`.`factura`,`bdclick6`.`bdcotizacion`.`credito`,`bdclick6`.`bdcotizacion`.`anulada`,`bdclick6`.`bdterceros`.`id`,`bdclick6`.`bdproductos`.`grupo`,`bdclick6`.`bdproductos`.`idSistema`,`bdclick6`.`bdcotizacion`.`estadoGeneral`
md5=0e5fc8f6e67d1ace7ea17bae4b651993
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:38
create-version=2
source=select `bdcotizacion`.`fechaFactura` AS `fechaFactura`,`bdcotizacion`.`cliente` AS `cliente`,`bdterceros`.`nombre` AS `nombre`,`bdcotizacion`.`vendedor` AS `vendedor`,`bdcotizacion`.`observacion` AS `observacion`,`bdproductos`.`Codigo` AS `Codigo`,`bdproductos`.`Descripcion` AS `Descripcion`,sum(`bdcotizacion`.`cant2`) AS `cantidad`,`bdcotizacion`.`lista` AS `lista`,sum(`bdcotizacion`.`subtotal`) AS `subtotal`,sum(`bdcotizacion`.`descuento`) AS `descuento`,`bdcotizacion`.`porcIva` AS `porcIva`,sum(`bdcotizacion`.`iva`) AS `iva`,sum(`bdcotizacion`.`total`) AS `total`,sum(`bdcotizacion`.`utilidad`) AS `utilidad`,`bdcotizacion`.`subtotalGeneral` AS `subtotalGeneral`,`bdcotizacion`.`descuentoGeneral` AS `descuentoGeneral`,`bdcotizacion`.`otros` AS `otros`,`bdcotizacion`.`rtFuente` AS `rtFuente`,`bdcotizacion`.`rtIva` AS `rtIva`,`bdcotizacion`.`ivaGeneral` AS `ivaGeneral`,`bdcotizacion`.`totalGeneral` AS `totalGeneral`,`bdcotizacion`.`efectivoGeneral` AS `efectivoGeneral`,`bdcotizacion`.`targetaGeneral` AS `targetaGeneral`,`bdcotizacion`.`chequeGeneral` AS `chequeGeneral`,`bdcotizacion`.`ncGeneral` AS `ncGeneral`,`bdcotizacion`.`tercero` AS `tercero`,`bdcotizacion`.`utilidad1` AS `utilidad1`,`bdcotizacion`.`idFactura` AS `idFactura`,`bdcotizacion`.`factura` AS `id2`,`bdcotizacion`.`credito` AS `credito`,`bdcotizacion`.`anulada` AS `anulada`,`bdterceros`.`id` AS `Id`,`bdproductos`.`grupo` AS `Grupo`,`bdproductos`.`idSistema` AS `producto`,`bdcotizacion`.`estadoGeneral` AS `estadoGeneral` from ((`bdcotizacion` left join `bdproductos` on((`bdcotizacion`.`producto` = `bdproductos`.`idSistema`))) left join `bdterceros` on((`bdcotizacion`.`cliente` = `bdterceros`.`idSistema`))) group by `bdcotizacion`.`fechaFactura`,`bdcotizacion`.`cliente`,`bdterceros`.`nombre`,`bdcotizacion`.`vendedor`,`bdcotizacion`.`observacion`,`bdproductos`.`Codigo`,`bdcotizacion`.`lista`,`bdcotizacion`.`porcIva`,`bdcotizacion`.`subtotalGeneral`,`bdcotizacion`.`descuentoGeneral`,`bdcotizacion`.`otros`,`bdcotizacion`.`rtFuente`,`bdcotizacion`.`rtIva`,`bdcotizacion`.`ivaGeneral`,`bdcotizacion`.`totalGeneral`,`bdcotizacion`.`efectivoGeneral`,`bdcotizacion`.`targetaGeneral`,`bdcotizacion`.`chequeGeneral`,`bdcotizacion`.`ncGeneral`,`bdcotizacion`.`tercero`,`bdcotizacion`.`utilidad1`,`bdcotizacion`.`idFactura`,`bdcotizacion`.`factura`,`bdcotizacion`.`credito`,`bdcotizacion`.`anulada`,`bdterceros`.`id`,`bdproductos`.`grupo`,`bdproductos`.`idSistema`,`bdcotizacion`.`estadoGeneral`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdcotizacion`.`fechaFactura` AS `fechaFactura`,`bdclick6`.`bdcotizacion`.`cliente` AS `cliente`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdcotizacion`.`vendedor` AS `vendedor`,`bdclick6`.`bdcotizacion`.`observacion` AS `observacion`,`bdclick6`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick6`.`bdproductos`.`Descripcion` AS `Descripcion`,sum(`bdclick6`.`bdcotizacion`.`cant2`) AS `cantidad`,`bdclick6`.`bdcotizacion`.`lista` AS `lista`,sum(`bdclick6`.`bdcotizacion`.`subtotal`) AS `subtotal`,sum(`bdclick6`.`bdcotizacion`.`descuento`) AS `descuento`,`bdclick6`.`bdcotizacion`.`porcIva` AS `porcIva`,sum(`bdclick6`.`bdcotizacion`.`iva`) AS `iva`,sum(`bdclick6`.`bdcotizacion`.`total`) AS `total`,sum(`bdclick6`.`bdcotizacion`.`utilidad`) AS `utilidad`,`bdclick6`.`bdcotizacion`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick6`.`bdcotizacion`.`descuentoGeneral` AS `descuentoGeneral`,`bdclick6`.`bdcotizacion`.`otros` AS `otros`,`bdclick6`.`bdcotizacion`.`rtFuente` AS `rtFuente`,`bdclick6`.`bdcotizacion`.`rtIva` AS `rtIva`,`bdclick6`.`bdcotizacion`.`ivaGeneral` AS `ivaGeneral`,`bdclick6`.`bdcotizacion`.`totalGeneral` AS `totalGeneral`,`bdclick6`.`bdcotizacion`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick6`.`bdcotizacion`.`targetaGeneral` AS `targetaGeneral`,`bdclick6`.`bdcotizacion`.`chequeGeneral` AS `chequeGeneral`,`bdclick6`.`bdcotizacion`.`ncGeneral` AS `ncGeneral`,`bdclick6`.`bdcotizacion`.`tercero` AS `tercero`,`bdclick6`.`bdcotizacion`.`utilidad1` AS `utilidad1`,`bdclick6`.`bdcotizacion`.`idFactura` AS `idFactura`,`bdclick6`.`bdcotizacion`.`factura` AS `id2`,`bdclick6`.`bdcotizacion`.`credito` AS `credito`,`bdclick6`.`bdcotizacion`.`anulada` AS `anulada`,`bdclick6`.`bdterceros`.`id` AS `Id`,`bdclick6`.`bdproductos`.`grupo` AS `Grupo`,`bdclick6`.`bdproductos`.`idSistema` AS `producto`,`bdclick6`.`bdcotizacion`.`estadoGeneral` AS `estadoGeneral` from ((`bdclick6`.`bdcotizacion` left join `bdclick6`.`bdproductos` on((`bdclick6`.`bdcotizacion`.`producto` = `bdclick6`.`bdproductos`.`idSistema`))) left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdcotizacion`.`cliente` = `bdclick6`.`bdterceros`.`idSistema`))) group by `bdclick6`.`bdcotizacion`.`fechaFactura`,`bdclick6`.`bdcotizacion`.`cliente`,`bdclick6`.`bdterceros`.`nombre`,`bdclick6`.`bdcotizacion`.`vendedor`,`bdclick6`.`bdcotizacion`.`observacion`,`bdclick6`.`bdproductos`.`Codigo`,`bdclick6`.`bdcotizacion`.`lista`,`bdclick6`.`bdcotizacion`.`porcIva`,`bdclick6`.`bdcotizacion`.`subtotalGeneral`,`bdclick6`.`bdcotizacion`.`descuentoGeneral`,`bdclick6`.`bdcotizacion`.`otros`,`bdclick6`.`bdcotizacion`.`rtFuente`,`bdclick6`.`bdcotizacion`.`rtIva`,`bdclick6`.`bdcotizacion`.`ivaGeneral`,`bdclick6`.`bdcotizacion`.`totalGeneral`,`bdclick6`.`bdcotizacion`.`efectivoGeneral`,`bdclick6`.`bdcotizacion`.`targetaGeneral`,`bdclick6`.`bdcotizacion`.`chequeGeneral`,`bdclick6`.`bdcotizacion`.`ncGeneral`,`bdclick6`.`bdcotizacion`.`tercero`,`bdclick6`.`bdcotizacion`.`utilidad1`,`bdclick6`.`bdcotizacion`.`idFactura`,`bdclick6`.`bdcotizacion`.`factura`,`bdclick6`.`bdcotizacion`.`credito`,`bdclick6`.`bdcotizacion`.`anulada`,`bdclick6`.`bdterceros`.`id`,`bdclick6`.`bdproductos`.`grupo`,`bdclick6`.`bdproductos`.`idSistema`,`bdclick6`.`bdcotizacion`.`estadoGeneral`
mariadb-version=100135
