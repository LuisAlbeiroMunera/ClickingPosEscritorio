TYPE=VIEW
query=select `bdclick1`.`bdoservicio1`.`idFactura` AS `idFactura`,`bdclick1`.`bdoservicio1`.`cliente` AS `cliente`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`bdclick1`.`bdoservicio1`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick1`.`bdoservicio1`.`ivaGeneral` AS `ivaGeneral`,`bdclick1`.`bdoservicio1`.`totalGeneral` AS `totalGeneral`,`bdclick1`.`bdoservicio1`.`fechaFactura` AS `fechaFactura`,`bdclick1`.`bdoservicio1`.`anulada` AS `anulada`,`bdclick1`.`bdoservicio1`.`rtIva` AS `rtIva`,`bdclick1`.`bdoservicio1`.`rtIca` AS `rtIca`,`bdclick1`.`bdoservicio1`.`rtFuente` AS `rtFuente`,`bdclick1`.`bdoservicio1`.`otros` AS `otros`,`bdclick1`.`bdoservicio1`.`descuento` AS `descuento`,`bdclick1`.`bdoservicio1`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick1`.`bdoservicio1`.`NC` AS `nc`,`bdclick1`.`bdoservicio1`.`chequeGeneral` AS `chequeGeneral`,`bdclick1`.`bdoservicio1`.`targetaGeneral` AS `targetaGeneral`,`bdclick1`.`bdoservicio1`.`credito` AS `credito`,`bdclick1`.`bdoservicio1`.`bodega` AS `bodega`,`bdclick1`.`bdoservicio`.`placa` AS `placa`,`bdclick1`.`bdoservicio`.`tipo` AS `tipo`,`bdclick1`.`bdoservicio`.`modelo` AS `modelo`,`bdclick1`.`bdoservicio`.`numeroChasis` AS `numeroChasis`,`bdclick1`.`bdoservicio1`.`estadoGeneral` AS `estadoGeneral`,`bdclick1`.`bdoservicio`.`marca` AS `marca`,`bdclick1`.`bdoservicio`.`km` AS `km`,`bdclick1`.`bdoservicio1`.`terminal` AS `terminal`,`bdclick1`.`bdoservicio1`.`diasGarantia` AS `diasGarantia`,`bdclick1`.`bdterceros`.`id` AS `idCliente` from ((`bdclick1`.`bdoservicio1` left join `bdclick1`.`bdoservicio` on((`bdclick1`.`bdoservicio`.`id` = `bdclick1`.`bdoservicio1`.`idFactura`))) left join `bdclick1`.`bdterceros` on((`bdclick1`.`bdoservicio1`.`cliente` = `bdclick1`.`bdterceros`.`idSistema`))) group by `bdclick1`.`bdoservicio1`.`idFactura`,`bdclick1`.`bdoservicio1`.`cliente`,`bdclick1`.`bdterceros`.`nombre`,`bdclick1`.`bdoservicio1`.`subtotalGeneral`,`bdclick1`.`bdoservicio1`.`ivaGeneral`,`bdclick1`.`bdoservicio1`.`totalGeneral`,`bdclick1`.`bdoservicio1`.`fechaFactura`,`bdclick1`.`bdoservicio1`.`anulada`,`bdclick1`.`bdoservicio1`.`rtIva`,`bdclick1`.`bdoservicio1`.`rtIca`,`bdclick1`.`bdoservicio1`.`rtFuente`,`bdclick1`.`bdoservicio1`.`otros`,`bdclick1`.`bdoservicio1`.`descuento`,`bdclick1`.`bdoservicio1`.`efectivoGeneral`,`bdclick1`.`bdoservicio1`.`NC`,`bdclick1`.`bdoservicio1`.`chequeGeneral`,`bdclick1`.`bdoservicio1`.`targetaGeneral`,`bdclick1`.`bdoservicio1`.`credito`,`bdclick1`.`bdoservicio1`.`bodega`,`bdclick1`.`bdoservicio`.`placa`,`bdclick1`.`bdoservicio`.`tipo`,`bdclick1`.`bdoservicio`.`modelo`,`bdclick1`.`bdoservicio`.`numeroChasis`,`bdclick1`.`bdoservicio1`.`estadoGeneral`,`bdclick1`.`bdoservicio`.`marca`,`bdclick1`.`bdoservicio`.`km`,`bdclick1`.`bdoservicio1`.`terminal`,`bdclick1`.`bdoservicio1`.`diasGarantia`,`bdclick1`.`bdterceros`.`id` having (`bdclick1`.`bdoservicio1`.`anulada` = 0)
md5=2f461bcd890e70dd148a7039dd9e0f32
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:37
create-version=2
source=select `bdoservicio1`.`idFactura` AS `idFactura`,`bdoservicio1`.`cliente` AS `cliente`,`bdterceros`.`nombre` AS `nombre`,`bdoservicio1`.`subtotalGeneral` AS `subtotalGeneral`,`bdoservicio1`.`ivaGeneral` AS `ivaGeneral`,`bdoservicio1`.`totalGeneral` AS `totalGeneral`,`bdoservicio1`.`fechaFactura` AS `fechaFactura`,`bdoservicio1`.`anulada` AS `anulada`,`bdoservicio1`.`rtIva` AS `rtIva`,`bdoservicio1`.`rtIca` AS `rtIca`,`bdoservicio1`.`rtFuente` AS `rtFuente`,`bdoservicio1`.`otros` AS `otros`,`bdoservicio1`.`descuento` AS `descuento`,`bdoservicio1`.`efectivoGeneral` AS `efectivoGeneral`,`bdoservicio1`.`NC` AS `nc`,`bdoservicio1`.`chequeGeneral` AS `chequeGeneral`,`bdoservicio1`.`targetaGeneral` AS `targetaGeneral`,`bdoservicio1`.`credito` AS `credito`,`bdoservicio1`.`bodega` AS `bodega`,`bdoservicio`.`placa` AS `placa`,`bdoservicio`.`tipo` AS `tipo`,`bdoservicio`.`modelo` AS `modelo`,`bdoservicio`.`numeroChasis` AS `numeroChasis`,`bdoservicio1`.`estadoGeneral` AS `estadoGeneral`,`bdoservicio`.`marca` AS `marca`,`bdoservicio`.`km` AS `km`,`bdoservicio1`.`terminal` AS `terminal`,`bdoservicio1`.`diasGarantia` AS `diasGarantia`,`bdterceros`.`id` AS `idCliente` from ((`bdoservicio1` left join `bdoservicio` on((`bdoservicio`.`id` = `bdoservicio1`.`idFactura`))) left join `bdterceros` on((`bdoservicio1`.`cliente` = `bdterceros`.`idSistema`))) group by `bdoservicio1`.`idFactura`,`bdoservicio1`.`cliente`,`bdterceros`.`nombre`,`bdoservicio1`.`subtotalGeneral`,`bdoservicio1`.`ivaGeneral`,`bdoservicio1`.`totalGeneral`,`bdoservicio1`.`fechaFactura`,`bdoservicio1`.`anulada`,`bdoservicio1`.`rtIva`,`bdoservicio1`.`rtIca`,`bdoservicio1`.`rtFuente`,`bdoservicio1`.`otros`,`bdoservicio1`.`descuento`,`bdoservicio1`.`efectivoGeneral`,`bdoservicio1`.`NC`,`bdoservicio1`.`chequeGeneral`,`bdoservicio1`.`targetaGeneral`,`bdoservicio1`.`credito`,`bdoservicio1`.`bodega`,`bdoservicio`.`placa`,`bdoservicio`.`tipo`,`bdoservicio`.`modelo`,`bdoservicio`.`numeroChasis`,`bdoservicio1`.`estadoGeneral`,`bdoservicio`.`marca`,`bdoservicio`.`km`,`bdoservicio1`.`terminal`,`bdoservicio1`.`diasGarantia`,`bdterceros`.`id` having (`bdoservicio1`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdoservicio1`.`idFactura` AS `idFactura`,`bdclick1`.`bdoservicio1`.`cliente` AS `cliente`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`bdclick1`.`bdoservicio1`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick1`.`bdoservicio1`.`ivaGeneral` AS `ivaGeneral`,`bdclick1`.`bdoservicio1`.`totalGeneral` AS `totalGeneral`,`bdclick1`.`bdoservicio1`.`fechaFactura` AS `fechaFactura`,`bdclick1`.`bdoservicio1`.`anulada` AS `anulada`,`bdclick1`.`bdoservicio1`.`rtIva` AS `rtIva`,`bdclick1`.`bdoservicio1`.`rtIca` AS `rtIca`,`bdclick1`.`bdoservicio1`.`rtFuente` AS `rtFuente`,`bdclick1`.`bdoservicio1`.`otros` AS `otros`,`bdclick1`.`bdoservicio1`.`descuento` AS `descuento`,`bdclick1`.`bdoservicio1`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick1`.`bdoservicio1`.`NC` AS `nc`,`bdclick1`.`bdoservicio1`.`chequeGeneral` AS `chequeGeneral`,`bdclick1`.`bdoservicio1`.`targetaGeneral` AS `targetaGeneral`,`bdclick1`.`bdoservicio1`.`credito` AS `credito`,`bdclick1`.`bdoservicio1`.`bodega` AS `bodega`,`bdclick1`.`bdoservicio`.`placa` AS `placa`,`bdclick1`.`bdoservicio`.`tipo` AS `tipo`,`bdclick1`.`bdoservicio`.`modelo` AS `modelo`,`bdclick1`.`bdoservicio`.`numeroChasis` AS `numeroChasis`,`bdclick1`.`bdoservicio1`.`estadoGeneral` AS `estadoGeneral`,`bdclick1`.`bdoservicio`.`marca` AS `marca`,`bdclick1`.`bdoservicio`.`km` AS `km`,`bdclick1`.`bdoservicio1`.`terminal` AS `terminal`,`bdclick1`.`bdoservicio1`.`diasGarantia` AS `diasGarantia`,`bdclick1`.`bdterceros`.`id` AS `idCliente` from ((`bdclick1`.`bdoservicio1` left join `bdclick1`.`bdoservicio` on((`bdclick1`.`bdoservicio`.`id` = `bdclick1`.`bdoservicio1`.`idFactura`))) left join `bdclick1`.`bdterceros` on((`bdclick1`.`bdoservicio1`.`cliente` = `bdclick1`.`bdterceros`.`idSistema`))) group by `bdclick1`.`bdoservicio1`.`idFactura`,`bdclick1`.`bdoservicio1`.`cliente`,`bdclick1`.`bdterceros`.`nombre`,`bdclick1`.`bdoservicio1`.`subtotalGeneral`,`bdclick1`.`bdoservicio1`.`ivaGeneral`,`bdclick1`.`bdoservicio1`.`totalGeneral`,`bdclick1`.`bdoservicio1`.`fechaFactura`,`bdclick1`.`bdoservicio1`.`anulada`,`bdclick1`.`bdoservicio1`.`rtIva`,`bdclick1`.`bdoservicio1`.`rtIca`,`bdclick1`.`bdoservicio1`.`rtFuente`,`bdclick1`.`bdoservicio1`.`otros`,`bdclick1`.`bdoservicio1`.`descuento`,`bdclick1`.`bdoservicio1`.`efectivoGeneral`,`bdclick1`.`bdoservicio1`.`NC`,`bdclick1`.`bdoservicio1`.`chequeGeneral`,`bdclick1`.`bdoservicio1`.`targetaGeneral`,`bdclick1`.`bdoservicio1`.`credito`,`bdclick1`.`bdoservicio1`.`bodega`,`bdclick1`.`bdoservicio`.`placa`,`bdclick1`.`bdoservicio`.`tipo`,`bdclick1`.`bdoservicio`.`modelo`,`bdclick1`.`bdoservicio`.`numeroChasis`,`bdclick1`.`bdoservicio1`.`estadoGeneral`,`bdclick1`.`bdoservicio`.`marca`,`bdclick1`.`bdoservicio`.`km`,`bdclick1`.`bdoservicio1`.`terminal`,`bdclick1`.`bdoservicio1`.`diasGarantia`,`bdclick1`.`bdterceros`.`id` having (`bdclick1`.`bdoservicio1`.`anulada` = 0)
mariadb-version=100135