TYPE=VIEW
query=(select `bdclick2`.`bddiscosteo`.`Id` AS `Id`,`bdclick2`.`bddiscosteo`.`producto` AS `producto`,`bdclick2`.`bddiscosteo`.`cantidad` AS `cantidad`,`bdclick2`.`bddiscosteo`.`codigo` AS `codigo`,`bdclick2`.`bddiscosteo`.`usuario` AS `usuario`,`bdclick2`.`bddiscosteo`.`plu` AS `plu`,`bdclick2`.`bddiscosteo`.`cantidad2` AS `cantidad2`,`bdclick2`.`bddiscosteo`.`descripcion` AS `descripcion`,`bdclick2`.`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdclick2`.`ultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdclick2`.`ultimoponderado`.`ultimoCosto` AS `ultimoCosto` from ((`bdclick2`.`bddiscosteo` left join `bdclick2`.`bdproductos` on((`bdclick2`.`bdproductos`.`Codigo` = `bdclick2`.`bddiscosteo`.`codigo`))) left join `bdclick2`.`ultimoponderado` on((`bdclick2`.`ultimoponderado`.`producto` = `bdclick2`.`bddiscosteo`.`producto`))))
md5=99443191d93f4df4f52e77d2a4f61c75
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:43
create-version=2
source=(select `bddiscosteo`.`Id` AS `Id`,`bddiscosteo`.`producto` AS `producto`,`bddiscosteo`.`cantidad` AS `cantidad`,`bddiscosteo`.`codigo` AS `codigo`,`bddiscosteo`.`usuario` AS `usuario`,`bddiscosteo`.`plu` AS `plu`,`bddiscosteo`.`cantidad2` AS `cantidad2`,`bddiscosteo`.`descripcion` AS `descripcion`,`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`ultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`ultimoponderado`.`ultimoCosto` AS `ultimoCosto` from ((`bddiscosteo` left join `bdproductos` on((`bdproductos`.`Codigo` = `bddiscosteo`.`codigo`))) left join `ultimoponderado` on((`ultimoponderado`.`producto` = `bddiscosteo`.`producto`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick2`.`bddiscosteo`.`Id` AS `Id`,`bdclick2`.`bddiscosteo`.`producto` AS `producto`,`bdclick2`.`bddiscosteo`.`cantidad` AS `cantidad`,`bdclick2`.`bddiscosteo`.`codigo` AS `codigo`,`bdclick2`.`bddiscosteo`.`usuario` AS `usuario`,`bdclick2`.`bddiscosteo`.`plu` AS `plu`,`bdclick2`.`bddiscosteo`.`cantidad2` AS `cantidad2`,`bdclick2`.`bddiscosteo`.`descripcion` AS `descripcion`,`bdclick2`.`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdclick2`.`ultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdclick2`.`ultimoponderado`.`ultimoCosto` AS `ultimoCosto` from ((`bdclick2`.`bddiscosteo` left join `bdclick2`.`bdproductos` on((`bdclick2`.`bdproductos`.`Codigo` = `bdclick2`.`bddiscosteo`.`codigo`))) left join `bdclick2`.`ultimoponderado` on((`bdclick2`.`ultimoponderado`.`producto` = `bdclick2`.`bddiscosteo`.`producto`))))
mariadb-version=100135
