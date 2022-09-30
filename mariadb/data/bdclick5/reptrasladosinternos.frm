TYPE=VIEW
query=select `bdclick5`.`bdbodegas`.`nombre` AS `nomO`,`bdbodegas_1`.`nombre` AS `nomD`,`bdclick5`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick5`.`bdtrasladosinternosprod`.`traslado` AS `traslado`,`bdclick5`.`bdtrasladosinternos`.`fecha` AS `fecha`,`bdclick5`.`bdtrasladosinternos`.`origen` AS `origen`,`bdclick5`.`bdtrasladosinternos`.`destino` AS `destino`,`bdclick5`.`bdtrasladosinternosprod`.`producto` AS `producto`,`bdclick5`.`bdtrasladosinternosprod`.`imeil` AS `detalle`,`bdclick5`.`bdtrasladosinternosprod`.`cantidad` AS `cantidad`,`bdclick5`.`bdtrasladosinternos`.`unidades` AS `unidades`,`bdclick5`.`bdtrasladosinternos`.`anulada` AS `anulada`,`bdclick5`.`bdtrasladosinternos`.`terminal` AS `terminal`,`bdclick5`.`bdtrasladosinternosprod`.`observacion` AS `observacion`,`bdclick5`.`bdtrasladosinternos`.`tipo` AS `tipo`,`bdclick5`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick5`.`bdtrasladosinternosprod`.`lista` AS `lista`,`bdclick5`.`bdtrasladosinternosprod`.`total` AS `total`,`bdclick5`.`bdtrasladosinternos`.`valor` AS `valor`,`bdclick5`.`bdtrasladosinternos`.`hora` AS `hora`,`bdclick5`.`bdtrasladosinternos`.`usuario` AS `usuario`,`bdclick5`.`bdtrasladosinternosprod`.`Id` AS `Id` from ((((`bdclick5`.`bdtrasladosinternosprod` left join `bdclick5`.`bdtrasladosinternos` on((`bdclick5`.`bdtrasladosinternos`.`Id` = `bdclick5`.`bdtrasladosinternosprod`.`traslado`))) left join `bdclick5`.`bdbodegas` on((`bdclick5`.`bdtrasladosinternos`.`origen` = `bdclick5`.`bdbodegas`.`codigo`))) left join `bdclick5`.`bdbodegas` `bdbodegas_1` on((`bdclick5`.`bdtrasladosinternos`.`destino` = `bdbodegas_1`.`codigo`))) left join `bdclick5`.`bdproductos` on((`bdclick5`.`bdtrasladosinternosprod`.`producto` = `bdclick5`.`bdproductos`.`idSistema`))) where (not((`bdclick5`.`bdtrasladosinternosprod`.`traslado` like \'TRASINI-*\'))) order by `bdclick5`.`bdtrasladosinternosprod`.`Id`
md5=1632b0b5d80cdd4143b185648467050d
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:50
create-version=2
source=select `bdbodegas`.`nombre` AS `nomO`,`bdbodegas_1`.`nombre` AS `nomD`,`bdproductos`.`Descripcion` AS `Descripcion`,`bdtrasladosinternosprod`.`traslado` AS `traslado`,`bdtrasladosinternos`.`fecha` AS `fecha`,`bdtrasladosinternos`.`origen` AS `origen`,`bdtrasladosinternos`.`destino` AS `destino`,`bdtrasladosinternosprod`.`producto` AS `producto`,`bdtrasladosinternosprod`.`imeil` AS `detalle`,`bdtrasladosinternosprod`.`cantidad` AS `cantidad`,`bdtrasladosinternos`.`unidades` AS `unidades`,`bdtrasladosinternos`.`anulada` AS `anulada`,`bdtrasladosinternos`.`terminal` AS `terminal`,`bdtrasladosinternosprod`.`observacion` AS `observacion`,`bdtrasladosinternos`.`tipo` AS `tipo`,`bdproductos`.`Codigo` AS `Codigo`,`bdtrasladosinternosprod`.`lista` AS `lista`,`bdtrasladosinternosprod`.`total` AS `total`,`bdtrasladosinternos`.`valor` AS `valor`,`bdtrasladosinternos`.`hora` AS `hora`,`bdtrasladosinternos`.`usuario` AS `usuario`,`bdtrasladosinternosprod`.`Id` AS `Id` from ((((`bdtrasladosinternosprod` left join `bdtrasladosinternos` on((`bdtrasladosinternos`.`Id` = `bdtrasladosinternosprod`.`traslado`))) left join `bdbodegas` on((`bdtrasladosinternos`.`origen` = `bdbodegas`.`codigo`))) left join `bdbodegas` `bdbodegas_1` on((`bdtrasladosinternos`.`destino` = `bdbodegas_1`.`codigo`))) left join `bdproductos` on((`bdtrasladosinternosprod`.`producto` = `bdproductos`.`idSistema`))) where (not((`bdtrasladosinternosprod`.`traslado` like \'TRASINI-*\'))) order by `bdtrasladosinternosprod`.`Id`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdbodegas`.`nombre` AS `nomO`,`bdbodegas_1`.`nombre` AS `nomD`,`bdclick5`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick5`.`bdtrasladosinternosprod`.`traslado` AS `traslado`,`bdclick5`.`bdtrasladosinternos`.`fecha` AS `fecha`,`bdclick5`.`bdtrasladosinternos`.`origen` AS `origen`,`bdclick5`.`bdtrasladosinternos`.`destino` AS `destino`,`bdclick5`.`bdtrasladosinternosprod`.`producto` AS `producto`,`bdclick5`.`bdtrasladosinternosprod`.`imeil` AS `detalle`,`bdclick5`.`bdtrasladosinternosprod`.`cantidad` AS `cantidad`,`bdclick5`.`bdtrasladosinternos`.`unidades` AS `unidades`,`bdclick5`.`bdtrasladosinternos`.`anulada` AS `anulada`,`bdclick5`.`bdtrasladosinternos`.`terminal` AS `terminal`,`bdclick5`.`bdtrasladosinternosprod`.`observacion` AS `observacion`,`bdclick5`.`bdtrasladosinternos`.`tipo` AS `tipo`,`bdclick5`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick5`.`bdtrasladosinternosprod`.`lista` AS `lista`,`bdclick5`.`bdtrasladosinternosprod`.`total` AS `total`,`bdclick5`.`bdtrasladosinternos`.`valor` AS `valor`,`bdclick5`.`bdtrasladosinternos`.`hora` AS `hora`,`bdclick5`.`bdtrasladosinternos`.`usuario` AS `usuario`,`bdclick5`.`bdtrasladosinternosprod`.`Id` AS `Id` from ((((`bdclick5`.`bdtrasladosinternosprod` left join `bdclick5`.`bdtrasladosinternos` on((`bdclick5`.`bdtrasladosinternos`.`Id` = `bdclick5`.`bdtrasladosinternosprod`.`traslado`))) left join `bdclick5`.`bdbodegas` on((`bdclick5`.`bdtrasladosinternos`.`origen` = `bdclick5`.`bdbodegas`.`codigo`))) left join `bdclick5`.`bdbodegas` `bdbodegas_1` on((`bdclick5`.`bdtrasladosinternos`.`destino` = `bdbodegas_1`.`codigo`))) left join `bdclick5`.`bdproductos` on((`bdclick5`.`bdtrasladosinternosprod`.`producto` = `bdclick5`.`bdproductos`.`idSistema`))) where (not((`bdclick5`.`bdtrasladosinternosprod`.`traslado` like \'TRASINI-*\'))) order by `bdclick5`.`bdtrasladosinternosprod`.`Id`
mariadb-version=100135