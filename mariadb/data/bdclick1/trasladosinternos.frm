TYPE=VIEW
query=select `bdclick1`.`bdtrasladosinternos`.`Id` AS `Id`,`bdclick1`.`bdtrasladosinternos`.`usuario` AS `usuario`,`bdclick1`.`bdtrasladosinternos`.`origen` AS `origen`,`bdclick1`.`bdtrasladosinternos`.`destino` AS `destino`,`bdclick1`.`bdtrasladosinternos`.`fecha` AS `fecha`,`bdclick1`.`bdtrasladosinternos`.`unidades` AS `unidades`,`bdclick1`.`bdtrasladosinternos`.`valor` AS `valor`,`bdclick1`.`bdtrasladosinternos`.`diasPlazo` AS `diasPlazo`,`bdclick1`.`bdtrasladosinternos`.`estado` AS `estado`,`bdclick1`.`bdtrasladosinternosprod`.`producto` AS `producto`,`bdclick1`.`bdtrasladosinternosprod`.`cantidad` AS `cantidad`,`bdclick1`.`bdtrasladosinternosprod`.`lista` AS `lista`,`bdclick1`.`bdtrasladosinternosprod`.`imeil` AS `imeil`,`bdclick1`.`bdtrasladosinternosprod`.`observacion` AS `observacion`,`bdclick1`.`bdtrasladosinternosprod`.`total` AS `total`,`bdbodegas_1`.`nombre` AS `BodegaDestino`,`bdclick1`.`bdbodegas`.`nombre` AS `BodegaOrigen`,`bdclick1`.`bdtrasladosinternos`.`anulada` AS `anulada`,`bdclick1`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick1`.`bdtrasladosinternosprod`.`lote` AS `lote`,`bdclick1`.`bdtrasladosinternosprod`.`estado` AS `estadoProd`,`bdclick1`.`bdtrasladosinternosprod`.`idProd` AS `idProd` from ((((`bdclick1`.`bdtrasladosinternos` join `bdclick1`.`bdtrasladosinternosprod` on((`bdclick1`.`bdtrasladosinternos`.`Id` = `bdclick1`.`bdtrasladosinternosprod`.`traslado`))) join `bdclick1`.`bdbodegas` on((`bdclick1`.`bdtrasladosinternos`.`origen` = `bdclick1`.`bdbodegas`.`codigo`))) join `bdclick1`.`bdbodegas` `bdbodegas_1` on((`bdclick1`.`bdtrasladosinternos`.`destino` = `bdbodegas_1`.`codigo`))) left join `bdclick1`.`bdproductos` on((`bdclick1`.`bdtrasladosinternosprod`.`producto` = `bdclick1`.`bdproductos`.`Codigo`)))
md5=201b864d684e1fc11fa51ecebdd0f90c
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:40
create-version=2
source=select `bdtrasladosinternos`.`Id` AS `Id`,`bdtrasladosinternos`.`usuario` AS `usuario`,`bdtrasladosinternos`.`origen` AS `origen`,`bdtrasladosinternos`.`destino` AS `destino`,`bdtrasladosinternos`.`fecha` AS `fecha`,`bdtrasladosinternos`.`unidades` AS `unidades`,`bdtrasladosinternos`.`valor` AS `valor`,`bdtrasladosinternos`.`diasPlazo` AS `diasPlazo`,`bdtrasladosinternos`.`estado` AS `estado`,`bdtrasladosinternosprod`.`producto` AS `producto`,`bdtrasladosinternosprod`.`cantidad` AS `cantidad`,`bdtrasladosinternosprod`.`lista` AS `lista`,`bdtrasladosinternosprod`.`imeil` AS `imeil`,`bdtrasladosinternosprod`.`observacion` AS `observacion`,`bdtrasladosinternosprod`.`total` AS `total`,`bdbodegas_1`.`nombre` AS `BodegaDestino`,`bdbodegas`.`nombre` AS `BodegaOrigen`,`bdtrasladosinternos`.`anulada` AS `anulada`,`bdproductos`.`Descripcion` AS `Descripcion`,`bdtrasladosinternosprod`.`lote` AS `lote`,`bdtrasladosinternosprod`.`estado` AS `estadoProd`,`bdtrasladosinternosprod`.`idProd` AS `idProd` from ((((`bdtrasladosinternos` join `bdtrasladosinternosprod` on((`bdtrasladosinternos`.`Id` = `bdtrasladosinternosprod`.`traslado`))) join `bdbodegas` on((`bdtrasladosinternos`.`origen` = `bdbodegas`.`codigo`))) join `bdbodegas` `bdbodegas_1` on((`bdtrasladosinternos`.`destino` = `bdbodegas_1`.`codigo`))) left join `bdproductos` on((`bdtrasladosinternosprod`.`producto` = `bdproductos`.`Codigo`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdtrasladosinternos`.`Id` AS `Id`,`bdclick1`.`bdtrasladosinternos`.`usuario` AS `usuario`,`bdclick1`.`bdtrasladosinternos`.`origen` AS `origen`,`bdclick1`.`bdtrasladosinternos`.`destino` AS `destino`,`bdclick1`.`bdtrasladosinternos`.`fecha` AS `fecha`,`bdclick1`.`bdtrasladosinternos`.`unidades` AS `unidades`,`bdclick1`.`bdtrasladosinternos`.`valor` AS `valor`,`bdclick1`.`bdtrasladosinternos`.`diasPlazo` AS `diasPlazo`,`bdclick1`.`bdtrasladosinternos`.`estado` AS `estado`,`bdclick1`.`bdtrasladosinternosprod`.`producto` AS `producto`,`bdclick1`.`bdtrasladosinternosprod`.`cantidad` AS `cantidad`,`bdclick1`.`bdtrasladosinternosprod`.`lista` AS `lista`,`bdclick1`.`bdtrasladosinternosprod`.`imeil` AS `imeil`,`bdclick1`.`bdtrasladosinternosprod`.`observacion` AS `observacion`,`bdclick1`.`bdtrasladosinternosprod`.`total` AS `total`,`bdbodegas_1`.`nombre` AS `BodegaDestino`,`bdclick1`.`bdbodegas`.`nombre` AS `BodegaOrigen`,`bdclick1`.`bdtrasladosinternos`.`anulada` AS `anulada`,`bdclick1`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick1`.`bdtrasladosinternosprod`.`lote` AS `lote`,`bdclick1`.`bdtrasladosinternosprod`.`estado` AS `estadoProd`,`bdclick1`.`bdtrasladosinternosprod`.`idProd` AS `idProd` from ((((`bdclick1`.`bdtrasladosinternos` join `bdclick1`.`bdtrasladosinternosprod` on((`bdclick1`.`bdtrasladosinternos`.`Id` = `bdclick1`.`bdtrasladosinternosprod`.`traslado`))) join `bdclick1`.`bdbodegas` on((`bdclick1`.`bdtrasladosinternos`.`origen` = `bdclick1`.`bdbodegas`.`codigo`))) join `bdclick1`.`bdbodegas` `bdbodegas_1` on((`bdclick1`.`bdtrasladosinternos`.`destino` = `bdbodegas_1`.`codigo`))) left join `bdclick1`.`bdproductos` on((`bdclick1`.`bdtrasladosinternosprod`.`producto` = `bdclick1`.`bdproductos`.`Codigo`)))
mariadb-version=100135