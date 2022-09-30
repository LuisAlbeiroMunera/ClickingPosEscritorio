TYPE=VIEW
query=select `bdclick2`.`bdparqueaderoautos`.`Id` AS `Id`,`bdclick2`.`bdparqueaderoautos`.`placa` AS `placa`,`bdclick2`.`bdparqueaderoautos`.`producto` AS `producto`,`bdclick2`.`bdparqueaderoautos`.`fIngreso` AS `fIngreso`,`bdclick2`.`bdparqueaderoautos`.`fSalida` AS `fSalida`,`bdclick2`.`bdparqueaderoautos`.`hIngreso` AS `hIngreso`,`bdclick2`.`bdparqueaderoautos`.`hSalida` AS `hSalida`,`bdclick2`.`bdparqueaderoautos`.`observacion` AS `observacion`,`bdclick2`.`bdparqueaderoautos`.`estado` AS `estado`,`bdclick2`.`bdparqueaderoautos`.`factura` AS `factura`,`bdclick2`.`bdproductos`.`Descripcion` AS `Descripcion` from (`bdclick2`.`bdproductos` join `bdclick2`.`bdparqueaderoautos` on((`bdclick2`.`bdproductos`.`idSistema` = `bdclick2`.`bdparqueaderoautos`.`producto`))) where (`bdclick2`.`bdparqueaderoautos`.`estado` = \'PENDIENTE\')
md5=b398624545a48e02cc0db7b72766fe55
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:46
create-version=2
source=select `bdparqueaderoautos`.`Id` AS `Id`,`bdparqueaderoautos`.`placa` AS `placa`,`bdparqueaderoautos`.`producto` AS `producto`,`bdparqueaderoautos`.`fIngreso` AS `fIngreso`,`bdparqueaderoautos`.`fSalida` AS `fSalida`,`bdparqueaderoautos`.`hIngreso` AS `hIngreso`,`bdparqueaderoautos`.`hSalida` AS `hSalida`,`bdparqueaderoautos`.`observacion` AS `observacion`,`bdparqueaderoautos`.`estado` AS `estado`,`bdparqueaderoautos`.`factura` AS `factura`,`bdproductos`.`Descripcion` AS `Descripcion` from (`bdproductos` join `bdparqueaderoautos` on((`bdproductos`.`idSistema` = `bdparqueaderoautos`.`producto`))) where (`bdparqueaderoautos`.`estado` = \'PENDIENTE\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdparqueaderoautos`.`Id` AS `Id`,`bdclick2`.`bdparqueaderoautos`.`placa` AS `placa`,`bdclick2`.`bdparqueaderoautos`.`producto` AS `producto`,`bdclick2`.`bdparqueaderoautos`.`fIngreso` AS `fIngreso`,`bdclick2`.`bdparqueaderoautos`.`fSalida` AS `fSalida`,`bdclick2`.`bdparqueaderoautos`.`hIngreso` AS `hIngreso`,`bdclick2`.`bdparqueaderoautos`.`hSalida` AS `hSalida`,`bdclick2`.`bdparqueaderoautos`.`observacion` AS `observacion`,`bdclick2`.`bdparqueaderoautos`.`estado` AS `estado`,`bdclick2`.`bdparqueaderoautos`.`factura` AS `factura`,`bdclick2`.`bdproductos`.`Descripcion` AS `Descripcion` from (`bdclick2`.`bdproductos` join `bdclick2`.`bdparqueaderoautos` on((`bdclick2`.`bdproductos`.`idSistema` = `bdclick2`.`bdparqueaderoautos`.`producto`))) where (`bdclick2`.`bdparqueaderoautos`.`estado` = \'PENDIENTE\')
mariadb-version=100135
