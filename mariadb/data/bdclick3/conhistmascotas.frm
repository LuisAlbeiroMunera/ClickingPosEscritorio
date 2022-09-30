TYPE=VIEW
query=select `bdclick3`.`bdhistoria`.`Id` AS `Id`,`bdclick3`.`bdmascotas`.`codigo` AS `codigo`,`bdclick3`.`bdmascotas`.`cliente` AS `cliente`,`bdclick3`.`bdmascotas`.`nombre` AS `nombre`,`bdclick3`.`bdmascotas`.`especie` AS `especie`,`bdclick3`.`bdmascotas`.`raza` AS `raza`,`bdclick3`.`bdmascotas`.`genero` AS `genero`,`bdclick3`.`bdmascotas`.`restricciones` AS `restricciones`,`bdclick3`.`bdmascotas`.`edad` AS `edad`,`bdclick3`.`bdmascotas`.`alimentacion` AS `alimentacion`,`bdclick3`.`bdmascotas`.`observaciones` AS `observaciones`,`bdclick3`.`bdmascotas`.`foto` AS `foto`,`bdclick3`.`bdmascotas`.`color` AS `color`,`bdclick3`.`bdmascotas`.`temperamento` AS `temperamento`,`bdclick3`.`bdmascotas`.`observacion` AS `observacion`,`bdclick3`.`bdterceros`.`id` AS `cedula`,`bdclick3`.`bdterceros`.`nombre` AS `nombreCliente`,`bdclick3`.`bdterceros`.`telefono` AS `telefono`,`bdclick3`.`bdterceros`.`celular` AS `celular`,`bdclick3`.`bdterceros`.`direccion` AS `direccion`,`bdclick3`.`bdhistoria`.`motivo` AS `diagnosticoHistoria`,`bdclick3`.`bdhistoria`.`evolucion` AS `evolucionHistoria`,`bdclick3`.`bdhistoria`.`enfermedades` AS `enfermedadesHistoria`,`bdclick3`.`bdhistoria`.`enfermedades` AS `tratamientosHistoria` from ((`bdclick3`.`bdhistoria` left join `bdclick3`.`bdmascotas` on((`bdclick3`.`bdmascotas`.`codigo` = `bdclick3`.`bdhistoria`.`mascota`))) left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdmascotas`.`cliente` = `bdclick3`.`bdterceros`.`idSistema`)))
md5=af04eeaeaabfd29e75dc4686ce169291
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:49
create-version=2
source=select `bdhistoria`.`Id` AS `Id`,`bdmascotas`.`codigo` AS `codigo`,`bdmascotas`.`cliente` AS `cliente`,`bdmascotas`.`nombre` AS `nombre`,`bdmascotas`.`especie` AS `especie`,`bdmascotas`.`raza` AS `raza`,`bdmascotas`.`genero` AS `genero`,`bdmascotas`.`restricciones` AS `restricciones`,`bdmascotas`.`edad` AS `edad`,`bdmascotas`.`alimentacion` AS `alimentacion`,`bdmascotas`.`observaciones` AS `observaciones`,`bdmascotas`.`foto` AS `foto`,`bdmascotas`.`color` AS `color`,`bdmascotas`.`temperamento` AS `temperamento`,`bdmascotas`.`observacion` AS `observacion`,`bdterceros`.`id` AS `cedula`,`bdterceros`.`nombre` AS `nombreCliente`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`celular` AS `celular`,`bdterceros`.`direccion` AS `direccion`,`bdhistoria`.`motivo` AS `diagnosticoHistoria`,`bdhistoria`.`evolucion` AS `evolucionHistoria`,`bdhistoria`.`enfermedades` AS `enfermedadesHistoria`,`bdhistoria`.`enfermedades` AS `tratamientosHistoria` from ((`bdhistoria` left join `bdmascotas` on((`bdmascotas`.`codigo` = `bdhistoria`.`mascota`))) left join `bdterceros` on((`bdmascotas`.`cliente` = `bdterceros`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdhistoria`.`Id` AS `Id`,`bdclick3`.`bdmascotas`.`codigo` AS `codigo`,`bdclick3`.`bdmascotas`.`cliente` AS `cliente`,`bdclick3`.`bdmascotas`.`nombre` AS `nombre`,`bdclick3`.`bdmascotas`.`especie` AS `especie`,`bdclick3`.`bdmascotas`.`raza` AS `raza`,`bdclick3`.`bdmascotas`.`genero` AS `genero`,`bdclick3`.`bdmascotas`.`restricciones` AS `restricciones`,`bdclick3`.`bdmascotas`.`edad` AS `edad`,`bdclick3`.`bdmascotas`.`alimentacion` AS `alimentacion`,`bdclick3`.`bdmascotas`.`observaciones` AS `observaciones`,`bdclick3`.`bdmascotas`.`foto` AS `foto`,`bdclick3`.`bdmascotas`.`color` AS `color`,`bdclick3`.`bdmascotas`.`temperamento` AS `temperamento`,`bdclick3`.`bdmascotas`.`observacion` AS `observacion`,`bdclick3`.`bdterceros`.`id` AS `cedula`,`bdclick3`.`bdterceros`.`nombre` AS `nombreCliente`,`bdclick3`.`bdterceros`.`telefono` AS `telefono`,`bdclick3`.`bdterceros`.`celular` AS `celular`,`bdclick3`.`bdterceros`.`direccion` AS `direccion`,`bdclick3`.`bdhistoria`.`motivo` AS `diagnosticoHistoria`,`bdclick3`.`bdhistoria`.`evolucion` AS `evolucionHistoria`,`bdclick3`.`bdhistoria`.`enfermedades` AS `enfermedadesHistoria`,`bdclick3`.`bdhistoria`.`enfermedades` AS `tratamientosHistoria` from ((`bdclick3`.`bdhistoria` left join `bdclick3`.`bdmascotas` on((`bdclick3`.`bdmascotas`.`codigo` = `bdclick3`.`bdhistoria`.`mascota`))) left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdmascotas`.`cliente` = `bdclick3`.`bdterceros`.`idSistema`)))
mariadb-version=100135
