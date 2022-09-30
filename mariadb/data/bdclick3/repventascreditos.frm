TYPE=VIEW
query=(select `bdclick3`.`bdprestamo`.`contrato` AS `contrato`,`bdclick3`.`bdfactura`.`producto` AS `producto`,`bdclick3`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick3`.`bdfactura`.`cantidad` AS `cantidad`,`bdclick3`.`bdfactura`.`lista` AS `lista`,`bdclick3`.`bdfactura`.`subtotal` AS `subtotal`,`bdclick3`.`bdfactura`.`iva` AS `iva`,`bdclick3`.`bdfactura`.`total` AS `total`,`bdclick3`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick3`.`bdfactura`.`cliente` AS `cliente`,`bdclick3`.`bdproductos`.`Proveedor` AS `Proveedor`,`bdclick3`.`bdfactura`.`vendedor` AS `vendedor`,`bdclick3`.`bdfactura`.`anulada` AS `anulada`,`bdclick3`.`bdfactura`.`cotizacion` AS `documento`,`bdclick3`.`bdfactura`.`credito` AS `credito`,`bdclick3`.`bdfactura`.`descuentoGeneral` AS `descuentoGeneral`,(`bdclick3`.`bdfactura`.`total` - (`bdclick3`.`ultimoponderado`.`ultimoCosto` * `bdclick3`.`bdfactura`.`cantidad`)) AS `utilidad`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdprestamo`.`valorAprovado` AS `valorAprovado`,`bdclick3`.`bdprestamo`.`interes` AS `interes`,`bdclick3`.`bdprestamo`.`totalInteres` AS `totalInteres`,`bdclick3`.`bdprestamo`.`cuotas` AS `cuotas`,`bdclick3`.`bdprestamo`.`factura2` AS `factura` from ((((`bdclick3`.`bdfactura` left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdterceros`.`id` = `bdclick3`.`bdfactura`.`cliente`))) join `bdclick3`.`bdprestamo` on((`bdclick3`.`bdfactura`.`factura` = `bdclick3`.`bdprestamo`.`factura2`))) left join `bdclick3`.`bdproductos` on((`bdclick3`.`bdproductos`.`Codigo` = `bdclick3`.`bdfactura`.`producto`))) left join `bdclick3`.`ultimoponderado` on((`bdclick3`.`bdproductos`.`Codigo` = `bdclick3`.`ultimoponderado`.`producto`))) where (`bdclick3`.`bdfactura`.`anulada` = 0))
md5=416ef0abd4e582e27370c1736d4e6a9c
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:54
create-version=2
source=(select `bdprestamo`.`contrato` AS `contrato`,`bdfactura`.`producto` AS `producto`,`bdproductos`.`Descripcion` AS `Descripcion`,`bdfactura`.`cantidad` AS `cantidad`,`bdfactura`.`lista` AS `lista`,`bdfactura`.`subtotal` AS `subtotal`,`bdfactura`.`iva` AS `iva`,`bdfactura`.`total` AS `total`,`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdfactura`.`cliente` AS `cliente`,`bdproductos`.`Proveedor` AS `Proveedor`,`bdfactura`.`vendedor` AS `vendedor`,`bdfactura`.`anulada` AS `anulada`,`bdfactura`.`cotizacion` AS `documento`,`bdfactura`.`credito` AS `credito`,`bdfactura`.`descuentoGeneral` AS `descuentoGeneral`,(`bdfactura`.`total` - (`ultimoponderado`.`ultimoCosto` * `bdfactura`.`cantidad`)) AS `utilidad`,`bdterceros`.`nombre` AS `nombre`,`bdprestamo`.`valorAprovado` AS `valorAprovado`,`bdprestamo`.`interes` AS `interes`,`bdprestamo`.`totalInteres` AS `totalInteres`,`bdprestamo`.`cuotas` AS `cuotas`,`bdprestamo`.`factura2` AS `factura` from ((((`bdfactura` left join `bdterceros` on((`bdterceros`.`id` = `bdfactura`.`cliente`))) join `bdprestamo` on((`bdfactura`.`factura` = `bdprestamo`.`factura2`))) left join `bdproductos` on((`bdproductos`.`Codigo` = `bdfactura`.`producto`))) left join `ultimoponderado` on((`bdproductos`.`Codigo` = `ultimoponderado`.`producto`))) where (`bdfactura`.`anulada` = 0))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bdprestamo`.`contrato` AS `contrato`,`bdclick3`.`bdfactura`.`producto` AS `producto`,`bdclick3`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick3`.`bdfactura`.`cantidad` AS `cantidad`,`bdclick3`.`bdfactura`.`lista` AS `lista`,`bdclick3`.`bdfactura`.`subtotal` AS `subtotal`,`bdclick3`.`bdfactura`.`iva` AS `iva`,`bdclick3`.`bdfactura`.`total` AS `total`,`bdclick3`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick3`.`bdfactura`.`cliente` AS `cliente`,`bdclick3`.`bdproductos`.`Proveedor` AS `Proveedor`,`bdclick3`.`bdfactura`.`vendedor` AS `vendedor`,`bdclick3`.`bdfactura`.`anulada` AS `anulada`,`bdclick3`.`bdfactura`.`cotizacion` AS `documento`,`bdclick3`.`bdfactura`.`credito` AS `credito`,`bdclick3`.`bdfactura`.`descuentoGeneral` AS `descuentoGeneral`,(`bdclick3`.`bdfactura`.`total` - (`bdclick3`.`ultimoponderado`.`ultimoCosto` * `bdclick3`.`bdfactura`.`cantidad`)) AS `utilidad`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdprestamo`.`valorAprovado` AS `valorAprovado`,`bdclick3`.`bdprestamo`.`interes` AS `interes`,`bdclick3`.`bdprestamo`.`totalInteres` AS `totalInteres`,`bdclick3`.`bdprestamo`.`cuotas` AS `cuotas`,`bdclick3`.`bdprestamo`.`factura2` AS `factura` from ((((`bdclick3`.`bdfactura` left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdterceros`.`id` = `bdclick3`.`bdfactura`.`cliente`))) join `bdclick3`.`bdprestamo` on((`bdclick3`.`bdfactura`.`factura` = `bdclick3`.`bdprestamo`.`factura2`))) left join `bdclick3`.`bdproductos` on((`bdclick3`.`bdproductos`.`Codigo` = `bdclick3`.`bdfactura`.`producto`))) left join `bdclick3`.`ultimoponderado` on((`bdclick3`.`bdproductos`.`Codigo` = `bdclick3`.`ultimoponderado`.`producto`))) where (`bdclick3`.`bdfactura`.`anulada` = 0))
mariadb-version=100135