TYPE=VIEW
query=select `bdclick5`.`bdmascotas`.`codigo` AS `codigo`,`bdclick5`.`bdmascotas`.`nombre` AS `nombreMascota`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdterceros`.`telefono` AS `telefono`,`bdclick5`.`bdterceros`.`celular` AS `celular`,`bdclick5`.`bdpeluqueria`.`descripcion` AS `nombreServicio`,`bdclick5`.`bdpeluqueria`.`fecha` AS `fecha`,`bdclick5`.`bdpeluqueria`.`proxima` AS `proxima`,`bdclick5`.`bdpeluqueria`.`Id` AS `Id`,`bdclick5`.`bdpeluqueria`.`gestion` AS `gestion`,`bdclick5`.`bdterceros`.`id` AS `IdTercero` from (`bdclick5`.`bdpeluqueria` join (`bdclick5`.`bdmascotas` join `bdclick5`.`bdterceros` on((`bdclick5`.`bdmascotas`.`cliente` = `bdclick5`.`bdterceros`.`idSistema`))) on((`bdclick5`.`bdpeluqueria`.`mascota` = `bdclick5`.`bdmascotas`.`codigo`))) where (`bdclick5`.`bdpeluqueria`.`gestion` = 0)
md5=45c7b1263b790344e6d6e95841f4ca43
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:48
create-version=2
source=select `bdmascotas`.`codigo` AS `codigo`,`bdmascotas`.`nombre` AS `nombreMascota`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`celular` AS `celular`,`bdpeluqueria`.`descripcion` AS `nombreServicio`,`bdpeluqueria`.`fecha` AS `fecha`,`bdpeluqueria`.`proxima` AS `proxima`,`bdpeluqueria`.`Id` AS `Id`,`bdpeluqueria`.`gestion` AS `gestion`,`bdterceros`.`id` AS `IdTercero` from (`bdpeluqueria` join (`bdmascotas` join `bdterceros` on((`bdmascotas`.`cliente` = `bdterceros`.`idSistema`))) on((`bdpeluqueria`.`mascota` = `bdmascotas`.`codigo`))) where (`bdpeluqueria`.`gestion` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdmascotas`.`codigo` AS `codigo`,`bdclick5`.`bdmascotas`.`nombre` AS `nombreMascota`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdterceros`.`telefono` AS `telefono`,`bdclick5`.`bdterceros`.`celular` AS `celular`,`bdclick5`.`bdpeluqueria`.`descripcion` AS `nombreServicio`,`bdclick5`.`bdpeluqueria`.`fecha` AS `fecha`,`bdclick5`.`bdpeluqueria`.`proxima` AS `proxima`,`bdclick5`.`bdpeluqueria`.`Id` AS `Id`,`bdclick5`.`bdpeluqueria`.`gestion` AS `gestion`,`bdclick5`.`bdterceros`.`id` AS `IdTercero` from (`bdclick5`.`bdpeluqueria` join (`bdclick5`.`bdmascotas` join `bdclick5`.`bdterceros` on((`bdclick5`.`bdmascotas`.`cliente` = `bdclick5`.`bdterceros`.`idSistema`))) on((`bdclick5`.`bdpeluqueria`.`mascota` = `bdclick5`.`bdmascotas`.`codigo`))) where (`bdclick5`.`bdpeluqueria`.`gestion` = 0)
mariadb-version=100135
