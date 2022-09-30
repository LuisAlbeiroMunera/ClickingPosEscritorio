TYPE=VIEW
query=select `bdclick2`.`bdconsulta`.`Id` AS `consulta`,`bdclick2`.`bdconsulta`.`historia` AS `historia`,`bdclick2`.`bdayudadiagnosticaveterinaria`.`Id` AS `Id`,`bdclick2`.`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdclick2`.`bdayudadiagnosticaveterinaria`.`observaciones` AS `usuario` from (`bdclick2`.`bdayudadiagnosticaveterinaria` join `bdclick2`.`bdconsulta` on((`bdclick2`.`bdayudadiagnosticaveterinaria`.`historia` = `bdclick2`.`bdconsulta`.`Id`)))
md5=26a105620f70dffe6059d439a4774a19
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:42
create-version=2
source=select `bdconsulta`.`Id` AS `consulta`,`bdconsulta`.`historia` AS `historia`,`bdayudadiagnosticaveterinaria`.`Id` AS `Id`,`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdayudadiagnosticaveterinaria`.`observaciones` AS `usuario` from (`bdayudadiagnosticaveterinaria` join `bdconsulta` on((`bdayudadiagnosticaveterinaria`.`historia` = `bdconsulta`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdconsulta`.`Id` AS `consulta`,`bdclick2`.`bdconsulta`.`historia` AS `historia`,`bdclick2`.`bdayudadiagnosticaveterinaria`.`Id` AS `Id`,`bdclick2`.`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdclick2`.`bdayudadiagnosticaveterinaria`.`observaciones` AS `usuario` from (`bdclick2`.`bdayudadiagnosticaveterinaria` join `bdclick2`.`bdconsulta` on((`bdclick2`.`bdayudadiagnosticaveterinaria`.`historia` = `bdclick2`.`bdconsulta`.`Id`)))
mariadb-version=100135
