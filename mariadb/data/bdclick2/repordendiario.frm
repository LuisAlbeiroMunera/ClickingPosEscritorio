TYPE=VIEW
query=select `bdclick2`.`bdoservicio1`.`idFactura` AS `idFactura`,`bdclick2`.`bdoservicio1`.`cliente` AS `cliente`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,`bdclick2`.`bdoservicio1`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick2`.`bdoservicio1`.`ivaGeneral` AS `ivaGeneral`,`bdclick2`.`bdoservicio1`.`totalGeneral` AS `totalGeneral`,`bdclick2`.`bdoservicio1`.`fechaFactura` AS `fechaFactura`,`bdclick2`.`bdoservicio1`.`anulada` AS `anulada`,`bdclick2`.`bdoservicio1`.`rtIva` AS `rtIva`,`bdclick2`.`bdoservicio1`.`rtIca` AS `rtIca`,`bdclick2`.`bdoservicio1`.`rtFuente` AS `rtFuente`,`bdclick2`.`bdoservicio1`.`otros` AS `otros`,`bdclick2`.`bdoservicio1`.`descuento` AS `descuento`,`bdclick2`.`bdoservicio1`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick2`.`bdoservicio1`.`NC` AS `nc`,`bdclick2`.`bdoservicio1`.`chequeGeneral` AS `chequeGeneral`,`bdclick2`.`bdoservicio1`.`targetaGeneral` AS `targetaGeneral`,`bdclick2`.`bdoservicio1`.`credito` AS `credito`,`bdclick2`.`bdoservicio1`.`bodega` AS `bodega`,`bdclick2`.`bdoservicio`.`placa` AS `placa`,`bdclick2`.`bdoservicio`.`tipo` AS `tipo`,`bdclick2`.`bdoservicio`.`modelo` AS `modelo`,`bdclick2`.`bdoservicio`.`numeroChasis` AS `numeroChasis`,`bdclick2`.`bdoservicio1`.`estadoGeneral` AS `estadoGeneral`,`bdclick2`.`bdoservicio`.`marca` AS `marca`,`bdclick2`.`bdoservicio`.`km` AS `km`,`bdclick2`.`bdoservicio1`.`terminal` AS `terminal`,`bdclick2`.`bdoservicio1`.`diasGarantia` AS `diasGarantia`,`bdclick2`.`bdterceros`.`id` AS `idCliente` from ((`bdclick2`.`bdoservicio1` left join `bdclick2`.`bdoservicio` on((`bdclick2`.`bdoservicio`.`id` = `bdclick2`.`bdoservicio1`.`idFactura`))) left join `bdclick2`.`bdterceros` on((`bdclick2`.`bdoservicio1`.`cliente` = `bdclick2`.`bdterceros`.`idSistema`))) group by `bdclick2`.`bdoservicio1`.`idFactura`,`bdclick2`.`bdoservicio1`.`cliente`,`bdclick2`.`bdterceros`.`nombre`,`bdclick2`.`bdoservicio1`.`subtotalGeneral`,`bdclick2`.`bdoservicio1`.`ivaGeneral`,`bdclick2`.`bdoservicio1`.`totalGeneral`,`bdclick2`.`bdoservicio1`.`fechaFactura`,`bdclick2`.`bdoservicio1`.`anulada`,`bdclick2`.`bdoservicio1`.`rtIva`,`bdclick2`.`bdoservicio1`.`rtIca`,`bdclick2`.`bdoservicio1`.`rtFuente`,`bdclick2`.`bdoservicio1`.`otros`,`bdclick2`.`bdoservicio1`.`descuento`,`bdclick2`.`bdoservicio1`.`efectivoGeneral`,`bdclick2`.`bdoservicio1`.`NC`,`bdclick2`.`bdoservicio1`.`chequeGeneral`,`bdclick2`.`bdoservicio1`.`targetaGeneral`,`bdclick2`.`bdoservicio1`.`credito`,`bdclick2`.`bdoservicio1`.`bodega`,`bdclick2`.`bdoservicio`.`placa`,`bdclick2`.`bdoservicio`.`tipo`,`bdclick2`.`bdoservicio`.`modelo`,`bdclick2`.`bdoservicio`.`numeroChasis`,`bdclick2`.`bdoservicio1`.`estadoGeneral`,`bdclick2`.`bdoservicio`.`marca`,`bdclick2`.`bdoservicio`.`km`,`bdclick2`.`bdoservicio1`.`terminal`,`bdclick2`.`bdoservicio1`.`diasGarantia`,`bdclick2`.`bdterceros`.`id` having (`bdclick2`.`bdoservicio1`.`anulada` = 0)
md5=057fb784a98c8bf123e2e76ec75f4f2e
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:48
create-version=2
source=select `bdoservicio1`.`idFactura` AS `idFactura`,`bdoservicio1`.`cliente` AS `cliente`,`bdterceros`.`nombre` AS `nombre`,`bdoservicio1`.`subtotalGeneral` AS `subtotalGeneral`,`bdoservicio1`.`ivaGeneral` AS `ivaGeneral`,`bdoservicio1`.`totalGeneral` AS `totalGeneral`,`bdoservicio1`.`fechaFactura` AS `fechaFactura`,`bdoservicio1`.`anulada` AS `anulada`,`bdoservicio1`.`rtIva` AS `rtIva`,`bdoservicio1`.`rtIca` AS `rtIca`,`bdoservicio1`.`rtFuente` AS `rtFuente`,`bdoservicio1`.`otros` AS `otros`,`bdoservicio1`.`descuento` AS `descuento`,`bdoservicio1`.`efectivoGeneral` AS `efectivoGeneral`,`bdoservicio1`.`NC` AS `nc`,`bdoservicio1`.`chequeGeneral` AS `chequeGeneral`,`bdoservicio1`.`targetaGeneral` AS `targetaGeneral`,`bdoservicio1`.`credito` AS `credito`,`bdoservicio1`.`bodega` AS `bodega`,`bdoservicio`.`placa` AS `placa`,`bdoservicio`.`tipo` AS `tipo`,`bdoservicio`.`modelo` AS `modelo`,`bdoservicio`.`numeroChasis` AS `numeroChasis`,`bdoservicio1`.`estadoGeneral` AS `estadoGeneral`,`bdoservicio`.`marca` AS `marca`,`bdoservicio`.`km` AS `km`,`bdoservicio1`.`terminal` AS `terminal`,`bdoservicio1`.`diasGarantia` AS `diasGarantia`,`bdterceros`.`id` AS `idCliente` from ((`bdoservicio1` left join `bdoservicio` on((`bdoservicio`.`id` = `bdoservicio1`.`idFactura`))) left join `bdterceros` on((`bdoservicio1`.`cliente` = `bdterceros`.`idSistema`))) group by `bdoservicio1`.`idFactura`,`bdoservicio1`.`cliente`,`bdterceros`.`nombre`,`bdoservicio1`.`subtotalGeneral`,`bdoservicio1`.`ivaGeneral`,`bdoservicio1`.`totalGeneral`,`bdoservicio1`.`fechaFactura`,`bdoservicio1`.`anulada`,`bdoservicio1`.`rtIva`,`bdoservicio1`.`rtIca`,`bdoservicio1`.`rtFuente`,`bdoservicio1`.`otros`,`bdoservicio1`.`descuento`,`bdoservicio1`.`efectivoGeneral`,`bdoservicio1`.`NC`,`bdoservicio1`.`chequeGeneral`,`bdoservicio1`.`targetaGeneral`,`bdoservicio1`.`credito`,`bdoservicio1`.`bodega`,`bdoservicio`.`placa`,`bdoservicio`.`tipo`,`bdoservicio`.`modelo`,`bdoservicio`.`numeroChasis`,`bdoservicio1`.`estadoGeneral`,`bdoservicio`.`marca`,`bdoservicio`.`km`,`bdoservicio1`.`terminal`,`bdoservicio1`.`diasGarantia`,`bdterceros`.`id` having (`bdoservicio1`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdoservicio1`.`idFactura` AS `idFactura`,`bdclick2`.`bdoservicio1`.`cliente` AS `cliente`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,`bdclick2`.`bdoservicio1`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick2`.`bdoservicio1`.`ivaGeneral` AS `ivaGeneral`,`bdclick2`.`bdoservicio1`.`totalGeneral` AS `totalGeneral`,`bdclick2`.`bdoservicio1`.`fechaFactura` AS `fechaFactura`,`bdclick2`.`bdoservicio1`.`anulada` AS `anulada`,`bdclick2`.`bdoservicio1`.`rtIva` AS `rtIva`,`bdclick2`.`bdoservicio1`.`rtIca` AS `rtIca`,`bdclick2`.`bdoservicio1`.`rtFuente` AS `rtFuente`,`bdclick2`.`bdoservicio1`.`otros` AS `otros`,`bdclick2`.`bdoservicio1`.`descuento` AS `descuento`,`bdclick2`.`bdoservicio1`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick2`.`bdoservicio1`.`NC` AS `nc`,`bdclick2`.`bdoservicio1`.`chequeGeneral` AS `chequeGeneral`,`bdclick2`.`bdoservicio1`.`targetaGeneral` AS `targetaGeneral`,`bdclick2`.`bdoservicio1`.`credito` AS `credito`,`bdclick2`.`bdoservicio1`.`bodega` AS `bodega`,`bdclick2`.`bdoservicio`.`placa` AS `placa`,`bdclick2`.`bdoservicio`.`tipo` AS `tipo`,`bdclick2`.`bdoservicio`.`modelo` AS `modelo`,`bdclick2`.`bdoservicio`.`numeroChasis` AS `numeroChasis`,`bdclick2`.`bdoservicio1`.`estadoGeneral` AS `estadoGeneral`,`bdclick2`.`bdoservicio`.`marca` AS `marca`,`bdclick2`.`bdoservicio`.`km` AS `km`,`bdclick2`.`bdoservicio1`.`terminal` AS `terminal`,`bdclick2`.`bdoservicio1`.`diasGarantia` AS `diasGarantia`,`bdclick2`.`bdterceros`.`id` AS `idCliente` from ((`bdclick2`.`bdoservicio1` left join `bdclick2`.`bdoservicio` on((`bdclick2`.`bdoservicio`.`id` = `bdclick2`.`bdoservicio1`.`idFactura`))) left join `bdclick2`.`bdterceros` on((`bdclick2`.`bdoservicio1`.`cliente` = `bdclick2`.`bdterceros`.`idSistema`))) group by `bdclick2`.`bdoservicio1`.`idFactura`,`bdclick2`.`bdoservicio1`.`cliente`,`bdclick2`.`bdterceros`.`nombre`,`bdclick2`.`bdoservicio1`.`subtotalGeneral`,`bdclick2`.`bdoservicio1`.`ivaGeneral`,`bdclick2`.`bdoservicio1`.`totalGeneral`,`bdclick2`.`bdoservicio1`.`fechaFactura`,`bdclick2`.`bdoservicio1`.`anulada`,`bdclick2`.`bdoservicio1`.`rtIva`,`bdclick2`.`bdoservicio1`.`rtIca`,`bdclick2`.`bdoservicio1`.`rtFuente`,`bdclick2`.`bdoservicio1`.`otros`,`bdclick2`.`bdoservicio1`.`descuento`,`bdclick2`.`bdoservicio1`.`efectivoGeneral`,`bdclick2`.`bdoservicio1`.`NC`,`bdclick2`.`bdoservicio1`.`chequeGeneral`,`bdclick2`.`bdoservicio1`.`targetaGeneral`,`bdclick2`.`bdoservicio1`.`credito`,`bdclick2`.`bdoservicio1`.`bodega`,`bdclick2`.`bdoservicio`.`placa`,`bdclick2`.`bdoservicio`.`tipo`,`bdclick2`.`bdoservicio`.`modelo`,`bdclick2`.`bdoservicio`.`numeroChasis`,`bdclick2`.`bdoservicio1`.`estadoGeneral`,`bdclick2`.`bdoservicio`.`marca`,`bdclick2`.`bdoservicio`.`km`,`bdclick2`.`bdoservicio1`.`terminal`,`bdclick2`.`bdoservicio1`.`diasGarantia`,`bdclick2`.`bdterceros`.`id` having (`bdclick2`.`bdoservicio1`.`anulada` = 0)
mariadb-version=100135