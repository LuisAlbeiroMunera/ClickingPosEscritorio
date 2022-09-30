TYPE=VIEW
query=select `bdclick2`.`bdingresoshospitalizacion`.`Id` AS `Id`,`bdclick2`.`bdingresoshospitalizacion`.`mascota` AS `codigo`,`bdclick2`.`bdmascotas`.`nombre` AS `mascota`,`bdclick2`.`bdmascotas`.`cliente` AS `cedula`,`bdclick2`.`bdterceros`.`nombre` AS `cliente`,`bdclick2`.`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdclick2`.`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdclick2`.`bdingresoshospitalizacion`.`activo` AS `activo` from ((`bdclick2`.`bdingresoshospitalizacion` left join `bdclick2`.`bdmascotas` on((`bdclick2`.`bdmascotas`.`codigo` = `bdclick2`.`bdingresoshospitalizacion`.`mascota`))) left join `bdclick2`.`bdterceros` on((`bdclick2`.`bdmascotas`.`cliente` = `bdclick2`.`bdterceros`.`idSistema`))) where (`bdclick2`.`bdingresoshospitalizacion`.`activo` = 0)
md5=988f67675034c108051079ce9b6c7bab
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:45
create-version=2
source=select `bdingresoshospitalizacion`.`Id` AS `Id`,`bdingresoshospitalizacion`.`mascota` AS `codigo`,`bdmascotas`.`nombre` AS `mascota`,`bdmascotas`.`cliente` AS `cedula`,`bdterceros`.`nombre` AS `cliente`,`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdingresoshospitalizacion`.`activo` AS `activo` from ((`bdingresoshospitalizacion` left join `bdmascotas` on((`bdmascotas`.`codigo` = `bdingresoshospitalizacion`.`mascota`))) left join `bdterceros` on((`bdmascotas`.`cliente` = `bdterceros`.`idSistema`))) where (`bdingresoshospitalizacion`.`activo` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdingresoshospitalizacion`.`Id` AS `Id`,`bdclick2`.`bdingresoshospitalizacion`.`mascota` AS `codigo`,`bdclick2`.`bdmascotas`.`nombre` AS `mascota`,`bdclick2`.`bdmascotas`.`cliente` AS `cedula`,`bdclick2`.`bdterceros`.`nombre` AS `cliente`,`bdclick2`.`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdclick2`.`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdclick2`.`bdingresoshospitalizacion`.`activo` AS `activo` from ((`bdclick2`.`bdingresoshospitalizacion` left join `bdclick2`.`bdmascotas` on((`bdclick2`.`bdmascotas`.`codigo` = `bdclick2`.`bdingresoshospitalizacion`.`mascota`))) left join `bdclick2`.`bdterceros` on((`bdclick2`.`bdmascotas`.`cliente` = `bdclick2`.`bdterceros`.`idSistema`))) where (`bdclick2`.`bdingresoshospitalizacion`.`activo` = 0)
mariadb-version=100135
