TYPE=VIEW
query=select `bdclick5`.`bdnc`.`Id` AS `Id`,`bdclick5`.`bdnc`.`cliente` AS `cliente`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,0 AS `efectivo`,0 AS `targeta`,0 AS `cheque`,`bdclick5`.`bdnc`.`valor` AS `nc`,`bdclick5`.`bdnc`.`anulada` AS `anulada`,0 AS `credito`,`bdclick5`.`bdnc`.`fecha` AS `fechaFactura`,`bdclick5`.`bdnc`.`valor` AS `total`,`bdclick5`.`bdnc`.`vendedor` AS `red`,0 AS `descuentos`,`bdclick5`.`bdnc`.`terminal` AS `terminal`,`bdclick5`.`bdnc`.`cuadre` AS `cuadre`,if(isnull(`bdclick5`.`bdnc`.`cuadre`),\'PENDIENTE\',if((`bdclick5`.`bdnc`.`cuadre` = \'\'),\'PENDIENTE\',\'REALIZADO\')) AS `estado`,`bdclick5`.`bdnc`.`usuario` AS `usuario`,`bdclick5`.`bdnc`.`Id` AS `factura`,`bdclick5`.`bdnc`.`reembolsar` AS `reembolsar`,\'\' AS `comprobante`,\'0\' AS `cuotaInicial2`,`bdclick5`.`bdterceros`.`id` AS `idCliente` from (`bdclick5`.`bdnc` join `bdclick5`.`bdterceros` on((`bdclick5`.`bdnc`.`cliente` = `bdclick5`.`bdterceros`.`idSistema`))) where (`bdclick5`.`bdnc`.`anulada` = 0)
md5=6b00de13e4df3d1957f1d56d469b42fc
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:47
create-version=2
source=select `bdnc`.`Id` AS `Id`,`bdnc`.`cliente` AS `cliente`,`bdterceros`.`nombre` AS `nombre`,0 AS `efectivo`,0 AS `targeta`,0 AS `cheque`,`bdnc`.`valor` AS `nc`,`bdnc`.`anulada` AS `anulada`,0 AS `credito`,`bdnc`.`fecha` AS `fechaFactura`,`bdnc`.`valor` AS `total`,`bdnc`.`vendedor` AS `red`,0 AS `descuentos`,`bdnc`.`terminal` AS `terminal`,`bdnc`.`cuadre` AS `cuadre`,if(isnull(`bdnc`.`cuadre`),\'PENDIENTE\',if((`bdnc`.`cuadre` = \'\'),\'PENDIENTE\',\'REALIZADO\')) AS `estado`,`bdnc`.`usuario` AS `usuario`,`bdnc`.`Id` AS `factura`,`bdnc`.`reembolsar` AS `reembolsar`,\'\' AS `comprobante`,\'0\' AS `cuotaInicial2`,`bdterceros`.`id` AS `idCliente` from (`bdnc` join `bdterceros` on((`bdnc`.`cliente` = `bdterceros`.`idSistema`))) where (`bdnc`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdnc`.`Id` AS `Id`,`bdclick5`.`bdnc`.`cliente` AS `cliente`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,0 AS `efectivo`,0 AS `targeta`,0 AS `cheque`,`bdclick5`.`bdnc`.`valor` AS `nc`,`bdclick5`.`bdnc`.`anulada` AS `anulada`,0 AS `credito`,`bdclick5`.`bdnc`.`fecha` AS `fechaFactura`,`bdclick5`.`bdnc`.`valor` AS `total`,`bdclick5`.`bdnc`.`vendedor` AS `red`,0 AS `descuentos`,`bdclick5`.`bdnc`.`terminal` AS `terminal`,`bdclick5`.`bdnc`.`cuadre` AS `cuadre`,if(isnull(`bdclick5`.`bdnc`.`cuadre`),\'PENDIENTE\',if((`bdclick5`.`bdnc`.`cuadre` = \'\'),\'PENDIENTE\',\'REALIZADO\')) AS `estado`,`bdclick5`.`bdnc`.`usuario` AS `usuario`,`bdclick5`.`bdnc`.`Id` AS `factura`,`bdclick5`.`bdnc`.`reembolsar` AS `reembolsar`,\'\' AS `comprobante`,\'0\' AS `cuotaInicial2`,`bdclick5`.`bdterceros`.`id` AS `idCliente` from (`bdclick5`.`bdnc` join `bdclick5`.`bdterceros` on((`bdclick5`.`bdnc`.`cliente` = `bdclick5`.`bdterceros`.`idSistema`))) where (`bdclick5`.`bdnc`.`anulada` = 0)
mariadb-version=100135
