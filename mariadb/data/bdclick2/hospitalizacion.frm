TYPE=VIEW
query=select `bdclick2`.`bdingresoshospitalizacion`.`mascota` AS `mascota`,`bdclick2`.`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdclick2`.`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdclick2`.`bdingresoshospitalizacion`.`observacion` AS `observacion`,`bdclick2`.`bdingresoshospitalizacion`.`fSalida` AS `fSalida`,`bdclick2`.`bdingresoshospitalizacion`.`hSalida` AS `hSalida`,`bdclick2`.`bdingresoshospitalizacion`.`consulta` AS `consulta`,`bdclick2`.`bdmascotas`.`nombre` AS `nombre`,`bdclick2`.`bdmascotas`.`especie` AS `especie`,`bdclick2`.`bdmascotas`.`raza` AS `raza`,`bdclick2`.`bdmascotas`.`genero` AS `genero`,`bdclick2`.`bdmascotas`.`color` AS `color`,`bdclick2`.`bdmascotas`.`edad` AS `edad`,`bdclick2`.`bdingresoshospitalizacion`.`Id` AS `Id` from (`bdclick2`.`bdingresoshospitalizacion` join `bdclick2`.`bdmascotas` on((`bdclick2`.`bdingresoshospitalizacion`.`mascota` = `bdclick2`.`bdmascotas`.`codigo`)))
md5=a7976c86d3c88cab61594b1faeab9ca3
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:45
create-version=2
source=select `bdingresoshospitalizacion`.`mascota` AS `mascota`,`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdingresoshospitalizacion`.`observacion` AS `observacion`,`bdingresoshospitalizacion`.`fSalida` AS `fSalida`,`bdingresoshospitalizacion`.`hSalida` AS `hSalida`,`bdingresoshospitalizacion`.`consulta` AS `consulta`,`bdmascotas`.`nombre` AS `nombre`,`bdmascotas`.`especie` AS `especie`,`bdmascotas`.`raza` AS `raza`,`bdmascotas`.`genero` AS `genero`,`bdmascotas`.`color` AS `color`,`bdmascotas`.`edad` AS `edad`,`bdingresoshospitalizacion`.`Id` AS `Id` from (`bdingresoshospitalizacion` join `bdmascotas` on((`bdingresoshospitalizacion`.`mascota` = `bdmascotas`.`codigo`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdingresoshospitalizacion`.`mascota` AS `mascota`,`bdclick2`.`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdclick2`.`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdclick2`.`bdingresoshospitalizacion`.`observacion` AS `observacion`,`bdclick2`.`bdingresoshospitalizacion`.`fSalida` AS `fSalida`,`bdclick2`.`bdingresoshospitalizacion`.`hSalida` AS `hSalida`,`bdclick2`.`bdingresoshospitalizacion`.`consulta` AS `consulta`,`bdclick2`.`bdmascotas`.`nombre` AS `nombre`,`bdclick2`.`bdmascotas`.`especie` AS `especie`,`bdclick2`.`bdmascotas`.`raza` AS `raza`,`bdclick2`.`bdmascotas`.`genero` AS `genero`,`bdclick2`.`bdmascotas`.`color` AS `color`,`bdclick2`.`bdmascotas`.`edad` AS `edad`,`bdclick2`.`bdingresoshospitalizacion`.`Id` AS `Id` from (`bdclick2`.`bdingresoshospitalizacion` join `bdclick2`.`bdmascotas` on((`bdclick2`.`bdingresoshospitalizacion`.`mascota` = `bdclick2`.`bdmascotas`.`codigo`)))
mariadb-version=100135
