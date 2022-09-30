TYPE=VIEW
query=(select `bdclick4`.`bdterceros`.`id` AS `Id`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,`bdclick4`.`bdterceros`.`telefono` AS `telefono`,`bdclick4`.`bdterceros`.`celular` AS `celular`,`bdclick4`.`bdterceros`.`direccion` AS `direccion`,`bdclick4`.`bdterceros`.`nacimiento` AS `fCreacion`,`bdclick4`.`bdreferidosterceros`.`tercero` AS `tercero`,`bdclick4`.`bdterceros`.`referido` AS `referido`,`bdterceros_1`.`nombre` AS `nombreRef`,`bdterceros_1`.`telefono` AS `telefonoRef`,`bdterceros_1`.`celular` AS `celularRef`,`bdterceros_1`.`celular` AS `direccionRef`,`bdterceros_1`.`nacimiento` AS `fCreacionRef` from ((`bdclick4`.`bdterceros` left join `bdclick4`.`bdreferidosterceros` on((`bdclick4`.`bdterceros`.`id` = `bdclick4`.`bdreferidosterceros`.`referido`))) left join `bdclick4`.`bdterceros` `bdterceros_1` on((`bdclick4`.`bdreferidosterceros`.`referido` = `bdterceros_1`.`id`))))
md5=21fc95bdcce75818be146347a1753ef5
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:29
create-version=2
source=(select `bdterceros`.`id` AS `Id`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`celular` AS `celular`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`nacimiento` AS `fCreacion`,`bdreferidosterceros`.`tercero` AS `tercero`,`bdterceros`.`referido` AS `referido`,`bdterceros_1`.`nombre` AS `nombreRef`,`bdterceros_1`.`telefono` AS `telefonoRef`,`bdterceros_1`.`celular` AS `celularRef`,`bdterceros_1`.`celular` AS `direccionRef`,`bdterceros_1`.`nacimiento` AS `fCreacionRef` from ((`bdterceros` left join `bdreferidosterceros` on((`bdterceros`.`id` = `bdreferidosterceros`.`referido`))) left join `bdterceros` `bdterceros_1` on((`bdreferidosterceros`.`referido` = `bdterceros_1`.`id`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`bdterceros`.`id` AS `Id`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,`bdclick4`.`bdterceros`.`telefono` AS `telefono`,`bdclick4`.`bdterceros`.`celular` AS `celular`,`bdclick4`.`bdterceros`.`direccion` AS `direccion`,`bdclick4`.`bdterceros`.`nacimiento` AS `fCreacion`,`bdclick4`.`bdreferidosterceros`.`tercero` AS `tercero`,`bdclick4`.`bdterceros`.`referido` AS `referido`,`bdterceros_1`.`nombre` AS `nombreRef`,`bdterceros_1`.`telefono` AS `telefonoRef`,`bdterceros_1`.`celular` AS `celularRef`,`bdterceros_1`.`celular` AS `direccionRef`,`bdterceros_1`.`nacimiento` AS `fCreacionRef` from ((`bdclick4`.`bdterceros` left join `bdclick4`.`bdreferidosterceros` on((`bdclick4`.`bdterceros`.`id` = `bdclick4`.`bdreferidosterceros`.`referido`))) left join `bdclick4`.`bdterceros` `bdterceros_1` on((`bdclick4`.`bdreferidosterceros`.`referido` = `bdterceros_1`.`id`))))
mariadb-version=100135
