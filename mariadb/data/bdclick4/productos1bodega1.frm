TYPE=VIEW
query=select `bdclick4`.`bdproductosbodega1`.`idSistema` AS `idSistema`,`bdclick4`.`bdproductosbodega1`.`Codigo` AS `Codigo`,`bdclick4`.`bdproductosbodega1`.`Descripcion` AS `Descripcion`,`bdclick4`.`bdproductosbodega1`.`referencia` AS `referencia`,((round((`bdclick4`.`bdproductosbodega1`.`L1` * ((`bdclick4`.`bdproductosbodega1`.`IVA` / 100) + 1)),2) + round((`bdclick4`.`bdproductosbodega1`.`L1` * ((`bdclick4`.`bdproductosbodega1`.`impoconsumoVenta` / 100) + 1)),2)) - `bdclick4`.`bdproductosbodega1`.`L1`) AS `pvp`,`bdclick4`.`bdproductosbodega1`.`L1` AS `L1`,`bdclick4`.`bdproductosbodega1`.`ubicacion1` AS `ubicacion1`,`bdclick4`.`bdproductosbodega1`.`claseBuscador` AS `claseBuscador`,\'\' AS `campoVacio`,`bdclick4`.`bdproductosbodega1`.`fisicoInventario` AS `inventario`,`bdclick4`.`bdproductosbodega1`.`Grupo` AS `Grupo`,`bdclick4`.`bdproductosbodega1`.`activo` AS `activo`,`bdclick4`.`bdproductosbodega1`.`Usuario` AS `Usuario`,\'\' AS `campoVacio1`,`bdclick4`.`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick4`.`bdproductosbodega1`.`manejaInventario` AS `manejaInventario`,`bdclick4`.`bdproductosbodega1`.`tipoProducto` AS `tipoProducto`,`bdclick4`.`bdproductosbodega1`.`plu2` AS `plu2`,`bdclick4`.`bdproductosbodega1`.`indVentas` AS `indVentas`,`bdclick4`.`bdproductosbodega1`.`descripcionLarga` AS `descripcionLarga` from (`bdclick4`.`bdproductosbodega1` left join `bdclick4`.`bdultimoponderado` on((`bdclick4`.`bdultimoponderado`.`producto` = `bdclick4`.`bdproductosbodega1`.`idSistema`))) group by `bdclick4`.`bdproductosbodega1`.`idSistema`,`bdclick4`.`bdproductosbodega1`.`Codigo`,`bdclick4`.`bdproductosbodega1`.`Descripcion`,`bdclick4`.`bdproductosbodega1`.`referencia`,((round((`bdclick4`.`bdproductosbodega1`.`L1` * ((`bdclick4`.`bdproductosbodega1`.`IVA` / 100) + 1)),2) + round((`bdclick4`.`bdproductosbodega1`.`L1` * ((`bdclick4`.`bdproductosbodega1`.`impoconsumoVenta` / 100) + 1)),2)) - `bdclick4`.`bdproductosbodega1`.`L1`),`bdclick4`.`bdproductosbodega1`.`L1`,`bdclick4`.`bdproductosbodega1`.`ubicacion1`,`bdclick4`.`bdproductosbodega1`.`claseBuscador`,`bdclick4`.`bdproductosbodega1`.`fisicoInventario`,`bdclick4`.`bdproductosbodega1`.`Grupo`,`bdclick4`.`bdproductosbodega1`.`activo`,`bdclick4`.`bdproductosbodega1`.`Usuario`,\'\',`bdclick4`.`bdultimoponderado`.`ultimoCosto`,`bdclick4`.`bdproductosbodega1`.`manejaInventario`,`bdclick4`.`bdproductosbodega1`.`tipoProducto`,`bdclick4`.`bdproductosbodega1`.`plu2`,`bdclick4`.`bdproductosbodega1`.`indVentas`,`bdclick4`.`bdproductosbodega1`.`descripcionLarga`
md5=8705c0bd5de436d024667ee400290fb9
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:29
create-version=2
source=select `bdproductosbodega1`.`idSistema` AS `idSistema`,`bdproductosbodega1`.`Codigo` AS `Codigo`,`bdproductosbodega1`.`Descripcion` AS `Descripcion`,`bdproductosbodega1`.`referencia` AS `referencia`,((round((`bdproductosbodega1`.`L1` * ((`bdproductosbodega1`.`IVA` / 100) + 1)),2) + round((`bdproductosbodega1`.`L1` * ((`bdproductosbodega1`.`impoconsumoVenta` / 100) + 1)),2)) - `bdproductosbodega1`.`L1`) AS `pvp`,`bdproductosbodega1`.`L1` AS `L1`,`bdproductosbodega1`.`ubicacion1` AS `ubicacion1`,`bdproductosbodega1`.`claseBuscador` AS `claseBuscador`,\'\' AS `campoVacio`,`bdproductosbodega1`.`fisicoInventario` AS `inventario`,`bdproductosbodega1`.`Grupo` AS `Grupo`,`bdproductosbodega1`.`activo` AS `activo`,`bdproductosbodega1`.`Usuario` AS `Usuario`,\'\' AS `campoVacio1`,`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdproductosbodega1`.`manejaInventario` AS `manejaInventario`,`bdproductosbodega1`.`tipoProducto` AS `tipoProducto`,`bdproductosbodega1`.`plu2` AS `plu2`,`bdproductosbodega1`.`indVentas` AS `indVentas`,`bdproductosbodega1`.`descripcionLarga` AS `descripcionLarga` from (`bdproductosbodega1` left join `bdultimoponderado` on((`bdultimoponderado`.`producto` = `bdproductosbodega1`.`idSistema`))) group by `bdproductosbodega1`.`idSistema`,`bdproductosbodega1`.`Codigo`,`bdproductosbodega1`.`Descripcion`,`bdproductosbodega1`.`referencia`,((round((`bdproductosbodega1`.`L1` * ((`bdproductosbodega1`.`IVA` / 100) + 1)),2) + round((`bdproductosbodega1`.`L1` * ((`bdproductosbodega1`.`impoconsumoVenta` / 100) + 1)),2)) - `bdproductosbodega1`.`L1`),`bdproductosbodega1`.`L1`,`bdproductosbodega1`.`ubicacion1`,`bdproductosbodega1`.`claseBuscador`,`bdproductosbodega1`.`fisicoInventario`,`bdproductosbodega1`.`Grupo`,`bdproductosbodega1`.`activo`,`bdproductosbodega1`.`Usuario`,\'\',`bdultimoponderado`.`ultimoCosto`,`bdproductosbodega1`.`manejaInventario`,`bdproductosbodega1`.`tipoProducto`,`bdproductosbodega1`.`plu2`,`bdproductosbodega1`.`indVentas`,`bdproductosbodega1`.`descripcionLarga`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdproductosbodega1`.`idSistema` AS `idSistema`,`bdclick4`.`bdproductosbodega1`.`Codigo` AS `Codigo`,`bdclick4`.`bdproductosbodega1`.`Descripcion` AS `Descripcion`,`bdclick4`.`bdproductosbodega1`.`referencia` AS `referencia`,((round((`bdclick4`.`bdproductosbodega1`.`L1` * ((`bdclick4`.`bdproductosbodega1`.`IVA` / 100) + 1)),2) + round((`bdclick4`.`bdproductosbodega1`.`L1` * ((`bdclick4`.`bdproductosbodega1`.`impoconsumoVenta` / 100) + 1)),2)) - `bdclick4`.`bdproductosbodega1`.`L1`) AS `pvp`,`bdclick4`.`bdproductosbodega1`.`L1` AS `L1`,`bdclick4`.`bdproductosbodega1`.`ubicacion1` AS `ubicacion1`,`bdclick4`.`bdproductosbodega1`.`claseBuscador` AS `claseBuscador`,\'\' AS `campoVacio`,`bdclick4`.`bdproductosbodega1`.`fisicoInventario` AS `inventario`,`bdclick4`.`bdproductosbodega1`.`Grupo` AS `Grupo`,`bdclick4`.`bdproductosbodega1`.`activo` AS `activo`,`bdclick4`.`bdproductosbodega1`.`Usuario` AS `Usuario`,\'\' AS `campoVacio1`,`bdclick4`.`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick4`.`bdproductosbodega1`.`manejaInventario` AS `manejaInventario`,`bdclick4`.`bdproductosbodega1`.`tipoProducto` AS `tipoProducto`,`bdclick4`.`bdproductosbodega1`.`plu2` AS `plu2`,`bdclick4`.`bdproductosbodega1`.`indVentas` AS `indVentas`,`bdclick4`.`bdproductosbodega1`.`descripcionLarga` AS `descripcionLarga` from (`bdclick4`.`bdproductosbodega1` left join `bdclick4`.`bdultimoponderado` on((`bdclick4`.`bdultimoponderado`.`producto` = `bdclick4`.`bdproductosbodega1`.`idSistema`))) group by `bdclick4`.`bdproductosbodega1`.`idSistema`,`bdclick4`.`bdproductosbodega1`.`Codigo`,`bdclick4`.`bdproductosbodega1`.`Descripcion`,`bdclick4`.`bdproductosbodega1`.`referencia`,((round((`bdclick4`.`bdproductosbodega1`.`L1` * ((`bdclick4`.`bdproductosbodega1`.`IVA` / 100) + 1)),2) + round((`bdclick4`.`bdproductosbodega1`.`L1` * ((`bdclick4`.`bdproductosbodega1`.`impoconsumoVenta` / 100) + 1)),2)) - `bdclick4`.`bdproductosbodega1`.`L1`),`bdclick4`.`bdproductosbodega1`.`L1`,`bdclick4`.`bdproductosbodega1`.`ubicacion1`,`bdclick4`.`bdproductosbodega1`.`claseBuscador`,`bdclick4`.`bdproductosbodega1`.`fisicoInventario`,`bdclick4`.`bdproductosbodega1`.`Grupo`,`bdclick4`.`bdproductosbodega1`.`activo`,`bdclick4`.`bdproductosbodega1`.`Usuario`,\'\',`bdclick4`.`bdultimoponderado`.`ultimoCosto`,`bdclick4`.`bdproductosbodega1`.`manejaInventario`,`bdclick4`.`bdproductosbodega1`.`tipoProducto`,`bdclick4`.`bdproductosbodega1`.`plu2`,`bdclick4`.`bdproductosbodega1`.`indVentas`,`bdclick4`.`bdproductosbodega1`.`descripcionLarga`
mariadb-version=100135