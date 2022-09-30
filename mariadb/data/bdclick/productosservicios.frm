TYPE=VIEW
query=select `bdclick`.`bdproductosserviciosadiciones`.`traslado` AS `traslado`,`bdclick`.`bdproductosserviciosadiciones`.`cantidad` AS `cantidad`,`bdclick`.`bdproductosserviciosadiciones`.`lista` AS `lista`,`bdclick`.`bdproductosserviciosadiciones`.`total` AS `total`,`bdclick`.`bdproductosserviciosadiciones`.`observacion` AS `observacion`,`bdclick`.`bdproductos`.`Descripcion` AS `Descripcion` from (`bdclick`.`bdproductosserviciosadiciones` join `bdclick`.`bdproductos` on((`bdclick`.`bdproductosserviciosadiciones`.`producto` = `bdclick`.`bdproductos`.`idSistema`)))
md5=e72fa20423949decf458949ddb6754f5
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:26
create-version=2
source=select `bdproductosserviciosadiciones`.`traslado` AS `traslado`,`bdproductosserviciosadiciones`.`cantidad` AS `cantidad`,`bdproductosserviciosadiciones`.`lista` AS `lista`,`bdproductosserviciosadiciones`.`total` AS `total`,`bdproductosserviciosadiciones`.`observacion` AS `observacion`,`bdproductos`.`Descripcion` AS `Descripcion` from (`bdproductosserviciosadiciones` join `bdproductos` on((`bdproductosserviciosadiciones`.`producto` = `bdproductos`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdproductosserviciosadiciones`.`traslado` AS `traslado`,`bdclick`.`bdproductosserviciosadiciones`.`cantidad` AS `cantidad`,`bdclick`.`bdproductosserviciosadiciones`.`lista` AS `lista`,`bdclick`.`bdproductosserviciosadiciones`.`total` AS `total`,`bdclick`.`bdproductosserviciosadiciones`.`observacion` AS `observacion`,`bdclick`.`bdproductos`.`Descripcion` AS `Descripcion` from (`bdclick`.`bdproductosserviciosadiciones` join `bdclick`.`bdproductos` on((`bdclick`.`bdproductosserviciosadiciones`.`producto` = `bdclick`.`bdproductos`.`idSistema`)))
mariadb-version=100135
