TYPE=VIEW
query=select `bdclick4`.`bddiscosteo`.`producto` AS `producto`,`bdclick4`.`bddiscosteo`.`cantidad` AS `cantidad`,`bdclick4`.`bddiscosteo`.`codigo` AS `codigo`,`bdclick4`.`bddiscosteo`.`descripcion` AS `descripcion`,`bdclick4`.`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdclick4`.`bdproductos`.`grupo` AS `Grupo` from (`bdclick4`.`bddiscosteo` join `bdclick4`.`bdproductos` on((`bdclick4`.`bddiscosteo`.`producto` = `bdclick4`.`bdproductos`.`idSistema`))) where (`bdclick4`.`bddiscosteo`.`opcionCambio` = 0)
md5=8e66cb90f1123958e8e75d6cec95e90b
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:29
create-version=2
source=select `bddiscosteo`.`producto` AS `producto`,`bddiscosteo`.`cantidad` AS `cantidad`,`bddiscosteo`.`codigo` AS `codigo`,`bddiscosteo`.`descripcion` AS `descripcion`,`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdproductos`.`grupo` AS `Grupo` from (`bddiscosteo` join `bdproductos` on((`bddiscosteo`.`producto` = `bdproductos`.`idSistema`))) where (`bddiscosteo`.`opcionCambio` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bddiscosteo`.`producto` AS `producto`,`bdclick4`.`bddiscosteo`.`cantidad` AS `cantidad`,`bdclick4`.`bddiscosteo`.`codigo` AS `codigo`,`bdclick4`.`bddiscosteo`.`descripcion` AS `descripcion`,`bdclick4`.`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdclick4`.`bdproductos`.`grupo` AS `Grupo` from (`bdclick4`.`bddiscosteo` join `bdclick4`.`bdproductos` on((`bdclick4`.`bddiscosteo`.`producto` = `bdclick4`.`bdproductos`.`idSistema`))) where (`bdclick4`.`bddiscosteo`.`opcionCambio` = 0)
mariadb-version=100135
