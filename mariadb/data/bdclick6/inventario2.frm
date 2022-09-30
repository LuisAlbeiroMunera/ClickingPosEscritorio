TYPE=VIEW
query=select `bdclick6`.`bdproductosbodega2`.`idSistema` AS `Codigo`,`bdclick6`.`bdproductosbodega2`.`Descripcion` AS `Descripcion`,`bdclick6`.`bdproductosbodega2`.`inventario` AS `inventario`,cast(`bdclick6`.`bdproductosbodega2`.`inventario` as signed) AS `inv`,`bdclick6`.`bdproductosbodega2`.`fisicoInventario` AS `fisicoInventario`,`bdclick6`.`bdproductosbodega2`.`compras` AS `compras`,`bdclick6`.`bdproductosbodega2`.`ventas` AS `ventas`,`bdclick6`.`bdproductosbodega2`.`nc` AS `nc`,`bdclick6`.`bdproductosbodega2`.`ajusteEntrada` AS `ajusteEntrada`,`bdclick6`.`bdproductosbodega2`.`ajusteSalida` AS `ajusteSalida`,`bdclick6`.`bdproductosbodega2`.`planSepare` AS `planSepare`,`bdclick6`.`bdproductosbodega2`.`pedidos` AS `pedidos`,`bdclick6`.`bdproductosbodega2`.`anulacion` AS `anulacion`,`bdclick6`.`bdproductosbodega2`.`inventarioInicial` AS `inventarioInicial`,`bdclick6`.`bdproductosbodega2`.`ajusteInventario` AS `ajusteInventario`,`bdclick6`.`bdproductosbodega2`.`armado` AS `armado`,`bdclick6`.`bdproductosbodega2`.`costeo` AS `costeo`,`bdclick6`.`ultimoponderado`.`nuevoPonderado` AS `costoUnd`,`bdclick6`.`ultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick6`.`bdproductosbodega2`.`minimo` AS `minimo`,if((cast(`bdclick6`.`bdproductosbodega2`.`fisicoInventario` as signed) <= 0),\'SIN INVENTARIO\',if((cast(`bdclick6`.`bdproductosbodega2`.`fisicoInventario` as signed) < `bdclick6`.`bdproductosbodega2`.`minimo`),\'BAJO\',if((cast(`bdclick6`.`bdproductosbodega2`.`fisicoInventario` as signed) = `bdclick6`.`bdproductosbodega2`.`minimo`),\'MEDIO\',\'ALTO\'))) AS `estado`,`bdclick6`.`bdproductosbodega2`.`L1` AS `L1`,`bdclick6`.`bdproductosbodega2`.`L2` AS `L2`,`bdclick6`.`bdproductosbodega2`.`referencia` AS `referencia`,`bdclick6`.`bdproductosbodega2`.`ubicacion1` AS `ubicacion1`,`bdclick6`.`bdgrupo`.`nombre` AS `grupoDesc`,`bdclick6`.`bdsubgrupo`.`nombre` AS `subGrupoDesc`,`bdclick6`.`bdterceros`.`nombre` AS `proveedorNombre`,`bdclick6`.`bdproductosbodega2`.`grupo` AS `Grupo`,(cast(`bdclick6`.`ultimoponderado`.`nuevoPonderado` as signed) * cast(`bdclick6`.`bdproductosbodega2`.`inventario` as signed)) AS `costoPTotal`,(cast(`bdclick6`.`ultimoponderado`.`ultimoCosto` as signed) * cast(`bdclick6`.`bdproductosbodega2`.`inventario` as signed)) AS `costoTotal`,`bdclick6`.`bdproductosbodega2`.`ordenServicio` AS `ordenServicio`,`bdclick6`.`bdproductosbodega2`.`manejaInventario` AS `manejaInventario`,`bdclick6`.`bdproductosbodega2`.`Proveedor` AS `Proveedor`,`bdclick6`.`ultimoponderado`.`fecha` AS `fecha`,`bdclick6`.`bdproductosbodega2`.`Codigo` AS `Codigo1`,`bdclick6`.`bdproductosbodega2`.`codigoBarras` AS `codigoBarras`,`bdclick6`.`bdproductosbodega2`.`trasladoInternoEntrada` AS `trasladoInternoEntrada`,`bdclick6`.`bdproductosbodega2`.`trasladoInternoSalida` AS `trasladoInternoSalida`,`bdclick6`.`bdproductosbodega2`.`congelada` AS `congelada`,`bdclick6`.`bdproductosbodega2`.`trasladoBod` AS `trasladoBod`,`bdclick6`.`bdproductosbodega2`.`enTransito` AS `enTransito`,`bdclick6`.`bdproductosbodega2`.`notaDebito` AS `nd` from ((((`bdclick6`.`bdproductosbodega2` left join `bdclick6`.`bdgrupo` on((`bdclick6`.`bdgrupo`.`codigo` = `bdclick6`.`bdproductosbodega2`.`grupo`))) left join `bdclick6`.`bdsubgrupo` on((`bdclick6`.`bdsubgrupo`.`codigo` = `bdclick6`.`bdproductosbodega2`.`Sub_grupo`))) left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdterceros`.`id` = `bdclick6`.`bdproductosbodega2`.`Proveedor`))) left join `bdclick6`.`ultimoponderado` on((`bdclick6`.`ultimoponderado`.`producto` = `bdclick6`.`bdproductosbodega2`.`idSistema`)))
md5=0bc0528c885623b94477f776231b219a
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:35
create-version=2
source=select `bdproductosbodega2`.`idSistema` AS `Codigo`,`bdproductosbodega2`.`Descripcion` AS `Descripcion`,`bdproductosbodega2`.`inventario` AS `inventario`,cast(`bdproductosbodega2`.`inventario` as signed) AS `inv`,`bdproductosbodega2`.`fisicoInventario` AS `fisicoInventario`,`bdproductosbodega2`.`compras` AS `compras`,`bdproductosbodega2`.`ventas` AS `ventas`,`bdproductosbodega2`.`nc` AS `nc`,`bdproductosbodega2`.`ajusteEntrada` AS `ajusteEntrada`,`bdproductosbodega2`.`ajusteSalida` AS `ajusteSalida`,`bdproductosbodega2`.`planSepare` AS `planSepare`,`bdproductosbodega2`.`pedidos` AS `pedidos`,`bdproductosbodega2`.`anulacion` AS `anulacion`,`bdproductosbodega2`.`inventarioInicial` AS `inventarioInicial`,`bdproductosbodega2`.`ajusteInventario` AS `ajusteInventario`,`bdproductosbodega2`.`armado` AS `armado`,`bdproductosbodega2`.`costeo` AS `costeo`,`ultimoponderado`.`nuevoPonderado` AS `costoUnd`,`ultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdproductosbodega2`.`minimo` AS `minimo`,if((cast(`bdproductosbodega2`.`fisicoInventario` as signed) <= 0),\'SIN INVENTARIO\',if((cast(`bdproductosbodega2`.`fisicoInventario` as signed) < `bdproductosbodega2`.`minimo`),\'BAJO\',if((cast(`bdproductosbodega2`.`fisicoInventario` as signed) = `bdproductosbodega2`.`minimo`),\'MEDIO\',\'ALTO\'))) AS `estado`,`bdproductosbodega2`.`L1` AS `L1`,`bdproductosbodega2`.`L2` AS `L2`,`bdproductosbodega2`.`referencia` AS `referencia`,`bdproductosbodega2`.`ubicacion1` AS `ubicacion1`,`bdgrupo`.`nombre` AS `grupoDesc`,`bdsubgrupo`.`nombre` AS `subGrupoDesc`,`bdterceros`.`nombre` AS `proveedorNombre`,`bdproductosbodega2`.`grupo` AS `Grupo`,(cast(`ultimoponderado`.`nuevoPonderado` as signed) * cast(`bdproductosbodega2`.`inventario` as signed)) AS `costoPTotal`,(cast(`ultimoponderado`.`ultimoCosto` as signed) * cast(`bdproductosbodega2`.`inventario` as signed)) AS `costoTotal`,`bdproductosbodega2`.`ordenServicio` AS `ordenServicio`,`bdproductosbodega2`.`manejaInventario` AS `manejaInventario`,`bdproductosbodega2`.`Proveedor` AS `Proveedor`,`ultimoponderado`.`fecha` AS `fecha`,`bdproductosbodega2`.`Codigo` AS `Codigo1`,`bdproductosbodega2`.`codigoBarras` AS `codigoBarras`,`bdproductosbodega2`.`trasladoInternoEntrada` AS `trasladoInternoEntrada`,`bdproductosbodega2`.`trasladoInternoSalida` AS `trasladoInternoSalida`,`bdproductosbodega2`.`congelada` AS `congelada`,`bdproductosbodega2`.`trasladoBod` AS `trasladoBod`,`bdproductosbodega2`.`enTransito` AS `enTransito`,`bdproductosbodega2`.`notaDebito` AS `nd` from ((((`bdproductosbodega2` left join `bdgrupo` on((`bdgrupo`.`codigo` = `bdproductosbodega2`.`grupo`))) left join `bdsubgrupo` on((`bdsubgrupo`.`codigo` = `bdproductosbodega2`.`Sub_grupo`))) left join `bdterceros` on((`bdterceros`.`id` = `bdproductosbodega2`.`Proveedor`))) left join `ultimoponderado` on((`ultimoponderado`.`producto` = `bdproductosbodega2`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdproductosbodega2`.`idSistema` AS `Codigo`,`bdclick6`.`bdproductosbodega2`.`Descripcion` AS `Descripcion`,`bdclick6`.`bdproductosbodega2`.`inventario` AS `inventario`,cast(`bdclick6`.`bdproductosbodega2`.`inventario` as signed) AS `inv`,`bdclick6`.`bdproductosbodega2`.`fisicoInventario` AS `fisicoInventario`,`bdclick6`.`bdproductosbodega2`.`compras` AS `compras`,`bdclick6`.`bdproductosbodega2`.`ventas` AS `ventas`,`bdclick6`.`bdproductosbodega2`.`nc` AS `nc`,`bdclick6`.`bdproductosbodega2`.`ajusteEntrada` AS `ajusteEntrada`,`bdclick6`.`bdproductosbodega2`.`ajusteSalida` AS `ajusteSalida`,`bdclick6`.`bdproductosbodega2`.`planSepare` AS `planSepare`,`bdclick6`.`bdproductosbodega2`.`pedidos` AS `pedidos`,`bdclick6`.`bdproductosbodega2`.`anulacion` AS `anulacion`,`bdclick6`.`bdproductosbodega2`.`inventarioInicial` AS `inventarioInicial`,`bdclick6`.`bdproductosbodega2`.`ajusteInventario` AS `ajusteInventario`,`bdclick6`.`bdproductosbodega2`.`armado` AS `armado`,`bdclick6`.`bdproductosbodega2`.`costeo` AS `costeo`,`bdclick6`.`ultimoponderado`.`nuevoPonderado` AS `costoUnd`,`bdclick6`.`ultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick6`.`bdproductosbodega2`.`minimo` AS `minimo`,if((cast(`bdclick6`.`bdproductosbodega2`.`fisicoInventario` as signed) <= 0),\'SIN INVENTARIO\',if((cast(`bdclick6`.`bdproductosbodega2`.`fisicoInventario` as signed) < `bdclick6`.`bdproductosbodega2`.`minimo`),\'BAJO\',if((cast(`bdclick6`.`bdproductosbodega2`.`fisicoInventario` as signed) = `bdclick6`.`bdproductosbodega2`.`minimo`),\'MEDIO\',\'ALTO\'))) AS `estado`,`bdclick6`.`bdproductosbodega2`.`L1` AS `L1`,`bdclick6`.`bdproductosbodega2`.`L2` AS `L2`,`bdclick6`.`bdproductosbodega2`.`referencia` AS `referencia`,`bdclick6`.`bdproductosbodega2`.`ubicacion1` AS `ubicacion1`,`bdclick6`.`bdgrupo`.`nombre` AS `grupoDesc`,`bdclick6`.`bdsubgrupo`.`nombre` AS `subGrupoDesc`,`bdclick6`.`bdterceros`.`nombre` AS `proveedorNombre`,`bdclick6`.`bdproductosbodega2`.`grupo` AS `Grupo`,(cast(`bdclick6`.`ultimoponderado`.`nuevoPonderado` as signed) * cast(`bdclick6`.`bdproductosbodega2`.`inventario` as signed)) AS `costoPTotal`,(cast(`bdclick6`.`ultimoponderado`.`ultimoCosto` as signed) * cast(`bdclick6`.`bdproductosbodega2`.`inventario` as signed)) AS `costoTotal`,`bdclick6`.`bdproductosbodega2`.`ordenServicio` AS `ordenServicio`,`bdclick6`.`bdproductosbodega2`.`manejaInventario` AS `manejaInventario`,`bdclick6`.`bdproductosbodega2`.`Proveedor` AS `Proveedor`,`bdclick6`.`ultimoponderado`.`fecha` AS `fecha`,`bdclick6`.`bdproductosbodega2`.`Codigo` AS `Codigo1`,`bdclick6`.`bdproductosbodega2`.`codigoBarras` AS `codigoBarras`,`bdclick6`.`bdproductosbodega2`.`trasladoInternoEntrada` AS `trasladoInternoEntrada`,`bdclick6`.`bdproductosbodega2`.`trasladoInternoSalida` AS `trasladoInternoSalida`,`bdclick6`.`bdproductosbodega2`.`congelada` AS `congelada`,`bdclick6`.`bdproductosbodega2`.`trasladoBod` AS `trasladoBod`,`bdclick6`.`bdproductosbodega2`.`enTransito` AS `enTransito`,`bdclick6`.`bdproductosbodega2`.`notaDebito` AS `nd` from ((((`bdclick6`.`bdproductosbodega2` left join `bdclick6`.`bdgrupo` on((`bdclick6`.`bdgrupo`.`codigo` = `bdclick6`.`bdproductosbodega2`.`grupo`))) left join `bdclick6`.`bdsubgrupo` on((`bdclick6`.`bdsubgrupo`.`codigo` = `bdclick6`.`bdproductosbodega2`.`Sub_grupo`))) left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdterceros`.`id` = `bdclick6`.`bdproductosbodega2`.`Proveedor`))) left join `bdclick6`.`ultimoponderado` on((`bdclick6`.`ultimoponderado`.`producto` = `bdclick6`.`bdproductosbodega2`.`idSistema`)))
mariadb-version=100135