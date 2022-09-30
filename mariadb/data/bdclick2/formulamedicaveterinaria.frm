TYPE=VIEW
query=select `bdclick2`.`bdformulamedicaveterinaria`.`Id` AS `Id`,`bdclick2`.`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdclick2`.`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdclick2`.`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdclick2`.`bdconsulta`.`Id` AS `consulta`,`bdclick2`.`bdconsulta`.`historia` AS `historia` from (`bdclick2`.`bdconsulta` join `bdclick2`.`bdformulamedicaveterinaria` on((`bdclick2`.`bdconsulta`.`Id` = `bdclick2`.`bdformulamedicaveterinaria`.`historia`)))
md5=eff710178c4cdaf26a7c187b2a37b465
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:45
create-version=2
source=select `bdformulamedicaveterinaria`.`Id` AS `Id`,`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdconsulta`.`Id` AS `consulta`,`bdconsulta`.`historia` AS `historia` from (`bdconsulta` join `bdformulamedicaveterinaria` on((`bdconsulta`.`Id` = `bdformulamedicaveterinaria`.`historia`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdformulamedicaveterinaria`.`Id` AS `Id`,`bdclick2`.`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdclick2`.`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdclick2`.`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdclick2`.`bdconsulta`.`Id` AS `consulta`,`bdclick2`.`bdconsulta`.`historia` AS `historia` from (`bdclick2`.`bdconsulta` join `bdclick2`.`bdformulamedicaveterinaria` on((`bdclick2`.`bdconsulta`.`Id` = `bdclick2`.`bdformulamedicaveterinaria`.`historia`)))
mariadb-version=100135
