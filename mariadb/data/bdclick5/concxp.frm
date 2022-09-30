TYPE=VIEW
query=select `bdclick5`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick5`.`bdcxp`.`tipo` AS `tipo`,`bdclick5`.`bdcxp`.`estado` AS `estado`,`bdclick5`.`bdterceros`.`id` AS `proveedor`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick5`.`bdcxp`.`valor` AS `valor`,`bdclick5`.`bdingreso`.`anulada` AS `anulada`,`bdclick5`.`bdcxp`.`terminal` AS `terminal`,`bdclick5`.`conpagos`.`SumaDevalor` AS `SumaDevalor`,if(isnull(`bdclick5`.`conpagos`.`SumaDevalor`),`bdclick5`.`bdcxp`.`valor`,(`bdclick5`.`bdcxp`.`valor` - `bdclick5`.`conpagos`.`SumaDevalor`)) AS `saldo`,if((cast(now() as date) >= `bdclick5`.`bdingreso`.`fechaVencimiento`),\'VENCIDA\',\'OK\') AS `estadoVenc`,(to_days(`bdclick5`.`bdingreso`.`fechaVencimiento`) - to_days(cast(now() as date))) AS `edadCartera` from ((`bdclick5`.`bdcxp` left join (`bdclick5`.`bdingreso` left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdterceros`.`idSistema` = `bdclick5`.`bdingreso`.`proveedor`))) on((`bdclick5`.`bdingreso`.`id` = `bdclick5`.`bdcxp`.`ingreso`))) left join `bdclick5`.`conpagos` on((`bdclick5`.`bdingreso`.`id` = `bdclick5`.`conpagos`.`ingreso`))) where ((`bdclick5`.`bdcxp`.`ingreso` <> \'0\') and (`bdclick5`.`bdcxp`.`tipo` <> \'PAGO\') and (`bdclick5`.`bdcxp`.`estado` = \'PEND\') and (`bdclick5`.`bdingreso`.`anulada` = 0))
md5=f41c63e99fd8856e52c996a17d4ca268
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:45
create-version=2
source=select `bdcxp`.`ingreso` AS `ingreso`,`bdcxp`.`tipo` AS `tipo`,`bdcxp`.`estado` AS `estado`,`bdterceros`.`id` AS `proveedor`,`bdterceros`.`nombre` AS `nombre`,`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdcxp`.`valor` AS `valor`,`bdingreso`.`anulada` AS `anulada`,`bdcxp`.`terminal` AS `terminal`,`conpagos`.`SumaDevalor` AS `SumaDevalor`,if(isnull(`conpagos`.`SumaDevalor`),`bdcxp`.`valor`,(`bdcxp`.`valor` - `conpagos`.`SumaDevalor`)) AS `saldo`,if((cast(now() as date) >= `bdingreso`.`fechaVencimiento`),\'VENCIDA\',\'OK\') AS `estadoVenc`,(to_days(`bdingreso`.`fechaVencimiento`) - to_days(cast(now() as date))) AS `edadCartera` from ((`bdcxp` left join (`bdingreso` left join `bdterceros` on((`bdterceros`.`idSistema` = `bdingreso`.`proveedor`))) on((`bdingreso`.`id` = `bdcxp`.`ingreso`))) left join `conpagos` on((`bdingreso`.`id` = `conpagos`.`ingreso`))) where ((`bdcxp`.`ingreso` <> \'0\') and (`bdcxp`.`tipo` <> \'PAGO\') and (`bdcxp`.`estado` = \'PEND\') and (`bdingreso`.`anulada` = 0))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick5`.`bdcxp`.`tipo` AS `tipo`,`bdclick5`.`bdcxp`.`estado` AS `estado`,`bdclick5`.`bdterceros`.`id` AS `proveedor`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick5`.`bdcxp`.`valor` AS `valor`,`bdclick5`.`bdingreso`.`anulada` AS `anulada`,`bdclick5`.`bdcxp`.`terminal` AS `terminal`,`bdclick5`.`conpagos`.`SumaDevalor` AS `SumaDevalor`,if(isnull(`bdclick5`.`conpagos`.`SumaDevalor`),`bdclick5`.`bdcxp`.`valor`,(`bdclick5`.`bdcxp`.`valor` - `bdclick5`.`conpagos`.`SumaDevalor`)) AS `saldo`,if((cast(now() as date) >= `bdclick5`.`bdingreso`.`fechaVencimiento`),\'VENCIDA\',\'OK\') AS `estadoVenc`,(to_days(`bdclick5`.`bdingreso`.`fechaVencimiento`) - to_days(cast(now() as date))) AS `edadCartera` from ((`bdclick5`.`bdcxp` left join (`bdclick5`.`bdingreso` left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdterceros`.`idSistema` = `bdclick5`.`bdingreso`.`proveedor`))) on((`bdclick5`.`bdingreso`.`id` = `bdclick5`.`bdcxp`.`ingreso`))) left join `bdclick5`.`conpagos` on((`bdclick5`.`bdingreso`.`id` = `bdclick5`.`conpagos`.`ingreso`))) where ((`bdclick5`.`bdcxp`.`ingreso` <> \'0\') and (`bdclick5`.`bdcxp`.`tipo` <> \'PAGO\') and (`bdclick5`.`bdcxp`.`estado` = \'PEND\') and (`bdclick5`.`bdingreso`.`anulada` = 0))
mariadb-version=100135
