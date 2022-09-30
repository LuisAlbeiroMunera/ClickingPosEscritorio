TYPE=VIEW
query=select `bdclick`.`bdayudadiagnosticaveterinaria`.`Id` AS `id`,`bdclick`.`bdayudadiagnosticaveterinaria`.`historia` AS `historia`,`bdclick`.`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdclick`.`bdayudadiagnosticaveterinaria`.`observaciones` AS `observaciones`,`bdclick`.`bdtabladiagnosticaveterinaria`.`concepto` AS `concepto` from (`bdclick`.`bdayudadiagnosticaveterinaria` left join `bdclick`.`bdtabladiagnosticaveterinaria` on((`bdclick`.`bdtabladiagnosticaveterinaria`.`diagnostico` = `bdclick`.`bdayudadiagnosticaveterinaria`.`Id`)))
md5=2f0a47c82d68ea9e030c6644bfbcda1d
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:22
create-version=2
source=select `bdayudadiagnosticaveterinaria`.`Id` AS `id`,`bdayudadiagnosticaveterinaria`.`historia` AS `historia`,`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdayudadiagnosticaveterinaria`.`observaciones` AS `observaciones`,`bdtabladiagnosticaveterinaria`.`concepto` AS `concepto` from (`bdayudadiagnosticaveterinaria` left join `bdtabladiagnosticaveterinaria` on((`bdtabladiagnosticaveterinaria`.`diagnostico` = `bdayudadiagnosticaveterinaria`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdayudadiagnosticaveterinaria`.`Id` AS `id`,`bdclick`.`bdayudadiagnosticaveterinaria`.`historia` AS `historia`,`bdclick`.`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdclick`.`bdayudadiagnosticaveterinaria`.`observaciones` AS `observaciones`,`bdclick`.`bdtabladiagnosticaveterinaria`.`concepto` AS `concepto` from (`bdclick`.`bdayudadiagnosticaveterinaria` left join `bdclick`.`bdtabladiagnosticaveterinaria` on((`bdclick`.`bdtabladiagnosticaveterinaria`.`diagnostico` = `bdclick`.`bdayudadiagnosticaveterinaria`.`Id`)))
mariadb-version=100135
