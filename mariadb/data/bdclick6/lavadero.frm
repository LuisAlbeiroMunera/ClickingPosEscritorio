TYPE=VIEW
query=select `bdclick6`.`bdlavado`.`id` AS `id`,`bdclick6`.`bdlavado`.`empleado` AS `observaciones`,`bdclick6`.`bdlavado`.`servicio` AS `total`,`bdclick6`.`bdlavado`.`fechaRealizado` AS `fechaRealizado`,`bdclick6`.`bdlavado`.`cliente` AS `cliente`,`bdclick6`.`bdlavado`.`liquidado` AS `estadoGeneral`,`bdclick6`.`bdlavadoproductos`.`codServicio` AS `codServicio`,`bdclick6`.`bdlavadoproductos`.`servicio` AS `servicio`,`bdclick6`.`bdlavadoproductos`.`valor` AS `valor`,`bdclick6`.`bdlavadoproductos`.`liquidado` AS `liquidado`,`bdclick6`.`bdlavadoproductos`.`pago` AS `pago`,`bdclick6`.`bdlavadoproductos`.`empleado` AS `empleado`,`bdclick6`.`bdlavado`.`placa` AS `placa`,`bdclick6`.`bdlavado`.`oServicio` AS `oServicio`,`bdclick6`.`bdlavado`.`tipoVehiculo` AS `tipoVehiculo`,`bdclick6`.`bdlavado`.`marca` AS `marca`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdlavado`.`fecha` AS `fecha` from ((`bdclick6`.`bdlavado` left join `bdclick6`.`bdlavadoproductos` on((`bdclick6`.`bdlavado`.`id` = `bdclick6`.`bdlavadoproductos`.`IdLavado`))) left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdterceros`.`idSistema` = `bdclick6`.`bdlavadoproductos`.`empleado`)))
md5=b5fbd31f0db14f74f7cb3d2f41af55a4
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:36
create-version=2
source=select `bdlavado`.`id` AS `id`,`bdlavado`.`empleado` AS `observaciones`,`bdlavado`.`servicio` AS `total`,`bdlavado`.`fechaRealizado` AS `fechaRealizado`,`bdlavado`.`cliente` AS `cliente`,`bdlavado`.`liquidado` AS `estadoGeneral`,`bdlavadoproductos`.`codServicio` AS `codServicio`,`bdlavadoproductos`.`servicio` AS `servicio`,`bdlavadoproductos`.`valor` AS `valor`,`bdlavadoproductos`.`liquidado` AS `liquidado`,`bdlavadoproductos`.`pago` AS `pago`,`bdlavadoproductos`.`empleado` AS `empleado`,`bdlavado`.`placa` AS `placa`,`bdlavado`.`oServicio` AS `oServicio`,`bdlavado`.`tipoVehiculo` AS `tipoVehiculo`,`bdlavado`.`marca` AS `marca`,`bdterceros`.`nombre` AS `nombre`,`bdlavado`.`fecha` AS `fecha` from ((`bdlavado` left join `bdlavadoproductos` on((`bdlavado`.`id` = `bdlavadoproductos`.`IdLavado`))) left join `bdterceros` on((`bdterceros`.`idSistema` = `bdlavadoproductos`.`empleado`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdlavado`.`id` AS `id`,`bdclick6`.`bdlavado`.`empleado` AS `observaciones`,`bdclick6`.`bdlavado`.`servicio` AS `total`,`bdclick6`.`bdlavado`.`fechaRealizado` AS `fechaRealizado`,`bdclick6`.`bdlavado`.`cliente` AS `cliente`,`bdclick6`.`bdlavado`.`liquidado` AS `estadoGeneral`,`bdclick6`.`bdlavadoproductos`.`codServicio` AS `codServicio`,`bdclick6`.`bdlavadoproductos`.`servicio` AS `servicio`,`bdclick6`.`bdlavadoproductos`.`valor` AS `valor`,`bdclick6`.`bdlavadoproductos`.`liquidado` AS `liquidado`,`bdclick6`.`bdlavadoproductos`.`pago` AS `pago`,`bdclick6`.`bdlavadoproductos`.`empleado` AS `empleado`,`bdclick6`.`bdlavado`.`placa` AS `placa`,`bdclick6`.`bdlavado`.`oServicio` AS `oServicio`,`bdclick6`.`bdlavado`.`tipoVehiculo` AS `tipoVehiculo`,`bdclick6`.`bdlavado`.`marca` AS `marca`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdlavado`.`fecha` AS `fecha` from ((`bdclick6`.`bdlavado` left join `bdclick6`.`bdlavadoproductos` on((`bdclick6`.`bdlavado`.`id` = `bdclick6`.`bdlavadoproductos`.`IdLavado`))) left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdterceros`.`idSistema` = `bdclick6`.`bdlavadoproductos`.`empleado`)))
mariadb-version=100135