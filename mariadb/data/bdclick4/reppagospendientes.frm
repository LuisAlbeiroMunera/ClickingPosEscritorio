TYPE=VIEW
query=select `bdclick4`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick4`.`bdcxp`.`estado` AS `estado`,`bdclick4`.`bdcxp`.`valor` AS `valor`,`bdclick4`.`bdcxp`.`tipo` AS `tipo`,`bdclick4`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick4`.`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick4`.`bdingreso`.`total` AS `total`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,`bdclick4`.`bdingreso`.`anulada` AS `anulada`,`bdclick4`.`bdterceros`.`id` AS `proveedor`,`bdclick4`.`bdterceros`.`idSistema` AS `idSistema` from ((`bdclick4`.`bdcxp` left join `bdclick4`.`bdingreso` on((`bdclick4`.`bdcxp`.`ingreso` = `bdclick4`.`bdingreso`.`id`))) left join `bdclick4`.`bdterceros` on((`bdclick4`.`bdingreso`.`proveedor` = `bdclick4`.`bdterceros`.`idSistema`))) where ((`bdclick4`.`bdcxp`.`estado` = \'PEND\') and (`bdclick4`.`bdcxp`.`tipo` <> \'PAGO\') and (`bdclick4`.`bdingreso`.`anulada` = 0))
md5=93bd4085d5302b918e4c72c04718499f
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:30
create-version=2
source=select `bdcxp`.`ingreso` AS `ingreso`,`bdcxp`.`estado` AS `estado`,`bdcxp`.`valor` AS `valor`,`bdcxp`.`tipo` AS `tipo`,`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdingreso`.`total` AS `total`,`bdterceros`.`nombre` AS `nombre`,`bdingreso`.`anulada` AS `anulada`,`bdterceros`.`id` AS `proveedor`,`bdterceros`.`idSistema` AS `idSistema` from ((`bdcxp` left join `bdingreso` on((`bdcxp`.`ingreso` = `bdingreso`.`id`))) left join `bdterceros` on((`bdingreso`.`proveedor` = `bdterceros`.`idSistema`))) where ((`bdcxp`.`estado` = \'PEND\') and (`bdcxp`.`tipo` <> \'PAGO\') and (`bdingreso`.`anulada` = 0))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick4`.`bdcxp`.`estado` AS `estado`,`bdclick4`.`bdcxp`.`valor` AS `valor`,`bdclick4`.`bdcxp`.`tipo` AS `tipo`,`bdclick4`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick4`.`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick4`.`bdingreso`.`total` AS `total`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,`bdclick4`.`bdingreso`.`anulada` AS `anulada`,`bdclick4`.`bdterceros`.`id` AS `proveedor`,`bdclick4`.`bdterceros`.`idSistema` AS `idSistema` from ((`bdclick4`.`bdcxp` left join `bdclick4`.`bdingreso` on((`bdclick4`.`bdcxp`.`ingreso` = `bdclick4`.`bdingreso`.`id`))) left join `bdclick4`.`bdterceros` on((`bdclick4`.`bdingreso`.`proveedor` = `bdclick4`.`bdterceros`.`idSistema`))) where ((`bdclick4`.`bdcxp`.`estado` = \'PEND\') and (`bdclick4`.`bdcxp`.`tipo` <> \'PAGO\') and (`bdclick4`.`bdingreso`.`anulada` = 0))
mariadb-version=100135
