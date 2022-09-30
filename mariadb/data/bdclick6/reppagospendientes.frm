TYPE=VIEW
query=select `bdclick6`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick6`.`bdcxp`.`estado` AS `estado`,`bdclick6`.`bdcxp`.`valor` AS `valor`,`bdclick6`.`bdcxp`.`tipo` AS `tipo`,`bdclick6`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick6`.`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick6`.`bdingreso`.`total` AS `total`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdingreso`.`anulada` AS `anulada`,`bdclick6`.`bdterceros`.`id` AS `proveedor`,`bdclick6`.`bdterceros`.`idSistema` AS `idSistema` from ((`bdclick6`.`bdcxp` left join `bdclick6`.`bdingreso` on((`bdclick6`.`bdcxp`.`ingreso` = `bdclick6`.`bdingreso`.`id`))) left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdingreso`.`proveedor` = `bdclick6`.`bdterceros`.`idSistema`))) where ((`bdclick6`.`bdcxp`.`estado` = \'PEND\') and (`bdclick6`.`bdcxp`.`tipo` <> \'PAGO\') and (`bdclick6`.`bdingreso`.`anulada` = 0))
md5=3ba105891bd1d9699672d5c5dce9c51d
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:38
create-version=2
source=select `bdcxp`.`ingreso` AS `ingreso`,`bdcxp`.`estado` AS `estado`,`bdcxp`.`valor` AS `valor`,`bdcxp`.`tipo` AS `tipo`,`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdingreso`.`total` AS `total`,`bdterceros`.`nombre` AS `nombre`,`bdingreso`.`anulada` AS `anulada`,`bdterceros`.`id` AS `proveedor`,`bdterceros`.`idSistema` AS `idSistema` from ((`bdcxp` left join `bdingreso` on((`bdcxp`.`ingreso` = `bdingreso`.`id`))) left join `bdterceros` on((`bdingreso`.`proveedor` = `bdterceros`.`idSistema`))) where ((`bdcxp`.`estado` = \'PEND\') and (`bdcxp`.`tipo` <> \'PAGO\') and (`bdingreso`.`anulada` = 0))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick6`.`bdcxp`.`estado` AS `estado`,`bdclick6`.`bdcxp`.`valor` AS `valor`,`bdclick6`.`bdcxp`.`tipo` AS `tipo`,`bdclick6`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick6`.`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick6`.`bdingreso`.`total` AS `total`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdingreso`.`anulada` AS `anulada`,`bdclick6`.`bdterceros`.`id` AS `proveedor`,`bdclick6`.`bdterceros`.`idSistema` AS `idSistema` from ((`bdclick6`.`bdcxp` left join `bdclick6`.`bdingreso` on((`bdclick6`.`bdcxp`.`ingreso` = `bdclick6`.`bdingreso`.`id`))) left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdingreso`.`proveedor` = `bdclick6`.`bdterceros`.`idSistema`))) where ((`bdclick6`.`bdcxp`.`estado` = \'PEND\') and (`bdclick6`.`bdcxp`.`tipo` <> \'PAGO\') and (`bdclick6`.`bdingreso`.`anulada` = 0))
mariadb-version=100135
