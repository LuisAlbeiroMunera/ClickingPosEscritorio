TYPE=VIEW
query=select `bdclick1`.`bdformulamedicaveterinaria`.`Id` AS `Id`,`bdclick1`.`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdclick1`.`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdclick1`.`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdclick1`.`bdconsulta`.`Id` AS `consulta`,`bdclick1`.`bdconsulta`.`historia` AS `historia` from (`bdclick1`.`bdconsulta` join `bdclick1`.`bdformulamedicaveterinaria` on((`bdclick1`.`bdconsulta`.`Id` = `bdclick1`.`bdformulamedicaveterinaria`.`historia`)))
md5=db2fda8971e37b4080ad6b3f3a5d6462
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:34
create-version=2
source=select `bdformulamedicaveterinaria`.`Id` AS `Id`,`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdconsulta`.`Id` AS `consulta`,`bdconsulta`.`historia` AS `historia` from (`bdconsulta` join `bdformulamedicaveterinaria` on((`bdconsulta`.`Id` = `bdformulamedicaveterinaria`.`historia`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdformulamedicaveterinaria`.`Id` AS `Id`,`bdclick1`.`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdclick1`.`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdclick1`.`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdclick1`.`bdconsulta`.`Id` AS `consulta`,`bdclick1`.`bdconsulta`.`historia` AS `historia` from (`bdclick1`.`bdconsulta` join `bdclick1`.`bdformulamedicaveterinaria` on((`bdclick1`.`bdconsulta`.`Id` = `bdclick1`.`bdformulamedicaveterinaria`.`historia`)))
mariadb-version=100135
