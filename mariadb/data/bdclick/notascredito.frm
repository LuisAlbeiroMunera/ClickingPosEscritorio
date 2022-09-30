TYPE=VIEW
query=select `bdclick`.`bdnc`.`Id` AS `Id`,`bdclick`.`bdnc`.`cliente` AS `cliente`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,0 AS `efectivo`,0 AS `targeta`,0 AS `cheque`,`bdclick`.`bdnc`.`valor` AS `nc`,`bdclick`.`bdnc`.`anulada` AS `anulada`,0 AS `credito`,`bdclick`.`bdnc`.`fecha` AS `fechaFactura`,`bdclick`.`bdnc`.`valor` AS `total`,`bdclick`.`bdnc`.`vendedor` AS `red`,0 AS `descuentos`,`bdclick`.`bdnc`.`terminal` AS `terminal`,`bdclick`.`bdnc`.`cuadre` AS `cuadre`,if(isnull(`bdclick`.`bdnc`.`cuadre`),\'PENDIENTE\',if((`bdclick`.`bdnc`.`cuadre` = \'\'),\'PENDIENTE\',\'REALIZADO\')) AS `estado`,`bdclick`.`bdnc`.`usuario` AS `usuario`,`bdclick`.`bdnc`.`Id` AS `factura`,`bdclick`.`bdnc`.`reembolsar` AS `reembolsar`,\'\' AS `comprobante`,\'0\' AS `cuotaInicial2`,`bdclick`.`bdterceros`.`id` AS `idCliente` from (`bdclick`.`bdnc` join `bdclick`.`bdterceros` on((`bdclick`.`bdnc`.`cliente` = `bdclick`.`bdterceros`.`idSistema`))) where (`bdclick`.`bdnc`.`anulada` = 0)
md5=60b20dd6078245298822be62d338f827
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:25
create-version=2
source=select `bdnc`.`Id` AS `Id`,`bdnc`.`cliente` AS `cliente`,`bdterceros`.`nombre` AS `nombre`,0 AS `efectivo`,0 AS `targeta`,0 AS `cheque`,`bdnc`.`valor` AS `nc`,`bdnc`.`anulada` AS `anulada`,0 AS `credito`,`bdnc`.`fecha` AS `fechaFactura`,`bdnc`.`valor` AS `total`,`bdnc`.`vendedor` AS `red`,0 AS `descuentos`,`bdnc`.`terminal` AS `terminal`,`bdnc`.`cuadre` AS `cuadre`,if(isnull(`bdnc`.`cuadre`),\'PENDIENTE\',if((`bdnc`.`cuadre` = \'\'),\'PENDIENTE\',\'REALIZADO\')) AS `estado`,`bdnc`.`usuario` AS `usuario`,`bdnc`.`Id` AS `factura`,`bdnc`.`reembolsar` AS `reembolsar`,\'\' AS `comprobante`,\'0\' AS `cuotaInicial2`,`bdterceros`.`id` AS `idCliente` from (`bdnc` join `bdterceros` on((`bdnc`.`cliente` = `bdterceros`.`idSistema`))) where (`bdnc`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdnc`.`Id` AS `Id`,`bdclick`.`bdnc`.`cliente` AS `cliente`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,0 AS `efectivo`,0 AS `targeta`,0 AS `cheque`,`bdclick`.`bdnc`.`valor` AS `nc`,`bdclick`.`bdnc`.`anulada` AS `anulada`,0 AS `credito`,`bdclick`.`bdnc`.`fecha` AS `fechaFactura`,`bdclick`.`bdnc`.`valor` AS `total`,`bdclick`.`bdnc`.`vendedor` AS `red`,0 AS `descuentos`,`bdclick`.`bdnc`.`terminal` AS `terminal`,`bdclick`.`bdnc`.`cuadre` AS `cuadre`,if(isnull(`bdclick`.`bdnc`.`cuadre`),\'PENDIENTE\',if((`bdclick`.`bdnc`.`cuadre` = \'\'),\'PENDIENTE\',\'REALIZADO\')) AS `estado`,`bdclick`.`bdnc`.`usuario` AS `usuario`,`bdclick`.`bdnc`.`Id` AS `factura`,`bdclick`.`bdnc`.`reembolsar` AS `reembolsar`,\'\' AS `comprobante`,\'0\' AS `cuotaInicial2`,`bdclick`.`bdterceros`.`id` AS `idCliente` from (`bdclick`.`bdnc` join `bdclick`.`bdterceros` on((`bdclick`.`bdnc`.`cliente` = `bdclick`.`bdterceros`.`idSistema`))) where (`bdclick`.`bdnc`.`anulada` = 0)
mariadb-version=100135
