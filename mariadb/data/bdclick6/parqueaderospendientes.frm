TYPE=VIEW
query=select `bdclick6`.`bdparqueaderoautos`.`Id` AS `Id`,`bdclick6`.`bdparqueaderoautos`.`placa` AS `placa`,`bdclick6`.`bdparqueaderoautos`.`producto` AS `producto`,`bdclick6`.`bdparqueaderoautos`.`fIngreso` AS `fIngreso`,`bdclick6`.`bdparqueaderoautos`.`fSalida` AS `fSalida`,`bdclick6`.`bdparqueaderoautos`.`hIngreso` AS `hIngreso`,`bdclick6`.`bdparqueaderoautos`.`hSalida` AS `hSalida`,`bdclick6`.`bdparqueaderoautos`.`observacion` AS `observacion`,`bdclick6`.`bdparqueaderoautos`.`estado` AS `estado`,`bdclick6`.`bdparqueaderoautos`.`factura` AS `factura`,`bdclick6`.`bdproductos`.`Descripcion` AS `Descripcion` from (`bdclick6`.`bdproductos` join `bdclick6`.`bdparqueaderoautos` on((`bdclick6`.`bdproductos`.`idSistema` = `bdclick6`.`bdparqueaderoautos`.`producto`))) where (`bdclick6`.`bdparqueaderoautos`.`estado` = \'PENDIENTE\')
md5=aa714fd1c3e7561b0549cd3297ed3d60
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:36
create-version=2
source=select `bdparqueaderoautos`.`Id` AS `Id`,`bdparqueaderoautos`.`placa` AS `placa`,`bdparqueaderoautos`.`producto` AS `producto`,`bdparqueaderoautos`.`fIngreso` AS `fIngreso`,`bdparqueaderoautos`.`fSalida` AS `fSalida`,`bdparqueaderoautos`.`hIngreso` AS `hIngreso`,`bdparqueaderoautos`.`hSalida` AS `hSalida`,`bdparqueaderoautos`.`observacion` AS `observacion`,`bdparqueaderoautos`.`estado` AS `estado`,`bdparqueaderoautos`.`factura` AS `factura`,`bdproductos`.`Descripcion` AS `Descripcion` from (`bdproductos` join `bdparqueaderoautos` on((`bdproductos`.`idSistema` = `bdparqueaderoautos`.`producto`))) where (`bdparqueaderoautos`.`estado` = \'PENDIENTE\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdparqueaderoautos`.`Id` AS `Id`,`bdclick6`.`bdparqueaderoautos`.`placa` AS `placa`,`bdclick6`.`bdparqueaderoautos`.`producto` AS `producto`,`bdclick6`.`bdparqueaderoautos`.`fIngreso` AS `fIngreso`,`bdclick6`.`bdparqueaderoautos`.`fSalida` AS `fSalida`,`bdclick6`.`bdparqueaderoautos`.`hIngreso` AS `hIngreso`,`bdclick6`.`bdparqueaderoautos`.`hSalida` AS `hSalida`,`bdclick6`.`bdparqueaderoautos`.`observacion` AS `observacion`,`bdclick6`.`bdparqueaderoautos`.`estado` AS `estado`,`bdclick6`.`bdparqueaderoautos`.`factura` AS `factura`,`bdclick6`.`bdproductos`.`Descripcion` AS `Descripcion` from (`bdclick6`.`bdproductos` join `bdclick6`.`bdparqueaderoautos` on((`bdclick6`.`bdproductos`.`idSistema` = `bdclick6`.`bdparqueaderoautos`.`producto`))) where (`bdclick6`.`bdparqueaderoautos`.`estado` = \'PENDIENTE\')
mariadb-version=100135
