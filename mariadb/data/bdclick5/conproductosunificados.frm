TYPE=VIEW
query=(select `bdclick5`.`bdproductosunificados`.`productoPadre` AS `productoPadre`,`bdclick5`.`bdproductosunificados`.`productoUnificado` AS `productoUnificado`,`bdclick5`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick5`.`bdproductos`.`referencia` AS `referencia`,`bdclick5`.`bdproductos`.`L1` AS `L1`,`bdclick5`.`bdproductos`.`inventario` AS `fisico`,`bdclick5`.`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdclick5`.`bdproductos`.`Codigo` AS `Codigo` from (`bdclick5`.`bdproductosunificados` left join `bdclick5`.`bdproductos` on((`bdclick5`.`bdproductosunificados`.`productoUnificado` = `bdclick5`.`bdproductos`.`idSistema`))))
md5=aa05eafb00777c5a1e44110d442e0aa7
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:45
create-version=2
source=(select `bdproductosunificados`.`productoPadre` AS `productoPadre`,`bdproductosunificados`.`productoUnificado` AS `productoUnificado`,`bdproductos`.`Descripcion` AS `Descripcion`,`bdproductos`.`referencia` AS `referencia`,`bdproductos`.`L1` AS `L1`,`bdproductos`.`inventario` AS `fisico`,`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdproductos`.`Codigo` AS `Codigo` from (`bdproductosunificados` left join `bdproductos` on((`bdproductosunificados`.`productoUnificado` = `bdproductos`.`idSistema`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`bdproductosunificados`.`productoPadre` AS `productoPadre`,`bdclick5`.`bdproductosunificados`.`productoUnificado` AS `productoUnificado`,`bdclick5`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick5`.`bdproductos`.`referencia` AS `referencia`,`bdclick5`.`bdproductos`.`L1` AS `L1`,`bdclick5`.`bdproductos`.`inventario` AS `fisico`,`bdclick5`.`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdclick5`.`bdproductos`.`Codigo` AS `Codigo` from (`bdclick5`.`bdproductosunificados` left join `bdclick5`.`bdproductos` on((`bdclick5`.`bdproductosunificados`.`productoUnificado` = `bdclick5`.`bdproductos`.`idSistema`))))
mariadb-version=100135
