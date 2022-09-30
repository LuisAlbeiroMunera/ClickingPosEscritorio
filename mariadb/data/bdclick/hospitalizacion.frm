TYPE=VIEW
query=select `bdclick`.`bdingresoshospitalizacion`.`mascota` AS `mascota`,`bdclick`.`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdclick`.`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdclick`.`bdingresoshospitalizacion`.`observacion` AS `observacion`,`bdclick`.`bdingresoshospitalizacion`.`fSalida` AS `fSalida`,`bdclick`.`bdingresoshospitalizacion`.`hSalida` AS `hSalida`,`bdclick`.`bdingresoshospitalizacion`.`consulta` AS `consulta`,`bdclick`.`bdmascotas`.`nombre` AS `nombre`,`bdclick`.`bdmascotas`.`especie` AS `especie`,`bdclick`.`bdmascotas`.`raza` AS `raza`,`bdclick`.`bdmascotas`.`genero` AS `genero`,`bdclick`.`bdmascotas`.`color` AS `color`,`bdclick`.`bdmascotas`.`edad` AS `edad`,`bdclick`.`bdingresoshospitalizacion`.`Id` AS `Id` from (`bdclick`.`bdingresoshospitalizacion` join `bdclick`.`bdmascotas` on((`bdclick`.`bdingresoshospitalizacion`.`mascota` = `bdclick`.`bdmascotas`.`codigo`)))
md5=d2a40375bc31a04a4cdabbb2a7dbb19b
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:24
create-version=2
source=select `bdingresoshospitalizacion`.`mascota` AS `mascota`,`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdingresoshospitalizacion`.`observacion` AS `observacion`,`bdingresoshospitalizacion`.`fSalida` AS `fSalida`,`bdingresoshospitalizacion`.`hSalida` AS `hSalida`,`bdingresoshospitalizacion`.`consulta` AS `consulta`,`bdmascotas`.`nombre` AS `nombre`,`bdmascotas`.`especie` AS `especie`,`bdmascotas`.`raza` AS `raza`,`bdmascotas`.`genero` AS `genero`,`bdmascotas`.`color` AS `color`,`bdmascotas`.`edad` AS `edad`,`bdingresoshospitalizacion`.`Id` AS `Id` from (`bdingresoshospitalizacion` join `bdmascotas` on((`bdingresoshospitalizacion`.`mascota` = `bdmascotas`.`codigo`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdingresoshospitalizacion`.`mascota` AS `mascota`,`bdclick`.`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdclick`.`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdclick`.`bdingresoshospitalizacion`.`observacion` AS `observacion`,`bdclick`.`bdingresoshospitalizacion`.`fSalida` AS `fSalida`,`bdclick`.`bdingresoshospitalizacion`.`hSalida` AS `hSalida`,`bdclick`.`bdingresoshospitalizacion`.`consulta` AS `consulta`,`bdclick`.`bdmascotas`.`nombre` AS `nombre`,`bdclick`.`bdmascotas`.`especie` AS `especie`,`bdclick`.`bdmascotas`.`raza` AS `raza`,`bdclick`.`bdmascotas`.`genero` AS `genero`,`bdclick`.`bdmascotas`.`color` AS `color`,`bdclick`.`bdmascotas`.`edad` AS `edad`,`bdclick`.`bdingresoshospitalizacion`.`Id` AS `Id` from (`bdclick`.`bdingresoshospitalizacion` join `bdclick`.`bdmascotas` on((`bdclick`.`bdingresoshospitalizacion`.`mascota` = `bdclick`.`bdmascotas`.`codigo`)))
mariadb-version=100135
