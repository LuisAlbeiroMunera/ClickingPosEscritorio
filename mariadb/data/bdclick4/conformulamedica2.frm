TYPE=VIEW
query=select `bdclick4`.`bdformulamedicaveterinaria`.`Id` AS `Id`,`bdclick4`.`bdformulamedicaveterinaria`.`historia` AS `historia`,`bdclick4`.`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdclick4`.`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdclick4`.`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdclick4`.`bdconsulta`.`temp` AS `temp`,`bdclick4`.`bdconsulta`.`peso` AS `peso`,`bdclick4`.`bdconsulta`.`tllc` AS `tllc`,`bdclick4`.`bdconsulta`.`pulso` AS `pulso` from (`bdclick4`.`bdformulamedicaveterinaria` join `bdclick4`.`bdconsulta` on((`bdclick4`.`bdformulamedicaveterinaria`.`historia` = `bdclick4`.`bdconsulta`.`Id`)))
md5=c6784fb3fc851dd476cd663f53e5ba8c
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:26
create-version=2
source=select `bdformulamedicaveterinaria`.`Id` AS `Id`,`bdformulamedicaveterinaria`.`historia` AS `historia`,`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdconsulta`.`temp` AS `temp`,`bdconsulta`.`peso` AS `peso`,`bdconsulta`.`tllc` AS `tllc`,`bdconsulta`.`pulso` AS `pulso` from (`bdformulamedicaveterinaria` join `bdconsulta` on((`bdformulamedicaveterinaria`.`historia` = `bdconsulta`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdformulamedicaveterinaria`.`Id` AS `Id`,`bdclick4`.`bdformulamedicaveterinaria`.`historia` AS `historia`,`bdclick4`.`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdclick4`.`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdclick4`.`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdclick4`.`bdconsulta`.`temp` AS `temp`,`bdclick4`.`bdconsulta`.`peso` AS `peso`,`bdclick4`.`bdconsulta`.`tllc` AS `tllc`,`bdclick4`.`bdconsulta`.`pulso` AS `pulso` from (`bdclick4`.`bdformulamedicaveterinaria` join `bdclick4`.`bdconsulta` on((`bdclick4`.`bdformulamedicaveterinaria`.`historia` = `bdclick4`.`bdconsulta`.`Id`)))
mariadb-version=100135
