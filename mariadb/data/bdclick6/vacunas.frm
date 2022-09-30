TYPE=VIEW
query=select `bdclick6`.`bdmascotas`.`codigo` AS `codigo`,`bdclick6`.`bdmascotas`.`nombre` AS `nombreMascota`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,`bdclick6`.`bdterceros`.`celular` AS `celular`,`bdclick6`.`bdvacunas`.`nombre` AS `nombreVacuna`,`bdclick6`.`bdvacunacion`.`fecha` AS `fecha`,`bdclick6`.`bdvacunacion`.`proxima` AS `proxima`,`bdclick6`.`bdvacunacion`.`Id` AS `Id`,`bdclick6`.`bdvacunacion`.`gestion` AS `gestion`,`bdclick6`.`bdterceros`.`id` AS `IdTercero` from ((`bdclick6`.`bdvacunacion` join (`bdclick6`.`bdmascotas` join `bdclick6`.`bdterceros` on((`bdclick6`.`bdmascotas`.`cliente` = `bdclick6`.`bdterceros`.`idSistema`))) on((`bdclick6`.`bdvacunacion`.`mascota` = `bdclick6`.`bdmascotas`.`codigo`))) join `bdclick6`.`bdvacunas` on((`bdclick6`.`bdvacunacion`.`campo` = `bdclick6`.`bdvacunas`.`Id`))) where (`bdclick6`.`bdvacunacion`.`gestion` = 0)
md5=849477de39c2aab2cea7f6bc58431676
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:42
create-version=2
source=select `bdmascotas`.`codigo` AS `codigo`,`bdmascotas`.`nombre` AS `nombreMascota`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`celular` AS `celular`,`bdvacunas`.`nombre` AS `nombreVacuna`,`bdvacunacion`.`fecha` AS `fecha`,`bdvacunacion`.`proxima` AS `proxima`,`bdvacunacion`.`Id` AS `Id`,`bdvacunacion`.`gestion` AS `gestion`,`bdterceros`.`id` AS `IdTercero` from ((`bdvacunacion` join (`bdmascotas` join `bdterceros` on((`bdmascotas`.`cliente` = `bdterceros`.`idSistema`))) on((`bdvacunacion`.`mascota` = `bdmascotas`.`codigo`))) join `bdvacunas` on((`bdvacunacion`.`campo` = `bdvacunas`.`Id`))) where (`bdvacunacion`.`gestion` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdmascotas`.`codigo` AS `codigo`,`bdclick6`.`bdmascotas`.`nombre` AS `nombreMascota`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdterceros`.`telefono` AS `telefono`,`bdclick6`.`bdterceros`.`celular` AS `celular`,`bdclick6`.`bdvacunas`.`nombre` AS `nombreVacuna`,`bdclick6`.`bdvacunacion`.`fecha` AS `fecha`,`bdclick6`.`bdvacunacion`.`proxima` AS `proxima`,`bdclick6`.`bdvacunacion`.`Id` AS `Id`,`bdclick6`.`bdvacunacion`.`gestion` AS `gestion`,`bdclick6`.`bdterceros`.`id` AS `IdTercero` from ((`bdclick6`.`bdvacunacion` join (`bdclick6`.`bdmascotas` join `bdclick6`.`bdterceros` on((`bdclick6`.`bdmascotas`.`cliente` = `bdclick6`.`bdterceros`.`idSistema`))) on((`bdclick6`.`bdvacunacion`.`mascota` = `bdclick6`.`bdmascotas`.`codigo`))) join `bdclick6`.`bdvacunas` on((`bdclick6`.`bdvacunacion`.`campo` = `bdclick6`.`bdvacunas`.`Id`))) where (`bdclick6`.`bdvacunacion`.`gestion` = 0)
mariadb-version=100135
