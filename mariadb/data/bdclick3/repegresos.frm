TYPE=VIEW
query=(select `bdclick3`.`bdegreso`.`Id` AS `Id`,`bdclick3`.`codsegresos`.`codigo` AS `codigo`,`bdclick3`.`bdegreso`.`fecha` AS `fecha`,`bdclick3`.`codsegresos`.`concepto` AS `concepto`,`bdclick3`.`bdegresocods`.`descripcion` AS `descripcion`,`bdclick3`.`bdegreso`.`nit` AS `nit`,`bdclick3`.`bdegreso`.`razon` AS `razon`,`bdclick3`.`bdegresocods`.`valor` AS `valor`,`bdclick3`.`bdegresocods`.`subtotal` AS `subtotal`,`bdclick3`.`bdegresocods`.`iva` AS `iva`,`bdclick3`.`bdegresocods`.`factura` AS `factura`,`bdclick3`.`bdegreso`.`anulada` AS `anulada`,`bdclick3`.`bdegreso`.`terminal` AS `terminal`,`bdclick3`.`bdegreso`.`tipo` AS `tipo`,`bdclick3`.`bdegreso`.`total` AS `total`,`bdclick3`.`bdegreso`.`subtotal` AS `subtotalEgreso`,`bdclick3`.`bdegreso`.`iva` AS `ivaEgreso`,`bdclick3`.`bdegreso`.`egreso` AS `egreso` from ((`bdclick3`.`codsegresos` join `bdclick3`.`bdegresocods` on((`bdclick3`.`codsegresos`.`codigo` = `bdclick3`.`bdegresocods`.`codigo`))) left join `bdclick3`.`bdegreso` on((`bdclick3`.`bdegresocods`.`egreso` = `bdclick3`.`bdegreso`.`Id`))) group by `bdclick3`.`bdegreso`.`Id`,`bdclick3`.`codsegresos`.`codigo`,`bdclick3`.`bdegreso`.`fecha`,`bdclick3`.`codsegresos`.`concepto`,`bdclick3`.`bdegresocods`.`descripcion`,`bdclick3`.`bdegreso`.`nit`,`bdclick3`.`bdegreso`.`razon`,`bdclick3`.`bdegresocods`.`valor`,`bdclick3`.`bdegresocods`.`subtotal`,`bdclick3`.`bdegresocods`.`iva`,`bdclick3`.`bdegresocods`.`factura`,`bdclick3`.`bdegreso`.`anulada`,`bdclick3`.`bdegreso`.`terminal`,`bdclick3`.`bdegreso`.`tipo`,`bdclick3`.`bdegreso`.`total`,`bdclick3`.`bdegreso`.`subtotal`,`bdclick3`.`bdegreso`.`iva`,`bdclick3`.`bdegreso`.`egreso`,`bdclick3`.`bdegresocods`.`codigo` having (`bdclick3`.`bdegreso`.`Id` <> \'\'))
md5=978ad3ad22eb4495edbc6e5badb0e8a8
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:53
create-version=2
source=(select `bdegreso`.`Id` AS `Id`,`codsegresos`.`codigo` AS `codigo`,`bdegreso`.`fecha` AS `fecha`,`codsegresos`.`concepto` AS `concepto`,`bdegresocods`.`descripcion` AS `descripcion`,`bdegreso`.`nit` AS `nit`,`bdegreso`.`razon` AS `razon`,`bdegresocods`.`valor` AS `valor`,`bdegresocods`.`subtotal` AS `subtotal`,`bdegresocods`.`iva` AS `iva`,`bdegresocods`.`factura` AS `factura`,`bdegreso`.`anulada` AS `anulada`,`bdegreso`.`terminal` AS `terminal`,`bdegreso`.`tipo` AS `tipo`,`bdegreso`.`total` AS `total`,`bdegreso`.`subtotal` AS `subtotalEgreso`,`bdegreso`.`iva` AS `ivaEgreso`,`bdegreso`.`egreso` AS `egreso` from ((`codsegresos` join `bdegresocods` on((`codsegresos`.`codigo` = `bdegresocods`.`codigo`))) left join `bdegreso` on((`bdegresocods`.`egreso` = `bdegreso`.`Id`))) group by `bdegreso`.`Id`,`codsegresos`.`codigo`,`bdegreso`.`fecha`,`codsegresos`.`concepto`,`bdegresocods`.`descripcion`,`bdegreso`.`nit`,`bdegreso`.`razon`,`bdegresocods`.`valor`,`bdegresocods`.`subtotal`,`bdegresocods`.`iva`,`bdegresocods`.`factura`,`bdegreso`.`anulada`,`bdegreso`.`terminal`,`bdegreso`.`tipo`,`bdegreso`.`total`,`bdegreso`.`subtotal`,`bdegreso`.`iva`,`bdegreso`.`egreso`,`bdegresocods`.`codigo` having (`bdegreso`.`Id` <> \'\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bdegreso`.`Id` AS `Id`,`bdclick3`.`codsegresos`.`codigo` AS `codigo`,`bdclick3`.`bdegreso`.`fecha` AS `fecha`,`bdclick3`.`codsegresos`.`concepto` AS `concepto`,`bdclick3`.`bdegresocods`.`descripcion` AS `descripcion`,`bdclick3`.`bdegreso`.`nit` AS `nit`,`bdclick3`.`bdegreso`.`razon` AS `razon`,`bdclick3`.`bdegresocods`.`valor` AS `valor`,`bdclick3`.`bdegresocods`.`subtotal` AS `subtotal`,`bdclick3`.`bdegresocods`.`iva` AS `iva`,`bdclick3`.`bdegresocods`.`factura` AS `factura`,`bdclick3`.`bdegreso`.`anulada` AS `anulada`,`bdclick3`.`bdegreso`.`terminal` AS `terminal`,`bdclick3`.`bdegreso`.`tipo` AS `tipo`,`bdclick3`.`bdegreso`.`total` AS `total`,`bdclick3`.`bdegreso`.`subtotal` AS `subtotalEgreso`,`bdclick3`.`bdegreso`.`iva` AS `ivaEgreso`,`bdclick3`.`bdegreso`.`egreso` AS `egreso` from ((`bdclick3`.`codsegresos` join `bdclick3`.`bdegresocods` on((`bdclick3`.`codsegresos`.`codigo` = `bdclick3`.`bdegresocods`.`codigo`))) left join `bdclick3`.`bdegreso` on((`bdclick3`.`bdegresocods`.`egreso` = `bdclick3`.`bdegreso`.`Id`))) group by `bdclick3`.`bdegreso`.`Id`,`bdclick3`.`codsegresos`.`codigo`,`bdclick3`.`bdegreso`.`fecha`,`bdclick3`.`codsegresos`.`concepto`,`bdclick3`.`bdegresocods`.`descripcion`,`bdclick3`.`bdegreso`.`nit`,`bdclick3`.`bdegreso`.`razon`,`bdclick3`.`bdegresocods`.`valor`,`bdclick3`.`bdegresocods`.`subtotal`,`bdclick3`.`bdegresocods`.`iva`,`bdclick3`.`bdegresocods`.`factura`,`bdclick3`.`bdegreso`.`anulada`,`bdclick3`.`bdegreso`.`terminal`,`bdclick3`.`bdegreso`.`tipo`,`bdclick3`.`bdegreso`.`total`,`bdclick3`.`bdegreso`.`subtotal`,`bdclick3`.`bdegreso`.`iva`,`bdclick3`.`bdegreso`.`egreso`,`bdclick3`.`bdegresocods`.`codigo` having (`bdclick3`.`bdegreso`.`Id` <> \'\'))
mariadb-version=100135