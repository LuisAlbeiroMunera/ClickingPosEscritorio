TYPE=VIEW
query=select `bdclick`.`bdcxc`.`factura` AS `fact`,`bdclick`.`bdcxc`.`tipo` AS `tipo`,`bdclick`.`bdcxc`.`estado` AS `estado`,`bdclick`.`bdcxc`.`recibo` AS `recibo`,`bdclick`.`bdcxc`.`valor` AS `valor`,`bdclick`.`bdcxc`.`plazo` AS `plazo`,`bdclick`.`bdcxc`.`vencimiento` AS `vencimiento`,`bdclick`.`bdfactura`.`cliente` AS `cliente`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick`.`bdfactura`.`anulada` AS `anulada`,`bdclick`.`bdfactura`.`idFactura` AS `factura`,`bdclick`.`bdfactura`.`vendedor` AS `vendedor`,`bdclick`.`bdfactura`.`terminal` AS `terminal`,`bdclick`.`bdfactura`.`factura` AS `factura2`,`bdclick`.`bdterceros`.`telefono` AS `telefono`,`bdclick`.`bdfactura`.`turno` AS `turno`,`bdclick`.`bdfactura`.`placa` AS `placa`,`bdclick`.`bdterceros`.`direccion` AS `direccion`,`bdclick`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick`.`bdterceros`.`id` AS `idSistema`,`bdclick`.`bdfactura`.`conseMesa` AS `conseMesa` from (`bdclick`.`bdcxc` left join (`bdclick`.`bdfactura` left join `bdclick`.`bdterceros` on((`bdclick`.`bdterceros`.`idSistema` = `bdclick`.`bdfactura`.`cliente`))) on((`bdclick`.`bdfactura`.`factura` = `bdclick`.`bdcxc`.`factura2`))) group by `bdclick`.`bdcxc`.`factura`,`bdclick`.`bdcxc`.`tipo`,`bdclick`.`bdcxc`.`estado`,`bdclick`.`bdcxc`.`recibo`,`bdclick`.`bdcxc`.`valor`,`bdclick`.`bdcxc`.`plazo`,`bdclick`.`bdcxc`.`vencimiento`,`bdclick`.`bdfactura`.`cliente`,`bdclick`.`bdterceros`.`nombre`,`bdclick`.`bdfactura`.`fechaFactura`,`bdclick`.`bdfactura`.`anulada`,`bdclick`.`bdfactura`.`cotizacion`,`bdclick`.`bdfactura`.`vendedor`,`bdclick`.`bdfactura`.`terminal`,cast(substr(`bdclick`.`bdfactura`.`factura`,6,20) as signed),`bdclick`.`bdterceros`.`telefono`,`bdclick`.`bdfactura`.`turno`,`bdclick`.`bdfactura`.`placa`,`bdclick`.`bdterceros`.`direccion`,`bdclick`.`bdterceros`.`ciudad`,`bdclick`.`bdterceros`.`id`,`bdclick`.`bdfactura`.`conseMesa` having (((`bdclick`.`bdcxc`.`tipo` = \'FACT\') or (`bdclick`.`bdcxc`.`tipo` = \'SEPARE\')) and (`bdclick`.`bdcxc`.`estado` <> \'CANCELADA\') and (`bdclick`.`bdfactura`.`anulada` = 0))
md5=c29a3d81561c0ce2c5ef4e808ec77192
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:27
create-version=2
source=select `bdcxc`.`factura` AS `fact`,`bdcxc`.`tipo` AS `tipo`,`bdcxc`.`estado` AS `estado`,`bdcxc`.`recibo` AS `recibo`,`bdcxc`.`valor` AS `valor`,`bdcxc`.`plazo` AS `plazo`,`bdcxc`.`vencimiento` AS `vencimiento`,`bdfactura`.`cliente` AS `cliente`,`bdterceros`.`nombre` AS `nombre`,`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdfactura`.`anulada` AS `anulada`,`bdfactura`.`idFactura` AS `factura`,`bdfactura`.`vendedor` AS `vendedor`,`bdfactura`.`terminal` AS `terminal`,`bdfactura`.`factura` AS `factura2`,`bdterceros`.`telefono` AS `telefono`,`bdfactura`.`turno` AS `turno`,`bdfactura`.`placa` AS `placa`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`ciudad` AS `ciudad`,`bdterceros`.`id` AS `idSistema`,`bdfactura`.`conseMesa` AS `conseMesa` from (`bdcxc` left join (`bdfactura` left join `bdterceros` on((`bdterceros`.`idSistema` = `bdfactura`.`cliente`))) on((`bdfactura`.`factura` = `bdcxc`.`factura2`))) group by `bdcxc`.`factura`,`bdcxc`.`tipo`,`bdcxc`.`estado`,`bdcxc`.`recibo`,`bdcxc`.`valor`,`bdcxc`.`plazo`,`bdcxc`.`vencimiento`,`bdfactura`.`cliente`,`bdterceros`.`nombre`,`bdfactura`.`fechaFactura`,`bdfactura`.`anulada`,`bdfactura`.`cotizacion`,`bdfactura`.`vendedor`,`bdfactura`.`terminal`,cast(substr(`bdfactura`.`factura`,6,20) as signed),`bdterceros`.`telefono`,`bdfactura`.`turno`,`bdfactura`.`placa`,`bdterceros`.`direccion`,`bdterceros`.`ciudad`,`bdterceros`.`id`,`bdfactura`.`conseMesa` having (((`bdcxc`.`tipo` = \'FACT\') or (`bdcxc`.`tipo` = \'SEPARE\')) and (`bdcxc`.`estado` <> \'CANCELADA\') and (`bdfactura`.`anulada` = 0))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdcxc`.`factura` AS `fact`,`bdclick`.`bdcxc`.`tipo` AS `tipo`,`bdclick`.`bdcxc`.`estado` AS `estado`,`bdclick`.`bdcxc`.`recibo` AS `recibo`,`bdclick`.`bdcxc`.`valor` AS `valor`,`bdclick`.`bdcxc`.`plazo` AS `plazo`,`bdclick`.`bdcxc`.`vencimiento` AS `vencimiento`,`bdclick`.`bdfactura`.`cliente` AS `cliente`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdfactura`.`fechaFactura` AS `fechaFactura`,`bdclick`.`bdfactura`.`anulada` AS `anulada`,`bdclick`.`bdfactura`.`idFactura` AS `factura`,`bdclick`.`bdfactura`.`vendedor` AS `vendedor`,`bdclick`.`bdfactura`.`terminal` AS `terminal`,`bdclick`.`bdfactura`.`factura` AS `factura2`,`bdclick`.`bdterceros`.`telefono` AS `telefono`,`bdclick`.`bdfactura`.`turno` AS `turno`,`bdclick`.`bdfactura`.`placa` AS `placa`,`bdclick`.`bdterceros`.`direccion` AS `direccion`,`bdclick`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick`.`bdterceros`.`id` AS `idSistema`,`bdclick`.`bdfactura`.`conseMesa` AS `conseMesa` from (`bdclick`.`bdcxc` left join (`bdclick`.`bdfactura` left join `bdclick`.`bdterceros` on((`bdclick`.`bdterceros`.`idSistema` = `bdclick`.`bdfactura`.`cliente`))) on((`bdclick`.`bdfactura`.`factura` = `bdclick`.`bdcxc`.`factura2`))) group by `bdclick`.`bdcxc`.`factura`,`bdclick`.`bdcxc`.`tipo`,`bdclick`.`bdcxc`.`estado`,`bdclick`.`bdcxc`.`recibo`,`bdclick`.`bdcxc`.`valor`,`bdclick`.`bdcxc`.`plazo`,`bdclick`.`bdcxc`.`vencimiento`,`bdclick`.`bdfactura`.`cliente`,`bdclick`.`bdterceros`.`nombre`,`bdclick`.`bdfactura`.`fechaFactura`,`bdclick`.`bdfactura`.`anulada`,`bdclick`.`bdfactura`.`cotizacion`,`bdclick`.`bdfactura`.`vendedor`,`bdclick`.`bdfactura`.`terminal`,cast(substr(`bdclick`.`bdfactura`.`factura`,6,20) as signed),`bdclick`.`bdterceros`.`telefono`,`bdclick`.`bdfactura`.`turno`,`bdclick`.`bdfactura`.`placa`,`bdclick`.`bdterceros`.`direccion`,`bdclick`.`bdterceros`.`ciudad`,`bdclick`.`bdterceros`.`id`,`bdclick`.`bdfactura`.`conseMesa` having (((`bdclick`.`bdcxc`.`tipo` = \'FACT\') or (`bdclick`.`bdcxc`.`tipo` = \'SEPARE\')) and (`bdclick`.`bdcxc`.`estado` <> \'CANCELADA\') and (`bdclick`.`bdfactura`.`anulada` = 0))
mariadb-version=100135