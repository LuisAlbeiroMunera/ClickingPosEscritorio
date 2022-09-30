TYPE=VIEW
query=select `bdclick5`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick5`.`bdcxp`.`estado` AS `estado`,`bdclick5`.`bdcxp`.`valor` AS `valor`,`bdclick5`.`bdcxp`.`tipo` AS `tipo`,`bdclick5`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick5`.`bdingreso`.`total` AS `total`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdingreso`.`anulada` AS `anulada`,`bdclick5`.`bdterceros`.`id` AS `proveedor`,`bdclick5`.`bdterceros`.`idSistema` AS `idSistema` from ((`bdclick5`.`bdcxp` left join `bdclick5`.`bdingreso` on((`bdclick5`.`bdcxp`.`ingreso` = `bdclick5`.`bdingreso`.`id`))) left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdingreso`.`proveedor` = `bdclick5`.`bdterceros`.`idSistema`))) where ((`bdclick5`.`bdcxp`.`estado` = \'PEND\') and (`bdclick5`.`bdcxp`.`tipo` <> \'PAGO\') and (`bdclick5`.`bdingreso`.`anulada` = 0))
md5=7f717c72fc1bb53bf7e3367472d2523f
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:50
create-version=2
source=select `bdcxp`.`ingreso` AS `ingreso`,`bdcxp`.`estado` AS `estado`,`bdcxp`.`valor` AS `valor`,`bdcxp`.`tipo` AS `tipo`,`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdingreso`.`total` AS `total`,`bdterceros`.`nombre` AS `nombre`,`bdingreso`.`anulada` AS `anulada`,`bdterceros`.`id` AS `proveedor`,`bdterceros`.`idSistema` AS `idSistema` from ((`bdcxp` left join `bdingreso` on((`bdcxp`.`ingreso` = `bdingreso`.`id`))) left join `bdterceros` on((`bdingreso`.`proveedor` = `bdterceros`.`idSistema`))) where ((`bdcxp`.`estado` = \'PEND\') and (`bdcxp`.`tipo` <> \'PAGO\') and (`bdingreso`.`anulada` = 0))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick5`.`bdcxp`.`estado` AS `estado`,`bdclick5`.`bdcxp`.`valor` AS `valor`,`bdclick5`.`bdcxp`.`tipo` AS `tipo`,`bdclick5`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick5`.`bdingreso`.`total` AS `total`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdingreso`.`anulada` AS `anulada`,`bdclick5`.`bdterceros`.`id` AS `proveedor`,`bdclick5`.`bdterceros`.`idSistema` AS `idSistema` from ((`bdclick5`.`bdcxp` left join `bdclick5`.`bdingreso` on((`bdclick5`.`bdcxp`.`ingreso` = `bdclick5`.`bdingreso`.`id`))) left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdingreso`.`proveedor` = `bdclick5`.`bdterceros`.`idSistema`))) where ((`bdclick5`.`bdcxp`.`estado` = \'PEND\') and (`bdclick5`.`bdcxp`.`tipo` <> \'PAGO\') and (`bdclick5`.`bdingreso`.`anulada` = 0))
mariadb-version=100135
