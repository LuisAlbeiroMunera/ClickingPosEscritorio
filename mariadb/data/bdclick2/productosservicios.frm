TYPE=VIEW
query=select `bdclick2`.`bdproductosserviciosadiciones`.`traslado` AS `traslado`,`bdclick2`.`bdproductosserviciosadiciones`.`cantidad` AS `cantidad`,`bdclick2`.`bdproductosserviciosadiciones`.`lista` AS `lista`,`bdclick2`.`bdproductosserviciosadiciones`.`total` AS `total`,`bdclick2`.`bdproductosserviciosadiciones`.`observacion` AS `observacion`,`bdclick2`.`bdproductos`.`Descripcion` AS `Descripcion` from (`bdclick2`.`bdproductosserviciosadiciones` join `bdclick2`.`bdproductos` on((`bdclick2`.`bdproductosserviciosadiciones`.`producto` = `bdclick2`.`bdproductos`.`idSistema`)))
md5=f5f51b30c0191cebd034ee5e02a2b460
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:47
create-version=2
source=select `bdproductosserviciosadiciones`.`traslado` AS `traslado`,`bdproductosserviciosadiciones`.`cantidad` AS `cantidad`,`bdproductosserviciosadiciones`.`lista` AS `lista`,`bdproductosserviciosadiciones`.`total` AS `total`,`bdproductosserviciosadiciones`.`observacion` AS `observacion`,`bdproductos`.`Descripcion` AS `Descripcion` from (`bdproductosserviciosadiciones` join `bdproductos` on((`bdproductosserviciosadiciones`.`producto` = `bdproductos`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdproductosserviciosadiciones`.`traslado` AS `traslado`,`bdclick2`.`bdproductosserviciosadiciones`.`cantidad` AS `cantidad`,`bdclick2`.`bdproductosserviciosadiciones`.`lista` AS `lista`,`bdclick2`.`bdproductosserviciosadiciones`.`total` AS `total`,`bdclick2`.`bdproductosserviciosadiciones`.`observacion` AS `observacion`,`bdclick2`.`bdproductos`.`Descripcion` AS `Descripcion` from (`bdclick2`.`bdproductosserviciosadiciones` join `bdclick2`.`bdproductos` on((`bdclick2`.`bdproductosserviciosadiciones`.`producto` = `bdclick2`.`bdproductos`.`idSistema`)))
mariadb-version=100135
