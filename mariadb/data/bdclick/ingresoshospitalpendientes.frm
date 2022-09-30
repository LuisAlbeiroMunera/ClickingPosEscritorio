TYPE=VIEW
query=select `bdclick`.`bdingresoshospitalizacion`.`Id` AS `Id`,`bdclick`.`bdingresoshospitalizacion`.`mascota` AS `codigo`,`bdclick`.`bdmascotas`.`nombre` AS `mascota`,`bdclick`.`bdmascotas`.`cliente` AS `cedula`,`bdclick`.`bdterceros`.`nombre` AS `cliente`,`bdclick`.`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdclick`.`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdclick`.`bdingresoshospitalizacion`.`activo` AS `activo` from ((`bdclick`.`bdingresoshospitalizacion` left join `bdclick`.`bdmascotas` on((`bdclick`.`bdmascotas`.`codigo` = `bdclick`.`bdingresoshospitalizacion`.`mascota`))) left join `bdclick`.`bdterceros` on((`bdclick`.`bdmascotas`.`cliente` = `bdclick`.`bdterceros`.`idSistema`))) where (`bdclick`.`bdingresoshospitalizacion`.`activo` = 0)
md5=ce37efe8bf63f27222ececcb454b5dfd
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:24
create-version=2
source=select `bdingresoshospitalizacion`.`Id` AS `Id`,`bdingresoshospitalizacion`.`mascota` AS `codigo`,`bdmascotas`.`nombre` AS `mascota`,`bdmascotas`.`cliente` AS `cedula`,`bdterceros`.`nombre` AS `cliente`,`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdingresoshospitalizacion`.`activo` AS `activo` from ((`bdingresoshospitalizacion` left join `bdmascotas` on((`bdmascotas`.`codigo` = `bdingresoshospitalizacion`.`mascota`))) left join `bdterceros` on((`bdmascotas`.`cliente` = `bdterceros`.`idSistema`))) where (`bdingresoshospitalizacion`.`activo` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdingresoshospitalizacion`.`Id` AS `Id`,`bdclick`.`bdingresoshospitalizacion`.`mascota` AS `codigo`,`bdclick`.`bdmascotas`.`nombre` AS `mascota`,`bdclick`.`bdmascotas`.`cliente` AS `cedula`,`bdclick`.`bdterceros`.`nombre` AS `cliente`,`bdclick`.`bdingresoshospitalizacion`.`fIngreso` AS `fIngreso`,`bdclick`.`bdingresoshospitalizacion`.`hIngreso` AS `hIngreso`,`bdclick`.`bdingresoshospitalizacion`.`activo` AS `activo` from ((`bdclick`.`bdingresoshospitalizacion` left join `bdclick`.`bdmascotas` on((`bdclick`.`bdmascotas`.`codigo` = `bdclick`.`bdingresoshospitalizacion`.`mascota`))) left join `bdclick`.`bdterceros` on((`bdclick`.`bdmascotas`.`cliente` = `bdclick`.`bdterceros`.`idSistema`))) where (`bdclick`.`bdingresoshospitalizacion`.`activo` = 0)
mariadb-version=100135
