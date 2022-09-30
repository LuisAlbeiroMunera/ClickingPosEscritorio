TYPE=VIEW
query=select `bdclick3`.`bdcuentacobro`.`idFactura` AS `idFactura`,cast(substr(`bdclick3`.`bdcuentacobro`.`idFactura`,8,100) as signed) AS `documento`,`bdclick3`.`bdcuentacobro`.`producto` AS `producto`,`bdclick3`.`bdcuentacobro`.`descripcion` AS `Descripcion`,`bdclick3`.`bdcuentacobro`.`cant2` AS `cantidad`,`bdclick3`.`bdcuentacobro`.`lista` AS `lista`,`bdclick3`.`bdcuentacobro`.`subtotal` AS `subtotal`,`bdclick3`.`bdcuentacobro`.`iva` AS `iva`,`bdclick3`.`bdcuentacobro`.`total` AS `total`,`bdclick3`.`bdcuentacobro`.`fechaFactura` AS `fechaFactura`,`bdclick3`.`bdcuentacobro`.`cliente` AS `cliente`,`bdclick3`.`bdproductos`.`Proveedor` AS `Proveedor`,`bdclick3`.`bdcuentacobro`.`vendedor` AS `vendedor`,`bdclick3`.`bdcuentacobro`.`anulada` AS `anulada`,`bdclick3`.`bdcuentacobro`.`credito` AS `credito`,`bdclick3`.`bdcuentacobro`.`descuentoGeneral` AS `descuentoGeneral`,(`bdclick3`.`bdcuentacobro`.`total` - (`bdclick3`.`bdcuentacobro`.`utilidad` * `bdclick3`.`bdcuentacobro`.`cantidad`)) AS `utilidad`,(`bdclick3`.`bdcuentacobro`.`total` - (`bdclick3`.`ultimoponderado`.`nuevoPonderado` * `bdclick3`.`bdcuentacobro`.`cantidad`)) AS `utilidad2`,`bdclick3`.`bdcuentacobro`.`terminal` AS `terminal`,`bdclick3`.`bdcuentacobro`.`targetaGeneral` AS `targeta`,`bdclick3`.`bdcuentacobro`.`descuento` AS `descuentos`,`bdclick3`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick3`.`bdterceros`.`id` AS `idTercero`,`bdclick3`.`bdcuentacobro`.`ivaGeneral` AS `ivaGeneral`,`bdclick3`.`bdcuentacobro`.`totalGeneral` AS `totalGeneral`,`bdclick3`.`bdcuentacobro`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdcuentacobro`.`observacion` AS `observacion`,`bdclick3`.`bdcuentacobro`.`rtFuente` AS `rtFuente`,`bdclick3`.`bdcuentacobro`.`rtIva` AS `rtIva`,`bdclick3`.`bdcuentacobro`.`otros` AS `otros`,`bdclick3`.`bdcuentacobro`.`porcIva` AS `porcIva`,`bdclick3`.`bdcuentacobro`.`descuento` AS `descuento` from (((`bdclick3`.`bdcuentacobro` left join `bdclick3`.`ultimoponderado` on((`bdclick3`.`ultimoponderado`.`producto` = `bdclick3`.`bdcuentacobro`.`producto`))) left join `bdclick3`.`bdproductos` on((`bdclick3`.`bdcuentacobro`.`producto` = `bdclick3`.`bdproductos`.`idSistema`))) left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdcuentacobro`.`cliente` = `bdclick3`.`bdterceros`.`idSistema`)))
md5=eef3e5aed4e4f0c900e63e3e0fbca209
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:54
create-version=2
source=select `bdcuentacobro`.`idFactura` AS `idFactura`,cast(substr(`bdcuentacobro`.`idFactura`,8,100) as signed) AS `documento`,`bdcuentacobro`.`producto` AS `producto`,`bdcuentacobro`.`descripcion` AS `Descripcion`,`bdcuentacobro`.`cant2` AS `cantidad`,`bdcuentacobro`.`lista` AS `lista`,`bdcuentacobro`.`subtotal` AS `subtotal`,`bdcuentacobro`.`iva` AS `iva`,`bdcuentacobro`.`total` AS `total`,`bdcuentacobro`.`fechaFactura` AS `fechaFactura`,`bdcuentacobro`.`cliente` AS `cliente`,`bdproductos`.`Proveedor` AS `Proveedor`,`bdcuentacobro`.`vendedor` AS `vendedor`,`bdcuentacobro`.`anulada` AS `anulada`,`bdcuentacobro`.`credito` AS `credito`,`bdcuentacobro`.`descuentoGeneral` AS `descuentoGeneral`,(`bdcuentacobro`.`total` - (`bdcuentacobro`.`utilidad` * `bdcuentacobro`.`cantidad`)) AS `utilidad`,(`bdcuentacobro`.`total` - (`ultimoponderado`.`nuevoPonderado` * `bdcuentacobro`.`cantidad`)) AS `utilidad2`,`bdcuentacobro`.`terminal` AS `terminal`,`bdcuentacobro`.`targetaGeneral` AS `targeta`,`bdcuentacobro`.`descuento` AS `descuentos`,`bdproductos`.`Codigo` AS `Codigo`,`bdterceros`.`id` AS `idTercero`,`bdcuentacobro`.`ivaGeneral` AS `ivaGeneral`,`bdcuentacobro`.`totalGeneral` AS `totalGeneral`,`bdcuentacobro`.`subtotalGeneral` AS `subtotalGeneral`,`bdterceros`.`nombre` AS `nombre`,`bdcuentacobro`.`observacion` AS `observacion`,`bdcuentacobro`.`rtFuente` AS `rtFuente`,`bdcuentacobro`.`rtIva` AS `rtIva`,`bdcuentacobro`.`otros` AS `otros`,`bdcuentacobro`.`porcIva` AS `porcIva`,`bdcuentacobro`.`descuento` AS `descuento` from (((`bdcuentacobro` left join `ultimoponderado` on((`ultimoponderado`.`producto` = `bdcuentacobro`.`producto`))) left join `bdproductos` on((`bdcuentacobro`.`producto` = `bdproductos`.`idSistema`))) left join `bdterceros` on((`bdcuentacobro`.`cliente` = `bdterceros`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdcuentacobro`.`idFactura` AS `idFactura`,cast(substr(`bdclick3`.`bdcuentacobro`.`idFactura`,8,100) as signed) AS `documento`,`bdclick3`.`bdcuentacobro`.`producto` AS `producto`,`bdclick3`.`bdcuentacobro`.`descripcion` AS `Descripcion`,`bdclick3`.`bdcuentacobro`.`cant2` AS `cantidad`,`bdclick3`.`bdcuentacobro`.`lista` AS `lista`,`bdclick3`.`bdcuentacobro`.`subtotal` AS `subtotal`,`bdclick3`.`bdcuentacobro`.`iva` AS `iva`,`bdclick3`.`bdcuentacobro`.`total` AS `total`,`bdclick3`.`bdcuentacobro`.`fechaFactura` AS `fechaFactura`,`bdclick3`.`bdcuentacobro`.`cliente` AS `cliente`,`bdclick3`.`bdproductos`.`Proveedor` AS `Proveedor`,`bdclick3`.`bdcuentacobro`.`vendedor` AS `vendedor`,`bdclick3`.`bdcuentacobro`.`anulada` AS `anulada`,`bdclick3`.`bdcuentacobro`.`credito` AS `credito`,`bdclick3`.`bdcuentacobro`.`descuentoGeneral` AS `descuentoGeneral`,(`bdclick3`.`bdcuentacobro`.`total` - (`bdclick3`.`bdcuentacobro`.`utilidad` * `bdclick3`.`bdcuentacobro`.`cantidad`)) AS `utilidad`,(`bdclick3`.`bdcuentacobro`.`total` - (`bdclick3`.`ultimoponderado`.`nuevoPonderado` * `bdclick3`.`bdcuentacobro`.`cantidad`)) AS `utilidad2`,`bdclick3`.`bdcuentacobro`.`terminal` AS `terminal`,`bdclick3`.`bdcuentacobro`.`targetaGeneral` AS `targeta`,`bdclick3`.`bdcuentacobro`.`descuento` AS `descuentos`,`bdclick3`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick3`.`bdterceros`.`id` AS `idTercero`,`bdclick3`.`bdcuentacobro`.`ivaGeneral` AS `ivaGeneral`,`bdclick3`.`bdcuentacobro`.`totalGeneral` AS `totalGeneral`,`bdclick3`.`bdcuentacobro`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdcuentacobro`.`observacion` AS `observacion`,`bdclick3`.`bdcuentacobro`.`rtFuente` AS `rtFuente`,`bdclick3`.`bdcuentacobro`.`rtIva` AS `rtIva`,`bdclick3`.`bdcuentacobro`.`otros` AS `otros`,`bdclick3`.`bdcuentacobro`.`porcIva` AS `porcIva`,`bdclick3`.`bdcuentacobro`.`descuento` AS `descuento` from (((`bdclick3`.`bdcuentacobro` left join `bdclick3`.`ultimoponderado` on((`bdclick3`.`ultimoponderado`.`producto` = `bdclick3`.`bdcuentacobro`.`producto`))) left join `bdclick3`.`bdproductos` on((`bdclick3`.`bdcuentacobro`.`producto` = `bdclick3`.`bdproductos`.`idSistema`))) left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdcuentacobro`.`cliente` = `bdclick3`.`bdterceros`.`idSistema`)))
mariadb-version=100135