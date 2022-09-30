TYPE=VIEW
query=select `bdclick`.`bdparqueaderoautos`.`Id` AS `Id`,`bdclick`.`bdparqueaderoautos`.`placa` AS `placa`,`bdclick`.`bdparqueaderoautos`.`producto` AS `producto`,`bdclick`.`bdparqueaderoautos`.`fIngreso` AS `fIngreso`,`bdclick`.`bdparqueaderoautos`.`fSalida` AS `fSalida`,`bdclick`.`bdparqueaderoautos`.`hIngreso` AS `hIngreso`,`bdclick`.`bdparqueaderoautos`.`hSalida` AS `hSalida`,`bdclick`.`bdparqueaderoautos`.`observacion` AS `observacion`,`bdclick`.`bdparqueaderoautos`.`estado` AS `estado`,`bdclick`.`bdparqueaderoautos`.`factura` AS `factura`,`bdclick`.`bdproductos`.`Descripcion` AS `DescripcionProducto`,if(isnull(`bdclick`.`bdterceros`.`nombre`),\'1010\',`bdclick`.`bdterceros`.`id`) AS `TerceroId`,if(isnull(`bdclick`.`bdterceros`.`nombre`),\'VENTAS MOSTRADOR\',`bdclick`.`bdterceros`.`nombre`) AS `TerceroNombre`,if(isnull(`bdclick`.`bdterceros`.`nombre`),\'\',`bdclick`.`bdterceros`.`telefono`) AS `TerceroTelefono`,1 AS `num`,`bdclick`.`bdparqueaderoautos`.`fIngreso` AS `fecha`,if(isnull(`bdclick`.`bdterceros`.`nombre`),\'1010\',`bdclick`.`bdterceros`.`id`) AS `cliente`,`bdclick`.`bdparqueaderoautos`.`horas` AS `totTiempo`,`bdclick`.`bdplacas`.`tipo` AS `tipoVehiculo`,`bdclick`.`bdcxc`.`estado` AS `estadoPago` from ((((`bdclick`.`bdproductos` join `bdclick`.`bdparqueaderoautos` on((`bdclick`.`bdproductos`.`idSistema` = `bdclick`.`bdparqueaderoautos`.`producto`))) left join `bdclick`.`bdplacas` on((`bdclick`.`bdplacas`.`placa` = `bdclick`.`bdparqueaderoautos`.`placa`))) left join `bdclick`.`bdcxc` on((`bdclick`.`bdcxc`.`factura2` = `bdclick`.`bdparqueaderoautos`.`factura`))) left join `bdclick`.`bdterceros` on((`bdclick`.`bdplacas`.`usuario` = `bdclick`.`bdterceros`.`idSistema`)))
md5=2c4ff24dc94a0130003283d79b3a82dc
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:25
create-version=2
source=select `bdparqueaderoautos`.`Id` AS `Id`,`bdparqueaderoautos`.`placa` AS `placa`,`bdparqueaderoautos`.`producto` AS `producto`,`bdparqueaderoautos`.`fIngreso` AS `fIngreso`,`bdparqueaderoautos`.`fSalida` AS `fSalida`,`bdparqueaderoautos`.`hIngreso` AS `hIngreso`,`bdparqueaderoautos`.`hSalida` AS `hSalida`,`bdparqueaderoautos`.`observacion` AS `observacion`,`bdparqueaderoautos`.`estado` AS `estado`,`bdparqueaderoautos`.`factura` AS `factura`,`bdproductos`.`Descripcion` AS `DescripcionProducto`,if(isnull(`bdterceros`.`nombre`),\'1010\',`bdterceros`.`id`) AS `TerceroId`,if(isnull(`bdterceros`.`nombre`),\'VENTAS MOSTRADOR\',`bdterceros`.`nombre`) AS `TerceroNombre`,if(isnull(`bdterceros`.`nombre`),\'\',`bdterceros`.`telefono`) AS `TerceroTelefono`,1 AS `num`,`bdparqueaderoautos`.`fIngreso` AS `fecha`,if(isnull(`bdterceros`.`nombre`),\'1010\',`bdterceros`.`id`) AS `cliente`,`bdparqueaderoautos`.`horas` AS `totTiempo`,`bdplacas`.`tipo` AS `tipoVehiculo`,`bdcxc`.`estado` AS `estadoPago` from ((((`bdproductos` join `bdparqueaderoautos` on((`bdproductos`.`idSistema` = `bdparqueaderoautos`.`producto`))) left join `bdplacas` on((`bdplacas`.`placa` = `bdparqueaderoautos`.`placa`))) left join `bdcxc` on((`bdcxc`.`factura2` = `bdparqueaderoautos`.`factura`))) left join `bdterceros` on((`bdplacas`.`usuario` = `bdterceros`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdparqueaderoautos`.`Id` AS `Id`,`bdclick`.`bdparqueaderoautos`.`placa` AS `placa`,`bdclick`.`bdparqueaderoautos`.`producto` AS `producto`,`bdclick`.`bdparqueaderoautos`.`fIngreso` AS `fIngreso`,`bdclick`.`bdparqueaderoautos`.`fSalida` AS `fSalida`,`bdclick`.`bdparqueaderoautos`.`hIngreso` AS `hIngreso`,`bdclick`.`bdparqueaderoautos`.`hSalida` AS `hSalida`,`bdclick`.`bdparqueaderoautos`.`observacion` AS `observacion`,`bdclick`.`bdparqueaderoautos`.`estado` AS `estado`,`bdclick`.`bdparqueaderoautos`.`factura` AS `factura`,`bdclick`.`bdproductos`.`Descripcion` AS `DescripcionProducto`,if(isnull(`bdclick`.`bdterceros`.`nombre`),\'1010\',`bdclick`.`bdterceros`.`id`) AS `TerceroId`,if(isnull(`bdclick`.`bdterceros`.`nombre`),\'VENTAS MOSTRADOR\',`bdclick`.`bdterceros`.`nombre`) AS `TerceroNombre`,if(isnull(`bdclick`.`bdterceros`.`nombre`),\'\',`bdclick`.`bdterceros`.`telefono`) AS `TerceroTelefono`,1 AS `num`,`bdclick`.`bdparqueaderoautos`.`fIngreso` AS `fecha`,if(isnull(`bdclick`.`bdterceros`.`nombre`),\'1010\',`bdclick`.`bdterceros`.`id`) AS `cliente`,`bdclick`.`bdparqueaderoautos`.`horas` AS `totTiempo`,`bdclick`.`bdplacas`.`tipo` AS `tipoVehiculo`,`bdclick`.`bdcxc`.`estado` AS `estadoPago` from ((((`bdclick`.`bdproductos` join `bdclick`.`bdparqueaderoautos` on((`bdclick`.`bdproductos`.`idSistema` = `bdclick`.`bdparqueaderoautos`.`producto`))) left join `bdclick`.`bdplacas` on((`bdclick`.`bdplacas`.`placa` = `bdclick`.`bdparqueaderoautos`.`placa`))) left join `bdclick`.`bdcxc` on((`bdclick`.`bdcxc`.`factura2` = `bdclick`.`bdparqueaderoautos`.`factura`))) left join `bdclick`.`bdterceros` on((`bdclick`.`bdplacas`.`usuario` = `bdclick`.`bdterceros`.`idSistema`)))
mariadb-version=100135