TYPE=VIEW
query=select `bdclick5`.`bdformulamedicaveterinaria`.`Id` AS `Id`,`bdclick5`.`bdformulamedicaveterinaria`.`historia` AS `historia`,`bdclick5`.`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdclick5`.`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdclick5`.`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdclick5`.`bdconsulta`.`temp` AS `temp`,`bdclick5`.`bdconsulta`.`peso` AS `peso`,`bdclick5`.`bdconsulta`.`tllc` AS `tllc`,`bdclick5`.`bdconsulta`.`pulso` AS `pulso` from (`bdclick5`.`bdformulamedicaveterinaria` join `bdclick5`.`bdconsulta` on((`bdclick5`.`bdformulamedicaveterinaria`.`historia` = `bdclick5`.`bdconsulta`.`Id`)))
md5=fcfcc0c1788591698dc159a82ba199da
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:45
create-version=2
source=select `bdformulamedicaveterinaria`.`Id` AS `Id`,`bdformulamedicaveterinaria`.`historia` AS `historia`,`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdconsulta`.`temp` AS `temp`,`bdconsulta`.`peso` AS `peso`,`bdconsulta`.`tllc` AS `tllc`,`bdconsulta`.`pulso` AS `pulso` from (`bdformulamedicaveterinaria` join `bdconsulta` on((`bdformulamedicaveterinaria`.`historia` = `bdconsulta`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdformulamedicaveterinaria`.`Id` AS `Id`,`bdclick5`.`bdformulamedicaveterinaria`.`historia` AS `historia`,`bdclick5`.`bdformulamedicaveterinaria`.`fecha` AS `fecha`,`bdclick5`.`bdformulamedicaveterinaria`.`usuario` AS `usuario`,`bdclick5`.`bdformulamedicaveterinaria`.`valor` AS `valor`,`bdclick5`.`bdconsulta`.`temp` AS `temp`,`bdclick5`.`bdconsulta`.`peso` AS `peso`,`bdclick5`.`bdconsulta`.`tllc` AS `tllc`,`bdclick5`.`bdconsulta`.`pulso` AS `pulso` from (`bdclick5`.`bdformulamedicaveterinaria` join `bdclick5`.`bdconsulta` on((`bdclick5`.`bdformulamedicaveterinaria`.`historia` = `bdclick5`.`bdconsulta`.`Id`)))
mariadb-version=100135
