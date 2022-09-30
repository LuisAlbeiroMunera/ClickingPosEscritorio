TYPE=VIEW
query=select `bdclick1`.`bdproductosserviciosadiciones`.`traslado` AS `traslado`,`bdclick1`.`bdproductosserviciosadiciones`.`cantidad` AS `cantidad`,`bdclick1`.`bdproductosserviciosadiciones`.`lista` AS `lista`,`bdclick1`.`bdproductosserviciosadiciones`.`total` AS `total`,`bdclick1`.`bdproductosserviciosadiciones`.`observacion` AS `observacion`,`bdclick1`.`bdproductos`.`Descripcion` AS `Descripcion` from (`bdclick1`.`bdproductosserviciosadiciones` join `bdclick1`.`bdproductos` on((`bdclick1`.`bdproductosserviciosadiciones`.`producto` = `bdclick1`.`bdproductos`.`idSistema`)))
md5=64eee34944e4d763e3cf269532e7296e
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:36
create-version=2
source=select `bdproductosserviciosadiciones`.`traslado` AS `traslado`,`bdproductosserviciosadiciones`.`cantidad` AS `cantidad`,`bdproductosserviciosadiciones`.`lista` AS `lista`,`bdproductosserviciosadiciones`.`total` AS `total`,`bdproductosserviciosadiciones`.`observacion` AS `observacion`,`bdproductos`.`Descripcion` AS `Descripcion` from (`bdproductosserviciosadiciones` join `bdproductos` on((`bdproductosserviciosadiciones`.`producto` = `bdproductos`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdproductosserviciosadiciones`.`traslado` AS `traslado`,`bdclick1`.`bdproductosserviciosadiciones`.`cantidad` AS `cantidad`,`bdclick1`.`bdproductosserviciosadiciones`.`lista` AS `lista`,`bdclick1`.`bdproductosserviciosadiciones`.`total` AS `total`,`bdclick1`.`bdproductosserviciosadiciones`.`observacion` AS `observacion`,`bdclick1`.`bdproductos`.`Descripcion` AS `Descripcion` from (`bdclick1`.`bdproductosserviciosadiciones` join `bdclick1`.`bdproductos` on((`bdclick1`.`bdproductosserviciosadiciones`.`producto` = `bdclick1`.`bdproductos`.`idSistema`)))
mariadb-version=100135
