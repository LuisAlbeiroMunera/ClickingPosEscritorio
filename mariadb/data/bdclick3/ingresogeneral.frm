TYPE=VIEW
query=select `bdclick3`.`bdcompra`.`ingreso` AS `ingreso`,`bdclick3`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick3`.`bdingreso`.`bodega` AS `bodega`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick3`.`bdingreso`.`usuario` AS `usuario`,`bdclick3`.`bdingreso`.`anulada` AS `anulada`,`bdclick3`.`bdterceros`.`id` AS `codigo` from (((`bdclick3`.`bdingreso` left join `bdclick3`.`bdcompra` on((`bdclick3`.`bdingreso`.`id` = `bdclick3`.`bdcompra`.`ingreso`))) left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdterceros`.`idSistema` = `bdclick3`.`bdingreso`.`proveedor`))) left join `bdclick3`.`bdproductos` on((`bdclick3`.`bdproductos`.`Codigo` = `bdclick3`.`bdcompra`.`producto`))) where ((not((`bdclick3`.`bdcompra`.`ingreso` like \'INI-*\'))) and (`bdclick3`.`bdingreso`.`anulada` = 0)) order by `bdclick3`.`bdcompra`.`ingreso`
md5=dc167d6489db56c3e432c118466f52d3
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:51
create-version=2
source=select `bdcompra`.`ingreso` AS `ingreso`,`bdingreso`.`proveedor` AS `proveedor`,`bdingreso`.`bodega` AS `bodega`,`bdterceros`.`nombre` AS `nombre`,`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdingreso`.`usuario` AS `usuario`,`bdingreso`.`anulada` AS `anulada`,`bdterceros`.`id` AS `codigo` from (((`bdingreso` left join `bdcompra` on((`bdingreso`.`id` = `bdcompra`.`ingreso`))) left join `bdterceros` on((`bdterceros`.`idSistema` = `bdingreso`.`proveedor`))) left join `bdproductos` on((`bdproductos`.`Codigo` = `bdcompra`.`producto`))) where ((not((`bdcompra`.`ingreso` like \'INI-*\'))) and (`bdingreso`.`anulada` = 0)) order by `bdcompra`.`ingreso`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdcompra`.`ingreso` AS `ingreso`,`bdclick3`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick3`.`bdingreso`.`bodega` AS `bodega`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick3`.`bdingreso`.`usuario` AS `usuario`,`bdclick3`.`bdingreso`.`anulada` AS `anulada`,`bdclick3`.`bdterceros`.`id` AS `codigo` from (((`bdclick3`.`bdingreso` left join `bdclick3`.`bdcompra` on((`bdclick3`.`bdingreso`.`id` = `bdclick3`.`bdcompra`.`ingreso`))) left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdterceros`.`idSistema` = `bdclick3`.`bdingreso`.`proveedor`))) left join `bdclick3`.`bdproductos` on((`bdclick3`.`bdproductos`.`Codigo` = `bdclick3`.`bdcompra`.`producto`))) where ((not((`bdclick3`.`bdcompra`.`ingreso` like \'INI-*\'))) and (`bdclick3`.`bdingreso`.`anulada` = 0)) order by `bdclick3`.`bdcompra`.`ingreso`
mariadb-version=100135
