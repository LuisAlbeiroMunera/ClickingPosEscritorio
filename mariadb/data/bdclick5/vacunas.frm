TYPE=VIEW
query=select `bdclick5`.`bdmascotas`.`codigo` AS `codigo`,`bdclick5`.`bdmascotas`.`nombre` AS `nombreMascota`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdterceros`.`telefono` AS `telefono`,`bdclick5`.`bdterceros`.`celular` AS `celular`,`bdclick5`.`bdvacunas`.`nombre` AS `nombreVacuna`,`bdclick5`.`bdvacunacion`.`fecha` AS `fecha`,`bdclick5`.`bdvacunacion`.`proxima` AS `proxima`,`bdclick5`.`bdvacunacion`.`Id` AS `Id`,`bdclick5`.`bdvacunacion`.`gestion` AS `gestion`,`bdclick5`.`bdterceros`.`id` AS `IdTercero` from ((`bdclick5`.`bdvacunacion` join (`bdclick5`.`bdmascotas` join `bdclick5`.`bdterceros` on((`bdclick5`.`bdmascotas`.`cliente` = `bdclick5`.`bdterceros`.`idSistema`))) on((`bdclick5`.`bdvacunacion`.`mascota` = `bdclick5`.`bdmascotas`.`codigo`))) join `bdclick5`.`bdvacunas` on((`bdclick5`.`bdvacunacion`.`campo` = `bdclick5`.`bdvacunas`.`Id`))) where (`bdclick5`.`bdvacunacion`.`gestion` = 0)
md5=8533ecf940e6c01c1d060238ba83b16f
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:53
create-version=2
source=select `bdmascotas`.`codigo` AS `codigo`,`bdmascotas`.`nombre` AS `nombreMascota`,`bdterceros`.`nombre` AS `nombre`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`celular` AS `celular`,`bdvacunas`.`nombre` AS `nombreVacuna`,`bdvacunacion`.`fecha` AS `fecha`,`bdvacunacion`.`proxima` AS `proxima`,`bdvacunacion`.`Id` AS `Id`,`bdvacunacion`.`gestion` AS `gestion`,`bdterceros`.`id` AS `IdTercero` from ((`bdvacunacion` join (`bdmascotas` join `bdterceros` on((`bdmascotas`.`cliente` = `bdterceros`.`idSistema`))) on((`bdvacunacion`.`mascota` = `bdmascotas`.`codigo`))) join `bdvacunas` on((`bdvacunacion`.`campo` = `bdvacunas`.`Id`))) where (`bdvacunacion`.`gestion` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdmascotas`.`codigo` AS `codigo`,`bdclick5`.`bdmascotas`.`nombre` AS `nombreMascota`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdterceros`.`telefono` AS `telefono`,`bdclick5`.`bdterceros`.`celular` AS `celular`,`bdclick5`.`bdvacunas`.`nombre` AS `nombreVacuna`,`bdclick5`.`bdvacunacion`.`fecha` AS `fecha`,`bdclick5`.`bdvacunacion`.`proxima` AS `proxima`,`bdclick5`.`bdvacunacion`.`Id` AS `Id`,`bdclick5`.`bdvacunacion`.`gestion` AS `gestion`,`bdclick5`.`bdterceros`.`id` AS `IdTercero` from ((`bdclick5`.`bdvacunacion` join (`bdclick5`.`bdmascotas` join `bdclick5`.`bdterceros` on((`bdclick5`.`bdmascotas`.`cliente` = `bdclick5`.`bdterceros`.`idSistema`))) on((`bdclick5`.`bdvacunacion`.`mascota` = `bdclick5`.`bdmascotas`.`codigo`))) join `bdclick5`.`bdvacunas` on((`bdclick5`.`bdvacunacion`.`campo` = `bdclick5`.`bdvacunas`.`Id`))) where (`bdclick5`.`bdvacunacion`.`gestion` = 0)
mariadb-version=100135
