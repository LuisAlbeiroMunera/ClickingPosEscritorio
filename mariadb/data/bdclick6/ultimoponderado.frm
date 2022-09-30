TYPE=VIEW
query=(select `bdclick6`.`bdproductos`.`idSistema` AS `producto`,`bdclick6`.`bdultimoponderado`.`ponderadoAntiguo` AS `ponderadoAntiguo`,`bdclick6`.`bdultimoponderado`.`cantidadAntigua` AS `cantidadAntigua`,`bdclick6`.`bdultimoponderado`.`cantidadEntrante` AS `cantidadEntrante`,`bdclick6`.`bdultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdclick6`.`bdultimoponderado`.`nuevaCantidad` AS `nuevaCantidad`,`bdclick6`.`bdultimoponderado`.`usuario` AS `usuario`,`bdclick6`.`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick6`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick6`.`bdproductos`.`grupo` AS `Grupo`,`bdclick6`.`bdultimoponderado`.`fecha` AS `fecha` from (`bdclick6`.`bdproductos` left join `bdclick6`.`bdultimoponderado` on((`bdclick6`.`bdproductos`.`idSistema` = `bdclick6`.`bdultimoponderado`.`producto`))))
md5=3ae562d9ff758223d3eab95bbc2bcc6c
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:42
create-version=2
source=(select `bdproductos`.`idSistema` AS `producto`,`bdultimoponderado`.`ponderadoAntiguo` AS `ponderadoAntiguo`,`bdultimoponderado`.`cantidadAntigua` AS `cantidadAntigua`,`bdultimoponderado`.`cantidadEntrante` AS `cantidadEntrante`,`bdultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdultimoponderado`.`nuevaCantidad` AS `nuevaCantidad`,`bdultimoponderado`.`usuario` AS `usuario`,`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdproductos`.`Descripcion` AS `Descripcion`,`bdproductos`.`grupo` AS `Grupo`,`bdultimoponderado`.`fecha` AS `fecha` from (`bdproductos` left join `bdultimoponderado` on((`bdproductos`.`idSistema` = `bdultimoponderado`.`producto`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bdproductos`.`idSistema` AS `producto`,`bdclick6`.`bdultimoponderado`.`ponderadoAntiguo` AS `ponderadoAntiguo`,`bdclick6`.`bdultimoponderado`.`cantidadAntigua` AS `cantidadAntigua`,`bdclick6`.`bdultimoponderado`.`cantidadEntrante` AS `cantidadEntrante`,`bdclick6`.`bdultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdclick6`.`bdultimoponderado`.`nuevaCantidad` AS `nuevaCantidad`,`bdclick6`.`bdultimoponderado`.`usuario` AS `usuario`,`bdclick6`.`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick6`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick6`.`bdproductos`.`grupo` AS `Grupo`,`bdclick6`.`bdultimoponderado`.`fecha` AS `fecha` from (`bdclick6`.`bdproductos` left join `bdclick6`.`bdultimoponderado` on((`bdclick6`.`bdproductos`.`idSistema` = `bdclick6`.`bdultimoponderado`.`producto`))))
mariadb-version=100135
