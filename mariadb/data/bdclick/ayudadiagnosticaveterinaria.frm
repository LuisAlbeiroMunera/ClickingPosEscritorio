TYPE=VIEW
query=select `bdclick`.`bdconsulta`.`Id` AS `consulta`,`bdclick`.`bdconsulta`.`historia` AS `historia`,`bdclick`.`bdayudadiagnosticaveterinaria`.`Id` AS `Id`,`bdclick`.`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdclick`.`bdayudadiagnosticaveterinaria`.`observaciones` AS `usuario` from (`bdclick`.`bdayudadiagnosticaveterinaria` join `bdclick`.`bdconsulta` on((`bdclick`.`bdayudadiagnosticaveterinaria`.`historia` = `bdclick`.`bdconsulta`.`Id`)))
md5=7adfc0746080b8fc17bc96af79e75d33
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:21
create-version=2
source=select `bdconsulta`.`Id` AS `consulta`,`bdconsulta`.`historia` AS `historia`,`bdayudadiagnosticaveterinaria`.`Id` AS `Id`,`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdayudadiagnosticaveterinaria`.`observaciones` AS `usuario` from (`bdayudadiagnosticaveterinaria` join `bdconsulta` on((`bdayudadiagnosticaveterinaria`.`historia` = `bdconsulta`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdconsulta`.`Id` AS `consulta`,`bdclick`.`bdconsulta`.`historia` AS `historia`,`bdclick`.`bdayudadiagnosticaveterinaria`.`Id` AS `Id`,`bdclick`.`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdclick`.`bdayudadiagnosticaveterinaria`.`observaciones` AS `usuario` from (`bdclick`.`bdayudadiagnosticaveterinaria` join `bdclick`.`bdconsulta` on((`bdclick`.`bdayudadiagnosticaveterinaria`.`historia` = `bdclick`.`bdconsulta`.`Id`)))
mariadb-version=100135
