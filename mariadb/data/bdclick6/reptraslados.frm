TYPE=VIEW
query=select `bdclick6`.`bdtrasladosprod`.`traslado` AS `traslado`,`bdclick6`.`bdtraslados`.`fecha` AS `fecha`,`bdclick6`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick6`.`bdtrasladosprod`.`descripcion` AS `descripcion`,`bdclick6`.`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdclick6`.`bdtrasladosprod`.`lista` AS `lista`,`bdclick6`.`bdtrasladosprod`.`total` AS `total`,`bdclick6`.`bdtrasladosprod`.`imei` AS `detalle`,`bdclick6`.`bdtraslados`.`unidades` AS `unidades`,`bdclick6`.`bdtraslados`.`valor` AS `valor`,`bdclick6`.`bdtraslados`.`anulada` AS `anulada`,`bdclick6`.`bdtrasladosprod`.`observacion` AS `observacion`,`bdclick6`.`bdtraslados`.`tipo` AS `tipo`,`bdclick6`.`bdtraslados`.`terminal` AS `terminal`,`bdclick6`.`bdtraslados`.`bodega` AS `bodega`,`bdclick6`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick6`.`bdtraslados`.`hora` AS `hora`,`bdclick6`.`bdtraslados`.`usuario` AS `usuario` from ((`bdclick6`.`bdproductos` join `bdclick6`.`bdtrasladosprod` on((`bdclick6`.`bdproductos`.`idSistema` = `bdclick6`.`bdtrasladosprod`.`producto`))) left join `bdclick6`.`bdtraslados` on((`bdclick6`.`bdtraslados`.`Id` = `bdclick6`.`bdtrasladosprod`.`traslado`))) where (not((`bdclick6`.`bdtrasladosprod`.`traslado` like \'TRASINI-*\')))
md5=8a25e2f4855b8e7d4194ba98061b9c07
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:39
create-version=2
source=select `bdtrasladosprod`.`traslado` AS `traslado`,`bdtraslados`.`fecha` AS `fecha`,`bdtrasladosprod`.`producto` AS `producto`,`bdtrasladosprod`.`descripcion` AS `descripcion`,`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdtrasladosprod`.`lista` AS `lista`,`bdtrasladosprod`.`total` AS `total`,`bdtrasladosprod`.`imei` AS `detalle`,`bdtraslados`.`unidades` AS `unidades`,`bdtraslados`.`valor` AS `valor`,`bdtraslados`.`anulada` AS `anulada`,`bdtrasladosprod`.`observacion` AS `observacion`,`bdtraslados`.`tipo` AS `tipo`,`bdtraslados`.`terminal` AS `terminal`,`bdtraslados`.`bodega` AS `bodega`,`bdproductos`.`Codigo` AS `Codigo`,`bdtraslados`.`hora` AS `hora`,`bdtraslados`.`usuario` AS `usuario` from ((`bdproductos` join `bdtrasladosprod` on((`bdproductos`.`idSistema` = `bdtrasladosprod`.`producto`))) left join `bdtraslados` on((`bdtraslados`.`Id` = `bdtrasladosprod`.`traslado`))) where (not((`bdtrasladosprod`.`traslado` like \'TRASINI-*\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdtrasladosprod`.`traslado` AS `traslado`,`bdclick6`.`bdtraslados`.`fecha` AS `fecha`,`bdclick6`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick6`.`bdtrasladosprod`.`descripcion` AS `descripcion`,`bdclick6`.`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdclick6`.`bdtrasladosprod`.`lista` AS `lista`,`bdclick6`.`bdtrasladosprod`.`total` AS `total`,`bdclick6`.`bdtrasladosprod`.`imei` AS `detalle`,`bdclick6`.`bdtraslados`.`unidades` AS `unidades`,`bdclick6`.`bdtraslados`.`valor` AS `valor`,`bdclick6`.`bdtraslados`.`anulada` AS `anulada`,`bdclick6`.`bdtrasladosprod`.`observacion` AS `observacion`,`bdclick6`.`bdtraslados`.`tipo` AS `tipo`,`bdclick6`.`bdtraslados`.`terminal` AS `terminal`,`bdclick6`.`bdtraslados`.`bodega` AS `bodega`,`bdclick6`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick6`.`bdtraslados`.`hora` AS `hora`,`bdclick6`.`bdtraslados`.`usuario` AS `usuario` from ((`bdclick6`.`bdproductos` join `bdclick6`.`bdtrasladosprod` on((`bdclick6`.`bdproductos`.`idSistema` = `bdclick6`.`bdtrasladosprod`.`producto`))) left join `bdclick6`.`bdtraslados` on((`bdclick6`.`bdtraslados`.`Id` = `bdclick6`.`bdtrasladosprod`.`traslado`))) where (not((`bdclick6`.`bdtrasladosprod`.`traslado` like \'TRASINI-*\')))
mariadb-version=100135