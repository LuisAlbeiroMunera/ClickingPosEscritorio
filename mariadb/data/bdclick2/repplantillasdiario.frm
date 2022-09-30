TYPE=VIEW
query=select `bdclick2`.`bdcuentacobro`.`idFactura` AS `id`,cast(substr(`bdclick2`.`bdcuentacobro`.`idFactura`,8,100) as signed) AS `id2`,`bdclick2`.`bdcuentacobro`.`cliente` AS `cliente`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,`bdclick2`.`bdcuentacobro`.`subtotalGeneral` AS `subtotal`,`bdclick2`.`bdcuentacobro`.`ivaGeneral` AS `iva`,`bdclick2`.`bdcuentacobro`.`totalGeneral` AS `total`,`bdclick2`.`bdcuentacobro`.`fechaFactura` AS `fechaFactura`,`bdclick2`.`bdcuentacobro`.`anulada` AS `anulada`,`bdclick2`.`bdcuentacobro`.`rtIva` AS `rtIva`,`bdclick2`.`bdcuentacobro`.`rtIca` AS `rtIca`,`bdclick2`.`bdcuentacobro`.`rtFuente` AS `rtFuente`,`bdclick2`.`bdcuentacobro`.`otros` AS `otros`,`bdclick2`.`bdcuentacobro`.`descuentoGeneral` AS `descuento`,`bdclick2`.`bdcuentacobro`.`efectivoGeneral` AS `efectivo`,if((`bdclick2`.`bdcuentacobro`.`NC` = \'\'),\'0\',`bdclick2`.`bdcuentacobro`.`NC`) AS `nc`,`bdclick2`.`bdcuentacobro`.`chequeGeneral` AS `cheque`,`bdclick2`.`bdcuentacobro`.`targetaGeneral` AS `targeta`,`bdclick2`.`bdcuentacobro`.`credito` AS `credito`,`bdclick2`.`bdcuentacobro`.`bodega` AS `bodega`,`bdclick2`.`bdcuentacobro`.`preparacion` AS `periodicidad`,`bdclick2`.`bdcuentacobro`.`inicio` AS `inicio`,`bdclick2`.`bdcuentacobro`.`hasta` AS `hasta`,`bdclick2`.`bdcuentacobro`.`fechaUltimoPago` AS `fechaUltimoPago`,`bdclick2`.`bdcuentacobro`.`cantIncremento` AS `cantIncremento`,`bdclick2`.`bdterceros`.`id` AS `idTercero` from (`bdclick2`.`bdterceros` left join `bdclick2`.`bdcuentacobro` on((`bdclick2`.`bdcuentacobro`.`cliente` = `bdclick2`.`bdterceros`.`idSistema`))) group by `bdclick2`.`bdcuentacobro`.`idFactura`,`bdclick2`.`bdcuentacobro`.`factura`,`bdclick2`.`bdcuentacobro`.`cliente`,`bdclick2`.`bdterceros`.`nombre`,`bdclick2`.`bdcuentacobro`.`subtotalGeneral`,`bdclick2`.`bdcuentacobro`.`ivaGeneral`,`bdclick2`.`bdcuentacobro`.`totalGeneral`,`bdclick2`.`bdcuentacobro`.`fechaFactura`,`bdclick2`.`bdcuentacobro`.`anulada`,`bdclick2`.`bdcuentacobro`.`rtIva`,`bdclick2`.`bdcuentacobro`.`rtIca`,`bdclick2`.`bdcuentacobro`.`rtFuente`,`bdclick2`.`bdcuentacobro`.`otros`,`bdclick2`.`bdcuentacobro`.`descuentoGeneral`,`bdclick2`.`bdcuentacobro`.`efectivoGeneral`,if((`bdclick2`.`bdcuentacobro`.`NC` = \'\'),\'0\',`bdclick2`.`bdcuentacobro`.`NC`),`bdclick2`.`bdcuentacobro`.`chequeGeneral`,`bdclick2`.`bdcuentacobro`.`targetaGeneral`,`bdclick2`.`bdcuentacobro`.`credito`,`bdclick2`.`bdcuentacobro`.`bodega`,`bdclick2`.`bdcuentacobro`.`preparacion`,`bdclick2`.`bdcuentacobro`.`inicio`,`bdclick2`.`bdcuentacobro`.`hasta`,`bdclick2`.`bdcuentacobro`.`fechaUltimoPago`,`bdclick2`.`bdcuentacobro`.`cantIncremento`,`bdclick2`.`bdterceros`.`id` having (`bdclick2`.`bdcuentacobro`.`anulada` = 0)
md5=4d2a0b5bc89174defd8fef32635e04ae
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:48
create-version=2
source=select `bdcuentacobro`.`idFactura` AS `id`,cast(substr(`bdcuentacobro`.`idFactura`,8,100) as signed) AS `id2`,`bdcuentacobro`.`cliente` AS `cliente`,`bdterceros`.`nombre` AS `nombre`,`bdcuentacobro`.`subtotalGeneral` AS `subtotal`,`bdcuentacobro`.`ivaGeneral` AS `iva`,`bdcuentacobro`.`totalGeneral` AS `total`,`bdcuentacobro`.`fechaFactura` AS `fechaFactura`,`bdcuentacobro`.`anulada` AS `anulada`,`bdcuentacobro`.`rtIva` AS `rtIva`,`bdcuentacobro`.`rtIca` AS `rtIca`,`bdcuentacobro`.`rtFuente` AS `rtFuente`,`bdcuentacobro`.`otros` AS `otros`,`bdcuentacobro`.`descuentoGeneral` AS `descuento`,`bdcuentacobro`.`efectivoGeneral` AS `efectivo`,if((`bdcuentacobro`.`NC` = \'\'),\'0\',`bdcuentacobro`.`NC`) AS `nc`,`bdcuentacobro`.`chequeGeneral` AS `cheque`,`bdcuentacobro`.`targetaGeneral` AS `targeta`,`bdcuentacobro`.`credito` AS `credito`,`bdcuentacobro`.`bodega` AS `bodega`,`bdcuentacobro`.`preparacion` AS `periodicidad`,`bdcuentacobro`.`inicio` AS `inicio`,`bdcuentacobro`.`hasta` AS `hasta`,`bdcuentacobro`.`fechaUltimoPago` AS `fechaUltimoPago`,`bdcuentacobro`.`cantIncremento` AS `cantIncremento`,`bdterceros`.`id` AS `idTercero` from (`bdterceros` left join `bdcuentacobro` on((`bdcuentacobro`.`cliente` = `bdterceros`.`idSistema`))) group by `bdcuentacobro`.`idFactura`,`bdcuentacobro`.`factura`,`bdcuentacobro`.`cliente`,`bdterceros`.`nombre`,`bdcuentacobro`.`subtotalGeneral`,`bdcuentacobro`.`ivaGeneral`,`bdcuentacobro`.`totalGeneral`,`bdcuentacobro`.`fechaFactura`,`bdcuentacobro`.`anulada`,`bdcuentacobro`.`rtIva`,`bdcuentacobro`.`rtIca`,`bdcuentacobro`.`rtFuente`,`bdcuentacobro`.`otros`,`bdcuentacobro`.`descuentoGeneral`,`bdcuentacobro`.`efectivoGeneral`,if((`bdcuentacobro`.`NC` = \'\'),\'0\',`bdcuentacobro`.`NC`),`bdcuentacobro`.`chequeGeneral`,`bdcuentacobro`.`targetaGeneral`,`bdcuentacobro`.`credito`,`bdcuentacobro`.`bodega`,`bdcuentacobro`.`preparacion`,`bdcuentacobro`.`inicio`,`bdcuentacobro`.`hasta`,`bdcuentacobro`.`fechaUltimoPago`,`bdcuentacobro`.`cantIncremento`,`bdterceros`.`id` having (`bdcuentacobro`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdcuentacobro`.`idFactura` AS `id`,cast(substr(`bdclick2`.`bdcuentacobro`.`idFactura`,8,100) as signed) AS `id2`,`bdclick2`.`bdcuentacobro`.`cliente` AS `cliente`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,`bdclick2`.`bdcuentacobro`.`subtotalGeneral` AS `subtotal`,`bdclick2`.`bdcuentacobro`.`ivaGeneral` AS `iva`,`bdclick2`.`bdcuentacobro`.`totalGeneral` AS `total`,`bdclick2`.`bdcuentacobro`.`fechaFactura` AS `fechaFactura`,`bdclick2`.`bdcuentacobro`.`anulada` AS `anulada`,`bdclick2`.`bdcuentacobro`.`rtIva` AS `rtIva`,`bdclick2`.`bdcuentacobro`.`rtIca` AS `rtIca`,`bdclick2`.`bdcuentacobro`.`rtFuente` AS `rtFuente`,`bdclick2`.`bdcuentacobro`.`otros` AS `otros`,`bdclick2`.`bdcuentacobro`.`descuentoGeneral` AS `descuento`,`bdclick2`.`bdcuentacobro`.`efectivoGeneral` AS `efectivo`,if((`bdclick2`.`bdcuentacobro`.`NC` = \'\'),\'0\',`bdclick2`.`bdcuentacobro`.`NC`) AS `nc`,`bdclick2`.`bdcuentacobro`.`chequeGeneral` AS `cheque`,`bdclick2`.`bdcuentacobro`.`targetaGeneral` AS `targeta`,`bdclick2`.`bdcuentacobro`.`credito` AS `credito`,`bdclick2`.`bdcuentacobro`.`bodega` AS `bodega`,`bdclick2`.`bdcuentacobro`.`preparacion` AS `periodicidad`,`bdclick2`.`bdcuentacobro`.`inicio` AS `inicio`,`bdclick2`.`bdcuentacobro`.`hasta` AS `hasta`,`bdclick2`.`bdcuentacobro`.`fechaUltimoPago` AS `fechaUltimoPago`,`bdclick2`.`bdcuentacobro`.`cantIncremento` AS `cantIncremento`,`bdclick2`.`bdterceros`.`id` AS `idTercero` from (`bdclick2`.`bdterceros` left join `bdclick2`.`bdcuentacobro` on((`bdclick2`.`bdcuentacobro`.`cliente` = `bdclick2`.`bdterceros`.`idSistema`))) group by `bdclick2`.`bdcuentacobro`.`idFactura`,`bdclick2`.`bdcuentacobro`.`factura`,`bdclick2`.`bdcuentacobro`.`cliente`,`bdclick2`.`bdterceros`.`nombre`,`bdclick2`.`bdcuentacobro`.`subtotalGeneral`,`bdclick2`.`bdcuentacobro`.`ivaGeneral`,`bdclick2`.`bdcuentacobro`.`totalGeneral`,`bdclick2`.`bdcuentacobro`.`fechaFactura`,`bdclick2`.`bdcuentacobro`.`anulada`,`bdclick2`.`bdcuentacobro`.`rtIva`,`bdclick2`.`bdcuentacobro`.`rtIca`,`bdclick2`.`bdcuentacobro`.`rtFuente`,`bdclick2`.`bdcuentacobro`.`otros`,`bdclick2`.`bdcuentacobro`.`descuentoGeneral`,`bdclick2`.`bdcuentacobro`.`efectivoGeneral`,if((`bdclick2`.`bdcuentacobro`.`NC` = \'\'),\'0\',`bdclick2`.`bdcuentacobro`.`NC`),`bdclick2`.`bdcuentacobro`.`chequeGeneral`,`bdclick2`.`bdcuentacobro`.`targetaGeneral`,`bdclick2`.`bdcuentacobro`.`credito`,`bdclick2`.`bdcuentacobro`.`bodega`,`bdclick2`.`bdcuentacobro`.`preparacion`,`bdclick2`.`bdcuentacobro`.`inicio`,`bdclick2`.`bdcuentacobro`.`hasta`,`bdclick2`.`bdcuentacobro`.`fechaUltimoPago`,`bdclick2`.`bdcuentacobro`.`cantIncremento`,`bdclick2`.`bdterceros`.`id` having (`bdclick2`.`bdcuentacobro`.`anulada` = 0)
mariadb-version=100135