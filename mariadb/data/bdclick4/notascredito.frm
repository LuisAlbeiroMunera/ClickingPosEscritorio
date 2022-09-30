TYPE=VIEW
query=select `bdclick4`.`bdnc`.`Id` AS `Id`,`bdclick4`.`bdnc`.`cliente` AS `cliente`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,0 AS `efectivo`,0 AS `targeta`,0 AS `cheque`,`bdclick4`.`bdnc`.`valor` AS `nc`,`bdclick4`.`bdnc`.`anulada` AS `anulada`,0 AS `credito`,`bdclick4`.`bdnc`.`fecha` AS `fechaFactura`,`bdclick4`.`bdnc`.`valor` AS `total`,`bdclick4`.`bdnc`.`vendedor` AS `red`,0 AS `descuentos`,`bdclick4`.`bdnc`.`terminal` AS `terminal`,`bdclick4`.`bdnc`.`cuadre` AS `cuadre`,if(isnull(`bdclick4`.`bdnc`.`cuadre`),\'PENDIENTE\',if((`bdclick4`.`bdnc`.`cuadre` = \'\'),\'PENDIENTE\',\'REALIZADO\')) AS `estado`,`bdclick4`.`bdnc`.`usuario` AS `usuario`,`bdclick4`.`bdnc`.`Id` AS `factura`,`bdclick4`.`bdnc`.`reembolsar` AS `reembolsar`,\'\' AS `comprobante`,\'0\' AS `cuotaInicial2`,`bdclick4`.`bdterceros`.`id` AS `idCliente` from (`bdclick4`.`bdnc` join `bdclick4`.`bdterceros` on((`bdclick4`.`bdnc`.`cliente` = `bdclick4`.`bdterceros`.`idSistema`))) where (`bdclick4`.`bdnc`.`anulada` = 0)
md5=47f34f107cfe7b0884d401664e0815a0
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:28
create-version=2
source=select `bdnc`.`Id` AS `Id`,`bdnc`.`cliente` AS `cliente`,`bdterceros`.`nombre` AS `nombre`,0 AS `efectivo`,0 AS `targeta`,0 AS `cheque`,`bdnc`.`valor` AS `nc`,`bdnc`.`anulada` AS `anulada`,0 AS `credito`,`bdnc`.`fecha` AS `fechaFactura`,`bdnc`.`valor` AS `total`,`bdnc`.`vendedor` AS `red`,0 AS `descuentos`,`bdnc`.`terminal` AS `terminal`,`bdnc`.`cuadre` AS `cuadre`,if(isnull(`bdnc`.`cuadre`),\'PENDIENTE\',if((`bdnc`.`cuadre` = \'\'),\'PENDIENTE\',\'REALIZADO\')) AS `estado`,`bdnc`.`usuario` AS `usuario`,`bdnc`.`Id` AS `factura`,`bdnc`.`reembolsar` AS `reembolsar`,\'\' AS `comprobante`,\'0\' AS `cuotaInicial2`,`bdterceros`.`id` AS `idCliente` from (`bdnc` join `bdterceros` on((`bdnc`.`cliente` = `bdterceros`.`idSistema`))) where (`bdnc`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdnc`.`Id` AS `Id`,`bdclick4`.`bdnc`.`cliente` AS `cliente`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,0 AS `efectivo`,0 AS `targeta`,0 AS `cheque`,`bdclick4`.`bdnc`.`valor` AS `nc`,`bdclick4`.`bdnc`.`anulada` AS `anulada`,0 AS `credito`,`bdclick4`.`bdnc`.`fecha` AS `fechaFactura`,`bdclick4`.`bdnc`.`valor` AS `total`,`bdclick4`.`bdnc`.`vendedor` AS `red`,0 AS `descuentos`,`bdclick4`.`bdnc`.`terminal` AS `terminal`,`bdclick4`.`bdnc`.`cuadre` AS `cuadre`,if(isnull(`bdclick4`.`bdnc`.`cuadre`),\'PENDIENTE\',if((`bdclick4`.`bdnc`.`cuadre` = \'\'),\'PENDIENTE\',\'REALIZADO\')) AS `estado`,`bdclick4`.`bdnc`.`usuario` AS `usuario`,`bdclick4`.`bdnc`.`Id` AS `factura`,`bdclick4`.`bdnc`.`reembolsar` AS `reembolsar`,\'\' AS `comprobante`,\'0\' AS `cuotaInicial2`,`bdclick4`.`bdterceros`.`id` AS `idCliente` from (`bdclick4`.`bdnc` join `bdclick4`.`bdterceros` on((`bdclick4`.`bdnc`.`cliente` = `bdclick4`.`bdterceros`.`idSistema`))) where (`bdclick4`.`bdnc`.`anulada` = 0)
mariadb-version=100135
