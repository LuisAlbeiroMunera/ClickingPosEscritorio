TYPE=VIEW
query=select `bdclick4`.`bdterceros`.`nombre` AS `nombre`,if((cast(now() as date) > `bdclick4`.`bdmensualidad`.`fechaFinal`),\'VENCIDA\',if((cast(now() as date) >= `bdclick4`.`bdmensualidad`.`fechaAlerta`),\'ALERTA\',\'DISPONIBLE\')) AS `estado`,(to_days(`bdclick4`.`bdmensualidad`.`fechaFinal`) - to_days(cast(now() as date))) AS `restantes`,`bdclick4`.`bdterceros`.`id` AS `cliente`,1 AS `num`,`bdclick4`.`bdmensualidad`.`id` AS `id`,`bdclick4`.`bdmensualidad`.`placa` AS `placa`,`bdclick4`.`bdmensualidad`.`fechaInicio` AS `fechaInicio`,`bdclick4`.`bdmensualidad`.`dias` AS `dias`,`bdclick4`.`bdmensualidad`.`valor` AS `valor`,`bdclick4`.`bdmensualidad`.`fechaFinal` AS `fechaFinal`,`bdclick4`.`bdmensualidad`.`fechaAlerta` AS `fechaAlerta`,`bdclick4`.`bdmensualidad`.`meses` AS `meses`,`bdclick4`.`bdmensualidad`.`codServicio` AS `codServicio`,`bdclick4`.`bdmensualidad`.`servicio` AS `servicio`,`bdclick4`.`bdmensualidad`.`factura` AS `factura`,if((`bdclick4`.`bdcxc`.`tipo` = \'ABONO\'),\'OK\',\'FACT\') AS `tipo`,if((`bdclick4`.`bdcxc`.`estado` = \'PEND\'),\'NO PAGADO\',\'PAGADO\') AS `estadoPago`,`bdclick4`.`bdmensualidad`.`fechaInicio` AS `fecha` from (((`bdclick4`.`bdterceros` join `bdclick4`.`bdplacas` on((`bdclick4`.`bdterceros`.`idSistema` = `bdclick4`.`bdplacas`.`usuario`))) join `bdclick4`.`bdmensualidad` on((`bdclick4`.`bdplacas`.`placa` = `bdclick4`.`bdmensualidad`.`placa`))) left join `bdclick4`.`bdcxc` on((`bdclick4`.`bdcxc`.`factura` = `bdclick4`.`bdmensualidad`.`factura`)))
md5=2e4b15a051fcf12ae224ec12ef1cd323
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:30
create-version=2
source=select `bdterceros`.`nombre` AS `nombre`,if((cast(now() as date) > `bdmensualidad`.`fechaFinal`),\'VENCIDA\',if((cast(now() as date) >= `bdmensualidad`.`fechaAlerta`),\'ALERTA\',\'DISPONIBLE\')) AS `estado`,(to_days(`bdmensualidad`.`fechaFinal`) - to_days(cast(now() as date))) AS `restantes`,`bdterceros`.`id` AS `cliente`,1 AS `num`,`bdmensualidad`.`id` AS `id`,`bdmensualidad`.`placa` AS `placa`,`bdmensualidad`.`fechaInicio` AS `fechaInicio`,`bdmensualidad`.`dias` AS `dias`,`bdmensualidad`.`valor` AS `valor`,`bdmensualidad`.`fechaFinal` AS `fechaFinal`,`bdmensualidad`.`fechaAlerta` AS `fechaAlerta`,`bdmensualidad`.`meses` AS `meses`,`bdmensualidad`.`codServicio` AS `codServicio`,`bdmensualidad`.`servicio` AS `servicio`,`bdmensualidad`.`factura` AS `factura`,if((`bdcxc`.`tipo` = \'ABONO\'),\'OK\',\'FACT\') AS `tipo`,if((`bdcxc`.`estado` = \'PEND\'),\'NO PAGADO\',\'PAGADO\') AS `estadoPago`,`bdmensualidad`.`fechaInicio` AS `fecha` from (((`bdterceros` join `bdplacas` on((`bdterceros`.`idSistema` = `bdplacas`.`usuario`))) join `bdmensualidad` on((`bdplacas`.`placa` = `bdmensualidad`.`placa`))) left join `bdcxc` on((`bdcxc`.`factura` = `bdmensualidad`.`factura`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdterceros`.`nombre` AS `nombre`,if((cast(now() as date) > `bdclick4`.`bdmensualidad`.`fechaFinal`),\'VENCIDA\',if((cast(now() as date) >= `bdclick4`.`bdmensualidad`.`fechaAlerta`),\'ALERTA\',\'DISPONIBLE\')) AS `estado`,(to_days(`bdclick4`.`bdmensualidad`.`fechaFinal`) - to_days(cast(now() as date))) AS `restantes`,`bdclick4`.`bdterceros`.`id` AS `cliente`,1 AS `num`,`bdclick4`.`bdmensualidad`.`id` AS `id`,`bdclick4`.`bdmensualidad`.`placa` AS `placa`,`bdclick4`.`bdmensualidad`.`fechaInicio` AS `fechaInicio`,`bdclick4`.`bdmensualidad`.`dias` AS `dias`,`bdclick4`.`bdmensualidad`.`valor` AS `valor`,`bdclick4`.`bdmensualidad`.`fechaFinal` AS `fechaFinal`,`bdclick4`.`bdmensualidad`.`fechaAlerta` AS `fechaAlerta`,`bdclick4`.`bdmensualidad`.`meses` AS `meses`,`bdclick4`.`bdmensualidad`.`codServicio` AS `codServicio`,`bdclick4`.`bdmensualidad`.`servicio` AS `servicio`,`bdclick4`.`bdmensualidad`.`factura` AS `factura`,if((`bdclick4`.`bdcxc`.`tipo` = \'ABONO\'),\'OK\',\'FACT\') AS `tipo`,if((`bdclick4`.`bdcxc`.`estado` = \'PEND\'),\'NO PAGADO\',\'PAGADO\') AS `estadoPago`,`bdclick4`.`bdmensualidad`.`fechaInicio` AS `fecha` from (((`bdclick4`.`bdterceros` join `bdclick4`.`bdplacas` on((`bdclick4`.`bdterceros`.`idSistema` = `bdclick4`.`bdplacas`.`usuario`))) join `bdclick4`.`bdmensualidad` on((`bdclick4`.`bdplacas`.`placa` = `bdclick4`.`bdmensualidad`.`placa`))) left join `bdclick4`.`bdcxc` on((`bdclick4`.`bdcxc`.`factura` = `bdclick4`.`bdmensualidad`.`factura`)))
mariadb-version=100135