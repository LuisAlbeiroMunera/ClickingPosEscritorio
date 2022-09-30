TYPE=VIEW
query=(select `bdclick4`.`bddiscosteo`.`Id` AS `Id`,`bdclick4`.`bddiscosteo`.`producto` AS `producto`,`bdclick4`.`bddiscosteo`.`cantidad` AS `cantidad`,`bdclick4`.`bddiscosteo`.`codigo` AS `codigo`,`bdclick4`.`bddiscosteo`.`usuario` AS `usuario`,`bdclick4`.`bddiscosteo`.`plu` AS `plu`,`bdclick4`.`bddiscosteo`.`cantidad2` AS `cantidad2`,`bdclick4`.`bddiscosteo`.`descripcion` AS `descripcion`,`bdclick4`.`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdclick4`.`ultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdclick4`.`ultimoponderado`.`ultimoCosto` AS `ultimoCosto` from ((`bdclick4`.`bddiscosteo` left join `bdclick4`.`bdproductos` on((`bdclick4`.`bdproductos`.`Codigo` = `bdclick4`.`bddiscosteo`.`codigo`))) left join `bdclick4`.`ultimoponderado` on((`bdclick4`.`ultimoponderado`.`producto` = `bdclick4`.`bddiscosteo`.`producto`))))
md5=f7605004baa5dc68d5ee90be40d14414
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:26
create-version=2
source=(select `bddiscosteo`.`Id` AS `Id`,`bddiscosteo`.`producto` AS `producto`,`bddiscosteo`.`cantidad` AS `cantidad`,`bddiscosteo`.`codigo` AS `codigo`,`bddiscosteo`.`usuario` AS `usuario`,`bddiscosteo`.`plu` AS `plu`,`bddiscosteo`.`cantidad2` AS `cantidad2`,`bddiscosteo`.`descripcion` AS `descripcion`,`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`ultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`ultimoponderado`.`ultimoCosto` AS `ultimoCosto` from ((`bddiscosteo` left join `bdproductos` on((`bdproductos`.`Codigo` = `bddiscosteo`.`codigo`))) left join `ultimoponderado` on((`ultimoponderado`.`producto` = `bddiscosteo`.`producto`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`bddiscosteo`.`Id` AS `Id`,`bdclick4`.`bddiscosteo`.`producto` AS `producto`,`bdclick4`.`bddiscosteo`.`cantidad` AS `cantidad`,`bdclick4`.`bddiscosteo`.`codigo` AS `codigo`,`bdclick4`.`bddiscosteo`.`usuario` AS `usuario`,`bdclick4`.`bddiscosteo`.`plu` AS `plu`,`bdclick4`.`bddiscosteo`.`cantidad2` AS `cantidad2`,`bdclick4`.`bddiscosteo`.`descripcion` AS `descripcion`,`bdclick4`.`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdclick4`.`ultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdclick4`.`ultimoponderado`.`ultimoCosto` AS `ultimoCosto` from ((`bdclick4`.`bddiscosteo` left join `bdclick4`.`bdproductos` on((`bdclick4`.`bdproductos`.`Codigo` = `bdclick4`.`bddiscosteo`.`codigo`))) left join `bdclick4`.`ultimoponderado` on((`bdclick4`.`ultimoponderado`.`producto` = `bdclick4`.`bddiscosteo`.`producto`))))
mariadb-version=100135
