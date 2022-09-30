TYPE=VIEW
query=(select `bdclick6`.`bddiscosteo`.`Id` AS `Id`,`bdclick6`.`bddiscosteo`.`producto` AS `producto`,`bdclick6`.`bddiscosteo`.`cantidad` AS `cantidad`,`bdclick6`.`bddiscosteo`.`codigo` AS `codigo`,`bdclick6`.`bddiscosteo`.`usuario` AS `usuario`,`bdclick6`.`bddiscosteo`.`plu` AS `plu`,`bdclick6`.`bddiscosteo`.`cantidad2` AS `cantidad2`,`bdclick6`.`bddiscosteo`.`descripcion` AS `descripcion`,`bdclick6`.`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdclick6`.`ultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdclick6`.`ultimoponderado`.`ultimoCosto` AS `ultimoCosto` from ((`bdclick6`.`bddiscosteo` left join `bdclick6`.`bdproductos` on((`bdclick6`.`bdproductos`.`Codigo` = `bdclick6`.`bddiscosteo`.`codigo`))) left join `bdclick6`.`ultimoponderado` on((`bdclick6`.`ultimoponderado`.`producto` = `bdclick6`.`bddiscosteo`.`producto`))))
md5=c8534d3e9ffd71ee8e6bc06a3744a829
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:33
create-version=2
source=(select `bddiscosteo`.`Id` AS `Id`,`bddiscosteo`.`producto` AS `producto`,`bddiscosteo`.`cantidad` AS `cantidad`,`bddiscosteo`.`codigo` AS `codigo`,`bddiscosteo`.`usuario` AS `usuario`,`bddiscosteo`.`plu` AS `plu`,`bddiscosteo`.`cantidad2` AS `cantidad2`,`bddiscosteo`.`descripcion` AS `descripcion`,`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`ultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`ultimoponderado`.`ultimoCosto` AS `ultimoCosto` from ((`bddiscosteo` left join `bdproductos` on((`bdproductos`.`Codigo` = `bddiscosteo`.`codigo`))) left join `ultimoponderado` on((`ultimoponderado`.`producto` = `bddiscosteo`.`producto`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bddiscosteo`.`Id` AS `Id`,`bdclick6`.`bddiscosteo`.`producto` AS `producto`,`bdclick6`.`bddiscosteo`.`cantidad` AS `cantidad`,`bdclick6`.`bddiscosteo`.`codigo` AS `codigo`,`bdclick6`.`bddiscosteo`.`usuario` AS `usuario`,`bdclick6`.`bddiscosteo`.`plu` AS `plu`,`bdclick6`.`bddiscosteo`.`cantidad2` AS `cantidad2`,`bdclick6`.`bddiscosteo`.`descripcion` AS `descripcion`,`bdclick6`.`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdclick6`.`ultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdclick6`.`ultimoponderado`.`ultimoCosto` AS `ultimoCosto` from ((`bdclick6`.`bddiscosteo` left join `bdclick6`.`bdproductos` on((`bdclick6`.`bdproductos`.`Codigo` = `bdclick6`.`bddiscosteo`.`codigo`))) left join `bdclick6`.`ultimoponderado` on((`bdclick6`.`ultimoponderado`.`producto` = `bdclick6`.`bddiscosteo`.`producto`))))
mariadb-version=100135
