TYPE=VIEW
query=select `bdclick`.`bdformulamedicaveterinaria`.`Id` AS `Id`,`bdclick`.`bdformulamedicaveterinaria`.`historia` AS `historia`,`bdclick`.`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdclick`.`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdclick`.`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdclick`.`bdconsulta`.`temp` AS `temp`,`bdclick`.`bdconsulta`.`peso` AS `peso`,`bdclick`.`bdconsulta`.`tllc` AS `tllc`,`bdclick`.`bdconsulta`.`pulso` AS `pulso` from (`bdclick`.`bdformulamedicaveterinaria` join `bdclick`.`bdconsulta` on((`bdclick`.`bdformulamedicaveterinaria`.`historia` = `bdclick`.`bdconsulta`.`Id`)))
md5=1ef7d76094d264f6d805b4d2cf2cc239
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:22
create-version=2
source=select `bdformulamedicaveterinaria`.`Id` AS `Id`,`bdformulamedicaveterinaria`.`historia` AS `historia`,`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdconsulta`.`temp` AS `temp`,`bdconsulta`.`peso` AS `peso`,`bdconsulta`.`tllc` AS `tllc`,`bdconsulta`.`pulso` AS `pulso` from (`bdformulamedicaveterinaria` join `bdconsulta` on((`bdformulamedicaveterinaria`.`historia` = `bdconsulta`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdformulamedicaveterinaria`.`Id` AS `Id`,`bdclick`.`bdformulamedicaveterinaria`.`historia` AS `historia`,`bdclick`.`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdclick`.`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdclick`.`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdclick`.`bdconsulta`.`temp` AS `temp`,`bdclick`.`bdconsulta`.`peso` AS `peso`,`bdclick`.`bdconsulta`.`tllc` AS `tllc`,`bdclick`.`bdconsulta`.`pulso` AS `pulso` from (`bdclick`.`bdformulamedicaveterinaria` join `bdclick`.`bdconsulta` on((`bdclick`.`bdformulamedicaveterinaria`.`historia` = `bdclick`.`bdconsulta`.`Id`)))
mariadb-version=100135
