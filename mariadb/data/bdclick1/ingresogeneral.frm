TYPE=VIEW
query=select `bdclick1`.`bdcompra`.`ingreso` AS `ingreso`,`bdclick1`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick1`.`bdingreso`.`bodega` AS `bodega`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`bdclick1`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick1`.`bdingreso`.`usuario` AS `usuario`,`bdclick1`.`bdingreso`.`anulada` AS `anulada`,`bdclick1`.`bdterceros`.`id` AS `codigo` from (((`bdclick1`.`bdingreso` left join `bdclick1`.`bdcompra` on((`bdclick1`.`bdingreso`.`id` = `bdclick1`.`bdcompra`.`ingreso`))) left join `bdclick1`.`bdterceros` on((`bdclick1`.`bdterceros`.`idSistema` = `bdclick1`.`bdingreso`.`proveedor`))) left join `bdclick1`.`bdproductos` on((`bdclick1`.`bdproductos`.`Codigo` = `bdclick1`.`bdcompra`.`producto`))) where ((not((`bdclick1`.`bdcompra`.`ingreso` like \'INI-*\'))) and (`bdclick1`.`bdingreso`.`anulada` = 0)) order by `bdclick1`.`bdcompra`.`ingreso`
md5=4cfca3bc6efb534003056588a8ac2a8a
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:34
create-version=2
source=select `bdcompra`.`ingreso` AS `ingreso`,`bdingreso`.`proveedor` AS `proveedor`,`bdingreso`.`bodega` AS `bodega`,`bdterceros`.`nombre` AS `nombre`,`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdingreso`.`usuario` AS `usuario`,`bdingreso`.`anulada` AS `anulada`,`bdterceros`.`id` AS `codigo` from (((`bdingreso` left join `bdcompra` on((`bdingreso`.`id` = `bdcompra`.`ingreso`))) left join `bdterceros` on((`bdterceros`.`idSistema` = `bdingreso`.`proveedor`))) left join `bdproductos` on((`bdproductos`.`Codigo` = `bdcompra`.`producto`))) where ((not((`bdcompra`.`ingreso` like \'INI-*\'))) and (`bdingreso`.`anulada` = 0)) order by `bdcompra`.`ingreso`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdcompra`.`ingreso` AS `ingreso`,`bdclick1`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick1`.`bdingreso`.`bodega` AS `bodega`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`bdclick1`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick1`.`bdingreso`.`usuario` AS `usuario`,`bdclick1`.`bdingreso`.`anulada` AS `anulada`,`bdclick1`.`bdterceros`.`id` AS `codigo` from (((`bdclick1`.`bdingreso` left join `bdclick1`.`bdcompra` on((`bdclick1`.`bdingreso`.`id` = `bdclick1`.`bdcompra`.`ingreso`))) left join `bdclick1`.`bdterceros` on((`bdclick1`.`bdterceros`.`idSistema` = `bdclick1`.`bdingreso`.`proveedor`))) left join `bdclick1`.`bdproductos` on((`bdclick1`.`bdproductos`.`Codigo` = `bdclick1`.`bdcompra`.`producto`))) where ((not((`bdclick1`.`bdcompra`.`ingreso` like \'INI-*\'))) and (`bdclick1`.`bdingreso`.`anulada` = 0)) order by `bdclick1`.`bdcompra`.`ingreso`
mariadb-version=100135
