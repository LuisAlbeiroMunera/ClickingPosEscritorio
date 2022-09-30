TYPE=VIEW
query=select `bdclick6`.`bddiscosteo`.`codigo` AS `productoPrincipal`,`bdclick6`.`bddiscosteo`.`producto` AS `producto`,`bdclick6`.`bddiscosteo`.`cantidad` AS `cantidad`,`bdclick6`.`bddiscosteo`.`codigo` AS `codigo`,`bdclick6`.`bddiscosteo`.`descripcion` AS `descripcion`,`bdclick6`.`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdclick6`.`bdproductos`.`grupo` AS `Grupo` from (`bdclick6`.`bddiscosteo` join `bdclick6`.`bdproductos` on((`bdclick6`.`bddiscosteo`.`producto` = `bdclick6`.`bdproductos`.`idSistema`))) where (`bdclick6`.`bddiscosteo`.`opcionCambio` = 1)
md5=dcbb1713ef63a2c688076c1177088915
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:37
create-version=2
source=select `bddiscosteo`.`codigo` AS `productoPrincipal`,`bddiscosteo`.`producto` AS `producto`,`bddiscosteo`.`cantidad` AS `cantidad`,`bddiscosteo`.`codigo` AS `codigo`,`bddiscosteo`.`descripcion` AS `descripcion`,`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdproductos`.`grupo` AS `Grupo` from (`bddiscosteo` join `bdproductos` on((`bddiscosteo`.`producto` = `bdproductos`.`idSistema`))) where (`bddiscosteo`.`opcionCambio` = 1)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bddiscosteo`.`codigo` AS `productoPrincipal`,`bdclick6`.`bddiscosteo`.`producto` AS `producto`,`bdclick6`.`bddiscosteo`.`cantidad` AS `cantidad`,`bdclick6`.`bddiscosteo`.`codigo` AS `codigo`,`bdclick6`.`bddiscosteo`.`descripcion` AS `descripcion`,`bdclick6`.`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdclick6`.`bdproductos`.`grupo` AS `Grupo` from (`bdclick6`.`bddiscosteo` join `bdclick6`.`bdproductos` on((`bdclick6`.`bddiscosteo`.`producto` = `bdclick6`.`bdproductos`.`idSistema`))) where (`bdclick6`.`bddiscosteo`.`opcionCambio` = 1)
mariadb-version=100135
