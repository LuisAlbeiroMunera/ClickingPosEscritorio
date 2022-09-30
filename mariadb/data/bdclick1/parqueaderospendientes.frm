TYPE=VIEW
query=select `bdclick1`.`bdparqueaderoautos`.`Id` AS `Id`,`bdclick1`.`bdparqueaderoautos`.`placa` AS `placa`,`bdclick1`.`bdparqueaderoautos`.`producto` AS `producto`,`bdclick1`.`bdparqueaderoautos`.`fIngreso` AS `fIngreso`,`bdclick1`.`bdparqueaderoautos`.`fSalida` AS `fSalida`,`bdclick1`.`bdparqueaderoautos`.`hIngreso` AS `hIngreso`,`bdclick1`.`bdparqueaderoautos`.`hSalida` AS `hSalida`,`bdclick1`.`bdparqueaderoautos`.`observacion` AS `observacion`,`bdclick1`.`bdparqueaderoautos`.`estado` AS `estado`,`bdclick1`.`bdparqueaderoautos`.`factura` AS `factura`,`bdclick1`.`bdproductos`.`Descripcion` AS `Descripcion` from (`bdclick1`.`bdproductos` join `bdclick1`.`bdparqueaderoautos` on((`bdclick1`.`bdproductos`.`idSistema` = `bdclick1`.`bdparqueaderoautos`.`producto`))) where (`bdclick1`.`bdparqueaderoautos`.`estado` = \'PENDIENTE\')
md5=24822ee889edb616c53ad9fadf9e2820
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:35
create-version=2
source=select `bdparqueaderoautos`.`Id` AS `Id`,`bdparqueaderoautos`.`placa` AS `placa`,`bdparqueaderoautos`.`producto` AS `producto`,`bdparqueaderoautos`.`fIngreso` AS `fIngreso`,`bdparqueaderoautos`.`fSalida` AS `fSalida`,`bdparqueaderoautos`.`hIngreso` AS `hIngreso`,`bdparqueaderoautos`.`hSalida` AS `hSalida`,`bdparqueaderoautos`.`observacion` AS `observacion`,`bdparqueaderoautos`.`estado` AS `estado`,`bdparqueaderoautos`.`factura` AS `factura`,`bdproductos`.`Descripcion` AS `Descripcion` from (`bdproductos` join `bdparqueaderoautos` on((`bdproductos`.`idSistema` = `bdparqueaderoautos`.`producto`))) where (`bdparqueaderoautos`.`estado` = \'PENDIENTE\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdparqueaderoautos`.`Id` AS `Id`,`bdclick1`.`bdparqueaderoautos`.`placa` AS `placa`,`bdclick1`.`bdparqueaderoautos`.`producto` AS `producto`,`bdclick1`.`bdparqueaderoautos`.`fIngreso` AS `fIngreso`,`bdclick1`.`bdparqueaderoautos`.`fSalida` AS `fSalida`,`bdclick1`.`bdparqueaderoautos`.`hIngreso` AS `hIngreso`,`bdclick1`.`bdparqueaderoautos`.`hSalida` AS `hSalida`,`bdclick1`.`bdparqueaderoautos`.`observacion` AS `observacion`,`bdclick1`.`bdparqueaderoautos`.`estado` AS `estado`,`bdclick1`.`bdparqueaderoautos`.`factura` AS `factura`,`bdclick1`.`bdproductos`.`Descripcion` AS `Descripcion` from (`bdclick1`.`bdproductos` join `bdclick1`.`bdparqueaderoautos` on((`bdclick1`.`bdproductos`.`idSistema` = `bdclick1`.`bdparqueaderoautos`.`producto`))) where (`bdclick1`.`bdparqueaderoautos`.`estado` = \'PENDIENTE\')
mariadb-version=100135
