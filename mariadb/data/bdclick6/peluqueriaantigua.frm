TYPE=VIEW
query=select `agendapeluqueria`.`Id` AS `Id`,`agendapeluqueria`.`cliente` AS `cliente`,`agendapeluqueria`.`fecha` AS `fecha`,`agendapeluqueria`.`hora` AS `hora`,`agendapeluqueria`.`motivo` AS `motivo`,`agendapeluqueria`.`aCargo` AS `aCargo`,`agendapeluqueria`.`estado` AS `estado`,`agendapeluqueria`.`observacion` AS `observacion`,`agendapeluqueria`.`mascota` AS `mascota`,`agendapeluqueria`.`proxima` AS `proxima`,`agendapeluqueria`.`gestion` AS `gestion`,`agendapeluqueria`.`fechaGestion` AS `fechaGestion`,`agendapeluqueria`.`descripcion` AS `descripcion`,`agendapeluqueria`.`cc` AS `cc`,`agendapeluqueria`.`nombre` AS `nombre`,`agendapeluqueria`.`telefono` AS `telefono`,`agendapeluqueria`.`primerNombre` AS `primerNombre`,`agendapeluqueria`.`segundoNombre` AS `segundoNombre`,`agendapeluqueria`.`primerApellido` AS `primerApellido`,`agendapeluqueria`.`segundoApellido` AS `segundoApellido`,`bdclick6`.`bdpeluqueriaantigua`.`fecha` AS `fechaAntigua`,`bdclick6`.`bdpeluqueriaantigua`.`hora` AS `horaAntigua`,`bdclick6`.`bdpeluqueriaantigua`.`motivo` AS `motivoAntiguo`,`bdclick6`.`bdpeluqueriaantigua`.`medico` AS `medicoAntiguo`,`bdclick6`.`bdpeluqueriaantigua`.`observacion` AS `observacionAntiguo` from (`bdclick6`.`bdpeluqueriaantigua` join `bdclick6`.`agendapeluqueria` on((`bdclick6`.`bdpeluqueriaantigua`.`idAgenda` = `agendapeluqueria`.`Id`)))
md5=a0513f265d9fdc5a63d30771559e117b
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:36
create-version=2
source=select `agendapeluqueria`.`Id` AS `Id`,`agendapeluqueria`.`cliente` AS `cliente`,`agendapeluqueria`.`fecha` AS `fecha`,`agendapeluqueria`.`hora` AS `hora`,`agendapeluqueria`.`motivo` AS `motivo`,`agendapeluqueria`.`aCargo` AS `aCargo`,`agendapeluqueria`.`estado` AS `estado`,`agendapeluqueria`.`observacion` AS `observacion`,`agendapeluqueria`.`mascota` AS `mascota`,`agendapeluqueria`.`proxima` AS `proxima`,`agendapeluqueria`.`gestion` AS `gestion`,`agendapeluqueria`.`fechaGestion` AS `fechaGestion`,`agendapeluqueria`.`descripcion` AS `descripcion`,`agendapeluqueria`.`cc` AS `cc`,`agendapeluqueria`.`nombre` AS `nombre`,`agendapeluqueria`.`telefono` AS `telefono`,`agendapeluqueria`.`primerNombre` AS `primerNombre`,`agendapeluqueria`.`segundoNombre` AS `segundoNombre`,`agendapeluqueria`.`primerApellido` AS `primerApellido`,`agendapeluqueria`.`segundoApellido` AS `segundoApellido`,`bdpeluqueriaantigua`.`fecha` AS `fechaAntigua`,`bdpeluqueriaantigua`.`hora` AS `horaAntigua`,`bdpeluqueriaantigua`.`motivo` AS `motivoAntiguo`,`bdpeluqueriaantigua`.`medico` AS `medicoAntiguo`,`bdpeluqueriaantigua`.`observacion` AS `observacionAntiguo` from (`bdpeluqueriaantigua` join `agendapeluqueria` on((`bdpeluqueriaantigua`.`idAgenda` = `agendapeluqueria`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `agendapeluqueria`.`Id` AS `Id`,`agendapeluqueria`.`cliente` AS `cliente`,`agendapeluqueria`.`fecha` AS `fecha`,`agendapeluqueria`.`hora` AS `hora`,`agendapeluqueria`.`motivo` AS `motivo`,`agendapeluqueria`.`aCargo` AS `aCargo`,`agendapeluqueria`.`estado` AS `estado`,`agendapeluqueria`.`observacion` AS `observacion`,`agendapeluqueria`.`mascota` AS `mascota`,`agendapeluqueria`.`proxima` AS `proxima`,`agendapeluqueria`.`gestion` AS `gestion`,`agendapeluqueria`.`fechaGestion` AS `fechaGestion`,`agendapeluqueria`.`descripcion` AS `descripcion`,`agendapeluqueria`.`cc` AS `cc`,`agendapeluqueria`.`nombre` AS `nombre`,`agendapeluqueria`.`telefono` AS `telefono`,`agendapeluqueria`.`primerNombre` AS `primerNombre`,`agendapeluqueria`.`segundoNombre` AS `segundoNombre`,`agendapeluqueria`.`primerApellido` AS `primerApellido`,`agendapeluqueria`.`segundoApellido` AS `segundoApellido`,`bdclick6`.`bdpeluqueriaantigua`.`fecha` AS `fechaAntigua`,`bdclick6`.`bdpeluqueriaantigua`.`hora` AS `horaAntigua`,`bdclick6`.`bdpeluqueriaantigua`.`motivo` AS `motivoAntiguo`,`bdclick6`.`bdpeluqueriaantigua`.`medico` AS `medicoAntiguo`,`bdclick6`.`bdpeluqueriaantigua`.`observacion` AS `observacionAntiguo` from (`bdclick6`.`bdpeluqueriaantigua` join `bdclick6`.`agendapeluqueria` on((`bdclick6`.`bdpeluqueriaantigua`.`idAgenda` = `agendapeluqueria`.`Id`)))
mariadb-version=100135
