TYPE=VIEW
query=select `bdclick6`.`reppagospendientes`.`idSistema` AS `idSistema`,`bdclick6`.`reppagospendientes`.`proveedor` AS `proveedor`,`bdclick6`.`reppagospendientes`.`nombre` AS `nombre`,`bdclick6`.`reppagospendientes`.`fechaFactura` AS `fechaFactura`,`bdclick6`.`reppagospendientes`.`fechaVencimiento` AS `fechaVencimiento`,if(isnull(`reppagos`.`valor`),`bdclick6`.`reppagospendientes`.`valor`,(`bdclick6`.`reppagospendientes`.`valor` - `reppagos`.`valor`)) AS `valor`,`bdclick6`.`reppagospendientes`.`tipo` AS `ingreso`,`bdclick6`.`reppagospendientes`.`total` AS `total`,`reppagos`.`direccion` AS `direccion`,`reppagos`.`telefono` AS `telefono`,if(isnull(`reppagos`.`estado`),`bdclick6`.`reppagospendientes`.`estado`,`reppagos`.`estado`) AS `estado` from (`bdclick6`.`reppagospendientes` left join `bdclick6`.`reppagos` on((`reppagos`.`ingreso` = `bdclick6`.`reppagospendientes`.`ingreso`))) group by `bdclick6`.`reppagospendientes`.`idSistema`,`bdclick6`.`reppagospendientes`.`proveedor`,`bdclick6`.`reppagospendientes`.`nombre`,`bdclick6`.`reppagospendientes`.`fechaFactura`,`bdclick6`.`reppagospendientes`.`fechaVencimiento`,if(isnull(`reppagos`.`valor`),`bdclick6`.`reppagospendientes`.`valor`,(`bdclick6`.`reppagospendientes`.`valor` - `reppagos`.`valor`)),`bdclick6`.`reppagospendientes`.`tipo`,`bdclick6`.`reppagospendientes`.`total`,`reppagos`.`direccion`,`reppagos`.`telefono`,if(isnull(`reppagos`.`estado`),`bdclick6`.`reppagospendientes`.`estado`,`reppagos`.`estado`)
md5=229b80e380cb15f22dd894551e73743d
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:38
create-version=2
source=select `reppagospendientes`.`idSistema` AS `idSistema`,`reppagospendientes`.`proveedor` AS `proveedor`,`reppagospendientes`.`nombre` AS `nombre`,`reppagospendientes`.`fechaFactura` AS `fechaFactura`,`reppagospendientes`.`fechaVencimiento` AS `fechaVencimiento`,if(isnull(`reppagos`.`valor`),`reppagospendientes`.`valor`,(`reppagospendientes`.`valor` - `reppagos`.`valor`)) AS `valor`,`reppagospendientes`.`tipo` AS `ingreso`,`reppagospendientes`.`total` AS `total`,`reppagos`.`direccion` AS `direccion`,`reppagos`.`telefono` AS `telefono`,if(isnull(`reppagos`.`estado`),`reppagospendientes`.`estado`,`reppagos`.`estado`) AS `estado` from (`reppagospendientes` left join `reppagos` on((`reppagos`.`ingreso` = `reppagospendientes`.`ingreso`))) group by `reppagospendientes`.`idSistema`,`reppagospendientes`.`proveedor`,`reppagospendientes`.`nombre`,`reppagospendientes`.`fechaFactura`,`reppagospendientes`.`fechaVencimiento`,if(isnull(`reppagos`.`valor`),`reppagospendientes`.`valor`,(`reppagospendientes`.`valor` - `reppagos`.`valor`)),`reppagospendientes`.`tipo`,`reppagospendientes`.`total`,`reppagos`.`direccion`,`reppagos`.`telefono`,if(isnull(`reppagos`.`estado`),`reppagospendientes`.`estado`,`reppagos`.`estado`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`reppagospendientes`.`idSistema` AS `idSistema`,`bdclick6`.`reppagospendientes`.`proveedor` AS `proveedor`,`bdclick6`.`reppagospendientes`.`nombre` AS `nombre`,`bdclick6`.`reppagospendientes`.`fechaFactura` AS `fechaFactura`,`bdclick6`.`reppagospendientes`.`fechaVencimiento` AS `fechaVencimiento`,if(isnull(`reppagos`.`valor`),`bdclick6`.`reppagospendientes`.`valor`,(`bdclick6`.`reppagospendientes`.`valor` - `reppagos`.`valor`)) AS `valor`,`bdclick6`.`reppagospendientes`.`tipo` AS `ingreso`,`bdclick6`.`reppagospendientes`.`total` AS `total`,`reppagos`.`direccion` AS `direccion`,`reppagos`.`telefono` AS `telefono`,if(isnull(`reppagos`.`estado`),`bdclick6`.`reppagospendientes`.`estado`,`reppagos`.`estado`) AS `estado` from (`bdclick6`.`reppagospendientes` left join `bdclick6`.`reppagos` on((`reppagos`.`ingreso` = `bdclick6`.`reppagospendientes`.`ingreso`))) group by `bdclick6`.`reppagospendientes`.`idSistema`,`bdclick6`.`reppagospendientes`.`proveedor`,`bdclick6`.`reppagospendientes`.`nombre`,`bdclick6`.`reppagospendientes`.`fechaFactura`,`bdclick6`.`reppagospendientes`.`fechaVencimiento`,if(isnull(`reppagos`.`valor`),`bdclick6`.`reppagospendientes`.`valor`,(`bdclick6`.`reppagospendientes`.`valor` - `reppagos`.`valor`)),`bdclick6`.`reppagospendientes`.`tipo`,`bdclick6`.`reppagospendientes`.`total`,`reppagos`.`direccion`,`reppagos`.`telefono`,if(isnull(`reppagos`.`estado`),`bdclick6`.`reppagospendientes`.`estado`,`reppagos`.`estado`)
mariadb-version=100135