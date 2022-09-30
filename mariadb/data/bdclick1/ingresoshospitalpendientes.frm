TYPE=VIEW
query=select `bdclick1`.`bdingresoshospitalizacion`.`Id` AS `Id`,`bdclick1`.`bdingresoshospitalizacion`.`mascota` AS `codigo`,`bdclick1`.`bdmascotas`.`nombre` AS `mascota`,`bdclick1`.`bdmascotas`.`cliente` AS `cedula`,`bdclick1`.`bdterceros`.`nombre` AS `cliente`,`bdclick1`.`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdclick1`.`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdclick1`.`bdingresoshospitalizacion`.`activo` AS `activo` from ((`bdclick1`.`bdingresoshospitalizacion` left join `bdclick1`.`bdmascotas` on((`bdclick1`.`bdmascotas`.`codigo` = `bdclick1`.`bdingresoshospitalizacion`.`mascota`))) left join `bdclick1`.`bdterceros` on((`bdclick1`.`bdmascotas`.`cliente` = `bdclick1`.`bdterceros`.`idSistema`))) where (`bdclick1`.`bdingresoshospitalizacion`.`activo` = 0)
md5=e759d6e0c1eedb991d55d3e84abb8d54
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:35
create-version=2
source=select `bdingresoshospitalizacion`.`Id` AS `Id`,`bdingresoshospitalizacion`.`mascota` AS `codigo`,`bdmascotas`.`nombre` AS `mascota`,`bdmascotas`.`cliente` AS `cedula`,`bdterceros`.`nombre` AS `cliente`,`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdingresoshospitalizacion`.`activo` AS `activo` from ((`bdingresoshospitalizacion` left join `bdmascotas` on((`bdmascotas`.`codigo` = `bdingresoshospitalizacion`.`mascota`))) left join `bdterceros` on((`bdmascotas`.`cliente` = `bdterceros`.`idSistema`))) where (`bdingresoshospitalizacion`.`activo` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdingresoshospitalizacion`.`Id` AS `Id`,`bdclick1`.`bdingresoshospitalizacion`.`mascota` AS `codigo`,`bdclick1`.`bdmascotas`.`nombre` AS `mascota`,`bdclick1`.`bdmascotas`.`cliente` AS `cedula`,`bdclick1`.`bdterceros`.`nombre` AS `cliente`,`bdclick1`.`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdclick1`.`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdclick1`.`bdingresoshospitalizacion`.`activo` AS `activo` from ((`bdclick1`.`bdingresoshospitalizacion` left join `bdclick1`.`bdmascotas` on((`bdclick1`.`bdmascotas`.`codigo` = `bdclick1`.`bdingresoshospitalizacion`.`mascota`))) left join `bdclick1`.`bdterceros` on((`bdclick1`.`bdmascotas`.`cliente` = `bdclick1`.`bdterceros`.`idSistema`))) where (`bdclick1`.`bdingresoshospitalizacion`.`activo` = 0)
mariadb-version=100135
