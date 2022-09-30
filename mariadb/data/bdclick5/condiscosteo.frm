TYPE=VIEW
query=(select `bdclick5`.`bddiscosteo`.`Id` AS `Id`,`bdclick5`.`bddiscosteo`.`producto` AS `producto`,`bdclick5`.`bddiscosteo`.`cantidad` AS `cantidad`,`bdclick5`.`bddiscosteo`.`codigo` AS `codigo`,`bdclick5`.`bddiscosteo`.`usuario` AS `usuario`,`bdclick5`.`bddiscosteo`.`plu` AS `plu`,`bdclick5`.`bddiscosteo`.`cantidad2` AS `cantidad2`,`bdclick5`.`bddiscosteo`.`descripcion` AS `descripcion`,`bdclick5`.`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdclick5`.`ultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdclick5`.`ultimoponderado`.`ultimoCosto` AS `ultimoCosto` from ((`bdclick5`.`bddiscosteo` left join `bdclick5`.`bdproductos` on((`bdclick5`.`bdproductos`.`Codigo` = `bdclick5`.`bddiscosteo`.`codigo`))) left join `bdclick5`.`ultimoponderado` on((`bdclick5`.`ultimoponderado`.`producto` = `bdclick5`.`bddiscosteo`.`producto`))))
md5=baa217cdfaba7e2f2098766ef1b6c98f
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:45
create-version=2
source=(select `bddiscosteo`.`Id` AS `Id`,`bddiscosteo`.`producto` AS `producto`,`bddiscosteo`.`cantidad` AS `cantidad`,`bddiscosteo`.`codigo` AS `codigo`,`bddiscosteo`.`usuario` AS `usuario`,`bddiscosteo`.`plu` AS `plu`,`bddiscosteo`.`cantidad2` AS `cantidad2`,`bddiscosteo`.`descripcion` AS `descripcion`,`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`ultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`ultimoponderado`.`ultimoCosto` AS `ultimoCosto` from ((`bddiscosteo` left join `bdproductos` on((`bdproductos`.`Codigo` = `bddiscosteo`.`codigo`))) left join `ultimoponderado` on((`ultimoponderado`.`producto` = `bddiscosteo`.`producto`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`bddiscosteo`.`Id` AS `Id`,`bdclick5`.`bddiscosteo`.`producto` AS `producto`,`bdclick5`.`bddiscosteo`.`cantidad` AS `cantidad`,`bdclick5`.`bddiscosteo`.`codigo` AS `codigo`,`bdclick5`.`bddiscosteo`.`usuario` AS `usuario`,`bdclick5`.`bddiscosteo`.`plu` AS `plu`,`bdclick5`.`bddiscosteo`.`cantidad2` AS `cantidad2`,`bdclick5`.`bddiscosteo`.`descripcion` AS `descripcion`,`bdclick5`.`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdclick5`.`ultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdclick5`.`ultimoponderado`.`ultimoCosto` AS `ultimoCosto` from ((`bdclick5`.`bddiscosteo` left join `bdclick5`.`bdproductos` on((`bdclick5`.`bdproductos`.`Codigo` = `bdclick5`.`bddiscosteo`.`codigo`))) left join `bdclick5`.`ultimoponderado` on((`bdclick5`.`ultimoponderado`.`producto` = `bdclick5`.`bddiscosteo`.`producto`))))
mariadb-version=100135
