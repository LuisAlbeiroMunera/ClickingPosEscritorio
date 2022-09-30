TYPE=VIEW
query=select `bdclick`.`bdmascotas`.`codigo` AS `codigo`,`bdclick`.`bdmascotas`.`nombre` AS `nombre`,`bdclick`.`bdvacunacion`.`campo` AS `campo`,`bdclick`.`bdvacunacion`.`proxima` AS `fecha`,`bdclick`.`bdvacunas`.`nombre` AS `vacuna`,`bdclick`.`bdvacunacion`.`fecha` AS `fechaVacuna`,`bdclick`.`bdvacunacion`.`lote` AS `lote`,`bdclick`.`bdvacunacion`.`marca` AS `marca`,`bdclick`.`bdvacunacion`.`proxima` AS `proxima`,`bdclick`.`bdmascotas`.`edad` AS `edad`,`bdclick`.`bdmascotas`.`color` AS `color`,`bdclick`.`bdmascotas`.`raza` AS `raza`,`bdclick`.`bdmascotas`.`genero` AS `genero` from ((`bdclick`.`bdvacunacion` left join `bdclick`.`bdmascotas` on((`bdclick`.`bdvacunacion`.`mascota` = `bdclick`.`bdmascotas`.`codigo`))) left join `bdclick`.`bdvacunas` on((`bdclick`.`bdvacunas`.`Id` = `bdclick`.`bdvacunacion`.`campo`)))
md5=d5d13908f9eda0605110bc0e19f9d754
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:27
create-version=2
source=select `bdmascotas`.`codigo` AS `codigo`,`bdmascotas`.`nombre` AS `nombre`,`bdvacunacion`.`campo` AS `campo`,`bdvacunacion`.`proxima` AS `fecha`,`bdvacunas`.`nombre` AS `vacuna`,`bdvacunacion`.`fecha` AS `fechaVacuna`,`bdvacunacion`.`lote` AS `lote`,`bdvacunacion`.`marca` AS `marca`,`bdvacunacion`.`proxima` AS `proxima`,`bdmascotas`.`edad` AS `edad`,`bdmascotas`.`color` AS `color`,`bdmascotas`.`raza` AS `raza`,`bdmascotas`.`genero` AS `genero` from ((`bdvacunacion` left join `bdmascotas` on((`bdvacunacion`.`mascota` = `bdmascotas`.`codigo`))) left join `bdvacunas` on((`bdvacunas`.`Id` = `bdvacunacion`.`campo`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdmascotas`.`codigo` AS `codigo`,`bdclick`.`bdmascotas`.`nombre` AS `nombre`,`bdclick`.`bdvacunacion`.`campo` AS `campo`,`bdclick`.`bdvacunacion`.`proxima` AS `fecha`,`bdclick`.`bdvacunas`.`nombre` AS `vacuna`,`bdclick`.`bdvacunacion`.`fecha` AS `fechaVacuna`,`bdclick`.`bdvacunacion`.`lote` AS `lote`,`bdclick`.`bdvacunacion`.`marca` AS `marca`,`bdclick`.`bdvacunacion`.`proxima` AS `proxima`,`bdclick`.`bdmascotas`.`edad` AS `edad`,`bdclick`.`bdmascotas`.`color` AS `color`,`bdclick`.`bdmascotas`.`raza` AS `raza`,`bdclick`.`bdmascotas`.`genero` AS `genero` from ((`bdclick`.`bdvacunacion` left join `bdclick`.`bdmascotas` on((`bdclick`.`bdvacunacion`.`mascota` = `bdclick`.`bdmascotas`.`codigo`))) left join `bdclick`.`bdvacunas` on((`bdclick`.`bdvacunas`.`Id` = `bdclick`.`bdvacunacion`.`campo`)))
mariadb-version=100135
