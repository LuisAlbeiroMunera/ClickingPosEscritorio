TYPE=VIEW
query=select `agendapeluqueria`.`Id` AS `Id`,`agendapeluqueria`.`cliente` AS `cliente`,`agendapeluqueria`.`fecha` AS `fecha`,`agendapeluqueria`.`hora` AS `hora`,`agendapeluqueria`.`motivo` AS `motivo`,`agendapeluqueria`.`aCargo` AS `aCargo`,`agendapeluqueria`.`estado` AS `estado`,`agendapeluqueria`.`observacion` AS `observacion`,`agendapeluqueria`.`mascota` AS `mascota`,`agendapeluqueria`.`proxima` AS `proxima`,`agendapeluqueria`.`gestion` AS `gestion`,`agendapeluqueria`.`fechaGestion` AS `fechaGestion`,`agendapeluqueria`.`descripcion` AS `descripcion`,`agendapeluqueria`.`cc` AS `cc`,`agendapeluqueria`.`nombre` AS `nombre`,`agendapeluqueria`.`telefono` AS `telefono`,`agendapeluqueria`.`primerNombre` AS `primerNombre`,`agendapeluqueria`.`segundoNombre` AS `segundoNombre`,`agendapeluqueria`.`primerApellido` AS `primerApellido`,`agendapeluqueria`.`segundoApellido` AS `segundoApellido`,`bdclick5`.`bdpeluqueriaantigua`.`fecha` AS `fechaAntigua`,`bdclick5`.`bdpeluqueriaantigua`.`hora` AS `horaAntigua`,`bdclick5`.`bdpeluqueriaantigua`.`motivo` AS `motivoAntiguo`,`bdclick5`.`bdpeluqueriaantigua`.`medico` AS `medicoAntiguo`,`bdclick5`.`bdpeluqueriaantigua`.`observacion` AS `observacionAntiguo` from (`bdclick5`.`bdpeluqueriaantigua` join `bdclick5`.`agendapeluqueria` on((`bdclick5`.`bdpeluqueriaantigua`.`idAgenda` = `agendapeluqueria`.`Id`)))
md5=01c3d5d29b4e227b1f5a1b4ca257510d
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:48
create-version=2
source=select `agendapeluqueria`.`Id` AS `Id`,`agendapeluqueria`.`cliente` AS `cliente`,`agendapeluqueria`.`fecha` AS `fecha`,`agendapeluqueria`.`hora` AS `hora`,`agendapeluqueria`.`motivo` AS `motivo`,`agendapeluqueria`.`aCargo` AS `aCargo`,`agendapeluqueria`.`estado` AS `estado`,`agendapeluqueria`.`observacion` AS `observacion`,`agendapeluqueria`.`mascota` AS `mascota`,`agendapeluqueria`.`proxima` AS `proxima`,`agendapeluqueria`.`gestion` AS `gestion`,`agendapeluqueria`.`fechaGestion` AS `fechaGestion`,`agendapeluqueria`.`descripcion` AS `descripcion`,`agendapeluqueria`.`cc` AS `cc`,`agendapeluqueria`.`nombre` AS `nombre`,`agendapeluqueria`.`telefono` AS `telefono`,`agendapeluqueria`.`primerNombre` AS `primerNombre`,`agendapeluqueria`.`segundoNombre` AS `segundoNombre`,`agendapeluqueria`.`primerApellido` AS `primerApellido`,`agendapeluqueria`.`segundoApellido` AS `segundoApellido`,`bdpeluqueriaantigua`.`fecha` AS `fechaAntigua`,`bdpeluqueriaantigua`.`hora` AS `horaAntigua`,`bdpeluqueriaantigua`.`motivo` AS `motivoAntiguo`,`bdpeluqueriaantigua`.`medico` AS `medicoAntiguo`,`bdpeluqueriaantigua`.`observacion` AS `observacionAntiguo` from (`bdpeluqueriaantigua` join `agendapeluqueria` on((`bdpeluqueriaantigua`.`idAgenda` = `agendapeluqueria`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `agendapeluqueria`.`Id` AS `Id`,`agendapeluqueria`.`cliente` AS `cliente`,`agendapeluqueria`.`fecha` AS `fecha`,`agendapeluqueria`.`hora` AS `hora`,`agendapeluqueria`.`motivo` AS `motivo`,`agendapeluqueria`.`aCargo` AS `aCargo`,`agendapeluqueria`.`estado` AS `estado`,`agendapeluqueria`.`observacion` AS `observacion`,`agendapeluqueria`.`mascota` AS `mascota`,`agendapeluqueria`.`proxima` AS `proxima`,`agendapeluqueria`.`gestion` AS `gestion`,`agendapeluqueria`.`fechaGestion` AS `fechaGestion`,`agendapeluqueria`.`descripcion` AS `descripcion`,`agendapeluqueria`.`cc` AS `cc`,`agendapeluqueria`.`nombre` AS `nombre`,`agendapeluqueria`.`telefono` AS `telefono`,`agendapeluqueria`.`primerNombre` AS `primerNombre`,`agendapeluqueria`.`segundoNombre` AS `segundoNombre`,`agendapeluqueria`.`primerApellido` AS `primerApellido`,`agendapeluqueria`.`segundoApellido` AS `segundoApellido`,`bdclick5`.`bdpeluqueriaantigua`.`fecha` AS `fechaAntigua`,`bdclick5`.`bdpeluqueriaantigua`.`hora` AS `horaAntigua`,`bdclick5`.`bdpeluqueriaantigua`.`motivo` AS `motivoAntiguo`,`bdclick5`.`bdpeluqueriaantigua`.`medico` AS `medicoAntiguo`,`bdclick5`.`bdpeluqueriaantigua`.`observacion` AS `observacionAntiguo` from (`bdclick5`.`bdpeluqueriaantigua` join `bdclick5`.`agendapeluqueria` on((`bdclick5`.`bdpeluqueriaantigua`.`idAgenda` = `agendapeluqueria`.`Id`)))
mariadb-version=100135
