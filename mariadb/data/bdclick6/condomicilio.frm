TYPE=VIEW
query=(select `bdclick6`.`bdverificadorfacturas`.`factura` AS `facturaTerm`,`bdclick6`.`bdcxc`.`factura` AS `factura`,`bdclick6`.`bdcxc`.`tipo` AS `tipo`,`bdclick6`.`bdcxc`.`estado` AS `estado`,`bdclick6`.`bdverificadorfacturas`.`cliente` AS `cliente1`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdverificadorfacturas`.`fechaFactura` AS `fechaFactura`,`bdclick6`.`bdverificadorfacturas`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick6`.`bdcxc`.`valor` AS `valor`,`bdclick6`.`bdverificadorfacturas`.`anulada` AS `anulada`,`bdclick6`.`bdverificadorfacturas`.`fechaAlerta` AS `fechaAlerta`,if(((cast(now() as date) >= `bdclick6`.`bdverificadorfacturas`.`fechaAlerta`) and (cast(now() as date) < `bdclick6`.`bdverificadorfacturas`.`fechaVencimiento`)),\'ALERTA\',if((cast(now() as date) >= `bdclick6`.`bdverificadorfacturas`.`fechaVencimiento`),\'VENCIDA\',\'OK\')) AS `estadoVencimiento`,if(((cast(now() as date) >= `bdclick6`.`bdverificadorfacturas`.`fechaAlerta`) and (cast(now() as date) < `bdclick6`.`bdverificadorfacturas`.`fechaVencimiento`)),\'2\',if((cast(now() as date) >= `bdclick6`.`bdverificadorfacturas`.`fechaVencimiento`),\'1\',\'3\')) AS `orden`,`bdclick6`.`bdverificadorfacturas`.`terminal` AS `terminal`,`bdclick6`.`bdcxc`.`cuotas` AS `cuotas`,if(isnull(`bdclick6`.`repcartera`.`valor`),`bdclick6`.`bdcxc`.`valor`,(`bdclick6`.`bdcxc`.`valor` - `bdclick6`.`repcartera`.`valor`)) AS `saldo`,cast(substr(`bdclick6`.`bdverificadorfacturas`.`idFactura`,6,100) as signed) AS `ordenId`,cast((`bdclick6`.`bdverificadorfacturas`.`fechaVencimiento` - cast(now() as date)) as signed) AS `edadCartera`,`bdclick6`.`bdverificadorfacturas`.`turno` AS `turno`,`bdclick6`.`bdverificadorfacturas`.`vendedor` AS `vendedor`,`bdclick6`.`bdverificadorfacturas`.`consecutivo` AS `consecutivo`,`bdclick6`.`bdterceros`.`id` AS `cliente` from (((`bdclick6`.`bdverificadorfacturas` left join `bdclick6`.`repcartera` on((`bdclick6`.`repcartera`.`fact` = `bdclick6`.`bdverificadorfacturas`.`factura`))) left join `bdclick6`.`bdcxc` on((`bdclick6`.`bdcxc`.`factura2` = `bdclick6`.`bdverificadorfacturas`.`factura`))) left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdverificadorfacturas`.`cliente` = `bdclick6`.`bdterceros`.`idSistema`))) group by `bdclick6`.`bdverificadorfacturas`.`factura`,`bdclick6`.`bdcxc`.`factura`,`bdclick6`.`bdcxc`.`tipo`,`bdclick6`.`bdcxc`.`estado`,`bdclick6`.`bdverificadorfacturas`.`cliente`,`bdclick6`.`bdterceros`.`nombre`,`bdclick6`.`bdverificadorfacturas`.`fechaFactura`,`bdclick6`.`bdverificadorfacturas`.`fechaVencimiento`,`bdclick6`.`bdcxc`.`valor`,`bdclick6`.`bdverificadorfacturas`.`anulada`,`bdclick6`.`bdverificadorfacturas`.`fechaAlerta`,if(((cast(now() as date) >= `bdclick6`.`bdverificadorfacturas`.`fechaAlerta`) and (cast(now() as date) < `bdclick6`.`bdverificadorfacturas`.`fechaVencimiento`)),\'ALERTA\',if((cast(now() as date) >= `bdclick6`.`bdverificadorfacturas`.`fechaVencimiento`),\'VENCIDA\',\'OK\')),if(((cast(now() as date) >= `bdclick6`.`bdverificadorfacturas`.`fechaAlerta`) and (cast(now() as date) < `bdclick6`.`bdverificadorfacturas`.`fechaVencimiento`)),\'2\',if((cast(now() as date) >= `bdclick6`.`bdverificadorfacturas`.`fechaVencimiento`),\'1\',\'3\')),`bdclick6`.`bdverificadorfacturas`.`terminal`,`bdclick6`.`bdcxc`.`cuotas`,if(isnull(`bdclick6`.`repcartera`.`valor`),`bdclick6`.`bdcxc`.`valor`,(`bdclick6`.`bdcxc`.`valor` - `bdclick6`.`repcartera`.`valor`)),cast(substr(`bdclick6`.`bdverificadorfacturas`.`idFactura`,6,100) as signed),cast((`bdclick6`.`bdverificadorfacturas`.`fechaVencimiento` - cast(now() as date)) as signed),`bdclick6`.`bdverificadorfacturas`.`turno`,`bdclick6`.`bdverificadorfacturas`.`vendedor`,`bdclick6`.`bdverificadorfacturas`.`consecutivo`,`bdclick6`.`bdterceros`.`id` having ((`bdclick6`.`bdcxc`.`factura` <> \'0\') and (`bdclick6`.`bdcxc`.`tipo` = \'FACT\') and (`bdclick6`.`bdcxc`.`estado` = \'PEND\') and (`bdclick6`.`bdverificadorfacturas`.`anulada` = 0) and (`bdclick6`.`bdverificadorfacturas`.`consecutivo` = \'DOMICILIO\')) order by cast(substr(`bdclick6`.`bdverificadorfacturas`.`idFactura`,6,100) as signed))
md5=9318fe07f889b50ff1ec579e669ff9fd
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:33
create-version=2
source=(select `bdverificadorfacturas`.`factura` AS `facturaTerm`,`bdcxc`.`factura` AS `factura`,`bdcxc`.`tipo` AS `tipo`,`bdcxc`.`estado` AS `estado`,`bdverificadorfacturas`.`cliente` AS `cliente1`,`bdterceros`.`nombre` AS `nombre`,`bdverificadorfacturas`.`fechaFactura` AS `fechaFactura`,`bdverificadorfacturas`.`fechaVencimiento` AS `fechaVencimiento`,`bdcxc`.`valor` AS `valor`,`bdverificadorfacturas`.`anulada` AS `anulada`,`bdverificadorfacturas`.`fechaAlerta` AS `fechaAlerta`,if(((cast(now() as date) >= `bdverificadorfacturas`.`fechaAlerta`) and (cast(now() as date) < `bdverificadorfacturas`.`fechaVencimiento`)),\'ALERTA\',if((cast(now() as date) >= `bdverificadorfacturas`.`fechaVencimiento`),\'VENCIDA\',\'OK\')) AS `estadoVencimiento`,if(((cast(now() as date) >= `bdverificadorfacturas`.`fechaAlerta`) and (cast(now() as date) < `bdverificadorfacturas`.`fechaVencimiento`)),\'2\',if((cast(now() as date) >= `bdverificadorfacturas`.`fechaVencimiento`),\'1\',\'3\')) AS `orden`,`bdverificadorfacturas`.`terminal` AS `terminal`,`bdcxc`.`cuotas` AS `cuotas`,if(isnull(`repcartera`.`valor`),`bdcxc`.`valor`,(`bdcxc`.`valor` - `repcartera`.`valor`)) AS `saldo`,cast(substr(`bdverificadorfacturas`.`idFactura`,6,100) as signed) AS `ordenId`,cast((`bdverificadorfacturas`.`fechaVencimiento` - cast(now() as date)) as signed) AS `edadCartera`,`bdverificadorfacturas`.`turno` AS `turno`,`bdverificadorfacturas`.`vendedor` AS `vendedor`,`bdverificadorfacturas`.`consecutivo` AS `consecutivo`,`bdterceros`.`id` AS `cliente` from (((`bdverificadorfacturas` left join `repcartera` on((`repcartera`.`fact` = `bdverificadorfacturas`.`factura`))) left join `bdcxc` on((`bdcxc`.`factura2` = `bdverificadorfacturas`.`factura`))) left join `bdterceros` on((`bdverificadorfacturas`.`cliente` = `bdterceros`.`idSistema`))) group by `bdverificadorfacturas`.`factura`,`bdcxc`.`factura`,`bdcxc`.`tipo`,`bdcxc`.`estado`,`bdverificadorfacturas`.`cliente`,`bdterceros`.`nombre`,`bdverificadorfacturas`.`fechaFactura`,`bdverificadorfacturas`.`fechaVencimiento`,`bdcxc`.`valor`,`bdverificadorfacturas`.`anulada`,`bdverificadorfacturas`.`fechaAlerta`,if(((cast(now() as date) >= `bdverificadorfacturas`.`fechaAlerta`) and (cast(now() as date) < `bdverificadorfacturas`.`fechaVencimiento`)),\'ALERTA\',if((cast(now() as date) >= `bdverificadorfacturas`.`fechaVencimiento`),\'VENCIDA\',\'OK\')),if(((cast(now() as date) >= `bdverificadorfacturas`.`fechaAlerta`) and (cast(now() as date) < `bdverificadorfacturas`.`fechaVencimiento`)),\'2\',if((cast(now() as date) >= `bdverificadorfacturas`.`fechaVencimiento`),\'1\',\'3\')),`bdverificadorfacturas`.`terminal`,`bdcxc`.`cuotas`,if(isnull(`repcartera`.`valor`),`bdcxc`.`valor`,(`bdcxc`.`valor` - `repcartera`.`valor`)),cast(substr(`bdverificadorfacturas`.`idFactura`,6,100) as signed),cast((`bdverificadorfacturas`.`fechaVencimiento` - cast(now() as date)) as signed),`bdverificadorfacturas`.`turno`,`bdverificadorfacturas`.`vendedor`,`bdverificadorfacturas`.`consecutivo`,`bdterceros`.`id` having ((`bdcxc`.`factura` <> \'0\') and (`bdcxc`.`tipo` = \'FACT\') and (`bdcxc`.`estado` = \'PEND\') and (`bdverificadorfacturas`.`anulada` = 0) and (`bdverificadorfacturas`.`consecutivo` = \'DOMICILIO\')) order by cast(substr(`bdverificadorfacturas`.`idFactura`,6,100) as signed))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bdverificadorfacturas`.`factura` AS `facturaTerm`,`bdclick6`.`bdcxc`.`factura` AS `factura`,`bdclick6`.`bdcxc`.`tipo` AS `tipo`,`bdclick6`.`bdcxc`.`estado` AS `estado`,`bdclick6`.`bdverificadorfacturas`.`cliente` AS `cliente1`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdverificadorfacturas`.`fechaFactura` AS `fechaFactura`,`bdclick6`.`bdverificadorfacturas`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick6`.`bdcxc`.`valor` AS `valor`,`bdclick6`.`bdverificadorfacturas`.`anulada` AS `anulada`,`bdclick6`.`bdverificadorfacturas`.`fechaAlerta` AS `fechaAlerta`,if(((cast(now() as date) >= `bdclick6`.`bdverificadorfacturas`.`fechaAlerta`) and (cast(now() as date) < `bdclick6`.`bdverificadorfacturas`.`fechaVencimiento`)),\'ALERTA\',if((cast(now() as date) >= `bdclick6`.`bdverificadorfacturas`.`fechaVencimiento`),\'VENCIDA\',\'OK\')) AS `estadoVencimiento`,if(((cast(now() as date) >= `bdclick6`.`bdverificadorfacturas`.`fechaAlerta`) and (cast(now() as date) < `bdclick6`.`bdverificadorfacturas`.`fechaVencimiento`)),\'2\',if((cast(now() as date) >= `bdclick6`.`bdverificadorfacturas`.`fechaVencimiento`),\'1\',\'3\')) AS `orden`,`bdclick6`.`bdverificadorfacturas`.`terminal` AS `terminal`,`bdclick6`.`bdcxc`.`cuotas` AS `cuotas`,if(isnull(`bdclick6`.`repcartera`.`valor`),`bdclick6`.`bdcxc`.`valor`,(`bdclick6`.`bdcxc`.`valor` - `bdclick6`.`repcartera`.`valor`)) AS `saldo`,cast(substr(`bdclick6`.`bdverificadorfacturas`.`idFactura`,6,100) as signed) AS `ordenId`,cast((`bdclick6`.`bdverificadorfacturas`.`fechaVencimiento` - cast(now() as date)) as signed) AS `edadCartera`,`bdclick6`.`bdverificadorfacturas`.`turno` AS `turno`,`bdclick6`.`bdverificadorfacturas`.`vendedor` AS `vendedor`,`bdclick6`.`bdverificadorfacturas`.`consecutivo` AS `consecutivo`,`bdclick6`.`bdterceros`.`id` AS `cliente` from (((`bdclick6`.`bdverificadorfacturas` left join `bdclick6`.`repcartera` on((`bdclick6`.`repcartera`.`fact` = `bdclick6`.`bdverificadorfacturas`.`factura`))) left join `bdclick6`.`bdcxc` on((`bdclick6`.`bdcxc`.`factura2` = `bdclick6`.`bdverificadorfacturas`.`factura`))) left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdverificadorfacturas`.`cliente` = `bdclick6`.`bdterceros`.`idSistema`))) group by `bdclick6`.`bdverificadorfacturas`.`factura`,`bdclick6`.`bdcxc`.`factura`,`bdclick6`.`bdcxc`.`tipo`,`bdclick6`.`bdcxc`.`estado`,`bdclick6`.`bdverificadorfacturas`.`cliente`,`bdclick6`.`bdterceros`.`nombre`,`bdclick6`.`bdverificadorfacturas`.`fechaFactura`,`bdclick6`.`bdverificadorfacturas`.`fechaVencimiento`,`bdclick6`.`bdcxc`.`valor`,`bdclick6`.`bdverificadorfacturas`.`anulada`,`bdclick6`.`bdverificadorfacturas`.`fechaAlerta`,if(((cast(now() as date) >= `bdclick6`.`bdverificadorfacturas`.`fechaAlerta`) and (cast(now() as date) < `bdclick6`.`bdverificadorfacturas`.`fechaVencimiento`)),\'ALERTA\',if((cast(now() as date) >= `bdclick6`.`bdverificadorfacturas`.`fechaVencimiento`),\'VENCIDA\',\'OK\')),if(((cast(now() as date) >= `bdclick6`.`bdverificadorfacturas`.`fechaAlerta`) and (cast(now() as date) < `bdclick6`.`bdverificadorfacturas`.`fechaVencimiento`)),\'2\',if((cast(now() as date) >= `bdclick6`.`bdverificadorfacturas`.`fechaVencimiento`),\'1\',\'3\')),`bdclick6`.`bdverificadorfacturas`.`terminal`,`bdclick6`.`bdcxc`.`cuotas`,if(isnull(`bdclick6`.`repcartera`.`valor`),`bdclick6`.`bdcxc`.`valor`,(`bdclick6`.`bdcxc`.`valor` - `bdclick6`.`repcartera`.`valor`)),cast(substr(`bdclick6`.`bdverificadorfacturas`.`idFactura`,6,100) as signed),cast((`bdclick6`.`bdverificadorfacturas`.`fechaVencimiento` - cast(now() as date)) as signed),`bdclick6`.`bdverificadorfacturas`.`turno`,`bdclick6`.`bdverificadorfacturas`.`vendedor`,`bdclick6`.`bdverificadorfacturas`.`consecutivo`,`bdclick6`.`bdterceros`.`id` having ((`bdclick6`.`bdcxc`.`factura` <> \'0\') and (`bdclick6`.`bdcxc`.`tipo` = \'FACT\') and (`bdclick6`.`bdcxc`.`estado` = \'PEND\') and (`bdclick6`.`bdverificadorfacturas`.`anulada` = 0) and (`bdclick6`.`bdverificadorfacturas`.`consecutivo` = \'DOMICILIO\')) order by cast(substr(`bdclick6`.`bdverificadorfacturas`.`idFactura`,6,100) as signed))
mariadb-version=100135
