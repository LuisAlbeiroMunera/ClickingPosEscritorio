TYPE=VIEW
query=(select `bdclick1`.`bdproductos`.`idSistema` AS `producto`,`bdclick1`.`bdultimoponderado`.`ponderadoAntiguo` AS `ponderadoAntiguo`,`bdclick1`.`bdultimoponderado`.`cantidadAntigua` AS `cantidadAntigua`,`bdclick1`.`bdultimoponderado`.`cantidadEntrante` AS `cantidadEntrante`,`bdclick1`.`bdultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdclick1`.`bdultimoponderado`.`nuevaCantidad` AS `nuevaCantidad`,`bdclick1`.`bdultimoponderado`.`usuario` AS `usuario`,`bdclick1`.`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick1`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick1`.`bdproductos`.`grupo` AS `Grupo`,`bdclick1`.`bdultimoponderado`.`fecha` AS `fecha` from (`bdclick1`.`bdproductos` left join `bdclick1`.`bdultimoponderado` on((`bdclick1`.`bdproductos`.`idSistema` = `bdclick1`.`bdultimoponderado`.`producto`))))
md5=390d6f9ecf07ebff95121670e85db583
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:40
create-version=2
source=(select `bdproductos`.`idSistema` AS `producto`,`bdultimoponderado`.`ponderadoAntiguo` AS `ponderadoAntiguo`,`bdultimoponderado`.`cantidadAntigua` AS `cantidadAntigua`,`bdultimoponderado`.`cantidadEntrante` AS `cantidadEntrante`,`bdultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdultimoponderado`.`nuevaCantidad` AS `nuevaCantidad`,`bdultimoponderado`.`usuario` AS `usuario`,`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdproductos`.`Descripcion` AS `Descripcion`,`bdproductos`.`grupo` AS `Grupo`,`bdultimoponderado`.`fecha` AS `fecha` from (`bdproductos` left join `bdultimoponderado` on((`bdproductos`.`idSistema` = `bdultimoponderado`.`producto`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick1`.`bdproductos`.`idSistema` AS `producto`,`bdclick1`.`bdultimoponderado`.`ponderadoAntiguo` AS `ponderadoAntiguo`,`bdclick1`.`bdultimoponderado`.`cantidadAntigua` AS `cantidadAntigua`,`bdclick1`.`bdultimoponderado`.`cantidadEntrante` AS `cantidadEntrante`,`bdclick1`.`bdultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdclick1`.`bdultimoponderado`.`nuevaCantidad` AS `nuevaCantidad`,`bdclick1`.`bdultimoponderado`.`usuario` AS `usuario`,`bdclick1`.`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick1`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick1`.`bdproductos`.`grupo` AS `Grupo`,`bdclick1`.`bdultimoponderado`.`fecha` AS `fecha` from (`bdclick1`.`bdproductos` left join `bdclick1`.`bdultimoponderado` on((`bdclick1`.`bdproductos`.`idSistema` = `bdclick1`.`bdultimoponderado`.`producto`))))
mariadb-version=100135
