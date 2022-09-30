TYPE=VIEW
query=select `bdclick5`.`bdcosteo`.`Id` AS `Id`,`bdclick5`.`bdcosteo`.`fecha` AS `fecha`,`bdclick5`.`bdcosteo`.`usuario` AS `usuario`,`bdclick5`.`bdcosteo`.`unidades` AS `unidades`,`bdclick5`.`bdcosteo`.`total` AS `totalCosteo`,`pp`.`Descripcion` AS `descripcionProducto`,`bdclick5`.`bdcosteoprod`.`producto` AS `producto`,`bdclick5`.`bdcosteoprod`.`cantidad` AS `cantidad`,`bdclick5`.`bdcosteoprod`.`total` AS `total`,`ps`.`Codigo` AS `codigo`,`ps`.`Descripcion` AS `descripcion` from (((`bdclick5`.`bdcosteo` join `bdclick5`.`bdproductos` `pp` on((`bdclick5`.`bdcosteo`.`producto` = `pp`.`idSistema`))) join `bdclick5`.`bdcosteoprod` on((`bdclick5`.`bdcosteo`.`Id` = `bdclick5`.`bdcosteoprod`.`documento`))) join `bdclick5`.`bdproductos` `ps` on((`bdclick5`.`bdcosteoprod`.`producto` = `ps`.`idSistema`)))
md5=51658dbf3ba0bbb25737c140af2c1050
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:49
create-version=2
source=select `bdcosteo`.`Id` AS `Id`,`bdcosteo`.`fecha` AS `fecha`,`bdcosteo`.`usuario` AS `usuario`,`bdcosteo`.`unidades` AS `unidades`,`bdcosteo`.`total` AS `totalCosteo`,`pp`.`Descripcion` AS `descripcionProducto`,`bdcosteoprod`.`producto` AS `producto`,`bdcosteoprod`.`cantidad` AS `cantidad`,`bdcosteoprod`.`total` AS `total`,`ps`.`Codigo` AS `codigo`,`ps`.`Descripcion` AS `descripcion` from (((`bdcosteo` join `bdproductos` `pp` on((`bdcosteo`.`producto` = `pp`.`idSistema`))) join `bdcosteoprod` on((`bdcosteo`.`Id` = `bdcosteoprod`.`documento`))) join `bdproductos` `ps` on((`bdcosteoprod`.`producto` = `ps`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdcosteo`.`Id` AS `Id`,`bdclick5`.`bdcosteo`.`fecha` AS `fecha`,`bdclick5`.`bdcosteo`.`usuario` AS `usuario`,`bdclick5`.`bdcosteo`.`unidades` AS `unidades`,`bdclick5`.`bdcosteo`.`total` AS `totalCosteo`,`pp`.`Descripcion` AS `descripcionProducto`,`bdclick5`.`bdcosteoprod`.`producto` AS `producto`,`bdclick5`.`bdcosteoprod`.`cantidad` AS `cantidad`,`bdclick5`.`bdcosteoprod`.`total` AS `total`,`ps`.`Codigo` AS `codigo`,`ps`.`Descripcion` AS `descripcion` from (((`bdclick5`.`bdcosteo` join `bdclick5`.`bdproductos` `pp` on((`bdclick5`.`bdcosteo`.`producto` = `pp`.`idSistema`))) join `bdclick5`.`bdcosteoprod` on((`bdclick5`.`bdcosteo`.`Id` = `bdclick5`.`bdcosteoprod`.`documento`))) join `bdclick5`.`bdproductos` `ps` on((`bdclick5`.`bdcosteoprod`.`producto` = `ps`.`idSistema`)))
mariadb-version=100135
