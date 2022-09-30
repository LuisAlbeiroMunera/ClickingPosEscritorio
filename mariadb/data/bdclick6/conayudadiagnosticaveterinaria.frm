TYPE=VIEW
query=select `bdclick6`.`bdayudadiagnosticaveterinaria`.`Id` AS `id`,`bdclick6`.`bdayudadiagnosticaveterinaria`.`historia` AS `historia`,`bdclick6`.`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdclick6`.`bdayudadiagnosticaveterinaria`.`observaciones` AS `observaciones`,`bdclick6`.`bdtabladiagnosticaveterinaria`.`concepto` AS `concepto` from (`bdclick6`.`bdayudadiagnosticaveterinaria` left join `bdclick6`.`bdtabladiagnosticaveterinaria` on((`bdclick6`.`bdtabladiagnosticaveterinaria`.`diagnostico` = `bdclick6`.`bdayudadiagnosticaveterinaria`.`Id`)))
md5=729c32face63b4307ffe7075ee11d536
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:33
create-version=2
source=select `bdayudadiagnosticaveterinaria`.`Id` AS `id`,`bdayudadiagnosticaveterinaria`.`historia` AS `historia`,`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdayudadiagnosticaveterinaria`.`observaciones` AS `observaciones`,`bdtabladiagnosticaveterinaria`.`concepto` AS `concepto` from (`bdayudadiagnosticaveterinaria` left join `bdtabladiagnosticaveterinaria` on((`bdtabladiagnosticaveterinaria`.`diagnostico` = `bdayudadiagnosticaveterinaria`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdayudadiagnosticaveterinaria`.`Id` AS `id`,`bdclick6`.`bdayudadiagnosticaveterinaria`.`historia` AS `historia`,`bdclick6`.`bdayudadiagnosticaveterinaria`.`fecha` AS `fecha`,`bdclick6`.`bdayudadiagnosticaveterinaria`.`observaciones` AS `observaciones`,`bdclick6`.`bdtabladiagnosticaveterinaria`.`concepto` AS `concepto` from (`bdclick6`.`bdayudadiagnosticaveterinaria` left join `bdclick6`.`bdtabladiagnosticaveterinaria` on((`bdclick6`.`bdtabladiagnosticaveterinaria`.`diagnostico` = `bdclick6`.`bdayudadiagnosticaveterinaria`.`Id`)))
mariadb-version=100135
