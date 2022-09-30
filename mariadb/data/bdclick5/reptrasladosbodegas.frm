TYPE=VIEW
query=select `bdclick5`.`bdbodegas`.`nombre` AS `nomO`,`bdbodegas_1`.`nombre` AS `nomD`,cast(substr(`bdclick5`.`bdtrasladosbodegasprod`.`traslado`,7,100) as signed) AS `conse`,`bdclick5`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick5`.`bdtrasladosbodegasprod`.`traslado` AS `traslado`,`bdclick5`.`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdclick5`.`bdtrasladosbodegas`.`origen` AS `origen`,`bdclick5`.`bdtrasladosbodegas`.`destino` AS `destino`,`bdclick5`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick5`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick5`.`bdtrasladosbodegasprod`.`lista` AS `lista`,`bdclick5`.`bdtrasladosbodegasprod`.`total` AS `total`,`bdclick5`.`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdclick5`.`bdtrasladosbodegas`.`valor` AS `valor`,`bdclick5`.`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdclick5`.`bdtrasladosbodegas`.`terminal` AS `terminal`,`bdclick5`.`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdclick5`.`bdtrasladosbodegasprod`.`imeil` AS `imeil`,`bdclick5`.`bdtrasladosbodegasprod`.`observacion` AS `observacion`,`bdclick5`.`bdtrasladosbodegas`.`tipo` AS `tipo`,`bdclick5`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick5`.`bdtrasladosbodegas`.`hora` AS `hora`,`bdclick5`.`bdtrasladosbodegas`.`usuario` AS `usuario`,`bdclick5`.`bdtrasladosbodegasprod`.`Id` AS `Id`,`bdclick5`.`bdtrasladosbodegasprod`.`iva` AS `iva` from ((((`bdclick5`.`bdtrasladosbodegasprod` left join `bdclick5`.`bdtrasladosbodegas` on((`bdclick5`.`bdtrasladosbodegas`.`Id` = `bdclick5`.`bdtrasladosbodegasprod`.`traslado`))) left join `bdclick5`.`bdbodegas` on((`bdclick5`.`bdtrasladosbodegas`.`origen` = `bdclick5`.`bdbodegas`.`codigo`))) left join `bdclick5`.`bdbodegas` `bdbodegas_1` on((`bdclick5`.`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`))) left join `bdclick5`.`bdproductos` on((`bdclick5`.`bdtrasladosbodegasprod`.`producto` = `bdclick5`.`bdproductos`.`idSistema`))) where (not((`bdclick5`.`bdtrasladosbodegasprod`.`traslado` like \'TRASINI-*\')))
md5=eb2fca1be7934f950fa3c251eaa08923
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:50
create-version=2
source=select `bdbodegas`.`nombre` AS `nomO`,`bdbodegas_1`.`nombre` AS `nomD`,cast(substr(`bdtrasladosbodegasprod`.`traslado`,7,100) as signed) AS `conse`,`bdproductos`.`Descripcion` AS `Descripcion`,`bdtrasladosbodegasprod`.`traslado` AS `traslado`,`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdtrasladosbodegas`.`origen` AS `origen`,`bdtrasladosbodegas`.`destino` AS `destino`,`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdtrasladosbodegasprod`.`lista` AS `lista`,`bdtrasladosbodegasprod`.`total` AS `total`,`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdtrasladosbodegas`.`valor` AS `valor`,`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdtrasladosbodegas`.`terminal` AS `terminal`,`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdtrasladosbodegasprod`.`imeil` AS `imeil`,`bdtrasladosbodegasprod`.`observacion` AS `observacion`,`bdtrasladosbodegas`.`tipo` AS `tipo`,`bdproductos`.`Codigo` AS `Codigo`,`bdtrasladosbodegas`.`hora` AS `hora`,`bdtrasladosbodegas`.`usuario` AS `usuario`,`bdtrasladosbodegasprod`.`Id` AS `Id`,`bdtrasladosbodegasprod`.`iva` AS `iva` from ((((`bdtrasladosbodegasprod` left join `bdtrasladosbodegas` on((`bdtrasladosbodegas`.`Id` = `bdtrasladosbodegasprod`.`traslado`))) left join `bdbodegas` on((`bdtrasladosbodegas`.`origen` = `bdbodegas`.`codigo`))) left join `bdbodegas` `bdbodegas_1` on((`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`))) left join `bdproductos` on((`bdtrasladosbodegasprod`.`producto` = `bdproductos`.`idSistema`))) where (not((`bdtrasladosbodegasprod`.`traslado` like \'TRASINI-*\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdbodegas`.`nombre` AS `nomO`,`bdbodegas_1`.`nombre` AS `nomD`,cast(substr(`bdclick5`.`bdtrasladosbodegasprod`.`traslado`,7,100) as signed) AS `conse`,`bdclick5`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick5`.`bdtrasladosbodegasprod`.`traslado` AS `traslado`,`bdclick5`.`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdclick5`.`bdtrasladosbodegas`.`origen` AS `origen`,`bdclick5`.`bdtrasladosbodegas`.`destino` AS `destino`,`bdclick5`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick5`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick5`.`bdtrasladosbodegasprod`.`lista` AS `lista`,`bdclick5`.`bdtrasladosbodegasprod`.`total` AS `total`,`bdclick5`.`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdclick5`.`bdtrasladosbodegas`.`valor` AS `valor`,`bdclick5`.`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdclick5`.`bdtrasladosbodegas`.`terminal` AS `terminal`,`bdclick5`.`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdclick5`.`bdtrasladosbodegasprod`.`imeil` AS `imeil`,`bdclick5`.`bdtrasladosbodegasprod`.`observacion` AS `observacion`,`bdclick5`.`bdtrasladosbodegas`.`tipo` AS `tipo`,`bdclick5`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick5`.`bdtrasladosbodegas`.`hora` AS `hora`,`bdclick5`.`bdtrasladosbodegas`.`usuario` AS `usuario`,`bdclick5`.`bdtrasladosbodegasprod`.`Id` AS `Id`,`bdclick5`.`bdtrasladosbodegasprod`.`iva` AS `iva` from ((((`bdclick5`.`bdtrasladosbodegasprod` left join `bdclick5`.`bdtrasladosbodegas` on((`bdclick5`.`bdtrasladosbodegas`.`Id` = `bdclick5`.`bdtrasladosbodegasprod`.`traslado`))) left join `bdclick5`.`bdbodegas` on((`bdclick5`.`bdtrasladosbodegas`.`origen` = `bdclick5`.`bdbodegas`.`codigo`))) left join `bdclick5`.`bdbodegas` `bdbodegas_1` on((`bdclick5`.`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`))) left join `bdclick5`.`bdproductos` on((`bdclick5`.`bdtrasladosbodegasprod`.`producto` = `bdclick5`.`bdproductos`.`idSistema`))) where (not((`bdclick5`.`bdtrasladosbodegasprod`.`traslado` like \'TRASINI-*\')))
mariadb-version=100135
