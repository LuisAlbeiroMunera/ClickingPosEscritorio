TYPE=VIEW
query=select `bdclick6`.`bdcxc`.`factura` AS `fact`,`bdclick6`.`bdcxc`.`tipo` AS `tipo`,`bdclick6`.`bdcxc`.`estado` AS `estado`,`bdclick6`.`bdcxc`.`recibo` AS `recibo`,`bdclick6`.`bdcxc`.`valor` AS `valor`,`bdclick6`.`bdcxc`.`plazo` AS `plazo`,`bdclick6`.`bdcxc`.`vencimiento` AS `vencimiento`,`bdclick6`.`bdterceros`.`id` AS `cliente`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdcuentacobro`.`fechaFactura` AS `fechaFactura`,`bdclick6`.`bdcuentacobro`.`anulada` AS `anulada`,`bdclick6`.`bdcxc`.`factura` AS `factura`,`bdclick6`.`bdcuentacobro`.`vendedor` AS `vendedor`,`bdclick6`.`bdcuentacobro`.`terminal` AS `terminal`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,`bdclick6`.`bdcuentacobro`.`placa` AS `placa`,`bdclick6`.`bdterceros`.`direccion` AS `direccion`,`bdclick6`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick6`.`bdterceros`.`idSistema` AS `idSistema` from (`bdclick6`.`bdcxc` left join (`bdclick6`.`bdcuentacobro` left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdcuentacobro`.`cliente` = `bdclick6`.`bdterceros`.`idSistema`))) on((`bdclick6`.`bdcxc`.`factura` = `bdclick6`.`bdcuentacobro`.`idFactura`))) group by `bdclick6`.`bdcxc`.`factura`,`bdclick6`.`bdcxc`.`tipo`,`bdclick6`.`bdcxc`.`estado`,`bdclick6`.`bdcxc`.`recibo`,`bdclick6`.`bdcxc`.`valor`,`bdclick6`.`bdcxc`.`plazo`,`bdclick6`.`bdcxc`.`vencimiento`,`bdclick6`.`bdterceros`.`id`,`bdclick6`.`bdterceros`.`nombre`,`bdclick6`.`bdcuentacobro`.`fechaFactura`,`bdclick6`.`bdcuentacobro`.`anulada`,`bdclick6`.`bdcxc`.`factura`,`bdclick6`.`bdcuentacobro`.`vendedor`,`bdclick6`.`bdcuentacobro`.`terminal`,`bdclick6`.`bdterceros`.`telefono`,`bdclick6`.`bdcuentacobro`.`placa`,`bdclick6`.`bdterceros`.`direccion`,`bdclick6`.`bdterceros`.`ciudad`,`bdclick6`.`bdterceros`.`idSistema` having ((`bdclick6`.`bdcxc`.`tipo` = \'CUENTACOBRO\') and (`bdclick6`.`bdcxc`.`estado` <> \'CANCELADA\') and (`bdclick6`.`bdcuentacobro`.`anulada` = 0))
md5=e1d4099270403db1f8a769f4e558e6a8
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:38
create-version=2
source=select `bdcxc`.`factura` AS `fact`,`bdcxc`.`tipo` AS `tipo`,`bdcxc`.`estado` AS `estado`,`bdcxc`.`recibo` AS `recibo`,`bdcxc`.`valor` AS `valor`,`bdcxc`.`plazo` AS `plazo`,`bdcxc`.`vencimiento` AS `vencimiento`,`bdterceros`.`id` AS `cliente`,`bdterceros`.`nombre` AS `nombre`,`bdcuentacobro`.`fechaFactura` AS `fechaFactura`,`bdcuentacobro`.`anulada` AS `anulada`,`bdcxc`.`factura` AS `factura`,`bdcuentacobro`.`vendedor` AS `vendedor`,`bdcuentacobro`.`terminal` AS `terminal`,`bdterceros`.`telefono` AS `telefono`,`bdcuentacobro`.`placa` AS `placa`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`ciudad` AS `ciudad`,`bdterceros`.`idSistema` AS `idSistema` from (`bdcxc` left join (`bdcuentacobro` left join `bdterceros` on((`bdcuentacobro`.`cliente` = `bdterceros`.`idSistema`))) on((`bdcxc`.`factura` = `bdcuentacobro`.`idFactura`))) group by `bdcxc`.`factura`,`bdcxc`.`tipo`,`bdcxc`.`estado`,`bdcxc`.`recibo`,`bdcxc`.`valor`,`bdcxc`.`plazo`,`bdcxc`.`vencimiento`,`bdterceros`.`id`,`bdterceros`.`nombre`,`bdcuentacobro`.`fechaFactura`,`bdcuentacobro`.`anulada`,`bdcxc`.`factura`,`bdcuentacobro`.`vendedor`,`bdcuentacobro`.`terminal`,`bdterceros`.`telefono`,`bdcuentacobro`.`placa`,`bdterceros`.`direccion`,`bdterceros`.`ciudad`,`bdterceros`.`idSistema` having ((`bdcxc`.`tipo` = \'CUENTACOBRO\') and (`bdcxc`.`estado` <> \'CANCELADA\') and (`bdcuentacobro`.`anulada` = 0))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdcxc`.`factura` AS `fact`,`bdclick6`.`bdcxc`.`tipo` AS `tipo`,`bdclick6`.`bdcxc`.`estado` AS `estado`,`bdclick6`.`bdcxc`.`recibo` AS `recibo`,`bdclick6`.`bdcxc`.`valor` AS `valor`,`bdclick6`.`bdcxc`.`plazo` AS `plazo`,`bdclick6`.`bdcxc`.`vencimiento` AS `vencimiento`,`bdclick6`.`bdterceros`.`id` AS `cliente`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdcuentacobro`.`fechaFactura` AS `fechaFactura`,`bdclick6`.`bdcuentacobro`.`anulada` AS `anulada`,`bdclick6`.`bdcxc`.`factura` AS `factura`,`bdclick6`.`bdcuentacobro`.`vendedor` AS `vendedor`,`bdclick6`.`bdcuentacobro`.`terminal` AS `terminal`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,`bdclick6`.`bdcuentacobro`.`placa` AS `placa`,`bdclick6`.`bdterceros`.`direccion` AS `direccion`,`bdclick6`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick6`.`bdterceros`.`idSistema` AS `idSistema` from (`bdclick6`.`bdcxc` left join (`bdclick6`.`bdcuentacobro` left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdcuentacobro`.`cliente` = `bdclick6`.`bdterceros`.`idSistema`))) on((`bdclick6`.`bdcxc`.`factura` = `bdclick6`.`bdcuentacobro`.`idFactura`))) group by `bdclick6`.`bdcxc`.`factura`,`bdclick6`.`bdcxc`.`tipo`,`bdclick6`.`bdcxc`.`estado`,`bdclick6`.`bdcxc`.`recibo`,`bdclick6`.`bdcxc`.`valor`,`bdclick6`.`bdcxc`.`plazo`,`bdclick6`.`bdcxc`.`vencimiento`,`bdclick6`.`bdterceros`.`id`,`bdclick6`.`bdterceros`.`nombre`,`bdclick6`.`bdcuentacobro`.`fechaFactura`,`bdclick6`.`bdcuentacobro`.`anulada`,`bdclick6`.`bdcxc`.`factura`,`bdclick6`.`bdcuentacobro`.`vendedor`,`bdclick6`.`bdcuentacobro`.`terminal`,`bdclick6`.`bdterceros`.`telefono`,`bdclick6`.`bdcuentacobro`.`placa`,`bdclick6`.`bdterceros`.`direccion`,`bdclick6`.`bdterceros`.`ciudad`,`bdclick6`.`bdterceros`.`idSistema` having ((`bdclick6`.`bdcxc`.`tipo` = \'CUENTACOBRO\') and (`bdclick6`.`bdcxc`.`estado` <> \'CANCELADA\') and (`bdclick6`.`bdcuentacobro`.`anulada` = 0))
mariadb-version=100135
