TYPE=VIEW
query=select `bdclick2`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick2`.`bdcxp`.`estado` AS `estado`,`bdclick2`.`bdcxp`.`valor` AS `valor`,`bdclick2`.`bdcxp`.`tipo` AS `tipo`,`bdclick2`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick2`.`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick2`.`bdingreso`.`total` AS `total`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,`bdclick2`.`bdingreso`.`anulada` AS `anulada`,`bdclick2`.`bdterceros`.`id` AS `proveedor`,`bdclick2`.`bdterceros`.`idSistema` AS `idSistema` from ((`bdclick2`.`bdcxp` left join `bdclick2`.`bdingreso` on((`bdclick2`.`bdcxp`.`ingreso` = `bdclick2`.`bdingreso`.`id`))) left join `bdclick2`.`bdterceros` on((`bdclick2`.`bdingreso`.`proveedor` = `bdclick2`.`bdterceros`.`idSistema`))) where ((`bdclick2`.`bdcxp`.`estado` = \'PEND\') and (`bdclick2`.`bdcxp`.`tipo` <> \'PAGO\') and (`bdclick2`.`bdingreso`.`anulada` = 0))
md5=3b1571653b525a93e2ea163d0aeb2baf
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:48
create-version=2
source=select `bdcxp`.`ingreso` AS `ingreso`,`bdcxp`.`estado` AS `estado`,`bdcxp`.`valor` AS `valor`,`bdcxp`.`tipo` AS `tipo`,`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdingreso`.`total` AS `total`,`bdterceros`.`nombre` AS `nombre`,`bdingreso`.`anulada` AS `anulada`,`bdterceros`.`id` AS `proveedor`,`bdterceros`.`idSistema` AS `idSistema` from ((`bdcxp` left join `bdingreso` on((`bdcxp`.`ingreso` = `bdingreso`.`id`))) left join `bdterceros` on((`bdingreso`.`proveedor` = `bdterceros`.`idSistema`))) where ((`bdcxp`.`estado` = \'PEND\') and (`bdcxp`.`tipo` <> \'PAGO\') and (`bdingreso`.`anulada` = 0))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick2`.`bdcxp`.`estado` AS `estado`,`bdclick2`.`bdcxp`.`valor` AS `valor`,`bdclick2`.`bdcxp`.`tipo` AS `tipo`,`bdclick2`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick2`.`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick2`.`bdingreso`.`total` AS `total`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,`bdclick2`.`bdingreso`.`anulada` AS `anulada`,`bdclick2`.`bdterceros`.`id` AS `proveedor`,`bdclick2`.`bdterceros`.`idSistema` AS `idSistema` from ((`bdclick2`.`bdcxp` left join `bdclick2`.`bdingreso` on((`bdclick2`.`bdcxp`.`ingreso` = `bdclick2`.`bdingreso`.`id`))) left join `bdclick2`.`bdterceros` on((`bdclick2`.`bdingreso`.`proveedor` = `bdclick2`.`bdterceros`.`idSistema`))) where ((`bdclick2`.`bdcxp`.`estado` = \'PEND\') and (`bdclick2`.`bdcxp`.`tipo` <> \'PAGO\') and (`bdclick2`.`bdingreso`.`anulada` = 0))
mariadb-version=100135
