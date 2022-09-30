TYPE=VIEW
query=select `bdclick4`.`bdmascotas`.`codigo` AS `codigo`,`bdclick4`.`bdmascotas`.`nombre` AS `nombre`,`bdclick4`.`bdvacunacion`.`campo` AS `campo`,`bdclick4`.`bdvacunacion`.`proxima` AS `fecha`,`bdclick4`.`bdvacunas`.`nombre` AS `vacuna`,`bdclick4`.`bdvacunacion`.`fecha` AS `fechaVacuna`,`bdclick4`.`bdvacunacion`.`lote` AS `lote`,`bdclick4`.`bdvacunacion`.`marca` AS `marca`,`bdclick4`.`bdvacunacion`.`proxima` AS `proxima`,`bdclick4`.`bdmascotas`.`edad` AS `edad`,`bdclick4`.`bdmascotas`.`color` AS `color`,`bdclick4`.`bdmascotas`.`raza` AS `raza`,`bdclick4`.`bdmascotas`.`genero` AS `genero` from ((`bdclick4`.`bdvacunacion` left join `bdclick4`.`bdmascotas` on((`bdclick4`.`bdvacunacion`.`mascota` = `bdclick4`.`bdmascotas`.`codigo`))) left join `bdclick4`.`bdvacunas` on((`bdclick4`.`bdvacunas`.`Id` = `bdclick4`.`bdvacunacion`.`campo`)))
md5=ddaf5234ad9d2aa3026f8ef51d03dfc4
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:31
create-version=2
source=select `bdmascotas`.`codigo` AS `codigo`,`bdmascotas`.`nombre` AS `nombre`,`bdvacunacion`.`campo` AS `campo`,`bdvacunacion`.`proxima` AS `fecha`,`bdvacunas`.`nombre` AS `vacuna`,`bdvacunacion`.`fecha` AS `fechaVacuna`,`bdvacunacion`.`lote` AS `lote`,`bdvacunacion`.`marca` AS `marca`,`bdvacunacion`.`proxima` AS `proxima`,`bdmascotas`.`edad` AS `edad`,`bdmascotas`.`color` AS `color`,`bdmascotas`.`raza` AS `raza`,`bdmascotas`.`genero` AS `genero` from ((`bdvacunacion` left join `bdmascotas` on((`bdvacunacion`.`mascota` = `bdmascotas`.`codigo`))) left join `bdvacunas` on((`bdvacunas`.`Id` = `bdvacunacion`.`campo`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdmascotas`.`codigo` AS `codigo`,`bdclick4`.`bdmascotas`.`nombre` AS `nombre`,`bdclick4`.`bdvacunacion`.`campo` AS `campo`,`bdclick4`.`bdvacunacion`.`proxima` AS `fecha`,`bdclick4`.`bdvacunas`.`nombre` AS `vacuna`,`bdclick4`.`bdvacunacion`.`fecha` AS `fechaVacuna`,`bdclick4`.`bdvacunacion`.`lote` AS `lote`,`bdclick4`.`bdvacunacion`.`marca` AS `marca`,`bdclick4`.`bdvacunacion`.`proxima` AS `proxima`,`bdclick4`.`bdmascotas`.`edad` AS `edad`,`bdclick4`.`bdmascotas`.`color` AS `color`,`bdclick4`.`bdmascotas`.`raza` AS `raza`,`bdclick4`.`bdmascotas`.`genero` AS `genero` from ((`bdclick4`.`bdvacunacion` left join `bdclick4`.`bdmascotas` on((`bdclick4`.`bdvacunacion`.`mascota` = `bdclick4`.`bdmascotas`.`codigo`))) left join `bdclick4`.`bdvacunas` on((`bdclick4`.`bdvacunas`.`Id` = `bdclick4`.`bdvacunacion`.`campo`)))
mariadb-version=100135
