TYPE=VIEW
query=select `bdclick`.`bdproductosbodega4`.`idSistema` AS `idSistema`,`bdclick`.`bdproductosbodega4`.`Codigo` AS `Codigo`,`bdclick`.`bdproductosbodega4`.`Descripcion` AS `Descripcion`,`bdclick`.`bdproductosbodega4`.`referencia` AS `referencia`,((round((`bdclick`.`bdproductosbodega4`.`L1` * ((`bdclick`.`bdproductosbodega4`.`IVA` / 100) + 1)),2) + round((`bdclick`.`bdproductosbodega4`.`L1` * ((`bdclick`.`bdproductosbodega4`.`impoconsumoVenta` / 100) + 1)),2)) - `bdclick`.`bdproductosbodega4`.`L1`) AS `pvp`,`bdclick`.`bdproductosbodega4`.`L1` AS `L1`,`bdclick`.`bdproductosbodega4`.`ubicacion1` AS `ubicacion1`,`bdclick`.`bdproductosbodega4`.`claseBuscador` AS `claseBuscador`,\'\' AS `campoVacio`,\'\' AS `campoVacio1`,`bdclick`.`bdproductosbodega4`.`fisicoInventario` AS `inventario`,`bdclick`.`bdproductosbodega4`.`Grupo` AS `Grupo`,`bdclick`.`bdproductosbodega4`.`activo` AS `activo`,`bdclick`.`bdproductosbodega4`.`Usuario` AS `Usuario`,`bdclick`.`bdproductosbodega4`.`manejaInventario` AS `manejaInventario`,`bdclick`.`bdproductosbodega4`.`tipoProducto` AS `tipoProducto`,`bdclick`.`bdproductosbodega4`.`plu2` AS `plu2`,`bdclick`.`bdproductosbodega4`.`indVentas` AS `indVentas`,`bdclick`.`bdproductosbodega4`.`descripcionLarga` AS `descripcionLarga`,`bdclick`.`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto` from (`bdclick`.`bdproductosbodega4` left join `bdclick`.`bdultimoponderado` on((`bdclick`.`bdultimoponderado`.`producto` = `bdclick`.`bdproductosbodega4`.`idSistema`))) group by `bdclick`.`bdproductosbodega4`.`idSistema`,`bdclick`.`bdproductosbodega4`.`Codigo`,`bdclick`.`bdproductosbodega4`.`Descripcion`,`bdclick`.`bdproductosbodega4`.`referencia`,((round((`bdclick`.`bdproductosbodega4`.`L1` * ((`bdclick`.`bdproductosbodega4`.`IVA` / 100) + 1)),2) + round((`bdclick`.`bdproductosbodega4`.`L1` * ((`bdclick`.`bdproductosbodega4`.`impoconsumoVenta` / 100) + 1)),2)) - `bdclick`.`bdproductosbodega4`.`L1`),`bdclick`.`bdproductosbodega4`.`L1`,`bdclick`.`bdproductosbodega4`.`ubicacion1`,`bdclick`.`bdproductosbodega4`.`claseBuscador`,\'\',`bdclick`.`bdproductosbodega4`.`fisicoInventario`,`bdclick`.`bdproductosbodega4`.`Grupo`,`bdclick`.`bdproductosbodega4`.`activo`,`bdclick`.`bdproductosbodega4`.`Usuario`,`bdclick`.`bdproductosbodega4`.`manejaInventario`,`bdclick`.`bdproductosbodega4`.`tipoProducto`,`bdclick`.`bdproductosbodega4`.`plu2`,`bdclick`.`bdproductosbodega4`.`indVentas`,`bdclick`.`bdproductosbodega4`.`descripcionLarga`,`bdclick`.`bdultimoponderado`.`ultimoCosto`
md5=bbcaa446d902c1d4c33fbe4c0525d48a
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:25
create-version=2
source=select `bdproductosbodega4`.`idSistema` AS `idSistema`,`bdproductosbodega4`.`Codigo` AS `Codigo`,`bdproductosbodega4`.`Descripcion` AS `Descripcion`,`bdproductosbodega4`.`referencia` AS `referencia`,((round((`bdproductosbodega4`.`L1` * ((`bdproductosbodega4`.`IVA` / 100) + 1)),2) + round((`bdproductosbodega4`.`L1` * ((`bdproductosbodega4`.`impoconsumoVenta` / 100) + 1)),2)) - `bdproductosbodega4`.`L1`) AS `pvp`,`bdproductosbodega4`.`L1` AS `L1`,`bdproductosbodega4`.`ubicacion1` AS `ubicacion1`,`bdproductosbodega4`.`claseBuscador` AS `claseBuscador`,\'\' AS `campoVacio`,\'\' AS `campoVacio1`,`bdproductosbodega4`.`fisicoInventario` AS `inventario`,`bdproductosbodega4`.`Grupo` AS `Grupo`,`bdproductosbodega4`.`activo` AS `activo`,`bdproductosbodega4`.`Usuario` AS `Usuario`,`bdproductosbodega4`.`manejaInventario` AS `manejaInventario`,`bdproductosbodega4`.`tipoProducto` AS `tipoProducto`,`bdproductosbodega4`.`plu2` AS `plu2`,`bdproductosbodega4`.`indVentas` AS `indVentas`,`bdproductosbodega4`.`descripcionLarga` AS `descripcionLarga`,`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto` from (`bdproductosbodega4` left join `bdultimoponderado` on((`bdultimoponderado`.`producto` = `bdproductosbodega4`.`idSistema`))) group by `bdproductosbodega4`.`idSistema`,`bdproductosbodega4`.`Codigo`,`bdproductosbodega4`.`Descripcion`,`bdproductosbodega4`.`referencia`,((round((`bdproductosbodega4`.`L1` * ((`bdproductosbodega4`.`IVA` / 100) + 1)),2) + round((`bdproductosbodega4`.`L1` * ((`bdproductosbodega4`.`impoconsumoVenta` / 100) + 1)),2)) - `bdproductosbodega4`.`L1`),`bdproductosbodega4`.`L1`,`bdproductosbodega4`.`ubicacion1`,`bdproductosbodega4`.`claseBuscador`,\'\',`bdproductosbodega4`.`fisicoInventario`,`bdproductosbodega4`.`Grupo`,`bdproductosbodega4`.`activo`,`bdproductosbodega4`.`Usuario`,`bdproductosbodega4`.`manejaInventario`,`bdproductosbodega4`.`tipoProducto`,`bdproductosbodega4`.`plu2`,`bdproductosbodega4`.`indVentas`,`bdproductosbodega4`.`descripcionLarga`,`bdultimoponderado`.`ultimoCosto`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdproductosbodega4`.`idSistema` AS `idSistema`,`bdclick`.`bdproductosbodega4`.`Codigo` AS `Codigo`,`bdclick`.`bdproductosbodega4`.`Descripcion` AS `Descripcion`,`bdclick`.`bdproductosbodega4`.`referencia` AS `referencia`,((round((`bdclick`.`bdproductosbodega4`.`L1` * ((`bdclick`.`bdproductosbodega4`.`IVA` / 100) + 1)),2) + round((`bdclick`.`bdproductosbodega4`.`L1` * ((`bdclick`.`bdproductosbodega4`.`impoconsumoVenta` / 100) + 1)),2)) - `bdclick`.`bdproductosbodega4`.`L1`) AS `pvp`,`bdclick`.`bdproductosbodega4`.`L1` AS `L1`,`bdclick`.`bdproductosbodega4`.`ubicacion1` AS `ubicacion1`,`bdclick`.`bdproductosbodega4`.`claseBuscador` AS `claseBuscador`,\'\' AS `campoVacio`,\'\' AS `campoVacio1`,`bdclick`.`bdproductosbodega4`.`fisicoInventario` AS `inventario`,`bdclick`.`bdproductosbodega4`.`Grupo` AS `Grupo`,`bdclick`.`bdproductosbodega4`.`activo` AS `activo`,`bdclick`.`bdproductosbodega4`.`Usuario` AS `Usuario`,`bdclick`.`bdproductosbodega4`.`manejaInventario` AS `manejaInventario`,`bdclick`.`bdproductosbodega4`.`tipoProducto` AS `tipoProducto`,`bdclick`.`bdproductosbodega4`.`plu2` AS `plu2`,`bdclick`.`bdproductosbodega4`.`indVentas` AS `indVentas`,`bdclick`.`bdproductosbodega4`.`descripcionLarga` AS `descripcionLarga`,`bdclick`.`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto` from (`bdclick`.`bdproductosbodega4` left join `bdclick`.`bdultimoponderado` on((`bdclick`.`bdultimoponderado`.`producto` = `bdclick`.`bdproductosbodega4`.`idSistema`))) group by `bdclick`.`bdproductosbodega4`.`idSistema`,`bdclick`.`bdproductosbodega4`.`Codigo`,`bdclick`.`bdproductosbodega4`.`Descripcion`,`bdclick`.`bdproductosbodega4`.`referencia`,((round((`bdclick`.`bdproductosbodega4`.`L1` * ((`bdclick`.`bdproductosbodega4`.`IVA` / 100) + 1)),2) + round((`bdclick`.`bdproductosbodega4`.`L1` * ((`bdclick`.`bdproductosbodega4`.`impoconsumoVenta` / 100) + 1)),2)) - `bdclick`.`bdproductosbodega4`.`L1`),`bdclick`.`bdproductosbodega4`.`L1`,`bdclick`.`bdproductosbodega4`.`ubicacion1`,`bdclick`.`bdproductosbodega4`.`claseBuscador`,\'\',`bdclick`.`bdproductosbodega4`.`fisicoInventario`,`bdclick`.`bdproductosbodega4`.`Grupo`,`bdclick`.`bdproductosbodega4`.`activo`,`bdclick`.`bdproductosbodega4`.`Usuario`,`bdclick`.`bdproductosbodega4`.`manejaInventario`,`bdclick`.`bdproductosbodega4`.`tipoProducto`,`bdclick`.`bdproductosbodega4`.`plu2`,`bdclick`.`bdproductosbodega4`.`indVentas`,`bdclick`.`bdproductosbodega4`.`descripcionLarga`,`bdclick`.`bdultimoponderado`.`ultimoCosto`
mariadb-version=100135