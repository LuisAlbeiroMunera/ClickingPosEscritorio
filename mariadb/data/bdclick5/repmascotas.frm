TYPE=VIEW
query=select `bdclick5`.`bdmascotas`.`codigo` AS `codigo`,`bdclick5`.`bdmascotas`.`cliente` AS `cliente`,`bdclick5`.`bdterceros`.`nombre` AS `nom`,`bdclick5`.`bdterceros`.`telefono` AS `telefono`,`bdclick5`.`bdmascotas`.`nombre` AS `nombre`,`bdclick5`.`bdmascotas`.`especie` AS `especie`,`bdclick5`.`bdmascotas`.`raza` AS `raza`,`bdclick5`.`bdmascotas`.`genero` AS `genero`,`bdclick5`.`bdterceros`.`id` AS `Id` from (`bdclick5`.`bdmascotas` left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdmascotas`.`cliente` = `bdclick5`.`bdterceros`.`idSistema`)))
md5=2ae7424b4d7b82dd0bcac6d586f1063a
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:50
create-version=2
source=select `bdmascotas`.`codigo` AS `codigo`,`bdmascotas`.`cliente` AS `cliente`,`bdterceros`.`nombre` AS `nom`,`bdterceros`.`telefono` AS `telefono`,`bdmascotas`.`nombre` AS `nombre`,`bdmascotas`.`especie` AS `especie`,`bdmascotas`.`raza` AS `raza`,`bdmascotas`.`genero` AS `genero`,`bdterceros`.`id` AS `Id` from (`bdmascotas` left join `bdterceros` on((`bdmascotas`.`cliente` = `bdterceros`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdmascotas`.`codigo` AS `codigo`,`bdclick5`.`bdmascotas`.`cliente` AS `cliente`,`bdclick5`.`bdterceros`.`nombre` AS `nom`,`bdclick5`.`bdterceros`.`telefono` AS `telefono`,`bdclick5`.`bdmascotas`.`nombre` AS `nombre`,`bdclick5`.`bdmascotas`.`especie` AS `especie`,`bdclick5`.`bdmascotas`.`raza` AS `raza`,`bdclick5`.`bdmascotas`.`genero` AS `genero`,`bdclick5`.`bdterceros`.`id` AS `Id` from (`bdclick5`.`bdmascotas` left join `bdclick5`.`bdterceros` on((`bdclick5`.`bdmascotas`.`cliente` = `bdclick5`.`bdterceros`.`idSistema`)))
mariadb-version=100135
