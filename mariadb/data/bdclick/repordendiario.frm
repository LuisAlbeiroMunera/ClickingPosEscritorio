TYPE=VIEW
query=select `bdclick`.`bdoservicio1`.`idFactura` AS `idFactura`,`bdclick`.`bdoservicio1`.`cliente` AS `cliente`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdoservicio1`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick`.`bdoservicio1`.`ivaGeneral` AS `ivaGeneral`,`bdclick`.`bdoservicio1`.`totalGeneral` AS `totalGeneral`,`bdclick`.`bdoservicio1`.`fechaFactura` AS `fechaFactura`,`bdclick`.`bdoservicio1`.`anulada` AS `anulada`,`bdclick`.`bdoservicio1`.`rtIva` AS `rtIva`,`bdclick`.`bdoservicio1`.`rtIca` AS `rtIca`,`bdclick`.`bdoservicio1`.`rtFuente` AS `rtFuente`,`bdclick`.`bdoservicio1`.`otros` AS `otros`,`bdclick`.`bdoservicio1`.`descuento` AS `descuento`,`bdclick`.`bdoservicio1`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick`.`bdoservicio1`.`NC` AS `nc`,`bdclick`.`bdoservicio1`.`chequeGeneral` AS `chequeGeneral`,`bdclick`.`bdoservicio1`.`targetaGeneral` AS `targetaGeneral`,`bdclick`.`bdoservicio1`.`credito` AS `credito`,`bdclick`.`bdoservicio1`.`bodega` AS `bodega`,`bdclick`.`bdoservicio`.`placa` AS `placa`,`bdclick`.`bdoservicio`.`tipo` AS `tipo`,`bdclick`.`bdoservicio`.`modelo` AS `modelo`,`bdclick`.`bdoservicio`.`numeroChasis` AS `numeroChasis`,`bdclick`.`bdoservicio1`.`estadoGeneral` AS `estadoGeneral`,`bdclick`.`bdoservicio`.`marca` AS `marca`,`bdclick`.`bdoservicio`.`km` AS `km`,`bdclick`.`bdoservicio1`.`terminal` AS `terminal`,`bdclick`.`bdoservicio1`.`diasGarantia` AS `diasGarantia`,`bdclick`.`bdterceros`.`id` AS `idCliente` from ((`bdclick`.`bdoservicio1` left join `bdclick`.`bdoservicio` on((`bdclick`.`bdoservicio`.`id` = `bdclick`.`bdoservicio1`.`idFactura`))) left join `bdclick`.`bdterceros` on((`bdclick`.`bdoservicio1`.`cliente` = `bdclick`.`bdterceros`.`idSistema`))) group by `bdclick`.`bdoservicio1`.`idFactura`,`bdclick`.`bdoservicio1`.`cliente`,`bdclick`.`bdterceros`.`nombre`,`bdclick`.`bdoservicio1`.`subtotalGeneral`,`bdclick`.`bdoservicio1`.`ivaGeneral`,`bdclick`.`bdoservicio1`.`totalGeneral`,`bdclick`.`bdoservicio1`.`fechaFactura`,`bdclick`.`bdoservicio1`.`anulada`,`bdclick`.`bdoservicio1`.`rtIva`,`bdclick`.`bdoservicio1`.`rtIca`,`bdclick`.`bdoservicio1`.`rtFuente`,`bdclick`.`bdoservicio1`.`otros`,`bdclick`.`bdoservicio1`.`descuento`,`bdclick`.`bdoservicio1`.`efectivoGeneral`,`bdclick`.`bdoservicio1`.`NC`,`bdclick`.`bdoservicio1`.`chequeGeneral`,`bdclick`.`bdoservicio1`.`targetaGeneral`,`bdclick`.`bdoservicio1`.`credito`,`bdclick`.`bdoservicio1`.`bodega`,`bdclick`.`bdoservicio`.`placa`,`bdclick`.`bdoservicio`.`tipo`,`bdclick`.`bdoservicio`.`modelo`,`bdclick`.`bdoservicio`.`numeroChasis`,`bdclick`.`bdoservicio1`.`estadoGeneral`,`bdclick`.`bdoservicio`.`marca`,`bdclick`.`bdoservicio`.`km`,`bdclick`.`bdoservicio1`.`terminal`,`bdclick`.`bdoservicio1`.`diasGarantia`,`bdclick`.`bdterceros`.`id` having (`bdclick`.`bdoservicio1`.`anulada` = 0)
md5=27c490251a425311ff45222cf3743f3e
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:27
create-version=2
source=select `bdoservicio1`.`idFactura` AS `idFactura`,`bdoservicio1`.`cliente` AS `cliente`,`bdterceros`.`nombre` AS `nombre`,`bdoservicio1`.`subtotalGeneral` AS `subtotalGeneral`,`bdoservicio1`.`ivaGeneral` AS `ivaGeneral`,`bdoservicio1`.`totalGeneral` AS `totalGeneral`,`bdoservicio1`.`fechaFactura` AS `fechaFactura`,`bdoservicio1`.`anulada` AS `anulada`,`bdoservicio1`.`rtIva` AS `rtIva`,`bdoservicio1`.`rtIca` AS `rtIca`,`bdoservicio1`.`rtFuente` AS `rtFuente`,`bdoservicio1`.`otros` AS `otros`,`bdoservicio1`.`descuento` AS `descuento`,`bdoservicio1`.`efectivoGeneral` AS `efectivoGeneral`,`bdoservicio1`.`NC` AS `nc`,`bdoservicio1`.`chequeGeneral` AS `chequeGeneral`,`bdoservicio1`.`targetaGeneral` AS `targetaGeneral`,`bdoservicio1`.`credito` AS `credito`,`bdoservicio1`.`bodega` AS `bodega`,`bdoservicio`.`placa` AS `placa`,`bdoservicio`.`tipo` AS `tipo`,`bdoservicio`.`modelo` AS `modelo`,`bdoservicio`.`numeroChasis` AS `numeroChasis`,`bdoservicio1`.`estadoGeneral` AS `estadoGeneral`,`bdoservicio`.`marca` AS `marca`,`bdoservicio`.`km` AS `km`,`bdoservicio1`.`terminal` AS `terminal`,`bdoservicio1`.`diasGarantia` AS `diasGarantia`,`bdterceros`.`id` AS `idCliente` from ((`bdoservicio1` left join `bdoservicio` on((`bdoservicio`.`id` = `bdoservicio1`.`idFactura`))) left join `bdterceros` on((`bdoservicio1`.`cliente` = `bdterceros`.`idSistema`))) group by `bdoservicio1`.`idFactura`,`bdoservicio1`.`cliente`,`bdterceros`.`nombre`,`bdoservicio1`.`subtotalGeneral`,`bdoservicio1`.`ivaGeneral`,`bdoservicio1`.`totalGeneral`,`bdoservicio1`.`fechaFactura`,`bdoservicio1`.`anulada`,`bdoservicio1`.`rtIva`,`bdoservicio1`.`rtIca`,`bdoservicio1`.`rtFuente`,`bdoservicio1`.`otros`,`bdoservicio1`.`descuento`,`bdoservicio1`.`efectivoGeneral`,`bdoservicio1`.`NC`,`bdoservicio1`.`chequeGeneral`,`bdoservicio1`.`targetaGeneral`,`bdoservicio1`.`credito`,`bdoservicio1`.`bodega`,`bdoservicio`.`placa`,`bdoservicio`.`tipo`,`bdoservicio`.`modelo`,`bdoservicio`.`numeroChasis`,`bdoservicio1`.`estadoGeneral`,`bdoservicio`.`marca`,`bdoservicio`.`km`,`bdoservicio1`.`terminal`,`bdoservicio1`.`diasGarantia`,`bdterceros`.`id` having (`bdoservicio1`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdoservicio1`.`idFactura` AS `idFactura`,`bdclick`.`bdoservicio1`.`cliente` AS `cliente`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdoservicio1`.`subtotalGeneral` AS `subtotalGeneral`,`bdclick`.`bdoservicio1`.`ivaGeneral` AS `ivaGeneral`,`bdclick`.`bdoservicio1`.`totalGeneral` AS `totalGeneral`,`bdclick`.`bdoservicio1`.`fechaFactura` AS `fechaFactura`,`bdclick`.`bdoservicio1`.`anulada` AS `anulada`,`bdclick`.`bdoservicio1`.`rtIva` AS `rtIva`,`bdclick`.`bdoservicio1`.`rtIca` AS `rtIca`,`bdclick`.`bdoservicio1`.`rtFuente` AS `rtFuente`,`bdclick`.`bdoservicio1`.`otros` AS `otros`,`bdclick`.`bdoservicio1`.`descuento` AS `descuento`,`bdclick`.`bdoservicio1`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick`.`bdoservicio1`.`NC` AS `nc`,`bdclick`.`bdoservicio1`.`chequeGeneral` AS `chequeGeneral`,`bdclick`.`bdoservicio1`.`targetaGeneral` AS `targetaGeneral`,`bdclick`.`bdoservicio1`.`credito` AS `credito`,`bdclick`.`bdoservicio1`.`bodega` AS `bodega`,`bdclick`.`bdoservicio`.`placa` AS `placa`,`bdclick`.`bdoservicio`.`tipo` AS `tipo`,`bdclick`.`bdoservicio`.`modelo` AS `modelo`,`bdclick`.`bdoservicio`.`numeroChasis` AS `numeroChasis`,`bdclick`.`bdoservicio1`.`estadoGeneral` AS `estadoGeneral`,`bdclick`.`bdoservicio`.`marca` AS `marca`,`bdclick`.`bdoservicio`.`km` AS `km`,`bdclick`.`bdoservicio1`.`terminal` AS `terminal`,`bdclick`.`bdoservicio1`.`diasGarantia` AS `diasGarantia`,`bdclick`.`bdterceros`.`id` AS `idCliente` from ((`bdclick`.`bdoservicio1` left join `bdclick`.`bdoservicio` on((`bdclick`.`bdoservicio`.`id` = `bdclick`.`bdoservicio1`.`idFactura`))) left join `bdclick`.`bdterceros` on((`bdclick`.`bdoservicio1`.`cliente` = `bdclick`.`bdterceros`.`idSistema`))) group by `bdclick`.`bdoservicio1`.`idFactura`,`bdclick`.`bdoservicio1`.`cliente`,`bdclick`.`bdterceros`.`nombre`,`bdclick`.`bdoservicio1`.`subtotalGeneral`,`bdclick`.`bdoservicio1`.`ivaGeneral`,`bdclick`.`bdoservicio1`.`totalGeneral`,`bdclick`.`bdoservicio1`.`fechaFactura`,`bdclick`.`bdoservicio1`.`anulada`,`bdclick`.`bdoservicio1`.`rtIva`,`bdclick`.`bdoservicio1`.`rtIca`,`bdclick`.`bdoservicio1`.`rtFuente`,`bdclick`.`bdoservicio1`.`otros`,`bdclick`.`bdoservicio1`.`descuento`,`bdclick`.`bdoservicio1`.`efectivoGeneral`,`bdclick`.`bdoservicio1`.`NC`,`bdclick`.`bdoservicio1`.`chequeGeneral`,`bdclick`.`bdoservicio1`.`targetaGeneral`,`bdclick`.`bdoservicio1`.`credito`,`bdclick`.`bdoservicio1`.`bodega`,`bdclick`.`bdoservicio`.`placa`,`bdclick`.`bdoservicio`.`tipo`,`bdclick`.`bdoservicio`.`modelo`,`bdclick`.`bdoservicio`.`numeroChasis`,`bdclick`.`bdoservicio1`.`estadoGeneral`,`bdclick`.`bdoservicio`.`marca`,`bdclick`.`bdoservicio`.`km`,`bdclick`.`bdoservicio1`.`terminal`,`bdclick`.`bdoservicio1`.`diasGarantia`,`bdclick`.`bdterceros`.`id` having (`bdclick`.`bdoservicio1`.`anulada` = 0)
mariadb-version=100135
