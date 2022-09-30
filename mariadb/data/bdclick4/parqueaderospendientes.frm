TYPE=VIEW
query=select `bdclick4`.`bdparqueaderoautos`.`Id` AS `Id`,`bdclick4`.`bdparqueaderoautos`.`placa` AS `placa`,`bdclick4`.`bdparqueaderoautos`.`producto` AS `producto`,`bdclick4`.`bdparqueaderoautos`.`fIngreso` AS `fIngreso`,`bdclick4`.`bdparqueaderoautos`.`fSalida` AS `fSalida`,`bdclick4`.`bdparqueaderoautos`.`hIngreso` AS `hIngreso`,`bdclick4`.`bdparqueaderoautos`.`hSalida` AS `hSalida`,`bdclick4`.`bdparqueaderoautos`.`observacion` AS `observacion`,`bdclick4`.`bdparqueaderoautos`.`estado` AS `estado`,`bdclick4`.`bdparqueaderoautos`.`factura` AS `factura`,`bdclick4`.`bdproductos`.`Descripcion` AS `Descripcion` from (`bdclick4`.`bdproductos` join `bdclick4`.`bdparqueaderoautos` on((`bdclick4`.`bdproductos`.`idSistema` = `bdclick4`.`bdparqueaderoautos`.`producto`))) where (`bdclick4`.`bdparqueaderoautos`.`estado` = \'PENDIENTE\')
md5=6b1bd8c00a3c835179bf714f09a5147a
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:29
create-version=2
source=select `bdparqueaderoautos`.`Id` AS `Id`,`bdparqueaderoautos`.`placa` AS `placa`,`bdparqueaderoautos`.`producto` AS `producto`,`bdparqueaderoautos`.`fIngreso` AS `fIngreso`,`bdparqueaderoautos`.`fSalida` AS `fSalida`,`bdparqueaderoautos`.`hIngreso` AS `hIngreso`,`bdparqueaderoautos`.`hSalida` AS `hSalida`,`bdparqueaderoautos`.`observacion` AS `observacion`,`bdparqueaderoautos`.`estado` AS `estado`,`bdparqueaderoautos`.`factura` AS `factura`,`bdproductos`.`Descripcion` AS `Descripcion` from (`bdproductos` join `bdparqueaderoautos` on((`bdproductos`.`idSistema` = `bdparqueaderoautos`.`producto`))) where (`bdparqueaderoautos`.`estado` = \'PENDIENTE\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdparqueaderoautos`.`Id` AS `Id`,`bdclick4`.`bdparqueaderoautos`.`placa` AS `placa`,`bdclick4`.`bdparqueaderoautos`.`producto` AS `producto`,`bdclick4`.`bdparqueaderoautos`.`fIngreso` AS `fIngreso`,`bdclick4`.`bdparqueaderoautos`.`fSalida` AS `fSalida`,`bdclick4`.`bdparqueaderoautos`.`hIngreso` AS `hIngreso`,`bdclick4`.`bdparqueaderoautos`.`hSalida` AS `hSalida`,`bdclick4`.`bdparqueaderoautos`.`observacion` AS `observacion`,`bdclick4`.`bdparqueaderoautos`.`estado` AS `estado`,`bdclick4`.`bdparqueaderoautos`.`factura` AS `factura`,`bdclick4`.`bdproductos`.`Descripcion` AS `Descripcion` from (`bdclick4`.`bdproductos` join `bdclick4`.`bdparqueaderoautos` on((`bdclick4`.`bdproductos`.`idSistema` = `bdclick4`.`bdparqueaderoautos`.`producto`))) where (`bdclick4`.`bdparqueaderoautos`.`estado` = \'PENDIENTE\')
mariadb-version=100135
