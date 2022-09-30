TYPE=VIEW
query=(select `bdclick2`.`bdterceros`.`id` AS `Id`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,`bdclick2`.`bdterceros`.`telefono` AS `telefono`,`bdclick2`.`bdterceros`.`celular` AS `celular`,`bdclick2`.`bdterceros`.`direccion` AS `direccion`,`bdclick2`.`bdterceros`.`nacimiento` AS `fCreacion`,`bdclick2`.`bdreferidosterceros`.`tercero` AS `tercero`,`bdclick2`.`bdterceros`.`referido` AS `referido`,`bdterceros_1`.`nombre` AS `nombreRef`,`bdterceros_1`.`telefono` AS `telefonoRef`,`bdterceros_1`.`celular` AS `celularRef`,`bdterceros_1`.`celular` AS `direccionRef`,`bdterceros_1`.`nacimiento` AS `fCreacionRef` from ((`bdclick2`.`bdterceros` left join `bdclick2`.`bdreferidosterceros` on((`bdclick2`.`bdterceros`.`id` = `bdclick2`.`bdreferidosterceros`.`referido`))) left join `bdclick2`.`bdterceros` `bdterceros_1` on((`bdclick2`.`bdreferidosterceros`.`referido` = `bdterceros_1`.`id`))))
md5=5a820f9cea3f7a8192a837da4bb717c5
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:47
create-version=2
source=(select `bdterceros`.`id` AS `Id`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`celular` AS `celular`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`nacimiento` AS `fCreacion`,`bdreferidosterceros`.`tercero` AS `tercero`,`bdterceros`.`referido` AS `referido`,`bdterceros_1`.`nombre` AS `nombreRef`,`bdterceros_1`.`telefono` AS `telefonoRef`,`bdterceros_1`.`celular` AS `celularRef`,`bdterceros_1`.`celular` AS `direccionRef`,`bdterceros_1`.`nacimiento` AS `fCreacionRef` from ((`bdterceros` left join `bdreferidosterceros` on((`bdterceros`.`id` = `bdreferidosterceros`.`referido`))) left join `bdterceros` `bdterceros_1` on((`bdreferidosterceros`.`referido` = `bdterceros_1`.`id`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick2`.`bdterceros`.`id` AS `Id`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,`bdclick2`.`bdterceros`.`telefono` AS `telefono`,`bdclick2`.`bdterceros`.`celular` AS `celular`,`bdclick2`.`bdterceros`.`direccion` AS `direccion`,`bdclick2`.`bdterceros`.`nacimiento` AS `fCreacion`,`bdclick2`.`bdreferidosterceros`.`tercero` AS `tercero`,`bdclick2`.`bdterceros`.`referido` AS `referido`,`bdterceros_1`.`nombre` AS `nombreRef`,`bdterceros_1`.`telefono` AS `telefonoRef`,`bdterceros_1`.`celular` AS `celularRef`,`bdterceros_1`.`celular` AS `direccionRef`,`bdterceros_1`.`nacimiento` AS `fCreacionRef` from ((`bdclick2`.`bdterceros` left join `bdclick2`.`bdreferidosterceros` on((`bdclick2`.`bdterceros`.`id` = `bdclick2`.`bdreferidosterceros`.`referido`))) left join `bdclick2`.`bdterceros` `bdterceros_1` on((`bdclick2`.`bdreferidosterceros`.`referido` = `bdterceros_1`.`id`))))
mariadb-version=100135
