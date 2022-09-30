TYPE=VIEW
query=select `bdclick2`.`bdmascotas`.`codigo` AS `codigo`,`bdclick2`.`bdmascotas`.`nombre` AS `nombre`,`bdclick2`.`bdvacunacion`.`campo` AS `campo`,`bdclick2`.`bdvacunacion`.`proxima` AS `fecha`,`bdclick2`.`bdvacunas`.`nombre` AS `vacuna`,`bdclick2`.`bdvacunacion`.`fecha` AS `fechaVacuna`,`bdclick2`.`bdvacunacion`.`lote` AS `lote`,`bdclick2`.`bdvacunacion`.`marca` AS `marca`,`bdclick2`.`bdvacunacion`.`proxima` AS `proxima`,`bdclick2`.`bdmascotas`.`edad` AS `edad`,`bdclick2`.`bdmascotas`.`color` AS `color`,`bdclick2`.`bdmascotas`.`raza` AS `raza`,`bdclick2`.`bdmascotas`.`genero` AS `genero` from ((`bdclick2`.`bdvacunacion` left join `bdclick2`.`bdmascotas` on((`bdclick2`.`bdvacunacion`.`mascota` = `bdclick2`.`bdmascotas`.`codigo`))) left join `bdclick2`.`bdvacunas` on((`bdclick2`.`bdvacunas`.`Id` = `bdclick2`.`bdvacunacion`.`campo`)))
md5=3ac708dd0edc5863e881da1c2867cd74
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:48
create-version=2
source=select `bdmascotas`.`codigo` AS `codigo`,`bdmascotas`.`nombre` AS `nombre`,`bdvacunacion`.`campo` AS `campo`,`bdvacunacion`.`proxima` AS `fecha`,`bdvacunas`.`nombre` AS `vacuna`,`bdvacunacion`.`fecha` AS `fechaVacuna`,`bdvacunacion`.`lote` AS `lote`,`bdvacunacion`.`marca` AS `marca`,`bdvacunacion`.`proxima` AS `proxima`,`bdmascotas`.`edad` AS `edad`,`bdmascotas`.`color` AS `color`,`bdmascotas`.`raza` AS `raza`,`bdmascotas`.`genero` AS `genero` from ((`bdvacunacion` left join `bdmascotas` on((`bdvacunacion`.`mascota` = `bdmascotas`.`codigo`))) left join `bdvacunas` on((`bdvacunas`.`Id` = `bdvacunacion`.`campo`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdmascotas`.`codigo` AS `codigo`,`bdclick2`.`bdmascotas`.`nombre` AS `nombre`,`bdclick2`.`bdvacunacion`.`campo` AS `campo`,`bdclick2`.`bdvacunacion`.`proxima` AS `fecha`,`bdclick2`.`bdvacunas`.`nombre` AS `vacuna`,`bdclick2`.`bdvacunacion`.`fecha` AS `fechaVacuna`,`bdclick2`.`bdvacunacion`.`lote` AS `lote`,`bdclick2`.`bdvacunacion`.`marca` AS `marca`,`bdclick2`.`bdvacunacion`.`proxima` AS `proxima`,`bdclick2`.`bdmascotas`.`edad` AS `edad`,`bdclick2`.`bdmascotas`.`color` AS `color`,`bdclick2`.`bdmascotas`.`raza` AS `raza`,`bdclick2`.`bdmascotas`.`genero` AS `genero` from ((`bdclick2`.`bdvacunacion` left join `bdclick2`.`bdmascotas` on((`bdclick2`.`bdvacunacion`.`mascota` = `bdclick2`.`bdmascotas`.`codigo`))) left join `bdclick2`.`bdvacunas` on((`bdclick2`.`bdvacunas`.`Id` = `bdclick2`.`bdvacunacion`.`campo`)))
mariadb-version=100135
