TYPE=VIEW
query=select `bdclick5`.`bdayudadiagnosticaveterinaria`.`Id` AS `id`,`bdclick5`.`bdayudadiagnosticaveterinaria`.`historia` AS `historia`,`bdclick5`.`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdclick5`.`bdayudadiagnosticaveterinaria`.`observaciones` AS `observaciones`,`bdclick5`.`bdtabladiagnosticaveterinaria`.`concepto` AS `concepto` from (`bdclick5`.`bdayudadiagnosticaveterinaria` left join `bdclick5`.`bdtabladiagnosticaveterinaria` on((`bdclick5`.`bdtabladiagnosticaveterinaria`.`diagnostico` = `bdclick5`.`bdayudadiagnosticaveterinaria`.`Id`)))
md5=d2194eae0c3b048c0f49585d49390ced
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:44
create-version=2
source=select `bdayudadiagnosticaveterinaria`.`Id` AS `id`,`bdayudadiagnosticaveterinaria`.`historia` AS `historia`,`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdayudadiagnosticaveterinaria`.`observaciones` AS `observaciones`,`bdtabladiagnosticaveterinaria`.`concepto` AS `concepto` from (`bdayudadiagnosticaveterinaria` left join `bdtabladiagnosticaveterinaria` on((`bdtabladiagnosticaveterinaria`.`diagnostico` = `bdayudadiagnosticaveterinaria`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdayudadiagnosticaveterinaria`.`Id` AS `id`,`bdclick5`.`bdayudadiagnosticaveterinaria`.`historia` AS `historia`,`bdclick5`.`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdclick5`.`bdayudadiagnosticaveterinaria`.`observaciones` AS `observaciones`,`bdclick5`.`bdtabladiagnosticaveterinaria`.`concepto` AS `concepto` from (`bdclick5`.`bdayudadiagnosticaveterinaria` left join `bdclick5`.`bdtabladiagnosticaveterinaria` on((`bdclick5`.`bdtabladiagnosticaveterinaria`.`diagnostico` = `bdclick5`.`bdayudadiagnosticaveterinaria`.`Id`)))
mariadb-version=100135
