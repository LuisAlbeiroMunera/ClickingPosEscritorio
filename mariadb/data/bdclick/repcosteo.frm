TYPE=VIEW
query=select `bdclick`.`bdcosteo`.`Id` AS `Id`,`bdclick`.`bdcosteo`.`fecha` AS `fecha`,`bdclick`.`bdcosteo`.`usuario` AS `usuario`,`bdclick`.`bdcosteo`.`unidades` AS `unidades`,`bdclick`.`bdcosteo`.`total` AS `totalCosteo`,`pp`.`Descripcion` AS `descripcionProducto`,`bdclick`.`bdcosteoprod`.`producto` AS `producto`,`bdclick`.`bdcosteoprod`.`cantidad` AS `cantidad`,`bdclick`.`bdcosteoprod`.`total` AS `total`,`ps`.`Codigo` AS `codigo`,`ps`.`Descripcion` AS `descripcion` from (((`bdclick`.`bdcosteo` join `bdclick`.`bdproductos` `pp` on((`bdclick`.`bdcosteo`.`producto` = `pp`.`idSistema`))) join `bdclick`.`bdcosteoprod` on((`bdclick`.`bdcosteo`.`Id` = `bdclick`.`bdcosteoprod`.`documento`))) join `bdclick`.`bdproductos` `ps` on((`bdclick`.`bdcosteoprod`.`producto` = `ps`.`idSistema`)))
md5=c0b764cc6405d6318fb520e26c122e35
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:26
create-version=2
source=select `bdcosteo`.`Id` AS `Id`,`bdcosteo`.`fecha` AS `fecha`,`bdcosteo`.`usuario` AS `usuario`,`bdcosteo`.`unidades` AS `unidades`,`bdcosteo`.`total` AS `totalCosteo`,`pp`.`Descripcion` AS `descripcionProducto`,`bdcosteoprod`.`producto` AS `producto`,`bdcosteoprod`.`cantidad` AS `cantidad`,`bdcosteoprod`.`total` AS `total`,`ps`.`Codigo` AS `codigo`,`ps`.`Descripcion` AS `descripcion` from (((`bdcosteo` join `bdproductos` `pp` on((`bdcosteo`.`producto` = `pp`.`idSistema`))) join `bdcosteoprod` on((`bdcosteo`.`Id` = `bdcosteoprod`.`documento`))) join `bdproductos` `ps` on((`bdcosteoprod`.`producto` = `ps`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdcosteo`.`Id` AS `Id`,`bdclick`.`bdcosteo`.`fecha` AS `fecha`,`bdclick`.`bdcosteo`.`usuario` AS `usuario`,`bdclick`.`bdcosteo`.`unidades` AS `unidades`,`bdclick`.`bdcosteo`.`total` AS `totalCosteo`,`pp`.`Descripcion` AS `descripcionProducto`,`bdclick`.`bdcosteoprod`.`producto` AS `producto`,`bdclick`.`bdcosteoprod`.`cantidad` AS `cantidad`,`bdclick`.`bdcosteoprod`.`total` AS `total`,`ps`.`Codigo` AS `codigo`,`ps`.`Descripcion` AS `descripcion` from (((`bdclick`.`bdcosteo` join `bdclick`.`bdproductos` `pp` on((`bdclick`.`bdcosteo`.`producto` = `pp`.`idSistema`))) join `bdclick`.`bdcosteoprod` on((`bdclick`.`bdcosteo`.`Id` = `bdclick`.`bdcosteoprod`.`documento`))) join `bdclick`.`bdproductos` `ps` on((`bdclick`.`bdcosteoprod`.`producto` = `ps`.`idSistema`)))
mariadb-version=100135
