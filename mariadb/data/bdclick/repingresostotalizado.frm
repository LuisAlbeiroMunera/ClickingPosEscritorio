TYPE=VIEW
query=select `bdclick`.`bdingreso`.`id` AS `id`,`bdclick`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick`.`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick`.`bdingreso`.`total` AS `total`,`bdclick`.`bdingreso`.`descuentos` AS `descuentos`,`bdclick`.`bdingreso`.`iva` AS `iva`,`bdclick`.`bdingreso`.`impoconsumo` AS `impoconsumo`,`bdclick`.`bdingreso`.`subtotal` AS `subtotal`,`bdclick`.`bdingreso`.`tipo` AS `tipo`,`bdclick`.`bdingreso`.`concepto` AS `concepto`,`bdclick`.`bdingreso`.`rtIva` AS `rtIva`,`bdclick`.`bdingreso`.`rtFuente` AS `rtFuente`,`bdclick`.`bdingreso`.`porRtFuente` AS `porRtFuente`,`bdclick`.`bdingreso`.`anulada` AS `anulada`,`bdclick`.`bdingreso`.`hora` AS `hora`,`bdclick`.`bdingreso`.`bodega` AS `bodega`,`bdclick`.`bdterceros`.`id` AS `idProveedor` from (`bdclick`.`bdingreso` left join `bdclick`.`bdterceros` on((`bdclick`.`bdingreso`.`proveedor` = `bdclick`.`bdterceros`.`idSistema`))) where (`bdclick`.`bdingreso`.`id` like \'ING-%\')
md5=21374ef7df70e7e8edaeb38610b4a9c9
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:26
create-version=2
source=select `bdingreso`.`id` AS `id`,`bdingreso`.`proveedor` AS `proveedor`,`bdterceros`.`nombre` AS `nombre`,`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdingreso`.`total` AS `total`,`bdingreso`.`descuentos` AS `descuentos`,`bdingreso`.`iva` AS `iva`,`bdingreso`.`impoconsumo` AS `impoconsumo`,`bdingreso`.`subtotal` AS `subtotal`,`bdingreso`.`tipo` AS `tipo`,`bdingreso`.`concepto` AS `concepto`,`bdingreso`.`rtIva` AS `rtIva`,`bdingreso`.`rtFuente` AS `rtFuente`,`bdingreso`.`porRtFuente` AS `porRtFuente`,`bdingreso`.`anulada` AS `anulada`,`bdingreso`.`hora` AS `hora`,`bdingreso`.`bodega` AS `bodega`,`bdterceros`.`id` AS `idProveedor` from (`bdingreso` left join `bdterceros` on((`bdingreso`.`proveedor` = `bdterceros`.`idSistema`))) where (`bdingreso`.`id` like \'ING-%\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdingreso`.`id` AS `id`,`bdclick`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick`.`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick`.`bdingreso`.`total` AS `total`,`bdclick`.`bdingreso`.`descuentos` AS `descuentos`,`bdclick`.`bdingreso`.`iva` AS `iva`,`bdclick`.`bdingreso`.`impoconsumo` AS `impoconsumo`,`bdclick`.`bdingreso`.`subtotal` AS `subtotal`,`bdclick`.`bdingreso`.`tipo` AS `tipo`,`bdclick`.`bdingreso`.`concepto` AS `concepto`,`bdclick`.`bdingreso`.`rtIva` AS `rtIva`,`bdclick`.`bdingreso`.`rtFuente` AS `rtFuente`,`bdclick`.`bdingreso`.`porRtFuente` AS `porRtFuente`,`bdclick`.`bdingreso`.`anulada` AS `anulada`,`bdclick`.`bdingreso`.`hora` AS `hora`,`bdclick`.`bdingreso`.`bodega` AS `bodega`,`bdclick`.`bdterceros`.`id` AS `idProveedor` from (`bdclick`.`bdingreso` left join `bdclick`.`bdterceros` on((`bdclick`.`bdingreso`.`proveedor` = `bdclick`.`bdterceros`.`idSistema`))) where (`bdclick`.`bdingreso`.`id` like \'ING-%\')
mariadb-version=100135
