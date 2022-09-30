TYPE=VIEW
query=select `bdclick3`.`bdformulamedicaveterinaria`.`Id` AS `Id`,`bdclick3`.`bdformulamedicaveterinaria`.`historia` AS `historia`,`bdclick3`.`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdclick3`.`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdclick3`.`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdclick3`.`bdconsulta`.`temp` AS `temp`,`bdclick3`.`bdconsulta`.`peso` AS `peso`,`bdclick3`.`bdconsulta`.`tllc` AS `tllc`,`bdclick3`.`bdconsulta`.`pulso` AS `pulso` from (`bdclick3`.`bdformulamedicaveterinaria` join `bdclick3`.`bdconsulta` on((`bdclick3`.`bdformulamedicaveterinaria`.`historia` = `bdclick3`.`bdconsulta`.`Id`)))
md5=e733ec70893ee624a2172e08c6f5f707
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:49
create-version=2
source=select `bdformulamedicaveterinaria`.`Id` AS `Id`,`bdformulamedicaveterinaria`.`historia` AS `historia`,`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdconsulta`.`temp` AS `temp`,`bdconsulta`.`peso` AS `peso`,`bdconsulta`.`tllc` AS `tllc`,`bdconsulta`.`pulso` AS `pulso` from (`bdformulamedicaveterinaria` join `bdconsulta` on((`bdformulamedicaveterinaria`.`historia` = `bdconsulta`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdformulamedicaveterinaria`.`Id` AS `Id`,`bdclick3`.`bdformulamedicaveterinaria`.`historia` AS `historia`,`bdclick3`.`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdclick3`.`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdclick3`.`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdclick3`.`bdconsulta`.`temp` AS `temp`,`bdclick3`.`bdconsulta`.`peso` AS `peso`,`bdclick3`.`bdconsulta`.`tllc` AS `tllc`,`bdclick3`.`bdconsulta`.`pulso` AS `pulso` from (`bdclick3`.`bdformulamedicaveterinaria` join `bdclick3`.`bdconsulta` on((`bdclick3`.`bdformulamedicaveterinaria`.`historia` = `bdclick3`.`bdconsulta`.`Id`)))
mariadb-version=100135
