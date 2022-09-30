TYPE=VIEW
query=select `bdclick1`.`bdtrasladosbodegas`.`Id` AS `Id`,`bdclick1`.`bdtrasladosbodegas`.`origen` AS `origen`,`bdclick1`.`bdtrasladosbodegas`.`destino` AS `destino`,`bdclick1`.`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdclick1`.`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdclick1`.`bdtrasladosbodegas`.`valor` AS `valor`,`bdclick1`.`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdclick1`.`bdtrasladosbodegas`.`estado` AS `estado`,`bdclick1`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick1`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick1`.`bdtrasladosbodegasprod`.`lista` AS `lista`,`bdclick1`.`bdtrasladosbodegasprod`.`imeil` AS `imeil`,`bdclick1`.`bdtrasladosbodegasprod`.`observacion` AS `observacion`,`bdclick1`.`bdtrasladosbodegasprod`.`total` AS `total`,`bdbodegas_1`.`nombre` AS `BodegaDestino`,`bdclick1`.`bdbodegas`.`nombre` AS `BodegaOrigen`,`bdclick1`.`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdclick1`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick1`.`bdtrasladosbodegasprod`.`lote` AS `lote`,`bdclick1`.`bdtrasladosbodegasprod`.`estado` AS `estadoProd`,`bdclick1`.`bdtrasladosbodegasprod`.`idProd` AS `idProd` from ((((`bdclick1`.`bdtrasladosbodegas` join `bdclick1`.`bdtrasladosbodegasprod` on((`bdclick1`.`bdtrasladosbodegas`.`Id` = `bdclick1`.`bdtrasladosbodegasprod`.`traslado`))) join `bdclick1`.`bdbodegas` on((`bdclick1`.`bdtrasladosbodegas`.`origen` = `bdclick1`.`bdbodegas`.`codigo`))) join `bdclick1`.`bdbodegas` `bdbodegas_1` on((`bdclick1`.`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`))) left join `bdclick1`.`bdproductos` on((`bdclick1`.`bdtrasladosbodegasprod`.`producto` = `bdclick1`.`bdproductos`.`Codigo`)))
md5=f2eb24b4b96f1a991651d01cbcb5acca
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:40
create-version=2
source=select `bdtrasladosbodegas`.`Id` AS `Id`,`bdtrasladosbodegas`.`origen` AS `origen`,`bdtrasladosbodegas`.`destino` AS `destino`,`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdtrasladosbodegas`.`valor` AS `valor`,`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdtrasladosbodegas`.`estado` AS `estado`,`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdtrasladosbodegasprod`.`lista` AS `lista`,`bdtrasladosbodegasprod`.`imeil` AS `imeil`,`bdtrasladosbodegasprod`.`observacion` AS `observacion`,`bdtrasladosbodegasprod`.`total` AS `total`,`bdbodegas_1`.`nombre` AS `BodegaDestino`,`bdbodegas`.`nombre` AS `BodegaOrigen`,`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdproductos`.`Descripcion` AS `Descripcion`,`bdtrasladosbodegasprod`.`lote` AS `lote`,`bdtrasladosbodegasprod`.`estado` AS `estadoProd`,`bdtrasladosbodegasprod`.`idProd` AS `idProd` from ((((`bdtrasladosbodegas` join `bdtrasladosbodegasprod` on((`bdtrasladosbodegas`.`Id` = `bdtrasladosbodegasprod`.`traslado`))) join `bdbodegas` on((`bdtrasladosbodegas`.`origen` = `bdbodegas`.`codigo`))) join `bdbodegas` `bdbodegas_1` on((`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`))) left join `bdproductos` on((`bdtrasladosbodegasprod`.`producto` = `bdproductos`.`Codigo`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdtrasladosbodegas`.`Id` AS `Id`,`bdclick1`.`bdtrasladosbodegas`.`origen` AS `origen`,`bdclick1`.`bdtrasladosbodegas`.`destino` AS `destino`,`bdclick1`.`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdclick1`.`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdclick1`.`bdtrasladosbodegas`.`valor` AS `valor`,`bdclick1`.`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdclick1`.`bdtrasladosbodegas`.`estado` AS `estado`,`bdclick1`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick1`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick1`.`bdtrasladosbodegasprod`.`lista` AS `lista`,`bdclick1`.`bdtrasladosbodegasprod`.`imeil` AS `imeil`,`bdclick1`.`bdtrasladosbodegasprod`.`observacion` AS `observacion`,`bdclick1`.`bdtrasladosbodegasprod`.`total` AS `total`,`bdbodegas_1`.`nombre` AS `BodegaDestino`,`bdclick1`.`bdbodegas`.`nombre` AS `BodegaOrigen`,`bdclick1`.`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdclick1`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick1`.`bdtrasladosbodegasprod`.`lote` AS `lote`,`bdclick1`.`bdtrasladosbodegasprod`.`estado` AS `estadoProd`,`bdclick1`.`bdtrasladosbodegasprod`.`idProd` AS `idProd` from ((((`bdclick1`.`bdtrasladosbodegas` join `bdclick1`.`bdtrasladosbodegasprod` on((`bdclick1`.`bdtrasladosbodegas`.`Id` = `bdclick1`.`bdtrasladosbodegasprod`.`traslado`))) join `bdclick1`.`bdbodegas` on((`bdclick1`.`bdtrasladosbodegas`.`origen` = `bdclick1`.`bdbodegas`.`codigo`))) join `bdclick1`.`bdbodegas` `bdbodegas_1` on((`bdclick1`.`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`))) left join `bdclick1`.`bdproductos` on((`bdclick1`.`bdtrasladosbodegasprod`.`producto` = `bdclick1`.`bdproductos`.`Codigo`)))
mariadb-version=100135