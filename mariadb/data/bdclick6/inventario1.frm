TYPE=VIEW
query=select `bdclick6`.`bdproductosbodega1`.`idSistema` AS `Codigo`,`bdclick6`.`bdproductosbodega1`.`Descripcion` AS `Descripcion`,`bdclick6`.`bdproductosbodega1`.`inventario` AS `inventario`,cast(`bdclick6`.`bdproductosbodega1`.`inventario` as signed) AS `inv`,`bdclick6`.`bdproductosbodega1`.`fisicoInventario` AS `fisicoInventario`,`bdclick6`.`bdproductosbodega1`.`compras` AS `compras`,`bdclick6`.`bdproductosbodega1`.`ventas` AS `ventas`,`bdclick6`.`bdproductosbodega1`.`nc` AS `nc`,`bdclick6`.`bdproductosbodega1`.`ajusteEntrada` AS `ajusteEntrada`,`bdclick6`.`bdproductosbodega1`.`ajusteSalida` AS `ajusteSalida`,`bdclick6`.`bdproductosbodega1`.`planSepare` AS `planSepare`,`bdclick6`.`bdproductosbodega1`.`pedidos` AS `pedidos`,`bdclick6`.`bdproductosbodega1`.`anulacion` AS `anulacion`,`bdclick6`.`bdproductosbodega1`.`inventarioInicial` AS `inventarioInicial`,`bdclick6`.`bdproductosbodega1`.`ajusteInventario` AS `ajusteInventario`,`bdclick6`.`bdproductosbodega1`.`armado` AS `armado`,`bdclick6`.`bdproductosbodega1`.`costeo` AS `costeo`,`bdclick6`.`ultimoponderado`.`nuevoPonderado` AS `costoUnd`,`bdclick6`.`ultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick6`.`bdproductosbodega1`.`minimo` AS `minimo`,if((cast(`bdclick6`.`bdproductosbodega1`.`fisicoInventario` as signed) <= 0),\'SIN INVENTARIO\',if((cast(`bdclick6`.`bdproductosbodega1`.`fisicoInventario` as signed) < `bdclick6`.`bdproductosbodega1`.`minimo`),\'BAJO\',if((cast(`bdclick6`.`bdproductosbodega1`.`fisicoInventario` as signed) = `bdclick6`.`bdproductosbodega1`.`minimo`),\'MEDIO\',\'ALTO\'))) AS `estado`,`bdclick6`.`bdproductosbodega1`.`L1` AS `L1`,`bdclick6`.`bdproductosbodega1`.`L2` AS `L2`,`bdclick6`.`bdproductosbodega1`.`referencia` AS `referencia`,`bdclick6`.`bdproductosbodega1`.`ubicacion1` AS `ubicacion1`,`bdclick6`.`bdgrupo`.`nombre` AS `grupoDesc`,`bdclick6`.`bdsubgrupo`.`nombre` AS `subGrupoDesc`,`bdclick6`.`bdterceros`.`nombre` AS `proveedorNombre`,`bdclick6`.`bdproductosbodega1`.`Grupo` AS `Grupo`,(cast(`bdclick6`.`ultimoponderado`.`nuevoPonderado` as signed) * cast(`bdclick6`.`bdproductosbodega1`.`inventario` as signed)) AS `costoPTotal`,(cast(`bdclick6`.`ultimoponderado`.`ultimoCosto` as signed) * cast(`bdclick6`.`bdproductosbodega1`.`inventario` as signed)) AS `costoTotal`,`bdclick6`.`bdproductosbodega1`.`ordenServicio` AS `ordenServicio`,`bdclick6`.`bdproductosbodega1`.`manejaInventario` AS `manejaInventario`,`bdclick6`.`bdproductosbodega1`.`Proveedor` AS `Proveedor`,`bdclick6`.`ultimoponderado`.`fecha` AS `fecha`,`bdclick6`.`bdproductosbodega1`.`Codigo` AS `Codigo1`,`bdclick6`.`bdproductosbodega1`.`codigoBarras` AS `codigoBarras`,`bdclick6`.`bdproductosbodega1`.`trasladoInternoEntrada` AS `trasladoInternoEntrada`,`bdclick6`.`bdproductosbodega1`.`trasladoInternoSalida` AS `trasladoInternoSalida`,`bdclick6`.`bdproductosbodega1`.`congelada` AS `congelada`,`bdclick6`.`bdproductosbodega1`.`trasladoBod` AS `trasladoBod`,`bdclick6`.`bdproductosbodega1`.`enTransito` AS `enTransito`,`bdclick6`.`bdproductosbodega1`.`notaDebito` AS `nd` from ((((`bdclick6`.`bdproductosbodega1` left join `bdclick6`.`bdgrupo` on((`bdclick6`.`bdgrupo`.`codigo` = `bdclick6`.`bdproductosbodega1`.`Grupo`))) left join `bdclick6`.`bdsubgrupo` on((`bdclick6`.`bdsubgrupo`.`codigo` = `bdclick6`.`bdproductosbodega1`.`Sub_grupo`))) left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdterceros`.`id` = `bdclick6`.`bdproductosbodega1`.`Proveedor`))) left join `bdclick6`.`ultimoponderado` on((`bdclick6`.`ultimoponderado`.`producto` = `bdclick6`.`bdproductosbodega1`.`idSistema`)))
md5=7c2f7ba7498c968ca02b6ed0637cbb8c
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:35
create-version=2
source=select `bdproductosbodega1`.`idSistema` AS `Codigo`,`bdproductosbodega1`.`Descripcion` AS `Descripcion`,`bdproductosbodega1`.`inventario` AS `inventario`,cast(`bdproductosbodega1`.`inventario` as signed) AS `inv`,`bdproductosbodega1`.`fisicoInventario` AS `fisicoInventario`,`bdproductosbodega1`.`compras` AS `compras`,`bdproductosbodega1`.`ventas` AS `ventas`,`bdproductosbodega1`.`nc` AS `nc`,`bdproductosbodega1`.`ajusteEntrada` AS `ajusteEntrada`,`bdproductosbodega1`.`ajusteSalida` AS `ajusteSalida`,`bdproductosbodega1`.`planSepare` AS `planSepare`,`bdproductosbodega1`.`pedidos` AS `pedidos`,`bdproductosbodega1`.`anulacion` AS `anulacion`,`bdproductosbodega1`.`inventarioInicial` AS `inventarioInicial`,`bdproductosbodega1`.`ajusteInventario` AS `ajusteInventario`,`bdproductosbodega1`.`armado` AS `armado`,`bdproductosbodega1`.`costeo` AS `costeo`,`ultimoponderado`.`nuevoPonderado` AS `costoUnd`,`ultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdproductosbodega1`.`minimo` AS `minimo`,if((cast(`bdproductosbodega1`.`fisicoInventario` as signed) <= 0),\'SIN INVENTARIO\',if((cast(`bdproductosbodega1`.`fisicoInventario` as signed) < `bdproductosbodega1`.`minimo`),\'BAJO\',if((cast(`bdproductosbodega1`.`fisicoInventario` as signed) = `bdproductosbodega1`.`minimo`),\'MEDIO\',\'ALTO\'))) AS `estado`,`bdproductosbodega1`.`L1` AS `L1`,`bdproductosbodega1`.`L2` AS `L2`,`bdproductosbodega1`.`referencia` AS `referencia`,`bdproductosbodega1`.`ubicacion1` AS `ubicacion1`,`bdgrupo`.`nombre` AS `grupoDesc`,`bdsubgrupo`.`nombre` AS `subGrupoDesc`,`bdterceros`.`nombre` AS `proveedorNombre`,`bdproductosbodega1`.`Grupo` AS `Grupo`,(cast(`ultimoponderado`.`nuevoPonderado` as signed) * cast(`bdproductosbodega1`.`inventario` as signed)) AS `costoPTotal`,(cast(`ultimoponderado`.`ultimoCosto` as signed) * cast(`bdproductosbodega1`.`inventario` as signed)) AS `costoTotal`,`bdproductosbodega1`.`ordenServicio` AS `ordenServicio`,`bdproductosbodega1`.`manejaInventario` AS `manejaInventario`,`bdproductosbodega1`.`Proveedor` AS `Proveedor`,`ultimoponderado`.`fecha` AS `fecha`,`bdproductosbodega1`.`Codigo` AS `Codigo1`,`bdproductosbodega1`.`codigoBarras` AS `codigoBarras`,`bdproductosbodega1`.`trasladoInternoEntrada` AS `trasladoInternoEntrada`,`bdproductosbodega1`.`trasladoInternoSalida` AS `trasladoInternoSalida`,`bdproductosbodega1`.`congelada` AS `congelada`,`bdproductosbodega1`.`trasladoBod` AS `trasladoBod`,`bdproductosbodega1`.`enTransito` AS `enTransito`,`bdproductosbodega1`.`notaDebito` AS `nd` from ((((`bdproductosbodega1` left join `bdgrupo` on((`bdgrupo`.`codigo` = `bdproductosbodega1`.`Grupo`))) left join `bdsubgrupo` on((`bdsubgrupo`.`codigo` = `bdproductosbodega1`.`Sub_grupo`))) left join `bdterceros` on((`bdterceros`.`id` = `bdproductosbodega1`.`Proveedor`))) left join `ultimoponderado` on((`ultimoponderado`.`producto` = `bdproductosbodega1`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdproductosbodega1`.`idSistema` AS `Codigo`,`bdclick6`.`bdproductosbodega1`.`Descripcion` AS `Descripcion`,`bdclick6`.`bdproductosbodega1`.`inventario` AS `inventario`,cast(`bdclick6`.`bdproductosbodega1`.`inventario` as signed) AS `inv`,`bdclick6`.`bdproductosbodega1`.`fisicoInventario` AS `fisicoInventario`,`bdclick6`.`bdproductosbodega1`.`compras` AS `compras`,`bdclick6`.`bdproductosbodega1`.`ventas` AS `ventas`,`bdclick6`.`bdproductosbodega1`.`nc` AS `nc`,`bdclick6`.`bdproductosbodega1`.`ajusteEntrada` AS `ajusteEntrada`,`bdclick6`.`bdproductosbodega1`.`ajusteSalida` AS `ajusteSalida`,`bdclick6`.`bdproductosbodega1`.`planSepare` AS `planSepare`,`bdclick6`.`bdproductosbodega1`.`pedidos` AS `pedidos`,`bdclick6`.`bdproductosbodega1`.`anulacion` AS `anulacion`,`bdclick6`.`bdproductosbodega1`.`inventarioInicial` AS `inventarioInicial`,`bdclick6`.`bdproductosbodega1`.`ajusteInventario` AS `ajusteInventario`,`bdclick6`.`bdproductosbodega1`.`armado` AS `armado`,`bdclick6`.`bdproductosbodega1`.`costeo` AS `costeo`,`bdclick6`.`ultimoponderado`.`nuevoPonderado` AS `costoUnd`,`bdclick6`.`ultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick6`.`bdproductosbodega1`.`minimo` AS `minimo`,if((cast(`bdclick6`.`bdproductosbodega1`.`fisicoInventario` as signed) <= 0),\'SIN INVENTARIO\',if((cast(`bdclick6`.`bdproductosbodega1`.`fisicoInventario` as signed) < `bdclick6`.`bdproductosbodega1`.`minimo`),\'BAJO\',if((cast(`bdclick6`.`bdproductosbodega1`.`fisicoInventario` as signed) = `bdclick6`.`bdproductosbodega1`.`minimo`),\'MEDIO\',\'ALTO\'))) AS `estado`,`bdclick6`.`bdproductosbodega1`.`L1` AS `L1`,`bdclick6`.`bdproductosbodega1`.`L2` AS `L2`,`bdclick6`.`bdproductosbodega1`.`referencia` AS `referencia`,`bdclick6`.`bdproductosbodega1`.`ubicacion1` AS `ubicacion1`,`bdclick6`.`bdgrupo`.`nombre` AS `grupoDesc`,`bdclick6`.`bdsubgrupo`.`nombre` AS `subGrupoDesc`,`bdclick6`.`bdterceros`.`nombre` AS `proveedorNombre`,`bdclick6`.`bdproductosbodega1`.`Grupo` AS `Grupo`,(cast(`bdclick6`.`ultimoponderado`.`nuevoPonderado` as signed) * cast(`bdclick6`.`bdproductosbodega1`.`inventario` as signed)) AS `costoPTotal`,(cast(`bdclick6`.`ultimoponderado`.`ultimoCosto` as signed) * cast(`bdclick6`.`bdproductosbodega1`.`inventario` as signed)) AS `costoTotal`,`bdclick6`.`bdproductosbodega1`.`ordenServicio` AS `ordenServicio`,`bdclick6`.`bdproductosbodega1`.`manejaInventario` AS `manejaInventario`,`bdclick6`.`bdproductosbodega1`.`Proveedor` AS `Proveedor`,`bdclick6`.`ultimoponderado`.`fecha` AS `fecha`,`bdclick6`.`bdproductosbodega1`.`Codigo` AS `Codigo1`,`bdclick6`.`bdproductosbodega1`.`codigoBarras` AS `codigoBarras`,`bdclick6`.`bdproductosbodega1`.`trasladoInternoEntrada` AS `trasladoInternoEntrada`,`bdclick6`.`bdproductosbodega1`.`trasladoInternoSalida` AS `trasladoInternoSalida`,`bdclick6`.`bdproductosbodega1`.`congelada` AS `congelada`,`bdclick6`.`bdproductosbodega1`.`trasladoBod` AS `trasladoBod`,`bdclick6`.`bdproductosbodega1`.`enTransito` AS `enTransito`,`bdclick6`.`bdproductosbodega1`.`notaDebito` AS `nd` from ((((`bdclick6`.`bdproductosbodega1` left join `bdclick6`.`bdgrupo` on((`bdclick6`.`bdgrupo`.`codigo` = `bdclick6`.`bdproductosbodega1`.`Grupo`))) left join `bdclick6`.`bdsubgrupo` on((`bdclick6`.`bdsubgrupo`.`codigo` = `bdclick6`.`bdproductosbodega1`.`Sub_grupo`))) left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdterceros`.`id` = `bdclick6`.`bdproductosbodega1`.`Proveedor`))) left join `bdclick6`.`ultimoponderado` on((`bdclick6`.`ultimoponderado`.`producto` = `bdclick6`.`bdproductosbodega1`.`idSistema`)))
mariadb-version=100135