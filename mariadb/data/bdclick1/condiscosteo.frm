TYPE=VIEW
query=(select `bdclick1`.`bddiscosteo`.`Id` AS `Id`,`bdclick1`.`bddiscosteo`.`producto` AS `producto`,`bdclick1`.`bddiscosteo`.`cantidad` AS `cantidad`,`bdclick1`.`bddiscosteo`.`codigo` AS `codigo`,`bdclick1`.`bddiscosteo`.`usuario` AS `usuario`,`bdclick1`.`bddiscosteo`.`plu` AS `plu`,`bdclick1`.`bddiscosteo`.`cantidad2` AS `cantidad2`,`bdclick1`.`bddiscosteo`.`descripcion` AS `descripcion`,`bdclick1`.`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdclick1`.`ultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdclick1`.`ultimoponderado`.`ultimoCosto` AS `ultimoCosto` from ((`bdclick1`.`bddiscosteo` left join `bdclick1`.`bdproductos` on((`bdclick1`.`bdproductos`.`Codigo` = `bdclick1`.`bddiscosteo`.`codigo`))) left join `bdclick1`.`ultimoponderado` on((`bdclick1`.`ultimoponderado`.`producto` = `bdclick1`.`bddiscosteo`.`producto`))))
md5=2282c2a61a05b98b0a1bc29ef8958989
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:33
create-version=2
source=(select `bddiscosteo`.`Id` AS `Id`,`bddiscosteo`.`producto` AS `producto`,`bddiscosteo`.`cantidad` AS `cantidad`,`bddiscosteo`.`codigo` AS `codigo`,`bddiscosteo`.`usuario` AS `usuario`,`bddiscosteo`.`plu` AS `plu`,`bddiscosteo`.`cantidad2` AS `cantidad2`,`bddiscosteo`.`descripcion` AS `descripcion`,`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`ultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`ultimoponderado`.`ultimoCosto` AS `ultimoCosto` from ((`bddiscosteo` left join `bdproductos` on((`bdproductos`.`Codigo` = `bddiscosteo`.`codigo`))) left join `ultimoponderado` on((`ultimoponderado`.`producto` = `bddiscosteo`.`producto`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick1`.`bddiscosteo`.`Id` AS `Id`,`bdclick1`.`bddiscosteo`.`producto` AS `producto`,`bdclick1`.`bddiscosteo`.`cantidad` AS `cantidad`,`bdclick1`.`bddiscosteo`.`codigo` AS `codigo`,`bdclick1`.`bddiscosteo`.`usuario` AS `usuario`,`bdclick1`.`bddiscosteo`.`plu` AS `plu`,`bdclick1`.`bddiscosteo`.`cantidad2` AS `cantidad2`,`bdclick1`.`bddiscosteo`.`descripcion` AS `descripcion`,`bdclick1`.`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdclick1`.`ultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdclick1`.`ultimoponderado`.`ultimoCosto` AS `ultimoCosto` from ((`bdclick1`.`bddiscosteo` left join `bdclick1`.`bdproductos` on((`bdclick1`.`bdproductos`.`Codigo` = `bdclick1`.`bddiscosteo`.`codigo`))) left join `bdclick1`.`ultimoponderado` on((`bdclick1`.`ultimoponderado`.`producto` = `bdclick1`.`bddiscosteo`.`producto`))))
mariadb-version=100135
