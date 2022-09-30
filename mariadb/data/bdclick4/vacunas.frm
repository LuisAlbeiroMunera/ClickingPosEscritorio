TYPE=VIEW
query=select `bdclick4`.`bdmascotas`.`codigo` AS `codigo`,`bdclick4`.`bdmascotas`.`nombre` AS `nombreMascota`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,`bdclick4`.`bdterceros`.`telefono` AS `telefono`,`bdclick4`.`bdterceros`.`celular` AS `celular`,`bdclick4`.`bdvacunas`.`nombre` AS `nombreVacuna`,`bdclick4`.`bdvacunacion`.`fecha` AS `fecha`,`bdclick4`.`bdvacunacion`.`proxima` AS `proxima`,`bdclick4`.`bdvacunacion`.`Id` AS `Id`,`bdclick4`.`bdvacunacion`.`gestion` AS `gestion`,`bdclick4`.`bdterceros`.`id` AS `IdTercero` from ((`bdclick4`.`bdvacunacion` join (`bdclick4`.`bdmascotas` join `bdclick4`.`bdterceros` on((`bdclick4`.`bdmascotas`.`cliente` = `bdclick4`.`bdterceros`.`idSistema`))) on((`bdclick4`.`bdvacunacion`.`mascota` = `bdclick4`.`bdmascotas`.`codigo`))) join `bdclick4`.`bdvacunas` on((`bdclick4`.`bdvacunacion`.`campo` = `bdclick4`.`bdvacunas`.`Id`))) where (`bdclick4`.`bdvacunacion`.`gestion` = 0)
md5=6780da61d0d9eb112cb3a0753af4dae0
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:33
create-version=2
source=select `bdmascotas`.`codigo` AS `codigo`,`bdmascotas`.`nombre` AS `nombreMascota`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`celular` AS `celular`,`bdvacunas`.`nombre` AS `nombreVacuna`,`bdvacunacion`.`fecha` AS `fecha`,`bdvacunacion`.`proxima` AS `proxima`,`bdvacunacion`.`Id` AS `Id`,`bdvacunacion`.`gestion` AS `gestion`,`bdterceros`.`id` AS `IdTercero` from ((`bdvacunacion` join (`bdmascotas` join `bdterceros` on((`bdmascotas`.`cliente` = `bdterceros`.`idSistema`))) on((`bdvacunacion`.`mascota` = `bdmascotas`.`codigo`))) join `bdvacunas` on((`bdvacunacion`.`campo` = `bdvacunas`.`Id`))) where (`bdvacunacion`.`gestion` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdmascotas`.`codigo` AS `codigo`,`bdclick4`.`bdmascotas`.`nombre` AS `nombreMascota`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,`bdclick4`.`bdterceros`.`telefono` AS `telefono`,`bdclick4`.`bdterceros`.`celular` AS `celular`,`bdclick4`.`bdvacunas`.`nombre` AS `nombreVacuna`,`bdclick4`.`bdvacunacion`.`fecha` AS `fecha`,`bdclick4`.`bdvacunacion`.`proxima` AS `proxima`,`bdclick4`.`bdvacunacion`.`Id` AS `Id`,`bdclick4`.`bdvacunacion`.`gestion` AS `gestion`,`bdclick4`.`bdterceros`.`id` AS `IdTercero` from ((`bdclick4`.`bdvacunacion` join (`bdclick4`.`bdmascotas` join `bdclick4`.`bdterceros` on((`bdclick4`.`bdmascotas`.`cliente` = `bdclick4`.`bdterceros`.`idSistema`))) on((`bdclick4`.`bdvacunacion`.`mascota` = `bdclick4`.`bdmascotas`.`codigo`))) join `bdclick4`.`bdvacunas` on((`bdclick4`.`bdvacunacion`.`campo` = `bdclick4`.`bdvacunas`.`Id`))) where (`bdclick4`.`bdvacunacion`.`gestion` = 0)
mariadb-version=100135
