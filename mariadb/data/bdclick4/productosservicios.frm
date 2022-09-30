TYPE=VIEW
query=select `bdclick4`.`bdproductosserviciosadiciones`.`traslado` AS `traslado`,`bdclick4`.`bdproductosserviciosadiciones`.`cantidad` AS `cantidad`,`bdclick4`.`bdproductosserviciosadiciones`.`lista` AS `lista`,`bdclick4`.`bdproductosserviciosadiciones`.`total` AS `total`,`bdclick4`.`bdproductosserviciosadiciones`.`observacion` AS `observacion`,`bdclick4`.`bdproductos`.`Descripcion` AS `Descripcion` from (`bdclick4`.`bdproductosserviciosadiciones` join `bdclick4`.`bdproductos` on((`bdclick4`.`bdproductosserviciosadiciones`.`producto` = `bdclick4`.`bdproductos`.`idSistema`)))
md5=1073656bbcb2809b26c60c7534ecd071
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:29
create-version=2
source=select `bdproductosserviciosadiciones`.`traslado` AS `traslado`,`bdproductosserviciosadiciones`.`cantidad` AS `cantidad`,`bdproductosserviciosadiciones`.`lista` AS `lista`,`bdproductosserviciosadiciones`.`total` AS `total`,`bdproductosserviciosadiciones`.`observacion` AS `observacion`,`bdproductos`.`Descripcion` AS `Descripcion` from (`bdproductosserviciosadiciones` join `bdproductos` on((`bdproductosserviciosadiciones`.`producto` = `bdproductos`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdproductosserviciosadiciones`.`traslado` AS `traslado`,`bdclick4`.`bdproductosserviciosadiciones`.`cantidad` AS `cantidad`,`bdclick4`.`bdproductosserviciosadiciones`.`lista` AS `lista`,`bdclick4`.`bdproductosserviciosadiciones`.`total` AS `total`,`bdclick4`.`bdproductosserviciosadiciones`.`observacion` AS `observacion`,`bdclick4`.`bdproductos`.`Descripcion` AS `Descripcion` from (`bdclick4`.`bdproductosserviciosadiciones` join `bdclick4`.`bdproductos` on((`bdclick4`.`bdproductosserviciosadiciones`.`producto` = `bdclick4`.`bdproductos`.`idSistema`)))
mariadb-version=100135
