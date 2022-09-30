TYPE=VIEW
query=(select `bdclick6`.`bdproductosunificados`.`productoPadre` AS `productoPadre`,`bdclick6`.`bdproductosunificados`.`productoUnificado` AS `productoUnificado`,`bdclick6`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick6`.`bdproductos`.`referencia` AS `referencia`,`bdclick6`.`bdproductos`.`L1` AS `L1`,`bdclick6`.`bdproductos`.`inventario` AS `fisico`,`bdclick6`.`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdclick6`.`bdproductos`.`Codigo` AS `Codigo` from (`bdclick6`.`bdproductosunificados` left join `bdclick6`.`bdproductos` on((`bdclick6`.`bdproductosunificados`.`productoUnificado` = `bdclick6`.`bdproductos`.`idSistema`))))
md5=324e2df3ca5b30e4f85148d31d1bb93d
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:34
create-version=2
source=(select `bdproductosunificados`.`productoPadre` AS `productoPadre`,`bdproductosunificados`.`productoUnificado` AS `productoUnificado`,`bdproductos`.`Descripcion` AS `Descripcion`,`bdproductos`.`referencia` AS `referencia`,`bdproductos`.`L1` AS `L1`,`bdproductos`.`inventario` AS `fisico`,`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdproductos`.`Codigo` AS `Codigo` from (`bdproductosunificados` left join `bdproductos` on((`bdproductosunificados`.`productoUnificado` = `bdproductos`.`idSistema`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bdproductosunificados`.`productoPadre` AS `productoPadre`,`bdclick6`.`bdproductosunificados`.`productoUnificado` AS `productoUnificado`,`bdclick6`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick6`.`bdproductos`.`referencia` AS `referencia`,`bdclick6`.`bdproductos`.`L1` AS `L1`,`bdclick6`.`bdproductos`.`inventario` AS `fisico`,`bdclick6`.`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdclick6`.`bdproductos`.`Codigo` AS `Codigo` from (`bdclick6`.`bdproductosunificados` left join `bdclick6`.`bdproductos` on((`bdclick6`.`bdproductosunificados`.`productoUnificado` = `bdclick6`.`bdproductos`.`idSistema`))))
mariadb-version=100135
