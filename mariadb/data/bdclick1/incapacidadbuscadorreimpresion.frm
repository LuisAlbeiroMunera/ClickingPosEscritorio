TYPE=VIEW
query=select `bdclick1`.`bdincapacidad`.`consulta` AS `consulta`,`bdclick1`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick1`.`bdincapacidad`.`Id` AS `Id`,`bdclick1`.`bdincapacidad`.`fechaRegistro` AS `fecha`,`bdclick1`.`bdusuario`.`nombre` AS `usuarioNombre`,`bdclick1`.`bdconsultaclinica`.`usuario` AS `usuario` from (`bdclick1`.`bdincapacidad` join (`bdclick1`.`bdconsultaclinica` join `bdclick1`.`bdusuario` on((`bdclick1`.`bdconsultaclinica`.`usuario` = `bdclick1`.`bdusuario`.`usuario`))) on((`bdclick1`.`bdincapacidad`.`consulta` = `bdclick1`.`bdconsultaclinica`.`Id`)))
md5=21b0db1119c75f75abbf5d6fa95afaf6
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:34
create-version=2
source=select `bdincapacidad`.`consulta` AS `consulta`,`bdconsultaclinica`.`historia` AS `historia`,`bdincapacidad`.`Id` AS `Id`,`bdincapacidad`.`fechaRegistro` AS `fecha`,`bdusuario`.`nombre` AS `usuarioNombre`,`bdconsultaclinica`.`usuario` AS `usuario` from (`bdincapacidad` join (`bdconsultaclinica` join `bdusuario` on((`bdconsultaclinica`.`usuario` = `bdusuario`.`usuario`))) on((`bdincapacidad`.`consulta` = `bdconsultaclinica`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdincapacidad`.`consulta` AS `consulta`,`bdclick1`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick1`.`bdincapacidad`.`Id` AS `Id`,`bdclick1`.`bdincapacidad`.`fechaRegistro` AS `fecha`,`bdclick1`.`bdusuario`.`nombre` AS `usuarioNombre`,`bdclick1`.`bdconsultaclinica`.`usuario` AS `usuario` from (`bdclick1`.`bdincapacidad` join (`bdclick1`.`bdconsultaclinica` join `bdclick1`.`bdusuario` on((`bdclick1`.`bdconsultaclinica`.`usuario` = `bdclick1`.`bdusuario`.`usuario`))) on((`bdclick1`.`bdincapacidad`.`consulta` = `bdclick1`.`bdconsultaclinica`.`Id`)))
mariadb-version=100135
