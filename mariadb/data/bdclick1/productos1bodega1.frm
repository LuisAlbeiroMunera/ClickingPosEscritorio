TYPE=VIEW
query=select `bdclick1`.`bdproductosbodega1`.`idSistema` AS `idSistema`,`bdclick1`.`bdproductosbodega1`.`Codigo` AS `Codigo`,`bdclick1`.`bdproductosbodega1`.`Descripcion` AS `Descripcion`,`bdclick1`.`bdproductosbodega1`.`referencia` AS `referencia`,((round((`bdclick1`.`bdproductosbodega1`.`L1` * ((`bdclick1`.`bdproductosbodega1`.`IVA` / 100) + 1)),2) + round((`bdclick1`.`bdproductosbodega1`.`L1` * ((`bdclick1`.`bdproductosbodega1`.`impoconsumoVenta` / 100) + 1)),2)) - `bdclick1`.`bdproductosbodega1`.`L1`) AS `pvp`,`bdclick1`.`bdproductosbodega1`.`L1` AS `L1`,`bdclick1`.`bdproductosbodega1`.`ubicacion1` AS `ubicacion1`,`bdclick1`.`bdproductosbodega1`.`claseBuscador` AS `claseBuscador`,\'\' AS `campoVacio`,`bdclick1`.`bdproductosbodega1`.`fisicoInventario` AS `inventario`,`bdclick1`.`bdproductosbodega1`.`Grupo` AS `Grupo`,`bdclick1`.`bdproductosbodega1`.`activo` AS `activo`,`bdclick1`.`bdproductosbodega1`.`Usuario` AS `Usuario`,\'\' AS `campoVacio1`,`bdclick1`.`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick1`.`bdproductosbodega1`.`manejaInventario` AS `manejaInventario`,`bdclick1`.`bdproductosbodega1`.`tipoProducto` AS `tipoProducto`,`bdclick1`.`bdproductosbodega1`.`plu2` AS `plu2`,`bdclick1`.`bdproductosbodega1`.`indVentas` AS `indVentas`,`bdclick1`.`bdproductosbodega1`.`descripcionLarga` AS `descripcionLarga` from (`bdclick1`.`bdproductosbodega1` left join `bdclick1`.`bdultimoponderado` on((`bdclick1`.`bdultimoponderado`.`producto` = `bdclick1`.`bdproductosbodega1`.`idSistema`))) group by `bdclick1`.`bdproductosbodega1`.`idSistema`,`bdclick1`.`bdproductosbodega1`.`Codigo`,`bdclick1`.`bdproductosbodega1`.`Descripcion`,`bdclick1`.`bdproductosbodega1`.`referencia`,((round((`bdclick1`.`bdproductosbodega1`.`L1` * ((`bdclick1`.`bdproductosbodega1`.`IVA` / 100) + 1)),2) + round((`bdclick1`.`bdproductosbodega1`.`L1` * ((`bdclick1`.`bdproductosbodega1`.`impoconsumoVenta` / 100) + 1)),2)) - `bdclick1`.`bdproductosbodega1`.`L1`),`bdclick1`.`bdproductosbodega1`.`L1`,`bdclick1`.`bdproductosbodega1`.`ubicacion1`,`bdclick1`.`bdproductosbodega1`.`claseBuscador`,`bdclick1`.`bdproductosbodega1`.`fisicoInventario`,`bdclick1`.`bdproductosbodega1`.`Grupo`,`bdclick1`.`bdproductosbodega1`.`activo`,`bdclick1`.`bdproductosbodega1`.`Usuario`,\'\',`bdclick1`.`bdultimoponderado`.`ultimoCosto`,`bdclick1`.`bdproductosbodega1`.`manejaInventario`,`bdclick1`.`bdproductosbodega1`.`tipoProducto`,`bdclick1`.`bdproductosbodega1`.`plu2`,`bdclick1`.`bdproductosbodega1`.`indVentas`,`bdclick1`.`bdproductosbodega1`.`descripcionLarga`
md5=9cebb43b431164c280cd8b037bd6a938
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:36
create-version=2
source=select `bdproductosbodega1`.`idSistema` AS `idSistema`,`bdproductosbodega1`.`Codigo` AS `Codigo`,`bdproductosbodega1`.`Descripcion` AS `Descripcion`,`bdproductosbodega1`.`referencia` AS `referencia`,((round((`bdproductosbodega1`.`L1` * ((`bdproductosbodega1`.`IVA` / 100) + 1)),2) + round((`bdproductosbodega1`.`L1` * ((`bdproductosbodega1`.`impoconsumoVenta` / 100) + 1)),2)) - `bdproductosbodega1`.`L1`) AS `pvp`,`bdproductosbodega1`.`L1` AS `L1`,`bdproductosbodega1`.`ubicacion1` AS `ubicacion1`,`bdproductosbodega1`.`claseBuscador` AS `claseBuscador`,\'\' AS `campoVacio`,`bdproductosbodega1`.`fisicoInventario` AS `inventario`,`bdproductosbodega1`.`Grupo` AS `Grupo`,`bdproductosbodega1`.`activo` AS `activo`,`bdproductosbodega1`.`Usuario` AS `Usuario`,\'\' AS `campoVacio1`,`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdproductosbodega1`.`manejaInventario` AS `manejaInventario`,`bdproductosbodega1`.`tipoProducto` AS `tipoProducto`,`bdproductosbodega1`.`plu2` AS `plu2`,`bdproductosbodega1`.`indVentas` AS `indVentas`,`bdproductosbodega1`.`descripcionLarga` AS `descripcionLarga` from (`bdproductosbodega1` left join `bdultimoponderado` on((`bdultimoponderado`.`producto` = `bdproductosbodega1`.`idSistema`))) group by `bdproductosbodega1`.`idSistema`,`bdproductosbodega1`.`Codigo`,`bdproductosbodega1`.`Descripcion`,`bdproductosbodega1`.`referencia`,((round((`bdproductosbodega1`.`L1` * ((`bdproductosbodega1`.`IVA` / 100) + 1)),2) + round((`bdproductosbodega1`.`L1` * ((`bdproductosbodega1`.`impoconsumoVenta` / 100) + 1)),2)) - `bdproductosbodega1`.`L1`),`bdproductosbodega1`.`L1`,`bdproductosbodega1`.`ubicacion1`,`bdproductosbodega1`.`claseBuscador`,`bdproductosbodega1`.`fisicoInventario`,`bdproductosbodega1`.`Grupo`,`bdproductosbodega1`.`activo`,`bdproductosbodega1`.`Usuario`,\'\',`bdultimoponderado`.`ultimoCosto`,`bdproductosbodega1`.`manejaInventario`,`bdproductosbodega1`.`tipoProducto`,`bdproductosbodega1`.`plu2`,`bdproductosbodega1`.`indVentas`,`bdproductosbodega1`.`descripcionLarga`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdproductosbodega1`.`idSistema` AS `idSistema`,`bdclick1`.`bdproductosbodega1`.`Codigo` AS `Codigo`,`bdclick1`.`bdproductosbodega1`.`Descripcion` AS `Descripcion`,`bdclick1`.`bdproductosbodega1`.`referencia` AS `referencia`,((round((`bdclick1`.`bdproductosbodega1`.`L1` * ((`bdclick1`.`bdproductosbodega1`.`IVA` / 100) + 1)),2) + round((`bdclick1`.`bdproductosbodega1`.`L1` * ((`bdclick1`.`bdproductosbodega1`.`impoconsumoVenta` / 100) + 1)),2)) - `bdclick1`.`bdproductosbodega1`.`L1`) AS `pvp`,`bdclick1`.`bdproductosbodega1`.`L1` AS `L1`,`bdclick1`.`bdproductosbodega1`.`ubicacion1` AS `ubicacion1`,`bdclick1`.`bdproductosbodega1`.`claseBuscador` AS `claseBuscador`,\'\' AS `campoVacio`,`bdclick1`.`bdproductosbodega1`.`fisicoInventario` AS `inventario`,`bdclick1`.`bdproductosbodega1`.`Grupo` AS `Grupo`,`bdclick1`.`bdproductosbodega1`.`activo` AS `activo`,`bdclick1`.`bdproductosbodega1`.`Usuario` AS `Usuario`,\'\' AS `campoVacio1`,`bdclick1`.`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick1`.`bdproductosbodega1`.`manejaInventario` AS `manejaInventario`,`bdclick1`.`bdproductosbodega1`.`tipoProducto` AS `tipoProducto`,`bdclick1`.`bdproductosbodega1`.`plu2` AS `plu2`,`bdclick1`.`bdproductosbodega1`.`indVentas` AS `indVentas`,`bdclick1`.`bdproductosbodega1`.`descripcionLarga` AS `descripcionLarga` from (`bdclick1`.`bdproductosbodega1` left join `bdclick1`.`bdultimoponderado` on((`bdclick1`.`bdultimoponderado`.`producto` = `bdclick1`.`bdproductosbodega1`.`idSistema`))) group by `bdclick1`.`bdproductosbodega1`.`idSistema`,`bdclick1`.`bdproductosbodega1`.`Codigo`,`bdclick1`.`bdproductosbodega1`.`Descripcion`,`bdclick1`.`bdproductosbodega1`.`referencia`,((round((`bdclick1`.`bdproductosbodega1`.`L1` * ((`bdclick1`.`bdproductosbodega1`.`IVA` / 100) + 1)),2) + round((`bdclick1`.`bdproductosbodega1`.`L1` * ((`bdclick1`.`bdproductosbodega1`.`impoconsumoVenta` / 100) + 1)),2)) - `bdclick1`.`bdproductosbodega1`.`L1`),`bdclick1`.`bdproductosbodega1`.`L1`,`bdclick1`.`bdproductosbodega1`.`ubicacion1`,`bdclick1`.`bdproductosbodega1`.`claseBuscador`,`bdclick1`.`bdproductosbodega1`.`fisicoInventario`,`bdclick1`.`bdproductosbodega1`.`Grupo`,`bdclick1`.`bdproductosbodega1`.`activo`,`bdclick1`.`bdproductosbodega1`.`Usuario`,\'\',`bdclick1`.`bdultimoponderado`.`ultimoCosto`,`bdclick1`.`bdproductosbodega1`.`manejaInventario`,`bdclick1`.`bdproductosbodega1`.`tipoProducto`,`bdclick1`.`bdproductosbodega1`.`plu2`,`bdclick1`.`bdproductosbodega1`.`indVentas`,`bdclick1`.`bdproductosbodega1`.`descripcionLarga`
mariadb-version=100135
