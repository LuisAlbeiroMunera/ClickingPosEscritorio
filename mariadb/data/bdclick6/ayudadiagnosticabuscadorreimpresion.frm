TYPE=VIEW
query=select `bdclick6`.`bdconsultaclinica`.`Id` AS `consulta`,`bdclick6`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick6`.`bdayudadiagnostica`.`Id` AS `Id`,`bdclick6`.`bdayudadiagnostica`.`fecha` AS `fecha`,`bdclick6`.`bdayudadiagnostica`.`observaciones` AS `observaciones`,`bdclick6`.`bdusuario`.`nombre` AS `usuarioNombre`,`bdclick6`.`bdconsultaclinica`.`usuario` AS `usuario` from ((`bdclick6`.`bdayudadiagnostica` join `bdclick6`.`bdconsultaclinica` on((`bdclick6`.`bdayudadiagnostica`.`historia` = `bdclick6`.`bdconsultaclinica`.`Id`))) join `bdclick6`.`bdusuario` on((`bdclick6`.`bdconsultaclinica`.`usuario` = `bdclick6`.`bdusuario`.`usuario`)))
md5=af2a614021fabe33c5ee8efdeb5352d0
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:32
create-version=2
source=select `bdconsultaclinica`.`Id` AS `consulta`,`bdconsultaclinica`.`historia` AS `historia`,`bdayudadiagnostica`.`Id` AS `Id`,`bdayudadiagnostica`.`fecha` AS `fecha`,`bdayudadiagnostica`.`observaciones` AS `observaciones`,`bdusuario`.`nombre` AS `usuarioNombre`,`bdconsultaclinica`.`usuario` AS `usuario` from ((`bdayudadiagnostica` join `bdconsultaclinica` on((`bdayudadiagnostica`.`historia` = `bdconsultaclinica`.`Id`))) join `bdusuario` on((`bdconsultaclinica`.`usuario` = `bdusuario`.`usuario`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdconsultaclinica`.`Id` AS `consulta`,`bdclick6`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick6`.`bdayudadiagnostica`.`Id` AS `Id`,`bdclick6`.`bdayudadiagnostica`.`fecha` AS `fecha`,`bdclick6`.`bdayudadiagnostica`.`observaciones` AS `observaciones`,`bdclick6`.`bdusuario`.`nombre` AS `usuarioNombre`,`bdclick6`.`bdconsultaclinica`.`usuario` AS `usuario` from ((`bdclick6`.`bdayudadiagnostica` join `bdclick6`.`bdconsultaclinica` on((`bdclick6`.`bdayudadiagnostica`.`historia` = `bdclick6`.`bdconsultaclinica`.`Id`))) join `bdclick6`.`bdusuario` on((`bdclick6`.`bdconsultaclinica`.`usuario` = `bdclick6`.`bdusuario`.`usuario`)))
mariadb-version=100135
