TYPE=VIEW
query=select `bdclick3`.`bdingresoshospitalizacion`.`Id` AS `Id`,`bdclick3`.`bdingresoshospitalizacion`.`mascota` AS `codigo`,`bdclick3`.`bdmascotas`.`nombre` AS `mascota`,`bdclick3`.`bdmascotas`.`cliente` AS `cedula`,`bdclick3`.`bdterceros`.`nombre` AS `cliente`,`bdclick3`.`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdclick3`.`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdclick3`.`bdingresoshospitalizacion`.`activo` AS `activo` from ((`bdclick3`.`bdingresoshospitalizacion` left join `bdclick3`.`bdmascotas` on((`bdclick3`.`bdmascotas`.`codigo` = `bdclick3`.`bdingresoshospitalizacion`.`mascota`))) left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdmascotas`.`cliente` = `bdclick3`.`bdterceros`.`idSistema`))) where (`bdclick3`.`bdingresoshospitalizacion`.`activo` = 0)
md5=97265470bfbc04050bd561016233c9cc
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:51
create-version=2
source=select `bdingresoshospitalizacion`.`Id` AS `Id`,`bdingresoshospitalizacion`.`mascota` AS `codigo`,`bdmascotas`.`nombre` AS `mascota`,`bdmascotas`.`cliente` AS `cedula`,`bdterceros`.`nombre` AS `cliente`,`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdingresoshospitalizacion`.`activo` AS `activo` from ((`bdingresoshospitalizacion` left join `bdmascotas` on((`bdmascotas`.`codigo` = `bdingresoshospitalizacion`.`mascota`))) left join `bdterceros` on((`bdmascotas`.`cliente` = `bdterceros`.`idSistema`))) where (`bdingresoshospitalizacion`.`activo` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdingresoshospitalizacion`.`Id` AS `Id`,`bdclick3`.`bdingresoshospitalizacion`.`mascota` AS `codigo`,`bdclick3`.`bdmascotas`.`nombre` AS `mascota`,`bdclick3`.`bdmascotas`.`cliente` AS `cedula`,`bdclick3`.`bdterceros`.`nombre` AS `cliente`,`bdclick3`.`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdclick3`.`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdclick3`.`bdingresoshospitalizacion`.`activo` AS `activo` from ((`bdclick3`.`bdingresoshospitalizacion` left join `bdclick3`.`bdmascotas` on((`bdclick3`.`bdmascotas`.`codigo` = `bdclick3`.`bdingresoshospitalizacion`.`mascota`))) left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdmascotas`.`cliente` = `bdclick3`.`bdterceros`.`idSistema`))) where (`bdclick3`.`bdingresoshospitalizacion`.`activo` = 0)
mariadb-version=100135
