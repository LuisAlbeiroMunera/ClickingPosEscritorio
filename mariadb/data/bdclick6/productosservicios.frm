TYPE=VIEW
query=select `bdclick6`.`bdproductosserviciosadiciones`.`traslado` AS `traslado`,`bdclick6`.`bdproductosserviciosadiciones`.`cantidad` AS `cantidad`,`bdclick6`.`bdproductosserviciosadiciones`.`lista` AS `lista`,`bdclick6`.`bdproductosserviciosadiciones`.`total` AS `total`,`bdclick6`.`bdproductosserviciosadiciones`.`observacion` AS `observacion`,`bdclick6`.`bdproductos`.`Descripcion` AS `Descripcion` from (`bdclick6`.`bdproductosserviciosadiciones` join `bdclick6`.`bdproductos` on((`bdclick6`.`bdproductosserviciosadiciones`.`producto` = `bdclick6`.`bdproductos`.`idSistema`)))
md5=1734916e36a6aeb4115e870e3ece3c22
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:37
create-version=2
source=select `bdproductosserviciosadiciones`.`traslado` AS `traslado`,`bdproductosserviciosadiciones`.`cantidad` AS `cantidad`,`bdproductosserviciosadiciones`.`lista` AS `lista`,`bdproductosserviciosadiciones`.`total` AS `total`,`bdproductosserviciosadiciones`.`observacion` AS `observacion`,`bdproductos`.`Descripcion` AS `Descripcion` from (`bdproductosserviciosadiciones` join `bdproductos` on((`bdproductosserviciosadiciones`.`producto` = `bdproductos`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdproductosserviciosadiciones`.`traslado` AS `traslado`,`bdclick6`.`bdproductosserviciosadiciones`.`cantidad` AS `cantidad`,`bdclick6`.`bdproductosserviciosadiciones`.`lista` AS `lista`,`bdclick6`.`bdproductosserviciosadiciones`.`total` AS `total`,`bdclick6`.`bdproductosserviciosadiciones`.`observacion` AS `observacion`,`bdclick6`.`bdproductos`.`Descripcion` AS `Descripcion` from (`bdclick6`.`bdproductosserviciosadiciones` join `bdclick6`.`bdproductos` on((`bdclick6`.`bdproductosserviciosadiciones`.`producto` = `bdclick6`.`bdproductos`.`idSistema`)))
mariadb-version=100135
