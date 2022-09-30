TYPE=VIEW
query=select `bdclick5`.`bdcompra`.`ingreso` AS `ingreso`,`bdclick5`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick5`.`bdingreso`.`bodega` AS `bodega`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`bdingreso`.`usuario` AS `usuario`,`bdclick5`.`bdingreso`.`anulada` AS `anulada`,`bdclick5`.`bdterceros`.`id` AS `codigo` from (((`bdclick5`.`bdingreso` left join `bdclick5`.`bdcompra` on((`bdclick5`.`bdingreso`.`id` = `bdclick5`.`bdcompra`.`ingreso`))) left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdterceros`.`idSistema` = `bdclick5`.`bdingreso`.`proveedor`))) left join `bdclick5`.`bdproductos` on((`bdclick5`.`bdproductos`.`Codigo` = `bdclick5`.`bdcompra`.`producto`))) where ((not((`bdclick5`.`bdcompra`.`ingreso` like \'INI-*\'))) and (`bdclick5`.`bdingreso`.`anulada` = 0)) order by `bdclick5`.`bdcompra`.`ingreso`
md5=0500ff9f4dcb6b8f66d8e296e41dca2a
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:47
create-version=2
source=select `bdcompra`.`ingreso` AS `ingreso`,`bdingreso`.`proveedor` AS `proveedor`,`bdingreso`.`bodega` AS `bodega`,`bdterceros`.`nombre` AS `nombre`,`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdingreso`.`usuario` AS `usuario`,`bdingreso`.`anulada` AS `anulada`,`bdterceros`.`id` AS `codigo` from (((`bdingreso` left join `bdcompra` on((`bdingreso`.`id` = `bdcompra`.`ingreso`))) left join `bdterceros` on((`bdterceros`.`idSistema` = `bdingreso`.`proveedor`))) left join `bdproductos` on((`bdproductos`.`Codigo` = `bdcompra`.`producto`))) where ((not((`bdcompra`.`ingreso` like \'INI-*\'))) and (`bdingreso`.`anulada` = 0)) order by `bdcompra`.`ingreso`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdcompra`.`ingreso` AS `ingreso`,`bdclick5`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick5`.`bdingreso`.`bodega` AS `bodega`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`bdingreso`.`usuario` AS `usuario`,`bdclick5`.`bdingreso`.`anulada` AS `anulada`,`bdclick5`.`bdterceros`.`id` AS `codigo` from (((`bdclick5`.`bdingreso` left join `bdclick5`.`bdcompra` on((`bdclick5`.`bdingreso`.`id` = `bdclick5`.`bdcompra`.`ingreso`))) left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdterceros`.`idSistema` = `bdclick5`.`bdingreso`.`proveedor`))) left join `bdclick5`.`bdproductos` on((`bdclick5`.`bdproductos`.`Codigo` = `bdclick5`.`bdcompra`.`producto`))) where ((not((`bdclick5`.`bdcompra`.`ingreso` like \'INI-*\'))) and (`bdclick5`.`bdingreso`.`anulada` = 0)) order by `bdclick5`.`bdcompra`.`ingreso`
mariadb-version=100135
