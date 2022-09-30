TYPE=VIEW
query=select `bdclick5`.`bdproductosbodega2`.`idSistema` AS `Codigo`,`bdclick5`.`bdproductosbodega2`.`Descripcion` AS `Descripcion`,`bdclick5`.`bdproductosbodega2`.`inventario` AS `inventario`,cast(`bdclick5`.`bdproductosbodega2`.`inventario` as signed) AS `inv`,`bdclick5`.`bdproductosbodega2`.`fisicoInventario` AS `fisicoInventario`,`bdclick5`.`bdproductosbodega2`.`compras` AS `compras`,`bdclick5`.`bdproductosbodega2`.`ventas` AS `ventas`,`bdclick5`.`bdproductosbodega2`.`nc` AS `nc`,`bdclick5`.`bdproductosbodega2`.`ajusteEntrada` AS `ajusteEntrada`,`bdclick5`.`bdproductosbodega2`.`ajusteSalida` AS `ajusteSalida`,`bdclick5`.`bdproductosbodega2`.`planSepare` AS `planSepare`,`bdclick5`.`bdproductosbodega2`.`pedidos` AS `pedidos`,`bdclick5`.`bdproductosbodega2`.`anulacion` AS `anulacion`,`bdclick5`.`bdproductosbodega2`.`inventarioInicial` AS `inventarioInicial`,`bdclick5`.`bdproductosbodega2`.`ajusteInventario` AS `ajusteInventario`,`bdclick5`.`bdproductosbodega2`.`armado` AS `armado`,`bdclick5`.`bdproductosbodega2`.`costeo` AS `costeo`,`bdclick5`.`ultimoponderado`.`nuevoPonderado` AS `costoUnd`,`bdclick5`.`ultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick5`.`bdproductosbodega2`.`minimo` AS `minimo`,if((cast(`bdclick5`.`bdproductosbodega2`.`fisicoInventario` as signed) <= 0),\'SIN INVENTARIO\',if((cast(`bdclick5`.`bdproductosbodega2`.`fisicoInventario` as signed) < `bdclick5`.`bdproductosbodega2`.`minimo`),\'BAJO\',if((cast(`bdclick5`.`bdproductosbodega2`.`fisicoInventario` as signed) = `bdclick5`.`bdproductosbodega2`.`minimo`),\'MEDIO\',\'ALTO\'))) AS `estado`,`bdclick5`.`bdproductosbodega2`.`L1` AS `L1`,`bdclick5`.`bdproductosbodega2`.`L2` AS `L2`,`bdclick5`.`bdproductosbodega2`.`referencia` AS `referencia`,`bdclick5`.`bdproductosbodega2`.`ubicacion1` AS `ubicacion1`,`bdclick5`.`bdgrupo`.`nombre` AS `grupoDesc`,`bdclick5`.`bdsubgrupo`.`nombre` AS `subGrupoDesc`,`bdclick5`.`bdterceros`.`nombre` AS `proveedorNombre`,`bdclick5`.`bdproductosbodega2`.`grupo` AS `Grupo`,(cast(`bdclick5`.`ultimoponderado`.`nuevoPonderado` as signed) * cast(`bdclick5`.`bdproductosbodega2`.`inventario` as signed)) AS `costoPTotal`,(cast(`bdclick5`.`ultimoponderado`.`ultimoCosto` as signed) * cast(`bdclick5`.`bdproductosbodega2`.`inventario` as signed)) AS `costoTotal`,`bdclick5`.`bdproductosbodega2`.`ordenServicio` AS `ordenServicio`,`bdclick5`.`bdproductosbodega2`.`manejaInventario` AS `manejaInventario`,`bdclick5`.`bdproductosbodega2`.`Proveedor` AS `Proveedor`,`bdclick5`.`ultimoponderado`.`fecha` AS `fecha`,`bdclick5`.`bdproductosbodega2`.`Codigo` AS `Codigo1`,`bdclick5`.`bdproductosbodega2`.`codigoBarras` AS `codigoBarras`,`bdclick5`.`bdproductosbodega2`.`trasladoInternoEntrada` AS `trasladoInternoEntrada`,`bdclick5`.`bdproductosbodega2`.`trasladoInternoSalida` AS `trasladoInternoSalida`,`bdclick5`.`bdproductosbodega2`.`congelada` AS `congelada`,`bdclick5`.`bdproductosbodega2`.`trasladoBod` AS `trasladoBod`,`bdclick5`.`bdproductosbodega2`.`enTransito` AS `enTransito`,`bdclick5`.`bdproductosbodega2`.`notaDebito` AS `nd` from ((((`bdclick5`.`bdproductosbodega2` left join `bdclick5`.`bdgrupo` on((`bdclick5`.`bdgrupo`.`codigo` = `bdclick5`.`bdproductosbodega2`.`grupo`))) left join `bdclick5`.`bdsubgrupo` on((`bdclick5`.`bdsubgrupo`.`codigo` = `bdclick5`.`bdproductosbodega2`.`Sub_grupo`))) left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdterceros`.`id` = `bdclick5`.`bdproductosbodega2`.`Proveedor`))) left join `bdclick5`.`ultimoponderado` on((`bdclick5`.`ultimoponderado`.`producto` = `bdclick5`.`bdproductosbodega2`.`idSistema`)))
md5=3f5fc2a1f393476ab3610a33f90fd153
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:47
create-version=2
source=select `bdproductosbodega2`.`idSistema` AS `Codigo`,`bdproductosbodega2`.`Descripcion` AS `Descripcion`,`bdproductosbodega2`.`inventario` AS `inventario`,cast(`bdproductosbodega2`.`inventario` as signed) AS `inv`,`bdproductosbodega2`.`fisicoInventario` AS `fisicoInventario`,`bdproductosbodega2`.`compras` AS `compras`,`bdproductosbodega2`.`ventas` AS `ventas`,`bdproductosbodega2`.`nc` AS `nc`,`bdproductosbodega2`.`ajusteEntrada` AS `ajusteEntrada`,`bdproductosbodega2`.`ajusteSalida` AS `ajusteSalida`,`bdproductosbodega2`.`planSepare` AS `planSepare`,`bdproductosbodega2`.`pedidos` AS `pedidos`,`bdproductosbodega2`.`anulacion` AS `anulacion`,`bdproductosbodega2`.`inventarioInicial` AS `inventarioInicial`,`bdproductosbodega2`.`ajusteInventario` AS `ajusteInventario`,`bdproductosbodega2`.`armado` AS `armado`,`bdproductosbodega2`.`costeo` AS `costeo`,`ultimoponderado`.`nuevoPonderado` AS `costoUnd`,`ultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdproductosbodega2`.`minimo` AS `minimo`,if((cast(`bdproductosbodega2`.`fisicoInventario` as signed) <= 0),\'SIN INVENTARIO\',if((cast(`bdproductosbodega2`.`fisicoInventario` as signed) < `bdproductosbodega2`.`minimo`),\'BAJO\',if((cast(`bdproductosbodega2`.`fisicoInventario` as signed) = `bdproductosbodega2`.`minimo`),\'MEDIO\',\'ALTO\'))) AS `estado`,`bdproductosbodega2`.`L1` AS `L1`,`bdproductosbodega2`.`L2` AS `L2`,`bdproductosbodega2`.`referencia` AS `referencia`,`bdproductosbodega2`.`ubicacion1` AS `ubicacion1`,`bdgrupo`.`nombre` AS `grupoDesc`,`bdsubgrupo`.`nombre` AS `subGrupoDesc`,`bdterceros`.`nombre` AS `proveedorNombre`,`bdproductosbodega2`.`grupo` AS `Grupo`,(cast(`ultimoponderado`.`nuevoPonderado` as signed) * cast(`bdproductosbodega2`.`inventario` as signed)) AS `costoPTotal`,(cast(`ultimoponderado`.`ultimoCosto` as signed) * cast(`bdproductosbodega2`.`inventario` as signed)) AS `costoTotal`,`bdproductosbodega2`.`ordenServicio` AS `ordenServicio`,`bdproductosbodega2`.`manejaInventario` AS `manejaInventario`,`bdproductosbodega2`.`Proveedor` AS `Proveedor`,`ultimoponderado`.`fecha` AS `fecha`,`bdproductosbodega2`.`Codigo` AS `Codigo1`,`bdproductosbodega2`.`codigoBarras` AS `codigoBarras`,`bdproductosbodega2`.`trasladoInternoEntrada` AS `trasladoInternoEntrada`,`bdproductosbodega2`.`trasladoInternoSalida` AS `trasladoInternoSalida`,`bdproductosbodega2`.`congelada` AS `congelada`,`bdproductosbodega2`.`trasladoBod` AS `trasladoBod`,`bdproductosbodega2`.`enTransito` AS `enTransito`,`bdproductosbodega2`.`notaDebito` AS `nd` from ((((`bdproductosbodega2` left join `bdgrupo` on((`bdgrupo`.`codigo` = `bdproductosbodega2`.`grupo`))) left join `bdsubgrupo` on((`bdsubgrupo`.`codigo` = `bdproductosbodega2`.`Sub_grupo`))) left join `bdterceros` on((`bdterceros`.`id` = `bdproductosbodega2`.`Proveedor`))) left join `ultimoponderado` on((`ultimoponderado`.`producto` = `bdproductosbodega2`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdproductosbodega2`.`idSistema` AS `Codigo`,`bdclick5`.`bdproductosbodega2`.`Descripcion` AS `Descripcion`,`bdclick5`.`bdproductosbodega2`.`inventario` AS `inventario`,cast(`bdclick5`.`bdproductosbodega2`.`inventario` as signed) AS `inv`,`bdclick5`.`bdproductosbodega2`.`fisicoInventario` AS `fisicoInventario`,`bdclick5`.`bdproductosbodega2`.`compras` AS `compras`,`bdclick5`.`bdproductosbodega2`.`ventas` AS `ventas`,`bdclick5`.`bdproductosbodega2`.`nc` AS `nc`,`bdclick5`.`bdproductosbodega2`.`ajusteEntrada` AS `ajusteEntrada`,`bdclick5`.`bdproductosbodega2`.`ajusteSalida` AS `ajusteSalida`,`bdclick5`.`bdproductosbodega2`.`planSepare` AS `planSepare`,`bdclick5`.`bdproductosbodega2`.`pedidos` AS `pedidos`,`bdclick5`.`bdproductosbodega2`.`anulacion` AS `anulacion`,`bdclick5`.`bdproductosbodega2`.`inventarioInicial` AS `inventarioInicial`,`bdclick5`.`bdproductosbodega2`.`ajusteInventario` AS `ajusteInventario`,`bdclick5`.`bdproductosbodega2`.`armado` AS `armado`,`bdclick5`.`bdproductosbodega2`.`costeo` AS `costeo`,`bdclick5`.`ultimoponderado`.`nuevoPonderado` AS `costoUnd`,`bdclick5`.`ultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick5`.`bdproductosbodega2`.`minimo` AS `minimo`,if((cast(`bdclick5`.`bdproductosbodega2`.`fisicoInventario` as signed) <= 0),\'SIN INVENTARIO\',if((cast(`bdclick5`.`bdproductosbodega2`.`fisicoInventario` as signed) < `bdclick5`.`bdproductosbodega2`.`minimo`),\'BAJO\',if((cast(`bdclick5`.`bdproductosbodega2`.`fisicoInventario` as signed) = `bdclick5`.`bdproductosbodega2`.`minimo`),\'MEDIO\',\'ALTO\'))) AS `estado`,`bdclick5`.`bdproductosbodega2`.`L1` AS `L1`,`bdclick5`.`bdproductosbodega2`.`L2` AS `L2`,`bdclick5`.`bdproductosbodega2`.`referencia` AS `referencia`,`bdclick5`.`bdproductosbodega2`.`ubicacion1` AS `ubicacion1`,`bdclick5`.`bdgrupo`.`nombre` AS `grupoDesc`,`bdclick5`.`bdsubgrupo`.`nombre` AS `subGrupoDesc`,`bdclick5`.`bdterceros`.`nombre` AS `proveedorNombre`,`bdclick5`.`bdproductosbodega2`.`grupo` AS `Grupo`,(cast(`bdclick5`.`ultimoponderado`.`nuevoPonderado` as signed) * cast(`bdclick5`.`bdproductosbodega2`.`inventario` as signed)) AS `costoPTotal`,(cast(`bdclick5`.`ultimoponderado`.`ultimoCosto` as signed) * cast(`bdclick5`.`bdproductosbodega2`.`inventario` as signed)) AS `costoTotal`,`bdclick5`.`bdproductosbodega2`.`ordenServicio` AS `ordenServicio`,`bdclick5`.`bdproductosbodega2`.`manejaInventario` AS `manejaInventario`,`bdclick5`.`bdproductosbodega2`.`Proveedor` AS `Proveedor`,`bdclick5`.`ultimoponderado`.`fecha` AS `fecha`,`bdclick5`.`bdproductosbodega2`.`Codigo` AS `Codigo1`,`bdclick5`.`bdproductosbodega2`.`codigoBarras` AS `codigoBarras`,`bdclick5`.`bdproductosbodega2`.`trasladoInternoEntrada` AS `trasladoInternoEntrada`,`bdclick5`.`bdproductosbodega2`.`trasladoInternoSalida` AS `trasladoInternoSalida`,`bdclick5`.`bdproductosbodega2`.`congelada` AS `congelada`,`bdclick5`.`bdproductosbodega2`.`trasladoBod` AS `trasladoBod`,`bdclick5`.`bdproductosbodega2`.`enTransito` AS `enTransito`,`bdclick5`.`bdproductosbodega2`.`notaDebito` AS `nd` from ((((`bdclick5`.`bdproductosbodega2` left join `bdclick5`.`bdgrupo` on((`bdclick5`.`bdgrupo`.`codigo` = `bdclick5`.`bdproductosbodega2`.`grupo`))) left join `bdclick5`.`bdsubgrupo` on((`bdclick5`.`bdsubgrupo`.`codigo` = `bdclick5`.`bdproductosbodega2`.`Sub_grupo`))) left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdterceros`.`id` = `bdclick5`.`bdproductosbodega2`.`Proveedor`))) left join `bdclick5`.`ultimoponderado` on((`bdclick5`.`ultimoponderado`.`producto` = `bdclick5`.`bdproductosbodega2`.`idSistema`)))
mariadb-version=100135
