TYPE=VIEW
query=select `bdclick2`.`bdformulamedicaveterinaria`.`Id` AS `Id`,`bdclick2`.`bdformulamedicaveterinaria`.`historia` AS `historia`,`bdclick2`.`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdclick2`.`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdclick2`.`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdclick2`.`bdconsulta`.`temp` AS `temp`,`bdclick2`.`bdconsulta`.`peso` AS `peso`,`bdclick2`.`bdconsulta`.`tllc` AS `tllc`,`bdclick2`.`bdconsulta`.`pulso` AS `pulso` from (`bdclick2`.`bdformulamedicaveterinaria` join `bdclick2`.`bdconsulta` on((`bdclick2`.`bdformulamedicaveterinaria`.`historia` = `bdclick2`.`bdconsulta`.`Id`)))
md5=7a5e052b5d991d38c2333449d574212b
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:43
create-version=2
source=select `bdformulamedicaveterinaria`.`Id` AS `Id`,`bdformulamedicaveterinaria`.`historia` AS `historia`,`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdconsulta`.`temp` AS `temp`,`bdconsulta`.`peso` AS `peso`,`bdconsulta`.`tllc` AS `tllc`,`bdconsulta`.`pulso` AS `pulso` from (`bdformulamedicaveterinaria` join `bdconsulta` on((`bdformulamedicaveterinaria`.`historia` = `bdconsulta`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdformulamedicaveterinaria`.`Id` AS `Id`,`bdclick2`.`bdformulamedicaveterinaria`.`historia` AS `historia`,`bdclick2`.`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdclick2`.`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdclick2`.`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdclick2`.`bdconsulta`.`temp` AS `temp`,`bdclick2`.`bdconsulta`.`peso` AS `peso`,`bdclick2`.`bdconsulta`.`tllc` AS `tllc`,`bdclick2`.`bdconsulta`.`pulso` AS `pulso` from (`bdclick2`.`bdformulamedicaveterinaria` join `bdclick2`.`bdconsulta` on((`bdclick2`.`bdformulamedicaveterinaria`.`historia` = `bdclick2`.`bdconsulta`.`Id`)))
mariadb-version=100135
