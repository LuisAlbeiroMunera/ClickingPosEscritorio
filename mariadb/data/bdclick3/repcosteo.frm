TYPE=VIEW
query=select `bdclick3`.`bdcosteo`.`Id` AS `Id`,`bdclick3`.`bdcosteo`.`fecha` AS `fecha`,`bdclick3`.`bdcosteo`.`usuario` AS `usuario`,`bdclick3`.`bdcosteo`.`unidades` AS `unidades`,`bdclick3`.`bdcosteo`.`total` AS `totalCosteo`,`pp`.`Descripcion` AS `descripcionProducto`,`bdclick3`.`bdcosteoprod`.`producto` AS `producto`,`bdclick3`.`bdcosteoprod`.`cantidad` AS `cantidad`,`bdclick3`.`bdcosteoprod`.`total` AS `total`,`ps`.`Codigo` AS `codigo`,`ps`.`Descripcion` AS `descripcion` from (((`bdclick3`.`bdcosteo` join `bdclick3`.`bdproductos` `pp` on((`bdclick3`.`bdcosteo`.`producto` = `pp`.`idSistema`))) join `bdclick3`.`bdcosteoprod` on((`bdclick3`.`bdcosteo`.`Id` = `bdclick3`.`bdcosteoprod`.`documento`))) join `bdclick3`.`bdproductos` `ps` on((`bdclick3`.`bdcosteoprod`.`producto` = `ps`.`idSistema`)))
md5=f0f61b27c708d05ca9f60576bff80be6
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:53
create-version=2
source=select `bdcosteo`.`Id` AS `Id`,`bdcosteo`.`fecha` AS `fecha`,`bdcosteo`.`usuario` AS `usuario`,`bdcosteo`.`unidades` AS `unidades`,`bdcosteo`.`total` AS `totalCosteo`,`pp`.`Descripcion` AS `descripcionProducto`,`bdcosteoprod`.`producto` AS `producto`,`bdcosteoprod`.`cantidad` AS `cantidad`,`bdcosteoprod`.`total` AS `total`,`ps`.`Codigo` AS `codigo`,`ps`.`Descripcion` AS `descripcion` from (((`bdcosteo` join `bdproductos` `pp` on((`bdcosteo`.`producto` = `pp`.`idSistema`))) join `bdcosteoprod` on((`bdcosteo`.`Id` = `bdcosteoprod`.`documento`))) join `bdproductos` `ps` on((`bdcosteoprod`.`producto` = `ps`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdcosteo`.`Id` AS `Id`,`bdclick3`.`bdcosteo`.`fecha` AS `fecha`,`bdclick3`.`bdcosteo`.`usuario` AS `usuario`,`bdclick3`.`bdcosteo`.`unidades` AS `unidades`,`bdclick3`.`bdcosteo`.`total` AS `totalCosteo`,`pp`.`Descripcion` AS `descripcionProducto`,`bdclick3`.`bdcosteoprod`.`producto` AS `producto`,`bdclick3`.`bdcosteoprod`.`cantidad` AS `cantidad`,`bdclick3`.`bdcosteoprod`.`total` AS `total`,`ps`.`Codigo` AS `codigo`,`ps`.`Descripcion` AS `descripcion` from (((`bdclick3`.`bdcosteo` join `bdclick3`.`bdproductos` `pp` on((`bdclick3`.`bdcosteo`.`producto` = `pp`.`idSistema`))) join `bdclick3`.`bdcosteoprod` on((`bdclick3`.`bdcosteo`.`Id` = `bdclick3`.`bdcosteoprod`.`documento`))) join `bdclick3`.`bdproductos` `ps` on((`bdclick3`.`bdcosteoprod`.`producto` = `ps`.`idSistema`)))
mariadb-version=100135
