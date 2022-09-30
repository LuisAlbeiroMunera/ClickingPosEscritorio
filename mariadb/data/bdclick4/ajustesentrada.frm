TYPE=VIEW
query=(select `bdclick4`.`bdtraslados`.`Id` AS `Id`,`bdclick4`.`bdtraslados`.`tipo` AS `tipo`,`bdclick4`.`bdtraslados`.`anulada` AS `anulada`,`bdclick4`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick4`.`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdclick4`.`bdtrasladosprod`.`lista` AS `lista`,`bdclick4`.`bdtrasladosprod`.`total` AS `total`,`bdclick4`.`bdtraslados`.`fecha` AS `fecha`,`bdclick4`.`bdtraslados`.`usuario` AS `usuario`,`bdclick4`.`bdtraslados`.`bodega` AS `bodega` from (`bdclick4`.`bdtraslados` left join (`bdclick4`.`bdtrasladosprod` left join `bdclick4`.`bdproductos` on((`bdclick4`.`bdtrasladosprod`.`producto` = `bdclick4`.`bdproductos`.`Codigo`))) on((`bdclick4`.`bdtraslados`.`Id` = `bdclick4`.`bdtrasladosprod`.`traslado`))) where ((`bdclick4`.`bdtraslados`.`tipo` = \'Ajustes Entrada\') and (`bdclick4`.`bdtraslados`.`anulada` = 0)))
md5=18f677b1bd0dc3b10083b0a71d3a8705
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:25
create-version=2
source=(select `bdtraslados`.`Id` AS `Id`,`bdtraslados`.`tipo` AS `tipo`,`bdtraslados`.`anulada` AS `anulada`,`bdtrasladosprod`.`producto` AS `producto`,`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdtrasladosprod`.`lista` AS `lista`,`bdtrasladosprod`.`total` AS `total`,`bdtraslados`.`fecha` AS `fecha`,`bdtraslados`.`usuario` AS `usuario`,`bdtraslados`.`bodega` AS `bodega` from (`bdtraslados` left join (`bdtrasladosprod` left join `bdproductos` on((`bdtrasladosprod`.`producto` = `bdproductos`.`Codigo`))) on((`bdtraslados`.`Id` = `bdtrasladosprod`.`traslado`))) where ((`bdtraslados`.`tipo` = \'Ajustes Entrada\') and (`bdtraslados`.`anulada` = 0)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`bdtraslados`.`Id` AS `Id`,`bdclick4`.`bdtraslados`.`tipo` AS `tipo`,`bdclick4`.`bdtraslados`.`anulada` AS `anulada`,`bdclick4`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick4`.`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdclick4`.`bdtrasladosprod`.`lista` AS `lista`,`bdclick4`.`bdtrasladosprod`.`total` AS `total`,`bdclick4`.`bdtraslados`.`fecha` AS `fecha`,`bdclick4`.`bdtraslados`.`usuario` AS `usuario`,`bdclick4`.`bdtraslados`.`bodega` AS `bodega` from (`bdclick4`.`bdtraslados` left join (`bdclick4`.`bdtrasladosprod` left join `bdclick4`.`bdproductos` on((`bdclick4`.`bdtrasladosprod`.`producto` = `bdclick4`.`bdproductos`.`Codigo`))) on((`bdclick4`.`bdtraslados`.`Id` = `bdclick4`.`bdtrasladosprod`.`traslado`))) where ((`bdclick4`.`bdtraslados`.`tipo` = \'Ajustes Entrada\') and (`bdclick4`.`bdtraslados`.`anulada` = 0)))
mariadb-version=100135
