TYPE=VIEW
query=select `bdclick3`.`bdnotascredito`.`NC` AS `NC`,`bdclick3`.`bdnc`.`cliente` AS `cliente`,`bdclick3`.`bdnc`.`vendedor` AS `vendedor`,`bdclick3`.`bdnc`.`fecha` AS `fecha`,`bdclick3`.`bdnc`.`valor` AS `valor`,`bdclick3`.`bdnotascredito`.`producto` AS `producto`,`bdclick3`.`bdnotascredito`.`descripcion` AS `descripcion`,`bdclick3`.`bdnotascredito`.`lista` AS `lista`,`bdclick3`.`bdnotascredito`.`cant2` AS `cantidad`,`bdclick3`.`bdnotascredito`.`descuento` AS `descuento`,`bdclick3`.`bdnotascredito`.`total` AS `total`,`bdclick3`.`bdnotascredito`.`iva` AS `iva`,`bdclick3`.`bdnotascredito`.`impoconsumo` AS `impoconsumo`,`bdclick3`.`bdnotascredito`.`subtotal` AS `subtotal`,`bdclick3`.`bdnc`.`anulada` AS `anulada`,`bdclick3`.`bdnc`.`factura` AS `factura`,`bdclick3`.`bdnotascredito`.`factura` AS `factura2`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdterceros`.`direccion` AS `direccion`,`bdclick3`.`bdterceros`.`telefono` AS `telefono`,`bdclick3`.`bdterceros`.`id` AS `Id`,`bdclick3`.`bdproductos`.`Codigo` AS `Codigo` from (((`bdclick3`.`bdnotascredito` join `bdclick3`.`bdnc` on((`bdclick3`.`bdnotascredito`.`NC` = `bdclick3`.`bdnc`.`Id`))) left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdnc`.`cliente` = `bdclick3`.`bdterceros`.`idSistema`))) join `bdclick3`.`bdproductos` on((`bdclick3`.`bdnotascredito`.`producto` = `bdclick3`.`bdproductos`.`idSistema`))) where ((not((`bdclick3`.`bdnotascredito`.`NC` like \'INI-*\'))) and (`bdclick3`.`bdnc`.`anulada` = 0))
md5=11890cfd2fb323a63480ad8ee47d190e
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:51
create-version=2
source=select `bdnotascredito`.`NC` AS `NC`,`bdnc`.`cliente` AS `cliente`,`bdnc`.`vendedor` AS `vendedor`,`bdnc`.`fecha` AS `fecha`,`bdnc`.`valor` AS `valor`,`bdnotascredito`.`producto` AS `producto`,`bdnotascredito`.`descripcion` AS `descripcion`,`bdnotascredito`.`lista` AS `lista`,`bdnotascredito`.`cant2` AS `cantidad`,`bdnotascredito`.`descuento` AS `descuento`,`bdnotascredito`.`total` AS `total`,`bdnotascredito`.`iva` AS `iva`,`bdnotascredito`.`impoconsumo` AS `impoconsumo`,`bdnotascredito`.`subtotal` AS `subtotal`,`bdnc`.`anulada` AS `anulada`,`bdnc`.`factura` AS `factura`,`bdnotascredito`.`factura` AS `factura2`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`id` AS `Id`,`bdproductos`.`Codigo` AS `Codigo` from (((`bdnotascredito` join `bdnc` on((`bdnotascredito`.`NC` = `bdnc`.`Id`))) left join `bdterceros` on((`bdnc`.`cliente` = `bdterceros`.`idSistema`))) join `bdproductos` on((`bdnotascredito`.`producto` = `bdproductos`.`idSistema`))) where ((not((`bdnotascredito`.`NC` like \'INI-*\'))) and (`bdnc`.`anulada` = 0))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdnotascredito`.`NC` AS `NC`,`bdclick3`.`bdnc`.`cliente` AS `cliente`,`bdclick3`.`bdnc`.`vendedor` AS `vendedor`,`bdclick3`.`bdnc`.`fecha` AS `fecha`,`bdclick3`.`bdnc`.`valor` AS `valor`,`bdclick3`.`bdnotascredito`.`producto` AS `producto`,`bdclick3`.`bdnotascredito`.`descripcion` AS `descripcion`,`bdclick3`.`bdnotascredito`.`lista` AS `lista`,`bdclick3`.`bdnotascredito`.`cant2` AS `cantidad`,`bdclick3`.`bdnotascredito`.`descuento` AS `descuento`,`bdclick3`.`bdnotascredito`.`total` AS `total`,`bdclick3`.`bdnotascredito`.`iva` AS `iva`,`bdclick3`.`bdnotascredito`.`impoconsumo` AS `impoconsumo`,`bdclick3`.`bdnotascredito`.`subtotal` AS `subtotal`,`bdclick3`.`bdnc`.`anulada` AS `anulada`,`bdclick3`.`bdnc`.`factura` AS `factura`,`bdclick3`.`bdnotascredito`.`factura` AS `factura2`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdterceros`.`direccion` AS `direccion`,`bdclick3`.`bdterceros`.`telefono` AS `telefono`,`bdclick3`.`bdterceros`.`id` AS `Id`,`bdclick3`.`bdproductos`.`Codigo` AS `Codigo` from (((`bdclick3`.`bdnotascredito` join `bdclick3`.`bdnc` on((`bdclick3`.`bdnotascredito`.`NC` = `bdclick3`.`bdnc`.`Id`))) left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdnc`.`cliente` = `bdclick3`.`bdterceros`.`idSistema`))) join `bdclick3`.`bdproductos` on((`bdclick3`.`bdnotascredito`.`producto` = `bdclick3`.`bdproductos`.`idSistema`))) where ((not((`bdclick3`.`bdnotascredito`.`NC` like \'INI-*\'))) and (`bdclick3`.`bdnc`.`anulada` = 0))
mariadb-version=100135