TYPE=VIEW
query=select `bdclick`.`bdtrasladosprod`.`traslado` AS `traslado`,`bdclick`.`bdtraslados`.`fecha` AS `fecha`,`bdclick`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick`.`bdtrasladosprod`.`descripcion` AS `descripcion`,`bdclick`.`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdclick`.`bdtrasladosprod`.`lista` AS `lista`,`bdclick`.`bdtrasladosprod`.`total` AS `total`,`bdclick`.`bdtrasladosprod`.`imei` AS `detalle`,`bdclick`.`bdtraslados`.`unidades` AS `unidades`,`bdclick`.`bdtraslados`.`valor` AS `valor`,`bdclick`.`bdtraslados`.`anulada` AS `anulada`,`bdclick`.`bdtrasladosprod`.`observacion` AS `observacion`,`bdclick`.`bdtraslados`.`tipo` AS `tipo`,`bdclick`.`bdtraslados`.`terminal` AS `terminal`,`bdclick`.`bdtraslados`.`bodega` AS `bodega`,`bdclick`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick`.`bdtraslados`.`hora` AS `hora`,`bdclick`.`bdtraslados`.`usuario` AS `usuario` from ((`bdclick`.`bdproductos` join `bdclick`.`bdtrasladosprod` on((`bdclick`.`bdproductos`.`idSistema` = `bdclick`.`bdtrasladosprod`.`producto`))) left join `bdclick`.`bdtraslados` on((`bdclick`.`bdtraslados`.`Id` = `bdclick`.`bdtrasladosprod`.`traslado`))) where (not((`bdclick`.`bdtrasladosprod`.`traslado` like \'TRASINI-*\')))
md5=f0c169f6d84390ec791aa5d2abbed55a
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:27
create-version=2
source=select `bdtrasladosprod`.`traslado` AS `traslado`,`bdtraslados`.`fecha` AS `fecha`,`bdtrasladosprod`.`producto` AS `producto`,`bdtrasladosprod`.`descripcion` AS `descripcion`,`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdtrasladosprod`.`lista` AS `lista`,`bdtrasladosprod`.`total` AS `total`,`bdtrasladosprod`.`imei` AS `detalle`,`bdtraslados`.`unidades` AS `unidades`,`bdtraslados`.`valor` AS `valor`,`bdtraslados`.`anulada` AS `anulada`,`bdtrasladosprod`.`observacion` AS `observacion`,`bdtraslados`.`tipo` AS `tipo`,`bdtraslados`.`terminal` AS `terminal`,`bdtraslados`.`bodega` AS `bodega`,`bdproductos`.`Codigo` AS `Codigo`,`bdtraslados`.`hora` AS `hora`,`bdtraslados`.`usuario` AS `usuario` from ((`bdproductos` join `bdtrasladosprod` on((`bdproductos`.`idSistema` = `bdtrasladosprod`.`producto`))) left join `bdtraslados` on((`bdtraslados`.`Id` = `bdtrasladosprod`.`traslado`))) where (not((`bdtrasladosprod`.`traslado` like \'TRASINI-*\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdtrasladosprod`.`traslado` AS `traslado`,`bdclick`.`bdtraslados`.`fecha` AS `fecha`,`bdclick`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick`.`bdtrasladosprod`.`descripcion` AS `descripcion`,`bdclick`.`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdclick`.`bdtrasladosprod`.`lista` AS `lista`,`bdclick`.`bdtrasladosprod`.`total` AS `total`,`bdclick`.`bdtrasladosprod`.`imei` AS `detalle`,`bdclick`.`bdtraslados`.`unidades` AS `unidades`,`bdclick`.`bdtraslados`.`valor` AS `valor`,`bdclick`.`bdtraslados`.`anulada` AS `anulada`,`bdclick`.`bdtrasladosprod`.`observacion` AS `observacion`,`bdclick`.`bdtraslados`.`tipo` AS `tipo`,`bdclick`.`bdtraslados`.`terminal` AS `terminal`,`bdclick`.`bdtraslados`.`bodega` AS `bodega`,`bdclick`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick`.`bdtraslados`.`hora` AS `hora`,`bdclick`.`bdtraslados`.`usuario` AS `usuario` from ((`bdclick`.`bdproductos` join `bdclick`.`bdtrasladosprod` on((`bdclick`.`bdproductos`.`idSistema` = `bdclick`.`bdtrasladosprod`.`producto`))) left join `bdclick`.`bdtraslados` on((`bdclick`.`bdtraslados`.`Id` = `bdclick`.`bdtrasladosprod`.`traslado`))) where (not((`bdclick`.`bdtrasladosprod`.`traslado` like \'TRASINI-*\')))
mariadb-version=100135