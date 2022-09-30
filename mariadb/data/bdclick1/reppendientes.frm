TYPE=VIEW
query=select `bdclick1`.`bdcxc`.`factura` AS `fact`,`bdclick1`.`bdcxc`.`tipo` AS `tipo`,`bdclick1`.`bdcxc`.`estado` AS `estado`,`bdclick1`.`bdcxc`.`recibo` AS `recibo`,`bdclick1`.`bdcxc`.`valor` AS `valor`,`bdclick1`.`bdcxc`.`plazo` AS `plazo`,`bdclick1`.`bdcxc`.`vencimiento` AS `vencimiento`,`bdclick1`.`bdfactura`.`cliente` AS `cliente`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`bdclick1`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick1`.`bdfactura`.`anulada` AS `anulada`,`bdclick1`.`bdfactura`.`idFactura` AS `factura`,`bdclick1`.`bdfactura`.`vendedor` AS `vendedor`,`bdclick1`.`bdfactura`.`terminal` AS `terminal`,`bdclick1`.`bdfactura`.`factura` AS `factura2`,`bdclick1`.`bdterceros`.`telefono` AS `telefono`,`bdclick1`.`bdfactura`.`turno` AS `turno`,`bdclick1`.`bdfactura`.`placa` AS `placa`,`bdclick1`.`bdterceros`.`direccion` AS `direccion`,`bdclick1`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick1`.`bdterceros`.`id` AS `idSistema`,`bdclick1`.`bdfactura`.`conseMesa` AS `conseMesa` from (`bdclick1`.`bdcxc` left join (`bdclick1`.`bdfactura` left join `bdclick1`.`bdterceros` on((`bdclick1`.`bdterceros`.`idSistema` = `bdclick1`.`bdfactura`.`cliente`))) on((`bdclick1`.`bdfactura`.`factura` = `bdclick1`.`bdcxc`.`factura2`))) group by `bdclick1`.`bdcxc`.`factura`,`bdclick1`.`bdcxc`.`tipo`,`bdclick1`.`bdcxc`.`estado`,`bdclick1`.`bdcxc`.`recibo`,`bdclick1`.`bdcxc`.`valor`,`bdclick1`.`bdcxc`.`plazo`,`bdclick1`.`bdcxc`.`vencimiento`,`bdclick1`.`bdfactura`.`cliente`,`bdclick1`.`bdterceros`.`nombre`,`bdclick1`.`bdfactura`.`fechaFactura`,`bdclick1`.`bdfactura`.`anulada`,`bdclick1`.`bdfactura`.`cotizacion`,`bdclick1`.`bdfactura`.`vendedor`,`bdclick1`.`bdfactura`.`terminal`,cast(substr(`bdclick1`.`bdfactura`.`factura`,6,20) as signed),`bdclick1`.`bdterceros`.`telefono`,`bdclick1`.`bdfactura`.`turno`,`bdclick1`.`bdfactura`.`placa`,`bdclick1`.`bdterceros`.`direccion`,`bdclick1`.`bdterceros`.`ciudad`,`bdclick1`.`bdterceros`.`id`,`bdclick1`.`bdfactura`.`conseMesa` having (((`bdclick1`.`bdcxc`.`tipo` = \'FACT\') or (`bdclick1`.`bdcxc`.`tipo` = \'SEPARE\')) and (`bdclick1`.`bdcxc`.`estado` <> \'CANCELADA\') and (`bdclick1`.`bdfactura`.`anulada` = 0))
md5=f599f0a6c3187bbf2ed8a31938bce8ea
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:37
create-version=2
source=select `bdcxc`.`factura` AS `fact`,`bdcxc`.`tipo` AS `tipo`,`bdcxc`.`estado` AS `estado`,`bdcxc`.`recibo` AS `recibo`,`bdcxc`.`valor` AS `valor`,`bdcxc`.`plazo` AS `plazo`,`bdcxc`.`vencimiento` AS `vencimiento`,`bdfactura`.`cliente` AS `cliente`,`bdterceros`.`nombre` AS `nombre`,`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdfactura`.`anulada` AS `anulada`,`bdfactura`.`idFactura` AS `factura`,`bdfactura`.`vendedor` AS `vendedor`,`bdfactura`.`terminal` AS `terminal`,`bdfactura`.`factura` AS `factura2`,`bdterceros`.`telefono` AS `telefono`,`bdfactura`.`turno` AS `turno`,`bdfactura`.`placa` AS `placa`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`ciudad` AS `ciudad`,`bdterceros`.`id` AS `idSistema`,`bdfactura`.`conseMesa` AS `conseMesa` from (`bdcxc` left join (`bdfactura` left join `bdterceros` on((`bdterceros`.`idSistema` = `bdfactura`.`cliente`))) on((`bdfactura`.`factura` = `bdcxc`.`factura2`))) group by `bdcxc`.`factura`,`bdcxc`.`tipo`,`bdcxc`.`estado`,`bdcxc`.`recibo`,`bdcxc`.`valor`,`bdcxc`.`plazo`,`bdcxc`.`vencimiento`,`bdfactura`.`cliente`,`bdterceros`.`nombre`,`bdfactura`.`fechaFactura`,`bdfactura`.`anulada`,`bdfactura`.`cotizacion`,`bdfactura`.`vendedor`,`bdfactura`.`terminal`,cast(substr(`bdfactura`.`factura`,6,20) as signed),`bdterceros`.`telefono`,`bdfactura`.`turno`,`bdfactura`.`placa`,`bdterceros`.`direccion`,`bdterceros`.`ciudad`,`bdterceros`.`id`,`bdfactura`.`conseMesa` having (((`bdcxc`.`tipo` = \'FACT\') or (`bdcxc`.`tipo` = \'SEPARE\')) and (`bdcxc`.`estado` <> \'CANCELADA\') and (`bdfactura`.`anulada` = 0))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdcxc`.`factura` AS `fact`,`bdclick1`.`bdcxc`.`tipo` AS `tipo`,`bdclick1`.`bdcxc`.`estado` AS `estado`,`bdclick1`.`bdcxc`.`recibo` AS `recibo`,`bdclick1`.`bdcxc`.`valor` AS `valor`,`bdclick1`.`bdcxc`.`plazo` AS `plazo`,`bdclick1`.`bdcxc`.`vencimiento` AS `vencimiento`,`bdclick1`.`bdfactura`.`cliente` AS `cliente`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`bdclick1`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick1`.`bdfactura`.`anulada` AS `anulada`,`bdclick1`.`bdfactura`.`idFactura` AS `factura`,`bdclick1`.`bdfactura`.`vendedor` AS `vendedor`,`bdclick1`.`bdfactura`.`terminal` AS `terminal`,`bdclick1`.`bdfactura`.`factura` AS `factura2`,`bdclick1`.`bdterceros`.`telefono` AS `telefono`,`bdclick1`.`bdfactura`.`turno` AS `turno`,`bdclick1`.`bdfactura`.`placa` AS `placa`,`bdclick1`.`bdterceros`.`direccion` AS `direccion`,`bdclick1`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick1`.`bdterceros`.`id` AS `idSistema`,`bdclick1`.`bdfactura`.`conseMesa` AS `conseMesa` from (`bdclick1`.`bdcxc` left join (`bdclick1`.`bdfactura` left join `bdclick1`.`bdterceros` on((`bdclick1`.`bdterceros`.`idSistema` = `bdclick1`.`bdfactura`.`cliente`))) on((`bdclick1`.`bdfactura`.`factura` = `bdclick1`.`bdcxc`.`factura2`))) group by `bdclick1`.`bdcxc`.`factura`,`bdclick1`.`bdcxc`.`tipo`,`bdclick1`.`bdcxc`.`estado`,`bdclick1`.`bdcxc`.`recibo`,`bdclick1`.`bdcxc`.`valor`,`bdclick1`.`bdcxc`.`plazo`,`bdclick1`.`bdcxc`.`vencimiento`,`bdclick1`.`bdfactura`.`cliente`,`bdclick1`.`bdterceros`.`nombre`,`bdclick1`.`bdfactura`.`fechaFactura`,`bdclick1`.`bdfactura`.`anulada`,`bdclick1`.`bdfactura`.`cotizacion`,`bdclick1`.`bdfactura`.`vendedor`,`bdclick1`.`bdfactura`.`terminal`,cast(substr(`bdclick1`.`bdfactura`.`factura`,6,20) as signed),`bdclick1`.`bdterceros`.`telefono`,`bdclick1`.`bdfactura`.`turno`,`bdclick1`.`bdfactura`.`placa`,`bdclick1`.`bdterceros`.`direccion`,`bdclick1`.`bdterceros`.`ciudad`,`bdclick1`.`bdterceros`.`id`,`bdclick1`.`bdfactura`.`conseMesa` having (((`bdclick1`.`bdcxc`.`tipo` = \'FACT\') or (`bdclick1`.`bdcxc`.`tipo` = \'SEPARE\')) and (`bdclick1`.`bdcxc`.`estado` <> \'CANCELADA\') and (`bdclick1`.`bdfactura`.`anulada` = 0))
mariadb-version=100135