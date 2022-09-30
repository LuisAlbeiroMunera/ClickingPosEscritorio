TYPE=VIEW
query=select `bdclick3`.`bdparqueaderoautos`.`Id` AS `Id`,`bdclick3`.`bdparqueaderoautos`.`placa` AS `placa`,`bdclick3`.`bdparqueaderoautos`.`producto` AS `producto`,`bdclick3`.`bdparqueaderoautos`.`fIngreso` AS `fIngreso`,`bdclick3`.`bdparqueaderoautos`.`fSalida` AS `fSalida`,`bdclick3`.`bdparqueaderoautos`.`hIngreso` AS `hIngreso`,`bdclick3`.`bdparqueaderoautos`.`hSalida` AS `hSalida`,`bdclick3`.`bdparqueaderoautos`.`observacion` AS `observacion`,`bdclick3`.`bdparqueaderoautos`.`estado` AS `estado`,`bdclick3`.`bdparqueaderoautos`.`factura` AS `factura`,`bdclick3`.`bdproductos`.`Descripcion` AS `Descripcion` from (`bdclick3`.`bdproductos` join `bdclick3`.`bdparqueaderoautos` on((`bdclick3`.`bdproductos`.`idSistema` = `bdclick3`.`bdparqueaderoautos`.`producto`))) where (`bdclick3`.`bdparqueaderoautos`.`estado` = \'PENDIENTE\')
md5=a93c53ed80e1004368676652d575aee0
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:52
create-version=2
source=select `bdparqueaderoautos`.`Id` AS `Id`,`bdparqueaderoautos`.`placa` AS `placa`,`bdparqueaderoautos`.`producto` AS `producto`,`bdparqueaderoautos`.`fIngreso` AS `fIngreso`,`bdparqueaderoautos`.`fSalida` AS `fSalida`,`bdparqueaderoautos`.`hIngreso` AS `hIngreso`,`bdparqueaderoautos`.`hSalida` AS `hSalida`,`bdparqueaderoautos`.`observacion` AS `observacion`,`bdparqueaderoautos`.`estado` AS `estado`,`bdparqueaderoautos`.`factura` AS `factura`,`bdproductos`.`Descripcion` AS `Descripcion` from (`bdproductos` join `bdparqueaderoautos` on((`bdproductos`.`idSistema` = `bdparqueaderoautos`.`producto`))) where (`bdparqueaderoautos`.`estado` = \'PENDIENTE\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdparqueaderoautos`.`Id` AS `Id`,`bdclick3`.`bdparqueaderoautos`.`placa` AS `placa`,`bdclick3`.`bdparqueaderoautos`.`producto` AS `producto`,`bdclick3`.`bdparqueaderoautos`.`fIngreso` AS `fIngreso`,`bdclick3`.`bdparqueaderoautos`.`fSalida` AS `fSalida`,`bdclick3`.`bdparqueaderoautos`.`hIngreso` AS `hIngreso`,`bdclick3`.`bdparqueaderoautos`.`hSalida` AS `hSalida`,`bdclick3`.`bdparqueaderoautos`.`observacion` AS `observacion`,`bdclick3`.`bdparqueaderoautos`.`estado` AS `estado`,`bdclick3`.`bdparqueaderoautos`.`factura` AS `factura`,`bdclick3`.`bdproductos`.`Descripcion` AS `Descripcion` from (`bdclick3`.`bdproductos` join `bdclick3`.`bdparqueaderoautos` on((`bdclick3`.`bdproductos`.`idSistema` = `bdclick3`.`bdparqueaderoautos`.`producto`))) where (`bdclick3`.`bdparqueaderoautos`.`estado` = \'PENDIENTE\')
mariadb-version=100135
