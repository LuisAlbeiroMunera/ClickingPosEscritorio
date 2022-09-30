TYPE=VIEW
query=select `bdclick`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick`.`bdcxp`.`tipo` AS `tipo`,`bdclick`.`bdcxp`.`estado` AS `estado`,`bdclick`.`bdterceros`.`id` AS `proveedor`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick`.`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick`.`bdcxp`.`valor` AS `valor`,`bdclick`.`bdingreso`.`anulada` AS `anulada`,`bdclick`.`bdcxp`.`terminal` AS `terminal`,`bdclick`.`conpagos`.`SumaDevalor` AS `SumaDevalor`,if(isnull(`bdclick`.`conpagos`.`SumaDevalor`),`bdclick`.`bdcxp`.`valor`,(`bdclick`.`bdcxp`.`valor` - `bdclick`.`conpagos`.`SumaDevalor`)) AS `saldo`,if((cast(now() as date) >= `bdclick`.`bdingreso`.`fechaVencimiento`),\'VENCIDA\',\'OK\') AS `estadoVenc`,(to_days(`bdclick`.`bdingreso`.`fechaVencimiento`) - to_days(cast(now() as date))) AS `edadCartera` from ((`bdclick`.`bdcxp` left join (`bdclick`.`bdingreso` left join `bdclick`.`bdterceros` on((`bdclick`.`bdterceros`.`idSistema` = `bdclick`.`bdingreso`.`proveedor`))) on((`bdclick`.`bdingreso`.`id` = `bdclick`.`bdcxp`.`ingreso`))) left join `bdclick`.`conpagos` on((`bdclick`.`bdingreso`.`id` = `bdclick`.`conpagos`.`ingreso`))) where ((`bdclick`.`bdcxp`.`ingreso` <> \'0\') and (`bdclick`.`bdcxp`.`tipo` <> \'PAGO\') and (`bdclick`.`bdcxp`.`estado` = \'PEND\') and (`bdclick`.`bdingreso`.`anulada` = 0))
md5=156321aa1a00b36aae177bfa7138ce22
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:22
create-version=2
source=select `bdcxp`.`ingreso` AS `ingreso`,`bdcxp`.`tipo` AS `tipo`,`bdcxp`.`estado` AS `estado`,`bdterceros`.`id` AS `proveedor`,`bdterceros`.`nombre` AS `nombre`,`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdcxp`.`valor` AS `valor`,`bdingreso`.`anulada` AS `anulada`,`bdcxp`.`terminal` AS `terminal`,`conpagos`.`SumaDevalor` AS `SumaDevalor`,if(isnull(`conpagos`.`SumaDevalor`),`bdcxp`.`valor`,(`bdcxp`.`valor` - `conpagos`.`SumaDevalor`)) AS `saldo`,if((cast(now() as date) >= `bdingreso`.`fechaVencimiento`),\'VENCIDA\',\'OK\') AS `estadoVenc`,(to_days(`bdingreso`.`fechaVencimiento`) - to_days(cast(now() as date))) AS `edadCartera` from ((`bdcxp` left join (`bdingreso` left join `bdterceros` on((`bdterceros`.`idSistema` = `bdingreso`.`proveedor`))) on((`bdingreso`.`id` = `bdcxp`.`ingreso`))) left join `conpagos` on((`bdingreso`.`id` = `conpagos`.`ingreso`))) where ((`bdcxp`.`ingreso` <> \'0\') and (`bdcxp`.`tipo` <> \'PAGO\') and (`bdcxp`.`estado` = \'PEND\') and (`bdingreso`.`anulada` = 0))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick`.`bdcxp`.`tipo` AS `tipo`,`bdclick`.`bdcxp`.`estado` AS `estado`,`bdclick`.`bdterceros`.`id` AS `proveedor`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdingreso`.`fechaFactura` AS `fechaFactura`,`bdclick`.`bdingreso`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick`.`bdcxp`.`valor` AS `valor`,`bdclick`.`bdingreso`.`anulada` AS `anulada`,`bdclick`.`bdcxp`.`terminal` AS `terminal`,`bdclick`.`conpagos`.`SumaDevalor` AS `SumaDevalor`,if(isnull(`bdclick`.`conpagos`.`SumaDevalor`),`bdclick`.`bdcxp`.`valor`,(`bdclick`.`bdcxp`.`valor` - `bdclick`.`conpagos`.`SumaDevalor`)) AS `saldo`,if((cast(now() as date) >= `bdclick`.`bdingreso`.`fechaVencimiento`),\'VENCIDA\',\'OK\') AS `estadoVenc`,(to_days(`bdclick`.`bdingreso`.`fechaVencimiento`) - to_days(cast(now() as date))) AS `edadCartera` from ((`bdclick`.`bdcxp` left join (`bdclick`.`bdingreso` left join `bdclick`.`bdterceros` on((`bdclick`.`bdterceros`.`idSistema` = `bdclick`.`bdingreso`.`proveedor`))) on((`bdclick`.`bdingreso`.`id` = `bdclick`.`bdcxp`.`ingreso`))) left join `bdclick`.`conpagos` on((`bdclick`.`bdingreso`.`id` = `bdclick`.`conpagos`.`ingreso`))) where ((`bdclick`.`bdcxp`.`ingreso` <> \'0\') and (`bdclick`.`bdcxp`.`tipo` <> \'PAGO\') and (`bdclick`.`bdcxp`.`estado` = \'PEND\') and (`bdclick`.`bdingreso`.`anulada` = 0))
mariadb-version=100135