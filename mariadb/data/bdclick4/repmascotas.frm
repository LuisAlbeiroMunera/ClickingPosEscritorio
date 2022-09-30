TYPE=VIEW
query=select `bdclick4`.`bdmascotas`.`codigo` AS `codigo`,`bdclick4`.`bdmascotas`.`cliente` AS `cliente`,`bdclick4`.`bdterceros`.`nombre` AS `nom`,`bdclick4`.`bdterceros`.`telefono` AS `telefono`,`bdclick4`.`bdmascotas`.`nombre` AS `nombre`,`bdclick4`.`bdmascotas`.`especie` AS `especie`,`bdclick4`.`bdmascotas`.`raza` AS `raza`,`bdclick4`.`bdmascotas`.`genero` AS `genero`,`bdclick4`.`bdterceros`.`id` AS `Id` from (`bdclick4`.`bdmascotas` left join `bdclick4`.`bdterceros` on((`bdclick4`.`bdmascotas`.`cliente` = `bdclick4`.`bdterceros`.`idSistema`)))
md5=17d673fd8b0608ed85199e066488df5f
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:30
create-version=2
source=select `bdmascotas`.`codigo` AS `codigo`,`bdmascotas`.`cliente` AS `cliente`,`bdterceros`.`nombre` AS `nom`,`bdterceros`.`telefono` AS `telefono`,`bdmascotas`.`nombre` AS `nombre`,`bdmascotas`.`especie` AS `especie`,`bdmascotas`.`raza` AS `raza`,`bdmascotas`.`genero` AS `genero`,`bdterceros`.`id` AS `Id` from (`bdmascotas` left join `bdterceros` on((`bdmascotas`.`cliente` = `bdterceros`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdmascotas`.`codigo` AS `codigo`,`bdclick4`.`bdmascotas`.`cliente` AS `cliente`,`bdclick4`.`bdterceros`.`nombre` AS `nom`,`bdclick4`.`bdterceros`.`telefono` AS `telefono`,`bdclick4`.`bdmascotas`.`nombre` AS `nombre`,`bdclick4`.`bdmascotas`.`especie` AS `especie`,`bdclick4`.`bdmascotas`.`raza` AS `raza`,`bdclick4`.`bdmascotas`.`genero` AS `genero`,`bdclick4`.`bdterceros`.`id` AS `Id` from (`bdclick4`.`bdmascotas` left join `bdclick4`.`bdterceros` on((`bdclick4`.`bdmascotas`.`cliente` = `bdclick4`.`bdterceros`.`idSistema`)))
mariadb-version=100135
