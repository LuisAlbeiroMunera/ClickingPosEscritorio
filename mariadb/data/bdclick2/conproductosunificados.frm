TYPE=VIEW
query=(select `bdclick2`.`bdproductosunificados`.`productoPadre` AS `productoPadre`,`bdclick2`.`bdproductosunificados`.`productoUnificado` AS `productoUnificado`,`bdclick2`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick2`.`bdproductos`.`referencia` AS `referencia`,`bdclick2`.`bdproductos`.`L1` AS `L1`,`bdclick2`.`bdproductos`.`inventario` AS `fisico`,`bdclick2`.`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdclick2`.`bdproductos`.`Codigo` AS `Codigo` from (`bdclick2`.`bdproductosunificados` left join `bdclick2`.`bdproductos` on((`bdclick2`.`bdproductosunificados`.`productoUnificado` = `bdclick2`.`bdproductos`.`idSistema`))))
md5=317a78701a9f7b217de2a9a8bcf860b9
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:44
create-version=2
source=(select `bdproductosunificados`.`productoPadre` AS `productoPadre`,`bdproductosunificados`.`productoUnificado` AS `productoUnificado`,`bdproductos`.`Descripcion` AS `Descripcion`,`bdproductos`.`referencia` AS `referencia`,`bdproductos`.`L1` AS `L1`,`bdproductos`.`inventario` AS `fisico`,`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdproductos`.`Codigo` AS `Codigo` from (`bdproductosunificados` left join `bdproductos` on((`bdproductosunificados`.`productoUnificado` = `bdproductos`.`idSistema`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick2`.`bdproductosunificados`.`productoPadre` AS `productoPadre`,`bdclick2`.`bdproductosunificados`.`productoUnificado` AS `productoUnificado`,`bdclick2`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick2`.`bdproductos`.`referencia` AS `referencia`,`bdclick2`.`bdproductos`.`L1` AS `L1`,`bdclick2`.`bdproductos`.`inventario` AS `fisico`,`bdclick2`.`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdclick2`.`bdproductos`.`Codigo` AS `Codigo` from (`bdclick2`.`bdproductosunificados` left join `bdclick2`.`bdproductos` on((`bdclick2`.`bdproductosunificados`.`productoUnificado` = `bdclick2`.`bdproductos`.`idSistema`))))
mariadb-version=100135
