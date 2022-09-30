TYPE=VIEW
query=select `bdclick3`.`bdconsulta`.`Id` AS `consulta`,`bdclick3`.`bdconsulta`.`historia` AS `historia`,`bdclick3`.`bdayudadiagnosticaveterinaria`.`Id` AS `Id`,`bdclick3`.`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdclick3`.`bdayudadiagnosticaveterinaria`.`observaciones` AS `usuario` from (`bdclick3`.`bdayudadiagnosticaveterinaria` join `bdclick3`.`bdconsulta` on((`bdclick3`.`bdayudadiagnosticaveterinaria`.`historia` = `bdclick3`.`bdconsulta`.`Id`)))
md5=f122c6ac28956382f03dc93d14a6c6bb
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:48
create-version=2
source=select `bdconsulta`.`Id` AS `consulta`,`bdconsulta`.`historia` AS `historia`,`bdayudadiagnosticaveterinaria`.`Id` AS `Id`,`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdayudadiagnosticaveterinaria`.`observaciones` AS `usuario` from (`bdayudadiagnosticaveterinaria` join `bdconsulta` on((`bdayudadiagnosticaveterinaria`.`historia` = `bdconsulta`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdconsulta`.`Id` AS `consulta`,`bdclick3`.`bdconsulta`.`historia` AS `historia`,`bdclick3`.`bdayudadiagnosticaveterinaria`.`Id` AS `Id`,`bdclick3`.`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdclick3`.`bdayudadiagnosticaveterinaria`.`observaciones` AS `usuario` from (`bdclick3`.`bdayudadiagnosticaveterinaria` join `bdclick3`.`bdconsulta` on((`bdclick3`.`bdayudadiagnosticaveterinaria`.`historia` = `bdclick3`.`bdconsulta`.`Id`)))
mariadb-version=100135
