TYPE=VIEW
query=select `bdclick3`.`bdnc`.`Id` AS `Id`,`bdclick3`.`bdnc`.`cliente` AS `cliente`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,0 AS `efectivo`,0 AS `targeta`,0 AS `cheque`,`bdclick3`.`bdnc`.`valor` AS `nc`,`bdclick3`.`bdnc`.`anulada` AS `anulada`,0 AS `credito`,`bdclick3`.`bdnc`.`fecha` AS `fechaFactura`,`bdclick3`.`bdnc`.`valor` AS `total`,`bdclick3`.`bdnc`.`vendedor` AS `red`,0 AS `descuentos`,`bdclick3`.`bdnc`.`terminal` AS `terminal`,`bdclick3`.`bdnc`.`cuadre` AS `cuadre`,if(isnull(`bdclick3`.`bdnc`.`cuadre`),\'PENDIENTE\',if((`bdclick3`.`bdnc`.`cuadre` = \'\'),\'PENDIENTE\',\'REALIZADO\')) AS `estado`,`bdclick3`.`bdnc`.`usuario` AS `usuario`,`bdclick3`.`bdnc`.`Id` AS `factura`,`bdclick3`.`bdnc`.`reembolsar` AS `reembolsar`,\'\' AS `comprobante`,\'0\' AS `cuotaInicial2`,`bdclick3`.`bdterceros`.`id` AS `idCliente` from (`bdclick3`.`bdnc` join `bdclick3`.`bdterceros` on((`bdclick3`.`bdnc`.`cliente` = `bdclick3`.`bdterceros`.`idSistema`))) where (`bdclick3`.`bdnc`.`anulada` = 0)
md5=85fd7e92238a17f2a92a358c51e91dff
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:51
create-version=2
source=select `bdnc`.`Id` AS `Id`,`bdnc`.`cliente` AS `cliente`,`bdterceros`.`nombre` AS `nombre`,0 AS `efectivo`,0 AS `targeta`,0 AS `cheque`,`bdnc`.`valor` AS `nc`,`bdnc`.`anulada` AS `anulada`,0 AS `credito`,`bdnc`.`fecha` AS `fechaFactura`,`bdnc`.`valor` AS `total`,`bdnc`.`vendedor` AS `red`,0 AS `descuentos`,`bdnc`.`terminal` AS `terminal`,`bdnc`.`cuadre` AS `cuadre`,if(isnull(`bdnc`.`cuadre`),\'PENDIENTE\',if((`bdnc`.`cuadre` = \'\'),\'PENDIENTE\',\'REALIZADO\')) AS `estado`,`bdnc`.`usuario` AS `usuario`,`bdnc`.`Id` AS `factura`,`bdnc`.`reembolsar` AS `reembolsar`,\'\' AS `comprobante`,\'0\' AS `cuotaInicial2`,`bdterceros`.`id` AS `idCliente` from (`bdnc` join `bdterceros` on((`bdnc`.`cliente` = `bdterceros`.`idSistema`))) where (`bdnc`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdnc`.`Id` AS `Id`,`bdclick3`.`bdnc`.`cliente` AS `cliente`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,0 AS `efectivo`,0 AS `targeta`,0 AS `cheque`,`bdclick3`.`bdnc`.`valor` AS `nc`,`bdclick3`.`bdnc`.`anulada` AS `anulada`,0 AS `credito`,`bdclick3`.`bdnc`.`fecha` AS `fechaFactura`,`bdclick3`.`bdnc`.`valor` AS `total`,`bdclick3`.`bdnc`.`vendedor` AS `red`,0 AS `descuentos`,`bdclick3`.`bdnc`.`terminal` AS `terminal`,`bdclick3`.`bdnc`.`cuadre` AS `cuadre`,if(isnull(`bdclick3`.`bdnc`.`cuadre`),\'PENDIENTE\',if((`bdclick3`.`bdnc`.`cuadre` = \'\'),\'PENDIENTE\',\'REALIZADO\')) AS `estado`,`bdclick3`.`bdnc`.`usuario` AS `usuario`,`bdclick3`.`bdnc`.`Id` AS `factura`,`bdclick3`.`bdnc`.`reembolsar` AS `reembolsar`,\'\' AS `comprobante`,\'0\' AS `cuotaInicial2`,`bdclick3`.`bdterceros`.`id` AS `idCliente` from (`bdclick3`.`bdnc` join `bdclick3`.`bdterceros` on((`bdclick3`.`bdnc`.`cliente` = `bdclick3`.`bdterceros`.`idSistema`))) where (`bdclick3`.`bdnc`.`anulada` = 0)
mariadb-version=100135
