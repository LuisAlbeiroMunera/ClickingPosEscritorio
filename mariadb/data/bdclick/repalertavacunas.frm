TYPE=VIEW
query=select `bdclick`.`bdmascotas`.`codigo` AS `codigo`,`bdclick`.`bdmascotas`.`nombre` AS `nombreMascota`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdterceros`.`telefono` AS `telefono`,`bdclick`.`bdterceros`.`celular` AS `celular`,`bdclick`.`bdvacunas`.`nombre` AS `nombreVacuna`,`bdclick`.`bdvacunacion`.`fecha` AS `fecha`,`bdclick`.`bdvacunacion`.`proxima` AS `proxima`,`bdclick`.`bdvacunacion`.`Id` AS `Id`,`bdclick`.`bdvacunacion`.`gestion` AS `gestion`,`bdclick`.`bdterceros`.`id` AS `IdTercero`,`bdclick`.`bdvacunacion`.`fechaGestion` AS `fechaGestion` from ((`bdclick`.`bdvacunacion` join (`bdclick`.`bdmascotas` join `bdclick`.`bdterceros` on((`bdclick`.`bdmascotas`.`cliente` = `bdclick`.`bdterceros`.`idSistema`))) on((`bdclick`.`bdvacunacion`.`mascota` = `bdclick`.`bdmascotas`.`codigo`))) join `bdclick`.`bdvacunas` on((`bdclick`.`bdvacunacion`.`campo` = `bdclick`.`bdvacunas`.`Id`)))
md5=c20a7c5e7088d178e4561c45fc5e45cc
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:26
create-version=2
source=select `bdmascotas`.`codigo` AS `codigo`,`bdmascotas`.`nombre` AS `nombreMascota`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`celular` AS `celular`,`bdvacunas`.`nombre` AS `nombreVacuna`,`bdvacunacion`.`fecha` AS `fecha`,`bdvacunacion`.`proxima` AS `proxima`,`bdvacunacion`.`Id` AS `Id`,`bdvacunacion`.`gestion` AS `gestion`,`bdterceros`.`id` AS `IdTercero`,`bdvacunacion`.`fechaGestion` AS `fechaGestion` from ((`bdvacunacion` join (`bdmascotas` join `bdterceros` on((`bdmascotas`.`cliente` = `bdterceros`.`idSistema`))) on((`bdvacunacion`.`mascota` = `bdmascotas`.`codigo`))) join `bdvacunas` on((`bdvacunacion`.`campo` = `bdvacunas`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdmascotas`.`codigo` AS `codigo`,`bdclick`.`bdmascotas`.`nombre` AS `nombreMascota`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdterceros`.`telefono` AS `telefono`,`bdclick`.`bdterceros`.`celular` AS `celular`,`bdclick`.`bdvacunas`.`nombre` AS `nombreVacuna`,`bdclick`.`bdvacunacion`.`fecha` AS `fecha`,`bdclick`.`bdvacunacion`.`proxima` AS `proxima`,`bdclick`.`bdvacunacion`.`Id` AS `Id`,`bdclick`.`bdvacunacion`.`gestion` AS `gestion`,`bdclick`.`bdterceros`.`id` AS `IdTercero`,`bdclick`.`bdvacunacion`.`fechaGestion` AS `fechaGestion` from ((`bdclick`.`bdvacunacion` join (`bdclick`.`bdmascotas` join `bdclick`.`bdterceros` on((`bdclick`.`bdmascotas`.`cliente` = `bdclick`.`bdterceros`.`idSistema`))) on((`bdclick`.`bdvacunacion`.`mascota` = `bdclick`.`bdmascotas`.`codigo`))) join `bdclick`.`bdvacunas` on((`bdclick`.`bdvacunacion`.`campo` = `bdclick`.`bdvacunas`.`Id`)))
mariadb-version=100135
