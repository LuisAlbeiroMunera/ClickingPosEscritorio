TYPE=VIEW
query=select `bdclick1`.`bdconsulta`.`Id` AS `consulta`,`bdclick1`.`bdconsulta`.`historia` AS `historia`,`bdclick1`.`bdayudadiagnosticaveterinaria`.`Id` AS `Id`,`bdclick1`.`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdclick1`.`bdayudadiagnosticaveterinaria`.`observaciones` AS `usuario` from (`bdclick1`.`bdayudadiagnosticaveterinaria` join `bdclick1`.`bdconsulta` on((`bdclick1`.`bdayudadiagnosticaveterinaria`.`historia` = `bdclick1`.`bdconsulta`.`Id`)))
md5=82c9922964fb290cff566c9caf244ff8
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:32
create-version=2
source=select `bdconsulta`.`Id` AS `consulta`,`bdconsulta`.`historia` AS `historia`,`bdayudadiagnosticaveterinaria`.`Id` AS `Id`,`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdayudadiagnosticaveterinaria`.`observaciones` AS `usuario` from (`bdayudadiagnosticaveterinaria` join `bdconsulta` on((`bdayudadiagnosticaveterinaria`.`historia` = `bdconsulta`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdconsulta`.`Id` AS `consulta`,`bdclick1`.`bdconsulta`.`historia` AS `historia`,`bdclick1`.`bdayudadiagnosticaveterinaria`.`Id` AS `Id`,`bdclick1`.`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdclick1`.`bdayudadiagnosticaveterinaria`.`observaciones` AS `usuario` from (`bdclick1`.`bdayudadiagnosticaveterinaria` join `bdclick1`.`bdconsulta` on((`bdclick1`.`bdayudadiagnosticaveterinaria`.`historia` = `bdclick1`.`bdconsulta`.`Id`)))
mariadb-version=100135
