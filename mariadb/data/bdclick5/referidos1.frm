TYPE=VIEW
query=(select `bdclick5`.`bdterceros`.`id` AS `Id`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdterceros`.`telefono` AS `telefono`,`bdclick5`.`bdterceros`.`celular` AS `celular`,`bdclick5`.`bdterceros`.`direccion` AS `direccion`,`bdclick5`.`bdterceros`.`nacimiento` AS `fCreacion`,`bdclick5`.`bdreferidosterceros`.`tercero` AS `tercero`,`bdclick5`.`bdterceros`.`referido` AS `referido`,`bdterceros_1`.`nombre` AS `nombreRef`,`bdterceros_1`.`telefono` AS `telefonoRef`,`bdterceros_1`.`celular` AS `celularRef`,`bdterceros_1`.`celular` AS `direccionRef`,`bdterceros_1`.`nacimiento` AS `fCreacionRef` from ((`bdclick5`.`bdterceros` left join `bdclick5`.`bdreferidosterceros` on((`bdclick5`.`bdterceros`.`id` = `bdclick5`.`bdreferidosterceros`.`referido`))) left join `bdclick5`.`bdterceros` `bdterceros_1` on((`bdclick5`.`bdreferidosterceros`.`referido` = `bdterceros_1`.`id`))))
md5=aeb62189c38cce3b51019ed30cabb921
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:49
create-version=2
source=(select `bdterceros`.`id` AS `Id`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`celular` AS `celular`,`bdterceros`.`direccion` AS `direccion`,`bdterceros`.`nacimiento` AS `fCreacion`,`bdreferidosterceros`.`tercero` AS `tercero`,`bdterceros`.`referido` AS `referido`,`bdterceros_1`.`nombre` AS `nombreRef`,`bdterceros_1`.`telefono` AS `telefonoRef`,`bdterceros_1`.`celular` AS `celularRef`,`bdterceros_1`.`celular` AS `direccionRef`,`bdterceros_1`.`nacimiento` AS `fCreacionRef` from ((`bdterceros` left join `bdreferidosterceros` on((`bdterceros`.`id` = `bdreferidosterceros`.`referido`))) left join `bdterceros` `bdterceros_1` on((`bdreferidosterceros`.`referido` = `bdterceros_1`.`id`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`bdterceros`.`id` AS `Id`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdterceros`.`telefono` AS `telefono`,`bdclick5`.`bdterceros`.`celular` AS `celular`,`bdclick5`.`bdterceros`.`direccion` AS `direccion`,`bdclick5`.`bdterceros`.`nacimiento` AS `fCreacion`,`bdclick5`.`bdreferidosterceros`.`tercero` AS `tercero`,`bdclick5`.`bdterceros`.`referido` AS `referido`,`bdterceros_1`.`nombre` AS `nombreRef`,`bdterceros_1`.`telefono` AS `telefonoRef`,`bdterceros_1`.`celular` AS `celularRef`,`bdterceros_1`.`celular` AS `direccionRef`,`bdterceros_1`.`nacimiento` AS `fCreacionRef` from ((`bdclick5`.`bdterceros` left join `bdclick5`.`bdreferidosterceros` on((`bdclick5`.`bdterceros`.`id` = `bdclick5`.`bdreferidosterceros`.`referido`))) left join `bdclick5`.`bdterceros` `bdterceros_1` on((`bdclick5`.`bdreferidosterceros`.`referido` = `bdterceros_1`.`id`))))
mariadb-version=100135
