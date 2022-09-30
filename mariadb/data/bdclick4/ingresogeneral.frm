TYPE=VIEW
query=select `bdclick4`.`bdcompra`.`ingreso` AS `ingreso`,`bdclick4`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick4`.`bdingreso`.`bodega` AS `bodega`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,`bdclick4`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick4`.`bdingreso`.`usuario` AS `usuario`,`bdclick4`.`bdingreso`.`anulada` AS `anulada`,`bdclick4`.`bdterceros`.`id` AS `codigo` from (((`bdclick4`.`bdingreso` left join `bdclick4`.`bdcompra` on((`bdclick4`.`bdingreso`.`id` = `bdclick4`.`bdcompra`.`ingreso`))) left join `bdclick4`.`bdterceros` on((`bdclick4`.`bdterceros`.`idSistema` = `bdclick4`.`bdingreso`.`proveedor`))) left join `bdclick4`.`bdproductos` on((`bdclick4`.`bdproductos`.`Codigo` = `bdclick4`.`bdcompra`.`producto`))) where ((not((`bdclick4`.`bdcompra`.`ingreso` like \'INI-*\'))) and (`bdclick4`.`bdingreso`.`anulada` = 0)) order by `bdclick4`.`bdcompra`.`ingreso`
md5=e7bcffbe3fce381b16b2a4e36f22d1ac
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:28
create-version=2
source=select `bdcompra`.`ingreso` AS `ingreso`,`bdingreso`.`proveedor` AS `proveedor`,`bdingreso`.`bodega` AS `bodega`,`bdterceros`.`nombre` AS `nombre`,`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdingreso`.`usuario` AS `usuario`,`bdingreso`.`anulada` AS `anulada`,`bdterceros`.`id` AS `codigo` from (((`bdingreso` left join `bdcompra` on((`bdingreso`.`id` = `bdcompra`.`ingreso`))) left join `bdterceros` on((`bdterceros`.`idSistema` = `bdingreso`.`proveedor`))) left join `bdproductos` on((`bdproductos`.`Codigo` = `bdcompra`.`producto`))) where ((not((`bdcompra`.`ingreso` like \'INI-*\'))) and (`bdingreso`.`anulada` = 0)) order by `bdcompra`.`ingreso`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdcompra`.`ingreso` AS `ingreso`,`bdclick4`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick4`.`bdingreso`.`bodega` AS `bodega`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,`bdclick4`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick4`.`bdingreso`.`usuario` AS `usuario`,`bdclick4`.`bdingreso`.`anulada` AS `anulada`,`bdclick4`.`bdterceros`.`id` AS `codigo` from (((`bdclick4`.`bdingreso` left join `bdclick4`.`bdcompra` on((`bdclick4`.`bdingreso`.`id` = `bdclick4`.`bdcompra`.`ingreso`))) left join `bdclick4`.`bdterceros` on((`bdclick4`.`bdterceros`.`idSistema` = `bdclick4`.`bdingreso`.`proveedor`))) left join `bdclick4`.`bdproductos` on((`bdclick4`.`bdproductos`.`Codigo` = `bdclick4`.`bdcompra`.`producto`))) where ((not((`bdclick4`.`bdcompra`.`ingreso` like \'INI-*\'))) and (`bdclick4`.`bdingreso`.`anulada` = 0)) order by `bdclick4`.`bdcompra`.`ingreso`
mariadb-version=100135
