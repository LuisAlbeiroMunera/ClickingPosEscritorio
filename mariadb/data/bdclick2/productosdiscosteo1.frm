TYPE=VIEW
query=select `bdclick2`.`bddiscosteo`.`producto` AS `producto`,`bdclick2`.`bddiscosteo`.`cantidad` AS `cantidad`,`bdclick2`.`bddiscosteo`.`codigo` AS `codigo`,`bdclick2`.`bddiscosteo`.`descripcion` AS `descripcion`,`bdclick2`.`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdclick2`.`bdproductos`.`grupo` AS `Grupo` from (`bdclick2`.`bddiscosteo` join `bdclick2`.`bdproductos` on((`bdclick2`.`bddiscosteo`.`producto` = `bdclick2`.`bdproductos`.`idSistema`))) where (`bdclick2`.`bddiscosteo`.`opcionCambio` = 0)
md5=604729294cb763ccc9280fe7f6d75831
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:46
create-version=2
source=select `bddiscosteo`.`producto` AS `producto`,`bddiscosteo`.`cantidad` AS `cantidad`,`bddiscosteo`.`codigo` AS `codigo`,`bddiscosteo`.`descripcion` AS `descripcion`,`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdproductos`.`grupo` AS `Grupo` from (`bddiscosteo` join `bdproductos` on((`bddiscosteo`.`producto` = `bdproductos`.`idSistema`))) where (`bddiscosteo`.`opcionCambio` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bddiscosteo`.`producto` AS `producto`,`bdclick2`.`bddiscosteo`.`cantidad` AS `cantidad`,`bdclick2`.`bddiscosteo`.`codigo` AS `codigo`,`bdclick2`.`bddiscosteo`.`descripcion` AS `descripcion`,`bdclick2`.`bddiscosteo`.`opcionCambio` AS `opcionCambio`,`bdclick2`.`bdproductos`.`grupo` AS `Grupo` from (`bdclick2`.`bddiscosteo` join `bdclick2`.`bdproductos` on((`bdclick2`.`bddiscosteo`.`producto` = `bdclick2`.`bdproductos`.`idSistema`))) where (`bdclick2`.`bddiscosteo`.`opcionCambio` = 0)
mariadb-version=100135
