TYPE=VIEW
query=select `bdclick1`.`bdmascotas`.`codigo` AS `codigo`,`bdclick1`.`bdmascotas`.`nombre` AS `nombreMascota`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`bdclick1`.`bdterceros`.`telefono` AS `telefono`,`bdclick1`.`bdterceros`.`celular` AS `celular`,`bdclick1`.`bdpeluqueria`.`descripcion` AS `nombreServicio`,`bdclick1`.`bdpeluqueria`.`fecha` AS `fecha`,`bdclick1`.`bdpeluqueria`.`proxima` AS `proxima`,`bdclick1`.`bdpeluqueria`.`Id` AS `Id`,`bdclick1`.`bdpeluqueria`.`gestion` AS `gestion`,`bdclick1`.`bdterceros`.`id` AS `IdTercero` from (`bdclick1`.`bdpeluqueria` join (`bdclick1`.`bdmascotas` join `bdclick1`.`bdterceros` on((`bdclick1`.`bdmascotas`.`cliente` = `bdclick1`.`bdterceros`.`idSistema`))) on((`bdclick1`.`bdpeluqueria`.`mascota` = `bdclick1`.`bdmascotas`.`codigo`))) where (`bdclick1`.`bdpeluqueria`.`gestion` = 0)
md5=ca280b8ca615bec82b99ea9f5cc86327
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:36
create-version=2
source=select `bdmascotas`.`codigo` AS `codigo`,`bdmascotas`.`nombre` AS `nombreMascota`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`celular` AS `celular`,`bdpeluqueria`.`descripcion` AS `nombreServicio`,`bdpeluqueria`.`fecha` AS `fecha`,`bdpeluqueria`.`proxima` AS `proxima`,`bdpeluqueria`.`Id` AS `Id`,`bdpeluqueria`.`gestion` AS `gestion`,`bdterceros`.`id` AS `IdTercero` from (`bdpeluqueria` join (`bdmascotas` join `bdterceros` on((`bdmascotas`.`cliente` = `bdterceros`.`idSistema`))) on((`bdpeluqueria`.`mascota` = `bdmascotas`.`codigo`))) where (`bdpeluqueria`.`gestion` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdmascotas`.`codigo` AS `codigo`,`bdclick1`.`bdmascotas`.`nombre` AS `nombreMascota`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`bdclick1`.`bdterceros`.`telefono` AS `telefono`,`bdclick1`.`bdterceros`.`celular` AS `celular`,`bdclick1`.`bdpeluqueria`.`descripcion` AS `nombreServicio`,`bdclick1`.`bdpeluqueria`.`fecha` AS `fecha`,`bdclick1`.`bdpeluqueria`.`proxima` AS `proxima`,`bdclick1`.`bdpeluqueria`.`Id` AS `Id`,`bdclick1`.`bdpeluqueria`.`gestion` AS `gestion`,`bdclick1`.`bdterceros`.`id` AS `IdTercero` from (`bdclick1`.`bdpeluqueria` join (`bdclick1`.`bdmascotas` join `bdclick1`.`bdterceros` on((`bdclick1`.`bdmascotas`.`cliente` = `bdclick1`.`bdterceros`.`idSistema`))) on((`bdclick1`.`bdpeluqueria`.`mascota` = `bdclick1`.`bdmascotas`.`codigo`))) where (`bdclick1`.`bdpeluqueria`.`gestion` = 0)
mariadb-version=100135
