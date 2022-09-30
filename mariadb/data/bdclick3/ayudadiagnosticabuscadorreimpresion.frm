TYPE=VIEW
query=select `bdclick3`.`bdconsultaclinica`.`Id` AS `consulta`,`bdclick3`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick3`.`bdayudadiagnostica`.`Id` AS `Id`,`bdclick3`.`bdayudadiagnostica`.`fecha` AS `fecha`,`bdclick3`.`bdayudadiagnostica`.`observaciones` AS `observaciones`,`bdclick3`.`bdusuario`.`nombre` AS `usuarioNombre`,`bdclick3`.`bdconsultaclinica`.`usuario` AS `usuario` from ((`bdclick3`.`bdayudadiagnostica` join `bdclick3`.`bdconsultaclinica` on((`bdclick3`.`bdayudadiagnostica`.`historia` = `bdclick3`.`bdconsultaclinica`.`Id`))) join `bdclick3`.`bdusuario` on((`bdclick3`.`bdconsultaclinica`.`usuario` = `bdclick3`.`bdusuario`.`usuario`)))
md5=c1d5d5ed1490323bcf3ec5497c50b915
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:48
create-version=2
source=select `bdconsultaclinica`.`Id` AS `consulta`,`bdconsultaclinica`.`historia` AS `historia`,`bdayudadiagnostica`.`Id` AS `Id`,`bdayudadiagnostica`.`fecha` AS `fecha`,`bdayudadiagnostica`.`observaciones` AS `observaciones`,`bdusuario`.`nombre` AS `usuarioNombre`,`bdconsultaclinica`.`usuario` AS `usuario` from ((`bdayudadiagnostica` join `bdconsultaclinica` on((`bdayudadiagnostica`.`historia` = `bdconsultaclinica`.`Id`))) join `bdusuario` on((`bdconsultaclinica`.`usuario` = `bdusuario`.`usuario`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdconsultaclinica`.`Id` AS `consulta`,`bdclick3`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick3`.`bdayudadiagnostica`.`Id` AS `Id`,`bdclick3`.`bdayudadiagnostica`.`fecha` AS `fecha`,`bdclick3`.`bdayudadiagnostica`.`observaciones` AS `observaciones`,`bdclick3`.`bdusuario`.`nombre` AS `usuarioNombre`,`bdclick3`.`bdconsultaclinica`.`usuario` AS `usuario` from ((`bdclick3`.`bdayudadiagnostica` join `bdclick3`.`bdconsultaclinica` on((`bdclick3`.`bdayudadiagnostica`.`historia` = `bdclick3`.`bdconsultaclinica`.`Id`))) join `bdclick3`.`bdusuario` on((`bdclick3`.`bdconsultaclinica`.`usuario` = `bdclick3`.`bdusuario`.`usuario`)))
mariadb-version=100135
