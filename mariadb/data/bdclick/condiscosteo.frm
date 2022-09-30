TYPE=VIEW
query=(select `bdclick`.`bddiscosteo`.`Id` AS `Id`,`bdclick`.`bddiscosteo`.`producto` AS `producto`,`bdclick`.`bddiscosteo`.`cantidad` AS `cantidad`,`bdclick`.`bddiscosteo`.`codigo` AS `codigo`,`bdclick`.`bddiscosteo`.`usuario` AS `usuario`,`bdclick`.`bddiscosteo`.`plu` AS `plu`,`bdclick`.`bddiscosteo`.`cantidad2` AS `cantidad2`,`bdclick`.`bddiscosteo`.`descripcion` AS `descripcion`,`bdclick`.`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdclick`.`ultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdclick`.`ultimoponderado`.`ultimoCosto` AS `ultimoCosto` from ((`bdclick`.`bddiscosteo` left join `bdclick`.`bdproductos` on((`bdclick`.`bdproductos`.`Codigo` = `bdclick`.`bddiscosteo`.`codigo`))) left join `bdclick`.`ultimoponderado` on((`bdclick`.`ultimoponderado`.`producto` = `bdclick`.`bddiscosteo`.`producto`))))
md5=f4d29b0a15a8d68ef49e0b4e665158dd
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:22
create-version=2
source=(select `bddiscosteo`.`Id` AS `Id`,`bddiscosteo`.`producto` AS `producto`,`bddiscosteo`.`cantidad` AS `cantidad`,`bddiscosteo`.`codigo` AS `codigo`,`bddiscosteo`.`usuario` AS `usuario`,`bddiscosteo`.`plu` AS `plu`,`bddiscosteo`.`cantidad2` AS `cantidad2`,`bddiscosteo`.`descripcion` AS `descripcion`,`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`ultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`ultimoponderado`.`ultimoCosto` AS `ultimoCosto` from ((`bddiscosteo` left join `bdproductos` on((`bdproductos`.`Codigo` = `bddiscosteo`.`codigo`))) left join `ultimoponderado` on((`ultimoponderado`.`producto` = `bddiscosteo`.`producto`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bddiscosteo`.`Id` AS `Id`,`bdclick`.`bddiscosteo`.`producto` AS `producto`,`bdclick`.`bddiscosteo`.`cantidad` AS `cantidad`,`bdclick`.`bddiscosteo`.`codigo` AS `codigo`,`bdclick`.`bddiscosteo`.`usuario` AS `usuario`,`bdclick`.`bddiscosteo`.`plu` AS `plu`,`bdclick`.`bddiscosteo`.`cantidad2` AS `cantidad2`,`bdclick`.`bddiscosteo`.`descripcion` AS `descripcion`,`bdclick`.`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdclick`.`ultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdclick`.`ultimoponderado`.`ultimoCosto` AS `ultimoCosto` from ((`bdclick`.`bddiscosteo` left join `bdclick`.`bdproductos` on((`bdclick`.`bdproductos`.`Codigo` = `bdclick`.`bddiscosteo`.`codigo`))) left join `bdclick`.`ultimoponderado` on((`bdclick`.`ultimoponderado`.`producto` = `bdclick`.`bddiscosteo`.`producto`))))
mariadb-version=100135
