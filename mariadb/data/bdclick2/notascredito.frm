TYPE=VIEW
query=select `bdclick2`.`bdnc`.`Id` AS `Id`,`bdclick2`.`bdnc`.`cliente` AS `cliente`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,0 AS `efectivo`,0 AS `targeta`,0 AS `cheque`,`bdclick2`.`bdnc`.`valor` AS `nc`,`bdclick2`.`bdnc`.`anulada` AS `anulada`,0 AS `credito`,`bdclick2`.`bdnc`.`fecha` AS `fechaFactura`,`bdclick2`.`bdnc`.`valor` AS `total`,`bdclick2`.`bdnc`.`vendedor` AS `red`,0 AS `descuentos`,`bdclick2`.`bdnc`.`terminal` AS `terminal`,`bdclick2`.`bdnc`.`cuadre` AS `cuadre`,if(isnull(`bdclick2`.`bdnc`.`cuadre`),\'PENDIENTE\',if((`bdclick2`.`bdnc`.`cuadre` = \'\'),\'PENDIENTE\',\'REALIZADO\')) AS `estado`,`bdclick2`.`bdnc`.`usuario` AS `usuario`,`bdclick2`.`bdnc`.`Id` AS `factura`,`bdclick2`.`bdnc`.`reembolsar` AS `reembolsar`,\'\' AS `comprobante`,\'0\' AS `cuotaInicial2`,`bdclick2`.`bdterceros`.`id` AS `idCliente` from (`bdclick2`.`bdnc` join `bdclick2`.`bdterceros` on((`bdclick2`.`bdnc`.`cliente` = `bdclick2`.`bdterceros`.`idSistema`))) where (`bdclick2`.`bdnc`.`anulada` = 0)
md5=88d448105550742f449ae7e058bc0a96
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:46
create-version=2
source=select `bdnc`.`Id` AS `Id`,`bdnc`.`cliente` AS `cliente`,`bdterceros`.`nombre` AS `nombre`,0 AS `efectivo`,0 AS `targeta`,0 AS `cheque`,`bdnc`.`valor` AS `nc`,`bdnc`.`anulada` AS `anulada`,0 AS `credito`,`bdnc`.`fecha` AS `fechaFactura`,`bdnc`.`valor` AS `total`,`bdnc`.`vendedor` AS `red`,0 AS `descuentos`,`bdnc`.`terminal` AS `terminal`,`bdnc`.`cuadre` AS `cuadre`,if(isnull(`bdnc`.`cuadre`),\'PENDIENTE\',if((`bdnc`.`cuadre` = \'\'),\'PENDIENTE\',\'REALIZADO\')) AS `estado`,`bdnc`.`usuario` AS `usuario`,`bdnc`.`Id` AS `factura`,`bdnc`.`reembolsar` AS `reembolsar`,\'\' AS `comprobante`,\'0\' AS `cuotaInicial2`,`bdterceros`.`id` AS `idCliente` from (`bdnc` join `bdterceros` on((`bdnc`.`cliente` = `bdterceros`.`idSistema`))) where (`bdnc`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdnc`.`Id` AS `Id`,`bdclick2`.`bdnc`.`cliente` AS `cliente`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,0 AS `efectivo`,0 AS `targeta`,0 AS `cheque`,`bdclick2`.`bdnc`.`valor` AS `nc`,`bdclick2`.`bdnc`.`anulada` AS `anulada`,0 AS `credito`,`bdclick2`.`bdnc`.`fecha` AS `fechaFactura`,`bdclick2`.`bdnc`.`valor` AS `total`,`bdclick2`.`bdnc`.`vendedor` AS `red`,0 AS `descuentos`,`bdclick2`.`bdnc`.`terminal` AS `terminal`,`bdclick2`.`bdnc`.`cuadre` AS `cuadre`,if(isnull(`bdclick2`.`bdnc`.`cuadre`),\'PENDIENTE\',if((`bdclick2`.`bdnc`.`cuadre` = \'\'),\'PENDIENTE\',\'REALIZADO\')) AS `estado`,`bdclick2`.`bdnc`.`usuario` AS `usuario`,`bdclick2`.`bdnc`.`Id` AS `factura`,`bdclick2`.`bdnc`.`reembolsar` AS `reembolsar`,\'\' AS `comprobante`,\'0\' AS `cuotaInicial2`,`bdclick2`.`bdterceros`.`id` AS `idCliente` from (`bdclick2`.`bdnc` join `bdclick2`.`bdterceros` on((`bdclick2`.`bdnc`.`cliente` = `bdclick2`.`bdterceros`.`idSistema`))) where (`bdclick2`.`bdnc`.`anulada` = 0)
mariadb-version=100135
