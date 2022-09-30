TYPE=VIEW
query=(select `bdclick4`.`bdnotascredito`.`factura` AS `factura`,(`bdclick4`.`bdfactura`.`factura` + \' NC\') AS `factura2`,`bdclick4`.`bdnotascredito`.`producto` AS `producto`,`bdclick4`.`bdnotascredito`.`descripcion` AS `descripcion`,`bdclick4`.`bdnotascredito`.`lista` AS `lista`,`bdclick4`.`bdnotascredito`.`cantidad` AS `cantidad`,`bdclick4`.`bdnotascredito`.`subtotal` AS `subtotal`,`bdclick4`.`bdnotascredito`.`descuento` AS `descuento`,`bdclick4`.`bdproductos`.`IVA` AS `porIva`,`bdclick4`.`bdnotascredito`.`iva` AS `valIva`,`bdclick4`.`bdnotascredito`.`total` AS `total`,`bdclick4`.`bdnc`.`Id` AS `Id`,`bdclick4`.`bdnc`.`anulada` AS `anulada`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,`bdclick4`.`bdterceros`.`id` AS `idTercero`,`bdclick4`.`bdnc`.`fecha` AS `fecha`,`bdclick4`.`bdnc`.`vendedor` AS `vendedor`,`bdclick4`.`bdnc`.`restante` AS `restante`,`bdclick4`.`bdnotascredito`.`cant2` AS `cant2`,`bdclick4`.`bdnc`.`terminal` AS `terminal`,`bdclick4`.`bdnc`.`usuario` AS `usuario`,`bdclick4`.`bdnc`.`bodega` AS `bodega` from ((((`bdclick4`.`bdnotascredito` left join `bdclick4`.`bdproductos` on((`bdclick4`.`bdnotascredito`.`producto` = `bdclick4`.`bdproductos`.`idSistema`))) left join `bdclick4`.`bdnc` on((`bdclick4`.`bdnotascredito`.`NC` = `bdclick4`.`bdnc`.`Id`))) left join `bdclick4`.`bdterceros` on((`bdclick4`.`bdnc`.`cliente` = `bdclick4`.`bdterceros`.`idSistema`))) left join `bdclick4`.`bdfactura` on((`bdclick4`.`bdnc`.`factura` = `bdclick4`.`bdfactura`.`idFactura`))) group by `bdclick4`.`bdnotascredito`.`factura`,(`bdclick4`.`bdfactura`.`factura` + \' NC\'),`bdclick4`.`bdnotascredito`.`producto`,`bdclick4`.`bdnotascredito`.`descripcion`,`bdclick4`.`bdnotascredito`.`lista`,`bdclick4`.`bdnotascredito`.`cantidad`,`bdclick4`.`bdnotascredito`.`subtotal`,`bdclick4`.`bdnotascredito`.`descuento`,`bdclick4`.`bdproductos`.`IVA`,`bdclick4`.`bdnotascredito`.`iva`,`bdclick4`.`bdnotascredito`.`total`,`bdclick4`.`bdnc`.`Id`,`bdclick4`.`bdnc`.`anulada`,`bdclick4`.`bdterceros`.`nombre`,`bdclick4`.`bdterceros`.`idSistema`,`bdclick4`.`bdnc`.`fecha`,`bdclick4`.`bdnc`.`vendedor`,`bdclick4`.`bdnc`.`restante`,`bdclick4`.`bdnotascredito`.`cant2`,`bdclick4`.`bdnc`.`terminal`,`bdclick4`.`bdnotascredito`.`descuento`,`bdclick4`.`bdnc`.`usuario` having ((`bdclick4`.`bdnotascredito`.`factura` like \'* NC\') and (`bdclick4`.`bdnc`.`anulada` = 0) and (`bdclick4`.`bdnc`.`anulada` = 0)))
md5=dfc395b49bf5ef5278fd061332d11940
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:28
create-version=2
source=(select `bdnotascredito`.`factura` AS `factura`,(`bdfactura`.`factura` + \' NC\') AS `factura2`,`bdnotascredito`.`producto` AS `producto`,`bdnotascredito`.`descripcion` AS `descripcion`,`bdnotascredito`.`lista` AS `lista`,`bdnotascredito`.`cantidad` AS `cantidad`,`bdnotascredito`.`subtotal` AS `subtotal`,`bdnotascredito`.`descuento` AS `descuento`,`bdproductos`.`IVA` AS `porIva`,`bdnotascredito`.`iva` AS `valIva`,`bdnotascredito`.`total` AS `total`,`bdnc`.`Id` AS `Id`,`bdnc`.`anulada` AS `anulada`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`id` AS `idTercero`,`bdnc`.`fecha` AS `fecha`,`bdnc`.`vendedor` AS `vendedor`,`bdnc`.`restante` AS `restante`,`bdnotascredito`.`cant2` AS `cant2`,`bdnc`.`terminal` AS `terminal`,`bdnc`.`usuario` AS `usuario`,`bdnc`.`bodega` AS `bodega` from ((((`bdnotascredito` left join `bdproductos` on((`bdnotascredito`.`producto` = `bdproductos`.`idSistema`))) left join `bdnc` on((`bdnotascredito`.`NC` = `bdnc`.`Id`))) left join `bdterceros` on((`bdnc`.`cliente` = `bdterceros`.`idSistema`))) left join `bdfactura` on((`bdnc`.`factura` = `bdfactura`.`idFactura`))) group by `bdnotascredito`.`factura`,(`bdfactura`.`factura` + \' NC\'),`bdnotascredito`.`producto`,`bdnotascredito`.`descripcion`,`bdnotascredito`.`lista`,`bdnotascredito`.`cantidad`,`bdnotascredito`.`subtotal`,`bdnotascredito`.`descuento`,`bdproductos`.`IVA`,`bdnotascredito`.`iva`,`bdnotascredito`.`total`,`bdnc`.`Id`,`bdnc`.`anulada`,`bdterceros`.`nombre`,`bdterceros`.`idSistema`,`bdnc`.`fecha`,`bdnc`.`vendedor`,`bdnc`.`restante`,`bdnotascredito`.`cant2`,`bdnc`.`terminal`,`bdnotascredito`.`descuento`,`bdnc`.`usuario` having ((`bdnotascredito`.`factura` like \'* NC\') and (`bdnc`.`anulada` = 0) and (`bdnc`.`anulada` = 0)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`bdnotascredito`.`factura` AS `factura`,(`bdclick4`.`bdfactura`.`factura` + \' NC\') AS `factura2`,`bdclick4`.`bdnotascredito`.`producto` AS `producto`,`bdclick4`.`bdnotascredito`.`descripcion` AS `descripcion`,`bdclick4`.`bdnotascredito`.`lista` AS `lista`,`bdclick4`.`bdnotascredito`.`cantidad` AS `cantidad`,`bdclick4`.`bdnotascredito`.`subtotal` AS `subtotal`,`bdclick4`.`bdnotascredito`.`descuento` AS `descuento`,`bdclick4`.`bdproductos`.`IVA` AS `porIva`,`bdclick4`.`bdnotascredito`.`iva` AS `valIva`,`bdclick4`.`bdnotascredito`.`total` AS `total`,`bdclick4`.`bdnc`.`Id` AS `Id`,`bdclick4`.`bdnc`.`anulada` AS `anulada`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,`bdclick4`.`bdterceros`.`id` AS `idTercero`,`bdclick4`.`bdnc`.`fecha` AS `fecha`,`bdclick4`.`bdnc`.`vendedor` AS `vendedor`,`bdclick4`.`bdnc`.`restante` AS `restante`,`bdclick4`.`bdnotascredito`.`cant2` AS `cant2`,`bdclick4`.`bdnc`.`terminal` AS `terminal`,`bdclick4`.`bdnc`.`usuario` AS `usuario`,`bdclick4`.`bdnc`.`bodega` AS `bodega` from ((((`bdclick4`.`bdnotascredito` left join `bdclick4`.`bdproductos` on((`bdclick4`.`bdnotascredito`.`producto` = `bdclick4`.`bdproductos`.`idSistema`))) left join `bdclick4`.`bdnc` on((`bdclick4`.`bdnotascredito`.`NC` = `bdclick4`.`bdnc`.`Id`))) left join `bdclick4`.`bdterceros` on((`bdclick4`.`bdnc`.`cliente` = `bdclick4`.`bdterceros`.`idSistema`))) left join `bdclick4`.`bdfactura` on((`bdclick4`.`bdnc`.`factura` = `bdclick4`.`bdfactura`.`idFactura`))) group by `bdclick4`.`bdnotascredito`.`factura`,(`bdclick4`.`bdfactura`.`factura` + \' NC\'),`bdclick4`.`bdnotascredito`.`producto`,`bdclick4`.`bdnotascredito`.`descripcion`,`bdclick4`.`bdnotascredito`.`lista`,`bdclick4`.`bdnotascredito`.`cantidad`,`bdclick4`.`bdnotascredito`.`subtotal`,`bdclick4`.`bdnotascredito`.`descuento`,`bdclick4`.`bdproductos`.`IVA`,`bdclick4`.`bdnotascredito`.`iva`,`bdclick4`.`bdnotascredito`.`total`,`bdclick4`.`bdnc`.`Id`,`bdclick4`.`bdnc`.`anulada`,`bdclick4`.`bdterceros`.`nombre`,`bdclick4`.`bdterceros`.`idSistema`,`bdclick4`.`bdnc`.`fecha`,`bdclick4`.`bdnc`.`vendedor`,`bdclick4`.`bdnc`.`restante`,`bdclick4`.`bdnotascredito`.`cant2`,`bdclick4`.`bdnc`.`terminal`,`bdclick4`.`bdnotascredito`.`descuento`,`bdclick4`.`bdnc`.`usuario` having ((`bdclick4`.`bdnotascredito`.`factura` like \'* NC\') and (`bdclick4`.`bdnc`.`anulada` = 0) and (`bdclick4`.`bdnc`.`anulada` = 0)))
mariadb-version=100135