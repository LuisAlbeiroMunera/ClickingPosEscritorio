TYPE=VIEW
query=select `bdclick`.`repingresosdetallado1`.`ingreso` AS `ingreso`,`bdclick`.`repingresosdetallado1`.`ordenId` AS `ordenId`,`bdclick`.`repingresosdetallado1`.`producto` AS `producto`,`bdclick`.`repingresosdetallado1`.`descripcion` AS `descripcion`,`bdclick`.`repingresosdetallado1`.`cantidad` AS `cantidad`,`bdclick`.`repingresosdetallado1`.`valor` AS `valor`,`bdclick`.`repingresosdetallado1`.`subtotal` AS `subtotal`,`bdclick`.`repingresosdetallado1`.`iva` AS `iva`,`bdclick`.`repingresosdetallado1`.`impoconsumo` AS `impoconsumo`,`bdclick`.`repingresosdetallado1`.`total` AS `total`,`bdclick`.`repingresosdetallado1`.`fechaFactura` AS `fechaFactura`,`bdclick`.`repingresosdetallado1`.`proveedor` AS `proveedor`,`bdclick`.`repingresosdetallado1`.`nombre` AS `nombre`,`bdclick`.`repingresosdetallado1`.`Año` AS `Año`,`bdclick`.`repingresosdetallado1`.`Mes` AS `Mes`,`bdclick`.`repingresosdetallado1`.`Grupo` AS `Grupo`,`bdclick`.`repingresosdetallado1`.`Sub_grupo` AS `Sub_grupo`,`bdclick`.`repingresosdetallado1`.`anulada` AS `anulada`,`bdclick`.`repingresosdetallado1`.`terminal` AS `terminal`,`bdclick`.`repingresosdetallado1`.`concepto` AS `concepto`,`bdclick`.`repingresosdetallado1`.`ubicacion1` AS `ubicacion1`,`bdclick`.`repingresosdetallado1`.`referencia` AS `referencia`,`bdclick`.`repingresosdetallado1`.`L1` AS `L1`,`bdclick`.`repingresosdetallado1`.`L2` AS `L2`,`bdclick`.`repingresosdetallado1`.`descuento` AS `descuento`,`bdclick`.`repingresosdetallado1`.`totalIng` AS `totalIng`,`bdclick`.`repingresosdetallado1`.`descuentosIng` AS `descuentosIng`,`bdclick`.`repingresosdetallado1`.`ivaIng` AS `ivaIng`,`bdclick`.`repingresosdetallado1`.`impoconsumoIng` AS `impoconsumoIng`,`bdclick`.`repingresosdetallado1`.`subtotalIng` AS `subtotalIng`,`bdclick`.`repingresosdetallado1`.`rtIva` AS `rtIva`,`bdclick`.`repingresosdetallado1`.`rtFuente` AS `rtFuente`,`bdclick`.`repingresosdetallado1`.`porRtFuente` AS `porRtFuente`,`bdclick`.`repingresosdetallado1`.`tipo` AS `tipo`,`bdclick`.`repingresosdetallado1`.`hora` AS `hora`,`bdclick`.`repingresosdetallado1`.`CodigoProd` AS `CodigoProd`,`bdclick`.`repingresosdetallado1`.`IdProveedor` AS `IdProveedor`,`bdclick`.`bddetalleproductos`.`imei` AS `imei`,`bdclick`.`bddetalleproductos`.`color` AS `color` from (`bdclick`.`repingresosdetallado1` left join `bdclick`.`bddetalleproductos` on(((`bdclick`.`repingresosdetallado1`.`producto` = `bdclick`.`bddetalleproductos`.`codProducto`) and (`bdclick`.`repingresosdetallado1`.`ingreso` = `bdclick`.`bddetalleproductos`.`numIngreso`))))
md5=31af809ec358a53a4474cd102fdff93f
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:26
create-version=2
source=select `repingresosdetallado1`.`ingreso` AS `ingreso`,`repingresosdetallado1`.`ordenId` AS `ordenId`,`repingresosdetallado1`.`producto` AS `producto`,`repingresosdetallado1`.`descripcion` AS `descripcion`,`repingresosdetallado1`.`cantidad` AS `cantidad`,`repingresosdetallado1`.`valor` AS `valor`,`repingresosdetallado1`.`subtotal` AS `subtotal`,`repingresosdetallado1`.`iva` AS `iva`,`repingresosdetallado1`.`impoconsumo` AS `impoconsumo`,`repingresosdetallado1`.`total` AS `total`,`repingresosdetallado1`.`fechaFactura` AS `fechaFactura`,`repingresosdetallado1`.`proveedor` AS `proveedor`,`repingresosdetallado1`.`nombre` AS `nombre`,`repingresosdetallado1`.`Año` AS `Año`,`repingresosdetallado1`.`Mes` AS `Mes`,`repingresosdetallado1`.`Grupo` AS `Grupo`,`repingresosdetallado1`.`Sub_grupo` AS `Sub_grupo`,`repingresosdetallado1`.`anulada` AS `anulada`,`repingresosdetallado1`.`terminal` AS `terminal`,`repingresosdetallado1`.`concepto` AS `concepto`,`repingresosdetallado1`.`ubicacion1` AS `ubicacion1`,`repingresosdetallado1`.`referencia` AS `referencia`,`repingresosdetallado1`.`L1` AS `L1`,`repingresosdetallado1`.`L2` AS `L2`,`repingresosdetallado1`.`descuento` AS `descuento`,`repingresosdetallado1`.`totalIng` AS `totalIng`,`repingresosdetallado1`.`descuentosIng` AS `descuentosIng`,`repingresosdetallado1`.`ivaIng` AS `ivaIng`,`repingresosdetallado1`.`impoconsumoIng` AS `impoconsumoIng`,`repingresosdetallado1`.`subtotalIng` AS `subtotalIng`,`repingresosdetallado1`.`rtIva` AS `rtIva`,`repingresosdetallado1`.`rtFuente` AS `rtFuente`,`repingresosdetallado1`.`porRtFuente` AS `porRtFuente`,`repingresosdetallado1`.`tipo` AS `tipo`,`repingresosdetallado1`.`hora` AS `hora`,`repingresosdetallado1`.`CodigoProd` AS `CodigoProd`,`repingresosdetallado1`.`IdProveedor` AS `IdProveedor`,`bddetalleproductos`.`imei` AS `imei`,`bddetalleproductos`.`color` AS `color` from (`repingresosdetallado1` left join `bddetalleproductos` on(((`repingresosdetallado1`.`producto` = `bddetalleproductos`.`codProducto`) and (`repingresosdetallado1`.`ingreso` = `bddetalleproductos`.`numIngreso`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`repingresosdetallado1`.`ingreso` AS `ingreso`,`bdclick`.`repingresosdetallado1`.`ordenId` AS `ordenId`,`bdclick`.`repingresosdetallado1`.`producto` AS `producto`,`bdclick`.`repingresosdetallado1`.`descripcion` AS `descripcion`,`bdclick`.`repingresosdetallado1`.`cantidad` AS `cantidad`,`bdclick`.`repingresosdetallado1`.`valor` AS `valor`,`bdclick`.`repingresosdetallado1`.`subtotal` AS `subtotal`,`bdclick`.`repingresosdetallado1`.`iva` AS `iva`,`bdclick`.`repingresosdetallado1`.`impoconsumo` AS `impoconsumo`,`bdclick`.`repingresosdetallado1`.`total` AS `total`,`bdclick`.`repingresosdetallado1`.`fechaFactura` AS `fechaFactura`,`bdclick`.`repingresosdetallado1`.`proveedor` AS `proveedor`,`bdclick`.`repingresosdetallado1`.`nombre` AS `nombre`,`bdclick`.`repingresosdetallado1`.`Año` AS `Año`,`bdclick`.`repingresosdetallado1`.`Mes` AS `Mes`,`bdclick`.`repingresosdetallado1`.`Grupo` AS `Grupo`,`bdclick`.`repingresosdetallado1`.`Sub_grupo` AS `Sub_grupo`,`bdclick`.`repingresosdetallado1`.`anulada` AS `anulada`,`bdclick`.`repingresosdetallado1`.`terminal` AS `terminal`,`bdclick`.`repingresosdetallado1`.`concepto` AS `concepto`,`bdclick`.`repingresosdetallado1`.`ubicacion1` AS `ubicacion1`,`bdclick`.`repingresosdetallado1`.`referencia` AS `referencia`,`bdclick`.`repingresosdetallado1`.`L1` AS `L1`,`bdclick`.`repingresosdetallado1`.`L2` AS `L2`,`bdclick`.`repingresosdetallado1`.`descuento` AS `descuento`,`bdclick`.`repingresosdetallado1`.`totalIng` AS `totalIng`,`bdclick`.`repingresosdetallado1`.`descuentosIng` AS `descuentosIng`,`bdclick`.`repingresosdetallado1`.`ivaIng` AS `ivaIng`,`bdclick`.`repingresosdetallado1`.`impoconsumoIng` AS `impoconsumoIng`,`bdclick`.`repingresosdetallado1`.`subtotalIng` AS `subtotalIng`,`bdclick`.`repingresosdetallado1`.`rtIva` AS `rtIva`,`bdclick`.`repingresosdetallado1`.`rtFuente` AS `rtFuente`,`bdclick`.`repingresosdetallado1`.`porRtFuente` AS `porRtFuente`,`bdclick`.`repingresosdetallado1`.`tipo` AS `tipo`,`bdclick`.`repingresosdetallado1`.`hora` AS `hora`,`bdclick`.`repingresosdetallado1`.`CodigoProd` AS `CodigoProd`,`bdclick`.`repingresosdetallado1`.`IdProveedor` AS `IdProveedor`,`bdclick`.`bddetalleproductos`.`imei` AS `imei`,`bdclick`.`bddetalleproductos`.`color` AS `color` from (`bdclick`.`repingresosdetallado1` left join `bdclick`.`bddetalleproductos` on(((`bdclick`.`repingresosdetallado1`.`producto` = `bdclick`.`bddetalleproductos`.`codProducto`) and (`bdclick`.`repingresosdetallado1`.`ingreso` = `bdclick`.`bddetalleproductos`.`numIngreso`))))
mariadb-version=100135
