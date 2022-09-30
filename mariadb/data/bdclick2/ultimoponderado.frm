TYPE=VIEW
query=(select `bdclick2`.`bdproductos`.`idSistema` AS `producto`,`bdclick2`.`bdultimoponderado`.`ponderadoAntiguo` AS `ponderadoAntiguo`,`bdclick2`.`bdultimoponderado`.`cantidadAntigua` AS `cantidadAntigua`,`bdclick2`.`bdultimoponderado`.`cantidadEntrante` AS `cantidadEntrante`,`bdclick2`.`bdultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdclick2`.`bdultimoponderado`.`nuevaCantidad` AS `nuevaCantidad`,`bdclick2`.`bdultimoponderado`.`usuario` AS `usuario`,`bdclick2`.`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick2`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick2`.`bdproductos`.`grupo` AS `Grupo`,`bdclick2`.`bdultimoponderado`.`fecha` AS `fecha` from (`bdclick2`.`bdproductos` left join `bdclick2`.`bdultimoponderado` on((`bdclick2`.`bdproductos`.`idSistema` = `bdclick2`.`bdultimoponderado`.`producto`))))
md5=74bf084632c4130b4cec66a6757239e6
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:51
create-version=2
source=(select `bdproductos`.`idSistema` AS `producto`,`bdultimoponderado`.`ponderadoAntiguo` AS `ponderadoAntiguo`,`bdultimoponderado`.`cantidadAntigua` AS `cantidadAntigua`,`bdultimoponderado`.`cantidadEntrante` AS `cantidadEntrante`,`bdultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdultimoponderado`.`nuevaCantidad` AS `nuevaCantidad`,`bdultimoponderado`.`usuario` AS `usuario`,`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdproductos`.`Descripcion` AS `Descripcion`,`bdproductos`.`grupo` AS `Grupo`,`bdultimoponderado`.`fecha` AS `fecha` from (`bdproductos` left join `bdultimoponderado` on((`bdproductos`.`idSistema` = `bdultimoponderado`.`producto`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick2`.`bdproductos`.`idSistema` AS `producto`,`bdclick2`.`bdultimoponderado`.`ponderadoAntiguo` AS `ponderadoAntiguo`,`bdclick2`.`bdultimoponderado`.`cantidadAntigua` AS `cantidadAntigua`,`bdclick2`.`bdultimoponderado`.`cantidadEntrante` AS `cantidadEntrante`,`bdclick2`.`bdultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdclick2`.`bdultimoponderado`.`nuevaCantidad` AS `nuevaCantidad`,`bdclick2`.`bdultimoponderado`.`usuario` AS `usuario`,`bdclick2`.`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick2`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick2`.`bdproductos`.`grupo` AS `Grupo`,`bdclick2`.`bdultimoponderado`.`fecha` AS `fecha` from (`bdclick2`.`bdproductos` left join `bdclick2`.`bdultimoponderado` on((`bdclick2`.`bdproductos`.`idSistema` = `bdclick2`.`bdultimoponderado`.`producto`))))
mariadb-version=100135
