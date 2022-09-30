TYPE=VIEW
query=select `bdclick3`.`bdproductosserviciosadiciones`.`traslado` AS `traslado`,`bdclick3`.`bdproductosserviciosadiciones`.`cantidad` AS `cantidad`,`bdclick3`.`bdproductosserviciosadiciones`.`lista` AS `lista`,`bdclick3`.`bdproductosserviciosadiciones`.`total` AS `total`,`bdclick3`.`bdproductosserviciosadiciones`.`observacion` AS `observacion`,`bdclick3`.`bdproductos`.`Descripcion` AS `Descripcion` from (`bdclick3`.`bdproductosserviciosadiciones` join `bdclick3`.`bdproductos` on((`bdclick3`.`bdproductosserviciosadiciones`.`producto` = `bdclick3`.`bdproductos`.`idSistema`)))
md5=6b4784cb895f3c9855b6a35967e9690f
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:52
create-version=2
source=select `bdproductosserviciosadiciones`.`traslado` AS `traslado`,`bdproductosserviciosadiciones`.`cantidad` AS `cantidad`,`bdproductosserviciosadiciones`.`lista` AS `lista`,`bdproductosserviciosadiciones`.`total` AS `total`,`bdproductosserviciosadiciones`.`observacion` AS `observacion`,`bdproductos`.`Descripcion` AS `Descripcion` from (`bdproductosserviciosadiciones` join `bdproductos` on((`bdproductosserviciosadiciones`.`producto` = `bdproductos`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdproductosserviciosadiciones`.`traslado` AS `traslado`,`bdclick3`.`bdproductosserviciosadiciones`.`cantidad` AS `cantidad`,`bdclick3`.`bdproductosserviciosadiciones`.`lista` AS `lista`,`bdclick3`.`bdproductosserviciosadiciones`.`total` AS `total`,`bdclick3`.`bdproductosserviciosadiciones`.`observacion` AS `observacion`,`bdclick3`.`bdproductos`.`Descripcion` AS `Descripcion` from (`bdclick3`.`bdproductosserviciosadiciones` join `bdclick3`.`bdproductos` on((`bdclick3`.`bdproductosserviciosadiciones`.`producto` = `bdclick3`.`bdproductos`.`idSistema`)))
mariadb-version=100135
