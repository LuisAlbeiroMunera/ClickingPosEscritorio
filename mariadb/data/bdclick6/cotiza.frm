TYPE=VIEW
query=(select `bdclick6`.`bdcotizacion`.`idFactura` AS `idFactura`,`bdclick6`.`bdcotizacion`.`producto` AS `producto`,`bdclick6`.`bdcotizacion`.`lista` AS `lista`,`bdclick6`.`bdcotizacion`.`cantidad` AS `cantidad`,`bdclick6`.`bdcotizacion`.`descuento` AS `descuento`,`bdclick6`.`bdcotizacion`.`total` AS `total`,`bdclick6`.`bdcotizacion`.`iva` AS `iva`,`bdclick6`.`bdcotizacion`.`subtotal` AS `subtotal`,`bdclick6`.`bdcotizacion`.`NC` AS `NC`,`bdclick6`.`bdcotizacion`.`utilidad` AS `utilidad`,`bdclick6`.`bdcotizacion`.`concepto` AS `concepto`,`bdclick6`.`bdcotizacion`.`porcDescuento` AS `porcDescuento`,`bdclick6`.`bdcotizacion`.`descripcion` AS `descripcion`,`bdclick6`.`bdcotizacion`.`plu` AS `plu`,`bdclick6`.`bdcotizacion`.`cant2` AS `cant2`,`bdclick6`.`bdcotizacion`.`estado` AS `estado`,`bdclick6`.`bdcotizacion`.`porcIva` AS `porcIva`,`bdclick6`.`bdcotizacion`.`tercero` AS `tercero`,`bdclick6`.`bdcotizacion`.`utilidad1` AS `utilidad1`,`bdclick6`.`bdcotizacion`.`preparacion` AS `preparacion` from `bdclick6`.`bdcotizacion`)
md5=e1ccb8990052cd8fb0943604f650a031
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:34
create-version=2
source=(select `bdcotizacion`.`idFactura` AS `idFactura`,`bdcotizacion`.`producto` AS `producto`,`bdcotizacion`.`lista` AS `lista`,`bdcotizacion`.`cantidad` AS `cantidad`,`bdcotizacion`.`descuento` AS `descuento`,`bdcotizacion`.`total` AS `total`,`bdcotizacion`.`iva` AS `iva`,`bdcotizacion`.`subtotal` AS `subtotal`,`bdcotizacion`.`NC` AS `NC`,`bdcotizacion`.`utilidad` AS `utilidad`,`bdcotizacion`.`concepto` AS `concepto`,`bdcotizacion`.`porcDescuento` AS `porcDescuento`,`bdcotizacion`.`descripcion` AS `descripcion`,`bdcotizacion`.`plu` AS `plu`,`bdcotizacion`.`cant2` AS `cant2`,`bdcotizacion`.`estado` AS `estado`,`bdcotizacion`.`porcIva` AS `porcIva`,`bdcotizacion`.`tercero` AS `tercero`,`bdcotizacion`.`utilidad1` AS `utilidad1`,`bdcotizacion`.`preparacion` AS `preparacion` from `bdcotizacion`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bdcotizacion`.`idFactura` AS `idFactura`,`bdclick6`.`bdcotizacion`.`producto` AS `producto`,`bdclick6`.`bdcotizacion`.`lista` AS `lista`,`bdclick6`.`bdcotizacion`.`cantidad` AS `cantidad`,`bdclick6`.`bdcotizacion`.`descuento` AS `descuento`,`bdclick6`.`bdcotizacion`.`total` AS `total`,`bdclick6`.`bdcotizacion`.`iva` AS `iva`,`bdclick6`.`bdcotizacion`.`subtotal` AS `subtotal`,`bdclick6`.`bdcotizacion`.`NC` AS `NC`,`bdclick6`.`bdcotizacion`.`utilidad` AS `utilidad`,`bdclick6`.`bdcotizacion`.`concepto` AS `concepto`,`bdclick6`.`bdcotizacion`.`porcDescuento` AS `porcDescuento`,`bdclick6`.`bdcotizacion`.`descripcion` AS `descripcion`,`bdclick6`.`bdcotizacion`.`plu` AS `plu`,`bdclick6`.`bdcotizacion`.`cant2` AS `cant2`,`bdclick6`.`bdcotizacion`.`estado` AS `estado`,`bdclick6`.`bdcotizacion`.`porcIva` AS `porcIva`,`bdclick6`.`bdcotizacion`.`tercero` AS `tercero`,`bdclick6`.`bdcotizacion`.`utilidad1` AS `utilidad1`,`bdclick6`.`bdcotizacion`.`preparacion` AS `preparacion` from `bdclick6`.`bdcotizacion`)
mariadb-version=100135
