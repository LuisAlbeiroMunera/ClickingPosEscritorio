TYPE=VIEW
query=select `bdclick6`.`bdincapacidad`.`consulta` AS `consulta`,`bdclick6`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick6`.`bdincapacidad`.`Id` AS `Id`,`bdclick6`.`bdincapacidad`.`fechaRegistro` AS `fecha`,`bdclick6`.`bdusuario`.`nombre` AS `usuarioNombre`,`bdclick6`.`bdconsultaclinica`.`usuario` AS `usuario` from (`bdclick6`.`bdincapacidad` join (`bdclick6`.`bdconsultaclinica` join `bdclick6`.`bdusuario` on((`bdclick6`.`bdconsultaclinica`.`usuario` = `bdclick6`.`bdusuario`.`usuario`))) on((`bdclick6`.`bdincapacidad`.`consulta` = `bdclick6`.`bdconsultaclinica`.`Id`)))
md5=53ccdf74597b807d0c282541ab2db242
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:35
create-version=2
source=select `bdincapacidad`.`consulta` AS `consulta`,`bdconsultaclinica`.`historia` AS `historia`,`bdincapacidad`.`Id` AS `Id`,`bdincapacidad`.`fechaRegistro` AS `fecha`,`bdusuario`.`nombre` AS `usuarioNombre`,`bdconsultaclinica`.`usuario` AS `usuario` from (`bdincapacidad` join (`bdconsultaclinica` join `bdusuario` on((`bdconsultaclinica`.`usuario` = `bdusuario`.`usuario`))) on((`bdincapacidad`.`consulta` = `bdconsultaclinica`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdincapacidad`.`consulta` AS `consulta`,`bdclick6`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick6`.`bdincapacidad`.`Id` AS `Id`,`bdclick6`.`bdincapacidad`.`fechaRegistro` AS `fecha`,`bdclick6`.`bdusuario`.`nombre` AS `usuarioNombre`,`bdclick6`.`bdconsultaclinica`.`usuario` AS `usuario` from (`bdclick6`.`bdincapacidad` join (`bdclick6`.`bdconsultaclinica` join `bdclick6`.`bdusuario` on((`bdclick6`.`bdconsultaclinica`.`usuario` = `bdclick6`.`bdusuario`.`usuario`))) on((`bdclick6`.`bdincapacidad`.`consulta` = `bdclick6`.`bdconsultaclinica`.`Id`)))
mariadb-version=100135
