TYPE=VIEW
query=(select `bdclick5`.`bdverificadorfacturas`.`factura` AS `facturaTerm`,`bdclick5`.`bdcxc`.`factura` AS `factura`,`bdclick5`.`bdcxc`.`tipo` AS `tipo`,`bdclick5`.`bdcxc`.`estado` AS `estado`,`bdclick5`.`bdverificadorfacturas`.`cliente` AS `cliente1`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdverificadorfacturas`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`bdverificadorfacturas`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick5`.`bdcxc`.`valor` AS `valor`,`bdclick5`.`bdverificadorfacturas`.`anulada` AS `anulada`,`bdclick5`.`bdverificadorfacturas`.`fechaAlerta` AS `fechaAlerta`,if(((cast(now() as date) >= `bdclick5`.`bdverificadorfacturas`.`fechaAlerta`) and (cast(now() as date) < `bdclick5`.`bdverificadorfacturas`.`fechaVencimiento`)),\'ALERTA\',if((cast(now() as date) >= `bdclick5`.`bdverificadorfacturas`.`fechaVencimiento`),\'VENCIDA\',\'OK\')) AS `estadoVencimiento`,if(((cast(now() as date) >= `bdclick5`.`bdverificadorfacturas`.`fechaAlerta`) and (cast(now() as date) < `bdclick5`.`bdverificadorfacturas`.`fechaVencimiento`)),\'2\',if((cast(now() as date) >= `bdclick5`.`bdverificadorfacturas`.`fechaVencimiento`),\'1\',\'3\')) AS `orden`,`bdclick5`.`bdverificadorfacturas`.`terminal` AS `terminal`,`bdclick5`.`bdcxc`.`cuotas` AS `cuotas`,if(isnull(`bdclick5`.`repcartera`.`valor`),`bdclick5`.`bdcxc`.`valor`,(`bdclick5`.`bdcxc`.`valor` - `bdclick5`.`repcartera`.`valor`)) AS `saldo`,cast(substr(`bdclick5`.`bdverificadorfacturas`.`idFactura`,6,100) as signed) AS `ordenId`,cast((`bdclick5`.`bdverificadorfacturas`.`fechaVencimiento` - cast(now() as date)) as signed) AS `edadCartera`,`bdclick5`.`bdverificadorfacturas`.`turno` AS `turno`,`bdclick5`.`bdverificadorfacturas`.`vendedor` AS `vendedor`,`bdclick5`.`bdverificadorfacturas`.`consecutivo` AS `consecutivo`,`bdclick5`.`bdterceros`.`id` AS `cliente` from (((`bdclick5`.`bdverificadorfacturas` left join `bdclick5`.`repcartera` on((`bdclick5`.`repcartera`.`fact` = `bdclick5`.`bdverificadorfacturas`.`factura`))) left join `bdclick5`.`bdcxc` on((`bdclick5`.`bdcxc`.`factura2` = `bdclick5`.`bdverificadorfacturas`.`factura`))) left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdverificadorfacturas`.`cliente` = `bdclick5`.`bdterceros`.`idSistema`))) group by `bdclick5`.`bdverificadorfacturas`.`factura`,`bdclick5`.`bdcxc`.`factura`,`bdclick5`.`bdcxc`.`tipo`,`bdclick5`.`bdcxc`.`estado`,`bdclick5`.`bdverificadorfacturas`.`cliente`,`bdclick5`.`bdterceros`.`nombre`,`bdclick5`.`bdverificadorfacturas`.`fechaFactura`,`bdclick5`.`bdverificadorfacturas`.`fechaVencimiento`,`bdclick5`.`bdcxc`.`valor`,`bdclick5`.`bdverificadorfacturas`.`anulada`,`bdclick5`.`bdverificadorfacturas`.`fechaAlerta`,if(((cast(now() as date) >= `bdclick5`.`bdverificadorfacturas`.`fechaAlerta`) and (cast(now() as date) < `bdclick5`.`bdverificadorfacturas`.`fechaVencimiento`)),\'ALERTA\',if((cast(now() as date) >= `bdclick5`.`bdverificadorfacturas`.`fechaVencimiento`),\'VENCIDA\',\'OK\')),if(((cast(now() as date) >= `bdclick5`.`bdverificadorfacturas`.`fechaAlerta`) and (cast(now() as date) < `bdclick5`.`bdverificadorfacturas`.`fechaVencimiento`)),\'2\',if((cast(now() as date) >= `bdclick5`.`bdverificadorfacturas`.`fechaVencimiento`),\'1\',\'3\')),`bdclick5`.`bdverificadorfacturas`.`terminal`,`bdclick5`.`bdcxc`.`cuotas`,if(isnull(`bdclick5`.`repcartera`.`valor`),`bdclick5`.`bdcxc`.`valor`,(`bdclick5`.`bdcxc`.`valor` - `bdclick5`.`repcartera`.`valor`)),cast(substr(`bdclick5`.`bdverificadorfacturas`.`idFactura`,6,100) as signed),cast((`bdclick5`.`bdverificadorfacturas`.`fechaVencimiento` - cast(now() as date)) as signed),`bdclick5`.`bdverificadorfacturas`.`turno`,`bdclick5`.`bdverificadorfacturas`.`vendedor`,`bdclick5`.`bdverificadorfacturas`.`consecutivo`,`bdclick5`.`bdterceros`.`id` having ((`bdclick5`.`bdcxc`.`factura` <> \'0\') and (`bdclick5`.`bdcxc`.`tipo` = \'FACT\') and (`bdclick5`.`bdcxc`.`estado` = \'PEND\') and (`bdclick5`.`bdverificadorfacturas`.`anulada` = 0) and (`bdclick5`.`bdverificadorfacturas`.`consecutivo` = \'DOMICILIO\')) order by cast(substr(`bdclick5`.`bdverificadorfacturas`.`idFactura`,6,100) as signed))
md5=b24800480da438d6edf5f0d6528ea4cd
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:45
create-version=2
source=(select `bdverificadorfacturas`.`factura` AS `facturaTerm`,`bdcxc`.`factura` AS `factura`,`bdcxc`.`tipo` AS `tipo`,`bdcxc`.`estado` AS `estado`,`bdverificadorfacturas`.`cliente` AS `cliente1`,`bdterceros`.`nombre` AS `nombre`,`bdverificadorfacturas`.`fechaFactura` AS `fechaFactura`,`bdverificadorfacturas`.`fechaVencimiento` AS `fechaVencimiento`,`bdcxc`.`valor` AS `valor`,`bdverificadorfacturas`.`anulada` AS `anulada`,`bdverificadorfacturas`.`fechaAlerta` AS `fechaAlerta`,if(((cast(now() as date) >= `bdverificadorfacturas`.`fechaAlerta`) and (cast(now() as date) < `bdverificadorfacturas`.`fechaVencimiento`)),\'ALERTA\',if((cast(now() as date) >= `bdverificadorfacturas`.`fechaVencimiento`),\'VENCIDA\',\'OK\')) AS `estadoVencimiento`,if(((cast(now() as date) >= `bdverificadorfacturas`.`fechaAlerta`) and (cast(now() as date) < `bdverificadorfacturas`.`fechaVencimiento`)),\'2\',if((cast(now() as date) >= `bdverificadorfacturas`.`fechaVencimiento`),\'1\',\'3\')) AS `orden`,`bdverificadorfacturas`.`terminal` AS `terminal`,`bdcxc`.`cuotas` AS `cuotas`,if(isnull(`repcartera`.`valor`),`bdcxc`.`valor`,(`bdcxc`.`valor` - `repcartera`.`valor`)) AS `saldo`,cast(substr(`bdverificadorfacturas`.`idFactura`,6,100) as signed) AS `ordenId`,cast((`bdverificadorfacturas`.`fechaVencimiento` - cast(now() as date)) as signed) AS `edadCartera`,`bdverificadorfacturas`.`turno` AS `turno`,`bdverificadorfacturas`.`vendedor` AS `vendedor`,`bdverificadorfacturas`.`consecutivo` AS `consecutivo`,`bdterceros`.`id` AS `cliente` from (((`bdverificadorfacturas` left join `repcartera` on((`repcartera`.`fact` = `bdverificadorfacturas`.`factura`))) left join `bdcxc` on((`bdcxc`.`factura2` = `bdverificadorfacturas`.`factura`))) left join `bdterceros` on((`bdverificadorfacturas`.`cliente` = `bdterceros`.`idSistema`))) group by `bdverificadorfacturas`.`factura`,`bdcxc`.`factura`,`bdcxc`.`tipo`,`bdcxc`.`estado`,`bdverificadorfacturas`.`cliente`,`bdterceros`.`nombre`,`bdverificadorfacturas`.`fechaFactura`,`bdverificadorfacturas`.`fechaVencimiento`,`bdcxc`.`valor`,`bdverificadorfacturas`.`anulada`,`bdverificadorfacturas`.`fechaAlerta`,if(((cast(now() as date) >= `bdverificadorfacturas`.`fechaAlerta`) and (cast(now() as date) < `bdverificadorfacturas`.`fechaVencimiento`)),\'ALERTA\',if((cast(now() as date) >= `bdverificadorfacturas`.`fechaVencimiento`),\'VENCIDA\',\'OK\')),if(((cast(now() as date) >= `bdverificadorfacturas`.`fechaAlerta`) and (cast(now() as date) < `bdverificadorfacturas`.`fechaVencimiento`)),\'2\',if((cast(now() as date) >= `bdverificadorfacturas`.`fechaVencimiento`),\'1\',\'3\')),`bdverificadorfacturas`.`terminal`,`bdcxc`.`cuotas`,if(isnull(`repcartera`.`valor`),`bdcxc`.`valor`,(`bdcxc`.`valor` - `repcartera`.`valor`)),cast(substr(`bdverificadorfacturas`.`idFactura`,6,100) as signed),cast((`bdverificadorfacturas`.`fechaVencimiento` - cast(now() as date)) as signed),`bdverificadorfacturas`.`turno`,`bdverificadorfacturas`.`vendedor`,`bdverificadorfacturas`.`consecutivo`,`bdterceros`.`id` having ((`bdcxc`.`factura` <> \'0\') and (`bdcxc`.`tipo` = \'FACT\') and (`bdcxc`.`estado` = \'PEND\') and (`bdverificadorfacturas`.`anulada` = 0) and (`bdverificadorfacturas`.`consecutivo` = \'DOMICILIO\')) order by cast(substr(`bdverificadorfacturas`.`idFactura`,6,100) as signed))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`bdverificadorfacturas`.`factura` AS `facturaTerm`,`bdclick5`.`bdcxc`.`factura` AS `factura`,`bdclick5`.`bdcxc`.`tipo` AS `tipo`,`bdclick5`.`bdcxc`.`estado` AS `estado`,`bdclick5`.`bdverificadorfacturas`.`cliente` AS `cliente1`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdverificadorfacturas`.`fechaFactura` AS `fechaFactura`,`bdclick5`.`bdverificadorfacturas`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick5`.`bdcxc`.`valor` AS `valor`,`bdclick5`.`bdverificadorfacturas`.`anulada` AS `anulada`,`bdclick5`.`bdverificadorfacturas`.`fechaAlerta` AS `fechaAlerta`,if(((cast(now() as date) >= `bdclick5`.`bdverificadorfacturas`.`fechaAlerta`) and (cast(now() as date) < `bdclick5`.`bdverificadorfacturas`.`fechaVencimiento`)),\'ALERTA\',if((cast(now() as date) >= `bdclick5`.`bdverificadorfacturas`.`fechaVencimiento`),\'VENCIDA\',\'OK\')) AS `estadoVencimiento`,if(((cast(now() as date) >= `bdclick5`.`bdverificadorfacturas`.`fechaAlerta`) and (cast(now() as date) < `bdclick5`.`bdverificadorfacturas`.`fechaVencimiento`)),\'2\',if((cast(now() as date) >= `bdclick5`.`bdverificadorfacturas`.`fechaVencimiento`),\'1\',\'3\')) AS `orden`,`bdclick5`.`bdverificadorfacturas`.`terminal` AS `terminal`,`bdclick5`.`bdcxc`.`cuotas` AS `cuotas`,if(isnull(`bdclick5`.`repcartera`.`valor`),`bdclick5`.`bdcxc`.`valor`,(`bdclick5`.`bdcxc`.`valor` - `bdclick5`.`repcartera`.`valor`)) AS `saldo`,cast(substr(`bdclick5`.`bdverificadorfacturas`.`idFactura`,6,100) as signed) AS `ordenId`,cast((`bdclick5`.`bdverificadorfacturas`.`fechaVencimiento` - cast(now() as date)) as signed) AS `edadCartera`,`bdclick5`.`bdverificadorfacturas`.`turno` AS `turno`,`bdclick5`.`bdverificadorfacturas`.`vendedor` AS `vendedor`,`bdclick5`.`bdverificadorfacturas`.`consecutivo` AS `consecutivo`,`bdclick5`.`bdterceros`.`id` AS `cliente` from (((`bdclick5`.`bdverificadorfacturas` left join `bdclick5`.`repcartera` on((`bdclick5`.`repcartera`.`fact` = `bdclick5`.`bdverificadorfacturas`.`factura`))) left join `bdclick5`.`bdcxc` on((`bdclick5`.`bdcxc`.`factura2` = `bdclick5`.`bdverificadorfacturas`.`factura`))) left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdverificadorfacturas`.`cliente` = `bdclick5`.`bdterceros`.`idSistema`))) group by `bdclick5`.`bdverificadorfacturas`.`factura`,`bdclick5`.`bdcxc`.`factura`,`bdclick5`.`bdcxc`.`tipo`,`bdclick5`.`bdcxc`.`estado`,`bdclick5`.`bdverificadorfacturas`.`cliente`,`bdclick5`.`bdterceros`.`nombre`,`bdclick5`.`bdverificadorfacturas`.`fechaFactura`,`bdclick5`.`bdverificadorfacturas`.`fechaVencimiento`,`bdclick5`.`bdcxc`.`valor`,`bdclick5`.`bdverificadorfacturas`.`anulada`,`bdclick5`.`bdverificadorfacturas`.`fechaAlerta`,if(((cast(now() as date) >= `bdclick5`.`bdverificadorfacturas`.`fechaAlerta`) and (cast(now() as date) < `bdclick5`.`bdverificadorfacturas`.`fechaVencimiento`)),\'ALERTA\',if((cast(now() as date) >= `bdclick5`.`bdverificadorfacturas`.`fechaVencimiento`),\'VENCIDA\',\'OK\')),if(((cast(now() as date) >= `bdclick5`.`bdverificadorfacturas`.`fechaAlerta`) and (cast(now() as date) < `bdclick5`.`bdverificadorfacturas`.`fechaVencimiento`)),\'2\',if((cast(now() as date) >= `bdclick5`.`bdverificadorfacturas`.`fechaVencimiento`),\'1\',\'3\')),`bdclick5`.`bdverificadorfacturas`.`terminal`,`bdclick5`.`bdcxc`.`cuotas`,if(isnull(`bdclick5`.`repcartera`.`valor`),`bdclick5`.`bdcxc`.`valor`,(`bdclick5`.`bdcxc`.`valor` - `bdclick5`.`repcartera`.`valor`)),cast(substr(`bdclick5`.`bdverificadorfacturas`.`idFactura`,6,100) as signed),cast((`bdclick5`.`bdverificadorfacturas`.`fechaVencimiento` - cast(now() as date)) as signed),`bdclick5`.`bdverificadorfacturas`.`turno`,`bdclick5`.`bdverificadorfacturas`.`vendedor`,`bdclick5`.`bdverificadorfacturas`.`consecutivo`,`bdclick5`.`bdterceros`.`id` having ((`bdclick5`.`bdcxc`.`factura` <> \'0\') and (`bdclick5`.`bdcxc`.`tipo` = \'FACT\') and (`bdclick5`.`bdcxc`.`estado` = \'PEND\') and (`bdclick5`.`bdverificadorfacturas`.`anulada` = 0) and (`bdclick5`.`bdverificadorfacturas`.`consecutivo` = \'DOMICILIO\')) order by cast(substr(`bdclick5`.`bdverificadorfacturas`.`idFactura`,6,100) as signed))
mariadb-version=100135
