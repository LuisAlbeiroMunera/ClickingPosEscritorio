TYPE=VIEW
query=select `bdclick5`.`bdproductosserviciosadiciones`.`traslado` AS `traslado`,`bdclick5`.`bdproductosserviciosadiciones`.`cantidad` AS `cantidad`,`bdclick5`.`bdproductosserviciosadiciones`.`lista` AS `lista`,`bdclick5`.`bdproductosserviciosadiciones`.`total` AS `total`,`bdclick5`.`bdproductosserviciosadiciones`.`observacion` AS `observacion`,`bdclick5`.`bdproductos`.`Descripcion` AS `Descripcion` from (`bdclick5`.`bdproductosserviciosadiciones` join `bdclick5`.`bdproductos` on((`bdclick5`.`bdproductosserviciosadiciones`.`producto` = `bdclick5`.`bdproductos`.`idSistema`)))
md5=43a5ee4945c30429ac54bd74d2fff243
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:49
create-version=2
source=select `bdproductosserviciosadiciones`.`traslado` AS `traslado`,`bdproductosserviciosadiciones`.`cantidad` AS `cantidad`,`bdproductosserviciosadiciones`.`lista` AS `lista`,`bdproductosserviciosadiciones`.`total` AS `total`,`bdproductosserviciosadiciones`.`observacion` AS `observacion`,`bdproductos`.`Descripcion` AS `Descripcion` from (`bdproductosserviciosadiciones` join `bdproductos` on((`bdproductosserviciosadiciones`.`producto` = `bdproductos`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdproductosserviciosadiciones`.`traslado` AS `traslado`,`bdclick5`.`bdproductosserviciosadiciones`.`cantidad` AS `cantidad`,`bdclick5`.`bdproductosserviciosadiciones`.`lista` AS `lista`,`bdclick5`.`bdproductosserviciosadiciones`.`total` AS `total`,`bdclick5`.`bdproductosserviciosadiciones`.`observacion` AS `observacion`,`bdclick5`.`bdproductos`.`Descripcion` AS `Descripcion` from (`bdclick5`.`bdproductosserviciosadiciones` join `bdclick5`.`bdproductos` on((`bdclick5`.`bdproductosserviciosadiciones`.`producto` = `bdclick5`.`bdproductos`.`idSistema`)))
mariadb-version=100135
