TYPE=VIEW
query=select `bdclick5`.`bdingresoshospitalizacion`.`Id` AS `Id`,`bdclick5`.`bdingresoshospitalizacion`.`mascota` AS `codigo`,`bdclick5`.`bdmascotas`.`nombre` AS `mascota`,`bdclick5`.`bdmascotas`.`cliente` AS `cedula`,`bdclick5`.`bdterceros`.`nombre` AS `cliente`,`bdclick5`.`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdclick5`.`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdclick5`.`bdingresoshospitalizacion`.`activo` AS `activo` from ((`bdclick5`.`bdingresoshospitalizacion` left join `bdclick5`.`bdmascotas` on((`bdclick5`.`bdmascotas`.`codigo` = `bdclick5`.`bdingresoshospitalizacion`.`mascota`))) left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdmascotas`.`cliente` = `bdclick5`.`bdterceros`.`idSistema`))) where (`bdclick5`.`bdingresoshospitalizacion`.`activo` = 0)
md5=b3417c370b39184d5ab74a8a516da15b
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:47
create-version=2
source=select `bdingresoshospitalizacion`.`Id` AS `Id`,`bdingresoshospitalizacion`.`mascota` AS `codigo`,`bdmascotas`.`nombre` AS `mascota`,`bdmascotas`.`cliente` AS `cedula`,`bdterceros`.`nombre` AS `cliente`,`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdingresoshospitalizacion`.`activo` AS `activo` from ((`bdingresoshospitalizacion` left join `bdmascotas` on((`bdmascotas`.`codigo` = `bdingresoshospitalizacion`.`mascota`))) left join `bdterceros` on((`bdmascotas`.`cliente` = `bdterceros`.`idSistema`))) where (`bdingresoshospitalizacion`.`activo` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdingresoshospitalizacion`.`Id` AS `Id`,`bdclick5`.`bdingresoshospitalizacion`.`mascota` AS `codigo`,`bdclick5`.`bdmascotas`.`nombre` AS `mascota`,`bdclick5`.`bdmascotas`.`cliente` AS `cedula`,`bdclick5`.`bdterceros`.`nombre` AS `cliente`,`bdclick5`.`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdclick5`.`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdclick5`.`bdingresoshospitalizacion`.`activo` AS `activo` from ((`bdclick5`.`bdingresoshospitalizacion` left join `bdclick5`.`bdmascotas` on((`bdclick5`.`bdmascotas`.`codigo` = `bdclick5`.`bdingresoshospitalizacion`.`mascota`))) left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdmascotas`.`cliente` = `bdclick5`.`bdterceros`.`idSistema`))) where (`bdclick5`.`bdingresoshospitalizacion`.`activo` = 0)
mariadb-version=100135
