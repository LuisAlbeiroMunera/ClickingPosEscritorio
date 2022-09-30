TYPE=VIEW
query=(select `bdclick4`.`bdproductos`.`idSistema` AS `Codigo`,`bdclick4`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick4`.`bdproductos`.`inventario` AS `inventario`,cast(`bdclick4`.`bdproductos`.`inventario` as signed) AS `inv`,`bdclick4`.`bdproductos`.`fisicoInventario` AS `fisicoInventario`,`bdclick4`.`bdproductos`.`compras` AS `compras`,`bdclick4`.`bdproductos`.`ventas` AS `ventas`,`bdclick4`.`bdproductos`.`nc` AS `nc`,`bdclick4`.`bdproductos`.`ajusteEntrada` AS `ajusteEntrada`,`bdclick4`.`bdproductos`.`ajusteSalida` AS `ajusteSalida`,`bdclick4`.`bdproductos`.`planSepare` AS `planSepare`,`bdclick4`.`bdproductos`.`pedidos` AS `pedidos`,`bdclick4`.`bdproductos`.`anulacion` AS `anulacion`,`bdclick4`.`bdproductos`.`inventarioInicial` AS `inventarioInicial`,`bdclick4`.`bdproductos`.`ajusteInventario` AS `ajusteInventario`,`bdclick4`.`bdproductos`.`armado` AS `armado`,`bdclick4`.`bdproductos`.`costeo` AS `costeo`,`bdclick4`.`ultimoponderado`.`nuevoPonderado` AS `costoUnd`,`bdclick4`.`ultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick4`.`bdproductos`.`minimo` AS `minimo`,if((cast(`bdclick4`.`bdproductos`.`fisicoInventario` as signed) <= 0),\'SIN INVENTARIO\',if((cast(`bdclick4`.`bdproductos`.`fisicoInventario` as signed) < `bdclick4`.`bdproductos`.`minimo`),\'BAJO\',if((cast(`bdclick4`.`bdproductos`.`fisicoInventario` as signed) = `bdclick4`.`bdproductos`.`minimo`),\'MEDIO\',\'ALTO\'))) AS `estado`,`bdclick4`.`bdproductos`.`L1` AS `L1`,`bdclick4`.`bdproductos`.`L2` AS `L2`,`bdclick4`.`bdproductos`.`referencia` AS `referencia`,`bdclick4`.`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdclick4`.`bdgrupo`.`nombre` AS `grupoDesc`,`bdclick4`.`bdsubgrupo`.`nombre` AS `subGrupoDesc`,`bdclick4`.`bdterceros`.`nombre` AS `proveedorNombre`,`bdclick4`.`bdproductos`.`grupo` AS `Grupo`,(cast(`bdclick4`.`ultimoponderado`.`nuevoPonderado` as signed) * cast(`bdclick4`.`bdproductos`.`inventario` as signed)) AS `costoPTotal`,(cast(`bdclick4`.`ultimoponderado`.`ultimoCosto` as signed) * cast(`bdclick4`.`bdproductos`.`inventario` as signed)) AS `costoTotal`,`bdclick4`.`bdproductos`.`ordenServicio` AS `ordenServicio`,`bdclick4`.`bdproductos`.`manejaInventario` AS `manejaInventario`,`bdclick4`.`bdproductos`.`Proveedor` AS `Proveedor`,`bdclick4`.`ultimoponderado`.`fecha` AS `fecha`,`bdclick4`.`bdproductos`.`Codigo` AS `Codigo1`,`bdclick4`.`bdproductos`.`codigoBarras` AS `codigoBarras`,`bdclick4`.`bdproductos`.`trasladoInternoEntrada` AS `trasladoInternoEntrada`,`bdclick4`.`bdproductos`.`trasladoInternoSalida` AS `trasladoInternoSalida`,`bdclick4`.`bdproductos`.`congelada` AS `congelada`,`bdclick4`.`bdproductos`.`trasladoBod` AS `trasladoBod`,`bdclick4`.`bdproductos`.`enTransito` AS `enTransito`,`bdclick4`.`bdproductos`.`notaDebito` AS `nd` from ((((`bdclick4`.`bdproductos` left join `bdclick4`.`bdgrupo` on((`bdclick4`.`bdgrupo`.`codigo` = `bdclick4`.`bdproductos`.`grupo`))) left join `bdclick4`.`bdsubgrupo` on((`bdclick4`.`bdsubgrupo`.`codigo` = `bdclick4`.`bdproductos`.`Sub_grupo`))) left join `bdclick4`.`bdterceros` on((`bdclick4`.`bdterceros`.`id` = `bdclick4`.`bdproductos`.`Proveedor`))) left join `bdclick4`.`ultimoponderado` on((`bdclick4`.`ultimoponderado`.`producto` = `bdclick4`.`bdproductos`.`idSistema`))))
md5=4de2cbfb5bd2f1993156fefa667590f7
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:28
create-version=2
source=(select `bdproductos`.`idSistema` AS `Codigo`,`bdproductos`.`Descripcion` AS `Descripcion`,`bdproductos`.`inventario` AS `inventario`,cast(`bdproductos`.`inventario` as signed) AS `inv`,`bdproductos`.`fisicoInventario` AS `fisicoInventario`,`bdproductos`.`compras` AS `compras`,`bdproductos`.`ventas` AS `ventas`,`bdproductos`.`nc` AS `nc`,`bdproductos`.`ajusteEntrada` AS `ajusteEntrada`,`bdproductos`.`ajusteSalida` AS `ajusteSalida`,`bdproductos`.`planSepare` AS `planSepare`,`bdproductos`.`pedidos` AS `pedidos`,`bdproductos`.`anulacion` AS `anulacion`,`bdproductos`.`inventarioInicial` AS `inventarioInicial`,`bdproductos`.`ajusteInventario` AS `ajusteInventario`,`bdproductos`.`armado` AS `armado`,`bdproductos`.`costeo` AS `costeo`,`ultimoponderado`.`nuevoPonderado` AS `costoUnd`,`ultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdproductos`.`minimo` AS `minimo`,if((cast(`bdproductos`.`fisicoInventario` as signed) <= 0),\'SIN INVENTARIO\',if((cast(`bdproductos`.`fisicoInventario` as signed) < `bdproductos`.`minimo`),\'BAJO\',if((cast(`bdproductos`.`fisicoInventario` as signed) = `bdproductos`.`minimo`),\'MEDIO\',\'ALTO\'))) AS `estado`,`bdproductos`.`L1` AS `L1`,`bdproductos`.`L2` AS `L2`,`bdproductos`.`referencia` AS `referencia`,`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdgrupo`.`nombre` AS `grupoDesc`,`bdsubgrupo`.`nombre` AS `subGrupoDesc`,`bdterceros`.`nombre` AS `proveedorNombre`,`bdproductos`.`grupo` AS `Grupo`,(cast(`ultimoponderado`.`nuevoPonderado` as signed) * cast(`bdproductos`.`inventario` as signed)) AS `costoPTotal`,(cast(`ultimoponderado`.`ultimoCosto` as signed) * cast(`bdproductos`.`inventario` as signed)) AS `costoTotal`,`bdproductos`.`ordenServicio` AS `ordenServicio`,`bdproductos`.`manejaInventario` AS `manejaInventario`,`bdproductos`.`Proveedor` AS `Proveedor`,`ultimoponderado`.`fecha` AS `fecha`,`bdproductos`.`Codigo` AS `Codigo1`,`bdproductos`.`codigoBarras` AS `codigoBarras`,`bdproductos`.`trasladoInternoEntrada` AS `trasladoInternoEntrada`,`bdproductos`.`trasladoInternoSalida` AS `trasladoInternoSalida`,`bdproductos`.`congelada` AS `congelada`,`bdproductos`.`trasladoBod` AS `trasladoBod`,`bdproductos`.`enTransito` AS `enTransito`,`bdproductos`.`notaDebito` AS `nd` from ((((`bdproductos` left join `bdgrupo` on((`bdgrupo`.`codigo` = `bdproductos`.`grupo`))) left join `bdsubgrupo` on((`bdsubgrupo`.`codigo` = `bdproductos`.`Sub_grupo`))) left join `bdterceros` on((`bdterceros`.`id` = `bdproductos`.`Proveedor`))) left join `ultimoponderado` on((`ultimoponderado`.`producto` = `bdproductos`.`idSistema`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`bdproductos`.`idSistema` AS `Codigo`,`bdclick4`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick4`.`bdproductos`.`inventario` AS `inventario`,cast(`bdclick4`.`bdproductos`.`inventario` as signed) AS `inv`,`bdclick4`.`bdproductos`.`fisicoInventario` AS `fisicoInventario`,`bdclick4`.`bdproductos`.`compras` AS `compras`,`bdclick4`.`bdproductos`.`ventas` AS `ventas`,`bdclick4`.`bdproductos`.`nc` AS `nc`,`bdclick4`.`bdproductos`.`ajusteEntrada` AS `ajusteEntrada`,`bdclick4`.`bdproductos`.`ajusteSalida` AS `ajusteSalida`,`bdclick4`.`bdproductos`.`planSepare` AS `planSepare`,`bdclick4`.`bdproductos`.`pedidos` AS `pedidos`,`bdclick4`.`bdproductos`.`anulacion` AS `anulacion`,`bdclick4`.`bdproductos`.`inventarioInicial` AS `inventarioInicial`,`bdclick4`.`bdproductos`.`ajusteInventario` AS `ajusteInventario`,`bdclick4`.`bdproductos`.`armado` AS `armado`,`bdclick4`.`bdproductos`.`costeo` AS `costeo`,`bdclick4`.`ultimoponderado`.`nuevoPonderado` AS `costoUnd`,`bdclick4`.`ultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick4`.`bdproductos`.`minimo` AS `minimo`,if((cast(`bdclick4`.`bdproductos`.`fisicoInventario` as signed) <= 0),\'SIN INVENTARIO\',if((cast(`bdclick4`.`bdproductos`.`fisicoInventario` as signed) < `bdclick4`.`bdproductos`.`minimo`),\'BAJO\',if((cast(`bdclick4`.`bdproductos`.`fisicoInventario` as signed) = `bdclick4`.`bdproductos`.`minimo`),\'MEDIO\',\'ALTO\'))) AS `estado`,`bdclick4`.`bdproductos`.`L1` AS `L1`,`bdclick4`.`bdproductos`.`L2` AS `L2`,`bdclick4`.`bdproductos`.`referencia` AS `referencia`,`bdclick4`.`bdproductos`.`ubicacion1` AS `ubicacion1`,`bdclick4`.`bdgrupo`.`nombre` AS `grupoDesc`,`bdclick4`.`bdsubgrupo`.`nombre` AS `subGrupoDesc`,`bdclick4`.`bdterceros`.`nombre` AS `proveedorNombre`,`bdclick4`.`bdproductos`.`grupo` AS `Grupo`,(cast(`bdclick4`.`ultimoponderado`.`nuevoPonderado` as signed) * cast(`bdclick4`.`bdproductos`.`inventario` as signed)) AS `costoPTotal`,(cast(`bdclick4`.`ultimoponderado`.`ultimoCosto` as signed) * cast(`bdclick4`.`bdproductos`.`inventario` as signed)) AS `costoTotal`,`bdclick4`.`bdproductos`.`ordenServicio` AS `ordenServicio`,`bdclick4`.`bdproductos`.`manejaInventario` AS `manejaInventario`,`bdclick4`.`bdproductos`.`Proveedor` AS `Proveedor`,`bdclick4`.`ultimoponderado`.`fecha` AS `fecha`,`bdclick4`.`bdproductos`.`Codigo` AS `Codigo1`,`bdclick4`.`bdproductos`.`codigoBarras` AS `codigoBarras`,`bdclick4`.`bdproductos`.`trasladoInternoEntrada` AS `trasladoInternoEntrada`,`bdclick4`.`bdproductos`.`trasladoInternoSalida` AS `trasladoInternoSalida`,`bdclick4`.`bdproductos`.`congelada` AS `congelada`,`bdclick4`.`bdproductos`.`trasladoBod` AS `trasladoBod`,`bdclick4`.`bdproductos`.`enTransito` AS `enTransito`,`bdclick4`.`bdproductos`.`notaDebito` AS `nd` from ((((`bdclick4`.`bdproductos` left join `bdclick4`.`bdgrupo` on((`bdclick4`.`bdgrupo`.`codigo` = `bdclick4`.`bdproductos`.`grupo`))) left join `bdclick4`.`bdsubgrupo` on((`bdclick4`.`bdsubgrupo`.`codigo` = `bdclick4`.`bdproductos`.`Sub_grupo`))) left join `bdclick4`.`bdterceros` on((`bdclick4`.`bdterceros`.`id` = `bdclick4`.`bdproductos`.`Proveedor`))) left join `bdclick4`.`ultimoponderado` on((`bdclick4`.`ultimoponderado`.`producto` = `bdclick4`.`bdproductos`.`idSistema`))))
mariadb-version=100135
