TYPE=VIEW
query=(select `bdclick2`.`bdtraslados`.`Id` AS `Id`,`bdclick2`.`bdtraslados`.`tipo` AS `tipo`,`bdclick2`.`bdtraslados`.`anulada` AS `anulada`,`bdclick2`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick2`.`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdclick2`.`bdtrasladosprod`.`lista` AS `lista`,`bdclick2`.`bdtrasladosprod`.`total` AS `total`,`bdclick2`.`bdtraslados`.`usuario` AS `usuario`,`bdclick2`.`bdtraslados`.`fecha` AS `fecha`,`bdclick2`.`bdtraslados`.`bodega` AS `bodega` from (`bdclick2`.`bdtraslados` left join (`bdclick2`.`bdtrasladosprod` left join `bdclick2`.`bdproductos` on((`bdclick2`.`bdtrasladosprod`.`producto` = `bdclick2`.`bdproductos`.`idSistema`))) on((`bdclick2`.`bdtraslados`.`Id` = `bdclick2`.`bdtrasladosprod`.`traslado`))) where ((`bdclick2`.`bdtraslados`.`tipo` = \'Ajuste Salida\') and (`bdclick2`.`bdtraslados`.`anulada` = 0)))
md5=0263b11b2e2cb175e998176e0d49bfca
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:42
create-version=2
source=(select `bdtraslados`.`Id` AS `Id`,`bdtraslados`.`tipo` AS `tipo`,`bdtraslados`.`anulada` AS `anulada`,`bdtrasladosprod`.`producto` AS `producto`,`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdtrasladosprod`.`lista` AS `lista`,`bdtrasladosprod`.`total` AS `total`,`bdtraslados`.`usuario` AS `usuario`,`bdtraslados`.`fecha` AS `fecha`,`bdtraslados`.`bodega` AS `bodega` from (`bdtraslados` left join (`bdtrasladosprod` left join `bdproductos` on((`bdtrasladosprod`.`producto` = `bdproductos`.`idSistema`))) on((`bdtraslados`.`Id` = `bdtrasladosprod`.`traslado`))) where ((`bdtraslados`.`tipo` = \'Ajuste Salida\') and (`bdtraslados`.`anulada` = 0)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick2`.`bdtraslados`.`Id` AS `Id`,`bdclick2`.`bdtraslados`.`tipo` AS `tipo`,`bdclick2`.`bdtraslados`.`anulada` AS `anulada`,`bdclick2`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick2`.`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdclick2`.`bdtrasladosprod`.`lista` AS `lista`,`bdclick2`.`bdtrasladosprod`.`total` AS `total`,`bdclick2`.`bdtraslados`.`usuario` AS `usuario`,`bdclick2`.`bdtraslados`.`fecha` AS `fecha`,`bdclick2`.`bdtraslados`.`bodega` AS `bodega` from (`bdclick2`.`bdtraslados` left join (`bdclick2`.`bdtrasladosprod` left join `bdclick2`.`bdproductos` on((`bdclick2`.`bdtrasladosprod`.`producto` = `bdclick2`.`bdproductos`.`idSistema`))) on((`bdclick2`.`bdtraslados`.`Id` = `bdclick2`.`bdtrasladosprod`.`traslado`))) where ((`bdclick2`.`bdtraslados`.`tipo` = \'Ajuste Salida\') and (`bdclick2`.`bdtraslados`.`anulada` = 0)))
mariadb-version=100135
