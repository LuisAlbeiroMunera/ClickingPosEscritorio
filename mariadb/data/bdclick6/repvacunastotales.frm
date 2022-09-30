TYPE=VIEW
query=select `bdclick6`.`bdmascotas`.`codigo` AS `codigo`,`bdclick6`.`bdmascotas`.`nombre` AS `nombre`,`bdclick6`.`bdvacunacion`.`campo` AS `campo`,`bdclick6`.`bdvacunacion`.`proxima` AS `fecha`,`bdclick6`.`bdvacunas`.`nombre` AS `vacuna`,`bdclick6`.`bdvacunacion`.`fecha` AS `fechaVacuna`,`bdclick6`.`bdvacunacion`.`lote` AS `lote`,`bdclick6`.`bdvacunacion`.`marca` AS `marca`,`bdclick6`.`bdvacunacion`.`proxima` AS `proxima`,`bdclick6`.`bdmascotas`.`edad` AS `edad`,`bdclick6`.`bdmascotas`.`color` AS `color`,`bdclick6`.`bdmascotas`.`raza` AS `raza`,`bdclick6`.`bdmascotas`.`genero` AS `genero` from ((`bdclick6`.`bdvacunacion` left join `bdclick6`.`bdmascotas` on((`bdclick6`.`bdvacunacion`.`mascota` = `bdclick6`.`bdmascotas`.`codigo`))) left join `bdclick6`.`bdvacunas` on((`bdclick6`.`bdvacunas`.`Id` = `bdclick6`.`bdvacunacion`.`campo`)))
md5=d2d7a0ed69e4d9e007d21e7d8f355d47
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:39
create-version=2
source=select `bdmascotas`.`codigo` AS `codigo`,`bdmascotas`.`nombre` AS `nombre`,`bdvacunacion`.`campo` AS `campo`,`bdvacunacion`.`proxima` AS `fecha`,`bdvacunas`.`nombre` AS `vacuna`,`bdvacunacion`.`fecha` AS `fechaVacuna`,`bdvacunacion`.`lote` AS `lote`,`bdvacunacion`.`marca` AS `marca`,`bdvacunacion`.`proxima` AS `proxima`,`bdmascotas`.`edad` AS `edad`,`bdmascotas`.`color` AS `color`,`bdmascotas`.`raza` AS `raza`,`bdmascotas`.`genero` AS `genero` from ((`bdvacunacion` left join `bdmascotas` on((`bdvacunacion`.`mascota` = `bdmascotas`.`codigo`))) left join `bdvacunas` on((`bdvacunas`.`Id` = `bdvacunacion`.`campo`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdmascotas`.`codigo` AS `codigo`,`bdclick6`.`bdmascotas`.`nombre` AS `nombre`,`bdclick6`.`bdvacunacion`.`campo` AS `campo`,`bdclick6`.`bdvacunacion`.`proxima` AS `fecha`,`bdclick6`.`bdvacunas`.`nombre` AS `vacuna`,`bdclick6`.`bdvacunacion`.`fecha` AS `fechaVacuna`,`bdclick6`.`bdvacunacion`.`lote` AS `lote`,`bdclick6`.`bdvacunacion`.`marca` AS `marca`,`bdclick6`.`bdvacunacion`.`proxima` AS `proxima`,`bdclick6`.`bdmascotas`.`edad` AS `edad`,`bdclick6`.`bdmascotas`.`color` AS `color`,`bdclick6`.`bdmascotas`.`raza` AS `raza`,`bdclick6`.`bdmascotas`.`genero` AS `genero` from ((`bdclick6`.`bdvacunacion` left join `bdclick6`.`bdmascotas` on((`bdclick6`.`bdvacunacion`.`mascota` = `bdclick6`.`bdmascotas`.`codigo`))) left join `bdclick6`.`bdvacunas` on((`bdclick6`.`bdvacunas`.`Id` = `bdclick6`.`bdvacunacion`.`campo`)))
mariadb-version=100135
