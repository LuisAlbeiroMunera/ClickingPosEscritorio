TYPE=VIEW
query=select `bdclick4`.`bdconsultaclinica`.`Id` AS `consulta`,`bdclick4`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick4`.`bdayudadiagnostica`.`Id` AS `Id`,`bdclick4`.`bdayudadiagnostica`.`fecha` AS `fecha`,`bdclick4`.`bdayudadiagnostica`.`observaciones` AS `observaciones`,`bdclick4`.`bdusuario`.`nombre` AS `usuarioNombre`,`bdclick4`.`bdconsultaclinica`.`usuario` AS `usuario` from ((`bdclick4`.`bdayudadiagnostica` join `bdclick4`.`bdconsultaclinica` on((`bdclick4`.`bdayudadiagnostica`.`historia` = `bdclick4`.`bdconsultaclinica`.`Id`))) join `bdclick4`.`bdusuario` on((`bdclick4`.`bdconsultaclinica`.`usuario` = `bdclick4`.`bdusuario`.`usuario`)))
md5=70197600a912297607e15db0a1d1d885
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:25
create-version=2
source=select `bdconsultaclinica`.`Id` AS `consulta`,`bdconsultaclinica`.`historia` AS `historia`,`bdayudadiagnostica`.`Id` AS `Id`,`bdayudadiagnostica`.`fecha` AS `fecha`,`bdayudadiagnostica`.`observaciones` AS `observaciones`,`bdusuario`.`nombre` AS `usuarioNombre`,`bdconsultaclinica`.`usuario` AS `usuario` from ((`bdayudadiagnostica` join `bdconsultaclinica` on((`bdayudadiagnostica`.`historia` = `bdconsultaclinica`.`Id`))) join `bdusuario` on((`bdconsultaclinica`.`usuario` = `bdusuario`.`usuario`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdconsultaclinica`.`Id` AS `consulta`,`bdclick4`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick4`.`bdayudadiagnostica`.`Id` AS `Id`,`bdclick4`.`bdayudadiagnostica`.`fecha` AS `fecha`,`bdclick4`.`bdayudadiagnostica`.`observaciones` AS `observaciones`,`bdclick4`.`bdusuario`.`nombre` AS `usuarioNombre`,`bdclick4`.`bdconsultaclinica`.`usuario` AS `usuario` from ((`bdclick4`.`bdayudadiagnostica` join `bdclick4`.`bdconsultaclinica` on((`bdclick4`.`bdayudadiagnostica`.`historia` = `bdclick4`.`bdconsultaclinica`.`Id`))) join `bdclick4`.`bdusuario` on((`bdclick4`.`bdconsultaclinica`.`usuario` = `bdclick4`.`bdusuario`.`usuario`)))
mariadb-version=100135
