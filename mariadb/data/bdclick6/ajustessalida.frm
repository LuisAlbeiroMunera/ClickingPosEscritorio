TYPE=VIEW
query=(select `bdclick6`.`bdtraslados`.`Id` AS `Id`,`bdclick6`.`bdtraslados`.`tipo` AS `tipo`,`bdclick6`.`bdtraslados`.`anulada` AS `anulada`,`bdclick6`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick6`.`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdclick6`.`bdtrasladosprod`.`lista` AS `lista`,`bdclick6`.`bdtrasladosprod`.`total` AS `total`,`bdclick6`.`bdtraslados`.`usuario` AS `usuario`,`bdclick6`.`bdtraslados`.`fecha` AS `fecha`,`bdclick6`.`bdtraslados`.`bodega` AS `bodega` from (`bdclick6`.`bdtraslados` left join (`bdclick6`.`bdtrasladosprod` left join `bdclick6`.`bdproductos` on((`bdclick6`.`bdtrasladosprod`.`producto` = `bdclick6`.`bdproductos`.`idSistema`))) on((`bdclick6`.`bdtraslados`.`Id` = `bdclick6`.`bdtrasladosprod`.`traslado`))) where ((`bdclick6`.`bdtraslados`.`tipo` = \'Ajuste Salida\') and (`bdclick6`.`bdtraslados`.`anulada` = 0)))
md5=2d8680a1996bda6dc70d77e7d3dd9902
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:32
create-version=2
source=(select `bdtraslados`.`Id` AS `Id`,`bdtraslados`.`tipo` AS `tipo`,`bdtraslados`.`anulada` AS `anulada`,`bdtrasladosprod`.`producto` AS `producto`,`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdtrasladosprod`.`lista` AS `lista`,`bdtrasladosprod`.`total` AS `total`,`bdtraslados`.`usuario` AS `usuario`,`bdtraslados`.`fecha` AS `fecha`,`bdtraslados`.`bodega` AS `bodega` from (`bdtraslados` left join (`bdtrasladosprod` left join `bdproductos` on((`bdtrasladosprod`.`producto` = `bdproductos`.`idSistema`))) on((`bdtraslados`.`Id` = `bdtrasladosprod`.`traslado`))) where ((`bdtraslados`.`tipo` = \'Ajuste Salida\') and (`bdtraslados`.`anulada` = 0)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bdtraslados`.`Id` AS `Id`,`bdclick6`.`bdtraslados`.`tipo` AS `tipo`,`bdclick6`.`bdtraslados`.`anulada` AS `anulada`,`bdclick6`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick6`.`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdclick6`.`bdtrasladosprod`.`lista` AS `lista`,`bdclick6`.`bdtrasladosprod`.`total` AS `total`,`bdclick6`.`bdtraslados`.`usuario` AS `usuario`,`bdclick6`.`bdtraslados`.`fecha` AS `fecha`,`bdclick6`.`bdtraslados`.`bodega` AS `bodega` from (`bdclick6`.`bdtraslados` left join (`bdclick6`.`bdtrasladosprod` left join `bdclick6`.`bdproductos` on((`bdclick6`.`bdtrasladosprod`.`producto` = `bdclick6`.`bdproductos`.`idSistema`))) on((`bdclick6`.`bdtraslados`.`Id` = `bdclick6`.`bdtrasladosprod`.`traslado`))) where ((`bdclick6`.`bdtraslados`.`tipo` = \'Ajuste Salida\') and (`bdclick6`.`bdtraslados`.`anulada` = 0)))
mariadb-version=100135
