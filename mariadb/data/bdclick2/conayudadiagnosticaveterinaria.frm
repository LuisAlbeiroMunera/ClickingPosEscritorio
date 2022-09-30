TYPE=VIEW
query=select `bdclick2`.`bdayudadiagnosticaveterinaria`.`Id` AS `id`,`bdclick2`.`bdayudadiagnosticaveterinaria`.`historia` AS `historia`,`bdclick2`.`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdclick2`.`bdayudadiagnosticaveterinaria`.`observaciones` AS `observaciones`,`bdclick2`.`bdtabladiagnosticaveterinaria`.`concepto` AS `concepto` from (`bdclick2`.`bdayudadiagnosticaveterinaria` left join `bdclick2`.`bdtabladiagnosticaveterinaria` on((`bdclick2`.`bdtabladiagnosticaveterinaria`.`diagnostico` = `bdclick2`.`bdayudadiagnosticaveterinaria`.`Id`)))
md5=732a61f95584d3698e18cee2ede0804a
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:43
create-version=2
source=select `bdayudadiagnosticaveterinaria`.`Id` AS `id`,`bdayudadiagnosticaveterinaria`.`historia` AS `historia`,`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdayudadiagnosticaveterinaria`.`observaciones` AS `observaciones`,`bdtabladiagnosticaveterinaria`.`concepto` AS `concepto` from (`bdayudadiagnosticaveterinaria` left join `bdtabladiagnosticaveterinaria` on((`bdtabladiagnosticaveterinaria`.`diagnostico` = `bdayudadiagnosticaveterinaria`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdayudadiagnosticaveterinaria`.`Id` AS `id`,`bdclick2`.`bdayudadiagnosticaveterinaria`.`historia` AS `historia`,`bdclick2`.`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdclick2`.`bdayudadiagnosticaveterinaria`.`observaciones` AS `observaciones`,`bdclick2`.`bdtabladiagnosticaveterinaria`.`concepto` AS `concepto` from (`bdclick2`.`bdayudadiagnosticaveterinaria` left join `bdclick2`.`bdtabladiagnosticaveterinaria` on((`bdclick2`.`bdtabladiagnosticaveterinaria`.`diagnostico` = `bdclick2`.`bdayudadiagnosticaveterinaria`.`Id`)))
mariadb-version=100135
