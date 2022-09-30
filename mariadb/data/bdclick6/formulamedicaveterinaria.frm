TYPE=VIEW
query=select `bdclick6`.`bdformulamedicaveterinaria`.`Id` AS `Id`,`bdclick6`.`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdclick6`.`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdclick6`.`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdclick6`.`bdconsulta`.`Id` AS `consulta`,`bdclick6`.`bdconsulta`.`historia` AS `historia` from (`bdclick6`.`bdconsulta` join `bdclick6`.`bdformulamedicaveterinaria` on((`bdclick6`.`bdconsulta`.`Id` = `bdclick6`.`bdformulamedicaveterinaria`.`historia`)))
md5=ef2e9326192c7ae39bbf2c00fefe864c
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:35
create-version=2
source=select `bdformulamedicaveterinaria`.`Id` AS `Id`,`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdconsulta`.`Id` AS `consulta`,`bdconsulta`.`historia` AS `historia` from (`bdconsulta` join `bdformulamedicaveterinaria` on((`bdconsulta`.`Id` = `bdformulamedicaveterinaria`.`historia`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdformulamedicaveterinaria`.`Id` AS `Id`,`bdclick6`.`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdclick6`.`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdclick6`.`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdclick6`.`bdconsulta`.`Id` AS `consulta`,`bdclick6`.`bdconsulta`.`historia` AS `historia` from (`bdclick6`.`bdconsulta` join `bdclick6`.`bdformulamedicaveterinaria` on((`bdclick6`.`bdconsulta`.`Id` = `bdclick6`.`bdformulamedicaveterinaria`.`historia`)))
mariadb-version=100135
