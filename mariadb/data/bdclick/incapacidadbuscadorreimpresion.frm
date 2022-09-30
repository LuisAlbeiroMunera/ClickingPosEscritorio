TYPE=VIEW
query=select `bdclick`.`bdincapacidad`.`consulta` AS `consulta`,`bdclick`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick`.`bdincapacidad`.`Id` AS `Id`,`bdclick`.`bdincapacidad`.`fechaRegistro` AS `fecha`,`bdclick`.`bdusuario`.`nombre` AS `usuarioNombre`,`bdclick`.`bdconsultaclinica`.`usuario` AS `usuario` from (`bdclick`.`bdincapacidad` join (`bdclick`.`bdconsultaclinica` join `bdclick`.`bdusuario` on((`bdclick`.`bdconsultaclinica`.`usuario` = `bdclick`.`bdusuario`.`usuario`))) on((`bdclick`.`bdincapacidad`.`consulta` = `bdclick`.`bdconsultaclinica`.`Id`)))
md5=22442081dd02fda7af398b322ad4dd73
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:24
create-version=2
source=select `bdincapacidad`.`consulta` AS `consulta`,`bdconsultaclinica`.`historia` AS `historia`,`bdincapacidad`.`Id` AS `Id`,`bdincapacidad`.`fechaRegistro` AS `fecha`,`bdusuario`.`nombre` AS `usuarioNombre`,`bdconsultaclinica`.`usuario` AS `usuario` from (`bdincapacidad` join (`bdconsultaclinica` join `bdusuario` on((`bdconsultaclinica`.`usuario` = `bdusuario`.`usuario`))) on((`bdincapacidad`.`consulta` = `bdconsultaclinica`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdincapacidad`.`consulta` AS `consulta`,`bdclick`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick`.`bdincapacidad`.`Id` AS `Id`,`bdclick`.`bdincapacidad`.`fechaRegistro` AS `fecha`,`bdclick`.`bdusuario`.`nombre` AS `usuarioNombre`,`bdclick`.`bdconsultaclinica`.`usuario` AS `usuario` from (`bdclick`.`bdincapacidad` join (`bdclick`.`bdconsultaclinica` join `bdclick`.`bdusuario` on((`bdclick`.`bdconsultaclinica`.`usuario` = `bdclick`.`bdusuario`.`usuario`))) on((`bdclick`.`bdincapacidad`.`consulta` = `bdclick`.`bdconsultaclinica`.`Id`)))
mariadb-version=100135
