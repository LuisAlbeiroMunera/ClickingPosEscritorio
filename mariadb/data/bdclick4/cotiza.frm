TYPE=VIEW
query=(select `bdclick4`.`bdcotizacion`.`idFactura` AS `idFactura`,`bdclick4`.`bdcotizacion`.`producto` AS `producto`,`bdclick4`.`bdcotizacion`.`lista` AS `lista`,`bdclick4`.`bdcotizacion`.`cantidad` AS `cantidad`,`bdclick4`.`bdcotizacion`.`descuento` AS `descuento`,`bdclick4`.`bdcotizacion`.`total` AS `total`,`bdclick4`.`bdcotizacion`.`iva` AS `iva`,`bdclick4`.`bdcotizacion`.`subtotal` AS `subtotal`,`bdclick4`.`bdcotizacion`.`NC` AS `NC`,`bdclick4`.`bdcotizacion`.`utilidad` AS `utilidad`,`bdclick4`.`bdcotizacion`.`concepto` AS `concepto`,`bdclick4`.`bdcotizacion`.`porcDescuento` AS `porcDescuento`,`bdclick4`.`bdcotizacion`.`descripcion` AS `descripcion`,`bdclick4`.`bdcotizacion`.`plu` AS `plu`,`bdclick4`.`bdcotizacion`.`cant2` AS `cant2`,`bdclick4`.`bdcotizacion`.`estado` AS `estado`,`bdclick4`.`bdcotizacion`.`porcIva` AS `porcIva`,`bdclick4`.`bdcotizacion`.`tercero` AS `tercero`,`bdclick4`.`bdcotizacion`.`utilidad1` AS `utilidad1`,`bdclick4`.`bdcotizacion`.`preparacion` AS `preparacion` from `bdclick4`.`bdcotizacion`)
md5=789b19724aa6183f1565e51ea716406d
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:27
create-version=2
source=(select `bdcotizacion`.`idFactura` AS `idFactura`,`bdcotizacion`.`producto` AS `producto`,`bdcotizacion`.`lista` AS `lista`,`bdcotizacion`.`cantidad` AS `cantidad`,`bdcotizacion`.`descuento` AS `descuento`,`bdcotizacion`.`total` AS `total`,`bdcotizacion`.`iva` AS `iva`,`bdcotizacion`.`subtotal` AS `subtotal`,`bdcotizacion`.`NC` AS `NC`,`bdcotizacion`.`utilidad` AS `utilidad`,`bdcotizacion`.`concepto` AS `concepto`,`bdcotizacion`.`porcDescuento` AS `porcDescuento`,`bdcotizacion`.`descripcion` AS `descripcion`,`bdcotizacion`.`plu` AS `plu`,`bdcotizacion`.`cant2` AS `cant2`,`bdcotizacion`.`estado` AS `estado`,`bdcotizacion`.`porcIva` AS `porcIva`,`bdcotizacion`.`tercero` AS `tercero`,`bdcotizacion`.`utilidad1` AS `utilidad1`,`bdcotizacion`.`preparacion` AS `preparacion` from `bdcotizacion`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`bdcotizacion`.`idFactura` AS `idFactura`,`bdclick4`.`bdcotizacion`.`producto` AS `producto`,`bdclick4`.`bdcotizacion`.`lista` AS `lista`,`bdclick4`.`bdcotizacion`.`cantidad` AS `cantidad`,`bdclick4`.`bdcotizacion`.`descuento` AS `descuento`,`bdclick4`.`bdcotizacion`.`total` AS `total`,`bdclick4`.`bdcotizacion`.`iva` AS `iva`,`bdclick4`.`bdcotizacion`.`subtotal` AS `subtotal`,`bdclick4`.`bdcotizacion`.`NC` AS `NC`,`bdclick4`.`bdcotizacion`.`utilidad` AS `utilidad`,`bdclick4`.`bdcotizacion`.`concepto` AS `concepto`,`bdclick4`.`bdcotizacion`.`porcDescuento` AS `porcDescuento`,`bdclick4`.`bdcotizacion`.`descripcion` AS `descripcion`,`bdclick4`.`bdcotizacion`.`plu` AS `plu`,`bdclick4`.`bdcotizacion`.`cant2` AS `cant2`,`bdclick4`.`bdcotizacion`.`estado` AS `estado`,`bdclick4`.`bdcotizacion`.`porcIva` AS `porcIva`,`bdclick4`.`bdcotizacion`.`tercero` AS `tercero`,`bdclick4`.`bdcotizacion`.`utilidad1` AS `utilidad1`,`bdclick4`.`bdcotizacion`.`preparacion` AS `preparacion` from `bdclick4`.`bdcotizacion`)
mariadb-version=100135
