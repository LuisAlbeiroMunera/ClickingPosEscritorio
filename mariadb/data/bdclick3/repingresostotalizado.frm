TYPE=VIEW
query=select `bdclick3`.`bdingreso`.`id` AS `id`,`bdclick3`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick3`.`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick3`.`bdingreso`.`total` AS `total`,`bdclick3`.`bdingreso`.`descuentos` AS `descuentos`,`bdclick3`.`bdingreso`.`iva` AS `iva`,`bdclick3`.`bdingreso`.`impoconsumo` AS `impoconsumo`,`bdclick3`.`bdingreso`.`subtotal` AS `subtotal`,`bdclick3`.`bdingreso`.`tipo` AS `tipo`,`bdclick3`.`bdingreso`.`concepto` AS `concepto`,`bdclick3`.`bdingreso`.`rtIva` AS `rtIva`,`bdclick3`.`bdingreso`.`rtFuente` AS `rtFuente`,`bdclick3`.`bdingreso`.`porRtFuente` AS `porRtFuente`,`bdclick3`.`bdingreso`.`anulada` AS `anulada`,`bdclick3`.`bdingreso`.`hora` AS `hora`,`bdclick3`.`bdingreso`.`bodega` AS `bodega`,`bdclick3`.`bdterceros`.`id` AS `idProveedor` from (`bdclick3`.`bdingreso` left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdingreso`.`proveedor` = `bdclick3`.`bdterceros`.`idSistema`))) where (`bdclick3`.`bdingreso`.`id` like \'ING-%\')
md5=a4af2c89d4266df232bc16111ef39df7
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:53
create-version=2
source=select `bdingreso`.`id` AS `id`,`bdingreso`.`proveedor` AS `proveedor`,`bdterceros`.`nombre` AS `nombre`,`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdingreso`.`total` AS `total`,`bdingreso`.`descuentos` AS `descuentos`,`bdingreso`.`iva` AS `iva`,`bdingreso`.`impoconsumo` AS `impoconsumo`,`bdingreso`.`subtotal` AS `subtotal`,`bdingreso`.`tipo` AS `tipo`,`bdingreso`.`concepto` AS `concepto`,`bdingreso`.`rtIva` AS `rtIva`,`bdingreso`.`rtFuente` AS `rtFuente`,`bdingreso`.`porRtFuente` AS `porRtFuente`,`bdingreso`.`anulada` AS `anulada`,`bdingreso`.`hora` AS `hora`,`bdingreso`.`bodega` AS `bodega`,`bdterceros`.`id` AS `idProveedor` from (`bdingreso` left join `bdterceros` on((`bdingreso`.`proveedor` = `bdterceros`.`idSistema`))) where (`bdingreso`.`id` like \'ING-%\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdingreso`.`id` AS `id`,`bdclick3`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick3`.`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick3`.`bdingreso`.`total` AS `total`,`bdclick3`.`bdingreso`.`descuentos` AS `descuentos`,`bdclick3`.`bdingreso`.`iva` AS `iva`,`bdclick3`.`bdingreso`.`impoconsumo` AS `impoconsumo`,`bdclick3`.`bdingreso`.`subtotal` AS `subtotal`,`bdclick3`.`bdingreso`.`tipo` AS `tipo`,`bdclick3`.`bdingreso`.`concepto` AS `concepto`,`bdclick3`.`bdingreso`.`rtIva` AS `rtIva`,`bdclick3`.`bdingreso`.`rtFuente` AS `rtFuente`,`bdclick3`.`bdingreso`.`porRtFuente` AS `porRtFuente`,`bdclick3`.`bdingreso`.`anulada` AS `anulada`,`bdclick3`.`bdingreso`.`hora` AS `hora`,`bdclick3`.`bdingreso`.`bodega` AS `bodega`,`bdclick3`.`bdterceros`.`id` AS `idProveedor` from (`bdclick3`.`bdingreso` left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdingreso`.`proveedor` = `bdclick3`.`bdterceros`.`idSistema`))) where (`bdclick3`.`bdingreso`.`id` like \'ING-%\')
mariadb-version=100135