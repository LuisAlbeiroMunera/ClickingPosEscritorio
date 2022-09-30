TYPE=VIEW
query=select `bdclick3`.`bdbodegas`.`nombre` AS `nomO`,`bdbodegas_1`.`nombre` AS `nomD`,cast(substr(`bdclick3`.`bdtrasladosbodegasprod`.`traslado`,7,100) as signed) AS `conse`,`bdclick3`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick3`.`bdtrasladosbodegasprod`.`traslado` AS `traslado`,`bdclick3`.`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdclick3`.`bdtrasladosbodegas`.`origen` AS `origen`,`bdclick3`.`bdtrasladosbodegas`.`destino` AS `destino`,`bdclick3`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick3`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick3`.`bdtrasladosbodegasprod`.`lista` AS `lista`,`bdclick3`.`bdtrasladosbodegasprod`.`total` AS `total`,`bdclick3`.`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdclick3`.`bdtrasladosbodegas`.`valor` AS `valor`,`bdclick3`.`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdclick3`.`bdtrasladosbodegas`.`terminal` AS `terminal`,`bdclick3`.`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdclick3`.`bdtrasladosbodegasprod`.`imeil` AS `imeil`,`bdclick3`.`bdtrasladosbodegasprod`.`observacion` AS `observacion`,`bdclick3`.`bdtrasladosbodegas`.`tipo` AS `tipo`,`bdclick3`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick3`.`bdtrasladosbodegas`.`hora` AS `hora`,`bdclick3`.`bdtrasladosbodegas`.`usuario` AS `usuario`,`bdclick3`.`bdtrasladosbodegasprod`.`Id` AS `Id`,`bdclick3`.`bdtrasladosbodegasprod`.`iva` AS `iva` from ((((`bdclick3`.`bdtrasladosbodegasprod` left join `bdclick3`.`bdtrasladosbodegas` on((`bdclick3`.`bdtrasladosbodegas`.`Id` = `bdclick3`.`bdtrasladosbodegasprod`.`traslado`))) left join `bdclick3`.`bdbodegas` on((`bdclick3`.`bdtrasladosbodegas`.`origen` = `bdclick3`.`bdbodegas`.`codigo`))) left join `bdclick3`.`bdbodegas` `bdbodegas_1` on((`bdclick3`.`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`))) left join `bdclick3`.`bdproductos` on((`bdclick3`.`bdtrasladosbodegasprod`.`producto` = `bdclick3`.`bdproductos`.`idSistema`))) where (not((`bdclick3`.`bdtrasladosbodegasprod`.`traslado` like \'TRASINI-*\')))
md5=778213cb6380101564a35224e01e0524
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:54
create-version=2
source=select `bdbodegas`.`nombre` AS `nomO`,`bdbodegas_1`.`nombre` AS `nomD`,cast(substr(`bdtrasladosbodegasprod`.`traslado`,7,100) as signed) AS `conse`,`bdproductos`.`Descripcion` AS `Descripcion`,`bdtrasladosbodegasprod`.`traslado` AS `traslado`,`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdtrasladosbodegas`.`origen` AS `origen`,`bdtrasladosbodegas`.`destino` AS `destino`,`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdtrasladosbodegasprod`.`lista` AS `lista`,`bdtrasladosbodegasprod`.`total` AS `total`,`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdtrasladosbodegas`.`valor` AS `valor`,`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdtrasladosbodegas`.`terminal` AS `terminal`,`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdtrasladosbodegasprod`.`imeil` AS `imeil`,`bdtrasladosbodegasprod`.`observacion` AS `observacion`,`bdtrasladosbodegas`.`tipo` AS `tipo`,`bdproductos`.`Codigo` AS `Codigo`,`bdtrasladosbodegas`.`hora` AS `hora`,`bdtrasladosbodegas`.`usuario` AS `usuario`,`bdtrasladosbodegasprod`.`Id` AS `Id`,`bdtrasladosbodegasprod`.`iva` AS `iva` from ((((`bdtrasladosbodegasprod` left join `bdtrasladosbodegas` on((`bdtrasladosbodegas`.`Id` = `bdtrasladosbodegasprod`.`traslado`))) left join `bdbodegas` on((`bdtrasladosbodegas`.`origen` = `bdbodegas`.`codigo`))) left join `bdbodegas` `bdbodegas_1` on((`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`))) left join `bdproductos` on((`bdtrasladosbodegasprod`.`producto` = `bdproductos`.`idSistema`))) where (not((`bdtrasladosbodegasprod`.`traslado` like \'TRASINI-*\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdbodegas`.`nombre` AS `nomO`,`bdbodegas_1`.`nombre` AS `nomD`,cast(substr(`bdclick3`.`bdtrasladosbodegasprod`.`traslado`,7,100) as signed) AS `conse`,`bdclick3`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick3`.`bdtrasladosbodegasprod`.`traslado` AS `traslado`,`bdclick3`.`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdclick3`.`bdtrasladosbodegas`.`origen` AS `origen`,`bdclick3`.`bdtrasladosbodegas`.`destino` AS `destino`,`bdclick3`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick3`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick3`.`bdtrasladosbodegasprod`.`lista` AS `lista`,`bdclick3`.`bdtrasladosbodegasprod`.`total` AS `total`,`bdclick3`.`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdclick3`.`bdtrasladosbodegas`.`valor` AS `valor`,`bdclick3`.`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdclick3`.`bdtrasladosbodegas`.`terminal` AS `terminal`,`bdclick3`.`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdclick3`.`bdtrasladosbodegasprod`.`imeil` AS `imeil`,`bdclick3`.`bdtrasladosbodegasprod`.`observacion` AS `observacion`,`bdclick3`.`bdtrasladosbodegas`.`tipo` AS `tipo`,`bdclick3`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick3`.`bdtrasladosbodegas`.`hora` AS `hora`,`bdclick3`.`bdtrasladosbodegas`.`usuario` AS `usuario`,`bdclick3`.`bdtrasladosbodegasprod`.`Id` AS `Id`,`bdclick3`.`bdtrasladosbodegasprod`.`iva` AS `iva` from ((((`bdclick3`.`bdtrasladosbodegasprod` left join `bdclick3`.`bdtrasladosbodegas` on((`bdclick3`.`bdtrasladosbodegas`.`Id` = `bdclick3`.`bdtrasladosbodegasprod`.`traslado`))) left join `bdclick3`.`bdbodegas` on((`bdclick3`.`bdtrasladosbodegas`.`origen` = `bdclick3`.`bdbodegas`.`codigo`))) left join `bdclick3`.`bdbodegas` `bdbodegas_1` on((`bdclick3`.`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`))) left join `bdclick3`.`bdproductos` on((`bdclick3`.`bdtrasladosbodegasprod`.`producto` = `bdclick3`.`bdproductos`.`idSistema`))) where (not((`bdclick3`.`bdtrasladosbodegasprod`.`traslado` like \'TRASINI-*\')))
mariadb-version=100135