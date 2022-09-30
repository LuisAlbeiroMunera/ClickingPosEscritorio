TYPE=VIEW
query=select `bdclick3`.`bdmascotas`.`codigo` AS `codigo`,`bdclick3`.`bdmascotas`.`nombre` AS `nombreMascota`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdterceros`.`telefono` AS `telefono`,`bdclick3`.`bdterceros`.`celular` AS `celular`,`bdclick3`.`bdpeluqueria`.`descripcion` AS `nombreServicio`,`bdclick3`.`bdpeluqueria`.`fecha` AS `fecha`,`bdclick3`.`bdpeluqueria`.`proxima` AS `proxima`,`bdclick3`.`bdpeluqueria`.`Id` AS `Id`,`bdclick3`.`bdpeluqueria`.`gestion` AS `gestion`,`bdclick3`.`bdterceros`.`id` AS `IdTercero` from (`bdclick3`.`bdpeluqueria` join (`bdclick3`.`bdmascotas` join `bdclick3`.`bdterceros` on((`bdclick3`.`bdmascotas`.`cliente` = `bdclick3`.`bdterceros`.`idSistema`))) on((`bdclick3`.`bdpeluqueria`.`mascota` = `bdclick3`.`bdmascotas`.`codigo`))) where (`bdclick3`.`bdpeluqueria`.`gestion` = 0)
md5=a3f1bd20567cedfde2ebde8f08df0cd2
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:52
create-version=2
source=select `bdmascotas`.`codigo` AS `codigo`,`bdmascotas`.`nombre` AS `nombreMascota`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`celular` AS `celular`,`bdpeluqueria`.`descripcion` AS `nombreServicio`,`bdpeluqueria`.`fecha` AS `fecha`,`bdpeluqueria`.`proxima` AS `proxima`,`bdpeluqueria`.`Id` AS `Id`,`bdpeluqueria`.`gestion` AS `gestion`,`bdterceros`.`id` AS `IdTercero` from (`bdpeluqueria` join (`bdmascotas` join `bdterceros` on((`bdmascotas`.`cliente` = `bdterceros`.`idSistema`))) on((`bdpeluqueria`.`mascota` = `bdmascotas`.`codigo`))) where (`bdpeluqueria`.`gestion` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdmascotas`.`codigo` AS `codigo`,`bdclick3`.`bdmascotas`.`nombre` AS `nombreMascota`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdterceros`.`telefono` AS `telefono`,`bdclick3`.`bdterceros`.`celular` AS `celular`,`bdclick3`.`bdpeluqueria`.`descripcion` AS `nombreServicio`,`bdclick3`.`bdpeluqueria`.`fecha` AS `fecha`,`bdclick3`.`bdpeluqueria`.`proxima` AS `proxima`,`bdclick3`.`bdpeluqueria`.`Id` AS `Id`,`bdclick3`.`bdpeluqueria`.`gestion` AS `gestion`,`bdclick3`.`bdterceros`.`id` AS `IdTercero` from (`bdclick3`.`bdpeluqueria` join (`bdclick3`.`bdmascotas` join `bdclick3`.`bdterceros` on((`bdclick3`.`bdmascotas`.`cliente` = `bdclick3`.`bdterceros`.`idSistema`))) on((`bdclick3`.`bdpeluqueria`.`mascota` = `bdclick3`.`bdmascotas`.`codigo`))) where (`bdclick3`.`bdpeluqueria`.`gestion` = 0)
mariadb-version=100135
