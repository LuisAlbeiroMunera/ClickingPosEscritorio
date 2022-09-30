TYPE=VIEW
query=select `bdclick`.`bdmascotas`.`codigo` AS `codigo`,`bdclick`.`bdmascotas`.`cliente` AS `cliente`,`bdclick`.`bdterceros`.`nombre` AS `nom`,`bdclick`.`bdterceros`.`telefono` AS `telefono`,`bdclick`.`bdmascotas`.`nombre` AS `nombre`,`bdclick`.`bdmascotas`.`especie` AS `especie`,`bdclick`.`bdmascotas`.`raza` AS `raza`,`bdclick`.`bdmascotas`.`genero` AS `genero`,`bdclick`.`bdterceros`.`id` AS `Id` from (`bdclick`.`bdmascotas` left join `bdclick`.`bdterceros` on((`bdclick`.`bdmascotas`.`cliente` = `bdclick`.`bdterceros`.`idSistema`)))
md5=d4897146324d51e4bab701c0a7083ff8
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:26
create-version=2
source=select `bdmascotas`.`codigo` AS `codigo`,`bdmascotas`.`cliente` AS `cliente`,`bdterceros`.`nombre` AS `nom`,`bdterceros`.`telefono` AS `telefono`,`bdmascotas`.`nombre` AS `nombre`,`bdmascotas`.`especie` AS `especie`,`bdmascotas`.`raza` AS `raza`,`bdmascotas`.`genero` AS `genero`,`bdterceros`.`id` AS `Id` from (`bdmascotas` left join `bdterceros` on((`bdmascotas`.`cliente` = `bdterceros`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdmascotas`.`codigo` AS `codigo`,`bdclick`.`bdmascotas`.`cliente` AS `cliente`,`bdclick`.`bdterceros`.`nombre` AS `nom`,`bdclick`.`bdterceros`.`telefono` AS `telefono`,`bdclick`.`bdmascotas`.`nombre` AS `nombre`,`bdclick`.`bdmascotas`.`especie` AS `especie`,`bdclick`.`bdmascotas`.`raza` AS `raza`,`bdclick`.`bdmascotas`.`genero` AS `genero`,`bdclick`.`bdterceros`.`id` AS `Id` from (`bdclick`.`bdmascotas` left join `bdclick`.`bdterceros` on((`bdclick`.`bdmascotas`.`cliente` = `bdclick`.`bdterceros`.`idSistema`)))
mariadb-version=100135
