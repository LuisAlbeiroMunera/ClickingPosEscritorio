TYPE=VIEW
query=(select `bdclick6`.`reppendientes`.`fact` AS `fact`,`bdclick6`.`reppendientes`.`tipo` AS `tipo`,`bdclick6`.`reppendientes`.`estado` AS `estado`,`bdclick6`.`reppendientes`.`recibo` AS `recibo`,`bdclick6`.`reppendientes`.`plazo` AS `plazo`,`bdclick6`.`reppendientes`.`vencimiento` AS `vencimiento`,`bdclick6`.`reppendientes`.`cliente` AS `cliente`,`bdclick6`.`reppendientes`.`nombre` AS `nombre`,`bdclick6`.`reppendientes`.`fechaFactura` AS `fechaFactura`,`bdclick6`.`reppendientes`.`anulada` AS `anulada`,if(isnull(`repcartera`.`valor`),`bdclick6`.`reppendientes`.`valor`,(`bdclick6`.`reppendientes`.`valor` - `repcartera`.`valor`)) AS `Expr1`,`bdclick6`.`reppendientes`.`vendedor` AS `vendedor`,`bdclick6`.`reppendientes`.`factura` AS `PrimeroDefactura`,`bdclick6`.`reppendientes`.`terminal` AS `terminal`,`bdclick6`.`reppendientes`.`factura2` AS `factura2` from (`bdclick6`.`reppendientes` left join `bdclick6`.`repcartera` on((`bdclick6`.`reppendientes`.`fact` = `repcartera`.`fact`))) group by `bdclick6`.`reppendientes`.`fact`,`bdclick6`.`reppendientes`.`tipo`,`bdclick6`.`reppendientes`.`estado`,`bdclick6`.`reppendientes`.`recibo`,`bdclick6`.`reppendientes`.`plazo`,`bdclick6`.`reppendientes`.`vencimiento`,`bdclick6`.`reppendientes`.`cliente`,`bdclick6`.`reppendientes`.`nombre`,`bdclick6`.`reppendientes`.`fechaFactura`,`bdclick6`.`reppendientes`.`anulada`,if(isnull(`repcartera`.`valor`),`bdclick6`.`reppendientes`.`valor`,(`bdclick6`.`reppendientes`.`valor` - `repcartera`.`valor`)),`bdclick6`.`reppendientes`.`vendedor`,`bdclick6`.`reppendientes`.`terminal`)
md5=85608f21c3eddabd72a6ffe1632af900
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:38
create-version=2
source=(select `reppendientes`.`fact` AS `fact`,`reppendientes`.`tipo` AS `tipo`,`reppendientes`.`estado` AS `estado`,`reppendientes`.`recibo` AS `recibo`,`reppendientes`.`plazo` AS `plazo`,`reppendientes`.`vencimiento` AS `vencimiento`,`reppendientes`.`cliente` AS `cliente`,`reppendientes`.`nombre` AS `nombre`,`reppendientes`.`fechaFactura` AS `fechaFactura`,`reppendientes`.`anulada` AS `anulada`,if(isnull(`repcartera`.`valor`),`reppendientes`.`valor`,(`reppendientes`.`valor` - `repcartera`.`valor`)) AS `Expr1`,`reppendientes`.`vendedor` AS `vendedor`,`reppendientes`.`factura` AS `PrimeroDefactura`,`reppendientes`.`terminal` AS `terminal`,`reppendientes`.`factura2` AS `factura2` from (`reppendientes` left join `repcartera` on((`reppendientes`.`fact` = `repcartera`.`fact`))) group by `reppendientes`.`fact`,`reppendientes`.`tipo`,`reppendientes`.`estado`,`reppendientes`.`recibo`,`reppendientes`.`plazo`,`reppendientes`.`vencimiento`,`reppendientes`.`cliente`,`reppendientes`.`nombre`,`reppendientes`.`fechaFactura`,`reppendientes`.`anulada`,if(isnull(`repcartera`.`valor`),`reppendientes`.`valor`,(`reppendientes`.`valor` - `repcartera`.`valor`)),`reppendientes`.`vendedor`,`reppendientes`.`terminal`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`reppendientes`.`fact` AS `fact`,`bdclick6`.`reppendientes`.`tipo` AS `tipo`,`bdclick6`.`reppendientes`.`estado` AS `estado`,`bdclick6`.`reppendientes`.`recibo` AS `recibo`,`bdclick6`.`reppendientes`.`plazo` AS `plazo`,`bdclick6`.`reppendientes`.`vencimiento` AS `vencimiento`,`bdclick6`.`reppendientes`.`cliente` AS `cliente`,`bdclick6`.`reppendientes`.`nombre` AS `nombre`,`bdclick6`.`reppendientes`.`fechaFactura` AS `fechaFactura`,`bdclick6`.`reppendientes`.`anulada` AS `anulada`,if(isnull(`repcartera`.`valor`),`bdclick6`.`reppendientes`.`valor`,(`bdclick6`.`reppendientes`.`valor` - `repcartera`.`valor`)) AS `Expr1`,`bdclick6`.`reppendientes`.`vendedor` AS `vendedor`,`bdclick6`.`reppendientes`.`factura` AS `PrimeroDefactura`,`bdclick6`.`reppendientes`.`terminal` AS `terminal`,`bdclick6`.`reppendientes`.`factura2` AS `factura2` from (`bdclick6`.`reppendientes` left join `bdclick6`.`repcartera` on((`bdclick6`.`reppendientes`.`fact` = `repcartera`.`fact`))) group by `bdclick6`.`reppendientes`.`fact`,`bdclick6`.`reppendientes`.`tipo`,`bdclick6`.`reppendientes`.`estado`,`bdclick6`.`reppendientes`.`recibo`,`bdclick6`.`reppendientes`.`plazo`,`bdclick6`.`reppendientes`.`vencimiento`,`bdclick6`.`reppendientes`.`cliente`,`bdclick6`.`reppendientes`.`nombre`,`bdclick6`.`reppendientes`.`fechaFactura`,`bdclick6`.`reppendientes`.`anulada`,if(isnull(`repcartera`.`valor`),`bdclick6`.`reppendientes`.`valor`,(`bdclick6`.`reppendientes`.`valor` - `repcartera`.`valor`)),`bdclick6`.`reppendientes`.`vendedor`,`bdclick6`.`reppendientes`.`terminal`)
mariadb-version=100135