TYPE=VIEW
query=(select `bdclick`.`bdterceros`.`id` AS `Id`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdterceros`.`telefono` AS `telefono`,`bdclick`.`bdterceros`.`celular` AS `celular`,`bdclick`.`bdterceros`.`direccion` AS `direccion`,`bdclick`.`bdterceros`.`nacimiento` AS `fCreacion`,`bdclick`.`bdreferidosterceros`.`tercero` AS `tercero`,`bdclick`.`bdterceros`.`referido` AS `referido`,`bdterceros_1`.`nombre` AS `nombreRef`,`bdterceros_1`.`telefono` AS `telefonoRef`,`bdterceros_1`.`celular` AS `celularRef`,`bdterceros_1`.`celular` AS `direccionRef`,`bdterceros_1`.`nacimiento` AS `fCreacionRef` from ((`bdclick`.`bdterceros` left join `bdclick`.`bdreferidosterceros` on((`bdclick`.`bdterceros`.`id` = `bdclick`.`bdreferidosterceros`.`referido`))) left join `bdclick`.`bdterceros` `bdterceros_1` on((`bdclick`.`bdreferidosterceros`.`referido` = `bdterceros_1`.`id`))))
md5=a32b7d1fe2e99bbf9d19ba8f89d133b5
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:26
create-version=2
source=(select `bdterceros`.`id` AS `Id`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`celular` AS `celular`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`nacimiento` AS `fCreacion`,`bdreferidosterceros`.`tercero` AS `tercero`,`bdterceros`.`referido` AS `referido`,`bdterceros_1`.`nombre` AS `nombreRef`,`bdterceros_1`.`telefono` AS `telefonoRef`,`bdterceros_1`.`celular` AS `celularRef`,`bdterceros_1`.`celular` AS `direccionRef`,`bdterceros_1`.`nacimiento` AS `fCreacionRef` from ((`bdterceros` left join `bdreferidosterceros` on((`bdterceros`.`id` = `bdreferidosterceros`.`referido`))) left join `bdterceros` `bdterceros_1` on((`bdreferidosterceros`.`referido` = `bdterceros_1`.`id`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdterceros`.`id` AS `Id`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdterceros`.`telefono` AS `telefono`,`bdclick`.`bdterceros`.`celular` AS `celular`,`bdclick`.`bdterceros`.`direccion` AS `direccion`,`bdclick`.`bdterceros`.`nacimiento` AS `fCreacion`,`bdclick`.`bdreferidosterceros`.`tercero` AS `tercero`,`bdclick`.`bdterceros`.`referido` AS `referido`,`bdterceros_1`.`nombre` AS `nombreRef`,`bdterceros_1`.`telefono` AS `telefonoRef`,`bdterceros_1`.`celular` AS `celularRef`,`bdterceros_1`.`celular` AS `direccionRef`,`bdterceros_1`.`nacimiento` AS `fCreacionRef` from ((`bdclick`.`bdterceros` left join `bdclick`.`bdreferidosterceros` on((`bdclick`.`bdterceros`.`id` = `bdclick`.`bdreferidosterceros`.`referido`))) left join `bdclick`.`bdterceros` `bdterceros_1` on((`bdclick`.`bdreferidosterceros`.`referido` = `bdterceros_1`.`id`))))
mariadb-version=100135
