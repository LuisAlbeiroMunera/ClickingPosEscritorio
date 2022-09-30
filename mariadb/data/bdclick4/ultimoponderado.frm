TYPE=VIEW
query=(select `bdclick4`.`bdproductos`.`idSistema` AS `producto`,`bdclick4`.`bdultimoponderado`.`ponderadoAntiguo` AS `ponderadoAntiguo`,`bdclick4`.`bdultimoponderado`.`cantidadAntigua` AS `cantidadAntigua`,`bdclick4`.`bdultimoponderado`.`cantidadEntrante` AS `cantidadEntrante`,`bdclick4`.`bdultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdclick4`.`bdultimoponderado`.`nuevaCantidad` AS `nuevaCantidad`,`bdclick4`.`bdultimoponderado`.`usuario` AS `usuario`,`bdclick4`.`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick4`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick4`.`bdproductos`.`grupo` AS `Grupo`,`bdclick4`.`bdultimoponderado`.`fecha` AS `fecha` from (`bdclick4`.`bdproductos` left join `bdclick4`.`bdultimoponderado` on((`bdclick4`.`bdproductos`.`idSistema` = `bdclick4`.`bdultimoponderado`.`producto`))))
md5=1bd1bf37b82c2ccbede85f511c9a8341
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:33
create-version=2
source=(select `bdproductos`.`idSistema` AS `producto`,`bdultimoponderado`.`ponderadoAntiguo` AS `ponderadoAntiguo`,`bdultimoponderado`.`cantidadAntigua` AS `cantidadAntigua`,`bdultimoponderado`.`cantidadEntrante` AS `cantidadEntrante`,`bdultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdultimoponderado`.`nuevaCantidad` AS `nuevaCantidad`,`bdultimoponderado`.`usuario` AS `usuario`,`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdproductos`.`Descripcion` AS `Descripcion`,`bdproductos`.`grupo` AS `Grupo`,`bdultimoponderado`.`fecha` AS `fecha` from (`bdproductos` left join `bdultimoponderado` on((`bdproductos`.`idSistema` = `bdultimoponderado`.`producto`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`bdproductos`.`idSistema` AS `producto`,`bdclick4`.`bdultimoponderado`.`ponderadoAntiguo` AS `ponderadoAntiguo`,`bdclick4`.`bdultimoponderado`.`cantidadAntigua` AS `cantidadAntigua`,`bdclick4`.`bdultimoponderado`.`cantidadEntrante` AS `cantidadEntrante`,`bdclick4`.`bdultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdclick4`.`bdultimoponderado`.`nuevaCantidad` AS `nuevaCantidad`,`bdclick4`.`bdultimoponderado`.`usuario` AS `usuario`,`bdclick4`.`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick4`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick4`.`bdproductos`.`grupo` AS `Grupo`,`bdclick4`.`bdultimoponderado`.`fecha` AS `fecha` from (`bdclick4`.`bdproductos` left join `bdclick4`.`bdultimoponderado` on((`bdclick4`.`bdproductos`.`idSistema` = `bdclick4`.`bdultimoponderado`.`producto`))))
mariadb-version=100135
