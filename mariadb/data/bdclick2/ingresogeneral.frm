TYPE=VIEW
query=select `bdclick2`.`bdcompra`.`ingreso` AS `ingreso`,`bdclick2`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick2`.`bdingreso`.`bodega` AS `bodega`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,`bdclick2`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick2`.`bdingreso`.`usuario` AS `usuario`,`bdclick2`.`bdingreso`.`anulada` AS `anulada`,`bdclick2`.`bdterceros`.`id` AS `codigo` from (((`bdclick2`.`bdingreso` left join `bdclick2`.`bdcompra` on((`bdclick2`.`bdingreso`.`id` = `bdclick2`.`bdcompra`.`ingreso`))) left join `bdclick2`.`bdterceros` on((`bdclick2`.`bdterceros`.`idSistema` = `bdclick2`.`bdingreso`.`proveedor`))) left join `bdclick2`.`bdproductos` on((`bdclick2`.`bdproductos`.`Codigo` = `bdclick2`.`bdcompra`.`producto`))) where ((not((`bdclick2`.`bdcompra`.`ingreso` like \'INI-*\'))) and (`bdclick2`.`bdingreso`.`anulada` = 0)) order by `bdclick2`.`bdcompra`.`ingreso`
md5=b66c652d45367a6c7fd613dc6f43c8ca
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:45
create-version=2
source=select `bdcompra`.`ingreso` AS `ingreso`,`bdingreso`.`proveedor` AS `proveedor`,`bdingreso`.`bodega` AS `bodega`,`bdterceros`.`nombre` AS `nombre`,`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdingreso`.`usuario` AS `usuario`,`bdingreso`.`anulada` AS `anulada`,`bdterceros`.`id` AS `codigo` from (((`bdingreso` left join `bdcompra` on((`bdingreso`.`id` = `bdcompra`.`ingreso`))) left join `bdterceros` on((`bdterceros`.`idSistema` = `bdingreso`.`proveedor`))) left join `bdproductos` on((`bdproductos`.`Codigo` = `bdcompra`.`producto`))) where ((not((`bdcompra`.`ingreso` like \'INI-*\'))) and (`bdingreso`.`anulada` = 0)) order by `bdcompra`.`ingreso`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdcompra`.`ingreso` AS `ingreso`,`bdclick2`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick2`.`bdingreso`.`bodega` AS `bodega`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,`bdclick2`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick2`.`bdingreso`.`usuario` AS `usuario`,`bdclick2`.`bdingreso`.`anulada` AS `anulada`,`bdclick2`.`bdterceros`.`id` AS `codigo` from (((`bdclick2`.`bdingreso` left join `bdclick2`.`bdcompra` on((`bdclick2`.`bdingreso`.`id` = `bdclick2`.`bdcompra`.`ingreso`))) left join `bdclick2`.`bdterceros` on((`bdclick2`.`bdterceros`.`idSistema` = `bdclick2`.`bdingreso`.`proveedor`))) left join `bdclick2`.`bdproductos` on((`bdclick2`.`bdproductos`.`Codigo` = `bdclick2`.`bdcompra`.`producto`))) where ((not((`bdclick2`.`bdcompra`.`ingreso` like \'INI-*\'))) and (`bdclick2`.`bdingreso`.`anulada` = 0)) order by `bdclick2`.`bdcompra`.`ingreso`
mariadb-version=100135
