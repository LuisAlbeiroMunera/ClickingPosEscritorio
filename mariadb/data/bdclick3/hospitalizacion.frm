TYPE=VIEW
query=select `bdclick3`.`bdingresoshospitalizacion`.`mascota` AS `mascota`,`bdclick3`.`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdclick3`.`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdclick3`.`bdingresoshospitalizacion`.`observacion` AS `observacion`,`bdclick3`.`bdingresoshospitalizacion`.`fSalida` AS `fSalida`,`bdclick3`.`bdingresoshospitalizacion`.`hSalida` AS `hSalida`,`bdclick3`.`bdingresoshospitalizacion`.`consulta` AS `consulta`,`bdclick3`.`bdmascotas`.`nombre` AS `nombre`,`bdclick3`.`bdmascotas`.`especie` AS `especie`,`bdclick3`.`bdmascotas`.`raza` AS `raza`,`bdclick3`.`bdmascotas`.`genero` AS `genero`,`bdclick3`.`bdmascotas`.`color` AS `color`,`bdclick3`.`bdmascotas`.`edad` AS `edad`,`bdclick3`.`bdingresoshospitalizacion`.`Id` AS `Id` from (`bdclick3`.`bdingresoshospitalizacion` join `bdclick3`.`bdmascotas` on((`bdclick3`.`bdingresoshospitalizacion`.`mascota` = `bdclick3`.`bdmascotas`.`codigo`)))
md5=2e2031d31fce6b86266c39a779d7664a
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:50
create-version=2
source=select `bdingresoshospitalizacion`.`mascota` AS `mascota`,`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdingresoshospitalizacion`.`observacion` AS `observacion`,`bdingresoshospitalizacion`.`fSalida` AS `fSalida`,`bdingresoshospitalizacion`.`hSalida` AS `hSalida`,`bdingresoshospitalizacion`.`consulta` AS `consulta`,`bdmascotas`.`nombre` AS `nombre`,`bdmascotas`.`especie` AS `especie`,`bdmascotas`.`raza` AS `raza`,`bdmascotas`.`genero` AS `genero`,`bdmascotas`.`color` AS `color`,`bdmascotas`.`edad` AS `edad`,`bdingresoshospitalizacion`.`Id` AS `Id` from (`bdingresoshospitalizacion` join `bdmascotas` on((`bdingresoshospitalizacion`.`mascota` = `bdmascotas`.`codigo`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdingresoshospitalizacion`.`mascota` AS `mascota`,`bdclick3`.`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdclick3`.`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdclick3`.`bdingresoshospitalizacion`.`observacion` AS `observacion`,`bdclick3`.`bdingresoshospitalizacion`.`fSalida` AS `fSalida`,`bdclick3`.`bdingresoshospitalizacion`.`hSalida` AS `hSalida`,`bdclick3`.`bdingresoshospitalizacion`.`consulta` AS `consulta`,`bdclick3`.`bdmascotas`.`nombre` AS `nombre`,`bdclick3`.`bdmascotas`.`especie` AS `especie`,`bdclick3`.`bdmascotas`.`raza` AS `raza`,`bdclick3`.`bdmascotas`.`genero` AS `genero`,`bdclick3`.`bdmascotas`.`color` AS `color`,`bdclick3`.`bdmascotas`.`edad` AS `edad`,`bdclick3`.`bdingresoshospitalizacion`.`Id` AS `Id` from (`bdclick3`.`bdingresoshospitalizacion` join `bdclick3`.`bdmascotas` on((`bdclick3`.`bdingresoshospitalizacion`.`mascota` = `bdclick3`.`bdmascotas`.`codigo`)))
mariadb-version=100135
