TYPE=VIEW
query=select `bdclick3`.`bdmascotas`.`codigo` AS `codigo`,`bdclick3`.`bdmascotas`.`cliente` AS `cliente`,`bdclick3`.`bdterceros`.`nombre` AS `nom`,`bdclick3`.`bdterceros`.`telefono` AS `telefono`,`bdclick3`.`bdmascotas`.`nombre` AS `nombre`,`bdclick3`.`bdmascotas`.`especie` AS `especie`,`bdclick3`.`bdmascotas`.`raza` AS `raza`,`bdclick3`.`bdmascotas`.`genero` AS `genero`,`bdclick3`.`bdterceros`.`id` AS `Id` from (`bdclick3`.`bdmascotas` left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdmascotas`.`cliente` = `bdclick3`.`bdterceros`.`idSistema`)))
md5=1e4c2e29ca3a0aaa5cb91172a04fb9ce
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:53
create-version=2
source=select `bdmascotas`.`codigo` AS `codigo`,`bdmascotas`.`cliente` AS `cliente`,`bdterceros`.`nombre` AS `nom`,`bdterceros`.`telefono` AS `telefono`,`bdmascotas`.`nombre` AS `nombre`,`bdmascotas`.`especie` AS `especie`,`bdmascotas`.`raza` AS `raza`,`bdmascotas`.`genero` AS `genero`,`bdterceros`.`id` AS `Id` from (`bdmascotas` left join `bdterceros` on((`bdmascotas`.`cliente` = `bdterceros`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdmascotas`.`codigo` AS `codigo`,`bdclick3`.`bdmascotas`.`cliente` AS `cliente`,`bdclick3`.`bdterceros`.`nombre` AS `nom`,`bdclick3`.`bdterceros`.`telefono` AS `telefono`,`bdclick3`.`bdmascotas`.`nombre` AS `nombre`,`bdclick3`.`bdmascotas`.`especie` AS `especie`,`bdclick3`.`bdmascotas`.`raza` AS `raza`,`bdclick3`.`bdmascotas`.`genero` AS `genero`,`bdclick3`.`bdterceros`.`id` AS `Id` from (`bdclick3`.`bdmascotas` left join `bdclick3`.`bdterceros` on((`bdclick3`.`bdmascotas`.`cliente` = `bdclick3`.`bdterceros`.`idSistema`)))
mariadb-version=100135
