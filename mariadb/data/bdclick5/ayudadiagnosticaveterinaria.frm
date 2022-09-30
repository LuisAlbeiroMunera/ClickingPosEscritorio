TYPE=VIEW
query=select `bdclick5`.`bdconsulta`.`Id` AS `consulta`,`bdclick5`.`bdconsulta`.`historia` AS `historia`,`bdclick5`.`bdayudadiagnosticaveterinaria`.`Id` AS `Id`,`bdclick5`.`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdclick5`.`bdayudadiagnosticaveterinaria`.`observaciones` AS `usuario` from (`bdclick5`.`bdayudadiagnosticaveterinaria` join `bdclick5`.`bdconsulta` on((`bdclick5`.`bdayudadiagnosticaveterinaria`.`historia` = `bdclick5`.`bdconsulta`.`Id`)))
md5=7f6c3c0dfc728c669d254601c6d61476
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:44
create-version=2
source=select `bdconsulta`.`Id` AS `consulta`,`bdconsulta`.`historia` AS `historia`,`bdayudadiagnosticaveterinaria`.`Id` AS `Id`,`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdayudadiagnosticaveterinaria`.`observaciones` AS `usuario` from (`bdayudadiagnosticaveterinaria` join `bdconsulta` on((`bdayudadiagnosticaveterinaria`.`historia` = `bdconsulta`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdconsulta`.`Id` AS `consulta`,`bdclick5`.`bdconsulta`.`historia` AS `historia`,`bdclick5`.`bdayudadiagnosticaveterinaria`.`Id` AS `Id`,`bdclick5`.`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdclick5`.`bdayudadiagnosticaveterinaria`.`observaciones` AS `usuario` from (`bdclick5`.`bdayudadiagnosticaveterinaria` join `bdclick5`.`bdconsulta` on((`bdclick5`.`bdayudadiagnosticaveterinaria`.`historia` = `bdclick5`.`bdconsulta`.`Id`)))
mariadb-version=100135
