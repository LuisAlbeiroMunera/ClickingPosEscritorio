TYPE=VIEW
query=select `bdclick4`.`bdincapacidad`.`consulta` AS `consulta`,`bdclick4`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick4`.`bdincapacidad`.`Id` AS `Id`,`bdclick4`.`bdincapacidad`.`fechaRegistro` AS `fecha`,`bdclick4`.`bdusuario`.`nombre` AS `usuarioNombre`,`bdclick4`.`bdconsultaclinica`.`usuario` AS `usuario` from (`bdclick4`.`bdincapacidad` join (`bdclick4`.`bdconsultaclinica` join `bdclick4`.`bdusuario` on((`bdclick4`.`bdconsultaclinica`.`usuario` = `bdclick4`.`bdusuario`.`usuario`))) on((`bdclick4`.`bdincapacidad`.`consulta` = `bdclick4`.`bdconsultaclinica`.`Id`)))
md5=372fc69c538a9079e0ac04bd5e7fc571
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:27
create-version=2
source=select `bdincapacidad`.`consulta` AS `consulta`,`bdconsultaclinica`.`historia` AS `historia`,`bdincapacidad`.`Id` AS `Id`,`bdincapacidad`.`fechaRegistro` AS `fecha`,`bdusuario`.`nombre` AS `usuarioNombre`,`bdconsultaclinica`.`usuario` AS `usuario` from (`bdincapacidad` join (`bdconsultaclinica` join `bdusuario` on((`bdconsultaclinica`.`usuario` = `bdusuario`.`usuario`))) on((`bdincapacidad`.`consulta` = `bdconsultaclinica`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdincapacidad`.`consulta` AS `consulta`,`bdclick4`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick4`.`bdincapacidad`.`Id` AS `Id`,`bdclick4`.`bdincapacidad`.`fechaRegistro` AS `fecha`,`bdclick4`.`bdusuario`.`nombre` AS `usuarioNombre`,`bdclick4`.`bdconsultaclinica`.`usuario` AS `usuario` from (`bdclick4`.`bdincapacidad` join (`bdclick4`.`bdconsultaclinica` join `bdclick4`.`bdusuario` on((`bdclick4`.`bdconsultaclinica`.`usuario` = `bdclick4`.`bdusuario`.`usuario`))) on((`bdclick4`.`bdincapacidad`.`consulta` = `bdclick4`.`bdconsultaclinica`.`Id`)))
mariadb-version=100135
