TYPE=VIEW
query=select `bdclick5`.`bdproductosbodega4`.`idSistema` AS `Codigo`,`bdclick5`.`bdproductosbodega4`.`Descripcion` AS `Descripcion`,`bdclick5`.`bdproductosbodega4`.`inventario` AS `inventario`,cast(`bdclick5`.`bdproductosbodega4`.`inventario` as signed) AS `inv`,`bdclick5`.`bdproductosbodega4`.`fisicoInventario` AS `fisicoInventario`,`bdclick5`.`bdproductosbodega4`.`compras` AS `compras`,`bdclick5`.`bdproductosbodega4`.`ventas` AS `ventas`,`bdclick5`.`bdproductosbodega4`.`nc` AS `nc`,`bdclick5`.`bdproductosbodega4`.`ajusteEntrada` AS `ajusteEntrada`,`bdclick5`.`bdproductosbodega4`.`ajusteSalida` AS `ajusteSalida`,`bdclick5`.`bdproductosbodega4`.`planSepare` AS `planSepare`,`bdclick5`.`bdproductosbodega4`.`pedidos` AS `pedidos`,`bdclick5`.`bdproductosbodega4`.`anulacion` AS `anulacion`,`bdclick5`.`bdproductosbodega4`.`inventarioInicial` AS `inventarioInicial`,`bdclick5`.`bdproductosbodega4`.`ajusteInventario` AS `ajusteInventario`,`bdclick5`.`bdproductosbodega4`.`armado` AS `armado`,`bdclick5`.`bdproductosbodega4`.`costeo` AS `costeo`,`bdclick5`.`ultimoponderado`.`nuevoPonderado` AS `costoUnd`,`bdclick5`.`ultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick5`.`bdproductosbodega4`.`minimo` AS `minimo`,if((cast(`bdclick5`.`bdproductosbodega4`.`fisicoInventario` as signed) <= 0),\'SIN INVENTARIO\',if((cast(`bdclick5`.`bdproductosbodega4`.`fisicoInventario` as signed) < `bdclick5`.`bdproductosbodega4`.`minimo`),\'BAJO\',if((cast(`bdclick5`.`bdproductosbodega4`.`fisicoInventario` as signed) = `bdclick5`.`bdproductosbodega4`.`minimo`),\'MEDIO\',\'ALTO\'))) AS `estado`,`bdclick5`.`bdproductosbodega4`.`L1` AS `L1`,`bdclick5`.`bdproductosbodega4`.`L2` AS `L2`,`bdclick5`.`bdproductosbodega4`.`referencia` AS `referencia`,`bdclick5`.`bdproductosbodega4`.`ubicacion1` AS `ubicacion1`,`bdclick5`.`bdgrupo`.`nombre` AS `grupoDesc`,`bdclick5`.`bdsubgrupo`.`nombre` AS `subGrupoDesc`,`bdclick5`.`bdterceros`.`nombre` AS `proveedorNombre`,`bdclick5`.`bdproductosbodega4`.`Grupo` AS `Grupo`,(cast(`bdclick5`.`ultimoponderado`.`nuevoPonderado` as signed) * cast(`bdclick5`.`bdproductosbodega4`.`inventario` as signed)) AS `costoPTotal`,(cast(`bdclick5`.`ultimoponderado`.`ultimoCosto` as signed) * cast(`bdclick5`.`bdproductosbodega4`.`inventario` as signed)) AS `costoTotal`,`bdclick5`.`bdproductosbodega4`.`ordenServicio` AS `ordenServicio`,`bdclick5`.`bdproductosbodega4`.`manejaInventario` AS `manejaInventario`,`bdclick5`.`bdproductosbodega4`.`Proveedor` AS `Proveedor`,`bdclick5`.`ultimoponderado`.`fecha` AS `fecha`,`bdclick5`.`bdproductosbodega4`.`Codigo` AS `Codigo1`,`bdclick5`.`bdproductosbodega4`.`codigoBarras` AS `codigoBarras`,`bdclick5`.`bdproductosbodega4`.`trasladoInternoEntrada` AS `trasladoInternoEntrada`,`bdclick5`.`bdproductosbodega4`.`trasladoInternoSalida` AS `trasladoInternoSalida`,`bdclick5`.`bdproductosbodega4`.`congelada` AS `congelada`,`bdclick5`.`bdproductosbodega4`.`trasladoBod` AS `trasladoBod`,`bdclick5`.`bdproductosbodega4`.`enTransito` AS `enTransito`,`bdclick5`.`bdproductosbodega4`.`notaDebito` AS `nd` from ((((`bdclick5`.`bdproductosbodega4` left join `bdclick5`.`bdgrupo` on((`bdclick5`.`bdgrupo`.`codigo` = `bdclick5`.`bdproductosbodega4`.`Grupo`))) left join `bdclick5`.`bdsubgrupo` on((`bdclick5`.`bdsubgrupo`.`codigo` = `bdclick5`.`bdproductosbodega4`.`Sub_grupo`))) left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdterceros`.`id` = `bdclick5`.`bdproductosbodega4`.`Proveedor`))) left join `bdclick5`.`ultimoponderado` on((`bdclick5`.`ultimoponderado`.`producto` = `bdclick5`.`bdproductosbodega4`.`idSistema`)))
md5=dbd08f10745f41f90bdae04799739d20
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:47
create-version=2
source=select `bdproductosbodega4`.`idSistema` AS `Codigo`,`bdproductosbodega4`.`Descripcion` AS `Descripcion`,`bdproductosbodega4`.`inventario` AS `inventario`,cast(`bdproductosbodega4`.`inventario` as signed) AS `inv`,`bdproductosbodega4`.`fisicoInventario` AS `fisicoInventario`,`bdproductosbodega4`.`compras` AS `compras`,`bdproductosbodega4`.`ventas` AS `ventas`,`bdproductosbodega4`.`nc` AS `nc`,`bdproductosbodega4`.`ajusteEntrada` AS `ajusteEntrada`,`bdproductosbodega4`.`ajusteSalida` AS `ajusteSalida`,`bdproductosbodega4`.`planSepare` AS `planSepare`,`bdproductosbodega4`.`pedidos` AS `pedidos`,`bdproductosbodega4`.`anulacion` AS `anulacion`,`bdproductosbodega4`.`inventarioInicial` AS `inventarioInicial`,`bdproductosbodega4`.`ajusteInventario` AS `ajusteInventario`,`bdproductosbodega4`.`armado` AS `armado`,`bdproductosbodega4`.`costeo` AS `costeo`,`ultimoponderado`.`nuevoPonderado` AS `costoUnd`,`ultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdproductosbodega4`.`minimo` AS `minimo`,if((cast(`bdproductosbodega4`.`fisicoInventario` as signed) <= 0),\'SIN INVENTARIO\',if((cast(`bdproductosbodega4`.`fisicoInventario` as signed) < `bdproductosbodega4`.`minimo`),\'BAJO\',if((cast(`bdproductosbodega4`.`fisicoInventario` as signed) = `bdproductosbodega4`.`minimo`),\'MEDIO\',\'ALTO\'))) AS `estado`,`bdproductosbodega4`.`L1` AS `L1`,`bdproductosbodega4`.`L2` AS `L2`,`bdproductosbodega4`.`referencia` AS `referencia`,`bdproductosbodega4`.`ubicacion1` AS `ubicacion1`,`bdgrupo`.`nombre` AS `grupoDesc`,`bdsubgrupo`.`nombre` AS `subGrupoDesc`,`bdterceros`.`nombre` AS `proveedorNombre`,`bdproductosbodega4`.`Grupo` AS `Grupo`,(cast(`ultimoponderado`.`nuevoPonderado` as signed) * cast(`bdproductosbodega4`.`inventario` as signed)) AS `costoPTotal`,(cast(`ultimoponderado`.`ultimoCosto` as signed) * cast(`bdproductosbodega4`.`inventario` as signed)) AS `costoTotal`,`bdproductosbodega4`.`ordenServicio` AS `ordenServicio`,`bdproductosbodega4`.`manejaInventario` AS `manejaInventario`,`bdproductosbodega4`.`Proveedor` AS `Proveedor`,`ultimoponderado`.`fecha` AS `fecha`,`bdproductosbodega4`.`Codigo` AS `Codigo1`,`bdproductosbodega4`.`codigoBarras` AS `codigoBarras`,`bdproductosbodega4`.`trasladoInternoEntrada` AS `trasladoInternoEntrada`,`bdproductosbodega4`.`trasladoInternoSalida` AS `trasladoInternoSalida`,`bdproductosbodega4`.`congelada` AS `congelada`,`bdproductosbodega4`.`trasladoBod` AS `trasladoBod`,`bdproductosbodega4`.`enTransito` AS `enTransito`,`bdproductosbodega4`.`notaDebito` AS `nd` from ((((`bdproductosbodega4` left join `bdgrupo` on((`bdgrupo`.`codigo` = `bdproductosbodega4`.`Grupo`))) left join `bdsubgrupo` on((`bdsubgrupo`.`codigo` = `bdproductosbodega4`.`Sub_grupo`))) left join `bdterceros` on((`bdterceros`.`id` = `bdproductosbodega4`.`Proveedor`))) left join `ultimoponderado` on((`ultimoponderado`.`producto` = `bdproductosbodega4`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdproductosbodega4`.`idSistema` AS `Codigo`,`bdclick5`.`bdproductosbodega4`.`Descripcion` AS `Descripcion`,`bdclick5`.`bdproductosbodega4`.`inventario` AS `inventario`,cast(`bdclick5`.`bdproductosbodega4`.`inventario` as signed) AS `inv`,`bdclick5`.`bdproductosbodega4`.`fisicoInventario` AS `fisicoInventario`,`bdclick5`.`bdproductosbodega4`.`compras` AS `compras`,`bdclick5`.`bdproductosbodega4`.`ventas` AS `ventas`,`bdclick5`.`bdproductosbodega4`.`nc` AS `nc`,`bdclick5`.`bdproductosbodega4`.`ajusteEntrada` AS `ajusteEntrada`,`bdclick5`.`bdproductosbodega4`.`ajusteSalida` AS `ajusteSalida`,`bdclick5`.`bdproductosbodega4`.`planSepare` AS `planSepare`,`bdclick5`.`bdproductosbodega4`.`pedidos` AS `pedidos`,`bdclick5`.`bdproductosbodega4`.`anulacion` AS `anulacion`,`bdclick5`.`bdproductosbodega4`.`inventarioInicial` AS `inventarioInicial`,`bdclick5`.`bdproductosbodega4`.`ajusteInventario` AS `ajusteInventario`,`bdclick5`.`bdproductosbodega4`.`armado` AS `armado`,`bdclick5`.`bdproductosbodega4`.`costeo` AS `costeo`,`bdclick5`.`ultimoponderado`.`nuevoPonderado` AS `costoUnd`,`bdclick5`.`ultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick5`.`bdproductosbodega4`.`minimo` AS `minimo`,if((cast(`bdclick5`.`bdproductosbodega4`.`fisicoInventario` as signed) <= 0),\'SIN INVENTARIO\',if((cast(`bdclick5`.`bdproductosbodega4`.`fisicoInventario` as signed) < `bdclick5`.`bdproductosbodega4`.`minimo`),\'BAJO\',if((cast(`bdclick5`.`bdproductosbodega4`.`fisicoInventario` as signed) = `bdclick5`.`bdproductosbodega4`.`minimo`),\'MEDIO\',\'ALTO\'))) AS `estado`,`bdclick5`.`bdproductosbodega4`.`L1` AS `L1`,`bdclick5`.`bdproductosbodega4`.`L2` AS `L2`,`bdclick5`.`bdproductosbodega4`.`referencia` AS `referencia`,`bdclick5`.`bdproductosbodega4`.`ubicacion1` AS `ubicacion1`,`bdclick5`.`bdgrupo`.`nombre` AS `grupoDesc`,`bdclick5`.`bdsubgrupo`.`nombre` AS `subGrupoDesc`,`bdclick5`.`bdterceros`.`nombre` AS `proveedorNombre`,`bdclick5`.`bdproductosbodega4`.`Grupo` AS `Grupo`,(cast(`bdclick5`.`ultimoponderado`.`nuevoPonderado` as signed) * cast(`bdclick5`.`bdproductosbodega4`.`inventario` as signed)) AS `costoPTotal`,(cast(`bdclick5`.`ultimoponderado`.`ultimoCosto` as signed) * cast(`bdclick5`.`bdproductosbodega4`.`inventario` as signed)) AS `costoTotal`,`bdclick5`.`bdproductosbodega4`.`ordenServicio` AS `ordenServicio`,`bdclick5`.`bdproductosbodega4`.`manejaInventario` AS `manejaInventario`,`bdclick5`.`bdproductosbodega4`.`Proveedor` AS `Proveedor`,`bdclick5`.`ultimoponderado`.`fecha` AS `fecha`,`bdclick5`.`bdproductosbodega4`.`Codigo` AS `Codigo1`,`bdclick5`.`bdproductosbodega4`.`codigoBarras` AS `codigoBarras`,`bdclick5`.`bdproductosbodega4`.`trasladoInternoEntrada` AS `trasladoInternoEntrada`,`bdclick5`.`bdproductosbodega4`.`trasladoInternoSalida` AS `trasladoInternoSalida`,`bdclick5`.`bdproductosbodega4`.`congelada` AS `congelada`,`bdclick5`.`bdproductosbodega4`.`trasladoBod` AS `trasladoBod`,`bdclick5`.`bdproductosbodega4`.`enTransito` AS `enTransito`,`bdclick5`.`bdproductosbodega4`.`notaDebito` AS `nd` from ((((`bdclick5`.`bdproductosbodega4` left join `bdclick5`.`bdgrupo` on((`bdclick5`.`bdgrupo`.`codigo` = `bdclick5`.`bdproductosbodega4`.`Grupo`))) left join `bdclick5`.`bdsubgrupo` on((`bdclick5`.`bdsubgrupo`.`codigo` = `bdclick5`.`bdproductosbodega4`.`Sub_grupo`))) left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdterceros`.`id` = `bdclick5`.`bdproductosbodega4`.`Proveedor`))) left join `bdclick5`.`ultimoponderado` on((`bdclick5`.`ultimoponderado`.`producto` = `bdclick5`.`bdproductosbodega4`.`idSistema`)))
mariadb-version=100135