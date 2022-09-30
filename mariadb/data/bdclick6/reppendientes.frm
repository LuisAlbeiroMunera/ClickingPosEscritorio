TYPE=VIEW
query=select `bdclick6`.`bdcxc`.`factura` AS `fact`,`bdclick6`.`bdcxc`.`tipo` AS `tipo`,`bdclick6`.`bdcxc`.`estado` AS `estado`,`bdclick6`.`bdcxc`.`recibo` AS `recibo`,`bdclick6`.`bdcxc`.`valor` AS `valor`,`bdclick6`.`bdcxc`.`plazo` AS `plazo`,`bdclick6`.`bdcxc`.`vencimiento` AS `vencimiento`,`bdclick6`.`bdfactura`.`cliente` AS `cliente`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick6`.`bdfactura`.`anulada` AS `anulada`,`bdclick6`.`bdfactura`.`idFactura` AS `factura`,`bdclick6`.`bdfactura`.`vendedor` AS `vendedor`,`bdclick6`.`bdfactura`.`terminal` AS `terminal`,`bdclick6`.`bdfactura`.`factura` AS `factura2`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,`bdclick6`.`bdfactura`.`turno` AS `turno`,`bdclick6`.`bdfactura`.`placa` AS `placa`,`bdclick6`.`bdterceros`.`direccion` AS `direccion`,`bdclick6`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick6`.`bdterceros`.`id` AS `idSistema`,`bdclick6`.`bdfactura`.`conseMesa` AS `conseMesa` from (`bdclick6`.`bdcxc` left join (`bdclick6`.`bdfactura` left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdterceros`.`idSistema` = `bdclick6`.`bdfactura`.`cliente`))) on((`bdclick6`.`bdfactura`.`factura` = `bdclick6`.`bdcxc`.`factura2`))) group by `bdclick6`.`bdcxc`.`factura`,`bdclick6`.`bdcxc`.`tipo`,`bdclick6`.`bdcxc`.`estado`,`bdclick6`.`bdcxc`.`recibo`,`bdclick6`.`bdcxc`.`valor`,`bdclick6`.`bdcxc`.`plazo`,`bdclick6`.`bdcxc`.`vencimiento`,`bdclick6`.`bdfactura`.`cliente`,`bdclick6`.`bdterceros`.`nombre`,`bdclick6`.`bdfactura`.`fechaFactura`,`bdclick6`.`bdfactura`.`anulada`,`bdclick6`.`bdfactura`.`cotizacion`,`bdclick6`.`bdfactura`.`vendedor`,`bdclick6`.`bdfactura`.`terminal`,cast(substr(`bdclick6`.`bdfactura`.`factura`,6,20) as signed),`bdclick6`.`bdterceros`.`telefono`,`bdclick6`.`bdfactura`.`turno`,`bdclick6`.`bdfactura`.`placa`,`bdclick6`.`bdterceros`.`direccion`,`bdclick6`.`bdterceros`.`ciudad`,`bdclick6`.`bdterceros`.`id`,`bdclick6`.`bdfactura`.`conseMesa` having (((`bdclick6`.`bdcxc`.`tipo` = \'FACT\') or (`bdclick6`.`bdcxc`.`tipo` = \'SEPARE\')) and (`bdclick6`.`bdcxc`.`estado` <> \'CANCELADA\') and (`bdclick6`.`bdfactura`.`anulada` = 0))
md5=514271cc281ca633a0e3fc184d41e4eb
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:38
create-version=2
source=select `bdcxc`.`factura` AS `fact`,`bdcxc`.`tipo` AS `tipo`,`bdcxc`.`estado` AS `estado`,`bdcxc`.`recibo` AS `recibo`,`bdcxc`.`valor` AS `valor`,`bdcxc`.`plazo` AS `plazo`,`bdcxc`.`vencimiento` AS `vencimiento`,`bdfactura`.`cliente` AS `cliente`,`bdterceros`.`nombre` AS `nombre`,`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdfactura`.`anulada` AS `anulada`,`bdfactura`.`idFactura` AS `factura`,`bdfactura`.`vendedor` AS `vendedor`,`bdfactura`.`terminal` AS `terminal`,`bdfactura`.`factura` AS `factura2`,`bdterceros`.`telefono` AS `telefono`,`bdfactura`.`turno` AS `turno`,`bdfactura`.`placa` AS `placa`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`ciudad` AS `ciudad`,`bdterceros`.`id` AS `idSistema`,`bdfactura`.`conseMesa` AS `conseMesa` from (`bdcxc` left join (`bdfactura` left join `bdterceros` on((`bdterceros`.`idSistema` = `bdfactura`.`cliente`))) on((`bdfactura`.`factura` = `bdcxc`.`factura2`))) group by `bdcxc`.`factura`,`bdcxc`.`tipo`,`bdcxc`.`estado`,`bdcxc`.`recibo`,`bdcxc`.`valor`,`bdcxc`.`plazo`,`bdcxc`.`vencimiento`,`bdfactura`.`cliente`,`bdterceros`.`nombre`,`bdfactura`.`fechaFactura`,`bdfactura`.`anulada`,`bdfactura`.`cotizacion`,`bdfactura`.`vendedor`,`bdfactura`.`terminal`,cast(substr(`bdfactura`.`factura`,6,20) as signed),`bdterceros`.`telefono`,`bdfactura`.`turno`,`bdfactura`.`placa`,`bdterceros`.`direccion`,`bdterceros`.`ciudad`,`bdterceros`.`id`,`bdfactura`.`conseMesa` having (((`bdcxc`.`tipo` = \'FACT\') or (`bdcxc`.`tipo` = \'SEPARE\')) and (`bdcxc`.`estado` <> \'CANCELADA\') and (`bdfactura`.`anulada` = 0))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdcxc`.`factura` AS `fact`,`bdclick6`.`bdcxc`.`tipo` AS `tipo`,`bdclick6`.`bdcxc`.`estado` AS `estado`,`bdclick6`.`bdcxc`.`recibo` AS `recibo`,`bdclick6`.`bdcxc`.`valor` AS `valor`,`bdclick6`.`bdcxc`.`plazo` AS `plazo`,`bdclick6`.`bdcxc`.`vencimiento` AS `vencimiento`,`bdclick6`.`bdfactura`.`cliente` AS `cliente`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick6`.`bdfactura`.`anulada` AS `anulada`,`bdclick6`.`bdfactura`.`idFactura` AS `factura`,`bdclick6`.`bdfactura`.`vendedor` AS `vendedor`,`bdclick6`.`bdfactura`.`terminal` AS `terminal`,`bdclick6`.`bdfactura`.`factura` AS `factura2`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,`bdclick6`.`bdfactura`.`turno` AS `turno`,`bdclick6`.`bdfactura`.`placa` AS `placa`,`bdclick6`.`bdterceros`.`direccion` AS `direccion`,`bdclick6`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick6`.`bdterceros`.`id` AS `idSistema`,`bdclick6`.`bdfactura`.`conseMesa` AS `conseMesa` from (`bdclick6`.`bdcxc` left join (`bdclick6`.`bdfactura` left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdterceros`.`idSistema` = `bdclick6`.`bdfactura`.`cliente`))) on((`bdclick6`.`bdfactura`.`factura` = `bdclick6`.`bdcxc`.`factura2`))) group by `bdclick6`.`bdcxc`.`factura`,`bdclick6`.`bdcxc`.`tipo`,`bdclick6`.`bdcxc`.`estado`,`bdclick6`.`bdcxc`.`recibo`,`bdclick6`.`bdcxc`.`valor`,`bdclick6`.`bdcxc`.`plazo`,`bdclick6`.`bdcxc`.`vencimiento`,`bdclick6`.`bdfactura`.`cliente`,`bdclick6`.`bdterceros`.`nombre`,`bdclick6`.`bdfactura`.`fechaFactura`,`bdclick6`.`bdfactura`.`anulada`,`bdclick6`.`bdfactura`.`cotizacion`,`bdclick6`.`bdfactura`.`vendedor`,`bdclick6`.`bdfactura`.`terminal`,cast(substr(`bdclick6`.`bdfactura`.`factura`,6,20) as signed),`bdclick6`.`bdterceros`.`telefono`,`bdclick6`.`bdfactura`.`turno`,`bdclick6`.`bdfactura`.`placa`,`bdclick6`.`bdterceros`.`direccion`,`bdclick6`.`bdterceros`.`ciudad`,`bdclick6`.`bdterceros`.`id`,`bdclick6`.`bdfactura`.`conseMesa` having (((`bdclick6`.`bdcxc`.`tipo` = \'FACT\') or (`bdclick6`.`bdcxc`.`tipo` = \'SEPARE\')) and (`bdclick6`.`bdcxc`.`estado` <> \'CANCELADA\') and (`bdclick6`.`bdfactura`.`anulada` = 0))
mariadb-version=100135
