TYPE=VIEW
query=(select `bdclick5`.`bdtraslados`.`Id` AS `Id`,`bdclick5`.`bdtraslados`.`tipo` AS `tipo`,`bdclick5`.`bdtraslados`.`anulada` AS `anulada`,`bdclick5`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick5`.`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdclick5`.`bdtrasladosprod`.`lista` AS `lista`,`bdclick5`.`bdtrasladosprod`.`total` AS `total`,`bdclick5`.`bdtraslados`.`fecha` AS `fecha`,`bdclick5`.`bdtraslados`.`usuario` AS `usuario`,`bdclick5`.`bdtraslados`.`bodega` AS `bodega` from (`bdclick5`.`bdtraslados` left join (`bdclick5`.`bdtrasladosprod` left join `bdclick5`.`bdproductos` on((`bdclick5`.`bdtrasladosprod`.`producto` = `bdclick5`.`bdproductos`.`Codigo`))) on((`bdclick5`.`bdtraslados`.`Id` = `bdclick5`.`bdtrasladosprod`.`traslado`))) where ((`bdclick5`.`bdtraslados`.`tipo` = \'Ajustes Entrada\') and (`bdclick5`.`bdtraslados`.`anulada` = 0)))
md5=24c5e7dd0cb98af6dc275e7021146da4
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:44
create-version=2
source=(select `bdtraslados`.`Id` AS `Id`,`bdtraslados`.`tipo` AS `tipo`,`bdtraslados`.`anulada` AS `anulada`,`bdtrasladosprod`.`producto` AS `producto`,`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdtrasladosprod`.`lista` AS `lista`,`bdtrasladosprod`.`total` AS `total`,`bdtraslados`.`fecha` AS `fecha`,`bdtraslados`.`usuario` AS `usuario`,`bdtraslados`.`bodega` AS `bodega` from (`bdtraslados` left join (`bdtrasladosprod` left join `bdproductos` on((`bdtrasladosprod`.`producto` = `bdproductos`.`Codigo`))) on((`bdtraslados`.`Id` = `bdtrasladosprod`.`traslado`))) where ((`bdtraslados`.`tipo` = \'Ajustes Entrada\') and (`bdtraslados`.`anulada` = 0)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`bdtraslados`.`Id` AS `Id`,`bdclick5`.`bdtraslados`.`tipo` AS `tipo`,`bdclick5`.`bdtraslados`.`anulada` AS `anulada`,`bdclick5`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick5`.`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdclick5`.`bdtrasladosprod`.`lista` AS `lista`,`bdclick5`.`bdtrasladosprod`.`total` AS `total`,`bdclick5`.`bdtraslados`.`fecha` AS `fecha`,`bdclick5`.`bdtraslados`.`usuario` AS `usuario`,`bdclick5`.`bdtraslados`.`bodega` AS `bodega` from (`bdclick5`.`bdtraslados` left join (`bdclick5`.`bdtrasladosprod` left join `bdclick5`.`bdproductos` on((`bdclick5`.`bdtrasladosprod`.`producto` = `bdclick5`.`bdproductos`.`Codigo`))) on((`bdclick5`.`bdtraslados`.`Id` = `bdclick5`.`bdtrasladosprod`.`traslado`))) where ((`bdclick5`.`bdtraslados`.`tipo` = \'Ajustes Entrada\') and (`bdclick5`.`bdtraslados`.`anulada` = 0)))
mariadb-version=100135
