TYPE=VIEW
query=(select `bdclick3`.`bddiscosteo`.`Id` AS `Id`,`bdclick3`.`bddiscosteo`.`producto` AS `producto`,`bdclick3`.`bddiscosteo`.`cantidad` AS `cantidad`,`bdclick3`.`bddiscosteo`.`codigo` AS `codigo`,`bdclick3`.`bddiscosteo`.`usuario` AS `usuario`,`bdclick3`.`bddiscosteo`.`plu` AS `plu`,`bdclick3`.`bddiscosteo`.`cantidad2` AS `cantidad2`,`bdclick3`.`bddiscosteo`.`descripcion` AS `descripcion`,`bdclick3`.`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdclick3`.`ultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdclick3`.`ultimoponderado`.`ultimoCosto` AS `ultimoCosto` from ((`bdclick3`.`bddiscosteo` left join `bdclick3`.`bdproductos` on((`bdclick3`.`bdproductos`.`Codigo` = `bdclick3`.`bddiscosteo`.`codigo`))) left join `bdclick3`.`ultimoponderado` on((`bdclick3`.`ultimoponderado`.`producto` = `bdclick3`.`bddiscosteo`.`producto`))))
md5=94afbde3c732060318e43a44780bec49
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:49
create-version=2
source=(select `bddiscosteo`.`Id` AS `Id`,`bddiscosteo`.`producto` AS `producto`,`bddiscosteo`.`cantidad` AS `cantidad`,`bddiscosteo`.`codigo` AS `codigo`,`bddiscosteo`.`usuario` AS `usuario`,`bddiscosteo`.`plu` AS `plu`,`bddiscosteo`.`cantidad2` AS `cantidad2`,`bddiscosteo`.`descripcion` AS `descripcion`,`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`ultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`ultimoponderado`.`ultimoCosto` AS `ultimoCosto` from ((`bddiscosteo` left join `bdproductos` on((`bdproductos`.`Codigo` = `bddiscosteo`.`codigo`))) left join `ultimoponderado` on((`ultimoponderado`.`producto` = `bddiscosteo`.`producto`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bddiscosteo`.`Id` AS `Id`,`bdclick3`.`bddiscosteo`.`producto` AS `producto`,`bdclick3`.`bddiscosteo`.`cantidad` AS `cantidad`,`bdclick3`.`bddiscosteo`.`codigo` AS `codigo`,`bdclick3`.`bddiscosteo`.`usuario` AS `usuario`,`bdclick3`.`bddiscosteo`.`plu` AS `plu`,`bdclick3`.`bddiscosteo`.`cantidad2` AS `cantidad2`,`bdclick3`.`bddiscosteo`.`descripcion` AS `descripcion`,`bdclick3`.`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdclick3`.`ultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdclick3`.`ultimoponderado`.`ultimoCosto` AS `ultimoCosto` from ((`bdclick3`.`bddiscosteo` left join `bdclick3`.`bdproductos` on((`bdclick3`.`bdproductos`.`Codigo` = `bdclick3`.`bddiscosteo`.`codigo`))) left join `bdclick3`.`ultimoponderado` on((`bdclick3`.`ultimoponderado`.`producto` = `bdclick3`.`bddiscosteo`.`producto`))))
mariadb-version=100135
