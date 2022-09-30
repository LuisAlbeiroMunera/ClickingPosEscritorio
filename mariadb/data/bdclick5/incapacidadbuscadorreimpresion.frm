TYPE=VIEW
query=select `bdclick5`.`bdincapacidad`.`consulta` AS `consulta`,`bdclick5`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick5`.`bdincapacidad`.`Id` AS `Id`,`bdclick5`.`bdincapacidad`.`fechaRegistro` AS `fecha`,`bdclick5`.`bdusuario`.`nombre` AS `usuarioNombre`,`bdclick5`.`bdconsultaclinica`.`usuario` AS `usuario` from (`bdclick5`.`bdincapacidad` join (`bdclick5`.`bdconsultaclinica` join `bdclick5`.`bdusuario` on((`bdclick5`.`bdconsultaclinica`.`usuario` = `bdclick5`.`bdusuario`.`usuario`))) on((`bdclick5`.`bdincapacidad`.`consulta` = `bdclick5`.`bdconsultaclinica`.`Id`)))
md5=6bace30de3171d6585d06a24944b2e9c
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:47
create-version=2
source=select `bdincapacidad`.`consulta` AS `consulta`,`bdconsultaclinica`.`historia` AS `historia`,`bdincapacidad`.`Id` AS `Id`,`bdincapacidad`.`fechaRegistro` AS `fecha`,`bdusuario`.`nombre` AS `usuarioNombre`,`bdconsultaclinica`.`usuario` AS `usuario` from (`bdincapacidad` join (`bdconsultaclinica` join `bdusuario` on((`bdconsultaclinica`.`usuario` = `bdusuario`.`usuario`))) on((`bdincapacidad`.`consulta` = `bdconsultaclinica`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdincapacidad`.`consulta` AS `consulta`,`bdclick5`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick5`.`bdincapacidad`.`Id` AS `Id`,`bdclick5`.`bdincapacidad`.`fechaRegistro` AS `fecha`,`bdclick5`.`bdusuario`.`nombre` AS `usuarioNombre`,`bdclick5`.`bdconsultaclinica`.`usuario` AS `usuario` from (`bdclick5`.`bdincapacidad` join (`bdclick5`.`bdconsultaclinica` join `bdclick5`.`bdusuario` on((`bdclick5`.`bdconsultaclinica`.`usuario` = `bdclick5`.`bdusuario`.`usuario`))) on((`bdclick5`.`bdincapacidad`.`consulta` = `bdclick5`.`bdconsultaclinica`.`Id`)))
mariadb-version=100135
