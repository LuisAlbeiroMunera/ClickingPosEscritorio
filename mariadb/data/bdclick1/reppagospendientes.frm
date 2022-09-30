TYPE=VIEW
query=select `bdclick1`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick1`.`bdcxp`.`estado` AS `estado`,`bdclick1`.`bdcxp`.`valor` AS `valor`,`bdclick1`.`bdcxp`.`tipo` AS `tipo`,`bdclick1`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick1`.`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick1`.`bdingreso`.`total` AS `total`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`bdclick1`.`bdingreso`.`anulada` AS `anulada`,`bdclick1`.`bdterceros`.`id` AS `proveedor`,`bdclick1`.`bdterceros`.`idSistema` AS `idSistema` from ((`bdclick1`.`bdcxp` left join `bdclick1`.`bdingreso` on((`bdclick1`.`bdcxp`.`ingreso` = `bdclick1`.`bdingreso`.`id`))) left join `bdclick1`.`bdterceros` on((`bdclick1`.`bdingreso`.`proveedor` = `bdclick1`.`bdterceros`.`idSistema`))) where ((`bdclick1`.`bdcxp`.`estado` = \'PEND\') and (`bdclick1`.`bdcxp`.`tipo` <> \'PAGO\') and (`bdclick1`.`bdingreso`.`anulada` = 0))
md5=bb669be09c214add23f5660377c9ddf6
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:37
create-version=2
source=select `bdcxp`.`ingreso` AS `ingreso`,`bdcxp`.`estado` AS `estado`,`bdcxp`.`valor` AS `valor`,`bdcxp`.`tipo` AS `tipo`,`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdingreso`.`total` AS `total`,`bdterceros`.`nombre` AS `nombre`,`bdingreso`.`anulada` AS `anulada`,`bdterceros`.`id` AS `proveedor`,`bdterceros`.`idSistema` AS `idSistema` from ((`bdcxp` left join `bdingreso` on((`bdcxp`.`ingreso` = `bdingreso`.`id`))) left join `bdterceros` on((`bdingreso`.`proveedor` = `bdterceros`.`idSistema`))) where ((`bdcxp`.`estado` = \'PEND\') and (`bdcxp`.`tipo` <> \'PAGO\') and (`bdingreso`.`anulada` = 0))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick1`.`bdcxp`.`estado` AS `estado`,`bdclick1`.`bdcxp`.`valor` AS `valor`,`bdclick1`.`bdcxp`.`tipo` AS `tipo`,`bdclick1`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick1`.`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick1`.`bdingreso`.`total` AS `total`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`bdclick1`.`bdingreso`.`anulada` AS `anulada`,`bdclick1`.`bdterceros`.`id` AS `proveedor`,`bdclick1`.`bdterceros`.`idSistema` AS `idSistema` from ((`bdclick1`.`bdcxp` left join `bdclick1`.`bdingreso` on((`bdclick1`.`bdcxp`.`ingreso` = `bdclick1`.`bdingreso`.`id`))) left join `bdclick1`.`bdterceros` on((`bdclick1`.`bdingreso`.`proveedor` = `bdclick1`.`bdterceros`.`idSistema`))) where ((`bdclick1`.`bdcxp`.`estado` = \'PEND\') and (`bdclick1`.`bdcxp`.`tipo` <> \'PAGO\') and (`bdclick1`.`bdingreso`.`anulada` = 0))
mariadb-version=100135
