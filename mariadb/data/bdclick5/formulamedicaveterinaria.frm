TYPE=VIEW
query=select `bdclick5`.`bdformulamedicaveterinaria`.`Id` AS `Id`,`bdclick5`.`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdclick5`.`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdclick5`.`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdclick5`.`bdconsulta`.`Id` AS `consulta`,`bdclick5`.`bdconsulta`.`historia` AS `historia` from (`bdclick5`.`bdconsulta` join `bdclick5`.`bdformulamedicaveterinaria` on((`bdclick5`.`bdconsulta`.`Id` = `bdclick5`.`bdformulamedicaveterinaria`.`historia`)))
md5=20f23d6301c9f5401f4f2501cb3f1b7f
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:46
create-version=2
source=select `bdformulamedicaveterinaria`.`Id` AS `Id`,`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdconsulta`.`Id` AS `consulta`,`bdconsulta`.`historia` AS `historia` from (`bdconsulta` join `bdformulamedicaveterinaria` on((`bdconsulta`.`Id` = `bdformulamedicaveterinaria`.`historia`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdformulamedicaveterinaria`.`Id` AS `Id`,`bdclick5`.`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdclick5`.`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdclick5`.`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdclick5`.`bdconsulta`.`Id` AS `consulta`,`bdclick5`.`bdconsulta`.`historia` AS `historia` from (`bdclick5`.`bdconsulta` join `bdclick5`.`bdformulamedicaveterinaria` on((`bdclick5`.`bdconsulta`.`Id` = `bdclick5`.`bdformulamedicaveterinaria`.`historia`)))
mariadb-version=100135
