TYPE=VIEW
query=select `bdclick1`.`bdconsultaclinica`.`Id` AS `consulta`,`bdclick1`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick1`.`bdayudadiagnostica`.`Id` AS `Id`,`bdclick1`.`bdayudadiagnostica`.`fecha` AS `fecha`,`bdclick1`.`bdayudadiagnostica`.`observaciones` AS `observaciones`,`bdclick1`.`bdusuario`.`nombre` AS `usuarioNombre`,`bdclick1`.`bdconsultaclinica`.`usuario` AS `usuario` from ((`bdclick1`.`bdayudadiagnostica` join `bdclick1`.`bdconsultaclinica` on((`bdclick1`.`bdayudadiagnostica`.`historia` = `bdclick1`.`bdconsultaclinica`.`Id`))) join `bdclick1`.`bdusuario` on((`bdclick1`.`bdconsultaclinica`.`usuario` = `bdclick1`.`bdusuario`.`usuario`)))
md5=d8d1a005469cffa10be94843a908e8c4
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:32
create-version=2
source=select `bdconsultaclinica`.`Id` AS `consulta`,`bdconsultaclinica`.`historia` AS `historia`,`bdayudadiagnostica`.`Id` AS `Id`,`bdayudadiagnostica`.`fecha` AS `fecha`,`bdayudadiagnostica`.`observaciones` AS `observaciones`,`bdusuario`.`nombre` AS `usuarioNombre`,`bdconsultaclinica`.`usuario` AS `usuario` from ((`bdayudadiagnostica` join `bdconsultaclinica` on((`bdayudadiagnostica`.`historia` = `bdconsultaclinica`.`Id`))) join `bdusuario` on((`bdconsultaclinica`.`usuario` = `bdusuario`.`usuario`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdconsultaclinica`.`Id` AS `consulta`,`bdclick1`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick1`.`bdayudadiagnostica`.`Id` AS `Id`,`bdclick1`.`bdayudadiagnostica`.`fecha` AS `fecha`,`bdclick1`.`bdayudadiagnostica`.`observaciones` AS `observaciones`,`bdclick1`.`bdusuario`.`nombre` AS `usuarioNombre`,`bdclick1`.`bdconsultaclinica`.`usuario` AS `usuario` from ((`bdclick1`.`bdayudadiagnostica` join `bdclick1`.`bdconsultaclinica` on((`bdclick1`.`bdayudadiagnostica`.`historia` = `bdclick1`.`bdconsultaclinica`.`Id`))) join `bdclick1`.`bdusuario` on((`bdclick1`.`bdconsultaclinica`.`usuario` = `bdclick1`.`bdusuario`.`usuario`)))
mariadb-version=100135
