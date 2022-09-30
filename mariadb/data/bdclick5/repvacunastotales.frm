TYPE=VIEW
query=select `bdclick5`.`bdmascotas`.`codigo` AS `codigo`,`bdclick5`.`bdmascotas`.`nombre` AS `nombre`,`bdclick5`.`bdvacunacion`.`campo` AS `campo`,`bdclick5`.`bdvacunacion`.`proxima` AS `fecha`,`bdclick5`.`bdvacunas`.`nombre` AS `vacuna`,`bdclick5`.`bdvacunacion`.`fecha` AS `fechaVacuna`,`bdclick5`.`bdvacunacion`.`lote` AS `lote`,`bdclick5`.`bdvacunacion`.`marca` AS `marca`,`bdclick5`.`bdvacunacion`.`proxima` AS `proxima`,`bdclick5`.`bdmascotas`.`edad` AS `edad`,`bdclick5`.`bdmascotas`.`color` AS `color`,`bdclick5`.`bdmascotas`.`raza` AS `raza`,`bdclick5`.`bdmascotas`.`genero` AS `genero` from ((`bdclick5`.`bdvacunacion` left join `bdclick5`.`bdmascotas` on((`bdclick5`.`bdvacunacion`.`mascota` = `bdclick5`.`bdmascotas`.`codigo`))) left join `bdclick5`.`bdvacunas` on((`bdclick5`.`bdvacunas`.`Id` = `bdclick5`.`bdvacunacion`.`campo`)))
md5=3ae6cc62fff77c8b277eaa81ef145596
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:50
create-version=2
source=select `bdmascotas`.`codigo` AS `codigo`,`bdmascotas`.`nombre` AS `nombre`,`bdvacunacion`.`campo` AS `campo`,`bdvacunacion`.`proxima` AS `fecha`,`bdvacunas`.`nombre` AS `vacuna`,`bdvacunacion`.`fecha` AS `fechaVacuna`,`bdvacunacion`.`lote` AS `lote`,`bdvacunacion`.`marca` AS `marca`,`bdvacunacion`.`proxima` AS `proxima`,`bdmascotas`.`edad` AS `edad`,`bdmascotas`.`color` AS `color`,`bdmascotas`.`raza` AS `raza`,`bdmascotas`.`genero` AS `genero` from ((`bdvacunacion` left join `bdmascotas` on((`bdvacunacion`.`mascota` = `bdmascotas`.`codigo`))) left join `bdvacunas` on((`bdvacunas`.`Id` = `bdvacunacion`.`campo`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdmascotas`.`codigo` AS `codigo`,`bdclick5`.`bdmascotas`.`nombre` AS `nombre`,`bdclick5`.`bdvacunacion`.`campo` AS `campo`,`bdclick5`.`bdvacunacion`.`proxima` AS `fecha`,`bdclick5`.`bdvacunas`.`nombre` AS `vacuna`,`bdclick5`.`bdvacunacion`.`fecha` AS `fechaVacuna`,`bdclick5`.`bdvacunacion`.`lote` AS `lote`,`bdclick5`.`bdvacunacion`.`marca` AS `marca`,`bdclick5`.`bdvacunacion`.`proxima` AS `proxima`,`bdclick5`.`bdmascotas`.`edad` AS `edad`,`bdclick5`.`bdmascotas`.`color` AS `color`,`bdclick5`.`bdmascotas`.`raza` AS `raza`,`bdclick5`.`bdmascotas`.`genero` AS `genero` from ((`bdclick5`.`bdvacunacion` left join `bdclick5`.`bdmascotas` on((`bdclick5`.`bdvacunacion`.`mascota` = `bdclick5`.`bdmascotas`.`codigo`))) left join `bdclick5`.`bdvacunas` on((`bdclick5`.`bdvacunas`.`Id` = `bdclick5`.`bdvacunacion`.`campo`)))
mariadb-version=100135
