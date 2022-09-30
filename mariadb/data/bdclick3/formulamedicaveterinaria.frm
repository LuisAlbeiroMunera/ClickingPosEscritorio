TYPE=VIEW
query=select `bdclick3`.`bdformulamedicaveterinaria`.`Id` AS `Id`,`bdclick3`.`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdclick3`.`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdclick3`.`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdclick3`.`bdconsulta`.`Id` AS `consulta`,`bdclick3`.`bdconsulta`.`historia` AS `historia` from (`bdclick3`.`bdconsulta` join `bdclick3`.`bdformulamedicaveterinaria` on((`bdclick3`.`bdconsulta`.`Id` = `bdclick3`.`bdformulamedicaveterinaria`.`historia`)))
md5=d4451c3178f41b8c3fe7ca6e57453e65
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:50
create-version=2
source=select `bdformulamedicaveterinaria`.`Id` AS `Id`,`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdconsulta`.`Id` AS `consulta`,`bdconsulta`.`historia` AS `historia` from (`bdconsulta` join `bdformulamedicaveterinaria` on((`bdconsulta`.`Id` = `bdformulamedicaveterinaria`.`historia`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdformulamedicaveterinaria`.`Id` AS `Id`,`bdclick3`.`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdclick3`.`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdclick3`.`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdclick3`.`bdconsulta`.`Id` AS `consulta`,`bdclick3`.`bdconsulta`.`historia` AS `historia` from (`bdclick3`.`bdconsulta` join `bdclick3`.`bdformulamedicaveterinaria` on((`bdclick3`.`bdconsulta`.`Id` = `bdclick3`.`bdformulamedicaveterinaria`.`historia`)))
mariadb-version=100135
