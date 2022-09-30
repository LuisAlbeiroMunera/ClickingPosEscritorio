TYPE=VIEW
query=select `bdclick3`.`bdtrasladosbodegas`.`Id` AS `Id`,`bdclick3`.`bdtrasladosbodegas`.`origen` AS `origen`,`bdclick3`.`bdtrasladosbodegas`.`destino` AS `destino`,`bdclick3`.`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdclick3`.`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdclick3`.`bdtrasladosbodegas`.`valor` AS `valor`,`bdclick3`.`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdclick3`.`bdtrasladosbodegas`.`estado` AS `estado`,`bdclick3`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick3`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick3`.`bdtrasladosbodegasprod`.`lista` AS `lista`,`bdclick3`.`bdtrasladosbodegasprod`.`imeil` AS `imeil`,`bdclick3`.`bdtrasladosbodegasprod`.`observacion` AS `observacion`,`bdclick3`.`bdtrasladosbodegasprod`.`total` AS `total`,`bdbodegas_1`.`nombre` AS `BodegaDestino`,`bdclick3`.`bdbodegas`.`nombre` AS `BodegaOrigen`,`bdclick3`.`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdclick3`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick3`.`bdtrasladosbodegasprod`.`lote` AS `lote`,`bdclick3`.`bdtrasladosbodegasprod`.`estado` AS `estadoProd`,`bdclick3`.`bdtrasladosbodegasprod`.`idProd` AS `idProd` from ((((`bdclick3`.`bdtrasladosbodegas` join `bdclick3`.`bdtrasladosbodegasprod` on((`bdclick3`.`bdtrasladosbodegas`.`Id` = `bdclick3`.`bdtrasladosbodegasprod`.`traslado`))) join `bdclick3`.`bdbodegas` on((`bdclick3`.`bdtrasladosbodegas`.`origen` = `bdclick3`.`bdbodegas`.`codigo`))) join `bdclick3`.`bdbodegas` `bdbodegas_1` on((`bdclick3`.`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`))) left join `bdclick3`.`bdproductos` on((`bdclick3`.`bdtrasladosbodegasprod`.`producto` = `bdclick3`.`bdproductos`.`Codigo`)))
md5=c6102c032a5384cf68838b7480dba6b2
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:56
create-version=2
source=select `bdtrasladosbodegas`.`Id` AS `Id`,`bdtrasladosbodegas`.`origen` AS `origen`,`bdtrasladosbodegas`.`destino` AS `destino`,`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdtrasladosbodegas`.`valor` AS `valor`,`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdtrasladosbodegas`.`estado` AS `estado`,`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdtrasladosbodegasprod`.`lista` AS `lista`,`bdtrasladosbodegasprod`.`imeil` AS `imeil`,`bdtrasladosbodegasprod`.`observacion` AS `observacion`,`bdtrasladosbodegasprod`.`total` AS `total`,`bdbodegas_1`.`nombre` AS `BodegaDestino`,`bdbodegas`.`nombre` AS `BodegaOrigen`,`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdproductos`.`Descripcion` AS `Descripcion`,`bdtrasladosbodegasprod`.`lote` AS `lote`,`bdtrasladosbodegasprod`.`estado` AS `estadoProd`,`bdtrasladosbodegasprod`.`idProd` AS `idProd` from ((((`bdtrasladosbodegas` join `bdtrasladosbodegasprod` on((`bdtrasladosbodegas`.`Id` = `bdtrasladosbodegasprod`.`traslado`))) join `bdbodegas` on((`bdtrasladosbodegas`.`origen` = `bdbodegas`.`codigo`))) join `bdbodegas` `bdbodegas_1` on((`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`))) left join `bdproductos` on((`bdtrasladosbodegasprod`.`producto` = `bdproductos`.`Codigo`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdtrasladosbodegas`.`Id` AS `Id`,`bdclick3`.`bdtrasladosbodegas`.`origen` AS `origen`,`bdclick3`.`bdtrasladosbodegas`.`destino` AS `destino`,`bdclick3`.`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdclick3`.`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdclick3`.`bdtrasladosbodegas`.`valor` AS `valor`,`bdclick3`.`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdclick3`.`bdtrasladosbodegas`.`estado` AS `estado`,`bdclick3`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick3`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick3`.`bdtrasladosbodegasprod`.`lista` AS `lista`,`bdclick3`.`bdtrasladosbodegasprod`.`imeil` AS `imeil`,`bdclick3`.`bdtrasladosbodegasprod`.`observacion` AS `observacion`,`bdclick3`.`bdtrasladosbodegasprod`.`total` AS `total`,`bdbodegas_1`.`nombre` AS `BodegaDestino`,`bdclick3`.`bdbodegas`.`nombre` AS `BodegaOrigen`,`bdclick3`.`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdclick3`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick3`.`bdtrasladosbodegasprod`.`lote` AS `lote`,`bdclick3`.`bdtrasladosbodegasprod`.`estado` AS `estadoProd`,`bdclick3`.`bdtrasladosbodegasprod`.`idProd` AS `idProd` from ((((`bdclick3`.`bdtrasladosbodegas` join `bdclick3`.`bdtrasladosbodegasprod` on((`bdclick3`.`bdtrasladosbodegas`.`Id` = `bdclick3`.`bdtrasladosbodegasprod`.`traslado`))) join `bdclick3`.`bdbodegas` on((`bdclick3`.`bdtrasladosbodegas`.`origen` = `bdclick3`.`bdbodegas`.`codigo`))) join `bdclick3`.`bdbodegas` `bdbodegas_1` on((`bdclick3`.`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`))) left join `bdclick3`.`bdproductos` on((`bdclick3`.`bdtrasladosbodegasprod`.`producto` = `bdclick3`.`bdproductos`.`Codigo`)))
mariadb-version=100135
