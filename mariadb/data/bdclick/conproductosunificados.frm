TYPE=VIEW
query=(select `bdclick`.`bdproductosunificados`.`productoPadre` AS `productoPadre`,`bdclick`.`bdproductosunificados`.`productoUnificado` AS `productoUnificado`,`bdclick`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick`.`bdproductos`.`referencia` AS `referencia`,`bdclick`.`bdproductos`.`L1` AS `L1`,`bdclick`.`bdproductos`.`inventario` AS `fisico`,`bdclick`.`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdclick`.`bdproductos`.`Codigo` AS `Codigo` from (`bdclick`.`bdproductosunificados` left join `bdclick`.`bdproductos` on((`bdclick`.`bdproductosunificados`.`productoUnificado` = `bdclick`.`bdproductos`.`idSistema`))))
md5=c6096943da6b7ab4b16c867b16d670ff
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:22
create-version=2
source=(select `bdproductosunificados`.`productoPadre` AS `productoPadre`,`bdproductosunificados`.`productoUnificado` AS `productoUnificado`,`bdproductos`.`Descripcion` AS `Descripcion`,`bdproductos`.`referencia` AS `referencia`,`bdproductos`.`L1` AS `L1`,`bdproductos`.`inventario` AS `fisico`,`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdproductos`.`Codigo` AS `Codigo` from (`bdproductosunificados` left join `bdproductos` on((`bdproductosunificados`.`productoUnificado` = `bdproductos`.`idSistema`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdproductosunificados`.`productoPadre` AS `productoPadre`,`bdclick`.`bdproductosunificados`.`productoUnificado` AS `productoUnificado`,`bdclick`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick`.`bdproductos`.`referencia` AS `referencia`,`bdclick`.`bdproductos`.`L1` AS `L1`,`bdclick`.`bdproductos`.`inventario` AS `fisico`,`bdclick`.`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdclick`.`bdproductos`.`Codigo` AS `Codigo` from (`bdclick`.`bdproductosunificados` left join `bdclick`.`bdproductos` on((`bdclick`.`bdproductosunificados`.`productoUnificado` = `bdclick`.`bdproductos`.`idSistema`))))
mariadb-version=100135
