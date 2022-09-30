TYPE=VIEW
query=select `bdclick6`.`bdingresoshospitalizacion`.`Id` AS `Id`,`bdclick6`.`bdingresoshospitalizacion`.`mascota` AS `codigo`,`bdclick6`.`bdmascotas`.`nombre` AS `mascota`,`bdclick6`.`bdmascotas`.`cliente` AS `cedula`,`bdclick6`.`bdterceros`.`nombre` AS `cliente`,`bdclick6`.`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdclick6`.`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdclick6`.`bdingresoshospitalizacion`.`activo` AS `activo` from ((`bdclick6`.`bdingresoshospitalizacion` left join `bdclick6`.`bdmascotas` on((`bdclick6`.`bdmascotas`.`codigo` = `bdclick6`.`bdingresoshospitalizacion`.`mascota`))) left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdmascotas`.`cliente` = `bdclick6`.`bdterceros`.`idSistema`))) where (`bdclick6`.`bdingresoshospitalizacion`.`activo` = 0)
md5=41a641ae31ded1188911ed0b44a94eda
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:35
create-version=2
source=select `bdingresoshospitalizacion`.`Id` AS `Id`,`bdingresoshospitalizacion`.`mascota` AS `codigo`,`bdmascotas`.`nombre` AS `mascota`,`bdmascotas`.`cliente` AS `cedula`,`bdterceros`.`nombre` AS `cliente`,`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdingresoshospitalizacion`.`activo` AS `activo` from ((`bdingresoshospitalizacion` left join `bdmascotas` on((`bdmascotas`.`codigo` = `bdingresoshospitalizacion`.`mascota`))) left join `bdterceros` on((`bdmascotas`.`cliente` = `bdterceros`.`idSistema`))) where (`bdingresoshospitalizacion`.`activo` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdingresoshospitalizacion`.`Id` AS `Id`,`bdclick6`.`bdingresoshospitalizacion`.`mascota` AS `codigo`,`bdclick6`.`bdmascotas`.`nombre` AS `mascota`,`bdclick6`.`bdmascotas`.`cliente` AS `cedula`,`bdclick6`.`bdterceros`.`nombre` AS `cliente`,`bdclick6`.`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdclick6`.`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdclick6`.`bdingresoshospitalizacion`.`activo` AS `activo` from ((`bdclick6`.`bdingresoshospitalizacion` left join `bdclick6`.`bdmascotas` on((`bdclick6`.`bdmascotas`.`codigo` = `bdclick6`.`bdingresoshospitalizacion`.`mascota`))) left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdmascotas`.`cliente` = `bdclick6`.`bdterceros`.`idSistema`))) where (`bdclick6`.`bdingresoshospitalizacion`.`activo` = 0)
mariadb-version=100135
