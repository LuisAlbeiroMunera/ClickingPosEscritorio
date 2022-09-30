TYPE=VIEW
query=select `bdclick2`.`bdincapacidad`.`consulta` AS `consulta`,`bdclick2`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick2`.`bdincapacidad`.`Id` AS `Id`,`bdclick2`.`bdincapacidad`.`fechaRegistro` AS `fecha`,`bdclick2`.`bdusuario`.`nombre` AS `usuarioNombre`,`bdclick2`.`bdconsultaclinica`.`usuario` AS `usuario` from (`bdclick2`.`bdincapacidad` join (`bdclick2`.`bdconsultaclinica` join `bdclick2`.`bdusuario` on((`bdclick2`.`bdconsultaclinica`.`usuario` = `bdclick2`.`bdusuario`.`usuario`))) on((`bdclick2`.`bdincapacidad`.`consulta` = `bdclick2`.`bdconsultaclinica`.`Id`)))
md5=f601767d29d0895f254af94a467e74f7
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:45
create-version=2
source=select `bdincapacidad`.`consulta` AS `consulta`,`bdconsultaclinica`.`historia` AS `historia`,`bdincapacidad`.`Id` AS `Id`,`bdincapacidad`.`fechaRegistro` AS `fecha`,`bdusuario`.`nombre` AS `usuarioNombre`,`bdconsultaclinica`.`usuario` AS `usuario` from (`bdincapacidad` join (`bdconsultaclinica` join `bdusuario` on((`bdconsultaclinica`.`usuario` = `bdusuario`.`usuario`))) on((`bdincapacidad`.`consulta` = `bdconsultaclinica`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdincapacidad`.`consulta` AS `consulta`,`bdclick2`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick2`.`bdincapacidad`.`Id` AS `Id`,`bdclick2`.`bdincapacidad`.`fechaRegistro` AS `fecha`,`bdclick2`.`bdusuario`.`nombre` AS `usuarioNombre`,`bdclick2`.`bdconsultaclinica`.`usuario` AS `usuario` from (`bdclick2`.`bdincapacidad` join (`bdclick2`.`bdconsultaclinica` join `bdclick2`.`bdusuario` on((`bdclick2`.`bdconsultaclinica`.`usuario` = `bdclick2`.`bdusuario`.`usuario`))) on((`bdclick2`.`bdincapacidad`.`consulta` = `bdclick2`.`bdconsultaclinica`.`Id`)))
mariadb-version=100135
