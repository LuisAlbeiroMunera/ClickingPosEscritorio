TYPE=VIEW
query=select `bdclick3`.`bddiscosteo`.`producto` AS `producto`,`bdclick3`.`bddiscosteo`.`cantidad` AS `cantidad`,`bdclick3`.`bddiscosteo`.`codigo` AS `codigo`,`bdclick3`.`bddiscosteo`.`descripcion` AS `descripcion`,`bdclick3`.`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdclick3`.`bdproductos`.`grupo` AS `Grupo` from (`bdclick3`.`bddiscosteo` join `bdclick3`.`bdproductos` on((`bdclick3`.`bddiscosteo`.`producto` = `bdclick3`.`bdproductos`.`idSistema`))) where (`bdclick3`.`bddiscosteo`.`opcionCambio` = 0)
md5=e3054454e2726d66c631bfa8b1392dbb
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:52
create-version=2
source=select `bddiscosteo`.`producto` AS `producto`,`bddiscosteo`.`cantidad` AS `cantidad`,`bddiscosteo`.`codigo` AS `codigo`,`bddiscosteo`.`descripcion` AS `descripcion`,`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdproductos`.`grupo` AS `Grupo` from (`bddiscosteo` join `bdproductos` on((`bddiscosteo`.`producto` = `bdproductos`.`idSistema`))) where (`bddiscosteo`.`opcionCambio` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bddiscosteo`.`producto` AS `producto`,`bdclick3`.`bddiscosteo`.`cantidad` AS `cantidad`,`bdclick3`.`bddiscosteo`.`codigo` AS `codigo`,`bdclick3`.`bddiscosteo`.`descripcion` AS `descripcion`,`bdclick3`.`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdclick3`.`bdproductos`.`grupo` AS `Grupo` from (`bdclick3`.`bddiscosteo` join `bdclick3`.`bdproductos` on((`bdclick3`.`bddiscosteo`.`producto` = `bdclick3`.`bdproductos`.`idSistema`))) where (`bdclick3`.`bddiscosteo`.`opcionCambio` = 0)
mariadb-version=100135
