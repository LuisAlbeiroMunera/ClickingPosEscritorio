TYPE=VIEW
query=select `bdclick3`.`bdproductosbodega2`.`idSistema` AS `idSistema`,`bdclick3`.`bdproductosbodega2`.`Codigo` AS `Codigo`,`bdclick3`.`bdproductosbodega2`.`Descripcion` AS `Descripcion`,`bdclick3`.`bdproductosbodega2`.`referencia` AS `referencia`,((round((`bdclick3`.`bdproductosbodega2`.`L1` * ((`bdclick3`.`bdproductosbodega2`.`IVA` / 100) + 1)),2) + round((`bdclick3`.`bdproductosbodega2`.`L1` * ((`bdclick3`.`bdproductosbodega2`.`impoconsumoVenta` / 100) + 1)),2)) - `bdclick3`.`bdproductosbodega2`.`L1`) AS `pvp`,`bdclick3`.`bdproductosbodega2`.`L1` AS `L1`,`bdclick3`.`bdproductosbodega2`.`ubicacion1` AS `ubicacion1`,`bdclick3`.`bdproductosbodega2`.`claseBuscador` AS `claseBuscador`,\'\' AS `campoVacio`,`bdclick3`.`bdproductosbodega2`.`fisicoInventario` AS `inventario`,`bdclick3`.`bdproductosbodega2`.`grupo` AS `Grupo`,`bdclick3`.`bdproductosbodega2`.`activo` AS `activo`,`bdclick3`.`bdproductosbodega2`.`Usuario` AS `Usuario`,\'\' AS `campoVacio1`,`bdclick3`.`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick3`.`bdproductosbodega2`.`manejaInventario` AS `manejaInventario`,`bdclick3`.`bdproductosbodega2`.`tipoProducto` AS `tipoProducto`,`bdclick3`.`bdproductosbodega2`.`plu2` AS `plu2`,`bdclick3`.`bdproductosbodega2`.`indVentas` AS `indVentas`,`bdclick3`.`bdproductosbodega2`.`descripcionLarga` AS `descripcionLarga` from (`bdclick3`.`bdproductosbodega2` left join `bdclick3`.`bdultimoponderado` on((`bdclick3`.`bdultimoponderado`.`producto` = `bdclick3`.`bdproductosbodega2`.`idSistema`))) group by `bdclick3`.`bdproductosbodega2`.`idSistema`,`bdclick3`.`bdproductosbodega2`.`Codigo`,`bdclick3`.`bdproductosbodega2`.`Descripcion`,`bdclick3`.`bdproductosbodega2`.`referencia`,((round((`bdclick3`.`bdproductosbodega2`.`L1` * ((`bdclick3`.`bdproductosbodega2`.`IVA` / 100) + 1)),2) + round((`bdclick3`.`bdproductosbodega2`.`L1` * ((`bdclick3`.`bdproductosbodega2`.`impoconsumoVenta` / 100) + 1)),2)) - `bdclick3`.`bdproductosbodega2`.`L1`),`bdclick3`.`bdproductosbodega2`.`L1`,`bdclick3`.`bdproductosbodega2`.`ubicacion1`,`bdclick3`.`bdproductosbodega2`.`claseBuscador`,`bdclick3`.`bdproductosbodega2`.`fisicoInventario`,`bdclick3`.`bdproductosbodega2`.`grupo`,`bdclick3`.`bdproductosbodega2`.`activo`,`bdclick3`.`bdproductosbodega2`.`Usuario`,\'\',`bdclick3`.`bdultimoponderado`.`ultimoCosto`,`bdclick3`.`bdproductosbodega2`.`manejaInventario`,`bdclick3`.`bdproductosbodega2`.`tipoProducto`,`bdclick3`.`bdproductosbodega2`.`plu2`,`bdclick3`.`bdproductosbodega2`.`indVentas`,`bdclick3`.`bdproductosbodega2`.`descripcionLarga`
md5=4e3606e1bab00a4c2e3f0aed9153dd49
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:52
create-version=2
source=select `bdproductosbodega2`.`idSistema` AS `idSistema`,`bdproductosbodega2`.`Codigo` AS `Codigo`,`bdproductosbodega2`.`Descripcion` AS `Descripcion`,`bdproductosbodega2`.`referencia` AS `referencia`,((round((`bdproductosbodega2`.`L1` * ((`bdproductosbodega2`.`IVA` / 100) + 1)),2) + round((`bdproductosbodega2`.`L1` * ((`bdproductosbodega2`.`impoconsumoVenta` / 100) + 1)),2)) - `bdproductosbodega2`.`L1`) AS `pvp`,`bdproductosbodega2`.`L1` AS `L1`,`bdproductosbodega2`.`ubicacion1` AS `ubicacion1`,`bdproductosbodega2`.`claseBuscador` AS `claseBuscador`,\'\' AS `campoVacio`,`bdproductosbodega2`.`fisicoInventario` AS `inventario`,`bdproductosbodega2`.`grupo` AS `Grupo`,`bdproductosbodega2`.`activo` AS `activo`,`bdproductosbodega2`.`Usuario` AS `Usuario`,\'\' AS `campoVacio1`,`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdproductosbodega2`.`manejaInventario` AS `manejaInventario`,`bdproductosbodega2`.`tipoProducto` AS `tipoProducto`,`bdproductosbodega2`.`plu2` AS `plu2`,`bdproductosbodega2`.`indVentas` AS `indVentas`,`bdproductosbodega2`.`descripcionLarga` AS `descripcionLarga` from (`bdproductosbodega2` left join `bdultimoponderado` on((`bdultimoponderado`.`producto` = `bdproductosbodega2`.`idSistema`))) group by `bdproductosbodega2`.`idSistema`,`bdproductosbodega2`.`Codigo`,`bdproductosbodega2`.`Descripcion`,`bdproductosbodega2`.`referencia`,((round((`bdproductosbodega2`.`L1` * ((`bdproductosbodega2`.`IVA` / 100) + 1)),2) + round((`bdproductosbodega2`.`L1` * ((`bdproductosbodega2`.`impoconsumoVenta` / 100) + 1)),2)) - `bdproductosbodega2`.`L1`),`bdproductosbodega2`.`L1`,`bdproductosbodega2`.`ubicacion1`,`bdproductosbodega2`.`claseBuscador`,`bdproductosbodega2`.`fisicoInventario`,`bdproductosbodega2`.`grupo`,`bdproductosbodega2`.`activo`,`bdproductosbodega2`.`Usuario`,\'\',`bdultimoponderado`.`ultimoCosto`,`bdproductosbodega2`.`manejaInventario`,`bdproductosbodega2`.`tipoProducto`,`bdproductosbodega2`.`plu2`,`bdproductosbodega2`.`indVentas`,`bdproductosbodega2`.`descripcionLarga`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdproductosbodega2`.`idSistema` AS `idSistema`,`bdclick3`.`bdproductosbodega2`.`Codigo` AS `Codigo`,`bdclick3`.`bdproductosbodega2`.`Descripcion` AS `Descripcion`,`bdclick3`.`bdproductosbodega2`.`referencia` AS `referencia`,((round((`bdclick3`.`bdproductosbodega2`.`L1` * ((`bdclick3`.`bdproductosbodega2`.`IVA` / 100) + 1)),2) + round((`bdclick3`.`bdproductosbodega2`.`L1` * ((`bdclick3`.`bdproductosbodega2`.`impoconsumoVenta` / 100) + 1)),2)) - `bdclick3`.`bdproductosbodega2`.`L1`) AS `pvp`,`bdclick3`.`bdproductosbodega2`.`L1` AS `L1`,`bdclick3`.`bdproductosbodega2`.`ubicacion1` AS `ubicacion1`,`bdclick3`.`bdproductosbodega2`.`claseBuscador` AS `claseBuscador`,\'\' AS `campoVacio`,`bdclick3`.`bdproductosbodega2`.`fisicoInventario` AS `inventario`,`bdclick3`.`bdproductosbodega2`.`grupo` AS `Grupo`,`bdclick3`.`bdproductosbodega2`.`activo` AS `activo`,`bdclick3`.`bdproductosbodega2`.`Usuario` AS `Usuario`,\'\' AS `campoVacio1`,`bdclick3`.`bdultimoponderado`.`ultimoCosto` AS `ultimoCosto`,`bdclick3`.`bdproductosbodega2`.`manejaInventario` AS `manejaInventario`,`bdclick3`.`bdproductosbodega2`.`tipoProducto` AS `tipoProducto`,`bdclick3`.`bdproductosbodega2`.`plu2` AS `plu2`,`bdclick3`.`bdproductosbodega2`.`indVentas` AS `indVentas`,`bdclick3`.`bdproductosbodega2`.`descripcionLarga` AS `descripcionLarga` from (`bdclick3`.`bdproductosbodega2` left join `bdclick3`.`bdultimoponderado` on((`bdclick3`.`bdultimoponderado`.`producto` = `bdclick3`.`bdproductosbodega2`.`idSistema`))) group by `bdclick3`.`bdproductosbodega2`.`idSistema`,`bdclick3`.`bdproductosbodega2`.`Codigo`,`bdclick3`.`bdproductosbodega2`.`Descripcion`,`bdclick3`.`bdproductosbodega2`.`referencia`,((round((`bdclick3`.`bdproductosbodega2`.`L1` * ((`bdclick3`.`bdproductosbodega2`.`IVA` / 100) + 1)),2) + round((`bdclick3`.`bdproductosbodega2`.`L1` * ((`bdclick3`.`bdproductosbodega2`.`impoconsumoVenta` / 100) + 1)),2)) - `bdclick3`.`bdproductosbodega2`.`L1`),`bdclick3`.`bdproductosbodega2`.`L1`,`bdclick3`.`bdproductosbodega2`.`ubicacion1`,`bdclick3`.`bdproductosbodega2`.`claseBuscador`,`bdclick3`.`bdproductosbodega2`.`fisicoInventario`,`bdclick3`.`bdproductosbodega2`.`grupo`,`bdclick3`.`bdproductosbodega2`.`activo`,`bdclick3`.`bdproductosbodega2`.`Usuario`,\'\',`bdclick3`.`bdultimoponderado`.`ultimoCosto`,`bdclick3`.`bdproductosbodega2`.`manejaInventario`,`bdclick3`.`bdproductosbodega2`.`tipoProducto`,`bdclick3`.`bdproductosbodega2`.`plu2`,`bdclick3`.`bdproductosbodega2`.`indVentas`,`bdclick3`.`bdproductosbodega2`.`descripcionLarga`
mariadb-version=100135
