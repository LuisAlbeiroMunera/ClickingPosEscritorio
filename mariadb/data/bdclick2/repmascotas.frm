TYPE=VIEW
query=select `bdclick2`.`bdmascotas`.`codigo` AS `codigo`,`bdclick2`.`bdmascotas`.`cliente` AS `cliente`,`bdclick2`.`bdterceros`.`nombre` AS `nom`,`bdclick2`.`bdterceros`.`telefono` AS `telefono`,`bdclick2`.`bdmascotas`.`nombre` AS `nombre`,`bdclick2`.`bdmascotas`.`especie` AS `especie`,`bdclick2`.`bdmascotas`.`raza` AS `raza`,`bdclick2`.`bdmascotas`.`genero` AS `genero`,`bdclick2`.`bdterceros`.`id` AS `Id` from (`bdclick2`.`bdmascotas` left join `bdclick2`.`bdterceros` on((`bdclick2`.`bdmascotas`.`cliente` = `bdclick2`.`bdterceros`.`idSistema`)))
md5=ca442189b695b781b3b86edd100805ff
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:47
create-version=2
source=select `bdmascotas`.`codigo` AS `codigo`,`bdmascotas`.`cliente` AS `cliente`,`bdterceros`.`nombre` AS `nom`,`bdterceros`.`telefono` AS `telefono`,`bdmascotas`.`nombre` AS `nombre`,`bdmascotas`.`especie` AS `especie`,`bdmascotas`.`raza` AS `raza`,`bdmascotas`.`genero` AS `genero`,`bdterceros`.`id` AS `Id` from (`bdmascotas` left join `bdterceros` on((`bdmascotas`.`cliente` = `bdterceros`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdmascotas`.`codigo` AS `codigo`,`bdclick2`.`bdmascotas`.`cliente` AS `cliente`,`bdclick2`.`bdterceros`.`nombre` AS `nom`,`bdclick2`.`bdterceros`.`telefono` AS `telefono`,`bdclick2`.`bdmascotas`.`nombre` AS `nombre`,`bdclick2`.`bdmascotas`.`especie` AS `especie`,`bdclick2`.`bdmascotas`.`raza` AS `raza`,`bdclick2`.`bdmascotas`.`genero` AS `genero`,`bdclick2`.`bdterceros`.`id` AS `Id` from (`bdclick2`.`bdmascotas` left join `bdclick2`.`bdterceros` on((`bdclick2`.`bdmascotas`.`cliente` = `bdclick2`.`bdterceros`.`idSistema`)))
mariadb-version=100135
