TYPE=VIEW
query=select `bdclick5`.`bdingreso`.`id` AS `id`,`bdclick5`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick5`.`bdingreso`.`total` AS `total`,`bdclick5`.`bdingreso`.`descuentos` AS `descuentos`,`bdclick5`.`bdingreso`.`iva` AS `iva`,`bdclick5`.`bdingreso`.`impoconsumo` AS `impoconsumo`,`bdclick5`.`bdingreso`.`subtotal` AS `subtotal`,`bdclick5`.`bdingreso`.`tipo` AS `tipo`,`bdclick5`.`bdingreso`.`concepto` AS `concepto`,`bdclick5`.`bdingreso`.`rtIva` AS `rtIva`,`bdclick5`.`bdingreso`.`rtFuente` AS `rtFuente`,`bdclick5`.`bdingreso`.`porRtFuente` AS `porRtFuente`,`bdclick5`.`bdingreso`.`anulada` AS `anulada`,`bdclick5`.`bdingreso`.`hora` AS `hora`,`bdclick5`.`bdingreso`.`bodega` AS `bodega`,`bdclick5`.`bdterceros`.`id` AS `idProveedor` from (`bdclick5`.`bdingreso` left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdingreso`.`proveedor` = `bdclick5`.`bdterceros`.`idSistema`))) where (`bdclick5`.`bdingreso`.`id` like \'ING-%\')
md5=0f26a9c61709a6af282828e1d628aa88
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:49
create-version=2
source=select `bdingreso`.`id` AS `id`,`bdingreso`.`proveedor` AS `proveedor`,`bdterceros`.`nombre` AS `nombre`,`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdingreso`.`total` AS `total`,`bdingreso`.`descuentos` AS `descuentos`,`bdingreso`.`iva` AS `iva`,`bdingreso`.`impoconsumo` AS `impoconsumo`,`bdingreso`.`subtotal` AS `subtotal`,`bdingreso`.`tipo` AS `tipo`,`bdingreso`.`concepto` AS `concepto`,`bdingreso`.`rtIva` AS `rtIva`,`bdingreso`.`rtFuente` AS `rtFuente`,`bdingreso`.`porRtFuente` AS `porRtFuente`,`bdingreso`.`anulada` AS `anulada`,`bdingreso`.`hora` AS `hora`,`bdingreso`.`bodega` AS `bodega`,`bdterceros`.`id` AS `idProveedor` from (`bdingreso` left join `bdterceros` on((`bdingreso`.`proveedor` = `bdterceros`.`idSistema`))) where (`bdingreso`.`id` like \'ING-%\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdingreso`.`id` AS `id`,`bdclick5`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick5`.`bdingreso`.`total` AS `total`,`bdclick5`.`bdingreso`.`descuentos` AS `descuentos`,`bdclick5`.`bdingreso`.`iva` AS `iva`,`bdclick5`.`bdingreso`.`impoconsumo` AS `impoconsumo`,`bdclick5`.`bdingreso`.`subtotal` AS `subtotal`,`bdclick5`.`bdingreso`.`tipo` AS `tipo`,`bdclick5`.`bdingreso`.`concepto` AS `concepto`,`bdclick5`.`bdingreso`.`rtIva` AS `rtIva`,`bdclick5`.`bdingreso`.`rtFuente` AS `rtFuente`,`bdclick5`.`bdingreso`.`porRtFuente` AS `porRtFuente`,`bdclick5`.`bdingreso`.`anulada` AS `anulada`,`bdclick5`.`bdingreso`.`hora` AS `hora`,`bdclick5`.`bdingreso`.`bodega` AS `bodega`,`bdclick5`.`bdterceros`.`id` AS `idProveedor` from (`bdclick5`.`bdingreso` left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdingreso`.`proveedor` = `bdclick5`.`bdterceros`.`idSistema`))) where (`bdclick5`.`bdingreso`.`id` like \'ING-%\')
mariadb-version=100135