TYPE=VIEW
query=select `bdclick5`.`bdconsultaclinica`.`Id` AS `consulta`,`bdclick5`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick5`.`bdayudadiagnostica`.`Id` AS `Id`,`bdclick5`.`bdayudadiagnostica`.`fecha` AS `fecha`,`bdclick5`.`bdayudadiagnostica`.`observaciones` AS `observaciones`,`bdclick5`.`bdusuario`.`nombre` AS `usuarioNombre`,`bdclick5`.`bdconsultaclinica`.`usuario` AS `usuario` from ((`bdclick5`.`bdayudadiagnostica` join `bdclick5`.`bdconsultaclinica` on((`bdclick5`.`bdayudadiagnostica`.`historia` = `bdclick5`.`bdconsultaclinica`.`Id`))) join `bdclick5`.`bdusuario` on((`bdclick5`.`bdconsultaclinica`.`usuario` = `bdclick5`.`bdusuario`.`usuario`)))
md5=135062226ba890a0f7d2f0d699015768
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:44
create-version=2
source=select `bdconsultaclinica`.`Id` AS `consulta`,`bdconsultaclinica`.`historia` AS `historia`,`bdayudadiagnostica`.`Id` AS `Id`,`bdayudadiagnostica`.`fecha` AS `fecha`,`bdayudadiagnostica`.`observaciones` AS `observaciones`,`bdusuario`.`nombre` AS `usuarioNombre`,`bdconsultaclinica`.`usuario` AS `usuario` from ((`bdayudadiagnostica` join `bdconsultaclinica` on((`bdayudadiagnostica`.`historia` = `bdconsultaclinica`.`Id`))) join `bdusuario` on((`bdconsultaclinica`.`usuario` = `bdusuario`.`usuario`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdconsultaclinica`.`Id` AS `consulta`,`bdclick5`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick5`.`bdayudadiagnostica`.`Id` AS `Id`,`bdclick5`.`bdayudadiagnostica`.`fecha` AS `fecha`,`bdclick5`.`bdayudadiagnostica`.`observaciones` AS `observaciones`,`bdclick5`.`bdusuario`.`nombre` AS `usuarioNombre`,`bdclick5`.`bdconsultaclinica`.`usuario` AS `usuario` from ((`bdclick5`.`bdayudadiagnostica` join `bdclick5`.`bdconsultaclinica` on((`bdclick5`.`bdayudadiagnostica`.`historia` = `bdclick5`.`bdconsultaclinica`.`Id`))) join `bdclick5`.`bdusuario` on((`bdclick5`.`bdconsultaclinica`.`usuario` = `bdclick5`.`bdusuario`.`usuario`)))
mariadb-version=100135
