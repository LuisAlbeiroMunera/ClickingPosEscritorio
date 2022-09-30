TYPE=VIEW
query=select `bdclick1`.`bdcosteo`.`Id` AS `Id`,`bdclick1`.`bdcosteo`.`fecha` AS `fecha`,`bdclick1`.`bdcosteo`.`usuario` AS `usuario`,`bdclick1`.`bdcosteo`.`unidades` AS `unidades`,`bdclick1`.`bdcosteo`.`total` AS `totalCosteo`,`pp`.`Descripcion` AS `descripcionProducto`,`bdclick1`.`bdcosteoprod`.`producto` AS `producto`,`bdclick1`.`bdcosteoprod`.`cantidad` AS `cantidad`,`bdclick1`.`bdcosteoprod`.`total` AS `total`,`ps`.`Codigo` AS `codigo`,`ps`.`Descripcion` AS `descripcion` from (((`bdclick1`.`bdcosteo` join `bdclick1`.`bdproductos` `pp` on((`bdclick1`.`bdcosteo`.`producto` = `pp`.`idSistema`))) join `bdclick1`.`bdcosteoprod` on((`bdclick1`.`bdcosteo`.`Id` = `bdclick1`.`bdcosteoprod`.`documento`))) join `bdclick1`.`bdproductos` `ps` on((`bdclick1`.`bdcosteoprod`.`producto` = `ps`.`idSistema`)))
md5=0288be0e87665fd7c04c75ee16b48a90
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:37
create-version=2
source=select `bdcosteo`.`Id` AS `Id`,`bdcosteo`.`fecha` AS `fecha`,`bdcosteo`.`usuario` AS `usuario`,`bdcosteo`.`unidades` AS `unidades`,`bdcosteo`.`total` AS `totalCosteo`,`pp`.`Descripcion` AS `descripcionProducto`,`bdcosteoprod`.`producto` AS `producto`,`bdcosteoprod`.`cantidad` AS `cantidad`,`bdcosteoprod`.`total` AS `total`,`ps`.`Codigo` AS `codigo`,`ps`.`Descripcion` AS `descripcion` from (((`bdcosteo` join `bdproductos` `pp` on((`bdcosteo`.`producto` = `pp`.`idSistema`))) join `bdcosteoprod` on((`bdcosteo`.`Id` = `bdcosteoprod`.`documento`))) join `bdproductos` `ps` on((`bdcosteoprod`.`producto` = `ps`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdcosteo`.`Id` AS `Id`,`bdclick1`.`bdcosteo`.`fecha` AS `fecha`,`bdclick1`.`bdcosteo`.`usuario` AS `usuario`,`bdclick1`.`bdcosteo`.`unidades` AS `unidades`,`bdclick1`.`bdcosteo`.`total` AS `totalCosteo`,`pp`.`Descripcion` AS `descripcionProducto`,`bdclick1`.`bdcosteoprod`.`producto` AS `producto`,`bdclick1`.`bdcosteoprod`.`cantidad` AS `cantidad`,`bdclick1`.`bdcosteoprod`.`total` AS `total`,`ps`.`Codigo` AS `codigo`,`ps`.`Descripcion` AS `descripcion` from (((`bdclick1`.`bdcosteo` join `bdclick1`.`bdproductos` `pp` on((`bdclick1`.`bdcosteo`.`producto` = `pp`.`idSistema`))) join `bdclick1`.`bdcosteoprod` on((`bdclick1`.`bdcosteo`.`Id` = `bdclick1`.`bdcosteoprod`.`documento`))) join `bdclick1`.`bdproductos` `ps` on((`bdclick1`.`bdcosteoprod`.`producto` = `ps`.`idSistema`)))
mariadb-version=100135
