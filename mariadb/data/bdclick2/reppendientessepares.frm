TYPE=VIEW
query=select `bdclick2`.`bdcxc`.`factura` AS `fact`,`bdclick2`.`bdcxc`.`tipo` AS `tipo`,`bdclick2`.`bdcxc`.`estado` AS `estado`,`bdclick2`.`bdcxc`.`recibo` AS `recibo`,`bdclick2`.`bdcxc`.`valor` AS `valor`,`bdclick2`.`bdcxc`.`plazo` AS `plazo`,`bdclick2`.`bdcxc`.`vencimiento` AS `vencimiento`,`bdclick2`.`bdterceros`.`idSistema` AS `cliente`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,`bdclick2`.`bdplansepare`.`fechaFactura` AS `fechaFactura`,`bdclick2`.`bdplansepare`.`anulada` AS `anulada`,`bdclick2`.`bdplansepare`.`cotizacion` AS `factura`,`bdclick2`.`bdplansepare`.`vendedor` AS `vendedor`,`bdclick2`.`bdplansepare`.`terminal` AS `terminal`,`bdclick2`.`bdterceros`.`telefono` AS `telefono`,`bdclick2`.`bdplansepare`.`placa` AS `placa`,`bdclick2`.`bdterceros`.`direccion` AS `direccion`,`bdclick2`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick2`.`bdterceros`.`id` AS `idSistema` from (`bdclick2`.`bdcxc` left join (`bdclick2`.`bdplansepare` left join `bdclick2`.`bdterceros` on((`bdclick2`.`bdplansepare`.`cliente` = `bdclick2`.`bdterceros`.`idSistema`))) on((`bdclick2`.`bdplansepare`.`idFactura` = `bdclick2`.`bdcxc`.`factura`))) group by `bdclick2`.`bdcxc`.`factura`,`bdclick2`.`bdcxc`.`tipo`,`bdclick2`.`bdcxc`.`estado`,`bdclick2`.`bdcxc`.`recibo`,`bdclick2`.`bdcxc`.`valor`,`bdclick2`.`bdcxc`.`plazo`,`bdclick2`.`bdcxc`.`vencimiento`,`bdclick2`.`bdterceros`.`id`,`bdclick2`.`bdterceros`.`nombre`,`bdclick2`.`bdplansepare`.`fechaFactura`,`bdclick2`.`bdplansepare`.`anulada`,`bdclick2`.`bdplansepare`.`cotizacion`,`bdclick2`.`bdplansepare`.`vendedor`,`bdclick2`.`bdplansepare`.`terminal`,`bdclick2`.`bdterceros`.`telefono`,`bdclick2`.`bdplansepare`.`placa`,`bdclick2`.`bdterceros`.`direccion`,`bdclick2`.`bdterceros`.`ciudad`,`bdclick2`.`bdterceros`.`idSistema` having ((`bdclick2`.`bdcxc`.`tipo` = \'SEPARE\') and (`bdclick2`.`bdcxc`.`estado` <> \'CANCELADA\') and (`bdclick2`.`bdplansepare`.`anulada` = 0))
md5=c26ac46acf175b1077d59a7986839c61
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:48
create-version=2
source=select `bdcxc`.`factura` AS `fact`,`bdcxc`.`tipo` AS `tipo`,`bdcxc`.`estado` AS `estado`,`bdcxc`.`recibo` AS `recibo`,`bdcxc`.`valor` AS `valor`,`bdcxc`.`plazo` AS `plazo`,`bdcxc`.`vencimiento` AS `vencimiento`,`bdterceros`.`idSistema` AS `cliente`,`bdterceros`.`nombre` AS `nombre`,`bdplansepare`.`fechaFactura` AS `fechaFactura`,`bdplansepare`.`anulada` AS `anulada`,`bdplansepare`.`cotizacion` AS `factura`,`bdplansepare`.`vendedor` AS `vendedor`,`bdplansepare`.`terminal` AS `terminal`,`bdterceros`.`telefono` AS `telefono`,`bdplansepare`.`placa` AS `placa`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`ciudad` AS `ciudad`,`bdterceros`.`id` AS `idSistema` from (`bdcxc` left join (`bdplansepare` left join `bdterceros` on((`bdplansepare`.`cliente` = `bdterceros`.`idSistema`))) on((`bdplansepare`.`idFactura` = `bdcxc`.`factura`))) group by `bdcxc`.`factura`,`bdcxc`.`tipo`,`bdcxc`.`estado`,`bdcxc`.`recibo`,`bdcxc`.`valor`,`bdcxc`.`plazo`,`bdcxc`.`vencimiento`,`bdterceros`.`id`,`bdterceros`.`nombre`,`bdplansepare`.`fechaFactura`,`bdplansepare`.`anulada`,`bdplansepare`.`cotizacion`,`bdplansepare`.`vendedor`,`bdplansepare`.`terminal`,`bdterceros`.`telefono`,`bdplansepare`.`placa`,`bdterceros`.`direccion`,`bdterceros`.`ciudad`,`bdterceros`.`idSistema` having ((`bdcxc`.`tipo` = \'SEPARE\') and (`bdcxc`.`estado` <> \'CANCELADA\') and (`bdplansepare`.`anulada` = 0))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdcxc`.`factura` AS `fact`,`bdclick2`.`bdcxc`.`tipo` AS `tipo`,`bdclick2`.`bdcxc`.`estado` AS `estado`,`bdclick2`.`bdcxc`.`recibo` AS `recibo`,`bdclick2`.`bdcxc`.`valor` AS `valor`,`bdclick2`.`bdcxc`.`plazo` AS `plazo`,`bdclick2`.`bdcxc`.`vencimiento` AS `vencimiento`,`bdclick2`.`bdterceros`.`idSistema` AS `cliente`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,`bdclick2`.`bdplansepare`.`fechaFactura` AS `fechaFactura`,`bdclick2`.`bdplansepare`.`anulada` AS `anulada`,`bdclick2`.`bdplansepare`.`cotizacion` AS `factura`,`bdclick2`.`bdplansepare`.`vendedor` AS `vendedor`,`bdclick2`.`bdplansepare`.`terminal` AS `terminal`,`bdclick2`.`bdterceros`.`telefono` AS `telefono`,`bdclick2`.`bdplansepare`.`placa` AS `placa`,`bdclick2`.`bdterceros`.`direccion` AS `direccion`,`bdclick2`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick2`.`bdterceros`.`id` AS `idSistema` from (`bdclick2`.`bdcxc` left join (`bdclick2`.`bdplansepare` left join `bdclick2`.`bdterceros` on((`bdclick2`.`bdplansepare`.`cliente` = `bdclick2`.`bdterceros`.`idSistema`))) on((`bdclick2`.`bdplansepare`.`idFactura` = `bdclick2`.`bdcxc`.`factura`))) group by `bdclick2`.`bdcxc`.`factura`,`bdclick2`.`bdcxc`.`tipo`,`bdclick2`.`bdcxc`.`estado`,`bdclick2`.`bdcxc`.`recibo`,`bdclick2`.`bdcxc`.`valor`,`bdclick2`.`bdcxc`.`plazo`,`bdclick2`.`bdcxc`.`vencimiento`,`bdclick2`.`bdterceros`.`id`,`bdclick2`.`bdterceros`.`nombre`,`bdclick2`.`bdplansepare`.`fechaFactura`,`bdclick2`.`bdplansepare`.`anulada`,`bdclick2`.`bdplansepare`.`cotizacion`,`bdclick2`.`bdplansepare`.`vendedor`,`bdclick2`.`bdplansepare`.`terminal`,`bdclick2`.`bdterceros`.`telefono`,`bdclick2`.`bdplansepare`.`placa`,`bdclick2`.`bdterceros`.`direccion`,`bdclick2`.`bdterceros`.`ciudad`,`bdclick2`.`bdterceros`.`idSistema` having ((`bdclick2`.`bdcxc`.`tipo` = \'SEPARE\') and (`bdclick2`.`bdcxc`.`estado` <> \'CANCELADA\') and (`bdclick2`.`bdplansepare`.`anulada` = 0))
mariadb-version=100135
