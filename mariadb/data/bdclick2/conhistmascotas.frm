TYPE=VIEW
query=select `bdclick2`.`bdhistoria`.`Id` AS `Id`,`bdclick2`.`bdmascotas`.`codigo` AS `codigo`,`bdclick2`.`bdmascotas`.`cliente` AS `cliente`,`bdclick2`.`bdmascotas`.`nombre` AS `nombre`,`bdclick2`.`bdmascotas`.`especie` AS `especie`,`bdclick2`.`bdmascotas`.`raza` AS `raza`,`bdclick2`.`bdmascotas`.`genero` AS `genero`,`bdclick2`.`bdmascotas`.`restricciones` AS `restricciones`,`bdclick2`.`bdmascotas`.`edad` AS `edad`,`bdclick2`.`bdmascotas`.`alimentacion` AS `alimentacion`,`bdclick2`.`bdmascotas`.`observaciones` AS `observaciones`,`bdclick2`.`bdmascotas`.`foto` AS `foto`,`bdclick2`.`bdmascotas`.`color` AS `color`,`bdclick2`.`bdmascotas`.`temperamento` AS `temperamento`,`bdclick2`.`bdmascotas`.`observacion` AS `observacion`,`bdclick2`.`bdterceros`.`id` AS `cedula`,`bdclick2`.`bdterceros`.`nombre` AS `nombreCliente`,`bdclick2`.`bdterceros`.`telefono` AS `telefono`,`bdclick2`.`bdterceros`.`celular` AS `celular`,`bdclick2`.`bdterceros`.`direccion` AS `direccion`,`bdclick2`.`bdhistoria`.`motivo` AS `diagnosticoHistoria`,`bdclick2`.`bdhistoria`.`evolucion` AS `evolucionHistoria`,`bdclick2`.`bdhistoria`.`enfermedades` AS `enfermedadesHistoria`,`bdclick2`.`bdhistoria`.`enfermedades` AS `tratamientosHistoria` from ((`bdclick2`.`bdhistoria` left join `bdclick2`.`bdmascotas` on((`bdclick2`.`bdmascotas`.`codigo` = `bdclick2`.`bdhistoria`.`mascota`))) left join `bdclick2`.`bdterceros` on((`bdclick2`.`bdmascotas`.`cliente` = `bdclick2`.`bdterceros`.`idSistema`)))
md5=2a347762c9e7469c1a4f413c0fc87f15
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:43
create-version=2
source=select `bdhistoria`.`Id` AS `Id`,`bdmascotas`.`codigo` AS `codigo`,`bdmascotas`.`cliente` AS `cliente`,`bdmascotas`.`nombre` AS `nombre`,`bdmascotas`.`especie` AS `especie`,`bdmascotas`.`raza` AS `raza`,`bdmascotas`.`genero` AS `genero`,`bdmascotas`.`restricciones` AS `restricciones`,`bdmascotas`.`edad` AS `edad`,`bdmascotas`.`alimentacion` AS `alimentacion`,`bdmascotas`.`observaciones` AS `observaciones`,`bdmascotas`.`foto` AS `foto`,`bdmascotas`.`color` AS `color`,`bdmascotas`.`temperamento` AS `temperamento`,`bdmascotas`.`observacion` AS `observacion`,`bdterceros`.`id` AS `cedula`,`bdterceros`.`nombre` AS `nombreCliente`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`celular` AS `celular`,`bdterceros`.`direccion` AS `direccion`,`bdhistoria`.`motivo` AS `diagnosticoHistoria`,`bdhistoria`.`evolucion` AS `evolucionHistoria`,`bdhistoria`.`enfermedades` AS `enfermedadesHistoria`,`bdhistoria`.`enfermedades` AS `tratamientosHistoria` from ((`bdhistoria` left join `bdmascotas` on((`bdmascotas`.`codigo` = `bdhistoria`.`mascota`))) left join `bdterceros` on((`bdmascotas`.`cliente` = `bdterceros`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdhistoria`.`Id` AS `Id`,`bdclick2`.`bdmascotas`.`codigo` AS `codigo`,`bdclick2`.`bdmascotas`.`cliente` AS `cliente`,`bdclick2`.`bdmascotas`.`nombre` AS `nombre`,`bdclick2`.`bdmascotas`.`especie` AS `especie`,`bdclick2`.`bdmascotas`.`raza` AS `raza`,`bdclick2`.`bdmascotas`.`genero` AS `genero`,`bdclick2`.`bdmascotas`.`restricciones` AS `restricciones`,`bdclick2`.`bdmascotas`.`edad` AS `edad`,`bdclick2`.`bdmascotas`.`alimentacion` AS `alimentacion`,`bdclick2`.`bdmascotas`.`observaciones` AS `observaciones`,`bdclick2`.`bdmascotas`.`foto` AS `foto`,`bdclick2`.`bdmascotas`.`color` AS `color`,`bdclick2`.`bdmascotas`.`temperamento` AS `temperamento`,`bdclick2`.`bdmascotas`.`observacion` AS `observacion`,`bdclick2`.`bdterceros`.`id` AS `cedula`,`bdclick2`.`bdterceros`.`nombre` AS `nombreCliente`,`bdclick2`.`bdterceros`.`telefono` AS `telefono`,`bdclick2`.`bdterceros`.`celular` AS `celular`,`bdclick2`.`bdterceros`.`direccion` AS `direccion`,`bdclick2`.`bdhistoria`.`motivo` AS `diagnosticoHistoria`,`bdclick2`.`bdhistoria`.`evolucion` AS `evolucionHistoria`,`bdclick2`.`bdhistoria`.`enfermedades` AS `enfermedadesHistoria`,`bdclick2`.`bdhistoria`.`enfermedades` AS `tratamientosHistoria` from ((`bdclick2`.`bdhistoria` left join `bdclick2`.`bdmascotas` on((`bdclick2`.`bdmascotas`.`codigo` = `bdclick2`.`bdhistoria`.`mascota`))) left join `bdclick2`.`bdterceros` on((`bdclick2`.`bdmascotas`.`cliente` = `bdclick2`.`bdterceros`.`idSistema`)))
mariadb-version=100135