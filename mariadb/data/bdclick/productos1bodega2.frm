TYPE=VIEW
query=select `bdclick`.`bdproductosbodega2`.`idSistema` AS `idSistema`,`bdclick`.`bdproductosbodega2`.`Codigo` AS `Codigo`,`bdclick`.`bdproductosbodega2`.`Descripcion` AS `Descripcion`,`bdclick`.`bdproductosbodega2`.`referencia` AS `referencia`,((round((`bdclick`.`bdproductosbodega2`.`L1` * ((`bdclick`.`bdproductosbodega2`.`IVA` / 100) + 1)),2) + round((`bdclick`.`bdproductosbodega2`.`L1` * ((`bdclick`.`bdproductosbodega2`.`impoconsumoVenta` / 100) + 1)),2)) - `bdclick`.`bdproductosbodega2`.`L1`) AS `pvp`,`bdclick`.`bdproductosbodega2`.`L1` AS `L1`,`bdclick`.`bdproductosbodega2`.`ubicacion1` AS `ubicacion1`,`bdclick`.`bdproductosbodega2`.`claseBuscador` AS `claseBuscador`,\'\' AS `campoVacio`,`bdclick`.`bdproductosbodega2`.`fisicoInventario` AS `inventario`,`bdclick`.`bdproductosbodega2`.`grupo` AS `Grupo`,`bdclick`.`bdproductosbodega2`.`activo` AS `activo`,`bdclick`.`bdproductosbodega2`.`Usuario` AS `Usuario`,\'\' AS `campoVacio1`,`bdclick`.`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick`.`bdproductosbodega2`.`manejaInventario` AS `manejaInventario`,`bdclick`.`bdproductosbodega2`.`tipoProducto` AS `tipoProducto`,`bdclick`.`bdproductosbodega2`.`plu2` AS `plu2`,`bdclick`.`bdproductosbodega2`.`indVentas` AS `indVentas`,`bdclick`.`bdproductosbodega2`.`descripcionLarga` AS `descripcionLarga` from (`bdclick`.`bdproductosbodega2` left join `bdclick`.`bdultimoponderado` on((`bdclick`.`bdultimoponderado`.`producto` = `bdclick`.`bdproductosbodega2`.`idSistema`))) group by `bdclick`.`bdproductosbodega2`.`idSistema`,`bdclick`.`bdproductosbodega2`.`Codigo`,`bdclick`.`bdproductosbodega2`.`Descripcion`,`bdclick`.`bdproductosbodega2`.`referencia`,((round((`bdclick`.`bdproductosbodega2`.`L1` * ((`bdclick`.`bdproductosbodega2`.`IVA` / 100) + 1)),2) + round((`bdclick`.`bdproductosbodega2`.`L1` * ((`bdclick`.`bdproductosbodega2`.`impoconsumoVenta` / 100) + 1)),2)) - `bdclick`.`bdproductosbodega2`.`L1`),`bdclick`.`bdproductosbodega2`.`L1`,`bdclick`.`bdproductosbodega2`.`ubicacion1`,`bdclick`.`bdproductosbodega2`.`claseBuscador`,`bdclick`.`bdproductosbodega2`.`fisicoInventario`,`bdclick`.`bdproductosbodega2`.`grupo`,`bdclick`.`bdproductosbodega2`.`activo`,`bdclick`.`bdproductosbodega2`.`Usuario`,\'\',`bdclick`.`bdultimoponderado`.`ultimoCosto`,`bdclick`.`bdproductosbodega2`.`manejaInventario`,`bdclick`.`bdproductosbodega2`.`tipoProducto`,`bdclick`.`bdproductosbodega2`.`plu2`,`bdclick`.`bdproductosbodega2`.`indVentas`,`bdclick`.`bdproductosbodega2`.`descripcionLarga`
md5=ab6e4f3ed3d1e9570568e9f44d065ab4
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:25
create-version=2
source=select `bdproductosbodega2`.`idSistema` AS `idSistema`,`bdproductosbodega2`.`Codigo` AS `Codigo`,`bdproductosbodega2`.`Descripcion` AS `Descripcion`,`bdproductosbodega2`.`referencia` AS `referencia`,((round((`bdproductosbodega2`.`L1` * ((`bdproductosbodega2`.`IVA` / 100) + 1)),2) + round((`bdproductosbodega2`.`L1` * ((`bdproductosbodega2`.`impoconsumoVenta` / 100) + 1)),2)) - `bdproductosbodega2`.`L1`) AS `pvp`,`bdproductosbodega2`.`L1` AS `L1`,`bdproductosbodega2`.`ubicacion1` AS `ubicacion1`,`bdproductosbodega2`.`claseBuscador` AS `claseBuscador`,\'\' AS `campoVacio`,`bdproductosbodega2`.`fisicoInventario` AS `inventario`,`bdproductosbodega2`.`grupo` AS `Grupo`,`bdproductosbodega2`.`activo` AS `activo`,`bdproductosbodega2`.`Usuario` AS `Usuario`,\'\' AS `campoVacio1`,`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdproductosbodega2`.`manejaInventario` AS `manejaInventario`,`bdproductosbodega2`.`tipoProducto` AS `tipoProducto`,`bdproductosbodega2`.`plu2` AS `plu2`,`bdproductosbodega2`.`indVentas` AS `indVentas`,`bdproductosbodega2`.`descripcionLarga` AS `descripcionLarga` from (`bdproductosbodega2` left join `bdultimoponderado` on((`bdultimoponderado`.`producto` = `bdproductosbodega2`.`idSistema`))) group by `bdproductosbodega2`.`idSistema`,`bdproductosbodega2`.`Codigo`,`bdproductosbodega2`.`Descripcion`,`bdproductosbodega2`.`referencia`,((round((`bdproductosbodega2`.`L1` * ((`bdproductosbodega2`.`IVA` / 100) + 1)),2) + round((`bdproductosbodega2`.`L1` * ((`bdproductosbodega2`.`impoconsumoVenta` / 100) + 1)),2)) - `bdproductosbodega2`.`L1`),`bdproductosbodega2`.`L1`,`bdproductosbodega2`.`ubicacion1`,`bdproductosbodega2`.`claseBuscador`,`bdproductosbodega2`.`fisicoInventario`,`bdproductosbodega2`.`grupo`,`bdproductosbodega2`.`activo`,`bdproductosbodega2`.`Usuario`,\'\',`bdultimoponderado`.`ultimoCosto`,`bdproductosbodega2`.`manejaInventario`,`bdproductosbodega2`.`tipoProducto`,`bdproductosbodega2`.`plu2`,`bdproductosbodega2`.`indVentas`,`bdproductosbodega2`.`descripcionLarga`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdproductosbodega2`.`idSistema` AS `idSistema`,`bdclick`.`bdproductosbodega2`.`Codigo` AS `Codigo`,`bdclick`.`bdproductosbodega2`.`Descripcion` AS `Descripcion`,`bdclick`.`bdproductosbodega2`.`referencia` AS `referencia`,((round((`bdclick`.`bdproductosbodega2`.`L1` * ((`bdclick`.`bdproductosbodega2`.`IVA` / 100) + 1)),2) + round((`bdclick`.`bdproductosbodega2`.`L1` * ((`bdclick`.`bdproductosbodega2`.`impoconsumoVenta` / 100) + 1)),2)) - `bdclick`.`bdproductosbodega2`.`L1`) AS `pvp`,`bdclick`.`bdproductosbodega2`.`L1` AS `L1`,`bdclick`.`bdproductosbodega2`.`ubicacion1` AS `ubicacion1`,`bdclick`.`bdproductosbodega2`.`claseBuscador` AS `claseBuscador`,\'\' AS `campoVacio`,`bdclick`.`bdproductosbodega2`.`fisicoInventario` AS `inventario`,`bdclick`.`bdproductosbodega2`.`grupo` AS `Grupo`,`bdclick`.`bdproductosbodega2`.`activo` AS `activo`,`bdclick`.`bdproductosbodega2`.`Usuario` AS `Usuario`,\'\' AS `campoVacio1`,`bdclick`.`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick`.`bdproductosbodega2`.`manejaInventario` AS `manejaInventario`,`bdclick`.`bdproductosbodega2`.`tipoProducto` AS `tipoProducto`,`bdclick`.`bdproductosbodega2`.`plu2` AS `plu2`,`bdclick`.`bdproductosbodega2`.`indVentas` AS `indVentas`,`bdclick`.`bdproductosbodega2`.`descripcionLarga` AS `descripcionLarga` from (`bdclick`.`bdproductosbodega2` left join `bdclick`.`bdultimoponderado` on((`bdclick`.`bdultimoponderado`.`producto` = `bdclick`.`bdproductosbodega2`.`idSistema`))) group by `bdclick`.`bdproductosbodega2`.`idSistema`,`bdclick`.`bdproductosbodega2`.`Codigo`,`bdclick`.`bdproductosbodega2`.`Descripcion`,`bdclick`.`bdproductosbodega2`.`referencia`,((round((`bdclick`.`bdproductosbodega2`.`L1` * ((`bdclick`.`bdproductosbodega2`.`IVA` / 100) + 1)),2) + round((`bdclick`.`bdproductosbodega2`.`L1` * ((`bdclick`.`bdproductosbodega2`.`impoconsumoVenta` / 100) + 1)),2)) - `bdclick`.`bdproductosbodega2`.`L1`),`bdclick`.`bdproductosbodega2`.`L1`,`bdclick`.`bdproductosbodega2`.`ubicacion1`,`bdclick`.`bdproductosbodega2`.`claseBuscador`,`bdclick`.`bdproductosbodega2`.`fisicoInventario`,`bdclick`.`bdproductosbodega2`.`grupo`,`bdclick`.`bdproductosbodega2`.`activo`,`bdclick`.`bdproductosbodega2`.`Usuario`,\'\',`bdclick`.`bdultimoponderado`.`ultimoCosto`,`bdclick`.`bdproductosbodega2`.`manejaInventario`,`bdclick`.`bdproductosbodega2`.`tipoProducto`,`bdclick`.`bdproductosbodega2`.`plu2`,`bdclick`.`bdproductosbodega2`.`indVentas`,`bdclick`.`bdproductosbodega2`.`descripcionLarga`
mariadb-version=100135
