TYPE=VIEW
query=select `bdclick1`.`bdmascotas`.`codigo` AS `codigo`,`bdclick1`.`bdmascotas`.`nombre` AS `nombre`,`bdclick1`.`bdvacunacion`.`campo` AS `campo`,`bdclick1`.`bdvacunacion`.`proxima` AS `fecha`,`bdclick1`.`bdvacunas`.`nombre` AS `vacuna`,`bdclick1`.`bdvacunacion`.`fecha` AS `fechaVacuna`,`bdclick1`.`bdvacunacion`.`lote` AS `lote`,`bdclick1`.`bdvacunacion`.`marca` AS `marca`,`bdclick1`.`bdvacunacion`.`proxima` AS `proxima`,`bdclick1`.`bdmascotas`.`edad` AS `edad`,`bdclick1`.`bdmascotas`.`color` AS `color`,`bdclick1`.`bdmascotas`.`raza` AS `raza`,`bdclick1`.`bdmascotas`.`genero` AS `genero` from ((`bdclick1`.`bdvacunacion` left join `bdclick1`.`bdmascotas` on((`bdclick1`.`bdvacunacion`.`mascota` = `bdclick1`.`bdmascotas`.`codigo`))) left join `bdclick1`.`bdvacunas` on((`bdclick1`.`bdvacunas`.`Id` = `bdclick1`.`bdvacunacion`.`campo`)))
md5=c6264caa658330e905b74bc03b7d1dc3
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:38
create-version=2
source=select `bdmascotas`.`codigo` AS `codigo`,`bdmascotas`.`nombre` AS `nombre`,`bdvacunacion`.`campo` AS `campo`,`bdvacunacion`.`proxima` AS `fecha`,`bdvacunas`.`nombre` AS `vacuna`,`bdvacunacion`.`fecha` AS `fechaVacuna`,`bdvacunacion`.`lote` AS `lote`,`bdvacunacion`.`marca` AS `marca`,`bdvacunacion`.`proxima` AS `proxima`,`bdmascotas`.`edad` AS `edad`,`bdmascotas`.`color` AS `color`,`bdmascotas`.`raza` AS `raza`,`bdmascotas`.`genero` AS `genero` from ((`bdvacunacion` left join `bdmascotas` on((`bdvacunacion`.`mascota` = `bdmascotas`.`codigo`))) left join `bdvacunas` on((`bdvacunas`.`Id` = `bdvacunacion`.`campo`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdmascotas`.`codigo` AS `codigo`,`bdclick1`.`bdmascotas`.`nombre` AS `nombre`,`bdclick1`.`bdvacunacion`.`campo` AS `campo`,`bdclick1`.`bdvacunacion`.`proxima` AS `fecha`,`bdclick1`.`bdvacunas`.`nombre` AS `vacuna`,`bdclick1`.`bdvacunacion`.`fecha` AS `fechaVacuna`,`bdclick1`.`bdvacunacion`.`lote` AS `lote`,`bdclick1`.`bdvacunacion`.`marca` AS `marca`,`bdclick1`.`bdvacunacion`.`proxima` AS `proxima`,`bdclick1`.`bdmascotas`.`edad` AS `edad`,`bdclick1`.`bdmascotas`.`color` AS `color`,`bdclick1`.`bdmascotas`.`raza` AS `raza`,`bdclick1`.`bdmascotas`.`genero` AS `genero` from ((`bdclick1`.`bdvacunacion` left join `bdclick1`.`bdmascotas` on((`bdclick1`.`bdvacunacion`.`mascota` = `bdclick1`.`bdmascotas`.`codigo`))) left join `bdclick1`.`bdvacunas` on((`bdclick1`.`bdvacunas`.`Id` = `bdclick1`.`bdvacunacion`.`campo`)))
mariadb-version=100135
