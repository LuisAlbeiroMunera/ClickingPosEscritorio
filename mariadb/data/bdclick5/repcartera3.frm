TYPE=VIEW
query=(select `bdclick5`.`reppendientes`.`fact` AS `fact`,`bdclick5`.`reppendientes`.`tipo` AS `tipo`,`bdclick5`.`reppendientes`.`estado` AS `estado`,`bdclick5`.`reppendientes`.`recibo` AS `recibo`,`bdclick5`.`reppendientes`.`plazo` AS `plazo`,`bdclick5`.`reppendientes`.`vencimiento` AS `vencimiento`,`bdclick5`.`reppendientes`.`cliente` AS `cliente`,`bdclick5`.`reppendientes`.`nombre` AS `nombre`,`bdclick5`.`reppendientes`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`reppendientes`.`anulada` AS `anulada`,if(isnull(`repcartera`.`valor`),`bdclick5`.`reppendientes`.`valor`,(`bdclick5`.`reppendientes`.`valor` - `repcartera`.`valor`)) AS `Expr1`,`bdclick5`.`reppendientes`.`vendedor` AS `vendedor`,`bdclick5`.`reppendientes`.`factura` AS `PrimeroDefactura`,`bdclick5`.`reppendientes`.`terminal` AS `terminal`,`bdclick5`.`reppendientes`.`factura2` AS `factura2` from (`bdclick5`.`reppendientes` left join `bdclick5`.`repcartera` on((`bdclick5`.`reppendientes`.`fact` = `repcartera`.`fact`))) group by `bdclick5`.`reppendientes`.`fact`,`bdclick5`.`reppendientes`.`tipo`,`bdclick5`.`reppendientes`.`estado`,`bdclick5`.`reppendientes`.`recibo`,`bdclick5`.`reppendientes`.`plazo`,`bdclick5`.`reppendientes`.`vencimiento`,`bdclick5`.`reppendientes`.`cliente`,`bdclick5`.`reppendientes`.`nombre`,`bdclick5`.`reppendientes`.`fechaFactura`,`bdclick5`.`reppendientes`.`anulada`,if(isnull(`repcartera`.`valor`),`bdclick5`.`reppendientes`.`valor`,(`bdclick5`.`reppendientes`.`valor` - `repcartera`.`valor`)),`bdclick5`.`reppendientes`.`vendedor`,`bdclick5`.`reppendientes`.`terminal`)
md5=c6a81a265ad975e4b450b3f3101460b4
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:49
create-version=2
source=(select `reppendientes`.`fact` AS `fact`,`reppendientes`.`tipo` AS `tipo`,`reppendientes`.`estado` AS `estado`,`reppendientes`.`recibo` AS `recibo`,`reppendientes`.`plazo` AS `plazo`,`reppendientes`.`vencimiento` AS `vencimiento`,`reppendientes`.`cliente` AS `cliente`,`reppendientes`.`nombre` AS `nombre`,`reppendientes`.`fechaFactura` AS `fechaFactura`,`reppendientes`.`anulada` AS `anulada`,if(isnull(`repcartera`.`valor`),`reppendientes`.`valor`,(`reppendientes`.`valor` - `repcartera`.`valor`)) AS `Expr1`,`reppendientes`.`vendedor` AS `vendedor`,`reppendientes`.`factura` AS `PrimeroDefactura`,`reppendientes`.`terminal` AS `terminal`,`reppendientes`.`factura2` AS `factura2` from (`reppendientes` left join `repcartera` on((`reppendientes`.`fact` = `repcartera`.`fact`))) group by `reppendientes`.`fact`,`reppendientes`.`tipo`,`reppendientes`.`estado`,`reppendientes`.`recibo`,`reppendientes`.`plazo`,`reppendientes`.`vencimiento`,`reppendientes`.`cliente`,`reppendientes`.`nombre`,`reppendientes`.`fechaFactura`,`reppendientes`.`anulada`,if(isnull(`repcartera`.`valor`),`reppendientes`.`valor`,(`reppendientes`.`valor` - `repcartera`.`valor`)),`reppendientes`.`vendedor`,`reppendientes`.`terminal`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`reppendientes`.`fact` AS `fact`,`bdclick5`.`reppendientes`.`tipo` AS `tipo`,`bdclick5`.`reppendientes`.`estado` AS `estado`,`bdclick5`.`reppendientes`.`recibo` AS `recibo`,`bdclick5`.`reppendientes`.`plazo` AS `plazo`,`bdclick5`.`reppendientes`.`vencimiento` AS `vencimiento`,`bdclick5`.`reppendientes`.`cliente` AS `cliente`,`bdclick5`.`reppendientes`.`nombre` AS `nombre`,`bdclick5`.`reppendientes`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`reppendientes`.`anulada` AS `anulada`,if(isnull(`repcartera`.`valor`),`bdclick5`.`reppendientes`.`valor`,(`bdclick5`.`reppendientes`.`valor` - `repcartera`.`valor`)) AS `Expr1`,`bdclick5`.`reppendientes`.`vendedor` AS `vendedor`,`bdclick5`.`reppendientes`.`factura` AS `PrimeroDefactura`,`bdclick5`.`reppendientes`.`terminal` AS `terminal`,`bdclick5`.`reppendientes`.`factura2` AS `factura2` from (`bdclick5`.`reppendientes` left join `bdclick5`.`repcartera` on((`bdclick5`.`reppendientes`.`fact` = `repcartera`.`fact`))) group by `bdclick5`.`reppendientes`.`fact`,`bdclick5`.`reppendientes`.`tipo`,`bdclick5`.`reppendientes`.`estado`,`bdclick5`.`reppendientes`.`recibo`,`bdclick5`.`reppendientes`.`plazo`,`bdclick5`.`reppendientes`.`vencimiento`,`bdclick5`.`reppendientes`.`cliente`,`bdclick5`.`reppendientes`.`nombre`,`bdclick5`.`reppendientes`.`fechaFactura`,`bdclick5`.`reppendientes`.`anulada`,if(isnull(`repcartera`.`valor`),`bdclick5`.`reppendientes`.`valor`,(`bdclick5`.`reppendientes`.`valor` - `repcartera`.`valor`)),`bdclick5`.`reppendientes`.`vendedor`,`bdclick5`.`reppendientes`.`terminal`)
mariadb-version=100135