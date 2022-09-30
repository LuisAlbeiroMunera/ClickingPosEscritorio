TYPE=VIEW
query=select `bdclick`.`bdformulamedicaveterinaria`.`Id` AS `Id`,`bdclick`.`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdclick`.`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdclick`.`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdclick`.`bdconsulta`.`Id` AS `consulta`,`bdclick`.`bdconsulta`.`historia` AS `historia` from (`bdclick`.`bdconsulta` join `bdclick`.`bdformulamedicaveterinaria` on((`bdclick`.`bdconsulta`.`Id` = `bdclick`.`bdformulamedicaveterinaria`.`historia`)))
md5=9c2e45a697661a94ca11ae9b7f0afe3b
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:24
create-version=2
source=select `bdformulamedicaveterinaria`.`Id` AS `Id`,`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdconsulta`.`Id` AS `consulta`,`bdconsulta`.`historia` AS `historia` from (`bdconsulta` join `bdformulamedicaveterinaria` on((`bdconsulta`.`Id` = `bdformulamedicaveterinaria`.`historia`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdformulamedicaveterinaria`.`Id` AS `Id`,`bdclick`.`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdclick`.`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdclick`.`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdclick`.`bdconsulta`.`Id` AS `consulta`,`bdclick`.`bdconsulta`.`historia` AS `historia` from (`bdclick`.`bdconsulta` join `bdclick`.`bdformulamedicaveterinaria` on((`bdclick`.`bdconsulta`.`Id` = `bdclick`.`bdformulamedicaveterinaria`.`historia`)))
mariadb-version=100135
