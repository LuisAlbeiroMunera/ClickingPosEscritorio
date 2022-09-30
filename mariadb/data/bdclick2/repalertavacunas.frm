TYPE=VIEW
query=select `bdclick2`.`bdmascotas`.`codigo` AS `codigo`,`bdclick2`.`bdmascotas`.`nombre` AS `nombreMascota`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,`bdclick2`.`bdterceros`.`telefono` AS `telefono`,`bdclick2`.`bdterceros`.`celular` AS `celular`,`bdclick2`.`bdvacunas`.`nombre` AS `nombreVacuna`,`bdclick2`.`bdvacunacion`.`fecha` AS `fecha`,`bdclick2`.`bdvacunacion`.`proxima` AS `proxima`,`bdclick2`.`bdvacunacion`.`Id` AS `Id`,`bdclick2`.`bdvacunacion`.`gestion` AS `gestion`,`bdclick2`.`bdterceros`.`id` AS `IdTercero`,`bdclick2`.`bdvacunacion`.`fechaGestion` AS `fechaGestion` from ((`bdclick2`.`bdvacunacion` join (`bdclick2`.`bdmascotas` join `bdclick2`.`bdterceros` on((`bdclick2`.`bdmascotas`.`cliente` = `bdclick2`.`bdterceros`.`idSistema`))) on((`bdclick2`.`bdvacunacion`.`mascota` = `bdclick2`.`bdmascotas`.`codigo`))) join `bdclick2`.`bdvacunas` on((`bdclick2`.`bdvacunacion`.`campo` = `bdclick2`.`bdvacunas`.`Id`)))
md5=2ca50b665d51ccc3e3aa0d261c1e0b46
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:47
create-version=2
source=select `bdmascotas`.`codigo` AS `codigo`,`bdmascotas`.`nombre` AS `nombreMascota`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`celular` AS `celular`,`bdvacunas`.`nombre` AS `nombreVacuna`,`bdvacunacion`.`fecha` AS `fecha`,`bdvacunacion`.`proxima` AS `proxima`,`bdvacunacion`.`Id` AS `Id`,`bdvacunacion`.`gestion` AS `gestion`,`bdterceros`.`id` AS `IdTercero`,`bdvacunacion`.`fechaGestion` AS `fechaGestion` from ((`bdvacunacion` join (`bdmascotas` join `bdterceros` on((`bdmascotas`.`cliente` = `bdterceros`.`idSistema`))) on((`bdvacunacion`.`mascota` = `bdmascotas`.`codigo`))) join `bdvacunas` on((`bdvacunacion`.`campo` = `bdvacunas`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdmascotas`.`codigo` AS `codigo`,`bdclick2`.`bdmascotas`.`nombre` AS `nombreMascota`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,`bdclick2`.`bdterceros`.`telefono` AS `telefono`,`bdclick2`.`bdterceros`.`celular` AS `celular`,`bdclick2`.`bdvacunas`.`nombre` AS `nombreVacuna`,`bdclick2`.`bdvacunacion`.`fecha` AS `fecha`,`bdclick2`.`bdvacunacion`.`proxima` AS `proxima`,`bdclick2`.`bdvacunacion`.`Id` AS `Id`,`bdclick2`.`bdvacunacion`.`gestion` AS `gestion`,`bdclick2`.`bdterceros`.`id` AS `IdTercero`,`bdclick2`.`bdvacunacion`.`fechaGestion` AS `fechaGestion` from ((`bdclick2`.`bdvacunacion` join (`bdclick2`.`bdmascotas` join `bdclick2`.`bdterceros` on((`bdclick2`.`bdmascotas`.`cliente` = `bdclick2`.`bdterceros`.`idSistema`))) on((`bdclick2`.`bdvacunacion`.`mascota` = `bdclick2`.`bdmascotas`.`codigo`))) join `bdclick2`.`bdvacunas` on((`bdclick2`.`bdvacunacion`.`campo` = `bdclick2`.`bdvacunas`.`Id`)))
mariadb-version=100135
