TYPE=VIEW
query=(select `bdclick3`.`bdtraslados`.`Id` AS `Id`,`bdclick3`.`bdtraslados`.`tipo` AS `tipo`,`bdclick3`.`bdtraslados`.`anulada` AS `anulada`,`bdclick3`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick3`.`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdclick3`.`bdtrasladosprod`.`lista` AS `lista`,`bdclick3`.`bdtrasladosprod`.`total` AS `total`,`bdclick3`.`bdtraslados`.`fecha` AS `fecha`,`bdclick3`.`bdtraslados`.`usuario` AS `usuario`,`bdclick3`.`bdtraslados`.`bodega` AS `bodega` from (`bdclick3`.`bdtraslados` left join (`bdclick3`.`bdtrasladosprod` left join `bdclick3`.`bdproductos` on((`bdclick3`.`bdtrasladosprod`.`producto` = `bdclick3`.`bdproductos`.`Codigo`))) on((`bdclick3`.`bdtraslados`.`Id` = `bdclick3`.`bdtrasladosprod`.`traslado`))) where ((`bdclick3`.`bdtraslados`.`tipo` = \'Ajustes Entrada\') and (`bdclick3`.`bdtraslados`.`anulada` = 0)))
md5=46ac1876e6d5762af5e7e8f3acfece2d
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:48
create-version=2
source=(select `bdtraslados`.`Id` AS `Id`,`bdtraslados`.`tipo` AS `tipo`,`bdtraslados`.`anulada` AS `anulada`,`bdtrasladosprod`.`producto` AS `producto`,`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdtrasladosprod`.`lista` AS `lista`,`bdtrasladosprod`.`total` AS `total`,`bdtraslados`.`fecha` AS `fecha`,`bdtraslados`.`usuario` AS `usuario`,`bdtraslados`.`bodega` AS `bodega` from (`bdtraslados` left join (`bdtrasladosprod` left join `bdproductos` on((`bdtrasladosprod`.`producto` = `bdproductos`.`Codigo`))) on((`bdtraslados`.`Id` = `bdtrasladosprod`.`traslado`))) where ((`bdtraslados`.`tipo` = \'Ajustes Entrada\') and (`bdtraslados`.`anulada` = 0)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bdtraslados`.`Id` AS `Id`,`bdclick3`.`bdtraslados`.`tipo` AS `tipo`,`bdclick3`.`bdtraslados`.`anulada` AS `anulada`,`bdclick3`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick3`.`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdclick3`.`bdtrasladosprod`.`lista` AS `lista`,`bdclick3`.`bdtrasladosprod`.`total` AS `total`,`bdclick3`.`bdtraslados`.`fecha` AS `fecha`,`bdclick3`.`bdtraslados`.`usuario` AS `usuario`,`bdclick3`.`bdtraslados`.`bodega` AS `bodega` from (`bdclick3`.`bdtraslados` left join (`bdclick3`.`bdtrasladosprod` left join `bdclick3`.`bdproductos` on((`bdclick3`.`bdtrasladosprod`.`producto` = `bdclick3`.`bdproductos`.`Codigo`))) on((`bdclick3`.`bdtraslados`.`Id` = `bdclick3`.`bdtrasladosprod`.`traslado`))) where ((`bdclick3`.`bdtraslados`.`tipo` = \'Ajustes Entrada\') and (`bdclick3`.`bdtraslados`.`anulada` = 0)))
mariadb-version=100135
