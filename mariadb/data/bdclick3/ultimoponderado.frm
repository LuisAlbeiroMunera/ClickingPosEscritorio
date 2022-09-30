TYPE=VIEW
query=(select `bdclick3`.`bdproductos`.`idSistema` AS `producto`,`bdclick3`.`bdultimoponderado`.`ponderadoAntiguo` AS `ponderadoAntiguo`,`bdclick3`.`bdultimoponderado`.`cantidadAntigua` AS `cantidadAntigua`,`bdclick3`.`bdultimoponderado`.`cantidadEntrante` AS `cantidadEntrante`,`bdclick3`.`bdultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdclick3`.`bdultimoponderado`.`nuevaCantidad` AS `nuevaCantidad`,`bdclick3`.`bdultimoponderado`.`usuario` AS `usuario`,`bdclick3`.`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick3`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick3`.`bdproductos`.`grupo` AS `Grupo`,`bdclick3`.`bdultimoponderado`.`fecha` AS `fecha` from (`bdclick3`.`bdproductos` left join `bdclick3`.`bdultimoponderado` on((`bdclick3`.`bdproductos`.`idSistema` = `bdclick3`.`bdultimoponderado`.`producto`))))
md5=3e78df6c2c0f7cf8e9501d19d0239162
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:56
create-version=2
source=(select `bdproductos`.`idSistema` AS `producto`,`bdultimoponderado`.`ponderadoAntiguo` AS `ponderadoAntiguo`,`bdultimoponderado`.`cantidadAntigua` AS `cantidadAntigua`,`bdultimoponderado`.`cantidadEntrante` AS `cantidadEntrante`,`bdultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdultimoponderado`.`nuevaCantidad` AS `nuevaCantidad`,`bdultimoponderado`.`usuario` AS `usuario`,`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdproductos`.`Descripcion` AS `Descripcion`,`bdproductos`.`grupo` AS `Grupo`,`bdultimoponderado`.`fecha` AS `fecha` from (`bdproductos` left join `bdultimoponderado` on((`bdproductos`.`idSistema` = `bdultimoponderado`.`producto`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bdproductos`.`idSistema` AS `producto`,`bdclick3`.`bdultimoponderado`.`ponderadoAntiguo` AS `ponderadoAntiguo`,`bdclick3`.`bdultimoponderado`.`cantidadAntigua` AS `cantidadAntigua`,`bdclick3`.`bdultimoponderado`.`cantidadEntrante` AS `cantidadEntrante`,`bdclick3`.`bdultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdclick3`.`bdultimoponderado`.`nuevaCantidad` AS `nuevaCantidad`,`bdclick3`.`bdultimoponderado`.`usuario` AS `usuario`,`bdclick3`.`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick3`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick3`.`bdproductos`.`grupo` AS `Grupo`,`bdclick3`.`bdultimoponderado`.`fecha` AS `fecha` from (`bdclick3`.`bdproductos` left join `bdclick3`.`bdultimoponderado` on((`bdclick3`.`bdproductos`.`idSistema` = `bdclick3`.`bdultimoponderado`.`producto`))))
mariadb-version=100135
