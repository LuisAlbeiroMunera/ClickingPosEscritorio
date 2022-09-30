TYPE=VIEW
query=(select `bdclick3`.`bdproductosunificados`.`productoPadre` AS `productoPadre`,`bdclick3`.`bdproductosunificados`.`productoUnificado` AS `productoUnificado`,`bdclick3`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick3`.`bdproductos`.`referencia` AS `referencia`,`bdclick3`.`bdproductos`.`L1` AS `L1`,`bdclick3`.`bdproductos`.`inventario` AS `fisico`,`bdclick3`.`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdclick3`.`bdproductos`.`Codigo` AS `Codigo` from (`bdclick3`.`bdproductosunificados` left join `bdclick3`.`bdproductos` on((`bdclick3`.`bdproductosunificados`.`productoUnificado` = `bdclick3`.`bdproductos`.`idSistema`))))
md5=9c7d3b5e912914aab000a05832eafece
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:49
create-version=2
source=(select `bdproductosunificados`.`productoPadre` AS `productoPadre`,`bdproductosunificados`.`productoUnificado` AS `productoUnificado`,`bdproductos`.`Descripcion` AS `Descripcion`,`bdproductos`.`referencia` AS `referencia`,`bdproductos`.`L1` AS `L1`,`bdproductos`.`inventario` AS `fisico`,`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdproductos`.`Codigo` AS `Codigo` from (`bdproductosunificados` left join `bdproductos` on((`bdproductosunificados`.`productoUnificado` = `bdproductos`.`idSistema`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bdproductosunificados`.`productoPadre` AS `productoPadre`,`bdclick3`.`bdproductosunificados`.`productoUnificado` AS `productoUnificado`,`bdclick3`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick3`.`bdproductos`.`referencia` AS `referencia`,`bdclick3`.`bdproductos`.`L1` AS `L1`,`bdclick3`.`bdproductos`.`inventario` AS `fisico`,`bdclick3`.`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdclick3`.`bdproductos`.`Codigo` AS `Codigo` from (`bdclick3`.`bdproductosunificados` left join `bdclick3`.`bdproductos` on((`bdclick3`.`bdproductosunificados`.`productoUnificado` = `bdclick3`.`bdproductos`.`idSistema`))))
mariadb-version=100135
