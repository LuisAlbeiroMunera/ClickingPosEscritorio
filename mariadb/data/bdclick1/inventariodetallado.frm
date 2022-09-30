TYPE=VIEW
query=select `bdclick1`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick1`.`bdproductos`.`idSistema` AS `idSistema`,`bdclick1`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick1`.`bddetalleproductos`.`cantidad` AS `cantidad`,`bdclick1`.`bddetalleproductos`.`imei` AS `imei`,`bdclick1`.`bddetalleproductos`.`color` AS `color`,`bdclick1`.`bddetalleproductos`.`talla` AS `talla`,`bdclick1`.`bddetalleproductos`.`lote` AS `lote`,`bdclick1`.`bddetalleproductos`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick1`.`bddetalleproductos`.`temperatura` AS `temperatura`,`bdclick1`.`bddetalleproductos`.`estado` AS `estado`,`bdclick1`.`bddetalleproductos`.`bodega` AS `bodega`,`bdclick1`.`bdproductos`.`Proveedor` AS `Proveedor` from (`bdclick1`.`bddetalleproductos` left join (`bdclick1`.`bdproductos` left join `bdclick1`.`bdgrupo` on((`bdclick1`.`bdgrupo`.`codigo` = `bdclick1`.`bdproductos`.`grupo`))) on((`bdclick1`.`bdproductos`.`idSistema` = `bdclick1`.`bddetalleproductos`.`codProducto`))) where ((`bdclick1`.`bddetalleproductos`.`estado` = \'DISPONIBLE\') or (`bdclick1`.`bddetalleproductos`.`estado` = \'PRESTADO\'))
md5=d7bea7131bcb7bbce73dc92421f8cfb6
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:35
create-version=2
source=select `bdproductos`.`Codigo` AS `Codigo`,`bdproductos`.`idSistema` AS `idSistema`,`bdproductos`.`Descripcion` AS `Descripcion`,`bddetalleproductos`.`cantidad` AS `cantidad`,`bddetalleproductos`.`imei` AS `imei`,`bddetalleproductos`.`color` AS `color`,`bddetalleproductos`.`talla` AS `talla`,`bddetalleproductos`.`lote` AS `lote`,`bddetalleproductos`.`fechaVencimiento` AS `fechaVencimiento`,`bddetalleproductos`.`temperatura` AS `temperatura`,`bddetalleproductos`.`estado` AS `estado`,`bddetalleproductos`.`bodega` AS `bodega`,`bdproductos`.`Proveedor` AS `Proveedor` from (`bddetalleproductos` left join (`bdproductos` left join `bdgrupo` on((`bdgrupo`.`codigo` = `bdproductos`.`grupo`))) on((`bdproductos`.`idSistema` = `bddetalleproductos`.`codProducto`))) where ((`bddetalleproductos`.`estado` = \'DISPONIBLE\') or (`bddetalleproductos`.`estado` = \'PRESTADO\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick1`.`bdproductos`.`idSistema` AS `idSistema`,`bdclick1`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick1`.`bddetalleproductos`.`cantidad` AS `cantidad`,`bdclick1`.`bddetalleproductos`.`imei` AS `imei`,`bdclick1`.`bddetalleproductos`.`color` AS `color`,`bdclick1`.`bddetalleproductos`.`talla` AS `talla`,`bdclick1`.`bddetalleproductos`.`lote` AS `lote`,`bdclick1`.`bddetalleproductos`.`fechaVencimiento` AS `fechaVencimiento`,`bdclick1`.`bddetalleproductos`.`temperatura` AS `temperatura`,`bdclick1`.`bddetalleproductos`.`estado` AS `estado`,`bdclick1`.`bddetalleproductos`.`bodega` AS `bodega`,`bdclick1`.`bdproductos`.`Proveedor` AS `Proveedor` from (`bdclick1`.`bddetalleproductos` left join (`bdclick1`.`bdproductos` left join `bdclick1`.`bdgrupo` on((`bdclick1`.`bdgrupo`.`codigo` = `bdclick1`.`bdproductos`.`grupo`))) on((`bdclick1`.`bdproductos`.`idSistema` = `bdclick1`.`bddetalleproductos`.`codProducto`))) where ((`bdclick1`.`bddetalleproductos`.`estado` = \'DISPONIBLE\') or (`bdclick1`.`bddetalleproductos`.`estado` = \'PRESTADO\'))
mariadb-version=100135
