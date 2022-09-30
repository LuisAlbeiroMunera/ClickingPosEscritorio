TYPE=VIEW
query=select `bdclick`.`bdcuentacobro`.`idFactura` AS `id`,cast(substr(`bdclick`.`bdcuentacobro`.`idFactura`,8,100) as signed) AS `id2`,`bdclick`.`bdcuentacobro`.`cliente` AS `cliente`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdcuentacobro`.`subtotalGeneral` AS `subtotal`,`bdclick`.`bdcuentacobro`.`ivaGeneral` AS `iva`,`bdclick`.`bdcuentacobro`.`totalGeneral` AS `total`,`bdclick`.`bdcuentacobro`.`fechaFactura` AS `fechaFactura`,`bdclick`.`bdcuentacobro`.`anulada` AS `anulada`,`bdclick`.`bdcuentacobro`.`rtIva` AS `rtIva`,`bdclick`.`bdcuentacobro`.`rtIca` AS `rtIca`,`bdclick`.`bdcuentacobro`.`rtFuente` AS `rtFuente`,`bdclick`.`bdcuentacobro`.`otros` AS `otros`,`bdclick`.`bdcuentacobro`.`descuentoGeneral` AS `descuento`,`bdclick`.`bdcuentacobro`.`efectivoGeneral` AS `efectivo`,if((`bdclick`.`bdcuentacobro`.`NC` = \'\'),\'0\',`bdclick`.`bdcuentacobro`.`NC`) AS `nc`,`bdclick`.`bdcuentacobro`.`chequeGeneral` AS `cheque`,`bdclick`.`bdcuentacobro`.`targetaGeneral` AS `targeta`,`bdclick`.`bdcuentacobro`.`credito` AS `credito`,`bdclick`.`bdcuentacobro`.`bodega` AS `bodega`,`bdclick`.`bdcuentacobro`.`preparacion` AS `periodicidad`,`bdclick`.`bdcuentacobro`.`inicio` AS `inicio`,`bdclick`.`bdcuentacobro`.`hasta` AS `hasta`,`bdclick`.`bdcuentacobro`.`fechaUltimoPago` AS `fechaUltimoPago`,`bdclick`.`bdcuentacobro`.`cantIncremento` AS `cantIncremento`,`bdclick`.`bdterceros`.`id` AS `idTercero` from (`bdclick`.`bdterceros` left join `bdclick`.`bdcuentacobro` on((`bdclick`.`bdcuentacobro`.`cliente` = `bdclick`.`bdterceros`.`idSistema`))) group by `bdclick`.`bdcuentacobro`.`idFactura`,`bdclick`.`bdcuentacobro`.`factura`,`bdclick`.`bdcuentacobro`.`cliente`,`bdclick`.`bdterceros`.`nombre`,`bdclick`.`bdcuentacobro`.`subtotalGeneral`,`bdclick`.`bdcuentacobro`.`ivaGeneral`,`bdclick`.`bdcuentacobro`.`totalGeneral`,`bdclick`.`bdcuentacobro`.`fechaFactura`,`bdclick`.`bdcuentacobro`.`anulada`,`bdclick`.`bdcuentacobro`.`rtIva`,`bdclick`.`bdcuentacobro`.`rtIca`,`bdclick`.`bdcuentacobro`.`rtFuente`,`bdclick`.`bdcuentacobro`.`otros`,`bdclick`.`bdcuentacobro`.`descuentoGeneral`,`bdclick`.`bdcuentacobro`.`efectivoGeneral`,if((`bdclick`.`bdcuentacobro`.`NC` = \'\'),\'0\',`bdclick`.`bdcuentacobro`.`NC`),`bdclick`.`bdcuentacobro`.`chequeGeneral`,`bdclick`.`bdcuentacobro`.`targetaGeneral`,`bdclick`.`bdcuentacobro`.`credito`,`bdclick`.`bdcuentacobro`.`bodega`,`bdclick`.`bdcuentacobro`.`preparacion`,`bdclick`.`bdcuentacobro`.`inicio`,`bdclick`.`bdcuentacobro`.`hasta`,`bdclick`.`bdcuentacobro`.`fechaUltimoPago`,`bdclick`.`bdcuentacobro`.`cantIncremento`,`bdclick`.`bdterceros`.`id` having (`bdclick`.`bdcuentacobro`.`anulada` = 0)
md5=f0d2c7b3845eaca2853345f45098add6
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-25 17:02:39
create-version=2
source=select
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdcuentacobro`.`idFactura` AS `id`,cast(substr(`bdclick`.`bdcuentacobro`.`idFactura`,8,100) as signed) AS `id2`,`bdclick`.`bdcuentacobro`.`cliente` AS `cliente`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdcuentacobro`.`subtotalGeneral` AS `subtotal`,`bdclick`.`bdcuentacobro`.`ivaGeneral` AS `iva`,`bdclick`.`bdcuentacobro`.`totalGeneral` AS `total`,`bdclick`.`bdcuentacobro`.`fechaFactura` AS `fechaFactura`,`bdclick`.`bdcuentacobro`.`anulada` AS `anulada`,`bdclick`.`bdcuentacobro`.`rtIva` AS `rtIva`,`bdclick`.`bdcuentacobro`.`rtIca` AS `rtIca`,`bdclick`.`bdcuentacobro`.`rtFuente` AS `rtFuente`,`bdclick`.`bdcuentacobro`.`otros` AS `otros`,`bdclick`.`bdcuentacobro`.`descuentoGeneral` AS `descuento`,`bdclick`.`bdcuentacobro`.`efectivoGeneral` AS `efectivo`,if((`bdclick`.`bdcuentacobro`.`NC` = \'\'),\'0\',`bdclick`.`bdcuentacobro`.`NC`) AS `nc`,`bdclick`.`bdcuentacobro`.`chequeGeneral` AS `cheque`,`bdclick`.`bdcuentacobro`.`targetaGeneral` AS `targeta`,`bdclick`.`bdcuentacobro`.`credito` AS `credito`,`bdclick`.`bdcuentacobro`.`bodega` AS `bodega`,`bdclick`.`bdcuentacobro`.`preparacion` AS `periodicidad`,`bdclick`.`bdcuentacobro`.`inicio` AS `inicio`,`bdclick`.`bdcuentacobro`.`hasta` AS `hasta`,`bdclick`.`bdcuentacobro`.`fechaUltimoPago` AS `fechaUltimoPago`,`bdclick`.`bdcuentacobro`.`cantIncremento` AS `cantIncremento`,`bdclick`.`bdterceros`.`id` AS `idTercero` from (`bdclick`.`bdterceros` left join `bdclick`.`bdcuentacobro` on((`bdclick`.`bdcuentacobro`.`cliente` = `bdclick`.`bdterceros`.`idSistema`))) group by `bdclick`.`bdcuentacobro`.`idFactura`,`bdclick`.`bdcuentacobro`.`factura`,`bdclick`.`bdcuentacobro`.`cliente`,`bdclick`.`bdterceros`.`nombre`,`bdclick`.`bdcuentacobro`.`subtotalGeneral`,`bdclick`.`bdcuentacobro`.`ivaGeneral`,`bdclick`.`bdcuentacobro`.`totalGeneral`,`bdclick`.`bdcuentacobro`.`fechaFactura`,`bdclick`.`bdcuentacobro`.`anulada`,`bdclick`.`bdcuentacobro`.`rtIva`,`bdclick`.`bdcuentacobro`.`rtIca`,`bdclick`.`bdcuentacobro`.`rtFuente`,`bdclick`.`bdcuentacobro`.`otros`,`bdclick`.`bdcuentacobro`.`descuentoGeneral`,`bdclick`.`bdcuentacobro`.`efectivoGeneral`,if((`bdclick`.`bdcuentacobro`.`NC` = \'\'),\'0\',`bdclick`.`bdcuentacobro`.`NC`),`bdclick`.`bdcuentacobro`.`chequeGeneral`,`bdclick`.`bdcuentacobro`.`targetaGeneral`,`bdclick`.`bdcuentacobro`.`credito`,`bdclick`.`bdcuentacobro`.`bodega`,`bdclick`.`bdcuentacobro`.`preparacion`,`bdclick`.`bdcuentacobro`.`inicio`,`bdclick`.`bdcuentacobro`.`hasta`,`bdclick`.`bdcuentacobro`.`fechaUltimoPago`,`bdclick`.`bdcuentacobro`.`cantIncremento`,`bdclick`.`bdterceros`.`id` having (`bdclick`.`bdcuentacobro`.`anulada` = 0)
mariadb-version=100135