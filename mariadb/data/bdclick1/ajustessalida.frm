TYPE=VIEW
query=(select `bdclick1`.`bdtraslados`.`Id` AS `Id`,`bdclick1`.`bdtraslados`.`tipo` AS `tipo`,`bdclick1`.`bdtraslados`.`anulada` AS `anulada`,`bdclick1`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick1`.`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdclick1`.`bdtrasladosprod`.`lista` AS `lista`,`bdclick1`.`bdtrasladosprod`.`total` AS `total`,`bdclick1`.`bdtraslados`.`usuario` AS `usuario`,`bdclick1`.`bdtraslados`.`fecha` AS `fecha`,`bdclick1`.`bdtraslados`.`bodega` AS `bodega` from (`bdclick1`.`bdtraslados` left join (`bdclick1`.`bdtrasladosprod` left join `bdclick1`.`bdproductos` on((`bdclick1`.`bdtrasladosprod`.`producto` = `bdclick1`.`bdproductos`.`idSistema`))) on((`bdclick1`.`bdtraslados`.`Id` = `bdclick1`.`bdtrasladosprod`.`traslado`))) where ((`bdclick1`.`bdtraslados`.`tipo` = \'Ajuste Salida\') and (`bdclick1`.`bdtraslados`.`anulada` = 0)))
md5=44556086b3a28e9c3a772c064bf0a47d
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:32
create-version=2
source=(select `bdtraslados`.`Id` AS `Id`,`bdtraslados`.`tipo` AS `tipo`,`bdtraslados`.`anulada` AS `anulada`,`bdtrasladosprod`.`producto` AS `producto`,`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdtrasladosprod`.`lista` AS `lista`,`bdtrasladosprod`.`total` AS `total`,`bdtraslados`.`usuario` AS `usuario`,`bdtraslados`.`fecha` AS `fecha`,`bdtraslados`.`bodega` AS `bodega` from (`bdtraslados` left join (`bdtrasladosprod` left join `bdproductos` on((`bdtrasladosprod`.`producto` = `bdproductos`.`idSistema`))) on((`bdtraslados`.`Id` = `bdtrasladosprod`.`traslado`))) where ((`bdtraslados`.`tipo` = \'Ajuste Salida\') and (`bdtraslados`.`anulada` = 0)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick1`.`bdtraslados`.`Id` AS `Id`,`bdclick1`.`bdtraslados`.`tipo` AS `tipo`,`bdclick1`.`bdtraslados`.`anulada` AS `anulada`,`bdclick1`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick1`.`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdclick1`.`bdtrasladosprod`.`lista` AS `lista`,`bdclick1`.`bdtrasladosprod`.`total` AS `total`,`bdclick1`.`bdtraslados`.`usuario` AS `usuario`,`bdclick1`.`bdtraslados`.`fecha` AS `fecha`,`bdclick1`.`bdtraslados`.`bodega` AS `bodega` from (`bdclick1`.`bdtraslados` left join (`bdclick1`.`bdtrasladosprod` left join `bdclick1`.`bdproductos` on((`bdclick1`.`bdtrasladosprod`.`producto` = `bdclick1`.`bdproductos`.`idSistema`))) on((`bdclick1`.`bdtraslados`.`Id` = `bdclick1`.`bdtrasladosprod`.`traslado`))) where ((`bdclick1`.`bdtraslados`.`tipo` = \'Ajuste Salida\') and (`bdclick1`.`bdtraslados`.`anulada` = 0)))
mariadb-version=100135
