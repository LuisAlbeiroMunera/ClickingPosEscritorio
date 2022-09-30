TYPE=VIEW
query=select `bdclick6`.`bdcompra`.`ingreso` AS `ingreso`,`bdclick6`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick6`.`bdingreso`.`bodega` AS `bodega`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick6`.`bdingreso`.`usuario` AS `usuario`,`bdclick6`.`bdingreso`.`anulada` AS `anulada`,`bdclick6`.`bdterceros`.`id` AS `codigo` from (((`bdclick6`.`bdingreso` left join `bdclick6`.`bdcompra` on((`bdclick6`.`bdingreso`.`id` = `bdclick6`.`bdcompra`.`ingreso`))) left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdterceros`.`idSistema` = `bdclick6`.`bdingreso`.`proveedor`))) left join `bdclick6`.`bdproductos` on((`bdclick6`.`bdproductos`.`Codigo` = `bdclick6`.`bdcompra`.`producto`))) where ((not((`bdclick6`.`bdcompra`.`ingreso` like \'INI-*\'))) and (`bdclick6`.`bdingreso`.`anulada` = 0)) order by `bdclick6`.`bdcompra`.`ingreso`
md5=c76b757279c4f182fbf6abcaba6cb511
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:35
create-version=2
source=select `bdcompra`.`ingreso` AS `ingreso`,`bdingreso`.`proveedor` AS `proveedor`,`bdingreso`.`bodega` AS `bodega`,`bdterceros`.`nombre` AS `nombre`,`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdingreso`.`usuario` AS `usuario`,`bdingreso`.`anulada` AS `anulada`,`bdterceros`.`id` AS `codigo` from (((`bdingreso` left join `bdcompra` on((`bdingreso`.`id` = `bdcompra`.`ingreso`))) left join `bdterceros` on((`bdterceros`.`idSistema` = `bdingreso`.`proveedor`))) left join `bdproductos` on((`bdproductos`.`Codigo` = `bdcompra`.`producto`))) where ((not((`bdcompra`.`ingreso` like \'INI-*\'))) and (`bdingreso`.`anulada` = 0)) order by `bdcompra`.`ingreso`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdcompra`.`ingreso` AS `ingreso`,`bdclick6`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick6`.`bdingreso`.`bodega` AS `bodega`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick6`.`bdingreso`.`usuario` AS `usuario`,`bdclick6`.`bdingreso`.`anulada` AS `anulada`,`bdclick6`.`bdterceros`.`id` AS `codigo` from (((`bdclick6`.`bdingreso` left join `bdclick6`.`bdcompra` on((`bdclick6`.`bdingreso`.`id` = `bdclick6`.`bdcompra`.`ingreso`))) left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdterceros`.`idSistema` = `bdclick6`.`bdingreso`.`proveedor`))) left join `bdclick6`.`bdproductos` on((`bdclick6`.`bdproductos`.`Codigo` = `bdclick6`.`bdcompra`.`producto`))) where ((not((`bdclick6`.`bdcompra`.`ingreso` like \'INI-*\'))) and (`bdclick6`.`bdingreso`.`anulada` = 0)) order by `bdclick6`.`bdcompra`.`ingreso`
mariadb-version=100135
