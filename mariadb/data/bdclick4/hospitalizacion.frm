TYPE=VIEW
query=select `bdclick4`.`bdingresoshospitalizacion`.`mascota` AS `mascota`,`bdclick4`.`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdclick4`.`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdclick4`.`bdingresoshospitalizacion`.`observacion` AS `observacion`,`bdclick4`.`bdingresoshospitalizacion`.`fSalida` AS `fSalida`,`bdclick4`.`bdingresoshospitalizacion`.`hSalida` AS `hSalida`,`bdclick4`.`bdingresoshospitalizacion`.`consulta` AS `consulta`,`bdclick4`.`bdmascotas`.`nombre` AS `nombre`,`bdclick4`.`bdmascotas`.`especie` AS `especie`,`bdclick4`.`bdmascotas`.`raza` AS `raza`,`bdclick4`.`bdmascotas`.`genero` AS `genero`,`bdclick4`.`bdmascotas`.`color` AS `color`,`bdclick4`.`bdmascotas`.`edad` AS `edad`,`bdclick4`.`bdingresoshospitalizacion`.`Id` AS `Id` from (`bdclick4`.`bdingresoshospitalizacion` join `bdclick4`.`bdmascotas` on((`bdclick4`.`bdingresoshospitalizacion`.`mascota` = `bdclick4`.`bdmascotas`.`codigo`)))
md5=de53d9a131fe1fc2ecbfb40e8d45575a
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:27
create-version=2
source=select `bdingresoshospitalizacion`.`mascota` AS `mascota`,`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdingresoshospitalizacion`.`observacion` AS `observacion`,`bdingresoshospitalizacion`.`fSalida` AS `fSalida`,`bdingresoshospitalizacion`.`hSalida` AS `hSalida`,`bdingresoshospitalizacion`.`consulta` AS `consulta`,`bdmascotas`.`nombre` AS `nombre`,`bdmascotas`.`especie` AS `especie`,`bdmascotas`.`raza` AS `raza`,`bdmascotas`.`genero` AS `genero`,`bdmascotas`.`color` AS `color`,`bdmascotas`.`edad` AS `edad`,`bdingresoshospitalizacion`.`Id` AS `Id` from (`bdingresoshospitalizacion` join `bdmascotas` on((`bdingresoshospitalizacion`.`mascota` = `bdmascotas`.`codigo`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdingresoshospitalizacion`.`mascota` AS `mascota`,`bdclick4`.`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdclick4`.`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdclick4`.`bdingresoshospitalizacion`.`observacion` AS `observacion`,`bdclick4`.`bdingresoshospitalizacion`.`fSalida` AS `fSalida`,`bdclick4`.`bdingresoshospitalizacion`.`hSalida` AS `hSalida`,`bdclick4`.`bdingresoshospitalizacion`.`consulta` AS `consulta`,`bdclick4`.`bdmascotas`.`nombre` AS `nombre`,`bdclick4`.`bdmascotas`.`especie` AS `especie`,`bdclick4`.`bdmascotas`.`raza` AS `raza`,`bdclick4`.`bdmascotas`.`genero` AS `genero`,`bdclick4`.`bdmascotas`.`color` AS `color`,`bdclick4`.`bdmascotas`.`edad` AS `edad`,`bdclick4`.`bdingresoshospitalizacion`.`Id` AS `Id` from (`bdclick4`.`bdingresoshospitalizacion` join `bdclick4`.`bdmascotas` on((`bdclick4`.`bdingresoshospitalizacion`.`mascota` = `bdclick4`.`bdmascotas`.`codigo`)))
mariadb-version=100135
