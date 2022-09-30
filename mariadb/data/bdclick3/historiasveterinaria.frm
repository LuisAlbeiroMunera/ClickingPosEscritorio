TYPE=VIEW
query=select `conhistmascotas`.`Id` AS `Id`,`conhistmascotas`.`codigo` AS `codigo`,`conhistmascotas`.`cliente` AS `cliente`,`conhistmascotas`.`nombre` AS `nombre`,`conhistmascotas`.`especie` AS `especie`,`conhistmascotas`.`raza` AS `raza`,`conhistmascotas`.`genero` AS `genero`,`conhistmascotas`.`restricciones` AS `restricciones`,`conhistmascotas`.`edad` AS `edad`,`conhistmascotas`.`alimentacion` AS `alimentacion`,`conhistmascotas`.`observaciones` AS `observaciones`,`conhistmascotas`.`foto` AS `foto`,`conhistmascotas`.`color` AS `color`,`conhistmascotas`.`temperamento` AS `temperamento`,`conhistmascotas`.`observacion` AS `observacion`,`conhistmascotas`.`cedula` AS `cedula`,`conhistmascotas`.`nombreCliente` AS `nombreCliente`,`conhistmascotas`.`telefono` AS `telefono`,`conhistmascotas`.`celular` AS `celular`,`conhistmascotas`.`direccion` AS `direccion`,`conhistmascotas`.`diagnosticoHistoria` AS `diagnosticoHistoria`,`conhistmascotas`.`evolucionHistoria` AS `evolucionHistoria`,`conhistmascotas`.`enfermedadesHistoria` AS `enfermedadesHistoria`,`conhistmascotas`.`tratamientosHistoria` AS `tratamientosHistoria`,`cantidadayudasdiagnosticas`.`cantidadAyuda` AS `cantidadAyuda`,`bdclick3`.`bdconsulta`.`Id` AS `consulta`,`bdclick3`.`bdconsulta`.`historia` AS `historia`,`bdclick3`.`bdconsulta`.`motivo` AS `motivo`,`bdclick3`.`bdconsulta`.`fc` AS `fc`,`bdclick3`.`bdconsulta`.`fr` AS `fr`,`bdclick3`.`bdconsulta`.`pulso` AS `pulso`,`bdclick3`.`bdconsulta`.`peso` AS `peso`,`bdclick3`.`bdconsulta`.`tllc` AS `tllc`,`bdclick3`.`bdconsulta`.`temp` AS `temp`,`bdclick3`.`bdconsulta`.`cc` AS `cc`,`bdclick3`.`bdconsulta`.`actitud` AS `actitud`,`bdclick3`.`bdconsulta`.`problemas` AS `problemas`,`bdclick3`.`bdconsulta`.`diagnostico` AS `diagnostico`,`bdclick3`.`bdconsulta`.`plan` AS `plan`,`bdclick3`.`bdconsulta`.`tratamiento` AS `tratamiento`,`bdclick3`.`bdconsulta`.`recomendacion` AS `recomendacion`,`bdclick3`.`bdconsulta`.`nervioso` AS `nervioso`,`bdclick3`.`bdconsulta`.`digestivo` AS `digestivo`,`bdclick3`.`bdconsulta`.`respiratorio` AS `respiratorio`,`bdclick3`.`bdconsulta`.`cardiaco` AS `cardiaco`,`bdclick3`.`bdconsulta`.`urinario` AS `urinario`,`bdclick3`.`bdconsulta`.`musculo` AS `musculo`,`bdclick3`.`bdconsulta`.`piel` AS `piel`,`bdclick3`.`bdconsulta`.`oidos` AS `oidos`,`bdclick3`.`bdconsulta`.`ojos` AS `ojos`,`bdclick3`.`bdconsulta`.`usuario` AS `usuario`,`bdclick3`.`bdconsulta`.`fecha` AS `fechaConsulta`,`bdclick3`.`bdconsulta`.`mucosa` AS `mucosa`,`bdclick3`.`bdconsulta`.`llenadoCapilar` AS `llenadoCapilar`,`bdclick3`.`bdconsulta`.`caracteristicas` AS `caracteristicas`,`bdclick3`.`bdconsulta`.`hidratacion` AS `hidratacion`,`bdclick3`.`bdconsulta`.`nutricional` AS `nutricional`,`bdclick3`.`bdconsulta`.`organosSentidos` AS `organosSentidos`,`bdclick3`.`bdconsulta`.`ganglios` AS `ganglios`,`bdclick3`.`bdconsulta`.`proximoControl` AS `proximoControl`,`bdclick3`.`bdseguimiento`.`fecha` AS `fechaSeguimiento`,`bdclick3`.`bdseguimiento`.`evolucion` AS `evolucion`,`bdclick3`.`bdseguimiento`.`observaciones` AS `observacionesSeguimiento`,`bdclick3`.`bdseguimiento`.`fc` AS `EvolucionFC`,`bdclick3`.`bdseguimiento`.`tllc` AS `EvolucionTLLC`,`bdclick3`.`bdseguimiento`.`fr` AS `EvolucionFR`,`bdclick3`.`bdseguimiento`.`t` AS `EvolucionT`,`bdclick3`.`bdseguimiento`.`pulso` AS `EvolucionPULSO`,`bdclick3`.`bdseguimiento`.`cc` AS `EvolucionCC`,`bdclick3`.`bdseguimiento`.`peso` AS `EvolucionPESO`,`bdclick3`.`bdseguimiento`.`mucosa` AS `EvolucionMUCOSA`,`bdclick3`.`bdconsulta`.`endocrino` AS `endocrino` from (((`bdclick3`.`conhistmascotas` join `bdclick3`.`bdconsulta` on((`conhistmascotas`.`Id` = `bdclick3`.`bdconsulta`.`historia`))) left join `bdclick3`.`bdseguimiento` on((`bdclick3`.`bdconsulta`.`Id` = `bdclick3`.`bdseguimiento`.`consulta`))) left join `bdclick3`.`cantidadayudasdiagnosticas` on((`bdclick3`.`bdconsulta`.`Id` = `cantidadayudasdiagnosticas`.`historia`)))
md5=8535c4340b3f961513a48c49c8406688
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:50
create-version=2
source=select `conhistmascotas`.`Id` AS `Id`,`conhistmascotas`.`codigo` AS `codigo`,`conhistmascotas`.`cliente` AS `cliente`,`conhistmascotas`.`nombre` AS `nombre`,`conhistmascotas`.`especie` AS `especie`,`conhistmascotas`.`raza` AS `raza`,`conhistmascotas`.`genero` AS `genero`,`conhistmascotas`.`restricciones` AS `restricciones`,`conhistmascotas`.`edad` AS `edad`,`conhistmascotas`.`alimentacion` AS `alimentacion`,`conhistmascotas`.`observaciones` AS `observaciones`,`conhistmascotas`.`foto` AS `foto`,`conhistmascotas`.`color` AS `color`,`conhistmascotas`.`temperamento` AS `temperamento`,`conhistmascotas`.`observacion` AS `observacion`,`conhistmascotas`.`cedula` AS `cedula`,`conhistmascotas`.`nombreCliente` AS `nombreCliente`,`conhistmascotas`.`telefono` AS `telefono`,`conhistmascotas`.`celular` AS `celular`,`conhistmascotas`.`direccion` AS `direccion`,`conhistmascotas`.`diagnosticoHistoria` AS `diagnosticoHistoria`,`conhistmascotas`.`evolucionHistoria` AS `evolucionHistoria`,`conhistmascotas`.`enfermedadesHistoria` AS `enfermedadesHistoria`,`conhistmascotas`.`tratamientosHistoria` AS `tratamientosHistoria`,`cantidadayudasdiagnosticas`.`cantidadAyuda` AS `cantidadAyuda`,`bdconsulta`.`Id` AS `consulta`,`bdconsulta`.`historia` AS `historia`,`bdconsulta`.`motivo` AS `motivo`,`bdconsulta`.`fc` AS `fc`,`bdconsulta`.`fr` AS `fr`,`bdconsulta`.`pulso` AS `pulso`,`bdconsulta`.`peso` AS `peso`,`bdconsulta`.`tllc` AS `tllc`,`bdconsulta`.`temp` AS `temp`,`bdconsulta`.`cc` AS `cc`,`bdconsulta`.`actitud` AS `actitud`,`bdconsulta`.`problemas` AS `problemas`,`bdconsulta`.`diagnostico` AS `diagnostico`,`bdconsulta`.`plan` AS `plan`,`bdconsulta`.`tratamiento` AS `tratamiento`,`bdconsulta`.`recomendacion` AS `recomendacion`,`bdconsulta`.`nervioso` AS `nervioso`,`bdconsulta`.`digestivo` AS `digestivo`,`bdconsulta`.`respiratorio` AS `respiratorio`,`bdconsulta`.`cardiaco` AS `cardiaco`,`bdconsulta`.`urinario` AS `urinario`,`bdconsulta`.`musculo` AS `musculo`,`bdconsulta`.`piel` AS `piel`,`bdconsulta`.`oidos` AS `oidos`,`bdconsulta`.`ojos` AS `ojos`,`bdconsulta`.`usuario` AS `usuario`,`bdconsulta`.`fecha` AS `fechaConsulta`,`bdconsulta`.`mucosa` AS `mucosa`,`bdconsulta`.`llenadoCapilar` AS `llenadoCapilar`,`bdconsulta`.`caracteristicas` AS `caracteristicas`,`bdconsulta`.`hidratacion` AS `hidratacion`,`bdconsulta`.`nutricional` AS `nutricional`,`bdconsulta`.`organosSentidos` AS `organosSentidos`,`bdconsulta`.`ganglios` AS `ganglios`,`bdconsulta`.`proximoControl` AS `proximoControl`,`bdseguimiento`.`fecha` AS `fechaSeguimiento`,`bdseguimiento`.`evolucion` AS `evolucion`,`bdseguimiento`.`observaciones` AS `observacionesSeguimiento`,`bdseguimiento`.`fc` AS `EvolucionFC`,`bdseguimiento`.`tllc` AS `EvolucionTLLC`,`bdseguimiento`.`fr` AS `EvolucionFR`,`bdseguimiento`.`t` AS `EvolucionT`,`bdseguimiento`.`pulso` AS `EvolucionPULSO`,`bdseguimiento`.`cc` AS `EvolucionCC`,`bdseguimiento`.`peso` AS `EvolucionPESO`,`bdseguimiento`.`mucosa` AS `EvolucionMUCOSA`,`bdconsulta`.`endocrino` AS `endocrino` from (((`conhistmascotas` join `bdconsulta` on((`conhistmascotas`.`Id` = `bdconsulta`.`historia`))) left join `bdseguimiento` on((`bdconsulta`.`Id` = `bdseguimiento`.`consulta`))) left join `cantidadayudasdiagnosticas` on((`bdconsulta`.`Id` = `cantidadayudasdiagnosticas`.`historia`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `conhistmascotas`.`Id` AS `Id`,`conhistmascotas`.`codigo` AS `codigo`,`conhistmascotas`.`cliente` AS `cliente`,`conhistmascotas`.`nombre` AS `nombre`,`conhistmascotas`.`especie` AS `especie`,`conhistmascotas`.`raza` AS `raza`,`conhistmascotas`.`genero` AS `genero`,`conhistmascotas`.`restricciones` AS `restricciones`,`conhistmascotas`.`edad` AS `edad`,`conhistmascotas`.`alimentacion` AS `alimentacion`,`conhistmascotas`.`observaciones` AS `observaciones`,`conhistmascotas`.`foto` AS `foto`,`conhistmascotas`.`color` AS `color`,`conhistmascotas`.`temperamento` AS `temperamento`,`conhistmascotas`.`observacion` AS `observacion`,`conhistmascotas`.`cedula` AS `cedula`,`conhistmascotas`.`nombreCliente` AS `nombreCliente`,`conhistmascotas`.`telefono` AS `telefono`,`conhistmascotas`.`celular` AS `celular`,`conhistmascotas`.`direccion` AS `direccion`,`conhistmascotas`.`diagnosticoHistoria` AS `diagnosticoHistoria`,`conhistmascotas`.`evolucionHistoria` AS `evolucionHistoria`,`conhistmascotas`.`enfermedadesHistoria` AS `enfermedadesHistoria`,`conhistmascotas`.`tratamientosHistoria` AS `tratamientosHistoria`,`cantidadayudasdiagnosticas`.`cantidadAyuda` AS `cantidadAyuda`,`bdclick3`.`bdconsulta`.`Id` AS `consulta`,`bdclick3`.`bdconsulta`.`historia` AS `historia`,`bdclick3`.`bdconsulta`.`motivo` AS `motivo`,`bdclick3`.`bdconsulta`.`fc` AS `fc`,`bdclick3`.`bdconsulta`.`fr` AS `fr`,`bdclick3`.`bdconsulta`.`pulso` AS `pulso`,`bdclick3`.`bdconsulta`.`peso` AS `peso`,`bdclick3`.`bdconsulta`.`tllc` AS `tllc`,`bdclick3`.`bdconsulta`.`temp` AS `temp`,`bdclick3`.`bdconsulta`.`cc` AS `cc`,`bdclick3`.`bdconsulta`.`actitud` AS `actitud`,`bdclick3`.`bdconsulta`.`problemas` AS `problemas`,`bdclick3`.`bdconsulta`.`diagnostico` AS `diagnostico`,`bdclick3`.`bdconsulta`.`plan` AS `plan`,`bdclick3`.`bdconsulta`.`tratamiento` AS `tratamiento`,`bdclick3`.`bdconsulta`.`recomendacion` AS `recomendacion`,`bdclick3`.`bdconsulta`.`nervioso` AS `nervioso`,`bdclick3`.`bdconsulta`.`digestivo` AS `digestivo`,`bdclick3`.`bdconsulta`.`respiratorio` AS `respiratorio`,`bdclick3`.`bdconsulta`.`cardiaco` AS `cardiaco`,`bdclick3`.`bdconsulta`.`urinario` AS `urinario`,`bdclick3`.`bdconsulta`.`musculo` AS `musculo`,`bdclick3`.`bdconsulta`.`piel` AS `piel`,`bdclick3`.`bdconsulta`.`oidos` AS `oidos`,`bdclick3`.`bdconsulta`.`ojos` AS `ojos`,`bdclick3`.`bdconsulta`.`usuario` AS `usuario`,`bdclick3`.`bdconsulta`.`fecha` AS `fechaConsulta`,`bdclick3`.`bdconsulta`.`mucosa` AS `mucosa`,`bdclick3`.`bdconsulta`.`llenadoCapilar` AS `llenadoCapilar`,`bdclick3`.`bdconsulta`.`caracteristicas` AS `caracteristicas`,`bdclick3`.`bdconsulta`.`hidratacion` AS `hidratacion`,`bdclick3`.`bdconsulta`.`nutricional` AS `nutricional`,`bdclick3`.`bdconsulta`.`organosSentidos` AS `organosSentidos`,`bdclick3`.`bdconsulta`.`ganglios` AS `ganglios`,`bdclick3`.`bdconsulta`.`proximoControl` AS `proximoControl`,`bdclick3`.`bdseguimiento`.`fecha` AS `fechaSeguimiento`,`bdclick3`.`bdseguimiento`.`evolucion` AS `evolucion`,`bdclick3`.`bdseguimiento`.`observaciones` AS `observacionesSeguimiento`,`bdclick3`.`bdseguimiento`.`fc` AS `EvolucionFC`,`bdclick3`.`bdseguimiento`.`tllc` AS `EvolucionTLLC`,`bdclick3`.`bdseguimiento`.`fr` AS `EvolucionFR`,`bdclick3`.`bdseguimiento`.`t` AS `EvolucionT`,`bdclick3`.`bdseguimiento`.`pulso` AS `EvolucionPULSO`,`bdclick3`.`bdseguimiento`.`cc` AS `EvolucionCC`,`bdclick3`.`bdseguimiento`.`peso` AS `EvolucionPESO`,`bdclick3`.`bdseguimiento`.`mucosa` AS `EvolucionMUCOSA`,`bdclick3`.`bdconsulta`.`endocrino` AS `endocrino` from (((`bdclick3`.`conhistmascotas` join `bdclick3`.`bdconsulta` on((`conhistmascotas`.`Id` = `bdclick3`.`bdconsulta`.`historia`))) left join `bdclick3`.`bdseguimiento` on((`bdclick3`.`bdconsulta`.`Id` = `bdclick3`.`bdseguimiento`.`consulta`))) left join `bdclick3`.`cantidadayudasdiagnosticas` on((`bdclick3`.`bdconsulta`.`Id` = `cantidadayudasdiagnosticas`.`historia`)))
mariadb-version=100135
