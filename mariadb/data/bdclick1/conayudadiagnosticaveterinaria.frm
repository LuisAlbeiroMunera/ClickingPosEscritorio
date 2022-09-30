TYPE=VIEW
query=select `bdclick1`.`bdayudadiagnosticaveterinaria`.`Id` AS `id`,`bdclick1`.`bdayudadiagnosticaveterinaria`.`historia` AS `historia`,`bdclick1`.`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdclick1`.`bdayudadiagnosticaveterinaria`.`observaciones` AS `observaciones`,`bdclick1`.`bdtabladiagnosticaveterinaria`.`concepto` AS `concepto` from (`bdclick1`.`bdayudadiagnosticaveterinaria` left join `bdclick1`.`bdtabladiagnosticaveterinaria` on((`bdclick1`.`bdtabladiagnosticaveterinaria`.`diagnostico` = `bdclick1`.`bdayudadiagnosticaveterinaria`.`Id`)))
md5=7c6e3bb9bc420079186eb95584097aac
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:32
create-version=2
source=select `bdayudadiagnosticaveterinaria`.`Id` AS `id`,`bdayudadiagnosticaveterinaria`.`historia` AS `historia`,`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdayudadiagnosticaveterinaria`.`observaciones` AS `observaciones`,`bdtabladiagnosticaveterinaria`.`concepto` AS `concepto` from (`bdayudadiagnosticaveterinaria` left join `bdtabladiagnosticaveterinaria` on((`bdtabladiagnosticaveterinaria`.`diagnostico` = `bdayudadiagnosticaveterinaria`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdayudadiagnosticaveterinaria`.`Id` AS `id`,`bdclick1`.`bdayudadiagnosticaveterinaria`.`historia` AS `historia`,`bdclick1`.`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdclick1`.`bdayudadiagnosticaveterinaria`.`observaciones` AS `observaciones`,`bdclick1`.`bdtabladiagnosticaveterinaria`.`concepto` AS `concepto` from (`bdclick1`.`bdayudadiagnosticaveterinaria` left join `bdclick1`.`bdtabladiagnosticaveterinaria` on((`bdclick1`.`bdtabladiagnosticaveterinaria`.`diagnostico` = `bdclick1`.`bdayudadiagnosticaveterinaria`.`Id`)))
mariadb-version=100135
