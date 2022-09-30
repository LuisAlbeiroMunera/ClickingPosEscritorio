TYPE=VIEW
query=(select `bdclick6`.`bdproductos`.`idSistema` AS `idSistema`,`bdclick6`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick6`.`bdproductos`.`Descripcion` AS `Descripcion`,if(((`bdclick6`.`bdgrupo`.`nombre` = \' \') or isnull(`bdclick6`.`bdgrupo`.`nombre`)),`bdclick6`.`bdproductos`.`grupo`,`bdclick6`.`bdgrupo`.`nombre`) AS `GrupoDesc`,`bdclick6`.`bdproductos`.`Sub_grupo` AS `Sub_grupo`,`bdclick6`.`bdproductos`.`Proveedor` AS `Proveedor`,round((`bdclick6`.`bdproductos`.`L1` * ((`bdclick6`.`bdproductos`.`IVA` / 100) + 1)),2) AS `pvp`,`bdclick6`.`bdproductos`.`IVA` AS `IVA`,`bdclick6`.`bdproductos`.`L1` AS `L1`,`bdclick6`.`bdproductos`.`L2` AS `L2`,`bdclick6`.`bdproductos`.`L3` AS `L3`,`bdclick6`.`bdproductos`.`L4` AS `L4`,`bdclick6`.`bdproductos`.`Usuario` AS `Usuario`,`bdclick6`.`bdproductos`.`activo` AS `activo`,`bdclick6`.`bdproductos`.`minimo` AS `minimo`,`bdclick6`.`bdproductos`.`unidad` AS `unidad`,`bdclick6`.`bdproductos`.`L5` AS `L5`,`bdclick6`.`bdproductos`.`L6` AS `L6`,`bdclick6`.`bdproductos`.`L7` AS `L7`,`bdclick6`.`bdproductos`.`L8` AS `L8`,`bdclick6`.`bdproductos`.`L9` AS `L9`,`bdclick6`.`bdproductos`.`L10` AS `L10`,`bdclick6`.`bdproductos`.`L11` AS `L11`,`bdclick6`.`bdproductos`.`L12` AS `L12`,`bdclick6`.`bdproductos`.`L13` AS `L13`,`bdclick6`.`bdproductos`.`L14` AS `L14`,`bdclick6`.`bdproductos`.`L15` AS `L15`,`bdclick6`.`bdproductos`.`L16` AS `L16`,`bdclick6`.`bdproductos`.`L17` AS `L17`,`bdclick6`.`bdproductos`.`L18` AS `L18`,`bdclick6`.`bdproductos`.`L19` AS `L19`,`bdclick6`.`bdproductos`.`L20` AS `L20`,`bdclick6`.`bdproductos`.`costo` AS `costo`,`bdclick6`.`bdsubgrupo`.`nombre` AS `SubGrupoDesc`,`bdclick6`.`bdterceros`.`nombre` AS `nombreProveedor`,`bdclick6`.`bdproductos`.`grupo` AS `Grupo`,`bdclick6`.`bdproductos`.`referencia` AS `referencia`,`bdclick6`.`bdproductos`.`ubicacion1` AS `ubicacion1`,if((`bdclick6`.`bdproductos`.`manejaInventario` = 0),\'0\',`bdclick6`.`bdproductos`.`inventario`) AS `fisico`,round((((`bdclick6`.`bdproductos`.`IVA` / 100) + 1) * `bdclick6`.`bdproductos`.`L1`),2) AS `total1SumandoIva`,round(if((`bdclick6`.`bdproductos`.`IVA` = 0),`bdclick6`.`bdproductos`.`L1`,(`bdclick6`.`bdproductos`.`L1` / ((`bdclick6`.`bdproductos`.`IVA` / 100) + 1))),2) AS `total1DividiendoIva`,`bdclick6`.`bdproductos`.`claseBuscador` AS `claseBuscador`,\'\' AS `campoVacio`,`bdclick6`.`ultimoponderado`.`ultimoCosto` AS `ultimoCosto` from ((((`bdclick6`.`bdproductos` left join `bdclick6`.`bdgrupo` on((`bdclick6`.`bdgrupo`.`codigo` = `bdclick6`.`bdproductos`.`grupo`))) left join `bdclick6`.`bdsubgrupo` on((`bdclick6`.`bdproductos`.`Sub_grupo` = `bdclick6`.`bdsubgrupo`.`codigo`))) left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdproductos`.`Proveedor` = `bdclick6`.`bdterceros`.`idSistema`))) join `bdclick6`.`ultimoponderado` on((`bdclick6`.`bdproductos`.`idSistema` = `bdclick6`.`ultimoponderado`.`producto`))) group by `bdclick6`.`bdproductos`.`idSistema`,`bdclick6`.`bdproductos`.`Codigo`,`bdclick6`.`bdproductos`.`Descripcion`,if(((`bdclick6`.`bdgrupo`.`nombre` = \' \') or isnull(`bdclick6`.`bdgrupo`.`nombre`)),`bdclick6`.`bdproductos`.`grupo`,`bdclick6`.`bdgrupo`.`nombre`),`bdclick6`.`bdproductos`.`Sub_grupo`,`bdclick6`.`bdproductos`.`Proveedor`,round((`bdclick6`.`bdproductos`.`L1` * ((`bdclick6`.`bdproductos`.`IVA` / 100) + 1)),2),`bdclick6`.`bdproductos`.`IVA`,`bdclick6`.`bdproductos`.`L1`,`bdclick6`.`bdproductos`.`L2`,`bdclick6`.`bdproductos`.`L3`,`bdclick6`.`bdproductos`.`L4`,`bdclick6`.`bdproductos`.`Usuario`,`bdclick6`.`bdproductos`.`activo`,`bdclick6`.`bdproductos`.`minimo`,`bdclick6`.`bdproductos`.`unidad`,`bdclick6`.`bdproductos`.`L5`,`bdclick6`.`bdproductos`.`L6`,`bdclick6`.`bdproductos`.`L7`,`bdclick6`.`bdproductos`.`L8`,`bdclick6`.`bdproductos`.`L9`,`bdclick6`.`bdproductos`.`L10`,`bdclick6`.`bdproductos`.`L11`,`bdclick6`.`bdproductos`.`L12`,`bdclick6`.`bdproductos`.`L13`,`bdclick6`.`bdproductos`.`L14`,`bdclick6`.`bdproductos`.`L15`,`bdclick6`.`bdproductos`.`L16`,`bdclick6`.`bdproductos`.`L17`,`bdclick6`.`bdproductos`.`L18`,`bdclick6`.`bdproductos`.`L19`,`bdclick6`.`bdproductos`.`L20`,`bdclick6`.`bdproductos`.`costo`,`bdclick6`.`bdsubgrupo`.`nombre`,`bdclick6`.`bdterceros`.`nombre`,`bdclick6`.`bdproductos`.`grupo`,`bdclick6`.`bdproductos`.`referencia`,`bdclick6`.`bdproductos`.`ubicacion1`,if((`bdclick6`.`bdproductos`.`manejaInventario` = 0),\'0\',`bdclick6`.`bdproductos`.`inventario`),round((((`bdclick6`.`bdproductos`.`IVA` / 100) + 1) * `bdclick6`.`bdproductos`.`L1`),2),round(if((`bdclick6`.`bdproductos`.`IVA` = 0),`bdclick6`.`bdproductos`.`L1`,(`bdclick6`.`bdproductos`.`L1` / ((`bdclick6`.`bdproductos`.`IVA` / 100) + 1))),2),`bdclick6`.`bdproductos`.`claseBuscador`,\'\',`bdclick6`.`ultimoponderado`.`ultimoCosto`)
md5=ecd146a992fb1d723c9e8937e6a93913
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:37
create-version=2
source=(select `bdproductos`.`idSistema` AS `idSistema`,`bdproductos`.`Codigo` AS `Codigo`,`bdproductos`.`Descripcion` AS `Descripcion`,if(((`bdgrupo`.`nombre` = \' \') or isnull(`bdgrupo`.`nombre`)),`bdproductos`.`grupo`,`bdgrupo`.`nombre`) AS `GrupoDesc`,`bdproductos`.`Sub_grupo` AS `Sub_grupo`,`bdproductos`.`Proveedor` AS `Proveedor`,round((`bdproductos`.`L1` * ((`bdproductos`.`IVA` / 100) + 1)),2) AS `pvp`,`bdproductos`.`IVA` AS `IVA`,`bdproductos`.`L1` AS `L1`,`bdproductos`.`L2` AS `L2`,`bdproductos`.`L3` AS `L3`,`bdproductos`.`L4` AS `L4`,`bdproductos`.`Usuario` AS `Usuario`,`bdproductos`.`activo` AS `activo`,`bdproductos`.`minimo` AS `minimo`,`bdproductos`.`unidad` AS `unidad`,`bdproductos`.`L5` AS `L5`,`bdproductos`.`L6` AS `L6`,`bdproductos`.`L7` AS `L7`,`bdproductos`.`L8` AS `L8`,`bdproductos`.`L9` AS `L9`,`bdproductos`.`L10` AS `L10`,`bdproductos`.`L11` AS `L11`,`bdproductos`.`L12` AS `L12`,`bdproductos`.`L13` AS `L13`,`bdproductos`.`L14` AS `L14`,`bdproductos`.`L15` AS `L15`,`bdproductos`.`L16` AS `L16`,`bdproductos`.`L17` AS `L17`,`bdproductos`.`L18` AS `L18`,`bdproductos`.`L19` AS `L19`,`bdproductos`.`L20` AS `L20`,`bdproductos`.`costo` AS `costo`,`bdsubgrupo`.`nombre` AS `SubGrupoDesc`,`bdterceros`.`nombre` AS `nombreProveedor`,`bdproductos`.`grupo` AS `Grupo`,`bdproductos`.`referencia` AS `referencia`,`bdproductos`.`ubicacion1` AS `ubicacion1`,if((`bdproductos`.`manejaInventario` = 0),\'0\',`bdproductos`.`inventario`) AS `fisico`,round((((`bdproductos`.`IVA` / 100) + 1) * `bdproductos`.`L1`),2) AS `total1SumandoIva`,round(if((`bdproductos`.`IVA` = 0),`bdproductos`.`L1`,(`bdproductos`.`L1` / ((`bdproductos`.`IVA` / 100) + 1))),2) AS `total1DividiendoIva`,`bdproductos`.`claseBuscador` AS `claseBuscador`,\'\' AS `campoVacio`,`ultimoponderado`.`ultimoCosto` AS `ultimoCosto` from ((((`bdproductos` left join `bdgrupo` on((`bdgrupo`.`codigo` = `bdproductos`.`grupo`))) left join `bdsubgrupo` on((`bdproductos`.`Sub_grupo` = `bdsubgrupo`.`codigo`))) left join `bdterceros` on((`bdproductos`.`Proveedor` = `bdterceros`.`idSistema`))) join `ultimoponderado` on((`bdproductos`.`idSistema` = `ultimoponderado`.`producto`))) group by `bdproductos`.`idSistema`,`bdproductos`.`Codigo`,`bdproductos`.`Descripcion`,if(((`bdgrupo`.`nombre` = \' \') or isnull(`bdgrupo`.`nombre`)),`bdproductos`.`grupo`,`bdgrupo`.`nombre`),`bdproductos`.`Sub_grupo`,`bdproductos`.`Proveedor`,round((`bdproductos`.`L1` * ((`bdproductos`.`IVA` / 100) + 1)),2),`bdproductos`.`IVA`,`bdproductos`.`L1`,`bdproductos`.`L2`,`bdproductos`.`L3`,`bdproductos`.`L4`,`bdproductos`.`Usuario`,`bdproductos`.`activo`,`bdproductos`.`minimo`,`bdproductos`.`unidad`,`bdproductos`.`L5`,`bdproductos`.`L6`,`bdproductos`.`L7`,`bdproductos`.`L8`,`bdproductos`.`L9`,`bdproductos`.`L10`,`bdproductos`.`L11`,`bdproductos`.`L12`,`bdproductos`.`L13`,`bdproductos`.`L14`,`bdproductos`.`L15`,`bdproductos`.`L16`,`bdproductos`.`L17`,`bdproductos`.`L18`,`bdproductos`.`L19`,`bdproductos`.`L20`,`bdproductos`.`costo`,`bdsubgrupo`.`nombre`,`bdterceros`.`nombre`,`bdproductos`.`grupo`,`bdproductos`.`referencia`,`bdproductos`.`ubicacion1`,if((`bdproductos`.`manejaInventario` = 0),\'0\',`bdproductos`.`inventario`),round((((`bdproductos`.`IVA` / 100) + 1) * `bdproductos`.`L1`),2),round(if((`bdproductos`.`IVA` = 0),`bdproductos`.`L1`,(`bdproductos`.`L1` / ((`bdproductos`.`IVA` / 100) + 1))),2),`bdproductos`.`claseBuscador`,\'\',`ultimoponderado`.`ultimoCosto`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bdproductos`.`idSistema` AS `idSistema`,`bdclick6`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick6`.`bdproductos`.`Descripcion` AS `Descripcion`,if(((`bdclick6`.`bdgrupo`.`nombre` = \' \') or isnull(`bdclick6`.`bdgrupo`.`nombre`)),`bdclick6`.`bdproductos`.`grupo`,`bdclick6`.`bdgrupo`.`nombre`) AS `GrupoDesc`,`bdclick6`.`bdproductos`.`Sub_grupo` AS `Sub_grupo`,`bdclick6`.`bdproductos`.`Proveedor` AS `Proveedor`,round((`bdclick6`.`bdproductos`.`L1` * ((`bdclick6`.`bdproductos`.`IVA` / 100) + 1)),2) AS `pvp`,`bdclick6`.`bdproductos`.`IVA` AS `IVA`,`bdclick6`.`bdproductos`.`L1` AS `L1`,`bdclick6`.`bdproductos`.`L2` AS `L2`,`bdclick6`.`bdproductos`.`L3` AS `L3`,`bdclick6`.`bdproductos`.`L4` AS `L4`,`bdclick6`.`bdproductos`.`Usuario` AS `Usuario`,`bdclick6`.`bdproductos`.`activo` AS `activo`,`bdclick6`.`bdproductos`.`minimo` AS `minimo`,`bdclick6`.`bdproductos`.`unidad` AS `unidad`,`bdclick6`.`bdproductos`.`L5` AS `L5`,`bdclick6`.`bdproductos`.`L6` AS `L6`,`bdclick6`.`bdproductos`.`L7` AS `L7`,`bdclick6`.`bdproductos`.`L8` AS `L8`,`bdclick6`.`bdproductos`.`L9` AS `L9`,`bdclick6`.`bdproductos`.`L10` AS `L10`,`bdclick6`.`bdproductos`.`L11` AS `L11`,`bdclick6`.`bdproductos`.`L12` AS `L12`,`bdclick6`.`bdproductos`.`L13` AS `L13`,`bdclick6`.`bdproductos`.`L14` AS `L14`,`bdclick6`.`bdproductos`.`L15` AS `L15`,`bdclick6`.`bdproductos`.`L16` AS `L16`,`bdclick6`.`bdproductos`.`L17` AS `L17`,`bdclick6`.`bdproductos`.`L18` AS `L18`,`bdclick6`.`bdproductos`.`L19` AS `L19`,`bdclick6`.`bdproductos`.`L20` AS `L20`,`bdclick6`.`bdproductos`.`costo` AS `costo`,`bdclick6`.`bdsubgrupo`.`nombre` AS `SubGrupoDesc`,`bdclick6`.`bdterceros`.`nombre` AS `nombreProveedor`,`bdclick6`.`bdproductos`.`grupo` AS `Grupo`,`bdclick6`.`bdproductos`.`referencia` AS `referencia`,`bdclick6`.`bdproductos`.`ubicacion1` AS `ubicacion1`,if((`bdclick6`.`bdproductos`.`manejaInventario` = 0),\'0\',`bdclick6`.`bdproductos`.`inventario`) AS `fisico`,round((((`bdclick6`.`bdproductos`.`IVA` / 100) + 1) * `bdclick6`.`bdproductos`.`L1`),2) AS `total1SumandoIva`,round(if((`bdclick6`.`bdproductos`.`IVA` = 0),`bdclick6`.`bdproductos`.`L1`,(`bdclick6`.`bdproductos`.`L1` / ((`bdclick6`.`bdproductos`.`IVA` / 100) + 1))),2) AS `total1DividiendoIva`,`bdclick6`.`bdproductos`.`claseBuscador` AS `claseBuscador`,\'\' AS `campoVacio`,`bdclick6`.`ultimoponderado`.`ultimoCosto` AS `ultimoCosto` from ((((`bdclick6`.`bdproductos` left join `bdclick6`.`bdgrupo` on((`bdclick6`.`bdgrupo`.`codigo` = `bdclick6`.`bdproductos`.`grupo`))) left join `bdclick6`.`bdsubgrupo` on((`bdclick6`.`bdproductos`.`Sub_grupo` = `bdclick6`.`bdsubgrupo`.`codigo`))) left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdproductos`.`Proveedor` = `bdclick6`.`bdterceros`.`idSistema`))) join `bdclick6`.`ultimoponderado` on((`bdclick6`.`bdproductos`.`idSistema` = `bdclick6`.`ultimoponderado`.`producto`))) group by `bdclick6`.`bdproductos`.`idSistema`,`bdclick6`.`bdproductos`.`Codigo`,`bdclick6`.`bdproductos`.`Descripcion`,if(((`bdclick6`.`bdgrupo`.`nombre` = \' \') or isnull(`bdclick6`.`bdgrupo`.`nombre`)),`bdclick6`.`bdproductos`.`grupo`,`bdclick6`.`bdgrupo`.`nombre`),`bdclick6`.`bdproductos`.`Sub_grupo`,`bdclick6`.`bdproductos`.`Proveedor`,round((`bdclick6`.`bdproductos`.`L1` * ((`bdclick6`.`bdproductos`.`IVA` / 100) + 1)),2),`bdclick6`.`bdproductos`.`IVA`,`bdclick6`.`bdproductos`.`L1`,`bdclick6`.`bdproductos`.`L2`,`bdclick6`.`bdproductos`.`L3`,`bdclick6`.`bdproductos`.`L4`,`bdclick6`.`bdproductos`.`Usuario`,`bdclick6`.`bdproductos`.`activo`,`bdclick6`.`bdproductos`.`minimo`,`bdclick6`.`bdproductos`.`unidad`,`bdclick6`.`bdproductos`.`L5`,`bdclick6`.`bdproductos`.`L6`,`bdclick6`.`bdproductos`.`L7`,`bdclick6`.`bdproductos`.`L8`,`bdclick6`.`bdproductos`.`L9`,`bdclick6`.`bdproductos`.`L10`,`bdclick6`.`bdproductos`.`L11`,`bdclick6`.`bdproductos`.`L12`,`bdclick6`.`bdproductos`.`L13`,`bdclick6`.`bdproductos`.`L14`,`bdclick6`.`bdproductos`.`L15`,`bdclick6`.`bdproductos`.`L16`,`bdclick6`.`bdproductos`.`L17`,`bdclick6`.`bdproductos`.`L18`,`bdclick6`.`bdproductos`.`L19`,`bdclick6`.`bdproductos`.`L20`,`bdclick6`.`bdproductos`.`costo`,`bdclick6`.`bdsubgrupo`.`nombre`,`bdclick6`.`bdterceros`.`nombre`,`bdclick6`.`bdproductos`.`grupo`,`bdclick6`.`bdproductos`.`referencia`,`bdclick6`.`bdproductos`.`ubicacion1`,if((`bdclick6`.`bdproductos`.`manejaInventario` = 0),\'0\',`bdclick6`.`bdproductos`.`inventario`),round((((`bdclick6`.`bdproductos`.`IVA` / 100) + 1) * `bdclick6`.`bdproductos`.`L1`),2),round(if((`bdclick6`.`bdproductos`.`IVA` = 0),`bdclick6`.`bdproductos`.`L1`,(`bdclick6`.`bdproductos`.`L1` / ((`bdclick6`.`bdproductos`.`IVA` / 100) + 1))),2),`bdclick6`.`bdproductos`.`claseBuscador`,\'\',`bdclick6`.`ultimoponderado`.`ultimoCosto`)
mariadb-version=100135
