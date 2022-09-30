TYPE=VIEW
query=select `bdclick3`.`bdincapacidad`.`consulta` AS `consulta`,`bdclick3`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick3`.`bdincapacidad`.`Id` AS `Id`,`bdclick3`.`bdincapacidad`.`fechaRegistro` AS `fecha`,`bdclick3`.`bdusuario`.`nombre` AS `usuarioNombre`,`bdclick3`.`bdconsultaclinica`.`usuario` AS `usuario` from (`bdclick3`.`bdincapacidad` join (`bdclick3`.`bdconsultaclinica` join `bdclick3`.`bdusuario` on((`bdclick3`.`bdconsultaclinica`.`usuario` = `bdclick3`.`bdusuario`.`usuario`))) on((`bdclick3`.`bdincapacidad`.`consulta` = `bdclick3`.`bdconsultaclinica`.`Id`)))
md5=a069d4353bc0ca52c16921af27232fe6
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:50
create-version=2
source=select `bdincapacidad`.`consulta` AS `consulta`,`bdconsultaclinica`.`historia` AS `historia`,`bdincapacidad`.`Id` AS `Id`,`bdincapacidad`.`fechaRegistro` AS `fecha`,`bdusuario`.`nombre` AS `usuarioNombre`,`bdconsultaclinica`.`usuario` AS `usuario` from (`bdincapacidad` join (`bdconsultaclinica` join `bdusuario` on((`bdconsultaclinica`.`usuario` = `bdusuario`.`usuario`))) on((`bdincapacidad`.`consulta` = `bdconsultaclinica`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdincapacidad`.`consulta` AS `consulta`,`bdclick3`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick3`.`bdincapacidad`.`Id` AS `Id`,`bdclick3`.`bdincapacidad`.`fechaRegistro` AS `fecha`,`bdclick3`.`bdusuario`.`nombre` AS `usuarioNombre`,`bdclick3`.`bdconsultaclinica`.`usuario` AS `usuario` from (`bdclick3`.`bdincapacidad` join (`bdclick3`.`bdconsultaclinica` join `bdclick3`.`bdusuario` on((`bdclick3`.`bdconsultaclinica`.`usuario` = `bdclick3`.`bdusuario`.`usuario`))) on((`bdclick3`.`bdincapacidad`.`consulta` = `bdclick3`.`bdconsultaclinica`.`Id`)))
mariadb-version=100135
