TYPE=VIEW
query=select `bdclick3`.`bdterceros`.`nombre` AS `nombre`,if((cast(now() as date) > `bdclick3`.`bdmensualidad`.`fechaFinal`),\'VENCIDA\',if((cast(now() as date) >= `bdclick3`.`bdmensualidad`.`fechaAlerta`),\'ALERTA\',\'DISPONIBLE\')) AS `estado`,(to_days(`bdclick3`.`bdmensualidad`.`fechaFinal`) - to_days(cast(now() as date))) AS `restantes`,`bdclick3`.`bdterceros`.`id` AS `cliente`,1 AS `num`,`bdclick3`.`bdmensualidad`.`id` AS `id`,`bdclick3`.`bdmensualidad`.`placa` AS `placa`,`bdclick3`.`bdmensualidad`.`fechaInicio` AS `fechaInicio`,`bdclick3`.`bdmensualidad`.`dias` AS `dias`,`bdclick3`.`bdmensualidad`.`valor` AS `valor`,`bdclick3`.`bdmensualidad`.`fechaFinal` AS `fechaFinal`,`bdclick3`.`bdmensualidad`.`fechaAlerta` AS `fechaAlerta`,`bdclick3`.`bdmensualidad`.`meses` AS `meses`,`bdclick3`.`bdmensualidad`.`codServicio` AS `codServicio`,`bdclick3`.`bdmensualidad`.`servicio` AS `servicio`,`bdclick3`.`bdmensualidad`.`factura` AS `factura`,if((`bdclick3`.`bdcxc`.`tipo` = \'ABONO\'),\'OK\',\'FACT\') AS `tipo`,if((`bdclick3`.`bdcxc`.`estado` = \'PEND\'),\'NO PAGADO\',\'PAGADO\') AS `estadoPago`,`bdclick3`.`bdmensualidad`.`fechaInicio` AS `fecha` from (((`bdclick3`.`bdterceros` join `bdclick3`.`bdplacas` on((`bdclick3`.`bdterceros`.`idSistema` = `bdclick3`.`bdplacas`.`usuario`))) join `bdclick3`.`bdmensualidad` on((`bdclick3`.`bdplacas`.`placa` = `bdclick3`.`bdmensualidad`.`placa`))) left join `bdclick3`.`bdcxc` on((`bdclick3`.`bdcxc`.`factura` = `bdclick3`.`bdmensualidad`.`factura`)))
md5=1c1a3d99b566a60ff7ddc2df4b63e873
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:53
create-version=2
source=select `bdterceros`.`nombre` AS `nombre`,if((cast(now() as date) > `bdmensualidad`.`fechaFinal`),\'VENCIDA\',if((cast(now() as date) >= `bdmensualidad`.`fechaAlerta`),\'ALERTA\',\'DISPONIBLE\')) AS `estado`,(to_days(`bdmensualidad`.`fechaFinal`) - to_days(cast(now() as date))) AS `restantes`,`bdterceros`.`id` AS `cliente`,1 AS `num`,`bdmensualidad`.`id` AS `id`,`bdmensualidad`.`placa` AS `placa`,`bdmensualidad`.`fechaInicio` AS `fechaInicio`,`bdmensualidad`.`dias` AS `dias`,`bdmensualidad`.`valor` AS `valor`,`bdmensualidad`.`fechaFinal` AS `fechaFinal`,`bdmensualidad`.`fechaAlerta` AS `fechaAlerta`,`bdmensualidad`.`meses` AS `meses`,`bdmensualidad`.`codServicio` AS `codServicio`,`bdmensualidad`.`servicio` AS `servicio`,`bdmensualidad`.`factura` AS `factura`,if((`bdcxc`.`tipo` = \'ABONO\'),\'OK\',\'FACT\') AS `tipo`,if((`bdcxc`.`estado` = \'PEND\'),\'NO PAGADO\',\'PAGADO\') AS `estadoPago`,`bdmensualidad`.`fechaInicio` AS `fecha` from (((`bdterceros` join `bdplacas` on((`bdterceros`.`idSistema` = `bdplacas`.`usuario`))) join `bdmensualidad` on((`bdplacas`.`placa` = `bdmensualidad`.`placa`))) left join `bdcxc` on((`bdcxc`.`factura` = `bdmensualidad`.`factura`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdterceros`.`nombre` AS `nombre`,if((cast(now() as date) > `bdclick3`.`bdmensualidad`.`fechaFinal`),\'VENCIDA\',if((cast(now() as date) >= `bdclick3`.`bdmensualidad`.`fechaAlerta`),\'ALERTA\',\'DISPONIBLE\')) AS `estado`,(to_days(`bdclick3`.`bdmensualidad`.`fechaFinal`) - to_days(cast(now() as date))) AS `restantes`,`bdclick3`.`bdterceros`.`id` AS `cliente`,1 AS `num`,`bdclick3`.`bdmensualidad`.`id` AS `id`,`bdclick3`.`bdmensualidad`.`placa` AS `placa`,`bdclick3`.`bdmensualidad`.`fechaInicio` AS `fechaInicio`,`bdclick3`.`bdmensualidad`.`dias` AS `dias`,`bdclick3`.`bdmensualidad`.`valor` AS `valor`,`bdclick3`.`bdmensualidad`.`fechaFinal` AS `fechaFinal`,`bdclick3`.`bdmensualidad`.`fechaAlerta` AS `fechaAlerta`,`bdclick3`.`bdmensualidad`.`meses` AS `meses`,`bdclick3`.`bdmensualidad`.`codServicio` AS `codServicio`,`bdclick3`.`bdmensualidad`.`servicio` AS `servicio`,`bdclick3`.`bdmensualidad`.`factura` AS `factura`,if((`bdclick3`.`bdcxc`.`tipo` = \'ABONO\'),\'OK\',\'FACT\') AS `tipo`,if((`bdclick3`.`bdcxc`.`estado` = \'PEND\'),\'NO PAGADO\',\'PAGADO\') AS `estadoPago`,`bdclick3`.`bdmensualidad`.`fechaInicio` AS `fecha` from (((`bdclick3`.`bdterceros` join `bdclick3`.`bdplacas` on((`bdclick3`.`bdterceros`.`idSistema` = `bdclick3`.`bdplacas`.`usuario`))) join `bdclick3`.`bdmensualidad` on((`bdclick3`.`bdplacas`.`placa` = `bdclick3`.`bdmensualidad`.`placa`))) left join `bdclick3`.`bdcxc` on((`bdclick3`.`bdcxc`.`factura` = `bdclick3`.`bdmensualidad`.`factura`)))
mariadb-version=100135
