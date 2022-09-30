TYPE=VIEW
query=select `bdclick2`.`bdcosteo`.`Id` AS `Id`,`bdclick2`.`bdcosteo`.`fecha` AS `fecha`,`bdclick2`.`bdcosteo`.`usuario` AS `usuario`,`bdclick2`.`bdcosteo`.`unidades` AS `unidades`,`bdclick2`.`bdcosteo`.`total` AS `totalCosteo`,`pp`.`Descripcion` AS `descripcionProducto`,`bdclick2`.`bdcosteoprod`.`producto` AS `producto`,`bdclick2`.`bdcosteoprod`.`cantidad` AS `cantidad`,`bdclick2`.`bdcosteoprod`.`total` AS `total`,`ps`.`Codigo` AS `codigo`,`ps`.`Descripcion` AS `descripcion` from (((`bdclick2`.`bdcosteo` join `bdclick2`.`bdproductos` `pp` on((`bdclick2`.`bdcosteo`.`producto` = `pp`.`idSistema`))) join `bdclick2`.`bdcosteoprod` on((`bdclick2`.`bdcosteo`.`Id` = `bdclick2`.`bdcosteoprod`.`documento`))) join `bdclick2`.`bdproductos` `ps` on((`bdclick2`.`bdcosteoprod`.`producto` = `ps`.`idSistema`)))
md5=27f1d5f6657eba2c0eaa38c12a85aa8e
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:47
create-version=2
source=select `bdcosteo`.`Id` AS `Id`,`bdcosteo`.`fecha` AS `fecha`,`bdcosteo`.`usuario` AS `usuario`,`bdcosteo`.`unidades` AS `unidades`,`bdcosteo`.`total` AS `totalCosteo`,`pp`.`Descripcion` AS `descripcionProducto`,`bdcosteoprod`.`producto` AS `producto`,`bdcosteoprod`.`cantidad` AS `cantidad`,`bdcosteoprod`.`total` AS `total`,`ps`.`Codigo` AS `codigo`,`ps`.`Descripcion` AS `descripcion` from (((`bdcosteo` join `bdproductos` `pp` on((`bdcosteo`.`producto` = `pp`.`idSistema`))) join `bdcosteoprod` on((`bdcosteo`.`Id` = `bdcosteoprod`.`documento`))) join `bdproductos` `ps` on((`bdcosteoprod`.`producto` = `ps`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdcosteo`.`Id` AS `Id`,`bdclick2`.`bdcosteo`.`fecha` AS `fecha`,`bdclick2`.`bdcosteo`.`usuario` AS `usuario`,`bdclick2`.`bdcosteo`.`unidades` AS `unidades`,`bdclick2`.`bdcosteo`.`total` AS `totalCosteo`,`pp`.`Descripcion` AS `descripcionProducto`,`bdclick2`.`bdcosteoprod`.`producto` AS `producto`,`bdclick2`.`bdcosteoprod`.`cantidad` AS `cantidad`,`bdclick2`.`bdcosteoprod`.`total` AS `total`,`ps`.`Codigo` AS `codigo`,`ps`.`Descripcion` AS `descripcion` from (((`bdclick2`.`bdcosteo` join `bdclick2`.`bdproductos` `pp` on((`bdclick2`.`bdcosteo`.`producto` = `pp`.`idSistema`))) join `bdclick2`.`bdcosteoprod` on((`bdclick2`.`bdcosteo`.`Id` = `bdclick2`.`bdcosteoprod`.`documento`))) join `bdclick2`.`bdproductos` `ps` on((`bdclick2`.`bdcosteoprod`.`producto` = `ps`.`idSistema`)))
mariadb-version=100135
