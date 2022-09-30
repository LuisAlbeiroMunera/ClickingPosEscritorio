TYPE=VIEW
query=select `bdclick`.`bdplansepare`.`idFactura` AS `idFactura`,`bdclick`.`bdplansepare`.`factura` AS `id2`,cast(substr(`bdclick`.`bdplansepare`.`idFactura`,8,100) as signed) AS `ordenId`,`bdclick`.`bdplansepare`.`estadoGeneral` AS `estado`,`bdclick`.`bdplansepare`.`placa` AS `placa`,`bdclick`.`bdplansepare`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick`.`bdplansepare`.`targetaGeneral` AS `targetaGeneral`,`bdclick`.`bdplansepare`.`ncGeneral` AS `ncGeneral`,`bdclick`.`bdplansepare`.`chequeGeneral` AS `chequeGeneral`,`bdclick`.`bdplansepare`.`fechaFactura` AS `fechaFactura`,`bdclick`.`bdplansepare`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick`.`bdplansepare`.`totalGeneral` AS `totalGeneral`,`bdclick`.`bdplansepare`.`factura` AS `factura`,0 AS `cuotaInicial2`,`bdclick`.`bdplansepare`.`terminal` AS `terminal`,`bdclick`.`bdplansepare`.`anulada` AS `anulada`,`bdclick`.`bdterceros`.`idSistema` AS `idSistema`,`bdclick`.`bdplansepare`.`comprobante` AS `comprobante`,`bdclick`.`bdterceros`.`id` AS `cliente` from (`bdclick`.`bdplansepare` join `bdclick`.`bdterceros` on((`bdclick`.`bdplansepare`.`cliente` = `bdclick`.`bdterceros`.`idSistema`))) group by `bdclick`.`bdplansepare`.`idFactura` order by cast(substr(`bdclick`.`bdplansepare`.`idFactura`,8,100) as signed)
md5=7a761f23fd337594c2a4cfee5e1167d0
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-10-09 13:59:18
create-version=2
source=select
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdplansepare`.`idFactura` AS `idFactura`,`bdclick`.`bdplansepare`.`factura` AS `id2`,cast(substr(`bdclick`.`bdplansepare`.`idFactura`,8,100) as signed) AS `ordenId`,`bdclick`.`bdplansepare`.`estadoGeneral` AS `estado`,`bdclick`.`bdplansepare`.`placa` AS `placa`,`bdclick`.`bdplansepare`.`efectivoGeneral` AS `efectivoGeneral`,`bdclick`.`bdplansepare`.`targetaGeneral` AS `targetaGeneral`,`bdclick`.`bdplansepare`.`ncGeneral` AS `ncGeneral`,`bdclick`.`bdplansepare`.`chequeGeneral` AS `chequeGeneral`,`bdclick`.`bdplansepare`.`fechaFactura` AS `fechaFactura`,`bdclick`.`bdplansepare`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick`.`bdplansepare`.`totalGeneral` AS `totalGeneral`,`bdclick`.`bdplansepare`.`factura` AS `factura`,0 AS `cuotaInicial2`,`bdclick`.`bdplansepare`.`terminal` AS `terminal`,`bdclick`.`bdplansepare`.`anulada` AS `anulada`,`bdclick`.`bdterceros`.`idSistema` AS `idSistema`,`bdclick`.`bdplansepare`.`comprobante` AS `comprobante`,`bdclick`.`bdterceros`.`id` AS `cliente` from (`bdclick`.`bdplansepare` join `bdclick`.`bdterceros` on((`bdclick`.`bdplansepare`.`cliente` = `bdclick`.`bdterceros`.`idSistema`))) group by `bdclick`.`bdplansepare`.`idFactura` order by cast(substr(`bdclick`.`bdplansepare`.`idFactura`,8,100) as signed)
mariadb-version=100135