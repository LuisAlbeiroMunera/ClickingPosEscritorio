TYPE=VIEW
query=select `bdclick4`.`bdayudadiagnosticaveterinaria`.`Id` AS `id`,`bdclick4`.`bdayudadiagnosticaveterinaria`.`historia` AS `historia`,`bdclick4`.`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdclick4`.`bdayudadiagnosticaveterinaria`.`observaciones` AS `observaciones`,`bdclick4`.`bdtabladiagnosticaveterinaria`.`concepto` AS `concepto` from (`bdclick4`.`bdayudadiagnosticaveterinaria` left join `bdclick4`.`bdtabladiagnosticaveterinaria` on((`bdclick4`.`bdtabladiagnosticaveterinaria`.`diagnostico` = `bdclick4`.`bdayudadiagnosticaveterinaria`.`Id`)))
md5=dd2908c01560d7b23ba547a01b3fc797
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:25
create-version=2
source=select `bdayudadiagnosticaveterinaria`.`Id` AS `id`,`bdayudadiagnosticaveterinaria`.`historia` AS `historia`,`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdayudadiagnosticaveterinaria`.`observaciones` AS `observaciones`,`bdtabladiagnosticaveterinaria`.`concepto` AS `concepto` from (`bdayudadiagnosticaveterinaria` left join `bdtabladiagnosticaveterinaria` on((`bdtabladiagnosticaveterinaria`.`diagnostico` = `bdayudadiagnosticaveterinaria`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdayudadiagnosticaveterinaria`.`Id` AS `id`,`bdclick4`.`bdayudadiagnosticaveterinaria`.`historia` AS `historia`,`bdclick4`.`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdclick4`.`bdayudadiagnosticaveterinaria`.`observaciones` AS `observaciones`,`bdclick4`.`bdtabladiagnosticaveterinaria`.`concepto` AS `concepto` from (`bdclick4`.`bdayudadiagnosticaveterinaria` left join `bdclick4`.`bdtabladiagnosticaveterinaria` on((`bdclick4`.`bdtabladiagnosticaveterinaria`.`diagnostico` = `bdclick4`.`bdayudadiagnosticaveterinaria`.`Id`)))
mariadb-version=100135
