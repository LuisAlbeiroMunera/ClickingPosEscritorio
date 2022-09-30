TYPE=VIEW
query=select `bdclick5`.`reppagospendientes`.`idSistema` AS `idSistema`,`bdclick5`.`reppagospendientes`.`proveedor` AS `proveedor`,`bdclick5`.`reppagospendientes`.`nombre` AS `nombre`,`bdclick5`.`reppagospendientes`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`reppagospendientes`.`fechaVencimiento` AS `fechaVencimiento`,if(isnull(`reppagos`.`valor`),`bdclick5`.`reppagospendientes`.`valor`,(`bdclick5`.`reppagospendientes`.`valor` - `reppagos`.`valor`)) AS `valor`,`bdclick5`.`reppagospendientes`.`tipo` AS `ingreso`,`bdclick5`.`reppagospendientes`.`total` AS `total`,`reppagos`.`direccion` AS `direccion`,`reppagos`.`telefono` AS `telefono`,if(isnull(`reppagos`.`estado`),`bdclick5`.`reppagospendientes`.`estado`,`reppagos`.`estado`) AS `estado` from (`bdclick5`.`reppagospendientes` left join `bdclick5`.`reppagos` on((`reppagos`.`ingreso` = `bdclick5`.`reppagospendientes`.`ingreso`))) group by `bdclick5`.`reppagospendientes`.`idSistema`,`bdclick5`.`reppagospendientes`.`proveedor`,`bdclick5`.`reppagospendientes`.`nombre`,`bdclick5`.`reppagospendientes`.`fechaFactura`,`bdclick5`.`reppagospendientes`.`fechaVencimiento`,if(isnull(`reppagos`.`valor`),`bdclick5`.`reppagospendientes`.`valor`,(`bdclick5`.`reppagospendientes`.`valor` - `reppagos`.`valor`)),`bdclick5`.`reppagospendientes`.`tipo`,`bdclick5`.`reppagospendientes`.`total`,`reppagos`.`direccion`,`reppagos`.`telefono`,if(isnull(`reppagos`.`estado`),`bdclick5`.`reppagospendientes`.`estado`,`reppagos`.`estado`)
md5=beded6cb061cb37121ad7535e6c9a99b
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:50
create-version=2
source=select `reppagospendientes`.`idSistema` AS `idSistema`,`reppagospendientes`.`proveedor` AS `proveedor`,`reppagospendientes`.`nombre` AS `nombre`,`reppagospendientes`.`fechaFactura` AS `fechaFactura`,`reppagospendientes`.`fechaVencimiento` AS `fechaVencimiento`,if(isnull(`reppagos`.`valor`),`reppagospendientes`.`valor`,(`reppagospendientes`.`valor` - `reppagos`.`valor`)) AS `valor`,`reppagospendientes`.`tipo` AS `ingreso`,`reppagospendientes`.`total` AS `total`,`reppagos`.`direccion` AS `direccion`,`reppagos`.`telefono` AS `telefono`,if(isnull(`reppagos`.`estado`),`reppagospendientes`.`estado`,`reppagos`.`estado`) AS `estado` from (`reppagospendientes` left join `reppagos` on((`reppagos`.`ingreso` = `reppagospendientes`.`ingreso`))) group by `reppagospendientes`.`idSistema`,`reppagospendientes`.`proveedor`,`reppagospendientes`.`nombre`,`reppagospendientes`.`fechaFactura`,`reppagospendientes`.`fechaVencimiento`,if(isnull(`reppagos`.`valor`),`reppagospendientes`.`valor`,(`reppagospendientes`.`valor` - `reppagos`.`valor`)),`reppagospendientes`.`tipo`,`reppagospendientes`.`total`,`reppagos`.`direccion`,`reppagos`.`telefono`,if(isnull(`reppagos`.`estado`),`reppagospendientes`.`estado`,`reppagos`.`estado`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`reppagospendientes`.`idSistema` AS `idSistema`,`bdclick5`.`reppagospendientes`.`proveedor` AS `proveedor`,`bdclick5`.`reppagospendientes`.`nombre` AS `nombre`,`bdclick5`.`reppagospendientes`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`reppagospendientes`.`fechaVencimiento` AS `fechaVencimiento`,if(isnull(`reppagos`.`valor`),`bdclick5`.`reppagospendientes`.`valor`,(`bdclick5`.`reppagospendientes`.`valor` - `reppagos`.`valor`)) AS `valor`,`bdclick5`.`reppagospendientes`.`tipo` AS `ingreso`,`bdclick5`.`reppagospendientes`.`total` AS `total`,`reppagos`.`direccion` AS `direccion`,`reppagos`.`telefono` AS `telefono`,if(isnull(`reppagos`.`estado`),`bdclick5`.`reppagospendientes`.`estado`,`reppagos`.`estado`) AS `estado` from (`bdclick5`.`reppagospendientes` left join `bdclick5`.`reppagos` on((`reppagos`.`ingreso` = `bdclick5`.`reppagospendientes`.`ingreso`))) group by `bdclick5`.`reppagospendientes`.`idSistema`,`bdclick5`.`reppagospendientes`.`proveedor`,`bdclick5`.`reppagospendientes`.`nombre`,`bdclick5`.`reppagospendientes`.`fechaFactura`,`bdclick5`.`reppagospendientes`.`fechaVencimiento`,if(isnull(`reppagos`.`valor`),`bdclick5`.`reppagospendientes`.`valor`,(`bdclick5`.`reppagospendientes`.`valor` - `reppagos`.`valor`)),`bdclick5`.`reppagospendientes`.`tipo`,`bdclick5`.`reppagospendientes`.`total`,`reppagos`.`direccion`,`reppagos`.`telefono`,if(isnull(`reppagos`.`estado`),`bdclick5`.`reppagospendientes`.`estado`,`reppagos`.`estado`)
mariadb-version=100135