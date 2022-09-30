TYPE=VIEW
query=select `bdclick4`.`bdcosteo`.`Id` AS `Id`,`bdclick4`.`bdcosteo`.`fecha` AS `fecha`,`bdclick4`.`bdcosteo`.`usuario` AS `usuario`,`bdclick4`.`bdcosteo`.`unidades` AS `unidades`,`bdclick4`.`bdcosteo`.`total` AS `totalCosteo`,`pp`.`Descripcion` AS `descripcionProducto`,`bdclick4`.`bdcosteoprod`.`producto` AS `producto`,`bdclick4`.`bdcosteoprod`.`cantidad` AS `cantidad`,`bdclick4`.`bdcosteoprod`.`total` AS `total`,`ps`.`Codigo` AS `codigo`,`ps`.`Descripcion` AS `descripcion` from (((`bdclick4`.`bdcosteo` join `bdclick4`.`bdproductos` `pp` on((`bdclick4`.`bdcosteo`.`producto` = `pp`.`idSistema`))) join `bdclick4`.`bdcosteoprod` on((`bdclick4`.`bdcosteo`.`Id` = `bdclick4`.`bdcosteoprod`.`documento`))) join `bdclick4`.`bdproductos` `ps` on((`bdclick4`.`bdcosteoprod`.`producto` = `ps`.`idSistema`)))
md5=64261f49dc56baa55807d0c5b277ca65
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:30
create-version=2
source=select `bdcosteo`.`Id` AS `Id`,`bdcosteo`.`fecha` AS `fecha`,`bdcosteo`.`usuario` AS `usuario`,`bdcosteo`.`unidades` AS `unidades`,`bdcosteo`.`total` AS `totalCosteo`,`pp`.`Descripcion` AS `descripcionProducto`,`bdcosteoprod`.`producto` AS `producto`,`bdcosteoprod`.`cantidad` AS `cantidad`,`bdcosteoprod`.`total` AS `total`,`ps`.`Codigo` AS `codigo`,`ps`.`Descripcion` AS `descripcion` from (((`bdcosteo` join `bdproductos` `pp` on((`bdcosteo`.`producto` = `pp`.`idSistema`))) join `bdcosteoprod` on((`bdcosteo`.`Id` = `bdcosteoprod`.`documento`))) join `bdproductos` `ps` on((`bdcosteoprod`.`producto` = `ps`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdcosteo`.`Id` AS `Id`,`bdclick4`.`bdcosteo`.`fecha` AS `fecha`,`bdclick4`.`bdcosteo`.`usuario` AS `usuario`,`bdclick4`.`bdcosteo`.`unidades` AS `unidades`,`bdclick4`.`bdcosteo`.`total` AS `totalCosteo`,`pp`.`Descripcion` AS `descripcionProducto`,`bdclick4`.`bdcosteoprod`.`producto` AS `producto`,`bdclick4`.`bdcosteoprod`.`cantidad` AS `cantidad`,`bdclick4`.`bdcosteoprod`.`total` AS `total`,`ps`.`Codigo` AS `codigo`,`ps`.`Descripcion` AS `descripcion` from (((`bdclick4`.`bdcosteo` join `bdclick4`.`bdproductos` `pp` on((`bdclick4`.`bdcosteo`.`producto` = `pp`.`idSistema`))) join `bdclick4`.`bdcosteoprod` on((`bdclick4`.`bdcosteo`.`Id` = `bdclick4`.`bdcosteoprod`.`documento`))) join `bdclick4`.`bdproductos` `ps` on((`bdclick4`.`bdcosteoprod`.`producto` = `ps`.`idSistema`)))
mariadb-version=100135
