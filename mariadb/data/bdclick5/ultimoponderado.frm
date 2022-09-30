TYPE=VIEW
query=(select `bdclick5`.`bdproductos`.`idSistema` AS `producto`,`bdclick5`.`bdultimoponderado`.`ponderadoAntiguo` AS `ponderadoAntiguo`,`bdclick5`.`bdultimoponderado`.`cantidadAntigua` AS `cantidadAntigua`,`bdclick5`.`bdultimoponderado`.`cantidadEntrante` AS `cantidadEntrante`,`bdclick5`.`bdultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdclick5`.`bdultimoponderado`.`nuevaCantidad` AS `nuevaCantidad`,`bdclick5`.`bdultimoponderado`.`usuario` AS `usuario`,`bdclick5`.`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick5`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick5`.`bdproductos`.`grupo` AS `Grupo`,`bdclick5`.`bdultimoponderado`.`fecha` AS `fecha` from (`bdclick5`.`bdproductos` left join `bdclick5`.`bdultimoponderado` on((`bdclick5`.`bdproductos`.`idSistema` = `bdclick5`.`bdultimoponderado`.`producto`))))
md5=50320db3e7da0c5e4e2681e7a344b85e
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:53
create-version=2
source=(select `bdproductos`.`idSistema` AS `producto`,`bdultimoponderado`.`ponderadoAntiguo` AS `ponderadoAntiguo`,`bdultimoponderado`.`cantidadAntigua` AS `cantidadAntigua`,`bdultimoponderado`.`cantidadEntrante` AS `cantidadEntrante`,`bdultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdultimoponderado`.`nuevaCantidad` AS `nuevaCantidad`,`bdultimoponderado`.`usuario` AS `usuario`,`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdproductos`.`Descripcion` AS `Descripcion`,`bdproductos`.`grupo` AS `Grupo`,`bdultimoponderado`.`fecha` AS `fecha` from (`bdproductos` left join `bdultimoponderado` on((`bdproductos`.`idSistema` = `bdultimoponderado`.`producto`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`bdproductos`.`idSistema` AS `producto`,`bdclick5`.`bdultimoponderado`.`ponderadoAntiguo` AS `ponderadoAntiguo`,`bdclick5`.`bdultimoponderado`.`cantidadAntigua` AS `cantidadAntigua`,`bdclick5`.`bdultimoponderado`.`cantidadEntrante` AS `cantidadEntrante`,`bdclick5`.`bdultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdclick5`.`bdultimoponderado`.`nuevaCantidad` AS `nuevaCantidad`,`bdclick5`.`bdultimoponderado`.`usuario` AS `usuario`,`bdclick5`.`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick5`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick5`.`bdproductos`.`grupo` AS `Grupo`,`bdclick5`.`bdultimoponderado`.`fecha` AS `fecha` from (`bdclick5`.`bdproductos` left join `bdclick5`.`bdultimoponderado` on((`bdclick5`.`bdproductos`.`idSistema` = `bdclick5`.`bdultimoponderado`.`producto`))))
mariadb-version=100135
