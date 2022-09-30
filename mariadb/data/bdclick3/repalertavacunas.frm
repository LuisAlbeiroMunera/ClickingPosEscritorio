TYPE=VIEW
query=select `bdclick3`.`bdmascotas`.`codigo` AS `codigo`,`bdclick3`.`bdmascotas`.`nombre` AS `nombreMascota`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdterceros`.`telefono` AS `telefono`,`bdclick3`.`bdterceros`.`celular` AS `celular`,`bdclick3`.`bdvacunas`.`nombre` AS `nombreVacuna`,`bdclick3`.`bdvacunacion`.`fecha` AS `fecha`,`bdclick3`.`bdvacunacion`.`proxima` AS `proxima`,`bdclick3`.`bdvacunacion`.`Id` AS `Id`,`bdclick3`.`bdvacunacion`.`gestion` AS `gestion`,`bdclick3`.`bdterceros`.`id` AS `IdTercero`,`bdclick3`.`bdvacunacion`.`fechaGestion` AS `fechaGestion` from ((`bdclick3`.`bdvacunacion` join (`bdclick3`.`bdmascotas` join `bdclick3`.`bdterceros` on((`bdclick3`.`bdmascotas`.`cliente` = `bdclick3`.`bdterceros`.`idSistema`))) on((`bdclick3`.`bdvacunacion`.`mascota` = `bdclick3`.`bdmascotas`.`codigo`))) join `bdclick3`.`bdvacunas` on((`bdclick3`.`bdvacunacion`.`campo` = `bdclick3`.`bdvacunas`.`Id`)))
md5=4a71c47139f23f98fb395ef5adf6cc5b
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:53
create-version=2
source=select `bdmascotas`.`codigo` AS `codigo`,`bdmascotas`.`nombre` AS `nombreMascota`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`celular` AS `celular`,`bdvacunas`.`nombre` AS `nombreVacuna`,`bdvacunacion`.`fecha` AS `fecha`,`bdvacunacion`.`proxima` AS `proxima`,`bdvacunacion`.`Id` AS `Id`,`bdvacunacion`.`gestion` AS `gestion`,`bdterceros`.`id` AS `IdTercero`,`bdvacunacion`.`fechaGestion` AS `fechaGestion` from ((`bdvacunacion` join (`bdmascotas` join `bdterceros` on((`bdmascotas`.`cliente` = `bdterceros`.`idSistema`))) on((`bdvacunacion`.`mascota` = `bdmascotas`.`codigo`))) join `bdvacunas` on((`bdvacunacion`.`campo` = `bdvacunas`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdmascotas`.`codigo` AS `codigo`,`bdclick3`.`bdmascotas`.`nombre` AS `nombreMascota`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdterceros`.`telefono` AS `telefono`,`bdclick3`.`bdterceros`.`celular` AS `celular`,`bdclick3`.`bdvacunas`.`nombre` AS `nombreVacuna`,`bdclick3`.`bdvacunacion`.`fecha` AS `fecha`,`bdclick3`.`bdvacunacion`.`proxima` AS `proxima`,`bdclick3`.`bdvacunacion`.`Id` AS `Id`,`bdclick3`.`bdvacunacion`.`gestion` AS `gestion`,`bdclick3`.`bdterceros`.`id` AS `IdTercero`,`bdclick3`.`bdvacunacion`.`fechaGestion` AS `fechaGestion` from ((`bdclick3`.`bdvacunacion` join (`bdclick3`.`bdmascotas` join `bdclick3`.`bdterceros` on((`bdclick3`.`bdmascotas`.`cliente` = `bdclick3`.`bdterceros`.`idSistema`))) on((`bdclick3`.`bdvacunacion`.`mascota` = `bdclick3`.`bdmascotas`.`codigo`))) join `bdclick3`.`bdvacunas` on((`bdclick3`.`bdvacunacion`.`campo` = `bdclick3`.`bdvacunas`.`Id`)))
mariadb-version=100135
