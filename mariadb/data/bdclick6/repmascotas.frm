TYPE=VIEW
query=select `bdclick6`.`bdmascotas`.`codigo` AS `codigo`,`bdclick6`.`bdmascotas`.`cliente` AS `cliente`,`bdclick6`.`bdterceros`.`nombre` AS `nom`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,`bdclick6`.`bdmascotas`.`nombre` AS `nombre`,`bdclick6`.`bdmascotas`.`especie` AS `especie`,`bdclick6`.`bdmascotas`.`raza` AS `raza`,`bdclick6`.`bdmascotas`.`genero` AS `genero`,`bdclick6`.`bdterceros`.`id` AS `Id` from (`bdclick6`.`bdmascotas` left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdmascotas`.`cliente` = `bdclick6`.`bdterceros`.`idSistema`)))
md5=150175151a0ad1a4b1c5a354a114a0d4
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:38
create-version=2
source=select `bdmascotas`.`codigo` AS `codigo`,`bdmascotas`.`cliente` AS `cliente`,`bdterceros`.`nombre` AS `nom`,`bdterceros`.`telefono` AS `telefono`,`bdmascotas`.`nombre` AS `nombre`,`bdmascotas`.`especie` AS `especie`,`bdmascotas`.`raza` AS `raza`,`bdmascotas`.`genero` AS `genero`,`bdterceros`.`id` AS `Id` from (`bdmascotas` left join `bdterceros` on((`bdmascotas`.`cliente` = `bdterceros`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdmascotas`.`codigo` AS `codigo`,`bdclick6`.`bdmascotas`.`cliente` AS `cliente`,`bdclick6`.`bdterceros`.`nombre` AS `nom`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,`bdclick6`.`bdmascotas`.`nombre` AS `nombre`,`bdclick6`.`bdmascotas`.`especie` AS `especie`,`bdclick6`.`bdmascotas`.`raza` AS `raza`,`bdclick6`.`bdmascotas`.`genero` AS `genero`,`bdclick6`.`bdterceros`.`id` AS `Id` from (`bdclick6`.`bdmascotas` left join `bdclick6`.`bdterceros` on((`bdclick6`.`bdmascotas`.`cliente` = `bdclick6`.`bdterceros`.`idSistema`)))
mariadb-version=100135
