TYPE=VIEW
query=select `bdclick4`.`bdformulamedicaveterinaria`.`Id` AS `Id`,`bdclick4`.`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdclick4`.`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdclick4`.`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdclick4`.`bdconsulta`.`Id` AS `consulta`,`bdclick4`.`bdconsulta`.`historia` AS `historia` from (`bdclick4`.`bdconsulta` join `bdclick4`.`bdformulamedicaveterinaria` on((`bdclick4`.`bdconsulta`.`Id` = `bdclick4`.`bdformulamedicaveterinaria`.`historia`)))
md5=0951e40861ecbbfcc211f7d9d04ec861
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:27
create-version=2
source=select `bdformulamedicaveterinaria`.`Id` AS `Id`,`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdconsulta`.`Id` AS `consulta`,`bdconsulta`.`historia` AS `historia` from (`bdconsulta` join `bdformulamedicaveterinaria` on((`bdconsulta`.`Id` = `bdformulamedicaveterinaria`.`historia`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdformulamedicaveterinaria`.`Id` AS `Id`,`bdclick4`.`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdclick4`.`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdclick4`.`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdclick4`.`bdconsulta`.`Id` AS `consulta`,`bdclick4`.`bdconsulta`.`historia` AS `historia` from (`bdclick4`.`bdconsulta` join `bdclick4`.`bdformulamedicaveterinaria` on((`bdclick4`.`bdconsulta`.`Id` = `bdclick4`.`bdformulamedicaveterinaria`.`historia`)))
mariadb-version=100135
