TYPE=VIEW
query=select `bdclick`.`bdcompra`.`ingreso` AS `ingreso`,`bdclick`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick`.`bdingreso`.`bodega` AS `bodega`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick`.`bdingreso`.`usuario` AS `usuario`,`bdclick`.`bdingreso`.`anulada` AS `anulada`,`bdclick`.`bdterceros`.`id` AS `codigo` from (((`bdclick`.`bdingreso` left join `bdclick`.`bdcompra` on((`bdclick`.`bdingreso`.`id` = `bdclick`.`bdcompra`.`ingreso`))) left join `bdclick`.`bdterceros` on((`bdclick`.`bdterceros`.`idSistema` = `bdclick`.`bdingreso`.`proveedor`))) left join `bdclick`.`bdproductos` on((`bdclick`.`bdproductos`.`Codigo` = `bdclick`.`bdcompra`.`producto`))) where ((not((`bdclick`.`bdcompra`.`ingreso` like \'INI-*\'))) and (`bdclick`.`bdingreso`.`anulada` = 0)) order by `bdclick`.`bdcompra`.`ingreso`
md5=0e37673501ce81cee36ac057a0ee22b0
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:24
create-version=2
source=select `bdcompra`.`ingreso` AS `ingreso`,`bdingreso`.`proveedor` AS `proveedor`,`bdingreso`.`bodega` AS `bodega`,`bdterceros`.`nombre` AS `nombre`,`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdingreso`.`usuario` AS `usuario`,`bdingreso`.`anulada` AS `anulada`,`bdterceros`.`id` AS `codigo` from (((`bdingreso` left join `bdcompra` on((`bdingreso`.`id` = `bdcompra`.`ingreso`))) left join `bdterceros` on((`bdterceros`.`idSistema` = `bdingreso`.`proveedor`))) left join `bdproductos` on((`bdproductos`.`Codigo` = `bdcompra`.`producto`))) where ((not((`bdcompra`.`ingreso` like \'INI-*\'))) and (`bdingreso`.`anulada` = 0)) order by `bdcompra`.`ingreso`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdcompra`.`ingreso` AS `ingreso`,`bdclick`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick`.`bdingreso`.`bodega` AS `bodega`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick`.`bdingreso`.`usuario` AS `usuario`,`bdclick`.`bdingreso`.`anulada` AS `anulada`,`bdclick`.`bdterceros`.`id` AS `codigo` from (((`bdclick`.`bdingreso` left join `bdclick`.`bdcompra` on((`bdclick`.`bdingreso`.`id` = `bdclick`.`bdcompra`.`ingreso`))) left join `bdclick`.`bdterceros` on((`bdclick`.`bdterceros`.`idSistema` = `bdclick`.`bdingreso`.`proveedor`))) left join `bdclick`.`bdproductos` on((`bdclick`.`bdproductos`.`Codigo` = `bdclick`.`bdcompra`.`producto`))) where ((not((`bdclick`.`bdcompra`.`ingreso` like \'INI-*\'))) and (`bdclick`.`bdingreso`.`anulada` = 0)) order by `bdclick`.`bdcompra`.`ingreso`
mariadb-version=100135
