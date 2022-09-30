TYPE=VIEW
query=(select `bdclick`.`bdproductos`.`idSistema` AS `producto`,`bdclick`.`bdultimoponderado`.`ponderadoAntiguo` AS `ponderadoAntiguo`,`bdclick`.`bdultimoponderado`.`cantidadAntigua` AS `cantidadAntigua`,`bdclick`.`bdultimoponderado`.`cantidadEntrante` AS `cantidadEntrante`,`bdclick`.`bdultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdclick`.`bdultimoponderado`.`nuevaCantidad` AS `nuevaCantidad`,`bdclick`.`bdultimoponderado`.`usuario` AS `usuario`,`bdclick`.`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick`.`bdproductos`.`grupo` AS `Grupo`,`bdclick`.`bdultimoponderado`.`fecha` AS `fecha` from (`bdclick`.`bdproductos` left join `bdclick`.`bdultimoponderado` on((`bdclick`.`bdproductos`.`idSistema` = `bdclick`.`bdultimoponderado`.`producto`))))
md5=cd6e00c13da6ff841a166cec3c68b841
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:30
create-version=2
source=(select `bdproductos`.`idSistema` AS `producto`,`bdultimoponderado`.`ponderadoAntiguo` AS `ponderadoAntiguo`,`bdultimoponderado`.`cantidadAntigua` AS `cantidadAntigua`,`bdultimoponderado`.`cantidadEntrante` AS `cantidadEntrante`,`bdultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdultimoponderado`.`nuevaCantidad` AS `nuevaCantidad`,`bdultimoponderado`.`usuario` AS `usuario`,`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdproductos`.`Descripcion` AS `Descripcion`,`bdproductos`.`grupo` AS `Grupo`,`bdultimoponderado`.`fecha` AS `fecha` from (`bdproductos` left join `bdultimoponderado` on((`bdproductos`.`idSistema` = `bdultimoponderado`.`producto`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdproductos`.`idSistema` AS `producto`,`bdclick`.`bdultimoponderado`.`ponderadoAntiguo` AS `ponderadoAntiguo`,`bdclick`.`bdultimoponderado`.`cantidadAntigua` AS `cantidadAntigua`,`bdclick`.`bdultimoponderado`.`cantidadEntrante` AS `cantidadEntrante`,`bdclick`.`bdultimoponderado`.`nuevoPonderado` AS `nuevoPonderado`,`bdclick`.`bdultimoponderado`.`nuevaCantidad` AS `nuevaCantidad`,`bdclick`.`bdultimoponderado`.`usuario` AS `usuario`,`bdclick`.`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick`.`bdproductos`.`grupo` AS `Grupo`,`bdclick`.`bdultimoponderado`.`fecha` AS `fecha` from (`bdclick`.`bdproductos` left join `bdclick`.`bdultimoponderado` on((`bdclick`.`bdproductos`.`idSistema` = `bdclick`.`bdultimoponderado`.`producto`))))
mariadb-version=100135
