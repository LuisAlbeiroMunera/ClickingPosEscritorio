TYPE=VIEW
query=select `bdclick6`.`bdcosteo`.`Id` AS `Id`,`bdclick6`.`bdcosteo`.`fecha` AS `fecha`,`bdclick6`.`bdcosteo`.`usuario` AS `usuario`,`bdclick6`.`bdcosteo`.`unidades` AS `unidades`,`bdclick6`.`bdcosteo`.`total` AS `totalCosteo`,`pp`.`Descripcion` AS `descripcionProducto`,`bdclick6`.`bdcosteoprod`.`producto` AS `producto`,`bdclick6`.`bdcosteoprod`.`cantidad` AS `cantidad`,`bdclick6`.`bdcosteoprod`.`total` AS `total`,`ps`.`Codigo` AS `codigo`,`ps`.`Descripcion` AS `descripcion` from (((`bdclick6`.`bdcosteo` join `bdclick6`.`bdproductos` `pp` on((`bdclick6`.`bdcosteo`.`producto` = `pp`.`idSistema`))) join `bdclick6`.`bdcosteoprod` on((`bdclick6`.`bdcosteo`.`Id` = `bdclick6`.`bdcosteoprod`.`documento`))) join `bdclick6`.`bdproductos` `ps` on((`bdclick6`.`bdcosteoprod`.`producto` = `ps`.`idSistema`)))
md5=bcc7eec30575e9da03203de90da825fd
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:38
create-version=2
source=select `bdcosteo`.`Id` AS `Id`,`bdcosteo`.`fecha` AS `fecha`,`bdcosteo`.`usuario` AS `usuario`,`bdcosteo`.`unidades` AS `unidades`,`bdcosteo`.`total` AS `totalCosteo`,`pp`.`Descripcion` AS `descripcionProducto`,`bdcosteoprod`.`producto` AS `producto`,`bdcosteoprod`.`cantidad` AS `cantidad`,`bdcosteoprod`.`total` AS `total`,`ps`.`Codigo` AS `codigo`,`ps`.`Descripcion` AS `descripcion` from (((`bdcosteo` join `bdproductos` `pp` on((`bdcosteo`.`producto` = `pp`.`idSistema`))) join `bdcosteoprod` on((`bdcosteo`.`Id` = `bdcosteoprod`.`documento`))) join `bdproductos` `ps` on((`bdcosteoprod`.`producto` = `ps`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdcosteo`.`Id` AS `Id`,`bdclick6`.`bdcosteo`.`fecha` AS `fecha`,`bdclick6`.`bdcosteo`.`usuario` AS `usuario`,`bdclick6`.`bdcosteo`.`unidades` AS `unidades`,`bdclick6`.`bdcosteo`.`total` AS `totalCosteo`,`pp`.`Descripcion` AS `descripcionProducto`,`bdclick6`.`bdcosteoprod`.`producto` AS `producto`,`bdclick6`.`bdcosteoprod`.`cantidad` AS `cantidad`,`bdclick6`.`bdcosteoprod`.`total` AS `total`,`ps`.`Codigo` AS `codigo`,`ps`.`Descripcion` AS `descripcion` from (((`bdclick6`.`bdcosteo` join `bdclick6`.`bdproductos` `pp` on((`bdclick6`.`bdcosteo`.`producto` = `pp`.`idSistema`))) join `bdclick6`.`bdcosteoprod` on((`bdclick6`.`bdcosteo`.`Id` = `bdclick6`.`bdcosteoprod`.`documento`))) join `bdclick6`.`bdproductos` `ps` on((`bdclick6`.`bdcosteoprod`.`producto` = `ps`.`idSistema`)))
mariadb-version=100135
