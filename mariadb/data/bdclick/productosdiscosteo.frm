TYPE=VIEW
query=select `bdclick`.`bddiscosteo`.`codigo` AS `productoPrincipal`,`bdclick`.`bddiscosteo`.`producto` AS `producto`,`bdclick`.`bddiscosteo`.`cantidad` AS `cantidad`,`bdclick`.`bddiscosteo`.`codigo` AS `codigo`,`bdclick`.`bddiscosteo`.`descripcion` AS `descripcion`,`bdclick`.`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdclick`.`bdproductos`.`grupo` AS `Grupo` from (`bdclick`.`bddiscosteo` join `bdclick`.`bdproductos` on((`bdclick`.`bddiscosteo`.`producto` = `bdclick`.`bdproductos`.`idSistema`))) where (`bdclick`.`bddiscosteo`.`opcionCambio` = 1)
md5=c1ee46fe0cee0c8e713d6010ea3d173e
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:25
create-version=2
source=select `bddiscosteo`.`codigo` AS `productoPrincipal`,`bddiscosteo`.`producto` AS `producto`,`bddiscosteo`.`cantidad` AS `cantidad`,`bddiscosteo`.`codigo` AS `codigo`,`bddiscosteo`.`descripcion` AS `descripcion`,`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdproductos`.`grupo` AS `Grupo` from (`bddiscosteo` join `bdproductos` on((`bddiscosteo`.`producto` = `bdproductos`.`idSistema`))) where (`bddiscosteo`.`opcionCambio` = 1)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bddiscosteo`.`codigo` AS `productoPrincipal`,`bdclick`.`bddiscosteo`.`producto` AS `producto`,`bdclick`.`bddiscosteo`.`cantidad` AS `cantidad`,`bdclick`.`bddiscosteo`.`codigo` AS `codigo`,`bdclick`.`bddiscosteo`.`descripcion` AS `descripcion`,`bdclick`.`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdclick`.`bdproductos`.`grupo` AS `Grupo` from (`bdclick`.`bddiscosteo` join `bdclick`.`bdproductos` on((`bdclick`.`bddiscosteo`.`producto` = `bdclick`.`bdproductos`.`idSistema`))) where (`bdclick`.`bddiscosteo`.`opcionCambio` = 1)
mariadb-version=100135
