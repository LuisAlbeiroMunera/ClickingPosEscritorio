TYPE=VIEW
query=(select `bdclick5`.`bdegresocods`.`egreso` AS `egreso`,`bdclick5`.`bdegreso`.`nit` AS `nit`,`bdclick5`.`bdegreso`.`razon` AS `razon`,`bdclick5`.`bdegreso`.`telefono` AS `telefono`,`bdclick5`.`bdegreso`.`direccion` AS `direccion`,`bdclick5`.`bdegreso`.`total` AS `total`,`bdclick5`.`bdegreso`.`subtotal` AS `subtotal`,`bdclick5`.`bdegreso`.`iva` AS `iva`,`bdclick5`.`bdegreso`.`cred1` AS `cred1`,`bdclick5`.`bdegreso`.`cred2` AS `cred2`,`bdclick5`.`bdegreso`.`deb1` AS `deb1`,`bdclick5`.`bdegreso`.`deb2` AS `deb2`,`bdclick5`.`bdegreso`.`cheque` AS `cheque`,`bdclick5`.`bdegreso`.`banco` AS `banco`,`bdclick5`.`bdegreso`.`efectivo` AS `efectivo`,`bdclick5`.`bdegreso`.`fecha` AS `fecha`,`bdclick5`.`bdegresocods`.`codigo` AS `codigo`,`bdclick5`.`bdegresocods`.`descripcion` AS `descripcion`,`bdclick5`.`bdegresocods`.`valor` AS `valor`,`bdclick5`.`codsegresos`.`concepto` AS `concepto`,`bdclick5`.`bdegresocods`.`codigoUsuario` AS `codigoUsuario`,`bdclick5`.`bdegresocods`.`subtotal` AS `sub`,`bdclick5`.`bdegresocods`.`iva` AS `ivaa`,`bdclick5`.`bdegresocods`.`factura` AS `factura`,`bdclick5`.`bdegreso`.`egreso` AS `egreso1`,substr(`bdclick5`.`bdegreso`.`egreso`,5) AS `egreso2` from ((`bdclick5`.`bdegreso` left join `bdclick5`.`bdegresocods` on((`bdclick5`.`bdegresocods`.`egreso` = `bdclick5`.`bdegreso`.`Id`))) left join `bdclick5`.`codsegresos` on((`bdclick5`.`bdegresocods`.`codigo` = `bdclick5`.`codsegresos`.`codigo`))))
md5=52d23ed9d0dd0b5b6ec31f79801c44d6
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:46
create-version=2
source=(select `bdegresocods`.`egreso` AS `egreso`,`bdegreso`.`nit` AS `nit`,`bdegreso`.`razon` AS `razon`,`bdegreso`.`telefono` AS `telefono`,`bdegreso`.`direccion` AS `direccion`,`bdegreso`.`total` AS `total`,`bdegreso`.`subtotal` AS `subtotal`,`bdegreso`.`iva` AS `iva`,`bdegreso`.`cred1` AS `cred1`,`bdegreso`.`cred2` AS `cred2`,`bdegreso`.`deb1` AS `deb1`,`bdegreso`.`deb2` AS `deb2`,`bdegreso`.`cheque` AS `cheque`,`bdegreso`.`banco` AS `banco`,`bdegreso`.`efectivo` AS `efectivo`,`bdegreso`.`fecha` AS `fecha`,`bdegresocods`.`codigo` AS `codigo`,`bdegresocods`.`descripcion` AS `descripcion`,`bdegresocods`.`valor` AS `valor`,`codsegresos`.`concepto` AS `concepto`,`bdegresocods`.`codigoUsuario` AS `codigoUsuario`,`bdegresocods`.`subtotal` AS `sub`,`bdegresocods`.`iva` AS `ivaa`,`bdegresocods`.`factura` AS `factura`,`bdegreso`.`egreso` AS `egreso1`,substr(`bdegreso`.`egreso`,5) AS `egreso2` from ((`bdegreso` left join `bdegresocods` on((`bdegresocods`.`egreso` = `bdegreso`.`Id`))) left join `codsegresos` on((`bdegresocods`.`codigo` = `codsegresos`.`codigo`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`bdegresocods`.`egreso` AS `egreso`,`bdclick5`.`bdegreso`.`nit` AS `nit`,`bdclick5`.`bdegreso`.`razon` AS `razon`,`bdclick5`.`bdegreso`.`telefono` AS `telefono`,`bdclick5`.`bdegreso`.`direccion` AS `direccion`,`bdclick5`.`bdegreso`.`total` AS `total`,`bdclick5`.`bdegreso`.`subtotal` AS `subtotal`,`bdclick5`.`bdegreso`.`iva` AS `iva`,`bdclick5`.`bdegreso`.`cred1` AS `cred1`,`bdclick5`.`bdegreso`.`cred2` AS `cred2`,`bdclick5`.`bdegreso`.`deb1` AS `deb1`,`bdclick5`.`bdegreso`.`deb2` AS `deb2`,`bdclick5`.`bdegreso`.`cheque` AS `cheque`,`bdclick5`.`bdegreso`.`banco` AS `banco`,`bdclick5`.`bdegreso`.`efectivo` AS `efectivo`,`bdclick5`.`bdegreso`.`fecha` AS `fecha`,`bdclick5`.`bdegresocods`.`codigo` AS `codigo`,`bdclick5`.`bdegresocods`.`descripcion` AS `descripcion`,`bdclick5`.`bdegresocods`.`valor` AS `valor`,`bdclick5`.`codsegresos`.`concepto` AS `concepto`,`bdclick5`.`bdegresocods`.`codigoUsuario` AS `codigoUsuario`,`bdclick5`.`bdegresocods`.`subtotal` AS `sub`,`bdclick5`.`bdegresocods`.`iva` AS `ivaa`,`bdclick5`.`bdegresocods`.`factura` AS `factura`,`bdclick5`.`bdegreso`.`egreso` AS `egreso1`,substr(`bdclick5`.`bdegreso`.`egreso`,5) AS `egreso2` from ((`bdclick5`.`bdegreso` left join `bdclick5`.`bdegresocods` on((`bdclick5`.`bdegresocods`.`egreso` = `bdclick5`.`bdegreso`.`Id`))) left join `bdclick5`.`codsegresos` on((`bdclick5`.`bdegresocods`.`codigo` = `bdclick5`.`codsegresos`.`codigo`))))
mariadb-version=100135