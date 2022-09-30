TYPE=VIEW
query=select `bdclick6`.`bdmascotas`.`codigo` AS `codigo`,`bdclick6`.`bdmascotas`.`nombre` AS `nombreMascota`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,`bdclick6`.`bdterceros`.`celular` AS `celular`,`bdclick6`.`bdpeluqueria`.`descripcion` AS `nombreServicio`,`bdclick6`.`bdpeluqueria`.`fecha` AS `fecha`,`bdclick6`.`bdpeluqueria`.`proxima` AS `proxima`,`bdclick6`.`bdpeluqueria`.`Id` AS `Id`,`bdclick6`.`bdpeluqueria`.`gestion` AS `gestion`,`bdclick6`.`bdterceros`.`id` AS `IdTercero` from (`bdclick6`.`bdpeluqueria` join (`bdclick6`.`bdmascotas` join `bdclick6`.`bdterceros` on((`bdclick6`.`bdmascotas`.`cliente` = `bdclick6`.`bdterceros`.`idSistema`))) on((`bdclick6`.`bdpeluqueria`.`mascota` = `bdclick6`.`bdmascotas`.`codigo`))) where (`bdclick6`.`bdpeluqueria`.`gestion` = 0)
md5=0e1bdc1aeede4eebe1c224d8eb3958cc
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:36
create-version=2
source=select `bdmascotas`.`codigo` AS `codigo`,`bdmascotas`.`nombre` AS `nombreMascota`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`celular` AS `celular`,`bdpeluqueria`.`descripcion` AS `nombreServicio`,`bdpeluqueria`.`fecha` AS `fecha`,`bdpeluqueria`.`proxima` AS `proxima`,`bdpeluqueria`.`Id` AS `Id`,`bdpeluqueria`.`gestion` AS `gestion`,`bdterceros`.`id` AS `IdTercero` from (`bdpeluqueria` join (`bdmascotas` join `bdterceros` on((`bdmascotas`.`cliente` = `bdterceros`.`idSistema`))) on((`bdpeluqueria`.`mascota` = `bdmascotas`.`codigo`))) where (`bdpeluqueria`.`gestion` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdmascotas`.`codigo` AS `codigo`,`bdclick6`.`bdmascotas`.`nombre` AS `nombreMascota`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,`bdclick6`.`bdterceros`.`celular` AS `celular`,`bdclick6`.`bdpeluqueria`.`descripcion` AS `nombreServicio`,`bdclick6`.`bdpeluqueria`.`fecha` AS `fecha`,`bdclick6`.`bdpeluqueria`.`proxima` AS `proxima`,`bdclick6`.`bdpeluqueria`.`Id` AS `Id`,`bdclick6`.`bdpeluqueria`.`gestion` AS `gestion`,`bdclick6`.`bdterceros`.`id` AS `IdTercero` from (`bdclick6`.`bdpeluqueria` join (`bdclick6`.`bdmascotas` join `bdclick6`.`bdterceros` on((`bdclick6`.`bdmascotas`.`cliente` = `bdclick6`.`bdterceros`.`idSistema`))) on((`bdclick6`.`bdpeluqueria`.`mascota` = `bdclick6`.`bdmascotas`.`codigo`))) where (`bdclick6`.`bdpeluqueria`.`gestion` = 0)
mariadb-version=100135
