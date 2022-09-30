TYPE=VIEW
query=select `bdclick6`.`bdformulamedicaveterinaria`.`Id` AS `Id`,`bdclick6`.`bdformulamedicaveterinaria`.`historia` AS `historia`,`bdclick6`.`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdclick6`.`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdclick6`.`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdclick6`.`bdconsulta`.`temp` AS `temp`,`bdclick6`.`bdconsulta`.`peso` AS `peso`,`bdclick6`.`bdconsulta`.`tllc` AS `tllc`,`bdclick6`.`bdconsulta`.`pulso` AS `pulso` from (`bdclick6`.`bdformulamedicaveterinaria` join `bdclick6`.`bdconsulta` on((`bdclick6`.`bdformulamedicaveterinaria`.`historia` = `bdclick6`.`bdconsulta`.`Id`)))
md5=e93a92a984161b5029c12c7bafad6893
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:33
create-version=2
source=select `bdformulamedicaveterinaria`.`Id` AS `Id`,`bdformulamedicaveterinaria`.`historia` AS `historia`,`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdconsulta`.`temp` AS `temp`,`bdconsulta`.`peso` AS `peso`,`bdconsulta`.`tllc` AS `tllc`,`bdconsulta`.`pulso` AS `pulso` from (`bdformulamedicaveterinaria` join `bdconsulta` on((`bdformulamedicaveterinaria`.`historia` = `bdconsulta`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdformulamedicaveterinaria`.`Id` AS `Id`,`bdclick6`.`bdformulamedicaveterinaria`.`historia` AS `historia`,`bdclick6`.`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdclick6`.`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdclick6`.`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdclick6`.`bdconsulta`.`temp` AS `temp`,`bdclick6`.`bdconsulta`.`peso` AS `peso`,`bdclick6`.`bdconsulta`.`tllc` AS `tllc`,`bdclick6`.`bdconsulta`.`pulso` AS `pulso` from (`bdclick6`.`bdformulamedicaveterinaria` join `bdclick6`.`bdconsulta` on((`bdclick6`.`bdformulamedicaveterinaria`.`historia` = `bdclick6`.`bdconsulta`.`Id`)))
mariadb-version=100135
