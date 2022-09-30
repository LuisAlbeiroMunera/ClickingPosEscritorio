TYPE=VIEW
query=select `bdclick5`.`reppendientessepares`.`factura` AS `fact`,`bdclick5`.`reppendientessepares`.`tipo` AS `tipo`,`bdclick5`.`reppendientessepares`.`estado` AS `estado`,`bdclick5`.`reppendientessepares`.`recibo` AS `recibo`,`bdclick5`.`reppendientessepares`.`plazo` AS `plazo`,`bdclick5`.`reppendientessepares`.`vencimiento` AS `vencimiento`,`bdclick5`.`reppendientessepares`.`cliente` AS `cliente`,`bdclick5`.`reppendientessepares`.`nombre` AS `nombre`,`bdclick5`.`reppendientessepares`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`reppendientessepares`.`anulada` AS `anulada`,if(isnull(`bdclick5`.`repcarterasepares`.`valor`),`bdclick5`.`reppendientessepares`.`valor`,(`bdclick5`.`reppendientessepares`.`valor` - `bdclick5`.`repcarterasepares`.`valor`)) AS `Expr1`,`bdclick5`.`reppendientessepares`.`vendedor` AS `vendedor`,`bdclick5`.`reppendientessepares`.`factura` AS `factura`,`bdclick5`.`reppendientessepares`.`terminal` AS `terminal`,`bdclick5`.`reppendientessepares`.`valor` AS `valor`,`bdclick5`.`reppendientessepares`.`telefono` AS `telefono`,cast((`bdclick5`.`reppendientessepares`.`vencimiento` - curdate()) as signed) AS `edadCartera`,if((now() >= `bdclick5`.`reppendientessepares`.`vencimiento`),\'VENCIDA\',\'OK\') AS `estadoVenc`,`bdclick5`.`reppendientessepares`.`placa` AS `placa`,`bdclick5`.`reppendientessepares`.`direccion` AS `direccion`,`bdclick5`.`reppendientessepares`.`ciudad` AS `ciudad`,`bdclick5`.`reppendientessepares`.`idSistema` AS `idSistema` from (`bdclick5`.`reppendientessepares` left join `bdclick5`.`repcarterasepares` on((`bdclick5`.`reppendientessepares`.`fact` = `bdclick5`.`repcarterasepares`.`fact`))) group by `bdclick5`.`reppendientessepares`.`factura`,`bdclick5`.`reppendientessepares`.`tipo`,`bdclick5`.`reppendientessepares`.`estado`,`bdclick5`.`reppendientessepares`.`recibo`,`bdclick5`.`reppendientessepares`.`plazo`,`bdclick5`.`reppendientessepares`.`vencimiento`,`bdclick5`.`reppendientessepares`.`cliente`,`bdclick5`.`reppendientessepares`.`nombre`,`bdclick5`.`reppendientessepares`.`fechaFactura`,`bdclick5`.`reppendientessepares`.`anulada`,if(isnull(`bdclick5`.`repcarterasepares`.`valor`),`bdclick5`.`reppendientessepares`.`valor`,(`bdclick5`.`reppendientessepares`.`valor` - `bdclick5`.`repcarterasepares`.`valor`)),`bdclick5`.`reppendientessepares`.`vendedor`,`bdclick5`.`reppendientessepares`.`terminal`,`bdclick5`.`reppendientessepares`.`valor`,`bdclick5`.`reppendientessepares`.`telefono`,`bdclick5`.`reppendientessepares`.`placa`,`bdclick5`.`reppendientessepares`.`direccion`,`bdclick5`.`reppendientessepares`.`ciudad`,`bdclick5`.`reppendientessepares`.`idSistema` having (`bdclick5`.`reppendientessepares`.`tipo` = \'SEPARE\')
md5=c9a2b1c17c0930fa908896e7035fdd75
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:49
create-version=2
source=select `reppendientessepares`.`factura` AS `fact`,`reppendientessepares`.`tipo` AS `tipo`,`reppendientessepares`.`estado` AS `estado`,`reppendientessepares`.`recibo` AS `recibo`,`reppendientessepares`.`plazo` AS `plazo`,`reppendientessepares`.`vencimiento` AS `vencimiento`,`reppendientessepares`.`cliente` AS `cliente`,`reppendientessepares`.`nombre` AS `nombre`,`reppendientessepares`.`fechaFactura` AS `fechaFactura`,`reppendientessepares`.`anulada` AS `anulada`,if(isnull(`repcarterasepares`.`valor`),`reppendientessepares`.`valor`,(`reppendientessepares`.`valor` - `repcarterasepares`.`valor`)) AS `Expr1`,`reppendientessepares`.`vendedor` AS `vendedor`,`reppendientessepares`.`factura` AS `factura`,`reppendientessepares`.`terminal` AS `terminal`,`reppendientessepares`.`valor` AS `valor`,`reppendientessepares`.`telefono` AS `telefono`,cast((`reppendientessepares`.`vencimiento` - curdate()) as signed) AS `edadCartera`,if((now() >= `reppendientessepares`.`vencimiento`),\'VENCIDA\',\'OK\') AS `estadoVenc`,`reppendientessepares`.`placa` AS `placa`,`reppendientessepares`.`direccion` AS `direccion`,`reppendientessepares`.`ciudad` AS `ciudad`,`reppendientessepares`.`idSistema` AS `idSistema` from (`reppendientessepares` left join `repcarterasepares` on((`reppendientessepares`.`fact` = `repcarterasepares`.`fact`))) group by `reppendientessepares`.`factura`,`reppendientessepares`.`tipo`,`reppendientessepares`.`estado`,`reppendientessepares`.`recibo`,`reppendientessepares`.`plazo`,`reppendientessepares`.`vencimiento`,`reppendientessepares`.`cliente`,`reppendientessepares`.`nombre`,`reppendientessepares`.`fechaFactura`,`reppendientessepares`.`anulada`,if(isnull(`repcarterasepares`.`valor`),`reppendientessepares`.`valor`,(`reppendientessepares`.`valor` - `repcarterasepares`.`valor`)),`reppendientessepares`.`vendedor`,`reppendientessepares`.`terminal`,`reppendientessepares`.`valor`,`reppendientessepares`.`telefono`,`reppendientessepares`.`placa`,`reppendientessepares`.`direccion`,`reppendientessepares`.`ciudad`,`reppendientessepares`.`idSistema` having (`reppendientessepares`.`tipo` = \'SEPARE\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`reppendientessepares`.`factura` AS `fact`,`bdclick5`.`reppendientessepares`.`tipo` AS `tipo`,`bdclick5`.`reppendientessepares`.`estado` AS `estado`,`bdclick5`.`reppendientessepares`.`recibo` AS `recibo`,`bdclick5`.`reppendientessepares`.`plazo` AS `plazo`,`bdclick5`.`reppendientessepares`.`vencimiento` AS `vencimiento`,`bdclick5`.`reppendientessepares`.`cliente` AS `cliente`,`bdclick5`.`reppendientessepares`.`nombre` AS `nombre`,`bdclick5`.`reppendientessepares`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`reppendientessepares`.`anulada` AS `anulada`,if(isnull(`bdclick5`.`repcarterasepares`.`valor`),`bdclick5`.`reppendientessepares`.`valor`,(`bdclick5`.`reppendientessepares`.`valor` - `bdclick5`.`repcarterasepares`.`valor`)) AS `Expr1`,`bdclick5`.`reppendientessepares`.`vendedor` AS `vendedor`,`bdclick5`.`reppendientessepares`.`factura` AS `factura`,`bdclick5`.`reppendientessepares`.`terminal` AS `terminal`,`bdclick5`.`reppendientessepares`.`valor` AS `valor`,`bdclick5`.`reppendientessepares`.`telefono` AS `telefono`,cast((`bdclick5`.`reppendientessepares`.`vencimiento` - curdate()) as signed) AS `edadCartera`,if((now() >= `bdclick5`.`reppendientessepares`.`vencimiento`),\'VENCIDA\',\'OK\') AS `estadoVenc`,`bdclick5`.`reppendientessepares`.`placa` AS `placa`,`bdclick5`.`reppendientessepares`.`direccion` AS `direccion`,`bdclick5`.`reppendientessepares`.`ciudad` AS `ciudad`,`bdclick5`.`reppendientessepares`.`idSistema` AS `idSistema` from (`bdclick5`.`reppendientessepares` left join `bdclick5`.`repcarterasepares` on((`bdclick5`.`reppendientessepares`.`fact` = `bdclick5`.`repcarterasepares`.`fact`))) group by `bdclick5`.`reppendientessepares`.`factura`,`bdclick5`.`reppendientessepares`.`tipo`,`bdclick5`.`reppendientessepares`.`estado`,`bdclick5`.`reppendientessepares`.`recibo`,`bdclick5`.`reppendientessepares`.`plazo`,`bdclick5`.`reppendientessepares`.`vencimiento`,`bdclick5`.`reppendientessepares`.`cliente`,`bdclick5`.`reppendientessepares`.`nombre`,`bdclick5`.`reppendientessepares`.`fechaFactura`,`bdclick5`.`reppendientessepares`.`anulada`,if(isnull(`bdclick5`.`repcarterasepares`.`valor`),`bdclick5`.`reppendientessepares`.`valor`,(`bdclick5`.`reppendientessepares`.`valor` - `bdclick5`.`repcarterasepares`.`valor`)),`bdclick5`.`reppendientessepares`.`vendedor`,`bdclick5`.`reppendientessepares`.`terminal`,`bdclick5`.`reppendientessepares`.`valor`,`bdclick5`.`reppendientessepares`.`telefono`,`bdclick5`.`reppendientessepares`.`placa`,`bdclick5`.`reppendientessepares`.`direccion`,`bdclick5`.`reppendientessepares`.`ciudad`,`bdclick5`.`reppendientessepares`.`idSistema` having (`bdclick5`.`reppendientessepares`.`tipo` = \'SEPARE\')
mariadb-version=100135