TYPE=VIEW
query=select `bdclick5`.`bddiscosteo`.`codigo` AS `productoPrincipal`,`bdclick5`.`bddiscosteo`.`producto` AS `producto`,`bdclick5`.`bddiscosteo`.`cantidad` AS `cantidad`,`bdclick5`.`bddiscosteo`.`codigo` AS `codigo`,`bdclick5`.`bddiscosteo`.`descripcion` AS `descripcion`,`bdclick5`.`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdclick5`.`bdproductos`.`grupo` AS `Grupo` from (`bdclick5`.`bddiscosteo` join `bdclick5`.`bdproductos` on((`bdclick5`.`bddiscosteo`.`producto` = `bdclick5`.`bdproductos`.`idSistema`))) where (`bdclick5`.`bddiscosteo`.`opcionCambio` = 1)
md5=4e617a08c928a4f28fb12adb6f935626
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:48
create-version=2
source=select `bddiscosteo`.`codigo` AS `productoPrincipal`,`bddiscosteo`.`producto` AS `producto`,`bddiscosteo`.`cantidad` AS `cantidad`,`bddiscosteo`.`codigo` AS `codigo`,`bddiscosteo`.`descripcion` AS `descripcion`,`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdproductos`.`grupo` AS `Grupo` from (`bddiscosteo` join `bdproductos` on((`bddiscosteo`.`producto` = `bdproductos`.`idSistema`))) where (`bddiscosteo`.`opcionCambio` = 1)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bddiscosteo`.`codigo` AS `productoPrincipal`,`bdclick5`.`bddiscosteo`.`producto` AS `producto`,`bdclick5`.`bddiscosteo`.`cantidad` AS `cantidad`,`bdclick5`.`bddiscosteo`.`codigo` AS `codigo`,`bdclick5`.`bddiscosteo`.`descripcion` AS `descripcion`,`bdclick5`.`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdclick5`.`bdproductos`.`grupo` AS `Grupo` from (`bdclick5`.`bddiscosteo` join `bdclick5`.`bdproductos` on((`bdclick5`.`bddiscosteo`.`producto` = `bdclick5`.`bdproductos`.`idSistema`))) where (`bdclick5`.`bddiscosteo`.`opcionCambio` = 1)
mariadb-version=100135
