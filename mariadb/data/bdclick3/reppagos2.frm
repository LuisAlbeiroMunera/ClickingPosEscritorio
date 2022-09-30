TYPE=VIEW
query=select `bdclick3`.`reppagospendientes`.`idSistema` AS `idSistema`,`bdclick3`.`reppagospendientes`.`proveedor` AS `proveedor`,`bdclick3`.`reppagospendientes`.`nombre` AS `nombre`,`bdclick3`.`reppagospendientes`.`fechaFactura` AS `fechaFactura`,`bdclick3`.`reppagospendientes`.`fechaVencimiento` AS `fechaVencimiento`,if(isnull(`reppagos`.`valor`),`bdclick3`.`reppagospendientes`.`valor`,(`bdclick3`.`reppagospendientes`.`valor` - `reppagos`.`valor`)) AS `valor`,`bdclick3`.`reppagospendientes`.`tipo` AS `ingreso`,`bdclick3`.`reppagospendientes`.`total` AS `total`,`reppagos`.`direccion` AS `direccion`,`reppagos`.`telefono` AS `telefono`,if(isnull(`reppagos`.`estado`),`bdclick3`.`reppagospendientes`.`estado`,`reppagos`.`estado`) AS `estado` from (`bdclick3`.`reppagospendientes` left join `bdclick3`.`reppagos` on((`reppagos`.`ingreso` = `bdclick3`.`reppagospendientes`.`ingreso`))) group by `bdclick3`.`reppagospendientes`.`idSistema`,`bdclick3`.`reppagospendientes`.`proveedor`,`bdclick3`.`reppagospendientes`.`nombre`,`bdclick3`.`reppagospendientes`.`fechaFactura`,`bdclick3`.`reppagospendientes`.`fechaVencimiento`,if(isnull(`reppagos`.`valor`),`bdclick3`.`reppagospendientes`.`valor`,(`bdclick3`.`reppagospendientes`.`valor` - `reppagos`.`valor`)),`bdclick3`.`reppagospendientes`.`tipo`,`bdclick3`.`reppagospendientes`.`total`,`reppagos`.`direccion`,`reppagos`.`telefono`,if(isnull(`reppagos`.`estado`),`bdclick3`.`reppagospendientes`.`estado`,`reppagos`.`estado`)
md5=aa619d45fd849800e69f0d719ff07a95
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:53
create-version=2
source=select `reppagospendientes`.`idSistema` AS `idSistema`,`reppagospendientes`.`proveedor` AS `proveedor`,`reppagospendientes`.`nombre` AS `nombre`,`reppagospendientes`.`fechaFactura` AS `fechaFactura`,`reppagospendientes`.`fechaVencimiento` AS `fechaVencimiento`,if(isnull(`reppagos`.`valor`),`reppagospendientes`.`valor`,(`reppagospendientes`.`valor` - `reppagos`.`valor`)) AS `valor`,`reppagospendientes`.`tipo` AS `ingreso`,`reppagospendientes`.`total` AS `total`,`reppagos`.`direccion` AS `direccion`,`reppagos`.`telefono` AS `telefono`,if(isnull(`reppagos`.`estado`),`reppagospendientes`.`estado`,`reppagos`.`estado`) AS `estado` from (`reppagospendientes` left join `reppagos` on((`reppagos`.`ingreso` = `reppagospendientes`.`ingreso`))) group by `reppagospendientes`.`idSistema`,`reppagospendientes`.`proveedor`,`reppagospendientes`.`nombre`,`reppagospendientes`.`fechaFactura`,`reppagospendientes`.`fechaVencimiento`,if(isnull(`reppagos`.`valor`),`reppagospendientes`.`valor`,(`reppagospendientes`.`valor` - `reppagos`.`valor`)),`reppagospendientes`.`tipo`,`reppagospendientes`.`total`,`reppagos`.`direccion`,`reppagos`.`telefono`,if(isnull(`reppagos`.`estado`),`reppagospendientes`.`estado`,`reppagos`.`estado`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`reppagospendientes`.`idSistema` AS `idSistema`,`bdclick3`.`reppagospendientes`.`proveedor` AS `proveedor`,`bdclick3`.`reppagospendientes`.`nombre` AS `nombre`,`bdclick3`.`reppagospendientes`.`fechaFactura` AS `fechaFactura`,`bdclick3`.`reppagospendientes`.`fechaVencimiento` AS `fechaVencimiento`,if(isnull(`reppagos`.`valor`),`bdclick3`.`reppagospendientes`.`valor`,(`bdclick3`.`reppagospendientes`.`valor` - `reppagos`.`valor`)) AS `valor`,`bdclick3`.`reppagospendientes`.`tipo` AS `ingreso`,`bdclick3`.`reppagospendientes`.`total` AS `total`,`reppagos`.`direccion` AS `direccion`,`reppagos`.`telefono` AS `telefono`,if(isnull(`reppagos`.`estado`),`bdclick3`.`reppagospendientes`.`estado`,`reppagos`.`estado`) AS `estado` from (`bdclick3`.`reppagospendientes` left join `bdclick3`.`reppagos` on((`reppagos`.`ingreso` = `bdclick3`.`reppagospendientes`.`ingreso`))) group by `bdclick3`.`reppagospendientes`.`idSistema`,`bdclick3`.`reppagospendientes`.`proveedor`,`bdclick3`.`reppagospendientes`.`nombre`,`bdclick3`.`reppagospendientes`.`fechaFactura`,`bdclick3`.`reppagospendientes`.`fechaVencimiento`,if(isnull(`reppagos`.`valor`),`bdclick3`.`reppagospendientes`.`valor`,(`bdclick3`.`reppagospendientes`.`valor` - `reppagos`.`valor`)),`bdclick3`.`reppagospendientes`.`tipo`,`bdclick3`.`reppagospendientes`.`total`,`reppagos`.`direccion`,`reppagos`.`telefono`,if(isnull(`reppagos`.`estado`),`bdclick3`.`reppagospendientes`.`estado`,`reppagos`.`estado`)
mariadb-version=100135
