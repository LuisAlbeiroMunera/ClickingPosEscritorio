TYPE=VIEW
query=select `bdclick4`.`bdconsulta`.`Id` AS `consulta`,`bdclick4`.`bdconsulta`.`historia` AS `historia`,`bdclick4`.`bdayudadiagnosticaveterinaria`.`Id` AS `Id`,`bdclick4`.`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdclick4`.`bdayudadiagnosticaveterinaria`.`observaciones` AS `usuario` from (`bdclick4`.`bdayudadiagnosticaveterinaria` join `bdclick4`.`bdconsulta` on((`bdclick4`.`bdayudadiagnosticaveterinaria`.`historia` = `bdclick4`.`bdconsulta`.`Id`)))
md5=d685fe87513ee3f6cbb8d98c850661fd
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:25
create-version=2
source=select `bdconsulta`.`Id` AS `consulta`,`bdconsulta`.`historia` AS `historia`,`bdayudadiagnosticaveterinaria`.`Id` AS `Id`,`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdayudadiagnosticaveterinaria`.`observaciones` AS `usuario` from (`bdayudadiagnosticaveterinaria` join `bdconsulta` on((`bdayudadiagnosticaveterinaria`.`historia` = `bdconsulta`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdconsulta`.`Id` AS `consulta`,`bdclick4`.`bdconsulta`.`historia` AS `historia`,`bdclick4`.`bdayudadiagnosticaveterinaria`.`Id` AS `Id`,`bdclick4`.`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdclick4`.`bdayudadiagnosticaveterinaria`.`observaciones` AS `usuario` from (`bdclick4`.`bdayudadiagnosticaveterinaria` join `bdclick4`.`bdconsulta` on((`bdclick4`.`bdayudadiagnosticaveterinaria`.`historia` = `bdclick4`.`bdconsulta`.`Id`)))
mariadb-version=100135
