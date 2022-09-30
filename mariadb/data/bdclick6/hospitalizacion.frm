TYPE=VIEW
query=select `bdclick6`.`bdingresoshospitalizacion`.`mascota` AS `mascota`,`bdclick6`.`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdclick6`.`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdclick6`.`bdingresoshospitalizacion`.`observacion` AS `observacion`,`bdclick6`.`bdingresoshospitalizacion`.`fSalida` AS `fSalida`,`bdclick6`.`bdingresoshospitalizacion`.`hSalida` AS `hSalida`,`bdclick6`.`bdingresoshospitalizacion`.`consulta` AS `consulta`,`bdclick6`.`bdmascotas`.`nombre` AS `nombre`,`bdclick6`.`bdmascotas`.`especie` AS `especie`,`bdclick6`.`bdmascotas`.`raza` AS `raza`,`bdclick6`.`bdmascotas`.`genero` AS `genero`,`bdclick6`.`bdmascotas`.`color` AS `color`,`bdclick6`.`bdmascotas`.`edad` AS `edad`,`bdclick6`.`bdingresoshospitalizacion`.`Id` AS `Id` from (`bdclick6`.`bdingresoshospitalizacion` join `bdclick6`.`bdmascotas` on((`bdclick6`.`bdingresoshospitalizacion`.`mascota` = `bdclick6`.`bdmascotas`.`codigo`)))
md5=d86f9d2d2f52987bb17bcb5321386f3a
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:35
create-version=2
source=select `bdingresoshospitalizacion`.`mascota` AS `mascota`,`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdingresoshospitalizacion`.`observacion` AS `observacion`,`bdingresoshospitalizacion`.`fSalida` AS `fSalida`,`bdingresoshospitalizacion`.`hSalida` AS `hSalida`,`bdingresoshospitalizacion`.`consulta` AS `consulta`,`bdmascotas`.`nombre` AS `nombre`,`bdmascotas`.`especie` AS `especie`,`bdmascotas`.`raza` AS `raza`,`bdmascotas`.`genero` AS `genero`,`bdmascotas`.`color` AS `color`,`bdmascotas`.`edad` AS `edad`,`bdingresoshospitalizacion`.`Id` AS `Id` from (`bdingresoshospitalizacion` join `bdmascotas` on((`bdingresoshospitalizacion`.`mascota` = `bdmascotas`.`codigo`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdingresoshospitalizacion`.`mascota` AS `mascota`,`bdclick6`.`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdclick6`.`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdclick6`.`bdingresoshospitalizacion`.`observacion` AS `observacion`,`bdclick6`.`bdingresoshospitalizacion`.`fSalida` AS `fSalida`,`bdclick6`.`bdingresoshospitalizacion`.`hSalida` AS `hSalida`,`bdclick6`.`bdingresoshospitalizacion`.`consulta` AS `consulta`,`bdclick6`.`bdmascotas`.`nombre` AS `nombre`,`bdclick6`.`bdmascotas`.`especie` AS `especie`,`bdclick6`.`bdmascotas`.`raza` AS `raza`,`bdclick6`.`bdmascotas`.`genero` AS `genero`,`bdclick6`.`bdmascotas`.`color` AS `color`,`bdclick6`.`bdmascotas`.`edad` AS `edad`,`bdclick6`.`bdingresoshospitalizacion`.`Id` AS `Id` from (`bdclick6`.`bdingresoshospitalizacion` join `bdclick6`.`bdmascotas` on((`bdclick6`.`bdingresoshospitalizacion`.`mascota` = `bdclick6`.`bdmascotas`.`codigo`)))
mariadb-version=100135
