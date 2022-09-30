TYPE=VIEW
query=(select `bdclick6`.`bdterceros`.`id` AS `Id`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,`bdclick6`.`bdterceros`.`celular` AS `celular`,`bdclick6`.`bdterceros`.`direccion` AS `direccion`,`bdclick6`.`bdterceros`.`nacimiento` AS `fCreacion`,`bdclick6`.`bdreferidosterceros`.`tercero` AS `tercero`,`bdclick6`.`bdterceros`.`referido` AS `referido`,`bdterceros_1`.`nombre` AS `nombreRef`,`bdterceros_1`.`telefono` AS `telefonoRef`,`bdterceros_1`.`celular` AS `celularRef`,`bdterceros_1`.`celular` AS `direccionRef`,`bdterceros_1`.`nacimiento` AS `fCreacionRef` from ((`bdclick6`.`bdterceros` left join `bdclick6`.`bdreferidosterceros` on((`bdclick6`.`bdterceros`.`id` = `bdclick6`.`bdreferidosterceros`.`referido`))) left join `bdclick6`.`bdterceros` `bdterceros_1` on((`bdclick6`.`bdreferidosterceros`.`referido` = `bdterceros_1`.`id`))))
md5=509792fc7eaf150c1a8655da3b15c3d7
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:37
create-version=2
source=(select `bdterceros`.`id` AS `Id`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`celular` AS `celular`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`nacimiento` AS `fCreacion`,`bdreferidosterceros`.`tercero` AS `tercero`,`bdterceros`.`referido` AS `referido`,`bdterceros_1`.`nombre` AS `nombreRef`,`bdterceros_1`.`telefono` AS `telefonoRef`,`bdterceros_1`.`celular` AS `celularRef`,`bdterceros_1`.`celular` AS `direccionRef`,`bdterceros_1`.`nacimiento` AS `fCreacionRef` from ((`bdterceros` left join `bdreferidosterceros` on((`bdterceros`.`id` = `bdreferidosterceros`.`referido`))) left join `bdterceros` `bdterceros_1` on((`bdreferidosterceros`.`referido` = `bdterceros_1`.`id`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bdterceros`.`id` AS `Id`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,`bdclick6`.`bdterceros`.`celular` AS `celular`,`bdclick6`.`bdterceros`.`direccion` AS `direccion`,`bdclick6`.`bdterceros`.`nacimiento` AS `fCreacion`,`bdclick6`.`bdreferidosterceros`.`tercero` AS `tercero`,`bdclick6`.`bdterceros`.`referido` AS `referido`,`bdterceros_1`.`nombre` AS `nombreRef`,`bdterceros_1`.`telefono` AS `telefonoRef`,`bdterceros_1`.`celular` AS `celularRef`,`bdterceros_1`.`celular` AS `direccionRef`,`bdterceros_1`.`nacimiento` AS `fCreacionRef` from ((`bdclick6`.`bdterceros` left join `bdclick6`.`bdreferidosterceros` on((`bdclick6`.`bdterceros`.`id` = `bdclick6`.`bdreferidosterceros`.`referido`))) left join `bdclick6`.`bdterceros` `bdterceros_1` on((`bdclick6`.`bdreferidosterceros`.`referido` = `bdterceros_1`.`id`))))
mariadb-version=100135
