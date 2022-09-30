TYPE=VIEW
query=(select `bdclick5`.`bdegreso`.`Id` AS `Id`,`bdclick5`.`codsegresos`.`codigo` AS `codigo`,`bdclick5`.`bdegreso`.`fecha` AS `fecha`,`bdclick5`.`codsegresos`.`concepto` AS `concepto`,`bdclick5`.`bdegresocods`.`descripcion` AS `descripcion`,`bdclick5`.`bdegreso`.`nit` AS `nit`,`bdclick5`.`bdegreso`.`razon` AS `razon`,`bdclick5`.`bdegresocods`.`valor` AS `valor`,`bdclick5`.`bdegresocods`.`subtotal` AS `subtotal`,`bdclick5`.`bdegresocods`.`iva` AS `iva`,`bdclick5`.`bdegresocods`.`factura` AS `factura`,`bdclick5`.`bdegreso`.`anulada` AS `anulada`,`bdclick5`.`bdegreso`.`terminal` AS `terminal`,`bdclick5`.`bdegreso`.`tipo` AS `tipo`,`bdclick5`.`bdegreso`.`total` AS `total`,`bdclick5`.`bdegreso`.`subtotal` AS `subtotalEgreso`,`bdclick5`.`bdegreso`.`iva` AS `ivaEgreso`,`bdclick5`.`bdegreso`.`egreso` AS `egreso` from ((`bdclick5`.`codsegresos` join `bdclick5`.`bdegresocods` on((`bdclick5`.`codsegresos`.`codigo` = `bdclick5`.`bdegresocods`.`codigo`))) left join `bdclick5`.`bdegreso` on((`bdclick5`.`bdegresocods`.`egreso` = `bdclick5`.`bdegreso`.`Id`))) group by `bdclick5`.`bdegreso`.`Id`,`bdclick5`.`codsegresos`.`codigo`,`bdclick5`.`bdegreso`.`fecha`,`bdclick5`.`codsegresos`.`concepto`,`bdclick5`.`bdegresocods`.`descripcion`,`bdclick5`.`bdegreso`.`nit`,`bdclick5`.`bdegreso`.`razon`,`bdclick5`.`bdegresocods`.`valor`,`bdclick5`.`bdegresocods`.`subtotal`,`bdclick5`.`bdegresocods`.`iva`,`bdclick5`.`bdegresocods`.`factura`,`bdclick5`.`bdegreso`.`anulada`,`bdclick5`.`bdegreso`.`terminal`,`bdclick5`.`bdegreso`.`tipo`,`bdclick5`.`bdegreso`.`total`,`bdclick5`.`bdegreso`.`subtotal`,`bdclick5`.`bdegreso`.`iva`,`bdclick5`.`bdegreso`.`egreso`,`bdclick5`.`bdegresocods`.`codigo` having (`bdclick5`.`bdegreso`.`Id` <> \'\'))
md5=6ecdd8494e264d0b193a0000be957c75
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:49
create-version=2
source=(select `bdegreso`.`Id` AS `Id`,`codsegresos`.`codigo` AS `codigo`,`bdegreso`.`fecha` AS `fecha`,`codsegresos`.`concepto` AS `concepto`,`bdegresocods`.`descripcion` AS `descripcion`,`bdegreso`.`nit` AS `nit`,`bdegreso`.`razon` AS `razon`,`bdegresocods`.`valor` AS `valor`,`bdegresocods`.`subtotal` AS `subtotal`,`bdegresocods`.`iva` AS `iva`,`bdegresocods`.`factura` AS `factura`,`bdegreso`.`anulada` AS `anulada`,`bdegreso`.`terminal` AS `terminal`,`bdegreso`.`tipo` AS `tipo`,`bdegreso`.`total` AS `total`,`bdegreso`.`subtotal` AS `subtotalEgreso`,`bdegreso`.`iva` AS `ivaEgreso`,`bdegreso`.`egreso` AS `egreso` from ((`codsegresos` join `bdegresocods` on((`codsegresos`.`codigo` = `bdegresocods`.`codigo`))) left join `bdegreso` on((`bdegresocods`.`egreso` = `bdegreso`.`Id`))) group by `bdegreso`.`Id`,`codsegresos`.`codigo`,`bdegreso`.`fecha`,`codsegresos`.`concepto`,`bdegresocods`.`descripcion`,`bdegreso`.`nit`,`bdegreso`.`razon`,`bdegresocods`.`valor`,`bdegresocods`.`subtotal`,`bdegresocods`.`iva`,`bdegresocods`.`factura`,`bdegreso`.`anulada`,`bdegreso`.`terminal`,`bdegreso`.`tipo`,`bdegreso`.`total`,`bdegreso`.`subtotal`,`bdegreso`.`iva`,`bdegreso`.`egreso`,`bdegresocods`.`codigo` having (`bdegreso`.`Id` <> \'\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`bdegreso`.`Id` AS `Id`,`bdclick5`.`codsegresos`.`codigo` AS `codigo`,`bdclick5`.`bdegreso`.`fecha` AS `fecha`,`bdclick5`.`codsegresos`.`concepto` AS `concepto`,`bdclick5`.`bdegresocods`.`descripcion` AS `descripcion`,`bdclick5`.`bdegreso`.`nit` AS `nit`,`bdclick5`.`bdegreso`.`razon` AS `razon`,`bdclick5`.`bdegresocods`.`valor` AS `valor`,`bdclick5`.`bdegresocods`.`subtotal` AS `subtotal`,`bdclick5`.`bdegresocods`.`iva` AS `iva`,`bdclick5`.`bdegresocods`.`factura` AS `factura`,`bdclick5`.`bdegreso`.`anulada` AS `anulada`,`bdclick5`.`bdegreso`.`terminal` AS `terminal`,`bdclick5`.`bdegreso`.`tipo` AS `tipo`,`bdclick5`.`bdegreso`.`total` AS `total`,`bdclick5`.`bdegreso`.`subtotal` AS `subtotalEgreso`,`bdclick5`.`bdegreso`.`iva` AS `ivaEgreso`,`bdclick5`.`bdegreso`.`egreso` AS `egreso` from ((`bdclick5`.`codsegresos` join `bdclick5`.`bdegresocods` on((`bdclick5`.`codsegresos`.`codigo` = `bdclick5`.`bdegresocods`.`codigo`))) left join `bdclick5`.`bdegreso` on((`bdclick5`.`bdegresocods`.`egreso` = `bdclick5`.`bdegreso`.`Id`))) group by `bdclick5`.`bdegreso`.`Id`,`bdclick5`.`codsegresos`.`codigo`,`bdclick5`.`bdegreso`.`fecha`,`bdclick5`.`codsegresos`.`concepto`,`bdclick5`.`bdegresocods`.`descripcion`,`bdclick5`.`bdegreso`.`nit`,`bdclick5`.`bdegreso`.`razon`,`bdclick5`.`bdegresocods`.`valor`,`bdclick5`.`bdegresocods`.`subtotal`,`bdclick5`.`bdegresocods`.`iva`,`bdclick5`.`bdegresocods`.`factura`,`bdclick5`.`bdegreso`.`anulada`,`bdclick5`.`bdegreso`.`terminal`,`bdclick5`.`bdegreso`.`tipo`,`bdclick5`.`bdegreso`.`total`,`bdclick5`.`bdegreso`.`subtotal`,`bdclick5`.`bdegreso`.`iva`,`bdclick5`.`bdegreso`.`egreso`,`bdclick5`.`bdegresocods`.`codigo` having (`bdclick5`.`bdegreso`.`Id` <> \'\'))
mariadb-version=100135