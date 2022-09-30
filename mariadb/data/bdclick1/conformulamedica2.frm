TYPE=VIEW
query=select `bdclick1`.`bdformulamedicaveterinaria`.`Id` AS `Id`,`bdclick1`.`bdformulamedicaveterinaria`.`historia` AS `historia`,`bdclick1`.`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdclick1`.`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdclick1`.`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdclick1`.`bdconsulta`.`temp` AS `temp`,`bdclick1`.`bdconsulta`.`peso` AS `peso`,`bdclick1`.`bdconsulta`.`tllc` AS `tllc`,`bdclick1`.`bdconsulta`.`pulso` AS `pulso` from (`bdclick1`.`bdformulamedicaveterinaria` join `bdclick1`.`bdconsulta` on((`bdclick1`.`bdformulamedicaveterinaria`.`historia` = `bdclick1`.`bdconsulta`.`Id`)))
md5=824ee91c0157d4a72953f5fd1697371b
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:33
create-version=2
source=select `bdformulamedicaveterinaria`.`Id` AS `Id`,`bdformulamedicaveterinaria`.`historia` AS `historia`,`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdconsulta`.`temp` AS `temp`,`bdconsulta`.`peso` AS `peso`,`bdconsulta`.`tllc` AS `tllc`,`bdconsulta`.`pulso` AS `pulso` from (`bdformulamedicaveterinaria` join `bdconsulta` on((`bdformulamedicaveterinaria`.`historia` = `bdconsulta`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdformulamedicaveterinaria`.`Id` AS `Id`,`bdclick1`.`bdformulamedicaveterinaria`.`historia` AS `historia`,`bdclick1`.`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdclick1`.`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdclick1`.`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdclick1`.`bdconsulta`.`temp` AS `temp`,`bdclick1`.`bdconsulta`.`peso` AS `peso`,`bdclick1`.`bdconsulta`.`tllc` AS `tllc`,`bdclick1`.`bdconsulta`.`pulso` AS `pulso` from (`bdclick1`.`bdformulamedicaveterinaria` join `bdclick1`.`bdconsulta` on((`bdclick1`.`bdformulamedicaveterinaria`.`historia` = `bdclick1`.`bdconsulta`.`Id`)))
mariadb-version=100135
