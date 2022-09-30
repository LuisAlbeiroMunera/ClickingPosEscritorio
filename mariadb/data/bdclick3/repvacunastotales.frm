TYPE=VIEW
query=select `bdclick3`.`bdmascotas`.`codigo` AS `codigo`,`bdclick3`.`bdmascotas`.`nombre` AS `nombre`,`bdclick3`.`bdvacunacion`.`campo` AS `campo`,`bdclick3`.`bdvacunacion`.`proxima` AS `fecha`,`bdclick3`.`bdvacunas`.`nombre` AS `vacuna`,`bdclick3`.`bdvacunacion`.`fecha` AS `fechaVacuna`,`bdclick3`.`bdvacunacion`.`lote` AS `lote`,`bdclick3`.`bdvacunacion`.`marca` AS `marca`,`bdclick3`.`bdvacunacion`.`proxima` AS `proxima`,`bdclick3`.`bdmascotas`.`edad` AS `edad`,`bdclick3`.`bdmascotas`.`color` AS `color`,`bdclick3`.`bdmascotas`.`raza` AS `raza`,`bdclick3`.`bdmascotas`.`genero` AS `genero` from ((`bdclick3`.`bdvacunacion` left join `bdclick3`.`bdmascotas` on((`bdclick3`.`bdvacunacion`.`mascota` = `bdclick3`.`bdmascotas`.`codigo`))) left join `bdclick3`.`bdvacunas` on((`bdclick3`.`bdvacunas`.`Id` = `bdclick3`.`bdvacunacion`.`campo`)))
md5=b2b230c94a62027dcdef49f0aea00d00
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:54
create-version=2
source=select `bdmascotas`.`codigo` AS `codigo`,`bdmascotas`.`nombre` AS `nombre`,`bdvacunacion`.`campo` AS `campo`,`bdvacunacion`.`proxima` AS `fecha`,`bdvacunas`.`nombre` AS `vacuna`,`bdvacunacion`.`fecha` AS `fechaVacuna`,`bdvacunacion`.`lote` AS `lote`,`bdvacunacion`.`marca` AS `marca`,`bdvacunacion`.`proxima` AS `proxima`,`bdmascotas`.`edad` AS `edad`,`bdmascotas`.`color` AS `color`,`bdmascotas`.`raza` AS `raza`,`bdmascotas`.`genero` AS `genero` from ((`bdvacunacion` left join `bdmascotas` on((`bdvacunacion`.`mascota` = `bdmascotas`.`codigo`))) left join `bdvacunas` on((`bdvacunas`.`Id` = `bdvacunacion`.`campo`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdmascotas`.`codigo` AS `codigo`,`bdclick3`.`bdmascotas`.`nombre` AS `nombre`,`bdclick3`.`bdvacunacion`.`campo` AS `campo`,`bdclick3`.`bdvacunacion`.`proxima` AS `fecha`,`bdclick3`.`bdvacunas`.`nombre` AS `vacuna`,`bdclick3`.`bdvacunacion`.`fecha` AS `fechaVacuna`,`bdclick3`.`bdvacunacion`.`lote` AS `lote`,`bdclick3`.`bdvacunacion`.`marca` AS `marca`,`bdclick3`.`bdvacunacion`.`proxima` AS `proxima`,`bdclick3`.`bdmascotas`.`edad` AS `edad`,`bdclick3`.`bdmascotas`.`color` AS `color`,`bdclick3`.`bdmascotas`.`raza` AS `raza`,`bdclick3`.`bdmascotas`.`genero` AS `genero` from ((`bdclick3`.`bdvacunacion` left join `bdclick3`.`bdmascotas` on((`bdclick3`.`bdvacunacion`.`mascota` = `bdclick3`.`bdmascotas`.`codigo`))) left join `bdclick3`.`bdvacunas` on((`bdclick3`.`bdvacunas`.`Id` = `bdclick3`.`bdvacunacion`.`campo`)))
mariadb-version=100135
