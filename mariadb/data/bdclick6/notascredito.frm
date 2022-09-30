TYPE=VIEW
query=select `bdclick6`.`bdnc`.`Id` AS `Id`,`bdclick6`.`bdnc`.`cliente` AS `cliente`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,0 AS `efectivo`,0 AS `targeta`,0 AS `cheque`,`bdclick6`.`bdnc`.`valor` AS `nc`,`bdclick6`.`bdnc`.`anulada` AS `anulada`,0 AS `credito`,`bdclick6`.`bdnc`.`fecha` AS `fechaFactura`,`bdclick6`.`bdnc`.`valor` AS `total`,`bdclick6`.`bdnc`.`vendedor` AS `red`,0 AS `descuentos`,`bdclick6`.`bdnc`.`terminal` AS `terminal`,`bdclick6`.`bdnc`.`cuadre` AS `cuadre`,if(isnull(`bdclick6`.`bdnc`.`cuadre`),\'PENDIENTE\',if((`bdclick6`.`bdnc`.`cuadre` = \'\'),\'PENDIENTE\',\'REALIZADO\')) AS `estado`,`bdclick6`.`bdnc`.`usuario` AS `usuario`,`bdclick6`.`bdnc`.`Id` AS `factura`,`bdclick6`.`bdnc`.`reembolsar` AS `reembolsar`,\'\' AS `comprobante`,\'0\' AS `cuotaInicial2`,`bdclick6`.`bdterceros`.`id` AS `idCliente` from (`bdclick6`.`bdnc` join `bdclick6`.`bdterceros` on((`bdclick6`.`bdnc`.`cliente` = `bdclick6`.`bdterceros`.`idSistema`))) where (`bdclick6`.`bdnc`.`anulada` = 0)
md5=65df5ccd6e58c0fafa249359f4d98290
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:36
create-version=2
source=select `bdnc`.`Id` AS `Id`,`bdnc`.`cliente` AS `cliente`,`bdterceros`.`nombre` AS `nombre`,0 AS `efectivo`,0 AS `targeta`,0 AS `cheque`,`bdnc`.`valor` AS `nc`,`bdnc`.`anulada` AS `anulada`,0 AS `credito`,`bdnc`.`fecha` AS `fechaFactura`,`bdnc`.`valor` AS `total`,`bdnc`.`vendedor` AS `red`,0 AS `descuentos`,`bdnc`.`terminal` AS `terminal`,`bdnc`.`cuadre` AS `cuadre`,if(isnull(`bdnc`.`cuadre`),\'PENDIENTE\',if((`bdnc`.`cuadre` = \'\'),\'PENDIENTE\',\'REALIZADO\')) AS `estado`,`bdnc`.`usuario` AS `usuario`,`bdnc`.`Id` AS `factura`,`bdnc`.`reembolsar` AS `reembolsar`,\'\' AS `comprobante`,\'0\' AS `cuotaInicial2`,`bdterceros`.`id` AS `idCliente` from (`bdnc` join `bdterceros` on((`bdnc`.`cliente` = `bdterceros`.`idSistema`))) where (`bdnc`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdnc`.`Id` AS `Id`,`bdclick6`.`bdnc`.`cliente` AS `cliente`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,0 AS `efectivo`,0 AS `targeta`,0 AS `cheque`,`bdclick6`.`bdnc`.`valor` AS `nc`,`bdclick6`.`bdnc`.`anulada` AS `anulada`,0 AS `credito`,`bdclick6`.`bdnc`.`fecha` AS `fechaFactura`,`bdclick6`.`bdnc`.`valor` AS `total`,`bdclick6`.`bdnc`.`vendedor` AS `red`,0 AS `descuentos`,`bdclick6`.`bdnc`.`terminal` AS `terminal`,`bdclick6`.`bdnc`.`cuadre` AS `cuadre`,if(isnull(`bdclick6`.`bdnc`.`cuadre`),\'PENDIENTE\',if((`bdclick6`.`bdnc`.`cuadre` = \'\'),\'PENDIENTE\',\'REALIZADO\')) AS `estado`,`bdclick6`.`bdnc`.`usuario` AS `usuario`,`bdclick6`.`bdnc`.`Id` AS `factura`,`bdclick6`.`bdnc`.`reembolsar` AS `reembolsar`,\'\' AS `comprobante`,\'0\' AS `cuotaInicial2`,`bdclick6`.`bdterceros`.`id` AS `idCliente` from (`bdclick6`.`bdnc` join `bdclick6`.`bdterceros` on((`bdclick6`.`bdnc`.`cliente` = `bdclick6`.`bdterceros`.`idSistema`))) where (`bdclick6`.`bdnc`.`anulada` = 0)
mariadb-version=100135
