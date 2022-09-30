TYPE=VIEW
query=select `bdclick6`.`bdnotascredito`.`factura` AS `factura`,`bdclick6`.`bdnc`.`factura` AS `factura2`,`bdclick6`.`bdnotascredito`.`producto` AS `producto`,`bdclick6`.`bdnotascredito`.`descripcion` AS `descripcion`,`bdclick6`.`bdnotascredito`.`lista` AS `lista`,`bdclick6`.`bdnotascredito`.`cantidad` AS `cantidad`,`bdclick6`.`bdnotascredito`.`subtotal` AS `subtotal`,`bdclick6`.`bdnotascredito`.`descuento` AS `descuento`,`bdclick6`.`bdproductos`.`IVA` AS `porIva`,`bdclick6`.`bdnotascredito`.`iva` AS `valIva`,`bdclick6`.`bdnotascredito`.`total` AS `total`,`bdclick6`.`bdnc`.`Id` AS `Id`,`bdclick6`.`bdnc`.`anulada` AS `anulada`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdterceros`.`id` AS `idTercero`,`bdclick6`.`bdnc`.`fecha` AS `fecha`,`bdclick6`.`bdnc`.`vendedor` AS `vendedor`,`bdclick6`.`bdnc`.`restante` AS `restante`,`bdclick6`.`bdnotascredito`.`cant2` AS `cant2`,`bdclick6`.`bdnc`.`terminal` AS `terminal`,`bdclick6`.`bdnc`.`reembolsar` AS `reembolsar`,`bdclick6`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick6`.`bdterceros`.`idSistema` AS `idSistema`,`bdclick6`.`bdnc`.`hora` AS `hora` from (((`bdclick6`.`bdnotascredito` left join `bdclick6`.`bdnc` on((`bdclick6`.`bdnotascredito`.`NC` = `bdclick6`.`bdnc`.`Id`))) left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdnc`.`cliente` = `bdclick6`.`bdterceros`.`idSistema`))) left join `bdclick6`.`bdproductos` on((`bdclick6`.`bdnotascredito`.`producto` = `bdclick6`.`bdproductos`.`idSistema`))) where (`bdclick6`.`bdnotascredito`.`factura` like \'% NC\')
md5=350792563c2140bab55a1bf07e723f90
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:33
create-version=2
source=select `bdnotascredito`.`factura` AS `factura`,`bdnc`.`factura` AS `factura2`,`bdnotascredito`.`producto` AS `producto`,`bdnotascredito`.`descripcion` AS `descripcion`,`bdnotascredito`.`lista` AS `lista`,`bdnotascredito`.`cantidad` AS `cantidad`,`bdnotascredito`.`subtotal` AS `subtotal`,`bdnotascredito`.`descuento` AS `descuento`,`bdproductos`.`IVA` AS `porIva`,`bdnotascredito`.`iva` AS `valIva`,`bdnotascredito`.`total` AS `total`,`bdnc`.`Id` AS `Id`,`bdnc`.`anulada` AS `anulada`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`id` AS `idTercero`,`bdnc`.`fecha` AS `fecha`,`bdnc`.`vendedor` AS `vendedor`,`bdnc`.`restante` AS `restante`,`bdnotascredito`.`cant2` AS `cant2`,`bdnc`.`terminal` AS `terminal`,`bdnc`.`reembolsar` AS `reembolsar`,`bdproductos`.`Codigo` AS `Codigo`,`bdterceros`.`idSistema` AS `idSistema`,`bdnc`.`hora` AS `hora` from (((`bdnotascredito` left join `bdnc` on((`bdnotascredito`.`NC` = `bdnc`.`Id`))) left join `bdterceros` on((`bdnc`.`cliente` = `bdterceros`.`idSistema`))) left join `bdproductos` on((`bdnotascredito`.`producto` = `bdproductos`.`idSistema`))) where (`bdnotascredito`.`factura` like \'% NC\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdnotascredito`.`factura` AS `factura`,`bdclick6`.`bdnc`.`factura` AS `factura2`,`bdclick6`.`bdnotascredito`.`producto` AS `producto`,`bdclick6`.`bdnotascredito`.`descripcion` AS `descripcion`,`bdclick6`.`bdnotascredito`.`lista` AS `lista`,`bdclick6`.`bdnotascredito`.`cantidad` AS `cantidad`,`bdclick6`.`bdnotascredito`.`subtotal` AS `subtotal`,`bdclick6`.`bdnotascredito`.`descuento` AS `descuento`,`bdclick6`.`bdproductos`.`IVA` AS `porIva`,`bdclick6`.`bdnotascredito`.`iva` AS `valIva`,`bdclick6`.`bdnotascredito`.`total` AS `total`,`bdclick6`.`bdnc`.`Id` AS `Id`,`bdclick6`.`bdnc`.`anulada` AS `anulada`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdterceros`.`id` AS `idTercero`,`bdclick6`.`bdnc`.`fecha` AS `fecha`,`bdclick6`.`bdnc`.`vendedor` AS `vendedor`,`bdclick6`.`bdnc`.`restante` AS `restante`,`bdclick6`.`bdnotascredito`.`cant2` AS `cant2`,`bdclick6`.`bdnc`.`terminal` AS `terminal`,`bdclick6`.`bdnc`.`reembolsar` AS `reembolsar`,`bdclick6`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick6`.`bdterceros`.`idSistema` AS `idSistema`,`bdclick6`.`bdnc`.`hora` AS `hora` from (((`bdclick6`.`bdnotascredito` left join `bdclick6`.`bdnc` on((`bdclick6`.`bdnotascredito`.`NC` = `bdclick6`.`bdnc`.`Id`))) left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdnc`.`cliente` = `bdclick6`.`bdterceros`.`idSistema`))) left join `bdclick6`.`bdproductos` on((`bdclick6`.`bdnotascredito`.`producto` = `bdclick6`.`bdproductos`.`idSistema`))) where (`bdclick6`.`bdnotascredito`.`factura` like \'% NC\')
mariadb-version=100135