TYPE=VIEW
query=select `bdclick6`.`bdconsulta`.`Id` AS `consulta`,`bdclick6`.`bdconsulta`.`historia` AS `historia`,`bdclick6`.`bdayudadiagnosticaveterinaria`.`Id` AS `Id`,`bdclick6`.`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdclick6`.`bdayudadiagnosticaveterinaria`.`observaciones` AS `usuario` from (`bdclick6`.`bdayudadiagnosticaveterinaria` join `bdclick6`.`bdconsulta` on((`bdclick6`.`bdayudadiagnosticaveterinaria`.`historia` = `bdclick6`.`bdconsulta`.`Id`)))
md5=d48468312f549870e780b0c9fe913fb4
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:32
create-version=2
source=select `bdconsulta`.`Id` AS `consulta`,`bdconsulta`.`historia` AS `historia`,`bdayudadiagnosticaveterinaria`.`Id` AS `Id`,`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdayudadiagnosticaveterinaria`.`observaciones` AS `usuario` from (`bdayudadiagnosticaveterinaria` join `bdconsulta` on((`bdayudadiagnosticaveterinaria`.`historia` = `bdconsulta`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdconsulta`.`Id` AS `consulta`,`bdclick6`.`bdconsulta`.`historia` AS `historia`,`bdclick6`.`bdayudadiagnosticaveterinaria`.`Id` AS `Id`,`bdclick6`.`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdclick6`.`bdayudadiagnosticaveterinaria`.`observaciones` AS `usuario` from (`bdclick6`.`bdayudadiagnosticaveterinaria` join `bdclick6`.`bdconsulta` on((`bdclick6`.`bdayudadiagnosticaveterinaria`.`historia` = `bdclick6`.`bdconsulta`.`Id`)))
mariadb-version=100135
