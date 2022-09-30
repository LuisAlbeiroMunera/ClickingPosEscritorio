TYPE=VIEW
query=(select `bdclick`.`bdtraslados`.`Id` AS `Id`,`bdclick`.`bdtraslados`.`tipo` AS `tipo`,`bdclick`.`bdtraslados`.`anulada` AS `anulada`,`bdclick`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick`.`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdclick`.`bdtrasladosprod`.`lista` AS `lista`,`bdclick`.`bdtrasladosprod`.`total` AS `total`,`bdclick`.`bdtraslados`.`usuario` AS `usuario`,`bdclick`.`bdtraslados`.`fecha` AS `fecha`,`bdclick`.`bdtraslados`.`bodega` AS `bodega` from (`bdclick`.`bdtraslados` left join (`bdclick`.`bdtrasladosprod` left join `bdclick`.`bdproductos` on((`bdclick`.`bdtrasladosprod`.`producto` = `bdclick`.`bdproductos`.`idSistema`))) on((`bdclick`.`bdtraslados`.`Id` = `bdclick`.`bdtrasladosprod`.`traslado`))) where ((`bdclick`.`bdtraslados`.`tipo` = \'Ajuste Salida\') and (`bdclick`.`bdtraslados`.`anulada` = 0)))
md5=2568bc00342acaa8d8860f294b58b0de
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:21
create-version=2
source=(select `bdtraslados`.`Id` AS `Id`,`bdtraslados`.`tipo` AS `tipo`,`bdtraslados`.`anulada` AS `anulada`,`bdtrasladosprod`.`producto` AS `producto`,`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdtrasladosprod`.`lista` AS `lista`,`bdtrasladosprod`.`total` AS `total`,`bdtraslados`.`usuario` AS `usuario`,`bdtraslados`.`fecha` AS `fecha`,`bdtraslados`.`bodega` AS `bodega` from (`bdtraslados` left join (`bdtrasladosprod` left join `bdproductos` on((`bdtrasladosprod`.`producto` = `bdproductos`.`idSistema`))) on((`bdtraslados`.`Id` = `bdtrasladosprod`.`traslado`))) where ((`bdtraslados`.`tipo` = \'Ajuste Salida\') and (`bdtraslados`.`anulada` = 0)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdtraslados`.`Id` AS `Id`,`bdclick`.`bdtraslados`.`tipo` AS `tipo`,`bdclick`.`bdtraslados`.`anulada` AS `anulada`,`bdclick`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick`.`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdclick`.`bdtrasladosprod`.`lista` AS `lista`,`bdclick`.`bdtrasladosprod`.`total` AS `total`,`bdclick`.`bdtraslados`.`usuario` AS `usuario`,`bdclick`.`bdtraslados`.`fecha` AS `fecha`,`bdclick`.`bdtraslados`.`bodega` AS `bodega` from (`bdclick`.`bdtraslados` left join (`bdclick`.`bdtrasladosprod` left join `bdclick`.`bdproductos` on((`bdclick`.`bdtrasladosprod`.`producto` = `bdclick`.`bdproductos`.`idSistema`))) on((`bdclick`.`bdtraslados`.`Id` = `bdclick`.`bdtrasladosprod`.`traslado`))) where ((`bdclick`.`bdtraslados`.`tipo` = \'Ajuste Salida\') and (`bdclick`.`bdtraslados`.`anulada` = 0)))
mariadb-version=100135
