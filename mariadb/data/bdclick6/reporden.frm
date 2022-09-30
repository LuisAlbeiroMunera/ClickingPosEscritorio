TYPE=VIEW
query=(select `bdclick6`.`bdoservicio1`.`factura` AS `factura`,substr(`bdclick6`.`bdoservicio1`.`idFactura`,7.2) AS `documento`,substr(`bdclick6`.`bdoservicio1`.`factura`,7.2) AS `documento2`,`bdclick6`.`bdoservicio1`.`producto` AS `producto`,`bdclick6`.`bdoservicio1`.`descripcion` AS `Descripcion`,`bdclick6`.`bdoservicio1`.`cant2` AS `cantidad`,`bdclick6`.`bdoservicio1`.`lista` AS `lista`,`bdclick6`.`bdoservicio1`.`subtotal` AS `subtotal`,`bdclick6`.`bdoservicio1`.`iva` AS `iva`,`bdclick6`.`bdoservicio1`.`total` AS `total`,`bdclick6`.`bdoservicio1`.`fechaFactura` AS `fechaFactura`,`bdclick6`.`bdoservicio1`.`cliente` AS `cliente`,`bdclick6`.`bdproductos`.`Proveedor` AS `Proveedor`,`bdclick6`.`bdoservicio1`.`vendedor` AS `vendedor`,`bdclick6`.`bdoservicio1`.`anulada` AS `anulada`,`bdclick6`.`bdoservicio1`.`credito` AS `credito`,`bdclick6`.`bdoservicio1`.`descuentoGeneral` AS `descuentos`,(`bdclick6`.`bdoservicio1`.`total` - (`bdclick6`.`bdoservicio1`.`utilidad` * `bdclick6`.`bdoservicio1`.`cantidad`)) AS `utilidad`,(`bdclick6`.`bdoservicio1`.`total` - (`bdclick6`.`ultimoponderado`.`nuevoPonderado` * `bdclick6`.`bdoservicio1`.`cantidad`)) AS `utilidad2`,`bdclick6`.`bdoservicio1`.`terminal` AS `terminal`,`bdclick6`.`bdoservicio1`.`targetaGeneral` AS `targeta`,`bdclick6`.`bdoservicio1`.`descuento` AS `descuento`,`bdclick6`.`bdoservicio`.`placa` AS `d5`,`bdclick6`.`bdoservicio1`.`estadoGeneral` AS `estado`,`bdclick6`.`bdoservicio1`.`garantia` AS `garantia`,`bdclick6`.`bdoservicio1`.`diasGarantia` AS `diasGarantia`,`bdclick6`.`bdoservicio1`.`rango` AS `rango`,`bdclick6`.`bdoservicio1`.`terminos` AS `terminos`,`bdclick6`.`bdoservicio1`.`notaAnulacion` AS `notaAnulacion`,`bdclick6`.`bdproductos`.`Codigo` AS `Codigo` from (((`bdclick6`.`bdoservicio1` left join `bdclick6`.`bdoservicio` on((`bdclick6`.`bdoservicio`.`id` = `bdclick6`.`bdoservicio1`.`idFactura`))) left join `bdclick6`.`bdproductos` on((`bdclick6`.`bdoservicio1`.`producto` = `bdclick6`.`bdproductos`.`Codigo`))) left join `bdclick6`.`ultimoponderado` on((`bdclick6`.`bdproductos`.`Codigo` = `bdclick6`.`ultimoponderado`.`producto`))) where (`bdclick6`.`bdoservicio1`.`anulada` = 0))
md5=376b82a93a0eb2c54893864db5490f53
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:38
create-version=2
source=(select `bdoservicio1`.`factura` AS `factura`,substr(`bdoservicio1`.`idFactura`,7.2) AS `documento`,substr(`bdoservicio1`.`factura`,7.2) AS `documento2`,`bdoservicio1`.`producto` AS `producto`,`bdoservicio1`.`descripcion` AS `Descripcion`,`bdoservicio1`.`cant2` AS `cantidad`,`bdoservicio1`.`lista` AS `lista`,`bdoservicio1`.`subtotal` AS `subtotal`,`bdoservicio1`.`iva` AS `iva`,`bdoservicio1`.`total` AS `total`,`bdoservicio1`.`fechaFactura` AS `fechaFactura`,`bdoservicio1`.`cliente` AS `cliente`,`bdproductos`.`Proveedor` AS `Proveedor`,`bdoservicio1`.`vendedor` AS `vendedor`,`bdoservicio1`.`anulada` AS `anulada`,`bdoservicio1`.`credito` AS `credito`,`bdoservicio1`.`descuentoGeneral` AS `descuentos`,(`bdoservicio1`.`total` - (`bdoservicio1`.`utilidad` * `bdoservicio1`.`cantidad`)) AS `utilidad`,(`bdoservicio1`.`total` - (`ultimoponderado`.`nuevoPonderado` * `bdoservicio1`.`cantidad`)) AS `utilidad2`,`bdoservicio1`.`terminal` AS `terminal`,`bdoservicio1`.`targetaGeneral` AS `targeta`,`bdoservicio1`.`descuento` AS `descuento`,`bdoservicio`.`placa` AS `d5`,`bdoservicio1`.`estadoGeneral` AS `estado`,`bdoservicio1`.`garantia` AS `garantia`,`bdoservicio1`.`diasGarantia` AS `diasGarantia`,`bdoservicio1`.`rango` AS `rango`,`bdoservicio1`.`terminos` AS `terminos`,`bdoservicio1`.`notaAnulacion` AS `notaAnulacion`,`bdproductos`.`Codigo` AS `Codigo` from (((`bdoservicio1` left join `bdoservicio` on((`bdoservicio`.`id` = `bdoservicio1`.`idFactura`))) left join `bdproductos` on((`bdoservicio1`.`producto` = `bdproductos`.`Codigo`))) left join `ultimoponderado` on((`bdproductos`.`Codigo` = `ultimoponderado`.`producto`))) where (`bdoservicio1`.`anulada` = 0))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bdoservicio1`.`factura` AS `factura`,substr(`bdclick6`.`bdoservicio1`.`idFactura`,7.2) AS `documento`,substr(`bdclick6`.`bdoservicio1`.`factura`,7.2) AS `documento2`,`bdclick6`.`bdoservicio1`.`producto` AS `producto`,`bdclick6`.`bdoservicio1`.`descripcion` AS `Descripcion`,`bdclick6`.`bdoservicio1`.`cant2` AS `cantidad`,`bdclick6`.`bdoservicio1`.`lista` AS `lista`,`bdclick6`.`bdoservicio1`.`subtotal` AS `subtotal`,`bdclick6`.`bdoservicio1`.`iva` AS `iva`,`bdclick6`.`bdoservicio1`.`total` AS `total`,`bdclick6`.`bdoservicio1`.`fechaFactura` AS `fechaFactura`,`bdclick6`.`bdoservicio1`.`cliente` AS `cliente`,`bdclick6`.`bdproductos`.`Proveedor` AS `Proveedor`,`bdclick6`.`bdoservicio1`.`vendedor` AS `vendedor`,`bdclick6`.`bdoservicio1`.`anulada` AS `anulada`,`bdclick6`.`bdoservicio1`.`credito` AS `credito`,`bdclick6`.`bdoservicio1`.`descuentoGeneral` AS `descuentos`,(`bdclick6`.`bdoservicio1`.`total` - (`bdclick6`.`bdoservicio1`.`utilidad` * `bdclick6`.`bdoservicio1`.`cantidad`)) AS `utilidad`,(`bdclick6`.`bdoservicio1`.`total` - (`bdclick6`.`ultimoponderado`.`nuevoPonderado` * `bdclick6`.`bdoservicio1`.`cantidad`)) AS `utilidad2`,`bdclick6`.`bdoservicio1`.`terminal` AS `terminal`,`bdclick6`.`bdoservicio1`.`targetaGeneral` AS `targeta`,`bdclick6`.`bdoservicio1`.`descuento` AS `descuento`,`bdclick6`.`bdoservicio`.`placa` AS `d5`,`bdclick6`.`bdoservicio1`.`estadoGeneral` AS `estado`,`bdclick6`.`bdoservicio1`.`garantia` AS `garantia`,`bdclick6`.`bdoservicio1`.`diasGarantia` AS `diasGarantia`,`bdclick6`.`bdoservicio1`.`rango` AS `rango`,`bdclick6`.`bdoservicio1`.`terminos` AS `terminos`,`bdclick6`.`bdoservicio1`.`notaAnulacion` AS `notaAnulacion`,`bdclick6`.`bdproductos`.`Codigo` AS `Codigo` from (((`bdclick6`.`bdoservicio1` left join `bdclick6`.`bdoservicio` on((`bdclick6`.`bdoservicio`.`id` = `bdclick6`.`bdoservicio1`.`idFactura`))) left join `bdclick6`.`bdproductos` on((`bdclick6`.`bdoservicio1`.`producto` = `bdclick6`.`bdproductos`.`Codigo`))) left join `bdclick6`.`ultimoponderado` on((`bdclick6`.`bdproductos`.`Codigo` = `bdclick6`.`ultimoponderado`.`producto`))) where (`bdclick6`.`bdoservicio1`.`anulada` = 0))
mariadb-version=100135
