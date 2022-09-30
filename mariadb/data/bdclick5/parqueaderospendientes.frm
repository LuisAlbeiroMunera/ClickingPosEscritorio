TYPE=VIEW
query=select `bdclick5`.`bdparqueaderoautos`.`Id` AS `Id`,`bdclick5`.`bdparqueaderoautos`.`placa` AS `placa`,`bdclick5`.`bdparqueaderoautos`.`producto` AS `producto`,`bdclick5`.`bdparqueaderoautos`.`fIngreso` AS `fIngreso`,`bdclick5`.`bdparqueaderoautos`.`fSalida` AS `fSalida`,`bdclick5`.`bdparqueaderoautos`.`hIngreso` AS `hIngreso`,`bdclick5`.`bdparqueaderoautos`.`hSalida` AS `hSalida`,`bdclick5`.`bdparqueaderoautos`.`observacion` AS `observacion`,`bdclick5`.`bdparqueaderoautos`.`estado` AS `estado`,`bdclick5`.`bdparqueaderoautos`.`factura` AS `factura`,`bdclick5`.`bdproductos`.`Descripcion` AS `Descripcion` from (`bdclick5`.`bdproductos` join `bdclick5`.`bdparqueaderoautos` on((`bdclick5`.`bdproductos`.`idSistema` = `bdclick5`.`bdparqueaderoautos`.`producto`))) where (`bdclick5`.`bdparqueaderoautos`.`estado` = \'PENDIENTE\')
md5=c40903f3703e6527c43a515711ecc835
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:48
create-version=2
source=select `bdparqueaderoautos`.`Id` AS `Id`,`bdparqueaderoautos`.`placa` AS `placa`,`bdparqueaderoautos`.`producto` AS `producto`,`bdparqueaderoautos`.`fIngreso` AS `fIngreso`,`bdparqueaderoautos`.`fSalida` AS `fSalida`,`bdparqueaderoautos`.`hIngreso` AS `hIngreso`,`bdparqueaderoautos`.`hSalida` AS `hSalida`,`bdparqueaderoautos`.`observacion` AS `observacion`,`bdparqueaderoautos`.`estado` AS `estado`,`bdparqueaderoautos`.`factura` AS `factura`,`bdproductos`.`Descripcion` AS `Descripcion` from (`bdproductos` join `bdparqueaderoautos` on((`bdproductos`.`idSistema` = `bdparqueaderoautos`.`producto`))) where (`bdparqueaderoautos`.`estado` = \'PENDIENTE\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdparqueaderoautos`.`Id` AS `Id`,`bdclick5`.`bdparqueaderoautos`.`placa` AS `placa`,`bdclick5`.`bdparqueaderoautos`.`producto` AS `producto`,`bdclick5`.`bdparqueaderoautos`.`fIngreso` AS `fIngreso`,`bdclick5`.`bdparqueaderoautos`.`fSalida` AS `fSalida`,`bdclick5`.`bdparqueaderoautos`.`hIngreso` AS `hIngreso`,`bdclick5`.`bdparqueaderoautos`.`hSalida` AS `hSalida`,`bdclick5`.`bdparqueaderoautos`.`observacion` AS `observacion`,`bdclick5`.`bdparqueaderoautos`.`estado` AS `estado`,`bdclick5`.`bdparqueaderoautos`.`factura` AS `factura`,`bdclick5`.`bdproductos`.`Descripcion` AS `Descripcion` from (`bdclick5`.`bdproductos` join `bdclick5`.`bdparqueaderoautos` on((`bdclick5`.`bdproductos`.`idSistema` = `bdclick5`.`bdparqueaderoautos`.`producto`))) where (`bdclick5`.`bdparqueaderoautos`.`estado` = \'PENDIENTE\')
mariadb-version=100135
