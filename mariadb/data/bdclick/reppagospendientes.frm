TYPE=VIEW
query=select `bdclick`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick`.`bdcxp`.`estado` AS `estado`,`bdclick`.`bdcxp`.`valor` AS `valor`,`bdclick`.`bdcxp`.`tipo` AS `tipo`,`bdclick`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick`.`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick`.`bdingreso`.`total` AS `total`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdingreso`.`anulada` AS `anulada`,`bdclick`.`bdterceros`.`id` AS `proveedor`,`bdclick`.`bdterceros`.`idSistema` AS `idSistema` from ((`bdclick`.`bdcxp` left join `bdclick`.`bdingreso` on((`bdclick`.`bdcxp`.`ingreso` = `bdclick`.`bdingreso`.`id`))) left join `bdclick`.`bdterceros` on((`bdclick`.`bdingreso`.`proveedor` = `bdclick`.`bdterceros`.`idSistema`))) where ((`bdclick`.`bdcxp`.`estado` = \'PEND\') and (`bdclick`.`bdcxp`.`tipo` <> \'PAGO\') and (`bdclick`.`bdingreso`.`anulada` = 0))
md5=e8f2f075cf16415fd96d04543a760d09
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:27
create-version=2
source=select `bdcxp`.`ingreso` AS `ingreso`,`bdcxp`.`estado` AS `estado`,`bdcxp`.`valor` AS `valor`,`bdcxp`.`tipo` AS `tipo`,`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdingreso`.`total` AS `total`,`bdterceros`.`nombre` AS `nombre`,`bdingreso`.`anulada` AS `anulada`,`bdterceros`.`id` AS `proveedor`,`bdterceros`.`idSistema` AS `idSistema` from ((`bdcxp` left join `bdingreso` on((`bdcxp`.`ingreso` = `bdingreso`.`id`))) left join `bdterceros` on((`bdingreso`.`proveedor` = `bdterceros`.`idSistema`))) where ((`bdcxp`.`estado` = \'PEND\') and (`bdcxp`.`tipo` <> \'PAGO\') and (`bdingreso`.`anulada` = 0))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick`.`bdcxp`.`estado` AS `estado`,`bdclick`.`bdcxp`.`valor` AS `valor`,`bdclick`.`bdcxp`.`tipo` AS `tipo`,`bdclick`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick`.`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick`.`bdingreso`.`total` AS `total`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdingreso`.`anulada` AS `anulada`,`bdclick`.`bdterceros`.`id` AS `proveedor`,`bdclick`.`bdterceros`.`idSistema` AS `idSistema` from ((`bdclick`.`bdcxp` left join `bdclick`.`bdingreso` on((`bdclick`.`bdcxp`.`ingreso` = `bdclick`.`bdingreso`.`id`))) left join `bdclick`.`bdterceros` on((`bdclick`.`bdingreso`.`proveedor` = `bdclick`.`bdterceros`.`idSistema`))) where ((`bdclick`.`bdcxp`.`estado` = \'PEND\') and (`bdclick`.`bdcxp`.`tipo` <> \'PAGO\') and (`bdclick`.`bdingreso`.`anulada` = 0))
mariadb-version=100135
