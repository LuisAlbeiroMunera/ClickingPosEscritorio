TYPE=VIEW
query=(select `bdclick1`.`bdterceros`.`id` AS `Id`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`bdclick1`.`bdterceros`.`telefono` AS `telefono`,`bdclick1`.`bdterceros`.`celular` AS `celular`,`bdclick1`.`bdterceros`.`direccion` AS `direccion`,`bdclick1`.`bdterceros`.`nacimiento` AS `fCreacion`,`bdclick1`.`bdreferidosterceros`.`tercero` AS `tercero`,`bdclick1`.`bdterceros`.`referido` AS `referido`,`bdterceros_1`.`nombre` AS `nombreRef`,`bdterceros_1`.`telefono` AS `telefonoRef`,`bdterceros_1`.`celular` AS `celularRef`,`bdterceros_1`.`celular` AS `direccionRef`,`bdterceros_1`.`nacimiento` AS `fCreacionRef` from ((`bdclick1`.`bdterceros` left join `bdclick1`.`bdreferidosterceros` on((`bdclick1`.`bdterceros`.`id` = `bdclick1`.`bdreferidosterceros`.`referido`))) left join `bdclick1`.`bdterceros` `bdterceros_1` on((`bdclick1`.`bdreferidosterceros`.`referido` = `bdterceros_1`.`id`))))
md5=835cf95ad7f7c9b209dec034d3bd1820
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:36
create-version=2
source=(select `bdterceros`.`id` AS `Id`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`celular` AS `celular`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`nacimiento` AS `fCreacion`,`bdreferidosterceros`.`tercero` AS `tercero`,`bdterceros`.`referido` AS `referido`,`bdterceros_1`.`nombre` AS `nombreRef`,`bdterceros_1`.`telefono` AS `telefonoRef`,`bdterceros_1`.`celular` AS `celularRef`,`bdterceros_1`.`celular` AS `direccionRef`,`bdterceros_1`.`nacimiento` AS `fCreacionRef` from ((`bdterceros` left join `bdreferidosterceros` on((`bdterceros`.`id` = `bdreferidosterceros`.`referido`))) left join `bdterceros` `bdterceros_1` on((`bdreferidosterceros`.`referido` = `bdterceros_1`.`id`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick1`.`bdterceros`.`id` AS `Id`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`bdclick1`.`bdterceros`.`telefono` AS `telefono`,`bdclick1`.`bdterceros`.`celular` AS `celular`,`bdclick1`.`bdterceros`.`direccion` AS `direccion`,`bdclick1`.`bdterceros`.`nacimiento` AS `fCreacion`,`bdclick1`.`bdreferidosterceros`.`tercero` AS `tercero`,`bdclick1`.`bdterceros`.`referido` AS `referido`,`bdterceros_1`.`nombre` AS `nombreRef`,`bdterceros_1`.`telefono` AS `telefonoRef`,`bdterceros_1`.`celular` AS `celularRef`,`bdterceros_1`.`celular` AS `direccionRef`,`bdterceros_1`.`nacimiento` AS `fCreacionRef` from ((`bdclick1`.`bdterceros` left join `bdclick1`.`bdreferidosterceros` on((`bdclick1`.`bdterceros`.`id` = `bdclick1`.`bdreferidosterceros`.`referido`))) left join `bdclick1`.`bdterceros` `bdterceros_1` on((`bdclick1`.`bdreferidosterceros`.`referido` = `bdterceros_1`.`id`))))
mariadb-version=100135
