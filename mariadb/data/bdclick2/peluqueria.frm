TYPE=VIEW
query=select `bdclick2`.`bdmascotas`.`codigo` AS `codigo`,`bdclick2`.`bdmascotas`.`nombre` AS `nombreMascota`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,`bdclick2`.`bdterceros`.`telefono` AS `telefono`,`bdclick2`.`bdterceros`.`celular` AS `celular`,`bdclick2`.`bdpeluqueria`.`descripcion` AS `nombreServicio`,`bdclick2`.`bdpeluqueria`.`fecha` AS `fecha`,`bdclick2`.`bdpeluqueria`.`proxima` AS `proxima`,`bdclick2`.`bdpeluqueria`.`Id` AS `Id`,`bdclick2`.`bdpeluqueria`.`gestion` AS `gestion`,`bdclick2`.`bdterceros`.`id` AS `IdTercero` from (`bdclick2`.`bdpeluqueria` join (`bdclick2`.`bdmascotas` join `bdclick2`.`bdterceros` on((`bdclick2`.`bdmascotas`.`cliente` = `bdclick2`.`bdterceros`.`idSistema`))) on((`bdclick2`.`bdpeluqueria`.`mascota` = `bdclick2`.`bdmascotas`.`codigo`))) where (`bdclick2`.`bdpeluqueria`.`gestion` = 0)
md5=f506603e4b00ae1a6ba55eec2b7d5f37
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:46
create-version=2
source=select `bdmascotas`.`codigo` AS `codigo`,`bdmascotas`.`nombre` AS `nombreMascota`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`celular` AS `celular`,`bdpeluqueria`.`descripcion` AS `nombreServicio`,`bdpeluqueria`.`fecha` AS `fecha`,`bdpeluqueria`.`proxima` AS `proxima`,`bdpeluqueria`.`Id` AS `Id`,`bdpeluqueria`.`gestion` AS `gestion`,`bdterceros`.`id` AS `IdTercero` from (`bdpeluqueria` join (`bdmascotas` join `bdterceros` on((`bdmascotas`.`cliente` = `bdterceros`.`idSistema`))) on((`bdpeluqueria`.`mascota` = `bdmascotas`.`codigo`))) where (`bdpeluqueria`.`gestion` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdmascotas`.`codigo` AS `codigo`,`bdclick2`.`bdmascotas`.`nombre` AS `nombreMascota`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,`bdclick2`.`bdterceros`.`telefono` AS `telefono`,`bdclick2`.`bdterceros`.`celular` AS `celular`,`bdclick2`.`bdpeluqueria`.`descripcion` AS `nombreServicio`,`bdclick2`.`bdpeluqueria`.`fecha` AS `fecha`,`bdclick2`.`bdpeluqueria`.`proxima` AS `proxima`,`bdclick2`.`bdpeluqueria`.`Id` AS `Id`,`bdclick2`.`bdpeluqueria`.`gestion` AS `gestion`,`bdclick2`.`bdterceros`.`id` AS `IdTercero` from (`bdclick2`.`bdpeluqueria` join (`bdclick2`.`bdmascotas` join `bdclick2`.`bdterceros` on((`bdclick2`.`bdmascotas`.`cliente` = `bdclick2`.`bdterceros`.`idSistema`))) on((`bdclick2`.`bdpeluqueria`.`mascota` = `bdclick2`.`bdmascotas`.`codigo`))) where (`bdclick2`.`bdpeluqueria`.`gestion` = 0)
mariadb-version=100135
