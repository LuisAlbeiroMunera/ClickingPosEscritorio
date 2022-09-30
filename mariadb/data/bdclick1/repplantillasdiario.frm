TYPE=VIEW
query=select `bdclick1`.`bdcuentacobro`.`idFactura` AS `id`,cast(substr(`bdclick1`.`bdcuentacobro`.`idFactura`,8,100) as signed) AS `id2`,`bdclick1`.`bdcuentacobro`.`cliente` AS `cliente`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`bdclick1`.`bdcuentacobro`.`subtotalGeneral` AS `subtotal`,`bdclick1`.`bdcuentacobro`.`ivaGeneral` AS `iva`,`bdclick1`.`bdcuentacobro`.`totalGeneral` AS `total`,`bdclick1`.`bdcuentacobro`.`fechaFactura` AS `fechaFactura`,`bdclick1`.`bdcuentacobro`.`anulada` AS `anulada`,`bdclick1`.`bdcuentacobro`.`rtIva` AS `rtIva`,`bdclick1`.`bdcuentacobro`.`rtIca` AS `rtIca`,`bdclick1`.`bdcuentacobro`.`rtFuente` AS `rtFuente`,`bdclick1`.`bdcuentacobro`.`otros` AS `otros`,`bdclick1`.`bdcuentacobro`.`descuentoGeneral` AS `descuento`,`bdclick1`.`bdcuentacobro`.`efectivoGeneral` AS `efectivo`,if((`bdclick1`.`bdcuentacobro`.`NC` = \'\'),\'0\',`bdclick1`.`bdcuentacobro`.`NC`) AS `nc`,`bdclick1`.`bdcuentacobro`.`chequeGeneral` AS `cheque`,`bdclick1`.`bdcuentacobro`.`targetaGeneral` AS `targeta`,`bdclick1`.`bdcuentacobro`.`credito` AS `credito`,`bdclick1`.`bdcuentacobro`.`bodega` AS `bodega`,`bdclick1`.`bdcuentacobro`.`preparacion` AS `periodicidad`,`bdclick1`.`bdcuentacobro`.`inicio` AS `inicio`,`bdclick1`.`bdcuentacobro`.`hasta` AS `hasta`,`bdclick1`.`bdcuentacobro`.`fechaUltimoPago` AS `fechaUltimoPago`,`bdclick1`.`bdcuentacobro`.`cantIncremento` AS `cantIncremento`,`bdclick1`.`bdterceros`.`id` AS `idTercero` from (`bdclick1`.`bdterceros` left join `bdclick1`.`bdcuentacobro` on((`bdclick1`.`bdcuentacobro`.`cliente` = `bdclick1`.`bdterceros`.`idSistema`))) group by `bdclick1`.`bdcuentacobro`.`idFactura`,`bdclick1`.`bdcuentacobro`.`factura`,`bdclick1`.`bdcuentacobro`.`cliente`,`bdclick1`.`bdterceros`.`nombre`,`bdclick1`.`bdcuentacobro`.`subtotalGeneral`,`bdclick1`.`bdcuentacobro`.`ivaGeneral`,`bdclick1`.`bdcuentacobro`.`totalGeneral`,`bdclick1`.`bdcuentacobro`.`fechaFactura`,`bdclick1`.`bdcuentacobro`.`anulada`,`bdclick1`.`bdcuentacobro`.`rtIva`,`bdclick1`.`bdcuentacobro`.`rtIca`,`bdclick1`.`bdcuentacobro`.`rtFuente`,`bdclick1`.`bdcuentacobro`.`otros`,`bdclick1`.`bdcuentacobro`.`descuentoGeneral`,`bdclick1`.`bdcuentacobro`.`efectivoGeneral`,if((`bdclick1`.`bdcuentacobro`.`NC` = \'\'),\'0\',`bdclick1`.`bdcuentacobro`.`NC`),`bdclick1`.`bdcuentacobro`.`chequeGeneral`,`bdclick1`.`bdcuentacobro`.`targetaGeneral`,`bdclick1`.`bdcuentacobro`.`credito`,`bdclick1`.`bdcuentacobro`.`bodega`,`bdclick1`.`bdcuentacobro`.`preparacion`,`bdclick1`.`bdcuentacobro`.`inicio`,`bdclick1`.`bdcuentacobro`.`hasta`,`bdclick1`.`bdcuentacobro`.`fechaUltimoPago`,`bdclick1`.`bdcuentacobro`.`cantIncremento`,`bdclick1`.`bdterceros`.`id` having (`bdclick1`.`bdcuentacobro`.`anulada` = 0)
md5=904b391626646d3486ebd74896865c92
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:37
create-version=2
source=select `bdcuentacobro`.`idFactura` AS `id`,cast(substr(`bdcuentacobro`.`idFactura`,8,100) as signed) AS `id2`,`bdcuentacobro`.`cliente` AS `cliente`,`bdterceros`.`nombre` AS `nombre`,`bdcuentacobro`.`subtotalGeneral` AS `subtotal`,`bdcuentacobro`.`ivaGeneral` AS `iva`,`bdcuentacobro`.`totalGeneral` AS `total`,`bdcuentacobro`.`fechaFactura` AS `fechaFactura`,`bdcuentacobro`.`anulada` AS `anulada`,`bdcuentacobro`.`rtIva` AS `rtIva`,`bdcuentacobro`.`rtIca` AS `rtIca`,`bdcuentacobro`.`rtFuente` AS `rtFuente`,`bdcuentacobro`.`otros` AS `otros`,`bdcuentacobro`.`descuentoGeneral` AS `descuento`,`bdcuentacobro`.`efectivoGeneral` AS `efectivo`,if((`bdcuentacobro`.`NC` = \'\'),\'0\',`bdcuentacobro`.`NC`) AS `nc`,`bdcuentacobro`.`chequeGeneral` AS `cheque`,`bdcuentacobro`.`targetaGeneral` AS `targeta`,`bdcuentacobro`.`credito` AS `credito`,`bdcuentacobro`.`bodega` AS `bodega`,`bdcuentacobro`.`preparacion` AS `periodicidad`,`bdcuentacobro`.`inicio` AS `inicio`,`bdcuentacobro`.`hasta` AS `hasta`,`bdcuentacobro`.`fechaUltimoPago` AS `fechaUltimoPago`,`bdcuentacobro`.`cantIncremento` AS `cantIncremento`,`bdterceros`.`id` AS `idTercero` from (`bdterceros` left join `bdcuentacobro` on((`bdcuentacobro`.`cliente` = `bdterceros`.`idSistema`))) group by `bdcuentacobro`.`idFactura`,`bdcuentacobro`.`factura`,`bdcuentacobro`.`cliente`,`bdterceros`.`nombre`,`bdcuentacobro`.`subtotalGeneral`,`bdcuentacobro`.`ivaGeneral`,`bdcuentacobro`.`totalGeneral`,`bdcuentacobro`.`fechaFactura`,`bdcuentacobro`.`anulada`,`bdcuentacobro`.`rtIva`,`bdcuentacobro`.`rtIca`,`bdcuentacobro`.`rtFuente`,`bdcuentacobro`.`otros`,`bdcuentacobro`.`descuentoGeneral`,`bdcuentacobro`.`efectivoGeneral`,if((`bdcuentacobro`.`NC` = \'\'),\'0\',`bdcuentacobro`.`NC`),`bdcuentacobro`.`chequeGeneral`,`bdcuentacobro`.`targetaGeneral`,`bdcuentacobro`.`credito`,`bdcuentacobro`.`bodega`,`bdcuentacobro`.`preparacion`,`bdcuentacobro`.`inicio`,`bdcuentacobro`.`hasta`,`bdcuentacobro`.`fechaUltimoPago`,`bdcuentacobro`.`cantIncremento`,`bdterceros`.`id` having (`bdcuentacobro`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdcuentacobro`.`idFactura` AS `id`,cast(substr(`bdclick1`.`bdcuentacobro`.`idFactura`,8,100) as signed) AS `id2`,`bdclick1`.`bdcuentacobro`.`cliente` AS `cliente`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`bdclick1`.`bdcuentacobro`.`subtotalGeneral` AS `subtotal`,`bdclick1`.`bdcuentacobro`.`ivaGeneral` AS `iva`,`bdclick1`.`bdcuentacobro`.`totalGeneral` AS `total`,`bdclick1`.`bdcuentacobro`.`fechaFactura` AS `fechaFactura`,`bdclick1`.`bdcuentacobro`.`anulada` AS `anulada`,`bdclick1`.`bdcuentacobro`.`rtIva` AS `rtIva`,`bdclick1`.`bdcuentacobro`.`rtIca` AS `rtIca`,`bdclick1`.`bdcuentacobro`.`rtFuente` AS `rtFuente`,`bdclick1`.`bdcuentacobro`.`otros` AS `otros`,`bdclick1`.`bdcuentacobro`.`descuentoGeneral` AS `descuento`,`bdclick1`.`bdcuentacobro`.`efectivoGeneral` AS `efectivo`,if((`bdclick1`.`bdcuentacobro`.`NC` = \'\'),\'0\',`bdclick1`.`bdcuentacobro`.`NC`) AS `nc`,`bdclick1`.`bdcuentacobro`.`chequeGeneral` AS `cheque`,`bdclick1`.`bdcuentacobro`.`targetaGeneral` AS `targeta`,`bdclick1`.`bdcuentacobro`.`credito` AS `credito`,`bdclick1`.`bdcuentacobro`.`bodega` AS `bodega`,`bdclick1`.`bdcuentacobro`.`preparacion` AS `periodicidad`,`bdclick1`.`bdcuentacobro`.`inicio` AS `inicio`,`bdclick1`.`bdcuentacobro`.`hasta` AS `hasta`,`bdclick1`.`bdcuentacobro`.`fechaUltimoPago` AS `fechaUltimoPago`,`bdclick1`.`bdcuentacobro`.`cantIncremento` AS `cantIncremento`,`bdclick1`.`bdterceros`.`id` AS `idTercero` from (`bdclick1`.`bdterceros` left join `bdclick1`.`bdcuentacobro` on((`bdclick1`.`bdcuentacobro`.`cliente` = `bdclick1`.`bdterceros`.`idSistema`))) group by `bdclick1`.`bdcuentacobro`.`idFactura`,`bdclick1`.`bdcuentacobro`.`factura`,`bdclick1`.`bdcuentacobro`.`cliente`,`bdclick1`.`bdterceros`.`nombre`,`bdclick1`.`bdcuentacobro`.`subtotalGeneral`,`bdclick1`.`bdcuentacobro`.`ivaGeneral`,`bdclick1`.`bdcuentacobro`.`totalGeneral`,`bdclick1`.`bdcuentacobro`.`fechaFactura`,`bdclick1`.`bdcuentacobro`.`anulada`,`bdclick1`.`bdcuentacobro`.`rtIva`,`bdclick1`.`bdcuentacobro`.`rtIca`,`bdclick1`.`bdcuentacobro`.`rtFuente`,`bdclick1`.`bdcuentacobro`.`otros`,`bdclick1`.`bdcuentacobro`.`descuentoGeneral`,`bdclick1`.`bdcuentacobro`.`efectivoGeneral`,if((`bdclick1`.`bdcuentacobro`.`NC` = \'\'),\'0\',`bdclick1`.`bdcuentacobro`.`NC`),`bdclick1`.`bdcuentacobro`.`chequeGeneral`,`bdclick1`.`bdcuentacobro`.`targetaGeneral`,`bdclick1`.`bdcuentacobro`.`credito`,`bdclick1`.`bdcuentacobro`.`bodega`,`bdclick1`.`bdcuentacobro`.`preparacion`,`bdclick1`.`bdcuentacobro`.`inicio`,`bdclick1`.`bdcuentacobro`.`hasta`,`bdclick1`.`bdcuentacobro`.`fechaUltimoPago`,`bdclick1`.`bdcuentacobro`.`cantIncremento`,`bdclick1`.`bdterceros`.`id` having (`bdclick1`.`bdcuentacobro`.`anulada` = 0)
mariadb-version=100135
