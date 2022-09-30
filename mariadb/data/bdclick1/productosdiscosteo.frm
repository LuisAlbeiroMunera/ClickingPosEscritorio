TYPE=VIEW
query=select `bdclick1`.`bddiscosteo`.`codigo` AS `productoPrincipal`,`bdclick1`.`bddiscosteo`.`producto` AS `producto`,`bdclick1`.`bddiscosteo`.`cantidad` AS `cantidad`,`bdclick1`.`bddiscosteo`.`codigo` AS `codigo`,`bdclick1`.`bddiscosteo`.`descripcion` AS `descripcion`,`bdclick1`.`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdclick1`.`bdproductos`.`grupo` AS `Grupo` from (`bdclick1`.`bddiscosteo` join `bdclick1`.`bdproductos` on((`bdclick1`.`bddiscosteo`.`producto` = `bdclick1`.`bdproductos`.`idSistema`))) where (`bdclick1`.`bddiscosteo`.`opcionCambio` = 1)
md5=2f85803eb390dc7dc1f02f6eb8905702
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:36
create-version=2
source=select `bddiscosteo`.`codigo` AS `productoPrincipal`,`bddiscosteo`.`producto` AS `producto`,`bddiscosteo`.`cantidad` AS `cantidad`,`bddiscosteo`.`codigo` AS `codigo`,`bddiscosteo`.`descripcion` AS `descripcion`,`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdproductos`.`grupo` AS `Grupo` from (`bddiscosteo` join `bdproductos` on((`bddiscosteo`.`producto` = `bdproductos`.`idSistema`))) where (`bddiscosteo`.`opcionCambio` = 1)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bddiscosteo`.`codigo` AS `productoPrincipal`,`bdclick1`.`bddiscosteo`.`producto` AS `producto`,`bdclick1`.`bddiscosteo`.`cantidad` AS `cantidad`,`bdclick1`.`bddiscosteo`.`codigo` AS `codigo`,`bdclick1`.`bddiscosteo`.`descripcion` AS `descripcion`,`bdclick1`.`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdclick1`.`bdproductos`.`grupo` AS `Grupo` from (`bdclick1`.`bddiscosteo` join `bdclick1`.`bdproductos` on((`bdclick1`.`bddiscosteo`.`producto` = `bdclick1`.`bdproductos`.`idSistema`))) where (`bdclick1`.`bddiscosteo`.`opcionCambio` = 1)
mariadb-version=100135
