TYPE=VIEW
query=select `bdclick1`.`bdmascotas`.`codigo` AS `codigo`,`bdclick1`.`bdmascotas`.`cliente` AS `cliente`,`bdclick1`.`bdterceros`.`nombre` AS `nom`,`bdclick1`.`bdterceros`.`telefono` AS `telefono`,`bdclick1`.`bdmascotas`.`nombre` AS `nombre`,`bdclick1`.`bdmascotas`.`especie` AS `especie`,`bdclick1`.`bdmascotas`.`raza` AS `raza`,`bdclick1`.`bdmascotas`.`genero` AS `genero`,`bdclick1`.`bdterceros`.`id` AS `Id` from (`bdclick1`.`bdmascotas` left join `bdclick1`.`bdterceros` on((`bdclick1`.`bdmascotas`.`cliente` = `bdclick1`.`bdterceros`.`idSistema`)))
md5=5516620deb9c5adaae8c5fafaf652cbe
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:37
create-version=2
source=select `bdmascotas`.`codigo` AS `codigo`,`bdmascotas`.`cliente` AS `cliente`,`bdterceros`.`nombre` AS `nom`,`bdterceros`.`telefono` AS `telefono`,`bdmascotas`.`nombre` AS `nombre`,`bdmascotas`.`especie` AS `especie`,`bdmascotas`.`raza` AS `raza`,`bdmascotas`.`genero` AS `genero`,`bdterceros`.`id` AS `Id` from (`bdmascotas` left join `bdterceros` on((`bdmascotas`.`cliente` = `bdterceros`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdmascotas`.`codigo` AS `codigo`,`bdclick1`.`bdmascotas`.`cliente` AS `cliente`,`bdclick1`.`bdterceros`.`nombre` AS `nom`,`bdclick1`.`bdterceros`.`telefono` AS `telefono`,`bdclick1`.`bdmascotas`.`nombre` AS `nombre`,`bdclick1`.`bdmascotas`.`especie` AS `especie`,`bdclick1`.`bdmascotas`.`raza` AS `raza`,`bdclick1`.`bdmascotas`.`genero` AS `genero`,`bdclick1`.`bdterceros`.`id` AS `Id` from (`bdclick1`.`bdmascotas` left join `bdclick1`.`bdterceros` on((`bdclick1`.`bdmascotas`.`cliente` = `bdclick1`.`bdterceros`.`idSistema`)))
mariadb-version=100135
