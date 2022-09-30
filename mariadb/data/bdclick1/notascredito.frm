TYPE=VIEW
query=select `bdclick1`.`bdnc`.`Id` AS `Id`,`bdclick1`.`bdnc`.`cliente` AS `cliente`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,0 AS `efectivo`,0 AS `targeta`,0 AS `cheque`,`bdclick1`.`bdnc`.`valor` AS `nc`,`bdclick1`.`bdnc`.`anulada` AS `anulada`,0 AS `credito`,`bdclick1`.`bdnc`.`fecha` AS `fechaFactura`,`bdclick1`.`bdnc`.`valor` AS `total`,`bdclick1`.`bdnc`.`vendedor` AS `red`,0 AS `descuentos`,`bdclick1`.`bdnc`.`terminal` AS `terminal`,`bdclick1`.`bdnc`.`cuadre` AS `cuadre`,if(isnull(`bdclick1`.`bdnc`.`cuadre`),\'PENDIENTE\',if((`bdclick1`.`bdnc`.`cuadre` = \'\'),\'PENDIENTE\',\'REALIZADO\')) AS `estado`,`bdclick1`.`bdnc`.`usuario` AS `usuario`,`bdclick1`.`bdnc`.`Id` AS `factura`,`bdclick1`.`bdnc`.`reembolsar` AS `reembolsar`,\'\' AS `comprobante`,\'0\' AS `cuotaInicial2`,`bdclick1`.`bdterceros`.`id` AS `idCliente` from (`bdclick1`.`bdnc` join `bdclick1`.`bdterceros` on((`bdclick1`.`bdnc`.`cliente` = `bdclick1`.`bdterceros`.`idSistema`))) where (`bdclick1`.`bdnc`.`anulada` = 0)
md5=a915a5c474fa56ddb6f0598704054c42
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:35
create-version=2
source=select `bdnc`.`Id` AS `Id`,`bdnc`.`cliente` AS `cliente`,`bdterceros`.`nombre` AS `nombre`,0 AS `efectivo`,0 AS `targeta`,0 AS `cheque`,`bdnc`.`valor` AS `nc`,`bdnc`.`anulada` AS `anulada`,0 AS `credito`,`bdnc`.`fecha` AS `fechaFactura`,`bdnc`.`valor` AS `total`,`bdnc`.`vendedor` AS `red`,0 AS `descuentos`,`bdnc`.`terminal` AS `terminal`,`bdnc`.`cuadre` AS `cuadre`,if(isnull(`bdnc`.`cuadre`),\'PENDIENTE\',if((`bdnc`.`cuadre` = \'\'),\'PENDIENTE\',\'REALIZADO\')) AS `estado`,`bdnc`.`usuario` AS `usuario`,`bdnc`.`Id` AS `factura`,`bdnc`.`reembolsar` AS `reembolsar`,\'\' AS `comprobante`,\'0\' AS `cuotaInicial2`,`bdterceros`.`id` AS `idCliente` from (`bdnc` join `bdterceros` on((`bdnc`.`cliente` = `bdterceros`.`idSistema`))) where (`bdnc`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdnc`.`Id` AS `Id`,`bdclick1`.`bdnc`.`cliente` AS `cliente`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,0 AS `efectivo`,0 AS `targeta`,0 AS `cheque`,`bdclick1`.`bdnc`.`valor` AS `nc`,`bdclick1`.`bdnc`.`anulada` AS `anulada`,0 AS `credito`,`bdclick1`.`bdnc`.`fecha` AS `fechaFactura`,`bdclick1`.`bdnc`.`valor` AS `total`,`bdclick1`.`bdnc`.`vendedor` AS `red`,0 AS `descuentos`,`bdclick1`.`bdnc`.`terminal` AS `terminal`,`bdclick1`.`bdnc`.`cuadre` AS `cuadre`,if(isnull(`bdclick1`.`bdnc`.`cuadre`),\'PENDIENTE\',if((`bdclick1`.`bdnc`.`cuadre` = \'\'),\'PENDIENTE\',\'REALIZADO\')) AS `estado`,`bdclick1`.`bdnc`.`usuario` AS `usuario`,`bdclick1`.`bdnc`.`Id` AS `factura`,`bdclick1`.`bdnc`.`reembolsar` AS `reembolsar`,\'\' AS `comprobante`,\'0\' AS `cuotaInicial2`,`bdclick1`.`bdterceros`.`id` AS `idCliente` from (`bdclick1`.`bdnc` join `bdclick1`.`bdterceros` on((`bdclick1`.`bdnc`.`cliente` = `bdclick1`.`bdterceros`.`idSistema`))) where (`bdclick1`.`bdnc`.`anulada` = 0)
mariadb-version=100135
