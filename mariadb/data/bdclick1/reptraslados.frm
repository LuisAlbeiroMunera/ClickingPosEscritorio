TYPE=VIEW
query=select `bdclick1`.`bdtrasladosprod`.`traslado` AS `traslado`,`bdclick1`.`bdtraslados`.`fecha` AS `fecha`,`bdclick1`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick1`.`bdtrasladosprod`.`descripcion` AS `descripcion`,`bdclick1`.`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdclick1`.`bdtrasladosprod`.`lista` AS `lista`,`bdclick1`.`bdtrasladosprod`.`total` AS `total`,`bdclick1`.`bdtrasladosprod`.`imei` AS `detalle`,`bdclick1`.`bdtraslados`.`unidades` AS `unidades`,`bdclick1`.`bdtraslados`.`valor` AS `valor`,`bdclick1`.`bdtraslados`.`anulada` AS `anulada`,`bdclick1`.`bdtrasladosprod`.`observacion` AS `observacion`,`bdclick1`.`bdtraslados`.`tipo` AS `tipo`,`bdclick1`.`bdtraslados`.`terminal` AS `terminal`,`bdclick1`.`bdtraslados`.`bodega` AS `bodega`,`bdclick1`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick1`.`bdtraslados`.`hora` AS `hora`,`bdclick1`.`bdtraslados`.`usuario` AS `usuario` from ((`bdclick1`.`bdproductos` join `bdclick1`.`bdtrasladosprod` on((`bdclick1`.`bdproductos`.`idSistema` = `bdclick1`.`bdtrasladosprod`.`producto`))) left join `bdclick1`.`bdtraslados` on((`bdclick1`.`bdtraslados`.`Id` = `bdclick1`.`bdtrasladosprod`.`traslado`))) where (not((`bdclick1`.`bdtrasladosprod`.`traslado` like \'TRASINI-*\')))
md5=ddf5e501669d8b19a7d5941cd440fc1b
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:37
create-version=2
source=select `bdtrasladosprod`.`traslado` AS `traslado`,`bdtraslados`.`fecha` AS `fecha`,`bdtrasladosprod`.`producto` AS `producto`,`bdtrasladosprod`.`descripcion` AS `descripcion`,`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdtrasladosprod`.`lista` AS `lista`,`bdtrasladosprod`.`total` AS `total`,`bdtrasladosprod`.`imei` AS `detalle`,`bdtraslados`.`unidades` AS `unidades`,`bdtraslados`.`valor` AS `valor`,`bdtraslados`.`anulada` AS `anulada`,`bdtrasladosprod`.`observacion` AS `observacion`,`bdtraslados`.`tipo` AS `tipo`,`bdtraslados`.`terminal` AS `terminal`,`bdtraslados`.`bodega` AS `bodega`,`bdproductos`.`Codigo` AS `Codigo`,`bdtraslados`.`hora` AS `hora`,`bdtraslados`.`usuario` AS `usuario` from ((`bdproductos` join `bdtrasladosprod` on((`bdproductos`.`idSistema` = `bdtrasladosprod`.`producto`))) left join `bdtraslados` on((`bdtraslados`.`Id` = `bdtrasladosprod`.`traslado`))) where (not((`bdtrasladosprod`.`traslado` like \'TRASINI-*\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdtrasladosprod`.`traslado` AS `traslado`,`bdclick1`.`bdtraslados`.`fecha` AS `fecha`,`bdclick1`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick1`.`bdtrasladosprod`.`descripcion` AS `descripcion`,`bdclick1`.`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdclick1`.`bdtrasladosprod`.`lista` AS `lista`,`bdclick1`.`bdtrasladosprod`.`total` AS `total`,`bdclick1`.`bdtrasladosprod`.`imei` AS `detalle`,`bdclick1`.`bdtraslados`.`unidades` AS `unidades`,`bdclick1`.`bdtraslados`.`valor` AS `valor`,`bdclick1`.`bdtraslados`.`anulada` AS `anulada`,`bdclick1`.`bdtrasladosprod`.`observacion` AS `observacion`,`bdclick1`.`bdtraslados`.`tipo` AS `tipo`,`bdclick1`.`bdtraslados`.`terminal` AS `terminal`,`bdclick1`.`bdtraslados`.`bodega` AS `bodega`,`bdclick1`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick1`.`bdtraslados`.`hora` AS `hora`,`bdclick1`.`bdtraslados`.`usuario` AS `usuario` from ((`bdclick1`.`bdproductos` join `bdclick1`.`bdtrasladosprod` on((`bdclick1`.`bdproductos`.`idSistema` = `bdclick1`.`bdtrasladosprod`.`producto`))) left join `bdclick1`.`bdtraslados` on((`bdclick1`.`bdtraslados`.`Id` = `bdclick1`.`bdtrasladosprod`.`traslado`))) where (not((`bdclick1`.`bdtrasladosprod`.`traslado` like \'TRASINI-*\')))
mariadb-version=100135
