TYPE=VIEW
query=select `bdclick`.`bdmascotas`.`codigo` AS `codigo`,`bdclick`.`bdmascotas`.`nombre` AS `nombreMascota`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdterceros`.`telefono` AS `telefono`,`bdclick`.`bdterceros`.`celular` AS `celular`,`bdclick`.`bdpeluqueria`.`descripcion` AS `nombreServicio`,`bdclick`.`bdpeluqueria`.`fecha` AS `fecha`,`bdclick`.`bdpeluqueria`.`proxima` AS `proxima`,`bdclick`.`bdpeluqueria`.`Id` AS `Id`,`bdclick`.`bdpeluqueria`.`gestion` AS `gestion`,`bdclick`.`bdterceros`.`id` AS `IdTercero` from (`bdclick`.`bdpeluqueria` join (`bdclick`.`bdmascotas` join `bdclick`.`bdterceros` on((`bdclick`.`bdmascotas`.`cliente` = `bdclick`.`bdterceros`.`idSistema`))) on((`bdclick`.`bdpeluqueria`.`mascota` = `bdclick`.`bdmascotas`.`codigo`))) where (`bdclick`.`bdpeluqueria`.`gestion` = 0)
md5=ce899e6e5c604f06a117d543439058bc
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:25
create-version=2
source=select `bdmascotas`.`codigo` AS `codigo`,`bdmascotas`.`nombre` AS `nombreMascota`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`celular` AS `celular`,`bdpeluqueria`.`descripcion` AS `nombreServicio`,`bdpeluqueria`.`fecha` AS `fecha`,`bdpeluqueria`.`proxima` AS `proxima`,`bdpeluqueria`.`Id` AS `Id`,`bdpeluqueria`.`gestion` AS `gestion`,`bdterceros`.`id` AS `IdTercero` from (`bdpeluqueria` join (`bdmascotas` join `bdterceros` on((`bdmascotas`.`cliente` = `bdterceros`.`idSistema`))) on((`bdpeluqueria`.`mascota` = `bdmascotas`.`codigo`))) where (`bdpeluqueria`.`gestion` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdmascotas`.`codigo` AS `codigo`,`bdclick`.`bdmascotas`.`nombre` AS `nombreMascota`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdterceros`.`telefono` AS `telefono`,`bdclick`.`bdterceros`.`celular` AS `celular`,`bdclick`.`bdpeluqueria`.`descripcion` AS `nombreServicio`,`bdclick`.`bdpeluqueria`.`fecha` AS `fecha`,`bdclick`.`bdpeluqueria`.`proxima` AS `proxima`,`bdclick`.`bdpeluqueria`.`Id` AS `Id`,`bdclick`.`bdpeluqueria`.`gestion` AS `gestion`,`bdclick`.`bdterceros`.`id` AS `IdTercero` from (`bdclick`.`bdpeluqueria` join (`bdclick`.`bdmascotas` join `bdclick`.`bdterceros` on((`bdclick`.`bdmascotas`.`cliente` = `bdclick`.`bdterceros`.`idSistema`))) on((`bdclick`.`bdpeluqueria`.`mascota` = `bdclick`.`bdmascotas`.`codigo`))) where (`bdclick`.`bdpeluqueria`.`gestion` = 0)
mariadb-version=100135
