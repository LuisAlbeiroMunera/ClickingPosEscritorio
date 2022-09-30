TYPE=VIEW
query=select `bdclick2`.`bdproductosbodega1`.`idSistema` AS `Codigo`,`bdclick2`.`bdproductosbodega1`.`Descripcion` AS `Descripcion`,`bdclick2`.`bdproductosbodega1`.`inventario` AS `inventario`,cast(`bdclick2`.`bdproductosbodega1`.`inventario` as signed) AS `inv`,`bdclick2`.`bdproductosbodega1`.`fisicoInventario` AS `fisicoInventario`,`bdclick2`.`bdproductosbodega1`.`compras` AS `compras`,`bdclick2`.`bdproductosbodega1`.`ventas` AS `ventas`,`bdclick2`.`bdproductosbodega1`.`nc` AS `nc`,`bdclick2`.`bdproductosbodega1`.`ajusteEntrada` AS `ajusteEntrada`,`bdclick2`.`bdproductosbodega1`.`ajusteSalida` AS `ajusteSalida`,`bdclick2`.`bdproductosbodega1`.`planSepare` AS `planSepare`,`bdclick2`.`bdproductosbodega1`.`pedidos` AS `pedidos`,`bdclick2`.`bdproductosbodega1`.`anulacion` AS `anulacion`,`bdclick2`.`bdproductosbodega1`.`inventarioInicial` AS `inventarioInicial`,`bdclick2`.`bdproductosbodega1`.`ajusteInventario` AS `ajusteInventario`,`bdclick2`.`bdproductosbodega1`.`armado` AS `armado`,`bdclick2`.`bdproductosbodega1`.`costeo` AS `costeo`,`bdclick2`.`ultimoponderado`.`nuevoPonderado` AS `costoUnd`,`bdclick2`.`ultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick2`.`bdproductosbodega1`.`minimo` AS `minimo`,if((cast(`bdclick2`.`bdproductosbodega1`.`fisicoInventario` as signed) <= 0),\'SIN INVENTARIO\',if((cast(`bdclick2`.`bdproductosbodega1`.`fisicoInventario` as signed) < `bdclick2`.`bdproductosbodega1`.`minimo`),\'BAJO\',if((cast(`bdclick2`.`bdproductosbodega1`.`fisicoInventario` as signed) = `bdclick2`.`bdproductosbodega1`.`minimo`),\'MEDIO\',\'ALTO\'))) AS `estado`,`bdclick2`.`bdproductosbodega1`.`L1` AS `L1`,`bdclick2`.`bdproductosbodega1`.`L2` AS `L2`,`bdclick2`.`bdproductosbodega1`.`referencia` AS `referencia`,`bdclick2`.`bdproductosbodega1`.`ubicacion1` AS `ubicacion1`,`bdclick2`.`bdgrupo`.`nombre` AS `grupoDesc`,`bdclick2`.`bdsubgrupo`.`nombre` AS `subGrupoDesc`,`bdclick2`.`bdterceros`.`nombre` AS `proveedorNombre`,`bdclick2`.`bdproductosbodega1`.`Grupo` AS `Grupo`,(cast(`bdclick2`.`ultimoponderado`.`nuevoPonderado` as signed) * cast(`bdclick2`.`bdproductosbodega1`.`inventario` as signed)) AS `costoPTotal`,(cast(`bdclick2`.`ultimoponderado`.`ultimoCosto` as signed) * cast(`bdclick2`.`bdproductosbodega1`.`inventario` as signed)) AS `costoTotal`,`bdclick2`.`bdproductosbodega1`.`ordenServicio` AS `ordenServicio`,`bdclick2`.`bdproductosbodega1`.`manejaInventario` AS `manejaInventario`,`bdclick2`.`bdproductosbodega1`.`Proveedor` AS `Proveedor`,`bdclick2`.`ultimoponderado`.`fecha` AS `fecha`,`bdclick2`.`bdproductosbodega1`.`Codigo` AS `Codigo1`,`bdclick2`.`bdproductosbodega1`.`codigoBarras` AS `codigoBarras`,`bdclick2`.`bdproductosbodega1`.`trasladoInternoEntrada` AS `trasladoInternoEntrada`,`bdclick2`.`bdproductosbodega1`.`trasladoInternoSalida` AS `trasladoInternoSalida`,`bdclick2`.`bdproductosbodega1`.`congelada` AS `congelada`,`bdclick2`.`bdproductosbodega1`.`trasladoBod` AS `trasladoBod`,`bdclick2`.`bdproductosbodega1`.`enTransito` AS `enTransito`,`bdclick2`.`bdproductosbodega1`.`notaDebito` AS `nd` from ((((`bdclick2`.`bdproductosbodega1` left join `bdclick2`.`bdgrupo` on((`bdclick2`.`bdgrupo`.`codigo` = `bdclick2`.`bdproductosbodega1`.`Grupo`))) left join `bdclick2`.`bdsubgrupo` on((`bdclick2`.`bdsubgrupo`.`codigo` = `bdclick2`.`bdproductosbodega1`.`Sub_grupo`))) left join `bdclick2`.`bdterceros` on((`bdclick2`.`bdterceros`.`id` = `bdclick2`.`bdproductosbodega1`.`Proveedor`))) left join `bdclick2`.`ultimoponderado` on((`bdclick2`.`ultimoponderado`.`producto` = `bdclick2`.`bdproductosbodega1`.`idSistema`)))
md5=f136134281b97c34e99a6adc414dea4d
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:45
create-version=2
source=select `bdproductosbodega1`.`idSistema` AS `Codigo`,`bdproductosbodega1`.`Descripcion` AS `Descripcion`,`bdproductosbodega1`.`inventario` AS `inventario`,cast(`bdproductosbodega1`.`inventario` as signed) AS `inv`,`bdproductosbodega1`.`fisicoInventario` AS `fisicoInventario`,`bdproductosbodega1`.`compras` AS `compras`,`bdproductosbodega1`.`ventas` AS `ventas`,`bdproductosbodega1`.`nc` AS `nc`,`bdproductosbodega1`.`ajusteEntrada` AS `ajusteEntrada`,`bdproductosbodega1`.`ajusteSalida` AS `ajusteSalida`,`bdproductosbodega1`.`planSepare` AS `planSepare`,`bdproductosbodega1`.`pedidos` AS `pedidos`,`bdproductosbodega1`.`anulacion` AS `anulacion`,`bdproductosbodega1`.`inventarioInicial` AS `inventarioInicial`,`bdproductosbodega1`.`ajusteInventario` AS `ajusteInventario`,`bdproductosbodega1`.`armado` AS `armado`,`bdproductosbodega1`.`costeo` AS `costeo`,`ultimoponderado`.`nuevoPonderado` AS `costoUnd`,`ultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdproductosbodega1`.`minimo` AS `minimo`,if((cast(`bdproductosbodega1`.`fisicoInventario` as signed) <= 0),\'SIN INVENTARIO\',if((cast(`bdproductosbodega1`.`fisicoInventario` as signed) < `bdproductosbodega1`.`minimo`),\'BAJO\',if((cast(`bdproductosbodega1`.`fisicoInventario` as signed) = `bdproductosbodega1`.`minimo`),\'MEDIO\',\'ALTO\'))) AS `estado`,`bdproductosbodega1`.`L1` AS `L1`,`bdproductosbodega1`.`L2` AS `L2`,`bdproductosbodega1`.`referencia` AS `referencia`,`bdproductosbodega1`.`ubicacion1` AS `ubicacion1`,`bdgrupo`.`nombre` AS `grupoDesc`,`bdsubgrupo`.`nombre` AS `subGrupoDesc`,`bdterceros`.`nombre` AS `proveedorNombre`,`bdproductosbodega1`.`Grupo` AS `Grupo`,(cast(`ultimoponderado`.`nuevoPonderado` as signed) * cast(`bdproductosbodega1`.`inventario` as signed)) AS `costoPTotal`,(cast(`ultimoponderado`.`ultimoCosto` as signed) * cast(`bdproductosbodega1`.`inventario` as signed)) AS `costoTotal`,`bdproductosbodega1`.`ordenServicio` AS `ordenServicio`,`bdproductosbodega1`.`manejaInventario` AS `manejaInventario`,`bdproductosbodega1`.`Proveedor` AS `Proveedor`,`ultimoponderado`.`fecha` AS `fecha`,`bdproductosbodega1`.`Codigo` AS `Codigo1`,`bdproductosbodega1`.`codigoBarras` AS `codigoBarras`,`bdproductosbodega1`.`trasladoInternoEntrada` AS `trasladoInternoEntrada`,`bdproductosbodega1`.`trasladoInternoSalida` AS `trasladoInternoSalida`,`bdproductosbodega1`.`congelada` AS `congelada`,`bdproductosbodega1`.`trasladoBod` AS `trasladoBod`,`bdproductosbodega1`.`enTransito` AS `enTransito`,`bdproductosbodega1`.`notaDebito` AS `nd` from ((((`bdproductosbodega1` left join `bdgrupo` on((`bdgrupo`.`codigo` = `bdproductosbodega1`.`Grupo`))) left join `bdsubgrupo` on((`bdsubgrupo`.`codigo` = `bdproductosbodega1`.`Sub_grupo`))) left join `bdterceros` on((`bdterceros`.`id` = `bdproductosbodega1`.`Proveedor`))) left join `ultimoponderado` on((`ultimoponderado`.`producto` = `bdproductosbodega1`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdproductosbodega1`.`idSistema` AS `Codigo`,`bdclick2`.`bdproductosbodega1`.`Descripcion` AS `Descripcion`,`bdclick2`.`bdproductosbodega1`.`inventario` AS `inventario`,cast(`bdclick2`.`bdproductosbodega1`.`inventario` as signed) AS `inv`,`bdclick2`.`bdproductosbodega1`.`fisicoInventario` AS `fisicoInventario`,`bdclick2`.`bdproductosbodega1`.`compras` AS `compras`,`bdclick2`.`bdproductosbodega1`.`ventas` AS `ventas`,`bdclick2`.`bdproductosbodega1`.`nc` AS `nc`,`bdclick2`.`bdproductosbodega1`.`ajusteEntrada` AS `ajusteEntrada`,`bdclick2`.`bdproductosbodega1`.`ajusteSalida` AS `ajusteSalida`,`bdclick2`.`bdproductosbodega1`.`planSepare` AS `planSepare`,`bdclick2`.`bdproductosbodega1`.`pedidos` AS `pedidos`,`bdclick2`.`bdproductosbodega1`.`anulacion` AS `anulacion`,`bdclick2`.`bdproductosbodega1`.`inventarioInicial` AS `inventarioInicial`,`bdclick2`.`bdproductosbodega1`.`ajusteInventario` AS `ajusteInventario`,`bdclick2`.`bdproductosbodega1`.`armado` AS `armado`,`bdclick2`.`bdproductosbodega1`.`costeo` AS `costeo`,`bdclick2`.`ultimoponderado`.`nuevoPonderado` AS `costoUnd`,`bdclick2`.`ultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick2`.`bdproductosbodega1`.`minimo` AS `minimo`,if((cast(`bdclick2`.`bdproductosbodega1`.`fisicoInventario` as signed) <= 0),\'SIN INVENTARIO\',if((cast(`bdclick2`.`bdproductosbodega1`.`fisicoInventario` as signed) < `bdclick2`.`bdproductosbodega1`.`minimo`),\'BAJO\',if((cast(`bdclick2`.`bdproductosbodega1`.`fisicoInventario` as signed) = `bdclick2`.`bdproductosbodega1`.`minimo`),\'MEDIO\',\'ALTO\'))) AS `estado`,`bdclick2`.`bdproductosbodega1`.`L1` AS `L1`,`bdclick2`.`bdproductosbodega1`.`L2` AS `L2`,`bdclick2`.`bdproductosbodega1`.`referencia` AS `referencia`,`bdclick2`.`bdproductosbodega1`.`ubicacion1` AS `ubicacion1`,`bdclick2`.`bdgrupo`.`nombre` AS `grupoDesc`,`bdclick2`.`bdsubgrupo`.`nombre` AS `subGrupoDesc`,`bdclick2`.`bdterceros`.`nombre` AS `proveedorNombre`,`bdclick2`.`bdproductosbodega1`.`Grupo` AS `Grupo`,(cast(`bdclick2`.`ultimoponderado`.`nuevoPonderado` as signed) * cast(`bdclick2`.`bdproductosbodega1`.`inventario` as signed)) AS `costoPTotal`,(cast(`bdclick2`.`ultimoponderado`.`ultimoCosto` as signed) * cast(`bdclick2`.`bdproductosbodega1`.`inventario` as signed)) AS `costoTotal`,`bdclick2`.`bdproductosbodega1`.`ordenServicio` AS `ordenServicio`,`bdclick2`.`bdproductosbodega1`.`manejaInventario` AS `manejaInventario`,`bdclick2`.`bdproductosbodega1`.`Proveedor` AS `Proveedor`,`bdclick2`.`ultimoponderado`.`fecha` AS `fecha`,`bdclick2`.`bdproductosbodega1`.`Codigo` AS `Codigo1`,`bdclick2`.`bdproductosbodega1`.`codigoBarras` AS `codigoBarras`,`bdclick2`.`bdproductosbodega1`.`trasladoInternoEntrada` AS `trasladoInternoEntrada`,`bdclick2`.`bdproductosbodega1`.`trasladoInternoSalida` AS `trasladoInternoSalida`,`bdclick2`.`bdproductosbodega1`.`congelada` AS `congelada`,`bdclick2`.`bdproductosbodega1`.`trasladoBod` AS `trasladoBod`,`bdclick2`.`bdproductosbodega1`.`enTransito` AS `enTransito`,`bdclick2`.`bdproductosbodega1`.`notaDebito` AS `nd` from ((((`bdclick2`.`bdproductosbodega1` left join `bdclick2`.`bdgrupo` on((`bdclick2`.`bdgrupo`.`codigo` = `bdclick2`.`bdproductosbodega1`.`Grupo`))) left join `bdclick2`.`bdsubgrupo` on((`bdclick2`.`bdsubgrupo`.`codigo` = `bdclick2`.`bdproductosbodega1`.`Sub_grupo`))) left join `bdclick2`.`bdterceros` on((`bdclick2`.`bdterceros`.`id` = `bdclick2`.`bdproductosbodega1`.`Proveedor`))) left join `bdclick2`.`ultimoponderado` on((`bdclick2`.`ultimoponderado`.`producto` = `bdclick2`.`bdproductosbodega1`.`idSistema`)))
mariadb-version=100135
