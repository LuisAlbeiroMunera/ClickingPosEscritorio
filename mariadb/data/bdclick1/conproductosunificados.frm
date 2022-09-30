TYPE=VIEW
query=(select `bdclick1`.`bdproductosunificados`.`productoPadre` AS `productoPadre`,`bdclick1`.`bdproductosunificados`.`productoUnificado` AS `productoUnificado`,`bdclick1`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick1`.`bdproductos`.`referencia` AS `referencia`,`bdclick1`.`bdproductos`.`L1` AS `L1`,`bdclick1`.`bdproductos`.`inventario` AS `fisico`,`bdclick1`.`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdclick1`.`bdproductos`.`Codigo` AS `Codigo` from (`bdclick1`.`bdproductosunificados` left join `bdclick1`.`bdproductos` on((`bdclick1`.`bdproductosunificados`.`productoUnificado` = `bdclick1`.`bdproductos`.`idSistema`))))
md5=9fe84c79e15879fb51b96dc36f8b0691
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:33
create-version=2
source=(select `bdproductosunificados`.`productoPadre` AS `productoPadre`,`bdproductosunificados`.`productoUnificado` AS `productoUnificado`,`bdproductos`.`Descripcion` AS `Descripcion`,`bdproductos`.`referencia` AS `referencia`,`bdproductos`.`L1` AS `L1`,`bdproductos`.`inventario` AS `fisico`,`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdproductos`.`Codigo` AS `Codigo` from (`bdproductosunificados` left join `bdproductos` on((`bdproductosunificados`.`productoUnificado` = `bdproductos`.`idSistema`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick1`.`bdproductosunificados`.`productoPadre` AS `productoPadre`,`bdclick1`.`bdproductosunificados`.`productoUnificado` AS `productoUnificado`,`bdclick1`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick1`.`bdproductos`.`referencia` AS `referencia`,`bdclick1`.`bdproductos`.`L1` AS `L1`,`bdclick1`.`bdproductos`.`inventario` AS `fisico`,`bdclick1`.`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdclick1`.`bdproductos`.`Codigo` AS `Codigo` from (`bdclick1`.`bdproductosunificados` left join `bdclick1`.`bdproductos` on((`bdclick1`.`bdproductosunificados`.`productoUnificado` = `bdclick1`.`bdproductos`.`idSistema`))))
mariadb-version=100135
