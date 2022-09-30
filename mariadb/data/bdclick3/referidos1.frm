TYPE=VIEW
query=(select `bdclick3`.`bdterceros`.`id` AS `Id`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdterceros`.`telefono` AS `telefono`,`bdclick3`.`bdterceros`.`celular` AS `celular`,`bdclick3`.`bdterceros`.`direccion` AS `direccion`,`bdclick3`.`bdterceros`.`nacimiento` AS `fCreacion`,`bdclick3`.`bdreferidosterceros`.`tercero` AS `tercero`,`bdclick3`.`bdterceros`.`referido` AS `referido`,`bdterceros_1`.`nombre` AS `nombreRef`,`bdterceros_1`.`telefono` AS `telefonoRef`,`bdterceros_1`.`celular` AS `celularRef`,`bdterceros_1`.`celular` AS `direccionRef`,`bdterceros_1`.`nacimiento` AS `fCreacionRef` from ((`bdclick3`.`bdterceros` left join `bdclick3`.`bdreferidosterceros` on((`bdclick3`.`bdterceros`.`id` = `bdclick3`.`bdreferidosterceros`.`referido`))) left join `bdclick3`.`bdterceros` `bdterceros_1` on((`bdclick3`.`bdreferidosterceros`.`referido` = `bdterceros_1`.`id`))))
md5=5ba173b91df64ca70fe5bf52e1892f03
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:52
create-version=2
source=(select `bdterceros`.`id` AS `Id`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`celular` AS `celular`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`nacimiento` AS `fCreacion`,`bdreferidosterceros`.`tercero` AS `tercero`,`bdterceros`.`referido` AS `referido`,`bdterceros_1`.`nombre` AS `nombreRef`,`bdterceros_1`.`telefono` AS `telefonoRef`,`bdterceros_1`.`celular` AS `celularRef`,`bdterceros_1`.`celular` AS `direccionRef`,`bdterceros_1`.`nacimiento` AS `fCreacionRef` from ((`bdterceros` left join `bdreferidosterceros` on((`bdterceros`.`id` = `bdreferidosterceros`.`referido`))) left join `bdterceros` `bdterceros_1` on((`bdreferidosterceros`.`referido` = `bdterceros_1`.`id`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bdterceros`.`id` AS `Id`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdterceros`.`telefono` AS `telefono`,`bdclick3`.`bdterceros`.`celular` AS `celular`,`bdclick3`.`bdterceros`.`direccion` AS `direccion`,`bdclick3`.`bdterceros`.`nacimiento` AS `fCreacion`,`bdclick3`.`bdreferidosterceros`.`tercero` AS `tercero`,`bdclick3`.`bdterceros`.`referido` AS `referido`,`bdterceros_1`.`nombre` AS `nombreRef`,`bdterceros_1`.`telefono` AS `telefonoRef`,`bdterceros_1`.`celular` AS `celularRef`,`bdterceros_1`.`celular` AS `direccionRef`,`bdterceros_1`.`nacimiento` AS `fCreacionRef` from ((`bdclick3`.`bdterceros` left join `bdclick3`.`bdreferidosterceros` on((`bdclick3`.`bdterceros`.`id` = `bdclick3`.`bdreferidosterceros`.`referido`))) left join `bdclick3`.`bdterceros` `bdterceros_1` on((`bdclick3`.`bdreferidosterceros`.`referido` = `bdterceros_1`.`id`))))
mariadb-version=100135
