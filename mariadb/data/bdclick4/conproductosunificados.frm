TYPE=VIEW
query=(select `bdclick4`.`bdproductosunificados`.`productoPadre` AS `productoPadre`,`bdclick4`.`bdproductosunificados`.`productoUnificado` AS `productoUnificado`,`bdclick4`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick4`.`bdproductos`.`referencia` AS `referencia`,`bdclick4`.`bdproductos`.`L1` AS `L1`,`bdclick4`.`bdproductos`.`inventario` AS `fisico`,`bdclick4`.`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdclick4`.`bdproductos`.`Codigo` AS `Codigo` from (`bdclick4`.`bdproductosunificados` left join `bdclick4`.`bdproductos` on((`bdclick4`.`bdproductosunificados`.`productoUnificado` = `bdclick4`.`bdproductos`.`idSistema`))))
md5=24d1b894c684c2cf675a85034a75feff
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:26
create-version=2
source=(select `bdproductosunificados`.`productoPadre` AS `productoPadre`,`bdproductosunificados`.`productoUnificado` AS `productoUnificado`,`bdproductos`.`Descripcion` AS `Descripcion`,`bdproductos`.`referencia` AS `referencia`,`bdproductos`.`L1` AS `L1`,`bdproductos`.`inventario` AS `fisico`,`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdproductos`.`Codigo` AS `Codigo` from (`bdproductosunificados` left join `bdproductos` on((`bdproductosunificados`.`productoUnificado` = `bdproductos`.`idSistema`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`bdproductosunificados`.`productoPadre` AS `productoPadre`,`bdclick4`.`bdproductosunificados`.`productoUnificado` AS `productoUnificado`,`bdclick4`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick4`.`bdproductos`.`referencia` AS `referencia`,`bdclick4`.`bdproductos`.`L1` AS `L1`,`bdclick4`.`bdproductos`.`inventario` AS `fisico`,`bdclick4`.`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdclick4`.`bdproductos`.`Codigo` AS `Codigo` from (`bdclick4`.`bdproductosunificados` left join `bdclick4`.`bdproductos` on((`bdclick4`.`bdproductosunificados`.`productoUnificado` = `bdclick4`.`bdproductos`.`idSistema`))))
mariadb-version=100135
