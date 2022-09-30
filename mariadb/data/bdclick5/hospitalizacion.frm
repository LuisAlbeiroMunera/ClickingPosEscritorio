TYPE=VIEW
query=select `bdclick5`.`bdingresoshospitalizacion`.`mascota` AS `mascota`,`bdclick5`.`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdclick5`.`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdclick5`.`bdingresoshospitalizacion`.`observacion` AS `observacion`,`bdclick5`.`bdingresoshospitalizacion`.`fSalida` AS `fSalida`,`bdclick5`.`bdingresoshospitalizacion`.`hSalida` AS `hSalida`,`bdclick5`.`bdingresoshospitalizacion`.`consulta` AS `consulta`,`bdclick5`.`bdmascotas`.`nombre` AS `nombre`,`bdclick5`.`bdmascotas`.`especie` AS `especie`,`bdclick5`.`bdmascotas`.`raza` AS `raza`,`bdclick5`.`bdmascotas`.`genero` AS `genero`,`bdclick5`.`bdmascotas`.`color` AS `color`,`bdclick5`.`bdmascotas`.`edad` AS `edad`,`bdclick5`.`bdingresoshospitalizacion`.`Id` AS `Id` from (`bdclick5`.`bdingresoshospitalizacion` join `bdclick5`.`bdmascotas` on((`bdclick5`.`bdingresoshospitalizacion`.`mascota` = `bdclick5`.`bdmascotas`.`codigo`)))
md5=633f1594acea698240b164c3e16fa392
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:46
create-version=2
source=select `bdingresoshospitalizacion`.`mascota` AS `mascota`,`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdingresoshospitalizacion`.`observacion` AS `observacion`,`bdingresoshospitalizacion`.`fSalida` AS `fSalida`,`bdingresoshospitalizacion`.`hSalida` AS `hSalida`,`bdingresoshospitalizacion`.`consulta` AS `consulta`,`bdmascotas`.`nombre` AS `nombre`,`bdmascotas`.`especie` AS `especie`,`bdmascotas`.`raza` AS `raza`,`bdmascotas`.`genero` AS `genero`,`bdmascotas`.`color` AS `color`,`bdmascotas`.`edad` AS `edad`,`bdingresoshospitalizacion`.`Id` AS `Id` from (`bdingresoshospitalizacion` join `bdmascotas` on((`bdingresoshospitalizacion`.`mascota` = `bdmascotas`.`codigo`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdingresoshospitalizacion`.`mascota` AS `mascota`,`bdclick5`.`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdclick5`.`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdclick5`.`bdingresoshospitalizacion`.`observacion` AS `observacion`,`bdclick5`.`bdingresoshospitalizacion`.`fSalida` AS `fSalida`,`bdclick5`.`bdingresoshospitalizacion`.`hSalida` AS `hSalida`,`bdclick5`.`bdingresoshospitalizacion`.`consulta` AS `consulta`,`bdclick5`.`bdmascotas`.`nombre` AS `nombre`,`bdclick5`.`bdmascotas`.`especie` AS `especie`,`bdclick5`.`bdmascotas`.`raza` AS `raza`,`bdclick5`.`bdmascotas`.`genero` AS `genero`,`bdclick5`.`bdmascotas`.`color` AS `color`,`bdclick5`.`bdmascotas`.`edad` AS `edad`,`bdclick5`.`bdingresoshospitalizacion`.`Id` AS `Id` from (`bdclick5`.`bdingresoshospitalizacion` join `bdclick5`.`bdmascotas` on((`bdclick5`.`bdingresoshospitalizacion`.`mascota` = `bdclick5`.`bdmascotas`.`codigo`)))
mariadb-version=100135
