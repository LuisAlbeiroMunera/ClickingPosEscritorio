TYPE=VIEW
query=select `bdclick1`.`bdmascotas`.`codigo` AS `codigo`,`bdclick1`.`bdmascotas`.`nombre` AS `nombreMascota`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`bdclick1`.`bdterceros`.`telefono` AS `telefono`,`bdclick1`.`bdterceros`.`celular` AS `celular`,`bdclick1`.`bdvacunas`.`nombre` AS `nombreVacuna`,`bdclick1`.`bdvacunacion`.`fecha` AS `fecha`,`bdclick1`.`bdvacunacion`.`proxima` AS `proxima`,`bdclick1`.`bdvacunacion`.`Id` AS `Id`,`bdclick1`.`bdvacunacion`.`gestion` AS `gestion`,`bdclick1`.`bdterceros`.`id` AS `IdTercero` from ((`bdclick1`.`bdvacunacion` join (`bdclick1`.`bdmascotas` join `bdclick1`.`bdterceros` on((`bdclick1`.`bdmascotas`.`cliente` = `bdclick1`.`bdterceros`.`idSistema`))) on((`bdclick1`.`bdvacunacion`.`mascota` = `bdclick1`.`bdmascotas`.`codigo`))) join `bdclick1`.`bdvacunas` on((`bdclick1`.`bdvacunacion`.`campo` = `bdclick1`.`bdvacunas`.`Id`))) where (`bdclick1`.`bdvacunacion`.`gestion` = 0)
md5=ae8b5df9bf35802f3b7e9bc0266cc204
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:40
create-version=2
source=select `bdmascotas`.`codigo` AS `codigo`,`bdmascotas`.`nombre` AS `nombreMascota`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`celular` AS `celular`,`bdvacunas`.`nombre` AS `nombreVacuna`,`bdvacunacion`.`fecha` AS `fecha`,`bdvacunacion`.`proxima` AS `proxima`,`bdvacunacion`.`Id` AS `Id`,`bdvacunacion`.`gestion` AS `gestion`,`bdterceros`.`id` AS `IdTercero` from ((`bdvacunacion` join (`bdmascotas` join `bdterceros` on((`bdmascotas`.`cliente` = `bdterceros`.`idSistema`))) on((`bdvacunacion`.`mascota` = `bdmascotas`.`codigo`))) join `bdvacunas` on((`bdvacunacion`.`campo` = `bdvacunas`.`Id`))) where (`bdvacunacion`.`gestion` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdmascotas`.`codigo` AS `codigo`,`bdclick1`.`bdmascotas`.`nombre` AS `nombreMascota`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`bdclick1`.`bdterceros`.`telefono` AS `telefono`,`bdclick1`.`bdterceros`.`celular` AS `celular`,`bdclick1`.`bdvacunas`.`nombre` AS `nombreVacuna`,`bdclick1`.`bdvacunacion`.`fecha` AS `fecha`,`bdclick1`.`bdvacunacion`.`proxima` AS `proxima`,`bdclick1`.`bdvacunacion`.`Id` AS `Id`,`bdclick1`.`bdvacunacion`.`gestion` AS `gestion`,`bdclick1`.`bdterceros`.`id` AS `IdTercero` from ((`bdclick1`.`bdvacunacion` join (`bdclick1`.`bdmascotas` join `bdclick1`.`bdterceros` on((`bdclick1`.`bdmascotas`.`cliente` = `bdclick1`.`bdterceros`.`idSistema`))) on((`bdclick1`.`bdvacunacion`.`mascota` = `bdclick1`.`bdmascotas`.`codigo`))) join `bdclick1`.`bdvacunas` on((`bdclick1`.`bdvacunacion`.`campo` = `bdclick1`.`bdvacunas`.`Id`))) where (`bdclick1`.`bdvacunacion`.`gestion` = 0)
mariadb-version=100135
