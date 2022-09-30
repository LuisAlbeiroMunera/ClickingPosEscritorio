TYPE=VIEW
query=select `bdclick3`.`bdayudadiagnosticaveterinaria`.`Id` AS `id`,`bdclick3`.`bdayudadiagnosticaveterinaria`.`historia` AS `historia`,`bdclick3`.`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdclick3`.`bdayudadiagnosticaveterinaria`.`observaciones` AS `observaciones`,`bdclick3`.`bdtabladiagnosticaveterinaria`.`concepto` AS `concepto` from (`bdclick3`.`bdayudadiagnosticaveterinaria` left join `bdclick3`.`bdtabladiagnosticaveterinaria` on((`bdclick3`.`bdtabladiagnosticaveterinaria`.`diagnostico` = `bdclick3`.`bdayudadiagnosticaveterinaria`.`Id`)))
md5=3da5a13b26f5e0447bd5596201f3671c
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:48
create-version=2
source=select `bdayudadiagnosticaveterinaria`.`Id` AS `id`,`bdayudadiagnosticaveterinaria`.`historia` AS `historia`,`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdayudadiagnosticaveterinaria`.`observaciones` AS `observaciones`,`bdtabladiagnosticaveterinaria`.`concepto` AS `concepto` from (`bdayudadiagnosticaveterinaria` left join `bdtabladiagnosticaveterinaria` on((`bdtabladiagnosticaveterinaria`.`diagnostico` = `bdayudadiagnosticaveterinaria`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdayudadiagnosticaveterinaria`.`Id` AS `id`,`bdclick3`.`bdayudadiagnosticaveterinaria`.`historia` AS `historia`,`bdclick3`.`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdclick3`.`bdayudadiagnosticaveterinaria`.`observaciones` AS `observaciones`,`bdclick3`.`bdtabladiagnosticaveterinaria`.`concepto` AS `concepto` from (`bdclick3`.`bdayudadiagnosticaveterinaria` left join `bdclick3`.`bdtabladiagnosticaveterinaria` on((`bdclick3`.`bdtabladiagnosticaveterinaria`.`diagnostico` = `bdclick3`.`bdayudadiagnosticaveterinaria`.`Id`)))
mariadb-version=100135
