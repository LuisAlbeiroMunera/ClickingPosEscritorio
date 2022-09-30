TYPE=VIEW
query=select `bdclick3`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick3`.`bdcxp`.`estado` AS `estado`,`bdclick3`.`bdcxp`.`valor` AS `valor`,`bdclick3`.`bdcxp`.`tipo` AS `tipo`,`bdclick3`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick3`.`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick3`.`bdingreso`.`total` AS `total`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdingreso`.`anulada` AS `anulada`,`bdclick3`.`bdterceros`.`id` AS `proveedor`,`bdclick3`.`bdterceros`.`idSistema` AS `idSistema` from ((`bdclick3`.`bdcxp` left join `bdclick3`.`bdingreso` on((`bdclick3`.`bdcxp`.`ingreso` = `bdclick3`.`bdingreso`.`id`))) left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdingreso`.`proveedor` = `bdclick3`.`bdterceros`.`idSistema`))) where ((`bdclick3`.`bdcxp`.`estado` = \'PEND\') and (`bdclick3`.`bdcxp`.`tipo` <> \'PAGO\') and (`bdclick3`.`bdingreso`.`anulada` = 0))
md5=341db07e3c604d6b45e0342933f82bb5
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:53
create-version=2
source=select `bdcxp`.`ingreso` AS `ingreso`,`bdcxp`.`estado` AS `estado`,`bdcxp`.`valor` AS `valor`,`bdcxp`.`tipo` AS `tipo`,`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdingreso`.`total` AS `total`,`bdterceros`.`nombre` AS `nombre`,`bdingreso`.`anulada` AS `anulada`,`bdterceros`.`id` AS `proveedor`,`bdterceros`.`idSistema` AS `idSistema` from ((`bdcxp` left join `bdingreso` on((`bdcxp`.`ingreso` = `bdingreso`.`id`))) left join `bdterceros` on((`bdingreso`.`proveedor` = `bdterceros`.`idSistema`))) where ((`bdcxp`.`estado` = \'PEND\') and (`bdcxp`.`tipo` <> \'PAGO\') and (`bdingreso`.`anulada` = 0))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick3`.`bdcxp`.`estado` AS `estado`,`bdclick3`.`bdcxp`.`valor` AS `valor`,`bdclick3`.`bdcxp`.`tipo` AS `tipo`,`bdclick3`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick3`.`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick3`.`bdingreso`.`total` AS `total`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdingreso`.`anulada` AS `anulada`,`bdclick3`.`bdterceros`.`id` AS `proveedor`,`bdclick3`.`bdterceros`.`idSistema` AS `idSistema` from ((`bdclick3`.`bdcxp` left join `bdclick3`.`bdingreso` on((`bdclick3`.`bdcxp`.`ingreso` = `bdclick3`.`bdingreso`.`id`))) left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdingreso`.`proveedor` = `bdclick3`.`bdterceros`.`idSistema`))) where ((`bdclick3`.`bdcxp`.`estado` = \'PEND\') and (`bdclick3`.`bdcxp`.`tipo` <> \'PAGO\') and (`bdclick3`.`bdingreso`.`anulada` = 0))
mariadb-version=100135
