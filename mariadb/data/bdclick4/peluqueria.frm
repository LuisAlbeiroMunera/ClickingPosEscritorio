TYPE=VIEW
query=select `bdclick4`.`bdmascotas`.`codigo` AS `codigo`,`bdclick4`.`bdmascotas`.`nombre` AS `nombreMascota`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,`bdclick4`.`bdterceros`.`telefono` AS `telefono`,`bdclick4`.`bdterceros`.`celular` AS `celular`,`bdclick4`.`bdpeluqueria`.`descripcion` AS `nombreServicio`,`bdclick4`.`bdpeluqueria`.`fecha` AS `fecha`,`bdclick4`.`bdpeluqueria`.`proxima` AS `proxima`,`bdclick4`.`bdpeluqueria`.`Id` AS `Id`,`bdclick4`.`bdpeluqueria`.`gestion` AS `gestion`,`bdclick4`.`bdterceros`.`id` AS `IdTercero` from (`bdclick4`.`bdpeluqueria` join (`bdclick4`.`bdmascotas` join `bdclick4`.`bdterceros` on((`bdclick4`.`bdmascotas`.`cliente` = `bdclick4`.`bdterceros`.`idSistema`))) on((`bdclick4`.`bdpeluqueria`.`mascota` = `bdclick4`.`bdmascotas`.`codigo`))) where (`bdclick4`.`bdpeluqueria`.`gestion` = 0)
md5=a0f71220df0240b54b56d55a36ae3075
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:29
create-version=2
source=select `bdmascotas`.`codigo` AS `codigo`,`bdmascotas`.`nombre` AS `nombreMascota`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`celular` AS `celular`,`bdpeluqueria`.`descripcion` AS `nombreServicio`,`bdpeluqueria`.`fecha` AS `fecha`,`bdpeluqueria`.`proxima` AS `proxima`,`bdpeluqueria`.`Id` AS `Id`,`bdpeluqueria`.`gestion` AS `gestion`,`bdterceros`.`id` AS `IdTercero` from (`bdpeluqueria` join (`bdmascotas` join `bdterceros` on((`bdmascotas`.`cliente` = `bdterceros`.`idSistema`))) on((`bdpeluqueria`.`mascota` = `bdmascotas`.`codigo`))) where (`bdpeluqueria`.`gestion` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdmascotas`.`codigo` AS `codigo`,`bdclick4`.`bdmascotas`.`nombre` AS `nombreMascota`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,`bdclick4`.`bdterceros`.`telefono` AS `telefono`,`bdclick4`.`bdterceros`.`celular` AS `celular`,`bdclick4`.`bdpeluqueria`.`descripcion` AS `nombreServicio`,`bdclick4`.`bdpeluqueria`.`fecha` AS `fecha`,`bdclick4`.`bdpeluqueria`.`proxima` AS `proxima`,`bdclick4`.`bdpeluqueria`.`Id` AS `Id`,`bdclick4`.`bdpeluqueria`.`gestion` AS `gestion`,`bdclick4`.`bdterceros`.`id` AS `IdTercero` from (`bdclick4`.`bdpeluqueria` join (`bdclick4`.`bdmascotas` join `bdclick4`.`bdterceros` on((`bdclick4`.`bdmascotas`.`cliente` = `bdclick4`.`bdterceros`.`idSistema`))) on((`bdclick4`.`bdpeluqueria`.`mascota` = `bdclick4`.`bdmascotas`.`codigo`))) where (`bdclick4`.`bdpeluqueria`.`gestion` = 0)
mariadb-version=100135
