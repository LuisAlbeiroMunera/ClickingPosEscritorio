TYPE=VIEW
query=(select `bdclick`.`bdegresocods`.`egreso` AS `egreso`,`bdclick`.`bdegreso`.`nit` AS `nit`,`bdclick`.`bdegreso`.`razon` AS `razon`,`bdclick`.`bdegreso`.`telefono` AS `telefono`,`bdclick`.`bdegreso`.`direccion` AS `direccion`,`bdclick`.`bdegreso`.`total` AS `total`,`bdclick`.`bdegreso`.`subtotal` AS `subtotal`,`bdclick`.`bdegreso`.`iva` AS `iva`,`bdclick`.`bdegreso`.`cred1` AS `cred1`,`bdclick`.`bdegreso`.`cred2` AS `cred2`,`bdclick`.`bdegreso`.`deb1` AS `deb1`,`bdclick`.`bdegreso`.`deb2` AS `deb2`,`bdclick`.`bdegreso`.`cheque` AS `cheque`,`bdclick`.`bdegreso`.`banco` AS `banco`,`bdclick`.`bdegreso`.`efectivo` AS `efectivo`,`bdclick`.`bdegreso`.`fecha` AS `fecha`,`bdclick`.`bdegresocods`.`codigo` AS `codigo`,`bdclick`.`bdegresocods`.`descripcion` AS `descripcion`,`bdclick`.`bdegresocods`.`valor` AS `valor`,`bdclick`.`codsegresos`.`concepto` AS `concepto`,`bdclick`.`bdegresocods`.`codigoUsuario` AS `codigoUsuario`,`bdclick`.`bdegresocods`.`subtotal` AS `sub`,`bdclick`.`bdegresocods`.`iva` AS `ivaa`,`bdclick`.`bdegresocods`.`factura` AS `factura`,`bdclick`.`bdegreso`.`egreso` AS `egreso1`,substr(`bdclick`.`bdegreso`.`egreso`,5) AS `egreso2` from ((`bdclick`.`bdegreso` left join `bdclick`.`bdegresocods` on((`bdclick`.`bdegresocods`.`egreso` = `bdclick`.`bdegreso`.`Id`))) left join `bdclick`.`codsegresos` on((`bdclick`.`bdegresocods`.`codigo` = `bdclick`.`codsegresos`.`codigo`))))
md5=c5a21ec610fe188ea40d80ddf2ee5275
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:23
create-version=2
source=(select `bdegresocods`.`egreso` AS `egreso`,`bdegreso`.`nit` AS `nit`,`bdegreso`.`razon` AS `razon`,`bdegreso`.`telefono` AS `telefono`,`bdegreso`.`direccion` AS `direccion`,`bdegreso`.`total` AS `total`,`bdegreso`.`subtotal` AS `subtotal`,`bdegreso`.`iva` AS `iva`,`bdegreso`.`cred1` AS `cred1`,`bdegreso`.`cred2` AS `cred2`,`bdegreso`.`deb1` AS `deb1`,`bdegreso`.`deb2` AS `deb2`,`bdegreso`.`cheque` AS `cheque`,`bdegreso`.`banco` AS `banco`,`bdegreso`.`efectivo` AS `efectivo`,`bdegreso`.`fecha` AS `fecha`,`bdegresocods`.`codigo` AS `codigo`,`bdegresocods`.`descripcion` AS `descripcion`,`bdegresocods`.`valor` AS `valor`,`codsegresos`.`concepto` AS `concepto`,`bdegresocods`.`codigoUsuario` AS `codigoUsuario`,`bdegresocods`.`subtotal` AS `sub`,`bdegresocods`.`iva` AS `ivaa`,`bdegresocods`.`factura` AS `factura`,`bdegreso`.`egreso` AS `egreso1`,substr(`bdegreso`.`egreso`,5) AS `egreso2` from ((`bdegreso` left join `bdegresocods` on((`bdegresocods`.`egreso` = `bdegreso`.`Id`))) left join `codsegresos` on((`bdegresocods`.`codigo` = `codsegresos`.`codigo`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdegresocods`.`egreso` AS `egreso`,`bdclick`.`bdegreso`.`nit` AS `nit`,`bdclick`.`bdegreso`.`razon` AS `razon`,`bdclick`.`bdegreso`.`telefono` AS `telefono`,`bdclick`.`bdegreso`.`direccion` AS `direccion`,`bdclick`.`bdegreso`.`total` AS `total`,`bdclick`.`bdegreso`.`subtotal` AS `subtotal`,`bdclick`.`bdegreso`.`iva` AS `iva`,`bdclick`.`bdegreso`.`cred1` AS `cred1`,`bdclick`.`bdegreso`.`cred2` AS `cred2`,`bdclick`.`bdegreso`.`deb1` AS `deb1`,`bdclick`.`bdegreso`.`deb2` AS `deb2`,`bdclick`.`bdegreso`.`cheque` AS `cheque`,`bdclick`.`bdegreso`.`banco` AS `banco`,`bdclick`.`bdegreso`.`efectivo` AS `efectivo`,`bdclick`.`bdegreso`.`fecha` AS `fecha`,`bdclick`.`bdegresocods`.`codigo` AS `codigo`,`bdclick`.`bdegresocods`.`descripcion` AS `descripcion`,`bdclick`.`bdegresocods`.`valor` AS `valor`,`bdclick`.`codsegresos`.`concepto` AS `concepto`,`bdclick`.`bdegresocods`.`codigoUsuario` AS `codigoUsuario`,`bdclick`.`bdegresocods`.`subtotal` AS `sub`,`bdclick`.`bdegresocods`.`iva` AS `ivaa`,`bdclick`.`bdegresocods`.`factura` AS `factura`,`bdclick`.`bdegreso`.`egreso` AS `egreso1`,substr(`bdclick`.`bdegreso`.`egreso`,5) AS `egreso2` from ((`bdclick`.`bdegreso` left join `bdclick`.`bdegresocods` on((`bdclick`.`bdegresocods`.`egreso` = `bdclick`.`bdegreso`.`Id`))) left join `bdclick`.`codsegresos` on((`bdclick`.`bdegresocods`.`codigo` = `bdclick`.`codsegresos`.`codigo`))))
mariadb-version=100135
