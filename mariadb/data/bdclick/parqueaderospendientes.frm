TYPE=VIEW
query=select `bdclick`.`bdparqueaderoautos`.`Id` AS `Id`,`bdclick`.`bdparqueaderoautos`.`placa` AS `placa`,`bdclick`.`bdparqueaderoautos`.`producto` AS `producto`,`bdclick`.`bdparqueaderoautos`.`fIngreso` AS `fIngreso`,`bdclick`.`bdparqueaderoautos`.`fSalida` AS `fSalida`,`bdclick`.`bdparqueaderoautos`.`hIngreso` AS `hIngreso`,`bdclick`.`bdparqueaderoautos`.`hSalida` AS `hSalida`,`bdclick`.`bdparqueaderoautos`.`observacion` AS `observacion`,`bdclick`.`bdparqueaderoautos`.`estado` AS `estado`,`bdclick`.`bdparqueaderoautos`.`factura` AS `factura`,`bdclick`.`bdproductos`.`Descripcion` AS `Descripcion` from (`bdclick`.`bdproductos` join `bdclick`.`bdparqueaderoautos` on((`bdclick`.`bdproductos`.`idSistema` = `bdclick`.`bdparqueaderoautos`.`producto`))) where (`bdclick`.`bdparqueaderoautos`.`estado` = \'PENDIENTE\')
md5=3c32729f00ceb46fec7b16ef14a25d22
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:25
create-version=2
source=select `bdparqueaderoautos`.`Id` AS `Id`,`bdparqueaderoautos`.`placa` AS `placa`,`bdparqueaderoautos`.`producto` AS `producto`,`bdparqueaderoautos`.`fIngreso` AS `fIngreso`,`bdparqueaderoautos`.`fSalida` AS `fSalida`,`bdparqueaderoautos`.`hIngreso` AS `hIngreso`,`bdparqueaderoautos`.`hSalida` AS `hSalida`,`bdparqueaderoautos`.`observacion` AS `observacion`,`bdparqueaderoautos`.`estado` AS `estado`,`bdparqueaderoautos`.`factura` AS `factura`,`bdproductos`.`Descripcion` AS `Descripcion` from (`bdproductos` join `bdparqueaderoautos` on((`bdproductos`.`idSistema` = `bdparqueaderoautos`.`producto`))) where (`bdparqueaderoautos`.`estado` = \'PENDIENTE\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdparqueaderoautos`.`Id` AS `Id`,`bdclick`.`bdparqueaderoautos`.`placa` AS `placa`,`bdclick`.`bdparqueaderoautos`.`producto` AS `producto`,`bdclick`.`bdparqueaderoautos`.`fIngreso` AS `fIngreso`,`bdclick`.`bdparqueaderoautos`.`fSalida` AS `fSalida`,`bdclick`.`bdparqueaderoautos`.`hIngreso` AS `hIngreso`,`bdclick`.`bdparqueaderoautos`.`hSalida` AS `hSalida`,`bdclick`.`bdparqueaderoautos`.`observacion` AS `observacion`,`bdclick`.`bdparqueaderoautos`.`estado` AS `estado`,`bdclick`.`bdparqueaderoautos`.`factura` AS `factura`,`bdclick`.`bdproductos`.`Descripcion` AS `Descripcion` from (`bdclick`.`bdproductos` join `bdclick`.`bdparqueaderoautos` on((`bdclick`.`bdproductos`.`idSistema` = `bdclick`.`bdparqueaderoautos`.`producto`))) where (`bdclick`.`bdparqueaderoautos`.`estado` = \'PENDIENTE\')
mariadb-version=100135
