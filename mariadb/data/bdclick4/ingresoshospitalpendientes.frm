TYPE=VIEW
query=select `bdclick4`.`bdingresoshospitalizacion`.`Id` AS `Id`,`bdclick4`.`bdingresoshospitalizacion`.`mascota` AS `codigo`,`bdclick4`.`bdmascotas`.`nombre` AS `mascota`,`bdclick4`.`bdmascotas`.`cliente` AS `cedula`,`bdclick4`.`bdterceros`.`nombre` AS `cliente`,`bdclick4`.`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdclick4`.`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdclick4`.`bdingresoshospitalizacion`.`activo` AS `activo` from ((`bdclick4`.`bdingresoshospitalizacion` left join `bdclick4`.`bdmascotas` on((`bdclick4`.`bdmascotas`.`codigo` = `bdclick4`.`bdingresoshospitalizacion`.`mascota`))) left join `bdclick4`.`bdterceros` on((`bdclick4`.`bdmascotas`.`cliente` = `bdclick4`.`bdterceros`.`idSistema`))) where (`bdclick4`.`bdingresoshospitalizacion`.`activo` = 0)
md5=e0980c032b292b1097e597d33961d408
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:28
create-version=2
source=select `bdingresoshospitalizacion`.`Id` AS `Id`,`bdingresoshospitalizacion`.`mascota` AS `codigo`,`bdmascotas`.`nombre` AS `mascota`,`bdmascotas`.`cliente` AS `cedula`,`bdterceros`.`nombre` AS `cliente`,`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdingresoshospitalizacion`.`activo` AS `activo` from ((`bdingresoshospitalizacion` left join `bdmascotas` on((`bdmascotas`.`codigo` = `bdingresoshospitalizacion`.`mascota`))) left join `bdterceros` on((`bdmascotas`.`cliente` = `bdterceros`.`idSistema`))) where (`bdingresoshospitalizacion`.`activo` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdingresoshospitalizacion`.`Id` AS `Id`,`bdclick4`.`bdingresoshospitalizacion`.`mascota` AS `codigo`,`bdclick4`.`bdmascotas`.`nombre` AS `mascota`,`bdclick4`.`bdmascotas`.`cliente` AS `cedula`,`bdclick4`.`bdterceros`.`nombre` AS `cliente`,`bdclick4`.`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdclick4`.`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdclick4`.`bdingresoshospitalizacion`.`activo` AS `activo` from ((`bdclick4`.`bdingresoshospitalizacion` left join `bdclick4`.`bdmascotas` on((`bdclick4`.`bdmascotas`.`codigo` = `bdclick4`.`bdingresoshospitalizacion`.`mascota`))) left join `bdclick4`.`bdterceros` on((`bdclick4`.`bdmascotas`.`cliente` = `bdclick4`.`bdterceros`.`idSistema`))) where (`bdclick4`.`bdingresoshospitalizacion`.`activo` = 0)
mariadb-version=100135
