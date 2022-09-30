TYPE=VIEW
query=select `bdclick4`.`bdtrasladosbodegas`.`Id` AS `Id`,`bdclick4`.`bdtrasladosbodegas`.`origen` AS `origen`,`bdclick4`.`bdtrasladosbodegas`.`destino` AS `destino`,`bdclick4`.`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdclick4`.`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdclick4`.`bdtrasladosbodegas`.`valor` AS `valor`,`bdclick4`.`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdclick4`.`bdtrasladosbodegas`.`estado` AS `estado`,`bdclick4`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick4`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick4`.`bdtrasladosbodegasprod`.`lista` AS `lista`,`bdclick4`.`bdtrasladosbodegasprod`.`imeil` AS `imeil`,`bdclick4`.`bdtrasladosbodegasprod`.`observacion` AS `observacion`,`bdclick4`.`bdtrasladosbodegasprod`.`total` AS `total`,`bdbodegas_1`.`nombre` AS `BodegaDestino`,`bdclick4`.`bdbodegas`.`nombre` AS `BodegaOrigen`,`bdclick4`.`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdclick4`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick4`.`bdtrasladosbodegasprod`.`lote` AS `lote`,`bdclick4`.`bdtrasladosbodegasprod`.`estado` AS `estadoProd`,`bdclick4`.`bdtrasladosbodegasprod`.`idProd` AS `idProd` from ((((`bdclick4`.`bdtrasladosbodegas` join `bdclick4`.`bdtrasladosbodegasprod` on((`bdclick4`.`bdtrasladosbodegas`.`Id` = `bdclick4`.`bdtrasladosbodegasprod`.`traslado`))) join `bdclick4`.`bdbodegas` on((`bdclick4`.`bdtrasladosbodegas`.`origen` = `bdclick4`.`bdbodegas`.`codigo`))) join `bdclick4`.`bdbodegas` `bdbodegas_1` on((`bdclick4`.`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`))) left join `bdclick4`.`bdproductos` on((`bdclick4`.`bdtrasladosbodegasprod`.`producto` = `bdclick4`.`bdproductos`.`Codigo`)))
md5=d1b725030dd86bfc92bb21745a1ff060
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:33
create-version=2
source=select `bdtrasladosbodegas`.`Id` AS `Id`,`bdtrasladosbodegas`.`origen` AS `origen`,`bdtrasladosbodegas`.`destino` AS `destino`,`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdtrasladosbodegas`.`valor` AS `valor`,`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdtrasladosbodegas`.`estado` AS `estado`,`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdtrasladosbodegasprod`.`lista` AS `lista`,`bdtrasladosbodegasprod`.`imeil` AS `imeil`,`bdtrasladosbodegasprod`.`observacion` AS `observacion`,`bdtrasladosbodegasprod`.`total` AS `total`,`bdbodegas_1`.`nombre` AS `BodegaDestino`,`bdbodegas`.`nombre` AS `BodegaOrigen`,`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdproductos`.`Descripcion` AS `Descripcion`,`bdtrasladosbodegasprod`.`lote` AS `lote`,`bdtrasladosbodegasprod`.`estado` AS `estadoProd`,`bdtrasladosbodegasprod`.`idProd` AS `idProd` from ((((`bdtrasladosbodegas` join `bdtrasladosbodegasprod` on((`bdtrasladosbodegas`.`Id` = `bdtrasladosbodegasprod`.`traslado`))) join `bdbodegas` on((`bdtrasladosbodegas`.`origen` = `bdbodegas`.`codigo`))) join `bdbodegas` `bdbodegas_1` on((`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`))) left join `bdproductos` on((`bdtrasladosbodegasprod`.`producto` = `bdproductos`.`Codigo`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdtrasladosbodegas`.`Id` AS `Id`,`bdclick4`.`bdtrasladosbodegas`.`origen` AS `origen`,`bdclick4`.`bdtrasladosbodegas`.`destino` AS `destino`,`bdclick4`.`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdclick4`.`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdclick4`.`bdtrasladosbodegas`.`valor` AS `valor`,`bdclick4`.`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdclick4`.`bdtrasladosbodegas`.`estado` AS `estado`,`bdclick4`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick4`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick4`.`bdtrasladosbodegasprod`.`lista` AS `lista`,`bdclick4`.`bdtrasladosbodegasprod`.`imeil` AS `imeil`,`bdclick4`.`bdtrasladosbodegasprod`.`observacion` AS `observacion`,`bdclick4`.`bdtrasladosbodegasprod`.`total` AS `total`,`bdbodegas_1`.`nombre` AS `BodegaDestino`,`bdclick4`.`bdbodegas`.`nombre` AS `BodegaOrigen`,`bdclick4`.`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdclick4`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick4`.`bdtrasladosbodegasprod`.`lote` AS `lote`,`bdclick4`.`bdtrasladosbodegasprod`.`estado` AS `estadoProd`,`bdclick4`.`bdtrasladosbodegasprod`.`idProd` AS `idProd` from ((((`bdclick4`.`bdtrasladosbodegas` join `bdclick4`.`bdtrasladosbodegasprod` on((`bdclick4`.`bdtrasladosbodegas`.`Id` = `bdclick4`.`bdtrasladosbodegasprod`.`traslado`))) join `bdclick4`.`bdbodegas` on((`bdclick4`.`bdtrasladosbodegas`.`origen` = `bdclick4`.`bdbodegas`.`codigo`))) join `bdclick4`.`bdbodegas` `bdbodegas_1` on((`bdclick4`.`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`))) left join `bdclick4`.`bdproductos` on((`bdclick4`.`bdtrasladosbodegasprod`.`producto` = `bdclick4`.`bdproductos`.`Codigo`)))
mariadb-version=100135
