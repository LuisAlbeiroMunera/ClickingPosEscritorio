TYPE=VIEW
query=select `bdclick2`.`bdconsultaclinica`.`Id` AS `consulta`,`bdclick2`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick2`.`bdayudadiagnostica`.`Id` AS `Id`,`bdclick2`.`bdayudadiagnostica`.`fecha` AS `fecha`,`bdclick2`.`bdayudadiagnostica`.`observaciones` AS `observaciones`,`bdclick2`.`bdusuario`.`nombre` AS `usuarioNombre`,`bdclick2`.`bdconsultaclinica`.`usuario` AS `usuario` from ((`bdclick2`.`bdayudadiagnostica` join `bdclick2`.`bdconsultaclinica` on((`bdclick2`.`bdayudadiagnostica`.`historia` = `bdclick2`.`bdconsultaclinica`.`Id`))) join `bdclick2`.`bdusuario` on((`bdclick2`.`bdconsultaclinica`.`usuario` = `bdclick2`.`bdusuario`.`usuario`)))
md5=d8f8101e506f6d64e60c45353bf421fc
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:42
create-version=2
source=select `bdconsultaclinica`.`Id` AS `consulta`,`bdconsultaclinica`.`historia` AS `historia`,`bdayudadiagnostica`.`Id` AS `Id`,`bdayudadiagnostica`.`fecha` AS `fecha`,`bdayudadiagnostica`.`observaciones` AS `observaciones`,`bdusuario`.`nombre` AS `usuarioNombre`,`bdconsultaclinica`.`usuario` AS `usuario` from ((`bdayudadiagnostica` join `bdconsultaclinica` on((`bdayudadiagnostica`.`historia` = `bdconsultaclinica`.`Id`))) join `bdusuario` on((`bdconsultaclinica`.`usuario` = `bdusuario`.`usuario`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdconsultaclinica`.`Id` AS `consulta`,`bdclick2`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick2`.`bdayudadiagnostica`.`Id` AS `Id`,`bdclick2`.`bdayudadiagnostica`.`fecha` AS `fecha`,`bdclick2`.`bdayudadiagnostica`.`observaciones` AS `observaciones`,`bdclick2`.`bdusuario`.`nombre` AS `usuarioNombre`,`bdclick2`.`bdconsultaclinica`.`usuario` AS `usuario` from ((`bdclick2`.`bdayudadiagnostica` join `bdclick2`.`bdconsultaclinica` on((`bdclick2`.`bdayudadiagnostica`.`historia` = `bdclick2`.`bdconsultaclinica`.`Id`))) join `bdclick2`.`bdusuario` on((`bdclick2`.`bdconsultaclinica`.`usuario` = `bdclick2`.`bdusuario`.`usuario`)))
mariadb-version=100135
