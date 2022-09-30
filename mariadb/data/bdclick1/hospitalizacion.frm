TYPE=VIEW
query=select `bdclick1`.`bdingresoshospitalizacion`.`mascota` AS `mascota`,`bdclick1`.`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdclick1`.`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdclick1`.`bdingresoshospitalizacion`.`observacion` AS `observacion`,`bdclick1`.`bdingresoshospitalizacion`.`fSalida` AS `fSalida`,`bdclick1`.`bdingresoshospitalizacion`.`hSalida` AS `hSalida`,`bdclick1`.`bdingresoshospitalizacion`.`consulta` AS `consulta`,`bdclick1`.`bdmascotas`.`nombre` AS `nombre`,`bdclick1`.`bdmascotas`.`especie` AS `especie`,`bdclick1`.`bdmascotas`.`raza` AS `raza`,`bdclick1`.`bdmascotas`.`genero` AS `genero`,`bdclick1`.`bdmascotas`.`color` AS `color`,`bdclick1`.`bdmascotas`.`edad` AS `edad`,`bdclick1`.`bdingresoshospitalizacion`.`Id` AS `Id` from (`bdclick1`.`bdingresoshospitalizacion` join `bdclick1`.`bdmascotas` on((`bdclick1`.`bdingresoshospitalizacion`.`mascota` = `bdclick1`.`bdmascotas`.`codigo`)))
md5=b5556108d373029b7836f48147a96ad6
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:34
create-version=2
source=select `bdingresoshospitalizacion`.`mascota` AS `mascota`,`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdingresoshospitalizacion`.`observacion` AS `observacion`,`bdingresoshospitalizacion`.`fSalida` AS `fSalida`,`bdingresoshospitalizacion`.`hSalida` AS `hSalida`,`bdingresoshospitalizacion`.`consulta` AS `consulta`,`bdmascotas`.`nombre` AS `nombre`,`bdmascotas`.`especie` AS `especie`,`bdmascotas`.`raza` AS `raza`,`bdmascotas`.`genero` AS `genero`,`bdmascotas`.`color` AS `color`,`bdmascotas`.`edad` AS `edad`,`bdingresoshospitalizacion`.`Id` AS `Id` from (`bdingresoshospitalizacion` join `bdmascotas` on((`bdingresoshospitalizacion`.`mascota` = `bdmascotas`.`codigo`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdingresoshospitalizacion`.`mascota` AS `mascota`,`bdclick1`.`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdclick1`.`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdclick1`.`bdingresoshospitalizacion`.`observacion` AS `observacion`,`bdclick1`.`bdingresoshospitalizacion`.`fSalida` AS `fSalida`,`bdclick1`.`bdingresoshospitalizacion`.`hSalida` AS `hSalida`,`bdclick1`.`bdingresoshospitalizacion`.`consulta` AS `consulta`,`bdclick1`.`bdmascotas`.`nombre` AS `nombre`,`bdclick1`.`bdmascotas`.`especie` AS `especie`,`bdclick1`.`bdmascotas`.`raza` AS `raza`,`bdclick1`.`bdmascotas`.`genero` AS `genero`,`bdclick1`.`bdmascotas`.`color` AS `color`,`bdclick1`.`bdmascotas`.`edad` AS `edad`,`bdclick1`.`bdingresoshospitalizacion`.`Id` AS `Id` from (`bdclick1`.`bdingresoshospitalizacion` join `bdclick1`.`bdmascotas` on((`bdclick1`.`bdingresoshospitalizacion`.`mascota` = `bdclick1`.`bdmascotas`.`codigo`)))
mariadb-version=100135
