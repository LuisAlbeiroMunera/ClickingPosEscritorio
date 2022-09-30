TYPE=VIEW
query=select `bdclick`.`bdconsultaclinica`.`Id` AS `consulta`,`bdclick`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick`.`bdayudadiagnostica`.`Id` AS `Id`,`bdclick`.`bdayudadiagnostica`.`fecha` AS `fecha`,`bdclick`.`bdayudadiagnostica`.`observaciones` AS `observaciones`,`bdclick`.`bdusuario`.`nombre` AS `usuarioNombre`,`bdclick`.`bdconsultaclinica`.`usuario` AS `usuario` from ((`bdclick`.`bdayudadiagnostica` join `bdclick`.`bdconsultaclinica` on((`bdclick`.`bdayudadiagnostica`.`historia` = `bdclick`.`bdconsultaclinica`.`Id`))) join `bdclick`.`bdusuario` on((`bdclick`.`bdconsultaclinica`.`usuario` = `bdclick`.`bdusuario`.`usuario`)))
md5=001b46be16b20ef54b8b5e8cdf80b9b4
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:21
create-version=2
source=select `bdconsultaclinica`.`Id` AS `consulta`,`bdconsultaclinica`.`historia` AS `historia`,`bdayudadiagnostica`.`Id` AS `Id`,`bdayudadiagnostica`.`fecha` AS `fecha`,`bdayudadiagnostica`.`observaciones` AS `observaciones`,`bdusuario`.`nombre` AS `usuarioNombre`,`bdconsultaclinica`.`usuario` AS `usuario` from ((`bdayudadiagnostica` join `bdconsultaclinica` on((`bdayudadiagnostica`.`historia` = `bdconsultaclinica`.`Id`))) join `bdusuario` on((`bdconsultaclinica`.`usuario` = `bdusuario`.`usuario`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdconsultaclinica`.`Id` AS `consulta`,`bdclick`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick`.`bdayudadiagnostica`.`Id` AS `Id`,`bdclick`.`bdayudadiagnostica`.`fecha` AS `fecha`,`bdclick`.`bdayudadiagnostica`.`observaciones` AS `observaciones`,`bdclick`.`bdusuario`.`nombre` AS `usuarioNombre`,`bdclick`.`bdconsultaclinica`.`usuario` AS `usuario` from ((`bdclick`.`bdayudadiagnostica` join `bdclick`.`bdconsultaclinica` on((`bdclick`.`bdayudadiagnostica`.`historia` = `bdclick`.`bdconsultaclinica`.`Id`))) join `bdclick`.`bdusuario` on((`bdclick`.`bdconsultaclinica`.`usuario` = `bdclick`.`bdusuario`.`usuario`)))
mariadb-version=100135
